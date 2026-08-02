package com.google.firebase.sessions;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import kotlin.time.DurationUnit;
import xsna.brm0;
import xsna.cyi0;
import xsna.eoo;
import xsna.eti0;
import xsna.iti0;
import xsna.kkr;
import xsna.oti0;
import xsna.sti0;
import xsna.vhr;
import xsna.zno;

/* compiled from: SessionLifecycleService.kt */
/* loaded from: classes.dex */
public final class SessionLifecycleService extends Service {
    public final HandlerThread b = new HandlerThread("FirebaseSessions_HandlerThread");
    public a c;
    public Messenger d;

    /* compiled from: SessionLifecycleService.kt */
    public static final class a extends Handler {
        public boolean a;
        public long b;
        public final ArrayList<Messenger> c;

        public a(Looper looper) {
            super(looper);
            this.c = new ArrayList<>();
        }

        public final void a() {
            oti0 e = ((kkr) vhr.d().b(kkr.class)).e();
            iti0 iti0Var = ((kkr) vhr.d().b(kkr.class)).b().e;
            if (iti0Var == null) {
                iti0Var = null;
            }
            e.a(iti0Var);
            Iterator it = new ArrayList(this.c).iterator();
            while (it.hasNext()) {
                b((Messenger) it.next());
            }
        }

        public final void b(Messenger messenger) {
            try {
                if (this.a) {
                    iti0 iti0Var = ((kkr) vhr.d().b(kkr.class)).b().e;
                    if (iti0Var == null) {
                        iti0Var = null;
                    }
                    d(messenger, iti0Var.a);
                    return;
                }
                String b = ((kkr) vhr.d().b(kkr.class)).a().b();
                if (b != null) {
                    d(messenger, b);
                }
            } catch (IllegalStateException unused) {
            }
        }

        public final void c() {
            try {
                sti0 b = ((kkr) vhr.d().b(kkr.class)).b();
                int i = b.d + 1;
                b.d = i;
                b.e = new iti0(i == 0 ? b.c : brm0.y(b.b.next().toString(), "-", "").toLowerCase(Locale.ROOT), b.c, b.d, b.a.a());
                a();
                eti0 a = ((kkr) vhr.d().b(kkr.class)).a();
                iti0 iti0Var = ((kkr) vhr.d().b(kkr.class)).b().e;
                if (iti0Var == null) {
                    iti0Var = null;
                }
                a.a(iti0Var.a);
            } catch (IllegalStateException unused) {
            }
        }

        public final void d(Messenger messenger, String str) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("SessionUpdateExtra", str);
                Message obtain = Message.obtain(null, 3, 0, 0);
                obtain.setData(bundle);
                messenger.send(obtain);
            } catch (DeadObjectException unused) {
                Objects.toString(messenger);
                this.c.remove(messenger);
            } catch (Exception unused2) {
                Objects.toString(messenger);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
        
            if (xsna.zno.g(r6) == false) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0093, code lost:
        
            if (xsna.zno.g(r6) == false) goto L36;
         */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void handleMessage(Message message) {
            long e;
            if (this.b > message.getWhen()) {
                message.getWhen();
                return;
            }
            int i = message.what;
            if (i != 1) {
                if (i == 2) {
                    message.getWhen();
                    this.b = message.getWhen();
                    return;
                }
                if (i != 4) {
                    message.toString();
                    super.handleMessage(message);
                    return;
                }
                Messenger messenger = message.replyTo;
                ArrayList<Messenger> arrayList = this.c;
                arrayList.add(messenger);
                b(message.replyTo);
                Objects.toString(message.replyTo);
                message.getWhen();
                arrayList.size();
                return;
            }
            message.getWhen();
            if (this.a) {
                long when = message.getWhen() - this.b;
                cyi0 c = ((kkr) vhr.d().b(kkr.class)).c();
                zno d = c.a.d();
                if (d != null) {
                    e = d.b;
                    zno.a aVar = zno.c;
                    if (e > 0) {
                    }
                }
                zno d2 = c.b.d();
                if (d2 != null) {
                    e = d2.b;
                    zno.a aVar2 = zno.c;
                    if (e > 0) {
                    }
                }
                zno.a aVar3 = zno.c;
                e = eoo.e(30, DurationUnit.MINUTES);
                if (when > zno.e(e)) {
                    c();
                }
            } else {
                this.a = true;
                c();
            }
            this.b = message.getWhen();
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        Messenger messenger;
        Object parcelableExtra;
        if (intent != null) {
            intent.getAction();
            if (Build.VERSION.SDK_INT >= 33) {
                parcelableExtra = intent.getParcelableExtra("ClientCallbackMessenger", Messenger.class);
                messenger = (Messenger) parcelableExtra;
            } else {
                messenger = (Messenger) intent.getParcelableExtra("ClientCallbackMessenger");
            }
            if (messenger != null) {
                Message obtain = Message.obtain(null, 4, 0, 0);
                obtain.replyTo = messenger;
                a aVar = this.c;
                if (aVar != null) {
                    aVar.sendMessage(obtain);
                }
            }
            Messenger messenger2 = this.d;
            if (messenger2 != null) {
                return messenger2.getBinder();
            }
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        HandlerThread handlerThread = this.b;
        handlerThread.start();
        this.c = new a(handlerThread.getLooper());
        this.d = new Messenger(this.c);
        Process.myPid();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.b.quit();
    }
}
