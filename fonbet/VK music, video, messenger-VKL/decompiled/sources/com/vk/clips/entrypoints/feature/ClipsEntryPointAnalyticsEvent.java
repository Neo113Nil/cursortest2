package com.vk.clips.entrypoints.feature;

import xsna.asp;
import xsna.zrp;

/* compiled from: ClipsEntryPointAnalyticsEvent.kt */
/* loaded from: classes16.dex */
public interface ClipsEntryPointAnalyticsEvent {

    /* compiled from: ClipsEntryPointAnalyticsEvent.kt */
    public static final class TabSelectedEvent implements ClipsEntryPointAnalyticsEvent {
        public final EntryPointTabType a;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ClipsEntryPointAnalyticsEvent.kt */
        public static final class EntryPointTabType {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ EntryPointTabType[] $VALUES;
            public static final EntryPointTabType DRAFTS;
            public static final EntryPointTabType GALLERY;
            public static final EntryPointTabType TEMPLATES;
            public static final EntryPointTabType TRENDS;

            static {
                EntryPointTabType entryPointTabType = new EntryPointTabType("GALLERY", 0);
                GALLERY = entryPointTabType;
                EntryPointTabType entryPointTabType2 = new EntryPointTabType("DRAFTS", 1);
                DRAFTS = entryPointTabType2;
                EntryPointTabType entryPointTabType3 = new EntryPointTabType("TEMPLATES", 2);
                TEMPLATES = entryPointTabType3;
                EntryPointTabType entryPointTabType4 = new EntryPointTabType("TRENDS", 3);
                TRENDS = entryPointTabType4;
                EntryPointTabType[] entryPointTabTypeArr = {entryPointTabType, entryPointTabType2, entryPointTabType3, entryPointTabType4};
                $VALUES = entryPointTabTypeArr;
                $ENTRIES = new asp(entryPointTabTypeArr);
            }

            public EntryPointTabType() {
                throw null;
            }

            public static EntryPointTabType valueOf(String str) {
                return (EntryPointTabType) Enum.valueOf(EntryPointTabType.class, str);
            }

            public static EntryPointTabType[] values() {
                return (EntryPointTabType[]) $VALUES.clone();
            }
        }

        public TabSelectedEvent(EntryPointTabType entryPointTabType) {
            this.a = entryPointTabType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TabSelectedEvent) && this.a == ((TabSelectedEvent) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "TabSelectedEvent(tabType=" + this.a + ')';
        }
    }
}
