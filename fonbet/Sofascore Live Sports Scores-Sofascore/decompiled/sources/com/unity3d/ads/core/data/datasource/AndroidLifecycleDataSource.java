package com.unity3d.ads.core.data.datasource;

import defpackage.d6b;
import defpackage.ddi;
import defpackage.f1d;
import defpackage.fdi;
import defpackage.gdi;
import defpackage.p6b;
import defpackage.s9a;
import defpackage.u6b;
import defpackage.un0;
import defpackage.xw3;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidLifecycleDataSource;", "Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;", "Lp6b;", "<init>", "()V", "", "registerAppLifecycle", "", "appIsForeground", "()Z", "Lu6b;", "source", "Ld6b;", "event", "onStateChanged", "(Lu6b;Ld6b;)V", "Lf1d;", "_appActive", "Lf1d;", "Lddi;", "appActive", "Lddi;", "getAppActive", "()Lddi;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidLifecycleDataSource implements LifecycleDataSource, p6b {

    @NotNull
    private final f1d _appActive;

    @NotNull
    private final ddi appActive;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[d6b.values().length];
            try {
                iArr[d6b.ON_STOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d6b.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AndroidLifecycleDataSource() {
        fdi a = gdi.a(Boolean.TRUE);
        this._appActive = a;
        this.appActive = un0.u(a);
        registerAppLifecycle();
    }

    private final void registerAppLifecycle() {
        xw3.L(s9a.k(), null, null, new AndroidLifecycleDataSource$registerAppLifecycle$1(this, null), 3);
    }

    @Override // com.unity3d.ads.core.data.datasource.LifecycleDataSource
    public boolean appIsForeground() {
        return ((Boolean) getAppActive().getValue()).booleanValue();
    }

    @Override // com.unity3d.ads.core.data.datasource.LifecycleDataSource
    @NotNull
    public ddi getAppActive() {
        return this.appActive;
    }

    @Override // defpackage.p6b
    public void onStateChanged(@NotNull u6b source, @NotNull d6b event) {
        source.getClass();
        event.getClass();
        f1d f1dVar = this._appActive;
        int i = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        boolean z = true;
        if (i == 1) {
            z = false;
        } else if (i != 2) {
            z = ((Boolean) getAppActive().getValue()).booleanValue();
        }
        Boolean valueOf = Boolean.valueOf(z);
        fdi fdiVar = (fdi) f1dVar;
        fdiVar.getClass();
        fdiVar.m(null, valueOf);
    }
}
