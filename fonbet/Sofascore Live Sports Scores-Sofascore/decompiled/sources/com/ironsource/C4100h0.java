package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlay;
import defpackage.zzl;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.h0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4100h0 {

    @NotNull
    private final IronSource.a a;

    @NotNull
    private final UUID b;

    @NotNull
    private final String c;

    @Nullable
    private C4077fd d;

    @Nullable
    private final Rf e;

    @Nullable
    private final Double f;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.h0$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[IronSource.a.values().length];
            try {
                iArr[IronSource.a.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.a.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSource.a.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IronSource.a.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    public C4100h0(@NotNull IronSource.a aVar, @NotNull UUID uuid, @NotNull String str, @Nullable C4077fd c4077fd, @Nullable Rf rf, @Nullable Double d) {
        aVar.getClass();
        uuid.getClass();
        str.getClass();
        this.a = aVar;
        this.b = uuid;
        this.c = str;
        this.d = c4077fd;
        this.e = rf;
        this.f = d;
    }

    @NotNull
    public final IronSource.a a() {
        return this.a;
    }

    @NotNull
    public final UUID b() {
        return this.b;
    }

    @NotNull
    public final String c() {
        return this.c;
    }

    @Nullable
    public final Double d() {
        return this.f;
    }

    @NotNull
    public final LevelPlay.AdFormat e() {
        int i = a.a[this.a.ordinal()];
        if (i == 1) {
            return LevelPlay.AdFormat.REWARDED;
        }
        if (i == 2) {
            return LevelPlay.AdFormat.INTERSTITIAL;
        }
        if (i == 3) {
            return LevelPlay.AdFormat.BANNER;
        }
        if (i == 4) {
            return LevelPlay.AdFormat.NATIVE_AD;
        }
        zzl.b();
        return null;
    }

    @Nullable
    public final C4077fd f() {
        return this.d;
    }

    @Nullable
    public final Rf g() {
        return this.e;
    }

    public final boolean h() {
        return kotlin.collections.b.j(IronSource.a.REWARDED_VIDEO, IronSource.a.INTERSTITIAL).contains(this.a);
    }

    public final void a(@Nullable C4077fd c4077fd) {
        this.d = c4077fd;
    }

    public /* synthetic */ C4100h0(IronSource.a aVar, UUID uuid, String str, C4077fd c4077fd, Rf rf, Double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, uuid, str, (i & 8) != 0 ? null : c4077fd, (i & 16) != 0 ? null : rf, (i & 32) != 0 ? null : d);
    }
}
