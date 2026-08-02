package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class n0 implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o0 f32736a;

    public /* synthetic */ n0(o0 o0Var, byte[] bArr) {
        Objects.requireNonNull(o0Var);
        this.f32736a = o0Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            o0 o0Var = this.f32736a;
            synchronized (o0Var.h()) {
                try {
                    l0 l0Var = (l0) message.obj;
                    m0 m0Var = (m0) o0Var.h().get(l0Var);
                    if (m0Var != null && m0Var.g()) {
                        if (m0Var.d()) {
                            m0Var.a("GmsClientSupervisor");
                        }
                        o0Var.h().remove(l0Var);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i10 != 1) {
            return false;
        }
        o0 o0Var2 = this.f32736a;
        synchronized (o0Var2.h()) {
            try {
                l0 l0Var2 = (l0) message.obj;
                m0 m0Var2 = (m0) o0Var2.h().get(l0Var2);
                if (m0Var2 != null && m0Var2.e() == 3) {
                    String valueOf = String.valueOf(l0Var2);
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 47);
                    sb2.append("Timeout waiting for ServiceConnection callback ");
                    sb2.append(valueOf);
                    Log.e("GmsClientSupervisor", sb2.toString(), new Exception());
                    ComponentName i11 = m0Var2.i();
                    if (i11 == null) {
                        i11 = l0Var2.c();
                    }
                    if (i11 == null) {
                        String b10 = l0Var2.b();
                        AbstractC3191o.m(b10);
                        i11 = new ComponentName(b10, "unknown");
                    }
                    m0Var2.onServiceDisconnected(i11);
                }
            } finally {
            }
        }
        return true;
    }
}
