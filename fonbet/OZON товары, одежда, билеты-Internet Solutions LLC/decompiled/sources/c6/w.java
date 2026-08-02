package c6;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class w implements V5.v<BitmapDrawable>, V5.r {

    /* renamed from: a, reason: collision with root package name */
    private final Resources f56606a;

    /* renamed from: b, reason: collision with root package name */
    private final V5.v<Bitmap> f56607b;

    private w(@NonNull Resources resources, @NonNull V5.v<Bitmap> vVar) {
        p6.k.c(resources, "Argument must not be null");
        this.f56606a = resources;
        p6.k.c(vVar, "Argument must not be null");
        this.f56607b = vVar;
    }

    public static w c(@NonNull Resources resources, V5.v vVar) {
        if (vVar == null) {
            return null;
        }
        return new w(resources, vVar);
    }

    @Override // V5.v
    public final void a() {
        this.f56607b.a();
    }

    @Override // V5.v
    @NonNull
    public final Class<BitmapDrawable> b() {
        return BitmapDrawable.class;
    }

    @Override // V5.v
    @NonNull
    public final BitmapDrawable get() {
        return new BitmapDrawable(this.f56606a, this.f56607b.get());
    }

    @Override // V5.v
    public final int getSize() {
        return this.f56607b.getSize();
    }

    @Override // V5.r
    public final void initialize() {
        V5.v<Bitmap> vVar = this.f56607b;
        if (vVar instanceof V5.r) {
            ((V5.r) vVar).initialize();
        }
    }
}
