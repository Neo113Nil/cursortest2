package fM;

import kotlin.jvm.functions.Function0;

/* renamed from: fM.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC6479a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f63020a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f63021b;

    public /* synthetic */ RunnableC6479a(Function0 function0, int i11) {
        this.f63020a = i11;
        this.f63021b = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f63020a) {
            case 0:
                this.f63021b.invoke();
                break;
            default:
                this.f63021b.invoke();
                break;
        }
    }
}
