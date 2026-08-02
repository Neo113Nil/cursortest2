package com.vk.catalog2.common.ui.mvp.holder.group;

import com.vk.catalog2.common.ui.mvp.holder.group.GroupHorizontalListItemVh;
import com.vk.core.view.components.tile.VkTile;
import kotlin.NoWhenBranchMatchedException;
import xsna.cn70;

/* compiled from: GroupHorizontalListItemVh.kt */
/* loaded from: classes16.dex */
public final class a extends VkTile.a {
    public final /* synthetic */ GroupHorizontalListItemVh a;

    /* compiled from: GroupHorizontalListItemVh.kt */
    /* renamed from: com.vk.catalog2.common.ui.mvp.holder.group.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0501a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GroupHorizontalListItemVh.Size.values().length];
            try {
                iArr[GroupHorizontalListItemVh.Size.Small.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GroupHorizontalListItemVh.Size.MatchParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public a(GroupHorizontalListItemVh groupHorizontalListItemVh) {
        this.a = groupHorizontalListItemVh;
    }

    @Override // com.vk.core.view.components.tile.VkTile.a
    public final int a(VkTile vkTile) {
        int i = C0501a.$EnumSwitchMapping$0[this.a.h.ordinal()];
        if (i == 1) {
            return cn70.b(8);
        }
        if (i == 2) {
            return cn70.b(4);
        }
        throw new NoWhenBranchMatchedException();
    }
}
