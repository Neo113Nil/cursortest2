package com.vk.stickers.keyboard.navigation;

import android.view.ViewGroup;
import com.vk.core.view.ProgressButton;
import com.vk.stickers.keyboard.navigation.a;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.vfz;
import xsna.wze0;
import xsna.zgy;

/* compiled from: RefreshButtonHolder.kt */
/* loaded from: classes6.dex */
public final class h extends vfz<zgy> {
    public final a.InterfaceC1801a l;
    public final ProgressButton m;

    public h(ViewGroup viewGroup, com.vk.stickers.keyboard.c cVar) {
        super(R.layout.stickers_keyboard_refresh_holder, viewGroup);
        this.l = cVar;
        this.m = (ProgressButton) this.itemView.findViewById(R.id.refresh_button);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(zgy zgyVar) {
        boolean z = zgyVar.b;
        ProgressButton progressButton = this.m;
        progressButton.S(z);
        progressButton.setEnabled(!z);
        bwt0.i0(progressButton, new wze0(1, progressButton, this));
    }
}
