package com.vk.music.informer.mvi;

import com.vk.music.informer.mvi.h;
import java.time.Instant;
import kotlin.NoWhenBranchMatchedException;
import xsna.bpn0;
import xsna.dm50;
import xsna.fa00;
import xsna.nx40;
import xsna.svz;
import xsna.x84;

/* compiled from: MusicPlayerInformerReducer.kt */
/* loaded from: classes3.dex */
public final class j extends dm50<MusicPlayerInformerViewState, h, nx40> {
    public final bpn0 d;

    public j() {
        super(new nx40(0));
        this.d = new bpn0(new x84(23));
    }

    @Override // xsna.dm50
    public final nx40 c(nx40 nx40Var, h hVar) {
        boolean z;
        nx40 nx40Var2 = nx40Var;
        h hVar2 = hVar;
        if (hVar2 instanceof h.b) {
            h.b bVar = (h.b) hVar2;
            if (bVar.b.e() != null) {
                try {
                    z = Instant.ofEpochSecond(r8.intValue()).isAfter(Instant.now());
                } catch (Exception unused) {
                    z = false;
                }
                if (z) {
                    return nx40.a(nx40Var2, bVar.b, false, false, false, false, 30);
                }
            }
            return nx40.a(nx40Var2, null, false, false, false, false, 30);
        }
        if (hVar2 instanceof h.d) {
            return nx40.a(nx40Var2, null, ((h.d) hVar2).b, false, false, false, 29);
        }
        if (hVar2 instanceof h.e) {
            return nx40.a(nx40Var2, null, false, ((h.e) hVar2).b, false, false, 27);
        }
        if (hVar2 instanceof h.a) {
            return nx40.a(nx40Var2, null, false, false, ((h.a) hVar2).b, false, 23);
        }
        if (hVar2 instanceof h.f) {
            return nx40.a(nx40Var2, null, false, false, false, ((h.f) hVar2).b, 15);
        }
        if (hVar2 instanceof h.c) {
            return nx40.a(nx40Var2, null, false, false, false, false, 30);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final MusicPlayerInformerViewState d() {
        return new MusicPlayerInformerViewState(e(new fa00(this, 8)), e(new svz(11)));
    }

    @Override // xsna.dm50
    public final void h(nx40 nx40Var, MusicPlayerInformerViewState musicPlayerInformerViewState) {
        nx40 nx40Var2 = nx40Var;
        MusicPlayerInformerViewState musicPlayerInformerViewState2 = musicPlayerInformerViewState;
        if (nx40Var2.b == null || !nx40Var2.c || nx40Var2.d || nx40Var2.e || nx40Var2.f) {
            f(musicPlayerInformerViewState2.b, nx40Var2);
        } else {
            f(musicPlayerInformerViewState2.a, nx40Var2);
        }
    }
}
