package b1;

import java.io.IOException;

/* renamed from: b1.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2338G extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f24301a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24302b;

    public C2338G(String str, Throwable th2, boolean z10, int i10) {
        super(str, th2);
        this.f24301a = z10;
        this.f24302b = i10;
    }

    public static C2338G a(String str, Throwable th2) {
        return new C2338G(str, th2, true, 1);
    }

    public static C2338G b(String str, Throwable th2) {
        return new C2338G(str, th2, true, 0);
    }

    public static C2338G c(String str, Throwable th2) {
        return new C2338G(str, th2, true, 4);
    }

    public static C2338G d(String str) {
        return new C2338G(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str;
        String message = super.getMessage();
        StringBuilder sb2 = new StringBuilder();
        if (message != null) {
            str = message + " ";
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append("{contentIsMalformed=");
        sb2.append(this.f24301a);
        sb2.append(", dataType=");
        sb2.append(this.f24302b);
        sb2.append("}");
        return sb2.toString();
    }
}
