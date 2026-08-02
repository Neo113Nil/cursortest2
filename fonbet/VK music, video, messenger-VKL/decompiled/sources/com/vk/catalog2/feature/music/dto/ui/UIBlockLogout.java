package com.vk.catalog2.feature.music.dto.ui;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.feature.music.dto.ui.actions.UIBlockActionLogout;
import com.vk.core.serialize.Serializer;
import java.util.Objects;
import xsna.epx;
import xsna.qjg;

/* compiled from: UIBlockLogout.kt */
/* loaded from: classes16.dex */
public final class UIBlockLogout extends UIBlock {
    public static final Serializer.c<UIBlockLogout> CREATOR = new a();
    public final String A;
    public final String y;
    public final UIBlockActionLogout z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockLogout> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockLogout a(Serializer serializer) {
            return new UIBlockLogout(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockLogout[i];
        }
    }

    public UIBlockLogout(Serializer serializer) {
        super(serializer);
        String H = serializer.H();
        this.y = H == null ? "" : H;
        this.z = (UIBlockActionLogout) serializer.G(UIBlockActionLogout.class.getClassLoader());
        this.A = serializer.H();
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.y;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.j0(this.y);
        serializer.i0(this.z);
        serializer.j0(this.A);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockLogout) || !UIBlock.a.b(this, (UIBlock) obj)) {
            return false;
        }
        UIBlockLogout uIBlockLogout = (UIBlockLogout) obj;
        return epx.f(this.y, uIBlockLogout.y) && epx.f(this.z, uIBlockLogout.z) && epx.f(this.A, uIBlockLogout.A);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y, this.z, this.A);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return qjg.a(this);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        com.vk.catalog2.common.dto.api.ui.a Ab = Ab();
        UIBlockActionLogout uIBlockActionLogout = this.z;
        return new UIBlockLogout(Ab, this.y, new UIBlockActionLogout(uIBlockActionLogout.Ab(), uIBlockActionLogout.y, uIBlockActionLogout.z), this.A);
    }

    public UIBlockLogout(com.vk.catalog2.common.dto.api.ui.a aVar, String str, UIBlockActionLogout uIBlockActionLogout, String str2) {
        super(aVar.a, aVar.c, aVar.d, aVar.e, aVar.f, aVar.g, aVar.h, aVar.i, null, null, null, null, null, null, null, 32512, null);
        this.y = str;
        this.z = uIBlockActionLogout;
        this.A = str2;
    }
}
