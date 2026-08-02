package ru.ozon.android.messenger.blocks.ai.aiThinkingIndicator;

import Bl.C2639a;
import G.g;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003JG\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, d2 = {"Lru/ozon/android/messenger/blocks/ai/aiThinkingIndicator/AiThinkingIndicatorDTO;", "", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "statusMessages", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "", "Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getStatusMessages", "()Ljava/util/List;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AiThinkingIndicatorDTO {
    public static final int $stable = 8;

    @NotNull
    private final IconDTO icon;

    @NotNull
    private final List<TextDTO> statusMessages;
    private final TestInfo testInfo;
    private final Map<String, MessengerTrackingInfo> trackingInfo;

    public AiThinkingIndicatorDTO(@NotNull IconDTO icon, @NotNull List<TextDTO> statusMessages, TestInfo testInfo, Map<String, MessengerTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(statusMessages, "statusMessages");
        this.icon = icon;
        this.statusMessages = statusMessages;
        this.testInfo = testInfo;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AiThinkingIndicatorDTO copy$default(AiThinkingIndicatorDTO aiThinkingIndicatorDTO, IconDTO iconDTO, List list, TestInfo testInfo, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iconDTO = aiThinkingIndicatorDTO.icon;
        }
        if ((i11 & 2) != 0) {
            list = aiThinkingIndicatorDTO.statusMessages;
        }
        if ((i11 & 4) != 0) {
            testInfo = aiThinkingIndicatorDTO.testInfo;
        }
        if ((i11 & 8) != 0) {
            map = aiThinkingIndicatorDTO.trackingInfo;
        }
        return aiThinkingIndicatorDTO.copy(iconDTO, list, testInfo, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final IconDTO getIcon() {
        return this.icon;
    }

    @NotNull
    public final List<TextDTO> component2() {
        return this.statusMessages;
    }

    /* renamed from: component3, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final Map<String, MessengerTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final AiThinkingIndicatorDTO copy(@NotNull IconDTO icon, @NotNull List<TextDTO> statusMessages, TestInfo testInfo, Map<String, MessengerTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(statusMessages, "statusMessages");
        return new AiThinkingIndicatorDTO(icon, statusMessages, testInfo, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiThinkingIndicatorDTO)) {
            return false;
        }
        AiThinkingIndicatorDTO aiThinkingIndicatorDTO = (AiThinkingIndicatorDTO) other;
        return Intrinsics.d(this.icon, aiThinkingIndicatorDTO.icon) && Intrinsics.d(this.statusMessages, aiThinkingIndicatorDTO.statusMessages) && Intrinsics.d(this.testInfo, aiThinkingIndicatorDTO.testInfo) && Intrinsics.d(this.trackingInfo, aiThinkingIndicatorDTO.trackingInfo);
    }

    @NotNull
    public final IconDTO getIcon() {
        return this.icon;
    }

    @NotNull
    public final List<TextDTO> getStatusMessages() {
        return this.statusMessages;
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final Map<String, MessengerTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int b11 = g.b(this.icon.hashCode() * 31, 31, this.statusMessages);
        TestInfo testInfo = this.testInfo;
        int hashCode = (b11 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        Map<String, MessengerTrackingInfo> map = this.trackingInfo;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        IconDTO iconDTO = this.icon;
        List<TextDTO> list = this.statusMessages;
        TestInfo testInfo = this.testInfo;
        Map<String, MessengerTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("AiThinkingIndicatorDTO(icon=");
        sb2.append(iconDTO);
        sb2.append(", statusMessages=");
        sb2.append(list);
        sb2.append(", testInfo=");
        return C2639a.a(", trackingInfo=", ")", sb2, map, testInfo);
    }
}
