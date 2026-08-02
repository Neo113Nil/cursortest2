package V1;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c extends i {

    /* renamed from: b, reason: collision with root package name */
    public final String f12334b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12335c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12336d;

    /* renamed from: e, reason: collision with root package name */
    public final long f12337e;

    /* renamed from: f, reason: collision with root package name */
    public final long f12338f;
    private final i[] subFrames;

    public c(String str, int i10, int i11, long j10, long j11, i[] iVarArr) {
        super("CHAP");
        this.f12334b = str;
        this.f12335c = i10;
        this.f12336d = i11;
        this.f12337e = j10;
        this.f12338f = j11;
        this.subFrames = iVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f12335c == cVar.f12335c && this.f12336d == cVar.f12336d && this.f12337e == cVar.f12337e && this.f12338f == cVar.f12338f && Objects.equals(this.f12334b, cVar.f12334b) && Arrays.equals(this.subFrames, cVar.subFrames)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = (((((((527 + this.f12335c) * 31) + this.f12336d) * 31) + ((int) this.f12337e)) * 31) + ((int) this.f12338f)) * 31;
        String str = this.f12334b;
        return i10 + (str != null ? str.hashCode() : 0);
    }
}
