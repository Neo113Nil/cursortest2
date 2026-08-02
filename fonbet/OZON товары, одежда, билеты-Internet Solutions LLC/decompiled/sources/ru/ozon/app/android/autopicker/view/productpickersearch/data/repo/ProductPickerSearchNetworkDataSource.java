package ru.ozon.app.android.autopicker.view.productpickersearch.data.repo;

import AJ.d;
import Bc.r;
import DJ.e;
import Mc.a;
import Nc.C3667a;
import io.reactivex.y;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.autopicker.view.productpickersearch.data.ProductPickerSearchApi;
import ru.ozon.app.android.autopicker.view.productpickersearch.data.ProductPickerSearchDTO;
import ru.ozon.app.android.autopicker.view.productpickersearch.data.ProductPickerSearchMapper;
import ru.ozon.app.android.autopicker.view.productpickersearch.data.ProductPickerV1Body;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ButtonAnalyticsData;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchVO;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 =2\u00020\u0001:\u0001=B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\f\u001a\u0004\u0018\u00010\u000b2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J=\u0010\u0017\u001a\"\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014j\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0018\u0001`\u00162\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0012\u001a\u00020\u00192\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u0012\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ3\u0010\"\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0001 !*\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0001\u0018\u00010 0 0\u001f¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u0019¢\u0006\u0004\b$\u0010%J\u001b\u0010&\u001a\u0010\u0012\f\u0012\n !*\u0004\u0018\u00010\u00150\u00150\u001f¢\u0006\u0004\b&\u0010#J\u001b\u0010(\u001a\u0010\u0012\f\u0012\n !*\u0004\u0018\u00010'0'0\u001f¢\u0006\u0004\b(\u0010#J\u000f\u0010)\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b+\u0010*J%\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010,2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010/R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00100R\u0018\u00101\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00103\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00102R\u0018\u00104\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R:\u0010\"\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0001 !*\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0001\u0018\u00010 0 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u00106R\"\u0010&\u001a\u0010\u0012\f\u0012\n !*\u0004\u0018\u00010\u00150\u00150\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u00106R\"\u0010(\u001a\u0010\u0012\f\u0012\n !*\u0004\u0018\u00010'0'0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u00106R\"\u00108\u001a\u0002078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b8\u0010:\"\u0004\b;\u0010<¨\u0006>"}, d2 = {"Lru/ozon/app/android/autopicker/view/productpickersearch/data/repo/ProductPickerSearchNetworkDataSource;", "", "Lru/ozon/app/android/autopicker/view/productpickersearch/data/ProductPickerSearchApi;", "api", "Lru/ozon/app/android/autopicker/view/productpickersearch/data/ProductPickerSearchMapper;", "mapper", "<init>", "(Lru/ozon/app/android/autopicker/view/productpickersearch/data/ProductPickerSearchApi;Lru/ozon/app/android/autopicker/view/productpickersearch/data/ProductPickerSearchMapper;)V", "", "Lru/ozon/app/android/autopicker/view/productpickersearch/data/repo/ProductPickerSearchSelectedItem;", "selectedItems", "Lru/ozon/app/android/autopicker/view/productpickersearch/data/ProductPickerV1Body;", "getProductPickerV1Body", "(Ljava/util/List;)Lru/ozon/app/android/autopicker/view/productpickersearch/data/ProductPickerV1Body;", "getProductPickerV1BodyFromData", "()Lru/ozon/app/android/autopicker/view/productpickersearch/data/ProductPickerV1Body;", "Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchVO;", "vo", "updateParams", "(Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchVO;)Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchVO;", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "prepareParams", "(Ljava/util/List;)Ljava/util/HashMap;", "", "(Ljava/util/List;)V", "Lru/ozon/app/android/autopicker/view/productpickersearch/data/repo/ProductPickerSearchInitialNetworkData;", "data", "setInitialNetworkData", "(Lru/ozon/app/android/autopicker/view/productpickersearch/data/repo/ProductPickerSearchInitialNetworkData;)V", "LNc/a;", "", "kotlin.jvm.PlatformType", "paramsSubject", "()LNc/a;", "trackPageView", "()V", "pageViewSubject", "Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ButtonAnalyticsData;", "buttonClickSubject", "getTrackingInfoId", "()Ljava/lang/String;", "getActionType", "Lio/reactivex/y;", "retrieveData", "(Ljava/util/List;)Lio/reactivex/y;", "Lru/ozon/app/android/autopicker/view/productpickersearch/data/ProductPickerSearchApi;", "Lru/ozon/app/android/autopicker/view/productpickersearch/data/ProductPickerSearchMapper;", "nextStep", "Ljava/lang/String;", "trackingInfoId", "pickerSearchInitialNetworkData", "Lru/ozon/app/android/autopicker/view/productpickersearch/data/repo/ProductPickerSearchInitialNetworkData;", "LNc/a;", "", "isFirstLoading", "Z", "()Z", "setFirstLoading", "(Z)V", "Companion", "autopicker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProductPickerSearchNetworkDataSource {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final ProductPickerSearchApi api;

    @NotNull
    private final C3667a<ButtonAnalyticsData> buttonClickSubject;
    private boolean isFirstLoading;

    @NotNull
    private final ProductPickerSearchMapper mapper;
    private String nextStep;

    @NotNull
    private final C3667a<String> pageViewSubject;

    @NotNull
    private final C3667a<Map<String, Object>> paramsSubject;
    private ProductPickerSearchInitialNetworkData pickerSearchInitialNetworkData;
    private String trackingInfoId;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/autopicker/view/productpickersearch/data/repo/ProductPickerSearchNetworkDataSource$Companion;", "", "<init>", "()V", "SEPARATOR_FOR_VALUE", "", "SEPARATOR_FOR_TITLE", "SUBTITLE_KEY_SUFFIX", "autopicker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ProductPickerSearchNetworkDataSource(@NotNull ProductPickerSearchApi api, @NotNull ProductPickerSearchMapper mapper) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.api = api;
        this.mapper = mapper;
        this.nextStep = "";
        C3667a<Map<String, Object>> d11 = C3667a.d();
        Intrinsics.checkNotNullExpressionValue(d11, "create(...)");
        this.paramsSubject = d11;
        C3667a<String> d12 = C3667a.d();
        Intrinsics.checkNotNullExpressionValue(d12, "create(...)");
        this.pageViewSubject = d12;
        C3667a<ButtonAnalyticsData> d13 = C3667a.d();
        Intrinsics.checkNotNullExpressionValue(d13, "create(...)");
        this.buttonClickSubject = d13;
        this.isFirstLoading = true;
    }

    private final ProductPickerV1Body getProductPickerV1Body(List<ProductPickerSearchSelectedItem> selectedItems) {
        String currentStep;
        HashMap<String, String> params;
        ProductPickerSearchInitialNetworkData productPickerSearchInitialNetworkData = this.pickerSearchInitialNetworkData;
        if (productPickerSearchInitialNetworkData == null) {
            return null;
        }
        String actionType = productPickerSearchInitialNetworkData.getActionType();
        String str = this.nextStep;
        if (str == null || str.length() == 0) {
            currentStep = productPickerSearchInitialNetworkData.getCurrentStep();
        } else {
            currentStep = this.nextStep;
            Intrinsics.f(currentStep);
        }
        List<ProductPickerSearchSelectedItem> list = selectedItems;
        if (list == null || list.isEmpty()) {
            params = productPickerSearchInitialNetworkData.getParams();
            params.remove(productPickerSearchInitialNetworkData.getCurrentStep());
            params.remove(productPickerSearchInitialNetworkData.getCurrentStep() + "_sub");
        } else {
            params = prepareParams(selectedItems);
            if (params == null) {
                return null;
            }
        }
        return new ProductPickerV1Body(actionType, currentStep, params);
    }

    private final ProductPickerV1Body getProductPickerV1BodyFromData() {
        String currentStep;
        ProductPickerSearchInitialNetworkData productPickerSearchInitialNetworkData = this.pickerSearchInitialNetworkData;
        if (productPickerSearchInitialNetworkData == null) {
            return null;
        }
        String actionType = productPickerSearchInitialNetworkData.getActionType();
        String str = this.nextStep;
        if (str == null || str.length() == 0) {
            currentStep = productPickerSearchInitialNetworkData.getCurrentStep();
        } else {
            currentStep = this.nextStep;
            Intrinsics.f(currentStep);
        }
        return new ProductPickerV1Body(actionType, currentStep, productPickerSearchInitialNetworkData.getParams());
    }

    private final HashMap<String, String> prepareParams(List<ProductPickerSearchSelectedItem> selectedItems) {
        List<ProductPickerSearchSelectedItem> list = selectedItems;
        String V11 = C7714v.V(list, ";", null, null, ProductPickerSearchNetworkDataSource$prepareParams$value$1.INSTANCE, 30);
        String V12 = C7714v.V(list, ", ", null, null, ProductPickerSearchNetworkDataSource$prepareParams$title$1.INSTANCE, 30);
        ProductPickerSearchInitialNetworkData productPickerSearchInitialNetworkData = this.pickerSearchInitialNetworkData;
        if (productPickerSearchInitialNetworkData == null) {
            return null;
        }
        HashMap<String, String> params = productPickerSearchInitialNetworkData.getParams();
        params.put(productPickerSearchInitialNetworkData.getCurrentStep(), V11);
        params.put(productPickerSearchInitialNetworkData.getCurrentStep() + "_sub", V12);
        return params;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProductPickerSearchVO retrieveData$lambda$1(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (ProductPickerSearchVO) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProductPickerSearchVO retrieveData$lambda$2(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (ProductPickerSearchVO) function1.invoke(p02);
    }

    @NotNull
    public final C3667a<ButtonAnalyticsData> buttonClickSubject() {
        return this.buttonClickSubject;
    }

    public final String getActionType() {
        ProductPickerSearchInitialNetworkData productPickerSearchInitialNetworkData = this.pickerSearchInitialNetworkData;
        if (productPickerSearchInitialNetworkData != null) {
            return productPickerSearchInitialNetworkData.getActionType();
        }
        return null;
    }

    public final String getTrackingInfoId() {
        return this.trackingInfoId;
    }

    /* renamed from: isFirstLoading, reason: from getter */
    public final boolean getIsFirstLoading() {
        return this.isFirstLoading;
    }

    @NotNull
    public final C3667a<String> pageViewSubject() {
        return this.pageViewSubject;
    }

    @NotNull
    public final C3667a<Map<String, Object>> paramsSubject() {
        return this.paramsSubject;
    }

    public final y<ProductPickerSearchVO> retrieveData(List<ProductPickerSearchSelectedItem> selectedItems) {
        ProductPickerSearchInitialNetworkData productPickerSearchInitialNetworkData = this.pickerSearchInitialNetworkData;
        if (productPickerSearchInitialNetworkData == null) {
            return null;
        }
        List<ProductPickerSearchSelectedItem> list = selectedItems;
        ProductPickerV1Body productPickerV1BodyFromData = ((list == null || list.isEmpty()) && productPickerSearchInitialNetworkData.getParams().get(productPickerSearchInitialNetworkData.getCurrentStep()) != null) ? getProductPickerV1BodyFromData() : getProductPickerV1Body(selectedItems);
        if (this.nextStep == null || productPickerV1BodyFromData == null) {
            return null;
        }
        y<ProductPickerSearchDTO> tirePickerAction = this.api.tirePickerAction(productPickerV1BodyFromData);
        d dVar = new d(new ProductPickerSearchNetworkDataSource$retrieveData$1(this.mapper), 7);
        tirePickerAction.getClass();
        return new r(new r(tirePickerAction, dVar), new e(new ProductPickerSearchNetworkDataSource$retrieveData$2(this), 9)).j(a.b());
    }

    public final void setInitialNetworkData(@NotNull ProductPickerSearchInitialNetworkData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.pickerSearchInitialNetworkData = data;
    }

    public final void trackPageView() {
        ProductPickerSearchInitialNetworkData productPickerSearchInitialNetworkData = this.pickerSearchInitialNetworkData;
        if (productPickerSearchInitialNetworkData != null) {
            this.pageViewSubject.onNext(productPickerSearchInitialNetworkData.getActionType());
        }
    }

    public final void updateParams(List<ProductPickerSearchSelectedItem> selectedItems) {
        ProductPickerV1Body productPickerV1Body = getProductPickerV1Body(selectedItems);
        if (productPickerV1Body == null) {
            return;
        }
        this.paramsSubject.onNext(productPickerV1Body.toPostParams());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProductPickerSearchVO updateParams(ProductPickerSearchVO vo) {
        String currentStep;
        ProductPickerSearchInitialNetworkData productPickerSearchInitialNetworkData = this.pickerSearchInitialNetworkData;
        if (productPickerSearchInitialNetworkData == null) {
            return vo;
        }
        productPickerSearchInitialNetworkData.setParams(new HashMap<>(vo.getCurrentState().getParams()));
        this.trackingInfoId = vo.getTrackingInfoId();
        if (!Intrinsics.d(vo.getKeyName(), this.nextStep)) {
            String str = this.nextStep;
            if (str == null || str.length() == 0) {
                currentStep = productPickerSearchInitialNetworkData.getCurrentStep();
            } else {
                currentStep = this.nextStep;
                Intrinsics.f(currentStep);
            }
            productPickerSearchInitialNetworkData.setCurrentStep(currentStep);
            this.nextStep = vo.getKeyName();
        }
        this.isFirstLoading = false;
        return vo;
    }
}
