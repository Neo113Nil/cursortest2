package io.agora.base.internal.video;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import io.agora.base.AlphaStitchMode;
import io.agora.base.ColorSpace;
import io.agora.base.HdrMetadata;
import io.agora.base.internal.Logging;
import io.agora.base.internal.video.RendererCommon;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* loaded from: classes2.dex */
public class GlGenericDrawer implements RendererCommon.GlDrawer {
    private static final String ALPHA_VERTEX_SHADER_STRING = "varying vec2 tc;\nvarying vec2 channelCoordinates[4];\nattribute vec4 in_pos;\nattribute vec4 in_tc;\nuniform mat4 tex_mat;\nuniform float texelWidthOffset;\nvoid main() {\n  gl_Position = in_pos;\n  tc = (tex_mat * in_tc).xy;\n  vec2 singleStepOffset = vec2(texelWidthOffset, 0.0);\n  channelCoordinates[0] = tc - 1.5 * singleStepOffset;\n  channelCoordinates[1] = channelCoordinates[0] + singleStepOffset;\n  channelCoordinates[2] = channelCoordinates[1] + singleStepOffset;\n  channelCoordinates[3] = channelCoordinates[2] + singleStepOffset;\n}\n";
    private static final String DEBANDING_FUNCTION = "float oetf_hlg(float x) \n{ \n  x = max(x, 0.0); \n  if (x <= (1.0/2.0)) \n{ \n    x = (x * x) * (1.0 / 3.0); \n} \n  else \n{ \n    x = (exp((x - 0.55991073) / 0.17883277) + 0.28466892) / 12.0; \n} \n  return x; \n} \nvec3 debanding() {\n  vec3 rgb_origin = sample(tc).rgb;\n  vec3 rgb_l1 = sample(texBlurShift_l1).rgb;\n  vec3 rgb_l2 = sample(texBlurShift_l2).rgb;\n  vec3 rgb_r1 = sample(texBlurShift_r1).rgb;\n  vec3 rgb_r2 = sample(texBlurShift_r2).rgb;\n  vec3 rgb_u1 = sample(texBlurShift_u1).rgb;\n  vec3 rgb_u2 = sample(texBlurShift_u2).rgb;\n  vec3 rgb_d1 = sample(texBlurShift_d1).rgb;\n  vec3 rgb_d2 = sample(texBlurShift_d2).rgb;\n  float y_origin = clamp(rgb_origin.r * 0.2627 + rgb_origin.g * 0.678 + rgb_origin.b * 0.0593, 0.0, 1.0); \n  float y_l1 = clamp(rgb_l1.r * 0.2627 + rgb_l1.g * 0.678 + rgb_l1.b * 0.0593, 0.0, 1.0); \n  float y_l2 = clamp(rgb_l2.r * 0.2627 + rgb_l2.g * 0.678 + rgb_l2.b * 0.0593, 0.0, 1.0); \n  float y_r1 = clamp(rgb_r1.r * 0.2627 + rgb_r1.g * 0.678 + rgb_r1.b * 0.0593, 0.0, 1.0); \n  float y_r2 = clamp(rgb_r2.r * 0.2627 + rgb_r2.g * 0.678 + rgb_r2.b * 0.0593, 0.0, 1.0); \n  float y_u1 = clamp(rgb_u1.r * 0.2627 + rgb_u1.g * 0.678 + rgb_u1.b * 0.0593, 0.0, 1.0); \n  float y_u2 = clamp(rgb_u2.r * 0.2627 + rgb_u2.g * 0.678 + rgb_u2.b * 0.0593, 0.0, 1.0); \n  float y_d1 = clamp(rgb_d1.r * 0.2627 + rgb_d1.g * 0.678 + rgb_d1.b * 0.0593, 0.0, 1.0); \n  float y_d2 = clamp(rgb_d2.r * 0.2627 + rgb_d2.g * 0.678 + rgb_d2.b * 0.0593, 0.0, 1.0); \n  float y_temp = y_origin - 1.0 / 255.0; \n  float y_delta = 2.0 * (oetf_hlg(y_origin) - oetf_hlg(y_temp)); \n  float diff_l1 = abs(y_origin - y_l1); \n  float diff_l2 = abs(y_origin - y_l2); \n  float diff_r1 = abs(y_origin - y_r1); \n  float diff_r2 = abs(y_origin - y_r2); \n  float diff_u1 = abs(y_origin - y_u1); \n  float diff_u2 = abs(y_origin - y_u2); \n  float diff_d1 = abs(y_origin - y_d1); \n  float diff_d2 = abs(y_origin - y_d2); \n  float is_less_than_delta = step(y_delta, max(max(max(max(max(max(max(diff_l1, diff_l2), diff_r1), diff_r2), diff_u1), diff_u2), diff_d1), diff_d2)); \n  highp vec3 sum = rgb_origin; \n  sum += rgb_l1; \n  sum += rgb_r1; \n  sum += rgb_u1; \n  sum += rgb_d1; \n  vec3 rgbOut = mix(rgb_origin, sum * 0.2, 1.0 - is_less_than_delta); \n  return rgbOut; \n}\n";
    private static final String DEFAULT_VERTEX_SHADER_STRING = "precision mediump float;\nattribute vec4 in_pos;\nattribute vec4 in_tc;\nuniform mat4 tex_mat;\nvarying vec2 tc;\nvoid main() {\n  gl_Position = in_pos;\n  tc = (tex_mat * in_tc).xy;\n}\n";
    private static final String HLG_TO_LINEAR = "highp vec3 HLGToLinear(highp vec3 rgb) {\n  rgb = inverse_HLG(rgb);\n  highp vec3 ootf_2020 = vec3(0.2627, 0.6780, 0.0593);\n  highp float ootf_ys = 2000.0 * dot(ootf_2020, rgb);\n  return rgb *= pow(ootf_ys, 0.2);\n}\n";
    private static final String INPUT_TEXTURE_COORDINATE_NAME = "in_tc";
    private static final String INPUT_VERTEX_COORDINATE_NAME = "in_pos";
    private static final String INVERSE_HLG = "highp vec3 inverse_HLG(highp vec3 rgb) {\n  const highp float B67_a = 0.17883277;\n  const highp float B67_b = 0.28466892;\n  const highp float B67_c = 0.55991073;\n  if (rgb.x <= 0.5) rgb.x=(rgb.x * 2.0) * (rgb.x * 2.0);\n  else rgb.x = exp((rgb.x - B67_c) / B67_a) + B67_b;\n  if (rgb.y <= 0.5) rgb.y=(rgb.y * 2.0) * (rgb.y * 2.0);\n  else rgb.y = exp((rgb.y - B67_c) / B67_a) + B67_b;\n  if (rgb.z <= 0.5) rgb.z=(rgb.z * 2.0) * (rgb.z * 2.0);\n  else rgb.z = exp((rgb.z - B67_c) / B67_a) + B67_b;\n  return rgb;\n}\n";
    private static final String LINEAR_TO_PQ = "highp vec3 LinearToPQ(highp vec3 rgb, highp float divider) {\n  const highp float ST2084_m1 =  2610.0 / (4096.0 * 4.0);\n  const highp float ST2084_m2 = (2523.0 / 4096.0) * 128.0;\n  const highp float ST2084_c1 =  3424.0 / 4096.0;\n  const highp float ST2084_c2 = (2413.0 / 4096.0) * 32.0;\n  const highp float ST2084_c3 = (2392.0 / 4096.0) * 32.0;\n  rgb /= divider;\n  rgb = pow(rgb, vec3(ST2084_m1));\n  rgb = (ST2084_c1 + ST2084_c2 * rgb) / (1.0 + ST2084_c3 * rgb);\n  return rgb = pow(rgb, vec3(ST2084_m2));\n}\n";
    private static final String LUT_FUNCTION = "vec4 getLutRgb(vec3 yuv_in) {\nvec2 r_floor;\nvec2 r_ceil;\nvec3 Pos = yuv_in * 63.0;\nr_floor.y = floor(floor(Pos.x) * 0.125);\nr_floor.x = floor(Pos.x) - (r_floor.y * 8.0);\nfloat g_floor = floor(Pos.y);\nfloat b_floor = floor(Pos.z);\nr_ceil.y = floor(ceil(Pos.x) * 0.125);\nr_ceil.x = ceil(Pos.x) - (r_ceil.y * 8.0);\nfloat g_ceil = ceil(Pos.y);\nfloat b_ceil = ceil(Pos.z);\nfloat r_fract = fract(Pos.x);\nfloat g_fract = fract(Pos.y);\nfloat b_fract = fract(Pos.z);\nvec4 c000 = texture2D(lutTex, vec2((r_floor * 0.125) + 0.0009766 + (0.00195312 * vec2(g_floor, b_floor))));\nvec4 c001 = texture2D(lutTex, vec2((r_floor * 0.125) + 0.0009766 + (0.00195312 * vec2(g_ceil, b_floor))));\nvec4 c010 = texture2D(lutTex, vec2((r_floor * 0.125) + 0.0009766 + (0.00195312 * vec2(g_floor, b_ceil))));\nvec4 c011 = texture2D(lutTex, vec2((r_floor * 0.125) + 0.0009766 + (0.00195312 * vec2(g_ceil, b_ceil))));\nvec4 c100 = texture2D(lutTex, vec2((r_ceil * 0.125) + 0.0009766 + (0.00195312 * vec2(g_floor, b_floor))));\nvec4 c101 = texture2D(lutTex, vec2((r_ceil * 0.125) + 0.0009766 + (0.00195312 * vec2(g_ceil, b_floor))));\nvec4 c110 = texture2D(lutTex, vec2((r_ceil * 0.125) + 0.0009766 + (0.00195312 * vec2(g_floor, b_ceil))));\nvec4 c111 = texture2D(lutTex, vec2((r_ceil * 0.125) + 0.0009766 + (0.00195312 * vec2(g_ceil, b_ceil))));\nvec4 c00 = mix(c000, c100, r_fract);\nvec4 c01 = mix(c001, c101, r_fract);\nvec4 c10 = mix(c010, c110, r_fract);\nvec4 c11 = mix(c011, c111, r_fract);\nvec4 c0 = mix(c00, c10, b_fract);\nvec4 c1 = mix(c01, c11, b_fract);\nreturn mix(c0, c1, g_fract).bgra;\n}\n";
    private static final String LUT_FUNCTION_SIMPLE = "vec4 getLutRgb(vec3 yuv_in) {\nfloat yColor = yuv_in.r * 63.0;\nvec2 quad1;\nquad1.y = floor(floor(yColor) * 0.125);\nquad1.x = floor(yColor) - (quad1.y * 8.0);\nvec2 quad2;\nquad2.y = floor(ceil(yColor) * 0.125);\nquad2.x = ceil(yColor) - (quad2.y * 8.0);\nvec2 texPos1;\ntexPos1 = (quad1 * 0.125) + 0.0009766 + (0.123047 * yuv_in.gb);\nvec2 texPos2;\ntexPos2 = (quad2 * 0.125) + 0.0009766 + (0.123047 * yuv_in.gb);\nvec3 rgb1 = texture2D(lutTex, texPos1).rgb;\nvec3 rgb2 = texture2D(lutTex, texPos2).rgb;\nvec3 lutrgb = mix(rgb1, rgb2, fract(yColor));\nreturn vec4(lutrgb, 1.0);\n}\n";
    private static final String RGB2YUV_2020 = "vec3 rgb2yuv_2020(vec3 rgb) {\n  vec3 yuv;\n  yuv.x = 0.2627 * rgb.x + 0.678 * rgb.y + 0.0593 * rgb.z;\n  yuv.y = -0.1396 * rgb.x - 0.3604 * rgb.y + 0.5 * rgb.z + 0.5;\n  yuv.z = 0.5 * rgb.x - 0.4598 * rgb.y - 0.0402 * rgb.z + 0.5;\n  return yuv;\n}\n";
    private static final String RGB2YUV_709 = "vec3 rgb2yuv_709(vec3 rgb) {\n  vec3 yuv;\n  yuv.x = 0.2126 * rgb.x + 0.7152 * rgb.y + 0.0722 * rgb.z;\n  yuv.y = -0.1146 * rgb.x - 0.3854 * rgb.y + 0.5 * rgb.z + 0.5;\n  yuv.z = 0.5 * rgb.x - 0.4542 * rgb.y - 0.0458 * rgb.z + 0.5;\n  return yuv;\n}\n";
    private static final String SDR2HDR_VERTEX_SHADER_STRING = "precision mediump float;\nattribute vec4 in_pos;\nattribute vec4 in_tc;\nuniform mat4 tex_mat;\nuniform float texBlurWidthOffset;\nuniform float texBlurHeightOffset;\nvarying vec2 tc;\nvarying vec2 texBlurShift_l1;\nvarying vec2 texBlurShift_l2;\nvarying vec2 texBlurShift_r1;\nvarying vec2 texBlurShift_r2;\nvarying vec2 texBlurShift_u1;\nvarying vec2 texBlurShift_u2;\nvarying vec2 texBlurShift_d1;\nvarying vec2 texBlurShift_d2;\nvoid main() {\n  gl_Position = in_pos;\n  vec2 attUV = (tex_mat * in_tc).xy;\n  tc = attUV;\n  texBlurShift_l1 = vec2(attUV.x, abs(attUV.y - texBlurHeightOffset * 11.0));\n  texBlurShift_l2 = vec2(attUV.x, abs(attUV.y - texBlurHeightOffset * 21.0));\n  texBlurShift_r1 = vec2(attUV.x, attUV.y + texBlurHeightOffset * 11.0);\n  texBlurShift_r2 = vec2(attUV.x, attUV.y + texBlurHeightOffset * 21.0);\n  texBlurShift_u1 = vec2(attUV.x + texBlurWidthOffset * 11.0, attUV.y);\n  texBlurShift_u2 = vec2(attUV.x + texBlurWidthOffset * 21.0, attUV.y);\n  texBlurShift_d1 = vec2(abs(attUV.x - texBlurWidthOffset * 11.0), attUV.y);\n  texBlurShift_d2 = vec2(abs(attUV.x - texBlurWidthOffset * 21.0), attUV.y);\n}\n";
    private static final String TAG = "GlGenericDrawer";
    private static final String TEXTURE_MATRIX_NAME = "tex_mat";
    private GlShader currentShader;
    private ShaderType currentShaderType;
    private final String genericFragmentSource;
    private int inPosLocation;
    private int inTcLocation;
    private int lutTextureId;
    private InternalColorSpace renderedColorSpace;
    private final ShaderCallbacks shaderCallbacks;
    private int texHOffsetLocation;
    private int texMatrixLocation;
    private int texWOffsetLocation;
    private FloatBuffer textureCropCoord;
    private String vertexShader;
    private static float[] g_color601_full = {1.0f, 1.0f, 1.0f, 0.0f, -0.344136f, 1.772f, 1.402f, -0.714136f, 0.0f};
    private static float[] g_color601_limit = {1.164384f, 1.164384f, 1.164384f, 0.0f, -0.391762f, 2.017232f, 1.596027f, -0.812968f, 0.0f};
    private static float[] g_color709_full = {1.0f, 1.0f, 1.0f, 0.0f, -0.187324f, 1.8556f, 1.5748f, -0.468124f, 0.0f};
    private static float[] g_color709_limit = {1.164384f, 1.164384f, 1.164384f, 0.0f, -0.213249f, 2.112402f, 1.792741f, -0.532909f, 0.0f};
    private static float[] g_color2020_full = {1.0f, 1.0f, 1.0f, 0.0f, -0.164553f, 1.8814f, 1.4746f, -0.571353f, 0.0f};
    private static float[] g_color2020_limit = {1.167808f, 1.167808f, 1.167808f, 0.0f, -0.187877f, 2.148072f, 1.683611f, -0.652337f, 0.0f};
    static String alphaYuvGraphFragmentString = "precision mediump float;\nvarying vec2 tc;\nuniform mat3 colorMatrix;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform int alphaStitchMode;\nuniform float colorRangeOffset;\n#define STITCH_MODE_UP   1\n#define STITCH_MODE_DOWN   2\n#define STITCH_MODE_LEFT   3\n#define STITCH_MODE_RIGHT   4\nhighp vec3 yuv,yuv_stitch,rgb;\nvec4 convertTexCoord(vec2 coord, int mode) {\n  if (mode == STITCH_MODE_UP) {\n    return vec4(coord.x, coord.y * 0.5 + 0.5, coord.x, coord.y * 0.5);\n  } else if (mode == STITCH_MODE_DOWN) {\n    return vec4(coord.x, coord.y * 0.5, coord.x, coord.y * 0.5 + 0.5);\n  } else if (mode == STITCH_MODE_LEFT) {\n    return vec4(coord.x * 0.5 + 0.5, coord.y, coord.x * 0.5, coord.y);\n  } else if (mode == STITCH_MODE_RIGHT) {\n    return vec4(coord.x * 0.5, coord.y, coord.x * 0.5 + 0.5, coord.y);\n  } else {\n    return vec4(coord.x, coord.y, coord.x, coord.y);\n  }\n}\nvec4 sample(vec2 p) {\n  vec4 coord = convertTexCoord(p, alphaStitchMode);\n  yuv[0] = clamp(texture2D(y_tex, coord.xy).r, 0.0, 1.0) - colorRangeOffset;\n  yuv[1] = clamp(texture2D(u_tex, coord.xy).r - 0.5, -0.5, 0.5);\n  yuv[2] = clamp(texture2D(v_tex, coord.xy).r - 0.5, -0.5, 0.5);\n  yuv_stitch[0] = clamp(texture2D(y_tex, coord.zw).r, 0.0, 1.0) - colorRangeOffset;\n  yuv_stitch[1] = clamp(texture2D(u_tex, coord.zw).r - 0.5, -0.5, 0.5);\n  yuv_stitch[2] = clamp(texture2D(v_tex, coord.zw).r - 0.5, -0.5, 0.5);\n  rgb = colorMatrix * yuv;\n  rgb = clamp(rgb, 0.0, 1.0);\n  float alpha = clamp(yuv_stitch[0], 0.0, 1.0);\n  return vec4(rgb, alpha);\n}\nvoid main() {\n  gl_FragColor = sample(tc);\n}\n";
    static String alphaRgbTextureGraphFragmentString = "precision mediump float;\nvarying vec2 tc;\nuniform sampler2D tex;\nuniform int alphaStitchMode;\nuniform int yuvMatrixMode;\n#define STITCH_MODE_UP   1\n#define STITCH_MODE_DOWN   2\n#define STITCH_MODE_LEFT   3\n#define STITCH_MODE_RIGHT   4\nvec4 convertTexCoord(vec2 coord, int mode) {\n  if (mode == STITCH_MODE_UP) {\n    return vec4(coord.x, coord.y * 0.5 + 0.5, coord.x, coord.y * 0.5);\n  } else if (mode == STITCH_MODE_DOWN) {\n    return vec4(coord.x, coord.y * 0.5, coord.x, coord.y * 0.5 + 0.5);\n  } else if (mode == STITCH_MODE_LEFT) {\n    return vec4(coord.x * 0.5 + 0.5, coord.y, coord.x * 0.5, coord.y);\n  } else if (mode == STITCH_MODE_RIGHT) {\n    return vec4(coord.x * 0.5, coord.y, coord.x * 0.5 + 0.5, coord.y);\n  } else {\n    return vec4(coord.x, coord.y, coord.x, coord.y);\n  }\n}\nvec4 sample(vec2 p) {\n  vec4 coord = convertTexCoord(p, alphaStitchMode);\n  vec3 rgb = clamp(texture2D(tex, coord.xy).rgb, 0.0, 1.0);\n  float y = 0.2126*rgb.r + 0.7152*rgb.g + 0.0722*rgb.b;\n  if (yuvMatrixMode==601)\n    y = 0.299*rgb.r + 0.587*rgb.g + 0.114*rgb.b;\n  float alpha = clamp(y, 0.0, 1.0);\n  return vec4(rgb, alpha);\n}\nvoid main() {\n  gl_FragColor = sample(tc);\n}";
    private static final FloatBuffer FULL_RECTANGLE_BUFFER = GlUtil.createFloatBuffer(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
    private static final FloatBuffer FULL_RECTANGLE_TEXTURE_BUFFER = GlUtil.createFloatBuffer(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});

