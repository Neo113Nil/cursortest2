package com.vk.catalog2.feature.music.dto.ui.actions;

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

/* compiled from: UIBlockClearDownloadsHistory.kt */
/* loaded from: classes16.dex */
public final class UIBlockClearDownloadsHistory extends UIBlockAction {
    public static final Serializer.c<UIBlockClearDownloadsHistory> CREATOR = new a();
    public final Integer z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockClearDownloadsHistory> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockClearDownloadsHistory a(Serializer serializer) {
            return new UIBlockClearDownloadsHistory(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockClearDownloadsHistory[i];
        }
    }

    public UIBlockClearDownloadsHistory(Serializer serializer) {
        super(serializer);
        this.z = Integer.valueOf(serializer.u());
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.b;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock
    /* renamed from: Rb, reason: merged with bridge method [inline-methods] */
    public final UIBlockClearDownloadsHistory zb() {
        UserId a2 = UserId.a(this.g);
        ArrayList a3 = i7o0.a(this.h);
        UIBlockHint uIBlockHint = this.j;
        return new UIBlockClearDownloadsHistory(this.b, this.d, this.e, this.f, a2, a3, uIBlockHint != null ? uIBlockHint.zb() : null, this.z);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockClearDownloadsHistory)) {
            return false;
        }
        UIBlockAction uIBlockAction = (UIBlockAction) obj;
        return UIBlock.a.b(this, uIBlockAction) && epx.f(this.y, uIBlockAction.y);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(UIBlock.a.a(this)), this.y);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return qjg.a(this) + "<[" + this.d + "]>";
    }

    public UIBlockClearDownloadsHistory(String str, CatalogViewType catalogViewType, CatalogDataType catalogDataType, String str2, UserId userId, List<String> list, UIBlockHint uIBlockHint, Integer num) {
        super(str, catalogViewType, catalogDataType, str2, userId, list, EmptySet.b, uIBlockHint, "", null, null, null, 3584, null);
        this.z = num;
    }
}
