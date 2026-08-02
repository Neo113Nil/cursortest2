package iK;

import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66164a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f66165b;

    public /* synthetic */ b(Function0 function0, int i11) {
        this.f66164a = i11;
        this.f66165b = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f66164a) {
            case 0:
                this.f66165b.invoke();
                break;
            default:
                this.f66165b.invoke();
                break;
        }
    }
}
