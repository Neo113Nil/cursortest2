package com.vk.newsfeed.impl.posting.settings.mvi;

import com.vk.posting.domain.PostingMetricsCreationEntryPoint;
import defpackage.q0;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.km50;
import xsna.qoy;
import xsna.vu5;
import xsna.zrp;

/* compiled from: PostingSettingsState.kt */
/* loaded from: classes4.dex */
public final class PostingSettingsState implements km50 {
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final b i;
    public final d j;
    public final f k;
    public final e l;
    public final boolean m;
    public final c n;
    public final a o;
    public final PostingMetricsCreationEntryPoint p;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PostingSettingsState.kt */
    public static final class CommentsGlobalState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CommentsGlobalState[] $VALUES;
        public static final CommentsGlobalState CLOSED_BY_REPLIES_SETTINGS;
        public static final CommentsGlobalState CLOSED_BY_WALL_SETTINGS;
        public static final CommentsGlobalState OPEN;
        public static final CommentsGlobalState OPEN_JUST_MOMENT_AGO;

        static {
            CommentsGlobalState commentsGlobalState = new CommentsGlobalState("CLOSED_BY_WALL_SETTINGS", 0);
            CLOSED_BY_WALL_SETTINGS = commentsGlobalState;
            CommentsGlobalState commentsGlobalState2 = new CommentsGlobalState("CLOSED_BY_REPLIES_SETTINGS", 1);
            CLOSED_BY_REPLIES_SETTINGS = commentsGlobalState2;
            CommentsGlobalState commentsGlobalState3 = new CommentsGlobalState("OPEN", 2);
            OPEN = commentsGlobalState3;
            CommentsGlobalState commentsGlobalState4 = new CommentsGlobalState("OPEN_JUST_MOMENT_AGO", 3);
            OPEN_JUST_MOMENT_AGO = commentsGlobalState4;
            CommentsGlobalState[] commentsGlobalStateArr = {commentsGlobalState, commentsGlobalState2, commentsGlobalState3, commentsGlobalState4};
            $VALUES = commentsGlobalStateArr;
            $ENTRIES = new asp(commentsGlobalStateArr);
        }

        public CommentsGlobalState() {
            throw null;
        }

        public static CommentsGlobalState valueOf(String str) {
            return (CommentsGlobalState) Enum.valueOf(CommentsGlobalState.class, str);
        }

