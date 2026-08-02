package ru.ozon.app.android.search.widgets.aiHelper.data;

import B0.A0;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/search/widgets/aiHelper/data/PollSearchAiRequest;", "", "aiResultId", "", "<init>", "(Ljava/lang/String;)V", "getAiResultId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PollSearchAiRequest {
    public static final int $stable = 0;

    @NotNull
    private final String aiResultId;

    public PollSearchAiRequest(@NotNull String aiResultId) {
        Intrinsics.checkNotNullParameter(aiResultId, "aiResultId");
        this.aiResultId = aiResultId;
    }

    public static /* synthetic */ PollSearchAiRequest copy$default(PollSearchAiRequest pollSearchAiRequest, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = pollSearchAiRequest.aiResultId;
        }
        return pollSearchAiRequest.copy(str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getAiResultId() {
        return this.aiResultId;
    }

    @NotNull
    public final PollSearchAiRequest copy(@NotNull String aiResultId) {
        Intrinsics.checkNotNullParameter(aiResultId, "aiResultId");
        return new PollSearchAiRequest(aiResultId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PollSearchAiRequest) && Intrinsics.d(this.aiResultId, ((PollSearchAiRequest) other).aiResultId);
    }

    @NotNull
    public final String getAiResultId() {
        return this.aiResultId;
    }

    public int hashCode() {
        return this.aiResultId.hashCode();
    }

    @NotNull
    public String toString() {
        return A0.b("PollSearchAiRequest(aiResultId=", this.aiResultId, ")");
    }
}
