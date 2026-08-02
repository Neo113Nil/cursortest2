package ru.ozon.app.android.search.widgets.suggestions.data.model;

import Bi.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\n¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/search/widgets/suggestions/data/model/SuggestionsTitleSubtitleList;", "", "", "Lru/ozon/app/android/search/widgets/suggestions/data/model/SuggestionsTitleSubtitleModel;", "cells", "", "islandColor", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getCells", "()Ljava/util/List;", "Ljava/lang/String;", "getIslandColor", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SuggestionsTitleSubtitleList {

    @NotNull
    private final List<SuggestionsTitleSubtitleModel> cells;
    private final String islandColor;

    public SuggestionsTitleSubtitleList(@NotNull List<SuggestionsTitleSubtitleModel> cells, String str) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        this.cells = cells;
        this.islandColor = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SuggestionsTitleSubtitleList)) {
            return false;
        }
        SuggestionsTitleSubtitleList suggestionsTitleSubtitleList = (SuggestionsTitleSubtitleList) other;
        return Intrinsics.d(this.cells, suggestionsTitleSubtitleList.cells) && Intrinsics.d(this.islandColor, suggestionsTitleSubtitleList.islandColor);
    }

    @NotNull
    public final List<SuggestionsTitleSubtitleModel> getCells() {
        return this.cells;
    }

    public final String getIslandColor() {
        return this.islandColor;
    }

    public int hashCode() {
        int hashCode = this.cells.hashCode() * 31;
        String str = this.islandColor;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return b.e("SuggestionsTitleSubtitleList(cells=", ", islandColor=", this.islandColor, ")", this.cells);
    }
}
