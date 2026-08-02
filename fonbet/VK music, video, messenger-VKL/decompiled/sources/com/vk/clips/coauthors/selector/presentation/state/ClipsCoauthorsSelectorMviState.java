package com.vk.clips.coauthors.selector.presentation.state;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.clips.coauthors.domain.model.ClipsCoauthorSelectorUserItem;
import com.vk.clips.coauthors.domain.model.ClipsCoauthorsException;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptySet;
import xsna.bh10;
import xsna.epx;
import xsna.fw3;
import xsna.km50;
import xsna.nr;
import xsna.qoy;
import xsna.shy;
import xsna.uqi;
import xsna.zcl;

/* compiled from: ClipsCoauthorsSelectorMviState.kt */
/* loaded from: classes16.dex */
public interface ClipsCoauthorsSelectorMviState extends km50 {

    /* compiled from: ClipsCoauthorsSelectorMviState.kt */
    public interface Consumer extends Parcelable {

        /* compiled from: ClipsCoauthorsSelectorMviState.kt */
        public static final class Clips implements Consumer {
            public static final Parcelable.Creator<Clips> CREATOR = new a();
            public final Integer b;

            /* compiled from: ClipsCoauthorsSelectorMviState.kt */
            public static final class a implements Parcelable.Creator<Clips> {
                @Override // android.os.Parcelable.Creator
                public final Clips createFromParcel(Parcel parcel) {
                    return new Clips(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                }

                @Override // android.os.Parcelable.Creator
                public final Clips[] newArray(int i) {
                    return new Clips[i];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Clips() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Clips) && epx.f(this.b, ((Clips) obj).b);
            }

            public final int hashCode() {
                Integer num = this.b;
                if (num == null) {
                    return 0;
                }
                return num.hashCode();
            }

            public final String toString() {
                return uqi.b(new StringBuilder("Clips(videoId="), this.b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                Integer num = this.b;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    nr.a(parcel, 1, num);
                }
            }

            public Clips(Integer num) {
                this.b = num;
            }

            public /* synthetic */ Clips(Integer num, int i, zcl zclVar) {
                this((i & 1) != 0 ? null : num);
            }
        }

        /* compiled from: ClipsCoauthorsSelectorMviState.kt */
        public static final class Posting implements Consumer {
            public static final Posting b = new Posting();
            public static final Parcelable.Creator<Posting> CREATOR = new a();

            /* compiled from: ClipsCoauthorsSelectorMviState.kt */
            public static final class a implements Parcelable.Creator<Posting> {
                @Override // android.os.Parcelable.Creator
                public final Posting createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Posting.b;
                }

                @Override // android.os.Parcelable.Creator
                public final Posting[] newArray(int i) {
                    return new Posting[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }
    }

    /* compiled from: ClipsCoauthorsSelectorMviState.kt */
    public static final class a implements ClipsCoauthorsSelectorMviState {
        public final String b;
        public final Set<ClipsCoauthorSelectorUserItem> c;
        public final UserId d;
        public final boolean e;
        public final ClipsCoauthorsException f;
        public final Consumer g;

        public a(String str, Set<ClipsCoauthorSelectorUserItem> set, UserId userId, boolean z, ClipsCoauthorsException clipsCoauthorsException, Consumer consumer) {
            this.b = str;
            this.c = set;
            this.d = userId;
            this.e = z;
            this.f = clipsCoauthorsException;
            this.g = consumer;
        }

        public static a a(a aVar, Set set, ClipsCoauthorsException clipsCoauthorsException, int i) {
            String str = aVar.b;
            if ((i & 2) != 0) {
                set = aVar.c;
            }
            Set set2 = set;
            UserId userId = aVar.d;
            boolean z = aVar.e;
            if ((i & 16) != 0) {
                clipsCoauthorsException = aVar.f;
            }
            Consumer consumer = aVar.g;
            aVar.getClass();
            return new a(str, set2, userId, z, clipsCoauthorsException, consumer);
        }

        @Override // com.vk.clips.coauthors.selector.presentation.state.ClipsCoauthorsSelectorMviState
        public final UserId C() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && this.e == aVar.e && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g);
        }

        public final int hashCode() {
            return this.g.hashCode() + ((this.f.hashCode() + qoy.b(bh10.a(fw3.b(this.b.hashCode() * 31, 31, this.c), 31, this.d.b), 31, this.e)) * 31);
        }

        @Override // com.vk.clips.coauthors.selector.presentation.state.ClipsCoauthorsSelectorMviState
        public final Consumer j() {
            return this.g;
        }

        @Override // com.vk.clips.coauthors.selector.presentation.state.ClipsCoauthorsSelectorMviState
        public final boolean l() {
            return this.e;
        }

