package com.ironsource;

import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.u0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4332u0 {

    @NotNull
    private final AbstractC4261q0 a;

    @Nullable
    private final LevelPlayAdInfo b;

    public C4332u0(@NotNull AbstractC4261q0 abstractC4261q0, @Nullable LevelPlayAdInfo levelPlayAdInfo) {
        abstractC4261q0.getClass();
        this.a = abstractC4261q0;
        this.b = levelPlayAdInfo;
    }

    public static /* synthetic */ C4332u0 a(C4332u0 c4332u0, AbstractC4261q0 abstractC4261q0, LevelPlayAdInfo levelPlayAdInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            abstractC4261q0 = c4332u0.a;
        }
        if ((i & 2) != 0) {
            levelPlayAdInfo = c4332u0.b;
        }
        return c4332u0.a(abstractC4261q0, levelPlayAdInfo);
    }

    @Nullable
    public final LevelPlayAdInfo b() {
        return this.b;
    }

    @Nullable
    public final LevelPlayAdInfo c() {
        return this.b;
    }

    @NotNull
    public final AbstractC4261q0 d() {
        return this.a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4332u0)) {
            return false;
        }
        C4332u0 c4332u0 = (C4332u0) obj;
        return Intrinsics.c(this.a, c4332u0.a) && Intrinsics.c(this.b, c4332u0.b);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        LevelPlayAdInfo levelPlayAdInfo = this.b;
        return hashCode + (levelPlayAdInfo == null ? 0 : levelPlayAdInfo.hashCode());
    }

    @NotNull
    public String toString() {
        return "AdUnitCallback(adUnit=" + this.a + ", adInfo=" + this.b + ")";
    }

    public /* synthetic */ C4332u0(AbstractC4261q0 abstractC4261q0, LevelPlayAdInfo levelPlayAdInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC4261q0, (i & 2) != 0 ? null : levelPlayAdInfo);
    }

    @NotNull
    public final C4332u0 a(@NotNull AbstractC4261q0 abstractC4261q0, @Nullable LevelPlayAdInfo levelPlayAdInfo) {
        abstractC4261q0.getClass();
        return new C4332u0(abstractC4261q0, levelPlayAdInfo);
    }

    @NotNull
    public final AbstractC4261q0 a() {
        return this.a;
    }
}
