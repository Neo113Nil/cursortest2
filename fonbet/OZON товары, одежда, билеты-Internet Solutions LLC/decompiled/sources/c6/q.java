package c6;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class q implements T5.m<Drawable> {

    /* renamed from: b, reason: collision with root package name */
    private final T5.m<Bitmap> f56585b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f56586c;

    public q(T5.m<Bitmap> mVar, boolean z11) {
        this.f56585b = mVar;
        this.f56586c = z11;
    }

    @Override // T5.f
    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            return this.f56585b.equals(((q) obj).f56585b);
        }
        return false;
    }

    @Override // T5.f
    public final int hashCode() {
        return this.f56585b.hashCode();
    }

    @Override // T5.m
    @NonNull
    public final V5.v<Drawable> transform(@NonNull Context context, @NonNull V5.v<Drawable> vVar, int i11, int i12) {
        W5.d c11 = com.bumptech.glide.c.a(context).c();
        Drawable drawable = vVar.get();
        C5753e a11 = p.a(c11, drawable, i11, i12);
        if (a11 != null) {
            V5.v<Bitmap> transform = this.f56585b.transform(context, a11, i11, i12);
            if (!transform.equals(a11)) {
                return w.c(context.getResources(), transform);
            }
            transform.a();
            return vVar;
        }
        if (!this.f56586c) {
            return vVar;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // T5.f
    public final void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        this.f56585b.updateDiskCacheKey(messageDigest);
    }
}
