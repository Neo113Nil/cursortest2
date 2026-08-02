package o6;

import T5.f;
import androidx.annotation.NonNull;
import java.security.MessageDigest;
import p6.k;

/* loaded from: classes.dex */
public final class d implements f {

    /* renamed from: b, reason: collision with root package name */
    private final Object f77776b;

    public d(@NonNull Object obj) {
        k.c(obj, "Argument must not be null");
        this.f77776b = obj;
    }

    @Override // T5.f
    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f77776b.equals(((d) obj).f77776b);
        }
        return false;
    }

    @Override // T5.f
    public final int hashCode() {
        return this.f77776b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.f77776b + '}';
    }

    @Override // T5.f
    public final void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        messageDigest.update(this.f77776b.toString().getBytes(f.f26662a));
    }
}
