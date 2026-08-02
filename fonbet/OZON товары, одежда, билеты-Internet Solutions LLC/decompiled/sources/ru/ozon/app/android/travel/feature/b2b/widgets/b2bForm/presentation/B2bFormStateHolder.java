package ru.ozon.app.android.travel.feature.b2b.widgets.b2bForm.presentation;

import c1.w;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.b2b.widgets.b2bForm.presentation.B2bFormVI;
import ru.ozon.app.android.travel.molecules.input.v2.CommonInputV2VO;
import ru.ozon.uni.android.ds.compose.component.input.DsInputStatus;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010R#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00160\u00118\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R%\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00118\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/presentation/B2bFormStateHolder;", "", "<init>", "()V", "", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/presentation/B2bFormVI$FormBlockVI;", "formBlockList", "", "updateFromBackend", "(Ljava/util/List;)V", "", "key", AppMeasurementSdk.ConditionalUserProperty.VALUE, "updateValue", "(Ljava/lang/String;Ljava/lang/String;)V", "clearError", "(Ljava/lang/String;)V", "Lc1/w;", "inputValues", "Lc1/w;", "getInputValues", "()Lc1/w;", "Lru/ozon/uni/android/ds/compose/component/input/DsInputStatus;", "inputStatuses", "getInputStatuses", "inputErrors", "getInputErrors", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class B2bFormStateHolder {

    @NotNull
    private final w<String, String> inputValues = new w<>();

    @NotNull
    private final w<String, DsInputStatus> inputStatuses = new w<>();

    @NotNull
    private final w<String, String> inputErrors = new w<>();

    public final void clearError(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.inputStatuses.put(key, DsInputStatus.NEUTRAL);
        this.inputErrors.put(key, null);
    }

    @NotNull
    public final w<String, String> getInputErrors() {
        return this.inputErrors;
    }

    @NotNull
    public final w<String, DsInputStatus> getInputStatuses() {
        return this.inputStatuses;
    }

    @NotNull
    public final w<String, String> getInputValues() {
        return this.inputValues;
    }

    public final void updateFromBackend(@NotNull List<B2bFormVI.FormBlockVI> formBlockList) {
        Intrinsics.checkNotNullParameter(formBlockList, "formBlockList");
        this.inputValues.clear();
        this.inputStatuses.clear();
        this.inputErrors.clear();
        int size = formBlockList.size();
        for (int i11 = 0; i11 < size; i11++) {
            Iterator it = C7714v.I(formBlockList.get(i11).getInputList()).iterator();
            while (it.hasNext()) {
                CommonInputV2VO commonInputV2VO = (CommonInputV2VO) it.next();
                if (commonInputV2VO instanceof CommonInputV2VO.TextInputV2) {
                    CommonInputV2VO.TextInputV2 textInputV2 = (CommonInputV2VO.TextInputV2) commonInputV2VO;
                    this.inputValues.put(textInputV2.getName(), textInputV2.getValue());
                    this.inputStatuses.put(textInputV2.getName(), textInputV2.getStatus());
                    this.inputErrors.put(textInputV2.getName(), textInputV2.getError());
                }
            }
        }
    }

    public final void updateValue(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.inputValues.put(key, value);
    }
}
