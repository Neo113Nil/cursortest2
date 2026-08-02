package ru.ozon.app.android.storefront.widgets.megadraw.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/storefront/widgets/megadraw/data/CountBlockDTO;", "", "backgroundColor", "", "coinsItem", "Lru/ozon/app/android/storefront/widgets/megadraw/data/CountItem;", "ticketsItem", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/storefront/widgets/megadraw/data/CountItem;Lru/ozon/app/android/storefront/widgets/megadraw/data/CountItem;)V", "getBackgroundColor", "()Ljava/lang/String;", "getCoinsItem", "()Lru/ozon/app/android/storefront/widgets/megadraw/data/CountItem;", "getTicketsItem", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CountBlockDTO {
    public static final int $stable = 0;

    @NotNull
    private final String backgroundColor;

    @NotNull
    private final CountItem coinsItem;

    @NotNull
    private final CountItem ticketsItem;

    public CountBlockDTO(@NotNull String backgroundColor, @NotNull CountItem coinsItem, @NotNull CountItem ticketsItem) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(coinsItem, "coinsItem");
        Intrinsics.checkNotNullParameter(ticketsItem, "ticketsItem");
        this.backgroundColor = backgroundColor;
        this.coinsItem = coinsItem;
        this.ticketsItem = ticketsItem;
    }

    public static /* synthetic */ CountBlockDTO copy$default(CountBlockDTO countBlockDTO, String str, CountItem countItem, CountItem countItem2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = countBlockDTO.backgroundColor;
        }
        if ((i11 & 2) != 0) {
            countItem = countBlockDTO.coinsItem;
        }
        if ((i11 & 4) != 0) {
            countItem2 = countBlockDTO.ticketsItem;
        }
        return countBlockDTO.copy(str, countItem, countItem2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final CountItem getCoinsItem() {
        return this.coinsItem;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final CountItem getTicketsItem() {
        return this.ticketsItem;
    }

    @NotNull
    public final CountBlockDTO copy(@NotNull String backgroundColor, @NotNull CountItem coinsItem, @NotNull CountItem ticketsItem) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(coinsItem, "coinsItem");
        Intrinsics.checkNotNullParameter(ticketsItem, "ticketsItem");
        return new CountBlockDTO(backgroundColor, coinsItem, ticketsItem);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CountBlockDTO)) {
            return false;
        }
        CountBlockDTO countBlockDTO = (CountBlockDTO) other;
        return Intrinsics.d(this.backgroundColor, countBlockDTO.backgroundColor) && Intrinsics.d(this.coinsItem, countBlockDTO.coinsItem) && Intrinsics.d(this.ticketsItem, countBlockDTO.ticketsItem);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final CountItem getCoinsItem() {
        return this.coinsItem;
    }

    @NotNull
    public final CountItem getTicketsItem() {
        return this.ticketsItem;
    }

    public int hashCode() {
        return this.ticketsItem.hashCode() + ((this.coinsItem.hashCode() + (this.backgroundColor.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "CountBlockDTO(backgroundColor=" + this.backgroundColor + ", coinsItem=" + this.coinsItem + ", ticketsItem=" + this.ticketsItem + ")";
    }
}
