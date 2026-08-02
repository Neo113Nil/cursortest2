package vh0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
public final class f extends AbstractC7737t implements Function0<String> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Throwable f102943b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Throwable th2) {
        super(0);
        this.f102943b = th2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return "forEachCatching failed with " + this.f102943b;
    }
}
