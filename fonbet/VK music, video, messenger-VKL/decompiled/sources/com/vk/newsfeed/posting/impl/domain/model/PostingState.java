package com.vk.newsfeed.posting.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.core.serialize.Serializer;
import com.vk.newsfeed.posting.impl.presentation.model.PostingGroupInfo;
import com.vk.newsfeed.posting.impl.presentation.model.PostingSettings;
import com.vk.newsfeed.posting.mentions.PostingMentionState;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.ao;
import xsna.bo;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.km50;
import xsna.ms9;
import xsna.qoy;
import xsna.zcl;

/* compiled from: PostingState.kt */
/* loaded from: classes4.dex */
public interface PostingState extends km50, Parcelable {
    List<PostingAction> D7();

    List<Pair<PostingAction, WaitingActionTrigger>> I8();

    PostEditingReason J7();

    NearbyPlaces R9();

    PostingScreenContext V4();

    PostingNavigationState a9();

    boolean fb();

    PostingContext getContext();

    List<PostingAction> p9();

    PostingTechMetrics q1();

    PostingSettings x();

    MediaPickerState z6();

    /* compiled from: PostingState.kt */
    public static final class Loading implements PostingState, Parcelable {
        public static final Parcelable.Creator<Loading> CREATOR = new a();
        public final PostingScreenContext b;
        public final PostingContext c;
        public final MediaPickerState d;
        public final PostingSettings e;
        public final NearbyPlaces f;
        public final PostingNavigationState g;
        public final PostEditingReason h;
        public final LoadingState i;
        public final boolean j;
        public final boolean k;
        public final List<Pair<PostingAction, WaitingActionTrigger>> l;
        public final List<PostingAction> m;
        public final List<PostingAction> n;
        public final PostingTechMetrics o;
        public final List<PostingGroupInfo> p;

