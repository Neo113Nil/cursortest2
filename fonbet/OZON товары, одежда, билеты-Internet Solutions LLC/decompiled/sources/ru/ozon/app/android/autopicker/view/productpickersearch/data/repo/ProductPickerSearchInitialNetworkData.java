package ru.ozon.app.android.autopicker.view.productpickersearch.data.repo;

import G.g;
import N3.C3660k;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.model.TrinityEventEntityKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\"\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002`\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\u0017R>\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002`\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/autopicker/view/productpickersearch/data/repo/ProductPickerSearchInitialNetworkData;", "", "", TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "currentStep", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "params", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getActionType", "getCurrentStep", "setCurrentStep", "(Ljava/lang/String;)V", "Ljava/util/HashMap;", "getParams", "()Ljava/util/HashMap;", "setParams", "(Ljava/util/HashMap;)V", "autopicker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ProductPickerSearchInitialNetworkData {

    @NotNull
    private final String actionType;

    @NotNull
    private String currentStep;

    @NotNull
    private HashMap<String, String> params;

    public ProductPickerSearchInitialNetworkData(@NotNull String actionType, @NotNull String currentStep, @NotNull HashMap<String, String> params) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(currentStep, "currentStep");
        Intrinsics.checkNotNullParameter(params, "params");
        this.actionType = actionType;
        this.currentStep = currentStep;
        this.params = params;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductPickerSearchInitialNetworkData)) {
            return false;
        }
        ProductPickerSearchInitialNetworkData productPickerSearchInitialNetworkData = (ProductPickerSearchInitialNetworkData) other;
        return Intrinsics.d(this.actionType, productPickerSearchInitialNetworkData.actionType) && Intrinsics.d(this.currentStep, productPickerSearchInitialNetworkData.currentStep) && Intrinsics.d(this.params, productPickerSearchInitialNetworkData.params);
    }

    @NotNull
    public final String getActionType() {
        return this.actionType;
    }

    @NotNull
    public final String getCurrentStep() {
        return this.currentStep;
    }

    @NotNull
    public final HashMap<String, String> getParams() {
        return this.params;
    }

    public int hashCode() {
        return this.params.hashCode() + g.a(this.actionType.hashCode() * 31, 31, this.currentStep);
    }

    public final void setCurrentStep(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.currentStep = str;
    }

    public final void setParams(@NotNull HashMap<String, String> hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "<set-?>");
        this.params = hashMap;
    }

    @NotNull
    public String toString() {
        String str = this.actionType;
        String str2 = this.currentStep;
        HashMap<String, String> hashMap = this.params;
        StringBuilder d11 = C3660k.d("ProductPickerSearchInitialNetworkData(actionType=", str, ", currentStep=", str2, ", params=");
        d11.append(hashMap);
        d11.append(")");
        return d11.toString();
    }
}
