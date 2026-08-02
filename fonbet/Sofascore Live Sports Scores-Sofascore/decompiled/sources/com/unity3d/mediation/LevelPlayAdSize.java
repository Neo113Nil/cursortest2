package com.unity3d.mediation;

import android.content.Context;
import com.ironsource.C4065f1;
import com.ironsource.C4189m0;
import com.ironsource.mediationsdk.j;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a70;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class LevelPlayAdSize {
    private static final int f = 320;
    private static final int g = 50;
    private static final int h = 320;
    private static final int i = 90;
    private static final int m = 90;
    private int a;
    private int b;

    @Nullable
    private final String c;
    private final boolean d;

    @Nullable
    private final LevelPlayAdSize e;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final LevelPlayAdSize BANNER = new LevelPlayAdSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50, j.a, false, null, 16, null);
    private static final int j = 300;
    private static final int k = 250;

    @NotNull
    public static final LevelPlayAdSize MEDIUM_RECTANGLE = new LevelPlayAdSize(j, k, j.g, false, null, 16, null);
    private static final int l = 728;

    @NotNull
    public static final LevelPlayAdSize LEADERBOARD = new LevelPlayAdSize(l, 90, j.d, false, null, 16, null);

    @NotNull
    public static final LevelPlayAdSize LARGE = new LevelPlayAdSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 90, j.b, false, null, 16, null);

    public /* synthetic */ LevelPlayAdSize(int i2, int i3, String str, boolean z, LevelPlayAdSize levelPlayAdSize, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3, (i4 & 4) != 0 ? null : str, z, (i4 & 16) != 0 ? null : levelPlayAdSize);
    }

    @Nullable
    public static final LevelPlayAdSize createAdaptiveAdSize(@NotNull Context context) {
        return Companion.createAdaptiveAdSize(context);
    }

    @NotNull
    public static final LevelPlayAdSize createCustomSize(int i2, int i3) {
        return Companion.createCustomSize(i2, i3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!LevelPlayAdSize.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        LevelPlayAdSize levelPlayAdSize = (LevelPlayAdSize) obj;
        return this.a == levelPlayAdSize.a && this.b == levelPlayAdSize.b && Intrinsics.c(this.c, levelPlayAdSize.c);
    }

    @NotNull
    public final String getDescription() {
        return String.valueOf(this.c);
    }

    @Nullable
    public final LevelPlayAdSize getFallbackAdSize$mediationsdk_release() {
        return this.e;
    }

    public final int getHeight() {
        return this.b;
    }

    public final int getWidth() {
        return this.a;
    }

    public int hashCode() {
        int i2 = ((this.a * 31) + this.b) * 31;
        String str = this.c;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    public final boolean isAdaptive() {
        return this.d;
    }

    @NotNull
    public String toString() {
        return this.c + " " + this.a + "x" + this.b;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ LevelPlayAdSize createAdaptiveAdSize$default(Companion companion, Context context, Integer num, int i, Object obj) {
            if ((i & 2) != 0) {
                num = null;
            }
            return companion.createAdaptiveAdSize(context, num);
        }

        @NotNull
        public final LevelPlayAdSize createAdSize$mediationsdk_release(@NotNull String str) {
            str.getClass();
            int hashCode = str.hashCode();
            if (hashCode != -96588539) {
                if (hashCode != 72205083) {
                    if (hashCode != 446888797) {
                        if (hashCode == 1951953708 && str.equals(j.a)) {
                            return LevelPlayAdSize.BANNER;
                        }
                    } else if (str.equals(j.d)) {
                        return LevelPlayAdSize.LEADERBOARD;
                    }
                } else if (str.equals(j.b)) {
                    return LevelPlayAdSize.LARGE;
                }
            } else if (str.equals(j.g)) {
                return LevelPlayAdSize.MEDIUM_RECTANGLE;
            }
            a70.p("Wrong Ad Size");
            return null;
        }

        @Nullable
        public final LevelPlayAdSize createAdaptiveAdSize(@NotNull Context context, @Nullable Integer num) {
            context.getClass();
            return new C4065f1(new C4189m0()).a(context, num);
        }

        @NotNull
        public final LevelPlayAdSize createCustomSize(int i, int i2) {
            return new LevelPlayAdSize(i, i2, j.f, false, null, 16, null);
        }

        private Companion() {
        }

        @Nullable
        public final LevelPlayAdSize createAdaptiveAdSize(@NotNull Context context) {
            context.getClass();
            return createAdaptiveAdSize$default(this, context, null, 2, null);
        }
    }

    @Nullable
    public static final LevelPlayAdSize createAdaptiveAdSize(@NotNull Context context, @Nullable Integer num) {
        return Companion.createAdaptiveAdSize(context, num);
    }

    public LevelPlayAdSize(int i2, int i3, @Nullable String str, boolean z, @Nullable LevelPlayAdSize levelPlayAdSize) {
        this.a = i2;
        this.b = i3;
        this.c = str;
        this.d = z;
        this.e = levelPlayAdSize;
    }
}
