package ru.ozon.app.android.travel.feature.general.common.widgets.loadingProgressBar.data;

import G.g;
import T7.P;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001cB5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0017\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/loadingProgressBar/data/LoadingProgressBarDTO;", "", "maxLoadingTimeMs", "", "loaderStates", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/loadingProgressBar/data/LoadingProgressBarDTO$LoaderState;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(ILjava/util/List;Ljava/util/Map;)V", "getMaxLoadingTimeMs", "()I", "getLoaderStates", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "LoaderState", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class LoadingProgressBarDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<LoaderState> loaderStates;
    private final int maxLoadingTimeMs;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/loadingProgressBar/data/LoadingProgressBarDTO$LoaderState;", "", "percent", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "<init>", "(ILru/ozon/uni/atoms/data/text/TextDTO;)V", "getPercent", "()I", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LoaderState {
        public static final int $stable = 0;
        private final int percent;

        @NotNull
        private final TextDTO title;

        public LoaderState(int i11, @NotNull TextDTO title) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.percent = i11;
            this.title = title;
        }

        public static /* synthetic */ LoaderState copy$default(LoaderState loaderState, int i11, TextDTO textDTO, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = loaderState.percent;
            }
            if ((i12 & 2) != 0) {
                textDTO = loaderState.title;
            }
            return loaderState.copy(i11, textDTO);
        }

        /* renamed from: component1, reason: from getter */
        public final int getPercent() {
            return this.percent;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        public final LoaderState copy(int percent, @NotNull TextDTO title) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new LoaderState(percent, title);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoaderState)) {
                return false;
            }
            LoaderState loaderState = (LoaderState) other;
            return this.percent == loaderState.percent && Intrinsics.d(this.title, loaderState.title);
        }

        public final int getPercent() {
            return this.percent;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.title.hashCode() + (Integer.hashCode(this.percent) * 31);
        }

        @NotNull
        public String toString() {
            return "LoaderState(percent=" + this.percent + ", title=" + this.title + ")";
        }
    }

    public LoadingProgressBarDTO(int i11, @NotNull List<LoaderState> loaderStates, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(loaderStates, "loaderStates");
        this.maxLoadingTimeMs = i11;
        this.loaderStates = loaderStates;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LoadingProgressBarDTO copy$default(LoadingProgressBarDTO loadingProgressBarDTO, int i11, List list, Map map, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = loadingProgressBarDTO.maxLoadingTimeMs;
        }
        if ((i12 & 2) != 0) {
            list = loadingProgressBarDTO.loaderStates;
        }
        if ((i12 & 4) != 0) {
            map = loadingProgressBarDTO.trackingInfo;
        }
        return loadingProgressBarDTO.copy(i11, list, map);
    }

    /* renamed from: component1, reason: from getter */
    public final int getMaxLoadingTimeMs() {
        return this.maxLoadingTimeMs;
    }

    @NotNull
    public final List<LoaderState> component2() {
        return this.loaderStates;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    @NotNull
    public final LoadingProgressBarDTO copy(int maxLoadingTimeMs, @NotNull List<LoaderState> loaderStates, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(loaderStates, "loaderStates");
        return new LoadingProgressBarDTO(maxLoadingTimeMs, loaderStates, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoadingProgressBarDTO)) {
            return false;
        }
        LoadingProgressBarDTO loadingProgressBarDTO = (LoadingProgressBarDTO) other;
        return this.maxLoadingTimeMs == loadingProgressBarDTO.maxLoadingTimeMs && Intrinsics.d(this.loaderStates, loadingProgressBarDTO.loaderStates) && Intrinsics.d(this.trackingInfo, loadingProgressBarDTO.trackingInfo);
    }

    @NotNull
    public final List<LoaderState> getLoaderStates() {
        return this.loaderStates;
    }

    public final int getMaxLoadingTimeMs() {
        return this.maxLoadingTimeMs;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int b11 = g.b(Integer.hashCode(this.maxLoadingTimeMs) * 31, 31, this.loaderStates);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return b11 + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        int i11 = this.maxLoadingTimeMs;
        List<LoaderState> list = this.loaderStates;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("LoadingProgressBarDTO(maxLoadingTimeMs=");
        sb2.append(i11);
        sb2.append(", loaderStates=");
        sb2.append(list);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }

    public LoadingProgressBarDTO(int i11, List list, Map map, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, (i12 & 2) != 0 ? K.f71697a : list, map);
    }
}
