package ru.ozon.app.android.returns.ui.molecules.balance.viewObject;

import Bl.C2639a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.ui.molecules.balance.data.BalanceRowItemDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ>\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/returns/ui/molecules/balance/viewObject/BalanceRowItem;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "Lru/ozon/app/android/returns/ui/molecules/balance/data/BalanceRowItemDTO$IconPosition;", "iconPosition", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "common", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/app/android/returns/ui/molecules/balance/data/BalanceRowItemDTO$IconPosition;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "copy", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/app/android/returns/ui/molecules/balance/data/BalanceRowItemDTO$IconPosition;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)Lru/ozon/app/android/returns/ui/molecules/balance/viewObject/BalanceRowItem;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/app/android/returns/ui/molecules/balance/data/BalanceRowItemDTO$IconPosition;", "getIconPosition", "()Lru/ozon/app/android/returns/ui/molecules/balance/data/BalanceRowItemDTO$IconPosition;", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class BalanceRowItem {
    private final CommonControlSettings common;
    private final IconDTO icon;
    private final BalanceRowItemDTO.IconPosition iconPosition;

    @NotNull
    private final TextDTO text;

    public BalanceRowItem(@NotNull TextDTO text, IconDTO iconDTO, BalanceRowItemDTO.IconPosition iconPosition, CommonControlSettings commonControlSettings) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.icon = iconDTO;
        this.iconPosition = iconPosition;
        this.common = commonControlSettings;
    }

    public static /* synthetic */ BalanceRowItem copy$default(BalanceRowItem balanceRowItem, TextDTO textDTO, IconDTO iconDTO, BalanceRowItemDTO.IconPosition iconPosition, CommonControlSettings commonControlSettings, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = balanceRowItem.text;
        }
        if ((i11 & 2) != 0) {
            iconDTO = balanceRowItem.icon;
        }
        if ((i11 & 4) != 0) {
            iconPosition = balanceRowItem.iconPosition;
        }
        if ((i11 & 8) != 0) {
            commonControlSettings = balanceRowItem.common;
        }
        return balanceRowItem.copy(textDTO, iconDTO, iconPosition, commonControlSettings);
    }

    @NotNull
    public final BalanceRowItem copy(@NotNull TextDTO text, IconDTO icon, BalanceRowItemDTO.IconPosition iconPosition, CommonControlSettings common) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new BalanceRowItem(text, icon, iconPosition, common);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BalanceRowItem)) {
            return false;
        }
        BalanceRowItem balanceRowItem = (BalanceRowItem) other;
        return Intrinsics.d(this.text, balanceRowItem.text) && Intrinsics.d(this.icon, balanceRowItem.icon) && this.iconPosition == balanceRowItem.iconPosition && Intrinsics.d(this.common, balanceRowItem.common);
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    public final IconDTO getIcon() {
        return this.icon;
    }

    public final BalanceRowItemDTO.IconPosition getIconPosition() {
        return this.iconPosition;
    }

    @NotNull
    public final TextDTO getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        IconDTO iconDTO = this.icon;
        int hashCode2 = (hashCode + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
        BalanceRowItemDTO.IconPosition iconPosition = this.iconPosition;
        int hashCode3 = (hashCode2 + (iconPosition == null ? 0 : iconPosition.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.common;
        return hashCode3 + (commonControlSettings != null ? commonControlSettings.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.text;
        IconDTO iconDTO = this.icon;
        BalanceRowItemDTO.IconPosition iconPosition = this.iconPosition;
        CommonControlSettings commonControlSettings = this.common;
        StringBuilder d11 = C2639a.d("BalanceRowItem(text=", ", icon=", ", iconPosition=", iconDTO, textDTO);
        d11.append(iconPosition);
        d11.append(", common=");
        d11.append(commonControlSettings);
        d11.append(")");
        return d11.toString();
    }
}
