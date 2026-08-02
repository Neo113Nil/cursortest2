package com.vk.catalog2.common.dto.ui;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockDragDropAction;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.upload.api.VideoUploadEvent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import xsna.epx;
import xsna.i7o0;
import xsna.p4g;
import xsna.vu5;

/* compiled from: UIBlockVideoUpload.kt */
/* loaded from: classes16.dex */
public final class UIBlockVideoUpload extends UIBlock {
    public static final Serializer.c<UIBlockVideoUpload> CREATOR = new a();
    public final VideoUploadEvent y;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockVideoUpload> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockVideoUpload a(Serializer serializer) {
            return new UIBlockVideoUpload(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockVideoUpload[i];
        }
    }

    public UIBlockVideoUpload(String str, String str2, UserId userId, List<String> list, Set<? extends UIBlockDragDropAction> set, UIBlockHint uIBlockHint, VideoUploadEvent videoUploadEvent) {
        super(str, CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_UPLOAD, CatalogDataType.DATA_TYPE_VIDEO_VIDEOS, str2, userId, list, set, uIBlockHint, null, null, null, null, null, null, null, 32512, null);
        this.y = videoUploadEvent;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return String.valueOf(this.y.b.b);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.i0(this.y);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof UIBlockVideoUpload) && UIBlock.a.b(this, (UIBlock) obj)) {
            return epx.f(this.y, ((UIBlockVideoUpload) obj).y);
        }
        return false;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return vu5.b(new StringBuilder("VideoUpload["), this.y.b.b, ']');
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        UserId a2 = UserId.a(this.g);
        ArrayList a3 = i7o0.a(this.h);
        HashSet d = p4g.d(Db());
        UIBlockHint uIBlockHint = this.j;
        UIBlockHint zb = uIBlockHint != null ? uIBlockHint.zb() : null;
        VideoUploadEvent videoUploadEvent = this.y;
        return new UIBlockVideoUpload(this.b, this.f, a2, a3, d, zb, videoUploadEvent.zb(videoUploadEvent.b.k));
    }

    public UIBlockVideoUpload(Serializer serializer) {
        super(serializer);
        this.y = (VideoUploadEvent) serializer.G(VideoUploadEvent.class.getClassLoader());
    }

    public UIBlockVideoUpload(UIBlock uIBlock, VideoUploadEvent videoUploadEvent) {
        super(String.valueOf(videoUploadEvent.b.b), CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_UPLOAD, CatalogDataType.DATA_TYPE_VIDEO_VIDEOS, uIBlock.f, uIBlock.g, uIBlock.h, uIBlock.Db(), uIBlock.j, null, null, null, null, null, null, null, 32512, null);
        this.y = videoUploadEvent;
    }
}
