package t90;

import B0.C2454a;
import B90.C2618u;
import android.content.Intent;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s90.InterfaceC9636e;

/* renamed from: t90.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC9782b {

    /* renamed from: a, reason: collision with root package name */
    private boolean f99285a;

    /* renamed from: t90.b$a */
    public static final class a extends AbstractC9782b {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final List<InterfaceC9636e> f99286b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull List<? extends InterfaceC9636e> permissions) {
            super(0);
            Intrinsics.checkNotNullParameter(permissions, "permissions");
            this.f99286b = permissions;
        }

        @Override // t90.AbstractC9782b
        @NotNull
        public final List<InterfaceC9636e> a() {
            return this.f99286b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.d(this.f99286b, ((a) obj).f99286b);
        }

        public final int hashCode() {
            return this.f99286b.hashCode();
        }

        @NotNull
        public final String toString() {
            return C2618u.h(new StringBuilder("Granted(permissions="), this.f99286b, ")");
        }
    }

    /* renamed from: t90.b$b, reason: collision with other inner class name */
    public static final class C2182b extends AbstractC9782b {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final List<InterfaceC9636e> f99287b;

        /* renamed from: c, reason: collision with root package name */
        private final int f99288c;

        /* renamed from: d, reason: collision with root package name */
        private final int f99289d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C2182b(@NotNull List<? extends InterfaceC9636e> permissions, int i11, int i12) {
            super(0);
            Intrinsics.checkNotNullParameter(permissions, "permissions");
            this.f99287b = permissions;
            this.f99288c = i11;
            this.f99289d = i12;
        }

        @Override // t90.AbstractC9782b
        @NotNull
        public final List<InterfaceC9636e> a() {
            return this.f99287b;
        }

        public final int d() {
            return this.f99289d;
        }

        public final int e() {
            return this.f99288c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2182b)) {
                return false;
            }
            C2182b c2182b = (C2182b) obj;
            return Intrinsics.d(this.f99287b, c2182b.f99287b) && this.f99288c == c2182b.f99288c && this.f99289d == c2182b.f99289d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f99289d) + C2454a.a(this.f99288c, this.f99287b.hashCode() * 31, 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("NeedPermissionRationaleRequest(permissions=");
            sb2.append(this.f99287b);
            sb2.append(", titleId=");
            sb2.append(this.f99288c);
            sb2.append(", descriptionId=");
            return K00.b.e(this.f99289d, ")", sb2);
        }
    }

    /* renamed from: t90.b$c */
    public static final class c extends AbstractC9782b {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final List<InterfaceC9636e> f99290b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(@NotNull List<? extends InterfaceC9636e> permissions) {
            super(0);
            Intrinsics.checkNotNullParameter(permissions, "permissions");
            this.f99290b = permissions;
        }

        @Override // t90.AbstractC9782b
        @NotNull
        public final List<InterfaceC9636e> a() {
            return this.f99290b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.d(this.f99290b, ((c) obj).f99290b);
        }

        public final int hashCode() {
            return this.f99290b.hashCode();
        }

        @NotNull
        public final String toString() {
            return C2618u.h(new StringBuilder("NeedPermissionRequest(permissions="), this.f99290b, ")");
        }
    }

    /* renamed from: t90.b$d */
    public static final class d extends AbstractC9782b {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final List<InterfaceC9636e> f99291b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final Intent f99292c;

        /* renamed from: d, reason: collision with root package name */
        private final int f99293d;

        /* renamed from: e, reason: collision with root package name */
        private final int f99294e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(@NotNull List<? extends InterfaceC9636e> permissions, @NotNull Intent settingsIntent, int i11, int i12) {
            super(0);
            Intrinsics.checkNotNullParameter(permissions, "permissions");
            Intrinsics.checkNotNullParameter(settingsIntent, "settingsIntent");
            this.f99291b = permissions;
            this.f99292c = settingsIntent;
            this.f99293d = i11;
            this.f99294e = i12;
        }

        @Override // t90.AbstractC9782b
        @NotNull
        public final List<InterfaceC9636e> a() {
            return this.f99291b;
        }

        public final int d() {
            return this.f99294e;
        }

        @NotNull
        public final Intent e() {
            return this.f99292c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.d(this.f99291b, dVar.f99291b) && Intrinsics.d(this.f99292c, dVar.f99292c) && this.f99293d == dVar.f99293d && this.f99294e == dVar.f99294e;
        }

        public final int f() {
            return this.f99293d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f99294e) + C2454a.a(this.f99293d, (this.f99292c.hashCode() + (this.f99291b.hashCode() * 31)) * 31, 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("NeedPermissionSettings(permissions=");
            sb2.append(this.f99291b);
            sb2.append(", settingsIntent=");
            sb2.append(this.f99292c);
            sb2.append(", titleId=");
            sb2.append(this.f99293d);
            sb2.append(", descriptionId=");
            return K00.b.e(this.f99294e, ")", sb2);
        }
    }

    /* renamed from: t90.b$e */
    public static final class e extends AbstractC9782b {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final List<InterfaceC9636e> f99295b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(@NotNull List<? extends InterfaceC9636e> permissions) {
            super(0);
            Intrinsics.checkNotNullParameter(permissions, "permissions");
            this.f99295b = permissions;
        }

        @Override // t90.AbstractC9782b
        @NotNull
        public final List<InterfaceC9636e> a() {
            return this.f99295b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Intrinsics.d(this.f99295b, ((e) obj).f99295b);
        }

        public final int hashCode() {
            return this.f99295b.hashCode();
        }

        @NotNull
        public final String toString() {
            return C2618u.h(new StringBuilder("NotDeclared(permissions="), this.f99295b, ")");
        }
    }

    public /* synthetic */ AbstractC9782b(int i11) {
        this();
    }

    @NotNull
    public abstract List<InterfaceC9636e> a();

    public final boolean b() {
        return this.f99285a;
    }

    public final void c(boolean z11) {
        this.f99285a = z11;
    }

    private AbstractC9782b() {
        this.f99285a = true;
    }
}
