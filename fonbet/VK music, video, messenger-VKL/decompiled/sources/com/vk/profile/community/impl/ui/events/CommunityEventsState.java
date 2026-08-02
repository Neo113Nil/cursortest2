package com.vk.profile.community.impl.ui.events;

import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import xsna.asp;
import xsna.epx;
import xsna.lm50;
import xsna.qoy;
import xsna.zrp;

/* compiled from: CommunityEventsState.kt */
/* loaded from: classes5.dex */
public final class CommunityEventsState implements lm50 {
    public final UserId b;
    public final Content c;

    /* compiled from: CommunityEventsState.kt */
    public interface Content {

        /* compiled from: CommunityEventsState.kt */
        public static final class Items implements Content {
            public final ArrayList a;
            public final boolean b;
            public final Paging c;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: CommunityEventsState.kt */
            public static final class Paging {
                private static final /* synthetic */ zrp $ENTRIES;
                private static final /* synthetic */ Paging[] $VALUES;
                public static final Paging Error;
                public static final Paging Loading;
                public static final Paging None;

                static {
                    Paging paging = new Paging("None", 0);
                    None = paging;
                    Paging paging2 = new Paging("Error", 1);
                    Error = paging2;
                    Paging paging3 = new Paging("Loading", 2);
                    Loading = paging3;
                    Paging[] pagingArr = {paging, paging2, paging3};
                    $VALUES = pagingArr;
                    $ENTRIES = new asp(pagingArr);
                }

                public Paging() {
                    throw null;
                }

                public static Paging valueOf(String str) {
                    return (Paging) Enum.valueOf(Paging.class, str);
                }

                public static Paging[] values() {
                    return (Paging[]) $VALUES.clone();
                }
            }

            public Items(ArrayList arrayList, boolean z, Paging paging) {
                this.a = arrayList;
                this.b = z;
                this.c = paging;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Items)) {
                    return false;
                }
                Items items = (Items) obj;
                return this.a.equals(items.a) && this.b == items.b && this.c == items.c;
            }

            public final int hashCode() {
                return this.c.hashCode() + qoy.b(this.a.hashCode() * 31, 31, this.b);
            }

            public final String toString() {
                return "Items(content=" + this.a + ", hasNextPage=" + this.b + ", paging=" + this.c + ')';
            }
        }

        /* compiled from: CommunityEventsState.kt */
        public static final class a implements Content {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1495722228;
            }

            public final String toString() {
                return "Empty";
            }
        }

        /* compiled from: CommunityEventsState.kt */
        public static final class b implements Content {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1495571513;
            }

            public final String toString() {
                return "Error";
            }
        }

        /* compiled from: CommunityEventsState.kt */
        public static final class c implements Content {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -909508805;
            }

            public final String toString() {
                return "Loading";
            }
        }
    }

    public CommunityEventsState(UserId userId, Content content) {
        this.b = userId;
        this.c = content;
    }

    public static CommunityEventsState a(CommunityEventsState communityEventsState, Content content) {
        UserId userId = communityEventsState.b;
        communityEventsState.getClass();
        return new CommunityEventsState(userId, content);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommunityEventsState)) {
            return false;
        }
        CommunityEventsState communityEventsState = (CommunityEventsState) obj;
        return epx.f(this.b, communityEventsState.b) && epx.f(this.c, communityEventsState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b.b) * 31);
    }

    public final String toString() {
        return "CommunityEventsState(groupId=" + this.b + ", content=" + this.c + ')';
    }
}
