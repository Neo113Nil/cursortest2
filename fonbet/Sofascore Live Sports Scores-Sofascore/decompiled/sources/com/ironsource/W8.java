package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.impression.LevelPlayImpressionData;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import defpackage.dmi;
import defpackage.ecg;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class W8 {

    @NotNull
    private static final a c = new a(null);

    @Deprecated
    @NotNull
    public static final String d = "pub";

    @Deprecated
    @NotNull
    public static final String e = "sdk";

    @NotNull
    private final C4243p0 a;

    @Nullable
    private volatile LevelPlayImpressionDataListener b;

    public W8(@NotNull C4243p0 c4243p0) {
        c4243p0.getClass();
        this.a = c4243p0;
    }

    public final void a(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdInfo.getClass();
        if (this.b == null || levelPlayAdInfo.getAuctionId().length() == 0) {
            return;
        }
        LevelPlayImpressionData levelPlayImpressionData = new LevelPlayImpressionData(levelPlayAdInfo.impressionData$mediationsdk_release());
        IronLog ironLog = IronLog.CALLBACK;
        C4243p0 c4243p0 = this.a;
        LevelPlayImpressionDataListener levelPlayImpressionDataListener = this.b;
        ironLog.verbose(C4243p0.a(c4243p0, dmi.q("onImpressionSuccess ", levelPlayImpressionDataListener != null ? levelPlayImpressionDataListener.getClass().getSimpleName() : null), (String) null, 2, (Object) null));
        this.a.b(new ecg(27, this, levelPlayImpressionData));
        this.a.f().h().a(levelPlayImpressionData);
    }

    public final void b() {
        a((LevelPlayImpressionDataListener) null, "sdk");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final void a(@Nullable LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        a(levelPlayImpressionDataListener, d);
    }

    private final void a(LevelPlayImpressionDataListener levelPlayImpressionDataListener, String str) {
        boolean z = this.b != null;
        this.b = levelPlayImpressionDataListener;
        C4223ng h = this.a.f().h();
        if (levelPlayImpressionDataListener == null) {
            h.a(str, z);
        } else {
            h.a(z);
        }
    }

    @Nullable
    public final LevelPlayImpressionDataListener a() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(W8 w8, LevelPlayImpressionData levelPlayImpressionData) {
        w8.getClass();
        levelPlayImpressionData.getClass();
        LevelPlayImpressionDataListener levelPlayImpressionDataListener = w8.b;
        if (levelPlayImpressionDataListener != null) {
            levelPlayImpressionDataListener.onImpressionSuccess(levelPlayImpressionData);
        }
    }
}
