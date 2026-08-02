package j7;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.facebook.imagepipeline.animated.impl.d;
import e7.InterfaceC4184b;
import e7.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import v7.InterfaceC6646a;

/* renamed from: j7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5097b implements c {

    /* renamed from: f, reason: collision with root package name */
    public static final a f53810f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final Class f53811g = C5097b.class;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4184b f53812a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC6646a f53813b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f53814c;

    /* renamed from: d, reason: collision with root package name */
    public d f53815d;

    /* renamed from: e, reason: collision with root package name */
    public final d.b f53816e;

    /* renamed from: j7.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: j7.b$b, reason: collision with other inner class name */
    public static final class C0778b implements d.b {
        public C0778b() {
        }

        @Override // com.facebook.imagepipeline.animated.impl.d.b
        public void a(int i10, Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        }

        @Override // com.facebook.imagepipeline.animated.impl.d.b
        public H6.a b(int i10) {
            return C5097b.this.f53812a.e(i10);
        }
    }

    public C5097b(InterfaceC4184b bitmapFrameCache, InterfaceC6646a animatedDrawableBackend, boolean z10) {
        Intrinsics.checkNotNullParameter(bitmapFrameCache, "bitmapFrameCache");
        Intrinsics.checkNotNullParameter(animatedDrawableBackend, "animatedDrawableBackend");
        this.f53812a = bitmapFrameCache;
        this.f53813b = animatedDrawableBackend;
        this.f53814c = z10;
        C0778b c0778b = new C0778b();
        this.f53816e = c0778b;
        this.f53815d = new d(this.f53813b, z10, c0778b);
    }

    @Override // e7.c
    public boolean a(int i10, Bitmap targetBitmap) {
        Intrinsics.checkNotNullParameter(targetBitmap, "targetBitmap");
        try {
            this.f53815d.h(i10, targetBitmap);
            return true;
        } catch (IllegalStateException e10) {
            E6.a.l(f53811g, e10, "Rendering of frame unsuccessful. Frame number: %d", Integer.valueOf(i10));
            return false;
        }
    }

    @Override // e7.c
    public int d() {
        return this.f53813b.getHeight();
    }

    @Override // e7.c
    public void e(Rect rect) {
        InterfaceC6646a f10 = this.f53813b.f(rect);
        Intrinsics.checkNotNullExpressionValue(f10, "forNewBounds(...)");
        if (f10 != this.f53813b) {
            this.f53813b = f10;
            this.f53815d = new d(f10, this.f53814c, this.f53816e);
        }
    }

    @Override // e7.c
    public int f() {
        return this.f53813b.getWidth();
    }
}
