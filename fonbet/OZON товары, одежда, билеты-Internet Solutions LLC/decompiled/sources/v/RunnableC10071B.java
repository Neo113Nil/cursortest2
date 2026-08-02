package v;

/* renamed from: v.B, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class RunnableC10071B implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f100861a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f100862b;

    public /* synthetic */ RunnableC10071B(Object obj, int i11) {
        this.f100861a = i11;
        this.f100862b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f100861a) {
            case 0:
                L.t((L) this.f100862b);
                break;
            default:
                U0.i((U0) this.f100862b);
                break;
        }
    }
}
