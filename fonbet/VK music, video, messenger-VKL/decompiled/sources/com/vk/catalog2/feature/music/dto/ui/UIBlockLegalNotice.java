package com.vk.catalog2.feature.music.dto.ui;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.core.serialize.Serializer;
import java.util.Objects;
import xsna.epx;
import xsna.ho8;
import xsna.qjg;

/* compiled from: UIBlockLegalNotice.kt */
/* loaded from: classes16.dex */
public final class UIBlockLegalNotice extends UIBlock {
    public static final Serializer.c<UIBlockLegalNotice> CREATOR = new a();
    public final String y;
    public final String z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockLegalNotice> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockLegalNotice a(Serializer serializer) {
            return new UIBlockLegalNotice(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockLegalNotice[i];
        }
    }

    public UIBlockLegalNotice(com.vk.catalog2.common.dto.api.ui.a aVar, String str, String str2) {
        super(aVar);
        this.y = str;
        this.z = str2;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.b;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.j0(this.y);
        serializer.j0(this.z);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockLegalNotice) || !UIBlock.a.b(this, (UIBlock) obj)) {
            return false;
        }
        UIBlockLegalNotice uIBlockLegalNotice = (UIBlockLegalNotice) obj;
        return epx.f(this.y, uIBlockLegalNotice.y) && epx.f(this.z, uIBlockLegalNotice.z);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y, this.z);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(qjg.a(this));
        sb.append('<');
        sb.append(this.y);
        sb.append(" - ");
        return ho8.a(sb, this.z, '>');
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        return new UIBlockLegalNotice(Ab(), this.y, this.z);
    }

    public UIBlockLegalNotice(Serializer serializer) {
        super(serializer);
        this.y = serializer.H();
        this.z = serializer.H();
    }
}
