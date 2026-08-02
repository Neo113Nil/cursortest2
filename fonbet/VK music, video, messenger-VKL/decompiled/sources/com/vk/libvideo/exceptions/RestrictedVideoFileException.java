package com.vk.libvideo.exceptions;

import com.vk.dto.common.VideoFile;

/* compiled from: RestrictedVideoFileException.kt */
/* loaded from: classes14.dex */
public final class RestrictedVideoFileException extends Exception {
    private final VideoFile videoFile;

    public RestrictedVideoFileException(VideoFile videoFile) {
        this.videoFile = videoFile;
    }
}
