package defpackage;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.cloudmessaging.zzv;
import com.google.android.gms.cloudmessaging.zzw;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.ironsource.U3;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class r48 implements SuccessContinuation {
    public final /* synthetic */ FirebaseMessaging a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ou4 c;

    public /* synthetic */ r48(FirebaseMessaging firebaseMessaging, String str, ou4 ou4Var) {
        this.a = firebaseMessaging;
        this.b = str;
        this.c = ou4Var;
    }

    public Task a() {
        Task forException;
        Task continueWith;
        int i;
        FirebaseMessaging firebaseMessaging = this.a;
        String str = this.b;
        ou4 ou4Var = this.c;
        p03 p03Var = firebaseMessaging.d;
        boolean n = p03Var.n();
        if (!n || ((pic) p03Var.f).d() < 261200000) {
            ox9 ox9Var = (ox9) p03Var.e;
            String c = pic.c((r38) ox9Var.b);
            Bundle bundle = new Bundle();
            try {
                ox9Var.p(c, bundle, n);
                Rpc rpc = (Rpc) ox9Var.d;
                g35 g35Var = g35.d;
                zzw zzwVar = rpc.c;
                if (zzwVar.b() < 12000000) {
                    forException = zzwVar.a() != 0 ? rpc.b(bundle).continueWithTask(g35Var, new gvo(17, rpc, bundle)) : Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE"));
                } else {
                    zzv a = zzv.a(rpc.b);
                    synchronized (a) {
                        i = a.d;
                        a.d = i + 1;
                    }
                    forException = a.b(new s3p(i, 1, bundle, 1)).continueWith(g35Var, igf.b);
                }
            } catch (InterruptedException | ExecutionException e) {
                forException = Tasks.forException(e);
            }
            continueWith = forException.continueWith(new hg0(1), new is8(ox9Var));
        } else {
            ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Network-Io"));
            continueWith = ((k48) ((l48) p03Var.d)).c().continueWithTask(newSingleThreadExecutor, new o3(24, p03Var, newSingleThreadExecutor));
        }
        return continueWith.onSuccessTask(firebaseMessaging.h, new r48(firebaseMessaging, str, ou4Var));
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        String str;
        FirebaseMessaging firebaseMessaging = this.a;
        String str2 = this.b;
        ou4 ou4Var = this.c;
        String str3 = (String) obj;
        yia c = FirebaseMessaging.c(firebaseMessaging.b);
        r38 r38Var = firebaseMessaging.a;
        r38Var.a();
        String d = "[DEFAULT]".equals(r38Var.b) ? "" : r38Var.d();
        String b = firebaseMessaging.i.b();
        synchronized (c) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str3);
                jSONObject.put(U3.j.W, b);
                jSONObject.put("timestamp", currentTimeMillis);
                str = jSONObject.toString();
            } catch (JSONException e) {
                e.toString();
                str = null;
            }
            if (str != null) {
                SharedPreferences.Editor edit = ((SharedPreferences) c.b).edit();
                edit.putString(d + "|T|" + str2 + "|*", str);
                edit.commit();
            }
        }
        if (firebaseMessaging.d.n() || ou4Var == null || !str3.equals((String) ou4Var.b)) {
            r38 r38Var2 = firebaseMessaging.a;
            r38Var2.a();
            if ("[DEFAULT]".equals(r38Var2.b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    r38Var2.a();
                }
                boolean n = firebaseMessaging.d.n();
                Intent intent = new Intent();
                intent.putExtra("token", str3);
                if (n) {
                    intent.setAction("com.google.firebase.messaging.FCM_REGISTERED");
                } else {
                    intent.setAction("com.google.firebase.messaging.NEW_TOKEN");
                }
                new f4a(firebaseMessaging.b).u(intent);
            }
        }
        return Tasks.forResult(str3);
    }
}