        @Override // com.vk.clips.coauthors.selector.presentation.state.ClipsCoauthorsSelectorMviState
        public final String n() {
            return this.b;
        }

        public final String toString() {
            return "Error(searchQueryState=" + this.b + ", selectedItems=" + this.c + ", authorId=" + this.d + ", canRemoveAll=" + this.e + ", error=" + this.f + ", consumer=" + this.g + ')';
        }

        @Override // com.vk.clips.coauthors.selector.presentation.state.ClipsCoauthorsSelectorMviState
        public final Set<ClipsCoauthorSelectorUserItem> u() {
            return this.c;
        }
    }

    /* compiled from: ClipsCoauthorsSelectorMviState.kt */
    public static final class b implements ClipsCoauthorsSelectorMviState {
        public static final b b = new b();
        public static final Consumer.Clips c = new Consumer.Clips(null, 1, 0 == true ? 1 : 0);
        public static final String d = "";
        public static final EmptySet e = EmptySet.b;
        public static final UserId f = UserId.d;

        @Override // com.vk.clips.coauthors.selector.presentation.state.ClipsCoauthorsSelectorMviState
        public final UserId C() {
            return f;
        }

        @Override // com.vk.clips.coauthors.selector.presentation.state.ClipsCoauthorsSelectorMviState
        public final Consumer j() {
            return c;
        }

        @Override // com.vk.clips.coauthors.selector.presentation.state.ClipsCoauthorsSelectorMviState
        public final boolean l() {
            return false;
        }

        @Override // com.vk.clips.coauthors.selector.presentation.state.ClipsCoauthorsSelectorMviState
        public final String n() {
            return d;
        }

        @Override // com.vk.clips.coauthors.selector.presentation.state.ClipsCoauthorsSelectorMviState
        public final Set<ClipsCoauthorSelectorUserItem> u() {
            return e;
        }
    }

    /* compiled from: ClipsCoauthorsSelectorMviState.kt */
    public static final class d implements ClipsCoauthorsSelectorMviState {
        public final String b;
        public final Set<ClipsCoauthorSelectorUserItem> c;
        public final UserId d;
        public final boolean e;
        public final Consumer f;

        public d(String str, Set<ClipsCoauthorSelectorUserItem> set, UserId userId, boolean z, Consumer consumer) {
            this.b = str;
            this.c = set;
            this.d = userId;
            this.e = z;
            this.f = consumer;
        }

        public static d a(d dVar, String str, Set set, int i) {
            if ((i & 1) != 0) {
                str = dVar.b;
            }
            String str2 = str;
            if ((i & 2) != 0) {
                set = dVar.c;
            }
            UserId userId = dVar.d;
            boolean z = dVar.e;
            Consumer consumer = dVar.f;
            dVar.getClass();
            return new d(str2, set, userId, z, consumer);
        }

        @Override // com.vk.clips.coauthors.selector.presentation.state.ClipsCoauthorsSelectorMviState
        public final UserId C() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c) && epx.f(this.d, dVar.d) && this.e == dVar.e && epx.f(this.f, dVar.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + qoy.b(bh10.a(fw3.b(this.b.hashCode() * 31, 31, this.c), 31, this.d.b), 31, this.e);
        }

        @Override // com.vk.clips.coauthors.selector.presentation.state.ClipsCoauthorsSelectorMviState
        public final Consumer j() {
            return this.f;
        }

        @Override // com.vk.clips.coauthors.selector.presentation.state.ClipsCoauthorsSelectorMviState
        public final boolean l() {
            return this.e;
        }

        @Override // com.vk.clips.coauthors.selector.presentation.state.ClipsCoauthorsSelectorMviState
        public final String n() {
            return this.b;
        }

        public final String toString() {
            return "Loading(searchQueryState=" + this.b + ", selectedItems=" + this.c + ", authorId=" + this.d + ", canRemoveAll=" + this.e + ", consumer=" + this.f + ')';
        }

        @Override // com.vk.clips.coauthors.selector.presentation.state.ClipsCoauthorsSelectorMviState
        public final Set<ClipsCoauthorSelectorUserItem> u() {
            return this.c;
        }
    }

    UserId C();

    Consumer j();

    boolean l();

    String n();

    Set<ClipsCoauthorSelectorUserItem> u();

    /* compiled from: ClipsCoauthorsSelectorMviState.kt */
    public static final class c implements ClipsCoauthorsSelectorMviState {
        public final String b;
        public final Set<ClipsCoauthorSelectorUserItem> c;
        public final UserId d;
        public final boolean e;
        public final int f;
        public final List<ClipsCoauthorSelectorUserItem> g;
        public final boolean h;
        public final a i;
        public final boolean j;
        public final Consumer k;

