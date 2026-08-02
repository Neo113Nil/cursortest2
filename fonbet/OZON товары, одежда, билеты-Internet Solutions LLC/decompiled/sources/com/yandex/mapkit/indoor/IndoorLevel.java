package com.yandex.mapkit.indoor;

import androidx.annotation.NonNull;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class IndoorLevel implements Serializable {

    /* renamed from: id, reason: collision with root package name */
    private String f60724id;
    private boolean isUnderground;
    private String name;

    public IndoorLevel(@NonNull String str, @NonNull String str2, boolean z11) {
        if (str == null) {
            throw new IllegalArgumentException("Required field \"id\" cannot be null");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("Required field \"name\" cannot be null");
        }
        this.f60724id = str;
        this.name = str2;
        this.isUnderground = z11;
    }

    @NonNull
    public String getId() {
        return this.f60724id;
    }

    public boolean getIsUnderground() {
        return this.isUnderground;
    }

    @NonNull
    public String getName() {
        return this.name;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.f60724id = archive.add(this.f60724id, false);
        this.name = archive.add(this.name, false);
        this.isUnderground = archive.add(this.isUnderground);
    }

    public IndoorLevel() {
    }
}
