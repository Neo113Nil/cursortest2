package l1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Gainmap;
import android.graphics.Matrix;
import android.opengl.GLES20;
import android.os.Build;
import b1.C2357k;
import com.google.common.collect.AbstractC3445z;
import e1.AbstractC4134a;
import e1.AbstractC4151s;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/* renamed from: l1.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5381t extends androidx.media3.effect.a implements Q, N0 {
    private final float[] compositeRgbMatrixArray;
    private final float[] compositeTransformationMatrixArray;

    /* renamed from: h, reason: collision with root package name */
    public final e1.r f55552h;

    /* renamed from: i, reason: collision with root package name */
    public final AbstractC3445z f55553i;

    /* renamed from: j, reason: collision with root package name */
    public final AbstractC3445z f55554j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f55555k;

    /* renamed from: l, reason: collision with root package name */
    public final float[][] f55556l;

    /* renamed from: m, reason: collision with root package name */
    public final float[][] f55557m;

    /* renamed from: n, reason: collision with root package name */
    public final int f55558n;

    /* renamed from: o, reason: collision with root package name */
    public AbstractC3445z f55559o;

    /* renamed from: p, reason: collision with root package name */
    public Gainmap f55560p;

    /* renamed from: q, reason: collision with root package name */
    public int f55561q;

    /* renamed from: r, reason: collision with root package name */
    public int f55562r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f55563s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f55564t;
    private final float[] tempResultMatrix;

    /* renamed from: u, reason: collision with root package name */
    public static final AbstractC3445z f55551u = AbstractC3445z.x(new float[]{-1.0f, -1.0f, 0.0f, 1.0f}, new float[]{-1.0f, 1.0f, 0.0f, 1.0f}, new float[]{1.0f, 1.0f, 0.0f, 1.0f}, new float[]{1.0f, -1.0f, 0.0f, 1.0f});
    private static final float[] BT2020_FULL_RANGE_YUV_TO_RGB_COLOR_TRANSFORM_MATRIX = {1.0f, 1.0f, 1.0f, 0.0f, -0.1646f, 1.8814f, 1.4746f, -0.5714f, 0.0f};
    private static final float[] BT2020_LIMITED_RANGE_YUV_TO_RGB_COLOR_TRANSFORM_MATRIX = {1.1689f, 1.1689f, 1.1689f, 0.0f, -0.1881f, 2.1502f, 1.6853f, -0.653f, 0.0f};

    public C5381t(e1.r rVar, AbstractC3445z abstractC3445z, AbstractC3445z abstractC3445z2, int i10, boolean z10) {
        super(z10, 1);
        this.f55552h = rVar;
        this.f55562r = i10;
        this.f55553i = abstractC3445z;
        this.f55554j = abstractC3445z2;
        this.f55555k = z10;
        int[] iArr = {abstractC3445z.size(), 16};
        Class cls = Float.TYPE;
        this.f55556l = (float[][]) Array.newInstance((Class<?>) cls, iArr);
        this.f55557m = (float[][]) Array.newInstance((Class<?>) cls, abstractC3445z2.size(), 16);
        this.compositeTransformationMatrixArray = AbstractC4151s.g();
        this.compositeRgbMatrixArray = AbstractC4151s.g();
        this.tempResultMatrix = new float[16];
        this.f55559o = f55551u;
        this.f55561q = -1;
        int i11 = 9729;
        for (int i12 = 0; i12 < abstractC3445z.size(); i12++) {
            i11 = Math.max(i11, ((InterfaceC5392y0) abstractC3445z.get(i12)).c());
        }
        this.f55558n = i11;
    }

    public static /* synthetic */ Matrix p(long j10) {
        Matrix matrix = new Matrix();
        matrix.setScale(1.0f, -1.0f);
        return matrix;
    }

    public static C5381t q(Context context, List list, List list2, boolean z10) {
        return new C5381t(s(context, "shaders/vertex_shader_transformation_es2.glsl", list2.isEmpty() ? "shaders/fragment_shader_copy_es2.glsl" : "shaders/fragment_shader_transformation_es2.glsl"), AbstractC3445z.o(list), AbstractC3445z.o(list2), 1, z10);
    }

    public static C5381t r(Context context, List list, List list2, C2357k c2357k, int i10) {
        boolean i11 = C2357k.i(c2357k);
        boolean z10 = i10 == 2;
        e1.r s10 = s(context, i11 ? "shaders/vertex_shader_transformation_es3.glsl" : "shaders/vertex_shader_transformation_es2.glsl", i11 ? "shaders/fragment_shader_oetf_es3.glsl" : z10 ? "shaders/fragment_shader_transformation_sdr_oetf_es2.glsl" : list2.isEmpty() ? "shaders/fragment_shader_copy_es2.glsl" : "shaders/fragment_shader_transformation_es2.glsl");
        int i12 = c2357k.f24606c;
        if (i11) {
            AbstractC4134a.a(i12 == 7 || i12 == 6);
            s10.r("uOutputColorTransfer", i12);
        } else if (z10) {
            AbstractC4134a.a(i12 == 3 || i12 == 10);
            s10.r("uOutputColorTransfer", i12);
        }
        return new C5381t(s10, AbstractC3445z.o(list), AbstractC3445z.o(list2), c2357k.f24606c, i11);
    }

    public static e1.r s(Context context, String str, String str2) {
        try {
            e1.r rVar = new e1.r(context, str, str2);
            rVar.p("uTexTransformationMatrix", AbstractC4151s.g());
            return rVar;
        } catch (AbstractC4151s.a | IOException e10) {
            throw new b1.V(e10);
        }
    }

    public static C5381t t(Context context, C2357k c2357k, C2357k c2357k2, int i10, boolean z10) {
        boolean i11 = C2357k.i(c2357k);
        e1.r s10 = s(context, i11 ? "shaders/vertex_shader_transformation_es3.glsl" : "shaders/vertex_shader_transformation_es2.glsl", i11 ? "shaders/fragment_shader_transformation_external_yuv_es3.glsl" : "shaders/fragment_shader_transformation_sdr_external_es2.glsl");
        if (i11) {
            if (!AbstractC4151s.R()) {
                throw new b1.V("The EXT_YUV_target extension is required for HDR editing input.");
            }
            s10.p("uYuvToRgbColorTransform", c2357k.f24605b == 1 ? BT2020_FULL_RANGE_YUV_TO_RGB_COLOR_TRANSFORM_MATRIX : BT2020_LIMITED_RANGE_YUV_TO_RGB_COLOR_TRANSFORM_MATRIX);
            s10.r("uInputColorTransfer", c2357k.f24606c);
            s10.r("uApplyHdrToSdrToneMapping", c2357k2.f24604a == 6 ? 0 : 1);
        }
        s10.n(z10);
        return v(s10, c2357k, c2357k2, i10, AbstractC3445z.t());
    }

    public static C5381t u(Context context, C2357k c2357k, C2357k c2357k2, int i10, int i11) {
        int i12;
        AbstractC4134a.g(c2357k.f24606c != 2 || i11 == 2);
        boolean i13 = C2357k.i(c2357k);
        boolean z10 = i11 == 2 && c2357k2.f24604a == 6;
        e1.r s10 = s(context, (i13 || z10) ? "shaders/vertex_shader_transformation_es3.glsl" : "shaders/vertex_shader_transformation_es2.glsl", z10 ? "shaders/fragment_shader_transformation_ultra_hdr_es3.glsl" : i13 ? "shaders/fragment_shader_transformation_hdr_internal_es3.glsl" : "shaders/fragment_shader_transformation_sdr_internal_es2.glsl");
        if (!z10) {
            AbstractC4134a.a(i13 || (i12 = c2357k.f24606c) == 2 || i12 == 3);
            s10.r("uInputColorTransfer", c2357k.f24606c);
        }
        if (i13) {
            s10.r("uApplyHdrToSdrToneMapping", c2357k2.f24604a == 6 ? 0 : 1);
        }
        AbstractC3445z t10 = AbstractC3445z.t();
        if (i11 == 2) {
            t10 = AbstractC3445z.u(new InterfaceC5394z0() { // from class: l1.s
                @Override // l1.InterfaceC5394z0
                public final Matrix g(long j10) {
                    return C5381t.p(j10);
                }
            });
        }
        return v(s10, c2357k, c2357k2, i10, t10);
    }

    public static C5381t v(e1.r rVar, C2357k c2357k, C2357k c2357k2, int i10, AbstractC3445z abstractC3445z) {
        boolean i11 = C2357k.i(c2357k);
        int i12 = c2357k.f24604a;
        boolean z10 = (i12 == 1 || i12 == 2) && c2357k2.f24604a == 6;
        int i13 = c2357k2.f24606c;
        if (i11) {
            if (i13 == 3) {
                i13 = 10;
            }
            AbstractC4134a.a(i13 == 1 || i13 == 10 || i13 == 6 || i13 == 7);
            rVar.r("uOutputColorTransfer", i13);
        } else if (z10) {
            AbstractC4134a.a(i13 == 1 || i13 == 6 || i13 == 7);
            rVar.r("uOutputColorTransfer", i13);
        } else {
            rVar.r("uSdrWorkingColorSpace", i10);
            AbstractC4134a.a(i13 == 3 || i13 == 1);
            rVar.r("uOutputColorTransfer", i13);
        }
        return new C5381t(rVar, abstractC3445z, AbstractC3445z.t(), c2357k2.f24606c, i11 || z10);
    }

    public static boolean z(float[][] fArr, float[][] fArr2) {
        boolean z10 = false;
        for (int i10 = 0; i10 < fArr.length; i10++) {
            float[] fArr3 = fArr[i10];
            float[] fArr4 = fArr2[i10];
            if (!Arrays.equals(fArr3, fArr4)) {
                AbstractC4134a.h(fArr4.length == 16, "A 4x4 transformation matrix must have 16 elements");
                System.arraycopy(fArr4, 0, fArr3, 0, fArr4.length);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // l1.M0
    public void a() {
        AbstractC4134a.g(this.f20662a.a() == 1);
        this.f55563s = true;
        this.f55564t = false;
    }

    @Override // androidx.media3.effect.a
    public e1.L e(int i10, int i11) {
        return A0.c(i10, i11, this.f55553i);
    }

    @Override // l1.InterfaceC5373o0
    public void h(Gainmap gainmap) {
        Bitmap gainmapContents;
        Bitmap gainmapContents2;
        if (this.f55555k) {
            Gainmap gainmap2 = this.f55560p;
            if (gainmap2 == null || !AbstractC5388w0.c(gainmap2, gainmap)) {
                this.f55564t = false;
                this.f55560p = gainmap;
                int i10 = this.f55561q;
                if (i10 == -1) {
                    gainmapContents2 = gainmap.getGainmapContents();
                    this.f55561q = AbstractC4151s.s(gainmapContents2);
                } else {
                    gainmapContents = gainmap.getGainmapContents();
                    AbstractC4151s.S(i10, gainmapContents);
                }
            }
        }
    }

    @Override // androidx.media3.effect.a
    public void i(int i10, long j10) {
        boolean z10 = x(j10) || y(j10);
        if (this.f55559o.size() < 3) {
            return;
        }
        if (this.f55563s && !z10 && this.f55564t) {
            return;
        }
        try {
            this.f55552h.u();
            w();
            this.f55552h.t("uTexSampler", i10, 0, this.f55558n);
            this.f55552h.p("uTransformationMatrix", this.compositeTransformationMatrixArray);
            this.f55552h.q("uRgbMatrix", this.compositeRgbMatrixArray);
            this.f55552h.m("aFramePosition", AbstractC4151s.u(this.f55559o), 4);
            this.f55552h.e();
            GLES20.glDrawArrays(6, 0, this.f55559o.size());
            AbstractC4151s.d();
            this.f55564t = true;
        } catch (AbstractC4151s.a e10) {
            throw new b1.V(e10, j10);
        }
    }

    @Override // l1.Q
    public void j(float[] fArr) {
        this.f55552h.p("uTexTransformationMatrix", fArr);
    }

    @Override // androidx.media3.effect.a
    public boolean o() {
        return (this.f55564t && this.f55563s) ? false : true;
    }

    @Override // androidx.media3.effect.a, androidx.media3.effect.i
    public void release() {
        super.release();
        try {
            this.f55552h.f();
            int i10 = this.f55561q;
            if (i10 != -1) {
                AbstractC4151s.z(i10);
            }
        } catch (AbstractC4151s.a e10) {
            throw new b1.V(e10);
        }
    }

    public final void w() {
        if (this.f55560p == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 34) {
            throw new IllegalStateException("Gainmaps not supported under API 34.");
        }
        this.f55552h.s("uGainmapTexSampler", this.f55561q, 1);
        AbstractC5388w0.e(this.f55552h, this.f55560p, -1);
    }

    public final boolean x(long j10) {
        float[][] fArr = (float[][]) Array.newInstance((Class<?>) Float.TYPE, this.f55554j.size(), 16);
        if (this.f55554j.size() > 0) {
            android.support.v4.media.session.b.a(this.f55554j.get(0));
            throw null;
        }
        if (!z(this.f55557m, fArr)) {
            return false;
        }
        AbstractC4151s.T(this.compositeRgbMatrixArray);
        if (this.f55554j.size() <= 0) {
            return true;
        }
        android.support.v4.media.session.b.a(this.f55554j.get(0));
        throw null;
    }

    public final boolean y(long j10) {
        float[][] fArr = (float[][]) Array.newInstance((Class<?>) Float.TYPE, this.f55553i.size(), 16);
        for (int i10 = 0; i10 < this.f55553i.size(); i10++) {
            fArr[i10] = ((InterfaceC5392y0) this.f55553i.get(i10)).b(j10);
        }
        if (!z(this.f55556l, fArr)) {
            return false;
        }
        AbstractC4151s.T(this.compositeTransformationMatrixArray);
        this.f55559o = f55551u;
        for (float[] fArr2 : this.f55556l) {
            android.opengl.Matrix.multiplyMM(this.tempResultMatrix, 0, fArr2, 0, this.compositeTransformationMatrixArray, 0);
            float[] fArr3 = this.tempResultMatrix;
            System.arraycopy(fArr3, 0, this.compositeTransformationMatrixArray, 0, fArr3.length);
            AbstractC3445z a10 = A0.a(A0.g(fArr2, this.f55559o));
            this.f55559o = a10;
            if (a10.size() < 3) {
                return true;
            }
        }
        android.opengl.Matrix.invertM(this.tempResultMatrix, 0, this.compositeTransformationMatrixArray, 0);
        this.f55559o = A0.g(this.tempResultMatrix, this.f55559o);
        return true;
    }
}
