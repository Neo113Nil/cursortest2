package ru.ozon.app.android.ugc.core.widgets.listreviews.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.listreviews.data.ListReviewsDTO;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/listreviews/data/SortsWrapper;", "", "", "Lru/ozon/app/android/ugc/core/widgets/listreviews/data/ListReviewsDTO$Sort;", "sort", "", "bottomPaddingEnabled", "<init>", "(Ljava/util/List;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getSort", "()Ljava/util/List;", "Z", "getBottomPaddingEnabled", "()Z", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SortsWrapper {
    private final boolean bottomPaddingEnabled;

    @NotNull
    private final List<ListReviewsDTO.Sort> sort;

    public SortsWrapper(@NotNull List<ListReviewsDTO.Sort> sort, boolean z11) {
        Intrinsics.checkNotNullParameter(sort, "sort");
        this.sort = sort;
        this.bottomPaddingEnabled = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SortsWrapper)) {
            return false;
        }
        SortsWrapper sortsWrapper = (SortsWrapper) other;
        return Intrinsics.d(this.sort, sortsWrapper.sort) && this.bottomPaddingEnabled == sortsWrapper.bottomPaddingEnabled;
    }

    public final boolean getBottomPaddingEnabled() {
        return this.bottomPaddingEnabled;
    }

    @NotNull
    public final List<ListReviewsDTO.Sort> getSort() {
        return this.sort;
    }

    public int hashCode() {
        return Boolean.hashCode(this.bottomPaddingEnabled) + (this.sort.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "SortsWrapper(sort=" + this.sort + ", bottomPaddingEnabled=" + this.bottomPaddingEnabled + ")";
    }

    public /* synthetic */ SortsWrapper(List list, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i11 & 2) != 0 ? true : z11);
    }
}
