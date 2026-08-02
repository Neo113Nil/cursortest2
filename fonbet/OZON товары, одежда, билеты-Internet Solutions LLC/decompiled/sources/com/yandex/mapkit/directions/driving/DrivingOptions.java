package com.yandex.mapkit.directions.driving;

import com.yandex.mapkit.annotations.AnnotationLanguage;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public final class DrivingOptions implements Serializable {
    private AnnotationLanguage annotationLanguage;
    private AvoidanceFlags avoidanceFlags;
    private Long departureTime;
    private Double initialAzimuth;
    private Integer routesCount;

    public DrivingOptions(Double d11, Integer num, Long l11, AnnotationLanguage annotationLanguage, AvoidanceFlags avoidanceFlags) {
        this.initialAzimuth = d11;
        this.routesCount = num;
        this.departureTime = l11;
        this.annotationLanguage = annotationLanguage;
        this.avoidanceFlags = avoidanceFlags;
    }

    public AnnotationLanguage getAnnotationLanguage() {
        return this.annotationLanguage;
    }

    public AvoidanceFlags getAvoidanceFlags() {
        return this.avoidanceFlags;
    }

    public Long getDepartureTime() {
        return this.departureTime;
    }

    public Double getInitialAzimuth() {
        return this.initialAzimuth;
    }

    public Integer getRoutesCount() {
        return this.routesCount;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.initialAzimuth = archive.add(this.initialAzimuth, true);
        this.routesCount = archive.add(this.routesCount, true);
        this.departureTime = archive.add(this.departureTime, true);
        this.annotationLanguage = (AnnotationLanguage) archive.add((Archive) this.annotationLanguage, true, (Class<Archive>) AnnotationLanguage.class);
        this.avoidanceFlags = (AvoidanceFlags) archive.add((Archive) this.avoidanceFlags, true, (Class<Archive>) AvoidanceFlags.class);
    }

    public DrivingOptions setAnnotationLanguage(AnnotationLanguage annotationLanguage) {
        this.annotationLanguage = annotationLanguage;
        return this;
    }

    public DrivingOptions setAvoidanceFlags(AvoidanceFlags avoidanceFlags) {
        this.avoidanceFlags = avoidanceFlags;
        return this;
    }

    public DrivingOptions setDepartureTime(Long l11) {
        this.departureTime = l11;
        return this;
    }

    public DrivingOptions setInitialAzimuth(Double d11) {
        this.initialAzimuth = d11;
        return this;
    }

    public DrivingOptions setRoutesCount(Integer num) {
        this.routesCount = num;
        return this;
    }

    public DrivingOptions() {
        this.initialAzimuth = null;
        this.routesCount = null;
        this.departureTime = null;
        this.annotationLanguage = null;
        this.avoidanceFlags = null;
    }
}
