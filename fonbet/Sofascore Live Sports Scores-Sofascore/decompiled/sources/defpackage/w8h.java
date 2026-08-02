package defpackage;

import android.content.Context;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class w8h extends a implements cu3 {
    public final /* synthetic */ zij b;
    public final /* synthetic */ af0 c;
    public final /* synthetic */ Context d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8h(zij zijVar, af0 af0Var, Context context) {
        super(bu3.a);
        this.b = zijVar;
        this.c = af0Var;
        this.d = context;
    }

    @Override // defpackage.cu3
    public final void handleException(CoroutineContext coroutineContext, Throwable th) {
        af0 af0Var = this.c;
        Context context = this.d;
        zij zijVar = this.b;
        xw3.L(zijVar, null, null, new cce(af0Var, context, th, zijVar, null, 15), 3);
    }
}
