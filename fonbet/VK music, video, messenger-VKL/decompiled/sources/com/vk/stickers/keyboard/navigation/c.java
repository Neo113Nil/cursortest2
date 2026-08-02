package com.vk.stickers.keyboard.navigation;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.vk.dto.hints.HintId;
import com.vk.imageloader.view.VKImageView;
import com.vk.stickers.keyboard.navigation.a;
import com.vkontakte.android.R;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import xsna.ahn;
import xsna.b0u0;
import xsna.bwt0;
import xsna.dhr0;
import xsna.f4m;
import xsna.ggy;
import xsna.h7v;
import xsna.hgy;
import xsna.igy;
import xsna.iut0;
import xsna.omw;
import xsna.pla;
import xsna.s53;
import xsna.vfz;

/* compiled from: KeyboardNavigationButtonHolder.kt */
/* loaded from: classes6.dex */
public final class c extends vfz<igy> {
    public final a.InterfaceC1801a l;
    public final VKImageView m;
    public final ImageView n;

    /* compiled from: KeyboardNavigationButtonHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KeyboardNavigationButton.values().length];
            try {
                iArr[KeyboardNavigationButton.RECENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KeyboardNavigationButton.FAVORITES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KeyboardNavigationButton.VMOJI_CREATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[KeyboardNavigationButton.SETTINGS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[KeyboardNavigationButton.EMOJI.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[KeyboardNavigationButton.UGC_CREATE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public c(ViewGroup viewGroup, com.vk.stickers.keyboard.c cVar) {
        super(R.layout.stickers_keyboard_navigation_pack_holder, viewGroup);
        this.l = cVar;
        this.m = (VKImageView) this.itemView.findViewById(R.id.sticker_nav_image);
        this.n = (ImageView) this.itemView.findViewById(R.id.sticker_nav_new_badge);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(igy igyVar) {
        igy igyVar2 = igyVar;
        KeyboardNavigationButton keyboardNavigationButton = igyVar2.b;
        int i = a.$EnumSwitchMapping$0[keyboardNavigationButton.ordinal()];
        ImageView imageView = this.n;
        VKImageView vKImageView = this.m;
        switch (i) {
            case 1:
                vKImageView.setImageDrawable(ahn.r(R.drawable.vk_icon_recent_outline_24));
                vKImageView.setContentDescription(this.itemView.getContext().getString(R.string.stickers_keyboard_recently_used));
                f4m.j(imageView);
                break;
            case 2:
                vKImageView.setImageDrawable(ahn.r(R.drawable.vk_icon_favorite_outline_24));
                vKImageView.setContentDescription(this.itemView.getContext().getString(R.string.stickers_keyboard_favorites));
                f4m.j(imageView);
                break;
            case 3:
                vKImageView.setImageDrawable(ahn.r(R.drawable.vk_icon_vmoji_outline_24));
                vKImageView.setContentDescription(this.itemView.getContext().getString(R.string.stickers_accessibility_vmoji));
                f4m.j(imageView);
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                if (!vKImageView.isLaidOut()) {
                    vKImageView.addOnLayoutChangeListener(new ggy(this));
                    break;
                } else {
                    h7v.f(pla.e().b(), vKImageView, HintId.VMOJI_KEYBOARD_ONBOARDING.getId(), new hgy(bwt0.C(vKImageView)), 8);
                    break;
                }
            case 4:
                omw.d(vKImageView, R.drawable.vk_icon_settings_24, R.attr.vk_ui_icon_secondary);
                vKImageView.setContentDescription(this.itemView.getContext().getString(R.string.stickers_accessibility_settings));
                f4m.j(imageView);
                break;
            case 5:
                vKImageView.setImageDrawable(ahn.r(R.drawable.vk_icon_smile_outline_24));
                vKImageView.setContentDescription(this.itemView.getContext().getString(R.string.accessibility_emojis));
                f4m.j(imageView);
                break;
            case 6:
                vKImageView.setImageDrawable(ahn.r(R.drawable.vk_icon_ugc_sticker_outline_24));
                vKImageView.setContentDescription(this.itemView.getContext().getString(R.string.stickers_ugc));
                f4m.j(imageView);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        vKImageView.setSelected(igyVar2.c);
        vKImageView.setBackgroundResource(keyboardNavigationButton == KeyboardNavigationButton.SETTINGS ? dhr0.b0(R.attr.selectableItemBackground) : R.drawable.sticker_tab);
        bwt0.i0(vKImageView, new s53(21, igyVar2, this));
    }
}
