package com.vk.catalog2.common.dto.ui;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockDragDropAction;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import xsna.c5g;
import xsna.epx;
import xsna.ho8;
import xsna.j5g;

/* compiled from: UIBlockVideoHide.kt */
/* loaded from: classes16.dex */
public final class UIBlockVideoHide extends UIBlock {
    public static final Serializer.c<UIBlockVideoHide> CREATOR = new b();
    public final List<UIBlock> A;
    public final UIBlockVideo y;
    public final boolean z;

    /* compiled from: UIBlockVideoHide.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.STACKED_LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogViewType.VIDEO_SLIDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<UIBlockVideoHide> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockVideoHide a(Serializer serializer) {
            return new UIBlockVideoHide(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockVideoHide[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public UIBlockVideoHide(UIBlockVideo uIBlockVideo, boolean z) {
        super(r1, r2 != 1 ? r2 != 2 ? CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_HIDE : CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_SLIDER_HIDE : CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_STACKED_HIDE, uIBlockVideo.e, uIBlockVideo.f, uIBlockVideo.g, uIBlockVideo.h, uIBlockVideo.Db(), uIBlockVideo.j, null, null, null, null, null, null, null, 32512, null);
        String str = uIBlockVideo.b;
        int i = a.$EnumSwitchMapping$0[uIBlockVideo.d.ordinal()];
        this.y = uIBlockVideo;
        this.z = z;
        this.A = new ArrayList();
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        VideoFile videoFile;
        String r1;
        UIBlockVideo uIBlockVideo = this.y;
        return (uIBlockVideo == null || (videoFile = uIBlockVideo.B) == null || (r1 = videoFile.r1()) == null) ? this.b : r1;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.i0(this.y);
        serializer.L(this.z ? (byte) 1 : (byte) 0);
        serializer.W(this.A);
    }

    public final ArrayList Pb() {
        List<UIBlock> list = this.A;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((UIBlock) it.next()).b);
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockVideoHide) || !UIBlock.a.b(this, (UIBlock) obj)) {
            return false;
        }
        UIBlockVideoHide uIBlockVideoHide = (UIBlockVideoHide) obj;
        return epx.f(this.y, uIBlockVideoHide.y) && this.z == uIBlockVideoHide.z && epx.f(this.A, uIBlockVideoHide.A);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y, Boolean.valueOf(this.z), this.A);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        String g0;
        VideoFile videoFile;
        StringBuilder sb = new StringBuilder("VideoHide[");
        UIBlockVideo uIBlockVideo = this.y;
        if (uIBlockVideo == null || (videoFile = uIBlockVideo.B) == null || (g0 = videoFile.getTitle()) == null) {
            g0 = j5g.g0(this.A, ", ", null, null, 0, null, 62);
        }
        return ho8.a(sb, g0, ']');
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        UIBlockVideo uIBlockVideo = this.y;
        UIBlockVideo zb = uIBlockVideo != null ? uIBlockVideo.zb() : null;
        boolean z = this.z;
        if (zb != null) {
            return new UIBlockVideoHide(zb, z);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<UIBlock> it = this.A.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().zb());
        }
        return new UIBlockVideoHide(arrayList, z);
    }

    public UIBlockVideoHide(List<? extends UIBlock> list) {
        this(list, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public UIBlockVideoHide(List<? extends UIBlock> list, boolean z) {
        super(r1, r2, r3, r4, r5, r6, r7, r0 != null ? r0.j : null, null, null, null, null, null, null, null, 32512, null);
        Set<UIBlockDragDropAction> Db;
        List list2;
        UserId userId;
        String str;
        CatalogDataType catalogDataType;
        String str2;
        UIBlock uIBlock = (UIBlock) j5g.a0(list);
        String uuid = (uIBlock == null || (str2 = uIBlock.b) == null) ? UUID.randomUUID().toString() : str2;
        CatalogViewType catalogViewType = CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_HIDE;
        UIBlock uIBlock2 = (UIBlock) j5g.a0(list);
        CatalogDataType catalogDataType2 = (uIBlock2 == null || (catalogDataType = uIBlock2.e) == null) ? CatalogDataType.DATA_TYPE_VIDEO_VIDEOS : catalogDataType;
        UIBlock uIBlock3 = (UIBlock) j5g.a0(list);
        String str3 = (uIBlock3 == null || (str = uIBlock3.f) == null) ? "" : str;
        UIBlock uIBlock4 = (UIBlock) j5g.a0(list);
        UserId userId2 = (uIBlock4 == null || (userId = uIBlock4.g) == null) ? UserId.d : userId;
        UIBlock uIBlock5 = (UIBlock) j5g.a0(list);
        List arrayList = (uIBlock5 == null || (list2 = uIBlock5.h) == null) ? new ArrayList() : list2;
        UIBlock uIBlock6 = (UIBlock) j5g.a0(list);
        Set<UIBlockDragDropAction> hashSet = (uIBlock6 == null || (Db = uIBlock6.Db()) == null) ? new HashSet<>() : Db;
        UIBlock uIBlock7 = (UIBlock) j5g.a0(list);
        this.y = null;
        this.z = z;
        this.A = list;
    }

    public UIBlockVideoHide(Serializer serializer) {
        super(serializer);
        this.y = (UIBlockVideo) serializer.G(UIBlockVideo.class.getClassLoader());
        this.z = serializer.m();
        ArrayList k = serializer.k(UIBlock.class);
        this.A = k == null ? new ArrayList() : k;
    }
}
