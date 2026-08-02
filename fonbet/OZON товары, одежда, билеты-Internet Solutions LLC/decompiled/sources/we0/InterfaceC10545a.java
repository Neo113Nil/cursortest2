package we0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

/* renamed from: we0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC10545a {

    /* renamed from: we0.a$a, reason: collision with other inner class name */
    public static final class C2257a implements InterfaceC10545a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private Object f104407a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private Object f104408b;

        @Override // we0.InterfaceC10545a
        public final void a(@NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(function0, "<set-?>");
            this.f104407a = function0;
        }

        @Override // we0.InterfaceC10545a
        public final void b(@NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(function0, "<set-?>");
            this.f104408b = function0;
        }

        @Override // we0.InterfaceC10545a
        public final boolean c() {
            return false;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.functions.Function0<kotlin.Unit>] */
        @NotNull
        public final Function0<Unit> d() {
            return this.f104407a;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.functions.Function0<kotlin.Unit>] */
        @NotNull
        public final Function0<Unit> e() {
            return this.f104408b;
        }

        @Override // we0.InterfaceC10545a
        public final void play() {
            d().invoke();
        }

        @Override // we0.InterfaceC10545a
        public final void stop() {
            e().invoke();
        }
    }

    /* renamed from: we0.a$b */
    public static final class b implements InterfaceC10545a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final byte[] f104409a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private Object f104410b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private Object f104411c;

        public b(byte[] byteArray) {
            Intrinsics.checkNotNullParameter(byteArray, "byteArray");
            this.f104409a = byteArray;
            this.f104410b = C10546b.f104418b;
            this.f104411c = C10547c.f104419b;
        }

        @Override // we0.InterfaceC10545a
        public final void a(@NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(function0, "<set-?>");
            this.f104410b = function0;
        }

        @Override // we0.InterfaceC10545a
        public final void b(@NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(function0, "<set-?>");
            this.f104411c = function0;
        }

        @Override // we0.InterfaceC10545a
        public final boolean c() {
            return true;
        }

        @NotNull
        public final byte[] d() {
            return this.f104409a;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.functions.Function0<kotlin.Unit>] */
        @NotNull
        public final Function0<Unit> e() {
            return this.f104410b;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.functions.Function0<kotlin.Unit>] */
        @NotNull
        public final Function0<Unit> f() {
            return this.f104411c;
        }

        @Override // we0.InterfaceC10545a
        public final void play() {
            e().invoke();
        }

        @Override // we0.InterfaceC10545a
        public final void stop() {
            f().invoke();
        }
    }

    /* renamed from: we0.a$c */
    public static final class c implements InterfaceC10545a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private Object f104412a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private Object f104413b;

        @Override // we0.InterfaceC10545a
        public final void a(@NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(function0, "<set-?>");
            this.f104412a = function0;
        }

        @Override // we0.InterfaceC10545a
        public final void b(@NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(function0, "<set-?>");
            this.f104413b = function0;
        }

        @Override // we0.InterfaceC10545a
        public final boolean c() {
            return false;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.functions.Function0<kotlin.Unit>] */
        @NotNull
        public final Function0<Unit> d() {
            return this.f104412a;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.functions.Function0<kotlin.Unit>] */
        @NotNull
        public final Function0<Unit> e() {
            return this.f104413b;
        }

        @Override // we0.InterfaceC10545a
        public final void play() {
            d().invoke();
        }

        @Override // we0.InterfaceC10545a
        public final void stop() {
            e().invoke();
        }
    }

    /* renamed from: we0.a$d */
    public static final class d implements InterfaceC10545a {

        /* renamed from: a, reason: collision with root package name */
        private final int f104414a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f104415b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private Object f104416c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private Object f104417d;

        public /* synthetic */ d() {
            this(true);
        }

        @Override // we0.InterfaceC10545a
        public final void a(@NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(function0, "<set-?>");
            this.f104416c = function0;
        }

        @Override // we0.InterfaceC10545a
        public final void b(@NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(function0, "<set-?>");
            this.f104417d = function0;
        }

        @Override // we0.InterfaceC10545a
        public final boolean c() {
            return this.f104415b;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.functions.Function0<kotlin.Unit>] */
        @NotNull
        public final Function0<Unit> d() {
            return this.f104416c;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.functions.Function0<kotlin.Unit>] */
        @NotNull
        public final Function0<Unit> e() {
            return this.f104417d;
        }

        public final int f() {
            return this.f104414a;
        }

        @Override // we0.InterfaceC10545a
        public final void play() {
            d().invoke();
        }

        @Override // we0.InterfaceC10545a
        public final void stop() {
            e().invoke();
        }

        public d(boolean z11) {
            this.f104414a = R.raw.map_user_marker_anim;
            this.f104415b = z11;
            this.f104416c = C10548d.f104420b;
            this.f104417d = C10549e.f104421b;
        }
    }

    void a(@NotNull Function0<Unit> function0);

    void b(@NotNull Function0<Unit> function0);

    boolean c();

    void play();

    void stop();
}
