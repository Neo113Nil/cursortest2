package t2;

import android.os.Build;
import b1.AbstractC2335D;
import com.google.common.collect.AbstractC3445z;
import e1.AbstractC4134a;
import java.util.Objects;
import t2.m1;

/* renamed from: t2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6401j {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.collect.A f65384a;

    /* renamed from: b, reason: collision with root package name */
    public static final c f65385b = new c("video/avc", 0, 0, 0);

    /* renamed from: t2.j$b */
    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        public static final b f65386c = new b("", "");

        /* renamed from: a, reason: collision with root package name */
        public final String f65387a;

        /* renamed from: b, reason: collision with root package name */
        public final String f65388b;

        public b(String str, String str2) {
            this.f65387a = str;
            this.f65388b = str2;
        }

        public static b a() {
            String str;
            String str2;
            if (Build.VERSION.SDK_INT < 31) {
                return f65386c;
            }
            str = Build.SOC_MANUFACTURER;
            str2 = Build.SOC_MODEL;
            return new b(str, str2);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Objects.equals(this.f65387a, bVar.f65387a) && Objects.equals(this.f65388b, bVar.f65388b);
        }

        public int hashCode() {
            return Objects.hash(this.f65387a, this.f65388b);
        }

        public String toString() {
            return String.format("Chipset(%s %s)", this.f65387a, this.f65388b);
        }
    }

    /* renamed from: t2.j$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f65389a;

        /* renamed from: b, reason: collision with root package name */
        public final int f65390b;

        /* renamed from: c, reason: collision with root package name */
        public final int f65391c;

        /* renamed from: d, reason: collision with root package name */
        public final int f65392d;

        public c(String str, int i10, int i11, int i12) {
            this.f65389a = str;
            this.f65390b = i10;
            this.f65391c = i11;
            this.f65392d = i12;
        }
    }

    static {
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1;
        int i15 = 0;
        int i16 = 0;
        int i17 = 1;
        int i18 = 1;
        int i19 = 497664000;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        f65384a = com.google.common.collect.A.v().f(new b("Google", "Tensor G2"), new c("video/hevc", i11, 37538929, i10)).f(new b("Google", "Tensor G2"), new c("video/avc", i11, 32739600, i10)).f(new b("Google", "Tensor G3"), new c("video/hevc", i11, 37538350, i10)).f(new b("Google", "Tensor G3"), new c("video/avc", i11, 32750593, i10)).f(new b("Google", "Tensor G4"), new c("video/av01", i11, 32844500, i10)).f(new b("Google", "Tensor G4"), new c("video/hevc", i11, 51851802, i10)).f(new b("Google", "Tensor G4"), new c("video/avc", i11, 44206216, i10)).f(new b("Mediatek", "MT6761"), new c("video/avc", i12, i13, i10)).f(new b("Mediatek", "MT6762"), new c("video/avc", i12, i13, i10)).f(new b("Mediatek", "MT6765"), new c("video/avc", i12, i13, i10)).f(new b("Mediatek", "MT6769T"), new c("video/hevc", i12, i13, i10)).f(new b("Mediatek", "MT6769T"), new c("video/avc", i12, i13, i10)).f(new b("Mediatek", "MT6769Z"), new c("video/hevc", i12, i13, i10)).f(new b("Mediatek", "MT6769Z"), new c("video/avc", i12, i13, i10)).f(new b("Mediatek", "MT6785"), new c("video/hevc", i12, i13, i10)).f(new b("Mediatek", "MT6785"), new c("video/avc", i12, i13, i10)).f(new b("Mediatek", "MT6789V/CD"), new c("video/hevc", i12, i13, i10)).f(new b("Mediatek", "MT6789V/CD"), new c("video/avc", i12, i13, i10)).f(new b("Mediatek", "MT6833V/NZA"), new c("video/hevc", i12, i13, i10)).f(new b("Mediatek", "MT6833V/NZA"), new c("video/avc", i12, i13, i10)).f(new b("Mediatek", "MT6893"), new c("video/hevc", i14, 34028841, i10)).f(new b("Mediatek", "MT6893"), new c("video/avc", i14, 457499715, i10)).f(new b("Mediatek", "MT6983"), new c("video/hevc", i14, 36134374, i10)).f(new b("Mediatek", "MT6983"), new c("video/avc", i14, 189533581, i10)).f(new b("QTI", "SDM450"), new c("video/avc", i15, i16, i10)).f(new b("QTI", "SM4350"), new c("video/hevc", i15, i16, i10)).f(new b("QTI", "SM4350"), new c("video/avc", i15, i16, i10)).f(new b("QTI", "SM6125"), new c("video/hevc", i15, i16, i10)).f(new b("QTI", "SM6125"), new c("video/avc", i15, i16, i10)).f(new b("QTI", "SM6225"), new c("video/hevc", i15, i16, i10)).f(new b("QTI", "SM6225"), new c("video/avc", i15, i16, i10)).f(new b("QTI", "SM6375"), new c("video/hevc", i15, i16, i10)).f(new b("QTI", "SM6375"), new c("video/avc", i15, i16, i10)).f(new b("QTI", "SM8250"), new c("video/hevc", i15, i16, i10)).f(new b("QTI", "SM8250"), new c("video/avc", i15, i16, i10)).f(new b("QTI", "SM8350"), new c("video/hevc", i15, i16, i10)).f(new b("QTI", "SM8350"), new c("video/avc", i15, i16, i10)).f(new b("QTI", "SM8450"), new c("video/hevc", i18, i19, i17)).f(new b("QTI", "SM8450"), new c("video/avc", i18, i19, i17)).f(new b("QTI", "SM8475"), new c("video/hevc", i18, i19, i17)).f(new b("QTI", "SM8475"), new c("video/avc", i18, i19, i17)).f(new b("QTI", "SM8550"), new c("video/hevc", i18, i19, i17)).f(new b("QTI", "SM8550"), new c("video/avc", i18, 110196681, i17)).f(new b("QTI", "SM8650"), new c("video/hevc", i18, 34344411, i17)).f(new b("QTI", "SM8650"), new c("video/avc", i18, 132451733, i17)).f(new b("QTI", "SM8750"), new c("video/hevc", i18, 52435727, i17)).f(new b("QTI", "SM8750"), new c("video/avc", i18, 159007069, i17)).f(new b("Samsung", "Exynos 850"), new c("video/hevc", i21, i22, i20)).f(new b("Samsung", "Exynos 850"), new c("video/avc", i21, i22, i20)).f(new b("Samsung", "s5e8825"), new c("video/hevc", i21, i22, i20)).f(new b("Samsung", "s5e8825"), new c("video/avc", i21, i22, i20)).f(new b("Samsung", "s5e9925"), new c("video/hevc", 1, 51506898, i20)).f(new b("Samsung", "s5e9925"), new c("video/avc", 2, 40856748, i20)).f(new b("Spreadtrum", "SC9863A"), new c("video/avc", i23, i24, i20)).f(new b("Spreadtrum", "SC9863A"), new c("video/hevc", i23, i24, i20)).f(new b("Spreadtrum", "T606"), new c("video/avc", i23, i24, i20)).f(new b("Spreadtrum", "T606"), new c("video/hevc", i23, i24, i20)).e();
    }

    public static m1 a(androidx.media3.common.a aVar) {
        c cVar;
        AbstractC4134a.b(AbstractC2335D.t(aVar.f20543o), "MIME must be a video MIME type.");
        b a10 = b.a();
        com.google.common.collect.A a11 = f65384a;
        if (!a11.n(a10)) {
            return m1.f65432l;
        }
        m1.b bVar = new m1.b();
        AbstractC3445z abstractC3445z = a11.get(a10);
        int i10 = 0;
        while (true) {
            if (i10 >= abstractC3445z.size()) {
                cVar = null;
                break;
            }
            if (((c) abstractC3445z.get(i10)).f65389a.equals(aVar.f20543o)) {
                cVar = (c) abstractC3445z.get(i10);
                break;
            }
            i10++;
        }
        if (cVar == null) {
            return bVar.a();
        }
        if (((aVar.e() == -1 || aVar.f20554z == -1.0f) ? Integer.MAX_VALUE : com.google.common.primitives.f.n(Math.round(aVar.e() * aVar.f20554z))) < cVar.f65391c) {
            bVar.d(cVar.f65390b);
            if ((cVar.f65392d & 1) != 0) {
                bVar.e(1, 2);
            }
        }
        return bVar.a();
    }
}
