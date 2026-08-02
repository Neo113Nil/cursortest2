package ru.ozon.app.android.search.aiMessenger.blocks.markdown.data;

import Pk0.h;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.uni.atoms.data.TestInfo;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/search/aiMessenger/blocks/markdown/data/AIMarkdownDTO;", "", "data", "", "trackingInfo", "", "Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Ljava/lang/String;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)V", "getData", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AIMarkdownDTO {
    public static final int $stable = 8;

    @NotNull
    private final String data;
    private final TestInfo testInfo;
    private final Map<String, MessengerTrackingInfo> trackingInfo;

    public AIMarkdownDTO(@NotNull String data, Map<String, MessengerTrackingInfo> map, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
        this.trackingInfo = map;
        this.testInfo = testInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AIMarkdownDTO copy$default(AIMarkdownDTO aIMarkdownDTO, String str, Map map, TestInfo testInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = aIMarkdownDTO.data;
        }
        if ((i11 & 2) != 0) {
            map = aIMarkdownDTO.trackingInfo;
        }
        if ((i11 & 4) != 0) {
            testInfo = aIMarkdownDTO.testInfo;
        }
        return aIMarkdownDTO.copy(str, map, testInfo);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getData() {
        return this.data;
    }

    public final Map<String, MessengerTrackingInfo> component2() {
        return this.trackingInfo;
    }

    /* renamed from: component3, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final AIMarkdownDTO copy(@NotNull String data, Map<String, MessengerTrackingInfo> trackingInfo, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new AIMarkdownDTO(data, trackingInfo, testInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AIMarkdownDTO)) {
            return false;
        }
        AIMarkdownDTO aIMarkdownDTO = (AIMarkdownDTO) other;
        return Intrinsics.d(this.data, aIMarkdownDTO.data) && Intrinsics.d(this.trackingInfo, aIMarkdownDTO.trackingInfo) && Intrinsics.d(this.testInfo, aIMarkdownDTO.testInfo);
    }

    @NotNull
    public final String getData() {
        return this.data;
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final Map<String, MessengerTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.data.hashCode() * 31;
        Map<String, MessengerTrackingInfo> map = this.trackingInfo;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        return hashCode2 + (testInfo != null ? testInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.data;
        Map<String, MessengerTrackingInfo> map = this.trackingInfo;
        TestInfo testInfo = this.testInfo;
        StringBuilder sb2 = new StringBuilder("AIMarkdownDTO(data=");
        sb2.append(str);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        sb2.append(", testInfo=");
        return h.c(sb2, testInfo, ")");
    }
}
