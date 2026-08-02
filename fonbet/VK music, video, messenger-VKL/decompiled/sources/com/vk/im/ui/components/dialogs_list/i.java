package com.vk.im.ui.components.dialogs_list;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.users.User;
import java.util.Collection;
import java.util.Set;
import xsna.a1w;
import xsna.asu0;
import xsna.d1e0;
import xsna.e9w;
import xsna.f1e0;
import xsna.f1s;
import xsna.f9w;
import xsna.g1e0;
import xsna.vtm;
import xsna.wpp;
import xsna.zk70;
import xsna.zzp0;

/* compiled from: TaskInvalidateEntityViaCache.java */
/* loaded from: classes2.dex */
public final class i extends zzp0<b> {
    public static final f9w i = e9w.a(i.class);

    @NonNull
    public final c d;

    @NonNull
    public final Collection<Integer> e;

    @NonNull
    public final f1e0 f;
    public final boolean g;

    @Nullable
    public io.reactivex.rxjava3.disposables.c h;

    /* compiled from: TaskInvalidateEntityViaCache.java */
    public static class a {
        public c a;
        public Collection<Integer> b;
        public f1e0 c;
        public boolean d;
    }

    /* compiled from: TaskInvalidateEntityViaCache.java */
    public static class b {
        public ProfilesInfo a;
    }

    public i(a aVar) {
        c cVar = aVar.a;
        if (cVar == null) {
            throw new IllegalArgumentException("presenter is null");
        }
        Collection<Integer> collection = aVar.b;
        if (collection == null) {
            throw new IllegalArgumentException("msgIds is null");
        }
        f1e0 f1e0Var = aVar.c;
        if (f1e0Var == null) {
            throw new IllegalArgumentException("membersIds is null");
        }
        this.d = cVar;
        this.e = collection;
        this.f = f1e0Var;
        this.g = aVar.d;
        this.h = null;
    }

    @Override // xsna.zzp0
    public final void a() {
        io.reactivex.rxjava3.disposables.c cVar = this.h;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // xsna.zzp0
    public final void c(Throwable th) {
        i.a(th);
        if (this.d.f() != null) {
            zk70.e(th);
        }
    }

    @Override // xsna.zzp0
    public final void d() {
        c cVar = this.d;
        a1w a1wVar = cVar.d;
        e eVar = cVar.h;
        wpp<Long, User> wppVar = eVar.h.b;
        f1e0 f1e0Var = this.f;
        Set h = wppVar.h(f1e0Var.a);
        ProfilesInfo profilesInfo = eVar.h;
        Set h2 = profilesInfo.d.h(f1e0Var.c);
        Set h3 = profilesInfo.e.h(f1e0Var.d);
        if (h.isEmpty() && h.isEmpty() && h2.isEmpty() && h3.isEmpty()) {
            h(null);
            return;
        }
        g1e0.a aVar = new g1e0.a();
        aVar.b = Source.CACHE;
        aVar.k(h);
        aVar.e(h2);
        aVar.f(h3);
        this.h = a1wVar.C(this, new d1e0(new g1e0(aVar))).q(asu0.a.c()).subscribe(new h(this));
    }

    @Override // xsna.zzp0
    public final void e(b bVar) {
        b bVar2 = bVar;
        c cVar = this.d;
        e eVar = cVar.h;
        vtm f = cVar.f();
        if (bVar2 != null) {
            eVar.h.Hb(bVar2.a);
            if (this.g) {
                eVar.B = false;
            }
            if (f != null) {
                cVar.B(this);
            }
            cVar.r(this);
        }
    }

    public final String toString() {
        return "TaskInvalidateEntityViaCache{mMsgIds=" + this.e + ", mMembersIds=" + this.f.j(new f1s(22)) + ", mIsFromUpdate=" + this.g + "} " + super.toString();
    }
}
