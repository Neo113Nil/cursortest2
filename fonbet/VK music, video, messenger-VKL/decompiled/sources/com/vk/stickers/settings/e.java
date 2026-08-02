package com.vk.stickers.settings;

import com.vk.dto.stickers.VmojiAvatar;
import com.vk.dto.stickers.VmojiAvatarModel;
import com.vk.stickers.settings.c;
import com.vk.stickers.settings.f;
import kotlin.NoWhenBranchMatchedException;
import xsna.bbw0;
import xsna.dm50;
import xsna.ept;
import xsna.hyu;
import xsna.p6l0;

/* compiled from: StickerSettingsReducer.kt */
/* loaded from: classes6.dex */
public final class e extends dm50<j, c, f> {
    @Override // xsna.dm50
    public final f c(f fVar, c cVar) {
        f fVar2 = fVar;
        c cVar2 = cVar;
        if (cVar2 instanceof c.b) {
            return f.b.b;
        }
        if (cVar2 instanceof c.C1803c) {
            return new f.a(((c.C1803c) cVar2).b);
        }
        if (cVar2 instanceof c.a) {
            c.a aVar = (c.a) cVar2;
            if (fVar2 instanceof f.a) {
                return new f.a(p6l0.a(((f.a) fVar2).b, null, null, null, false, aVar.b, 31));
            }
        } else if (cVar2 instanceof c.d) {
            c.d dVar = (c.d) cVar2;
            if (fVar2 instanceof f.a) {
                return new f.a(p6l0.a(((f.a) fVar2).b, dVar.b, dVar.c, null, false, false, 60));
            }
        } else if (cVar2 instanceof c.f) {
            c.f fVar3 = (c.f) cVar2;
            if (fVar2 instanceof f.a) {
                return new f.a(p6l0.a(((f.a) fVar2).b, null, null, null, fVar3.b, false, 47));
            }
        } else {
            if (!(cVar2 instanceof c.e)) {
                throw new NoWhenBranchMatchedException();
            }
            c.e eVar = (c.e) cVar2;
            if (fVar2 instanceof f.a) {
                f.a aVar2 = (f.a) fVar2;
                p6l0 p6l0Var = aVar2.b;
                VmojiAvatarModel vmojiAvatarModel = p6l0Var.c.a;
                if (vmojiAvatarModel == null) {
                    return fVar2;
                }
                VmojiAvatar zb = VmojiAvatar.zb(vmojiAvatarModel.b, null, null, eVar.b, 23);
                VmojiAvatarModel vmojiAvatarModel2 = p6l0Var.c.a;
                return new f.a(p6l0.a(aVar2.b, null, null, new bbw0(new VmojiAvatarModel(zb, vmojiAvatarModel2.c, vmojiAvatarModel2.d, vmojiAvatarModel2.e, vmojiAvatarModel2.f, vmojiAvatarModel2.g)), false, false, 59));
            }
        }
        return fVar2;
    }

    @Override // xsna.dm50
    public final j d() {
        return new j(e(new ept(27)), e(new hyu(19)));
    }

    @Override // xsna.dm50
    public final void h(f fVar, j jVar) {
        f fVar2 = fVar;
        j jVar2 = jVar;
        if (fVar2 instanceof f.a) {
            f(jVar2.a, fVar2);
        } else {
            if (!(fVar2 instanceof f.b)) {
                throw new NoWhenBranchMatchedException();
            }
            f(jVar2.b, fVar2);
        }
    }
}
