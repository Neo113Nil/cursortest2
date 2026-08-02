package j3;

import java.io.IOException;

/* loaded from: classes.dex */
public class v extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f69340a;

    /* renamed from: b, reason: collision with root package name */
    public final int f69341b;

    protected v(String str, RuntimeException runtimeException, boolean z11, int i11) {
        super(str, runtimeException);
        this.f69340a = z11;
        this.f69341b = i11;
    }

    public static v a(RuntimeException runtimeException, String str) {
        return new v(str, runtimeException, true, 1);
    }

    public static v b(String str, IllegalArgumentException illegalArgumentException) {
        return new v(str, illegalArgumentException, true, 0);
    }

    public static v d(String str) {
        return new v(str, null, true, 4);
    }

    public static v e(String str) {
        return new v(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(message != null ? message.concat(" ") : "");
        sb2.append("{contentIsMalformed=");
        sb2.append(this.f69340a);
        sb2.append(", dataType=");
        return K00.b.e(this.f69341b, "}", sb2);
    }
}
