package com.socure.docv.capturesdk.models;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StartSessionModel.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/socure/docv/capturesdk/models/ThemeModel;", "", "primary", "Lcom/socure/docv/capturesdk/models/PrimaryModel;", "(Lcom/socure/docv/capturesdk/models/PrimaryModel;)V", "getPrimary", "()Lcom/socure/docv/capturesdk/models/PrimaryModel;", "component1", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ThemeModel {
    public static final int $stable = 0;
    private final PrimaryModel primary;

    public static /* synthetic */ ThemeModel copy$default(ThemeModel themeModel, PrimaryModel primaryModel, int i, Object obj) {
        if ((i & 1) != 0) {
            primaryModel = themeModel.primary;
        }
        return themeModel.copy(primaryModel);
    }

    /* renamed from: component1, reason: from getter */
    public final PrimaryModel getPrimary() {
        return this.primary;
    }

    public final ThemeModel copy(PrimaryModel primary) {
        Intrinsics.checkNotNullParameter(primary, "primary");
        return new ThemeModel(primary);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ThemeModel) && Intrinsics.areEqual(this.primary, ((ThemeModel) other).primary);
    }

    public int hashCode() {
        return this.primary.hashCode();
    }

    public String toString() {
        return "ThemeModel(primary=" + this.primary + ")";
    }

    public ThemeModel(PrimaryModel primary) {
        Intrinsics.checkNotNullParameter(primary, "primary");
        this.primary = primary;
    }

    public final PrimaryModel getPrimary() {
        return this.primary;
    }
}
