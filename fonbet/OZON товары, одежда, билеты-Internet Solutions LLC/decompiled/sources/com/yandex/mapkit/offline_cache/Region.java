package com.yandex.mapkit.offline_cache;

import androidx.annotation.NonNull;
import com.yandex.mapkit.LocalizedValue;
import com.yandex.mapkit.geometry.Point;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class Region implements Serializable {
    private Point center;
    private String country;

    /* renamed from: id, reason: collision with root package name */
    private int f60725id;
    private String name;
    private Integer parentId;
    private long releaseTime;
    private LocalizedValue size;

    public Region(int i11, @NonNull String str, @NonNull String str2, @NonNull Point point, @NonNull LocalizedValue localizedValue, long j11, Integer num) {
        if (str == null) {
            throw new IllegalArgumentException("Required field \"name\" cannot be null");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("Required field \"country\" cannot be null");
        }
        if (point == null) {
            throw new IllegalArgumentException("Required field \"center\" cannot be null");
        }
        if (localizedValue == null) {
            throw new IllegalArgumentException("Required field \"size\" cannot be null");
        }
        this.f60725id = i11;
        this.name = str;
        this.country = str2;
        this.center = point;
        this.size = localizedValue;
        this.releaseTime = j11;
        this.parentId = num;
    }

    @NonNull
    public Point getCenter() {
        return this.center;
    }

    @NonNull
    public String getCountry() {
        return this.country;
    }

    public int getId() {
        return this.f60725id;
    }

    @NonNull
    public String getName() {
        return this.name;
    }

    public Integer getParentId() {
        return this.parentId;
    }

    public long getReleaseTime() {
        return this.releaseTime;
    }

    @NonNull
    public LocalizedValue getSize() {
        return this.size;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.f60725id = archive.add(this.f60725id);
        this.name = archive.add(this.name, false);
        this.country = archive.add(this.country, false);
        this.center = (Point) archive.add((Archive) this.center, false, (Class<Archive>) Point.class);
        this.size = (LocalizedValue) archive.add((Archive) this.size, false, (Class<Archive>) LocalizedValue.class);
        this.releaseTime = archive.add(this.releaseTime);
        this.parentId = archive.add(this.parentId, true);
    }

    public Region() {
    }
}
