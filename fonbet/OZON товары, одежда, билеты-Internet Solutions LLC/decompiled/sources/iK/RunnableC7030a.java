package iK;

import kotlin.jvm.functions.Function0;

/* renamed from: iK.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC7030a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66162a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f66163b;

    public /* synthetic */ RunnableC7030a(Function0 function0, int i11) {
        this.f66162a = i11;
        this.f66163b = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f66162a) {
            case 0:
                this.f66163b.invoke();
                break;
            default:
                this.f66163b.invoke();
                break;
        }
    }
}
