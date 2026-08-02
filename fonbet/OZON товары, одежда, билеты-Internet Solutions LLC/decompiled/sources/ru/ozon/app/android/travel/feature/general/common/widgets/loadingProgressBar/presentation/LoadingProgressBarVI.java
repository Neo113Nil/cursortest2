package ru.ozon.app.android.travel.feature.general.common.widgets.loadingProgressBar.presentation;

import B0.C2454a;
import G.g;
import Lh.a;
import Pk0.b;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00020\u0001:\u0001'B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/loadingProgressBar/presentation/LoadingProgressBarVI;", "Ll20/c;", "", "id", "", "maxLoadingTimeMs", "", "targetProgressValue", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/loadingProgressBar/presentation/LoadingProgressBarVI$LoaderState;", "loaderStates", "LWZ/t;", "trackingInfo", "<init>", "(JIFLjava/util/List;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "I", "getMaxLoadingTimeMs", "F", "getTargetProgressValue", "()F", "Ljava/util/List;", "getLoaderStates", "()Ljava/util/List;", "LWZ/t;", "getTrackingInfo", "()LWZ/t;", "LoaderState", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class LoadingProgressBarVI implements c {
    private final long id;

    @NotNull
    private final List<LoaderState> loaderStates;
    private final int maxLoadingTimeMs;
    private final float targetProgressValue;
    private final t trackingInfo;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/loadingProgressBar/presentation/LoadingProgressBarVI$LoaderState;", "", "", "percent", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "<init>", "(FLru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getPercent", "()F", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LoaderState {
        private final float percent;

        @NotNull
        private final TextDTO title;

        public LoaderState(float f7, @NotNull TextDTO title) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.percent = f7;
            this.title = title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoaderState)) {
                return false;
            }
            LoaderState loaderState = (LoaderState) other;
            return Float.compare(this.percent, loaderState.percent) == 0 && Intrinsics.d(this.title, loaderState.title);
        }

        public final float getPercent() {
            return this.percent;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.title.hashCode() + (Float.hashCode(this.percent) * 31);
        }

        @NotNull
        public String toString() {
            return "LoaderState(percent=" + this.percent + ", title=" + this.title + ")";
        }
    }

    public LoadingProgressBarVI(long j11, int i11, float f7, @NotNull List<LoaderState> loaderStates, t tVar) {
        Intrinsics.checkNotNullParameter(loaderStates, "loaderStates");
        this.id = j11;
        this.maxLoadingTimeMs = i11;
        this.targetProgressValue = f7;
        this.loaderStates = loaderStates;
        this.trackingInfo = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoadingProgressBarVI)) {
            return false;
        }
        LoadingProgressBarVI loadingProgressBarVI = (LoadingProgressBarVI) other;
        return this.id == loadingProgressBarVI.id && this.maxLoadingTimeMs == loadingProgressBarVI.maxLoadingTimeMs && Float.compare(this.targetProgressValue, loadingProgressBarVI.targetProgressValue) == 0 && Intrinsics.d(this.loaderStates, loadingProgressBarVI.loaderStates) && Intrinsics.d(this.trackingInfo, loadingProgressBarVI.trackingInfo);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<LoaderState> getLoaderStates() {
        return this.loaderStates;
    }

    public final int getMaxLoadingTimeMs() {
        return this.maxLoadingTimeMs;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final float getTargetProgressValue() {
        return this.targetProgressValue;
    }

    public final t getTrackingInfo() {
        return this.trackingInfo;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b(b.a(this.targetProgressValue, C2454a.a(this.maxLoadingTimeMs, Long.hashCode(this.id) * 31, 31), 31), 31, this.loaderStates);
        t tVar = this.trackingInfo;
        return b11 + (tVar == null ? 0 : tVar.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        int i11 = this.maxLoadingTimeMs;
        float f7 = this.targetProgressValue;
        List<LoaderState> list = this.loaderStates;
        t tVar = this.trackingInfo;
        StringBuilder b11 = Ql.c.b(j11, "LoadingProgressBarVI(id=", i11, ", maxLoadingTimeMs=");
        b11.append(", targetProgressValue=");
        b11.append(f7);
        b11.append(", loaderStates=");
        b11.append(list);
        return a.b(b11, ", trackingInfo=", tVar, ")");
    }
}
