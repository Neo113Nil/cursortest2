package bo.app;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class le implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f25731a;

    public le(Throwable th2) {
        this.f25731a = th2;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String invoke() {
        return "Child job of SerialCoroutineScope got exception: " + this.f25731a;
    }
}
