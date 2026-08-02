package com.vk.newsfeed.posting.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.qoy;
import xsna.zcl;

/* compiled from: NavigationState.kt */
/* loaded from: classes4.dex */
public final class PostingStep implements Parcelable {
    public static final Parcelable.Creator<PostingStep> CREATOR = new a();
    public final PostingStepScreen b;
    public final boolean c;
    public final boolean d;
    public final List<PostingStep> e;

    /* compiled from: NavigationState.kt */
    public static final class a implements Parcelable.Creator<PostingStep> {
        @Override // android.os.Parcelable.Creator
        public final PostingStep createFromParcel(Parcel parcel) {
            PostingStepScreen postingStepScreen = (PostingStepScreen) parcel.readParcelable(PostingStep.class.getClassLoader());
            int i = 0;
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (i != readInt) {
                i = en.a(PostingStep.CREATOR, parcel, arrayList, i, 1);
            }
            return new PostingStep(postingStepScreen, z, z2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final PostingStep[] newArray(int i) {
            return new PostingStep[i];
        }
    }

    public PostingStep(PostingStepScreen postingStepScreen, boolean z, boolean z2, List list, int i, zcl zclVar) {
        this(postingStepScreen, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? EmptyList.b : list);
    }

    public static PostingStep a(PostingStep postingStep, List list) {
        PostingStepScreen postingStepScreen = postingStep.b;
        boolean z = postingStep.c;
        boolean z2 = postingStep.d;
        postingStep.getClass();
        return new PostingStep(postingStepScreen, z, z2, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostingStep)) {
            return false;
        }
        PostingStep postingStep = (PostingStep) obj;
        return epx.f(this.b, postingStep.b) && this.c == postingStep.c && this.d == postingStep.d && epx.f(this.e, postingStep.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + qoy.b(qoy.b(this.b.hashCode() * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostingStep(screen=");
        sb.append(this.b);
        sb.append(", isCurrentStepCompleted=");
        sb.append(this.c);
        sb.append(", hasNextStep=");
        sb.append(this.d);
        sb.append(", subBackStack=");
        return ms9.a(')', sb, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        Iterator a2 = ao.a(parcel, this.e);
        while (a2.hasNext()) {
            ((PostingStep) a2.next()).writeToParcel(parcel, i);
        }
    }

    public PostingStep(PostingStepScreen postingStepScreen, boolean z, boolean z2, List<PostingStep> list) {
        this.b = postingStepScreen;
        this.c = z;
        this.d = z2;
        this.e = list;
    }
}
