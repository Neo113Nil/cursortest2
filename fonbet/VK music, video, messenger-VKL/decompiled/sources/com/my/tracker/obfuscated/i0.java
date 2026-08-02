package com.my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.my.tracker.obfuscated.i0;

/* loaded from: classes.dex */
public final class i0 {
    protected h0 a;
    boolean b = false;

    public interface c {
        void a();

        void a(String str);
    }

    public h0 a(Context context) {
        if (this.b) {
            return this.a;
        }
        p1 a2 = p1.a(context);
        String i = a2.i();
        if (!TextUtils.isEmpty(i)) {
            x2.a("FirebaseAppInstanceIdProvider: retrieved cached firebase app instance id " + i);
        }
        if (b.a) {
            b.a(context, new a(a2));
            this.b = true;
            return this.a;
        }
        x2.a("FirebaseAppInstanceIdProvider: firebase analytics is not available, use cached value '" + i + "'");
        h0 h0Var = new h0(i);
        this.a = h0Var;
        return h0Var;
    }

    public class a implements c {
        final /* synthetic */ p1 a;

        public a(p1 p1Var) {
            this.a = p1Var;
        }

        @Override // com.my.tracker.obfuscated.i0.c
        public void a(String str) {
            i0.this.a = new h0(str);
            this.a.j(str);
            x2.a("FirebaseAppInstanceIdProvider: retrieved firebase app instance id %" + i0.this.a.a);
        }

        @Override // com.my.tracker.obfuscated.i0.c
        public void a() {
            x2.a("FirebaseAppInstanceIdProvider: retrieving firebase app instance id finished unsuccessfully");
        }
    }

    public static final class b {
        public static final boolean a;

        static {
            boolean z;
            try {
                z = FirebaseAnalytics.class.equals(FirebaseAnalytics.class);
            } catch (Throwable th) {
                x2.a("FirebaseHelper: error occurred while working with FirebaseAnalytics", th);
                z = false;
            }
            a = z;
        }

        public static void a(Context context, final c cVar) {
            try {
                x2.a("FirebaseHelper: retrieving firebase app instance id");
                FirebaseAnalytics.getInstance(context).a().addOnCompleteListener(m.b, new OnCompleteListener() { // from class: xsna.lzy0
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        i0.b.a(i0.c.this, task);
                    }
                });
            } catch (Throwable th) {
                x2.a("FirebaseHelper: retrieving firebase app instance id error", th);
                cVar.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void a(c cVar, Task task) {
            if (task.isComplete() && task.isSuccessful()) {
                cVar.a((String) task.getResult());
            } else {
                cVar.a();
            }
        }
    }
}
