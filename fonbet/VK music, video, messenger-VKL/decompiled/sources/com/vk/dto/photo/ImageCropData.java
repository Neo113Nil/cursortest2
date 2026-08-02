package com.vk.dto.photo;

import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.vu5;
import xsna.zcl;

/* compiled from: ImageCropData.kt */
/* loaded from: classes18.dex */
public final class ImageCropData {

    @pmi0("height")
    private final int height;

    @pmi0("photo_id")
    private String photoId;

    @pmi0("width")
    private final int width;

    @pmi0("x")
    private final int x;

    @pmi0("y")
    private final int y;

    public ImageCropData(String str, int i, int i2, int i3, int i4) {
        this.photoId = str;
        this.x = i;
        this.y = i2;
        this.width = i3;
        this.height = i4;
    }

    public final int a() {
        return this.height;
    }

    public final String b() {
        return this.photoId;
    }

    public final int c() {
        return this.width;
    }

    public final int d() {
        return this.x;
    }

    public final int e() {
        return this.y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageCropData)) {
            return false;
        }
        ImageCropData imageCropData = (ImageCropData) obj;
        return epx.f(this.photoId, imageCropData.photoId) && this.x == imageCropData.x && this.y == imageCropData.y && this.width == imageCropData.width && this.height == imageCropData.height;
    }

    public final void f(String str) {
        this.photoId = str;
    }

    public final int hashCode() {
        return Integer.hashCode(this.height) + shy.a(this.width, shy.a(this.y, shy.a(this.x, this.photoId.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageCropData(photoId=");
        sb.append(this.photoId);
        sb.append(", x=");
        sb.append(this.x);
        sb.append(", y=");
        sb.append(this.y);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        return vu5.b(sb, this.height, ')');
    }

    public /* synthetic */ ImageCropData(String str, int i, int i2, int i3, int i4, int i5, zcl zclVar) {
        this((i5 & 1) != 0 ? "" : str, i, i2, i3, i4);
    }
}
