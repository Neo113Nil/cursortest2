package com.ironsource;

import com.ironsource.E0;
import com.ironsource.InterfaceC4093gb;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import defpackage.dhm;
import defpackage.ehm;
import defpackage.wem;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.hb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4111hb extends AbstractC4342ua implements Ub {

    @NotNull
    private final UUID d;

    @NotNull
    private final C4075fb e;
    private Rb f;

    @NotNull
    private String g;
    private C4077fd h;

    @Nullable
    private InterfaceC4146jb i;

    @Nullable
    private AdapterNativeAdData j;

    @Nullable
    private AdapterNativeAdViewBinder k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4111hb(@NotNull UUID uuid, @NotNull C4075fb c4075fb) {
        super(new C4243p0(IronSource.a.NATIVE_AD, E0.b.MEDIATION));
        uuid.getClass();
        c4075fb.getClass();
        this.d = uuid;
        this.e = c4075fb;
        this.g = "";
        a().a(new dhm(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C4111hb c4111hb) {
        c4111hb.getClass();
        IronLog.API.info(String.valueOf(c4111hb));
        try {
            Rb rb = c4111hb.f;
            if (rb == null) {
                Intrinsics.i("nativeAdController");
                throw null;
            }
            rb.n();
            c4111hb.i = null;
        } catch (Throwable th) {
            C4157k4.d().a(th);
            IronLog.API.error("destroyNativeAd()");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C4111hb c4111hb) {
        c4111hb.getClass();
        if (c4111hb.c()) {
            IronLog.INTERNAL.warning(C4243p0.a(c4111hb.a(), "Native ad load already called", (String) null, 2, (Object) null));
            return;
        }
        c4111hb.a(true);
        if (c4111hb.d()) {
            Rb rb = c4111hb.f;
            if (rb != null) {
                rb.o();
            } else {
                Intrinsics.i("nativeAdController");
                throw null;
            }
        }
    }

    @InterfaceC4307sb
    private final Rb e() {
        this.h = a().c(this.g);
        UUID uuid = this.d;
        String b = b();
        C4077fd c4077fd = this.h;
        if (c4077fd == null) {
            Intrinsics.i("placement");
            throw null;
        }
        C4004bc c4004bc = new C4004bc(uuid, b, c4077fd);
        a(c4004bc);
        return new Rb(this, a(), c4004bc);
    }

    @Override // com.ironsource.Ub
    public void a(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdInfo.getClass();
        IronLog.CALLBACK.info(String.valueOf(this));
        Ob ob = new Ob();
        Rb rb = this.f;
        if (rb == null) {
            Intrinsics.i("nativeAdController");
            throw null;
        }
        rb.a(ob);
        this.j = ob.a();
        this.k = ob.b();
        b(new ehm(this, levelPlayAdInfo, 0));
    }

    @Override // com.ironsource.AbstractC4342ua
    public boolean d() {
        this.f = e();
        return true;
    }

    public final void f() {
        a().a(new dhm(this, 2));
    }

    @Nullable
    public final String h() {
        AdapterNativeAdData adapterNativeAdData = this.j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getAdvertiser();
        }
        return null;
    }

    @Nullable
    public final String i() {
        AdapterNativeAdData adapterNativeAdData = this.j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getBody();
        }
        return null;
    }

    @Nullable
    public final String j() {
        AdapterNativeAdData adapterNativeAdData = this.j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getCallToAction();
        }
        return null;
    }

    @Nullable
    public final InterfaceC4093gb.a k() {
        NativeAdDataInterface.Image icon;
        AdapterNativeAdData adapterNativeAdData = this.j;
        if (adapterNativeAdData == null || (icon = adapterNativeAdData.getIcon()) == null) {
            return null;
        }
        return new InterfaceC4093gb.a(icon.getDrawable(), icon.getUri());
    }

    @Nullable
    public final String m() {
        AdapterNativeAdData adapterNativeAdData = this.j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getTitle();
        }
        return null;
    }

    public final void n() {
        a().a(new dhm(this, 0));
    }

    @Override // com.ironsource.Ub
    public void onNativeAdLoadFailed(@Nullable IronSourceError ironSourceError) {
        String uuid = this.d.toString();
        uuid.getClass();
        b(new wem(3, this, new LevelPlayAdError(ironSourceError, uuid, b())));
    }

    @NotNull
    public final UUID g() {
        return this.d;
    }

    @Nullable
    public final AdapterNativeAdViewBinder l() {
        return this.k;
    }

    public /* synthetic */ C4111hb(UUID uuid, C4075fb c4075fb, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C4303s7.a.a() : uuid, c4075fb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C4111hb c4111hb, LevelPlayAdInfo levelPlayAdInfo) {
        c4111hb.getClass();
        levelPlayAdInfo.getClass();
        InterfaceC4146jb interfaceC4146jb = c4111hb.i;
        if (interfaceC4146jb != null) {
            interfaceC4146jb.b(c4111hb.e, levelPlayAdInfo);
        }
    }

    @Override // com.ironsource.Ub
    public void b(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdInfo.getClass();
        b(new ehm(this, levelPlayAdInfo, 1));
    }

    public final void b(@NotNull String str) {
        str.getClass();
        a(new wem(1, this, str));
    }

    public final void a(@Nullable InterfaceC4146jb interfaceC4146jb) {
        a(new wem(2, this, interfaceC4146jb));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4111hb c4111hb, InterfaceC4146jb interfaceC4146jb) {
        c4111hb.getClass();
        c4111hb.i = interfaceC4146jb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4111hb c4111hb) {
        c4111hb.getClass();
        c4111hb.a().f().a(new C4206n(IronSource.a.NATIVE_AD, c4111hb.d, c4111hb.b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4111hb c4111hb, LevelPlayAdError levelPlayAdError) {
        c4111hb.getClass();
        levelPlayAdError.getClass();
        InterfaceC4146jb interfaceC4146jb = c4111hb.i;
        if (interfaceC4146jb != null) {
            interfaceC4146jb.a(c4111hb.e, levelPlayAdError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4111hb c4111hb, LevelPlayAdInfo levelPlayAdInfo) {
        c4111hb.getClass();
        levelPlayAdInfo.getClass();
        InterfaceC4146jb interfaceC4146jb = c4111hb.i;
        if (interfaceC4146jb != null) {
            interfaceC4146jb.c(c4111hb.e, levelPlayAdInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4111hb c4111hb, String str) {
        c4111hb.getClass();
        str.getClass();
        c4111hb.g = str;
    }
}
