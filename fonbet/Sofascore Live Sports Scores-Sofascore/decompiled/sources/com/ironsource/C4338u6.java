package com.ironsource;

import android.app.Activity;
import com.ironsource.C4231o6;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@InterfaceC4307sb
/* renamed from: com.ironsource.u6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4338u6 implements InterfaceC4320t6, C4231o6.b, C4231o6.a {

    @NotNull
    public static final a f = new a(null);

    @NotNull
    public static final String g = "Fullscreen ProgressiveOnLoaded Strategy";

    @NotNull
    private final C4243p0 a;

    @NotNull
    private final InterfaceC4249p6 b;

    @NotNull
    private final InterfaceC4284r6 c;

    @NotNull
    private final InterfaceC4302s6 d;

    @NotNull
    private InterfaceC4428z6 e;

    public C4338u6(@NotNull C4243p0 c4243p0, @NotNull InterfaceC4249p6 interfaceC4249p6, @NotNull InterfaceC4284r6 interfaceC4284r6, @NotNull InterfaceC4302s6 interfaceC4302s6) {
        c4243p0.getClass();
        interfaceC4249p6.getClass();
        interfaceC4284r6.getClass();
        interfaceC4302s6.getClass();
        this.a = c4243p0;
        this.b = interfaceC4249p6;
        this.c = interfaceC4284r6;
        this.d = interfaceC4302s6;
        this.e = new C4356v6(this);
    }

    public final void a(@NotNull String str) {
        str.getClass();
        this.a.f().h().f("Fullscreen ProgressiveOnLoaded Strategy - " + str);
    }

    @Override // com.ironsource.C4231o6.b
    public void b(@NotNull C4231o6 c4231o6, @NotNull LevelPlayAdInfo levelPlayAdInfo) {
        c4231o6.getClass();
        levelPlayAdInfo.getClass();
        this.e.b(c4231o6, levelPlayAdInfo);
    }

    @Override // com.ironsource.C4231o6.b
    public void c(@NotNull C4231o6 c4231o6, @NotNull LevelPlayAdInfo levelPlayAdInfo) {
        c4231o6.getClass();
        levelPlayAdInfo.getClass();
        this.e.c(c4231o6, levelPlayAdInfo);
    }

    @NotNull
    public final InterfaceC4302s6 d() {
        return this.d;
    }

    @Override // com.ironsource.InterfaceC4320t6
    public void loadAd() {
        this.e.loadAd();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.u6$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @NotNull
    public final InterfaceC4249p6 b() {
        return this.b;
    }

    @NotNull
    public final InterfaceC4284r6 c() {
        return this.c;
    }

    @Override // com.ironsource.C4231o6.b
    public void b(@NotNull C4231o6 c4231o6, @Nullable IronSourceError ironSourceError) {
        c4231o6.getClass();
        this.e.b(c4231o6, ironSourceError);
    }

    public final void a(@NotNull InterfaceC4428z6 interfaceC4428z6) {
        interfaceC4428z6.getClass();
        this.e = interfaceC4428z6;
    }

    @Override // com.ironsource.InterfaceC4320t6
    public void a(@NotNull Activity activity) {
        activity.getClass();
        this.e.a(activity);
    }

    @Override // com.ironsource.C4231o6.b
    public void a(@NotNull C4231o6 c4231o6) {
        c4231o6.getClass();
        this.e.a(c4231o6);
    }

    @Override // com.ironsource.C4231o6.a
    public void a(@NotNull C4231o6 c4231o6, @NotNull LevelPlayAdInfo levelPlayAdInfo) {
        c4231o6.getClass();
        levelPlayAdInfo.getClass();
        this.e.a(c4231o6, levelPlayAdInfo);
    }

    @Override // com.ironsource.C4231o6.a
    public void a(@NotNull C4231o6 c4231o6, @Nullable IronSourceError ironSourceError) {
        c4231o6.getClass();
        this.e.a(c4231o6, ironSourceError);
    }

    @NotNull
    public final C4243p0 a() {
        return this.a;
    }
}
