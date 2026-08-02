package od;

import android.app.Application;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import kotlin.jvm.internal.Intrinsics;
import ue.C6549a;

/* renamed from: od.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5877c {

    /* renamed from: a, reason: collision with root package name */
    public static final C5877c f59649a = new C5877c();

    public static final void a(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        C6549a.C0923a.e(C6549a.f66349d, application, false, 2, null);
        MobilistenInitProvider.INSTANCE.o(application);
        Wd.a.f13230a.c(application);
    }
}
