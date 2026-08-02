package com.vk.sdk.api.storage.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.ss9;

/* compiled from: StorageValueDto.kt */
/* loaded from: classes5.dex */
public final class StorageValueDto {

    @pmi0("key")
    private final String key;

    @pmi0("value")
    private final String value;

    public StorageValueDto(String str, String str2) {
        this.key = str;
        this.value = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StorageValueDto)) {
            return false;
        }
        StorageValueDto storageValueDto = (StorageValueDto) obj;
        return epx.f(this.key, storageValueDto.key) && epx.f(this.value, storageValueDto.value);
    }

    public final int hashCode() {
        return this.value.hashCode() + (this.key.hashCode() * 31);
    }

    public final String toString() {
        return ss9.a("StorageValueDto(key=", this.key, ", value=", this.value, ")");
    }
}
