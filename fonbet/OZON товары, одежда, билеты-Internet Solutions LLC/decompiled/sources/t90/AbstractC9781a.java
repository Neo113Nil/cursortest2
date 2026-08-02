package t90;

import B90.C2618u;
import android.content.Intent;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s90.InterfaceC9636e;

/* renamed from: t90.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC9781a {

    /* renamed from: t90.a$a, reason: collision with other inner class name */
    public static final class C2181a extends AbstractC9781a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Intent f99283a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2181a(@NotNull Intent settingsIntent) {
            super(0);
            Intrinsics.checkNotNullParameter(settingsIntent, "settingsIntent");
            this.f99283a = settingsIntent;
        }

        @NotNull
        public final Intent a() {
            return this.f99283a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2181a) && Intrinsics.d(this.f99283a, ((C2181a) obj).f99283a);
        }

        public final int hashCode() {
            return this.f99283a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "OpenSettings(settingsIntent=" + this.f99283a + ")";
        }
    }

    /* renamed from: t90.a$b */
    public static final class b extends AbstractC9781a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final List<InterfaceC9636e> f99284a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(@NotNull List<? extends InterfaceC9636e> permissions) {
            super(0);
            Intrinsics.checkNotNullParameter(permissions, "permissions");
            this.f99284a = permissions;
        }

        @NotNull
        public final List<InterfaceC9636e> a() {
            return this.f99284a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.d(this.f99284a, ((b) obj).f99284a);
        }

        public final int hashCode() {
            return this.f99284a.hashCode();
        }

        @NotNull
        public final String toString() {
            return C2618u.h(new StringBuilder("RequestPermission(permissions="), this.f99284a, ")");
        }
    }

    public /* synthetic */ AbstractC9781a(int i11) {
        this();
    }

    private AbstractC9781a() {
    }
}
