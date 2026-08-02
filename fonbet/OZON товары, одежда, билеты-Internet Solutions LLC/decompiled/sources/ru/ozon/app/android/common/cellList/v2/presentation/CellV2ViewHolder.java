package ru.ozon.app.android.common.cellList.v2.presentation;

import Sc.InterfaceC4008j;
import Vg.d;
import W10.c;
import WZ.t;
import android.content.Context;
import android.content.res.Resources;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.content.a;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.events.WidgetEventService;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.common.actionHandlers.applySorting.ApplySortingViewModel;
import ru.ozon.app.android.common.cellList.v2.data.ClientEvents;
import ru.ozon.app.android.common.cellList.v2.data.EventActions;
import ru.ozon.app.android.common.cellList.v2.presentation.CellV2VO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.cell.label.SmartLabel;
import ru.ozon.uni.android.cell.selection.radiobutton.RadioTitleSubtitleCellView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.wrappers.mainaddon.data.MainAddonViewApi;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 S2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001SB+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010$\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J!\u0010)\u001a\u00020\u00132\b\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010(\u001a\u00020\u0013H\u0002¢\u0006\u0004\b)\u0010*J\u0013\u0010,\u001a\u00020\u001a*\u00020+H\u0002¢\u0006\u0004\b,\u0010-J#\u00101\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u00022\n\u00100\u001a\u00060.j\u0002`/H\u0002¢\u0006\u0004\b1\u00102J#\u00103\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u00022\n\u00100\u001a\u00060.j\u0002`/H\u0014¢\u0006\u0004\b3\u00102J3\u0010:\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u00022\n\u00106\u001a\u000604j\u0002`52\u000e\u00109\u001a\n\u0018\u000107j\u0004\u0018\u0001`8H\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u001aH\u0016¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u001aH\u0016¢\u0006\u0004\b>\u0010=J\u000f\u0010?\u001a\u00020\u001aH\u0016¢\u0006\u0004\b?\u0010=R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010@R\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010AR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010BR\u0016\u0010C\u001a\u0004\u0018\u00010+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR.\u0010G\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130F0E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR \u0010K\u001a\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020\u001a0I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u001b\u0010R\u001a\u00020M8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q¨\u0006T"}, d2 = {"Lru/ozon/app/android/common/cellList/v2/presentation/CellV2ViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/common/cellList/v2/presentation/CellV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/common/actionHandlers/applySorting/ApplySortingViewModel;", "applySortingViewModel", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;LVg/d;Lru/ozon/app/android/common/actionHandlers/applySorting/ApplySortingViewModel;)V", "Landroid/content/res/Resources;", "resources", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "padding", "", "getDimension", "(Landroid/content/res/Resources;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;)I", "left", "top", "right", "bottom", "", "setMargins", "(IIII)V", "", "hasSeparator", "setSeparator", "(Z)V", "item", "", "corners", "setIsland", "(Lru/ozon/app/android/common/cellList/v2/presentation/CellV2VO;[F)V", "", "colorToken", "defaultColor", "getColorByDsToken", "(Ljava/lang/String;I)I", "Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "appendLocators", "(Lru/ozon/uni/atoms/v3/containers/SingleAtom;)V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "registerWidgetActionListeners", "(Lru/ozon/app/android/common/cellList/v2/presentation/CellV2VO;Ll20/d;)V", "bind", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/common/cellList/v2/presentation/CellV2VO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "onAttach", "()V", "onDetach", "onRecycle", "Lru/ozon/app/android/composer/ComposerReferences;", "LVg/d;", "Lru/ozon/app/android/common/actionHandlers/applySorting/ApplySortingViewModel;", "singleAtom", "Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "", "Lkotlin/Pair;", "originalVerticalPaddingByCell", "Ljava/util/Map;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/account/events/WidgetEventService;", "widgetEventService$delegate", "LSc/j;", "getWidgetEventService", "()Lru/ozon/app/android/account/events/WidgetEventService;", "widgetEventService", "Companion", "cell-list_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CellV2ViewHolder extends k<CellV2VO> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ApplySortingViewModel applySortingViewModel;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private Map<View, Pair<Integer, Integer>> originalVerticalPaddingByCell;

    @NotNull
    private final ComposerReferences refs;
    private final SingleAtom singleAtom;

    /* renamed from: widgetEventService$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j widgetEventService;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/common/cellList/v2/presentation/CellV2ViewHolder$Companion;", "", "<init>", "()V", "RADIO_TITLE_LOCATOR", "", "cell-list_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CellV2ViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs, @NotNull d customActionHandlersStoreFactory, @NotNull ApplySortingViewModel applySortingViewModel) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(applySortingViewModel, "applySortingViewModel");
        this.refs = refs;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.applySortingViewModel = applySortingViewModel;
        SingleAtom singleAtom = containerView instanceof SingleAtom ? (SingleAtom) containerView : null;
        this.singleAtom = singleAtom;
        this.originalVerticalPaddingByCell = new LinkedHashMap();
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new CellV2ViewHolder$actionHandler$1(this)).buildHandler();
        this.actionHandler = buildHandler;
        this.widgetEventService = Sc.k.b(new CellV2ViewHolder$widgetEventService$2(containerView));
        if (singleAtom != null) {
            singleAtom.setOnAction(buildHandler);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        if (A10.h.a(r8) == true) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void appendLocators(SingleAtom singleAtom) {
        int childCount = singleAtom.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = singleAtom.getChildAt(i11);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            if (childAt instanceof RadioTitleSubtitleCellView) {
                ViewGroup viewGroup = (ViewGroup) childAt;
                int childCount2 = viewGroup.getChildCount();
                for (int i12 = 0; i12 < childCount2; i12++) {
                    View childAt2 = viewGroup.getChildAt(i12);
                    Intrinsics.checkNotNullExpressionValue(childAt2, "getChildAt(...)");
                    if (childAt2 instanceof SmartLabel) {
                        SmartLabel smartLabel = (SmartLabel) childAt2;
                        CharSequence text = smartLabel.getText();
                        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
                        if (text.length() > 0) {
                            ViewParent parent = singleAtom.getParent();
                            RecyclerView recyclerView = parent instanceof RecyclerView ? (RecyclerView) parent : null;
                            int i13 = recyclerView != null ? 1 : 0;
                            smartLabel.setContentDescription("radioTitleSubtitleCell.title" + (getAdapterPosition() - i13));
                        }
                    }
                }
            }
        }
    }

    private final int getColorByDsToken(String colorToken, int defaultColor) {
        Integer mapColor = StyleParser.INSTANCE.mapColor(getContext(), colorToken);
        Context context = getContext();
        if (mapColor != null) {
            defaultColor = mapColor.intValue();
        }
        return a.getColor(context, defaultColor);
    }

    private final int getDimension(Resources resources, CommonCellSettings.LayoutPadding padding) {
        return (int) resources.getDimension(padding.getCellLayoutPadding());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WidgetEventService getWidgetEventService() {
        return (WidgetEventService) this.widgetEventService.getValue();
    }

    private final void registerWidgetActionListeners(final CellV2VO item, final l20.d info) {
        AbstractC5434v lifecycle;
        ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
        if (c11 == null || (lifecycle = c11.getLifecycle()) == null) {
            return;
        }
        lifecycle.a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.common.cellList.v2.presentation.CellV2ViewHolder$registerWidgetActionListeners$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(J owner) {
                l viewItem;
                l20.d c12;
                String d11;
                WidgetEventService widgetEventService;
                Intrinsics.checkNotNullParameter(owner, "owner");
                super.onDestroy(owner);
                if (CellV2VO.this.getEventActions() == null || (viewItem = this.getViewItem()) == null || (c12 = viewItem.c()) == null || (d11 = c12.d()) == null) {
                    return;
                }
                widgetEventService = this.getWidgetEventService();
                widgetEventService.unregisterAction(d11);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStart(J owner) {
                List<ClientEvents> clientEvents;
                WidgetEventService widgetEventService;
                Intrinsics.checkNotNullParameter(owner, "owner");
                super.onStart(owner);
                EventActions eventActions = CellV2VO.this.getEventActions();
                if (eventActions == null || (clientEvents = eventActions.getClientEvents()) == null) {
                    return;
                }
                CellV2ViewHolder cellV2ViewHolder = this;
                l20.d dVar = info;
                for (ClientEvents clientEvents2 : clientEvents) {
                    widgetEventService = cellV2ViewHolder.getWidgetEventService();
                    widgetEventService.registerAction(clientEvents2.getEventKey(), dVar.d(), new CellV2ViewHolder$registerWidgetActionListeners$1$onStart$1$1(cellV2ViewHolder, clientEvents2));
                }
            }
        });
    }

    private final void setIsland(CellV2VO item, float[] corners) {
        Iterable<View> children;
        CellDTO.Settings settings;
        CornerRadius cornerRadius;
        CellDTO.Settings settings2;
        int colorByDsToken = getColorByDsToken(item.getIslandColor(), R$color.transparent);
        int colorByDsToken2 = getColorByDsToken(item.getBackgroundColor(), UniColors.LAYER_FLOOR_1.getResId());
        SingleAtom singleAtom = this.singleAtom;
        if (singleAtom != null) {
            singleAtom.setBackgroundColor(colorByDsToken2);
        }
        SingleAtom singleAtom2 = this.singleAtom;
        if (singleAtom2 == null || (children = ViewGroupExtKt.children(singleAtom2)) == null) {
            return;
        }
        for (View view : children) {
            Map<View, Pair<Integer, Integer>> map = this.originalVerticalPaddingByCell;
            Pair<Integer, Integer> pair = map.get(view);
            if (pair == null) {
                Pair<Integer, Integer> pair2 = new Pair<>(Integer.valueOf(view.getPaddingTop()), Integer.valueOf(view.getPaddingBottom()));
                map.put(view, pair2);
                pair = pair2;
            }
            Pair<Integer, Integer> pair3 = pair;
            view.setPadding(getDimension(getResources(), item.getLeftPadding()), item.getLayoutModel().getPaddingTop() + pair3.a().intValue(), getDimension(getResources(), item.getRightPadding()), item.getLayoutModel().getPaddingBottom() + pair3.b().intValue());
            AtomDTO cell = item.getCell();
            String str = null;
            CellDTO cellDTO = cell instanceof CellDTO ? (CellDTO) cell : null;
            if (cellDTO != null && (settings2 = cellDTO.getSettings()) != null) {
                str = settings2.getBackgroundColor();
            }
            int colorByDsToken3 = getColorByDsToken(str, R$color.transparent);
            float[] fArr = new float[8];
            for (int i11 = 0; i11 < 8; i11++) {
                fArr[i11] = UiExtKt.toPxF((cellDTO == null || (settings = cellDTO.getSettings()) == null || (cornerRadius = settings.getCornerRadius()) == null) ? 0 : cornerRadius.getPx());
            }
            view.setClipToOutline(true);
            view.setBackground(new CellV2Drawable(colorByDsToken, colorByDsToken3, corners, fArr, item.getLayoutModel().getPaddingTop(), item.getLayoutModel().getPaddingBottom()));
        }
    }

    private final void setMargins(int left, int top, int right, int bottom) {
        SingleAtom singleAtom = this.singleAtom;
        if (singleAtom != null) {
            singleAtom.setPadding(left, top, right, bottom);
        }
    }

    private final void setSeparator(boolean hasSeparator) {
        SingleAtom singleAtom = this.singleAtom;
        KeyEvent.Callback childAt = singleAtom != null ? singleAtom.getChildAt(0) : null;
        if (childAt instanceof MainAddonViewApi) {
            ((MainAddonViewApi) childAt).setHasSeparator(hasSeparator);
        } else if (childAt instanceof CellView) {
            ((CellView) childAt).setHasSeparator(hasSeparator);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        SingleAtom singleAtom = this.singleAtom;
        if (singleAtom != null) {
            appendLocators(singleAtom);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        this.applySortingViewModel.cancelApplySorting();
    }

    @Override // jk0.j
    public void onRecycle() {
        this.originalVerticalPaddingByCell.clear();
        super.onRecycle();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull CellV2VO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        SingleAtom singleAtom = this.singleAtom;
        if (singleAtom != null) {
            singleAtom.bind(item.getCell(), true);
        }
        CellV2VO.LayoutModel layoutModel = item.getLayoutModel();
        setMargins(getDimension(getResources(), item.getLeftMargin()), getDimension(getResources(), layoutModel.getTopMargin()), getDimension(getResources(), item.getRightMargin()), getDimension(getResources(), layoutModel.getBottomMargin()));
        setIsland(item, new float[]{layoutModel.getTopCornerRadius(), layoutModel.getTopCornerRadius(), layoutModel.getTopCornerRadius(), layoutModel.getTopCornerRadius(), layoutModel.getBottomCornerRadius(), layoutModel.getBottomCornerRadius(), layoutModel.getBottomCornerRadius(), layoutModel.getBottomCornerRadius()});
        setSeparator(layoutModel.getHasSeparator());
        registerWidgetActionListeners(item, info);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull CellV2VO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.refs.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }
}
