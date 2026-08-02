package ru.ozon.app.android.actionHandlers.ugc.updateSelectionFormMobile;

import androidx.lifecycle.w0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.actionHandlers.ugc.updateSelectionFormMobile.data.ProductPickerDTO;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0003R(\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/actionHandlers/ugc/updateSelectionFormMobile/ProductPickerViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "Lru/ozon/app/android/actionHandlers/ugc/updateSelectionFormMobile/data/ProductPickerDTO;", "productPickerDTO", "", "updateProductPickerModel", "(Lru/ozon/app/android/actionHandlers/ugc/updateSelectionFormMobile/data/ProductPickerDTO;)V", "clear", AppMeasurementSdk.ConditionalUserProperty.VALUE, "updatedProductPickerModel", "Lru/ozon/app/android/actionHandlers/ugc/updateSelectionFormMobile/data/ProductPickerDTO;", "getUpdatedProductPickerModel", "()Lru/ozon/app/android/actionHandlers/ugc/updateSelectionFormMobile/data/ProductPickerDTO;", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProductPickerViewModel extends w0 {
    private ProductPickerDTO updatedProductPickerModel;

    public final void clear() {
        this.updatedProductPickerModel = null;
    }

    public final ProductPickerDTO getUpdatedProductPickerModel() {
        return this.updatedProductPickerModel;
    }

    public final void updateProductPickerModel(@NotNull ProductPickerDTO productPickerDTO) {
        Intrinsics.checkNotNullParameter(productPickerDTO, "productPickerDTO");
        this.updatedProductPickerModel = productPickerDTO;
    }
}
