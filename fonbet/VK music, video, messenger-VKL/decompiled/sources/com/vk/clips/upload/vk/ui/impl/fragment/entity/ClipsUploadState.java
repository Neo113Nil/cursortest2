package com.vk.clips.upload.vk.ui.impl.fragment.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.vk.clips.upload.vk.ui.impl.fragment.data.api.UploadUserInfo;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadDataInternal;
import com.vk.dto.common.id.UserId;
import com.vk.dto.geo.GeoLocation;
import com.vk.dto.group.Group;
import defpackage.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import xsna.ao;
import xsna.bh10;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.lm50;
import xsna.qoy;
import xsna.shy;
import xsna.ur;

/* compiled from: ClipsUploadState.kt */
/* loaded from: classes17.dex */
public interface ClipsUploadState extends lm50, Parcelable {

    /* compiled from: ClipsUploadState.kt */
    public static final class Error implements ClipsUploadState {
        public static final Parcelable.Creator<Error> CREATOR = new a();
        public final ClipsUploadErrorType b;

        /* compiled from: ClipsUploadState.kt */
        public static final class a implements Parcelable.Creator<Error> {
            @Override // android.os.Parcelable.Creator
            public final Error createFromParcel(Parcel parcel) {
                return new Error((ClipsUploadErrorType) parcel.readParcelable(Error.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Error[] newArray(int i) {
                return new Error[i];
            }
        }

        public Error(ClipsUploadErrorType clipsUploadErrorType) {
            this.b = clipsUploadErrorType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && epx.f(this.b, ((Error) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Error(type=" + this.b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
        }
    }

    /* compiled from: ClipsUploadState.kt */
    public static final class Loading implements ClipsUploadState {
        public static final Parcelable.Creator<Loading> CREATOR = new a();
        public final Set<Object> b;

        /* compiled from: ClipsUploadState.kt */
        public static final class a implements Parcelable.Creator<Loading> {
            @Override // android.os.Parcelable.Creator
            public final Loading createFromParcel(Parcel parcel) {
                int readInt = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                for (int i = 0; i != readInt; i++) {
                    linkedHashSet.add(parcel.readParcelable(Loading.class.getClassLoader()));
                }
                return new Loading(linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final Loading[] newArray(int i) {
                return new Loading[i];
            }
        }

        public Loading(Set<Object> set) {
            this.b = set;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && epx.f(this.b, ((Loading) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ur.c(new StringBuilder("Loading(enabledFeatures="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Set<Object> set = this.b;
            parcel.writeInt(set.size());
            Iterator<Object> it = set.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable((Parcelable) it.next(), i);
            }
        }
    }

    /* compiled from: ClipsUploadState.kt */
    public static final class Loaded implements ClipsUploadState {
        public static final Parcelable.Creator<Loaded> CREATOR = new a();
        public final ClipsUploadDataInternal b;
        public final List<Group> c;
        public final UploadUserInfo d;
        public final Group e;
        public final UserId f;
        public final List<GeoLocation> g;
        public final int h;
        public final boolean i;
        public final int j;
        public final CharSequence k;
        public final boolean l;
        public final boolean m;

        /* compiled from: ClipsUploadState.kt */
        public static final class a implements Parcelable.Creator<Loaded> {
            @Override // android.os.Parcelable.Creator
            public final Loaded createFromParcel(Parcel parcel) {
                boolean z;
                ClipsUploadDataInternal createFromParcel = ClipsUploadDataInternal.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(Loaded.class, parcel, arrayList, i, 1);
                }
                UploadUserInfo createFromParcel2 = parcel.readInt() == 0 ? null : UploadUserInfo.CREATOR.createFromParcel(parcel);
                Group group = (Group) parcel.readParcelable(Loaded.class.getClassLoader());
                UserId userId = (UserId) parcel.readParcelable(Loaded.class.getClassLoader());
                int readInt2 = parcel.readInt();
                boolean z2 = true;
                ArrayList arrayList2 = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = bo.b(Loaded.class, parcel, arrayList2, i2, 1);
                }
                int readInt3 = parcel.readInt();
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = true;
                    z2 = false;
                }
                return new Loaded(createFromParcel, arrayList, createFromParcel2, group, userId, arrayList2, readInt3, z2, parcel.readInt(), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? z : false, parcel.readInt() != 0 ? z : false);
            }

            @Override // android.os.Parcelable.Creator
            public final Loaded[] newArray(int i) {
                return new Loaded[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Loaded(ClipsUploadDataInternal clipsUploadDataInternal, List<? extends Group> list, UploadUserInfo uploadUserInfo, Group group, UserId userId, List<GeoLocation> list2, int i, boolean z, int i2, CharSequence charSequence, boolean z2, boolean z3) {
            this.b = clipsUploadDataInternal;
            this.c = list;
            this.d = uploadUserInfo;
            this.e = group;
            this.f = userId;
            this.g = list2;
            this.h = i;
            this.i = z;
            this.j = i2;
            this.k = charSequence;
            this.l = z2;
            this.m = z3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Loaded a(Loaded loaded, ClipsUploadDataInternal clipsUploadDataInternal, ArrayList arrayList, UploadUserInfo uploadUserInfo, Group group, UserId userId, List list, int i, boolean z, int i2, CharSequence charSequence, boolean z2, boolean z3, int i3) {
            if ((i3 & 1) != 0) {
                clipsUploadDataInternal = loaded.b;
            }
            ClipsUploadDataInternal clipsUploadDataInternal2 = clipsUploadDataInternal;
            List list2 = arrayList;
            if ((i3 & 2) != 0) {
                list2 = loaded.c;
            }
            List list3 = list2;
            UploadUserInfo uploadUserInfo2 = (i3 & 4) != 0 ? loaded.d : uploadUserInfo;
            Group group2 = (i3 & 8) != 0 ? loaded.e : group;
            UserId userId2 = (i3 & 16) != 0 ? loaded.f : userId;
            List list4 = (i3 & 32) != 0 ? loaded.g : list;
            int i4 = (i3 & 64) != 0 ? loaded.h : i;
            boolean z4 = (i3 & 128) != 0 ? loaded.i : z;
            int i5 = (i3 & 256) != 0 ? loaded.j : i2;
            CharSequence charSequence2 = (i3 & 512) != 0 ? loaded.k : charSequence;
            boolean z5 = (i3 & 1024) != 0 ? loaded.l : z2;
            boolean z6 = (i3 & 2048) != 0 ? loaded.m : z3;
            loaded.getClass();
            return new Loaded(clipsUploadDataInternal2, list3, uploadUserInfo2, group2, userId2, list4, i4, z4, i5, charSequence2, z5, z6);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return epx.f(this.b, loaded.b) && epx.f(this.c, loaded.c) && epx.f(this.d, loaded.d) && epx.f(this.e, loaded.e) && epx.f(this.f, loaded.f) && epx.f(this.g, loaded.g) && this.h == loaded.h && this.i == loaded.i && this.j == loaded.j && epx.f(this.k, loaded.k) && this.l == loaded.l && this.m == loaded.m;
        }

        public final int hashCode() {
            int a2 = fw3.a(this.b.hashCode() * 31, 31, this.c);
            UploadUserInfo uploadUserInfo = this.d;
            int hashCode = (a2 + (uploadUserInfo == null ? 0 : uploadUserInfo.hashCode())) * 31;
            Group group = this.e;
            int a3 = shy.a(this.j, qoy.b(shy.a(this.h, fw3.a(bh10.a((hashCode + (group == null ? 0 : group.hashCode())) * 31, 31, this.f.b), 31, this.g), 31), 31, this.i), 31);
            CharSequence charSequence = this.k;
            return Boolean.hashCode(this.m) + qoy.b((a3 + (charSequence != null ? charSequence.hashCode() : 0)) * 31, 31, this.l);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loaded(data=");
            sb.append(this.b);
            sb.append(", groups=");
            sb.append(this.c);
            sb.append(", user=");
            sb.append(this.d);
            sb.append(", initialSelectedGroup=");
            sb.append(this.e);
            sb.append(", selectedUser=");
            sb.append(this.f);
            sb.append(", suggestedPlaces=");
            sb.append(this.g);
            sb.append(", clipUploadId=");
            sb.append(this.h);
            sb.append(", hasMoreAuthors=");
            sb.append(this.i);
            sb.append(", loadedGroups=");
            sb.append(this.j);
            sb.append(", licenseAgreementText=");
            sb.append((Object) this.k);
            sb.append(", markedForAuthorRefresh=");
            sb.append(this.l);
            sb.append(", hasVideoAttachmentOnboarding=");
            return q0.a(sb, this.m, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.b.writeToParcel(parcel, i);
            Iterator a2 = ao.a(parcel, this.c);
            while (a2.hasNext()) {
                parcel.writeParcelable((Parcelable) a2.next(), i);
            }
            UploadUserInfo uploadUserInfo = this.d;
            if (uploadUserInfo == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                uploadUserInfo.writeToParcel(parcel, i);
            }
            parcel.writeParcelable(this.e, i);
            parcel.writeParcelable(this.f, i);
            Iterator a3 = ao.a(parcel, this.g);
            while (a3.hasNext()) {
                parcel.writeParcelable((Parcelable) a3.next(), i);
            }
            parcel.writeInt(this.h);
            parcel.writeInt(this.i ? 1 : 0);
            parcel.writeInt(this.j);
            TextUtils.writeToParcel(this.k, parcel, i);
            parcel.writeInt(this.l ? 1 : 0);
            parcel.writeInt(this.m ? 1 : 0);
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Loaded(com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadDataInternal r16, java.util.List r17, com.vk.clips.upload.vk.ui.impl.fragment.data.api.UploadUserInfo r18, com.vk.dto.group.Group r19, com.vk.dto.common.id.UserId r20, java.util.List r21, int r22, boolean r23, int r24, java.lang.CharSequence r25, boolean r26, boolean r27, int r28, xsna.zcl r29) {
            /*
                r15 = this;
                r0 = r28
                r1 = r0 & 64
                if (r1 == 0) goto L9
                r1 = -1
                r9 = r1
                goto Lb
            L9:
                r9 = r22
            Lb:
                r1 = r0 & 1024(0x400, float:1.435E-42)
                r2 = 0
                if (r1 == 0) goto L12
                r13 = r2
                goto L14
            L12:
                r13 = r26
            L14:
                r0 = r0 & 2048(0x800, float:2.87E-42)
                if (r0 == 0) goto L2d
                r14 = r2
                r3 = r16
                r4 = r17
                r5 = r18
                r6 = r19
                r7 = r20
                r8 = r21
                r10 = r23
                r11 = r24
                r12 = r25
                r2 = r15
                goto L42
            L2d:
                r14 = r27
                r2 = r15
                r3 = r16
                r4 = r17
                r5 = r18
                r6 = r19
                r7 = r20
                r8 = r21
                r10 = r23
                r11 = r24
                r12 = r25
            L42:
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.vk.clips.upload.vk.ui.impl.fragment.entity.ClipsUploadState.Loaded.<init>(com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadDataInternal, java.util.List, com.vk.clips.upload.vk.ui.impl.fragment.data.api.UploadUserInfo, com.vk.dto.group.Group, com.vk.dto.common.id.UserId, java.util.List, int, boolean, int, java.lang.CharSequence, boolean, boolean, int, xsna.zcl):void");
        }
    }
}
