package Wd;

import Td.e;
import android.app.Application;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f13237a = new c();

    public static final void c(c this$0, Application application, nd.b bVar, Ag.b bVar2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(application, "$application");
        if (bVar2 != null) {
            e.h0(bVar2);
            e.t(application, bVar);
        }
    }

    public final void b(final Application application, final nd.b bVar) {
        Intrinsics.checkNotNullParameter(application, "application");
        Ag.c.a(new Ag.a() { // from class: Wd.b
            @Override // Ag.a
            public final void onSuccess(Object obj) {
                c cVar = c.this;
                Application application2 = application;
                nd.b bVar2 = bVar;
                android.support.v4.media.session.b.a(obj);
                c.c(cVar, application2, bVar2, null);
            }
        });
    }
}