        /* compiled from: PostingState.kt */
        public static final class a implements Parcelable.Creator<Loading> {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.os.Parcelable.Creator
            public final Loading createFromParcel(Parcel parcel) {
                int i;
                PostingScreenContext createFromParcel = PostingScreenContext.CREATOR.createFromParcel(parcel);
                PostingContext createFromParcel2 = PostingContext.CREATOR.createFromParcel(parcel);
                MediaPickerState createFromParcel3 = MediaPickerState.CREATOR.createFromParcel(parcel);
                PostingSettings createFromParcel4 = PostingSettings.CREATOR.createFromParcel(parcel);
                NearbyPlaces createFromParcel5 = NearbyPlaces.CREATOR.createFromParcel(parcel);
                PostingNavigationState createFromParcel6 = PostingNavigationState.CREATOR.createFromParcel(parcel);
                PostEditingReason postEditingReason = (PostEditingReason) parcel.readParcelable(Loading.class.getClassLoader());
                LoadingState createFromParcel7 = LoadingState.CREATOR.createFromParcel(parcel);
                boolean z = false;
                if (parcel.readInt() != 0) {
                    i = 0;
                    z = true;
                } else {
                    i = 0;
                }
                int i2 = parcel.readInt() != 0 ? 1 : i;
                int readInt = parcel.readInt();
                boolean z2 = i2;
                ArrayList arrayList = new ArrayList(readInt);
                while (i != readInt) {
                    arrayList.add(parcel.readSerializable());
                    i++;
                }
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = bo.b(Loading.class, parcel, arrayList2, i3, 1);
                    readInt2 = readInt2;
                }
                int readInt3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt3);
                int i4 = 0;
                while (i4 != readInt3) {
                    i4 = bo.b(Loading.class, parcel, arrayList3, i4, 1);
                }
                PostingTechMetrics createFromParcel8 = PostingTechMetrics.CREATOR.createFromParcel(parcel);
                int readInt4 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt4);
                int i5 = 0;
                while (true) {
                    PostingTechMetrics postingTechMetrics = createFromParcel8;
                    if (i5 == readInt4) {
                        return new Loading(createFromParcel, createFromParcel2, createFromParcel3, createFromParcel4, createFromParcel5, createFromParcel6, postEditingReason, createFromParcel7, z, z2, arrayList, arrayList2, arrayList3, postingTechMetrics, arrayList4);
                    }
                    i5 = en.a(PostingGroupInfo.CREATOR, parcel, arrayList4, i5, 1);
                    createFromParcel8 = postingTechMetrics;
                    readInt4 = readInt4;
                }
            }

            @Override // android.os.Parcelable.Creator
            public final Loading[] newArray(int i) {
                return new Loading[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Loading(PostingScreenContext postingScreenContext, PostingContext postingContext, MediaPickerState mediaPickerState, PostingSettings postingSettings, NearbyPlaces nearbyPlaces, PostingNavigationState postingNavigationState, PostEditingReason postEditingReason, LoadingState loadingState, boolean z, boolean z2, List<? extends Pair<? extends PostingAction, ? extends WaitingActionTrigger>> list, List<? extends PostingAction> list2, List<? extends PostingAction> list3, PostingTechMetrics postingTechMetrics, List<PostingGroupInfo> list4) {
            this.b = postingScreenContext;
            this.c = postingContext;
            this.d = mediaPickerState;
            this.e = postingSettings;
            this.f = nearbyPlaces;
            this.g = postingNavigationState;
            this.h = postEditingReason;
            this.i = loadingState;
            this.j = z;
            this.k = z2;
            this.l = list;
            this.m = list2;
            this.n = list3;
            this.o = postingTechMetrics;
            this.p = list4;
        }

        public static Loading a(Loading loading, PostingContext postingContext, MediaPickerState mediaPickerState, PostingSettings postingSettings, NearbyPlaces nearbyPlaces, PostingNavigationState postingNavigationState, LoadingState loadingState, boolean z, ArrayList arrayList, List list, List list2, PostingTechMetrics postingTechMetrics, List list3, int i) {
            PostingScreenContext postingScreenContext = loading.b;
            PostingContext postingContext2 = (i & 2) != 0 ? loading.c : postingContext;
            MediaPickerState mediaPickerState2 = (i & 4) != 0 ? loading.d : mediaPickerState;
            PostingSettings postingSettings2 = (i & 8) != 0 ? loading.e : postingSettings;
            NearbyPlaces nearbyPlaces2 = (i & 16) != 0 ? loading.f : nearbyPlaces;
            PostingNavigationState postingNavigationState2 = (i & 32) != 0 ? loading.g : postingNavigationState;
            PostEditingReason postEditingReason = loading.h;
            LoadingState loadingState2 = (i & 128) != 0 ? loading.i : loadingState;
            boolean z2 = loading.j;
            boolean z3 = (i & 512) != 0 ? loading.k : z;
            List<Pair<PostingAction, WaitingActionTrigger>> list4 = (i & 1024) != 0 ? loading.l : arrayList;
            List list5 = (i & 2048) != 0 ? loading.m : list;
            List list6 = (i & 4096) != 0 ? loading.n : list2;
            PostingTechMetrics postingTechMetrics2 = (i & 8192) != 0 ? loading.o : postingTechMetrics;
            List list7 = (i & 16384) != 0 ? loading.p : list3;
            loading.getClass();
            return new Loading(postingScreenContext, postingContext2, mediaPickerState2, postingSettings2, nearbyPlaces2, postingNavigationState2, postEditingReason, loadingState2, z2, z3, list4, list5, list6, postingTechMetrics2, list7);
        }

        @Override // com.vk.newsfeed.posting.impl.domain.model.PostingState
        public final List<PostingAction> D7() {
            return this.m;
        }

        @Override // com.vk.newsfeed.posting.impl.domain.model.PostingState
        public final List<Pair<PostingAction, WaitingActionTrigger>> I8() {
            return this.l;
        }

        @Override // com.vk.newsfeed.posting.impl.domain.model.PostingState
        public final PostEditingReason J7() {
            return this.h;
        }

        @Override // com.vk.newsfeed.posting.impl.domain.model.PostingState
        public final NearbyPlaces R9() {
            return this.f;
        }

        @Override // com.vk.newsfeed.posting.impl.domain.model.PostingState
        public final PostingScreenContext V4() {
            return this.b;
        }

        @Override // com.vk.newsfeed.posting.impl.domain.model.PostingState
        public final PostingNavigationState a9() {
            return this.g;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loading)) {
                return false;
            }
            Loading loading = (Loading) obj;
            return epx.f(this.b, loading.b) && epx.f(this.c, loading.c) && epx.f(this.d, loading.d) && epx.f(this.e, loading.e) && epx.f(this.f, loading.f) && epx.f(this.g, loading.g) && epx.f(this.h, loading.h) && this.i == loading.i && this.j == loading.j && this.k == loading.k && epx.f(this.l, loading.l) && epx.f(this.m, loading.m) && epx.f(this.n, loading.n) && epx.f(this.o, loading.o) && epx.f(this.p, loading.p);
        }

        @Override // com.vk.newsfeed.posting.impl.domain.model.PostingState
        public final boolean fb() {
            return this.k;
        }

        @Override // com.vk.newsfeed.posting.impl.domain.model.PostingState
        public final PostingContext getContext() {
            return this.c;
        }

        public final int hashCode() {
            return this.p.hashCode() + ((this.o.hashCode() + fw3.a(fw3.a(fw3.a(qoy.b(qoy.b((this.i.hashCode() + ((this.h.hashCode() + fw3.a((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31)) * 31)) * 31, 31, this.g.b)) * 31)) * 31, 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n)) * 31);
        }

        @Override // com.vk.newsfeed.posting.impl.domain.model.PostingState
        public final List<PostingAction> p9() {
            return this.n;
        }

        @Override // com.vk.newsfeed.posting.impl.domain.model.PostingState
        public final PostingTechMetrics q1() {
            return this.o;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loading(screenContext=");
            sb.append(this.b);
            sb.append(", context=");
            sb.append(this.c);
            sb.append(", mediaPickerState=");
            sb.append(this.d);
            sb.append(", settings=");
            sb.append(this.e);
            sb.append(", nearbyPlaces=");
            sb.append(this.f);
            sb.append(", navigationState=");
            sb.append(this.g);
            sb.append(", editingReason=");
            sb.append(this.h);
            sb.append(", loadingState=");
            sb.append(this.i);
            sb.append(", withLoadingView=");
            sb.append(this.j);
            sb.append(", isNetworkAvailable=");
            sb.append(this.k);
            sb.append(", postponedActions=");
            sb.append(this.l);
            sb.append(", finishedLoadingSettingsActions=");
            sb.append(this.m);
            sb.append(", errorLoadingSettingsActions=");
            sb.append(this.n);
            sb.append(", techMetrics=");
            sb.append(this.o);
            sb.append(", groups=");
            return ms9.a(')', sb, this.p);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.b.writeToParcel(parcel, i);
            this.c.writeToParcel(parcel, i);
            this.d.writeToParcel(parcel, i);
            PostingSettings postingSettings = this.e;
            postingSettings.getClass();
            Serializer.StreamParcelable.a.a(postingSettings, parcel);
            this.f.writeToParcel(parcel, i);
            this.g.writeToParcel(parcel, i);
            parcel.writeParcelable(this.h, i);
            this.i.writeToParcel(parcel, i);
            parcel.writeInt(this.j ? 1 : 0);
            parcel.writeInt(this.k ? 1 : 0);
            Iterator a2 = ao.a(parcel, this.l);
            while (a2.hasNext()) {
                parcel.writeSerializable((Serializable) a2.next());
            }
            Iterator a3 = ao.a(parcel, this.m);
            while (a3.hasNext()) {
                parcel.writeParcelable((Parcelable) a3.next(), i);
            }
            Iterator a4 = ao.a(parcel, this.n);
            while (a4.hasNext()) {
                parcel.writeParcelable((Parcelable) a4.next(), i);
            }
            this.o.writeToParcel(parcel, i);
            Iterator a5 = ao.a(parcel, this.p);
            while (a5.hasNext()) {
                ((PostingGroupInfo) a5.next()).writeToParcel(parcel, i);
            }
        }

        @Override // com.vk.newsfeed.posting.impl.domain.model.PostingState
        public final PostingSettings x() {
            return this.e;
        }

        @Override // com.vk.newsfeed.posting.impl.domain.model.PostingState
        public final MediaPickerState z6() {
            return this.d;
        }

        public Loading(PostingScreenContext postingScreenContext, PostingContext postingContext, MediaPickerState mediaPickerState, PostingSettings postingSettings, NearbyPlaces nearbyPlaces, PostingNavigationState postingNavigationState, PostEditingReason postEditingReason, LoadingState loadingState, boolean z, boolean z2, List list, List list2, List list3, PostingTechMetrics postingTechMetrics, List list4, int i, zcl zclVar) {
            this(postingScreenContext, postingContext, mediaPickerState, postingSettings, nearbyPlaces, postingNavigationState, postEditingReason, loadingState, z, z2, (i & 1024) != 0 ? EmptyList.b : list, (i & 2048) != 0 ? EmptyList.b : list2, (i & 4096) != 0 ? EmptyList.b : list3, postingTechMetrics, (i & 16384) != 0 ? EmptyList.b : list4);
        }
    }

    /* compiled from: PostingState.kt */
    public static final class Editing implements PostingState, Parcelable {
        public static final Parcelable.Creator<Editing> CREATOR = new a();
        public final PostingScreenContext b;
        public final PostingContext c;
        public final PostingSettings d;
        public final NearbyPlaces e;
        public final MediaPickerState f;
        public final PostingNavigationState g;
        public final PostEditingReason h;
        public final PostEditableData i;
        public final PostEditableData j;
        public final PostingMentionState k;
        public final ActionsAvailabilityState l;
        public final PublicationState m;
        public final boolean n;
        public final PostingHints o;
        public final boolean p;
        public final List<PostingAction> q;
        public final List<PostingAction> r;
        public final List<Pair<PostingAction, WaitingActionTrigger>> s;
        public final PostingTechMetrics t;
        public final List<PostingGroupInfo> u;

        /* compiled from: PostingState.kt */
        public static final class a implements Parcelable.Creator<Editing> {
            @Override // android.os.Parcelable.Creator
            public final Editing createFromParcel(Parcel parcel) {
                PostingScreenContext createFromParcel = PostingScreenContext.CREATOR.createFromParcel(parcel);
                PostingContext createFromParcel2 = PostingContext.CREATOR.createFromParcel(parcel);
                PostingSettings createFromParcel3 = PostingSettings.CREATOR.createFromParcel(parcel);
                NearbyPlaces createFromParcel4 = NearbyPlaces.CREATOR.createFromParcel(parcel);
                MediaPickerState createFromParcel5 = MediaPickerState.CREATOR.createFromParcel(parcel);
                PostingNavigationState createFromParcel6 = PostingNavigationState.CREATOR.createFromParcel(parcel);
                PostEditingReason postEditingReason = (PostEditingReason) parcel.readParcelable(Editing.class.getClassLoader());
                Parcelable.Creator<PostEditableData> creator = PostEditableData.CREATOR;
                PostEditableData createFromParcel7 = creator.createFromParcel(parcel);
                PostEditableData createFromParcel8 = creator.createFromParcel(parcel);
                PostingMentionState createFromParcel9 = PostingMentionState.CREATOR.createFromParcel(parcel);
                ActionsAvailabilityState createFromParcel10 = ActionsAvailabilityState.CREATOR.createFromParcel(parcel);
                PublicationState valueOf = PublicationState.valueOf(parcel.readString());
                boolean z = parcel.readInt() != 0;
                PostingHints createFromParcel11 = PostingHints.CREATOR.createFromParcel(parcel);
                boolean z2 = parcel.readInt() != 0;
                boolean z3 = z;
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(Editing.class, parcel, arrayList, i, 1);
                    readInt = readInt;
                }
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = bo.b(Editing.class, parcel, arrayList2, i2, 1);
                    readInt2 = readInt2;
                }
                int readInt3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    arrayList3.add(parcel.readSerializable());
                    i3++;
                    readInt3 = readInt3;
                }
                PostingTechMetrics createFromParcel12 = PostingTechMetrics.CREATOR.createFromParcel(parcel);
                int readInt4 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt4);
                int i4 = 0;
                while (true) {
                    ArrayList arrayList5 = arrayList3;
                    if (i4 == readInt4) {
                        return new Editing(createFromParcel, createFromParcel2, createFromParcel3, createFromParcel4, createFromParcel5, createFromParcel6, postEditingReason, createFromParcel7, createFromParcel8, createFromParcel9, createFromParcel10, valueOf, z3, createFromParcel11, z2, arrayList, arrayList2, arrayList5, createFromParcel12, arrayList4);
                    }
                    i4 = en.a(PostingGroupInfo.CREATOR, parcel, arrayList4, i4, 1);
                    arrayList3 = arrayList5;
                    readInt4 = readInt4;
                }
            }

            @Override // android.os.Parcelable.Creator
            public final Editing[] newArray(int i) {
                return new Editing[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Editing(PostingScreenContext postingScreenContext, PostingContext postingContext, PostingSettings postingSettings, NearbyPlaces nearbyPlaces, MediaPickerState mediaPickerState, PostingNavigationState postingNavigationState, PostEditingReason postEditingReason, PostEditableData postEditableData, PostEditableData postEditableData2, PostingMentionState postingMentionState, ActionsAvailabilityState actionsAvailabilityState, PublicationState publicationState, boolean z, PostingHints postingHints, boolean z2, List<? extends PostingAction> list, List<? extends PostingAction> list2, List<? extends Pair<? extends PostingAction, ? extends WaitingActionTrigger>> list3, PostingTechMetrics postingTechMetrics, List<PostingGroupInfo> list4) {
            this.b = postingScreenContext;
            this.c = postingContext;
            this.d = postingSettings;
            this.e = nearbyPlaces;
            this.f = mediaPickerState;
            this.g = postingNavigationState;
            this.h = postEditingReason;
            this.i = postEditableData;
            this.j = postEditableData2;
            this.k = postingMentionState;
            this.l = actionsAvailabilityState;
            this.m = publicationState;
            this.n = z;
            this.o = postingHints;
            this.p = z2;
            this.q = list;
            this.r = list2;
            this.s = list3;
            this.t = postingTechMetrics;
            this.u = list4;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Editing a(Editing editing, PostingContext postingContext, PostingSettings postingSettings, NearbyPlaces nearbyPlaces, MediaPickerState mediaPickerState, PostingNavigationState postingNavigationState, PostEditableData postEditableData, PostEditableData postEditableData2, PostingMentionState postingMentionState, ActionsAvailabilityState actionsAvailabilityState, PublicationState publicationState, boolean z, PostingHints postingHints, boolean z2, List list, List list2, ArrayList arrayList, PostingTechMetrics postingTechMetrics, List list3, int i) {
            PostingScreenContext postingScreenContext = editing.b;
            PostingContext postingContext2 = (i & 2) != 0 ? editing.c : postingContext;
            PostingSettings postingSettings2 = (i & 4) != 0 ? editing.d : postingSettings;
            NearbyPlaces nearbyPlaces2 = (i & 8) != 0 ? editing.e : nearbyPlaces;
            MediaPickerState mediaPickerState2 = (i & 16) != 0 ? editing.f : mediaPickerState;
            PostingNavigationState postingNavigationState2 = (i & 32) != 0 ? editing.g : postingNavigationState;
            PostEditingReason postEditingReason = editing.h;
            PostEditableData postEditableData3 = (i & 128) != 0 ? editing.i : postEditableData;
            PostEditableData postEditableData4 = (i & 256) != 0 ? editing.j : postEditableData2;
            PostingMentionState postingMentionState2 = (i & 512) != 0 ? editing.k : postingMentionState;
            ActionsAvailabilityState actionsAvailabilityState2 = (i & 1024) != 0 ? editing.l : actionsAvailabilityState;
            PublicationState publicationState2 = (i & 2048) != 0 ? editing.m : publicationState;
            boolean z3 = (i & 4096) != 0 ? editing.n : z;
            PostingHints postingHints2 = (i & 8192) != 0 ? editing.o : postingHints;
            boolean z4 = (i & 16384) != 0 ? editing.p : z2;
            List list4 = (i & 32768) != 0 ? editing.q : list;
            List list5 = (i & 65536) != 0 ? editing.r : list2;
            List list6 = (i & 131072) != 0 ? editing.s : arrayList;
            PostingTechMetrics postingTechMetrics2 = (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? editing.t : postingTechMetrics;
            List list7 = (i & 524288) != 0 ? editing.u : list3;
            editing.getClass();
            return new Editing(postingScreenContext, postingContext2, postingSettings2, nearbyPlaces2, mediaPickerState2, postingNavigationState2, postEditingReason, postEditableData3, postEditableData4, postingMentionState2, actionsAvailabilityState2, publicationState2, z3, postingHints2, z4, list4, list5, list6, postingTechMetrics2, list7);
        }

        @Override // com.vk.newsfeed.posting.impl.domain.model.PostingState
        public final List<PostingAction> D7() {
            return this.q;
        }

        @Override // com.vk.newsfeed.posting.impl.domain.model.PostingState
        public final List<Pair<PostingAction, WaitingActionTrigger>> I8() {
            return this.s;
        }

        @Override // com.vk.newsfeed.posting.impl.domain.model.PostingState
        public final PostEditingReason J7() {
            return this.h;
        }

        @Override // com.vk.newsfeed.posting.impl.domain.model.PostingState
        public final NearbyPlaces R9() {
            return this.e;
        }

        @Override // com.vk.newsfeed.posting.impl.domain.model.PostingState
        public final PostingScreenContext V4() {
            return this.b;
        }

        @Override // com.vk.newsfeed.posting.impl.domain.model.PostingState
        public final PostingNavigationState a9() {
            return this.g;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Editing)) {
                return false;
            }
            Editing editing = (Editing) obj;
            return epx.f(this.b, editing.b) && epx.f(this.c, editing.c) && epx.f(this.d, editing.d) && epx.f(this.e, editing.e) && epx.f(this.f, editing.f) && epx.f(this.g, editing.g) && epx.f(this.h, editing.h) && epx.f(this.i, editing.i) && epx.f(this.j, editing.j) && epx.f(this.k, editing.k) && epx.f(this.l, editing.l) && this.m == editing.m && this.n == editing.n && epx.f(this.o, editing.o) && this.p == editing.p && epx.f(this.q, editing.q) && epx.f(this.r, editing.r) && epx.f(this.s, editing.s) && epx.f(this.t, editing.t) && epx.f(this.u, editing.u);
        }

        @Override // com.vk.newsfeed.posting.impl.domain.model.PostingState
        public final boolean fb() {
            return this.p;
        }

        @Override // com.vk.newsfeed.posting.impl.domain.model.PostingState
        public final PostingContext getContext() {
            return this.c;
        }

        public final int hashCode() {
            return this.u.hashCode() + ((this.t.hashCode() + fw3.a(fw3.a(fw3.a(qoy.b((this.o.hashCode() + qoy.b((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + fw3.a((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31)) * 31)) * 31, 31, this.g.b)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.n)) * 31, 31, this.p), 31, this.q), 31, this.r), 31, this.s)) * 31);
        }

        @Override // com.vk.newsfeed.posting.impl.domain.model.PostingState
        public final List<PostingAction> p9() {
            return this.r;
        }

        @Override // com.vk.newsfeed.posting.impl.domain.model.PostingState
        public final PostingTechMetrics q1() {
            return this.t;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Editing(screenContext=");
            sb.append(this.b);
            sb.append(", context=");
            sb.append(this.c);
            sb.append(", settings=");
            sb.append(this.d);
            sb.append(", nearbyPlaces=");
            sb.append(this.e);
            sb.append(", mediaPickerState=");
            sb.append(this.f);
            sb.append(", navigationState=");
            sb.append(this.g);
            sb.append(", editingReason=");
            sb.append(this.h);
            sb.append(", editableData=");
            sb.append(this.i);
            sb.append(", snapshotEditableData=");
            sb.append(this.j);
            sb.append(", mentionState=");
            sb.append(this.k);
            sb.append(", actionsAvailabilityState=");
            sb.append(this.l);
            sb.append(", publicationState=");
            sb.append(this.m);
            sb.append(", isExplicitWaiting=");
            sb.append(this.n);
            sb.append(", hints=");
            sb.append(this.o);
            sb.append(", isNetworkAvailable=");
            sb.append(this.p);
            sb.append(", finishedLoadingSettingsActions=");
            sb.append(this.q);
            sb.append(", errorLoadingSettingsActions=");
            sb.append(this.r);
            sb.append(", postponedActions=");
            sb.append(this.s);
            sb.append(", techMetrics=");
            sb.append(this.t);
            sb.append(", groups=");
            return ms9.a(')', sb, this.u);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.b.writeToParcel(parcel, i);
            this.c.writeToParcel(parcel, i);
            PostingSettings postingSettings = this.d;
            postingSettings.getClass();
            Serializer.StreamParcelable.a.a(postingSettings, parcel);
            this.e.writeToParcel(parcel, i);
            this.f.writeToParcel(parcel, i);
            this.g.writeToParcel(parcel, i);
            parcel.writeParcelable(this.h, i);
            this.i.writeToParcel(parcel, i);
            this.j.writeToParcel(parcel, i);
            this.k.writeToParcel(parcel, i);
            this.l.writeToParcel(parcel, i);
            parcel.writeString(this.m.name());
            parcel.writeInt(this.n ? 1 : 0);
            this.o.writeToParcel(parcel, i);
            parcel.writeInt(this.p ? 1 : 0);
            Iterator a2 = ao.a(parcel, this.q);
            while (a2.hasNext()) {
                parcel.writeParcelable((Parcelable) a2.next(), i);
            }
            Iterator a3 = ao.a(parcel, this.r);
            while (a3.hasNext()) {
                parcel.writeParcelable((Parcelable) a3.next(), i);
            }
            Iterator a4 = ao.a(parcel, this.s);
            while (a4.hasNext()) {
                parcel.writeSerializable((Serializable) a4.next());
            }
            this.t.writeToParcel(parcel, i);
            Iterator a5 = ao.a(parcel, this.u);
            while (a5.hasNext()) {
                ((PostingGroupInfo) a5.next()).writeToParcel(parcel, i);
            }
        }

        @Override // com.vk.newsfeed.posting.impl.domain.model.PostingState
        public final PostingSettings x() {
            return this.d;
        }

        @Override // com.vk.newsfeed.posting.impl.domain.model.PostingState
        public final MediaPickerState z6() {
            return this.f;
        }

        public Editing(PostingScreenContext postingScreenContext, PostingContext postingContext, PostingSettings postingSettings, NearbyPlaces nearbyPlaces, MediaPickerState mediaPickerState, PostingNavigationState postingNavigationState, PostEditingReason postEditingReason, PostEditableData postEditableData, PostEditableData postEditableData2, PostingMentionState postingMentionState, ActionsAvailabilityState actionsAvailabilityState, PublicationState publicationState, boolean z, PostingHints postingHints, boolean z2, List list, List list2, List list3, PostingTechMetrics postingTechMetrics, List list4, int i, zcl zclVar) {
            this(postingScreenContext, postingContext, postingSettings, nearbyPlaces, mediaPickerState, postingNavigationState, postEditingReason, postEditableData, postEditableData2, postingMentionState, actionsAvailabilityState, publicationState, z, postingHints, z2, (i & 32768) != 0 ? EmptyList.b : list, (i & 65536) != 0 ? EmptyList.b : list2, (i & 131072) != 0 ? EmptyList.b : list3, postingTechMetrics, (i & 524288) != 0 ? EmptyList.b : list4);
        }
    }
}
