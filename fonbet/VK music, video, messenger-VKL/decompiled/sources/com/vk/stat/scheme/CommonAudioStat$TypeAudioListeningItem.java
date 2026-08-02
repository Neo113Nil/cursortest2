package com.vk.stat.scheme;

import androidx.core.app.NotificationCompat;
import com.google.gson.Gson;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import io.requery.android.database.sqlite.SQLiteDatabase;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.bh10;
import xsna.dq;
import xsna.eok;
import xsna.epx;
import xsna.fai;
import xsna.hay;
import xsna.lhg;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;
import xsna.tay;
import xsna.tru;
import xsna.u9y;
import xsna.uay;
import xsna.urd0;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonAudioStat.kt */
/* loaded from: classes11.dex */
public final class CommonAudioStat$TypeAudioListeningItem implements SchemeStat$TypeAction.b {
    public final transient String a;

    @pmi0("app_state")
    private final AppState appState;

    @pmi0("autorecoms")
    private final Autorecoms autorecoms;
    public final transient String b;
    public final transient String c;

    @pmi0("client_server_time")
    private final long clientServerTime;

    @pmi0("client_time")
    private final long clientTime;

    @pmi0("crossfade")
    private final boolean crossfade;

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    private final CommonAudioStat$AudioListeningEvent event;

    @pmi0("link")
    private final FilteredString filteredLink;

    @pmi0("player_init_id")
    private final FilteredString filteredPlayerInitId;

    @pmi0("track_code")
    private final FilteredString filteredTrackCode;

    @pmi0(AdRevenueConstants.LAYER_KEY)
    private final Layer layer;

    @pmi0("listening_type")
    private final ListeningType listeningType;

    @pmi0("loudness_normalization")
    private final boolean loudnessNormalization;

    @pmi0("nav_info")
    private final CommonAudioStat$AudioListeningNavInfo navInfo;

    @pmi0("repeat_mode")
    private final RepeatMode repeatMode;

    @pmi0("shuffle")
    private final Shuffle shuffle;

    @pmi0("speed")
    private final int speed;

    @pmi0("streaming_type")
    private final StreamingType streamingType;

    @pmi0("streaming_url_type")
    private final StreamingUrlType streamingUrlType;

    @pmi0("timeline")
    private final int timeline;

    @pmi0("timeline_from")
    private final int timelineFrom;

    @pmi0("type_audio_adv_listening_item")
    private final CommonAudioStat$TypeAudioAdvListeningItem typeAudioAdvListeningItem;

    @pmi0("type_audio_audio_listening_item")
    private final CommonAudioStat$TypeAudioAudioListeningItem typeAudioAudioListeningItem;

    @pmi0("type_audio_book_listening_item")
    private final CommonAudioStat$TypeAudioBookListeningItem typeAudioBookListeningItem;

    @pmi0("type_audio_podcast_listening_item")
    private final CommonAudioStat$TypeAudioPodcastListeningItem typeAudioPodcastListeningItem;

    @pmi0("type_audio_radio_listening_item")
    private final CommonAudioStat$TypeAudioRadioListeningItem typeAudioRadioListeningItem;

    @pmi0("url_domain")
    private final String urlDomain;

    @pmi0("volume")
    private final int volume;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonAudioStat.kt */
    public static final class AppState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AppState[] $VALUES;
        public static final AppState ACTIVE_STATE;
        public static final AppState BACKGROUND_STATE;
        public static final AppState UNKNOWN_STATE;
        private final String value;

        /* compiled from: CommonAudioStat.kt */
        public static final class Serializer implements uay<AppState> {
            @Override // xsna.uay
            public final b9y b(Object obj, tay tayVar) {
                return new hay(((AppState) obj).value);
            }
        }

        static {
            AppState appState = new AppState("UNKNOWN_STATE", 0, "unknown");
            UNKNOWN_STATE = appState;
            AppState appState2 = new AppState("ACTIVE_STATE", 1, SignalingProtocol.KEY_ACTIVE);
            ACTIVE_STATE = appState2;
            AppState appState3 = new AppState("BACKGROUND_STATE", 2, "inactive");
            BACKGROUND_STATE = appState3;
            AppState[] appStateArr = {appState, appState2, appState3};
            $VALUES = appStateArr;
            $ENTRIES = new asp(appStateArr);
        }

        public AppState(String str, int i, String str2) {
            this.value = str2;
        }

        public static AppState valueOf(String str) {
            return (AppState) Enum.valueOf(AppState.class, str);
        }

