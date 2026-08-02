package com.vk.catalog2.common.dto.ui.actions;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.VideoFile;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import xsna.epx;
import xsna.i7o0;
import xsna.zcl;

/* compiled from: UIBlockActionPlayVideosFromBlock.kt */
/* loaded from: classes16.dex */
public final class UIBlockActionPlayVideosFromBlock extends UIBlockAction {
    public static final Serializer.c<UIBlockActionPlayVideosFromBlock> CREATOR = new a();
    public final String A;
    public final String B;
    public final List<VideoFile> C;
    public final String z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockActionPlayVideosFromBlock> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockActionPlayVideosFromBlock a(Serializer serializer) {
            return new UIBlockActionPlayVideosFromBlock(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockActionPlayVideosFromBlock[i];
        }
    }

    public /* synthetic */ UIBlockActionPlayVideosFromBlock(com.vk.catalog2.common.dto.api.ui.a aVar, String str, String str2, String str3, String str4, List list, int i, zcl zclVar) {
        this(aVar, str, str2, str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : list);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.b;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.j0(this.z);
        serializer.j0(this.B);
        serializer.f0(this.C);
        serializer.j0(this.A);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction
    /* renamed from: Pb */
    public final UIBlockAction zb() {
        List<VideoFile> list = this.C;
        return Rb(list != null ? i7o0.a(list) : null);
    }

    public final UIBlockActionPlayVideosFromBlock Rb(ArrayList arrayList) {
        return new UIBlockActionPlayVideosFromBlock(Ab(), this.y, this.z, this.A, this.B, arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockActionPlayVideosFromBlock)) {
            return false;
        }
        UIBlockAction uIBlockAction = (UIBlockAction) obj;
        if (!UIBlock.a.b(this, uIBlockAction) || !epx.f(this.y, uIBlockAction.y)) {
            return false;
        }
        UIBlockActionPlayVideosFromBlock uIBlockActionPlayVideosFromBlock = (UIBlockActionPlayVideosFromBlock) obj;
        return epx.f(this.z, uIBlockActionPlayVideosFromBlock.z) && epx.f(this.A, uIBlockActionPlayVideosFromBlock.A) && epx.f(this.B, uIBlockActionPlayVideosFromBlock.B) && epx.f(this.C, uIBlockActionPlayVideosFromBlock.C);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(Integer.valueOf(UIBlock.a.a(this)), this.y)), this.z, this.B, this.C, this.A);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return "ACTION[" + this.d + "]: id:" + this.b + " title:" + this.z + " style:" + this.A;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        List<VideoFile> list = this.C;
        return Rb(list != null ? i7o0.a(list) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UIBlockActionPlayVideosFromBlock(com.vk.catalog2.common.dto.api.ui.a aVar, String str, String str2, String str3, String str4, List<? extends VideoFile> list) {
        super(aVar, str);
        this.z = str2;
        this.A = str3;
        this.B = str4;
        this.C = list;
    }

    public UIBlockActionPlayVideosFromBlock(Serializer serializer) {
        super(serializer);
        String H = serializer.H();
        this.z = H == null ? "" : H;
        this.B = serializer.H();
        this.C = serializer.B(VideoFile.class.getClassLoader());
        this.A = serializer.H();
    }
}
