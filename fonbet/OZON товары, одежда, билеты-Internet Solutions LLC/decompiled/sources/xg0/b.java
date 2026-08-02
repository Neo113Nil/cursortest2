package xg0;

import f3.AbstractC6409a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.ozonSentryHelper.internal.ui.debugActivity.SentryHelperDebugActivity;

/* loaded from: classes3.dex */
public final class b extends AbstractC7737t implements Function0<AbstractC6409a> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ SentryHelperDebugActivity f105562b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(SentryHelperDebugActivity sentryHelperDebugActivity) {
        super(0);
        this.f105562b = sentryHelperDebugActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AbstractC6409a invoke() {
        return this.f105562b.getDefaultViewModelCreationExtras();
    }
}
