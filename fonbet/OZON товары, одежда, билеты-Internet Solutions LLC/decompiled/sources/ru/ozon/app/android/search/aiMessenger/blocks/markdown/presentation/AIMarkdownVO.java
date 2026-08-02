package ru.ozon.app.android.search.aiMessenger.blocks.markdown.presentation;

import T7.P;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.presentation.models.c;
import ru.ozon.android.messenger.framework.presentation.models.g;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\fR%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/search/aiMessenger/blocks/markdown/presentation/AIMarkdownVO;", "Lru/ozon/android/messenger/framework/presentation/models/g;", "Lru/ozon/android/messenger/framework/presentation/models/c;", "blockId", "", "data", "", "Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "trackingInfo", "<init>", "(Lru/ozon/android/messenger/framework/presentation/models/c;Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/android/messenger/framework/presentation/models/c;", "getBlockId", "()Lru/ozon/android/messenger/framework/presentation/models/c;", "Ljava/lang/String;", "getData", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AIMarkdownVO implements g {

    @NotNull
    private final c blockId;

    @NotNull
    private final String data;
    private final Map<String, MessengerTrackingInfo> trackingInfo;

    public AIMarkdownVO(@NotNull c blockId, @NotNull String data, Map<String, MessengerTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(data, "data");
        this.blockId = blockId;
        this.data = data;
        this.trackingInfo = map;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AIMarkdownVO)) {
            return false;
        }
        AIMarkdownVO aIMarkdownVO = (AIMarkdownVO) other;
        return Intrinsics.d(this.blockId, aIMarkdownVO.blockId) && Intrinsics.d(this.data, aIMarkdownVO.data) && Intrinsics.d(this.trackingInfo, aIMarkdownVO.trackingInfo);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.g
    @NotNull
    public c getBlockId() {
        return this.blockId;
    }

    @NotNull
    public final String getData() {
        return this.data;
    }

    public final Map<String, MessengerTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = G.g.a(this.blockId.hashCode() * 31, 31, this.data);
        Map<String, MessengerTrackingInfo> map = this.trackingInfo;
        return a11 + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        c cVar = this.blockId;
        String str = this.data;
        Map<String, MessengerTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("AIMarkdownVO(blockId=");
        sb2.append(cVar);
        sb2.append(", data=");
        sb2.append(str);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
