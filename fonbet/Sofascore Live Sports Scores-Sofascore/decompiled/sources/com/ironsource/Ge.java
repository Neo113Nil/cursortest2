package com.ironsource;

import android.content.Context;
import com.ironsource.G8;
import com.ironsource.InterfaceC4193m4;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Ge implements G8, G8.a {

    @NotNull
    private final He a;

    @NotNull
    private final InterfaceC4382we b;

    @NotNull
    private final InterfaceC4193m4 c;
    private int d;
    private long e;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {

        @NotNull
        public static final a a = new a();
        public static final int b = -1;
        public static final int c = 0;
        public static final long d = -1;

        private a() {
        }
    }

    public Ge(@NotNull He he, @NotNull InterfaceC4382we interfaceC4382we, @NotNull InterfaceC4193m4 interfaceC4193m4) {
        he.getClass();
        interfaceC4382we.getClass();
        interfaceC4193m4.getClass();
        this.a = he;
        this.b = interfaceC4382we;
        this.c = interfaceC4193m4;
        this.d = -1;
        this.e = -1L;
    }

    private final long a(Context context, He he) {
        long a2 = he.a(context, -1L);
        if (this.b.a(context) || a2 != -1) {
            return a2;
        }
        long a3 = this.c.a();
        IronLog.INTERNAL.verbose("set first session timestamp = " + a3);
        he.b(context, a3);
        return a3;
    }

    private final int b(Context context, He he) {
        int b = he.b(context, 0) + 1;
        he.a(context, b);
        return b;
    }

    @Override // com.ironsource.G8
    public int c() {
        return this.d;
    }

    @Override // com.ironsource.G8
    @NotNull
    public String b() {
        String d = IronSourceUtils.d();
        d.getClass();
        return d;
    }

    public /* synthetic */ Ge(He he, InterfaceC4382we interfaceC4382we, InterfaceC4193m4 interfaceC4193m4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(he, (i & 2) != 0 ? new C4400xe() : interfaceC4382we, (i & 4) != 0 ? new InterfaceC4193m4.a() : interfaceC4193m4);
    }

    @Override // com.ironsource.G8.a
    public void a(@NotNull Context context) {
        context.getClass();
        this.d = b(context, this.a);
        this.e = a(context, this.a);
    }

    @Override // com.ironsource.G8
    public long a() {
        return this.e;
    }
}
