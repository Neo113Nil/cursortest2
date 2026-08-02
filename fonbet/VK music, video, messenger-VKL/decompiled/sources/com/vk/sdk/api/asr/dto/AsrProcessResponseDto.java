package com.vk.sdk.api.asr.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zr;

/* compiled from: AsrProcessResponseDto.kt */
/* loaded from: classes5.dex */
public final class AsrProcessResponseDto {

    @pmi0("task_id")
    private final String taskId;

    public AsrProcessResponseDto(String str) {
        this.taskId = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AsrProcessResponseDto) && epx.f(this.taskId, ((AsrProcessResponseDto) obj).taskId);
    }

    public final int hashCode() {
        return this.taskId.hashCode();
    }

    public final String toString() {
        return zr.a("AsrProcessResponseDto(taskId=", this.taskId, ")");
    }
}
