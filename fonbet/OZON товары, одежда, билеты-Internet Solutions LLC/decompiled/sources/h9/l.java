package h9;

import java.util.Map;
import nm0.C8612b;
import o9.C8660b;
import y9.C10866B;
import y9.C10868b;
import y9.C10870d;

/* loaded from: classes9.dex */
public final class l implements u {

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f65113a;

        static {
            int[] iArr = new int[EnumC6876a.values().length];
            f65113a = iArr;
            try {
                iArr[EnumC6876a.EAN_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65113a[EnumC6876a.UPC_E.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65113a[EnumC6876a.EAN_13.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f65113a[EnumC6876a.UPC_A.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f65113a[EnumC6876a.QR_CODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f65113a[EnumC6876a.CODE_39.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f65113a[EnumC6876a.CODE_93.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f65113a[EnumC6876a.CODE_128.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f65113a[EnumC6876a.ITF.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f65113a[EnumC6876a.PDF_417.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f65113a[EnumC6876a.CODABAR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f65113a[EnumC6876a.DATA_MATRIX.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f65113a[EnumC6876a.AZTEC.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    @Override // h9.u
    public final C8660b a(String str, EnumC6876a enumC6876a, int i11, int i12, Map<g, ?> map) throws v {
        u lVar;
        switch (a.f65113a[enumC6876a.ordinal()]) {
            case 1:
                lVar = new y9.l();
                break;
            case 2:
                lVar = new C10866B();
                break;
            case 3:
                lVar = new y9.j();
                break;
            case 4:
                lVar = new y9.u();
                break;
            case 5:
                lVar = new H9.b();
                break;
            case 6:
                lVar = new y9.f();
                break;
            case 7:
                lVar = new y9.h();
                break;
            case 8:
                lVar = new C10870d();
                break;
            case 9:
                lVar = new y9.o();
                break;
            case 10:
                lVar = new C9.d();
                break;
            case 11:
                lVar = new C10868b();
                break;
            case 12:
                lVar = new C8612b();
                break;
            case 13:
                lVar = new com.google.gson.internal.p();
                break;
            default:
                throw new IllegalArgumentException("No encoder available for format ".concat(String.valueOf(enumC6876a)));
        }
        return lVar.a(str, enumC6876a, i11, i12, map);
    }
}
