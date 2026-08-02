package yh0;

import Zg0.d;
import Zg0.h;
import dh0.C6200a;
import fh0.C6568c;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sj.f;
import vh0.j;

/* renamed from: yh0.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C10906d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final j f106654a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f106655b;

    public C10906d(@NotNull j pushNotifier) {
        Intrinsics.checkNotNullParameter(pushNotifier, "pushNotifier");
        this.f106654a = pushNotifier;
    }

    public final void a(@NotNull C6568c pushModel, @NotNull h channel) {
        Intrinsics.checkNotNullParameter(pushModel, "pushModel");
        Intrinsics.checkNotNullParameter(channel, "channel");
        j jVar = this.f106654a;
        if (jVar.b()) {
            int n11 = pushModel.n();
            Integer num = this.f106655b;
            if (num != null && n11 == num.intValue()) {
                C10905c c10905c = new C10905c(pushModel);
                Zg0.d b11 = C6200a.b();
                if (b11 instanceof d.b) {
                    C6200a.c().a(C6200a.a((String) c10905c.invoke()), null);
                    ((d.b) b11).getClass();
                }
                int i11 = sh0.b.f98783c;
                sh0.b.e("CloudMessageManager", f.b(new Pair("notification_id", Integer.valueOf(pushModel.n()))), null, c10905c);
                return;
            }
            this.f106655b = Integer.valueOf(pushModel.n());
            boolean z11 = (kotlin.text.h.K(pushModel.u()) && kotlin.text.h.K(pushModel.l())) ? false : true;
            if (pushModel.r() || !z11) {
                int i12 = sh0.b.f98783c;
                sh0.b.f("CloudMessageManager", f.b(new Pair("notification_id", Integer.valueOf(pushModel.n()))), new C10904b(pushModel, z11), 4);
            } else {
                int i13 = sh0.b.f98783c;
                sh0.b.f("CloudMessageManager", f.b(new Pair("notification_id", Integer.valueOf(pushModel.n()))), new C10903a(pushModel), 4);
                jVar.e(pushModel, channel);
            }
        }
    }
}
