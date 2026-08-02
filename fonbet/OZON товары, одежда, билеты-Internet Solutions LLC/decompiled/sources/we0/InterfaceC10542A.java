package we0;

import android.graphics.Bitmap;
import android.view.View;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: we0.A, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC10542A {

    /* renamed from: we0.A$a */
    public static final class a implements InterfaceC10542A {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final InterfaceC10545a f104400a;

        public a(@NotNull InterfaceC10545a animationSource) {
            Intrinsics.checkNotNullParameter(animationSource, "animationSource");
            this.f104400a = animationSource;
        }

        @NotNull
        public final InterfaceC10545a a() {
            return this.f104400a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                return this.f104400a.equals(((a) obj).f104400a) && Float.compare(1.0f, 1.0f) == 0;
            }
            return false;
        }

        public final int hashCode() {
            return Float.hashCode(1.0f) + (this.f104400a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "AnimatedView(animationSource=" + this.f104400a + ", contentScale=1.0)";
        }
    }

    /* renamed from: we0.A$b */
    public static final class b implements InterfaceC10542A {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final AbstractC7737t f104401a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@NotNull Function0<? extends View> provider) {
            Intrinsics.checkNotNullParameter(provider, "provider");
            this.f104401a = (AbstractC7737t) provider;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function0<android.view.View>, kotlin.jvm.internal.t] */
        @NotNull
        public final Function0<View> a() {
            return this.f104401a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f104401a.equals(((b) obj).f104401a);
        }

        public final int hashCode() {
            return this.f104401a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "CustomView(provider=" + this.f104401a + ")";
        }
    }

    /* renamed from: we0.A$d */
    public static final class d implements InterfaceC10542A {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final d f104404a = new d();
    }

    /* renamed from: we0.A$c */
    public static final class c implements InterfaceC10542A {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Bitmap f104402a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f104403b;

        public c(@NotNull Bitmap bitmap, @NotNull String cacheKey) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
            this.f104402a = bitmap;
            this.f104403b = cacheKey;
        }

        @NotNull
        public final Bitmap a() {
            return this.f104402a;
        }

        @NotNull
        public final String b() {
            return this.f104403b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.d(this.f104402a, cVar.f104402a) && Intrinsics.d(this.f104403b, cVar.f104403b);
        }

        public final int hashCode() {
            return this.f104403b.hashCode() + (this.f104402a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "Image(bitmap=" + this.f104402a + ", cacheKey=" + this.f104403b + ")";
        }

        public /* synthetic */ c(Bitmap bitmap) {
            this(bitmap, UUID.randomUUID().toString());
        }
    }
}
