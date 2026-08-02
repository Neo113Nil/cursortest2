package com.vk.catalog2.common.dto.ui;

import android.os.Parcel;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogLaunchOrigin;
import com.vk.catalog2.common.dto.api.CatalogOnboardingInfo;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockDragDropAction;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.video.VideoAlbum;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.collections.EmptyList;
import xsna.dfp0;
import xsna.epx;
import xsna.ho8;
import xsna.i7o0;
import xsna.ozl;
import xsna.zcl;

/* compiled from: UIBlockVideoAlbum.kt */
/* loaded from: classes16.dex */
public final class UIBlockVideoAlbum extends UIBlock implements dfp0 {
    public static final Serializer.c<UIBlockVideoAlbum> CREATOR = new a();
    public boolean A;
    public final String B;
    public final Image C;
    public final VerifyInfo D;
    public final boolean E;
    public final VideoAlbum y;
    public final List<UIBlockAction> z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockVideoAlbum> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockVideoAlbum a(Serializer serializer) {
            return new UIBlockVideoAlbum(serializer, null, null, null, false);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockVideoAlbum[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UIBlockVideoAlbum(com.vk.catalog2.common.dto.api.ui.a aVar, VideoAlbum videoAlbum, List<? extends UIBlockAction> list, boolean z, String str, Image image, VerifyInfo verifyInfo, boolean z2) {
        super(aVar);
        this.y = videoAlbum;
        this.z = list;
        this.A = z;
        this.B = str;
        this.C = image;
        this.D = verifyInfo;
        this.E = z2;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.y.zb();
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.i0(this.y);
        serializer.f0(this.z);
        serializer.L(this.A ? (byte) 1 : (byte) 0);
    }

    public final String P() {
        return this.B;
    }

    public final VideoAlbum Pb() {
        return this.y;
    }

    public final Image Qb() {
        return this.C;
    }

    public final VerifyInfo Rb() {
        return this.D;
    }

    public final boolean Sb() {
        return this.A;
    }

    public final boolean Tb() {
        return this.E;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockVideoAlbum) || !UIBlock.a.b(this, (UIBlock) obj)) {
            return false;
        }
        UIBlockVideoAlbum uIBlockVideoAlbum = (UIBlockVideoAlbum) obj;
        return epx.f(this.y, uIBlockVideoAlbum.y) && epx.f(this.z, uIBlockVideoAlbum.z) && this.A == uIBlockVideoAlbum.A;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y, this.z, Boolean.valueOf(this.A));
    }

    @Override // xsna.dfp0
    public final String r() {
        return this.y.n;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoAlbum[");
        sb.append(this.y.d);
        sb.append(' ');
        return ho8.a(sb, Nb() ? "(editable)" : "", ']');
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        Image image;
        VerifyInfo verifyInfo;
        Parcel obtain;
        com.vk.catalog2.common.dto.api.ui.a Ab = Ab();
        VideoAlbum Ab2 = VideoAlbum.Ab(this.y, false, null, 262143);
        ArrayList a2 = i7o0.a(this.z);
        boolean z = this.A;
        Image image2 = this.C;
        if (image2 != null) {
            obtain = Parcel.obtain();
            try {
                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                Serializer.g gVar = new Serializer.g(obtain);
                gVar.i0(image2);
                obtain.setDataPosition(0);
                Serializer.StreamParcelable G = gVar.G(Image.class.getClassLoader());
                obtain.recycle();
                image = (Image) G;
            } finally {
            }
        } else {
            image = null;
        }
        VerifyInfo verifyInfo2 = this.D;
        if (verifyInfo2 != null) {
            obtain = Parcel.obtain();
            try {
                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap2 = Serializer.a;
                Serializer.g gVar2 = new Serializer.g(obtain);
                gVar2.i0(verifyInfo2);
                obtain.setDataPosition(0);
                Serializer.StreamParcelable G2 = gVar2.G(VerifyInfo.class.getClassLoader());
                obtain.recycle();
                verifyInfo = (VerifyInfo) G2;
            } finally {
            }
        } else {
            verifyInfo = null;
        }
        return new UIBlockVideoAlbum(Ab, Ab2, a2, z, this.B, image, verifyInfo, false);
    }

    @ozl
    public UIBlockVideoAlbum(String str, CatalogViewType catalogViewType, CatalogDataType catalogDataType, String str2, UserId userId, List<String> list, VideoAlbum videoAlbum, Set<? extends UIBlockDragDropAction> set, UIBlockHint uIBlockHint, List<? extends UIBlockAction> list2, boolean z, String str3, Image image, VerifyInfo verifyInfo, boolean z2) {
        this(new com.vk.catalog2.common.dto.api.ui.a(str, "", catalogViewType, catalogDataType, str2, userId, list, set, uIBlockHint, (CatalogViewStyle) null, (CatalogOnboardingInfo) null, (CatalogLaunchOrigin) null, 7680), videoAlbum, list2, z, str3, image, verifyInfo, z2);
    }

    public UIBlockVideoAlbum(String str, CatalogViewType catalogViewType, CatalogDataType catalogDataType, String str2, UserId userId, List list, VideoAlbum videoAlbum, Set set, UIBlockHint uIBlockHint, List list2, boolean z, String str3, Image image, VerifyInfo verifyInfo, boolean z2, int i, zcl zclVar) {
        this(str, catalogViewType, catalogDataType, str2, userId, list, videoAlbum, set, (i & 256) != 0 ? null : uIBlockHint, (i & 512) != 0 ? EmptyList.b : list2, z, (i & 2048) != 0 ? null : str3, (i & 4096) != 0 ? null : image, (i & 8192) != 0 ? null : verifyInfo, (i & 16384) != 0 ? false : z2);
    }

    public UIBlockVideoAlbum(Serializer serializer, String str, Image image, VerifyInfo verifyInfo, boolean z) {
        super(serializer);
        this.y = (VideoAlbum) serializer.G(VideoAlbum.class.getClassLoader());
        this.z = serializer.B(UIBlockAction.class.getClassLoader());
        this.A = serializer.m();
        this.B = str;
        this.C = image;
        this.D = verifyInfo;
        this.E = z;
    }
}
