package ru.ozon.app.android.pdp.widgets.selectSeller.presentation;

import FG.a;
import W10.c;
import WZ.l;
import WZ.t;
import WZ.x;
import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pdp.widgets.selectSeller.presentation.SelectSellerVH;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.SisBrandFavoriteButtonDelegateFactory;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.data.SisBrandFavoriteButton;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.presentation.SisBrandFavoriteButtonDelegate;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonsDTO;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00120\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/pdp/widgets/selectSeller/presentation/SelectSellerVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/pdp/widgets/selectSeller/presentation/SelectSellerVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/pdp/widgets/selectSeller/presentation/SelectSellerBaseView;", "containerView", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/seller/molecule/sisbrandfavorite/SisBrandFavoriteButtonDelegateFactory;", "sisBrandFavoriteButtonDelegateFactory", "<init>", "(Lru/ozon/app/android/pdp/widgets/selectSeller/presentation/SelectSellerBaseView;LWZ/l;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/seller/molecule/sisbrandfavorite/SisBrandFavoriteButtonDelegateFactory;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/pdp/widgets/selectSeller/presentation/SelectSellerVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/pdp/widgets/selectSeller/presentation/SelectSellerVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/pdp/widgets/selectSeller/presentation/SelectSellerBaseView;", "LWZ/l;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/seller/molecule/sisbrandfavorite/presentation/SisBrandFavoriteButtonDelegate;", "sisBrandFavoriteButtonDelegate", "Lru/ozon/app/android/seller/molecule/sisbrandfavorite/presentation/SisBrandFavoriteButtonDelegate;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes13.dex */
public final class SelectSellerVH extends k<SelectSellerVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final SelectSellerBaseView containerView;

    @NotNull
    private final SisBrandFavoriteButtonDelegate sisBrandFavoriteButtonDelegate;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectSellerVH(@NotNull SelectSellerBaseView containerView, @NotNull l tokenizedAnalytics, @NotNull ComposerReferences refs, @NotNull SisBrandFavoriteButtonDelegateFactory sisBrandFavoriteButtonDelegateFactory) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(sisBrandFavoriteButtonDelegateFactory, "sisBrandFavoriteButtonDelegateFactory");
        this.containerView = containerView;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
        this.sisBrandFavoriteButtonDelegate = sisBrandFavoriteButtonDelegateFactory.create(containerView.getFavoriteBtn(), this, refs);
        containerView.setOnClickListener(new a(this, 4));
        containerView.getFavoriteBtn().setOnTouchListener(new View.OnTouchListener() { // from class: LE.a
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean _init_$lambda$4;
                _init_$lambda$4 = SelectSellerVH._init_$lambda$4(SelectSellerVH.this, view, motionEvent);
                return _init_$lambda$4;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(SelectSellerVH selectSellerVH, View view) {
        AtomAction action;
        SelectSellerVO boundData = selectSellerVH.getBoundData();
        if (boundData == null || (action = boundData.getAction()) == null) {
            return;
        }
        selectSellerVH.actionHandler.invoke(action);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$4(SelectSellerVH selectSellerVH, View view, MotionEvent motionEvent) {
        SelectSellerVO boundData;
        SisBrandFavoriteButton favoriteButton;
        SisBrandFavoriteButton favoriteButton2;
        ButtonsDTO unfavoriteButton;
        CommonControlSettings common;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        SisBrandFavoriteButton favoriteButton3;
        ButtonsDTO favoriteButton4;
        CommonControlSettings common2;
        Map<String, TokenizedTrackingInfo> trackingInfo2;
        if (motionEvent.getAction() != 1 || (boundData = selectSellerVH.getBoundData()) == null || (favoriteButton = boundData.getFavoriteButton()) == null) {
            return false;
        }
        t tVar = null;
        if (favoriteButton.isFavorite()) {
            SelectSellerVO boundData2 = selectSellerVH.getBoundData();
            if (boundData2 != null && (favoriteButton3 = boundData2.getFavoriteButton()) != null && (favoriteButton4 = favoriteButton3.getFavoriteButton()) != null && (common2 = favoriteButton4.getCommon()) != null && (trackingInfo2 = common2.getTrackingInfo()) != null) {
                Long valueOf = Long.valueOf(boundData.getId());
                Intrinsics.checkNotNullParameter(trackingInfo2, "<this>");
                tVar = x.b(trackingInfo2, valueOf, null);
            }
        } else {
            SelectSellerVO boundData3 = selectSellerVH.getBoundData();
            if (boundData3 != null && (favoriteButton2 = boundData3.getFavoriteButton()) != null && (unfavoriteButton = favoriteButton2.getUnfavoriteButton()) != null && (common = unfavoriteButton.getCommon()) != null && (trackingInfo = common.getTrackingInfo()) != null) {
                Long valueOf2 = Long.valueOf(boundData.getId());
                Intrinsics.checkNotNullParameter(trackingInfo, "<this>");
                tVar = x.b(trackingInfo, valueOf2, null);
            }
        }
        if (tVar == null) {
            return false;
        }
        TokenizedAnalyticsExtKt.processClickEvents(selectSellerVH.tokenizedAnalytics, tVar);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SelectSellerVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.containerView.bind(item, this.sisBrandFavoriteButtonDelegate, this.actionHandler);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull SelectSellerVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((SelectSellerVH) item, trackingData, viewedPond);
        l lVar = this.tokenizedAnalytics;
        SelectSellerVO boundData = getBoundData();
        TokenizedAnalyticsExtKt.processViewEvents(lVar, boundData != null ? boundData.getTokenizedEvent() : null);
    }
}
