package com.vk.stat.scheme;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.dq;
import xsna.epx;
import xsna.fai;
import xsna.hay;
import xsna.lhg;
import xsna.pmi0;
import xsna.tay;
import xsna.tru;
import xsna.uay;
import xsna.urd0;
import xsna.x9y;
import xsna.z8y;
import xsna.zrp;

/* compiled from: MobileOfficialAppsSharingStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsSharingStat$TypeSharingLinkOpen implements SchemeStat$TypeClick.b {
    public final transient String a;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("url")
    private final FilteredString filteredUrl;

    @pmi0("sharing_item_type")
    private final MobileOfficialAppsSharingStat$SharingItemType sharingItemType;

    @pmi0("url_shared_method")
    private final UrlSharedMethod urlSharedMethod;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsSharingStat.kt */
    /* loaded from: classes5.dex */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("sharing_link_open")
        public static final EventType SHARING_LINK_OPEN;

        static {
            EventType eventType = new EventType("SHARING_LINK_OPEN", 0);
            SHARING_LINK_OPEN = eventType;
            EventType[] eventTypeArr = {eventType};
            $VALUES = eventTypeArr;
            $ENTRIES = new asp(eventTypeArr);
        }

        private EventType(String str, int i) {
        }

        public static EventType valueOf(String str) {
            return (EventType) Enum.valueOf(EventType.class, str);
        }

        public static EventType[] values() {
            return (EventType[]) $VALUES.clone();
        }
    }

    /* compiled from: MobileOfficialAppsSharingStat.kt */
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsSharingStat$TypeSharingLinkOpen>, a9y<MobileOfficialAppsSharingStat$TypeSharingLinkOpen> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new MobileOfficialAppsSharingStat$TypeSharingLinkOpen((EventType) dq.f(x9yVar, "event_type", tru.a(), EventType.class), fai.s(x9yVar, "url"), (UrlSharedMethod) dq.f(x9yVar, "url_shared_method", tru.a(), UrlSharedMethod.class), (MobileOfficialAppsSharingStat$SharingItemType) dq.f(x9yVar, "sharing_item_type", tru.a(), MobileOfficialAppsSharingStat$SharingItemType.class));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            MobileOfficialAppsSharingStat$TypeSharingLinkOpen mobileOfficialAppsSharingStat$TypeSharingLinkOpen = (MobileOfficialAppsSharingStat$TypeSharingLinkOpen) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("event_type", tru.a().toJson(mobileOfficialAppsSharingStat$TypeSharingLinkOpen.a()));
            x9yVar.o("url", mobileOfficialAppsSharingStat$TypeSharingLinkOpen.a);
            x9yVar.o("url_shared_method", tru.a().toJson(mobileOfficialAppsSharingStat$TypeSharingLinkOpen.c()));
            x9yVar.o("sharing_item_type", tru.a().toJson(mobileOfficialAppsSharingStat$TypeSharingLinkOpen.b()));
            return x9yVar;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsSharingStat.kt */
    public static final class UrlSharedMethod {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ UrlSharedMethod[] $VALUES;
        public static final UrlSharedMethod COPY_LINK;
        public static final UrlSharedMethod OTHER;
        public static final UrlSharedMethod SEND_MAX;
        public static final UrlSharedMethod SEND_TELEGRAM;
        public static final UrlSharedMethod SEND_WHATSAPP;
        public static final UrlSharedMethod SHARE_TO_MESSAGE;
        private final int value;

        /* compiled from: MobileOfficialAppsSharingStat.kt */
        public static final class Serializer implements uay<UrlSharedMethod> {
            @Override // xsna.uay
            public final b9y b(Object obj, tay tayVar) {
                return new hay(Integer.valueOf(((UrlSharedMethod) obj).value));
            }
        }

        static {
            UrlSharedMethod urlSharedMethod = new UrlSharedMethod("SEND_TELEGRAM", 0, 1);
            SEND_TELEGRAM = urlSharedMethod;
            UrlSharedMethod urlSharedMethod2 = new UrlSharedMethod("SEND_WHATSAPP", 1, 2);
            SEND_WHATSAPP = urlSharedMethod2;
            UrlSharedMethod urlSharedMethod3 = new UrlSharedMethod("SEND_MAX", 2, 3);
            SEND_MAX = urlSharedMethod3;
            UrlSharedMethod urlSharedMethod4 = new UrlSharedMethod("COPY_LINK", 3, 4);
            COPY_LINK = urlSharedMethod4;
            UrlSharedMethod urlSharedMethod5 = new UrlSharedMethod("SHARE_TO_MESSAGE", 4, 5);
            SHARE_TO_MESSAGE = urlSharedMethod5;
            UrlSharedMethod urlSharedMethod6 = new UrlSharedMethod(NativeAdContent.ViewTag.OTHER, 5, 6);
            OTHER = urlSharedMethod6;
            UrlSharedMethod[] urlSharedMethodArr = {urlSharedMethod, urlSharedMethod2, urlSharedMethod3, urlSharedMethod4, urlSharedMethod5, urlSharedMethod6};
            $VALUES = urlSharedMethodArr;
            $ENTRIES = new asp(urlSharedMethodArr);
        }

        public UrlSharedMethod(String str, int i, int i2) {
            this.value = i2;
        }

        public static UrlSharedMethod valueOf(String str) {
            return (UrlSharedMethod) Enum.valueOf(UrlSharedMethod.class, str);
        }

        public static UrlSharedMethod[] values() {
            return (UrlSharedMethod[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsSharingStat$TypeSharingLinkOpen(EventType eventType, String str, UrlSharedMethod urlSharedMethod, MobileOfficialAppsSharingStat$SharingItemType mobileOfficialAppsSharingStat$SharingItemType) {
        this.eventType = eventType;
        this.a = str;
        this.urlSharedMethod = urlSharedMethod;
        this.sharingItemType = mobileOfficialAppsSharingStat$SharingItemType;
        FilteredString filteredString = new FilteredString(lhg.b(128));
        this.filteredUrl = filteredString;
        filteredString.a(str);
    }

    public final EventType a() {
        return this.eventType;
    }

    public final MobileOfficialAppsSharingStat$SharingItemType b() {
        return this.sharingItemType;
    }

    public final UrlSharedMethod c() {
        return this.urlSharedMethod;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsSharingStat$TypeSharingLinkOpen)) {
            return false;
        }
        MobileOfficialAppsSharingStat$TypeSharingLinkOpen mobileOfficialAppsSharingStat$TypeSharingLinkOpen = (MobileOfficialAppsSharingStat$TypeSharingLinkOpen) obj;
        return this.eventType == mobileOfficialAppsSharingStat$TypeSharingLinkOpen.eventType && epx.f(this.a, mobileOfficialAppsSharingStat$TypeSharingLinkOpen.a) && this.urlSharedMethod == mobileOfficialAppsSharingStat$TypeSharingLinkOpen.urlSharedMethod && this.sharingItemType == mobileOfficialAppsSharingStat$TypeSharingLinkOpen.sharingItemType;
    }

    public final int hashCode() {
        return this.sharingItemType.hashCode() + ((this.urlSharedMethod.hashCode() + urd0.a(this.eventType.hashCode() * 31, 31, this.a)) * 31);
    }

    public final String toString() {
        return "TypeSharingLinkOpen(eventType=" + this.eventType + ", url=" + this.a + ", urlSharedMethod=" + this.urlSharedMethod + ", sharingItemType=" + this.sharingItemType + ')';
    }
}
