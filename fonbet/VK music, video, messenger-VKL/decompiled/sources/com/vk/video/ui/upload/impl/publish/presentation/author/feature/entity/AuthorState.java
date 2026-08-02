package com.vk.video.ui.upload.impl.publish.presentation.author.feature.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.video.ui.upload.impl.publish.presentation.author.compose.onboarding.OnboardingViewState;
import com.vk.video.ui.upload.impl.publish.presentation.author.fragment.AuthorItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.lm50;
import xsna.qoy;
import xsna.shy;

/* compiled from: AuthorState.kt */
/* loaded from: classes7.dex */
public final class AuthorState implements lm50, Parcelable {
    public static final Parcelable.Creator<AuthorState> CREATOR = new a();
    public final List<AuthorItem> b;
    public final int c;
    public final boolean d;
    public final OnboardingViewState e;

    /* compiled from: AuthorState.kt */
    public static final class a implements Parcelable.Creator<AuthorState> {
        @Override // android.os.Parcelable.Creator
        public final AuthorState createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(AuthorItem.CREATOR, parcel, arrayList, i, 1);
            }
            return new AuthorState(arrayList, parcel.readInt(), parcel.readInt() != 0, OnboardingViewState.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AuthorState[] newArray(int i) {
            return new AuthorState[i];
        }
    }

    public AuthorState(List<AuthorItem> list, int i, boolean z, OnboardingViewState onboardingViewState) {
        this.b = list;
        this.c = i;
        this.d = z;
        this.e = onboardingViewState;
    }

    public static AuthorState a(AuthorState authorState, int i, OnboardingViewState onboardingViewState, int i2) {
        List<AuthorItem> list = authorState.b;
        if ((i2 & 2) != 0) {
            i = authorState.c;
        }
        boolean z = authorState.d;
        if ((i2 & 8) != 0) {
            onboardingViewState = authorState.e;
        }
        authorState.getClass();
        return new AuthorState(list, i, z, onboardingViewState);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthorState)) {
            return false;
        }
        AuthorState authorState = (AuthorState) obj;
        return epx.f(this.b, authorState.b) && this.c == authorState.c && this.d == authorState.d && epx.f(this.e, authorState.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + qoy.b(shy.a(this.c, this.b.hashCode() * 31, 31), 31, this.d);
    }

    public final String toString() {
        return "AuthorState(items=" + this.b + ", selectedItemIndex=" + this.c + ", isCreateChannelEnabled=" + this.d + ", onboarding=" + this.e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.b);
        while (a2.hasNext()) {
            ((AuthorItem) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        this.e.writeToParcel(parcel, i);
    }
}
