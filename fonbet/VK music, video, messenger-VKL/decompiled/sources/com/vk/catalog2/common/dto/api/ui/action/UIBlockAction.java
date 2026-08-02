package com.vk.catalog2.common.dto.api.ui.action;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogLaunchOrigin;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.a;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockDragDropAction;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import java.util.List;
import java.util.Set;
import xsna.zcl;

/* compiled from: UIBlockAction.kt */
/* loaded from: classes16.dex */
public abstract class UIBlockAction extends UIBlock implements Cloneable {
    public final String y;

    public /* synthetic */ UIBlockAction(String str, CatalogViewType catalogViewType, CatalogDataType catalogDataType, String str2, UserId userId, List list, Set set, UIBlockHint uIBlockHint, String str3, String str4, CatalogViewStyle catalogViewStyle, CatalogLaunchOrigin catalogLaunchOrigin, int i, zcl zclVar) {
        this(str, catalogViewType, catalogDataType, str2, userId, list, set, uIBlockHint, str3, (i & 512) != 0 ? "" : str4, (i & 1024) != 0 ? null : catalogViewStyle, (i & 2048) != 0 ? CatalogLaunchOrigin.UNKNOWN : catalogLaunchOrigin);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.j0(this.y);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    /* renamed from: Pb, reason: merged with bridge method [inline-methods] */
    public abstract UIBlockAction zb();

    public final String Qb() {
        return this.y;
    }

    public Object clone() {
        return super.clone();
    }

    public UIBlockAction(String str, CatalogViewType catalogViewType, CatalogDataType catalogDataType, String str2, UserId userId, List<String> list, Set<? extends UIBlockDragDropAction> set, UIBlockHint uIBlockHint, String str3, String str4, CatalogViewStyle catalogViewStyle, CatalogLaunchOrigin catalogLaunchOrigin) {
        super(str, catalogViewType, catalogDataType, str2, userId, list, set, uIBlockHint, null, catalogViewStyle, str4, null, null, catalogLaunchOrigin, null, 22784, null);
        this.y = str3;
    }

    public UIBlockAction(a aVar, String str) {
        super(aVar);
        this.y = str;
    }

    public UIBlockAction(Serializer serializer) {
        super(serializer);
        this.y = serializer.H();
    }
}
