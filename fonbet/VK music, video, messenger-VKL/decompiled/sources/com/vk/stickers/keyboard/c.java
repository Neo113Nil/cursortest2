package com.vk.stickers.keyboard;

import com.vk.dto.common.id.UserId;
import com.vk.stickers.keyboard.StickersView;
import com.vk.stickers.keyboard.navigation.KeyboardNavigationButton;
import com.vk.stickers.keyboard.navigation.a;
import com.vkontakte.android.R;
import xsna.cvk;
import xsna.dbl0;
import xsna.g2v;
import xsna.kcl0;
import xsna.ral0;
import xsna.sal0;

/* compiled from: StickersView.kt */
/* loaded from: classes6.dex */
public final class c implements a.InterfaceC1801a {
    public final /* synthetic */ StickersView a;

    public c(StickersView stickersView) {
        this.a = stickersView;
    }

    @Override // com.vk.stickers.keyboard.navigation.a.InterfaceC1801a
    public final void a(int i) {
        StickersView stickersView = this.a;
        StickersView.a aVar = stickersView.l;
        kcl0 kcl0Var = stickersView.g;
        ral0 ral0Var = stickersView.z;
        dbl0 dbl0Var = stickersView.m;
        if (i != -6) {
            sal0 sal0Var = ral0Var.c;
            if (sal0Var != null) {
                sal0Var.b(i);
            }
            ral0Var.r = i;
        }
        if (i == -4) {
            stickersView.setCurrentPage(dbl0Var.getItemPosition(stickersView.y));
        } else if (i == -6) {
            stickersView.setCurrentPage(dbl0Var.getItemPosition(stickersView.x));
        } else if (i == -5) {
            kcl0Var.R0(true);
            stickersView.setCurrentPage(dbl0Var.getItemPosition(stickersView.w));
        } else if (i > 0) {
            stickersView.setCurrentPage(dbl0Var.getItemPosition(ral0Var));
        } else if (aVar.getCurrentItem() == 0 || aVar.getCurrentItem() == 1 || i == -1 || i == -3) {
            stickersView.setCurrentPage(dbl0Var.getItemPosition(ral0Var));
        }
        com.vk.stickers.keyboard.navigation.a.O0(stickersView.v, i);
        if (kcl0Var.w0() != (i == -5)) {
            kcl0Var.R0(i == -5);
        }
    }

    @Override // com.vk.stickers.keyboard.navigation.a.InterfaceC1801a
    public final void b(KeyboardNavigationButton keyboardNavigationButton) {
        if (keyboardNavigationButton == KeyboardNavigationButton.SETTINGS) {
            StickersView stickersView = this.a;
            if (!stickersView.e) {
                cvk.u(R.string.not_allowed_to_open_stickers_store, false);
            } else {
                g2v.d().a().p(stickersView.getContext(), false);
                stickersView.D.l();
            }
        }
    }

    @Override // com.vk.stickers.keyboard.navigation.a.InterfaceC1801a
    public final void c() {
        this.a.g.Q();
    }

    @Override // com.vk.stickers.keyboard.navigation.a.InterfaceC1801a
    public final void d(long j, UserId userId) {
        StickersView stickersView = this.a;
        dbl0 dbl0Var = stickersView.m;
        ral0 ral0Var = stickersView.z;
        stickersView.setCurrentPage(dbl0Var.getItemPosition(ral0Var));
        ral0Var.c(j, userId);
        com.vk.stickers.keyboard.navigation.a aVar = stickersView.v;
        aVar.L0(-7, false);
        aVar.P0(-7);
    }
}
