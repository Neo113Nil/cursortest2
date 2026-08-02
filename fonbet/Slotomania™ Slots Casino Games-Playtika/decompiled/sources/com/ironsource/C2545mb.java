package com.ironsource;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.mb, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2545mb {
    public static final String d = "do_not_sell";
    private static C2545mb f;
    private final C2688ub a;
    private final com.ironsource.mediationsdk.c b;
    public static final a c = new a(null);
    private static final List<String> e = CollectionsKt.listOf((Object[]) new String[]{"admob_tfcd", "admob_tfua", "BidMachine_COPPA", "chartboost_coppa", "DT_COPPA", com.ironsource.mediationsdk.metadata.a.b, "LevelPlay_ChildDirected", "meta_mixed_audience", "Mintegral_COPPA", "Moloco_COPPA", "Pangle_COPPA", "UnityAds_COPPA", "Vungle_COPPA", "Yandex_COPPA"});

    /* renamed from: com.ironsource.mb$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<String> a() {
            return C2545mb.e;
        }

        public final C2545mb b() {
            return C2545mb.f;
        }

        private a() {
        }

        public final void a(C2545mb testInstance) {
            Intrinsics.checkNotNullParameter(testInstance, "testInstance");
            C2545mb.f = testInstance;
        }
    }

    static {
        C2688ub c2688ub = new C2688ub();
        com.ironsource.mediationsdk.c b = com.ironsource.mediationsdk.c.b();
        Intrinsics.checkNotNullExpressionValue(b, "getInstance()");
        f = new C2545mb(c2688ub, b);
    }

    public C2545mb(C2688ub tools, com.ironsource.mediationsdk.c adapterRepository) {
        Intrinsics.checkNotNullParameter(tools, "tools");
        Intrinsics.checkNotNullParameter(adapterRepository, "adapterRepository");
        this.a = tools;
        this.b = adapterRepository;
    }

    public final void b(final boolean z) {
        this.a.d(new Runnable() { // from class: com.ironsource.mb$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                C2545mb.b(C2545mb.this, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C2545mb this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.a.b(z);
        Iterator<String> it = e.iterator();
        while (it.hasNext()) {
            this$0.b.c(it.next(), CollectionsKt.listOf(String.valueOf(z)));
        }
    }

    public final void a(final Map<String, Boolean> networkConsents) {
        Intrinsics.checkNotNullParameter(networkConsents, "networkConsents");
        this.a.d(new Runnable() { // from class: com.ironsource.mb$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C2545mb.a(C2545mb.this, networkConsents);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C2545mb this$0, Map networkConsents) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(networkConsents, "$networkConsents");
        this$0.a.a((Map<String, Boolean>) networkConsents);
        this$0.b.a((Map<String, Boolean>) networkConsents);
    }

    public final void a(final boolean z) {
        this.a.d(new Runnable() { // from class: com.ironsource.mb$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C2545mb.a(C2545mb.this, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C2545mb this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.a.a(z);
        this$0.b.c("do_not_sell", CollectionsKt.listOf(String.valueOf(z)));
    }
}
