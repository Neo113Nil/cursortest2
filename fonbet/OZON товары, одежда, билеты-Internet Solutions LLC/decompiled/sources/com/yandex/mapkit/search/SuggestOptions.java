package com.yandex.mapkit.search;

import com.yandex.mapkit.geometry.Point;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public final class SuggestOptions implements Serializable {
    private boolean strictBounds;
    private int suggestTypes;
    private boolean suggestWords;
    private Point userPosition;

    public SuggestOptions(int i11, Point point, boolean z11, boolean z12) {
        int i12 = SuggestType.UNSPECIFIED.value;
        this.suggestTypes = i11;
        this.userPosition = point;
        this.suggestWords = z11;
        this.strictBounds = z12;
    }

    public boolean getStrictBounds() {
        return this.strictBounds;
    }

    public int getSuggestTypes() {
        return this.suggestTypes;
    }

    public boolean getSuggestWords() {
        return this.suggestWords;
    }

    public Point getUserPosition() {
        return this.userPosition;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.suggestTypes = archive.add(Integer.valueOf(this.suggestTypes), false).intValue();
        this.userPosition = (Point) archive.add((Archive) this.userPosition, true, (Class<Archive>) Point.class);
        this.suggestWords = archive.add(this.suggestWords);
        this.strictBounds = archive.add(this.strictBounds);
    }

    public SuggestOptions setStrictBounds(boolean z11) {
        this.strictBounds = z11;
        return this;
    }

    public SuggestOptions setSuggestTypes(int i11) {
        this.suggestTypes = i11;
        return this;
    }

    public SuggestOptions setSuggestWords(boolean z11) {
        this.suggestWords = z11;
        return this;
    }

    public SuggestOptions setUserPosition(Point point) {
        this.userPosition = point;
        return this;
    }

    public SuggestOptions() {
        this.suggestTypes = SuggestType.UNSPECIFIED.value;
        this.userPosition = null;
        this.suggestWords = false;
        this.strictBounds = false;
    }
}
