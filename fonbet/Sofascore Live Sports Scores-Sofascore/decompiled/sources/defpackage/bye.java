package defpackage;

import com.sofascore.model.mvvm.model.Player;
import com.sofascore.results.player.PlayerWorker;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class bye extends sq3 {
    public int r;
    public int s;
    public Player t;
    public Map u;
    public /* synthetic */ Object v;
    public final /* synthetic */ PlayerWorker w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bye(PlayerWorker playerWorker, sq3 sq3Var) {
        super(sq3Var);
        this.w = playerWorker;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.c(0, this);
    }
}
