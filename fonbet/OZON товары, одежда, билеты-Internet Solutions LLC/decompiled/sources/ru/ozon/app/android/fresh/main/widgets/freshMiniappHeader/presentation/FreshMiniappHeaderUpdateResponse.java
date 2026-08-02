package ru.ozon.app.android.fresh.main.widgets.freshMiniappHeader.presentation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.widgets.freshMiniappHeader.data.FreshMiniappHeaderDTO;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/freshMiniappHeader/presentation/FreshMiniappHeaderUpdateResponse;", "", "Lru/ozon/app/android/fresh/main/widgets/freshMiniappHeader/data/FreshMiniappHeaderDTO;", "dto", "", "", "trackingPayloads", "<init>", "(Lru/ozon/app/android/fresh/main/widgets/freshMiniappHeader/data/FreshMiniappHeaderDTO;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/fresh/main/widgets/freshMiniappHeader/data/FreshMiniappHeaderDTO;", "getDto", "()Lru/ozon/app/android/fresh/main/widgets/freshMiniappHeader/data/FreshMiniappHeaderDTO;", "Ljava/util/Map;", "getTrackingPayloads", "()Ljava/util/Map;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FreshMiniappHeaderUpdateResponse {

    @NotNull
    private final FreshMiniappHeaderDTO dto;
    private final Map<String, String> trackingPayloads;

    public FreshMiniappHeaderUpdateResponse(@NotNull FreshMiniappHeaderDTO dto, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        this.dto = dto;
        this.trackingPayloads = map;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FreshMiniappHeaderUpdateResponse)) {
            return false;
        }
        FreshMiniappHeaderUpdateResponse freshMiniappHeaderUpdateResponse = (FreshMiniappHeaderUpdateResponse) other;
        return Intrinsics.d(this.dto, freshMiniappHeaderUpdateResponse.dto) && Intrinsics.d(this.trackingPayloads, freshMiniappHeaderUpdateResponse.trackingPayloads);
    }

    @NotNull
    public final FreshMiniappHeaderDTO getDto() {
        return this.dto;
    }

    public final Map<String, String> getTrackingPayloads() {
        return this.trackingPayloads;
    }

    public int hashCode() {
        int hashCode = this.dto.hashCode() * 31;
        Map<String, String> map = this.trackingPayloads;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        return "FreshMiniappHeaderUpdateResponse(dto=" + this.dto + ", trackingPayloads=" + this.trackingPayloads + ")";
    }
}
