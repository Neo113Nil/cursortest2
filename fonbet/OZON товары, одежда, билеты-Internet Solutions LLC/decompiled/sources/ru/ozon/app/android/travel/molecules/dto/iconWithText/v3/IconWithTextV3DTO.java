package ru.ozon.app.android.travel.molecules.dto.iconWithText.v3;

import Bi.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/iconWithText/v3/IconWithTextV3DTO;", "", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "backgroundColor", "", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;)V", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getBackgroundColor", "()Ljava/lang/String;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class IconWithTextV3DTO {
    private final String backgroundColor;

    @EnumNullFallback
    @NotNull
    private final CornerRadius cornerRadius;
    private final IconDTO icon;
    private final TextDTO text;

    public IconWithTextV3DTO(IconDTO iconDTO, TextDTO textDTO, String str, @NotNull CornerRadius cornerRadius) {
        Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
        this.icon = iconDTO;
        this.text = textDTO;
        this.backgroundColor = str;
        this.cornerRadius = cornerRadius;
    }

    public static /* synthetic */ IconWithTextV3DTO copy$default(IconWithTextV3DTO iconWithTextV3DTO, IconDTO iconDTO, TextDTO textDTO, String str, CornerRadius cornerRadius, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iconDTO = iconWithTextV3DTO.icon;
        }
        if ((i11 & 2) != 0) {
            textDTO = iconWithTextV3DTO.text;
        }
        if ((i11 & 4) != 0) {
            str = iconWithTextV3DTO.backgroundColor;
        }
        if ((i11 & 8) != 0) {
            cornerRadius = iconWithTextV3DTO.cornerRadius;
        }
        return iconWithTextV3DTO.copy(iconDTO, textDTO, str, cornerRadius);
    }

    /* renamed from: component1, reason: from getter */
    public final IconDTO getIcon() {
        return this.icon;
    }

    /* renamed from: component2, reason: from getter */
    public final TextDTO getText() {
        return this.text;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    @NotNull
    public final IconWithTextV3DTO copy(IconDTO icon, TextDTO text, String backgroundColor, @NotNull CornerRadius cornerRadius) {
        Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
        return new IconWithTextV3DTO(icon, text, backgroundColor, cornerRadius);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IconWithTextV3DTO)) {
            return false;
        }
        IconWithTextV3DTO iconWithTextV3DTO = (IconWithTextV3DTO) other;
        return Intrinsics.d(this.icon, iconWithTextV3DTO.icon) && Intrinsics.d(this.text, iconWithTextV3DTO.text) && Intrinsics.d(this.backgroundColor, iconWithTextV3DTO.backgroundColor) && this.cornerRadius == iconWithTextV3DTO.cornerRadius;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    public final IconDTO getIcon() {
        return this.icon;
    }

    public final TextDTO getText() {
        return this.text;
    }

    public int hashCode() {
        IconDTO iconDTO = this.icon;
        int hashCode = (iconDTO == null ? 0 : iconDTO.hashCode()) * 31;
        TextDTO textDTO = this.text;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        String str = this.backgroundColor;
        return this.cornerRadius.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        IconDTO iconDTO = this.icon;
        TextDTO textDTO = this.text;
        String str = this.backgroundColor;
        CornerRadius cornerRadius = this.cornerRadius;
        StringBuilder i11 = b.i("IconWithTextV3DTO(icon=", ", text=", ", backgroundColor=", iconDTO, textDTO);
        i11.append(str);
        i11.append(", cornerRadius=");
        i11.append(cornerRadius);
        i11.append(")");
        return i11.toString();
    }

    public /* synthetic */ IconWithTextV3DTO(IconDTO iconDTO, TextDTO textDTO, String str, CornerRadius cornerRadius, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(iconDTO, textDTO, str, (i11 & 8) != 0 ? CornerRadius.RADIUS_400 : cornerRadius);
    }
}
