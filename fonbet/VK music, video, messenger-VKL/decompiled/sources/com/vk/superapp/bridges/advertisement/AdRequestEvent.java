package com.vk.superapp.bridges.advertisement;

import xsna.asp;
import xsna.zrp;

/* compiled from: AdRequestEvent.kt */
/* loaded from: classes6.dex */
public final class AdRequestEvent {
    public final AdFormat a;
    public final String b;
    public final EventType c;
    public final RequestType d;
    public final RequestSubtype e;
    public final Integer f;
    public final String g;
    public final Integer h;
    public final Integer i;
    public final Float j;
    public final String k;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdRequestEvent.kt */
    public static final class AdFormat {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AdFormat[] $VALUES;
        public static final AdFormat BANNER;
        public static final AdFormat INTERSTITIAL;
        public static final AdFormat MULTI_INTERSTITIAL;
        public static final AdFormat REWARD;

        static {
            AdFormat adFormat = new AdFormat("REWARD", 0);
            REWARD = adFormat;
            AdFormat adFormat2 = new AdFormat("INTERSTITIAL", 1);
            INTERSTITIAL = adFormat2;
            AdFormat adFormat3 = new AdFormat("MULTI_INTERSTITIAL", 2);
            MULTI_INTERSTITIAL = adFormat3;
            AdFormat adFormat4 = new AdFormat("BANNER", 3);
            BANNER = adFormat4;
            AdFormat[] adFormatArr = {adFormat, adFormat2, adFormat3, adFormat4};
            $VALUES = adFormatArr;
            $ENTRIES = new asp(adFormatArr);
        }

        public AdFormat() {
            throw null;
        }

        public static zrp<AdFormat> h() {
            return $ENTRIES;
        }

        public static AdFormat valueOf(String str) {
            return (AdFormat) Enum.valueOf(AdFormat.class, str);
        }

        public static AdFormat[] values() {
            return (AdFormat[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdRequestEvent.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;
        public static final EventType IMPRESSION;
        public static final EventType LOAD;
        public static final EventType REQUEST;
        public static final EventType SHOW;

        static {
            EventType eventType = new EventType("REQUEST", 0);
            REQUEST = eventType;
            EventType eventType2 = new EventType("LOAD", 1);
            LOAD = eventType2;
            EventType eventType3 = new EventType("SHOW", 2);
            SHOW = eventType3;
            EventType eventType4 = new EventType("IMPRESSION", 3);
            IMPRESSION = eventType4;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3, eventType4};
            $VALUES = eventTypeArr;
            $ENTRIES = new asp(eventTypeArr);
        }

        public EventType() {
            throw null;
        }

        public static zrp<EventType> h() {
            return $ENTRIES;
        }

        public static EventType valueOf(String str) {
            return (EventType) Enum.valueOf(EventType.class, str);
        }

        public static EventType[] values() {
            return (EventType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdRequestEvent.kt */
    public static final class RequestSubtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ RequestSubtype[] $VALUES;
        public static final RequestSubtype CHECK;
        public static final RequestSubtype LOAD_NEXT;
        public static final RequestSubtype PRELOAD;
        public static final RequestSubtype SHOW;

        static {
            RequestSubtype requestSubtype = new RequestSubtype("PRELOAD", 0);
            PRELOAD = requestSubtype;
            RequestSubtype requestSubtype2 = new RequestSubtype("CHECK", 1);
            CHECK = requestSubtype2;
            RequestSubtype requestSubtype3 = new RequestSubtype("SHOW", 2);
            SHOW = requestSubtype3;
            RequestSubtype requestSubtype4 = new RequestSubtype("LOAD_NEXT", 3);
            LOAD_NEXT = requestSubtype4;
            RequestSubtype[] requestSubtypeArr = {requestSubtype, requestSubtype2, requestSubtype3, requestSubtype4};
            $VALUES = requestSubtypeArr;
            $ENTRIES = new asp(requestSubtypeArr);
        }

        public RequestSubtype() {
            throw null;
        }

        public static zrp<RequestSubtype> h() {
            return $ENTRIES;
        }

        public static RequestSubtype valueOf(String str) {
            return (RequestSubtype) Enum.valueOf(RequestSubtype.class, str);
        }

        public static RequestSubtype[] values() {
            return (RequestSubtype[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdRequestEvent.kt */
    public static final class RequestType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ RequestType[] $VALUES;
        public static final RequestType BRIDGE;
        public static final RequestType CLOSE;
        public static final RequestType SPLASH;

        static {
            RequestType requestType = new RequestType("BRIDGE", 0);
            BRIDGE = requestType;
            RequestType requestType2 = new RequestType("SPLASH", 1);
            SPLASH = requestType2;
            RequestType requestType3 = new RequestType("CLOSE", 2);
            CLOSE = requestType3;
            RequestType[] requestTypeArr = {requestType, requestType2, requestType3};
            $VALUES = requestTypeArr;
            $ENTRIES = new asp(requestTypeArr);
        }

        public RequestType() {
            throw null;
        }

        public static zrp<RequestType> h() {
            return $ENTRIES;
        }

        public static RequestType valueOf(String str) {
            return (RequestType) Enum.valueOf(RequestType.class, str);
        }

        public static RequestType[] values() {
            return (RequestType[]) $VALUES.clone();
        }
    }

    public AdRequestEvent(AdFormat adFormat, String str, EventType eventType, RequestType requestType, RequestSubtype requestSubtype, Integer num, String str2, Integer num2, Integer num3, Float f, String str3) {
        this.a = adFormat;
        this.b = str;
        this.c = eventType;
        this.d = requestType;
        this.e = requestSubtype;
        this.f = num;
        this.g = str2;
        this.h = num2;
        this.i = num3;
        this.j = f;
        this.k = str3;
    }
}
