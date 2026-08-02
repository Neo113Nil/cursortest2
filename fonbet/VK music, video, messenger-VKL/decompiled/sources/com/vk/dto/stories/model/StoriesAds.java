package com.vk.dto.stories.model;

import java.util.ArrayList;
import java.util.List;
import xsna.asp;
import xsna.shy;
import xsna.vu5;
import xsna.zrp;

/* compiled from: StoriesAds.kt */
/* loaded from: classes18.dex */
public final class StoriesAds {
    public final Settings a;
    public final ArrayList b;

    /* compiled from: StoriesAds.kt */
    public static final class Settings {
        public final IntervalType a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: StoriesAds.kt */
        public static final class IntervalType {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ IntervalType[] $VALUES;
            public static final IntervalType STORIES_AND_AUTHORS;
            public static final IntervalType STORIES_AND_AUTHORS_AND_TIME;
            public static final IntervalType TIME;

            static {
                IntervalType intervalType = new IntervalType("STORIES_AND_AUTHORS", 0);
                STORIES_AND_AUTHORS = intervalType;
                IntervalType intervalType2 = new IntervalType("TIME", 1);
                TIME = intervalType2;
                IntervalType intervalType3 = new IntervalType("STORIES_AND_AUTHORS_AND_TIME", 2);
                STORIES_AND_AUTHORS_AND_TIME = intervalType3;
                IntervalType[] intervalTypeArr = {intervalType, intervalType2, intervalType3};
                $VALUES = intervalTypeArr;
                $ENTRIES = new asp(intervalTypeArr);
            }

            public IntervalType() {
                throw null;
            }

            public static IntervalType valueOf(String str) {
                return (IntervalType) Enum.valueOf(IntervalType.class, str);
            }

            public static IntervalType[] values() {
                return (IntervalType[]) $VALUES.clone();
            }
        }

        public Settings(IntervalType intervalType, int i, int i2, int i3, int i4, int i5, int i6) {
            this.a = intervalType;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = i5;
            this.g = i6;
        }

        public final int a() {
            return this.g;
        }

        public final int b() {
            return this.d;
        }

        public final IntervalType c() {
            return this.a;
        }

        public final int d() {
            return this.f;
        }

        public final int e() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Settings)) {
                return false;
            }
            Settings settings = (Settings) obj;
            return this.a == settings.a && this.b == settings.b && this.c == settings.c && this.d == settings.d && this.e == settings.e && this.f == settings.f && this.g == settings.g;
        }

        public final int f() {
            return this.e;
        }

        public final int g() {
            return this.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.g) + shy.a(this.f, shy.a(this.e, shy.a(this.d, shy.a(this.c, shy.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Settings(intervalType=");
            sb.append(this.a);
            sb.append(", timeIntervalSec=");
            sb.append(this.b);
            sb.append(", storiesInterval=");
            sb.append(this.c);
            sb.append(", authorsInterval=");
            sb.append(this.d);
            sb.append(", timeInitSecs=");
            sb.append(this.e);
            sb.append(", storiesInitSecs=");
            sb.append(this.f);
            sb.append(", authorsInitSecs=");
            return vu5.b(sb, this.g, ')');
        }
    }

    public StoriesAds(Settings settings, ArrayList arrayList) {
        this.a = settings;
        this.b = arrayList;
    }

    public final Settings a() {
        return this.a;
    }

    public final List<StoriesContainer> b() {
        return this.b;
    }
}
