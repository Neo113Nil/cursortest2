package ru.ozon.app.android.commonwidgets.actionHandlersFactory;

import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.actions.ActionHandlersFactory;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.presentation.EmptyStateV2ButtonsBaseOverlayViewHolder;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.presentation.EmptyStateV2ButtonsBaseViewHolder;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.presentation.EmptyStateV2ViewHolder;
import ru.ozon.android.composerCommonViewKit.header.presentation.HeaderViewHolder;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000fH\u0016¢\u0006\u0004\b\r\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/commonwidgets/actionHandlersFactory/ActionHandlersFactoryImpl;", "Lru/ozon/android/composerCommonViewKit/actions/ActionHandlersFactory;", "Lru/ozon/app/android/commonwidgets/actionHandlersFactory/CommonActionHandlersStore;", "customWidgetHandlersStore", "<init>", "(Lru/ozon/app/android/commonwidgets/actionHandlersFactory/CommonActionHandlersStore;)V", "Ll10/i;", "container", "Lru/ozon/composer/ui/widget/k;", "vh", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "createActionHandler", "(Ll10/i;Lru/ozon/composer/ui/widget/k;)Lkotlin/jvm/functions/Function1;", "Ld20/b;", "overlayWidgetViewHolder", "(Ll10/i;Ld20/b;)Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/commonwidgets/actionHandlersFactory/CommonActionHandlersStore;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ActionHandlersFactoryImpl implements ActionHandlersFactory {

    @NotNull
    private final CommonActionHandlersStore customWidgetHandlersStore;

    public ActionHandlersFactoryImpl(@NotNull CommonActionHandlersStore customWidgetHandlersStore) {
        Intrinsics.checkNotNullParameter(customWidgetHandlersStore, "customWidgetHandlersStore");
        this.customWidgetHandlersStore = customWidgetHandlersStore;
    }

    @Override // ru.ozon.android.composerCommonViewKit.actions.ActionHandlersFactory
    public Function1<AtomAction, Unit> createActionHandler(@NotNull i container, @NotNull k<?> vh2) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(vh2, "vh");
        ActionHandler.Builder builder = new ActionHandler.Builder(container, vh2);
        if (vh2 instanceof EmptyStateV2ButtonsBaseViewHolder) {
            return builder.customActionHandlers(new C(this) { // from class: ru.ozon.app.android.commonwidgets.actionHandlersFactory.ActionHandlersFactoryImpl$createActionHandler$1
                @Override // kotlin.jvm.internal.C, kotlin.reflect.n
                public Object get() {
                    CommonActionHandlersStore commonActionHandlersStore;
                    commonActionHandlersStore = ((ActionHandlersFactoryImpl) this.receiver).customWidgetHandlersStore;
                    return commonActionHandlersStore;
                }
            }).buildHandler();
        }
        if (vh2 instanceof HeaderViewHolder) {
            return builder.customActionHandlers(new C(this) { // from class: ru.ozon.app.android.commonwidgets.actionHandlersFactory.ActionHandlersFactoryImpl$createActionHandler$2
                @Override // kotlin.jvm.internal.C, kotlin.reflect.n
                public Object get() {
                    CommonActionHandlersStore commonActionHandlersStore;
                    commonActionHandlersStore = ((ActionHandlersFactoryImpl) this.receiver).customWidgetHandlersStore;
                    return commonActionHandlersStore;
                }
            }).buildHandler();
        }
        if (vh2 instanceof EmptyStateV2ViewHolder) {
            return builder.customActionHandlers(new C(this) { // from class: ru.ozon.app.android.commonwidgets.actionHandlersFactory.ActionHandlersFactoryImpl$createActionHandler$3
                @Override // kotlin.jvm.internal.C, kotlin.reflect.n
                public Object get() {
                    CommonActionHandlersStore commonActionHandlersStore;
                    commonActionHandlersStore = ((ActionHandlersFactoryImpl) this.receiver).customWidgetHandlersStore;
                    return commonActionHandlersStore;
                }
            }).buildHandler();
        }
        return null;
    }

    @Override // ru.ozon.android.composerCommonViewKit.actions.ActionHandlersFactory
    public Function1<AtomAction, Unit> createActionHandler(@NotNull i container, @NotNull AbstractC6065b<?> overlayWidgetViewHolder) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(overlayWidgetViewHolder, "overlayWidgetViewHolder");
        ActionHandler.Builder builder = new ActionHandler.Builder(container, overlayWidgetViewHolder);
        if (overlayWidgetViewHolder instanceof EmptyStateV2ButtonsBaseOverlayViewHolder) {
            return builder.customActionHandlers(new C(this) { // from class: ru.ozon.app.android.commonwidgets.actionHandlersFactory.ActionHandlersFactoryImpl$createActionHandler$4
                @Override // kotlin.jvm.internal.C, kotlin.reflect.n
                public Object get() {
                    CommonActionHandlersStore commonActionHandlersStore;
                    commonActionHandlersStore = ((ActionHandlersFactoryImpl) this.receiver).customWidgetHandlersStore;
                    return commonActionHandlersStore;
                }
            }).buildHandler();
        }
        return null;
    }
}
