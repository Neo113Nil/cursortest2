package com.vk.im.ui.components.dialogs_list;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.dto.common.Source;
import com.vk.im.ui.components.dialogs_list.i;
import java.util.Collections;
import kotlin.collections.EmptyList;
import xsna.a1w;
import xsna.asu0;
import xsna.d1e0;
import xsna.e9w;
import xsna.f1e0;
import xsna.f1s;
import xsna.f9w;
import xsna.g1e0;
import xsna.g6o0;
import xsna.zk70;
import xsna.zzp0;

/* compiled from: TaskInvalidateEntityViaNetwork.java */
/* loaded from: classes2.dex */
public final class j extends zzp0<Boolean> {
    public static final f9w g = e9w.a(j.class);

    @NonNull
    public final c d;

    @NonNull
    public final f1e0 e;

    @Nullable
    public io.reactivex.rxjava3.disposables.c f;

    public j(@NonNull c cVar, @NonNull f1e0 f1e0Var) {
        this.d = cVar;
        this.e = f1e0Var;
    }

    @Override // xsna.zzp0
    public final void a() {
        io.reactivex.rxjava3.disposables.c cVar = this.f;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // xsna.zzp0
    public final void c(Throwable th) {
        g.a(th);
        if (this.d.f() != null) {
            zk70.e(th);
        }
    }

    @Override // xsna.zzp0
    public final void d() {
        a1w a1wVar = this.d.d;
        f1e0 f1e0Var = this.e;
        if (!f1e0Var.g()) {
            h(Boolean.FALSE);
            return;
        }
        g1e0.a aVar = new g1e0.a();
        aVar.a.e(f1e0Var);
        aVar.b = Source.NETWORK;
        aVar.c = true;
        aVar.d = "DialogsListPresenter";
        this.f = a1wVar.C(this, new d1e0(new g1e0(aVar))).q(asu0.a.c()).subscribe(new g6o0(this));
    }

    @Override // xsna.zzp0
    public final void e(Boolean bool) {
        if (bool.equals(Boolean.TRUE)) {
            c cVar = this.d;
            cVar.getClass();
            i.a aVar = new i.a();
            aVar.a = null;
            aVar.b = Collections.EMPTY_LIST;
            aVar.c = new f1e0();
            aVar.d = false;
            aVar.a = cVar;
            aVar.b = EmptyList.b;
            aVar.c = this.e;
            aVar.d = true;
            cVar.F(this, new i(aVar));
        }
    }

    public final String toString() {
        return "TaskInvalidateEntityViaNetwork{mMembersIds=" + this.e.j(new f1s(22)) + "} " + super.toString();
    }
}
