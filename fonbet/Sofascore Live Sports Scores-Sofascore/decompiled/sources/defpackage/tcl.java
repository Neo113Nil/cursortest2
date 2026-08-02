package defpackage;

import androidx.work.Worker;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class tcl implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Worker b;

    public /* synthetic */ tcl(Worker worker, int i) {
        this.a = i;
        this.b = worker;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Worker worker = this.b;
        switch (i) {
            case 0:
                return worker.doWork();
            default:
                return worker.getForegroundInfo();
        }
    }
}
