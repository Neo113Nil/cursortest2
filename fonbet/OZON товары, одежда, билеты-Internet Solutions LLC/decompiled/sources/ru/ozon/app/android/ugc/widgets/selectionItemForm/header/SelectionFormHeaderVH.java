package ru.ozon.app.android.ugc.widgets.selectionItemForm.header;

import Ae.C2399j;
import Ae.C2408n0;
import Bq.C2668a;
import LW.c;
import Sc.InterfaceC4008j;
import Sc.o;
import UZ.a;
import WZ.e;
import WZ.g;
import WZ.l;
import WZ.m;
import WZ.t;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C;
import androidx.activity.J;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.r;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.RecyclerView;
import b20.C5521a;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import d20.AbstractC6065b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.pdp.utils.ContextExtKt;
import ru.ozon.app.android.pdp.utils.CornersConfig;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.header.SelectionFormHeaderVH;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.header.cancelSheet.SheetAdapter;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.presentation.SelectionFormViewModel;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.presentation.SingleEvent;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.presentation.ViewIntent;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.component.sheet.SheetDialog;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000³\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001O\b\u0001\u0018\u0000 g2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001gB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0010J\u000f\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0010J\u000f\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0010J\u000f\u0010\u0017\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0010J\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010 \u001a\u00020\f2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001cH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\fH\u0002¢\u0006\u0004\b\"\u0010\u0010J+\u0010%\u001a\u00020\f2\u0006\u0010$\u001a\u00020#2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001cH\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020(2\u0006\u0010$\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010+R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010,R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010-R\u001b\u00103\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001b\u00108\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00100\u001a\u0004\b6\u00107R\u001b\u0010=\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u00100\u001a\u0004\b;\u0010<R\u001b\u0010B\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u00100\u001a\u0004\b@\u0010AR\u001b\u0010G\u001a\u00020C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u00100\u001a\u0004\bE\u0010FR\u001c\u0010I\u001a\b\u0012\u0002\b\u0003\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR \u0010L\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\f0K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR \u0010N\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\f0K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010MR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u001b\u0010V\u001a\u00020R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u00100\u001a\u0004\bT\u0010UR\u001b\u0010[\u001a\u00020W8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u00100\u001a\u0004\bY\u0010ZR\u001b\u0010`\u001a\u00020\\8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u00100\u001a\u0004\b^\u0010_R\u0014\u0010b\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u001a\u0010d\u001a\u0002098\u0016X\u0096\u0004¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010<¨\u0006h"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/header/SelectionFormHeaderVH;", "Ld20/b;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/header/SelectionFormHeaderVO;", "LWZ/l;", "tokenizedAnalytics", "Ll10/i;", "container", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/SelectionFormViewModel;", "selectionFormViewModel", "<init>", "(LWZ/l;Ll10/i;Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/SelectionFormViewModel;)V", "item", "", "bind", "(Lru/ozon/app/android/ugc/widgets/selectionItemForm/header/SelectionFormHeaderVO;)V", "onWidgetCreated", "()V", "onWidgetDestroyed", "configureToolbar", "configureCollapsingToolbar", "updateSecondFloor", "clearSecondFloor", "observeSingleEvent", "handleBackSubmitOrCloseForm", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/SingleEvent$HandleSheetAction;", "event", "handleBottomSheetAction", "(Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/SingleEvent$HandleSheetAction;)V", "", "", "", "customTrackingInfo", "showCancelSheet", "(Ljava/util/Map;)V", "closeForm", "Lru/ozon/uni/atoms/af/AtomAction$SendAnalytics;", "action", "dismissSheetAndHandleClickEvent", "(Lru/ozon/uni/atoms/af/AtomAction$SendAnalytics;Ljava/util/Map;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/ViewIntent$SheetAction$ActionType;", "mapToActionType", "(Lru/ozon/uni/atoms/af/AtomAction;)Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/ViewIntent$SheetAction$ActionType;", "LWZ/l;", "Ll10/i;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/SelectionFormViewModel;", "Lcom/google/android/material/appbar/AppBarLayout;", "appBar$delegate", "LSc/j;", "getAppBar", "()Lcom/google/android/material/appbar/AppBarLayout;", "appBar", "Landroidx/appcompat/widget/Toolbar;", "toolbar$delegate", "getToolbar", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "Lcom/google/android/material/appbar/CollapsingToolbarLayout;", "collapsingToolbar$delegate", "getCollapsingToolbar", "()Lcom/google/android/material/appbar/CollapsingToolbarLayout;", "collapsingToolbar", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/header/SelectionFormHeaderFirstFloorView;", "firstFloorView$delegate", "getFirstFloorView", "()Lru/ozon/app/android/ugc/widgets/selectionItemForm/header/SelectionFormHeaderFirstFloorView;", "firstFloorView", "Lru/ozon/composer/ui/widget/i;", "secondFloorContainer$delegate", "getSecondFloorContainer", "()Lru/ozon/composer/ui/widget/i;", "secondFloorContainer", "Lb20/a;", "secondFloorViewHolder", "Lru/ozon/composer/ui/widget/k;", "Lkotlin/Function1;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "onAction", "ru/ozon/app/android/ugc/widgets/selectionItemForm/header/SelectionFormHeaderVH$onBackPressedCallback$1", "onBackPressedCallback", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/header/SelectionFormHeaderVH$onBackPressedCallback$1;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/header/cancelSheet/SheetAdapter;", "sheetAdapter$delegate", "getSheetAdapter", "()Lru/ozon/app/android/ugc/widgets/selectionItemForm/header/cancelSheet/SheetAdapter;", "sheetAdapter", "Lru/ozon/uni/android/component/sheet/SheetDialog;", "sheetDialog$delegate", "getSheetDialog", "()Lru/ozon/uni/android/component/sheet/SheetDialog;", "sheetDialog", "Landroidx/recyclerview/widget/RecyclerView;", "cancelSheetRecycler$delegate", "getCancelSheetRecycler", "()Landroidx/recyclerview/widget/RecyclerView;", "cancelSheetRecycler", "Lcom/google/android/material/appbar/AppBarLayout$f;", "appBarOffsetListener", "Lcom/google/android/material/appbar/AppBarLayout$f;", "metricView", "Lcom/google/android/material/appbar/CollapsingToolbarLayout;", "getMetricView", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SelectionFormHeaderVH extends AbstractC6065b<SelectionFormHeaderVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    /* renamed from: appBar$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j appBar;

    @NotNull
    private final AppBarLayout.f appBarOffsetListener;

    /* renamed from: cancelSheetRecycler$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j cancelSheetRecycler;

    /* renamed from: collapsingToolbar$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j collapsingToolbar;

    @NotNull
    private final i container;

    /* renamed from: firstFloorView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j firstFloorView;

    @NotNull
    private final CollapsingToolbarLayout metricView;

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    @NotNull
    private final SelectionFormHeaderVH$onBackPressedCallback$1 onBackPressedCallback;

    /* renamed from: secondFloorContainer$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j secondFloorContainer;
    private k secondFloorViewHolder;

    @NotNull
    private final SelectionFormViewModel selectionFormViewModel;

    /* renamed from: sheetAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j sheetAdapter;

    /* renamed from: sheetDialog$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j sheetDialog;

    @NotNull
    private final l tokenizedAnalytics;

    /* renamed from: toolbar$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j toolbar;
    public static final int $stable = 8;

    /* JADX WARN: Type inference failed for: r2v14, types: [ru.ozon.app.android.ugc.widgets.selectionItemForm.header.SelectionFormHeaderVH$onBackPressedCallback$1] */
    public SelectionFormHeaderVH(@NotNull l tokenizedAnalytics, @NotNull i container, @NotNull SelectionFormViewModel selectionFormViewModel) {
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(selectionFormViewModel, "selectionFormViewModel");
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.container = container;
        this.selectionFormViewModel = selectionFormViewModel;
        this.appBar = LazyUtilsKt.unsafeLazy(new SelectionFormHeaderVH$appBar$2(this));
        this.toolbar = LazyUtilsKt.unsafeLazy(new SelectionFormHeaderVH$toolbar$2(this));
        this.collapsingToolbar = LazyUtilsKt.unsafeLazy(new SelectionFormHeaderVH$collapsingToolbar$2(this));
        this.firstFloorView = LazyUtilsKt.unsafeLazy(new SelectionFormHeaderVH$firstFloorView$2(this));
        this.secondFloorContainer = LazyUtilsKt.unsafeLazy(new SelectionFormHeaderVH$secondFloorContainer$2(this));
        this.actionHandler = new ActionHandler.Builder(container, this).buildHandler();
        this.onAction = new SelectionFormHeaderVH$onAction$1(this);
        this.onBackPressedCallback = new C() { // from class: ru.ozon.app.android.ugc.widgets.selectionItemForm.header.SelectionFormHeaderVH$onBackPressedCallback$1
            {
                super(true);
            }

            @Override // androidx.activity.C
            public void handleOnBackPressed() {
                SelectionFormHeaderVH.this.handleBackSubmitOrCloseForm();
            }
        };
        this.sheetAdapter = Sc.k.b(new SelectionFormHeaderVH$sheetAdapter$2(this));
        this.sheetDialog = Sc.k.b(new SelectionFormHeaderVH$sheetDialog$2(this));
        this.cancelSheetRecycler = Sc.k.b(new SelectionFormHeaderVH$cancelSheetRecycler$2(this));
        this.appBarOffsetListener = new AppBarLayout.f() { // from class: LW.a
            @Override // com.google.android.material.appbar.AppBarLayout.a
            public final void onOffsetChanged(AppBarLayout appBarLayout, int i11) {
                SelectionFormHeaderVH.appBarOffsetListener$lambda$0(SelectionFormHeaderVH.this, appBarLayout, i11);
            }
        };
        this.metricView = getCollapsingToolbar();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void appBarOffsetListener$lambda$0(SelectionFormHeaderVH selectionFormHeaderVH, AppBarLayout appBarLayout, int i11) {
        selectionFormHeaderVH.getToolbar().setTranslationY(-i11);
    }

    private final void clearSecondFloor() {
        k kVar = this.secondFloorViewHolder;
        if (kVar != null) {
            C5521a.c(kVar, AbstractC5434v.b.DESTROYED);
        }
        this.secondFloorViewHolder = null;
        getSecondFloorContainer().b().removeAllViews();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closeForm() {
        IconButtonV3DTO backButton;
        CommonControlSettings common;
        AtomActionDTO action;
        AtomAction atomAction;
        SelectionFormHeaderVO boundData = getBoundData();
        if (boundData == null || (backButton = boundData.getBackButton()) == null || (common = backButton.getCommon()) == null || (action = common.getAction()) == null || (atomAction = AtomActionMapperKt.toAtomAction(action, null)) == null) {
            return;
        }
        this.actionHandler.invoke(atomAction);
    }

    private final void configureCollapsingToolbar() {
        CollapsingToolbarLayout collapsingToolbar = getCollapsingToolbar();
        collapsingToolbar.setClipChildren(true);
        collapsingToolbar.setClipToOutline(true);
        collapsingToolbar.setClipToPadding(true);
        Context context = collapsingToolbar.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        collapsingToolbar.setBackground(ContextExtKt.createRoundRectShape$default(context, Dimens.INSTANCE.getDPF_24(), CornersConfig.BOTTOM, UniColors.LAYER_FLOOR_1.getResId(), 0, null, 24, null));
        ViewGroup.LayoutParams layoutParams = collapsingToolbar.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.LayoutParams");
        }
        AppBarLayout.d dVar = (AppBarLayout.d) layoutParams;
        dVar.b(3);
        collapsingToolbar.setLayoutParams(dVar);
        collapsingToolbar.addView(getSecondFloorContainer().b(), 0);
        ViewExtKt.show(collapsingToolbar);
    }

    private final void configureToolbar() {
        Toolbar toolbar = getToolbar();
        toolbar.setBackground(null);
        toolbar.removeAllViews();
        toolbar.addView(getFirstFloorView(), new ViewGroup.LayoutParams(-1, -2));
        toolbar.addOnLayoutChangeListener(new c(this, 0));
        ViewExtKt.show(toolbar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureToolbar$lambda$2$lambda$1(SelectionFormHeaderVH selectionFormHeaderVH, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        ViewGroup b11 = selectionFormHeaderVH.getSecondFloorContainer().b();
        b11.setPadding(b11.getPaddingLeft(), selectionFormHeaderVH.getToolbar().getHeight(), b11.getPaddingRight(), b11.getPaddingBottom());
    }

    private final void dismissSheetAndHandleClickEvent(AtomAction.SendAnalytics action, final Map<String, ? extends Object> customTrackingInfo) {
        getSheetDialog().dismiss();
        Map<String, TokenizedTrackingInfo> trackingInfo = action.getTrackingInfo();
        if (trackingInfo != null) {
            SelectionFormHeaderVO boundData = getBoundData();
            t mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, boundData != null ? Long.valueOf(boundData.getId()) : null, null, 2, null);
            if (mapToTokenizedEvent$default != null) {
                m.a(this.tokenizedAnalytics, mapToTokenizedEvent$default, new e() { // from class: LW.d
                    @Override // WZ.e
                    public final g modifyParams(UZ.a aVar, g gVar) {
                        g dismissSheetAndHandleClickEvent$lambda$14$lambda$13;
                        dismissSheetAndHandleClickEvent$lambda$14$lambda$13 = SelectionFormHeaderVH.dismissSheetAndHandleClickEvent$lambda$14$lambda$13(customTrackingInfo, (UZ.d) aVar, gVar);
                        return dismissSheetAndHandleClickEvent$lambda$14$lambda$13;
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g dismissSheetAndHandleClickEvent$lambda$14$lambda$13(Map map, a aVar, g params) {
        Intrinsics.checkNotNullParameter(aVar, "<unused var>");
        Intrinsics.checkNotNullParameter(params, "params");
        return g.a(params, map, null, 2);
    }

    private final AppBarLayout getAppBar() {
        return (AppBarLayout) this.appBar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecyclerView getCancelSheetRecycler() {
        return (RecyclerView) this.cancelSheetRecycler.getValue();
    }

    private final CollapsingToolbarLayout getCollapsingToolbar() {
        return (CollapsingToolbarLayout) this.collapsingToolbar.getValue();
    }

    private final SelectionFormHeaderFirstFloorView getFirstFloorView() {
        return (SelectionFormHeaderFirstFloorView) this.firstFloorView.getValue();
    }

    private final ru.ozon.composer.ui.widget.i getSecondFloorContainer() {
        return (ru.ozon.composer.ui.widget.i) this.secondFloorContainer.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SheetAdapter getSheetAdapter() {
        return (SheetAdapter) this.sheetAdapter.getValue();
    }

    private final SheetDialog getSheetDialog() {
        return (SheetDialog) this.sheetDialog.getValue();
    }

    private final Toolbar getToolbar() {
        return (Toolbar) this.toolbar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleBackSubmitOrCloseForm() {
        SelectionFormHeaderVO boundData = getBoundData();
        if (boundData == null || boundData.getBackSubmit() == null) {
            closeForm();
        } else {
            this.selectionFormViewModel.onViewIntent(ViewIntent.BackPressed.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleBottomSheetAction(final SingleEvent.HandleSheetAction event) {
        SelectionItemFormDTO.BackSubmit backSubmit;
        Map<String, TokenizedTrackingInfo> closeTrackingInfo;
        ViewIntent.SheetAction.ActionType actionType = event.getActionType();
        if (actionType instanceof ViewIntent.SheetAction.ActionType.StayOnPage) {
            dismissSheetAndHandleClickEvent(((ViewIntent.SheetAction.ActionType.StayOnPage) actionType).getAction(), event.getCustomTrackingInfo());
            return;
        }
        if (actionType instanceof ViewIntent.SheetAction.ActionType.LeavePage) {
            dismissSheetAndHandleClickEvent(((ViewIntent.SheetAction.ActionType.LeavePage) actionType).getAction(), event.getCustomTrackingInfo());
            closeForm();
            return;
        }
        if (!(actionType instanceof ViewIntent.SheetAction.ActionType.Dismiss)) {
            if (!(actionType instanceof ViewIntent.SheetAction.ActionType.Other)) {
                throw new o();
            }
            this.actionHandler.invoke(((ViewIntent.SheetAction.ActionType.Other) actionType).getAction());
            return;
        }
        SelectionFormHeaderVO boundData = getBoundData();
        if (boundData == null || (backSubmit = boundData.getBackSubmit()) == null || (closeTrackingInfo = backSubmit.getCloseTrackingInfo()) == null) {
            return;
        }
        SelectionFormHeaderVO boundData2 = getBoundData();
        t mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(closeTrackingInfo, boundData2 != null ? Long.valueOf(boundData2.getId()) : null, null, 2, null);
        if (mapToTokenizedEvent$default != null) {
            m.a(this.tokenizedAnalytics, mapToTokenizedEvent$default, new e() { // from class: LW.b
                @Override // WZ.e
                public final g modifyParams(UZ.a aVar, g gVar) {
                    g handleBottomSheetAction$lambda$10$lambda$9;
                    handleBottomSheetAction$lambda$10$lambda$9 = SelectionFormHeaderVH.handleBottomSheetAction$lambda$10$lambda$9(SingleEvent.HandleSheetAction.this, (UZ.d) aVar, gVar);
                    return handleBottomSheetAction$lambda$10$lambda$9;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g handleBottomSheetAction$lambda$10$lambda$9(SingleEvent.HandleSheetAction handleSheetAction, a aVar, g params) {
        Intrinsics.checkNotNullParameter(aVar, "<unused var>");
        Intrinsics.checkNotNullParameter(params, "params");
        return g.a(params, handleSheetAction.getCustomTrackingInfo(), null, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final ViewIntent.SheetAction.ActionType mapToActionType(AtomAction action) {
        return ((action instanceof AtomAction.Dismiss) && getSheetDialog().isShowing()) ? new ViewIntent.SheetAction.ActionType.StayOnPage((AtomAction.SendAnalytics) action) : ((action instanceof AtomAction.Click) && Intrinsics.d(((AtomAction.Click) action).getId(), "dismissSelectionFormBackSubmit")) ? new ViewIntent.SheetAction.ActionType.LeavePage((AtomAction.SendAnalytics) action) : new ViewIntent.SheetAction.ActionType.Other(action);
    }

    private final void observeSingleEvent() {
        C2399j.C(new C2408n0(this.selectionFormViewModel.getSingleEvent(), new SelectionFormHeaderVH$observeSingleEvent$1(this, null)), K.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showCancelSheet(Map<String, ? extends Object> customTrackingInfo) {
        SelectionItemFormDTO.BackSubmit backSubmit;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        if (getSheetDialog().isShowing()) {
            return;
        }
        getSheetDialog().show();
        SelectionFormHeaderVO boundData = getBoundData();
        if (boundData == null || (backSubmit = boundData.getBackSubmit()) == null || (trackingInfo = backSubmit.getTrackingInfo()) == null) {
            return;
        }
        SelectionFormHeaderVO boundData2 = getBoundData();
        t mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, boundData2 != null ? Long.valueOf(boundData2.getId()) : null, null, 2, null);
        if (mapToTokenizedEvent$default != null) {
            m.c(this.tokenizedAnalytics, mapToTokenizedEvent$default, new C2668a(customTrackingInfo, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g showCancelSheet$lambda$12$lambda$11(Map map, a aVar, g params) {
        Intrinsics.checkNotNullParameter(aVar, "<unused var>");
        Intrinsics.checkNotNullParameter(params, "params");
        return g.a(params, map, null, 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void updateSecondFloor() {
        ru.ozon.composer.ui.widget.l viewItem;
        d c11;
        List<ru.ozon.composer.ui.widget.l> list;
        Map<String, List<ru.ozon.composer.ui.widget.l>> nestedWidgets = getNestedWidgets();
        String str = null;
        ru.ozon.composer.ui.widget.l widgetViewItem = (nestedWidgets == null || (list = nestedWidgets.get("headerSecondFloor")) == null) ? null : (ru.ozon.composer.ui.widget.l) C7714v.M(list);
        if (widgetViewItem != null) {
            String a11 = widgetViewItem.c().a();
            k kVar = this.secondFloorViewHolder;
            if (kVar != null && (viewItem = kVar.getViewItem()) != null && (c11 = viewItem.c()) != null) {
                str = c11.a();
            }
            if (Intrinsics.d(a11, str)) {
                k kVar2 = this.secondFloorViewHolder;
                if (kVar2 != null) {
                    C5521a.a(kVar2, widgetViewItem, this.container.c0());
                }
                CollapsingToolbarLayout collapsingToolbar = getCollapsingToolbar();
                collapsingToolbar.setPadding(collapsingToolbar.getPaddingLeft(), collapsingToolbar.getPaddingTop(), collapsingToolbar.getPaddingRight(), this.secondFloorViewHolder != null ? 0 : Dimens.INSTANCE.getDP_4());
            }
        }
        clearSecondFloor();
        if (widgetViewItem != null) {
            this.container.d0().c(getSecondFloorContainer(), widgetViewItem);
            k<l20.c> source = this.container.d0().f(getSecondFloorContainer(), widgetViewItem.j());
            if (source != null) {
                Intrinsics.checkNotNullParameter(source, "source");
                C5521a.c(source, AbstractC5434v.b.CREATED);
                getSecondFloorContainer().b().addView(source.itemView);
                Intrinsics.checkNotNullParameter(widgetViewItem, "widgetViewItem");
                source.track(widgetViewItem);
                C5521a.a(source, widgetViewItem, this.container.c0());
                C5521a.c(source, AbstractC5434v.b.RESUMED);
                this.secondFloorViewHolder = source;
            }
        }
        CollapsingToolbarLayout collapsingToolbar2 = getCollapsingToolbar();
        collapsingToolbar2.setPadding(collapsingToolbar2.getPaddingLeft(), collapsingToolbar2.getPaddingTop(), collapsingToolbar2.getPaddingRight(), this.secondFloorViewHolder != null ? 0 : Dimens.INSTANCE.getDP_4());
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        t tokenizedEvent;
        J onBackPressedDispatcher;
        super.onWidgetCreated();
        observeSingleEvent();
        configureCollapsingToolbar();
        configureToolbar();
        getAppBar().d(this.appBarOffsetListener);
        r a11 = this.container.K().a();
        if (a11 != null && (onBackPressedDispatcher = a11.getOnBackPressedDispatcher()) != null) {
            onBackPressedDispatcher.h(this, this.onBackPressedCallback);
        }
        SelectionFormHeaderVO boundData = getBoundData();
        if (boundData != null && (tokenizedEvent = boundData.getTokenizedEvent()) != null) {
            m.c(this.tokenizedAnalytics, tokenizedEvent, null);
        }
        this.selectionFormViewModel.onViewIntent(ViewIntent.FormOpened.INSTANCE);
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        super.onWidgetDestroyed();
        clearSecondFloor();
        getAppBar().q(this.appBarOffsetListener);
        remove();
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull SelectionFormHeaderVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        getFirstFloorView().bind(item, this.onAction, new SelectionFormHeaderVH$bind$1(this));
        updateSecondFloor();
        this.container.M().l(0);
    }

    @Override // d20.AbstractC6065b
    @NotNull
    public CollapsingToolbarLayout getMetricView() {
        return this.metricView;
    }
}
