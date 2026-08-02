package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class mo4 extends Handler {
    public final /* synthetic */ int a = 1;
    public boolean b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mo4(jac jacVar, Looper looper) {
        super(looper);
        this.c = jacVar;
        this.b = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x017a  */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleMessage(Message message) {
        long min;
        Object obj;
        lfb lfbVar;
        switch (this.a) {
            case 0:
                no4 no4Var = (no4) message.obj;
                try {
                    int i = message.what;
                    if (i == 1) {
                        obj = ((oo4) this.c).k.k((qf6) no4Var.d);
                    } else {
                        if (i != 2) {
                            throw new RuntimeException();
                        }
                        oo4 oo4Var = (oo4) this.c;
                        q4c j = oo4Var.k.j(oo4Var.l, (pf6) no4Var.d);
                        synchronized (((oo4) this.c).o) {
                            try {
                                dja djaVar = ((oo4) this.c).y;
                                if (djaVar != null && (lfbVar = j.b) != null) {
                                    djaVar.a.c(new lfb(lfbVar.a, lfbVar.b, lfbVar.c, lfbVar.d, SystemClock.elapsedRealtime() - no4Var.c, lfbVar.f));
                                }
                            } finally {
                            }
                        }
                        obj = j;
                    }
                } catch (r4c e) {
                    no4 no4Var2 = (no4) message.obj;
                    obj = e;
                    if (no4Var2.b) {
                        int i2 = no4Var2.e + 1;
                        no4Var2.e = i2;
                        ((oo4) this.c).i.getClass();
                        obj = e;
                        if (i2 <= 3) {
                            lfb lfbVar2 = new lfb(e.a, e.b, e.c, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - no4Var2.c, e.d);
                            it7 it7Var = ((oo4) this.c).i;
                            int i3 = no4Var2.e;
                            it7Var.getClass();
                            for (Throwable jz2Var = e.getCause() instanceof IOException ? (IOException) e.getCause() : new jz2(e.getCause()); jz2Var != null; jz2Var = jz2Var.getCause()) {
                                if ((jz2Var instanceof s9e) || (jz2Var instanceof FileNotFoundException) || (jz2Var instanceof mi9) || (jz2Var instanceof cgb) || ((jz2Var instanceof te4) && ((te4) jz2Var).a == 2008)) {
                                    min = -9223372036854775807L;
                                    obj = e;
                                    if (min != C.TIME_UNSET) {
                                        synchronized (((oo4) this.c).o) {
                                            dja djaVar2 = ((oo4) this.c).y;
                                            if (djaVar2 != null) {
                                                djaVar2.a.c(lfbVar2);
                                            }
                                            synchronized (this) {
                                                try {
                                                    if (!this.b) {
                                                        sendMessageDelayed(Message.obtain(message), min);
                                                        return;
                                                    }
                                                    obj = e;
                                                } finally {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            min = Math.min((i3 - 1) * 1000, 5000);
                            obj = e;
                            if (min != C.TIME_UNSET) {
                            }
                        }
                    }
                } catch (Exception e2) {
                    tgj.e0("Key/provisioning request produced an unexpected exception. Not retrying.", e2);
                    obj = e2;
                }
                it7 it7Var2 = ((oo4) this.c).i;
                long j2 = no4Var.a;
                it7Var2.getClass();
                synchronized (this) {
                    try {
                        if (!this.b) {
                            ((oo4) this.c).n.obtainMessage(message.what, Pair.create(no4Var.d, obj)).sendToTarget();
                        }
                    } finally {
                    }
                }
                return;
            default:
                jac jacVar = (jac) this.c;
                if (this.b) {
                    switch (message.what) {
                        case 1:
                            hcc.O(message.getData());
                            return;
                        case 2:
                            jacVar.b((PlaybackStateCompat) message.obj);
                            return;
                        case 3:
                            jacVar.a((MediaMetadataCompat) message.obj);
                            return;
                        case 4:
                            if (message.obj == null) {
                                return;
                            }
                            pvd.j();
                            return;
                        case 5:
                            return;
                        case 6:
                            return;
                        case 7:
                            hcc.O((Bundle) message.obj);
                            return;
                        case 8:
                            jacVar.d();
                            return;
                        case 9:
                            ((Integer) message.obj).getClass();
                            return;
                        case 10:
                        default:
                            return;
                        case 11:
                            ((Boolean) message.obj).getClass();
                            return;
                        case 12:
                            ((Integer) message.obj).getClass();
                            return;
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mo4(oo4 oo4Var, Looper looper) {
        super(looper);
        this.c = oo4Var;
    }
}
