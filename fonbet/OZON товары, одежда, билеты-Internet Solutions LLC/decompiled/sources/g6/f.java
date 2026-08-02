package g6;

import T5.m;
import V5.v;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import c6.C5753e;
import java.security.MessageDigest;
import p6.k;

/* loaded from: classes.dex */
public final class f implements m<c> {

    /* renamed from: b, reason: collision with root package name */
    private final m<Bitmap> f63897b;

    public f(m<Bitmap> mVar) {
        k.c(mVar, "Argument must not be null");
        this.f63897b = mVar;
    }

    @Override // T5.f
    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f63897b.equals(((f) obj).f63897b);
        }
        return false;
    }

    @Override // T5.f
    public final int hashCode() {
        return this.f63897b.hashCode();
    }

    @Override // T5.m
    @NonNull
    public final v<c> transform(@NonNull Context context, @NonNull v<c> vVar, int i11, int i12) {
        c cVar = vVar.get();
        C5753e c5753e = new C5753e(com.bumptech.glide.c.a(context).c(), cVar.c());
        m<Bitmap> mVar = this.f63897b;
        v<Bitmap> transform = mVar.transform(context, c5753e, i11, i12);
        if (!c5753e.equals(transform)) {
            c5753e.a();
        }
        cVar.f(mVar, transform.get());
        return vVar;
    }

    @Override // T5.f
    public final void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        this.f63897b.updateDiskCacheKey(messageDigest);
    }
}
