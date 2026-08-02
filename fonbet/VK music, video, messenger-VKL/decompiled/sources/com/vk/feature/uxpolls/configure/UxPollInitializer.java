package com.vk.feature.uxpolls.configure;

import android.content.Context;
import com.vk.feature.uxpolls.configure.UxPollInitializer;
import io.reactivex.rxjava3.disposables.c;
import java.util.Collections;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.asu0;
import xsna.ayi0;
import xsna.b25;
import xsna.e43;
import xsna.iqa;
import xsna.jqa;
import xsna.mui0;
import xsna.myc0;
import xsna.wxi0;
import xsna.zrp;

/* compiled from: UxPollInitializer.kt */
/* loaded from: classes.dex */
public final class UxPollInitializer {
    public static final List<String> g = e43.l("feed_visit", "feed_action");
    public static final List<String> h = e43.l("sa_clips_view", "sa_clips_action", "sa_clips_download");
    public static final List<String> i = e43.l("clips_view", "clips_action", "clips_download");
    public static final List<String> j = e43.l("clips_create", "clips_create_audio_attachment");
    public static final List<String> k = e43.l("sa_clips_create", "sa_clips_create_audio_attachment");
    public static final List<String> l = Collections.singletonList("saa_video_second_view");
    public final Context a;
    public final b25 b;
    public final AppType c;
    public final List<String> d;
    public final myc0 e;
    public c f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UxPollInitializer.kt */
    public static final class AppType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AppType[] $VALUES;
        public static final AppType CLIPS;
        public static final AppType IM;
        public static final AppType VIDEO;
        public static final AppType VK;

        static {
            AppType appType = new AppType("VK", 0);
            VK = appType;
            AppType appType2 = new AppType("IM", 1);
            IM = appType2;
            AppType appType3 = new AppType("CLIPS", 2);
            CLIPS = appType3;
            AppType appType4 = new AppType(SignalingProtocol.MEDIA_OPTION_VIDEO, 3);
            VIDEO = appType4;
            AppType[] appTypeArr = {appType, appType2, appType3, appType4};
            $VALUES = appTypeArr;
            $ENTRIES = new asp(appTypeArr);
        }

        public AppType() {
            throw null;
        }

        public static AppType valueOf(String str) {
            return (AppType) Enum.valueOf(AppType.class, str);
        }

        public static AppType[] values() {
            return (AppType[]) $VALUES.clone();
        }
    }

    /* compiled from: UxPollInitializer.kt */
    /* loaded from: classes18.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AppType.values().length];
            try {
                iArr[AppType.VK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppType.IM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AppType.CLIPS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AppType.VIDEO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public UxPollInitializer(Context context, b25 b25Var, AppType appType, ListBuilder listBuilder, myc0 myc0Var, mui0 mui0Var) {
        this.a = context;
        this.b = b25Var;
        this.c = appType;
        this.d = listBuilder;
        this.e = myc0Var;
        mui0Var.f(new ayi0() { // from class: xsna.h4r0
            @Override // xsna.ayi0
            public final void a(uxi0 uxi0Var) {
                wxi0 a2 = new vxi0(uxi0Var).a();
                if ((a2 instanceof wxi0.a) || (a2 instanceof wxi0.d)) {
                    UxPollInitializer.this.a();
                }
            }
        });
    }

    public final void a() {
        this.f = this.b.m(true).a0(asu0.a.c()).subscribe(new jqa(new iqa(this, 2), 1));
    }
}
