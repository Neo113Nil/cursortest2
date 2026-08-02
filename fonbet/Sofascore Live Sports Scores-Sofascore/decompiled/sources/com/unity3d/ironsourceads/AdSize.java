package com.unity3d.ironsourceads;

import com.ironsource.mediationsdk.j;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class AdSize {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private final int a;
    private final int b;

    @NotNull
    private final String c;

    private AdSize(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    @NotNull
    public static final AdSize banner() {
        return Companion.banner();
    }

    @NotNull
    public static final AdSize large() {
        return Companion.large();
    }

    @NotNull
    public static final AdSize leaderboard() {
        return Companion.leaderboard();
    }

    @NotNull
    public static final AdSize mediumRectangle() {
        return Companion.mediumRectangle();
    }

    public final int getHeight() {
        return this.b;
    }

    @NotNull
    public final String getSizeDescription() {
        return this.c;
    }

    public final int getWidth() {
        return this.a;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AdSize banner() {
            return new AdSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50, j.a, null);
        }

        @NotNull
        public final AdSize large() {
            return new AdSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 90, j.b, null);
        }

        @NotNull
        public final AdSize leaderboard() {
            return new AdSize(728, 90, j.d, null);
        }

        @NotNull
        public final AdSize mediumRectangle() {
            return new AdSize(300, 250, j.g, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ AdSize(int i, int i2, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, str);
    }
}
