package Ri;

/* loaded from: classes5.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public h f10433a;

    public abstract h a();

    public synchronized h b() {
        try {
            if (this.f10433a == null) {
                this.f10433a = a();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f10433a;
    }
}
