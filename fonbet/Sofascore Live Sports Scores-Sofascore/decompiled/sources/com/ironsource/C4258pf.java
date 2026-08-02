package com.ironsource;

import android.content.Context;
import defpackage.dmi;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.pf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4258pf implements InterfaceC4407y3 {

    @NotNull
    public static final a d = new a(null);
    public static final int e = -1;
    public static final long f = -1;

    @NotNull
    private final Context a;

    @NotNull
    private final String b;

    @NotNull
    private final H8 c;

    public C4258pf(@NotNull Context context, @NotNull String str, @NotNull H8 h8) {
        context.getClass();
        str.getClass();
        h8.getClass();
        this.a = context;
        this.b = str;
        this.c = h8;
    }

    @Override // com.ironsource.InterfaceC4407y3
    @Nullable
    public Long a(@NotNull String str) {
        str.getClass();
        return a(Long.valueOf(this.c.b(this.a, new C4276qf(str, dmi.y(this.b, ".show_count_threshold")).a(), -1L)));
    }

    @Override // com.ironsource.InterfaceC4407y3
    @Nullable
    public Long b(@NotNull String str) {
        str.getClass();
        return a(Long.valueOf(this.c.b(this.a, new C4276qf(str, dmi.y(this.b, ".pacing_last_show_time")).a(), -1L)));
    }

    @Override // com.ironsource.InterfaceC4407y3
    @Nullable
    public Integer c(@NotNull String str) {
        str.getClass();
        return a(Integer.valueOf(this.c.b(this.a, new C4276qf(str, dmi.y(this.b, ".show_count_show_counter")).a(), -1)));
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.pf$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ C4258pf(Context context, String str, H8 h8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i & 4) != 0 ? new Ke() : h8);
    }

    @Override // com.ironsource.InterfaceC4407y3
    public void a(@NotNull String str, long j) {
        str.getClass();
        this.c.a(this.a, new C4276qf(str, dmi.y(this.b, ".pacing_last_show_time")).a(), j);
    }

    @Override // com.ironsource.InterfaceC4407y3
    public void b(@NotNull String str, long j) {
        str.getClass();
        this.c.a(this.a, new C4276qf(str, dmi.y(this.b, ".show_count_threshold")).a(), j);
    }

    @Override // com.ironsource.InterfaceC4407y3
    public void a(@NotNull String str, int i) {
        str.getClass();
        this.c.a(this.a, new C4276qf(str, dmi.y(this.b, ".show_count_show_counter")).a(), i);
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
