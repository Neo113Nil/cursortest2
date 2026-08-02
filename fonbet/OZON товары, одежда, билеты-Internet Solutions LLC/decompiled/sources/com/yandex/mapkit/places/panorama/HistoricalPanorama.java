package com.yandex.mapkit.places.panorama;

import androidx.annotation.NonNull;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class HistoricalPanorama implements Serializable {
    private String name;
    private String panoramaId;
    private long timestamp;

    public HistoricalPanorama(@NonNull String str, @NonNull String str2, long j11) {
        if (str == null) {
            throw new IllegalArgumentException("Required field \"name\" cannot be null");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("Required field \"panoramaId\" cannot be null");
        }
        this.name = str;
        this.panoramaId = str2;
        this.timestamp = j11;
    }

    @NonNull
    public String getName() {
        return this.name;
    }

    @NonNull
    public String getPanoramaId() {
        return this.panoramaId;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.name = archive.add(this.name, false);
        this.panoramaId = archive.add(this.panoramaId, false);
        this.timestamp = archive.add(this.timestamp);
    }

    public HistoricalPanorama() {
    }
}
