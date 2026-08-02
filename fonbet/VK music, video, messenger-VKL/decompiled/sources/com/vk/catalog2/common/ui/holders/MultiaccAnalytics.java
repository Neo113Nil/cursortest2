package com.vk.catalog2.common.ui.holders;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoChangeProfileButtonTap;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.bjc;
import xsna.zrp;

/* compiled from: MultiaccAnalytics.kt */
/* loaded from: classes16.dex */
public final class MultiaccAnalytics {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MultiaccAnalytics.kt */
    public static final class EventFrom {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventFrom[] $VALUES;
        public static final EventFrom CHILD_PROFILE;
        public static final EventFrom CHILD_SECTION;
        public static final EventFrom PROFILE_TAB;
        public static final EventFrom SETTINGS;

        static {
            EventFrom eventFrom = new EventFrom("PROFILE_TAB", 0);
            PROFILE_TAB = eventFrom;
            EventFrom eventFrom2 = new EventFrom("SETTINGS", 1);
            SETTINGS = eventFrom2;
            EventFrom eventFrom3 = new EventFrom("CHILD_PROFILE", 2);
            CHILD_PROFILE = eventFrom3;
            EventFrom eventFrom4 = new EventFrom("CHILD_SECTION", 3);
            CHILD_SECTION = eventFrom4;
            EventFrom[] eventFromArr = {eventFrom, eventFrom2, eventFrom3, eventFrom4};
            $VALUES = eventFromArr;
            $ENTRIES = new asp(eventFromArr);
        }

        public EventFrom() {
            throw null;
        }

        public static EventFrom valueOf(String str) {
            return (EventFrom) Enum.valueOf(EventFrom.class, str);
        }

        public static EventFrom[] values() {
            return (EventFrom[]) $VALUES.clone();
        }
    }

    /* compiled from: MultiaccAnalytics.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EventFrom.values().length];
            try {
                iArr[EventFrom.CHILD_PROFILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EventFrom.PROFILE_TAB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EventFrom.CHILD_SECTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EventFrom.SETTINGS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static void a(EventFrom eventFrom) {
        MobileOfficialAppsVideoStat$TypeVideoChangeProfileButtonTap.EventSubtype eventSubtype;
        int i = a.$EnumSwitchMapping$0[eventFrom.ordinal()];
        if (i == 1) {
            eventSubtype = MobileOfficialAppsVideoStat$TypeVideoChangeProfileButtonTap.EventSubtype.KID;
        } else if (i == 2) {
            eventSubtype = MobileOfficialAppsVideoStat$TypeVideoChangeProfileButtonTap.EventSubtype.PROFILE;
        } else if (i == 3) {
            eventSubtype = MobileOfficialAppsVideoStat$TypeVideoChangeProfileButtonTap.EventSubtype.FOR_KIDS;
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            eventSubtype = null;
        }
        UiTracker uiTracker = UiTracker.a;
        bjc bjcVar = new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), new MobileOfficialAppsVideoStat$TypeVideoChangeProfileButtonTap(eventSubtype), 2));
        bjcVar.c = true;
        bjcVar.q();
    }
}
