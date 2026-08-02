package com.yandex.mapkit.search;

import androidx.annotation.NonNull;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class Sort implements Serializable {
    private SortOrigin origin;
    private SortType type;

    public Sort(@NonNull SortType sortType, SortOrigin sortOrigin) {
        if (sortType == null) {
            throw new IllegalArgumentException("Required field \"type\" cannot be null");
        }
        this.type = sortType;
        this.origin = sortOrigin;
    }

    public SortOrigin getOrigin() {
        return this.origin;
    }

    @NonNull
    public SortType getType() {
        return this.type;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.type = (SortType) archive.add((Archive) this.type, false, (Class<Archive>) SortType.class);
        this.origin = (SortOrigin) archive.add((Archive) this.origin, true, (Class<Archive>) SortOrigin.class);
    }

    public Sort() {
    }
}
