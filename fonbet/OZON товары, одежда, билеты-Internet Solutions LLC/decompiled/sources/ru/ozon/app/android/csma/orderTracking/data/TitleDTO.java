package ru.ozon.app.android.csma.orderTracking.data;

import N3.C3660k;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0011J<\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\bHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/csma/orderTracking/data/TitleDTO;", "", "text", "", "color", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "timeLeft", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/lang/Integer;)V", "getText", "()Ljava/lang/String;", "getColor", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getTimeLeft", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/lang/Integer;)Lru/ozon/app/android/csma/orderTracking/data/TitleDTO;", "equals", "", "other", "hashCode", "toString", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class TitleDTO {
    private final String color;
    private final IconDTO icon;

    @NotNull
    private final String text;
    private final Integer timeLeft;

    public TitleDTO(@NotNull String text, String str, IconDTO iconDTO, Integer num) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.color = str;
        this.icon = iconDTO;
        this.timeLeft = num;
    }

    public static /* synthetic */ TitleDTO copy$default(TitleDTO titleDTO, String str, String str2, IconDTO iconDTO, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = titleDTO.text;
        }
        if ((i11 & 2) != 0) {
            str2 = titleDTO.color;
        }
        if ((i11 & 4) != 0) {
            iconDTO = titleDTO.icon;
        }
        if ((i11 & 8) != 0) {
            num = titleDTO.timeLeft;
        }
        return titleDTO.copy(str, str2, iconDTO, num);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    /* renamed from: component3, reason: from getter */
    public final IconDTO getIcon() {
        return this.icon;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getTimeLeft() {
        return this.timeLeft;
    }

    @NotNull
    public final TitleDTO copy(@NotNull String text, String color, IconDTO icon, Integer timeLeft) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new TitleDTO(text, color, icon, timeLeft);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TitleDTO)) {
            return false;
        }
        TitleDTO titleDTO = (TitleDTO) other;
        return Intrinsics.d(this.text, titleDTO.text) && Intrinsics.d(this.color, titleDTO.color) && Intrinsics.d(this.icon, titleDTO.icon) && Intrinsics.d(this.timeLeft, titleDTO.timeLeft);
    }

    public final String getColor() {
        return this.color;
    }

    public final IconDTO getIcon() {
        return this.icon;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public final Integer getTimeLeft() {
        return this.timeLeft;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        String str = this.color;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        IconDTO iconDTO = this.icon;
        int hashCode3 = (hashCode2 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
        Integer num = this.timeLeft;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.text;
        String str2 = this.color;
        IconDTO iconDTO = this.icon;
        Integer num = this.timeLeft;
        StringBuilder d11 = C3660k.d("TitleDTO(text=", str, ", color=", str2, ", icon=");
        d11.append(iconDTO);
        d11.append(", timeLeft=");
        d11.append(num);
        d11.append(")");
        return d11.toString();
    }
}
