package com.vk.core.util.state;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.vk.core.util.state.AppStateCacheException;
import com.vk.log.L;
import com.vk.metrics.eventtracking.b;
import io.reactivex.rxjava3.internal.operators.observable.s0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ScheduledExecutorService;
import xsna.asu0;
import xsna.fwk;
import xsna.i7o0;
import xsna.itg0;
import xsna.jg6;
import xsna.nsi;
import xsna.pgn;
import xsna.q93;
import xsna.tw8;

/* compiled from: AppStateCache.kt */
/* loaded from: classes.dex */
public final class a {
    public static LinkedBlockingDeque<String> a;
    public static final tw8 b;
    public static final ScheduledExecutorService c;

    static {
        fwk fwkVar = new fwk();
        pgn pgnVar = new pgn();
        pgnVar.b = new ArrayList();
        b = new tw8(fwkVar, pgnVar);
        asu0.a.getClass();
        c = asu0.v();
    }

    public static void a(String str) {
        if (str != null) {
            L.G("AppStateCache", str);
            if (a == null) {
                a = new LinkedBlockingDeque<>();
            }
            LinkedBlockingDeque<String> linkedBlockingDeque = a;
            if (linkedBlockingDeque != null) {
                linkedBlockingDeque.add(str);
                if (linkedBlockingDeque.size() >= 8) {
                    linkedBlockingDeque.removeFirst();
                }
            }
        }
    }

    public static final Parcelable b(Class cls, Bundle bundle, String str) {
        Object obj;
        q93 q93Var;
        String string = bundle.getString(str);
        if (string != null) {
            tw8 tw8Var = b;
            pgn pgnVar = (pgn) tw8Var.c;
            synchronized (pgnVar) {
                try {
                    Iterator it = ((ArrayList) pgnVar.b).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (TextUtils.equals(((q93) obj).a, string)) {
                            break;
                        }
                    }
                    q93Var = (q93) obj;
                    if (q93Var != null && q93Var.b != null) {
                        L.e("AppStateCache", "GET mem: " + string);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (q93Var == null) {
                fwk fwkVar = (fwk) tw8Var.b;
                fwkVar.getClass();
                try {
                    q93Var = (q93) itg0.d(new s0(new jg6(fwkVar, string, cls)).r0(asu0.a.c()), 3000L);
                } catch (Throwable th2) {
                    L.j(th2, "AppStateCache");
                    a(th2.getMessage());
                    q93Var = null;
                }
                if (q93Var != null) {
                    pgnVar.a(q93Var);
                } else {
                    q93Var = null;
                }
            }
            if (q93Var == null) {
                b bVar = b.a;
                int i = AppStateCacheException.b;
                bVar.a(AppStateCacheException.a.a(string, str, tw8Var, a));
            }
            Parcelable parcelable = q93Var != null ? q93Var.b : null;
            if (parcelable instanceof Parcelable) {
                return parcelable;
            }
        }
        return null;
    }

    public static final void c(Bundle bundle, String str, Parcelable parcelable) {
        ArrayList a2;
        StringBuilder sb = new StringBuilder();
        sb.append(UUID.randomUUID());
        sb.append('_');
        sb.append(System.currentTimeMillis());
        String sb2 = sb.toString();
        bundle.putString(str, sb2);
        q93 q93Var = new q93(sb2, parcelable);
        tw8 tw8Var = b;
        ScheduledExecutorService scheduledExecutorService = c;
        pgn pgnVar = (pgn) tw8Var.c;
        pgnVar.a(q93Var);
        synchronized (pgnVar) {
            a2 = i7o0.a((ArrayList) pgnVar.b);
        }
        scheduledExecutorService.execute(new nsi(0, a2, tw8Var));
    }
}
