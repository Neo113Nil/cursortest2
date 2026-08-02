package com.vk.clips.upload.vk.ui.impl.fragment.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.clips.upload.vk.ui.api.ClipsUploadUiVkNavigator;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadDataInternal;
import com.vk.dto.common.id.UserId;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import xsna.epx;
import xsna.gp;
import xsna.ur;

/* compiled from: ClipsUploadErrorType.kt */
/* loaded from: classes17.dex */
public interface ClipsUploadErrorType extends Parcelable {

    /* compiled from: ClipsUploadErrorType.kt */
    public static final class InitialNetworkLoad implements ClipsUploadErrorType {
        public static final Parcelable.Creator<InitialNetworkLoad> CREATOR = new a();
        public final ClipsUploadDataInternal b;
        public final UserId c;

        /* compiled from: ClipsUploadErrorType.kt */
        public static final class a implements Parcelable.Creator<InitialNetworkLoad> {
            @Override // android.os.Parcelable.Creator
            public final InitialNetworkLoad createFromParcel(Parcel parcel) {
                return new InitialNetworkLoad(ClipsUploadDataInternal.CREATOR.createFromParcel(parcel), (UserId) parcel.readParcelable(InitialNetworkLoad.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final InitialNetworkLoad[] newArray(int i) {
                return new InitialNetworkLoad[i];
            }
        }

        public InitialNetworkLoad(ClipsUploadDataInternal clipsUploadDataInternal, UserId userId) {
            this.b = clipsUploadDataInternal;
            this.c = userId;
        }

        @Override // com.vk.clips.upload.vk.ui.impl.fragment.entity.ClipsUploadErrorType
        public final Set<Object> A8() {
            return this.b.f;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InitialNetworkLoad)) {
                return false;
            }
            InitialNetworkLoad initialNetworkLoad = (InitialNetworkLoad) obj;
            return epx.f(this.b, initialNetworkLoad.b) && epx.f(this.c, initialNetworkLoad.c);
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            UserId userId = this.c;
            return hashCode + (userId == null ? 0 : Long.hashCode(userId.b));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InitialNetworkLoad(uploadDataInternal=");
            sb.append(this.b);
            sb.append(", selectedUser=");
            return gp.b(sb, this.c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.b.writeToParcel(parcel, i);
            parcel.writeParcelable(this.c, i);
        }
    }

    /* compiled from: ClipsUploadErrorType.kt */
    public static final class InitialParamsCompactSetup implements ClipsUploadErrorType {
        public static final Parcelable.Creator<InitialParamsCompactSetup> CREATOR = new a();
        public final ClipsUploadUiVkNavigator.ClipUploadDataCompact b;
        public final Set<Object> c;

        /* compiled from: ClipsUploadErrorType.kt */
        public static final class a implements Parcelable.Creator<InitialParamsCompactSetup> {
            @Override // android.os.Parcelable.Creator
            public final InitialParamsCompactSetup createFromParcel(Parcel parcel) {
                ClipsUploadUiVkNavigator.ClipUploadDataCompact clipUploadDataCompact = (ClipsUploadUiVkNavigator.ClipUploadDataCompact) parcel.readParcelable(InitialParamsCompactSetup.class.getClassLoader());
                int readInt = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                for (int i = 0; i != readInt; i++) {
                    linkedHashSet.add(parcel.readParcelable(InitialParamsCompactSetup.class.getClassLoader()));
                }
                return new InitialParamsCompactSetup(clipUploadDataCompact, linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final InitialParamsCompactSetup[] newArray(int i) {
                return new InitialParamsCompactSetup[i];
            }
        }

        public InitialParamsCompactSetup(ClipsUploadUiVkNavigator.ClipUploadDataCompact clipUploadDataCompact, Set<Object> set) {
            this.b = clipUploadDataCompact;
            this.c = set;
        }

        @Override // com.vk.clips.upload.vk.ui.impl.fragment.entity.ClipsUploadErrorType
        public final Set<Object> A8() {
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
            if (!(obj instanceof InitialParamsCompactSetup)) {
                return false;
            }
            InitialParamsCompactSetup initialParamsCompactSetup = (InitialParamsCompactSetup) obj;
            return epx.f(this.b, initialParamsCompactSetup.b) && epx.f(this.c, initialParamsCompactSetup.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InitialParamsCompactSetup(inputParams=");
            sb.append(this.b);
            sb.append(", enabledFeatures=");
            return ur.c(sb, this.c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            Set<Object> set = this.c;
            parcel.writeInt(set.size());
            Iterator<Object> it = set.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable((Parcelable) it.next(), i);
            }
        }
    }

    /* compiled from: ClipsUploadErrorType.kt */
    public static final class InitialParamsFullSetup implements ClipsUploadErrorType {
        public static final Parcelable.Creator<InitialParamsFullSetup> CREATOR = new a();
        public final ClipsUploadUiVkNavigator.ClipUploadDataFull b;
        public final Set<Object> c;

        /* compiled from: ClipsUploadErrorType.kt */
        public static final class a implements Parcelable.Creator<InitialParamsFullSetup> {
            @Override // android.os.Parcelable.Creator
            public final InitialParamsFullSetup createFromParcel(Parcel parcel) {
                ClipsUploadUiVkNavigator.ClipUploadDataFull clipUploadDataFull = (ClipsUploadUiVkNavigator.ClipUploadDataFull) parcel.readParcelable(InitialParamsFullSetup.class.getClassLoader());
                int readInt = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                for (int i = 0; i != readInt; i++) {
                    linkedHashSet.add(parcel.readParcelable(InitialParamsFullSetup.class.getClassLoader()));
                }
                return new InitialParamsFullSetup(clipUploadDataFull, linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final InitialParamsFullSetup[] newArray(int i) {
                return new InitialParamsFullSetup[i];
            }
        }

        public InitialParamsFullSetup(ClipsUploadUiVkNavigator.ClipUploadDataFull clipUploadDataFull, Set<Object> set) {
            this.b = clipUploadDataFull;
            this.c = set;
        }

        @Override // com.vk.clips.upload.vk.ui.impl.fragment.entity.ClipsUploadErrorType
        public final Set<Object> A8() {
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
            if (!(obj instanceof InitialParamsFullSetup)) {
                return false;
            }
            InitialParamsFullSetup initialParamsFullSetup = (InitialParamsFullSetup) obj;
            return epx.f(this.b, initialParamsFullSetup.b) && epx.f(this.c, initialParamsFullSetup.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InitialParamsFullSetup(inputParams=");
            sb.append(this.b);
            sb.append(", enabledFeatures=");
            return ur.c(sb, this.c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            Set<Object> set = this.c;
            parcel.writeInt(set.size());
            Iterator<Object> it = set.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable((Parcelable) it.next(), i);
            }
        }
    }

    Set<Object> A8();
}
