package com.vk.stickers.settings;

import com.vk.stickers.settings.StickerSettingsCheckItem;
import com.vk.stickers.settings.b;
import com.vk.stickers.settings.i;
import xsna.r820;

/* compiled from: StickerSettingsView.kt */
/* loaded from: classes6.dex */
public final class g implements i.b {
    public final /* synthetic */ i a;

    public g(i iVar) {
        this.a = iVar;
    }

    @Override // com.vk.stickers.settings.i.b
    public final void a(StickerSettingsCheckItem.Setting setting, boolean z) {
        r820 r820Var = this.a.c;
        if (setting == StickerSettingsCheckItem.Setting.SUGGESTS) {
            r820Var.invoke(new b.e(z));
        } else if (setting == StickerSettingsCheckItem.Setting.ANIMATIONS) {
            r820Var.invoke(new b.d(z));
        }
    }
}
