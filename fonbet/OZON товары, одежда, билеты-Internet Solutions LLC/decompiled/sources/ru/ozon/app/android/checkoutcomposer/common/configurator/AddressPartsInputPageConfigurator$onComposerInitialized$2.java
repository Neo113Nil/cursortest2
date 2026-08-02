package ru.ozon.app.android.checkoutcomposer.common.configurator;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class AddressPartsInputPageConfigurator$onComposerInitialized$2 extends AbstractC7737t implements Function1<AtomAction.Click, Unit> {
    final /* synthetic */ ConfiguratorReferences $refs;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroid/content/Intent;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.checkoutcomposer.common.configurator.AddressPartsInputPageConfigurator$onComposerInitialized$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<Intent, Unit> {
        final /* synthetic */ AtomAction.Click $action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AtomAction.Click click) {
            super(1);
            this.$action = click;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Intent intent) {
            invoke2(intent);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Intent sendResultToTargetFragment) {
            Intrinsics.checkNotNullParameter(sendResultToTargetFragment, "$this$sendResultToTargetFragment");
            sendResultToTargetFragment.putExtra("createOrder", true);
            String id2 = this.$action.getId();
            if (id2 == null) {
                id2 = this.$action.getLink();
            }
            sendResultToTargetFragment.putExtra("orderId", id2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressPartsInputPageConfigurator$onComposerInitialized$2(ConfiguratorReferences configuratorReferences) {
        super(1);
        this.$refs = configuratorReferences;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.Click click) {
        invoke2(click);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.Click action) {
        Intrinsics.checkNotNullParameter(action, "action");
        ComposerExtKt.sendResultToTargetFragment(this.$refs.getOwnerContainer(), 1442, new AnonymousClass1(action));
    }
}
