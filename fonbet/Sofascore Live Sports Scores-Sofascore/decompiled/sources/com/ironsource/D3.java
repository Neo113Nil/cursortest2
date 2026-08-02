package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class D3 {
    private final boolean a;

    @Nullable
    private final F3 b;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[F3.values().length];
            try {
                iArr[F3.Delivery.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[F3.Pacing.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[F3.ShowCount.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public /* synthetic */ D3(boolean z, F3 f3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : f3);
    }

    public static /* synthetic */ D3 a(D3 d3, boolean z, F3 f3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = d3.a;
        }
        if ((i & 2) != 0) {
            f3 = d3.b;
        }
        return d3.a(z, f3);
    }

    @Nullable
    public final F3 b() {
        return this.b;
    }

    @Nullable
    public final F3 c() {
        return this.b;
    }

    public final boolean d() {
        return this.a;
    }

    @Nullable
    public final String e() {
        F3 f3 = this.b;
        int i = f3 == null ? -1 : a.a[f3.ordinal()];
        if (i == 1) {
            return "Placement delivery is false";
        }
        if (i == 2) {
            return "In pacing mode";
        }
        if (i != 3) {
            return null;
        }
        return "Max ad cap reached";
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D3)) {
            return false;
        }
        D3 d3 = (D3) obj;
        return this.a == d3.a && this.b == d3.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        F3 f3 = this.b;
        return i + (f3 == null ? 0 : f3.hashCode());
    }

    @NotNull
    public String toString() {
        return "CappingStatus(isCapped=" + this.a + " reason=" + this.b + ")";
    }

    public D3(boolean z, @Nullable F3 f3) {
        this.a = z;
        this.b = f3;
    }

    @NotNull
    public final D3 a(boolean z, @Nullable F3 f3) {
        return new D3(z, f3);
    }

    public final boolean a() {
        return this.a;
    }
}
