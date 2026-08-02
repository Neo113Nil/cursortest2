package i2;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: i2.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C7000c implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    private final char[] f65755a;

    /* renamed from: b, reason: collision with root package name */
    protected long f65756b = -1;

    /* renamed from: c, reason: collision with root package name */
    protected long f65757c = Long.MAX_VALUE;

    /* renamed from: d, reason: collision with root package name */
    protected C6999b f65758d;

    public C7000c(char[] cArr) {
        this.f65755a = cArr;
    }

    @Override // 
    @NonNull
    /* renamed from: a */
    public C7000c clone() {
        try {
            return (C7000c) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public final String b() {
        String str = new String(this.f65755a);
        if (str.length() < 1) {
            return "";
        }
        long j11 = this.f65757c;
        if (j11 != Long.MAX_VALUE) {
            long j12 = this.f65756b;
            if (j11 >= j12) {
                return str.substring((int) j12, ((int) j11) + 1);
            }
        }
        long j13 = this.f65756b;
        return str.substring((int) j13, ((int) j13) + 1);
    }

    public float c() {
        if (this instanceof e) {
            return ((e) this).c();
        }
        return Float.NaN;
    }

    public int e() {
        if (this instanceof e) {
            return ((e) this).e();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7000c)) {
            return false;
        }
        C7000c c7000c = (C7000c) obj;
        if (this.f65756b == c7000c.f65756b && this.f65757c == c7000c.f65757c && Arrays.equals(this.f65755a, c7000c.f65755a)) {
            return Objects.equals(this.f65758d, c7000c.f65758d);
        }
        return false;
    }

    protected final String f() {
        String cls = getClass().toString();
        return cls.substring(cls.lastIndexOf(46) + 1);
    }

    public final boolean g() {
        char[] cArr = this.f65755a;
        return cArr != null && cArr.length >= 1;
    }

    public final void h(long j11) {
        if (this.f65757c != Long.MAX_VALUE) {
            return;
        }
        this.f65757c = j11;
        C6999b c6999b = this.f65758d;
        if (c6999b != null) {
            c6999b.i(this);
        }
    }

    public int hashCode() {
        int hashCode = Arrays.hashCode(this.f65755a) * 31;
        long j11 = this.f65756b;
        int i11 = (hashCode + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f65757c;
        int i12 = (i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        C6999b c6999b = this.f65758d;
        return (i12 + (c6999b != null ? c6999b.hashCode() : 0)) * 31;
    }

    public String toString() {
        long j11 = this.f65756b;
        long j12 = this.f65757c;
        if (j11 > j12 || j12 == Long.MAX_VALUE) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getClass());
            sb2.append(" (INVALID, ");
            sb2.append(this.f65756b);
            sb2.append("-");
            return P4.f.a(this.f65757c, ")", sb2);
        }
        return f() + " (" + this.f65756b + " : " + this.f65757c + ") <<" + new String(this.f65755a).substring((int) this.f65756b, ((int) this.f65757c) + 1) + ">>";
    }
}
