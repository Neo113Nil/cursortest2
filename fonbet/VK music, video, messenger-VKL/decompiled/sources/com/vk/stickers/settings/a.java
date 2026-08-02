package com.vk.stickers.settings;

import com.vk.dto.stickers.VmojiAvatar;
import com.vk.dto.stickers.VmojiAvatarModel;
import xsna.d80;
import xsna.kcl0;
import xsna.rsg0;
import xsna.u3r0;
import xsna.yfb;
import xsna.zq70;

/* compiled from: StickerManagerSettingsInteractor.kt */
/* loaded from: classes6.dex */
public final class a {
    public final zq70 a;
    public final u3r0 b;
    public final kcl0 c;
    public final d80 d;

    public a(zq70 zq70Var, u3r0 u3r0Var, kcl0 kcl0Var, d80 d80Var) {
        this.a = zq70Var;
        this.b = u3r0Var;
        this.c = kcl0Var;
        this.d = d80Var;
    }

    public final io.reactivex.rxjava3.core.a a(final boolean z) {
        VmojiAvatar vmojiAvatar;
        VmojiAvatarModel p = this.c.p();
        return (p == null || (vmojiAvatar = p.b) == null) ? io.reactivex.rxjava3.core.a.k(new IllegalStateException("Vmoji Avatar is null")) : rsg0.Z(yfb.x(this.b.g(vmojiAvatar.getId(), z))).g(new io.reactivex.rxjava3.functions.a() { // from class: xsna.e5l0
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                ((kcl0) com.vk.stickers.settings.a.this.d.b).n(z);
            }
        });
    }
}
