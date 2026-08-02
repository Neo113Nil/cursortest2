package com.vk.catalog2.feature.music.holders;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.button.VkButton;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.cn70;
import xsna.qcy;

/* compiled from: MusicActionColorfulVkButtonVh.kt */
/* loaded from: classes16.dex */
public abstract class MusicActionColorfulVkButtonVh implements CatalogViewHolder, View.OnClickListener {
    public final b b;
    public final a c;
    public final VkButton.Size d;
    public VkButton e;

    /* compiled from: MusicActionColorfulVkButtonVh.kt */
    public static final class a {
        public final int a;
        public final Integer b;
        public final int c;
        public final boolean d;

        public a(int i, int i2, int i3) {
            Integer valueOf = Integer.valueOf(R.attr.vk_ui_accent_blue);
            i2 = (i3 & 4) != 0 ? cn70.b(16) : i2;
            boolean z = (i3 & 8) == 0;
            this.a = i;
            this.b = valueOf;
            this.c = i2;
            this.d = z;
        }
    }

    /* compiled from: MusicActionColorfulVkButtonVh.kt */
    public interface b {

        /* compiled from: MusicActionColorfulVkButtonVh.kt */
        public static final class a implements b {
            @Override // com.vk.catalog2.feature.music.holders.MusicActionColorfulVkButtonVh.b
            public final int a() {
                return R.attr.vk_ui_accent_blue;
            }
        }

        /* compiled from: MusicActionColorfulVkButtonVh.kt */
        /* renamed from: com.vk.catalog2.feature.music.holders.MusicActionColorfulVkButtonVh$b$b, reason: collision with other inner class name */
        public static final class C0519b implements b {
            public final String a;

            public C0519b(String str) {
                this.a = str;
            }

            @Override // com.vk.catalog2.feature.music.holders.MusicActionColorfulVkButtonVh.b
            public final int a() {
                return R.attr.vk_ui_accent_blue;
            }
        }

        int a();
    }

    public MusicActionColorfulVkButtonVh(b bVar, a aVar) {
        VkButton.Size size = VkButton.Size.Medium;
        this.b = bVar;
        this.c = aVar;
        this.d = size;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public void L() {
        VkButton vkButton = this.e;
        if (vkButton != null) {
            qcy<Object>[] qcyVarArr = bwt0.a;
            vkButton.setOnClickListener(null);
        }
    }

    public final void a(b bVar) {
        VkButton vkButton;
        if (bVar instanceof b.a) {
            VkButton vkButton2 = this.e;
            if (vkButton2 != null) {
                ((b.a) bVar).getClass();
                vkButton2.setText(R.string.music_button_shuffle_compact);
            }
        } else if ((bVar instanceof b.C0519b) && (vkButton = this.e) != null) {
            vkButton.setText(((b.C0519b) bVar).a);
        }
        VkButton vkButton3 = this.e;
        if (vkButton3 != null) {
            vkButton3.setTextTint(bVar.a());
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_music_action_button, viewGroup, false);
        if (inflate instanceof VkButton) {
            VkButton vkButton = (VkButton) inflate;
            this.e = vkButton;
            vkButton.setSize(this.d);
            vkButton.setTextColorful(true);
            vkButton.setPadding(0, vkButton.getPaddingTop(), 0, vkButton.getPaddingBottom());
            a(this.b);
            a aVar = this.c;
            if (aVar != null) {
                int i = aVar.c;
                int i2 = aVar.a;
                boolean z = aVar.d;
                if (z) {
                    vkButton.d5(Integer.valueOf(i2));
                } else {
                    vkButton.a5(true, Integer.valueOf(i2));
                }
                if (z) {
                    vkButton.setTrailingIconSize(Integer.valueOf(i));
                } else {
                    vkButton.setIconSize(Integer.valueOf(i));
                }
                Integer num = aVar.b;
                if (num != null) {
                    if (z) {
                        vkButton.setTrailingIconTint(num.intValue());
                    } else {
                        vkButton.setIconTint(num.intValue());
                    }
                }
            }
            bwt0.h0(this, vkButton);
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

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
