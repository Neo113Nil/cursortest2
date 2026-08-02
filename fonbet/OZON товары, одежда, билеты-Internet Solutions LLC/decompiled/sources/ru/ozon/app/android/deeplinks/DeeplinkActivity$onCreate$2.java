package ru.ozon.app.android.deeplinks;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/deeplinks/ExternalDeeplink;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/deeplinks/ExternalDeeplink;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class DeeplinkActivity$onCreate$2 extends AbstractC7737t implements Function1<ExternalDeeplink, Unit> {
    final /* synthetic */ DeeplinkActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeeplinkActivity$onCreate$2(DeeplinkActivity deeplinkActivity) {
        super(1);
        this.this$0 = deeplinkActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ExternalDeeplink externalDeeplink) {
        invoke2(externalDeeplink);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ExternalDeeplink externalDeeplink) {
        DeeplinkActivity deeplinkActivity = this.this$0;
        Intrinsics.f(externalDeeplink);
        DeeplinkActivity.navigateByRegularFlow$default(deeplinkActivity, externalDeeplink, false, 2, null);
    }
}
