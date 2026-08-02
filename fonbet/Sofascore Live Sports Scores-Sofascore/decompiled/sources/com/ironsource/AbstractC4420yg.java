package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.yg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4420yg {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.yg$b */
    public static final class b extends AbstractC4420yg {

        @NotNull
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC4420yg(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC4420yg() {
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.yg$a */
    public static final class a extends AbstractC4420yg {

        @NotNull
        private final AbstractC4402xg a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull AbstractC4402xg abstractC4402xg) {
            super(null);
            abstractC4402xg.getClass();
            this.a = abstractC4402xg;
        }

        public static /* synthetic */ a a(a aVar, AbstractC4402xg abstractC4402xg, int i, Object obj) {
            if ((i & 1) != 0) {
                abstractC4402xg = aVar.a;
            }
            return aVar.a(abstractC4402xg);
        }

        @NotNull
        public final AbstractC4402xg b() {
            return this.a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.c(this.a, ((a) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        @NotNull
        public String toString() {
            return "Failure(error=" + this.a + ")";
        }

        @NotNull
        public final a a(@NotNull AbstractC4402xg abstractC4402xg) {
            abstractC4402xg.getClass();
            return new a(abstractC4402xg);
        }

        @NotNull
        public final AbstractC4402xg a() {
            return this.a;
        }
    }
}
