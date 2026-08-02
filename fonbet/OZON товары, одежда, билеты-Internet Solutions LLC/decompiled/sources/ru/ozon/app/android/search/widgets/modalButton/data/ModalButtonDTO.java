package ru.ozon.app.android.search.widgets.modalButton.data;

import G.g;
import N3.C3660k;
import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/search/widgets/modalButton/data/ModalButtonDTO;", "", "modalUrl", "", "displayType", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getModalUrl", "()Ljava/lang/String;", "getDisplayType", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ModalButtonDTO {
    public static final int $stable = 8;

    @NotNull
    private final String displayType;

    @NotNull
    private final String modalUrl;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public ModalButtonDTO(@NotNull String modalUrl, @NotNull String displayType, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(modalUrl, "modalUrl");
        Intrinsics.checkNotNullParameter(displayType, "displayType");
        this.modalUrl = modalUrl;
        this.displayType = displayType;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ModalButtonDTO copy$default(ModalButtonDTO modalButtonDTO, String str, String str2, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = modalButtonDTO.modalUrl;
        }
        if ((i11 & 2) != 0) {
            str2 = modalButtonDTO.displayType;
        }
        if ((i11 & 4) != 0) {
            map = modalButtonDTO.trackingInfo;
        }
        return modalButtonDTO.copy(str, str2, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getModalUrl() {
        return this.modalUrl;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDisplayType() {
        return this.displayType;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    @NotNull
    public final ModalButtonDTO copy(@NotNull String modalUrl, @NotNull String displayType, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(modalUrl, "modalUrl");
        Intrinsics.checkNotNullParameter(displayType, "displayType");
        return new ModalButtonDTO(modalUrl, displayType, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModalButtonDTO)) {
            return false;
        }
        ModalButtonDTO modalButtonDTO = (ModalButtonDTO) other;
        return Intrinsics.d(this.modalUrl, modalButtonDTO.modalUrl) && Intrinsics.d(this.displayType, modalButtonDTO.displayType) && Intrinsics.d(this.trackingInfo, modalButtonDTO.trackingInfo);
    }

    @NotNull
    public final String getDisplayType() {
        return this.displayType;
    }

    @NotNull
    public final String getModalUrl() {
        return this.modalUrl;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = g.a(this.modalUrl.hashCode() * 31, 31, this.displayType);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return a11 + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.modalUrl;
        String str2 = this.displayType;
        return P.f(C3660k.d("ModalButtonDTO(modalUrl=", str, ", displayType=", str2, ", trackingInfo="), this.trackingInfo, ")");
    }
}
