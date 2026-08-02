package ru.ozon.app.android.platform.customActionHandlers.composerActionAndRedirect.configurator;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.platform.customActionHandlers.composerActionAndRedirect.ComposerActionAndRedirectState;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/platform/customActionHandlers/composerActionAndRedirect/ComposerActionAndRedirectState;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/platform/customActionHandlers/composerActionAndRedirect/ComposerActionAndRedirectState;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class ComposerActionAndRedirectConfigurator$onComposerInitialized$2 extends AbstractC7737t implements Function1<ComposerActionAndRedirectState, Unit> {
    final /* synthetic */ ConfiguratorReferences $refs;
    final /* synthetic */ ComposerActionAndRedirectConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComposerActionAndRedirectConfigurator$onComposerInitialized$2(ComposerActionAndRedirectConfigurator composerActionAndRedirectConfigurator, ConfiguratorReferences configuratorReferences) {
        super(1);
        this.this$0 = composerActionAndRedirectConfigurator;
        this.$refs = configuratorReferences;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ComposerActionAndRedirectState composerActionAndRedirectState) {
        invoke2(composerActionAndRedirectState);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ComposerActionAndRedirectState composerActionAndRedirectState) {
        ComposerActionAndRedirectConfigurator composerActionAndRedirectConfigurator = this.this$0;
        Intrinsics.f(composerActionAndRedirectState);
        composerActionAndRedirectConfigurator.observeState(composerActionAndRedirectState, this.$refs);
    }
}
