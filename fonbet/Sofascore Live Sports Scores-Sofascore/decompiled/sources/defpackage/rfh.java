package defpackage;

import android.content.Intent;
import android.content.pm.ShortcutManager;
import com.sofascore.results.league.service.ShortcutWorker;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class rfh extends sq3 {
    public String r;
    public ShortcutManager s;
    public String t;
    public List u;
    public String v;
    public Intent w;
    public /* synthetic */ Object x;
    public final /* synthetic */ ShortcutWorker y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rfh(ShortcutWorker shortcutWorker, sq3 sq3Var) {
        super(sq3Var);
        this.y = shortcutWorker;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= Integer.MIN_VALUE;
        return this.y.a(0, 0, this, null);
    }
}
