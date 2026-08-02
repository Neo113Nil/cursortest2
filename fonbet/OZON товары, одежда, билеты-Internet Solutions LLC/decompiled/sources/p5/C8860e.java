package p5;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import n5.EnumC8444d;
import org.jetbrains.annotations.NotNull;
import p5.h;
import v5.C10239m;

/* renamed from: p5.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C8860e implements h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Drawable f80220a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C10239m f80221b;

    /* renamed from: p5.e$a */
    public static final class a implements h.a<Drawable> {
        @Override // p5.h.a
        public final h a(Object obj, C10239m c10239m) {
            return new C8860e((Drawable) obj, c10239m);
        }
    }

    public C8860e(@NotNull Drawable drawable, @NotNull C10239m c10239m) {
        this.f80220a = drawable;
        this.f80221b = c10239m;
    }

    @Override // p5.h
    public final Object a(@NotNull kotlin.coroutines.d<? super g> dVar) {
        int i11 = A5.k.f430d;
        Drawable drawable = this.f80220a;
        boolean z11 = (drawable instanceof VectorDrawable) || (drawable instanceof androidx.vectordrawable.graphics.drawable.e);
        if (z11) {
            C10239m c10239m = this.f80221b;
            drawable = new BitmapDrawable(c10239m.f().getResources(), A5.m.a(drawable, c10239m.e(), c10239m.n(), c10239m.m(), c10239m.b()));
        }
        return new f(drawable, z11, EnumC8444d.MEMORY);
    }
}