        /* compiled from: ClipsCoauthorsSelectorMviState.kt */
        public interface a {

            /* compiled from: ClipsCoauthorsSelectorMviState.kt */
            /* renamed from: com.vk.clips.coauthors.selector.presentation.state.ClipsCoauthorsSelectorMviState$c$a$a, reason: collision with other inner class name */
            public static final class C0552a implements a {
                public static final C0552a a = new C0552a();
            }

            /* compiled from: ClipsCoauthorsSelectorMviState.kt */
            public static final class b implements a {
                public static final b a = new b();
            }

            /* compiled from: ClipsCoauthorsSelectorMviState.kt */
            /* renamed from: com.vk.clips.coauthors.selector.presentation.state.ClipsCoauthorsSelectorMviState$c$a$c, reason: collision with other inner class name */
            public static final class C0553c implements a {
                public static final C0553c a = new C0553c();
            }

            /* compiled from: ClipsCoauthorsSelectorMviState.kt */
            public static final class d implements a {
                public static final d a = new d();
            }
        }

        public c(String str, Set<ClipsCoauthorSelectorUserItem> set, UserId userId, boolean z, int i, List<ClipsCoauthorSelectorUserItem> list, boolean z2, a aVar, boolean z3, Consumer consumer) {
            this.b = str;
            this.c = set;
            this.d = userId;
            this.e = z;
            this.f = i;
            this.g = list;
            this.h = z2;
            this.i = aVar;
            this.j = z3;
            this.k = consumer;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static c a(c cVar, Set set, int i, ArrayList arrayList, a aVar, boolean z, int i2) {
            String str = cVar.b;
            if ((i2 & 2) != 0) {
                set = cVar.c;
            }
            Set set2 = set;
            UserId userId = cVar.d;
            boolean z2 = cVar.e;
            if ((i2 & 16) != 0) {
                i = cVar.f;
            }
            int i3 = i;
            List list = arrayList;
            if ((i2 & 32) != 0) {
                list = cVar.g;
            }
            List list2 = list;
            boolean z3 = (i2 & 64) != 0 ? cVar.h : true;
            a aVar2 = (i2 & 128) != 0 ? cVar.i : aVar;
            boolean z4 = (i2 & 256) != 0 ? cVar.j : z;
            Consumer consumer = cVar.k;
            cVar.getClass();
            return new c(str, set2, userId, z2, i3, list2, z3, aVar2, z4, consumer);
        }

        @Override // com.vk.clips.coauthors.selector.presentation.state.ClipsCoauthorsSelectorMviState
        public final UserId C() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d) && this.e == cVar.e && this.f == cVar.f && epx.f(this.g, cVar.g) && this.h == cVar.h && epx.f(this.i, cVar.i) && this.j == cVar.j && epx.f(this.k, cVar.k);
        }

        public final int hashCode() {
            return this.k.hashCode() + qoy.b((this.i.hashCode() + qoy.b(fw3.a(shy.a(this.f, qoy.b(bh10.a(fw3.b(this.b.hashCode() * 31, 31, this.c), 31, this.d.b), 31, this.e), 31), 31, this.g), 31, this.h)) * 31, 31, this.j);
        }

        @Override // com.vk.clips.coauthors.selector.presentation.state.ClipsCoauthorsSelectorMviState
        public final Consumer j() {
            return this.k;
        }

        @Override // com.vk.clips.coauthors.selector.presentation.state.ClipsCoauthorsSelectorMviState
        public final boolean l() {
            return this.e;
        }

        @Override // com.vk.clips.coauthors.selector.presentation.state.ClipsCoauthorsSelectorMviState
        public final String n() {
            return this.b;
        }

        public final String toString() {
            return "Loaded(searchQueryState=" + this.b + ", selectedItems=" + this.c + ", authorId=" + this.d + ", canRemoveAll=" + this.e + ", totalCount=" + this.f + ", loadedItems=" + this.g + ", queryActive=" + this.h + ", loadingState=" + this.i + ", newPageLoading=" + this.j + ", consumer=" + this.k + ')';
        }

        @Override // com.vk.clips.coauthors.selector.presentation.state.ClipsCoauthorsSelectorMviState
        public final Set<ClipsCoauthorSelectorUserItem> u() {
            return this.c;
        }

        public /* synthetic */ c(String str, Set set, UserId userId, boolean z, int i, ArrayList arrayList, Consumer consumer, int i2) {
            this(str, set, userId, z, i, arrayList, (i2 & 64) == 0, a.d.a, false, consumer);
        }
    }
}
