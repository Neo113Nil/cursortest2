package p5;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import n5.EnumC8444d;
import org.jetbrains.annotations.NotNull;
import p5.h;
import v5.C10239m;

/* renamed from: p5.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C8857b implements h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Bitmap f80214a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C10239m f80215b;

    /* renamed from: p5.b$a */
    public static final class a implements h.a<Bitmap> {
        @Override // p5.h.a
        public final h a(Object obj, C10239m c10239m) {
            return new C8857b((Bitmap) obj, c10239m);
        }
    }

    public C8857b(@NotNull Bitmap bitmap, @NotNull C10239m c10239m) {
        this.f80214a = bitmap;
        this.f80215b = c10239m;
    }

    @Override // p5.h
    public final Object a(@NotNull kotlin.coroutines.d<? super g> dVar) {
        return new f(new BitmapDrawable(this.f80215b.f().getResources(), this.f80214a), false, EnumC8444d.MEMORY);
    }
}
