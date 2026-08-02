package ru.ozon.app.android.fresh.main.widgets.stickyPromoBanner.di;

import Vg.c;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction.ComposerActionWithActionHandler;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LVg/c;", "invoke", "()LVg/c;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class StickyPromoBannerComponent$Companion$create$1$1$customActionHandlersProvider$1 extends AbstractC7737t implements Function0<c> {
    final /* synthetic */ C7475g $storage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StickyPromoBannerComponent$Companion$create$1$1$customActionHandlersProvider$1(C7475g c7475g) {
        super(0);
        this.$storage = c7475g;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final c invoke() {
        return ((CustomActionHandlersComponentApi) this.$storage.getComponent(CustomActionHandlersComponentApi.class)).getCustomActionHandlersStoreFactory().create(ComposerActionWithActionHandler.class);
    }
}
