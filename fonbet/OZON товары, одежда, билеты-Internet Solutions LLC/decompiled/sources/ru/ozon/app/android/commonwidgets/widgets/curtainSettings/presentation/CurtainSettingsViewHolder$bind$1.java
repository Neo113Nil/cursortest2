package ru.ozon.app.android.commonwidgets.widgets.curtainSettings.presentation;

import WZ.l;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.uni.android.component.sheet.SheetDialog;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lru/ozon/uni/android/component/sheet/SheetDialog;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class CurtainSettingsViewHolder$bind$1 extends AbstractC7737t implements Function1<SheetDialog, Unit> {
    final /* synthetic */ CurtainSettingsVO $item;
    final /* synthetic */ CurtainSettingsViewHolder this$0;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Lkotlin/Unit;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.commonwidgets.widgets.curtainSettings.presentation.CurtainSettingsViewHolder$bind$1$4, reason: invalid class name */
    static final class AnonymousClass4 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ CurtainSettingsVO $item;
        final /* synthetic */ CurtainSettingsViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(CurtainSettingsVO curtainSettingsVO, CurtainSettingsViewHolder curtainSettingsViewHolder) {
            super(0);
            this.$item = curtainSettingsVO;
            this.this$0 = curtainSettingsViewHolder;
        }

        /* JADX WARN: Code restructure failed: missing block: B:3:0x0008, code lost:
        
            r1 = r4.this$0.actionHandler;
         */
        @Override // kotlin.jvm.functions.Function0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Unit invoke() {
            l lVar;
            Function1 function1;
            AtomAction onCloseAction = this.$item.getOnCloseAction();
            if (onCloseAction != null && function1 != null) {
                function1.invoke(onCloseAction);
            }
            t trackingInfo = this.$item.getTrackingInfo();
            if (trackingInfo == null) {
                return null;
            }
            lVar = this.this$0.tokenizedAnalytics;
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(lVar, trackingInfo, null, 2, null);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CurtainSettingsViewHolder$bind$1(CurtainSettingsVO curtainSettingsVO, CurtainSettingsViewHolder curtainSettingsViewHolder) {
        super(1);
        this.$item = curtainSettingsVO;
        this.this$0 = curtainSettingsViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SheetDialog sheetDialog) {
        invoke2(sheetDialog);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(SheetDialog configureSheet) {
        Function1<AtomAction, Unit> function1;
        Intrinsics.checkNotNullParameter(configureSheet, "$this$configureSheet");
        configureSheet.setShowHandle(this.$item.getShowHandle());
        configureSheet.setBackgroundColor(this.$item.getContainerBackgroundColor());
        configureSheet.setScrollableContent(this.$item.getScrollableContent());
        configureSheet.setShowCloseButton(this.$item.getShowCloseButton());
        String closeButtonBgColor = this.$item.getCloseButtonBgColor();
        if (closeButtonBgColor != null) {
            configureSheet.setCloseButtonBgColor(closeButtonBgColor);
        }
        String closeButtonIconColor = this.$item.getCloseButtonIconColor();
        if (closeButtonIconColor != null) {
            configureSheet.setCloseButtonIconColor(closeButtonIconColor);
        }
        configureSheet.setCancelable(this.$item.getCancelable());
        CurtainSettingsViewHolder curtainSettingsViewHolder = this.this$0;
        if (this.$item.getOnCloseAction() != null) {
            CurtainSettingsViewHolder curtainSettingsViewHolder2 = this.this$0;
            function1 = new ActionHandler.Builder(curtainSettingsViewHolder2.getContainer(), curtainSettingsViewHolder2).customActionHandlers(new CurtainSettingsViewHolder$bind$1$3$1(curtainSettingsViewHolder2)).buildHandler();
        } else {
            function1 = null;
        }
        curtainSettingsViewHolder.actionHandler = function1;
        configureSheet.setOnDismiss(new AnonymousClass4(this.$item, this.this$0));
    }
}
