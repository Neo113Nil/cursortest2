package com.ironsource;

import defpackage.lnb;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.k0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC4153k0 {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.k0$b */
    public static final class b implements InterfaceC4153k0 {

        @NotNull
        public static final b a = new b();
        private static final boolean b = true;

        private b() {
        }

        @Override // com.ironsource.InterfaceC4153k0
        public boolean a() {
            return b;
        }
    }

    boolean a();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.k0$a */
    public static final class a implements InterfaceC4153k0 {

        @NotNull
        public static final C1204a c = new C1204a(null);

        @Nullable
        private final String a;
        private final boolean b;

        public /* synthetic */ a(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public static /* synthetic */ a a(a aVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.a;
            }
            return aVar.a(str);
        }

        @Nullable
        public final String b() {
            return this.a;
        }

        @Nullable
        public final String c() {
            return this.a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.c(this.a, ((a) obj).a);
        }

        public int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return lnb.o("NotReady(reason=", this.a, ")");
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        /* renamed from: com.ironsource.k0$a$a, reason: collision with other inner class name */
        public static final class C1204a {
            public /* synthetic */ C1204a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final a a(@Nullable String str) {
                return new a(str);
            }

            private C1204a() {
            }
        }

        public a(@Nullable String str) {
            this.a = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @NotNull
        public final a a(@Nullable String str) {
            return new a(str);
        }

        @Override // com.ironsource.InterfaceC4153k0
        public boolean a() {
            return this.b;
        }
    }
}
