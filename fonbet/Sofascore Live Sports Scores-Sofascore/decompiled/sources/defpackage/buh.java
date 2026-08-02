package defpackage;

import android.content.Context;
import com.sofascore.results.widget.SofaWidgetReceiver;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class buh extends sq3 {
    public Context r;
    public re0 s;
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ SofaWidgetReceiver v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public buh(SofaWidgetReceiver sofaWidgetReceiver, sq3 sq3Var) {
        super(sq3Var);
        this.v = sofaWidgetReceiver;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        int i = SofaWidgetReceiver.e;
        return this.v.c(null, 0, this);
    }
}
