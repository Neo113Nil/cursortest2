package ru.ozon.app.android.travel.feature.b2b.widgets.accountBalanceBar.data;

import C.o0;
import G.g;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.uni.core.UniColors;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/accountBalanceBar/data/AccountBalanceBarDTO;", "", "cellWithSubtitleCounter", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCounter;", "backgroundColor", "", "containerBackground", "<init>", "(Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCounter;Ljava/lang/String;Ljava/lang/String;)V", "getCellWithSubtitleCounter", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCounter;", "getBackgroundColor", "()Ljava/lang/String;", "getContainerBackground", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AccountBalanceBarDTO {
    public static final int $stable = 8;

    @NotNull
    private final String backgroundColor;

    @NotNull
    private final CellAtom.CellAtomWithSubtitle.CellWithSubtitleCounter cellWithSubtitleCounter;

    @NotNull
    private final String containerBackground;

    public AccountBalanceBarDTO(@NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitleCounter cellWithSubtitleCounter, @NotNull String backgroundColor, @NotNull String containerBackground) {
        Intrinsics.checkNotNullParameter(cellWithSubtitleCounter, "cellWithSubtitleCounter");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(containerBackground, "containerBackground");
        this.cellWithSubtitleCounter = cellWithSubtitleCounter;
        this.backgroundColor = backgroundColor;
        this.containerBackground = containerBackground;
    }

    public static /* synthetic */ AccountBalanceBarDTO copy$default(AccountBalanceBarDTO accountBalanceBarDTO, CellAtom.CellAtomWithSubtitle.CellWithSubtitleCounter cellWithSubtitleCounter, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cellWithSubtitleCounter = accountBalanceBarDTO.cellWithSubtitleCounter;
        }
        if ((i11 & 2) != 0) {
            str = accountBalanceBarDTO.backgroundColor;
        }
        if ((i11 & 4) != 0) {
            str2 = accountBalanceBarDTO.containerBackground;
        }
        return accountBalanceBarDTO.copy(cellWithSubtitleCounter, str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CellAtom.CellAtomWithSubtitle.CellWithSubtitleCounter getCellWithSubtitleCounter() {
        return this.cellWithSubtitleCounter;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getContainerBackground() {
        return this.containerBackground;
    }

    @NotNull
    public final AccountBalanceBarDTO copy(@NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitleCounter cellWithSubtitleCounter, @NotNull String backgroundColor, @NotNull String containerBackground) {
        Intrinsics.checkNotNullParameter(cellWithSubtitleCounter, "cellWithSubtitleCounter");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(containerBackground, "containerBackground");
        return new AccountBalanceBarDTO(cellWithSubtitleCounter, backgroundColor, containerBackground);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountBalanceBarDTO)) {
            return false;
        }
        AccountBalanceBarDTO accountBalanceBarDTO = (AccountBalanceBarDTO) other;
        return Intrinsics.d(this.cellWithSubtitleCounter, accountBalanceBarDTO.cellWithSubtitleCounter) && Intrinsics.d(this.backgroundColor, accountBalanceBarDTO.backgroundColor) && Intrinsics.d(this.containerBackground, accountBalanceBarDTO.containerBackground);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final CellAtom.CellAtomWithSubtitle.CellWithSubtitleCounter getCellWithSubtitleCounter() {
        return this.cellWithSubtitleCounter;
    }

    @NotNull
    public final String getContainerBackground() {
        return this.containerBackground;
    }

    public int hashCode() {
        return this.containerBackground.hashCode() + g.a(this.cellWithSubtitleCounter.hashCode() * 31, 31, this.backgroundColor);
    }

    @NotNull
    public String toString() {
        CellAtom.CellAtomWithSubtitle.CellWithSubtitleCounter cellWithSubtitleCounter = this.cellWithSubtitleCounter;
        String str = this.backgroundColor;
        String str2 = this.containerBackground;
        StringBuilder sb2 = new StringBuilder("AccountBalanceBarDTO(cellWithSubtitleCounter=");
        sb2.append(cellWithSubtitleCounter);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        sb2.append(", containerBackground=");
        return o0.c(sb2, str2, ")");
    }

    public /* synthetic */ AccountBalanceBarDTO(CellAtom.CellAtomWithSubtitle.CellWithSubtitleCounter cellWithSubtitleCounter, String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(cellWithSubtitleCounter, (i11 & 2) != 0 ? UniColors.LAYER_FLOOR_0.getToken() : str, (i11 & 4) != 0 ? UniColors.LAYER_FLOOR_1.getToken() : str2);
    }
}