        public static CommentsGlobalState[] values() {
            return (CommentsGlobalState[]) $VALUES.clone();
        }
    }

    /* compiled from: PostingSettingsState.kt */
    public static final class a implements km50 {
        public final String b;
        public final Boolean c;
        public final String d;

        public a(String str, Boolean bool, String str2) {
            this.b = str;
            this.c = bool;
            this.d = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            String str = this.b;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.c;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            String str2 = this.d;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AdvertisingOrd(predId=");
            sb.append(this.b);
            sb.append(", isAddAdvertisingOrd=");
            sb.append(this.c);
            sb.append(", erId=");
            return ho8.a(sb, this.d, ')');
        }
    }

    /* compiled from: PostingSettingsState.kt */
    public static final class b implements km50 {
        public final CommentsGlobalState b;
        public final boolean c;
        public final boolean d;

        public b(CommentsGlobalState commentsGlobalState, boolean z, boolean z2) {
            this.b = commentsGlobalState;
            this.c = z;
            this.d = z2;
        }

        public static b a(b bVar, CommentsGlobalState commentsGlobalState, boolean z, boolean z2, int i) {
            if ((i & 1) != 0) {
                commentsGlobalState = bVar.b;
            }
            if ((i & 2) != 0) {
                z = bVar.c;
            }
            if ((i & 4) != 0) {
                z2 = bVar.d;
            }
            bVar.getClass();
            return new b(commentsGlobalState, z, z2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.b == bVar.b && this.c == bVar.c && this.d == bVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + qoy.b(this.b.hashCode() * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CommentsState(commentsGlobalState=");
            sb.append(this.b);
            sb.append(", isChecked=");
            sb.append(this.c);
            sb.append(", isActive=");
            return q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: PostingSettingsState.kt */
    public static final class c implements km50 {
        public final boolean b;

        public c(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.b == ((c) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("HideNameState(nameIsHide="), this.b, ')');
        }
    }

    /* compiled from: PostingSettingsState.kt */
    public static final class d implements km50 {
        public final boolean b;

        public d(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.b == ((d) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("NotificationsState(isChecked="), this.b, ')');
        }
    }

    /* compiled from: PostingSettingsState.kt */
    public static final class e implements km50 {
        public final String b;

        public e(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
        }

        public final int hashCode() {
            String str = this.b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("PostSourceState(sourceLink="), this.b, ')');
        }
    }

    /* compiled from: PostingSettingsState.kt */
    public static final class f implements km50 {
        public final boolean b;
        public final boolean c;
        public final long d;

        public f(long j, boolean z, boolean z2) {
            this.b = z;
            this.c = z2;
            this.d = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.b == fVar.b && this.c == fVar.c && this.d == fVar.d;
        }

        public final int hashCode() {
            return Long.hashCode(this.d) + qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PostingTimeState(isAllowToShow=");
            sb.append(this.b);
            sb.append(", isPostponePostEditing=");
            sb.append(this.c);
            sb.append(", timestamp=");
            return vu5.a(')', this.d, sb);
        }
    }

    public PostingSettingsState(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, long j, b bVar, d dVar, f fVar, e eVar, boolean z7, c cVar, a aVar, PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = j;
        this.i = bVar;
        this.j = dVar;
        this.k = fVar;
        this.l = eVar;
        this.m = z7;
        this.n = cVar;
        this.o = aVar;
        this.p = postingMetricsCreationEntryPoint;
    }

    public static PostingSettingsState a(PostingSettingsState postingSettingsState, b bVar, d dVar, f fVar, e eVar, c cVar, a aVar, int i) {
        boolean z = postingSettingsState.b;
        boolean z2 = postingSettingsState.c;
        boolean z3 = postingSettingsState.d;
        boolean z4 = postingSettingsState.e;
        boolean z5 = postingSettingsState.f;
        boolean z6 = postingSettingsState.g;
        long j = postingSettingsState.h;
        b bVar2 = (i & 128) != 0 ? postingSettingsState.i : bVar;
        d dVar2 = (i & 256) != 0 ? postingSettingsState.j : dVar;
        f fVar2 = (i & 512) != 0 ? postingSettingsState.k : fVar;
        e eVar2 = (i & 1024) != 0 ? postingSettingsState.l : eVar;
        boolean z7 = postingSettingsState.m;
        c cVar2 = (i & 4096) != 0 ? postingSettingsState.n : cVar;
        a aVar2 = (i & 8192) != 0 ? postingSettingsState.o : aVar;
        PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint = postingSettingsState.p;
        postingSettingsState.getClass();
        return new PostingSettingsState(z, z2, z3, z4, z5, z6, j, bVar2, dVar2, fVar2, eVar2, z7, cVar2, aVar2, postingMetricsCreationEntryPoint);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostingSettingsState)) {
            return false;
        }
        PostingSettingsState postingSettingsState = (PostingSettingsState) obj;
        return this.b == postingSettingsState.b && this.c == postingSettingsState.c && this.d == postingSettingsState.d && this.e == postingSettingsState.e && this.f == postingSettingsState.f && this.g == postingSettingsState.g && this.h == postingSettingsState.h && epx.f(this.i, postingSettingsState.i) && epx.f(this.j, postingSettingsState.j) && epx.f(this.k, postingSettingsState.k) && epx.f(this.l, postingSettingsState.l) && this.m == postingSettingsState.m && epx.f(this.n, postingSettingsState.n) && epx.f(this.o, postingSettingsState.o) && this.p == postingSettingsState.p;
    }

    public final int hashCode() {
        return this.p.hashCode() + ((this.o.hashCode() + qoy.b(qoy.b((this.l.hashCode() + ((this.k.hashCode() + qoy.b((this.i.hashCode() + bh10.a(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h)) * 31, 31, this.j.b)) * 31)) * 31, 31, this.m), 31, this.n.b)) * 31);
    }

    public final String toString() {
        return "PostingSettingsState(authorIsUser=" + this.b + ", isSuggested=" + this.c + ", isAdmin=" + this.d + ", isOpenFromGroup=" + this.e + ", isCopyrightEnabled=" + this.f + ", groupIsPublic=" + this.g + ", groupId=" + this.h + ", commentsState=" + this.i + ", notificationsState=" + this.j + ", postingTimeState=" + this.k + ", postSourceState=" + this.l + ", isEditMode=" + this.m + ", hideNameState=" + this.n + ", advertisingOrd=" + this.o + ", creationEntryPoint=" + this.p + ')';
    }
}
