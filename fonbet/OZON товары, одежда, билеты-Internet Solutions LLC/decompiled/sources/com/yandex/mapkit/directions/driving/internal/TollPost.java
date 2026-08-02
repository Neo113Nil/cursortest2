package com.yandex.mapkit.directions.driving.internal;

import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class TollPost implements Serializable {

    /* renamed from: id, reason: collision with root package name */
    private Long f60721id;
    private Boolean nonTransactional;
    private PolylinePosition position;
    private Double time_with_traffic;

    public TollPost(@NonNull PolylinePosition polylinePosition, Long l11, Double d11, Boolean bool) {
        if (polylinePosition == null) {
            throw new IllegalArgumentException("Required field \"position\" cannot be null");
        }
        this.position = polylinePosition;
        this.f60721id = l11;
        this.time_with_traffic = d11;
        this.nonTransactional = bool;
    }

    public Long getId() {
        return this.f60721id;
    }

    public Boolean getNonTransactional() {
        return this.nonTransactional;
    }

    @NonNull
    public PolylinePosition getPosition() {
        return this.position;
    }

    public Double getTime_with_traffic() {
        return this.time_with_traffic;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.position = (PolylinePosition) archive.add((Archive) this.position, false, (Class<Archive>) PolylinePosition.class);
        this.f60721id = archive.add(this.f60721id, true);
        this.time_with_traffic = archive.add(this.time_with_traffic, true);
        this.nonTransactional = archive.add(this.nonTransactional, true);
    }

    public TollPost() {
    }
}
