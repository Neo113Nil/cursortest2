package q4;

import android.text.TextUtils;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.google.common.collect.A;
import com.google.common.collect.AbstractC5858b;
import com.google.common.collect.B;
import com.google.common.collect.b0;
import java.util.regex.Pattern;

/* loaded from: classes8.dex */
final class b {

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f81551d = Pattern.compile("\\s+");

    /* renamed from: e, reason: collision with root package name */
    private static final A<String> f81552e = A.D("auto", DevicePublicKeyStringDef.NONE);

    /* renamed from: f, reason: collision with root package name */
    private static final A<String> f81553f = A.E("dot", "sesame", "circle");

    /* renamed from: g, reason: collision with root package name */
    private static final A<String> f81554g = A.D("filled", "open");

    /* renamed from: h, reason: collision with root package name */
    private static final A<String> f81555h = A.E("after", "before", "outside");

    /* renamed from: a, reason: collision with root package name */
    public final int f81556a;

    /* renamed from: b, reason: collision with root package name */
    public final int f81557b;

    /* renamed from: c, reason: collision with root package name */
    public final int f81558c;

    private b(int i11, int i12, int i13) {
        this.f81556a = i11;
        this.f81557b = i12;
        this.f81558c = i13;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x010c, code lost:
    
        if (r9.equals("dot") != false) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static b a(String str) {
        boolean z11;
        int i11;
        int hashCode;
        if (str == null) {
            return null;
        }
        String b11 = O7.b.b(str.trim());
        if (b11.isEmpty()) {
            return null;
        }
        A v11 = A.v(TextUtils.split(b11, f81551d));
        String str2 = (String) B.a(b0.d(f81555h, v11), "outside");
        int hashCode2 = str2.hashCode();
        boolean z12 = false;
        int i12 = -1;
        if (hashCode2 == -1392885889) {
            if (str2.equals("before")) {
                z11 = 2;
            }
            z11 = -1;
        } else if (hashCode2 != -1106037339) {
            if (hashCode2 == 92734940 && str2.equals("after")) {
                z11 = false;
            }
            z11 = -1;
        } else {
            if (str2.equals("outside")) {
                z11 = true;
            }
            z11 = -1;
        }
        int i13 = z11 ? !z11 ? 1 : -2 : 2;
        b0.d d11 = b0.d(f81552e, v11);
        if (!d11.isEmpty()) {
            String str3 = (String) ((AbstractC5858b) d11.iterator()).next();
            int hashCode3 = str3.hashCode();
            if (hashCode3 == 3005871) {
                str3.equals("auto");
            } else if (hashCode3 == 3387192 && str3.equals(DevicePublicKeyStringDef.NONE)) {
                i12 = 0;
            }
            return new b(i12, 0, i13);
        }
        b0.d d12 = b0.d(f81554g, v11);
        b0.d d13 = b0.d(f81553f, v11);
        if (d12.isEmpty() && d13.isEmpty()) {
            return new b(-1, 0, i13);
        }
        String str4 = (String) B.a(d12, "filled");
        int hashCode4 = str4.hashCode();
        if (hashCode4 == -1274499742) {
            str4.equals("filled");
        } else if (hashCode4 == 3417674 && str4.equals("open")) {
            i11 = 2;
            String str5 = (String) B.a(d13, "circle");
            hashCode = str5.hashCode();
            if (hashCode != -1360216880) {
                if (str5.equals("circle")) {
                    z12 = 2;
                }
                z12 = -1;
            } else if (hashCode != -905816648) {
                if (hashCode == 99657) {
                }
                z12 = -1;
            } else {
                if (str5.equals("sesame")) {
                    z12 = true;
                }
                z12 = -1;
            }
            return new b(z12 ? !z12 ? 1 : 3 : 2, i11, i13);
        }
        i11 = 1;
        String str52 = (String) B.a(d13, "circle");
        hashCode = str52.hashCode();
        if (hashCode != -1360216880) {
        }
        return new b(z12 ? !z12 ? 1 : 3 : 2, i11, i13);
    }
}
