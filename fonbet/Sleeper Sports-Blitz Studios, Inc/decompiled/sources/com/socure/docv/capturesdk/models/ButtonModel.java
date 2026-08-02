package com.socure.docv.capturesdk.models;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StartSessionModel.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/socure/docv/capturesdk/models/ButtonModel;", "", "primary", "Lcom/socure/docv/capturesdk/models/ButtonStyleModel;", "secondary", "(Lcom/socure/docv/capturesdk/models/ButtonStyleModel;Lcom/socure/docv/capturesdk/models/ButtonStyleModel;)V", "getPrimary", "()Lcom/socure/docv/capturesdk/models/ButtonStyleModel;", "getSecondary", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ButtonModel {
    public static final int $stable = 0;
    private final ButtonStyleModel primary;
    private final ButtonStyleModel secondary;

    public static /* synthetic */ ButtonModel copy$default(ButtonModel buttonModel, ButtonStyleModel buttonStyleModel, ButtonStyleModel buttonStyleModel2, int i, Object obj) {
        if ((i & 1) != 0) {
            buttonStyleModel = buttonModel.primary;
        }
        if ((i & 2) != 0) {
            buttonStyleModel2 = buttonModel.secondary;
        }
        return buttonModel.copy(buttonStyleModel, buttonStyleModel2);
    }

    /* renamed from: component1, reason: from getter */
    public final ButtonStyleModel getPrimary() {
        return this.primary;
    }

    /* renamed from: component2, reason: from getter */
    public final ButtonStyleModel getSecondary() {
        return this.secondary;
    }

    public final ButtonModel copy(ButtonStyleModel primary, ButtonStyleModel secondary) {
        Intrinsics.checkNotNullParameter(primary, "primary");
        Intrinsics.checkNotNullParameter(secondary, "secondary");
        return new ButtonModel(primary, secondary);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonModel)) {
            return false;
        }
        ButtonModel buttonModel = (ButtonModel) other;
        return Intrinsics.areEqual(this.primary, buttonModel.primary) && Intrinsics.areEqual(this.secondary, buttonModel.secondary);
    }

    public int hashCode() {
        return (this.primary.hashCode() * 31) + this.secondary.hashCode();
    }

    public String toString() {
        return "ButtonModel(primary=" + this.primary + ", secondary=" + this.secondary + ")";
    }

    public ButtonModel(ButtonStyleModel primary, ButtonStyleModel secondary) {
        Intrinsics.checkNotNullParameter(primary, "primary");
        Intrinsics.checkNotNullParameter(secondary, "secondary");
        this.primary = primary;
        this.secondary = secondary;
    }

    public final ButtonStyleModel getPrimary() {
        return this.primary;
    }

    public final ButtonStyleModel getSecondary() {
        return this.secondary;
    }
}
