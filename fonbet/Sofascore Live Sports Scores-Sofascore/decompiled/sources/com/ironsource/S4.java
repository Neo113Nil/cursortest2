package com.ironsource;

import defpackage.vxd;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class S4 {

    @NotNull
    private final String a;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b extends S4 {

        @NotNull
        public static final b b = new b();

        private b() {
            super("show_flow", null);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class c extends S4 {

        @NotNull
        public static final c b = new c();

        private c() {
            super("show_recovery", null);
        }
    }

    private S4(String str) {
        this.a = str;
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    public /* synthetic */ S4(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a extends S4 {
        private final long b;

        public a(long j) {
            super("scheduler_expired", null);
            this.b = j;
        }

        public static /* synthetic */ a a(a aVar, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = aVar.b;
            }
            return aVar.a(j);
        }

        public final long b() {
            return this.b;
        }

        public final long c() {
            return this.b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.b == ((a) obj).b;
        }

        public int hashCode() {
            return Long.hashCode(this.b);
        }

        @NotNull
        public String toString() {
            return vxd.m("SchedulerExpired(durationMs=", this.b, ")");
        }

        @NotNull
        public final a a(long j) {
            return new a(j);
        }
    }
}
