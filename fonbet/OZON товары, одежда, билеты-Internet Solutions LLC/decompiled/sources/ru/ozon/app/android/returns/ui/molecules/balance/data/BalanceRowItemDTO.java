package ru.ozon.app.android.returns.ui.molecules.balance.data;

import Bl.C2639a;
import Xc.a;
import Xc.b;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001 B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lru/ozon/app/android/returns/ui/molecules/balance/data/BalanceRowItemDTO;", "", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "iconPosition", "Lru/ozon/app/android/returns/ui/molecules/balance/data/BalanceRowItemDTO$IconPosition;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/app/android/returns/ui/molecules/balance/data/BalanceRowItemDTO$IconPosition;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIconPosition", "()Lru/ozon/app/android/returns/ui/molecules/balance/data/BalanceRowItemDTO$IconPosition;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "IconPosition", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class BalanceRowItemDTO {
    private final CommonControlSettings common;
    private final IconDTO icon;
    private final IconPosition iconPosition;

    @NotNull
    private final TextDTO text;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/returns/ui/molecules/balance/data/BalanceRowItemDTO$IconPosition;", "", "<init>", "(Ljava/lang/String;I)V", "LEFT", "RIGHT", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconPosition {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ IconPosition[] $VALUES;

        @i(name = "Left")
        public static final IconPosition LEFT = new IconPosition("LEFT", 0);

        @i(name = "Right")
        public static final IconPosition RIGHT = new IconPosition("RIGHT", 1);

        private static final /* synthetic */ IconPosition[] $values() {
            return new IconPosition[]{LEFT, RIGHT};
        }

        static {
            IconPosition[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private IconPosition(String str, int i11) {
        }

        public static IconPosition valueOf(String str) {
            return (IconPosition) Enum.valueOf(IconPosition.class, str);
        }

        public static IconPosition[] values() {
            return (IconPosition[]) $VALUES.clone();
        }
    }

    public BalanceRowItemDTO(@NotNull TextDTO text, IconDTO iconDTO, IconPosition iconPosition, CommonControlSettings commonControlSettings) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.icon = iconDTO;
        this.iconPosition = iconPosition;
        this.common = commonControlSettings;
    }

    public static /* synthetic */ BalanceRowItemDTO copy$default(BalanceRowItemDTO balanceRowItemDTO, TextDTO textDTO, IconDTO iconDTO, IconPosition iconPosition, CommonControlSettings commonControlSettings, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = balanceRowItemDTO.text;
        }
        if ((i11 & 2) != 0) {
            iconDTO = balanceRowItemDTO.icon;
        }
        if ((i11 & 4) != 0) {
            iconPosition = balanceRowItemDTO.iconPosition;
        }
        if ((i11 & 8) != 0) {
            commonControlSettings = balanceRowItemDTO.common;
        }
        return balanceRowItemDTO.copy(textDTO, iconDTO, iconPosition, commonControlSettings);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final IconDTO getIcon() {
        return this.icon;
    }

    /* renamed from: component3, reason: from getter */
    public final IconPosition getIconPosition() {
        return this.iconPosition;
    }

    /* renamed from: component4, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    public final BalanceRowItemDTO copy(@NotNull TextDTO text, IconDTO icon, IconPosition iconPosition, CommonControlSettings common) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new BalanceRowItemDTO(text, icon, iconPosition, common);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BalanceRowItemDTO)) {
            return false;
        }
        BalanceRowItemDTO balanceRowItemDTO = (BalanceRowItemDTO) other;
        return Intrinsics.d(this.text, balanceRowItemDTO.text) && Intrinsics.d(this.icon, balanceRowItemDTO.icon) && this.iconPosition == balanceRowItemDTO.iconPosition && Intrinsics.d(this.common, balanceRowItemDTO.common);
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    public final IconDTO getIcon() {
        return this.icon;
    }

    public final IconPosition getIconPosition() {
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
        IconPosition iconPosition = this.iconPosition;
        int hashCode3 = (hashCode2 + (iconPosition == null ? 0 : iconPosition.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.common;
        return hashCode3 + (commonControlSettings != null ? commonControlSettings.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.text;
        IconDTO iconDTO = this.icon;
        IconPosition iconPosition = this.iconPosition;
        CommonControlSettings commonControlSettings = this.common;
        StringBuilder d11 = C2639a.d("BalanceRowItemDTO(text=", ", icon=", ", iconPosition=", iconDTO, textDTO);
        d11.append(iconPosition);
        d11.append(", common=");
        d11.append(commonControlSettings);
        d11.append(")");
        return d11.toString();
    }
}
