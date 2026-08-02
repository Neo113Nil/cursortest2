package com.vk.clips.coauthors.selector.presentation.state;

import com.vk.clips.coauthors.domain.model.ClipsCoauthorSelectorUserItem;
import com.vk.clips.coauthors.domain.model.ClipsCoauthorsException;
import com.vk.clips.coauthors.selector.presentation.state.ClipsCoauthorsSelectorMviState;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.internal.operators.mixed.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import xsna.air;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.gp;
import xsna.ms9;
import xsna.qoy;
import xsna.qr;
import xsna.vby;
import xsna.vu5;
import xsna.xl50;
import xsna.zrp;

/* compiled from: ClipsCoauthorsSelectorPatch.kt */
/* loaded from: classes16.dex */
public interface ClipsCoauthorsSelectorPatch extends xl50 {

    /* compiled from: ClipsCoauthorsSelectorPatch.kt */
    public static final class ChangeUserSelection implements ClipsCoauthorsSelectorPatch {
        public final UserId b;
        public final Action c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ClipsCoauthorsSelectorPatch.kt */
        public static final class Action {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Action[] $VALUES;
            public static final Action Add;
            public static final Action Remove;

            static {
                Action action = new Action("Add", 0);
                Add = action;
                Action action2 = new Action("Remove", 1);
                Remove = action2;
                Action[] actionArr = {action, action2};
                $VALUES = actionArr;
                $ENTRIES = new asp(actionArr);
            }

            public Action() {
                throw null;
            }

            public static Action valueOf(String str) {
                return (Action) Enum.valueOf(Action.class, str);
            }

            public static Action[] values() {
                return (Action[]) $VALUES.clone();
            }
        }

        public ChangeUserSelection(UserId userId, Action action) {
            this.b = userId;
            this.c = action;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChangeUserSelection)) {
                return false;
            }
            ChangeUserSelection changeUserSelection = (ChangeUserSelection) obj;
            return epx.f(this.b, changeUserSelection.b) && this.c == changeUserSelection.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + (Long.hashCode(this.b.b) * 31);
        }

        public final String toString() {
            return "ChangeUserSelection(userId=" + this.b + ", action=" + this.c + ')';
        }
    }

    /* compiled from: ClipsCoauthorsSelectorPatch.kt */
    public interface a extends ClipsCoauthorsSelectorPatch {

        /* compiled from: ClipsCoauthorsSelectorPatch.kt */
        /* renamed from: com.vk.clips.coauthors.selector.presentation.state.ClipsCoauthorsSelectorPatch$a$a, reason: collision with other inner class name */
        public static final class C0554a implements a {
            public static final C0554a b = new C0554a();
        }

        /* compiled from: ClipsCoauthorsSelectorPatch.kt */
        public static final class b implements a {
            public static final b b = new b();
        }

        /* compiled from: ClipsCoauthorsSelectorPatch.kt */
        public static final class c implements a {
            public static final c b = new c();
        }

        /* compiled from: ClipsCoauthorsSelectorPatch.kt */
        public static final class d implements a {
            public static final d b = new d();
        }
    }

    /* compiled from: ClipsCoauthorsSelectorPatch.kt */
    @vby
    public static final class b implements ClipsCoauthorsSelectorPatch {
        public final ClipsCoauthorsException b;

        public /* synthetic */ b(ClipsCoauthorsException clipsCoauthorsException) {
            this.b = clipsCoauthorsException;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return epx.f(this.b, ((b) obj).b);
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SetError(error=" + this.b + ')';
        }
    }

    /* compiled from: ClipsCoauthorsSelectorPatch.kt */
    public static final class c implements ClipsCoauthorsSelectorPatch {
        public final Set<ClipsCoauthorSelectorUserItem> b;
        public final ArrayList c;
        public final UserId d;
        public final boolean e;
        public final int f;

        public c(Set set, ArrayList arrayList, UserId userId, boolean z, int i) {
            this.b = set;
            this.c = arrayList;
            this.d = userId;
            this.e = z;
            this.f = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.b, cVar.b) && this.c.equals(cVar.c) && epx.f(this.d, cVar.d) && this.e == cVar.e && this.f == cVar.f;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f) + qoy.b(bh10.a(qr.a(this.c, this.b.hashCode() * 31, 31), 31, this.d.b), 31, this.e);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SetInitialData(selectedItems=");
            sb.append(this.b);
            sb.append(", recommendedItems=");
            sb.append(this.c);
            sb.append(", authorId=");
            sb.append(this.d);
            sb.append(", canRemoveAll=");
            sb.append(this.e);
            sb.append(", totalCount=");
            return vu5.b(sb, this.f, ')');
        }
    }

    /* compiled from: ClipsCoauthorsSelectorPatch.kt */
    public static final class d implements ClipsCoauthorsSelectorPatch {
        public final Set<ClipsCoauthorSelectorUserItem> b;
        public final boolean c;
        public final ClipsCoauthorsSelectorMviState.Consumer d;
        public final UserId e;

        public d(Set<ClipsCoauthorSelectorUserItem> set, boolean z, ClipsCoauthorsSelectorMviState.Consumer consumer, UserId userId) {
            this.b = set;
            this.c = z;
            this.d = consumer;
            this.e = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.b, dVar.b) && this.c == dVar.c && epx.f(this.d, dVar.d) && epx.f(this.e, dVar.e);
        }

        public final int hashCode() {
            return Long.hashCode(this.e.b) + ((this.d.hashCode() + qoy.b(this.b.hashCode() * 31, 31, this.c)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SetInitialLoading(selectedItems=");
            sb.append(this.b);
            sb.append(", canRemoveAll=");
            sb.append(this.c);
            sb.append(", consumer=");
            sb.append(this.d);
            sb.append(", authorId=");
            return gp.b(sb, this.e, ')');
        }
    }

    /* compiled from: ClipsCoauthorsSelectorPatch.kt */
    public static final class e implements ClipsCoauthorsSelectorPatch {
        public final ArrayList b;
        public final int c;

        public e(ArrayList arrayList, int i) {
            this.b = arrayList;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.b.equals(eVar.b) && this.c == eVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SetLoaded(queryItems=");
            sb.append(this.b);
            sb.append(", totalCount=");
            return vu5.b(sb, this.c, ')');
        }
    }

    /* compiled from: ClipsCoauthorsSelectorPatch.kt */
    public static final class f implements ClipsCoauthorsSelectorPatch {
        public static final f b = new f();
    }

    /* compiled from: ClipsCoauthorsSelectorPatch.kt */
    public static final class g implements ClipsCoauthorsSelectorPatch {
        public final ArrayList b;

        public g(ArrayList arrayList) {
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.b.equals(((g) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return j.b(')', new StringBuilder("SetRecommended(items="), this.b);
        }
    }

    /* compiled from: ClipsCoauthorsSelectorPatch.kt */
    @vby
    public static final class h implements ClipsCoauthorsSelectorPatch {
        public final String b;

        public final boolean equals(Object obj) {
            if (obj instanceof h) {
                return epx.f(this.b, ((h) obj).b);
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return air.b(')', "UpdateInput(newInput=", this.b);
        }
    }

    /* compiled from: ClipsCoauthorsSelectorPatch.kt */
    public static final class i implements ClipsCoauthorsSelectorPatch {
        public final List<ClipsCoauthorSelectorUserItem> b;

        public i(List<ClipsCoauthorSelectorUserItem> list) {
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && epx.f(this.b, ((i) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("UpdateLoaded(queryItems="), this.b);
        }
    }
}
