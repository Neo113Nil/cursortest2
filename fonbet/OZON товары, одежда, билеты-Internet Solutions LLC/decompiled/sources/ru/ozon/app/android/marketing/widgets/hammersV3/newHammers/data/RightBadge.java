package ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data;

import G.g;
import Nh.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\t\u0010$\u001a\u00020\rHÆ\u0003Jd\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006-"}, d2 = {"Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/RightBadge;", "", "badgeText", "Lru/ozon/uni/atoms/data/text/TextDTO;", "secondsLeft", "", "onExpiredText", "leftBgColor", "", "rightBgColor", "leftTextColor", "rightTextColor", "chevron", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/Long;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/icon/IconDTO;)V", "getBadgeText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSecondsLeft", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getOnExpiredText", "getLeftBgColor", "()Ljava/lang/String;", "getRightBgColor", "getLeftTextColor", "getRightTextColor", "getChevron", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/Long;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/icon/IconDTO;)Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/RightBadge;", "equals", "", "other", "hashCode", "", "toString", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class RightBadge {
    public static final int $stable = IconDTO.$stable;
    private final TextDTO badgeText;

    @NotNull
    private final IconDTO chevron;

    @NotNull
    private final String leftBgColor;

    @NotNull
    private final String leftTextColor;
    private final TextDTO onExpiredText;

    @NotNull
    private final String rightBgColor;

    @NotNull
    private final String rightTextColor;
    private final Long secondsLeft;

    public RightBadge(TextDTO textDTO, Long l11, TextDTO textDTO2, @NotNull String leftBgColor, @NotNull String rightBgColor, @NotNull String leftTextColor, @NotNull String rightTextColor, @NotNull IconDTO chevron) {
        Intrinsics.checkNotNullParameter(leftBgColor, "leftBgColor");
        Intrinsics.checkNotNullParameter(rightBgColor, "rightBgColor");
        Intrinsics.checkNotNullParameter(leftTextColor, "leftTextColor");
        Intrinsics.checkNotNullParameter(rightTextColor, "rightTextColor");
        Intrinsics.checkNotNullParameter(chevron, "chevron");
        this.badgeText = textDTO;
        this.secondsLeft = l11;
        this.onExpiredText = textDTO2;
        this.leftBgColor = leftBgColor;
        this.rightBgColor = rightBgColor;
        this.leftTextColor = leftTextColor;
        this.rightTextColor = rightTextColor;
        this.chevron = chevron;
    }

    public static /* synthetic */ RightBadge copy$default(RightBadge rightBadge, TextDTO textDTO, Long l11, TextDTO textDTO2, String str, String str2, String str3, String str4, IconDTO iconDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = rightBadge.badgeText;
        }
        if ((i11 & 2) != 0) {
            l11 = rightBadge.secondsLeft;
        }
        if ((i11 & 4) != 0) {
            textDTO2 = rightBadge.onExpiredText;
        }
        if ((i11 & 8) != 0) {
            str = rightBadge.leftBgColor;
        }
        if ((i11 & 16) != 0) {
            str2 = rightBadge.rightBgColor;
        }
        if ((i11 & 32) != 0) {
            str3 = rightBadge.leftTextColor;
        }
        if ((i11 & 64) != 0) {
            str4 = rightBadge.rightTextColor;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            iconDTO = rightBadge.chevron;
        }
        String str5 = str4;
        IconDTO iconDTO2 = iconDTO;
        String str6 = str2;
        String str7 = str3;
        return rightBadge.copy(textDTO, l11, textDTO2, str, str6, str7, str5, iconDTO2);
    }

    /* renamed from: component1, reason: from getter */
    public final TextDTO getBadgeText() {
        return this.badgeText;
    }

    /* renamed from: component2, reason: from getter */
    public final Long getSecondsLeft() {
        return this.secondsLeft;
    }

    /* renamed from: component3, reason: from getter */
    public final TextDTO getOnExpiredText() {
        return this.onExpiredText;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getLeftBgColor() {
        return this.leftBgColor;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getRightBgColor() {
        return this.rightBgColor;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getLeftTextColor() {
        return this.leftTextColor;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getRightTextColor() {
        return this.rightTextColor;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final IconDTO getChevron() {
        return this.chevron;
    }

    @NotNull
    public final RightBadge copy(TextDTO badgeText, Long secondsLeft, TextDTO onExpiredText, @NotNull String leftBgColor, @NotNull String rightBgColor, @NotNull String leftTextColor, @NotNull String rightTextColor, @NotNull IconDTO chevron) {
        Intrinsics.checkNotNullParameter(leftBgColor, "leftBgColor");
        Intrinsics.checkNotNullParameter(rightBgColor, "rightBgColor");
        Intrinsics.checkNotNullParameter(leftTextColor, "leftTextColor");
        Intrinsics.checkNotNullParameter(rightTextColor, "rightTextColor");
        Intrinsics.checkNotNullParameter(chevron, "chevron");
        return new RightBadge(badgeText, secondsLeft, onExpiredText, leftBgColor, rightBgColor, leftTextColor, rightTextColor, chevron);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RightBadge)) {
            return false;
        }
        RightBadge rightBadge = (RightBadge) other;
        return Intrinsics.d(this.badgeText, rightBadge.badgeText) && Intrinsics.d(this.secondsLeft, rightBadge.secondsLeft) && Intrinsics.d(this.onExpiredText, rightBadge.onExpiredText) && Intrinsics.d(this.leftBgColor, rightBadge.leftBgColor) && Intrinsics.d(this.rightBgColor, rightBadge.rightBgColor) && Intrinsics.d(this.leftTextColor, rightBadge.leftTextColor) && Intrinsics.d(this.rightTextColor, rightBadge.rightTextColor) && Intrinsics.d(this.chevron, rightBadge.chevron);
    }

    public final TextDTO getBadgeText() {
        return this.badgeText;
    }

    @NotNull
    public final IconDTO getChevron() {
        return this.chevron;
    }

    @NotNull
    public final String getLeftBgColor() {
        return this.leftBgColor;
    }

    @NotNull
    public final String getLeftTextColor() {
        return this.leftTextColor;
    }

    public final TextDTO getOnExpiredText() {
        return this.onExpiredText;
    }

    @NotNull
    public final String getRightBgColor() {
        return this.rightBgColor;
    }

    @NotNull
    public final String getRightTextColor() {
        return this.rightTextColor;
    }

    public final Long getSecondsLeft() {
        return this.secondsLeft;
    }

    public int hashCode() {
        TextDTO textDTO = this.badgeText;
        int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
        Long l11 = this.secondsLeft;
        int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        TextDTO textDTO2 = this.onExpiredText;
        return this.chevron.hashCode() + g.a(g.a(g.a(g.a((hashCode2 + (textDTO2 != null ? textDTO2.hashCode() : 0)) * 31, 31, this.leftBgColor), 31, this.rightBgColor), 31, this.leftTextColor), 31, this.rightTextColor);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.badgeText;
        Long l11 = this.secondsLeft;
        TextDTO textDTO2 = this.onExpiredText;
        String str = this.leftBgColor;
        String str2 = this.rightBgColor;
        String str3 = this.leftTextColor;
        String str4 = this.rightTextColor;
        IconDTO iconDTO = this.chevron;
        StringBuilder sb2 = new StringBuilder("RightBadge(badgeText=");
        sb2.append(textDTO);
        sb2.append(", secondsLeft=");
        sb2.append(l11);
        sb2.append(", onExpiredText=");
        sb2.append(textDTO2);
        sb2.append(", leftBgColor=");
        sb2.append(str);
        sb2.append(", rightBgColor=");
        a.h(sb2, str2, ", leftTextColor=", str3, ", rightTextColor=");
        sb2.append(str4);
        sb2.append(", chevron=");
        sb2.append(iconDTO);
        sb2.append(")");
        return sb2.toString();
    }
}
