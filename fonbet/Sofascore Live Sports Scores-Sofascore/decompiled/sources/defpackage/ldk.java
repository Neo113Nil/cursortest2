package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.IntentSender;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.activity.result.IntentSenderRequest;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.sofascore.results.R;
import java.util.Calendar;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ldk {
    public final ComponentActivity a;
    public final int b;
    public dmh c;
    public final zao d;
    public final jdk e;

    public ldk(ComponentActivity componentActivity, int i) {
        gmo gmoVar;
        componentActivity.getClass();
        this.a = componentActivity;
        this.b = i;
        synchronized (wkn.class) {
            gmoVar = wkn.a;
            if (gmoVar == null) {
                Context applicationContext = componentActivity.getApplicationContext();
                gmo gmoVar2 = new gmo(new qc4(applicationContext != null ? applicationContext : componentActivity, 5));
                wkn.a = gmoVar2;
                gmoVar = gmoVar2;
            }
        }
        zao zaoVar = (zao) ((wcn) gmoVar.b).zza();
        zaoVar.getClass();
        this.d = zaoVar;
        this.e = new jdk(this);
    }

    public static Calendar d(int i) {
        String valueOf = String.valueOf(i);
        int parseInt = Integer.parseInt(iii.H(2, valueOf));
        int parseInt2 = Integer.parseInt(iii.H(2, iii.C(2, valueOf)));
        int parseInt3 = Integer.parseInt(iii.H(2, iii.C(4, valueOf)));
        Calendar calendar = Calendar.getInstance();
        calendar.set(parseInt, parseInt2, parseInt3);
        return calendar;
    }

    public final void a(Context context, de deVar) {
        context.getClass();
        deVar.getClass();
        this.d.b().addOnSuccessListener(new imf(new ncj(7, this, deVar, context), 24));
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [kdk] */
    public final dmh b() {
        dmh dmhVar = this.c;
        ComponentActivity componentActivity = this.a;
        if (dmhVar != null) {
            String string = componentActivity.getString(R.string.app_update_downloaded);
            string.getClass();
            wca.H(dmhVar, string);
            String string2 = componentActivity.getString(R.string.app_update_install);
            final int i = 1;
            dmhVar.l(string2, new View.OnClickListener(this) { // from class: kdk
                public final /* synthetic */ ldk b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i2 = i;
                    ldk ldkVar = this.b;
                    switch (i2) {
                        case 0:
                            ldkVar.d.a();
                            break;
                        default:
                            ldkVar.d.a();
                            break;
                    }
                }
            });
            return dmhVar;
        }
        View findViewById = componentActivity.findViewById(this.b);
        CoordinatorLayout coordinatorLayout = findViewById instanceof CoordinatorLayout ? (CoordinatorLayout) findViewById : null;
        if (coordinatorLayout == null) {
            return null;
        }
        String string3 = componentActivity.getString(R.string.app_update_downloaded);
        string3.getClass();
        final int i2 = 0;
        return wca.C(coordinatorLayout, string3, componentActivity.getString(R.string.app_update_install), new View.OnClickListener(this) { // from class: kdk
            public final /* synthetic */ ldk b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                ldk ldkVar = this.b;
                switch (i22) {
                    case 0:
                        ldkVar.d.a();
                        break;
                    default:
                        ldkVar.d.a();
                        break;
                }
            }
        });
    }

    public final void c(qe0 qe0Var, de deVar) {
        zao zaoVar = this.d;
        jdk jdkVar = this.e;
        synchronized (zaoVar) {
            rqn rqnVar = zaoVar.b;
            synchronized (rqnVar) {
                rqnVar.a.f("registerListener", new Object[0]);
                if (jdkVar == null) {
                    throw new NullPointerException("Registered Play Core listener should not be null.");
                }
                rqnVar.d.add(jdkVar);
                rqnVar.a();
            }
        }
        this.d.getClass();
        if (deVar != null) {
            PendingIntent pendingIntent = qe0Var.d;
            if ((pendingIntent != null ? pendingIntent : null) == null || qe0Var.e) {
                return;
            }
            qe0Var.e = true;
            if (pendingIntent == null) {
                pendingIntent = null;
            }
            IntentSender intentSender = pendingIntent.getIntentSender();
            intentSender.getClass();
            deVar.a(new IntentSenderRequest(intentSender, null, 0, 0), null);
        }
    }
}
