package com.vk.socialgraph;

import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.socialgraph.SocialGraphOpenParams;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.frf0;
import xsna.qro0;
import xsna.yq1;
import xsna.zrp;

/* compiled from: SocialGraphStrategy.kt */
/* loaded from: classes5.dex */
public interface SocialGraphStrategy {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SocialGraphStrategy.kt */
    public static final class Screen {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Screen[] $VALUES;
        public static final Screen AVATAR;
        public static final Screen CONTACTS;
        public static final Screen GEO_REQUEST;
        public static final Screen RECOM_THEMES;
        public static final Screen TOPICS;

        static {
            Screen screen = new Screen("CONTACTS", 0);
            CONTACTS = screen;
            Screen screen2 = new Screen("AVATAR", 1);
            AVATAR = screen2;
            Screen screen3 = new Screen("TOPICS", 2);
            TOPICS = screen3;
            Screen screen4 = new Screen("RECOM_THEMES", 3);
            RECOM_THEMES = screen4;
            Screen screen5 = new Screen("GEO_REQUEST", 4);
            GEO_REQUEST = screen5;
            Screen[] screenArr = {screen, screen2, screen3, screen4, screen5};
            $VALUES = screenArr;
            $ENTRIES = new asp(screenArr);
        }

        public Screen() {
            throw null;
        }

        public static Screen valueOf(String str) {
            return (Screen) Enum.valueOf(Screen.class, str);
        }

        public static Screen[] values() {
            return (Screen[]) $VALUES.clone();
        }
    }

    /* compiled from: SocialGraphStrategy.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SocialGraphOpenParams.OpenAction.values().length];
            try {
                iArr[SocialGraphOpenParams.OpenAction.CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SocialGraphOpenParams.OpenAction.NEXT_BUTTON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SocialGraphOpenParams.OpenAction.CONNECT_BUTTON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SocialGraphOpenParams.OpenAction.AFTER_RESULT_SUCCESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SocialGraphOpenParams.OpenAction.SKIP_BUTTON.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    default void a(Screen screen, SocialGraphOpenParams socialGraphOpenParams, boolean z) {
        SchemeStatSak$EventScreen a2 = screen != null ? b.a(screen, z) : null;
        int i = a.$EnumSwitchMapping$0[socialGraphOpenParams.a.ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            frf0.f(null, a2, null, false, null, null, 60);
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
            qro0.c(new yq1(18, a2, SchemeStatSak$TypeRegistrationItem.EventType.SCREEN_SKIP));
        }
    }
}
