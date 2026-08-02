package com.vk.donut.video.model.domain.video;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.qoy;
import xsna.urd0;
import xsna.zrp;

/* compiled from: DonutVideoModel.kt */
/* loaded from: classes18.dex */
public final class DonutVideoModel implements Parcelable {
    public static final Parcelable.Creator<DonutVideoModel> CREATOR = new a();
    public final String b;
    public final boolean c;
    public final Integer d;
    public final Popup e;
    public final Chip f;
    public final Restriction g;

    /* compiled from: DonutVideoModel.kt */
    public static final class Chip implements Parcelable {
        public static final Parcelable.Creator<Chip> CREATOR = new a();
        public final String b;
        public final String c;

        /* compiled from: DonutVideoModel.kt */
        public static final class a implements Parcelable.Creator<Chip> {
            @Override // android.os.Parcelable.Creator
            public final Chip createFromParcel(Parcel parcel) {
                return new Chip(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Chip[] newArray(int i) {
                return new Chip[i];
            }
        }

        public Chip(String str, String str2) {
            this.b = str;
            this.c = str2;
        }

        public final String d() {
            return this.c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String e() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Chip)) {
                return false;
            }
            Chip chip = (Chip) obj;
            return epx.f(this.b, chip.b) && epx.f(this.c, chip.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Chip(text=");
            sb.append(this.b);
            sb.append(", accessibilityText=");
            return ho8.a(sb, this.c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeString(this.c);
        }
    }

    /* compiled from: DonutVideoModel.kt */
    public static final class Popup implements Parcelable {
        public static final Parcelable.Creator<Popup> CREATOR = new a();
        public final Illustration b;
        public final String c;
        public final String d;
        public final PopupAction e;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: DonutVideoModel.kt */
        public static final class Illustration {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Illustration[] $VALUES;
            public static final Illustration ILLUSTRATION_DONUT_LOGO_CONFETTI_120H;
            public static final Illustration UNKNOWN;

            static {
                Illustration illustration = new Illustration("ILLUSTRATION_DONUT_LOGO_CONFETTI_120H", 0);
                ILLUSTRATION_DONUT_LOGO_CONFETTI_120H = illustration;
                Illustration illustration2 = new Illustration(GrsBaseInfo.CountryCodeSource.UNKNOWN, 1);
                UNKNOWN = illustration2;
                Illustration[] illustrationArr = {illustration, illustration2};
                $VALUES = illustrationArr;
                $ENTRIES = new asp(illustrationArr);
            }

            public Illustration() {
                throw null;
            }

            public static Illustration valueOf(String str) {
                return (Illustration) Enum.valueOf(Illustration.class, str);
            }

            public static Illustration[] values() {
                return (Illustration[]) $VALUES.clone();
            }
        }

        /* compiled from: DonutVideoModel.kt */
        public static final class PopupAction implements Parcelable {
            public static final Parcelable.Creator<PopupAction> CREATOR = new a();
            public final String b;
            public final ActionType c;
            public final String d;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: DonutVideoModel.kt */
            public static final class ActionType {
                private static final /* synthetic */ zrp $ENTRIES;
                private static final /* synthetic */ ActionType[] $VALUES;
                public static final ActionType CLOSE;
                public static final ActionType EDIT_PRIVACY;
                public static final ActionType HIGHER_LEVEL;
                public static final ActionType UNKNOWN;

                static {
                    ActionType actionType = new ActionType("HIGHER_LEVEL", 0);
                    HIGHER_LEVEL = actionType;
                    ActionType actionType2 = new ActionType("EDIT_PRIVACY", 1);
                    EDIT_PRIVACY = actionType2;
                    ActionType actionType3 = new ActionType("CLOSE", 2);
                    CLOSE = actionType3;
                    ActionType actionType4 = new ActionType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 3);
                    UNKNOWN = actionType4;
                    ActionType[] actionTypeArr = {actionType, actionType2, actionType3, actionType4};
                    $VALUES = actionTypeArr;
                    $ENTRIES = new asp(actionTypeArr);
                }

                public ActionType() {
                    throw null;
                }

                public static ActionType valueOf(String str) {
                    return (ActionType) Enum.valueOf(ActionType.class, str);
                }

                public static ActionType[] values() {
                    return (ActionType[]) $VALUES.clone();
                }
            }

            /* compiled from: DonutVideoModel.kt */
            public static final class a implements Parcelable.Creator<PopupAction> {
                @Override // android.os.Parcelable.Creator
                public final PopupAction createFromParcel(Parcel parcel) {
                    return new PopupAction(parcel.readString(), ActionType.valueOf(parcel.readString()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final PopupAction[] newArray(int i) {
                    return new PopupAction[i];
                }
            }

            public PopupAction(String str, ActionType actionType, String str2) {
                this.b = str;
                this.c = actionType;
                this.d = str2;
            }

            public final ActionType d() {
                return this.c;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PopupAction)) {
                    return false;
                }
                PopupAction popupAction = (PopupAction) obj;
                return epx.f(this.b, popupAction.b) && this.c == popupAction.c && epx.f(this.d, popupAction.d);
            }

            public final String getTitle() {
                return this.b;
            }

            public final String getUrl() {
                return this.d;
            }

            public final int hashCode() {
                int hashCode = (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
                String str = this.d;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("PopupAction(title=");
                sb.append(this.b);
                sb.append(", type=");
                sb.append(this.c);
                sb.append(", url=");
                return ho8.a(sb, this.d, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.b);
                parcel.writeString(this.c.name());
                parcel.writeString(this.d);
            }
        }

        /* compiled from: DonutVideoModel.kt */
        public static final class a implements Parcelable.Creator<Popup> {
            @Override // android.os.Parcelable.Creator
            public final Popup createFromParcel(Parcel parcel) {
                return new Popup(Illustration.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : PopupAction.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Popup[] newArray(int i) {
                return new Popup[i];
            }
        }

        public Popup(Illustration illustration, String str, String str2, PopupAction popupAction) {
            this.b = illustration;
            this.c = str;
            this.d = str2;
            this.e = popupAction;
        }

        public final PopupAction d() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final Illustration e() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Popup)) {
                return false;
            }
            Popup popup = (Popup) obj;
            return this.b == popup.b && epx.f(this.c, popup.c) && epx.f(this.d, popup.d) && epx.f(this.e, popup.e);
        }

        public final String f() {
            return this.d;
        }

        public final String getTitle() {
            return this.c;
        }

        public final int hashCode() {
            int a2 = urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
            PopupAction popupAction = this.e;
            return a2 + (popupAction == null ? 0 : popupAction.hashCode());
        }

        public final String toString() {
            return "Popup(illustration=" + this.b + ", title=" + this.c + ", text=" + this.d + ", action=" + this.e + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b.name());
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            PopupAction popupAction = this.e;
            if (popupAction == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                popupAction.writeToParcel(parcel, i);
            }
        }
    }

