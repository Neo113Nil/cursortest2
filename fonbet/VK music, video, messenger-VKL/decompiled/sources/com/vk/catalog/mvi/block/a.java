package com.vk.catalog.mvi.block;

import com.vk.catalog.mvi.block.BlockId;
import com.vk.dto.common.id.UserId;

/* compiled from: CatalogBlockEntity.kt */
/* loaded from: classes16.dex */
public final class a {
    public static final BlockId.CompositeId a(int i, UserId userId, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(userId);
        sb.append('_');
        sb.append(i);
        return new BlockId.CompositeId(str, sb.toString());
    }

    public static final BlockId.CompositeId b(int i, String str) {
        return new BlockId.CompositeId(str, String.valueOf(i));
    }

    public static final BlockId.CompositeId c(String str, String str2) {
        return new BlockId.CompositeId(str, str2);
    }
}
