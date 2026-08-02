package com.vk.catalog2.feature.music.ui.holder;

import com.vk.catalog2.feature.music.ui.holder.ArtistLinkHorizontalListItemVh;
import com.vk.core.view.components.tile.VkTile;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ArtistLinkHorizontalListItemVh.kt */
/* loaded from: classes16.dex */
public final class a extends VkTile.a {
    public final /* synthetic */ ArtistLinkHorizontalListItemVh a;

    /* compiled from: ArtistLinkHorizontalListItemVh.kt */
    /* renamed from: com.vk.catalog2.feature.music.ui.holder.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0524a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ArtistLinkHorizontalListItemVh.Size.values().length];
            try {
                iArr[ArtistLinkHorizontalListItemVh.Size.Large.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public a(ArtistLinkHorizontalListItemVh artistLinkHorizontalListItemVh) {
        this.a = artistLinkHorizontalListItemVh;
    }

    @Override // com.vk.core.view.components.tile.VkTile.a
    public final int a(VkTile vkTile) {
        if (C0524a.$EnumSwitchMapping$0[this.a.m.ordinal()] == 1) {
            return 0;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.vk.core.view.components.tile.VkTile.a
    public final int c(VkTile vkTile) {
        if (C0524a.$EnumSwitchMapping$0[this.a.m.ordinal()] == 1) {
            return R.style.VkUiTypography_Subhead;
        }
        throw new NoWhenBranchMatchedException();
    }
}
