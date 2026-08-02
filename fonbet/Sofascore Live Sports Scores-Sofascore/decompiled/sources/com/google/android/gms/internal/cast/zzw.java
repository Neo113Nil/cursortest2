package com.google.android.gms.internal.cast;

import android.text.TextUtils;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.Session;
import com.google.android.gms.cast.framework.SessionManagerListener;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.m4n;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzw implements SessionManagerListener {
    public final /* synthetic */ zzy a;

    public zzw(zzy zzyVar) {
        this.a = zzyVar;
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final void a(Session session, int i) {
        zzcr zzcrVar = new zzcr(6);
        zzcrVar.a = Integer.valueOf(i);
        zzcs zzcsVar = new zzcs(zzcrVar);
        zzy zzyVar = this.a;
        zzyVar.a(zzcsVar);
        m4n m4nVar = zzyVar.d;
        Preconditions.i(m4nVar);
        m4nVar.a((CastSession) session);
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final void c(Session session, String str) {
        zzcs zzcsVar = new zzcs(new zzcr(7));
        zzy zzyVar = this.a;
        zzyVar.a(zzcsVar);
        m4n m4nVar = zzyVar.d;
        Preconditions.i(m4nVar);
        m4nVar.a((CastSession) session);
        m4n m4nVar2 = zzyVar.d;
        Preconditions.i(m4nVar2);
        String str2 = m4nVar2.k;
        if (str2 == null) {
            m4nVar2.k = str;
        } else {
            if (TextUtils.equals(str, str2)) {
                return;
            }
            m4nVar2.b(4);
        }
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final void d(Session session, int i) {
        zzcr zzcrVar = new zzcr(9);
        zzcrVar.a = Integer.valueOf(i);
        zzy zzyVar = this.a;
        zzcrVar.b = Boolean.valueOf(zzyVar.b.b == 2);
        zzyVar.a(new zzcs(zzcrVar));
        zzyVar.c();
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final void e(Session session, int i) {
        zzcr zzcrVar = new zzcr(5);
        zzcrVar.a = Integer.valueOf(i);
        zzcs zzcsVar = new zzcs(zzcrVar);
        zzy zzyVar = this.a;
        zzyVar.a(zzcsVar);
        zzyVar.c();
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final void f(Session session) {
        CastSession castSession = (CastSession) session;
        zzcr zzcrVar = new zzcr(2);
        zzy zzyVar = this.a;
        zzcrVar.b = Boolean.valueOf(zzyVar.b.b == 2);
        zzyVar.a(new zzcs(zzcrVar));
        m4n m4nVar = zzyVar.d;
        Preconditions.i(m4nVar);
        m4nVar.a(castSession);
        castSession.m = zzyVar.e;
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final void k(Session session, String str) {
        zzcs zzcsVar = new zzcs(new zzcr(4));
        zzy zzyVar = this.a;
        zzyVar.a(zzcsVar);
        m4n m4nVar = zzyVar.d;
        Preconditions.i(m4nVar);
        m4nVar.a((CastSession) session);
        m4n m4nVar2 = zzyVar.d;
        Preconditions.i(m4nVar2);
        String str2 = m4nVar2.k;
        if (str2 == null) {
            m4nVar2.k = str;
        } else {
            if (TextUtils.equals(str, str2)) {
                return;
            }
            m4nVar2.b(4);
        }
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* synthetic */ void m(Session session, boolean z) {
        zzcs zzcsVar = new zzcs(new zzcr(4));
        zzy zzyVar = this.a;
        zzyVar.a(zzcsVar);
        m4n m4nVar = zzyVar.d;
        Preconditions.i(m4nVar);
        m4nVar.a((CastSession) session);
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final void n(Session session, int i) {
        zzcr zzcrVar = new zzcr(8);
        zzcrVar.a = Integer.valueOf(i);
        zzcs zzcsVar = new zzcs(zzcrVar);
        zzy zzyVar = this.a;
        zzyVar.a(zzcsVar);
        zzyVar.c();
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void o(Session session) {
    }
}
