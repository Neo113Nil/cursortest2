package defpackage;

import android.content.Intent;
import android.os.Build;
import androidx.appcompat.app.AppCompatActivity;
import com.sofascore.results.notifications.NotificationSettingsActivity;
import com.sofascore.results.notifications.ui.MuteNotificationsBottomSheet;
import java.util.Calendar;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class sgd implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationSettingsActivity b;

    public /* synthetic */ sgd(NotificationSettingsActivity notificationSettingsActivity, int i) {
        this.a = i;
        this.b = notificationSettingsActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        final NotificationSettingsActivity notificationSettingsActivity = this.b;
        boolean z = false;
        final int i2 = 1;
        of3 of3Var = (of3) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                int i3 = NotificationSettingsActivity.O;
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    haa.f(yqo.H(950703587, av8Var, new sgd(notificationSettingsActivity, i2)), av8Var, 6);
                } else {
                    av8Var.W();
                }
                break;
            default:
                int i4 = NotificationSettingsActivity.O;
                av8 av8Var2 = (av8) of3Var;
                if (av8Var2.T(intValue & 1, (intValue & 3) != 2)) {
                    e1d x = rfo.x(notificationSettingsActivity.Q().f, av8Var2, 0);
                    Boolean valueOf = Boolean.valueOf(((vnb) x.getValue()).a() != null);
                    boolean g = av8Var2.g(x) | av8Var2.i(notificationSettingsActivity);
                    Object O = av8Var2.O();
                    a99 a99Var = nf3.a;
                    Object obj3 = O;
                    if (g || O == a99Var) {
                        qa7 qa7Var = new qa7(x, notificationSettingsActivity, (rq3) null);
                        av8Var2.n0(qa7Var);
                        obj3 = qa7Var;
                    }
                    hz8.o(av8Var2, valueOf, (Function2) obj3);
                    hof hofVar = notificationSettingsActivity.Q().h;
                    e6b e6bVar = e6b.c;
                    boolean i5 = av8Var2.i(notificationSettingsActivity);
                    Object O2 = av8Var2.O();
                    Object obj4 = O2;
                    if (i5 || O2 == a99Var) {
                        final boolean z2 = z ? 1 : 0;
                        Function1 function1 = new Function1() { // from class: ugd
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                int i6 = z2;
                                NotificationSettingsActivity notificationSettingsActivity2 = notificationSettingsActivity;
                                switch (i6) {
                                    case 0:
                                        ahd ahdVar = (ahd) obj5;
                                        int i7 = NotificationSettingsActivity.O;
                                        ahdVar.getClass();
                                        Calendar calendar = ke0.a;
                                        ke0.f(ahdVar.a, notificationSettingsActivity2);
                                        break;
                                    default:
                                        rgd rgdVar = (rgd) obj5;
                                        int i8 = NotificationSettingsActivity.O;
                                        rgdVar.getClass();
                                        if (rgdVar.equals(kgd.a)) {
                                            notificationSettingsActivity2.finish();
                                        } else if (rgdVar.equals(lgd.a)) {
                                            MuteNotificationsBottomSheet muteNotificationsBottomSheet = new MuteNotificationsBottomSheet();
                                            NotificationSettingsActivity notificationSettingsActivity3 = notificationSettingsActivity2 instanceof AppCompatActivity ? notificationSettingsActivity2 : null;
                                            if (notificationSettingsActivity3 != null) {
                                                wca.x(notificationSettingsActivity3.getLifecycle()).b(new r1(muteNotificationsBottomSheet, notificationSettingsActivity3, null, 3));
                                            }
                                        } else if (rgdVar.equals(mgd.a)) {
                                            Intent intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
                                            intent.putExtra("android.provider.extra.APP_PACKAGE", "com.sofascore.results");
                                            notificationSettingsActivity2.startActivity(intent);
                                        } else if (rgdVar.equals(qgd.a)) {
                                            boolean z3 = eq3.b(notificationSettingsActivity2, "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
                                            if (Build.VERSION.SDK_INT >= 29 || z3) {
                                                notificationSettingsActivity2.Q().u();
                                            } else {
                                                notificationSettingsActivity2.N.a(new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, null);
                                            }
                                        } else if (rgdVar instanceof pgd) {
                                            fhd fhdVar = ((pgd) rgdVar).a;
                                            qea.C(notificationSettingsActivity2, fhdVar.a, fhdVar.b.b(notificationSettingsActivity2), null);
                                        } else {
                                            notificationSettingsActivity2.Q().t(rgdVar);
                                        }
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        av8Var2.n0(function1);
                        obj4 = function1;
                    }
                    w1a.c(hofVar, e6bVar, (Function1) obj4, av8Var2, 3072, 6);
                    vnb vnbVar = (vnb) x.getValue();
                    boolean i6 = av8Var2.i(notificationSettingsActivity);
                    Object O3 = av8Var2.O();
                    Object obj5 = O3;
                    if (i6 || O3 == a99Var) {
                        Function1 function12 = new Function1() { // from class: ugd
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj52) {
                                int i62 = i2;
                                NotificationSettingsActivity notificationSettingsActivity2 = notificationSettingsActivity;
                                switch (i62) {
                                    case 0:
                                        ahd ahdVar = (ahd) obj52;
                                        int i7 = NotificationSettingsActivity.O;
                                        ahdVar.getClass();
                                        Calendar calendar = ke0.a;
                                        ke0.f(ahdVar.a, notificationSettingsActivity2);
                                        break;
                                    default:
                                        rgd rgdVar = (rgd) obj52;
                                        int i8 = NotificationSettingsActivity.O;
                                        rgdVar.getClass();
                                        if (rgdVar.equals(kgd.a)) {
                                            notificationSettingsActivity2.finish();
                                        } else if (rgdVar.equals(lgd.a)) {
                                            MuteNotificationsBottomSheet muteNotificationsBottomSheet = new MuteNotificationsBottomSheet();
                                            NotificationSettingsActivity notificationSettingsActivity3 = notificationSettingsActivity2 instanceof AppCompatActivity ? notificationSettingsActivity2 : null;
                                            if (notificationSettingsActivity3 != null) {
                                                wca.x(notificationSettingsActivity3.getLifecycle()).b(new r1(muteNotificationsBottomSheet, notificationSettingsActivity3, null, 3));
                                            }
                                        } else if (rgdVar.equals(mgd.a)) {
                                            Intent intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
                                            intent.putExtra("android.provider.extra.APP_PACKAGE", "com.sofascore.results");
                                            notificationSettingsActivity2.startActivity(intent);
                                        } else if (rgdVar.equals(qgd.a)) {
                                            boolean z3 = eq3.b(notificationSettingsActivity2, "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
                                            if (Build.VERSION.SDK_INT >= 29 || z3) {
                                                notificationSettingsActivity2.Q().u();
                                            } else {
                                                notificationSettingsActivity2.N.a(new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, null);
                                            }
                                        } else if (rgdVar instanceof pgd) {
                                            fhd fhdVar = ((pgd) rgdVar).a;
                                            qea.C(notificationSettingsActivity2, fhdVar.a, fhdVar.b.b(notificationSettingsActivity2), null);
                                        } else {
                                            notificationSettingsActivity2.Q().t(rgdVar);
                                        }
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        av8Var2.n0(function12);
                        obj5 = function12;
                    }
                    ehd.b(vnbVar, (Function1) obj5, av8Var2, 0);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
