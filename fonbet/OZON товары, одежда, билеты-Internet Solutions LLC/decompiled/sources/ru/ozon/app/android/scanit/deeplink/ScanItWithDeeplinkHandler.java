package ru.ozon.app.android.scanit.deeplink;

import GZ.j;
import IZ.a;
import J.d;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import qZ.C9010b;
import qZ.C9011c;
import rZ.C9237b;
import ru.ozon.app.android.navigation.FlowTag;
import ru.ozon.app.android.scanit.scanit.ScanItFragment;
import sZ.c;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/scanit/deeplink/ScanItWithDeeplinkHandler;", "LIZ/a;", "<init>", "()V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "scanit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ScanItWithDeeplinkHandler implements a {
    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        if (!d.d(route, "route", "scanit") && !Lh.a.f(route, "barcodescanner")) {
            return false;
        }
        String queryParameter = route.b().getQueryParameter("barcode");
        return queryParameter == null || queryParameter.length() == 0;
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(route, "route");
        FlowTag flowTag = FlowTag.SCAN_IT;
        String name = flowTag.name();
        C9011c.Companion companion = C9011c.INSTANCE;
        C9010b c9010b = new C9010b(flowTag, 14);
        companion.getClass();
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        c cVar = new c(name, C9011c.Companion.a(c9010b), null, false, z13, null, false, z11, z12, 508, null);
        return new C9237b(null, flowTag, cVar, new c("ScanItFragment", new ScanItFragment(), null, z13, false, null, z11, z12, false, 508, null), 1, null);
    }
}
