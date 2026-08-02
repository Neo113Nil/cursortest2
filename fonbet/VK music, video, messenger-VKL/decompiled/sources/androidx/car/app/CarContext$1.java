package androidx.car.app;

import androidx.car.app.IOnRequestPermissionsListener;
import androidx.lifecycle.Lifecycle;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import xsna.va80;

/* loaded from: classes11.dex */
class CarContext$1 extends IOnRequestPermissionsListener.Stub {
    final /* synthetic */ n this$0;
    final /* synthetic */ Executor val$executor;
    final /* synthetic */ Lifecycle val$lifecycle;
    final /* synthetic */ va80 val$listener;

    public CarContext$1(n nVar, Lifecycle lifecycle, Executor executor, va80 va80Var) {
        this.this$0 = nVar;
        this.val$lifecycle = lifecycle;
        this.val$executor = executor;
    }

    @Override // androidx.car.app.IOnRequestPermissionsListener
    public void onRequestPermissionsResult(String[] strArr, String[] strArr2) {
        if (this.val$lifecycle.getCurrentState().a(Lifecycle.State.CREATED)) {
            final List asList = Arrays.asList(strArr);
            final List asList2 = Arrays.asList(strArr2);
            this.val$executor.execute(new Runnable() { // from class: androidx.car.app.m
                @Override // java.lang.Runnable
                public final void run() {
                    List list = asList;
                    List list2 = asList2;
                    ((va80) null).a();
                }
            });
        }
    }
}
