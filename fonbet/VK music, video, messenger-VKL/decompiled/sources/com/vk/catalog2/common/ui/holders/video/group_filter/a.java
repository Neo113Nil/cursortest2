package com.vk.catalog2.common.ui.holders.video.group_filter;

import com.vk.catalog2.common.ui.holders.video.group_filter.GroupFilterTileVh;
import com.vk.core.view.components.tile.VkTile;
import kotlin.NoWhenBranchMatchedException;
import xsna.cn70;

/* compiled from: GroupFilterTileVh.kt */
/* loaded from: classes16.dex */
public final class a extends VkTile.a {
    public final /* synthetic */ GroupFilterTileVh a;

    /* compiled from: GroupFilterTileVh.kt */
    /* renamed from: com.vk.catalog2.common.ui.holders.video.group_filter.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0490a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GroupFilterTileVh.Size.values().length];
            try {
                iArr[GroupFilterTileVh.Size.Normal.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public a(GroupFilterTileVh groupFilterTileVh) {
        this.a = groupFilterTileVh;
    }

    @Override // com.vk.core.view.components.tile.VkTile.a
    public final int a(VkTile vkTile) {
        if (C0490a.$EnumSwitchMapping$0[this.a.h.ordinal()] == 1) {
            return cn70.b(4);
        }
        throw new NoWhenBranchMatchedException();
    }
}