    /* renamed from: io.agora.base.internal.video.GlGenericDrawer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$agora$base$ColorSpace$Matrix;

        static {
            int[] iArr = new int[ColorSpace.Matrix.values().length];
            $SwitchMap$io$agora$base$ColorSpace$Matrix = iArr;
            try {
                iArr[ColorSpace.Matrix.SMPTE170M.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$agora$base$ColorSpace$Matrix[ColorSpace.Matrix.BT470BG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$agora$base$ColorSpace$Matrix[ColorSpace.Matrix.BT709.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$agora$base$ColorSpace$Matrix[ColorSpace.Matrix.BT2020_NCL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$agora$base$ColorSpace$Matrix[ColorSpace.Matrix.BT2020_CL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$agora$base$ColorSpace$Matrix[ColorSpace.Matrix.Unspecified.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static class InternalColorSpace implements ColorSpace {
        private ColorSpace.Range range = ColorSpace.Range.Invalid;
        private ColorSpace.Matrix matrix = ColorSpace.Matrix.Unspecified;
        private ColorSpace.Transfer transfer = ColorSpace.Transfer.Unspecified;
        private ColorSpace.Primary primary = ColorSpace.Primary.Unspecified;

        @Override // io.agora.base.ColorSpace
        public HdrMetadata getHdrMetadata() {
            return null;
        }

        @Override // io.agora.base.ColorSpace
        public ColorSpace.Matrix getMatrix() {
            return this.matrix;
        }

        @Override // io.agora.base.ColorSpace
        public ColorSpace.Primary getPrimary() {
            return this.primary;
        }

        @Override // io.agora.base.ColorSpace
        public ColorSpace.Range getRange() {
            return this.range;
        }

        @Override // io.agora.base.ColorSpace
        public ColorSpace.Transfer getTransfer() {
            return this.transfer;
        }

        public boolean isDefault() {
            return this.range == ColorSpace.Range.Invalid && this.matrix == ColorSpace.Matrix.Unspecified && this.transfer == ColorSpace.Transfer.Unspecified && this.primary == ColorSpace.Primary.Unspecified;
        }

        public void setMatrix(ColorSpace.Matrix matrix) {
            this.matrix = matrix;
        }

        public void setPrimary(ColorSpace.Primary primary) {
            this.primary = primary;
        }

        public void setRange(ColorSpace.Range range) {
            this.range = range;
        }

        public void setTransfer(ColorSpace.Transfer transfer) {
            this.transfer = transfer;
        }
    }

    public interface ShaderCallbacks {
        void onNewShader(GlShader glShader);

        void onPrepareShader(GlShader glShader, float[] fArr, int i10, int i11, int i12, int i13);
    }

    public enum ShaderType {
        OES,
        RGB,
        YUV,
        ALPHA,
        OESA,
        RGBA,
        ALPAH_YUV_STITCH_GRAPH,
        ALPAH_OES_STITCH_GRAPH,
        ALPAH_RGBA_STITCH_GRAPH
    }

    public GlGenericDrawer(String str, ShaderCallbacks shaderCallbacks) {
        this(DEFAULT_VERTEX_SHADER_STRING, str, shaderCallbacks);
    }

    public static String createFragmentShaderString(String str, ShaderType shaderType, ColorSpace colorSpace, boolean z10, int i10, boolean z11) {
        StringBuilder sb2 = new StringBuilder();
        if (shaderType == ShaderType.ALPAH_YUV_STITCH_GRAPH) {
            sb2.append(alphaYuvGraphFragmentString);
            return sb2.toString();
        }
        if (shaderType == ShaderType.ALPAH_RGBA_STITCH_GRAPH) {
            sb2.append(alphaRgbTextureGraphFragmentString);
            return sb2.toString();
        }
        ShaderType shaderType2 = ShaderType.OES;
        if (shaderType == shaderType2 || shaderType == ShaderType.OESA) {
            sb2.append("#extension GL_OES_EGL_image_external : require\n");
        }
        sb2.append("precision highp float;\n");
        sb2.append("varying vec2 tc;\n");
        if (shaderType == ShaderType.ALPHA) {
            sb2.append("varying vec2 channelCoordinates[4];\n");
            sb2.append("uniform sampler2D tex;\n");
            sb2.append("highp vec4 outData;\n");
            sb2.append("vec4 sample(vec2 p) {\n");
            sb2.append("  outData[0] = clamp(texture2D(tex, channelCoordinates[0]).a, 0.0, 1.0);\n");
            sb2.append("  outData[1] = clamp(texture2D(tex, channelCoordinates[1]).a, 0.0, 1.0);\n");
            sb2.append("  outData[2] = clamp(texture2D(tex, channelCoordinates[2]).a, 0.0, 1.0);\n");
            sb2.append("  outData[3] = clamp(texture2D(tex, channelCoordinates[3]).a, 0.0, 1.0);\n");
            sb2.append("  return outData;\n");
            sb2.append("}\n");
            sb2.append(str);
            return sb2.toString();
        }
        ShaderType shaderType3 = ShaderType.YUV;
        if (shaderType == shaderType3) {
            if (!HdrUtil.isNeedHdrSdrTrans(i10)) {
                sb2.append("uniform mat3 colorMatrix;\n");
            }
            sb2.append("uniform sampler2D y_tex;\n");
            sb2.append("uniform sampler2D u_tex;\n");
            sb2.append("uniform sampler2D v_tex;\n");
            sb2.append("uniform sampler2D a_tex;\n");
            sb2.append("highp vec3 yuv,rgb;\n");
        } else {
            ShaderType shaderType4 = ShaderType.OESA;
            if (shaderType == shaderType4 || shaderType == ShaderType.RGBA) {
                String str2 = shaderType == shaderType4 ? "samplerExternalOES" : "sampler2D";
                sb2.append("uniform ");
                sb2.append(str2);
                sb2.append(" tex;\n");
                sb2.append("uniform sampler2D a_tex;\n");
                sb2.append("highp vec4 outData;\n");
            } else {
                String str3 = shaderType == shaderType2 ? "samplerExternalOES" : "sampler2D";
                sb2.append("uniform ");
                sb2.append(str3);
                sb2.append(" tex;\n");
                sb2.append("highp vec4 outData;\n");
            }
        }
        if (HdrUtil.isNeedTransToSdrVision(i10) && z11) {
            sb2.append("uniform highp sampler2D lutTex;\n");
            sb2.append(LUT_FUNCTION);
            if (shaderType != shaderType3) {
                sb2.append(RGB2YUV_2020);
            }
        } else if (HdrUtil.isNeedTransToHdrVision(i10) && z11) {
            sb2.append("varying vec2 texBlurShift_l1;\n");
            sb2.append("varying vec2 texBlurShift_l2;\n");
            sb2.append("varying vec2 texBlurShift_r1;\n");
            sb2.append("varying vec2 texBlurShift_r2;\n");
            sb2.append("varying vec2 texBlurShift_u1;\n");
            sb2.append("varying vec2 texBlurShift_u2;\n");
            sb2.append("varying vec2 texBlurShift_d1;\n");
            sb2.append("varying vec2 texBlurShift_d2;\n");
            sb2.append("uniform highp sampler2D lutTex;\n");
            sb2.append(LUT_FUNCTION);
            if (shaderType != shaderType3) {
                sb2.append(RGB2YUV_709);
            }
        }
        if (shaderType != shaderType3) {
            ColorSpace.Transfer transfer = ColorSpace.Transfer.ARIB_STD_B67;
            if (i10 == transfer.getTransfer() || (HdrUtil.isNeedTransToHdrVision(i10) && z11)) {
                sb2.append(INVERSE_HLG);
                sb2.append(HLG_TO_LINEAR);
                sb2.append(LINEAR_TO_PQ);
            }
            if (HdrUtil.isNeedTransToSdrVision(i10) && z11) {
                sb2.append("vec4 sample(vec2 p) {\n");
                sb2.append("  vec3 rgb = texture2D(tex, p).rgb;\n");
                sb2.append("  vec3 yuv = rgb2yuv_2020(rgb);\n");
                sb2.append("  outData = getLutRgb(yuv);\n");
                if (shaderType == ShaderType.OESA || shaderType == ShaderType.RGBA) {
                    sb2.append("  outData[3] = clamp(texture2D(a_tex, p).a, 0.0, 1.0);\n");
                }
                sb2.append("  return outData;\n");
                sb2.append("}\n");
                sb2.append(str);
            } else if (HdrUtil.isNeedTransToHdrVision(i10) && z11) {
                sb2.append("vec4 sample(vec2 p) {\n");
                sb2.append("  vec3 rgb = texture2D(tex, p).rgb;\n");
                sb2.append("  vec3 yuv = rgb2yuv_709(rgb);\n");
                sb2.append("  yuv = clamp(yuv, 0.0, 1.0);\n");
                sb2.append("  return getLutRgb(yuv);\n");
                sb2.append("}\n");
                sb2.append(DEBANDING_FUNCTION);
                sb2.append("void main() {\n");
                sb2.append("vec3 rgbOut = debanding();\n");
                sb2.append("rgbOut = HLGToLinear(rgbOut);\n");
                sb2.append("rgbOut = LinearToPQ(rgbOut, 1000.0);\n");
                if (shaderType == ShaderType.OESA || shaderType == ShaderType.RGBA) {
                    sb2.append("  gl_FragColor = vec4(rgbOut,clamp(texture2D(a_tex, p).a, 0.0, 1.0));\n");
                } else {
                    sb2.append("  gl_FragColor = vec4(rgbOut, 1.0);\n");
                }
                sb2.append("}\n");
            } else {
                ShaderType shaderType5 = ShaderType.OESA;
                if (shaderType == shaderType5 || shaderType == ShaderType.RGBA) {
                    sb2.append("vec4 sample(vec2 p) {\n");
                    sb2.append("  outData = texture2D(tex, p);\n");
                    if (i10 == transfer.getTransfer()) {
                        sb2.append("  outData.xyz = HLGToLinear(outData.xyz);\n");
                        sb2.append("  outData.xyz = LinearToPQ(outData.xyz, 1000.0);\n");
                    }
                    if (shaderType == shaderType5 || shaderType == ShaderType.RGBA) {
                        sb2.append("  outData[3] = clamp(texture2D(a_tex, p).a, 0.0, 1.0);\n");
                    }
                    sb2.append("  return outData;\n");
                    sb2.append("}\n");
                    sb2.append(str);
                } else if (z10) {
                    sb2.append(str.replace("gl_FragColor = sample(tc);", "float gamma = 2.2;\nvec4 fragColor = texture2D(tex, tc);\nfragColor.rgb = pow(fragColor.rgb, vec3(1.0/gamma));\ngl_FragColor = fragColor;"));
                } else {
                    sb2.append("vec4 sample(vec2 p) {\n");
                    sb2.append("  outData = texture2D(tex, p);\n");
                    if (i10 == transfer.getTransfer()) {
                        sb2.append("  outData.xyz = HLGToLinear(outData.xyz);\n");
                        sb2.append("  outData.xyz = LinearToPQ(outData.xyz, 1000.0);\n");
                    }
                    sb2.append("  outData[3] = 1.0;\n");
                    sb2.append("  return outData;\n");
                    sb2.append("}\n");
                    sb2.append(str);
                }
            }
        } else if (HdrUtil.is10BitLumaDepth(i10)) {
            ColorSpace.Transfer transfer2 = ColorSpace.Transfer.ARIB_STD_B67;
            if (i10 == transfer2.getTransfer()) {
                sb2.append(INVERSE_HLG);
                sb2.append(HLG_TO_LINEAR);
                sb2.append(LINEAR_TO_PQ);
            }
            sb2.append("vec4 sample(vec2 p) {\n");
            sb2.append("  vec2 y, u, v;\n");
            sb2.append("  y = texture2D(y_tex, p).ra;\n");
            sb2.append("  u = texture2D(u_tex, p).ra;\n");
            sb2.append("  v = texture2D(v_tex, p).ra;\n");
            sb2.append("  yuv.x = y.x * 0.249266862170088 + y.y * 63.81231671554252;\n");
            sb2.append("  yuv.y = u.x * 0.249266862170088 + u.y * 63.81231671554252;\n");
            sb2.append("  yuv.z = v.x * 0.249266862170088 + v.y * 63.81231671554252;\n");
            if (colorSpace == null || colorSpace.getRange() != ColorSpace.Range.Full) {
                sb2.append("  yuv.x = clamp((yuv.x - 0.062561) * 1.167808, 0.0, 1.0);\n");
                sb2.append("  yuv.yz = clamp((yuv.yz - 0.5) * 1.141741 + 0.5, 0.0, 1.0);\n");
            } else {
                sb2.append("  yuv = clamp(yuv, 0.0, 1.0);\n");
            }
            if (HdrUtil.isNeedTransToSdrVision(i10) && z11) {
                sb2.append("  rgb = getLutRgb(yuv).xyz;\n");
            } else {
                sb2.append("  yuv.yz = yuv.yz - 0.5;\n");
                sb2.append("  rgb = colorMatrix * yuv;\n");
                if (i10 == transfer2.getTransfer()) {
                    sb2.append("  rgb = HLGToLinear(rgb);\n");
                    sb2.append("  rgb = LinearToPQ(rgb, 1000.0);\n");
                }
            }
            sb2.append("  return vec4(rgb, clamp(texture2D(a_tex, p).a, 0.0, 1.0));\n");
            sb2.append("}\n");
            sb2.append(str);
        } else {
            if (HdrUtil.isNeedTransToHdrVision(i10) && z11) {
                sb2.append(INVERSE_HLG);
                sb2.append(HLG_TO_LINEAR);
                sb2.append(LINEAR_TO_PQ);
            }
            sb2.append("vec4 sample(vec2 p) {\n");
            if (colorSpace != null && colorSpace.getRange() == ColorSpace.Range.Full) {
                sb2.append("  yuv[0] = clamp(texture2D(y_tex, p).r, 0.0, 1.0);\n");
            } else if (HdrUtil.isNeedTransToHdrVision(i10) && z11) {
                sb2.append("  yuv[0] = clamp(1.164384 * (texture2D(y_tex, p).r - 0.0627), 0.0, 1.0);\n");
            } else {
                sb2.append("  yuv[0] = clamp(texture2D(y_tex, p).r, 0.0, 1.0) - 0.0627;\n");
            }
            sb2.append("  yuv[1] = clamp(texture2D(u_tex, p).r - 0.5, -0.5, 0.5);\n");
            sb2.append("  yuv[2] = clamp(texture2D(v_tex, p).r - 0.5, -0.5, 0.5);\n");
            if (HdrUtil.isNeedTransToHdrVision(i10) && z11) {
                sb2.append("  yuv[1] = yuv[1] + 0.5;\n");
                sb2.append("  yuv[2] = yuv[2] + 0.5;\n");
                sb2.append("  rgb = getLutRgb(yuv).xyz;\n");
                sb2.append("  rgb = HLGToLinear(rgb);\n");
                sb2.append("  return vec4(LinearToPQ(rgb, 1000.0), 1.0);\n");
                sb2.append("}\n");
                sb2.append(DEBANDING_FUNCTION);
                sb2.append("void main() {\n");
                sb2.append("  gl_FragColor = vec4(debanding(),clamp(texture2D(a_tex, tc).a, 0.0, 1.0));\n");
                sb2.append("}\n");
            } else {
                sb2.append("  rgb = colorMatrix * yuv;\n");
                sb2.append("  return vec4(rgb, clamp(texture2D(a_tex, p).a, 0.0, 1.0));\n");
                sb2.append("}\n");
                sb2.append(str);
            }
        }
        return sb2.toString();
    }

    private void prepareShader(ShaderType shaderType, float[] fArr, int i10, int i11, int i12, int i13, boolean z10, int i14, int i15) {
        prepareShader(shaderType, fArr, i10, i11, i12, i13, null, z10, i14, i15);
    }

    public GlShader createShader(ShaderType shaderType, ColorSpace colorSpace, boolean z10, int i10, boolean z11) {
        String createFragmentShaderString = createFragmentShaderString(this.genericFragmentSource, shaderType, colorSpace, z10, i10, z11);
        Logging.i(TAG, "shaderType: " + shaderType + " transfer: " + i10 + " hasLutTexId: " + z11 + " shader: " + createFragmentShaderString);
        return new GlShader(this.vertexShader, createFragmentShaderString);
    }

    @Override // io.agora.base.internal.video.RendererCommon.GlDrawer
    public void drawAlpha(int i10, float[] fArr, int i11, int i12, int i13, int i14, int i15, int i16) {
        prepareShader(ShaderType.ALPHA, fArr, i11, i12, i15, i16, false, 0, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i10);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glViewport(i13, i14, i15, i16);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(3553, 0);
    }

    @Override // io.agora.base.internal.video.RendererCommon.GlDrawer
    public void drawAlphaStitchGraph(int[] iArr, int i10, float[] fArr, int i11, int i12, int i13, int i14, int i15, int i16, ColorSpace colorSpace, int i17, int i18) {
        prepareShader(ShaderType.ALPAH_YUV_STITCH_GRAPH, fArr, i11, i12, i15, i16, colorSpace, false, i17, i18);
        for (int i19 = 0; i19 < 3; i19++) {
            GLES20.glActiveTexture(33984 + i19);
            GLES20.glBindTexture(3553, iArr[i19]);
        }
        GLES20.glViewport(i13, i14, i15, i16);
        GLES20.glDrawArrays(5, 0, 4);
        for (int i20 = 0; i20 < 3; i20++) {
            GLES20.glActiveTexture(i20 + 33984);
            GLES20.glBindTexture(3553, 0);
        }
    }

    @Override // io.agora.base.internal.video.RendererCommon.GlDrawer
    public void drawOes(int i10, int i11, float[] fArr, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        drawOes(i10, i11, fArr, i12, i13, i14, i15, i16, i17, i18, AlphaStitchMode.ALPHA_NO_STITCH.value());
    }

    @Override // io.agora.base.internal.video.RendererCommon.GlDrawer
    public void drawRgb(int i10, float[] fArr, int i11, int i12, int i13, int i14, int i15, int i16) {
        drawRgb(i10, 0, fArr, i11, i12, i13, i14, i15, i16, false, 0, AlphaStitchMode.ALPHA_NO_STITCH.value());
    }

    @Override // io.agora.base.internal.video.RendererCommon.GlDrawer
    public void drawYuv(int[] iArr, int i10, float[] fArr, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        drawYuv(iArr, i10, fArr, i11, i12, i13, i14, i15, i16, null, i17);
    }

    public int getLutTexId() {
        return this.lutTextureId;
    }

    public boolean hasLutTexId() {
        return this.lutTextureId != 0;
    }

    @Override // io.agora.base.internal.video.RendererCommon.GlDrawer
    public void release() {
        GlShader glShader = this.currentShader;
        if (glShader != null) {
            glShader.release();
            this.currentShader = null;
            this.currentShaderType = null;
        }
    }

    @Override // io.agora.base.internal.video.RendererCommon.GlDrawer
    public ColorSpace renderedColorSpace() {
        if (this.renderedColorSpace.isDefault()) {
            return null;
        }
        return this.renderedColorSpace;
    }

    @Override // io.agora.base.internal.video.RendererCommon.GlDrawer
    public void setLut10Texture(byte[] bArr) {
        Logging.i(TAG, "setLut10Texture()");
        Bitmap bitmap = null;
        try {
            if (bArr.length != 0) {
                bitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
            }
        } catch (IllegalArgumentException e10) {
            e10.printStackTrace();
        }
        if (bitmap == null) {
            return;
        }
        this.lutTextureId = GlUtil.generateTexture(3553);
        GlUtil.checkNoGLES2Error("glGenTextures");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.lutTextureId);
        GLES20.glTexParameteri(3553, 10241, 9728);
        GLES20.glTexParameteri(3553, 10240, 9728);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        GlUtil.checkNoGLES2Error("loadImageTexture");
        GLES20.glBindTexture(3553, 0);
        bitmap.recycle();
    }

    @Override // io.agora.base.internal.video.RendererCommon.GlDrawer
    public void setTextureCropCoord(FloatBuffer floatBuffer) {
        if (floatBuffer != null) {
            this.textureCropCoord = floatBuffer;
        }
    }

    public GlGenericDrawer(String str, String str2, ShaderCallbacks shaderCallbacks) {
        this.vertexShader = str;
        this.genericFragmentSource = str2;
        this.shaderCallbacks = shaderCallbacks;
        this.renderedColorSpace = new InternalColorSpace();
    }

    private void prepareShader(ShaderType shaderType, float[] fArr, int i10, int i11, int i12, int i13, ColorSpace colorSpace, boolean z10, int i14, int i15) {
        GlGenericDrawer glGenericDrawer;
        FloatBuffer wrap;
        FloatBuffer floatBuffer;
        GlShader glShader;
        int i16;
        if (shaderType.equals(this.currentShaderType)) {
            glShader = this.currentShader;
            glGenericDrawer = this;
        } else {
            this.currentShaderType = shaderType;
            GlShader glShader2 = this.currentShader;
            if (glShader2 != null) {
                glShader2.release();
            }
            ShaderType shaderType2 = ShaderType.ALPHA;
            if (shaderType == shaderType2) {
                this.vertexShader = ALPHA_VERTEX_SHADER_STRING;
            } else if (HdrUtil.isNeedTransToHdrVision(i14) && hasLutTexId()) {
                this.vertexShader = SDR2HDR_VERTEX_SHADER_STRING;
            } else {
                this.vertexShader = DEFAULT_VERTEX_SHADER_STRING;
            }
            GlShader createShader = createShader(shaderType, colorSpace, z10, i14, hasLutTexId());
            glGenericDrawer = this;
            glGenericDrawer.currentShader = createShader;
            createShader.useProgram();
            ShaderType shaderType3 = ShaderType.YUV;
            if (shaderType == shaderType3 || shaderType == ShaderType.ALPAH_YUV_STITCH_GRAPH) {
                GLES20.glUniform1i(createShader.getUniformLocation("y_tex"), 0);
                GLES20.glUniform1i(createShader.getUniformLocation("u_tex"), 1);
                GLES20.glUniform1i(createShader.getUniformLocation("v_tex"), 2);
                if (shaderType == shaderType3) {
                    GLES20.glUniform1i(createShader.getUniformLocation("a_tex"), 3);
                }
                if (HdrUtil.isNeedHdrSdrTrans(i14)) {
                    GLES20.glUniform1i(createShader.getUniformLocation("lutTex"), 4);
                }
                if (colorSpace != null) {
                    ColorSpace.Range range = colorSpace.getRange();
                    switch (AnonymousClass1.$SwitchMap$io$agora$base$ColorSpace$Matrix[colorSpace.getMatrix().ordinal()]) {
                        case 1:
                        case 2:
                            ColorSpace.Range range2 = ColorSpace.Range.Full;
                            wrap = range == range2 ? FloatBuffer.wrap(g_color601_full) : FloatBuffer.wrap(g_color601_limit);
                            InternalColorSpace internalColorSpace = glGenericDrawer.renderedColorSpace;
                            if (range != range2) {
                                range2 = ColorSpace.Range.Limited;
                            }
                            internalColorSpace.setRange(range2);
                            glGenericDrawer.renderedColorSpace.setMatrix(ColorSpace.Matrix.BT470BG);
                            floatBuffer = wrap;
                            break;
                        case 3:
                            ColorSpace.Range range3 = ColorSpace.Range.Full;
                            wrap = range == range3 ? FloatBuffer.wrap(g_color709_full) : FloatBuffer.wrap(g_color709_limit);
                            InternalColorSpace internalColorSpace2 = glGenericDrawer.renderedColorSpace;
                            if (range != range3) {
                                range3 = ColorSpace.Range.Limited;
                            }
                            internalColorSpace2.setRange(range3);
                            glGenericDrawer.renderedColorSpace.setMatrix(ColorSpace.Matrix.BT709);
                            floatBuffer = wrap;
                            break;
                        case 4:
                        case 5:
                            FloatBuffer wrap2 = FloatBuffer.wrap(g_color2020_full);
                            InternalColorSpace internalColorSpace3 = glGenericDrawer.renderedColorSpace;
                            ColorSpace.Range range4 = ColorSpace.Range.Full;
                            if (range != range4) {
                                range4 = ColorSpace.Range.Limited;
                            }
                            internalColorSpace3.setRange(range4);
                            glGenericDrawer.renderedColorSpace.setMatrix(ColorSpace.Matrix.BT2020_NCL);
                            glGenericDrawer.renderedColorSpace.setTransfer(colorSpace.getTransfer());
                            glGenericDrawer.renderedColorSpace.setPrimary(colorSpace.getPrimary());
                            floatBuffer = wrap2;
                            break;
                        case 6:
                            ColorSpace.Range range5 = ColorSpace.Range.Full;
                            wrap = range == range5 ? FloatBuffer.wrap(g_color601_full) : FloatBuffer.wrap(g_color601_limit);
                            InternalColorSpace internalColorSpace4 = glGenericDrawer.renderedColorSpace;
                            if (range != range5) {
                                range5 = ColorSpace.Range.Limited;
                            }
                            internalColorSpace4.setRange(range5);
                            glGenericDrawer.renderedColorSpace.setMatrix(ColorSpace.Matrix.BT470BG);
                            floatBuffer = wrap;
                            break;
                        default:
                            ColorSpace.Range range6 = ColorSpace.Range.Full;
                            wrap = range == range6 ? FloatBuffer.wrap(g_color709_full) : FloatBuffer.wrap(g_color709_limit);
                            InternalColorSpace internalColorSpace5 = glGenericDrawer.renderedColorSpace;
                            if (range != range6) {
                                range6 = ColorSpace.Range.Limited;
                            }
                            internalColorSpace5.setRange(range6);
                            glGenericDrawer.renderedColorSpace.setMatrix(ColorSpace.Matrix.BT709);
                            floatBuffer = wrap;
                            break;
                    }
                } else {
                    floatBuffer = FloatBuffer.wrap(g_color601_limit);
                    glGenericDrawer.renderedColorSpace.setRange(ColorSpace.Range.Limited);
                    glGenericDrawer.renderedColorSpace.setMatrix(ColorSpace.Matrix.BT470BG);
                }
                if (!HdrUtil.isNeedHdrSdrTrans(i14)) {
                    GLES20.glUniformMatrix3fv(createShader.getUniformLocation("colorMatrix"), 1, false, floatBuffer);
                }
                if (shaderType == ShaderType.ALPAH_YUV_STITCH_GRAPH) {
                    GLES20.glUniform1i(createShader.getUniformLocation("alphaStitchMode"), i15);
                    if (colorSpace == null || colorSpace.getRange() != ColorSpace.Range.Full) {
                        GLES20.glUniform1f(createShader.getUniformLocation("colorRangeOffset"), 0.0627f);
                    } else {
                        GLES20.glUniform1f(createShader.getUniformLocation("colorRangeOffset"), 0.0f);
                    }
                }
            } else if (shaderType == shaderType2) {
                GLES20.glUniform1i(createShader.getUniformLocation("tex"), 0);
                GLES20.glUniform1f(createShader.getUniformLocation("texelWidthOffset"), 1.0f / i10);
            } else {
                if (shaderType == ShaderType.ALPAH_RGBA_STITCH_GRAPH || shaderType == ShaderType.ALPAH_OES_STITCH_GRAPH) {
                    GLES20.glUniform1i(createShader.getUniformLocation("alphaStitchMode"), i15);
                    GLES20.glUniform1i(createShader.getUniformLocation("yuvMatrixMode"), (colorSpace == null || colorSpace.getMatrix() != ColorSpace.Matrix.BT709) ? 601 : 709);
                }
                GLES20.glUniform1i(createShader.getUniformLocation("tex"), 0);
                if (shaderType == ShaderType.OESA || shaderType == ShaderType.RGBA) {
                    GLES20.glUniform1i(createShader.getUniformLocation("a_tex"), 3);
                }
                if (HdrUtil.isNeedHdrSdrTrans(i14) && glGenericDrawer.hasLutTexId()) {
                    GLES20.glUniform1i(createShader.getUniformLocation("lutTex"), 4);
                }
            }
            if (glGenericDrawer.hasLutTexId() && HdrUtil.isNeedTransToSdrVision(i14)) {
                glGenericDrawer.renderedColorSpace.setMatrix(ColorSpace.Matrix.BT470BG);
                glGenericDrawer.renderedColorSpace.setTransfer(ColorSpace.Transfer.Unspecified);
                glGenericDrawer.renderedColorSpace.setPrimary(ColorSpace.Primary.Unspecified);
            } else if (glGenericDrawer.hasLutTexId() && HdrUtil.isNeedTransToHdrVision(i14)) {
                glGenericDrawer.renderedColorSpace.setMatrix(ColorSpace.Matrix.BT2020_NCL);
                glGenericDrawer.renderedColorSpace.setTransfer(ColorSpace.Transfer.ARIB_STD_B67);
                glGenericDrawer.renderedColorSpace.setPrimary(ColorSpace.Primary.kBT2020);
            }
            GlUtil.checkNoGLES2Error("Create shader");
            glGenericDrawer.shaderCallbacks.onNewShader(createShader);
            glGenericDrawer.texMatrixLocation = createShader.getUniformLocation(TEXTURE_MATRIX_NAME);
            glGenericDrawer.inPosLocation = createShader.getAttribLocation(INPUT_VERTEX_COORDINATE_NAME);
            glGenericDrawer.inTcLocation = createShader.getAttribLocation(INPUT_TEXTURE_COORDINATE_NAME);
            if (HdrUtil.isNeedTransToHdrVision(i14) && glGenericDrawer.hasLutTexId()) {
                glGenericDrawer.texWOffsetLocation = createShader.getUniformLocation("texBlurWidthOffset");
                glGenericDrawer.texHOffsetLocation = createShader.getUniformLocation("texBlurHeightOffset");
            }
            glShader = createShader;
        }
        glShader.useProgram();
        GLES20.glEnableVertexAttribArray(glGenericDrawer.inPosLocation);
        GLES20.glVertexAttribPointer(glGenericDrawer.inPosLocation, 2, 5126, false, 0, (Buffer) FULL_RECTANGLE_BUFFER);
        GLES20.glEnableVertexAttribArray(glGenericDrawer.inTcLocation);
        FloatBuffer floatBuffer2 = glGenericDrawer.textureCropCoord;
        if (floatBuffer2 != null) {
            GLES20.glVertexAttribPointer(glGenericDrawer.inTcLocation, 2, 5126, false, 0, (Buffer) floatBuffer2);
        } else {
            GLES20.glVertexAttribPointer(glGenericDrawer.inTcLocation, 2, 5126, false, 0, (Buffer) FULL_RECTANGLE_TEXTURE_BUFFER);
        }
        GLES20.glUniformMatrix4fv(glGenericDrawer.texMatrixLocation, 1, false, fArr, 0);
        if (HdrUtil.isNeedTransToHdrVision(i14) && glGenericDrawer.hasLutTexId()) {
            i16 = i11;
            GLES20.glUniform1f(glGenericDrawer.texWOffsetLocation, 1.0f / i10);
            GLES20.glUniform1f(glGenericDrawer.texHOffsetLocation, 1.0f / i16);
        } else {
            i16 = i11;
        }
        glGenericDrawer.shaderCallbacks.onPrepareShader(glShader, fArr, i10, i16, i12, i13);
        GlUtil.checkNoGLES2Error("Prepare shader");
    }

    @Override // io.agora.base.internal.video.RendererCommon.GlDrawer
    public void drawYuv(int[] iArr, int i10, float[] fArr, int i11, int i12, int i13, int i14, int i15, int i16, ColorSpace colorSpace, int i17) {
        prepareShader(ShaderType.YUV, fArr, i11, i12, i15, i16, colorSpace, false, i17, 0);
        for (int i18 = 0; i18 < 3; i18++) {
            GLES20.glActiveTexture(33984 + i18);
            GLES20.glBindTexture(3553, iArr[i18]);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
        }
        if (i10 > 0) {
            GLES20.glActiveTexture(33987);
            GLES20.glBindTexture(3553, i10);
        }
        if (HdrUtil.isNeedHdrSdrTrans(i17) && hasLutTexId()) {
            GLES20.glActiveTexture(33988);
            GLES20.glBindTexture(3553, getLutTexId());
        }
        GLES20.glViewport(i13, i14, i15, i16);
        GLES20.glDrawArrays(5, 0, 4);
        for (int i19 = 0; i19 < 3; i19++) {
            GLES20.glActiveTexture(i19 + 33984);
            GLES20.glBindTexture(3553, 0);
        }
        if (i10 > 0) {
            GLES20.glActiveTexture(33987);
            GLES20.glBindTexture(3553, 0);
        }
        if (HdrUtil.isNeedHdrSdrTrans(i17) && hasLutTexId()) {
            GLES20.glActiveTexture(33988);
            GLES20.glBindTexture(3553, 0);
        }
    }

    @Override // io.agora.base.internal.video.RendererCommon.GlDrawer
    public void drawOes(int i10, int i11, float[] fArr, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        prepareShader(i11 > 0 ? ShaderType.OESA : ShaderType.OES, fArr, i12, i13, i16, i17, false, i18, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i10);
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        if (i11 > 0) {
            GLES20.glActiveTexture(33987);
            GLES20.glBindTexture(3553, i11);
        }
        if (HdrUtil.isNeedHdrSdrTrans(i18) && hasLutTexId()) {
            GLES20.glActiveTexture(33988);
            GLES20.glBindTexture(3553, getLutTexId());
        }
        GLES20.glViewport(i14, i15, i16, i17);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(36197, 0);
        if (i11 > 0) {
            GLES20.glActiveTexture(33987);
            GLES20.glBindTexture(3553, 0);
        }
        if (HdrUtil.isNeedHdrSdrTrans(i18) && hasLutTexId()) {
            GLES20.glActiveTexture(33988);
            GLES20.glBindTexture(3553, 0);
        }
    }

    @Override // io.agora.base.internal.video.RendererCommon.GlDrawer
    public void drawRgb(int i10, int i11, float[] fArr, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        drawRgb(i10, i11, fArr, i12, i13, i14, i15, i16, i17, false, i18, AlphaStitchMode.ALPHA_NO_STITCH.value());
    }

    public GlGenericDrawer(String str, String str2, FloatBuffer floatBuffer, ShaderCallbacks shaderCallbacks) {
        this.vertexShader = str;
        this.genericFragmentSource = str2;
        this.textureCropCoord = floatBuffer;
        this.shaderCallbacks = shaderCallbacks;
        this.renderedColorSpace = new InternalColorSpace();
    }

    @Override // io.agora.base.internal.video.RendererCommon.GlDrawer
    public void drawRgb(int i10, int i11, float[] fArr, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        drawRgb(i10, i11, fArr, i12, i13, i14, i15, i16, i17, false, i18, i19);
    }

    @Override // io.agora.base.internal.video.RendererCommon.GlDrawer
    public void drawRgb(int i10, int i11, float[] fArr, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10, int i18, int i19) {
        ShaderType shaderType = i11 > 0 ? ShaderType.RGBA : ShaderType.RGB;
        if (i19 > 0) {
            shaderType = ShaderType.ALPAH_RGBA_STITCH_GRAPH;
        }
        prepareShader(shaderType, fArr, i12, i13, i16, i17, z10, i18, i19);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i10);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        if (i11 > 0) {
            GLES20.glActiveTexture(33987);
            GLES20.glBindTexture(3553, i11);
        }
        if (HdrUtil.isNeedHdrSdrTrans(i18) && hasLutTexId()) {
            GLES20.glActiveTexture(33988);
            GLES20.glBindTexture(3553, getLutTexId());
        }
        GLES20.glViewport(i14, i15, i16, i17);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(3553, 0);
        if (i11 > 0) {
            GLES20.glActiveTexture(33987);
            GLES20.glBindTexture(3553, 0);
        }
        if (HdrUtil.isNeedHdrSdrTrans(i18) && hasLutTexId()) {
            GLES20.glActiveTexture(33988);
            GLES20.glBindTexture(3553, 0);
        }
    }
}
