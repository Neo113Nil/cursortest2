package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import defpackage.pmm;
import defpackage.wem;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.kb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4164kb {

    @NotNull
    public static final a d = new a(null);

    @NotNull
    private static C4164kb e;

    @NotNull
    private final C4325tb a;

    @NotNull
    private final com.ironsource.mediationsdk.c b;

    @NotNull
    private final Mb c;

    static {
        C4325tb c4325tb = new C4325tb();
        com.ironsource.mediationsdk.c d2 = com.ironsource.mediationsdk.c.d();
        d2.getClass();
        e = new C4164kb(c4325tb, d2, new Mb(null, null, null, null, null, 31, null));
    }

    public C4164kb(@NotNull C4325tb c4325tb, @NotNull com.ironsource.mediationsdk.c cVar, @NotNull Mb mb) {
        c4325tb.getClass();
        cVar.getClass();
        mb.getClass();
        this.a = c4325tb;
        this.b = cVar;
        this.c = mb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4164kb c4164kb, Map map) {
        c4164kb.getClass();
        map.getClass();
        c4164kb.a.a((Map<String, Boolean>) map);
        c4164kb.b.a((Map<String, Boolean>) map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C4164kb c4164kb, boolean z) {
        c4164kb.getClass();
        c4164kb.a.b(z);
        if (!c4164kb.a.a()) {
            c4164kb.c.b(z);
        } else {
            c4164kb.a.b();
            IronLog.API.error("LevelPlayPrivacySettings.setCOPPA() must be called before LevelPlay.init()");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C4164kb c4164kb, boolean z) {
        c4164kb.getClass();
        c4164kb.a.c(z);
        c4164kb.b.d(z);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.kb$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@NotNull C4164kb c4164kb) {
            c4164kb.getClass();
            C4164kb.e = c4164kb;
        }

        private a() {
        }

        @NotNull
        public final C4164kb a() {
            return C4164kb.e;
        }
    }

    public final void c(boolean z) {
        this.a.a(new pmm(this, z, 0));
    }

    public final void a(@NotNull Map<String, Boolean> map) {
        map.getClass();
        this.a.a(new wem(8, this, map));
    }

    public final void a(boolean z) {
        this.a.a(new pmm(this, z, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4164kb c4164kb, boolean z) {
        c4164kb.getClass();
        c4164kb.a.a(z);
        c4164kb.c.a(z);
    }

    public final void b(boolean z) {
        this.a.a(new pmm(this, z, 1));
    }
}
