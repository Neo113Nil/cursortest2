package ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.presentation;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public abstract class a {

    /* renamed from: ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.presentation.a$a, reason: collision with other inner class name */
    public static final class C1556a extends a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final o f87057a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1556a(@NotNull o vo) {
            super(0);
            Intrinsics.checkNotNullParameter(vo, "vo");
            this.f87057a = vo;
        }

        @NotNull
        public final o a() {
            return this.f87057a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1556a) && Intrinsics.d(this.f87057a, ((C1556a) obj).f87057a);
        }

        public final int hashCode() {
            return this.f87057a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Init(vo=" + this.f87057a + ")";
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        private final int f87058a;

        public b(int i11) {
            super(0);
            this.f87058a = i11;
        }

        public final int a() {
            return this.f87058a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f87058a == ((b) obj).f87058a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f87058a);
        }

        @NotNull
        public final String toString() {
            return K00.b.e(this.f87058a, ")", new StringBuilder("SelectReason(selectedIndex="));
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f87059a;

        public c() {
            super(0);
            this.f87059a = true;
        }

        public final boolean a() {
            return this.f87059a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f87059a == ((c) obj).f87059a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f87059a);
        }

        @NotNull
        public final String toString() {
            return Pk0.a.a(")", new StringBuilder("ShowDescriptionError(show="), this.f87059a);
        }
    }

    public static final class d extends a {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f87060a;

        public d(boolean z11) {
            super(0);
            this.f87060a = z11;
        }

        public final boolean a() {
            return this.f87060a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f87060a == ((d) obj).f87060a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f87060a);
        }

        @NotNull
        public final String toString() {
            return Pk0.a.a(")", new StringBuilder("Submit(inProgress="), this.f87060a);
        }
    }

    public static final class e extends a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f87061a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@NotNull String text) {
            super(0);
            Intrinsics.checkNotNullParameter(text, "text");
            this.f87061a = text;
        }

        @NotNull
        public final String a() {
            return this.f87061a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Intrinsics.d(this.f87061a, ((e) obj).f87061a);
        }

        public final int hashCode() {
            return this.f87061a.hashCode();
        }

        @NotNull
        public final String toString() {
            return o0.c(new StringBuilder("UpdateDescription(text="), this.f87061a, ")");
        }
    }

    public /* synthetic */ a(int i11) {
        this();
    }

    private a() {
    }
}
