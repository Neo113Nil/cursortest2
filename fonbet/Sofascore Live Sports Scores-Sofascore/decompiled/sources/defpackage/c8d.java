package defpackage;

import android.content.Context;
import com.sofascore.results.widget.NavigateLeftOrRight;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class c8d extends sq3 {
    public re0 r;
    public Context s;
    public int t;
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ NavigateLeftOrRight w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8d(NavigateLeftOrRight navigateLeftOrRight, sq3 sq3Var) {
        super(sq3Var);
        this.w = navigateLeftOrRight;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.a(null, null, null, this);
    }
}
