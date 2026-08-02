package com.ironsource;

import android.content.Context;
import com.ironsource.I8;
import com.ironsource.InterfaceC2592p4;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class Ie implements I8, I8.a {
    private final Je a;
    private final InterfaceC2763ye b;
    private final InterfaceC2592p4 c;
    private int d;
    private long e;

    public static final class a {
        public static final a a = new a();
        public static final int b = -1;
        public static final int c = 0;
        public static final long d = -1;

        private a() {
        }
    }

    public Ie(Je storage, InterfaceC2763ye initResponseStorage, InterfaceC2592p4 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(initResponseStorage, "initResponseStorage");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.a = storage;
        this.b = initResponseStorage;
        this.c = currentTimeProvider;
        this.d = -1;
        this.e = -1L;
    }

    private final int b(Context context, Je je) {
        int b = je.b(context, 0) + 1;
        je.a(context, b);
        return b;
    }

    @Override // com.ironsource.I8.a
    public void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.d = b(context, this.a);
        this.e = a(context, this.a);
    }

    @Override // com.ironsource.I8
    public int c() {
        return this.d;
    }

    private final long a(Context context, Je je) {
        long a2 = je.a(context, -1L);
        if (this.b.a(context) || a2 != -1) {
            return a2;
        }
        long a3 = this.c.a();
        IronLog.INTERNAL.verbose("set first session timestamp = " + a3);
        je.b(context, a3);
        return a3;
    }

    @Override // com.ironsource.I8
    public String b() {
        String d = IronSourceUtils.d();
        Intrinsics.checkNotNullExpressionValue(d, "getSessionId()");
        return d;
    }

    public /* synthetic */ Ie(Je je, InterfaceC2763ye interfaceC2763ye, InterfaceC2592p4 interfaceC2592p4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(je, (i & 2) != 0 ? new C2781ze() : interfaceC2763ye, (i & 4) != 0 ? new InterfaceC2592p4.a() : interfaceC2592p4);
    }

    @Override // com.ironsource.I8
    public long a() {
        return this.e;
    }
}
