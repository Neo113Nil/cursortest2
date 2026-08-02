package com.ironsource;

import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Ie implements He {

    @NotNull
    private final H8 a;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {

        @NotNull
        public static final a a = new a();

        @NotNull
        public static final String b = "sessionNumber";

        @NotNull
        public static final String c = "firstSessionTimestamp";

        private a() {
        }
    }

    public /* synthetic */ Ie(H8 h8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Ke() : h8);
    }

    @Override // com.ironsource.InterfaceC4239oe
    public long a(@NotNull Context context, long j) {
        context.getClass();
        return this.a.b(context, "firstSessionTimestamp", j);
    }

    @Override // com.ironsource.Je
    public int b(@NotNull Context context, int i) {
        context.getClass();
        return this.a.b(context, a.b, i);
    }

    @Override // com.ironsource.Je
    public void a(@NotNull Context context, int i) {
        context.getClass();
        this.a.a(context, a.b, i);
    }

    @Override // com.ironsource.InterfaceC4239oe
    public void b(@NotNull Context context, long j) {
        context.getClass();
        this.a.a(context, "firstSessionTimestamp", j);
    }

    public Ie(@NotNull H8 h8) {
        h8.getClass();
        this.a = h8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Ie() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
