package ru.ozon.app.android.cml.delivery.widgets.boxList.data.model;

import F3.G;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/boxList/data/model/SelectButtonModel;", "", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "selectButton", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getSelectButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SelectButtonModel {

    @NotNull
    private final ButtonV3DTO selectButton;

    public SelectButtonModel(@NotNull ButtonV3DTO selectButton) {
        Intrinsics.checkNotNullParameter(selectButton, "selectButton");
        this.selectButton = selectButton;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SelectButtonModel) && Intrinsics.d(this.selectButton, ((SelectButtonModel) other).selectButton);
    }

    @NotNull
    public final ButtonV3DTO getSelectButton() {
        return this.selectButton;
    }

    public int hashCode() {
        return this.selectButton.hashCode();
    }

    @NotNull
    public String toString() {
        return G.b(this.selectButton, "SelectButtonModel(selectButton=", ")");
    }
}
