package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class y7p extends u7p implements ddb {
    @Override // defpackage.ddb
    public final void addListener(Runnable runnable, Executor executor) {
        d().addListener(runnable, executor);
    }

    @Override // defpackage.u7p
    public /* bridge */ /* synthetic */ Future c() {
        throw null;
    }

    public abstract ddb d();
}
