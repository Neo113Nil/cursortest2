package defpackage;

import android.net.Uri;
import android.os.Bundle;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class k8k extends b8d {
    public static final k8k s = new k8k(false, 0);
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k8k(boolean z, int i) {
        super(z);
        this.r = i;
    }

    @Override // defpackage.b8d
    public final Object a(Bundle bundle, String str) {
        switch (this.r) {
            case 0:
                bundle.getClass();
                str.getClass();
                return null;
            case 1:
                bundle.getClass();
                str.getClass();
                if (!o3a.r(bundle, str) || o3a.I(bundle, str)) {
                    return null;
                }
                return Boolean.valueOf(o3a.t(bundle, str));
            case 2:
                bundle.getClass();
                str.getClass();
                if (!o3a.r(bundle, str) || o3a.I(bundle, str)) {
                    return null;
                }
                return Double.valueOf(o3a.w(bundle, str));
            case 3:
                bundle.getClass();
                str.getClass();
                return Double.valueOf(o3a.w(bundle, str));
            case 4:
                bundle.getClass();
                str.getClass();
                if (!o3a.r(bundle, str) || o3a.I(bundle, str)) {
                    return null;
                }
                return Float.valueOf(o3a.x(bundle, str));
            case 5:
                bundle.getClass();
                str.getClass();
                if (!o3a.r(bundle, str) || o3a.I(bundle, str)) {
                    return null;
                }
                return Integer.valueOf(o3a.y(bundle, str));
            case 6:
                bundle.getClass();
                str.getClass();
                if (!o3a.r(bundle, str) || o3a.I(bundle, str)) {
                    return null;
                }
                return Long.valueOf(o3a.A(bundle, str));
            default:
                bundle.getClass();
                str.getClass();
                return (!o3a.r(bundle, str) || o3a.I(bundle, str)) ? "null" : o3a.C(bundle, str);
        }
    }

    @Override // defpackage.b8d
    public final String b() {
        switch (this.r) {
            case 0:
                return "unknown";
            case 1:
                return "boolean_nullable";
            case 2:
                return "double_nullable";
            case 3:
                return "double";
            case 4:
                return "float_nullable";
            case 5:
                return "integer_nullable";
            case 6:
                return "long_nullable";
            default:
                return "string_non_nullable";
        }
    }

    @Override // defpackage.b8d
    public final Object d(String str) {
        switch (this.r) {
            case 0:
                str.getClass();
                return "null";
            case 1:
                str.getClass();
                if (str.equals("null")) {
                    return null;
                }
                return (Boolean) b8d.l.d(str);
            case 2:
                str.getClass();
                if (str.equals("null")) {
                    return null;
                }
                return Double.valueOf(Double.parseDouble(str));
            case 3:
                str.getClass();
                return Double.valueOf(Double.parseDouble(str));
            case 4:
                str.getClass();
                if (str.equals("null")) {
                    return null;
                }
                return Float.valueOf(Float.parseFloat(str));
            case 5:
                str.getClass();
                if (str.equals("null")) {
                    return null;
                }
                return (Integer) b8d.b.d(str);
            case 6:
                str.getClass();
                if (str.equals("null")) {
                    return null;
                }
                return (Long) b8d.f.d(str);
            default:
                str.getClass();
                return str;
        }
    }

    @Override // defpackage.b8d
    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.r) {
            case 0:
                str.getClass();
                ((String) obj).getClass();
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                str.getClass();
                if (bool != null) {
                    b8d.l.e(bundle, str, bool);
                    break;
                } else {
                    bundle.putString(str, null);
                    break;
                }
            case 2:
                Double d = (Double) obj;
                str.getClass();
                if (d != null) {
                    bundle.putDouble(str, d.doubleValue());
                    break;
                } else {
                    bundle.putString(str, null);
                    break;
                }
            case 3:
                double doubleValue = ((Number) obj).doubleValue();
                str.getClass();
                bundle.putDouble(str, doubleValue);
                break;
            case 4:
                Float f = (Float) obj;
                str.getClass();
                if (f != null) {
                    b8d.i.e(bundle, str, f);
                    break;
                } else {
                    bundle.putString(str, null);
                    break;
                }
            case 5:
                Integer num = (Integer) obj;
                str.getClass();
                if (num != null) {
                    b8d.b.e(bundle, str, num);
                    break;
                } else {
                    bundle.putString(str, null);
                    break;
                }
            case 6:
                Long l = (Long) obj;
                str.getClass();
                if (l != null) {
                    b8d.f.e(bundle, str, l);
                    break;
                } else {
                    bundle.putString(str, null);
                    break;
                }
            default:
                String str2 = (String) obj;
                str.getClass();
                str2.getClass();
                bundle.putString(str, str2);
                break;
        }
    }

    @Override // defpackage.b8d
    public String f(Object obj) {
        switch (this.r) {
            case 7:
                String str = (String) obj;
                str.getClass();
                String encode = Uri.encode(str, null);
                encode.getClass();
                return encode;
            default:
                return super.f(obj);
        }
    }
}
