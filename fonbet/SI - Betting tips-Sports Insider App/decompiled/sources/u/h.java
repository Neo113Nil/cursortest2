package u;

import com.google.android.gms.internal.play_billing.e1;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public Object f23998a;

    /* renamed from: b, reason: collision with root package name */
    public k f23999b;

    /* renamed from: c, reason: collision with root package name */
    public m f24000c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f24001d;

    public final void a(Object obj) {
        this.f24001d = true;
        k kVar = this.f23999b;
        if (kVar == null || !kVar.f24004b.k(obj)) {
            return;
        }
        this.f23998a = null;
        this.f23999b = null;
        this.f24000c = null;
    }

    public final void b(Throwable th2) {
        this.f24001d = true;
        k kVar = this.f23999b;
        if (kVar == null || !kVar.f24004b.l(th2)) {
            return;
        }
        this.f23998a = null;
        this.f23999b = null;
        this.f24000c = null;
    }

    public final void finalize() {
        m mVar;
        k kVar = this.f23999b;
        if (kVar != null) {
            j jVar = kVar.f24004b;
            if (!jVar.isDone()) {
                jVar.l(new e1("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f23998a, 4));
            }
        }
        if (this.f24001d || (mVar = this.f24000c) == null) {
            return;
        }
        mVar.k(null);
    }
}
