package pZ;

import EZ.i;
import T7.P;
import java.util.Map;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class e extends f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f80367a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<String, Object> f80368b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final kotlin.reflect.d<? extends EZ.a<?>> f80369c;

    public static final class a extends i<e> {
        @Override // EZ.a
        public final void navigate(@NotNull EZ.g navigator, @NotNull EZ.e<e> response) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(response, "response");
            i.openDeeplink$default(this, response.b().a(), 0, response.b().b(), 2, null);
        }

        @Override // EZ.a
        public final void navigateForResult(@NotNull EZ.g navigator, @NotNull EZ.e<e> response, int i11) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(response, "response");
            openDeeplink(response.b().a(), i11, response.b().b());
        }
    }

    public /* synthetic */ e(String str) {
        this(str, U.c());
    }

    @NotNull
    public final String a() {
        return this.f80367a;
    }

    @NotNull
    public final Map<String, Object> b() {
        return this.f80368b;
    }

    @Override // pZ.f
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e) || !super.equals(obj)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f80367a, eVar.f80367a) && Intrinsics.d(this.f80368b, eVar.f80368b);
    }

    @Override // pZ.f
    @NotNull
    public final kotlin.reflect.d<? extends EZ.a<?>> getNavigator() {
        return this.f80369c;
    }

    @Override // pZ.f
    public final int hashCode() {
        return this.f80368b.hashCode() + G.g.a(super.hashCode() * 31, 31, this.f80367a);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeeplinkDestination(deeplink='");
        sb2.append(this.f80367a);
        sb2.append("', properties=");
        return P.f(sb2, this.f80368b, ")");
    }

    public e(@NotNull String deeplink, @NotNull Map<String, ? extends Object> properties) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(properties, "properties");
        this.f80367a = deeplink;
        this.f80368b = properties;
        this.f80369c = N.b(a.class);
    }
}
