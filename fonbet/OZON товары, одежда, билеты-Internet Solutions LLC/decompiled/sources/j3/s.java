package j3;

import android.net.Uri;
import android.os.Bundle;
import com.google.common.collect.AbstractC5880y;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.util.Arrays;
import java.util.Objects;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: I, reason: collision with root package name */
    public static final s f69265I = new s(new a());

    /* renamed from: A, reason: collision with root package name */
    public final Integer f69266A;

    /* renamed from: B, reason: collision with root package name */
    public final Integer f69267B;

    /* renamed from: C, reason: collision with root package name */
    public final CharSequence f69268C;

    /* renamed from: D, reason: collision with root package name */
    public final CharSequence f69269D;

    /* renamed from: E, reason: collision with root package name */
    public final CharSequence f69270E;

    /* renamed from: F, reason: collision with root package name */
    public final Integer f69271F;

    /* renamed from: G, reason: collision with root package name */
    public final Bundle f69272G;

    /* renamed from: H, reason: collision with root package name */
    public final AbstractC5880y<String> f69273H;

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f69274a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f69275b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f69276c;

    /* renamed from: d, reason: collision with root package name */
    public final CharSequence f69277d;

    /* renamed from: e, reason: collision with root package name */
    public final CharSequence f69278e;

    /* renamed from: f, reason: collision with root package name */
    public final CharSequence f69279f;

    /* renamed from: g, reason: collision with root package name */
    public final CharSequence f69280g;

    /* renamed from: h, reason: collision with root package name */
    public final Long f69281h;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f69282i;

    /* renamed from: j, reason: collision with root package name */
    public final Integer f69283j;

    /* renamed from: k, reason: collision with root package name */
    public final Uri f69284k;

    /* renamed from: l, reason: collision with root package name */
    public final Integer f69285l;

    /* renamed from: m, reason: collision with root package name */
    public final Integer f69286m;

    /* renamed from: n, reason: collision with root package name */
    @Deprecated
    public final Integer f69287n;

    /* renamed from: o, reason: collision with root package name */
    public final Boolean f69288o;

    /* renamed from: p, reason: collision with root package name */
    public final Boolean f69289p;

    /* renamed from: q, reason: collision with root package name */
    @Deprecated
    public final Integer f69290q;

    /* renamed from: r, reason: collision with root package name */
    public final Integer f69291r;

    /* renamed from: s, reason: collision with root package name */
    public final Integer f69292s;

    /* renamed from: t, reason: collision with root package name */
    public final Integer f69293t;

    /* renamed from: u, reason: collision with root package name */
    public final Integer f69294u;

    /* renamed from: v, reason: collision with root package name */
    public final Integer f69295v;

    /* renamed from: w, reason: collision with root package name */
    public final Integer f69296w;

    /* renamed from: x, reason: collision with root package name */
    public final CharSequence f69297x;

    /* renamed from: y, reason: collision with root package name */
    public final CharSequence f69298y;

    /* renamed from: z, reason: collision with root package name */
    public final CharSequence f69299z;

    static {
        Pk0.h.f(0, 1, 2, 3, 4);
        Pk0.h.f(5, 6, 8, 9, 10);
        Pk0.h.f(11, 12, 13, 14, 15);
        Pk0.h.f(16, 17, 18, 19, 20);
        Pk0.h.f(21, 22, 23, 24, 25);
        Pk0.h.f(26, 27, 28, 29, 30);
        Pk0.h.f(31, 32, 33, 34, 1000);
    }

    s(a aVar) {
        Boolean bool = aVar.f69321o;
        Integer num = aVar.f69320n;
        Integer num2 = aVar.f69304E;
        int i11 = 1;
        int i12 = 0;
        if (bool != null) {
            if (!bool.booleanValue()) {
                num = -1;
            } else if (num == null || num.intValue() == -1) {
                if (num2 != null) {
                    switch (num2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                        case 32:
                        case 33:
                        case 34:
                        case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                            break;
                        case 20:
                        case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                        case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                        case 28:
                        case 29:
                        case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                        default:
                            i11 = 0;
                            break;
                        case 21:
                            i11 = 2;
                            break;
                        case 22:
                            i11 = 3;
                            break;
                        case 23:
                            i11 = 4;
                            break;
                        case 24:
                            i11 = 5;
                            break;
                        case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                            i11 = 6;
                            break;
                    }
                    i12 = i11;
                }
                num = Integer.valueOf(i12);
            }
        } else if (num != null) {
            boolean z11 = num.intValue() != -1;
            bool = Boolean.valueOf(z11);
            if (z11 && num2 == null) {
                switch (num.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i12 = 21;
                        break;
                    case 3:
                        i12 = 22;
                        break;
                    case 4:
                        i12 = 23;
                        break;
                    case 5:
                        i12 = 24;
                        break;
                    case 6:
                        i12 = 25;
                        break;
                    default:
                        i12 = 20;
                        break;
                }
                num2 = Integer.valueOf(i12);
            }
        }
        this.f69274a = aVar.f69307a;
        this.f69275b = aVar.f69308b;
        this.f69276c = aVar.f69309c;
        this.f69277d = aVar.f69310d;
        this.f69278e = aVar.f69311e;
        this.f69279f = aVar.f69312f;
        this.f69280g = aVar.f69313g;
        this.f69281h = aVar.f69314h;
        this.f69282i = aVar.f69315i;
        this.f69283j = aVar.f69316j;
        this.f69284k = aVar.f69317k;
        this.f69285l = aVar.f69318l;
        this.f69286m = aVar.f69319m;
        this.f69287n = num;
        this.f69288o = bool;
        this.f69289p = aVar.f69322p;
        this.f69290q = aVar.f69323q;
        this.f69291r = aVar.f69323q;
        this.f69292s = aVar.f69324r;
        this.f69293t = aVar.f69325s;
        this.f69294u = aVar.f69326t;
        this.f69295v = aVar.f69327u;
        this.f69296w = aVar.f69328v;
        this.f69297x = aVar.f69329w;
        this.f69298y = aVar.f69330x;
        this.f69299z = aVar.f69331y;
        this.f69266A = aVar.f69332z;
        this.f69267B = aVar.f69300A;
        this.f69268C = aVar.f69301B;
        this.f69269D = aVar.f69302C;
        this.f69270E = aVar.f69303D;
        this.f69271F = num2;
        this.f69273H = aVar.f69306G;
        this.f69272G = aVar.f69305F;
    }

    public final a a() {
        return new a(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s.class == obj.getClass()) {
            s sVar = (s) obj;
            if (Objects.equals(this.f69274a, sVar.f69274a) && Objects.equals(this.f69275b, sVar.f69275b) && Objects.equals(this.f69276c, sVar.f69276c) && Objects.equals(this.f69277d, sVar.f69277d) && Objects.equals(this.f69278e, sVar.f69278e) && Objects.equals(this.f69279f, sVar.f69279f) && Objects.equals(this.f69280g, sVar.f69280g) && Objects.equals(this.f69281h, sVar.f69281h) && Arrays.equals(this.f69282i, sVar.f69282i) && Objects.equals(this.f69283j, sVar.f69283j) && Objects.equals(this.f69284k, sVar.f69284k) && Objects.equals(this.f69285l, sVar.f69285l) && Objects.equals(this.f69286m, sVar.f69286m) && Objects.equals(this.f69287n, sVar.f69287n) && Objects.equals(this.f69288o, sVar.f69288o) && Objects.equals(this.f69289p, sVar.f69289p) && Objects.equals(this.f69291r, sVar.f69291r) && Objects.equals(this.f69292s, sVar.f69292s) && Objects.equals(this.f69293t, sVar.f69293t) && Objects.equals(this.f69294u, sVar.f69294u) && Objects.equals(this.f69295v, sVar.f69295v) && Objects.equals(this.f69296w, sVar.f69296w) && Objects.equals(this.f69297x, sVar.f69297x) && Objects.equals(this.f69298y, sVar.f69298y) && Objects.equals(this.f69299z, sVar.f69299z) && Objects.equals(this.f69266A, sVar.f69266A) && Objects.equals(this.f69267B, sVar.f69267B) && Objects.equals(this.f69268C, sVar.f69268C) && Objects.equals(this.f69269D, sVar.f69269D) && Objects.equals(this.f69270E, sVar.f69270E) && Objects.equals(this.f69271F, sVar.f69271F) && Objects.equals(this.f69273H, sVar.f69273H)) {
                if ((this.f69272G == null) == (sVar.f69272G == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f69274a, this.f69275b, this.f69276c, this.f69277d, this.f69278e, this.f69279f, this.f69280g, this.f69281h, null, null, Integer.valueOf(Arrays.hashCode(this.f69282i)), this.f69283j, this.f69284k, this.f69285l, this.f69286m, this.f69287n, this.f69288o, this.f69289p, this.f69291r, this.f69292s, this.f69293t, this.f69294u, this.f69295v, this.f69296w, this.f69297x, this.f69298y, this.f69299z, this.f69266A, this.f69267B, this.f69268C, this.f69269D, this.f69270E, this.f69271F, Boolean.valueOf(this.f69272G == null), this.f69273H);
    }

    public static final class a {

        /* renamed from: A, reason: collision with root package name */
        private Integer f69300A;

        /* renamed from: B, reason: collision with root package name */
        private CharSequence f69301B;

        /* renamed from: C, reason: collision with root package name */
        private CharSequence f69302C;

        /* renamed from: D, reason: collision with root package name */
        private CharSequence f69303D;

        /* renamed from: E, reason: collision with root package name */
        private Integer f69304E;

        /* renamed from: F, reason: collision with root package name */
        private Bundle f69305F;

        /* renamed from: G, reason: collision with root package name */
        private AbstractC5880y<String> f69306G;

        /* renamed from: a, reason: collision with root package name */
        private CharSequence f69307a;

        /* renamed from: b, reason: collision with root package name */
        private CharSequence f69308b;

        /* renamed from: c, reason: collision with root package name */
        private CharSequence f69309c;

        /* renamed from: d, reason: collision with root package name */
        private CharSequence f69310d;

        /* renamed from: e, reason: collision with root package name */
        private CharSequence f69311e;

        /* renamed from: f, reason: collision with root package name */
        private CharSequence f69312f;

        /* renamed from: g, reason: collision with root package name */
        private CharSequence f69313g;

        /* renamed from: h, reason: collision with root package name */
        private Long f69314h;

        /* renamed from: i, reason: collision with root package name */
        private byte[] f69315i;

        /* renamed from: j, reason: collision with root package name */
        private Integer f69316j;

        /* renamed from: k, reason: collision with root package name */
        private Uri f69317k;

        /* renamed from: l, reason: collision with root package name */
        private Integer f69318l;

        /* renamed from: m, reason: collision with root package name */
        private Integer f69319m;

        /* renamed from: n, reason: collision with root package name */
        private Integer f69320n;

        /* renamed from: o, reason: collision with root package name */
        private Boolean f69321o;

        /* renamed from: p, reason: collision with root package name */
        private Boolean f69322p;

        /* renamed from: q, reason: collision with root package name */
        private Integer f69323q;

        /* renamed from: r, reason: collision with root package name */
        private Integer f69324r;

        /* renamed from: s, reason: collision with root package name */
        private Integer f69325s;

        /* renamed from: t, reason: collision with root package name */
        private Integer f69326t;

        /* renamed from: u, reason: collision with root package name */
        private Integer f69327u;

        /* renamed from: v, reason: collision with root package name */
        private Integer f69328v;

        /* renamed from: w, reason: collision with root package name */
        private CharSequence f69329w;

        /* renamed from: x, reason: collision with root package name */
        private CharSequence f69330x;

        /* renamed from: y, reason: collision with root package name */
        private CharSequence f69331y;

        /* renamed from: z, reason: collision with root package name */
        private Integer f69332z;

        public a() {
            this.f69306G = AbstractC5880y.v();
        }

        public final s H() {
            return new s(this);
        }

        public final void I(int i11, byte[] bArr) {
            if (this.f69315i == null || i11 == 3 || !Objects.equals(this.f69316j, 3)) {
                this.f69315i = (byte[]) bArr.clone();
                this.f69316j = Integer.valueOf(i11);
            }
        }

        public final void J(s sVar) {
            if (sVar == null) {
                return;
            }
            CharSequence charSequence = sVar.f69274a;
            if (charSequence != null) {
                this.f69307a = charSequence;
            }
            CharSequence charSequence2 = sVar.f69275b;
            if (charSequence2 != null) {
                this.f69308b = charSequence2;
            }
            CharSequence charSequence3 = sVar.f69276c;
            if (charSequence3 != null) {
                this.f69309c = charSequence3;
            }
            CharSequence charSequence4 = sVar.f69277d;
            if (charSequence4 != null) {
                this.f69310d = charSequence4;
            }
            CharSequence charSequence5 = sVar.f69278e;
            if (charSequence5 != null) {
                this.f69311e = charSequence5;
            }
            CharSequence charSequence6 = sVar.f69279f;
            if (charSequence6 != null) {
                this.f69312f = charSequence6;
            }
            CharSequence charSequence7 = sVar.f69280g;
            if (charSequence7 != null) {
                this.f69313g = charSequence7;
            }
            Long l11 = sVar.f69281h;
            if (l11 != null) {
                G10.a.c(l11.longValue() >= 0);
                this.f69314h = l11;
            }
            byte[] bArr = sVar.f69282i;
            Uri uri = sVar.f69284k;
            if (uri != null || bArr != null) {
                this.f69317k = uri;
                this.f69315i = bArr == null ? null : (byte[]) bArr.clone();
                this.f69316j = sVar.f69283j;
            }
            Integer num = sVar.f69285l;
            if (num != null) {
                this.f69318l = num;
            }
            Integer num2 = sVar.f69286m;
            if (num2 != null) {
                this.f69319m = num2;
            }
            Integer num3 = sVar.f69287n;
            if (num3 != null) {
                this.f69320n = num3;
            }
            Boolean bool = sVar.f69288o;
            if (bool != null) {
                this.f69321o = bool;
            }
            Boolean bool2 = sVar.f69289p;
            if (bool2 != null) {
                this.f69322p = bool2;
            }
            Integer num4 = sVar.f69290q;
            if (num4 != null) {
                this.f69323q = num4;
            }
            Integer num5 = sVar.f69291r;
            if (num5 != null) {
                this.f69323q = num5;
            }
            Integer num6 = sVar.f69292s;
            if (num6 != null) {
                this.f69324r = num6;
            }
            Integer num7 = sVar.f69293t;
            if (num7 != null) {
                this.f69325s = num7;
            }
            Integer num8 = sVar.f69294u;
            if (num8 != null) {
                this.f69326t = num8;
            }
            Integer num9 = sVar.f69295v;
            if (num9 != null) {
                this.f69327u = num9;
            }
            Integer num10 = sVar.f69296w;
            if (num10 != null) {
                this.f69328v = num10;
            }
            CharSequence charSequence8 = sVar.f69297x;
            if (charSequence8 != null) {
                this.f69329w = charSequence8;
            }
            CharSequence charSequence9 = sVar.f69298y;
            if (charSequence9 != null) {
                this.f69330x = charSequence9;
            }
            CharSequence charSequence10 = sVar.f69299z;
            if (charSequence10 != null) {
                this.f69331y = charSequence10;
            }
            Integer num11 = sVar.f69266A;
            if (num11 != null) {
                this.f69332z = num11;
            }
            Integer num12 = sVar.f69267B;
            if (num12 != null) {
                this.f69300A = num12;
            }
            CharSequence charSequence11 = sVar.f69268C;
            if (charSequence11 != null) {
                this.f69301B = charSequence11;
            }
            CharSequence charSequence12 = sVar.f69269D;
            if (charSequence12 != null) {
                this.f69302C = charSequence12;
            }
            CharSequence charSequence13 = sVar.f69270E;
            if (charSequence13 != null) {
                this.f69303D = charSequence13;
            }
            Integer num13 = sVar.f69271F;
            if (num13 != null) {
                this.f69304E = num13;
            }
            Bundle bundle = sVar.f69272G;
            if (bundle != null) {
                this.f69305F = bundle;
            }
            AbstractC5880y<String> abstractC5880y = sVar.f69273H;
            if (abstractC5880y.isEmpty()) {
                return;
            }
            this.f69306G = AbstractC5880y.n(abstractC5880y);
        }

        public final void K(CharSequence charSequence) {
            this.f69310d = charSequence;
        }

        public final void L(CharSequence charSequence) {
            this.f69309c = charSequence;
        }

        public final void M(CharSequence charSequence) {
            this.f69308b = charSequence;
        }

        public final void N(CharSequence charSequence) {
            this.f69330x = charSequence;
        }

        public final void O(CharSequence charSequence) {
            this.f69331y = charSequence;
        }

        public final void P(CharSequence charSequence) {
            this.f69313g = charSequence;
        }

        public final void Q(Integer num) {
            this.f69332z = num;
        }

        public final void R(CharSequence charSequence) {
            this.f69301B = charSequence;
        }

        public final void S(Integer num) {
            this.f69325s = num;
        }

        public final void T(Integer num) {
            this.f69324r = num;
        }

        public final void U(Integer num) {
            this.f69323q = num;
        }

        public final void V(Integer num) {
            this.f69328v = num;
        }

        public final void W(Integer num) {
            this.f69327u = num;
        }

        public final void X(Integer num) {
            this.f69326t = num;
        }

        public final void Y(CharSequence charSequence) {
            this.f69303D = charSequence;
        }

        public final void Z(CharSequence charSequence) {
            this.f69307a = charSequence;
        }

        public final void a0(Integer num) {
            this.f69300A = num;
        }

        public final void b0(Integer num) {
            this.f69319m = num;
        }

        public final void c0(Integer num) {
            this.f69318l = num;
        }

        public final void d0(CharSequence charSequence) {
            this.f69329w = charSequence;
        }

        a(s sVar) {
            this.f69307a = sVar.f69274a;
            this.f69308b = sVar.f69275b;
            this.f69309c = sVar.f69276c;
            this.f69310d = sVar.f69277d;
            this.f69311e = sVar.f69278e;
            this.f69312f = sVar.f69279f;
            this.f69313g = sVar.f69280g;
            this.f69314h = sVar.f69281h;
            this.f69315i = sVar.f69282i;
            this.f69316j = sVar.f69283j;
            this.f69317k = sVar.f69284k;
            this.f69318l = sVar.f69285l;
            this.f69319m = sVar.f69286m;
            this.f69320n = sVar.f69287n;
            this.f69321o = sVar.f69288o;
            this.f69322p = sVar.f69289p;
            this.f69323q = sVar.f69291r;
            this.f69324r = sVar.f69292s;
            this.f69325s = sVar.f69293t;
            this.f69326t = sVar.f69294u;
            this.f69327u = sVar.f69295v;
            this.f69328v = sVar.f69296w;
            this.f69329w = sVar.f69297x;
            this.f69330x = sVar.f69298y;
            this.f69331y = sVar.f69299z;
            this.f69332z = sVar.f69266A;
            this.f69300A = sVar.f69267B;
            this.f69301B = sVar.f69268C;
            this.f69302C = sVar.f69269D;
            this.f69303D = sVar.f69270E;
            this.f69304E = sVar.f69271F;
            this.f69306G = sVar.f69273H;
            this.f69305F = sVar.f69272G;
        }
    }
}
