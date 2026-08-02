package bo.app;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class g1 implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f25468a;

    public g1(Throwable th2) {
        this.f25468a = th2;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String invoke() {
        return "Child job of BrazeCoroutineScope got exception: " + this.f25468a;
    }
}
