package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.teammanagement.transfers.FantasyTransfersActivity;
import java.util.HashSet;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class db implements i6d {
    public final Context a;
    public final hpo b;
    public ib5 c;
    public ObjectAnimator d;
    public final FantasyTransfersActivity e;

    public db(FantasyTransfersActivity fantasyTransfersActivity, hpo hpoVar) {
        Context C = ((ub0) fantasyTransfersActivity.m()).C();
        C.getClass();
        this.a = C;
        this.b = hpoVar;
        this.e = fantasyTransfersActivity;
    }

    @Override // defpackage.i6d
    public final void a(k7d k7dVar, s6d s6dVar, Bundle bundle) {
        Map map;
        String stringBuffer;
        String valueOf;
        Pair pair;
        s6dVar.getClass();
        if (s6dVar instanceof x88) {
            return;
        }
        CharSequence charSequence = s6dVar.d;
        Context context = this.a;
        if (charSequence == null) {
            stringBuffer = null;
        } else {
            Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(charSequence);
            StringBuffer stringBuffer2 = new StringBuffer();
            if (bundle != null) {
                map = o3a.P(bundle);
            } else {
                map = lm5.a;
                map.getClass();
            }
            while (matcher.find()) {
                String group = matcher.group(1);
                if (group == null || !map.containsKey(group)) {
                    throw new IllegalArgumentException(("Could not find \"" + group + "\" in " + bundle + " to fill label \"" + ((Object) charSequence) + '\"').toString());
                }
                matcher.appendReplacement(stringBuffer2, "");
                a6d a6dVar = (a6d) s6dVar.m().get(group);
                b8d b8dVar = a6dVar != null ? a6dVar.a : null;
                cz1 cz1Var = b8d.c;
                if (Intrinsics.c(b8dVar, cz1Var)) {
                    bundle.getClass();
                    valueOf = context.getString(((Integer) cz1Var.a(bundle, group)).intValue());
                } else {
                    b8dVar.getClass();
                    bundle.getClass();
                    valueOf = String.valueOf(b8dVar.a(bundle, group));
                }
                valueOf.getClass();
                stringBuffer2.append(valueOf);
            }
            matcher.appendTail(stringBuffer2);
            stringBuffer = stringBuffer2.toString();
        }
        if (stringBuffer != null) {
            FantasyTransfersActivity fantasyTransfersActivity = this.e;
            o02 n = fantasyTransfersActivity.n();
            if (n == null) {
                vp2.b(fantasyTransfersActivity, " does not have an ActionBar set via setSupportActionBar()", "Activity ");
                return;
            }
            n.u0(stringBuffer);
        }
        int i = s6d.f;
        for (s6d s6dVar2 : l4a.t(s6dVar)) {
            if (((HashSet) this.b.a).contains(Integer.valueOf(s6dVar2.b.b))) {
                if (s6dVar2 instanceof g7d) {
                    int i2 = s6dVar.b.b;
                    int i3 = g7d.h;
                    if (i2 == ((s6d) i5h.m(e5h.e((g7d) s6dVar2, new a7d(2)))).b.b) {
                    }
                }
                b(null, 0);
                return;
            }
        }
        ib5 ib5Var = this.c;
        if (ib5Var != null) {
            pair = new Pair(ib5Var, Boolean.TRUE);
        } else {
            ib5 ib5Var2 = new ib5(context);
            this.c = ib5Var2;
            pair = new Pair(ib5Var2, Boolean.FALSE);
        }
        ib5 ib5Var3 = (ib5) pair.a;
        boolean booleanValue = ((Boolean) pair.b).booleanValue();
        b(ib5Var3, R.string.nav_app_bar_navigate_up_description);
        if (!booleanValue) {
            ib5Var3.setProgress(1.0f);
            return;
        }
        float f = ib5Var3.i;
        ObjectAnimator objectAnimator = this.d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ib5Var3, NotificationCompat.CATEGORY_PROGRESS, f, 1.0f);
        this.d = ofFloat;
        ofFloat.getClass();
        ofFloat.start();
    }

    public final void b(ib5 ib5Var, int i) {
        FantasyTransfersActivity fantasyTransfersActivity = this.e;
        o02 n = fantasyTransfersActivity.n();
        if (n == null) {
            vp2.b(fantasyTransfersActivity, " does not have an ActionBar set via setSupportActionBar()", "Activity ");
            return;
        }
        n.n0(ib5Var != null);
        ub0 ub0Var = (ub0) fantasyTransfersActivity.m();
        ub0Var.F();
        o02 o02Var = ub0Var.n;
        if (o02Var != null) {
            o02Var.r0(ib5Var);
            o02Var.p0(i);
        }
    }
}
