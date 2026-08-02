package defpackage;

import android.opengl.GLES20;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class qdf {
    public static final float[] j = {1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f};
    public static final float[] k = {1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -0.5f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.5f, 1.0f};
    public static final float[] l = {0.5f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f};
    public static final float[] m = {1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f};
    public static final float[] n = {1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -0.5f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.5f, 1.0f};
    public static final float[] o = {0.5f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f};
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public Object h;
    public Object i;

    public /* synthetic */ qdf(int i) {
        this.a = i;
    }

    public static boolean b(ndf ndfVar) {
        kdf kdfVar = ndfVar.a;
        kdf kdfVar2 = ndfVar.b;
        mdf[] mdfVarArr = kdfVar.a;
        if (mdfVarArr.length == 1 && mdfVarArr[0].a == 0) {
            mdf[] mdfVarArr2 = kdfVar2.a;
            if (mdfVarArr2.length == 1 && mdfVarArr2[0].a == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean c(odf odfVar) {
        ldf ldfVar = odfVar.a;
        ldf ldfVar2 = odfVar.b;
        mdf[] mdfVarArr = ldfVar.a;
        if (mdfVarArr.length == 1 && mdfVarArr[0].a == 0) {
            mdf[] mdfVarArr2 = ldfVar2.a;
            if (mdfVarArr2.length == 1 && mdfVarArr2[0].a == 0) {
                return true;
            }
        }
        return false;
    }

    public final void a() {
        switch (this.a) {
            case 0:
                try {
                    gtj gtjVar = new gtj("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n", 3);
                    this.i = gtjVar;
                    this.c = GLES20.glGetUniformLocation(gtjVar.b, "uMvpMatrix");
                    this.d = GLES20.glGetUniformLocation(((gtj) this.i).b, "uTexMatrix");
                    this.e = ((gtj) this.i).m("aPosition");
                    this.f = ((gtj) this.i).m("aTexCoords");
                    this.g = GLES20.glGetUniformLocation(((gtj) this.i).b, "uTexture");
                    break;
                } catch (hy8 unused) {
                    return;
                }
            default:
                try {
                    gtj gtjVar2 = new gtj("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n", 4);
                    this.i = gtjVar2;
                    this.c = GLES20.glGetUniformLocation(gtjVar2.b, "uMvpMatrix");
                    this.d = GLES20.glGetUniformLocation(((gtj) this.i).b, "uTexMatrix");
                    this.e = ((gtj) this.i).m("aPosition");
                    this.f = ((gtj) this.i).m("aTexCoords");
                    this.g = GLES20.glGetUniformLocation(((gtj) this.i).b, "uTexture");
                    break;
                } catch (iy8 e) {
                    tgj.A("Failed to initialize the program", e);
                }
        }
    }
}
