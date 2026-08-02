package com.yandex.mapkit.transport.masstransit;

import androidx.annotation.NonNull;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class IndoorLevel implements Serializable {
    private String levelId;
    private String levelName;

    public IndoorLevel(@NonNull String str, @NonNull String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Required field \"levelId\" cannot be null");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("Required field \"levelName\" cannot be null");
        }
        this.levelId = str;
        this.levelName = str2;
    }

    @NonNull
    public String getLevelId() {
        return this.levelId;
    }

    @NonNull
    public String getLevelName() {
        return this.levelName;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.levelId = archive.add(this.levelId, false);
        this.levelName = archive.add(this.levelName, false);
    }

    public IndoorLevel() {
    }
}
