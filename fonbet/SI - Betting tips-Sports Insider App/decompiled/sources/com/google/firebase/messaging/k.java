package com.google.firebase.messaging;

import android.adservices.measurement.MeasurementManager;
import android.graphics.ColorSpace;
import android.os.Bundle;
import android.view.View;
import androidx.core.view.h2;
import androidx.core.view.k2;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.tasks.Task;
import com.sports.insider.MyApp;
import gh.o0;
import io.appmetrica.analytics.impl.C0122e9;
import io.appmetrica.analytics.impl.G0;
import io.appmetrica.analytics.impl.Id;
import io.appmetrica.analytics.impl.InterfaceC0031al;
import io.appmetrica.analytics.impl.Rd;
import io.sentry.android.core.w0;
import io.sentry.o5;
import io.sentry.t4;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements w7.a, x8.a, b5.e, com.google.gson.internal.l, o5, o8.d, androidx.core.view.x, w7.f, Rd {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6147a;

    public /* synthetic */ k(int i5) {
        this.f6147a = i5;
    }

    public static /* bridge */ /* synthetic */ MeasurementManager c(Object obj) {
        return (MeasurementManager) obj;
    }

    public static /* bridge */ /* synthetic */ ColorSpace g(Object obj) {
        return (ColorSpace) obj;
    }

    public static /* bridge */ /* synthetic */ Class i() {
        return MeasurementManager.class;
    }

    @Override // io.appmetrica.analytics.impl.Rd
    public InterfaceC0031al a(G0 g02) {
        return Id.a(g02);
    }

    @Override // b5.e
    public Object apply(Object obj) {
        g9.e eVar = (g9.e) obj;
        kh.g gVar = t.f6172a;
        gVar.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            gVar.l(eVar, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    public t4 b(t4 event, io.sentry.h0 hint) {
        gh.y yVar;
        String str;
        jg.d dVar = MyApp.f6830c;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(hint, "hint");
        gh.i0 i0Var = (gh.i0) hint.c(gh.i0.class, "okHttp:request");
        o0 o0Var = (o0) hint.c(o0.class, "okHttp:response");
        if (o0Var == null || o0Var.f10276d != 504 || i0Var == null || (yVar = i0Var.f10206a) == null || (str = yVar.f10337i) == null) {
            return event;
        }
        boolean A = StringsKt.A(str, "/storage/logo/sports/", false);
        boolean A2 = StringsKt.A(str, "/storage/backgrounds/", false);
        if (A || A2) {
            return null;
        }
        return event;
    }

    @Override // com.google.gson.internal.l
    public Object d() {
        switch (this.f6147a) {
            case 4:
                return new LinkedHashMap();
            case 5:
                return new TreeMap();
            case 6:
                return new ConcurrentHashMap();
            case 7:
                return new ConcurrentSkipListMap();
            case 8:
                return new ArrayList();
            case 9:
                return new LinkedHashSet();
            case 10:
                return new TreeSet();
            case 11:
                return new ArrayDeque();
            default:
                return new com.google.gson.internal.k(true);
        }
    }

    @Override // w7.f
    public Task e(Object obj) {
        switch (this.f6147a) {
            case C0122e9.H /* 27 */:
                break;
            default:
                break;
        }
        return d5.q(null);
    }

    @Override // w7.a
    public Object f(Task task) {
        switch (this.f6147a) {
            case 0:
                return -1;
            default:
                Bundle bundle = (Bundle) task.i(IOException.class);
                if (bundle == null) {
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                String string = bundle.getString("registration_id");
                if (string != null || (string = bundle.getString("unregistered")) != null) {
                    return string;
                }
                String string2 = bundle.getString("error");
                if ("RST".equals(string2)) {
                    throw new IOException("INSTANCE_ID_RESET");
                }
                if (string2 != null) {
                    throw new IOException(string2);
                }
                w0.n("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    @Override // o8.d
    public Object h(x xVar) {
        Set O = xVar.O(h9.a.class);
        h9.c cVar = h9.c.f10428c;
        if (cVar == null) {
            synchronized (h9.c.class) {
                try {
                    cVar = h9.c.f10428c;
                    if (cVar == null) {
                        cVar = new h9.c(0);
                        h9.c.f10428c = cVar;
                    }
                } finally {
                }
            }
        }
        return new h9.b(O, cVar);
    }

    @Override // androidx.core.view.x
    public k2 onApplyWindowInsets(View view, k2 k2Var) {
        int[] iArr = DrawerLayout.F;
        DrawerLayout drawerLayout = (DrawerLayout) view;
        h2 h2Var = k2Var.f1349a;
        boolean z5 = false;
        boolean z7 = h2Var.k().f9677b > 0;
        drawerLayout.f1761z = k2Var;
        drawerLayout.A = z7;
        if (!z7 && drawerLayout.getBackground() == null) {
            z5 = true;
        }
        drawerLayout.setWillNotDraw(z5);
        drawerLayout.requestLayout();
        return h2Var.c();
    }

    public /* synthetic */ k(androidx.appcompat.widget.a0 a0Var) {
        this.f6147a = 2;
    }
}
