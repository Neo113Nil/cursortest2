package com.vk.newsfeed.api.posting.community;

import xsna.asp;
import xsna.epx;
import xsna.shy;
import xsna.vu5;
import xsna.zrp;

/* compiled from: PostingCountersModel.kt */
/* loaded from: classes3.dex */
public final class PostingCountersModel {
    public final a a;
    public final a b;
    public final b c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PostingCountersModel.kt */
    public static final class ClickActionType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ClickActionType[] $VALUES;
        public static final ClickActionType OPEN_DRAFTS;
        public static final ClickActionType OPEN_POSTPONED;
        public static final ClickActionType OPEN_SUGGESTED;
        public static final ClickActionType OPEN_UNPUBLISHED_MODAL;

        static {
            ClickActionType clickActionType = new ClickActionType("OPEN_POSTPONED", 0);
            OPEN_POSTPONED = clickActionType;
            ClickActionType clickActionType2 = new ClickActionType("OPEN_DRAFTS", 1);
            OPEN_DRAFTS = clickActionType2;
            ClickActionType clickActionType3 = new ClickActionType("OPEN_SUGGESTED", 2);
            OPEN_SUGGESTED = clickActionType3;
            ClickActionType clickActionType4 = new ClickActionType("OPEN_UNPUBLISHED_MODAL", 3);
            OPEN_UNPUBLISHED_MODAL = clickActionType4;
            ClickActionType[] clickActionTypeArr = {clickActionType, clickActionType2, clickActionType3, clickActionType4};
            $VALUES = clickActionTypeArr;
            $ENTRIES = new asp(clickActionTypeArr);
        }

        public ClickActionType() {
            throw null;
        }

        public static ClickActionType valueOf(String str) {
            return (ClickActionType) Enum.valueOf(ClickActionType.class, str);
        }

        public static ClickActionType[] values() {
            return (ClickActionType[]) $VALUES.clone();
        }
    }

    /* compiled from: PostingCountersModel.kt */
    public static final class a {
        public final String a;
        public final int b;
        public final ClickActionType c;

        public a(String str, int i, ClickActionType clickActionType) {
            this.a = str;
            this.b = i;
            this.c = clickActionType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + shy.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            return "CounterButton(title=" + this.a + ", count=" + this.b + ", action=" + this.c + ')';
        }
    }

    /* compiled from: PostingCountersModel.kt */
    public static final class b {
        public final int a;
        public final int b;
        public final int c;

        public b(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Counters(suggested=");
            sb.append(this.a);
            sb.append(", postponed=");
            sb.append(this.b);
            sb.append(", drafts=");
            return vu5.b(sb, this.c, ')');
        }
    }

    public PostingCountersModel(a aVar, a aVar2, b bVar) {
        this.a = aVar;
        this.b = aVar2;
        this.c = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostingCountersModel)) {
            return false;
        }
        PostingCountersModel postingCountersModel = (PostingCountersModel) obj;
        return epx.f(this.a, postingCountersModel.a) && epx.f(this.b, postingCountersModel.b) && epx.f(this.c, postingCountersModel.c);
    }

    public final int hashCode() {
        a aVar = this.a;
        int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        a aVar2 = this.b;
        return this.c.hashCode() + ((hashCode + (aVar2 != null ? aVar2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "PostingCountersModel(firstCounter=" + this.a + ", secondCounter=" + this.b + ", counters=" + this.c + ')';
    }
}
