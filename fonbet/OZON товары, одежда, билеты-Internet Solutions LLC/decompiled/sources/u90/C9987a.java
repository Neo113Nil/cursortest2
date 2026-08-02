package u90;

import G.g;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.ui.button.large.FinLargeButtonState;

/* renamed from: u90.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9987a {

    /* renamed from: a, reason: collision with root package name */
    private final int f100427a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f100428b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f100429c;

    /* renamed from: d, reason: collision with root package name */
    private final FinLargeButtonState f100430d;

    /* renamed from: e, reason: collision with root package name */
    private final FinLargeButtonState f100431e;

    /* renamed from: f, reason: collision with root package name */
    private final C7735q f100432f;

    /* JADX WARN: Multi-variable type inference failed */
    public C9987a(@NotNull String title, @NotNull String description, FinLargeButtonState finLargeButtonState, FinLargeButtonState finLargeButtonState2, Function0 function0) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f100427a = R.drawable.ic_illustration_permission_rationale_80;
        this.f100428b = title;
        this.f100429c = description;
        this.f100430d = finLargeButtonState;
        this.f100431e = finLargeButtonState2;
        this.f100432f = (C7735q) function0;
    }

    @NotNull
    public final String a() {
        return this.f100429c;
    }

    public final int b() {
        return this.f100427a;
    }

    public final FinLargeButtonState c() {
        return this.f100431e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.internal.q] */
    public final Function0<Unit> d() {
        return this.f100432f;
    }

    public final FinLargeButtonState e() {
        return this.f100430d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9987a)) {
            return false;
        }
        C9987a c9987a = (C9987a) obj;
        return this.f100427a == c9987a.f100427a && Intrinsics.d(this.f100428b, c9987a.f100428b) && Intrinsics.d(this.f100429c, c9987a.f100429c) && Intrinsics.d(this.f100430d, c9987a.f100430d) && Intrinsics.d(this.f100431e, c9987a.f100431e) && Intrinsics.d(this.f100432f, c9987a.f100432f);
    }

    @NotNull
    public final String f() {
        return this.f100428b;
    }

    public final int hashCode() {
        int a11 = g.a(g.a(Integer.hashCode(this.f100427a) * 31, 31, this.f100428b), 31, this.f100429c);
        FinLargeButtonState finLargeButtonState = this.f100430d;
        int hashCode = (a11 + (finLargeButtonState == null ? 0 : finLargeButtonState.hashCode())) * 31;
        FinLargeButtonState finLargeButtonState2 = this.f100431e;
        int hashCode2 = (hashCode + (finLargeButtonState2 == null ? 0 : finLargeButtonState2.hashCode())) * 31;
        C7735q c7735q = this.f100432f;
        return hashCode2 + (c7735q != null ? c7735q.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "PermissionsScreenState(icon=" + this.f100427a + ", title=" + this.f100428b + ", description=" + this.f100429c + ", positiveBtn=" + this.f100430d + ", negativeBtn=" + this.f100431e + ", onClose=" + this.f100432f + ")";
    }
}
