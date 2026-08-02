package defpackage;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class rw9 implements OnSuccessListener, OnFailureListener {
    public final /* synthetic */ h0c a;

    public /* synthetic */ rw9(h0c h0cVar) {
        this.a = h0cVar;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        h0c h0cVar = this.a;
        h0cVar.onError(exc);
        h0cVar.onComplete();
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        k55 k55Var;
        h0c h0cVar = this.a;
        Object obj2 = h0cVar.get();
        r55 r55Var = r55.a;
        if (obj2 != r55Var && (k55Var = (k55) h0cVar.getAndSet(r55Var)) != r55Var) {
            w0c w0cVar = (w0c) h0cVar.b;
            try {
                if (obj == null) {
                    w0cVar.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else {
                    w0cVar.onSuccess(obj);
                }
                if (k55Var != null) {
                    k55Var.d();
                }
            } catch (Throwable th) {
                if (k55Var != null) {
                    k55Var.d();
                }
                throw th;
            }
        }
        h0cVar.onComplete();
    }
}
