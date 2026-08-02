package com.vk.push.authsdk.ipc;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.vk.push.common.Logger;
import com.vk.push.common.analytics.AnalyticsTimingsStore;
import com.vk.push.core.data.repository.CrashReporterRepository;
import com.vk.push.core.domain.usecase.GetCallingAppInfoUseCase;
import kotlin.jvm.internal.Lambda;
import xsna.b4w0;
import xsna.bdn;
import xsna.bpn0;
import xsna.d02;
import xsna.gzs;
import xsna.hpj;
import xsna.m55;
import xsna.p55;
import xsna.q65;
import xsna.wpt;
import xsna.y55;
import xsna.zvj;

/* compiled from: AuthService.kt */
/* loaded from: classes.dex */
public final class AuthService extends Service {
    public final hpj b = zvj.a(bdn.b);
    public final bpn0 c = new bpn0(b.i);
    public final bpn0 d = new bpn0(new a());

    /* compiled from: AuthService.kt */
    /* loaded from: classes5.dex */
    public static final class a extends Lambda implements gzs<q65> {
        public a() {
            super(0);
        }

        @Override // xsna.gzs
        public final q65 invoke() {
            b4w0.b bVar = b4w0.E;
            return new q65((GetCallingAppInfoUseCase) b4w0.b.a().x.getValue(), new wpt(b4w0.b.a().c, (y55) b4w0.b.a().r.getValue(), (CrashReporterRepository) b4w0.b.a().i.getValue()), (p55) b4w0.b.a().p.getValue(), (y55) b4w0.b.a().r.getValue(), AuthService.this.b, (m55) b4w0.b.a().n.getValue(), (AnalyticsTimingsStore) b4w0.b.a().m.getValue());
        }
    }

    /* compiled from: AuthService.kt */
    /* loaded from: classes5.dex */
    public static final class b extends Lambda implements gzs<Logger> {
        public static final b i = new b(0);

        @Override // xsna.gzs
        public final Logger invoke() {
            b4w0.b bVar = b4w0.E;
            return b4w0.b.a().d;
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return d02.g(this.d, this.c);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        b4w0.b bVar = b4w0.E;
        if (b4w0.G != null && b4w0.b.a().a.d) {
            ((q65) this.d.getValue()).onDestroy();
        }
        super.onDestroy();
    }
}
