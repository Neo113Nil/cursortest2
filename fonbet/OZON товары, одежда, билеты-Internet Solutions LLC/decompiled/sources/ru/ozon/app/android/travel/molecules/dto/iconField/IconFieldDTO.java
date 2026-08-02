package ru.ozon.app.android.travel.molecules.dto.iconField;

import Bi.a;
import Bl.C2639a;
import Ds.C2880a;
import El.C2971a;
import G.g;
import Kk.C3532b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003J\t\u0010 \u001a\u00020\rHÆ\u0003JE\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010\"\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/iconField/IconFieldDTO;", "", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "backgroundColor", "", "isCompact", "", "commonControlSettings", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/lang/String;ZLru/ozon/uni/atoms/data/controls/CommonControlSettings;Lru/ozon/uni/atoms/data/common/CornerRadius;)V", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getBackgroundColor", "()Ljava/lang/String;", "()Z", "getCommonControlSettings", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class IconFieldDTO {

    @NotNull
    private final String backgroundColor;

    @NotNull
    private final CommonControlSettings commonControlSettings;

    @EnumNullFallback
    @NotNull
    private final CornerRadius cornerRadius;

    @NotNull
    private final IconDTO icon;
    private final boolean isCompact;

    @NotNull
    private final TextDTO text;

    public IconFieldDTO(@NotNull TextDTO text, @NotNull IconDTO icon, @NotNull String backgroundColor, boolean z11, @NotNull CommonControlSettings commonControlSettings, @NotNull CornerRadius cornerRadius) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(commonControlSettings, "commonControlSettings");
        Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
        this.text = text;
        this.icon = icon;
        this.backgroundColor = backgroundColor;
        this.isCompact = z11;
        this.commonControlSettings = commonControlSettings;
        this.cornerRadius = cornerRadius;
    }

    public static /* synthetic */ IconFieldDTO copy$default(IconFieldDTO iconFieldDTO, TextDTO textDTO, IconDTO iconDTO, String str, boolean z11, CommonControlSettings commonControlSettings, CornerRadius cornerRadius, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = iconFieldDTO.text;
        }
        if ((i11 & 2) != 0) {
            iconDTO = iconFieldDTO.icon;
        }
        if ((i11 & 4) != 0) {
            str = iconFieldDTO.backgroundColor;
        }
        if ((i11 & 8) != 0) {
            z11 = iconFieldDTO.isCompact;
        }
        if ((i11 & 16) != 0) {
            commonControlSettings = iconFieldDTO.commonControlSettings;
        }
        if ((i11 & 32) != 0) {
            cornerRadius = iconFieldDTO.cornerRadius;
        }
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        CornerRadius cornerRadius2 = cornerRadius;
        return iconFieldDTO.copy(textDTO, iconDTO, str, z11, commonControlSettings2, cornerRadius2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getText() {
        return this.text;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final IconDTO getIcon() {
        return this.icon;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsCompact() {
        return this.isCompact;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final CommonControlSettings getCommonControlSettings() {
        return this.commonControlSettings;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    @NotNull
    public final IconFieldDTO copy(@NotNull TextDTO text, @NotNull IconDTO icon, @NotNull String backgroundColor, boolean isCompact, @NotNull CommonControlSettings commonControlSettings, @NotNull CornerRadius cornerRadius) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(commonControlSettings, "commonControlSettings");
        Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
        return new IconFieldDTO(text, icon, backgroundColor, isCompact, commonControlSettings, cornerRadius);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IconFieldDTO)) {
            return false;
        }
        IconFieldDTO iconFieldDTO = (IconFieldDTO) other;
        return Intrinsics.d(this.text, iconFieldDTO.text) && Intrinsics.d(this.icon, iconFieldDTO.icon) && Intrinsics.d(this.backgroundColor, iconFieldDTO.backgroundColor) && this.isCompact == iconFieldDTO.isCompact && Intrinsics.d(this.commonControlSettings, iconFieldDTO.commonControlSettings) && this.cornerRadius == iconFieldDTO.cornerRadius;
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final CommonControlSettings getCommonControlSettings() {
        return this.commonControlSettings;
    }

    @NotNull
    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    @NotNull
    public final IconDTO getIcon() {
        return this.icon;
    }

    @NotNull
    public final TextDTO getText() {
        return this.text;
    }

    public int hashCode() {
        return this.cornerRadius.hashCode() + a.a(this.commonControlSettings, C3532b.a(g.a(C2971a.a(this.icon, this.text.hashCode() * 31, 31), 31, this.backgroundColor), 31, this.isCompact), 31);
    }

    public final boolean isCompact() {
        return this.isCompact;
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.text;
        IconDTO iconDTO = this.icon;
        String str = this.backgroundColor;
        boolean z11 = this.isCompact;
        CommonControlSettings commonControlSettings = this.commonControlSettings;
        CornerRadius cornerRadius = this.cornerRadius;
        StringBuilder d11 = C2639a.d("IconFieldDTO(text=", ", icon=", ", backgroundColor=", iconDTO, textDTO);
        C2880a.c(str, ", isCompact=", ", commonControlSettings=", d11, z11);
        d11.append(commonControlSettings);
        d11.append(", cornerRadius=");
        d11.append(cornerRadius);
        d11.append(")");
        return d11.toString();
    }

    public /* synthetic */ IconFieldDTO(TextDTO textDTO, IconDTO iconDTO, String str, boolean z11, CommonControlSettings commonControlSettings, CornerRadius cornerRadius, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textDTO, iconDTO, str, z11, commonControlSettings, (i11 & 32) != 0 ? CornerRadius.NO_RADIUS : cornerRadius);
    }
}
