package oi;

import j$.util.Objects;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class d0 extends z0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f21247c;

    /* renamed from: d, reason: collision with root package name */
    public final String f21248d;

    /* renamed from: e, reason: collision with root package name */
    public final a f21249e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f21250f;

    public d0(String str, int i5, boolean z5) {
        this.f21247c = i5;
        switch (i5) {
            case 1:
                a aVar = a.f21225b;
                Objects.requireNonNull(str, "name == null");
                this.f21248d = str;
                this.f21249e = aVar;
                this.f21250f = z5;
                break;
            case 2:
                a aVar2 = a.f21225b;
                Objects.requireNonNull(str, "name == null");
                this.f21248d = str;
                this.f21249e = aVar2;
                this.f21250f = z5;
                break;
            default:
                a aVar3 = a.f21225b;
                Objects.requireNonNull(str, "name == null");
                this.f21248d = str;
                this.f21249e = aVar3;
                this.f21250f = z5;
                break;
        }
    }

    @Override // oi.z0
    public final void a(p0 p0Var, Object obj) {
        switch (this.f21247c) {
            case 0:
                if (obj != null) {
                    this.f21249e.getClass();
                    String obj2 = obj.toString();
                    if (obj2 != null) {
                        p0Var.a(this.f21248d, obj2, this.f21250f);
                        break;
                    }
                }
                break;
            case 1:
                if (obj != null) {
                    this.f21249e.getClass();
                    String obj3 = obj.toString();
                    if (obj3 != null) {
                        p0Var.b(this.f21248d, obj3, this.f21250f);
                        break;
                    }
                }
                break;
            default:
                if (obj != null) {
                    this.f21249e.getClass();
                    String obj4 = obj.toString();
                    if (obj4 != null) {
                        p0Var.d(this.f21248d, obj4, this.f21250f);
                        break;
                    }
                }
                break;
        }
    }
}
