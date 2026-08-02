package com.vk.push.core.work;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import xsna.epx;
import xsna.uf3;
import xsna.zcl;

/* compiled from: WorkModel.kt */
/* loaded from: classes5.dex */
public final class WorkModel implements Parcelable {
    public static final CREATOR CREATOR = new CREATOR(null);
    public final String b;
    public final KeepExistingWork c;
    public final Bundle d;

    /* compiled from: WorkModel.kt */
    public static final class CREATOR implements Parcelable.Creator<WorkModel> {
        public /* synthetic */ CREATOR(zcl zclVar) {
            this();
        }

        public CREATOR() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WorkModel createFromParcel(Parcel parcel) {
            return new WorkModel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WorkModel[] newArray(int i) {
            return new WorkModel[i];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WorkModel.kt */
    public static final class KeepExistingWork {
        private static final /* synthetic */ KeepExistingWork[] $VALUES;
        public static final Companion Companion;
        public static final KeepExistingWork NO;
        public static final KeepExistingWork YES;

        /* compiled from: WorkModel.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final KeepExistingWork toKeepExistingWorkModel(boolean z) {
                return z ? KeepExistingWork.YES : KeepExistingWork.NO;
            }

            public Companion() {
            }
        }

        static {
            KeepExistingWork keepExistingWork = new KeepExistingWork("YES", 0);
            YES = keepExistingWork;
            KeepExistingWork keepExistingWork2 = new KeepExistingWork("NO", 1);
            NO = keepExistingWork2;
            $VALUES = new KeepExistingWork[]{keepExistingWork, keepExistingWork2};
            Companion = new Companion(null);
        }

        public KeepExistingWork() {
            throw null;
        }

        public static KeepExistingWork valueOf(String str) {
            return (KeepExistingWork) Enum.valueOf(KeepExistingWork.class, str);
        }

        public static KeepExistingWork[] values() {
            return (KeepExistingWork[]) $VALUES.clone();
        }
    }

    public WorkModel(String str, KeepExistingWork keepExistingWork, Bundle bundle) {
        this.b = str;
        this.c = keepExistingWork;
        this.d = bundle;
    }

    public static /* synthetic */ WorkModel copy$default(WorkModel workModel, String str, KeepExistingWork keepExistingWork, Bundle bundle, int i, Object obj) {
        if ((i & 1) != 0) {
            str = workModel.b;
        }
        if ((i & 2) != 0) {
            keepExistingWork = workModel.c;
        }
        if ((i & 4) != 0) {
            bundle = workModel.d;
        }
        return workModel.copy(str, keepExistingWork, bundle);
    }

    public final String component1() {
        return this.b;
    }

    public final KeepExistingWork component2() {
        return this.c;
    }

    public final Bundle component3() {
        return this.d;
    }

    public final WorkModel copy(String str, KeepExistingWork keepExistingWork, Bundle bundle) {
        return new WorkModel(str, keepExistingWork, bundle);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WorkModel)) {
            return false;
        }
        WorkModel workModel = (WorkModel) obj;
        return epx.f(this.b, workModel.b) && this.c == workModel.c && epx.f(this.d, workModel.d);
    }

    public final KeepExistingWork getKeepExistingWork() {
        return this.c;
    }

    public final Bundle getParams() {
        return this.d;
    }

    public final String getWorkName() {
        return this.b;
    }

    public int hashCode() {
        String str = this.b;
        int hashCode = (this.c.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        Bundle bundle = this.d;
        return hashCode + (bundle != null ? bundle.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WorkModel(workName=");
        sb.append(this.b);
        sb.append(", keepExistingWork=");
        sb.append(this.c);
        sb.append(", params=");
        return uf3.c(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c.name());
        parcel.writeBundle(this.d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WorkModel(Parcel parcel) {
        this(r0, (KeepExistingWork) r2, parcel.readBundle(Bundle.class.getClassLoader()));
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        Enum r2 = KeepExistingWork.YES;
        if (readString2 != null) {
            try {
                r2 = Enum.valueOf(KeepExistingWork.class, readString2.toUpperCase(Locale.ROOT));
            } catch (IllegalArgumentException unused) {
            }
        }
    }
}
