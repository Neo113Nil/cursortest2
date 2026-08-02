package com.google.android.gms.cast;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.cast.zzfk;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.a70;
import defpackage.ejg;
import defpackage.haf;
import defpackage.hcc;
import defpackage.t8p;
import defpackage.w1l;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbm extends GoogleApi implements zzq {
    public static final Logger H = new Logger("CastClient", null);
    public static final Api I = new Api("Cast.API_CXLESS", new a(), com.google.android.gms.cast.internal.zzal.b);
    public zzao A;
    public final CastDevice B;
    public final HashMap C;
    public final HashMap D;
    public final t8p E;
    public final List F;
    public int G;
    public final b l;
    public zzfk m;
    public boolean n;
    public boolean o;
    public TaskCompletionSource p;
    public TaskCompletionSource q;
    public final AtomicLong r;
    public final Object s;
    public final Object t;
    public ApplicationMetadata u;
    public String v;
    public double w;
    public boolean x;
    public int y;
    public int z;

    public zzbm(Context context, Cast.CastOptions castOptions) {
        super(context, I, castOptions, GoogleApi.Settings.c);
        this.l = new b(this);
        this.s = new Object();
        this.t = new Object();
        this.F = w1l.n();
        this.E = castOptions.b;
        this.B = castOptions.a;
        this.C = new HashMap();
        this.D = new HashMap();
        this.r = new AtomicLong(0L);
        this.G = 1;
        q();
    }

    @Override // com.google.android.gms.cast.zzq
    public final Task a(String str) {
        Cast.MessageReceivedCallback messageReceivedCallback;
        if (TextUtils.isEmpty(str)) {
            a70.p("Channel namespace cannot be null or empty");
            return null;
        }
        HashMap hashMap = this.D;
        synchronized (hashMap) {
            messageReceivedCallback = (Cast.MessageReceivedCallback) hashMap.remove(str);
        }
        TaskApiCall.Builder a = TaskApiCall.a();
        a.a = new hcc(25, this, messageReceivedCallback, str);
        a.d = 8414;
        return h(1, a.a());
    }

    @Override // com.google.android.gms.cast.zzq
    public final Task b(String str, String str2) {
        CastUtils.b(str);
        if (TextUtils.isEmpty(str2)) {
            a70.p("The message payload cannot be null or empty");
            return null;
        }
        if (str2.length() <= 524288) {
            TaskApiCall.Builder a = TaskApiCall.a();
            a.a = new ejg(24, this, str, str2);
            a.d = 8405;
            return h(1, a.a());
        }
        H.c("Message send failed. Message exceeds maximum size", new Object[0]);
        a70.p("Message exceeds maximum size524288");
        return null;
    }

    @Override // com.google.android.gms.cast.zzq
    public final Task c(String str, RemoteMediaClient remoteMediaClient) {
        CastUtils.b(str);
        if (remoteMediaClient != null) {
            HashMap hashMap = this.D;
            synchronized (hashMap) {
                hashMap.put(str, remoteMediaClient);
            }
        }
        TaskApiCall.Builder a = TaskApiCall.a();
        a.a = new ejg(25, this, str, remoteMediaClient);
        a.d = 8413;
        return h(1, a.a());
    }

    public final void i(int i) {
        synchronized (this.t) {
            try {
                TaskCompletionSource taskCompletionSource = this.q;
                if (taskCompletionSource == null) {
                    return;
                }
                if (i == 0) {
                    taskCompletionSource.setResult(new Status(0, null, null, null));
                } else {
                    taskCompletionSource.setException(ApiExceptionUtil.a(new Status(i, null, null, null)));
                }
                this.q = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(int i, long j) {
        TaskCompletionSource taskCompletionSource;
        HashMap hashMap = this.C;
        synchronized (hashMap) {
            Long valueOf = Long.valueOf(j);
            taskCompletionSource = (TaskCompletionSource) hashMap.get(valueOf);
            hashMap.remove(valueOf);
        }
        if (taskCompletionSource != null) {
            if (i == 0) {
                taskCompletionSource.setResult(null);
            } else {
                taskCompletionSource.setException(ApiExceptionUtil.a(new Status(i, null, null, null)));
            }
        }
    }

    public final Handler k() {
        zzfk zzfkVar = this.m;
        if (zzfkVar != null) {
            return zzfkVar;
        }
        zzfk zzfkVar2 = new zzfk(this.g);
        this.m = zzfkVar2;
        return zzfkVar2;
    }

    public final void l() {
        H.a("removing all MessageReceivedCallbacks", new Object[0]);
        HashMap hashMap = this.D;
        synchronized (hashMap) {
            hashMap.clear();
        }
    }

    public final void m() {
        Preconditions.k("Not connected to device", n());
    }

    public final boolean n() {
        return this.G == 3;
    }

    public final void o(int i) {
        synchronized (this.s) {
            try {
                TaskCompletionSource taskCompletionSource = this.p;
                if (taskCompletionSource != null) {
                    taskCompletionSource.setException(ApiExceptionUtil.a(new Status(i, null, null, null)));
                }
                this.p = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Task p() {
        TaskApiCall.Builder a = TaskApiCall.a();
        a.a = haf.c;
        a.d = 8403;
        Task h = h(1, a.a());
        l();
        ListenerHolder.ListenerKey listenerKey = ListenerHolders.a(this.g, this.l, "castDeviceControllerListenerKey").b;
        Preconditions.j(listenerKey, "Key must not be null");
        f(listenerKey, 8415);
        return h;
    }

    public final void q() {
        CastDevice castDevice = this.B;
        com.google.android.gms.cast.internal.zzp zzpVar = castDevice.i;
        if (zzpVar.a(com.ironsource.mediationsdk.metadata.a.o) || !zzpVar.a(4) || zzpVar.a(1)) {
            return;
        }
        "Chromecast Audio".equals(castDevice.e);
    }
}
