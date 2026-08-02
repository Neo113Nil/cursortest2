package com.vk.music.playlist.display.domain;

import com.vk.music.player.PlayState;
import com.vk.music.player.e;
import com.vk.music.playlist.display.domain.e;
import java.util.concurrent.ExecutorService;
import xsna.gzs;
import xsna.s3q0;
import xsna.yfn;

/* compiled from: DisplayMusicPlaylistFeature.kt */
/* loaded from: classes3.dex */
public final class c extends e.a {
    public final /* synthetic */ b b;

    /* compiled from: DisplayMusicPlaylistFeature.kt */
    public static final class a implements gzs<s3q0> {
        public final /* synthetic */ b b;
        public final /* synthetic */ b c;

        public a(b bVar, b bVar2) {
            this.b = bVar;
            this.c = bVar2;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            e.c U = b.U(this.c, (yfn) this.b.f.c);
            if (U != null) {
                this.c.T(U);
            }
            b bVar = this.c;
            bVar.T(new e.f(bVar.g.U0()));
            return s3q0.a;
        }
    }

    public c(b bVar) {
        this.b = bVar;
    }

    @Override // com.vk.music.player.e.a, com.vk.music.player.e
    public final void N3(PlayState playState, com.vk.music.player.f fVar) {
        ExecutorService executorService = com.vk.mvi.core.internal.executors.a.a;
        b bVar = this.b;
        com.vk.mvi.core.internal.executors.a.b(new a(bVar, bVar));
    }

    @Override // com.vk.music.player.e.a, com.vk.music.player.e
    public final void onError(String str) {
        this.b.T(new e.c(null, false));
    }

    @Override // com.vk.music.player.e.a, com.vk.music.player.e
    public final void z3() {
        b bVar = this.b;
        bVar.T(new e.f(bVar.g.U0()));
    }
}
