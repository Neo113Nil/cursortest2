package xg0;

import androidx.lifecycle.A0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.ozonSentryHelper.internal.ui.debugActivity.SentryHelperDebugActivity;

/* renamed from: xg0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10773a extends AbstractC7737t implements Function0<A0> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ SentryHelperDebugActivity f105561b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10773a(SentryHelperDebugActivity sentryHelperDebugActivity) {
        super(0);
        this.f105561b = sentryHelperDebugActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final A0 invoke() {
        return this.f105561b.getViewModelStore();
    }
}
