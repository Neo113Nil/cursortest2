package defpackage;

import com.google.android.gms.internal.ads.zzea;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class pan implements Executor {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzea b;

    public /* synthetic */ pan(zzea zzeaVar, int i) {
        this.a = i;
        this.b = zzeaVar;
    }

    @Override // java.util.concurrent.Executor
    public final /* synthetic */ void execute(Runnable runnable) {
        int i = this.a;
        zzea zzeaVar = this.b;
        switch (i) {
            case 0:
                zzeaVar.f(runnable);
                break;
            default:
                zzeaVar.f(runnable);
                break;
        }
    }
}