    /* compiled from: DonutVideoModel.kt */
    public static final class Restriction implements Parcelable {
        public static final Parcelable.Creator<Restriction> CREATOR = new a();
        public final String b;
        public final String c;

        /* compiled from: DonutVideoModel.kt */
        public static final class a implements Parcelable.Creator<Restriction> {
            @Override // android.os.Parcelable.Creator
            public final Restriction createFromParcel(Parcel parcel) {
                return new Restriction(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Restriction[] newArray(int i) {
                return new Restriction[i];
            }
        }

        public Restriction(String str, String str2) {
            this.b = str;
            this.c = str2;
        }

        public final String d() {
            return this.c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Restriction)) {
                return false;
            }
            Restriction restriction = (Restriction) obj;
            return epx.f(this.b, restriction.b) && epx.f(this.c, restriction.c);
        }

        public final String getTitle() {
            return this.b;
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Restriction(title=");
            sb.append(this.b);
            sb.append(", actionUrl=");
            return ho8.a(sb, this.c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeString(this.c);
        }
    }

    /* compiled from: DonutVideoModel.kt */
    public static final class a implements Parcelable.Creator<DonutVideoModel> {
        @Override // android.os.Parcelable.Creator
        public final DonutVideoModel createFromParcel(Parcel parcel) {
            return new DonutVideoModel(parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Popup.CREATOR.createFromParcel(parcel), Chip.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Restriction.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final DonutVideoModel[] newArray(int i) {
            return new DonutVideoModel[i];
        }
    }

    public DonutVideoModel(String str, boolean z, Integer num, Popup popup, Chip chip, Restriction restriction) {
        this.b = str;
        this.c = z;
        this.d = num;
        this.e = popup;
        this.f = chip;
        this.g = restriction;
    }

    public final String a1() {
        return this.b;
    }

    public final Chip d() {
        return this.f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Popup e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DonutVideoModel)) {
            return false;
        }
        DonutVideoModel donutVideoModel = (DonutVideoModel) obj;
        return epx.f(this.b, donutVideoModel.b) && this.c == donutVideoModel.c && epx.f(this.d, donutVideoModel.d) && epx.f(this.e, donutVideoModel.e) && epx.f(this.f, donutVideoModel.f) && epx.f(this.g, donutVideoModel.g);
    }

    public final Restriction f() {
        return this.g;
    }

    public final boolean g() {
        return this.c;
    }

    public final int hashCode() {
        int b = qoy.b(this.b.hashCode() * 31, 31, this.c);
        Integer num = this.d;
        int hashCode = (b + (num == null ? 0 : num.hashCode())) * 31;
        Popup popup = this.e;
        int hashCode2 = (this.f.hashCode() + ((hashCode + (popup == null ? 0 : popup.hashCode())) * 31)) * 31;
        Restriction restriction = this.g;
        return hashCode2 + (restriction != null ? restriction.hashCode() : 0);
    }

    public final String toString() {
        return "DonutVideoModel(videoId=" + this.b + ", isUserDon=" + this.c + ", donutLevelId=" + this.d + ", popup=" + this.e + ", chip=" + this.f + ", restriction=" + this.g + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        Integer num = this.d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Popup popup = this.e;
        if (popup == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            popup.writeToParcel(parcel, i);
        }
        this.f.writeToParcel(parcel, i);
        Restriction restriction = this.g;
        if (restriction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            restriction.writeToParcel(parcel, i);
        }
    }
}
