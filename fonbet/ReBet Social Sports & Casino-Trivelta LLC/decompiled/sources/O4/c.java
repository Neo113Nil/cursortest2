package O4;

import com.bumptech.glide.load.g;
import com.bumptech.glide.util.k;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public final class c implements g {

    /* renamed from: b, reason: collision with root package name */
    public final Object f8333b;

    public c(Object obj) {
        this.f8333b = k.d(obj);
    }

    @Override // com.bumptech.glide.load.g
    public void b(MessageDigest messageDigest) {
        messageDigest.update(this.f8333b.toString().getBytes(g.f29962a));
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f8333b.equals(((c) obj).f8333b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        return this.f8333b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f8333b + '}';
    }
}
