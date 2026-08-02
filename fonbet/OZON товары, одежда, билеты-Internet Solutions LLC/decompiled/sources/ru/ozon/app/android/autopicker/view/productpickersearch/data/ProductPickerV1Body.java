package ru.ozon.app.android.autopicker.view.productpickersearch.data;

import G.g;
import N3.C3660k;
import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.model.TrinityEventEntityKt;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/autopicker/view/productpickersearch/data/ProductPickerV1Body;", "", TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "", "currentStep", "params", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getActionType", "()Ljava/lang/String;", "getCurrentStep", "getParams", "()Ljava/util/Map;", "toPostParams", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "autopicker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ProductPickerV1Body {

    @NotNull
    private final String actionType;

    @NotNull
    private final String currentStep;

    @NotNull
    private final Map<String, String> params;

    public ProductPickerV1Body(@NotNull String actionType, @NotNull String currentStep, @NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(currentStep, "currentStep");
        Intrinsics.checkNotNullParameter(params, "params");
        this.actionType = actionType;
        this.currentStep = currentStep;
        this.params = params;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductPickerV1Body copy$default(ProductPickerV1Body productPickerV1Body, String str, String str2, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = productPickerV1Body.actionType;
        }
        if ((i11 & 2) != 0) {
            str2 = productPickerV1Body.currentStep;
        }
        if ((i11 & 4) != 0) {
            map = productPickerV1Body.params;
        }
        return productPickerV1Body.copy(str, str2, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getActionType() {
        return this.actionType;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getCurrentStep() {
        return this.currentStep;
    }

    @NotNull
    public final Map<String, String> component3() {
        return this.params;
    }

    @NotNull
    public final ProductPickerV1Body copy(@NotNull String actionType, @NotNull String currentStep, @NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(currentStep, "currentStep");
        Intrinsics.checkNotNullParameter(params, "params");
        return new ProductPickerV1Body(actionType, currentStep, params);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductPickerV1Body)) {
            return false;
        }
        ProductPickerV1Body productPickerV1Body = (ProductPickerV1Body) other;
        return Intrinsics.d(this.actionType, productPickerV1Body.actionType) && Intrinsics.d(this.currentStep, productPickerV1Body.currentStep) && Intrinsics.d(this.params, productPickerV1Body.params);
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
    public final Map<String, String> getParams() {
        return this.params;
    }

    public int hashCode() {
        return this.params.hashCode() + g.a(this.actionType.hashCode() * 31, 31, this.currentStep);
    }

    @NotNull
    public final Map<String, Object> toPostParams() {
        return U.j(new Pair(TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, this.actionType), new Pair("params", this.params));
    }

    @NotNull
    public String toString() {
        String str = this.actionType;
        String str2 = this.currentStep;
        return P.f(C3660k.d("ProductPickerV1Body(actionType=", str, ", currentStep=", str2, ", params="), this.params, ")");
    }
}
