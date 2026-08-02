package ru.ozon.app.android.account.orders.shipmentwidget.v2.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cscore.padding.HorizontalPadding;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/account/orders/shipmentwidget/v2/data/AtomDTOHolder;", "", "atom", "Lru/ozon/uni/atoms/data/AtomDTO;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "horizontalPadding", "Lru/ozon/app/android/cscore/padding/HorizontalPadding;", "<init>", "(Lru/ozon/uni/atoms/data/AtomDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Lru/ozon/app/android/cscore/padding/HorizontalPadding;)V", "getAtom", "()Lru/ozon/uni/atoms/data/AtomDTO;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getHorizontalPadding", "()Lru/ozon/app/android/cscore/padding/HorizontalPadding;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AtomDTOHolder {
    public static final int $stable = HorizontalPadding.$stable | AtomDTO.$stable;

    @NotNull
    private final AtomDTO atom;
    private final CommonControlSettings common;

    @NotNull
    private final HorizontalPadding horizontalPadding;

    public AtomDTOHolder(@NotNull AtomDTO atom, CommonControlSettings commonControlSettings, @NotNull HorizontalPadding horizontalPadding) {
        Intrinsics.checkNotNullParameter(atom, "atom");
        Intrinsics.checkNotNullParameter(horizontalPadding, "horizontalPadding");
        this.atom = atom;
        this.common = commonControlSettings;
        this.horizontalPadding = horizontalPadding;
    }

    public static /* synthetic */ AtomDTOHolder copy$default(AtomDTOHolder atomDTOHolder, AtomDTO atomDTO, CommonControlSettings commonControlSettings, HorizontalPadding horizontalPadding, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            atomDTO = atomDTOHolder.atom;
        }
        if ((i11 & 2) != 0) {
            commonControlSettings = atomDTOHolder.common;
        }
        if ((i11 & 4) != 0) {
            horizontalPadding = atomDTOHolder.horizontalPadding;
        }
        return atomDTOHolder.copy(atomDTO, commonControlSettings, horizontalPadding);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final AtomDTO getAtom() {
        return this.atom;
    }

    /* renamed from: component2, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final HorizontalPadding getHorizontalPadding() {
        return this.horizontalPadding;
    }

    @NotNull
    public final AtomDTOHolder copy(@NotNull AtomDTO atom, CommonControlSettings common, @NotNull HorizontalPadding horizontalPadding) {
        Intrinsics.checkNotNullParameter(atom, "atom");
        Intrinsics.checkNotNullParameter(horizontalPadding, "horizontalPadding");
        return new AtomDTOHolder(atom, common, horizontalPadding);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AtomDTOHolder)) {
            return false;
        }
        AtomDTOHolder atomDTOHolder = (AtomDTOHolder) other;
        return Intrinsics.d(this.atom, atomDTOHolder.atom) && Intrinsics.d(this.common, atomDTOHolder.common) && Intrinsics.d(this.horizontalPadding, atomDTOHolder.horizontalPadding);
    }

    @NotNull
    public final AtomDTO getAtom() {
        return this.atom;
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    public final HorizontalPadding getHorizontalPadding() {
        return this.horizontalPadding;
    }

    public int hashCode() {
        int hashCode = this.atom.hashCode() * 31;
        CommonControlSettings commonControlSettings = this.common;
        return this.horizontalPadding.hashCode() + ((hashCode + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        return "AtomDTOHolder(atom=" + this.atom + ", common=" + this.common + ", horizontalPadding=" + this.horizontalPadding + ")";
    }

    public /* synthetic */ AtomDTOHolder(AtomDTO atomDTO, CommonControlSettings commonControlSettings, HorizontalPadding horizontalPadding, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(atomDTO, commonControlSettings, (i11 & 4) != 0 ? HorizontalPadding.INSTANCE.getDEFAULT_PADDING_500() : horizontalPadding);
    }
}
