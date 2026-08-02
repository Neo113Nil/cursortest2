package e4;

import kotlin.Unit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final b f8588a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8589b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f8590c;

    public c(e eVar, b bVar) {
        this.f8590c = eVar;
        this.f8588a = bVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f8589b) {
            return;
        }
        this.f8589b = true;
        e eVar = this.f8590c;
        synchronized (eVar.f8599h) {
            try {
                b bVar = this.f8588a;
                int i5 = bVar.f8586h - 1;
                bVar.f8586h = i5;
                if (i5 == 0 && bVar.f8584f) {
                    eVar.C(bVar);
                }
                Unit unit = Unit.f19194a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
