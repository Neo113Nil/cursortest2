package ru.ozon.app.android.autopicker.view.productpickersearch.presentation;

import androidx.lifecycle.P;
import java.util.HashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchVO;
import ru.ozon.tracker.model.TrinityEventEntityKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001JC\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\"\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002`\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0002H&¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchViewModel;", "", "", TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "currentStep", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "paramsExtra", "", "setInitialNetworkData", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)V", "Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchVO$ProductPickerSearchItem;", "item", "onLeafClicked", "(Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchVO$ProductPickerSearchItem;)V", "", "position", "onNodeClicked", "(Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchVO$ProductPickerSearchItem;I)V", "", "isButtonClick", "onRetrieveData", "(Z)V", "text", "onSearch", "(Ljava/lang/String;)V", "Landroidx/lifecycle/P;", "Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/Action;", "getActionLiveData", "()Landroidx/lifecycle/P;", "actionLiveData", "autopicker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface ProductPickerSearchViewModel {
    @NotNull
    P<Action> getActionLiveData();

    void onLeafClicked(@NotNull ProductPickerSearchVO.ProductPickerSearchItem item);

    void onNodeClicked(@NotNull ProductPickerSearchVO.ProductPickerSearchItem item, int position);

    void onRetrieveData(boolean isButtonClick);

    void onSearch(@NotNull String text);

    void setInitialNetworkData(@NotNull String actionType, @NotNull String currentStep, @NotNull HashMap<String, String> paramsExtra);
}
