package defpackage;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zwo extends kyo {
    public final /* synthetic */ int b;
    public final /* synthetic */ TaskCompletionSource c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zwo(t3p t3pVar, TaskCompletionSource taskCompletionSource, String str, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.b = 0;
        this.e = t3pVar;
        this.d = str;
        this.c = taskCompletionSource2;
    }

    @Override // defpackage.kyo
    public final void a() {
        switch (this.b) {
            case 0:
                TaskCompletionSource taskCompletionSource = this.c;
                t3p t3pVar = (t3p) this.e;
                String str = (String) this.d;
                try {
                    t3pVar.a.m.Z0(t3pVar.b, t3p.a(t3pVar, str), new l2p(t3pVar, taskCompletionSource, str));
                    return;
                } catch (RemoteException e) {
                    t3p.e.e(e, "requestUpdateInfo(%s)", str);
                    taskCompletionSource.trySetException(new RuntimeException(e));
                    return;
                }
            case 1:
                TaskCompletionSource taskCompletionSource2 = this.c;
                t3p t3pVar2 = (t3p) this.e;
                try {
                    t3pVar2.a.m.i1(t3pVar2.b, t3p.b(), new f1p(t3pVar2, new f79("OnCompleteUpdateCallback", 7), taskCompletionSource2));
                    return;
                } catch (RemoteException e2) {
                    t3p.e.e(e2, "completeUpdate(%s)", (String) this.d);
                    taskCompletionSource2.trySetException(new RuntimeException(e2));
                    return;
                }
            default:
                synchronized (((qbp) this.e).f) {
                    try {
                        qbp qbpVar = (qbp) this.e;
                        TaskCompletionSource taskCompletionSource3 = this.c;
                        qbpVar.e.add(taskCompletionSource3);
                        taskCompletionSource3.getTask().addOnCompleteListener(new gvo(5, qbpVar, taskCompletionSource3));
                        if (((qbp) this.e).k.getAndIncrement() > 0) {
                            ((qbp) this.e).b.f("Already connected to the service.", new Object[0]);
                        }
                        qbp.b((qbp) this.e, (kyo) this.d);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zwo(Object obj, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, Object obj2, int i) {
        super(taskCompletionSource);
        this.b = i;
        this.e = obj;
        this.c = taskCompletionSource2;
        this.d = obj2;
    }
}
