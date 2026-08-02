package f7;

import android.graphics.Bitmap;
import e7.InterfaceC4184b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: f7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4265c implements InterfaceC4184b {

    /* renamed from: c, reason: collision with root package name */
    public static final a f46442c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public int f46443a = -1;

    /* renamed from: b, reason: collision with root package name */
    public H6.a f46444b;

    /* renamed from: f7.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @Override // e7.InterfaceC4184b
    public void a(int i10, H6.a bitmapReference, int i11) {
        Intrinsics.checkNotNullParameter(bitmapReference, "bitmapReference");
    }

    @Override // e7.InterfaceC4184b
    public synchronized void b(int i10, H6.a bitmapReference, int i11) {
        try {
            Intrinsics.checkNotNullParameter(bitmapReference, "bitmapReference");
            if (this.f46444b != null) {
                Object z02 = bitmapReference.z0();
                H6.a aVar = this.f46444b;
                if (Intrinsics.areEqual(z02, aVar != null ? (Bitmap) aVar.z0() : null)) {
                    return;
                }
            }
            H6.a.U(this.f46444b);
            this.f46444b = H6.a.B(bitmapReference);
            this.f46443a = i10;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // e7.InterfaceC4184b
    public synchronized H6.a c(int i10) {
        return H6.a.B(this.f46444b);
    }

    @Override // e7.InterfaceC4184b
    public synchronized void clear() {
        f();
    }

    @Override // e7.InterfaceC4184b
    public synchronized boolean contains(int i10) {
        boolean z10;
        if (i10 == this.f46443a) {
            z10 = H6.a.isValid(this.f46444b);
        }
        return z10;
    }

    @Override // e7.InterfaceC4184b
    public synchronized H6.a d(int i10, int i11, int i12) {
        try {
        } finally {
            f();
        }
        return H6.a.B(this.f46444b);
    }

    @Override // e7.InterfaceC4184b
    public synchronized H6.a e(int i10) {
        return this.f46443a == i10 ? H6.a.B(this.f46444b) : null;
    }

    public final synchronized void f() {
        H6.a.U(this.f46444b);
        this.f46444b = null;
        this.f46443a = -1;
    }
}
