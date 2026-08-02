package com.vk.catalog2.common.dto.ui.actions;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockDragDropAction;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.video.VideoAlbum;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import xsna.epx;
import xsna.i7o0;

/* compiled from: UIBlockActionAddVideos.kt */
/* loaded from: classes16.dex */
public final class UIBlockActionAddVideos extends UIBlockAction {
    public static final Serializer.c<UIBlockActionAddVideos> CREATOR = new a();
    public final VideoAlbum A;
    public final String z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockActionAddVideos> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockActionAddVideos a(Serializer serializer) {
            return new UIBlockActionAddVideos(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockActionAddVideos[i];
        }
    }

    public UIBlockActionAddVideos(String str, CatalogViewType catalogViewType, CatalogDataType catalogDataType, String str2, UserId userId, List<String> list, Set<? extends UIBlockDragDropAction> set, UIBlockHint uIBlockHint, String str3, String str4, VideoAlbum videoAlbum) {
        super(str, catalogViewType, catalogDataType, str2, userId, list, set, uIBlockHint, str3, null, null, null, 3584, null);
        this.z = str4;
        this.A = videoAlbum;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.b;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.j0(this.z);
        serializer.e0(this.A);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock
    /* renamed from: Rb, reason: merged with bridge method [inline-methods] */
    public final UIBlockActionAddVideos zb() {
        UserId a2 = UserId.a(this.g);
        ArrayList a3 = i7o0.a(this.h);
        Set<UIBlockDragDropAction> Db = Db();
        HashSet hashSet = new HashSet();
        Iterator<UIBlockDragDropAction> it = Db.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().zb());
        }
        UIBlockHint uIBlockHint = this.j;
        UIBlockHint zb = uIBlockHint != null ? uIBlockHint.zb() : null;
        VideoAlbum videoAlbum = this.A;
        return new UIBlockActionAddVideos(this.b, this.d, this.e, this.f, a2, a3, hashSet, zb, this.y, this.z, videoAlbum != null ? VideoAlbum.Ab(videoAlbum, false, null, 262143) : null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockActionAddVideos)) {
            return false;
        }
        UIBlockAction uIBlockAction = (UIBlockAction) obj;
        if (!UIBlock.a.b(this, uIBlockAction) || !epx.f(this.y, uIBlockAction.y)) {
            return false;
        }
        UIBlockActionAddVideos uIBlockActionAddVideos = (UIBlockActionAddVideos) obj;
        return epx.f(this.z, uIBlockActionAddVideos.z) && epx.f(this.A, uIBlockActionAddVideos.A);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(Integer.valueOf(UIBlock.a.a(this)), this.y)), this.z, this.A);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return "ACTION[" + this.d + "]: id:" + this.b + " title:" + this.z + " album:" + this.A;
    }

    public UIBlockActionAddVideos(Serializer serializer) {
        super(serializer);
        String H = serializer.H();
        this.z = H == null ? "" : H;
        this.A = (VideoAlbum) serializer.A(VideoAlbum.class.getClassLoader());
    }
}
