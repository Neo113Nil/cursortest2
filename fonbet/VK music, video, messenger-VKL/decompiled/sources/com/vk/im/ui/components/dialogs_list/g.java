package com.vk.im.ui.components.dialogs_list;

import com.vk.dto.common.Source;
import com.vk.im.engine.models.channels.ChannelsCounters;
import com.vk.im.engine.models.dialogs.DialogsCounters;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import xsna.a1w;
import xsna.asu0;
import xsna.e9w;
import xsna.epx;
import xsna.f9w;
import xsna.gnm;
import xsna.le6;
import xsna.oq80;
import xsna.peb;
import xsna.qcy;
import xsna.qpm;
import xsna.qsm;
import xsna.vtm;
import xsna.w2w;
import xsna.xpp;
import xsna.zk70;
import xsna.zzp0;

/* compiled from: TaskInvalidateArchive.kt */
/* loaded from: classes2.dex */
public final class g extends zzp0<c> {
    public static final f9w g = e9w.a(g.class);
    public final com.vk.im.ui.components.dialogs_list.c d;
    public final a1w e;
    public io.reactivex.rxjava3.disposables.c f;

    /* compiled from: TaskInvalidateArchive.kt */
    public static final class a {
        public com.vk.im.ui.components.dialogs_list.c a;
    }

    /* compiled from: TaskInvalidateArchive.kt */
    public static final class b extends le6<c> {
        public final e b;

        public b(e eVar) {
            this.b = eVar;
        }

        @Override // xsna.le6
        public final c e(w2w w2wVar) {
            DialogsFilter dialogsFilter = DialogsFilter.ARCHIVE;
            Source source = Source.CACHE;
            xpp<Boolean> xppVar = (xpp) w2wVar.L0(this, new qpm(dialogsFilter, source, false, null));
            DialogsCounters dialogsCounters = (DialogsCounters) w2wVar.J0(this, new gnm(source, false)).await();
            ChannelsCounters.b bVar = ((ChannelsCounters) w2wVar.J0(this, new peb(2, source)).await()).c;
            qcy<Object> qcyVar = ChannelsCounters.g[2];
            Integer num = (Integer) bVar.a().a();
            xpp<Boolean> xppVar2 = new xpp<>(Boolean.valueOf((num != null ? num.intValue() : 0) > 0), false);
            e eVar = this.b;
            eVar.p = xppVar;
            eVar.q = xppVar2;
            eVar.r = dialogsCounters.c();
            eVar.s = dialogsCounters.b();
            return new c(eVar.b());
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        @Override // xsna.le6, xsna.e1w
        public final int hashCode() {
            return this.b.hashCode();
        }

        @Override // xsna.e1w
        public final String toString() {
            return "InvalidateArchiveCmd(localState=" + this.b + ')';
        }
    }

    /* compiled from: TaskInvalidateArchive.kt */
    public static final class c {
        public final qsm a;

        public c(qsm qsmVar) {
            this.a = qsmVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Result(listInfo=" + this.a + ')';
        }
    }

    public g(com.vk.im.ui.components.dialogs_list.c cVar) {
        this.d = cVar;
        this.e = cVar.d;
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
        this.f = this.e.C(this, new b(this.d.h)).q(asu0.a.c()).subscribe(new oq80(this, 8));
    }

    @Override // xsna.zzp0
    public final void e(c cVar) {
        vtm f;
        c cVar2 = cVar;
        com.vk.im.ui.components.dialogs_list.c cVar3 = this.d;
        e eVar = cVar3.h;
        if (eVar.C || eVar.y || (f = cVar3.f()) == null) {
            return;
        }
        f.k(this, cVar2.a);
    }
}
