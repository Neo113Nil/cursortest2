package com.ironsource;

import android.content.Context;
import xsna.fo8;
import xsna.zcl;

/* renamed from: com.ironsource.rf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4534rf implements B3 {
    public static final a d = new a(null);
    public static final int e = -1;
    public static final long f = -1;
    private final Context a;
    private final String b;
    private final K8 c;

    /* renamed from: com.ironsource.rf$a */
    public static final class a {
        public /* synthetic */ a(zcl zclVar) {
            this();
        }

        private a() {
        }
    }

    public C4534rf(Context context, String str, K8 k8) {
        this.a = context;
        this.b = str;
        this.c = k8;
    }

    @Override // com.ironsource.B3
    public void a(String str, int i) {
        this.c.a(this.a, new C4552sf(str, fo8.a(this.b, ".show_count_show_counter")).a(), i);
    }

    @Override // com.ironsource.B3
    public Long b(String str) {
        return a(Long.valueOf(this.c.b(this.a, new C4552sf(str, fo8.a(this.b, ".pacing_last_show_time")).a(), -1L)));
    }

    @Override // com.ironsource.B3
    public Integer c(String str) {
        return a(Integer.valueOf(this.c.b(this.a, new C4552sf(str, fo8.a(this.b, ".show_count_show_counter")).a(), -1)));
    }

    public /* synthetic */ C4534rf(Context context, String str, K8 k8, int i, zcl zclVar) {
        this(context, str, (i & 4) != 0 ? new Me() : k8);
    }

    @Override // com.ironsource.B3
    public void a(String str, long j) {
        this.c.a(this.a, new C4552sf(str, fo8.a(this.b, ".pacing_last_show_time")).a(), j);
    }

    @Override // com.ironsource.B3
    public void b(String str, long j) {
        this.c.a(this.a, new C4552sf(str, fo8.a(this.b, ".show_count_threshold")).a(), j);
    }

    @Override // com.ironsource.B3
    public Long a(String str) {
        return a(Long.valueOf(this.c.b(this.a, new C4552sf(str, fo8.a(this.b, ".show_count_threshold")).a(), -1L)));
    }

    private final Long a(Long l) {
        if (l != null && l.longValue() == -1) {
            return null;
        }
        return l;
    }

    private final Integer a(Integer num) {
        if (num != null && num.intValue() == -1) {
            return null;
        }
        return num;
    }
}
