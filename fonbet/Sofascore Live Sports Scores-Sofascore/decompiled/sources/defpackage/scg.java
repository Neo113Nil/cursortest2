package defpackage;

import android.app.Activity;
import android.view.View;
import com.facebook.w;
import com.google.android.gms.cast.framework.media.MediaQueue;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.framework.media.h;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.internal.Preconditions;
import com.mbridge.msdk.MBridgeConstans;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class scg extends TimerTask {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ scg(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ae A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0 A[Catch: Exception -> 0x0133, TRY_LEAVE, TryCatch #7 {Exception -> 0x0133, blocks: (B:23:0x006a, B:26:0x007c, B:31:0x008c, B:36:0x00b0, B:38:0x00ca, B:42:0x00de, B:44:0x00e3, B:45:0x0102, B:61:0x012f, B:66:0x00ff, B:68:0x00db, B:73:0x00c7, B:78:0x00a9, B:84:0x0078, B:40:0x00cf, B:70:0x00c3, B:81:0x0074, B:75:0x00a1, B:48:0x0112, B:55:0x0129, B:51:0x0119), top: B:22:0x006a, inners: #0, #1, #3, #5, #6, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v7, types: [android.os.Handler] */
    @Override // java.util.TimerTask, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        WeakReference weakReference;
        Activity activity;
        BasePendingResult basePendingResult;
        ?? r1 = 0;
        r1 = 0;
        boolean z = false;
        z = false;
        switch (this.a) {
            case 0:
                bo4 bo4Var = (bo4) this.b;
                if (((rcg) bo4Var.e) != rcg.c) {
                    long j = bo4Var.b - 250;
                    bo4Var.b = j;
                    if (j > 0) {
                        ((Function1) bo4Var.c).invoke(Long.valueOf(j));
                        return;
                    }
                    bo4Var.e = rcg.d;
                    ((Function0) bo4Var.d).invoke();
                    ((Timer) bo4Var.f).cancel();
                    return;
                }
                return;
            case 1:
                hs4 hs4Var = z45.a;
                xw3.L(s9a.c(rob.a), null, null, new lfg((tfg) this.b, r1, z ? 1 : 0), 3);
                return;
            case 2:
                ahg ahgVar = (ahg) this.b;
                ahgVar.m = true;
                ahgVar.b.a(true);
                ahgVar.c();
                return;
            case 3:
                hkg.T().post(new kac(this, 17));
                return;
            case 4:
                jhg jhgVar = (jhg) this.b;
                blg blgVar = jhgVar.e;
                if (blgVar == null) {
                    return;
                }
                boolean z2 = blgVar.a;
                double d = blgVar.b;
                synchronized (jhgVar) {
                    if (!z2) {
                        d = 0.0d;
                    }
                    double d2 = d;
                    try {
                        if (jhgVar.g.size() > 0) {
                            long currentTimeMillis = System.currentTimeMillis();
                            long j2 = jhgVar.f;
                            long j3 = j2 != -1 ? currentTimeMillis - j2 : -1L;
                            jhgVar.f = currentTimeMillis;
                            ArrayList arrayList = new ArrayList();
                            Iterator it = jhgVar.g.iterator();
                            while (it.hasNext()) {
                                clg clgVar = (clg) it.next();
                                long j4 = j3;
                                if (jhgVar.v(clgVar, d2, j4)) {
                                    arrayList.add(clgVar);
                                }
                                j3 = j4;
                            }
                            jhgVar.g.removeAll(arrayList);
                        }
                    } finally {
                    }
                }
                return;
            case 5:
                atk atkVar = (atk) this.b;
                try {
                    if (!cw3.a.contains(atk.class)) {
                        try {
                            weakReference = atkVar.b;
                        } catch (Throwable th) {
                            cw3.a(atk.class, th);
                        }
                        activity = (Activity) weakReference.get();
                        View z3 = pd0.z(activity);
                        if (activity == null && z3 != null) {
                            String simpleName = activity.getClass().getSimpleName();
                            m03 m03Var = m03.a;
                            if (!cw3.a.contains(m03.class)) {
                                try {
                                    z = m03.g.get();
                                } catch (Throwable th2) {
                                    cw3.a(m03.class, th2);
                                }
                            }
                            if (z) {
                                return;
                            }
                            FutureTask futureTask = new FutureTask(new v35(z3));
                            if (!cw3.a.contains(atk.class)) {
                                try {
                                    r1 = atkVar.a;
                                } catch (Throwable th3) {
                                    cw3.a(atk.class, th3);
                                }
                            }
                            r1.post(futureTask);
                            String str = "";
                            try {
                                str = (String) futureTask.get(1L, TimeUnit.SECONDS);
                            } catch (Exception unused) {
                                atk.a();
                            }
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("screenname", simpleName);
                                jSONObject.put("screenshot", str);
                                JSONArray jSONArray = new JSONArray();
                                jSONArray.put(xsk.d(z3));
                                jSONObject.put(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, jSONArray);
                            } catch (JSONException unused2) {
                                atk.a();
                            }
                            String jSONObject2 = jSONObject.toString();
                            jSONObject2.getClass();
                            Set set = cw3.a;
                            if (set.contains(atk.class)) {
                                return;
                            }
                            try {
                                if (set.contains(atkVar)) {
                                    return;
                                }
                                try {
                                    w.c().execute(new ecg(26, jSONObject2, atkVar));
                                    return;
                                } catch (Throwable th4) {
                                    cw3.a(atkVar, th4);
                                    return;
                                }
                            } catch (Throwable th5) {
                                cw3.a(atk.class, th5);
                                return;
                            }
                        }
                        return;
                    }
                    weakReference = null;
                    activity = (Activity) weakReference.get();
                    View z32 = pd0.z(activity);
                    if (activity == null) {
                        return;
                    }
                    String simpleName2 = activity.getClass().getSimpleName();
                    m03 m03Var2 = m03.a;
                    if (!cw3.a.contains(m03.class)) {
                    }
                    if (z) {
                    }
                } catch (Exception unused3) {
                    atk.a();
                    return;
                }
            case 6:
                h hVar = (h) this.b;
                RemoteMediaClient remoteMediaClient = hVar.e;
                remoteMediaClient.H(hVar.a);
                remoteMediaClient.b.postDelayed(this, hVar.b);
                return;
            default:
                MediaQueue mediaQueue = (MediaQueue) this.b;
                ArrayDeque arrayDeque = mediaQueue.h;
                if (arrayDeque.isEmpty() || mediaQueue.k != null || mediaQueue.b == 0) {
                    return;
                }
                RemoteMediaClient remoteMediaClient2 = mediaQueue.c;
                int[] d3 = CastUtils.d(arrayDeque);
                remoteMediaClient2.getClass();
                Preconditions.e("Must be called from the main thread.");
                if (remoteMediaClient2.G()) {
                    i6n i6nVar = new i6n(remoteMediaClient2, d3, 1);
                    RemoteMediaClient.I(i6nVar);
                    basePendingResult = i6nVar;
                } else {
                    basePendingResult = RemoteMediaClient.F();
                }
                mediaQueue.k = basePendingResult;
                basePendingResult.i(new fvo(mediaQueue, z ? 1 : 0));
                arrayDeque.clear();
                return;
        }
    }
}
