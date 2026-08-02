package defpackage;

import android.net.Uri;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cz1 extends b8d {
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cz1(boolean z, int i) {
        super(z);
        this.r = i;
    }

    @Override // defpackage.b8d
    public final Object a(Bundle bundle, String str) {
        switch (this.r) {
            case 0:
                bundle.getClass();
                str.getClass();
                if (!o3a.r(bundle, str) || o3a.I(bundle, str)) {
                    return null;
                }
                return Boolean.valueOf(o3a.t(bundle, str));
            case 1:
                bundle.getClass();
                str.getClass();
                return Float.valueOf(o3a.x(bundle, str));
            case 2:
                bundle.getClass();
                str.getClass();
                return Integer.valueOf(o3a.y(bundle, str));
            case 3:
                bundle.getClass();
                str.getClass();
                return Long.valueOf(o3a.A(bundle, str));
            case 4:
                bundle.getClass();
                str.getClass();
                return Integer.valueOf(o3a.y(bundle, str));
            default:
                bundle.getClass();
                str.getClass();
                if (!o3a.r(bundle, str) || o3a.I(bundle, str)) {
                    return null;
                }
                return o3a.C(bundle, str);
        }
    }

    @Override // defpackage.b8d
    public final String b() {
        switch (this.r) {
            case 0:
                return "boolean";
            case 1:
                return "float";
            case 2:
                return "integer";
            case 3:
                return "long";
            case 4:
                return "reference";
            default:
                return "string";
        }
    }

    @Override // defpackage.b8d
    public final Object d(String str) {
        boolean z = true;
        switch (this.r) {
            case 0:
                str.getClass();
                if (!Intrinsics.c(str, "true")) {
                    if (!Intrinsics.c(str, "false")) {
                        a70.p("A boolean NavType only accepts \"true\" or \"false\" values.");
                        return null;
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                str.getClass();
                return Float.valueOf(Float.parseFloat(str));
            case 2:
                str.getClass();
                return Integer.valueOf(c.v(str, "0x", false) ? Integer.parseInt(str.substring(2), CharsKt.checkRadix(16)) : Integer.parseInt(str));
            case 3:
                str.getClass();
                String h = c.n(str, "L", false) ? wv8.h(1, 0, str) : str;
                return Long.valueOf(c.v(str, "0x", false) ? Long.parseLong(h.substring(2), CharsKt.checkRadix(16)) : Long.parseLong(h));
            case 4:
                str.getClass();
                return Integer.valueOf(c.v(str, "0x", false) ? Integer.parseInt(str.substring(2), CharsKt.checkRadix(16)) : Integer.parseInt(str));
            default:
                str.getClass();
                if (Intrinsics.c(str, "null")) {
                    return null;
                }
                return str;
        }
    }

    @Override // defpackage.b8d
    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.r) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                str.getClass();
                bundle.putBoolean(str, booleanValue);
                break;
            case 1:
                float floatValue = ((Number) obj).floatValue();
                str.getClass();
                bundle.putFloat(str, floatValue);
                break;
            case 2:
                int intValue = ((Number) obj).intValue();
                str.getClass();
                bundle.putInt(str, intValue);
                break;
            case 3:
                long longValue = ((Number) obj).longValue();
                str.getClass();
                bundle.putLong(str, longValue);
                break;
            case 4:
                int intValue2 = ((Number) obj).intValue();
                str.getClass();
                bundle.putInt(str, intValue2);
                break;
            default:
                String str2 = (String) obj;
                str.getClass();
                if (str2 == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    bundle.putString(str, str2);
                    break;
                }
        }
    }

    @Override // defpackage.b8d
    public String f(Object obj) {
        switch (this.r) {
            case 5:
                String str = (String) obj;
                if (str == null) {
                    return "null";
                }
                String encode = Uri.encode(str, null);
                encode.getClass();
                return encode;
            default:
                return super.f(obj);
        }
    }
}
