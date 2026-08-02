package com.getcapacitor.plugin.camera;

import com.facebook.share.internal.ShareConstants;

/* loaded from: classes8.dex */
public enum CameraSource {
    PROMPT("PROMPT"),
    CAMERA("CAMERA"),
    PHOTOS(ShareConstants.PHOTOS);

    private String source;

    CameraSource(String str) {
        this.source = str;
    }

    public String getSource() {
        return this.source;
    }
}
