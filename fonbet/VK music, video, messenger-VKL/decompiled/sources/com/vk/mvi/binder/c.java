package com.vk.mvi.binder;

import com.vk.movika.sdk.base.observable.u;
import com.vk.mvi.binder.d;
import java.util.ArrayList;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.f5;
import xsna.gzs;
import xsna.i70;
import xsna.iyp;
import xsna.izs;
import xsna.ptk0;
import xsna.rd1;
import xsna.s3q0;
import xsna.uic;
import xsna.v37;
import xsna.vfe;
import xsna.w37;
import xsna.x37;

/* compiled from: Binder.kt */
/* loaded from: classes3.dex */
public final class c {
    public final d a;
    public BinderLifecycleMode b;
    public final ArrayList c;

    public c(d dVar) {
        this.a = dVar;
        this.b = new a();
        this.c = new ArrayList();
    }

    public static void a(c cVar, vfe vfeVar, iyp iypVar) {
        BinderLifecycleMode binderLifecycleMode = cVar.b;
        cVar.getClass();
        uic uicVar = (uic) ((izs) vfeVar.b).invoke(new w37(cVar, new u(5), binderLifecycleMode, iypVar, 0));
        cVar.c.add(uicVar);
        b.a(binderLifecycleMode, new f5(uicVar, 9));
    }

    public static void b(c cVar, vfe vfeVar, ptk0 ptk0Var) {
        BinderLifecycleMode binderLifecycleMode = cVar.b;
        cVar.getClass();
        uic uicVar = (uic) ((izs) vfeVar.b).invoke(new x37(cVar, new rd1(3), new Ref$ObjectRef(), binderLifecycleMode, ptk0Var));
        cVar.c.add(uicVar);
        b.a(binderLifecycleMode, new i70(uicVar, 9));
    }

    public c() {
        this(d.a.a);
    }

    /* compiled from: Binder.kt */
    public static final class a implements BinderLifecycleMode {
        @Override // com.vk.mvi.binder.BinderLifecycleMode
        public final void a(gzs<s3q0> gzsVar) {
        }

        @Override // com.vk.mvi.binder.BinderLifecycleMode
        public final void b(v37 v37Var) {
        }
    }
}
