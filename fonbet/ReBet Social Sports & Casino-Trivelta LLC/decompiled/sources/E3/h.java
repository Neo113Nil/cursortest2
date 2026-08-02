package E3;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f2995a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2996b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2997c;

    public h(String str, float f10, float f11) {
        this.f2995a = str;
        this.f2997c = f11;
        this.f2996b = f10;
    }

    public boolean a(String str) {
        if (this.f2995a.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.f2995a.endsWith("\r")) {
            String str2 = this.f2995a;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
