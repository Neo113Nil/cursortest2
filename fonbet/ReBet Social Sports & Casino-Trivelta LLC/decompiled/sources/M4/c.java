package M4;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.util.l;

/* loaded from: classes2.dex */
public abstract class c implements j {

    /* renamed from: a, reason: collision with root package name */
    public final int f7465a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7466b;

    /* renamed from: c, reason: collision with root package name */
    public L4.d f7467c;

    public c() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // M4.j
    public final L4.d c() {
        return this.f7467c;
    }

    @Override // M4.j
    public final void g(L4.d dVar) {
        this.f7467c = dVar;
    }

    @Override // M4.j
    public final void h(i iVar) {
        iVar.d(this.f7465a, this.f7466b);
    }

    public c(int i10, int i11) {
        if (l.v(i10, i11)) {
            this.f7465a = i10;
            this.f7466b = i11;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i10 + " and height: " + i11);
    }

    @Override // com.bumptech.glide.manager.k
    public void a() {
    }

    @Override // com.bumptech.glide.manager.k
    public void b() {
    }

    @Override // com.bumptech.glide.manager.k
    public void d() {
    }

    @Override // M4.j
    public final void e(i iVar) {
    }

    @Override // M4.j
    public void i(Drawable drawable) {
    }

    @Override // M4.j
    public void n(Drawable drawable) {
    }
}
