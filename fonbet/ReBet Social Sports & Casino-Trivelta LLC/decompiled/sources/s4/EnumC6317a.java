package s4;

import com.facebook.react.uimanager.ViewProps;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: s4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC6317a {
    private static final /* synthetic */ EnumC6317a[] $VALUES;

    /* renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f64726D;

    /* renamed from: b, reason: collision with root package name */
    public static final C0897a f64727b;

    /* renamed from: a, reason: collision with root package name */
    public final String f64752a;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC6317a f64728c = new EnumC6317a("EVENT_LOAD_START", 0, "onVideoLoadStart");

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC6317a f64729d = new EnumC6317a("EVENT_LOAD", 1, "onVideoLoad");

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC6317a f64730e = new EnumC6317a("EVENT_ERROR", 2, "onVideoError");

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC6317a f64731f = new EnumC6317a("EVENT_PROGRESS", 3, "onVideoProgress");

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC6317a f64732g = new EnumC6317a("EVENT_BANDWIDTH", 4, "onVideoBandwidthUpdate");

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC6317a f64733h = new EnumC6317a("EVENT_CONTROLS_VISIBILITY_CHANGE", 5, "onControlsVisibilityChange");

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC6317a f64734i = new EnumC6317a("EVENT_SEEK", 6, "onVideoSeek");

    /* renamed from: j, reason: collision with root package name */
    public static final EnumC6317a f64735j = new EnumC6317a("EVENT_END", 7, "onVideoEnd");

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC6317a f64736k = new EnumC6317a("EVENT_FULLSCREEN_WILL_PRESENT", 8, "onVideoFullscreenPlayerWillPresent");

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC6317a f64737l = new EnumC6317a("EVENT_FULLSCREEN_DID_PRESENT", 9, "onVideoFullscreenPlayerDidPresent");

    /* renamed from: m, reason: collision with root package name */
    public static final EnumC6317a f64738m = new EnumC6317a("EVENT_FULLSCREEN_WILL_DISMISS", 10, "onVideoFullscreenPlayerWillDismiss");

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC6317a f64739n = new EnumC6317a("EVENT_FULLSCREEN_DID_DISMISS", 11, "onVideoFullscreenPlayerDidDismiss");

    /* renamed from: o, reason: collision with root package name */
    public static final EnumC6317a f64740o = new EnumC6317a("EVENT_READY", 12, "onReadyForDisplay");

    /* renamed from: p, reason: collision with root package name */
    public static final EnumC6317a f64741p = new EnumC6317a("EVENT_BUFFER", 13, "onVideoBuffer");

    /* renamed from: q, reason: collision with root package name */
    public static final EnumC6317a f64742q = new EnumC6317a("EVENT_PLAYBACK_STATE_CHANGED", 14, "onVideoPlaybackStateChanged");

    /* renamed from: r, reason: collision with root package name */
    public static final EnumC6317a f64743r = new EnumC6317a("EVENT_IDLE", 15, "onVideoIdle");

    /* renamed from: s, reason: collision with root package name */
    public static final EnumC6317a f64744s = new EnumC6317a("EVENT_TIMED_METADATA", 16, "onTimedMetadata");

    /* renamed from: t, reason: collision with root package name */
    public static final EnumC6317a f64745t = new EnumC6317a("EVENT_AUDIO_BECOMING_NOISY", 17, "onVideoAudioBecomingNoisy");

    /* renamed from: u, reason: collision with root package name */
    public static final EnumC6317a f64746u = new EnumC6317a("EVENT_AUDIO_FOCUS_CHANGE", 18, "onAudioFocusChanged");

    /* renamed from: v, reason: collision with root package name */
    public static final EnumC6317a f64747v = new EnumC6317a("EVENT_PLAYBACK_RATE_CHANGE", 19, "onPlaybackRateChange");

    /* renamed from: w, reason: collision with root package name */
    public static final EnumC6317a f64748w = new EnumC6317a("EVENT_VOLUME_CHANGE", 20, "onVolumeChange");

    /* renamed from: x, reason: collision with root package name */
    public static final EnumC6317a f64749x = new EnumC6317a("EVENT_AUDIO_TRACKS", 21, "onAudioTracks");

    /* renamed from: y, reason: collision with root package name */
    public static final EnumC6317a f64750y = new EnumC6317a("EVENT_TEXT_TRACKS", 22, "onTextTracks");

    /* renamed from: z, reason: collision with root package name */
    public static final EnumC6317a f64751z = new EnumC6317a("EVENT_TEXT_TRACK_DATA_CHANGED", 23, "onTextTrackDataChanged");

    /* renamed from: A, reason: collision with root package name */
    public static final EnumC6317a f64723A = new EnumC6317a("EVENT_VIDEO_TRACKS", 24, "onVideoTracks");

    /* renamed from: B, reason: collision with root package name */
    public static final EnumC6317a f64724B = new EnumC6317a("EVENT_ON_RECEIVE_AD_EVENT", 25, "onReceiveAdEvent");

    /* renamed from: C, reason: collision with root package name */
    public static final EnumC6317a f64725C = new EnumC6317a("EVENT_PICTURE_IN_PICTURE_STATUS_CHANGED", 26, "onPictureInPictureStatusChanged");

    /* renamed from: s4.a$a, reason: collision with other inner class name */
    public static final class C0897a {
        public /* synthetic */ C0897a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Map a() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (EnumC6317a enumC6317a : ArraysKt.toList(EnumC6317a.values())) {
                linkedHashMap.put(ViewProps.TOP + StringsKt.removePrefix(enumC6317a.b(), (CharSequence) ViewProps.ON), MapsKt.hashMapOf(TuplesKt.to("registrationName", enumC6317a.b())));
            }
            return linkedHashMap;
        }

        public C0897a() {
        }
    }

    static {
        EnumC6317a[] a10 = a();
        $VALUES = a10;
        f64726D = EnumEntriesKt.enumEntries(a10);
        f64727b = new C0897a(null);
    }

    public EnumC6317a(String str, int i10, String str2) {
        this.f64752a = str2;
    }

    public static final /* synthetic */ EnumC6317a[] a() {
        return new EnumC6317a[]{f64728c, f64729d, f64730e, f64731f, f64732g, f64733h, f64734i, f64735j, f64736k, f64737l, f64738m, f64739n, f64740o, f64741p, f64742q, f64743r, f64744s, f64745t, f64746u, f64747v, f64748w, f64749x, f64750y, f64751z, f64723A, f64724B, f64725C};
    }

    public static EnumC6317a valueOf(String str) {
        return (EnumC6317a) Enum.valueOf(EnumC6317a.class, str);
    }

    public static EnumC6317a[] values() {
        return (EnumC6317a[]) $VALUES.clone();
    }

    public final String b() {
        return this.f64752a;
    }
}
