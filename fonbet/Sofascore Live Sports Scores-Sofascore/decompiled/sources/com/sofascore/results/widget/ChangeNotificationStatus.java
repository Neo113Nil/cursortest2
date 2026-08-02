package com.sofascore.results.widget;

import android.content.Context;
import android.content.res.Resources;
import com.sofascore.results.R;
import defpackage.fsf;
import defpackage.hs4;
import defpackage.lu3;
import defpackage.nb;
import defpackage.ok3;
import defpackage.pzc;
import defpackage.r1;
import defpackage.re0;
import defpackage.rob;
import defpackage.rq3;
import defpackage.wxf;
import defpackage.xw3;
import defpackage.z45;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/widget/ChangeNotificationStatus;", "Lnb;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChangeNotificationStatus implements nb {
    @Override // defpackage.nb
    public final Object a(Context context, re0 re0Var, pzc pzcVar, rq3 rq3Var) {
        String str = (String) pzcVar.a.get(ok3.j);
        if (str == null) {
            return Unit.a;
        }
        fsf fsfVar = new fsf();
        fsfVar.a = "";
        if (str.equals("NOTIFICATION_ENABLED")) {
            wxf.z(context, false, true);
            LocalDateTime withMinute = LocalDateTime.now(ZoneId.systemDefault()).withHour(8).withMinute(0);
            Resources resources = context.getResources();
            withMinute.getClass();
            String string = resources.getString(R.string.notifications_muted_until, new DateTimeFormatterBuilder().appendLocalized(null, FormatStyle.SHORT).toFormatter(Locale.getDefault()).format(withMinute));
            string.getClass();
            fsfVar.a = string;
        } else if (str.equals("NOTIFICATION_BLOCKED")) {
            wxf.f(2, context);
            String string2 = context.getResources().getString(R.string.notifications_enabled);
            string2.getClass();
            fsfVar.a = string2;
        }
        hs4 hs4Var = z45.a;
        Object R = xw3.R(rob.a, new r1(context, fsfVar, null, 5), rq3Var);
        return R == lu3.a ? R : Unit.a;
    }
}
