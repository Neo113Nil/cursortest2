package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class pzo extends xkn implements IInterface {
    public final f79 b;
    public final TaskCompletionSource c;
    public final /* synthetic */ t3p d;

    public pzo(t3p t3pVar, f79 f79Var, TaskCompletionSource taskCompletionSource) {
        this.d = t3pVar;
        attachInterface(this, "com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
        this.b = f79Var;
        this.c = taskCompletionSource;
    }

    public void F(Bundle bundle) {
        this.d.a.c(this.c);
        this.b.f("onCompleteUpdate", new Object[0]);
    }

    public void S1(Bundle bundle) {
        this.d.a.c(this.c);
        this.b.f("onRequestInfo", new Object[0]);
    }
}
