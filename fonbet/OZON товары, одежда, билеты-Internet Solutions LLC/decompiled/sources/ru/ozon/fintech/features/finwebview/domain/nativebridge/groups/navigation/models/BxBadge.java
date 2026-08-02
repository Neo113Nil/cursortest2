package ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.navigation.models;

import androidx.annotation.Keep;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/navigation/models/BxBadge;", "", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "", "item", "", "<init>", "(ZLjava/lang/String;)V", "getActive", "()Z", "getItem", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BxBadge {
    private final boolean active;

    @NotNull
    private final String item;

    public BxBadge(boolean z11, @NotNull String item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.active = z11;
        this.item = item;
    }

    public static /* synthetic */ BxBadge copy$default(BxBadge bxBadge, boolean z11, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = bxBadge.active;
        }
        if ((i11 & 2) != 0) {
            str = bxBadge.item;
        }
        return bxBadge.copy(z11, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getActive() {
        return this.active;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getItem() {
        return this.item;
    }

    @NotNull
    public final BxBadge copy(boolean active, @NotNull String item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return new BxBadge(active, item);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BxBadge)) {
            return false;
        }
        BxBadge bxBadge = (BxBadge) other;
        return this.active == bxBadge.active && Intrinsics.d(this.item, bxBadge.item);
    }

    public final boolean getActive() {
        return this.active;
    }

    @NotNull
    public final String getItem() {
        return this.item;
    }

    public int hashCode() {
        return this.item.hashCode() + (Boolean.hashCode(this.active) * 31);
    }

    @NotNull
    public String toString() {
        return "BxBadge(active=" + this.active + ", item=" + this.item + ")";
    }
}
