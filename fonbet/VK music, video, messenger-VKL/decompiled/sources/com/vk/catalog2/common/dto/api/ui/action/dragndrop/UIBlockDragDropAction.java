package com.vk.catalog2.common.dto.api.ui.action.dragndrop;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import java.util.List;
import kotlin.collections.EmptySet;

/* compiled from: UIBlockDragDropAction.kt */
/* loaded from: classes16.dex */
public abstract class UIBlockDragDropAction extends UIBlockAction {
    public UIBlockDragDropAction(Serializer serializer) {
        super(serializer);
    }

    public UIBlockDragDropAction(String str, CatalogViewType catalogViewType, CatalogDataType catalogDataType, String str2, UserId userId, List<String> list, UIBlockHint uIBlockHint) {
        super(str, catalogViewType, catalogDataType, str2, userId, list, EmptySet.b, uIBlockHint, "", null, null, null, 3584, null);
    }
}
