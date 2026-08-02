package defpackage;

import android.os.CancellationSignal;
import java.util.concurrent.Callable;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class su3 extends sq3 {
    public k6g r;
    public CancellationSignal s;
    public Callable t;
    public CoroutineContext u;
    public /* synthetic */ Object v;
    public final /* synthetic */ dti w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su3(dti dtiVar, sq3 sq3Var) {
        super(sq3Var);
        this.w = dtiVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.l(null, null, null, this);
    }
}
