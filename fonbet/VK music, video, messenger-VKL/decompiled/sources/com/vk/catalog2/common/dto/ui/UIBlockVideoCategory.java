package com.vk.catalog2.common.dto.ui;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.core.serialize.Serializer;
import com.vk.dto.video.LiveCategory;
import java.util.List;
import java.util.Objects;
import kotlin.collections.EmptyList;
import xsna.dfp0;
import xsna.epx;
import xsna.ho8;
import xsna.i7o0;
import xsna.zcl;

/* compiled from: UIBlockVideoCategory.kt */
/* loaded from: classes16.dex */
public final class UIBlockVideoCategory extends UIBlock implements dfp0 {
    public static final Serializer.c<UIBlockVideoCategory> CREATOR = new a();
    public final LiveCategory y;
    public final List<UIBlockAction> z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockVideoCategory> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockVideoCategory a(Serializer serializer) {
            return new UIBlockVideoCategory(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockVideoCategory[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UIBlockVideoCategory(com.vk.catalog2.common.dto.api.ui.a aVar, LiveCategory liveCategory, List<? extends UIBlockAction> list) {
        super(aVar);
        this.y = liveCategory;
        this.z = list;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        String str = this.y.b;
        return str == null ? "" : str;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.i0(this.y);
        serializer.f0(this.z);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockVideoCategory) || !UIBlock.a.b(this, (UIBlock) obj)) {
            return false;
        }
        UIBlockVideoCategory uIBlockVideoCategory = (UIBlockVideoCategory) obj;
        return epx.f(this.y, uIBlockVideoCategory.y) && epx.f(this.z, uIBlockVideoCategory.z);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y, this.z);
    }

    @Override // xsna.dfp0
    public final String r() {
        return this.y.b;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoCategory[");
        sb.append(this.y.c);
        sb.append(' ');
        return ho8.a(sb, Nb() ? "(editable)" : "", ']');
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        com.vk.catalog2.common.dto.api.ui.a Ab = Ab();
        LiveCategory liveCategory = this.y;
        return new UIBlockVideoCategory(Ab, new LiveCategory(liveCategory.b, liveCategory.c, liveCategory.d, liveCategory.e, liveCategory.f), i7o0.a(this.z));
    }

    public UIBlockVideoCategory(Serializer serializer) {
        super(serializer);
        this.y = (LiveCategory) serializer.G(LiveCategory.class.getClassLoader());
        this.z = serializer.B(UIBlockAction.class.getClassLoader());
    }

    public UIBlockVideoCategory(com.vk.catalog2.common.dto.api.ui.a aVar, LiveCategory liveCategory, List list, int i, zcl zclVar) {
        this(aVar, liveCategory, (i & 4) != 0 ? EmptyList.b : list);
    }
}
