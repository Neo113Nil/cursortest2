package ru.ozon.android.messenger.framework.presentation.chatlist.popup;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public abstract class f {

    public static final class a extends f {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final ru.ozon.android.messenger.framework.navigation.action.a f90538a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull ru.ozon.android.messenger.framework.navigation.action.a atomActionWrapper) {
            super(0);
            Intrinsics.checkNotNullParameter(atomActionWrapper, "atomActionWrapper");
            this.f90538a = atomActionWrapper;
        }

        @NotNull
        public final ru.ozon.android.messenger.framework.navigation.action.a a() {
            return this.f90538a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.d(this.f90538a, ((a) obj).f90538a);
        }

        public final int hashCode() {
            return this.f90538a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "AddOnHideAction(atomActionWrapper=" + this.f90538a + ")";
        }
    }

    public static final class b extends f {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f90539a = new b(0);
    }

    public static final class c extends f {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f90540a = new c(0);
    }

    public static final class d extends f {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final d f90541a = new d(0);
    }

    public static final class e extends f {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f90542a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@NotNull String message) {
            super(0);
            Intrinsics.checkNotNullParameter(message, "message");
            this.f90542a = message;
        }

        @NotNull
        public final String a() {
            return this.f90542a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Intrinsics.d(this.f90542a, ((e) obj).f90542a);
        }

        public final int hashCode() {
            return this.f90542a.hashCode();
        }

        @NotNull
        public final String toString() {
            return o0.c(new StringBuilder("ShowAlert(message="), this.f90542a, ")");
        }
    }

    public /* synthetic */ f(int i11) {
        this();
    }

    private f() {
    }
}
