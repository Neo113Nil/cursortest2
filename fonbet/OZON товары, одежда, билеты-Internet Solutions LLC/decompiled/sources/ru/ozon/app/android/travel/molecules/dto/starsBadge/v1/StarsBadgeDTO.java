package ru.ozon.app.android.travel.molecules.dto.starsBadge.v1;

import N3.C3660k;
import Nh.a;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003JU\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/starsBadge/v1/StarsBadgeDTO;", "", "text", "", "leftIcon", "rightIcon", "backgroundColor", "textGradientColors", "", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getText", "()Ljava/lang/String;", "getLeftIcon", "getRightIcon", "getBackgroundColor", "getTextGradientColors", "()Ljava/util/List;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class StarsBadgeDTO {
    private final String backgroundColor;
    private final CommonControlSettings common;
    private final String leftIcon;
    private final String rightIcon;

    @NotNull
    private final String text;
    private final List<String> textGradientColors;

    public StarsBadgeDTO(@NotNull String text, String str, String str2, String str3, List<String> list, CommonControlSettings commonControlSettings) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.leftIcon = str;
        this.rightIcon = str2;
        this.backgroundColor = str3;
        this.textGradientColors = list;
        this.common = commonControlSettings;
    }

    public static /* synthetic */ StarsBadgeDTO copy$default(StarsBadgeDTO starsBadgeDTO, String str, String str2, String str3, String str4, List list, CommonControlSettings commonControlSettings, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = starsBadgeDTO.text;
        }
        if ((i11 & 2) != 0) {
            str2 = starsBadgeDTO.leftIcon;
        }
        if ((i11 & 4) != 0) {
            str3 = starsBadgeDTO.rightIcon;
        }
        if ((i11 & 8) != 0) {
            str4 = starsBadgeDTO.backgroundColor;
        }
        if ((i11 & 16) != 0) {
            list = starsBadgeDTO.textGradientColors;
        }
        if ((i11 & 32) != 0) {
            commonControlSettings = starsBadgeDTO.common;
        }
        List list2 = list;
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        return starsBadgeDTO.copy(str, str2, str3, str4, list2, commonControlSettings2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLeftIcon() {
        return this.leftIcon;
    }

    /* renamed from: component3, reason: from getter */
    public final String getRightIcon() {
        return this.rightIcon;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final List<String> component5() {
        return this.textGradientColors;
    }

    /* renamed from: component6, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    public final StarsBadgeDTO copy(@NotNull String text, String leftIcon, String rightIcon, String backgroundColor, List<String> textGradientColors, CommonControlSettings common) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new StarsBadgeDTO(text, leftIcon, rightIcon, backgroundColor, textGradientColors, common);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StarsBadgeDTO)) {
            return false;
        }
        StarsBadgeDTO starsBadgeDTO = (StarsBadgeDTO) other;
        return Intrinsics.d(this.text, starsBadgeDTO.text) && Intrinsics.d(this.leftIcon, starsBadgeDTO.leftIcon) && Intrinsics.d(this.rightIcon, starsBadgeDTO.rightIcon) && Intrinsics.d(this.backgroundColor, starsBadgeDTO.backgroundColor) && Intrinsics.d(this.textGradientColors, starsBadgeDTO.textGradientColors) && Intrinsics.d(this.common, starsBadgeDTO.common);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    public final String getLeftIcon() {
        return this.leftIcon;
    }

    public final String getRightIcon() {
        return this.rightIcon;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public final List<String> getTextGradientColors() {
        return this.textGradientColors;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        String str = this.leftIcon;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.rightIcon;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.backgroundColor;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list = this.textGradientColors;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.common;
        return hashCode5 + (commonControlSettings != null ? commonControlSettings.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.text;
        String str2 = this.leftIcon;
        String str3 = this.rightIcon;
        String str4 = this.backgroundColor;
        List<String> list = this.textGradientColors;
        CommonControlSettings commonControlSettings = this.common;
        StringBuilder d11 = C3660k.d("StarsBadgeDTO(text=", str, ", leftIcon=", str2, ", rightIcon=");
        a.h(d11, str3, ", backgroundColor=", str4, ", textGradientColors=");
        d11.append(list);
        d11.append(", common=");
        d11.append(commonControlSettings);
        d11.append(")");
        return d11.toString();
    }
}
