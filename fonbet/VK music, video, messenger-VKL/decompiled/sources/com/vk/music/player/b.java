package com.vk.music.player;

import com.vk.core.apps.BuildInfo;
import com.vk.music.player.e;
import com.vkontakte.android.VKApplication;
import java.util.Iterator;
import java.util.LinkedHashSet;
import xsna.f0q;
import xsna.w2b0;

/* compiled from: DelayedTaskManager.kt */
/* loaded from: classes.dex */
public final class b extends e.a {
    public final w2b0 b;
    public final f0q c;
    public final LinkedHashSet d = new LinkedHashSet();
    public boolean e;

    public b(w2b0 w2b0Var, f0q f0qVar) {
        this.b = w2b0Var;
        this.c = f0qVar;
    }

    @Override // com.vk.music.player.e.a, com.vk.music.player.e
    public final void N3(PlayState playState, f fVar) {
        LinkedHashSet linkedHashSet = this.d;
        if (playState == null || !playState.h()) {
            return;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        linkedHashSet.clear();
        if (this.e) {
            this.b.n0(this);
            this.e = false;
        }
        this.c.getClass();
        BuildInfo.Client client = BuildInfo.a;
        VKApplication vKApplication = com.vk.core.apps.a.a;
    }
}
