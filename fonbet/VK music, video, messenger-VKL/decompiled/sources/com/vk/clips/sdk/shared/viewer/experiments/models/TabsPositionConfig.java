package com.vk.clips.sdk.shared.viewer.experiments.models;

import xsna.asp;
import xsna.zrp;

/* compiled from: TabsPositionConfig.kt */
/* loaded from: classes17.dex */
public final class TabsPositionConfig {
    public final Position a;
    public final Position b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TabsPositionConfig.kt */
    public static final class Position {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Position[] $VALUES;
        public static final Position FIRST;
        public static final Position FOURTH;
        public static final Position LAST;
        public static final Position NONE;

        static {
            Position position = new Position("FIRST", 0);
            FIRST = position;
            Position position2 = new Position("FOURTH", 1);
            FOURTH = position2;
            Position position3 = new Position("LAST", 2);
            LAST = position3;
            Position position4 = new Position("NONE", 3);
            NONE = position4;
            Position[] positionArr = {position, position2, position3, position4};
            $VALUES = positionArr;
            $ENTRIES = new asp(positionArr);
        }

        public Position() {
            throw null;
        }

        public static Position valueOf(String str) {
            return (Position) Enum.valueOf(Position.class, str);
        }

        public static Position[] values() {
            return (Position[]) $VALUES.clone();
        }
    }

    /* compiled from: TabsPositionConfig.kt */
    public static final class a {
        public static TabsPositionConfig a() {
            return new TabsPositionConfig(Position.LAST, Position.NONE);
        }
    }

    public TabsPositionConfig(Position position, Position position2) {
        this.a = position;
        this.b = position2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabsPositionConfig)) {
            return false;
        }
        TabsPositionConfig tabsPositionConfig = (TabsPositionConfig) obj;
        return this.a == tabsPositionConfig.a && this.b == tabsPositionConfig.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TabsPositionConfig(myTabPosition=" + this.a + ", discoverTabPosition=" + this.b + ", isReversed=false)";
    }
}
