package com.vk.catalog2.common.dto.ui.actions;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.collections.EmptySet;
import xsna.epx;
import xsna.i7o0;
import xsna.qjg;

/* compiled from: UIBlockDownloadAll.kt */
/* loaded from: classes16.dex */
public final class UIBlockDownloadAll extends UIBlockAction {
    public static final Serializer.c<UIBlockDownloadAll> CREATOR = new a();
    public boolean z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockDownloadAll> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockDownloadAll a(Serializer serializer) {
            return new UIBlockDownloadAll(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockDownloadAll[i];
        }
    }

    public UIBlockDownloadAll(Serializer serializer) {
        super(serializer);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.b;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock
    /* renamed from: Rb, reason: merged with bridge method [inline-methods] */
    public final UIBlockDownloadAll zb() {
        UserId a2 = UserId.a(this.g);
        ArrayList a3 = i7o0.a(this.h);
        UIBlockHint uIBlockHint = this.j;
        UIBlockDownloadAll uIBlockDownloadAll = new UIBlockDownloadAll(this.b, this.d, this.e, this.f, a2, a3, uIBlockHint != null ? uIBlockHint.zb() : null);
        uIBlockDownloadAll.z = this.z;
        return uIBlockDownloadAll;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockDownloadAll)) {
            return false;
        }
        UIBlockAction uIBlockAction = (UIBlockAction) obj;
        return UIBlock.a.b(this, uIBlockAction) && epx.f(this.y, uIBlockAction.y) && epx.f(((UIBlockDownloadAll) obj).f, this.f);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(Integer.valueOf(UIBlock.a.a(this)), this.y)), this.f);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return qjg.a(this) + "<[" + this.d + "]>, blockId:" + this.b + ", ref:" + this.f;
    }

    public UIBlockDownloadAll(String str, CatalogViewType catalogViewType, CatalogDataType catalogDataType, String str2, UserId userId, List<String> list, UIBlockHint uIBlockHint) {
        super(str, catalogViewType, catalogDataType, str2, userId, list, EmptySet.b, uIBlockHint, "", null, null, null, 3584, null);
    }
}
