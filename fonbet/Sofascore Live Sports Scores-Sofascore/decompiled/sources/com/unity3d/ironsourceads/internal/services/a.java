package com.unity3d.ironsourceads.internal.services;

import android.content.Context;
import com.ironsource.C4144j9;
import com.ironsource.EnumC4180l9;
import defpackage.a70;
import defpackage.lnb;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public interface a {
    static /* synthetic */ AbstractC1347a a(a aVar, Context context, EnumC4180l9 enumC4180l9, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: destroy");
            return null;
        }
        if ((i & 2) != 0) {
            enumC4180l9 = EnumC4180l9.APP_ACTIVITY;
        }
        return aVar.a(context, enumC4180l9);
    }

    @NotNull
    AbstractC1347a a(@NotNull Context context, @NotNull C4144j9 c4144j9);

    @NotNull
    AbstractC1347a a(@NotNull Context context, @NotNull EnumC4180l9 enumC4180l9);

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.unity3d.ironsourceads.internal.services.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC1347a {

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        /* renamed from: com.unity3d.ironsourceads.internal.services.a$a$b */
        public static final class b extends AbstractC1347a {

            @NotNull
            public static final b a = new b();

            private b() {
                super(null);
            }
        }

        public /* synthetic */ AbstractC1347a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC1347a() {
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        /* renamed from: com.unity3d.ironsourceads.internal.services.a$a$a, reason: collision with other inner class name */
        public static final class C1348a extends AbstractC1347a {

            @NotNull
            private final String a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1348a(@NotNull String str) {
                super(null);
                str.getClass();
                this.a = str;
            }

            public static /* synthetic */ C1348a a(C1348a c1348a, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = c1348a.a;
                }
                return c1348a.a(str);
            }

            @NotNull
            public final String b() {
                return this.a;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1348a) && Intrinsics.c(this.a, ((C1348a) obj).a);
            }

            public int hashCode() {
                return this.a.hashCode();
            }

            @NotNull
            public String toString() {
                return lnb.o("Error(errorMessage=", this.a, ")");
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C1348a() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public /* synthetic */ C1348a(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str);
            }

            @NotNull
            public final C1348a a(@NotNull String str) {
                str.getClass();
                return new C1348a(str);
            }

            @NotNull
            public final String a() {
                return this.a;
            }
        }
    }
}
