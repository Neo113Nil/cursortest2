package com.vk.dto.user;

import android.util.SparseArray;
import java.util.Locale;
import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OnlineInfo.kt */
/* loaded from: classes18.dex */
public final class InvisibleLastSeenStatus {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ InvisibleLastSeenStatus[] $VALUES;
    public static final a Companion;
    public static final InvisibleLastSeenStatus LAST_MONTH;
    public static final InvisibleLastSeenStatus LAST_WEEK;
    public static final InvisibleLastSeenStatus LONG_AGO;
    public static final InvisibleLastSeenStatus NONE;
    public static final InvisibleLastSeenStatus NOT_SHOW;
    public static final InvisibleLastSeenStatus RECENTLY;
    private static final SparseArray<InvisibleLastSeenStatus> cache;
    private final int id;

    /* compiled from: OnlineInfo.kt */
    public static final class a {
        public static InvisibleLastSeenStatus a(int i) {
            InvisibleLastSeenStatus invisibleLastSeenStatus;
            InvisibleLastSeenStatus invisibleLastSeenStatus2 = (InvisibleLastSeenStatus) InvisibleLastSeenStatus.cache.get(i);
            if (invisibleLastSeenStatus2 != null) {
                return invisibleLastSeenStatus2;
            }
            InvisibleLastSeenStatus[] values = InvisibleLastSeenStatus.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    invisibleLastSeenStatus = null;
                    break;
                }
                invisibleLastSeenStatus = values[i2];
                if (invisibleLastSeenStatus.i() == i) {
                    break;
                }
                i2++;
            }
            if (invisibleLastSeenStatus == null) {
                invisibleLastSeenStatus = InvisibleLastSeenStatus.NONE;
            }
            InvisibleLastSeenStatus.cache.put(i, invisibleLastSeenStatus);
            return invisibleLastSeenStatus;
        }

        public static InvisibleLastSeenStatus b(String str) {
            InvisibleLastSeenStatus invisibleLastSeenStatus;
            String upperCase = str.toUpperCase(Locale.ROOT);
            InvisibleLastSeenStatus[] values = InvisibleLastSeenStatus.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    invisibleLastSeenStatus = null;
                    break;
                }
                invisibleLastSeenStatus = values[i];
                if (epx.f(invisibleLastSeenStatus.name(), upperCase)) {
                    break;
                }
                i++;
            }
            return invisibleLastSeenStatus == null ? InvisibleLastSeenStatus.NONE : invisibleLastSeenStatus;
        }
    }

    static {
        InvisibleLastSeenStatus invisibleLastSeenStatus = new InvisibleLastSeenStatus("NONE", 0, 0);
        NONE = invisibleLastSeenStatus;
        InvisibleLastSeenStatus invisibleLastSeenStatus2 = new InvisibleLastSeenStatus("RECENTLY", 1, -1);
        RECENTLY = invisibleLastSeenStatus2;
        InvisibleLastSeenStatus invisibleLastSeenStatus3 = new InvisibleLastSeenStatus("LAST_WEEK", 2, -2);
        LAST_WEEK = invisibleLastSeenStatus3;
        InvisibleLastSeenStatus invisibleLastSeenStatus4 = new InvisibleLastSeenStatus("LAST_MONTH", 3, -3);
        LAST_MONTH = invisibleLastSeenStatus4;
        InvisibleLastSeenStatus invisibleLastSeenStatus5 = new InvisibleLastSeenStatus("LONG_AGO", 4, -4);
        LONG_AGO = invisibleLastSeenStatus5;
        InvisibleLastSeenStatus invisibleLastSeenStatus6 = new InvisibleLastSeenStatus("NOT_SHOW", 5, -5);
        NOT_SHOW = invisibleLastSeenStatus6;
        InvisibleLastSeenStatus[] invisibleLastSeenStatusArr = {invisibleLastSeenStatus, invisibleLastSeenStatus2, invisibleLastSeenStatus3, invisibleLastSeenStatus4, invisibleLastSeenStatus5, invisibleLastSeenStatus6};
        $VALUES = invisibleLastSeenStatusArr;
        $ENTRIES = new asp(invisibleLastSeenStatusArr);
        Companion = new a();
        cache = new SparseArray<>(values().length);
    }

    public InvisibleLastSeenStatus(String str, int i, int i2) {
        this.id = i2;
    }

    public static InvisibleLastSeenStatus valueOf(String str) {
        return (InvisibleLastSeenStatus) Enum.valueOf(InvisibleLastSeenStatus.class, str);
    }

    public static InvisibleLastSeenStatus[] values() {
        return (InvisibleLastSeenStatus[]) $VALUES.clone();
    }

    public final int i() {
        return this.id;
    }
}
