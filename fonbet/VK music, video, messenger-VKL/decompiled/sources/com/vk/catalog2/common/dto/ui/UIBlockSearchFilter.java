package com.vk.catalog2.common.dto.ui;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.core.serialize.Serializer;
import java.util.Objects;
import xsna.dfp0;
import xsna.epx;
import xsna.ho8;

/* compiled from: UIBlockSearchFilter.kt */
/* loaded from: classes16.dex */
public final class UIBlockSearchFilter extends UIBlock implements dfp0 {
    public static final Serializer.c<UIBlockSearchFilter> CREATOR = new a();
    public final String A;
    public final String B;
    public final String y;
    public final String z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockSearchFilter> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockSearchFilter a(Serializer serializer) {
            return new UIBlockSearchFilter(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockSearchFilter[i];
        }
    }

    public UIBlockSearchFilter(com.vk.catalog2.common.dto.api.ui.a aVar, String str, String str2, String str3, String str4) {
        super(aVar);
        this.y = str;
        this.z = str2;
        this.B = str3;
        this.A = str4;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.y;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.j0(this.y);
        serializer.j0(this.z);
        serializer.j0(this.B);
        serializer.j0(this.A);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockSearchFilter) || !UIBlock.a.b(this, (UIBlock) obj)) {
            return false;
        }
        UIBlockSearchFilter uIBlockSearchFilter = (UIBlockSearchFilter) obj;
        return epx.f(this.y, uIBlockSearchFilter.y) && epx.f(this.z, uIBlockSearchFilter.z) && epx.f(this.B, uIBlockSearchFilter.B) && epx.f(this.A, uIBlockSearchFilter.A);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y);
    }

    @Override // xsna.dfp0
    public final String r() {
        return this.B;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return ho8.a(new StringBuilder("<SearchFilter: "), this.z, '>');
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        return new UIBlockSearchFilter(Ab(), this.y, this.z, this.B, this.A);
    }

    public UIBlockSearchFilter(Serializer serializer) {
        super(serializer);
        this.y = serializer.H();
        this.z = serializer.H();
        this.B = serializer.H();
        this.A = serializer.H();
    }
}
