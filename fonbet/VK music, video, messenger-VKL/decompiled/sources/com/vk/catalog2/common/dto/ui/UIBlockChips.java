package com.vk.catalog2.common.dto.ui;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.core.serialize.Serializer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import xsna.epx;
import xsna.ho8;
import xsna.qjg;

/* compiled from: UIBlockChips.kt */
/* loaded from: classes16.dex */
public final class UIBlockChips extends UIBlock {
    public static final Serializer.c<UIBlockChips> CREATOR = new a();
    public final ArrayList A;
    public final String y;
    public final String z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockChips> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockChips a(Serializer serializer) {
            return new UIBlockChips(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockChips[i];
        }
    }

    public UIBlockChips(Serializer serializer) {
        super(serializer);
        String H = serializer.H();
        this.y = H == null ? "" : H;
        String H2 = serializer.H();
        this.z = H2 != null ? H2 : "";
        ArrayList k = serializer.k(UIBlockAction.class);
        this.A = k == null ? new ArrayList() : k;
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
        serializer.W(this.A);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockChips) || !UIBlock.a.b(this, (UIBlock) obj)) {
            return false;
        }
        UIBlockChips uIBlockChips = (UIBlockChips) obj;
        return epx.f(this.y, uIBlockChips.y) && epx.f(this.z, uIBlockChips.z) && epx.f(this.A, uIBlockChips.A);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y, this.z, this.A);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(qjg.a(this));
        sb.append('<');
        return ho8.a(sb, this.y, '>');
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        return new UIBlockChips(Ab(), this.y, this.z, this.A);
    }

    public UIBlockChips(com.vk.catalog2.common.dto.api.ui.a aVar, String str, String str2, List<? extends UIBlockAction> list) {
        super(aVar.a, aVar.c, aVar.d, aVar.e, aVar.f, aVar.g, aVar.h, aVar.i, null, null, null, null, null, null, null, 32512, null);
        this.y = str;
        this.z = str2;
        this.A = new ArrayList(list);
    }
}
