package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class s9e extends IOException {
    public final boolean a;
    public final int b;

    public s9e(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.a = z;
        this.b = i;
    }

    public static s9e a(RuntimeException runtimeException, String str) {
        return new s9e(str, runtimeException, true, 1);
    }

    public static s9e b(String str, Exception exc) {
        return new s9e(str, exc, true, 4);
    }

    public static s9e c(String str) {
        return new s9e(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        StringBuilder sb = new StringBuilder(message != null ? message.concat(" ") : "");
        sb.append("{contentIsMalformed=");
        sb.append(this.a);
        sb.append(", dataType=");
        return fc6.h(this.b, "}", sb);
    }
}
