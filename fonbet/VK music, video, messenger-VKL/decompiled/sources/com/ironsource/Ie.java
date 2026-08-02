package com.ironsource;

import android.content.Context;
import com.ironsource.InterfaceC4488p4;
import com.ironsource.J8;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import xsna.zcl;

/* loaded from: classes13.dex */
public final class Ie implements J8, J8.a {
    private final Je a;
    private final InterfaceC4659ye b;
    private final InterfaceC4488p4 c;
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

    public Ie(Je je, InterfaceC4659ye interfaceC4659ye, InterfaceC4488p4 interfaceC4488p4) {
        this.a = je;
        this.b = interfaceC4659ye;
        this.c = interfaceC4488p4;
        this.d = -1;
        this.e = -1L;
    }

    private final int b(Context context, Je je) {
        int b = je.b(context, 0) + 1;
        je.a(context, b);
        return b;
    }

    @Override // com.ironsource.J8.a
    public void a(Context context) {
        this.d = b(context, this.a);
        this.e = a(context, this.a);
    }

    @Override // com.ironsource.J8
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

    @Override // com.ironsource.J8
    public String b() {
        return IronSourceUtils.d();
    }

    public /* synthetic */ Ie(Je je, InterfaceC4659ye interfaceC4659ye, InterfaceC4488p4 interfaceC4488p4, int i, zcl zclVar) {
        this(je, (i & 2) != 0 ? new C4677ze() : interfaceC4659ye, (i & 4) != 0 ? new InterfaceC4488p4.a() : interfaceC4488p4);
    }

    @Override // com.ironsource.J8
    public long a() {
        return this.e;
    }
}
