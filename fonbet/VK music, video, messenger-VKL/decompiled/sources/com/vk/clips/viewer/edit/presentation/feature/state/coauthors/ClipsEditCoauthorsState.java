package com.vk.clips.viewer.edit.presentation.feature.state.coauthors;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.clips.viewer.edit.api.domain.model.ClipCoauthorSdkItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.asp;
import xsna.bo;
import xsna.epx;
import xsna.qoy;
import xsna.zrp;

/* compiled from: ClipsEditCoauthorsState.kt */
/* loaded from: classes17.dex */
public interface ClipsEditCoauthorsState extends Parcelable {

    /* compiled from: ClipsEditCoauthorsState.kt */
    public static final class Disabled implements ClipsEditCoauthorsState {
        public static final Disabled b = new Disabled();
        public static final Parcelable.Creator<Disabled> CREATOR = new a();

        /* compiled from: ClipsEditCoauthorsState.kt */
        public static final class a implements Parcelable.Creator<Disabled> {
            @Override // android.os.Parcelable.Creator
            public final Disabled createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Disabled.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Disabled[] newArray(int i) {
                return new Disabled[i];
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

    /* compiled from: ClipsEditCoauthorsState.kt */
    public static final class Enabled implements ClipsEditCoauthorsState {
        public static final Parcelable.Creator<Enabled> CREATOR = new a();
        public final List<ClipCoauthorSdkItem> b;
        public final boolean c;
        public final InactiveReason d;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ClipsEditCoauthorsState.kt */
        public static final class InactiveReason {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ InactiveReason[] $VALUES;
            public static final InactiveReason ClosedClip;
            public static final InactiveReason ClosedGroupWithCoauthors;
            public static final InactiveReason ClosedGroupWithoutCoauthors;
            public static final InactiveReason ClosedProfileWithCoauthors;
            public static final InactiveReason ClosedProfileWithoutCoauthors;
            public static final InactiveReason LoadingInfo;

            static {
                InactiveReason inactiveReason = new InactiveReason("ClosedProfileWithoutCoauthors", 0);
                ClosedProfileWithoutCoauthors = inactiveReason;
                InactiveReason inactiveReason2 = new InactiveReason("ClosedProfileWithCoauthors", 1);
                ClosedProfileWithCoauthors = inactiveReason2;
                InactiveReason inactiveReason3 = new InactiveReason("ClosedGroupWithoutCoauthors", 2);
                ClosedGroupWithoutCoauthors = inactiveReason3;
                InactiveReason inactiveReason4 = new InactiveReason("ClosedGroupWithCoauthors", 3);
                ClosedGroupWithCoauthors = inactiveReason4;
                InactiveReason inactiveReason5 = new InactiveReason("ClosedClip", 4);
                ClosedClip = inactiveReason5;
                InactiveReason inactiveReason6 = new InactiveReason("LoadingInfo", 5);
                LoadingInfo = inactiveReason6;
                InactiveReason[] inactiveReasonArr = {inactiveReason, inactiveReason2, inactiveReason3, inactiveReason4, inactiveReason5, inactiveReason6};
                $VALUES = inactiveReasonArr;
                $ENTRIES = new asp(inactiveReasonArr);
            }

            public InactiveReason() {
                throw null;
            }

            public static InactiveReason valueOf(String str) {
                return (InactiveReason) Enum.valueOf(InactiveReason.class, str);
            }

            public static InactiveReason[] values() {
                return (InactiveReason[]) $VALUES.clone();
            }
        }

        /* compiled from: ClipsEditCoauthorsState.kt */
        public static final class a implements Parcelable.Creator<Enabled> {
            @Override // android.os.Parcelable.Creator
            public final Enabled createFromParcel(Parcel parcel) {
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(Enabled.class, parcel, arrayList, i, 1);
                }
                return new Enabled(arrayList, parcel.readInt() != 0, parcel.readInt() == 0 ? null : InactiveReason.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Enabled[] newArray(int i) {
                return new Enabled[i];
            }
        }

        public Enabled(List<ClipCoauthorSdkItem> list, boolean z, InactiveReason inactiveReason) {
            this.b = list;
            this.c = z;
            this.d = inactiveReason;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Enabled)) {
                return false;
            }
            Enabled enabled = (Enabled) obj;
            return epx.f(this.b, enabled.b) && this.c == enabled.c && this.d == enabled.d;
        }

        public final int hashCode() {
            int b = qoy.b(this.b.hashCode() * 31, 31, this.c);
            InactiveReason inactiveReason = this.d;
            return b + (inactiveReason == null ? 0 : inactiveReason.hashCode());
        }

        public final String toString() {
            return "Enabled(coauthors=" + this.b + ", isCoauthorsRedesign=" + this.c + ", inactiveReason=" + this.d + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Iterator a2 = ao.a(parcel, this.b);
            while (a2.hasNext()) {
                parcel.writeParcelable((Parcelable) a2.next(), i);
            }
            parcel.writeInt(this.c ? 1 : 0);
            InactiveReason inactiveReason = this.d;
            if (inactiveReason == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(inactiveReason.name());
            }
        }
    }
}
