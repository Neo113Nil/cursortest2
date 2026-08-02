package com.vk.superapp.dating.js.bridge.api.events;

import com.mbridge.msdk.MBridgeConstans;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: ImageShare.kt */
/* loaded from: classes6.dex */
public final class ImageShare$Parameters implements ad6 {

    /* renamed from: app, reason: collision with root package name */
    @pmi0(MBridgeConstans.DYNAMIC_VIEW_WX_APP)
    private final App f101app;

    @pmi0("image")
    private final String image;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ImageShare.kt */
    public static final class App {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ App[] $VALUES;

        @pmi0("instagram")
        public static final App INSTAGRAM;

        @pmi0("telegram")
        public static final App TELEGRAM;

        @pmi0("whatsapp")
        public static final App WHATSAPP;

        static {
            App app2 = new App("TELEGRAM", 0);
            TELEGRAM = app2;
            App app3 = new App("WHATSAPP", 1);
            WHATSAPP = app3;
            App app4 = new App("INSTAGRAM", 2);
            INSTAGRAM = app4;
            App[] appArr = {app2, app3, app4};
            $VALUES = appArr;
            $ENTRIES = new asp(appArr);
        }

        private App(String str, int i) {
        }

        public static App valueOf(String str) {
            return (App) Enum.valueOf(App.class, str);
        }

        public static App[] values() {
            return (App[]) $VALUES.clone();
        }
    }

    public ImageShare$Parameters(String str, App app2, String str2) {
        this.image = str;
        this.f101app = app2;
        this.requestId = str2;
    }

    public static final ImageShare$Parameters a(ImageShare$Parameters imageShare$Parameters) {
        return imageShare$Parameters.requestId == null ? new ImageShare$Parameters(imageShare$Parameters.image, imageShare$Parameters.f101app, "default_request_id") : imageShare$Parameters;
    }

    public static final void b(ImageShare$Parameters imageShare$Parameters) {
        if (imageShare$Parameters.image == null) {
            throw new IllegalArgumentException("Value of non-nullable member image cannot be\n                        null");
        }
    }

    public final App c() {
        return this.f101app;
    }

    public final String d() {
        return this.image;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageShare$Parameters)) {
            return false;
        }
        ImageShare$Parameters imageShare$Parameters = (ImageShare$Parameters) obj;
        return epx.f(this.image, imageShare$Parameters.image) && this.f101app == imageShare$Parameters.f101app && epx.f(this.requestId, imageShare$Parameters.requestId);
    }

    public final int hashCode() {
        int hashCode = this.image.hashCode() * 31;
        App app2 = this.f101app;
        int hashCode2 = (hashCode + (app2 == null ? 0 : app2.hashCode())) * 31;
        String str = this.requestId;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(image=");
        sb.append(this.image);
        sb.append(", app=");
        sb.append(this.f101app);
        sb.append(", requestId=");
        return ho8.a(sb, this.requestId, ')');
    }

    public /* synthetic */ ImageShare$Parameters(String str, App app2, String str2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : app2, str2);
    }
}
