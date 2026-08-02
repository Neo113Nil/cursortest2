package com.yandex.runtime;

import androidx.annotation.NonNull;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class KeyValuePair implements Serializable {
    private String key;
    private String value;

    public KeyValuePair(@NonNull String str, @NonNull String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Required field \"key\" cannot be null");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("Required field \"value\" cannot be null");
        }
        this.key = str;
        this.value = str2;
    }

    @NonNull
    public String getKey() {
        return this.key;
    }

    @NonNull
    public String getValue() {
        return this.value;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.key = archive.add(this.key, false);
        this.value = archive.add(this.value, false);
    }

    public KeyValuePair() {
    }
}
