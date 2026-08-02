package com.vk.im.chat.clips.decoration.impl.presentation.bottom.screen.reply;

import com.vk.im.chat.clips.decoration.impl.presentation.bottom.screen.reply.e;
import com.vk.im.chat.clips.decoration.impl.presentation.bottom.screen.reply.f;
import kotlin.NoWhenBranchMatchedException;
import xsna.ak;
import xsna.c2;
import xsna.dm50;
import xsna.zj;

/* compiled from: ChatClipsReplyReducer.kt */
/* loaded from: classes2.dex */
public final class g extends dm50<h, f, e> {
    @Override // xsna.dm50
    public final e c(e eVar, f fVar) {
        f fVar2 = fVar;
        if (fVar2.equals(f.a.b)) {
            return e.b.b;
        }
        if (fVar2 instanceof f.b) {
            return new e.c(((f.b) fVar2).b);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final h d() {
        return new h(e(new zj(9)), e(new ak(7)), e(new c2(12)));
    }

    @Override // xsna.dm50
    public final void h(e eVar, h hVar) {
        e eVar2 = eVar;
        h hVar2 = hVar;
        if (eVar2 instanceof e.b) {
            f(hVar2.a, eVar2);
        } else if (eVar2 instanceof e.c) {
            f(hVar2.b, eVar2);
        }
    }
}
