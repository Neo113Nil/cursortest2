package com.yandex.mapkit.search;

import androidx.annotation.NonNull;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class Chain implements Serializable {

    /* renamed from: id, reason: collision with root package name */
    private String f60739id;
    private String name;

    public Chain(@NonNull String str, @NonNull String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Required field \"id\" cannot be null");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("Required field \"name\" cannot be null");
        }
        this.f60739id = str;
        this.name = str2;
    }

    @NonNull
    public String getId() {
        return this.f60739id;
    }

    @NonNull
    public String getName() {
        return this.name;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.f60739id = archive.add(this.f60739id, false);
        this.name = archive.add(this.name, false);
    }

    public Chain() {
    }
}
