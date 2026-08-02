package com.vk.auth.logout_menu;

import android.view.View;
import com.vk.auth.logout_menu.LogoutItem;
import com.vk.core.view.components.cell.button.Appearance;
import com.vk.core.view.components.cell.button.IconSize;
import com.vk.core.view.components.cell.button.VkCellButton;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.hkp;
import xsna.s770;

/* compiled from: LogoutItemBinder.kt */
/* loaded from: classes15.dex */
public final class c extends s770 {

    /* compiled from: LogoutItemBinder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LogoutItem.Type.values().length];
            try {
                iArr[LogoutItem.Type.LOGOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LogoutItem.Type.SWITCH_ACCOUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LogoutItem.Type.ADD_ACCOUNT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LogoutItem.Type.DEFAULT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // xsna.s770
    public final void m(hkp hkpVar, Object obj, int i) {
        LogoutItem logoutItem = (LogoutItem) obj;
        VkCellButton vkCellButton = (VkCellButton) hkpVar.f(R.id.item_logout_button);
        Integer valueOf = Integer.valueOf(logoutItem.b);
        int i2 = VkCellButton.l;
        vkCellButton.a(true, valueOf);
        vkCellButton.setIconSize(IconSize.Medium);
        vkCellButton.setTitle(logoutItem.c);
        vkCellButton.setSubtitle(logoutItem.d);
        vkCellButton.setSubtitleMaxLines(Integer.MAX_VALUE);
        int i3 = a.$EnumSwitchMapping$0[logoutItem.a.ordinal()];
        if (i3 == 1) {
            vkCellButton.setAppearance(Appearance.Negative);
            vkCellButton.setIconColorful(true);
        } else {
            if (i3 != 2 && i3 != 3 && i3 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            vkCellButton.setAppearance(Appearance.Neutral);
            vkCellButton.setIconTint(R.attr.vk_ui_icon_accent);
        }
    }

    @Override // xsna.s770
    public final hkp p(View view) {
        hkp hkpVar = new hkp(7);
        hkpVar.e(view.findViewById(R.id.item_logout_button));
        return hkpVar;
    }
}
