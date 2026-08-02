package i10;

import Kk.C3532b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final A00.a f65710a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final T00.a f65711b;

    /* renamed from: c, reason: collision with root package name */
    private final String f65712c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final S00.a f65713d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f65714e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f65715f;

    /* renamed from: g, reason: collision with root package name */
    private final z00.f f65716g;

    public e(@NotNull A00.a event, @NotNull T00.a responseState, String str, @NotNull S00.a metrics, boolean z11, boolean z12, z00.f fVar) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(responseState, "responseState");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        this.f65710a = event;
        this.f65711b = responseState;
        this.f65712c = str;
        this.f65713d = metrics;
        this.f65714e = z11;
        this.f65715f = z12;
        this.f65716g = fVar;
    }

    public static e a(e eVar, z00.f fVar, int i11) {
        boolean z11 = (i11 & 32) != 0 ? eVar.f65715f : false;
        if ((i11 & 64) != 0) {
            fVar = eVar.f65716g;
        }
        A00.a event = eVar.f65710a;
        Intrinsics.checkNotNullParameter(event, "event");
        T00.a responseState = eVar.f65711b;
        Intrinsics.checkNotNullParameter(responseState, "responseState");
        S00.a metrics = eVar.f65713d;
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        return new e(event, responseState, eVar.f65712c, metrics, eVar.f65714e, z11, fVar);
    }

    public final z00.f b() {
        return this.f65716g;
    }

    @NotNull
    public final A00.a c() {
        return this.f65710a;
    }

    @NotNull
    public final S00.a d() {
        return this.f65713d;
    }

    public final String e() {
        return this.f65712c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!e.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type ru.ozon.composer.state.ComposerPageView");
        e eVar = (e) obj;
        return Intrinsics.d(this.f65710a, eVar.f65710a) && Intrinsics.d(this.f65711b, eVar.f65711b) && Intrinsics.d(this.f65712c, eVar.f65712c) && Intrinsics.d(this.f65713d, eVar.f65713d) && this.f65714e == eVar.f65714e && this.f65715f == eVar.f65715f && Intrinsics.d(this.f65716g, eVar.f65716g);
    }

    @NotNull
    public final T00.a f() {
        return this.f65711b;
    }

    public final boolean g() {
        return this.f65714e;
    }

    public final boolean h() {
        return this.f65715f;
    }

    public final int hashCode() {
        int hashCode = (this.f65711b.hashCode() + (this.f65710a.hashCode() * 31)) * 31;
        String str = this.f65712c;
        int a11 = C3532b.a(C3532b.a((this.f65713d.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31, 31, this.f65714e), 31, this.f65715f);
        z00.f fVar = this.f65716g;
        return a11 + (fVar != null ? fVar.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "ComposerPageView(event=" + this.f65710a + ", responseState=" + this.f65711b + ", requestId=" + this.f65712c + ", metrics=" + this.f65713d + ", isPageViewRequiredEvent=" + this.f65714e + ", isUpdateTokenRequired=" + this.f65715f + ", customErrorPageIssue=" + this.f65716g + ")";
    }
}
