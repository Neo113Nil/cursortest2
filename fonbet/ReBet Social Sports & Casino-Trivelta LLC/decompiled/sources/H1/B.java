package H1;

import b1.C2334C;
import e1.Z;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f4302c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a, reason: collision with root package name */
    public int f4303a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f4304b = -1;

    public boolean a() {
        return (this.f4303a == -1 || this.f4304b == -1) ? false : true;
    }

    public final boolean b(String str) {
        Matcher matcher = f4302c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int parseInt = Integer.parseInt((String) Z.i(matcher.group(1)), 16);
            int parseInt2 = Integer.parseInt((String) Z.i(matcher.group(2)), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f4303a = parseInt;
            this.f4304b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public boolean c(C2334C c2334c) {
        for (int i10 = 0; i10 < c2334c.e(); i10++) {
            C2334C.a d10 = c2334c.d(i10);
            if (d10 instanceof V1.e) {
                V1.e eVar = (V1.e) d10;
                if ("iTunSMPB".equals(eVar.f12343c) && b(eVar.f12344d)) {
                    return true;
                }
            } else if (d10 instanceof V1.k) {
                V1.k kVar = (V1.k) d10;
                if ("com.apple.iTunes".equals(kVar.f12355b) && "iTunSMPB".equals(kVar.f12356c) && b(kVar.f12357d)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
