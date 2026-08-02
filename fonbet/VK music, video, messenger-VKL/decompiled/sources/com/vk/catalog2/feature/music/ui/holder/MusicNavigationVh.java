package com.vk.catalog2.feature.music.ui.holder;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionSwitchSection;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicMainNavigation;
import com.vk.catalog2.feature.music.ui.holder.MusicNavigationVh;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import xsna.bwt0;
import xsna.e43;
import xsna.epx;
import xsna.f4m;
import xsna.gz80;
import xsna.h2h;
import xsna.iah0;
import xsna.j5g;
import xsna.u4a;

/* compiled from: MusicNavigationVh.kt */
/* loaded from: classes16.dex */
public final class MusicNavigationVh implements CatalogViewHolder {
    public final u4a b;
    public List<? extends View> c;

    public MusicNavigationVh(u4a u4aVar) {
        this.b = u4aVar;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockMusicMainNavigation) {
            List<? extends View> list = this.c;
            if (list == null) {
                list = null;
            }
            int size = list.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                ArrayList arrayList = ((UIBlockMusicMainNavigation) uIBlock).y;
                UIBlockActionSwitchSection uIBlockActionSwitchSection = (UIBlockActionSwitchSection) j5g.b0(i, arrayList);
                String str = uIBlockActionSwitchSection != null ? uIBlockActionSwitchSection.B : null;
                if (epx.f(str, "primary")) {
                    a(i2, uIBlockActionSwitchSection, null, true);
                    i++;
                } else if (str != null) {
                    int i3 = i + 1;
                    UIBlockActionSwitchSection uIBlockActionSwitchSection2 = (UIBlockActionSwitchSection) j5g.b0(i3, arrayList);
                    a(i2, uIBlockActionSwitchSection, uIBlockActionSwitchSection2, false);
                    i = uIBlockActionSwitchSection2 != null ? i + 2 : i3;
                }
            }
        }
    }

    public final void a(int i, UIBlockActionSwitchSection uIBlockActionSwitchSection, UIBlockActionSwitchSection uIBlockActionSwitchSection2, boolean z) {
        List<? extends View> list = this.c;
        if (list == null) {
            list = null;
        }
        View findViewById = list.get(i).findViewById(R.id.catalog_music_main_navigation_item_big);
        bwt0.p0(findViewById, z);
        if (z) {
            ((VKImageView) findViewById.findViewById(R.id.music_navigation_image_big)).load(uIBlockActionSwitchSection.C);
            ((TextView) findViewById.findViewById(R.id.music_navigation_title_big)).setText(uIBlockActionSwitchSection.z);
            findViewById.setOnClickListener(new h2h(1, this, uIBlockActionSwitchSection));
        }
        b(uIBlockActionSwitchSection, i, z, R.id.catalog_music_main_navigation_item_small_first);
        b(uIBlockActionSwitchSection2, i, z, R.id.catalog_music_main_navigation_item_small_second);
    }

    public final void b(final UIBlockActionSwitchSection uIBlockActionSwitchSection, int i, boolean z, final int i2) {
        List<? extends View> list = this.c;
        if (list == null) {
            list = null;
        }
        View findViewById = list.get(i).findViewById(i2);
        bwt0.p0(findViewById, (z || uIBlockActionSwitchSection == null) ? false : true);
        if (z || uIBlockActionSwitchSection == null) {
            return;
        }
        ((VKImageView) findViewById.findViewById(R.id.music_navigation_image_small)).load(uIBlockActionSwitchSection.C);
        ((TextView) findViewById.findViewById(R.id.music_navigation_title_small)).setText(uIBlockActionSwitchSection.z);
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: xsna.dp40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MusicNavigationVh.this.b.c.a.z(i2, uIBlockActionSwitchSection);
            }
        });
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Pair pair;
        int i = 0;
        View inflate = layoutInflater.inflate(R.layout.catalog_music_main_navigation, viewGroup, false);
        List<? extends View> l = e43.l(inflate.findViewById(R.id.catalog_music_main_navigation_first_column), inflate.findViewById(R.id.catalog_music_main_navigation_second_column), inflate.findViewById(R.id.catalog_music_main_navigation_third_column));
        this.c = l;
        if (l == null) {
            l = null;
        }
        for (Object obj : l) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            View view = (View) obj;
            Iterator it = e43.l(Integer.valueOf(R.id.catalog_music_main_navigation_item_big), Integer.valueOf(R.id.catalog_music_main_navigation_item_small_first), Integer.valueOf(R.id.catalog_music_main_navigation_item_small_second)).iterator();
            while (it.hasNext()) {
                CardView cardView = (CardView) view.findViewById(((Number) it.next()).intValue());
                if (gz80.a(28)) {
                    cardView.setOutlineSpotShadowColor(cardView.getContext().getColor(R.color.vk_black_alpha20));
                }
                if (i == 0) {
                    pair = new Pair(Integer.valueOf(iah0.a(16)), Integer.valueOf(iah0.a(4)));
                } else if (i != 2) {
                    float f = 4;
                    pair = new Pair(Integer.valueOf(iah0.a(f)), Integer.valueOf(iah0.a(f)));
                } else {
                    pair = new Pair(Integer.valueOf(iah0.a(4)), Integer.valueOf(iah0.a(16)));
                }
                int intValue = ((Number) pair.d()).intValue();
                int intValue2 = ((Number) pair.g()).intValue();
                f4m.s(intValue, cardView);
                f4m.r(intValue2, cardView);
            }
            i = i2;
        }
        return inflate;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
