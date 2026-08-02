package ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction;

import Tg.b;
import Wg.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.DismissAndRefreshAndScroll;
import ru.ozon.app.android.action.RefreshAndScroll;
import ru.ozon.app.android.action.WidgetActionHandlerBuilder;
import ru.ozon.app.android.action.WidgetActionHandlerKt;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u001aB!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0012*\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/platform/customActionHandlers/composerActionWithAction/ComposerActionWithSaveScrollActionHandler;", "Lru/ozon/app/android/platform/customActionHandlers/composerActionWithAction/ComposerActionWithActionHandler;", "Lru/ozon/app/android/utils/AppType;", "appType", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/app/android/utils/AppType;Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handlerRefs", "Lkotlin/Function1;", "LTg/b;", "", "createActionHandlerInternal", "(Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "LTg/b$f;", "mapScrollPosition", "(Lru/ozon/uni/atoms/data/AtomActionDTO;)LTg/b$f;", "atomAction", "mapToAtomAction", "(Lru/ozon/uni/atoms/data/AtomActionDTO;)LTg/b;", "handleAction", "(Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;LTg/b;)V", "ScrollByWidgetKey", "custom-action-handler_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ComposerActionWithSaveScrollActionHandler extends ComposerActionWithActionHandler {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/platform/customActionHandlers/composerActionWithAction/ComposerActionWithSaveScrollActionHandler$ScrollByWidgetKey;", "LTg/b$f$a;", "LWg/c;", "additionalInfo", "<init>", "(LWg/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "LWg/c;", "getAdditionalInfo", "()LWg/c;", "custom-action-handler_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    private static final /* data */ class ScrollByWidgetKey implements b.f.a<c> {

        @NotNull
        private final c additionalInfo;

        public ScrollByWidgetKey(@NotNull c additionalInfo) {
            Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
            this.additionalInfo = additionalInfo;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ScrollByWidgetKey) && Intrinsics.d(this.additionalInfo, ((ScrollByWidgetKey) other).additionalInfo);
        }

        public int hashCode() {
            return this.additionalInfo.hashCode();
        }

        @NotNull
        public String toString() {
            return "ScrollByWidgetKey(additionalInfo=" + this.additionalInfo + ")";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // Tg.b.f.a
        @NotNull
        public c getAdditionalInfo() {
            return this.additionalInfo;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AtomActionDTO.Behavior.values().length];
            try {
                iArr[AtomActionDTO.Behavior.DISMISS_REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AtomActionDTO.Behavior.BEHAVIOR_TYPE_REFRESH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerActionWithSaveScrollActionHandler(@NotNull AppType appType, @NotNull ActionV2Repository actionV2Repository, @NotNull FeatureChecker featureChecker) {
        super(appType, actionV2Repository, featureChecker);
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
    }

    private final Function1<b, Unit> createActionHandlerInternal(CustomActionHandler.HandlerReferences handlerRefs) {
        return WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerKt.WidgetActionHandlerBuilder(handlerRefs.getRefs().getContainer(), handlerRefs.getRefs().getViewModelOwnerProvider(), handlerRefs.getRefs().getComposerWidgetComponentStorage(), new ComposerActionWithSaveScrollActionHandler$createActionHandlerInternal$1(handlerRefs), (ComposerScreenConfig.BottomSheetConfig) null));
    }

    private final b.f mapScrollPosition(AtomActionDTO atomActionDTO) {
        Map<String, String> params = atomActionDTO.getParams();
        if (params != null && Intrinsics.d(params.get("scrollPosition"), "scrollByWidgetKey")) {
            return new ScrollByWidgetKey(new c(params));
        }
        return null;
    }

    @Override // ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction.ComposerActionWithActionHandler
    protected void handleAction(@NotNull CustomActionHandler.HandlerReferences handlerRefs, b atomAction) {
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        if ((atomAction instanceof DismissAndRefreshAndScroll) || (atomAction instanceof RefreshAndScroll)) {
            createActionHandlerInternal(handlerRefs).invoke(atomAction);
        } else {
            super.handleAction(handlerRefs, atomAction);
        }
    }

    @Override // ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction.ComposerActionWithActionHandler
    @NotNull
    protected b mapToAtomAction(@NotNull AtomActionDTO atomAction) {
        b.f mapScrollPosition;
        Intrinsics.checkNotNullParameter(atomAction, "atomAction");
        AtomActionDTO.Behavior behavior = atomAction.getBehavior();
        if (behavior != AtomActionDTO.Behavior.DISMISS_REFRESH && behavior != AtomActionDTO.Behavior.BEHAVIOR_TYPE_REFRESH) {
            behavior = null;
        }
        if (behavior == null || (mapScrollPosition = mapScrollPosition(atomAction)) == null) {
            return super.mapToAtomAction(atomAction);
        }
        int i11 = WhenMappings.$EnumSwitchMapping$0[atomAction.getBehavior().ordinal()];
        return i11 != 1 ? i11 != 2 ? super.mapToAtomAction(atomAction) : new RefreshAndScroll(atomAction.getId(), atomAction.getLink(), mapScrollPosition) : new DismissAndRefreshAndScroll(atomAction.getId(), atomAction.getLink(), mapScrollPosition);
    }
}
