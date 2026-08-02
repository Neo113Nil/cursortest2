package androidx.appcompat.widget;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c3 {

    /* renamed from: a, reason: collision with root package name */
    public int f713a;

    /* renamed from: b, reason: collision with root package name */
    public int f714b;

    /* renamed from: c, reason: collision with root package name */
    public int f715c;

    /* renamed from: d, reason: collision with root package name */
    public int f716d;

    /* renamed from: e, reason: collision with root package name */
    public int f717e;

    /* renamed from: f, reason: collision with root package name */
    public int f718f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f719g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f720h;

    public final void a(int i5, int i10) {
        this.f715c = i5;
        this.f716d = i10;
        this.f720h = true;
        if (this.f719g) {
            if (i10 != Integer.MIN_VALUE) {
                this.f713a = i10;
            }
            if (i5 != Integer.MIN_VALUE) {
                this.f714b = i5;
                return;
            }
            return;
        }
        if (i5 != Integer.MIN_VALUE) {
            this.f713a = i5;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f714b = i10;
        }
    }
}
