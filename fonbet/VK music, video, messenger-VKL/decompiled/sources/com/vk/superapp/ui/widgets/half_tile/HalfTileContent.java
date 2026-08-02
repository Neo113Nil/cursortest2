package com.vk.superapp.ui.widgets.half_tile;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.superapp.ui.widgets.tile.ImageWithAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.zcl;

/* compiled from: HalfTileContent.kt */
/* loaded from: classes6.dex */
public abstract class HalfTileContent implements Parcelable {

    /* compiled from: HalfTileContent.kt */
    public static final class NotSupported extends HalfTileContent {
        public static final NotSupported b = new NotSupported(null);
        public static final Parcelable.Creator<NotSupported> CREATOR = new a();

        /* compiled from: HalfTileContent.kt */
        public static final class a implements Parcelable.Creator<NotSupported> {
            @Override // android.os.Parcelable.Creator
            public final NotSupported createFromParcel(Parcel parcel) {
                parcel.readInt();
                return NotSupported.b;
            }

            @Override // android.os.Parcelable.Creator
            public final NotSupported[] newArray(int i) {
                return new NotSupported[i];
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

    /* compiled from: HalfTileContent.kt */
    public static final class Progress extends HalfTileContent {
        public static final Parcelable.Creator<Progress> CREATOR = new a();
        public final SuperAppHalfTileTextBlock b;
        public final UniversalHalfTileIcon c;
        public final ProgressHalfTileData d;

        /* compiled from: HalfTileContent.kt */
        public static final class a implements Parcelable.Creator<Progress> {
            @Override // android.os.Parcelable.Creator
            public final Progress createFromParcel(Parcel parcel) {
                return new Progress(SuperAppHalfTileTextBlock.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : UniversalHalfTileIcon.CREATOR.createFromParcel(parcel), ProgressHalfTileData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Progress[] newArray(int i) {
                return new Progress[i];
            }
        }

        public Progress(SuperAppHalfTileTextBlock superAppHalfTileTextBlock, UniversalHalfTileIcon universalHalfTileIcon, ProgressHalfTileData progressHalfTileData) {
            super(null);
            this.b = superAppHalfTileTextBlock;
            this.c = universalHalfTileIcon;
            this.d = progressHalfTileData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Progress)) {
                return false;
            }
            Progress progress = (Progress) obj;
            return epx.f(this.b, progress.b) && epx.f(this.c, progress.c) && epx.f(this.d, progress.d);
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            UniversalHalfTileIcon universalHalfTileIcon = this.c;
            return this.d.hashCode() + ((hashCode + (universalHalfTileIcon == null ? 0 : universalHalfTileIcon.hashCode())) * 31);
        }

        public final String toString() {
            return "Progress(textBlock=" + this.b + ", icon=" + this.c + ", progressData=" + this.d + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.b.writeToParcel(parcel, i);
            UniversalHalfTileIcon universalHalfTileIcon = this.c;
            if (universalHalfTileIcon == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                universalHalfTileIcon.writeToParcel(parcel, i);
            }
            this.d.writeToParcel(parcel, i);
        }
    }

    /* compiled from: HalfTileContent.kt */
    public static final class Regular extends HalfTileContent {
        public static final Parcelable.Creator<Regular> CREATOR = new a();
        public final SuperAppHalfTileTextBlock b;
        public final String c;
        public final List<ImageWithAction> d;
        public final HalfTileIcon e;

        /* compiled from: HalfTileContent.kt */
        public static final class a implements Parcelable.Creator<Regular> {
            @Override // android.os.Parcelable.Creator
            public final Regular createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                SuperAppHalfTileTextBlock createFromParcel = SuperAppHalfTileTextBlock.CREATOR.createFromParcel(parcel);
                String readString = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = en.a(ImageWithAction.CREATOR, parcel, arrayList2, i, 1);
                    }
                    arrayList = arrayList2;
                }
                return new Regular(createFromParcel, readString, arrayList, (HalfTileIcon) parcel.readParcelable(Regular.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Regular[] newArray(int i) {
                return new Regular[i];
            }
        }

        public Regular(SuperAppHalfTileTextBlock superAppHalfTileTextBlock, String str, List<ImageWithAction> list, HalfTileIcon halfTileIcon) {
            super(null);
            this.b = superAppHalfTileTextBlock;
            this.c = str;
            this.d = list;
            this.e = halfTileIcon;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Regular)) {
                return false;
            }
            Regular regular = (Regular) obj;
            return epx.f(this.b, regular.b) && epx.f(this.c, regular.c) && epx.f(this.d, regular.d) && epx.f(this.e, regular.e);
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            String str = this.c;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            List<ImageWithAction> list = this.d;
            int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            HalfTileIcon halfTileIcon = this.e;
            return hashCode3 + (halfTileIcon != null ? halfTileIcon.hashCode() : 0);
        }

        public final String toString() {
            return "Regular(textBlock=" + this.b + ", description=" + this.c + ", background=" + this.d + ", icon=" + this.e + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.b.writeToParcel(parcel, i);
            parcel.writeString(this.c);
            List<ImageWithAction> list = this.d;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    ((ImageWithAction) f.next()).writeToParcel(parcel, i);
                }
            }
            parcel.writeParcelable(this.e, i);
        }
    }

    /* compiled from: HalfTileContent.kt */
    public static final class UserStack extends HalfTileContent {
        public static final Parcelable.Creator<UserStack> CREATOR = new a();
        public final List<ImageWithAction> b;
        public final Integer c;
        public final String d;

        /* compiled from: HalfTileContent.kt */
        public static final class a implements Parcelable.Creator<UserStack> {
            @Override // android.os.Parcelable.Creator
            public final UserStack createFromParcel(Parcel parcel) {
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(ImageWithAction.CREATOR, parcel, arrayList, i, 1);
                }
                return new UserStack(arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final UserStack[] newArray(int i) {
                return new UserStack[i];
            }
        }

        public UserStack(List<ImageWithAction> list, Integer num, String str) {
            super(null);
            this.b = list;
            this.c = num;
            this.d = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UserStack)) {
                return false;
            }
            UserStack userStack = (UserStack) obj;
            return epx.f(this.b, userStack.b) && epx.f(this.c, userStack.c) && epx.f(this.d, userStack.d);
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            Integer num = this.c;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.d;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UserStack(images=");
            sb.append(this.b);
            sb.append(", count=");
            sb.append(this.c);
            sb.append(", text=");
            return ho8.a(sb, this.d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Iterator a2 = ao.a(parcel, this.b);
            while (a2.hasNext()) {
                ((ImageWithAction) a2.next()).writeToParcel(parcel, i);
            }
            Integer num = this.c;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            parcel.writeString(this.d);
        }
    }

    public /* synthetic */ HalfTileContent(zcl zclVar) {
        this();
    }

    public HalfTileContent() {
    }
}
