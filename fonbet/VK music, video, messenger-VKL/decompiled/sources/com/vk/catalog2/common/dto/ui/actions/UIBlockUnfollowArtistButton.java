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
import xsna.epx;
import xsna.ho8;
import xsna.i7o0;
import xsna.qjg;

/* compiled from: UIBlockUnfollowArtistButton.kt */
/* loaded from: classes16.dex */
public final class UIBlockUnfollowArtistButton extends UIBlockAction {
    public static final Serializer.c<UIBlockUnfollowArtistButton> CREATOR = new a();
    public final String A;
    public final String z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockUnfollowArtistButton> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockUnfollowArtistButton a(Serializer serializer) {
            return new UIBlockUnfollowArtistButton(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockUnfollowArtistButton[i];
        }
    }

    public UIBlockUnfollowArtistButton(String str, CatalogViewType catalogViewType, CatalogDataType catalogDataType, String str2, UserId userId, List<String> list, Set<? extends UIBlockDragDropAction> set, UIBlockHint uIBlockHint, String str3, String str4, String str5) {
        super(str, catalogViewType, catalogDataType, str2, userId, list, set, uIBlockHint, str3, null, null, null, 3584, null);
        this.A = str4;
        this.z = str5;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.b;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.j0(this.A);
        serializer.j0(this.z);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock
    /* renamed from: Rb, reason: merged with bridge method [inline-methods] */
    public final UIBlockUnfollowArtistButton zb() {
        UserId a2 = UserId.a(this.g);
        ArrayList a3 = i7o0.a(this.h);
        Set<UIBlockDragDropAction> Db = Db();
        HashSet hashSet = new HashSet();
        Iterator<UIBlockDragDropAction> it = Db.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().zb());
        }
        UIBlockHint uIBlockHint = this.j;
        return new UIBlockUnfollowArtistButton(this.b, this.d, this.e, this.f, a2, a3, hashSet, uIBlockHint != null ? uIBlockHint.zb() : null, this.y, this.A, this.z);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockUnfollowArtistButton)) {
            return false;
        }
        UIBlockAction uIBlockAction = (UIBlockAction) obj;
        if (!UIBlock.a.b(this, uIBlockAction) || !epx.f(this.y, uIBlockAction.y)) {
            return false;
        }
        UIBlockUnfollowArtistButton uIBlockUnfollowArtistButton = (UIBlockUnfollowArtistButton) obj;
        return epx.f(this.A, uIBlockUnfollowArtistButton.A) && epx.f(this.z, uIBlockUnfollowArtistButton.z);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(Integer.valueOf(UIBlock.a.a(this)), this.y)), this.A, this.z);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(qjg.a(this));
        sb.append("<[");
        sb.append(this.d);
        sb.append("]: ");
        return ho8.a(sb, this.z, '>');
    }

    public UIBlockUnfollowArtistButton(Serializer serializer) {
        super(serializer);
        String H = serializer.H();
        this.A = H == null ? "" : H;
        String H2 = serializer.H();
        this.z = H2 != null ? H2 : "";
    }
}
