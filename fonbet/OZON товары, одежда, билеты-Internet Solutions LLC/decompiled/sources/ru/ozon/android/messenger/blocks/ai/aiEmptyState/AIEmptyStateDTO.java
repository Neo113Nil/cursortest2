package ru.ozon.android.messenger.blocks.ai.aiEmptyState;

import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001BY\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010\u001fJn\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u0010HÖ\u0001J\t\u0010.\u001a\u00020\u000bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001f¨\u0006/"}, d2 = {"Lru/ozon/android/messenger/blocks/ai/aiEmptyState/AIEmptyStateDTO;", "", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "bottomBadge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "trackingInfo", "", "", "Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "topPadding", "", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;Ljava/lang/Integer;)V", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getBottomBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTopPadding", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;Ljava/lang/Integer;)Lru/ozon/android/messenger/blocks/ai/aiEmptyState/AIEmptyStateDTO;", "equals", "", "other", "hashCode", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AIEmptyStateDTO {
    public static final int $stable = 8;
    private final BadgeDTO bottomBadge;
    private final IconDTO icon;
    private final TextDTO subtitle;
    private final TestInfo testInfo;
    private final TextDTO title;
    private final Integer topPadding;
    private final Map<String, MessengerTrackingInfo> trackingInfo;

    public AIEmptyStateDTO(IconDTO iconDTO, TextDTO textDTO, TextDTO textDTO2, BadgeDTO badgeDTO, Map<String, MessengerTrackingInfo> map, TestInfo testInfo, Integer num) {
        this.icon = iconDTO;
        this.title = textDTO;
        this.subtitle = textDTO2;
        this.bottomBadge = badgeDTO;
        this.trackingInfo = map;
        this.testInfo = testInfo;
        this.topPadding = num;
    }

    public static /* synthetic */ AIEmptyStateDTO copy$default(AIEmptyStateDTO aIEmptyStateDTO, IconDTO iconDTO, TextDTO textDTO, TextDTO textDTO2, BadgeDTO badgeDTO, Map map, TestInfo testInfo, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iconDTO = aIEmptyStateDTO.icon;
        }
        if ((i11 & 2) != 0) {
            textDTO = aIEmptyStateDTO.title;
        }
        if ((i11 & 4) != 0) {
            textDTO2 = aIEmptyStateDTO.subtitle;
        }
        if ((i11 & 8) != 0) {
            badgeDTO = aIEmptyStateDTO.bottomBadge;
        }
        if ((i11 & 16) != 0) {
            map = aIEmptyStateDTO.trackingInfo;
        }
        if ((i11 & 32) != 0) {
            testInfo = aIEmptyStateDTO.testInfo;
        }
        if ((i11 & 64) != 0) {
            num = aIEmptyStateDTO.topPadding;
        }
        TestInfo testInfo2 = testInfo;
        Integer num2 = num;
        Map map2 = map;
        TextDTO textDTO3 = textDTO2;
        return aIEmptyStateDTO.copy(iconDTO, textDTO, textDTO3, badgeDTO, map2, testInfo2, num2);
    }

    /* renamed from: component1, reason: from getter */
    public final IconDTO getIcon() {
        return this.icon;
    }

    /* renamed from: component2, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final BadgeDTO getBottomBadge() {
        return this.bottomBadge;
    }

    public final Map<String, MessengerTrackingInfo> component5() {
        return this.trackingInfo;
    }

    /* renamed from: component6, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getTopPadding() {
        return this.topPadding;
    }

    @NotNull
    public final AIEmptyStateDTO copy(IconDTO icon, TextDTO title, TextDTO subtitle, BadgeDTO bottomBadge, Map<String, MessengerTrackingInfo> trackingInfo, TestInfo testInfo, Integer topPadding) {
        return new AIEmptyStateDTO(icon, title, subtitle, bottomBadge, trackingInfo, testInfo, topPadding);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AIEmptyStateDTO)) {
            return false;
        }
        AIEmptyStateDTO aIEmptyStateDTO = (AIEmptyStateDTO) other;
        return Intrinsics.d(this.icon, aIEmptyStateDTO.icon) && Intrinsics.d(this.title, aIEmptyStateDTO.title) && Intrinsics.d(this.subtitle, aIEmptyStateDTO.subtitle) && Intrinsics.d(this.bottomBadge, aIEmptyStateDTO.bottomBadge) && Intrinsics.d(this.trackingInfo, aIEmptyStateDTO.trackingInfo) && Intrinsics.d(this.testInfo, aIEmptyStateDTO.testInfo) && Intrinsics.d(this.topPadding, aIEmptyStateDTO.topPadding);
    }

    public final BadgeDTO getBottomBadge() {
        return this.bottomBadge;
    }

    public final IconDTO getIcon() {
        return this.icon;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    public final Integer getTopPadding() {
        return this.topPadding;
    }

    public final Map<String, MessengerTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        IconDTO iconDTO = this.icon;
        int hashCode = (iconDTO == null ? 0 : iconDTO.hashCode()) * 31;
        TextDTO textDTO = this.title;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        TextDTO textDTO2 = this.subtitle;
        int hashCode3 = (hashCode2 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
        BadgeDTO badgeDTO = this.bottomBadge;
        int hashCode4 = (hashCode3 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        Map<String, MessengerTrackingInfo> map = this.trackingInfo;
        int hashCode5 = (hashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        int hashCode6 = (hashCode5 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        Integer num = this.topPadding;
        return hashCode6 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        IconDTO iconDTO = this.icon;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        BadgeDTO badgeDTO = this.bottomBadge;
        Map<String, MessengerTrackingInfo> map = this.trackingInfo;
        TestInfo testInfo = this.testInfo;
        Integer num = this.topPadding;
        StringBuilder i11 = Bi.b.i("AIEmptyStateDTO(icon=", ", title=", ", subtitle=", iconDTO, textDTO);
        i11.append(textDTO2);
        i11.append(", bottomBadge=");
        i11.append(badgeDTO);
        i11.append(", trackingInfo=");
        i11.append(map);
        i11.append(", testInfo=");
        i11.append(testInfo);
        i11.append(", topPadding=");
        return Ep.a.c(i11, num, ")");
    }
}
