package b;

import b3.AbstractC2382a;
import java.util.Arrays;

/* renamed from: b.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2301b0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f24088a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f24089b;

    public C2301b0(byte[] bArr) {
        this.f24088a = AbstractC2382a.c(bArr);
        this.f24089b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2301b0) {
            return Arrays.equals(this.f24089b, ((C2301b0) obj).f24089b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f24088a;
    }
}
