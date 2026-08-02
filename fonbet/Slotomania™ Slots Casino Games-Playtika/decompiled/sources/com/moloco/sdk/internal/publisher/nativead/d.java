package com.moloco.sdk.internal.publisher.nativead;

import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.ortb.model.C2791e;
import com.moloco.sdk.internal.publisher.B;
import com.moloco.sdk.internal.publisher.C2803k;
import com.moloco.sdk.internal.publisher.nativead.model.b;
import com.moloco.sdk.internal.publisher.z;
import com.moloco.sdk.internal.services.InterfaceC2811f;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.MolocoAdKt;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r;
import com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d {
    public static final int l = 8;
    public final String a;
    public final C2791e b;
    public final com.moloco.sdk.internal.publisher.nativead.model.b c;
    public final InterfaceC2811f d;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a e;
    public final AdFormatType f;
    public final i g;
    public final r h;
    public final MetricsRecorder i;
    public final z j;
    public final a k;

    public d(String adUnitId, C2791e bid, com.moloco.sdk.internal.publisher.nativead.model.b ortbResponse, InterfaceC2811f appLifecycleTrackerService, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, AdFormatType adFormatType, i persistentHttpRequest, r externalLinkHandler, MetricsRecorder metricsRecorder) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(bid, "bid");
        Intrinsics.checkNotNullParameter(ortbResponse, "ortbResponse");
        Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(adFormatType, "adFormatType");
        Intrinsics.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.a = adUnitId;
        this.b = bid;
        this.c = ortbResponse;
        this.d = appLifecycleTrackerService;
        this.e = customUserEventBuilderService;
        this.f = adFormatType;
        this.g = persistentHttpRequest;
        this.h = externalLinkHandler;
        this.i = metricsRecorder;
        this.j = a();
        this.k = b();
    }

    public final z a() {
        final C2791e c2791e = this.b;
        return B.a(null, this.d, this.e, new Function0() { // from class: com.moloco.sdk.internal.publisher.nativead.d$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d.a(C2791e.this);
            }
        }, new Function0() { // from class: com.moloco.sdk.internal.publisher.nativead.d$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d.a(d.this);
            }
        }, null, null, this.f, this.i, null, null, 1632, null);
    }

    public final a b() {
        com.moloco.sdk.internal.publisher.nativead.model.b bVar = this.c;
        return new a(bVar.c(), bVar.b(), this.g);
    }

    public final void c() {
        b.c d = this.c.d();
        if (d != null) {
            this.k.a(d.a());
            this.h.a(d.c());
        }
        this.j.onAdClicked(MolocoAdKt.createAdInfo$default(this.a, null, null, 6, null));
    }

    public final void d() {
        this.k.a();
        z.a.a(this.j, MolocoAdKt.createAdInfo$default(this.a, null, null, 6, null), null, 2, null);
    }

    public static final com.moloco.sdk.internal.ortb.model.B a(C2791e c2791e) {
        return c2791e.getExt().getSdkEvents();
    }

    public static final C2803k a(d dVar) {
        String str = dVar.b.getCom.ironsource.q2.y java.lang.String();
        if (str != null) {
            return new C2803k(str, Float.valueOf(dVar.b.getPrice()));
        }
        return null;
    }

    public static final class a {
        public List<String> a;
        public List<b.C0255b> b;
        public final i c;
        public final Set<String> d;

        /* renamed from: com.moloco.sdk.internal.publisher.nativead.d$a$a, reason: collision with other inner class name */
        public static final class C0252a {
            public static final C0252a a = new C0252a();
            public static final int b = 1;
            public static final int c = 0;
        }

        public static final class b {
            public static final b a = new b();
            public static final int b = 1;
            public static final int c = 0;
        }

        public a(List<String> list, List<b.C0255b> list2, i persistentHttpRequest) {
            Intrinsics.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
            this.a = list;
            this.b = list2;
            this.c = persistentHttpRequest;
            this.d = new LinkedHashSet();
        }

        public final void a() {
            List<String> list = this.a;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    this.c.a((String) it.next());
                }
            }
            this.a = null;
            List<b.C0255b> list2 = this.b;
            if (list2 != null) {
                for (b.C0255b c0255b : list2) {
                    if (c0255b.c() != null && c0255b.a() == 1 && c0255b.b() == 1) {
                        this.c.a(c0255b.c());
                    }
                }
            }
            this.b = null;
        }

        public final void a(List<String> urls) {
            Intrinsics.checkNotNullParameter(urls, "urls");
            for (String str : urls) {
                if (!this.d.contains(str)) {
                    this.c.a(str);
                    this.d.add(str);
                }
            }
        }
    }
}
