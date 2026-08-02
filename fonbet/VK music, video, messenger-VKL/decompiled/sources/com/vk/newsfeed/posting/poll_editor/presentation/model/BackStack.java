package com.vk.newsfeed.posting.poll_editor.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.newsfeed.posting.poll_editor.domain.model.PollEditorScreen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.ms9;

/* compiled from: PollEditorViewState.kt */
/* loaded from: classes4.dex */
public final class BackStack implements Parcelable {
    public static final Parcelable.Creator<BackStack> CREATOR = new a();
    public final List<PollEditorScreen> b;

    /* compiled from: PollEditorViewState.kt */
    public static final class a implements Parcelable.Creator<BackStack> {
        @Override // android.os.Parcelable.Creator
        public final BackStack createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(BackStack.class, parcel, arrayList, i, 1);
            }
            return new BackStack(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final BackStack[] newArray(int i) {
            return new BackStack[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BackStack(List<? extends PollEditorScreen> list) {
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BackStack) && epx.f(this.b, ((BackStack) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("BackStack(stack="), this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.b);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
    }
}
