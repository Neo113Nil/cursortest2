package O2;

import java.util.Objects;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f8308a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8309b;
    private final byte[] mArrayBuffer;
    private final c[] mPorts;

    public b(String str, c[] cVarArr) {
        this.f8308a = str;
        this.mArrayBuffer = null;
        this.mPorts = cVarArr;
        this.f8309b = 0;
    }

    public final void a(int i10) {
        if (i10 == this.f8309b) {
            return;
        }
        throw new IllegalStateException("Wrong data accessor type detected. " + c(this.f8309b) + " expected, but got " + c(i10));
    }

    public String b() {
        a(0);
        return this.f8308a;
    }

    public final String c(int i10) {
        return i10 != 0 ? i10 != 1 ? "Unknown" : "ArrayBuffer" : "String";
    }

    public b(byte[] bArr, c[] cVarArr) {
        Objects.requireNonNull(bArr);
        this.mArrayBuffer = bArr;
        this.f8308a = null;
        this.mPorts = cVarArr;
        this.f8309b = 1;
    }
}
