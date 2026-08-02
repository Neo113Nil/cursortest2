package com.vk.catalog2.common.dto.ui.actions;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockDragDropAction;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import xsna.dfp0;
import xsna.epx;
import xsna.ho8;
import xsna.i7o0;
import xsna.ksx0;
import xsna.qjg;

/* compiled from: UIBlockActionSwitchSection.kt */
/* loaded from: classes16.dex */
public final class UIBlockActionSwitchSection extends UIBlockAction implements ksx0, dfp0 {
    public static final Serializer.c<UIBlockActionSwitchSection> CREATOR = new a();
    public final String A;
    public final String B;
    public final String C;
    public final String D;
    public final String E;
    public final String F;
    public final String G;
    public final String z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockActionSwitchSection> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockActionSwitchSection a(Serializer serializer) {
            return new UIBlockActionSwitchSection(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockActionSwitchSection[i];
        }
    }

    public UIBlockActionSwitchSection(String str, CatalogViewType catalogViewType, CatalogDataType catalogDataType, String str2, UserId userId, List<String> list, Set<? extends UIBlockDragDropAction> set, UIBlockHint uIBlockHint, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        super(str, catalogViewType, catalogDataType, str2, userId, list, set, uIBlockHint, str3, str5, null, null, 3072, null);
        this.z = str4;
        this.A = str6;
        this.F = str7;
        this.B = str8;
        this.G = str11;
        this.C = str9;
        this.D = str10;
        this.E = str12;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.b;
    }

    @Override // xsna.ksx0
    public final String I2() {
        return this.F;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.j0(this.z);
        serializer.j0(this.A);
        serializer.j0(this.F);
        serializer.j0(this.B);
        serializer.j0(this.C);
        serializer.j0(this.D);
        serializer.j0(this.G);
        serializer.j0(this.E);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock
    /* renamed from: Rb, reason: merged with bridge method [inline-methods] */
    public final UIBlockActionSwitchSection zb() {
        UserId a2 = UserId.a(this.g);
        ArrayList a3 = i7o0.a(this.h);
        Set<UIBlockDragDropAction> Db = Db();
        HashSet hashSet = new HashSet();
        Iterator<UIBlockDragDropAction> it = Db.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().zb());
        }
        UIBlockHint uIBlockHint = this.j;
        return new UIBlockActionSwitchSection(this.b, this.d, this.e, this.f, a2, a3, hashSet, uIBlockHint != null ? uIBlockHint.zb() : null, this.y, this.z, this.c, this.A, this.F, this.B, this.C, this.D, this.G, this.E);
    }

    public final String Sb() {
        return this.A;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockActionSwitchSection)) {
            return false;
        }
        UIBlockAction uIBlockAction = (UIBlockAction) obj;
        if (!UIBlock.a.b(this, uIBlockAction) || !epx.f(this.y, uIBlockAction.y)) {
            return false;
        }
        UIBlockActionSwitchSection uIBlockActionSwitchSection = (UIBlockActionSwitchSection) obj;
        return epx.f(this.z, uIBlockActionSwitchSection.z) && epx.f(this.A, uIBlockActionSwitchSection.A) && epx.f(this.F, uIBlockActionSwitchSection.F) && epx.f(this.B, uIBlockActionSwitchSection.B) && epx.f(this.C, uIBlockActionSwitchSection.C) && epx.f(this.D, uIBlockActionSwitchSection.D) && epx.f(this.G, uIBlockActionSwitchSection.G) && epx.f(this.E, uIBlockActionSwitchSection.E);
    }

    public final String getTitle() {
        return this.z;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(Integer.valueOf(UIBlock.a.a(this)), this.y)), this.z, this.A, this.F, this.B, this.C, this.D, this.G, this.E);
    }

    @Override // xsna.dfp0
    public final String r() {
        return this.G;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(qjg.a(this));
        sb.append('<');
        sb.append(this.z);
        sb.append(" -> ");
        return ho8.a(sb, this.c, '>');
    }

    public UIBlockActionSwitchSection(Serializer serializer) {
        super(serializer);
        String H = serializer.H();
        this.z = H == null ? "" : H;
        String H2 = serializer.H();
        this.A = H2 != null ? H2 : "";
        this.F = serializer.H();
        this.B = serializer.H();
        this.C = serializer.H();
        this.D = serializer.H();
        this.G = serializer.H();
        this.E = serializer.H();
    }
}
