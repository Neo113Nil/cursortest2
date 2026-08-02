package defpackage;

import android.widget.RemoteViews;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bu9 {
    public static final bu9 a = new bu9();

    public final void a(@NotNull pxj pxjVar, @NotNull RemoteViews remoteViews, @NotNull e23 e23Var, int i) {
        if (e23Var instanceof al4) {
            al4 al4Var = (al4) e23Var;
            long j = al4Var.a;
            long j2 = al4Var.b;
            int s0 = hkg.s0(j);
            int s02 = hkg.s0(j2);
            remoteViews.getClass();
            byf.f(remoteViews, i, "setColorFilter", s0, s02);
            return;
        }
        if (e23Var instanceof h1g) {
            int i2 = ((h1g) e23Var).a;
            remoteViews.getClass();
            byf.d(remoteViews, i, "setColorFilter", i2);
        } else {
            int s03 = hkg.s0(e23Var.a(pxjVar.a));
            remoteViews.getClass();
            remoteViews.setInt(i, "setColorFilter", s03);
        }
    }
}
