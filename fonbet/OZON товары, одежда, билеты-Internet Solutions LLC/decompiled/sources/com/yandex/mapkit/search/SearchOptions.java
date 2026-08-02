package com.yandex.mapkit.search;

import com.yandex.mapkit.geometry.Point;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public final class SearchOptions implements Serializable {
    private boolean disableSpellingCorrection;
    private FilterCollection filters;
    private boolean geometry;
    private String origin;
    private Integer resultPageSize;
    private int searchTypes;
    private int snippets;
    private Point userPosition;

    public SearchOptions(int i11, Integer num, int i12, Point point, String str, boolean z11, boolean z12, FilterCollection filterCollection) {
        this.searchTypes = SearchType.NONE.value;
        this.resultPageSize = null;
        int i13 = Snippet.NONE.value;
        this.searchTypes = i11;
        this.resultPageSize = num;
        this.snippets = i12;
        this.userPosition = point;
        this.origin = str;
        this.geometry = z11;
        this.disableSpellingCorrection = z12;
        this.filters = filterCollection;
    }

    public boolean getDisableSpellingCorrection() {
        return this.disableSpellingCorrection;
    }

    public FilterCollection getFilters() {
        return this.filters;
    }

    public boolean getGeometry() {
        return this.geometry;
    }

    public String getOrigin() {
        return this.origin;
    }

    public Integer getResultPageSize() {
        return this.resultPageSize;
    }

    public int getSearchTypes() {
        return this.searchTypes;
    }

    public int getSnippets() {
        return this.snippets;
    }

    public Point getUserPosition() {
        return this.userPosition;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.searchTypes = archive.add(Integer.valueOf(this.searchTypes), false).intValue();
        this.resultPageSize = archive.add(this.resultPageSize, true);
        this.snippets = archive.add(Integer.valueOf(this.snippets), false).intValue();
        this.userPosition = (Point) archive.add((Archive) this.userPosition, true, (Class<Archive>) Point.class);
        this.origin = archive.add(this.origin, true);
        this.geometry = archive.add(this.geometry);
        this.disableSpellingCorrection = archive.add(this.disableSpellingCorrection);
        this.filters = (FilterCollection) archive.add((Archive) this.filters, true, (Class<Archive>) FilterCollection.class);
    }

    public SearchOptions setDisableSpellingCorrection(boolean z11) {
        this.disableSpellingCorrection = z11;
        return this;
    }

    public SearchOptions setFilters(FilterCollection filterCollection) {
        this.filters = filterCollection;
        return this;
    }

    public SearchOptions setGeometry(boolean z11) {
        this.geometry = z11;
        return this;
    }

    public SearchOptions setOrigin(String str) {
        this.origin = str;
        return this;
    }

    public SearchOptions setResultPageSize(Integer num) {
        this.resultPageSize = num;
        return this;
    }

    public SearchOptions setSearchTypes(int i11) {
        this.searchTypes = i11;
        return this;
    }

    public SearchOptions setSnippets(int i11) {
        this.snippets = i11;
        return this;
    }

    public SearchOptions setUserPosition(Point point) {
        this.userPosition = point;
        return this;
    }

    public SearchOptions() {
        this.searchTypes = SearchType.NONE.value;
        this.resultPageSize = null;
        this.snippets = Snippet.NONE.value;
        this.userPosition = null;
        this.origin = null;
        this.geometry = false;
        this.disableSpellingCorrection = false;
        this.filters = null;
    }
}
