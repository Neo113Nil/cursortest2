package ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import B0.C2454a;
import He.b;
import Je.InterfaceC3394a;
import Je.e;
import UZ.d;
import WZ.l;
import WZ.m;
import WZ.t;
import androidx.lifecycle.w0;
import h3.C6788a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.pdp.ui.configurators.ugc.data.CreateReviewResponse;
import ru.ozon.app.android.pdp.ui.configurators.ugc.rateItems.RateItemsDelegate;
import ru.ozon.app.android.pdp.utils.ComposerExtKt;
import ru.ozon.app.android.ugc.R$string;
import ru.ozon.app.android.ugc.flags.RateItemsRefreshDisabled;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.core.RateItemsV2Mapper;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.RateItemsV2VO;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.RateItemsV2ViewModel;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.model.RateItemsV2ViewState;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.model.RateItemsWidgetUiEffect;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.uikit.utils.NotificationBarHelperKt;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.uni.android.haptic.HapticToken;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.data.rating.RatingDTO;
import xe.C10720e0;
import xe.C10727i;
import z00.g;
import ze.C11115c;
import ze.h;
import ze.k;

@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 ^2\u00020\u0001:\u0001^B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010!\u001a\u00020\u001f2\u0006\u0010\u0016\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0010¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0012¢\u0006\u0004\b#\u0010$J\u0019\u0010&\u001a\u00020\u00122\b\u0010%\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b&\u0010\u0014J\u0019\u0010'\u001a\u00020\u00122\b\u0010%\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b'\u0010\u0014J\u000f\u0010(\u001a\u00020\u0012H\u0002¢\u0006\u0004\b(\u0010$J)\u0010+\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010*\u001a\u0004\u0018\u00010)H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u00100\u001a\u00020/2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020\u00122\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0012H\u0002¢\u0006\u0004\b6\u0010$J\u0015\u0010 \u001a\u0004\u0018\u00010\u0010*\u00020\u0015H\u0002¢\u0006\u0004\b \u00107J\u001b\u0010:\u001a\u0004\u0018\u00010\u0010*\b\u0012\u0004\u0012\u00020908H\u0002¢\u0006\u0004\b:\u0010;R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010<R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010=R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010>R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010?R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010@R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010AR\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020C0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001a\u0010G\u001a\b\u0012\u0004\u0012\u0002020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR \u0010M\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00100O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u001d\u0010S\u001a\b\u0012\u0004\u0012\u00020C0R8\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u001d\u0010X\u001a\b\u0012\u0004\u0012\u0002020W8\u0006¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u0018\u0010\\\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]¨\u0006_"}, d2 = {"Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2ViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/utils/AppType;", "appType", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "repository", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/core/RateItemsV2Mapper;", "mapper", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/app/android/utils/AppType;Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;Lru/ozon/app/android/ugc/widgets/rateItemsV2/core/RateItemsV2Mapper;Lru/ozon/app/android/action/v2/ActionV2Repository;LWZ/l;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "", "asyncData", "", "fetch", "(Ljava/lang/String;)V", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "onIgnoreItemAction", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)V", "", "widgetId", "", "needToShowNext", "createReviewFromRateItemsWidget", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;JZ)V", "Lru/ozon/uni/atoms/af/AtomAction;", "productId", "transformActionWithReviewUuid", "(Lru/ozon/uni/atoms/af/AtomAction;Ljava/lang/String;)Lru/ozon/uni/atoms/af/AtomAction;", "vibrateOnRateClick", "()V", "sku", "removeItem", "revertRatingSelection", "validateItems", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/CreateReviewResponse;", "response", "processCreationResultTrackingInfo", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;JLru/ozon/app/android/pdp/ui/configurators/ugc/data/CreateReviewResponse;)V", "", "error", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "createErrorNotification", "(Ljava/lang/Throwable;)Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/model/RateItemsWidgetUiEffect;", "effect", "sendEffect", "(Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/model/RateItemsWidgetUiEffect;)V", "showError", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)Ljava/lang/String;", "", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO$RateItemVO;", "firstProductSku", "(Ljava/util/List;)Ljava/lang/String;", "Lru/ozon/app/android/utils/AppType;", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/core/RateItemsV2Mapper;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "LWZ/l;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "LAe/x0;", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/model/RateItemsV2ViewState;", "_viewState", "LAe/x0;", "Lze/h;", "_effects", "Lze/h;", "LJe/a;", "actionExecutionMutex", "LJe/a;", "", "ratedItems", "Ljava/util/Map;", "", "ignoredSkus", "Ljava/util/Set;", "LAe/M0;", "viewState", "LAe/M0;", "getViewState", "()LAe/M0;", "LAe/h;", "effects", "LAe/h;", "getEffects", "()LAe/h;", "lastAsyncData", "Ljava/lang/String;", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RateItemsV2ViewModel extends w0 {

    @NotNull
    private final h<RateItemsWidgetUiEffect> _effects;

    @NotNull
    private final x0<RateItemsV2ViewState> _viewState;

    @NotNull
    private final InterfaceC3394a actionExecutionMutex;

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final AppType appType;

    @NotNull
    private final InterfaceC2395h<RateItemsWidgetUiEffect> effects;

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final Set<String> ignoredSkus;
    private String lastAsyncData;

    @NotNull
    private final RateItemsV2Mapper mapper;

    @NotNull
    private final Map<String, String> ratedItems;

    @NotNull
    private final ComposerAsyncWidgetRepository repository;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final M0<RateItemsV2ViewState> viewState;
    public static final int $stable = 8;

    public RateItemsV2ViewModel(@NotNull AppType appType, @NotNull ComposerAsyncWidgetRepository repository, @NotNull RateItemsV2Mapper mapper, @NotNull ActionV2Repository actionV2Repository, @NotNull l tokenizedAnalytics, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.appType = appType;
        this.repository = repository;
        this.mapper = mapper;
        this.actionV2Repository = actionV2Repository;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.featureChecker = featureChecker;
        x0<RateItemsV2ViewState> a11 = O0.a(RateItemsV2ViewState.Idle.INSTANCE);
        this._viewState = a11;
        C11115c a12 = k.a(-2, 6, null);
        this._effects = a12;
        this.actionExecutionMutex = e.a();
        this.ratedItems = new LinkedHashMap();
        this.ignoredSkus = new LinkedHashSet();
        this.viewState = C2399j.b(a11);
        this.effects = C2399j.H(a12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NotificationDTO createErrorNotification(Throwable error) {
        if (g.c(error)) {
            return NotificationBarHelperKt.createNetworkErrorNotificationDTO(this.appType == AppType.SELECT);
        }
        return new NotificationDTO(StringProvider.getString(R$string.reviews_failed_to_rate_notification_title), StringProvider.getString(ru.ozon.app.android.common.actionHandlers.R$string.common_try_again_android), null, null, null, null, null, null, null, NotificationDTO.Preset.NEGATIVE, 476, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String firstProductSku(List<? extends RateItemsV2VO.RateItemVO> list) {
        String str;
        Iterator<T> it = list.iterator();
        do {
            str = null;
            if (!it.hasNext()) {
                break;
            }
            RateItemsV2VO.RateItemVO rateItemVO = (RateItemsV2VO.RateItemVO) it.next();
            RateItemsV2VO.RateItemVO.RateProductItemVO rateProductItemVO = rateItemVO instanceof RateItemsV2VO.RateItemVO.RateProductItemVO ? (RateItemsV2VO.RateItemVO.RateProductItemVO) rateItemVO : null;
            if (rateProductItemVO != null) {
                str = rateProductItemVO.getSku();
            }
        } while (str == null);
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processCreationResultTrackingInfo(AtomAction.ComposerAction action, long widgetId, CreateReviewResponse response) {
        String reviewUuid;
        Map<String, TokenizedTrackingInfo> trackingInfo = action.getTrackingInfo();
        if (trackingInfo == null || response == null || (reviewUuid = response.getReviewUuid()) == null) {
            return;
        }
        t tokenizedEvent$default = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(widgetId), null, 2, null);
        final Map b11 = C2454a.b("review_uuid", reviewUuid);
        m.a(this.tokenizedAnalytics, tokenizedEvent$default, new WZ.e() { // from class: lW.c
            @Override // WZ.e
            public final WZ.g modifyParams(UZ.a aVar, WZ.g gVar) {
                WZ.g processCreationResultTrackingInfo$lambda$14;
                processCreationResultTrackingInfo$lambda$14 = RateItemsV2ViewModel.processCreationResultTrackingInfo$lambda$14(b11, (d) aVar, gVar);
                return processCreationResultTrackingInfo$lambda$14;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WZ.g processCreationResultTrackingInfo$lambda$14(Map map, UZ.a aVar, WZ.g params) {
        Intrinsics.checkNotNullParameter(aVar, "<unused var>");
        Intrinsics.checkNotNullParameter(params, "params");
        return WZ.g.a(params, map, null, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String productId(AtomAction.ComposerAction composerAction) {
        Map<String, String> params = composerAction.getParams();
        if (params != null) {
            return params.get("productId");
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void removeItem(String sku) {
        RateItemsV2ViewState value;
        RateItemsV2ViewState rateItemsV2ViewState;
        Object[] objArr;
        Object[] objArr2;
        if (sku == null) {
            return;
        }
        x0<RateItemsV2ViewState> x0Var = this._viewState;
        do {
            value = x0Var.getValue();
            rateItemsV2ViewState = value;
            if (rateItemsV2ViewState instanceof RateItemsV2ViewState.Content) {
                RateItemsV2ViewState.Content content = (RateItemsV2ViewState.Content) rateItemsV2ViewState;
                List<RateItemsV2VO.RateItemVO> items = content.getData().getItems();
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = items.iterator();
                while (true) {
                    objArr2 = 0;
                    objArr = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    RateItemsV2VO.RateItemVO rateItemVO = (RateItemsV2VO.RateItemVO) next;
                    RateItemsV2VO.RateItemVO.RateProductItemVO rateProductItemVO = rateItemVO instanceof RateItemsV2VO.RateItemVO.RateProductItemVO ? (RateItemsV2VO.RateItemVO.RateProductItemVO) rateItemVO : null;
                    if (!Intrinsics.d(rateProductItemVO != null ? rateProductItemVO.getSku() : null, sku)) {
                        arrayList.add(next);
                    }
                }
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (((RateItemsV2VO.RateItemVO) it2.next()) instanceof RateItemsV2VO.RateItemVO.RateProductItemVO) {
                            rateItemsV2ViewState = content.copy(RateItemsV2VO.copy$default(content.getData(), 0L, arrayList, null, null, null, null, null, null, 253, null));
                            break;
                        }
                    }
                }
                rateItemsV2ViewState = new RateItemsV2ViewState.Error(objArr == true ? 1 : 0, 1, objArr2 == true ? 1 : 0);
            }
        } while (!x0Var.b(value, rateItemsV2ViewState));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void revertRatingSelection(String sku) {
        RateItemsV2ViewState value;
        RateItemsV2ViewState rateItemsV2ViewState;
        if (sku == null) {
            return;
        }
        x0<RateItemsV2ViewState> x0Var = this._viewState;
        do {
            value = x0Var.getValue();
            rateItemsV2ViewState = value;
            if (rateItemsV2ViewState instanceof RateItemsV2ViewState.Content) {
                RateItemsV2ViewState.Content content = (RateItemsV2ViewState.Content) rateItemsV2ViewState;
                RateItemsV2VO data = content.getData();
                List<RateItemsV2VO.RateItemVO> items = content.getData().getItems();
                ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
                for (Object obj : items) {
                    if (obj instanceof RateItemsV2VO.RateItemVO.RateProductItemVO) {
                        RateItemsV2VO.RateItemVO.RateProductItemVO rateProductItemVO = (RateItemsV2VO.RateItemVO.RateProductItemVO) obj;
                        if (Intrinsics.d(rateProductItemVO.getSku(), sku)) {
                            obj = RateItemsV2VO.RateItemVO.RateProductItemVO.copy$default(rateProductItemVO, null, RatingDTO.copy$default(rateProductItemVO.getRating(), null, null, null, null, Float.valueOf(0.0f), null, null, 111, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 262141, null);
                        }
                    }
                    arrayList.add(obj);
                }
                rateItemsV2ViewState = content.copy(RateItemsV2VO.copy$default(data, 0L, arrayList, null, null, null, null, null, null, 253, null));
            }
        } while (!x0Var.b(value, rateItemsV2ViewState));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendEffect(RateItemsWidgetUiEffect effect) {
        this._effects.b(effect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showError() {
        this._viewState.setValue(new RateItemsV2ViewState.Error(null, 1, 0 == true ? 1 : 0));
    }

    private final void validateItems() {
        RateItemsV2ViewState value = this._viewState.getValue();
        RateItemsV2ViewState.Content content = value instanceof RateItemsV2ViewState.Content ? (RateItemsV2ViewState.Content) value : null;
        if (content == null) {
            return;
        }
        List<RateItemsV2VO.RateItemVO> items = content.getData().getItems();
        ArrayList arrayList = new ArrayList();
        for (Object obj : items) {
            RateItemsV2VO.RateItemVO rateItemVO = (RateItemsV2VO.RateItemVO) obj;
            RateItemsV2VO.RateItemVO.RateProductItemVO rateProductItemVO = rateItemVO instanceof RateItemsV2VO.RateItemVO.RateProductItemVO ? (RateItemsV2VO.RateItemVO.RateProductItemVO) rateItemVO : null;
            String sku = rateProductItemVO != null ? rateProductItemVO.getSku() : null;
            if (!C7714v.A(this.ignoredSkus, sku)) {
                if (!RateItemsDelegate.INSTANCE.isReviewed(sku != null ? kotlin.text.h.y0(sku) : null)) {
                    arrayList.add(obj);
                }
            }
        }
        if (arrayList.equals(content.getData().getItems())) {
            return;
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((RateItemsV2VO.RateItemVO) it.next()) instanceof RateItemsV2VO.RateItemVO.RateProductItemVO) {
                    this._viewState.setValue(content.copy(RateItemsV2VO.copy$default(content.getData(), 0L, arrayList, null, null, null, null, null, null, 253, null)));
                    return;
                }
            }
        }
        showError();
    }

    public final void createReviewFromRateItemsWidget(@NotNull AtomAction.ComposerAction action, long widgetId, boolean needToShowNext) {
        Intrinsics.checkNotNullParameter(action, "action");
        Map<String, String> params = action.getParams();
        String str = params != null ? params.get("productId") : null;
        RateItemsV2ViewState value = this._viewState.getValue();
        RateItemsV2ViewState.Content content = value instanceof RateItemsV2ViewState.Content ? (RateItemsV2ViewState.Content) value : null;
        if (content == null) {
            return;
        }
        List<RateItemsV2VO.RateItemVO> items = content.getData().getItems();
        ArrayList arrayList = new ArrayList();
        for (Object obj : items) {
            if (obj instanceof RateItemsV2VO.RateItemVO.RateProductItemVO) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String sku = ((RateItemsV2VO.RateItemVO.RateProductItemVO) it.next()).getSku();
            if (sku != null) {
                arrayList2.add(sku);
            }
        }
        List l02 = C7714v.l0(C7714v.l0(arrayList2, this.ratedItems.keySet()), this.ignoredSkus);
        AtomAction.ComposerAction addAdditionalParams = ComposerExtKt.addAdditionalParams(action, (Map<String, String>) U.i(new Pair("isLastProduct", String.valueOf(l02.size() == 1 && Intrinsics.d(C7714v.K(l02), str)))));
        C6788a a11 = androidx.lifecycle.x0.a(this);
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(a11, b.f10879b, null, new RateItemsV2ViewModel$createReviewFromRateItemsWidget$$inlined$executeAction$1(this, addAdditionalParams, null, str, this, action, widgetId, needToShowNext, this, str), 2);
    }

    public final void fetch(@NotNull String asyncData) {
        Intrinsics.checkNotNullParameter(asyncData, "asyncData");
        if (this.featureChecker.isEnabled(RateItemsRefreshDisabled.INSTANCE) && Intrinsics.d(asyncData, this.lastAsyncData)) {
            validateItems();
            return;
        }
        this.lastAsyncData = asyncData;
        C6788a a11 = androidx.lifecycle.x0.a(this);
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(a11, b.f10879b, null, new RateItemsV2ViewModel$fetch$1(this, asyncData, null), 2);
    }

    @NotNull
    public final InterfaceC2395h<RateItemsWidgetUiEffect> getEffects() {
        return this.effects;
    }

    @NotNull
    public final M0<RateItemsV2ViewState> getViewState() {
        return this.viewState;
    }

    public final void onIgnoreItemAction(@NotNull AtomAction.ComposerAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        C6788a a11 = androidx.lifecycle.x0.a(this);
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(a11, b.f10879b, null, new RateItemsV2ViewModel$onIgnoreItemAction$$inlined$executeAction$1(this, action, null, this, action, this), 2);
    }

    @NotNull
    public final AtomAction transformActionWithReviewUuid(@NotNull AtomAction action, @NotNull String productId) {
        String str;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(productId, "productId");
        if (!(action instanceof AtomAction.ComposerAction) || (str = this.ratedItems.get(productId)) == null) {
            return action;
        }
        AtomAction.ComposerAction composerAction = (AtomAction.ComposerAction) action;
        Map<String, String> params = composerAction.getParams();
        if (params == null) {
            params = U.c();
        }
        return AtomAction.ComposerAction.copy$default(composerAction, null, null, U.n(params, new Pair("review_uuid", str)), null, null, 27, null);
    }

    public final void vibrateOnRateClick() {
        sendEffect(new RateItemsWidgetUiEffect.Vibrate(HapticToken.MEDIUM));
    }
}
