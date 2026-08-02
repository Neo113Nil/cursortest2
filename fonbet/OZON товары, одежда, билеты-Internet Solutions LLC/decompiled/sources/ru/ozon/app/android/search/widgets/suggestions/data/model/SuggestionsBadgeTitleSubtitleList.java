package ru.ozon.app.android.search.widgets.suggestions.data.model;

import C.o0;
import Tz.C4055a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/search/widgets/suggestions/data/model/SuggestionsBadgeTitleSubtitleList;", "", "", "Lru/ozon/app/android/search/widgets/suggestions/data/model/SuggestionsBadgeTitleSubtitleModel;", "cells", "", "islandColor", "backgroundColor", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getCells", "()Ljava/util/List;", "Ljava/lang/String;", "getIslandColor", "getBackgroundColor", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SuggestionsBadgeTitleSubtitleList {
    private final String backgroundColor;

    @NotNull
    private final List<SuggestionsBadgeTitleSubtitleModel> cells;
    private final String islandColor;

    public SuggestionsBadgeTitleSubtitleList(@NotNull List<SuggestionsBadgeTitleSubtitleModel> cells, String str, String str2) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        this.cells = cells;
        this.islandColor = str;
        this.backgroundColor = str2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SuggestionsBadgeTitleSubtitleList)) {
            return false;
        }
        SuggestionsBadgeTitleSubtitleList suggestionsBadgeTitleSubtitleList = (SuggestionsBadgeTitleSubtitleList) other;
        return Intrinsics.d(this.cells, suggestionsBadgeTitleSubtitleList.cells) && Intrinsics.d(this.islandColor, suggestionsBadgeTitleSubtitleList.islandColor) && Intrinsics.d(this.backgroundColor, suggestionsBadgeTitleSubtitleList.backgroundColor);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final List<SuggestionsBadgeTitleSubtitleModel> getCells() {
        return this.cells;
    }

    public final String getIslandColor() {
        return this.islandColor;
    }

    public int hashCode() {
        int hashCode = this.cells.hashCode() * 31;
        String str = this.islandColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.backgroundColor;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<SuggestionsBadgeTitleSubtitleModel> list = this.cells;
        String str = this.islandColor;
        return o0.c(C4055a.a("SuggestionsBadgeTitleSubtitleList(cells=", ", islandColor=", str, ", backgroundColor=", list), this.backgroundColor, ")");
    }
}
