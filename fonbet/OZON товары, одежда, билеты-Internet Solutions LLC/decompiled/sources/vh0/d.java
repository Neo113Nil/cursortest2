package vh0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class d extends AbstractC7737t implements Function0<String> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Throwable f102940b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(Throwable th2) {
        super(0);
        this.f102940b = th2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return "filterCatching failed with " + this.f102940b;
    }
}