        public static AppState[] values() {
            return (AppState[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonAudioStat.kt */
    /* loaded from: classes5.dex */
    public static final class Autorecoms {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Autorecoms[] $VALUES;

        @pmi0("off")
        public static final Autorecoms OFF;

        @pmi0("on")
        public static final Autorecoms ON;

        static {
            Autorecoms autorecoms = new Autorecoms("ON", 0);
            ON = autorecoms;
            Autorecoms autorecoms2 = new Autorecoms("OFF", 1);
            OFF = autorecoms2;
            Autorecoms[] autorecomsArr = {autorecoms, autorecoms2};
            $VALUES = autorecomsArr;
            $ENTRIES = new asp(autorecomsArr);
        }

        private Autorecoms(String str, int i) {
        }

        public static Autorecoms valueOf(String str) {
            return (Autorecoms) Enum.valueOf(Autorecoms.class, str);
        }

        public static Autorecoms[] values() {
            return (Autorecoms[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonAudioStat.kt */
    /* loaded from: classes5.dex */
    public static final class Layer {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Layer[] $VALUES;

        @pmi0(AdRevenueConstants.LAYER_KEY)
        public static final Layer LAYER;

        @pmi0("not")
        public static final Layer NOT;

        static {
            Layer layer = new Layer("NOT", 0);
            NOT = layer;
            Layer layer2 = new Layer("LAYER", 1);
            LAYER = layer2;
            Layer[] layerArr = {layer, layer2};
            $VALUES = layerArr;
            $ENTRIES = new asp(layerArr);
        }

        private Layer(String str, int i) {
        }

        public static Layer valueOf(String str) {
            return (Layer) Enum.valueOf(Layer.class, str);
        }

        public static Layer[] values() {
            return (Layer[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonAudioStat.kt */
    /* loaded from: classes5.dex */
    public static final class ListeningType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ListeningType[] $VALUES;

        @pmi0("type_audio_adv_listening_item")
        public static final ListeningType TYPE_AUDIO_ADV_LISTENING_ITEM;

        @pmi0("type_audio_audio_listening_item")
        public static final ListeningType TYPE_AUDIO_AUDIO_LISTENING_ITEM;

        @pmi0("type_audio_book_listening_item")
        public static final ListeningType TYPE_AUDIO_BOOK_LISTENING_ITEM;

        @pmi0("type_audio_podcast_listening_item")
        public static final ListeningType TYPE_AUDIO_PODCAST_LISTENING_ITEM;

        @pmi0("type_audio_radio_listening_item")
        public static final ListeningType TYPE_AUDIO_RADIO_LISTENING_ITEM;

        static {
            ListeningType listeningType = new ListeningType("TYPE_AUDIO_AUDIO_LISTENING_ITEM", 0);
            TYPE_AUDIO_AUDIO_LISTENING_ITEM = listeningType;
            ListeningType listeningType2 = new ListeningType("TYPE_AUDIO_PODCAST_LISTENING_ITEM", 1);
            TYPE_AUDIO_PODCAST_LISTENING_ITEM = listeningType2;
            ListeningType listeningType3 = new ListeningType("TYPE_AUDIO_BOOK_LISTENING_ITEM", 2);
            TYPE_AUDIO_BOOK_LISTENING_ITEM = listeningType3;
            ListeningType listeningType4 = new ListeningType("TYPE_AUDIO_ADV_LISTENING_ITEM", 3);
            TYPE_AUDIO_ADV_LISTENING_ITEM = listeningType4;
            ListeningType listeningType5 = new ListeningType("TYPE_AUDIO_RADIO_LISTENING_ITEM", 4);
            TYPE_AUDIO_RADIO_LISTENING_ITEM = listeningType5;
            ListeningType[] listeningTypeArr = {listeningType, listeningType2, listeningType3, listeningType4, listeningType5};
            $VALUES = listeningTypeArr;
            $ENTRIES = new asp(listeningTypeArr);
        }

        private ListeningType(String str, int i) {
        }

        public static ListeningType valueOf(String str) {
            return (ListeningType) Enum.valueOf(ListeningType.class, str);
        }

        public static ListeningType[] values() {
            return (ListeningType[]) $VALUES.clone();
        }
    }

    /* compiled from: CommonAudioStat.kt */
    public static final class PersistenceSerializer implements uay<CommonAudioStat$TypeAudioListeningItem>, a9y<CommonAudioStat$TypeAudioListeningItem> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            String s = fai.s(x9yVar, "track_code");
            long q = fai.q(x9yVar, "client_time");
            long q2 = fai.q(x9yVar, "client_server_time");
            int p = fai.p(x9yVar, "timeline");
            int p2 = fai.p(x9yVar, "timeline_from");
            String s2 = fai.s(x9yVar, "player_init_id");
            int p3 = fai.p(x9yVar, "volume");
            int p4 = fai.p(x9yVar, "speed");
            Shuffle shuffle = (Shuffle) dq.f(x9yVar, "shuffle", tru.a(), Shuffle.class);
            RepeatMode repeatMode = (RepeatMode) dq.f(x9yVar, "repeat_mode", tru.a(), RepeatMode.class);
            boolean m = fai.m(x9yVar, "crossfade");
            boolean m2 = fai.m(x9yVar, "loudness_normalization");
            Autorecoms autorecoms = (Autorecoms) dq.f(x9yVar, "autorecoms", tru.a(), Autorecoms.class);
            AppState appState = (AppState) dq.f(x9yVar, "app_state", tru.a(), AppState.class);
            StreamingType streamingType = (StreamingType) dq.f(x9yVar, "streaming_type", tru.a(), StreamingType.class);
            ListeningType listeningType = (ListeningType) dq.f(x9yVar, "listening_type", tru.a(), ListeningType.class);
            Gson a = tru.a();
            b9y q3 = x9yVar.q(NotificationCompat.CATEGORY_EVENT);
            Object obj = null;
            CommonAudioStat$AudioListeningEvent commonAudioStat$AudioListeningEvent = (CommonAudioStat$AudioListeningEvent) ((q3 == null || (q3 instanceof u9y)) ? null : a.fromJson(q3.k(), CommonAudioStat$AudioListeningEvent.class));
            String C = fai.C(x9yVar, "link");
            Gson a2 = tru.a();
            b9y q4 = x9yVar.q(AdRevenueConstants.LAYER_KEY);
            Layer layer = (Layer) ((q4 == null || (q4 instanceof u9y)) ? null : a2.fromJson(q4.k(), Layer.class));
            Gson a3 = tru.a();
            b9y q5 = x9yVar.q("nav_info");
            CommonAudioStat$AudioListeningNavInfo commonAudioStat$AudioListeningNavInfo = (CommonAudioStat$AudioListeningNavInfo) ((q5 == null || (q5 instanceof u9y)) ? null : a3.fromJson(q5.k(), CommonAudioStat$AudioListeningNavInfo.class));
            Gson a4 = tru.a();
            b9y q6 = x9yVar.q("streaming_url_type");
            StreamingUrlType streamingUrlType = (StreamingUrlType) ((q6 == null || (q6 instanceof u9y)) ? null : a4.fromJson(q6.k(), StreamingUrlType.class));
            String C2 = fai.C(x9yVar, "url_domain");
            Gson a5 = tru.a();
            b9y q7 = x9yVar.q("type_audio_audio_listening_item");
            CommonAudioStat$TypeAudioAudioListeningItem commonAudioStat$TypeAudioAudioListeningItem = (CommonAudioStat$TypeAudioAudioListeningItem) ((q7 == null || (q7 instanceof u9y)) ? null : a5.fromJson(q7.k(), CommonAudioStat$TypeAudioAudioListeningItem.class));
            Gson a6 = tru.a();
            b9y q8 = x9yVar.q("type_audio_podcast_listening_item");
            CommonAudioStat$TypeAudioPodcastListeningItem commonAudioStat$TypeAudioPodcastListeningItem = (CommonAudioStat$TypeAudioPodcastListeningItem) ((q8 == null || (q8 instanceof u9y)) ? null : a6.fromJson(q8.k(), CommonAudioStat$TypeAudioPodcastListeningItem.class));
            Gson a7 = tru.a();
            b9y q9 = x9yVar.q("type_audio_book_listening_item");
            CommonAudioStat$TypeAudioBookListeningItem commonAudioStat$TypeAudioBookListeningItem = (CommonAudioStat$TypeAudioBookListeningItem) ((q9 == null || (q9 instanceof u9y)) ? null : a7.fromJson(q9.k(), CommonAudioStat$TypeAudioBookListeningItem.class));
            Gson a8 = tru.a();
            b9y q10 = x9yVar.q("type_audio_adv_listening_item");
            CommonAudioStat$TypeAudioAdvListeningItem commonAudioStat$TypeAudioAdvListeningItem = (CommonAudioStat$TypeAudioAdvListeningItem) ((q10 == null || (q10 instanceof u9y)) ? null : a8.fromJson(q10.k(), CommonAudioStat$TypeAudioAdvListeningItem.class));
            Gson a9 = tru.a();
            b9y q11 = x9yVar.q("type_audio_radio_listening_item");
            if (q11 != null && !(q11 instanceof u9y)) {
                obj = a9.fromJson(q11.k(), (Class<Object>) CommonAudioStat$TypeAudioRadioListeningItem.class);
            }
            return new CommonAudioStat$TypeAudioListeningItem(s, q, q2, p, p2, s2, p3, p4, shuffle, repeatMode, m, m2, autorecoms, appState, streamingType, listeningType, commonAudioStat$AudioListeningEvent, C, layer, commonAudioStat$AudioListeningNavInfo, streamingUrlType, C2, commonAudioStat$TypeAudioAudioListeningItem, commonAudioStat$TypeAudioPodcastListeningItem, commonAudioStat$TypeAudioBookListeningItem, commonAudioStat$TypeAudioAdvListeningItem, (CommonAudioStat$TypeAudioRadioListeningItem) obj);
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            CommonAudioStat$TypeAudioListeningItem commonAudioStat$TypeAudioListeningItem = (CommonAudioStat$TypeAudioListeningItem) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("track_code", commonAudioStat$TypeAudioListeningItem.a);
            x9yVar.n("client_time", Long.valueOf(commonAudioStat$TypeAudioListeningItem.e()));
            x9yVar.n("client_server_time", Long.valueOf(commonAudioStat$TypeAudioListeningItem.d()));
            x9yVar.n("timeline", Integer.valueOf(commonAudioStat$TypeAudioListeningItem.q()));
            x9yVar.n("timeline_from", Integer.valueOf(commonAudioStat$TypeAudioListeningItem.r()));
            x9yVar.o("player_init_id", commonAudioStat$TypeAudioListeningItem.b);
            x9yVar.n("volume", Integer.valueOf(commonAudioStat$TypeAudioListeningItem.y()));
            x9yVar.n("speed", Integer.valueOf(commonAudioStat$TypeAudioListeningItem.n()));
            x9yVar.o("shuffle", tru.a().toJson(commonAudioStat$TypeAudioListeningItem.m()));
            x9yVar.o("repeat_mode", tru.a().toJson(commonAudioStat$TypeAudioListeningItem.l()));
            x9yVar.m(Boolean.valueOf(commonAudioStat$TypeAudioListeningItem.f()), "crossfade");
            x9yVar.m(Boolean.valueOf(commonAudioStat$TypeAudioListeningItem.j()), "loudness_normalization");
            x9yVar.o("autorecoms", tru.a().toJson(commonAudioStat$TypeAudioListeningItem.c()));
            x9yVar.o("app_state", tru.a().toJson(commonAudioStat$TypeAudioListeningItem.b()));
            x9yVar.o("streaming_type", tru.a().toJson(commonAudioStat$TypeAudioListeningItem.o()));
            x9yVar.o("listening_type", tru.a().toJson(commonAudioStat$TypeAudioListeningItem.i()));
            x9yVar.o(NotificationCompat.CATEGORY_EVENT, tru.a().toJson(commonAudioStat$TypeAudioListeningItem.g()));
            x9yVar.o("link", commonAudioStat$TypeAudioListeningItem.c);
            x9yVar.o(AdRevenueConstants.LAYER_KEY, tru.a().toJson(commonAudioStat$TypeAudioListeningItem.h()));
            x9yVar.o("nav_info", tru.a().toJson(commonAudioStat$TypeAudioListeningItem.k()));
            x9yVar.o("streaming_url_type", tru.a().toJson(commonAudioStat$TypeAudioListeningItem.p()));
            x9yVar.o("url_domain", commonAudioStat$TypeAudioListeningItem.x());
            x9yVar.o("type_audio_audio_listening_item", tru.a().toJson(commonAudioStat$TypeAudioListeningItem.t()));
            x9yVar.o("type_audio_podcast_listening_item", tru.a().toJson(commonAudioStat$TypeAudioListeningItem.v()));
            x9yVar.o("type_audio_book_listening_item", tru.a().toJson(commonAudioStat$TypeAudioListeningItem.u()));
            x9yVar.o("type_audio_adv_listening_item", tru.a().toJson(commonAudioStat$TypeAudioListeningItem.s()));
            x9yVar.o("type_audio_radio_listening_item", tru.a().toJson(commonAudioStat$TypeAudioListeningItem.w()));
            return x9yVar;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonAudioStat.kt */
    /* loaded from: classes5.dex */
    public static final class RepeatMode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ RepeatMode[] $VALUES;

        @pmi0("all")
        public static final RepeatMode ALL;

        @pmi0("off")
        public static final RepeatMode OFF;

        @pmi0("one")
        public static final RepeatMode ONE;

        static {
            RepeatMode repeatMode = new RepeatMode("OFF", 0);
            OFF = repeatMode;
            RepeatMode repeatMode2 = new RepeatMode("ALL", 1);
            ALL = repeatMode2;
            RepeatMode repeatMode3 = new RepeatMode("ONE", 2);
            ONE = repeatMode3;
            RepeatMode[] repeatModeArr = {repeatMode, repeatMode2, repeatMode3};
            $VALUES = repeatModeArr;
            $ENTRIES = new asp(repeatModeArr);
        }

        private RepeatMode(String str, int i) {
        }

        public static RepeatMode valueOf(String str) {
            return (RepeatMode) Enum.valueOf(RepeatMode.class, str);
        }

        public static RepeatMode[] values() {
            return (RepeatMode[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonAudioStat.kt */
    /* loaded from: classes5.dex */
    public static final class Shuffle {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Shuffle[] $VALUES;

        @pmi0("off")
        public static final Shuffle OFF;

        @pmi0("on")
        public static final Shuffle ON;

        static {
            Shuffle shuffle = new Shuffle("ON", 0);
            ON = shuffle;
            Shuffle shuffle2 = new Shuffle("OFF", 1);
            OFF = shuffle2;
            Shuffle[] shuffleArr = {shuffle, shuffle2};
            $VALUES = shuffleArr;
            $ENTRIES = new asp(shuffleArr);
        }

        private Shuffle(String str, int i) {
        }

        public static Shuffle valueOf(String str) {
            return (Shuffle) Enum.valueOf(Shuffle.class, str);
        }

        public static Shuffle[] values() {
            return (Shuffle[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonAudioStat.kt */
    public static final class StreamingType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StreamingType[] $VALUES;
        public static final StreamingType OFFLINE;
        public static final StreamingType ONLINE;
        public static final StreamingType ONLINE_CACHE;
        public static final StreamingType UNKNOWN;
        private final String value;

        /* compiled from: CommonAudioStat.kt */
        public static final class Serializer implements uay<StreamingType> {
            @Override // xsna.uay
            public final b9y b(Object obj, tay tayVar) {
                return new hay(((StreamingType) obj).value);
            }
        }

        static {
            StreamingType streamingType = new StreamingType("OFFLINE", 0, "offline");
            OFFLINE = streamingType;
            StreamingType streamingType2 = new StreamingType("ONLINE", 1, eok.ONLINE_EXTRAS_KEY);
            ONLINE = streamingType2;
            StreamingType streamingType3 = new StreamingType("ONLINE_CACHE", 2, "online_cache");
            ONLINE_CACHE = streamingType3;
            StreamingType streamingType4 = new StreamingType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 3, "undef");
            UNKNOWN = streamingType4;
            StreamingType[] streamingTypeArr = {streamingType, streamingType2, streamingType3, streamingType4};
            $VALUES = streamingTypeArr;
            $ENTRIES = new asp(streamingTypeArr);
        }

        public StreamingType(String str, int i, String str2) {
            this.value = str2;
        }

        public static StreamingType valueOf(String str) {
            return (StreamingType) Enum.valueOf(StreamingType.class, str);
        }

        public static StreamingType[] values() {
            return (StreamingType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonAudioStat.kt */
    /* loaded from: classes5.dex */
    public static final class StreamingUrlType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StreamingUrlType[] $VALUES;

        @pmi0("dash")
        public static final StreamingUrlType DASH;

        @pmi0("hls")
        public static final StreamingUrlType HLS;

        @pmi0("hls_range")
        public static final StreamingUrlType HLS_RANGE;

        @pmi0("hls_ts")
        public static final StreamingUrlType HLS_TS;

        @pmi0("mp3")
        public static final StreamingUrlType MP3;

        @pmi0("music_source_hls")
        public static final StreamingUrlType MUSIC_SOURCE_HLS;

        @pmi0("music_source_mp3")
        public static final StreamingUrlType MUSIC_SOURCE_MP3;

        static {
            StreamingUrlType streamingUrlType = new StreamingUrlType("MP3", 0);
            MP3 = streamingUrlType;
            StreamingUrlType streamingUrlType2 = new StreamingUrlType("HLS", 1);
            HLS = streamingUrlType2;
            StreamingUrlType streamingUrlType3 = new StreamingUrlType("HLS_RANGE", 2);
            HLS_RANGE = streamingUrlType3;
            StreamingUrlType streamingUrlType4 = new StreamingUrlType("HLS_TS", 3);
            HLS_TS = streamingUrlType4;
            StreamingUrlType streamingUrlType5 = new StreamingUrlType("DASH", 4);
            DASH = streamingUrlType5;
            StreamingUrlType streamingUrlType6 = new StreamingUrlType("MUSIC_SOURCE_HLS", 5);
            MUSIC_SOURCE_HLS = streamingUrlType6;
            StreamingUrlType streamingUrlType7 = new StreamingUrlType("MUSIC_SOURCE_MP3", 6);
            MUSIC_SOURCE_MP3 = streamingUrlType7;
            StreamingUrlType[] streamingUrlTypeArr = {streamingUrlType, streamingUrlType2, streamingUrlType3, streamingUrlType4, streamingUrlType5, streamingUrlType6, streamingUrlType7};
            $VALUES = streamingUrlTypeArr;
            $ENTRIES = new asp(streamingUrlTypeArr);
        }

        private StreamingUrlType(String str, int i) {
        }

        public static StreamingUrlType valueOf(String str) {
            return (StreamingUrlType) Enum.valueOf(StreamingUrlType.class, str);
        }

        public static StreamingUrlType[] values() {
            return (StreamingUrlType[]) $VALUES.clone();
        }
    }

    public CommonAudioStat$TypeAudioListeningItem(String str, long j, long j2, int i, int i2, String str2, int i3, int i4, Shuffle shuffle, RepeatMode repeatMode, boolean z, boolean z2, Autorecoms autorecoms, AppState appState, StreamingType streamingType, ListeningType listeningType, CommonAudioStat$AudioListeningEvent commonAudioStat$AudioListeningEvent, String str3, Layer layer, CommonAudioStat$AudioListeningNavInfo commonAudioStat$AudioListeningNavInfo, StreamingUrlType streamingUrlType, String str4, CommonAudioStat$TypeAudioAudioListeningItem commonAudioStat$TypeAudioAudioListeningItem, CommonAudioStat$TypeAudioPodcastListeningItem commonAudioStat$TypeAudioPodcastListeningItem, CommonAudioStat$TypeAudioBookListeningItem commonAudioStat$TypeAudioBookListeningItem, CommonAudioStat$TypeAudioAdvListeningItem commonAudioStat$TypeAudioAdvListeningItem, CommonAudioStat$TypeAudioRadioListeningItem commonAudioStat$TypeAudioRadioListeningItem) {
        this.a = str;
        this.clientTime = j;
        this.clientServerTime = j2;
        this.timeline = i;
        this.timelineFrom = i2;
        this.b = str2;
        this.volume = i3;
        this.speed = i4;
        this.shuffle = shuffle;
        this.repeatMode = repeatMode;
        this.crossfade = z;
        this.loudnessNormalization = z2;
        this.autorecoms = autorecoms;
        this.appState = appState;
        this.streamingType = streamingType;
        this.listeningType = listeningType;
        this.event = commonAudioStat$AudioListeningEvent;
        this.c = str3;
        this.layer = layer;
        this.navInfo = commonAudioStat$AudioListeningNavInfo;
        this.streamingUrlType = streamingUrlType;
        this.urlDomain = str4;
        this.typeAudioAudioListeningItem = commonAudioStat$TypeAudioAudioListeningItem;
        this.typeAudioPodcastListeningItem = commonAudioStat$TypeAudioPodcastListeningItem;
        this.typeAudioBookListeningItem = commonAudioStat$TypeAudioBookListeningItem;
        this.typeAudioAdvListeningItem = commonAudioStat$TypeAudioAdvListeningItem;
        this.typeAudioRadioListeningItem = commonAudioStat$TypeAudioRadioListeningItem;
        FilteredString filteredString = new FilteredString(lhg.b(256));
        this.filteredTrackCode = filteredString;
        FilteredString filteredString2 = new FilteredString(lhg.b(64));
        this.filteredPlayerInitId = filteredString2;
        FilteredString filteredString3 = new FilteredString(lhg.b(256));
        this.filteredLink = filteredString3;
        filteredString.a(str);
        filteredString2.a(str2);
        filteredString3.a(str3);
    }

    public static CommonAudioStat$TypeAudioListeningItem a(CommonAudioStat$TypeAudioListeningItem commonAudioStat$TypeAudioListeningItem, ListeningType listeningType, CommonAudioStat$TypeAudioAudioListeningItem commonAudioStat$TypeAudioAudioListeningItem, CommonAudioStat$TypeAudioPodcastListeningItem commonAudioStat$TypeAudioPodcastListeningItem, CommonAudioStat$TypeAudioBookListeningItem commonAudioStat$TypeAudioBookListeningItem, CommonAudioStat$TypeAudioAdvListeningItem commonAudioStat$TypeAudioAdvListeningItem, CommonAudioStat$TypeAudioRadioListeningItem commonAudioStat$TypeAudioRadioListeningItem, int i) {
        String str;
        CommonAudioStat$TypeAudioAudioListeningItem commonAudioStat$TypeAudioAudioListeningItem2;
        String str2 = commonAudioStat$TypeAudioListeningItem.a;
        long j = commonAudioStat$TypeAudioListeningItem.clientTime;
        long j2 = commonAudioStat$TypeAudioListeningItem.clientServerTime;
        int i2 = commonAudioStat$TypeAudioListeningItem.timeline;
        int i3 = commonAudioStat$TypeAudioListeningItem.timelineFrom;
        String str3 = commonAudioStat$TypeAudioListeningItem.b;
        int i4 = commonAudioStat$TypeAudioListeningItem.volume;
        int i5 = commonAudioStat$TypeAudioListeningItem.speed;
        Shuffle shuffle = commonAudioStat$TypeAudioListeningItem.shuffle;
        RepeatMode repeatMode = commonAudioStat$TypeAudioListeningItem.repeatMode;
        boolean z = commonAudioStat$TypeAudioListeningItem.crossfade;
        boolean z2 = commonAudioStat$TypeAudioListeningItem.loudnessNormalization;
        Autorecoms autorecoms = commonAudioStat$TypeAudioListeningItem.autorecoms;
        AppState appState = commonAudioStat$TypeAudioListeningItem.appState;
        StreamingType streamingType = commonAudioStat$TypeAudioListeningItem.streamingType;
        CommonAudioStat$AudioListeningEvent commonAudioStat$AudioListeningEvent = commonAudioStat$TypeAudioListeningItem.event;
        String str4 = commonAudioStat$TypeAudioListeningItem.c;
        Layer layer = commonAudioStat$TypeAudioListeningItem.layer;
        CommonAudioStat$AudioListeningNavInfo commonAudioStat$AudioListeningNavInfo = commonAudioStat$TypeAudioListeningItem.navInfo;
        StreamingUrlType streamingUrlType = commonAudioStat$TypeAudioListeningItem.streamingUrlType;
        String str5 = commonAudioStat$TypeAudioListeningItem.urlDomain;
        if ((i & 4194304) != 0) {
            str = str5;
            commonAudioStat$TypeAudioAudioListeningItem2 = commonAudioStat$TypeAudioListeningItem.typeAudioAudioListeningItem;
        } else {
            str = str5;
            commonAudioStat$TypeAudioAudioListeningItem2 = commonAudioStat$TypeAudioAudioListeningItem;
        }
        return new CommonAudioStat$TypeAudioListeningItem(str2, j, j2, i2, i3, str3, i4, i5, shuffle, repeatMode, z, z2, autorecoms, appState, streamingType, listeningType, commonAudioStat$AudioListeningEvent, str4, layer, commonAudioStat$AudioListeningNavInfo, streamingUrlType, str, commonAudioStat$TypeAudioAudioListeningItem2, (i & 8388608) != 0 ? commonAudioStat$TypeAudioListeningItem.typeAudioPodcastListeningItem : commonAudioStat$TypeAudioPodcastListeningItem, (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? commonAudioStat$TypeAudioListeningItem.typeAudioBookListeningItem : commonAudioStat$TypeAudioBookListeningItem, (i & 33554432) != 0 ? commonAudioStat$TypeAudioListeningItem.typeAudioAdvListeningItem : commonAudioStat$TypeAudioAdvListeningItem, (i & 67108864) != 0 ? commonAudioStat$TypeAudioListeningItem.typeAudioRadioListeningItem : commonAudioStat$TypeAudioRadioListeningItem);
    }

    public final AppState b() {
        return this.appState;
    }

    public final Autorecoms c() {
        return this.autorecoms;
    }

    public final long d() {
        return this.clientServerTime;
    }

    public final long e() {
        return this.clientTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonAudioStat$TypeAudioListeningItem)) {
            return false;
        }
        CommonAudioStat$TypeAudioListeningItem commonAudioStat$TypeAudioListeningItem = (CommonAudioStat$TypeAudioListeningItem) obj;
        return epx.f(this.a, commonAudioStat$TypeAudioListeningItem.a) && this.clientTime == commonAudioStat$TypeAudioListeningItem.clientTime && this.clientServerTime == commonAudioStat$TypeAudioListeningItem.clientServerTime && this.timeline == commonAudioStat$TypeAudioListeningItem.timeline && this.timelineFrom == commonAudioStat$TypeAudioListeningItem.timelineFrom && epx.f(this.b, commonAudioStat$TypeAudioListeningItem.b) && this.volume == commonAudioStat$TypeAudioListeningItem.volume && this.speed == commonAudioStat$TypeAudioListeningItem.speed && this.shuffle == commonAudioStat$TypeAudioListeningItem.shuffle && this.repeatMode == commonAudioStat$TypeAudioListeningItem.repeatMode && this.crossfade == commonAudioStat$TypeAudioListeningItem.crossfade && this.loudnessNormalization == commonAudioStat$TypeAudioListeningItem.loudnessNormalization && this.autorecoms == commonAudioStat$TypeAudioListeningItem.autorecoms && this.appState == commonAudioStat$TypeAudioListeningItem.appState && this.streamingType == commonAudioStat$TypeAudioListeningItem.streamingType && this.listeningType == commonAudioStat$TypeAudioListeningItem.listeningType && epx.f(this.event, commonAudioStat$TypeAudioListeningItem.event) && epx.f(this.c, commonAudioStat$TypeAudioListeningItem.c) && this.layer == commonAudioStat$TypeAudioListeningItem.layer && epx.f(this.navInfo, commonAudioStat$TypeAudioListeningItem.navInfo) && this.streamingUrlType == commonAudioStat$TypeAudioListeningItem.streamingUrlType && epx.f(this.urlDomain, commonAudioStat$TypeAudioListeningItem.urlDomain) && epx.f(this.typeAudioAudioListeningItem, commonAudioStat$TypeAudioListeningItem.typeAudioAudioListeningItem) && epx.f(this.typeAudioPodcastListeningItem, commonAudioStat$TypeAudioListeningItem.typeAudioPodcastListeningItem) && epx.f(this.typeAudioBookListeningItem, commonAudioStat$TypeAudioListeningItem.typeAudioBookListeningItem) && epx.f(this.typeAudioAdvListeningItem, commonAudioStat$TypeAudioListeningItem.typeAudioAdvListeningItem) && epx.f(this.typeAudioRadioListeningItem, commonAudioStat$TypeAudioListeningItem.typeAudioRadioListeningItem);
    }

    public final boolean f() {
        return this.crossfade;
    }

    public final CommonAudioStat$AudioListeningEvent g() {
        return this.event;
    }

    public final Layer h() {
        return this.layer;
    }

    public final int hashCode() {
        int hashCode = (this.listeningType.hashCode() + ((this.streamingType.hashCode() + ((this.appState.hashCode() + ((this.autorecoms.hashCode() + qoy.b(qoy.b((this.repeatMode.hashCode() + ((this.shuffle.hashCode() + shy.a(this.speed, shy.a(this.volume, urd0.a(shy.a(this.timelineFrom, shy.a(this.timeline, bh10.a(bh10.a(this.a.hashCode() * 31, 31, this.clientTime), 31, this.clientServerTime), 31), 31), 31, this.b), 31), 31)) * 31)) * 31, 31, this.crossfade), 31, this.loudnessNormalization)) * 31)) * 31)) * 31)) * 31;
        CommonAudioStat$AudioListeningEvent commonAudioStat$AudioListeningEvent = this.event;
        int hashCode2 = (hashCode + (commonAudioStat$AudioListeningEvent == null ? 0 : commonAudioStat$AudioListeningEvent.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Layer layer = this.layer;
        int hashCode4 = (hashCode3 + (layer == null ? 0 : layer.hashCode())) * 31;
        CommonAudioStat$AudioListeningNavInfo commonAudioStat$AudioListeningNavInfo = this.navInfo;
        int hashCode5 = (hashCode4 + (commonAudioStat$AudioListeningNavInfo == null ? 0 : commonAudioStat$AudioListeningNavInfo.hashCode())) * 31;
        StreamingUrlType streamingUrlType = this.streamingUrlType;
        int hashCode6 = (hashCode5 + (streamingUrlType == null ? 0 : streamingUrlType.hashCode())) * 31;
        String str2 = this.urlDomain;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CommonAudioStat$TypeAudioAudioListeningItem commonAudioStat$TypeAudioAudioListeningItem = this.typeAudioAudioListeningItem;
        int hashCode8 = (hashCode7 + (commonAudioStat$TypeAudioAudioListeningItem == null ? 0 : commonAudioStat$TypeAudioAudioListeningItem.hashCode())) * 31;
        CommonAudioStat$TypeAudioPodcastListeningItem commonAudioStat$TypeAudioPodcastListeningItem = this.typeAudioPodcastListeningItem;
        int hashCode9 = (hashCode8 + (commonAudioStat$TypeAudioPodcastListeningItem == null ? 0 : commonAudioStat$TypeAudioPodcastListeningItem.hashCode())) * 31;
        CommonAudioStat$TypeAudioBookListeningItem commonAudioStat$TypeAudioBookListeningItem = this.typeAudioBookListeningItem;
        int hashCode10 = (hashCode9 + (commonAudioStat$TypeAudioBookListeningItem == null ? 0 : commonAudioStat$TypeAudioBookListeningItem.hashCode())) * 31;
        CommonAudioStat$TypeAudioAdvListeningItem commonAudioStat$TypeAudioAdvListeningItem = this.typeAudioAdvListeningItem;
        int hashCode11 = (hashCode10 + (commonAudioStat$TypeAudioAdvListeningItem == null ? 0 : commonAudioStat$TypeAudioAdvListeningItem.hashCode())) * 31;
        CommonAudioStat$TypeAudioRadioListeningItem commonAudioStat$TypeAudioRadioListeningItem = this.typeAudioRadioListeningItem;
        return hashCode11 + (commonAudioStat$TypeAudioRadioListeningItem != null ? commonAudioStat$TypeAudioRadioListeningItem.hashCode() : 0);
    }

    public final ListeningType i() {
        return this.listeningType;
    }

    public final boolean j() {
        return this.loudnessNormalization;
    }

    public final CommonAudioStat$AudioListeningNavInfo k() {
        return this.navInfo;
    }

    public final RepeatMode l() {
        return this.repeatMode;
    }

    public final Shuffle m() {
        return this.shuffle;
    }

    public final int n() {
        return this.speed;
    }

    public final StreamingType o() {
        return this.streamingType;
    }

    public final StreamingUrlType p() {
        return this.streamingUrlType;
    }

    public final int q() {
        return this.timeline;
    }

    public final int r() {
        return this.timelineFrom;
    }

    public final CommonAudioStat$TypeAudioAdvListeningItem s() {
        return this.typeAudioAdvListeningItem;
    }

    public final CommonAudioStat$TypeAudioAudioListeningItem t() {
        return this.typeAudioAudioListeningItem;
    }

    public final String toString() {
        return "TypeAudioListeningItem(trackCode=" + this.a + ", clientTime=" + this.clientTime + ", clientServerTime=" + this.clientServerTime + ", timeline=" + this.timeline + ", timelineFrom=" + this.timelineFrom + ", playerInitId=" + this.b + ", volume=" + this.volume + ", speed=" + this.speed + ", shuffle=" + this.shuffle + ", repeatMode=" + this.repeatMode + ", crossfade=" + this.crossfade + ", loudnessNormalization=" + this.loudnessNormalization + ", autorecoms=" + this.autorecoms + ", appState=" + this.appState + ", streamingType=" + this.streamingType + ", listeningType=" + this.listeningType + ", event=" + this.event + ", link=" + this.c + ", layer=" + this.layer + ", navInfo=" + this.navInfo + ", streamingUrlType=" + this.streamingUrlType + ", urlDomain=" + this.urlDomain + ", typeAudioAudioListeningItem=" + this.typeAudioAudioListeningItem + ", typeAudioPodcastListeningItem=" + this.typeAudioPodcastListeningItem + ", typeAudioBookListeningItem=" + this.typeAudioBookListeningItem + ", typeAudioAdvListeningItem=" + this.typeAudioAdvListeningItem + ", typeAudioRadioListeningItem=" + this.typeAudioRadioListeningItem + ')';
    }

    public final CommonAudioStat$TypeAudioBookListeningItem u() {
        return this.typeAudioBookListeningItem;
    }

    public final CommonAudioStat$TypeAudioPodcastListeningItem v() {
        return this.typeAudioPodcastListeningItem;
    }

    public final CommonAudioStat$TypeAudioRadioListeningItem w() {
        return this.typeAudioRadioListeningItem;
    }

    public final String x() {
        return this.urlDomain;
    }

    public final int y() {
        return this.volume;
    }

    public /* synthetic */ CommonAudioStat$TypeAudioListeningItem(String str, long j, long j2, int i, int i2, String str2, int i3, int i4, Shuffle shuffle, RepeatMode repeatMode, boolean z, boolean z2, Autorecoms autorecoms, AppState appState, StreamingType streamingType, ListeningType listeningType, CommonAudioStat$AudioListeningEvent commonAudioStat$AudioListeningEvent, String str3, Layer layer, CommonAudioStat$AudioListeningNavInfo commonAudioStat$AudioListeningNavInfo, StreamingUrlType streamingUrlType, String str4, CommonAudioStat$TypeAudioAudioListeningItem commonAudioStat$TypeAudioAudioListeningItem, CommonAudioStat$TypeAudioPodcastListeningItem commonAudioStat$TypeAudioPodcastListeningItem, CommonAudioStat$TypeAudioBookListeningItem commonAudioStat$TypeAudioBookListeningItem, CommonAudioStat$TypeAudioAdvListeningItem commonAudioStat$TypeAudioAdvListeningItem, CommonAudioStat$TypeAudioRadioListeningItem commonAudioStat$TypeAudioRadioListeningItem, int i5, zcl zclVar) {
        this(str, j, j2, i, i2, str2, i3, i4, shuffle, repeatMode, z, z2, autorecoms, appState, streamingType, listeningType, (i5 & 65536) != 0 ? null : commonAudioStat$AudioListeningEvent, (i5 & 131072) != 0 ? null : str3, (i5 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : layer, (i5 & 524288) != 0 ? null : commonAudioStat$AudioListeningNavInfo, (i5 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : streamingUrlType, (i5 & 2097152) != 0 ? null : str4, (i5 & 4194304) != 0 ? null : commonAudioStat$TypeAudioAudioListeningItem, (i5 & 8388608) != 0 ? null : commonAudioStat$TypeAudioPodcastListeningItem, (i5 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : commonAudioStat$TypeAudioBookListeningItem, (i5 & 33554432) != 0 ? null : commonAudioStat$TypeAudioAdvListeningItem, (i5 & 67108864) != 0 ? null : commonAudioStat$TypeAudioRadioListeningItem);
    }
}
