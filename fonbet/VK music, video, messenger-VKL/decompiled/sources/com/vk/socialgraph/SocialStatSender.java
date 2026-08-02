package com.vk.socialgraph;

import com.unity3d.ads.BuildConfig;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import ru.ok.android.webrtc.Privacy;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.frf0;
import xsna.zrp;

/* compiled from: SocialStatSender.kt */
/* loaded from: classes11.dex */
public interface SocialStatSender {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SocialStatSender.kt */
    /* loaded from: classes5.dex */
    public static final class Element {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Element[] $VALUES;
        public static final Element ADD;
        public static final Element REMOVE;
        private final String alias;

        static {
            Element element = new Element("ADD", 0, "add");
            ADD = element;
            Element element2 = new Element(SignalingProtocol.KEY_ROOMS_EVENT_TYPE_REMOVE, 1, SignalingProtocol.KEY_REMOVE);
            REMOVE = element2;
            Element[] elementArr = {element, element2};
            $VALUES = elementArr;
            $ENTRIES = new asp(elementArr);
        }

        public Element(String str, int i, String str2) {
            this.alias = str2;
        }

        public static Element valueOf(String str) {
            return (Element) Enum.valueOf(Element.class, str);
        }

        public static Element[] values() {
            return (Element[]) $VALUES.clone();
        }

        public final String h() {
            return this.alias;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SocialStatSender.kt */
    /* loaded from: classes5.dex */
    public static final class Screen {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Screen[] $VALUES;
        public static final Screen AVATAR;
        public static final Screen CONTACTS;
        public static final Screen GMAIL;
        public static final Screen OK;
        public static final Screen TOPICS;
        private final String alias;

        static {
            Screen screen = new Screen("OK", 0, "contacts_ok");
            OK = screen;
            Screen screen2 = new Screen("GMAIL", 1, "contacts_gmail");
            GMAIL = screen2;
            Screen screen3 = new Screen("CONTACTS", 2, "contacts_phone");
            CONTACTS = screen3;
            Screen screen4 = new Screen("AVATAR", 3, "avatar");
            AVATAR = screen4;
            Screen screen5 = new Screen("TOPICS", 4, "topics");
            TOPICS = screen5;
            Screen[] screenArr = {screen, screen2, screen3, screen4, screen5};
            $VALUES = screenArr;
            $ENTRIES = new asp(screenArr);
        }

        public Screen(String str, int i, String str2) {
            this.alias = str2;
        }

        public static Screen valueOf(String str) {
            return (Screen) Enum.valueOf(Screen.class, str);
        }

        public static Screen[] values() {
            return (Screen[]) $VALUES.clone();
        }

        public final String h() {
            return this.alias;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SocialStatSender.kt */
    /* loaded from: classes5.dex */
    public static final class Status {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status DEFAULT;
        public static final Status FRIENDS;
        private final String alias;

        static {
            Status status = new Status("DEFAULT", 0, BuildConfig.FLAVOR);
            DEFAULT = status;
            Status status2 = new Status(Privacy.FRIENDS, 1, "friends");
            FRIENDS = status2;
            Status[] statusArr = {status, status2};
            $VALUES = statusArr;
            $ENTRIES = new asp(statusArr);
        }

        public Status(String str, int i, String str2) {
            this.alias = str2;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }

        public final String h() {
            return this.alias;
        }
    }

    /* compiled from: SocialStatSender.kt */
    public static final class a {
        public static final /* synthetic */ int a = 0;

        /* compiled from: SocialStatSender.kt */
        /* renamed from: com.vk.socialgraph.SocialStatSender$a$a, reason: collision with other inner class name */
        public static final class C1783a implements SocialStatSender {
        }

        static {
            RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        }
    }

    static {
        int i = a.a;
    }
}
