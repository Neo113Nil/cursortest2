package com.vk.catalog2.common.dto.ui.actions;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogLaunchOrigin;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ShowAllInfo;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockDragDropAction;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import xsna.epx;
import xsna.i7o0;

/* compiled from: UIBlockActionPlayAudiosFromBlock.kt */
/* loaded from: classes16.dex */
public final class UIBlockActionPlayAudiosFromBlock extends UIBlockAction {
    public static final Serializer.c<UIBlockActionPlayAudiosFromBlock> CREATOR = new a();
    public final String A;
    public final boolean B;
    public final List<MusicTrack> C;
    public final ShowAllInfo D;
    public final String z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockActionPlayAudiosFromBlock> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockActionPlayAudiosFromBlock a(Serializer serializer) {
            return new UIBlockActionPlayAudiosFromBlock(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockActionPlayAudiosFromBlock[i];
        }
    }

    public UIBlockActionPlayAudiosFromBlock(String str, CatalogViewType catalogViewType, CatalogDataType catalogDataType, String str2, UserId userId, List<String> list, Set<? extends UIBlockDragDropAction> set, UIBlockHint uIBlockHint, String str3, String str4, String str5, boolean z, List<MusicTrack> list2, ShowAllInfo showAllInfo, CatalogLaunchOrigin catalogLaunchOrigin) {
        super(str, catalogViewType, catalogDataType, str2, userId, list, set, uIBlockHint, str3, null, null, catalogLaunchOrigin, 1536, null);
        this.A = str5;
        this.z = str4;
        this.B = z;
        this.C = list2;
        this.D = showAllInfo;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.z;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.j0(this.z);
        serializer.j0(this.A);
        serializer.L(this.B ? (byte) 1 : (byte) 0);
        serializer.f0(this.C);
        serializer.i0(this.D);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock
    /* renamed from: Rb, reason: merged with bridge method [inline-methods] */
    public final UIBlockActionPlayAudiosFromBlock zb() {
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
        List<MusicTrack> list = this.C;
        ArrayList a4 = list != null ? i7o0.a(list) : null;
        ShowAllInfo showAllInfo = this.D;
        return new UIBlockActionPlayAudiosFromBlock(this.b, this.d, this.e, this.f, a2, a3, hashSet, zb, this.y, this.z, this.A, this.B, a4, showAllInfo != null ? ShowAllInfo.zb(showAllInfo) : null, this.p);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockActionPlayAudiosFromBlock)) {
            return false;
        }
        UIBlockAction uIBlockAction = (UIBlockAction) obj;
        if (!UIBlock.a.b(this, uIBlockAction) || !epx.f(this.y, uIBlockAction.y)) {
            return false;
        }
        UIBlockActionPlayAudiosFromBlock uIBlockActionPlayAudiosFromBlock = (UIBlockActionPlayAudiosFromBlock) obj;
        return epx.f(this.z, uIBlockActionPlayAudiosFromBlock.z) && epx.f(this.A, uIBlockActionPlayAudiosFromBlock.A) && this.B == uIBlockActionPlayAudiosFromBlock.B && epx.f(this.C, uIBlockActionPlayAudiosFromBlock.C) && epx.f(this.D, uIBlockActionPlayAudiosFromBlock.D);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(Integer.valueOf(UIBlock.a.a(this)), this.y)), this.z, this.A, Boolean.valueOf(this.B), this.C, this.D);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return "ACTION[" + this.d + "]: id:" + this.z + " title:" + this.A + " shuffle=" + this.B;
    }

    public UIBlockActionPlayAudiosFromBlock(Serializer serializer) {
        super(serializer);
        String H = serializer.H();
        this.z = H == null ? "" : H;
        String H2 = serializer.H();
        this.A = H2 != null ? H2 : "";
        this.B = serializer.m();
        this.C = serializer.B(MusicTrack.class.getClassLoader());
        this.D = (ShowAllInfo) serializer.G(ShowAllInfo.class.getClassLoader());
    }
}
