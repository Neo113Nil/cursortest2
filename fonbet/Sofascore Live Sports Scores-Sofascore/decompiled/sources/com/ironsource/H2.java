package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class H2 extends C4100h0 {

    @NotNull
    private final LevelPlayAdSize g;

    @Nullable
    private final Boolean h;

    @Nullable
    private final Long i;

    public /* synthetic */ H2(UUID uuid, String str, C4077fd c4077fd, LevelPlayAdSize levelPlayAdSize, Boolean bool, Long l, Rf rf, Double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, str, (i & 4) != 0 ? null : c4077fd, (i & 8) != 0 ? LevelPlayAdSize.BANNER : levelPlayAdSize, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : l, (i & 64) != 0 ? null : rf, (i & 128) != 0 ? null : d);
    }

    @NotNull
    public final LevelPlayAdSize i() {
        return this.g;
    }

    @Nullable
    public final Boolean j() {
        return this.h;
    }

    @Nullable
    public final Long k() {
        return this.i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H2(@NotNull UUID uuid, @NotNull String str, @Nullable C4077fd c4077fd, @NotNull LevelPlayAdSize levelPlayAdSize, @Nullable Boolean bool, @Nullable Long l, @Nullable Rf rf, @Nullable Double d) {
        super(IronSource.a.BANNER, uuid, str, c4077fd, rf, d);
        uuid.getClass();
        str.getClass();
        levelPlayAdSize.getClass();
        this.g = levelPlayAdSize;
        this.h = bool;
        this.i = l;
    }

    public H2() {
        this(C4303s7.a.a(), "", null, null, null, null, null, null, 252, null);
    }
}
