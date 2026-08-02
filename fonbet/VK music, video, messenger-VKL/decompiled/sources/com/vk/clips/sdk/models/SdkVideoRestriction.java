package com.vk.clips.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.qoy;
import xsna.sn;
import xsna.urd0;

/* compiled from: SdkVideoRestriction.kt */
/* loaded from: classes17.dex */
public final class SdkVideoRestriction implements Parcelable {
    public static final Parcelable.Creator<SdkVideoRestriction> CREATOR = new a();
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final SdkRestrictionButton i;
    public final SdkImages j;
    public final Integer k;
    public final SdkImages l;
    public final Boolean m;
    public final String n;
    public final String o;

    /* compiled from: SdkVideoRestriction.kt */
    public static final class a implements Parcelable.Creator<SdkVideoRestriction> {
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 com.vk.clips.sdk.models.SdkVideoRestriction, still in use, count: 2, list:
              (r1v0 com.vk.clips.sdk.models.SdkVideoRestriction) from 0x000f: MOVE (r2v1 com.vk.clips.sdk.models.SdkVideoRestriction) = (r1v0 com.vk.clips.sdk.models.SdkVideoRestriction) (LINE:16)
              (r1v0 com.vk.clips.sdk.models.SdkVideoRestriction) from 0x000c: MOVE (r2v6 com.vk.clips.sdk.models.SdkVideoRestriction) = (r1v0 com.vk.clips.sdk.models.SdkVideoRestriction) (LINE:13)
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
            	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
            	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // android.os.Parcelable.Creator
        public final com.vk.clips.sdk.models.SdkVideoRestriction createFromParcel(android.os.Parcel r18) {
            /*
                r17 = this;
                r0 = r18
                com.vk.clips.sdk.models.SdkVideoRestriction r1 = new com.vk.clips.sdk.models.SdkVideoRestriction
                int r2 = r0.readInt()
                r3 = 0
                r4 = 1
                if (r2 == 0) goto Lf
                r2 = r1
                r1 = r4
                goto L11
            Lf:
                r2 = r1
                r1 = r3
            L11:
                java.lang.String r5 = r0.readString()
                r6 = r3
                java.lang.String r3 = r0.readString()
                r7 = r4
                java.lang.String r4 = r0.readString()
                int r8 = r0.readInt()
                if (r8 == 0) goto L29
                r8 = r2
                r2 = r5
                r5 = r7
                goto L2c
            L29:
                r8 = r2
                r2 = r5
                r5 = r6
            L2c:
                int r9 = r0.readInt()
                if (r9 == 0) goto L35
                r9 = r6
                r6 = r7
                goto L36
            L35:
                r9 = r6
            L36:
                int r10 = r0.readInt()
                if (r10 == 0) goto L3e
                r10 = r7
                goto L40
            L3e:
                r10 = r7
                r7 = r9
            L40:
                int r11 = r0.readInt()
                r12 = 0
                if (r11 != 0) goto L49
                r11 = r12
                goto L4f
            L49:
                android.os.Parcelable$Creator<com.vk.clips.sdk.models.SdkRestrictionButton> r11 = com.vk.clips.sdk.models.SdkRestrictionButton.CREATOR
                java.lang.Object r11 = r11.createFromParcel(r0)
            L4f:
                com.vk.clips.sdk.models.SdkRestrictionButton r11 = (com.vk.clips.sdk.models.SdkRestrictionButton) r11
                int r13 = r0.readInt()
                if (r13 != 0) goto L59
                r13 = r12
                goto L5f
            L59:
                android.os.Parcelable$Creator<com.vk.clips.sdk.models.SdkImages> r13 = com.vk.clips.sdk.models.SdkImages.CREATOR
                java.lang.Object r13 = r13.createFromParcel(r0)
            L5f:
                com.vk.clips.sdk.models.SdkImages r13 = (com.vk.clips.sdk.models.SdkImages) r13
                int r14 = r0.readInt()
                if (r14 != 0) goto L69
                r14 = r12
                goto L71
            L69:
                int r14 = r0.readInt()
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            L71:
                int r15 = r0.readInt()
                if (r15 != 0) goto L79
                r15 = r12
                goto L7f
            L79:
                android.os.Parcelable$Creator<com.vk.clips.sdk.models.SdkImages> r15 = com.vk.clips.sdk.models.SdkImages.CREATOR
                java.lang.Object r15 = r15.createFromParcel(r0)
            L7f:
                com.vk.clips.sdk.models.SdkImages r15 = (com.vk.clips.sdk.models.SdkImages) r15
                int r16 = r0.readInt()
                if (r16 != 0) goto L89
            L87:
                r9 = r13
                goto L95
            L89:
                int r12 = r0.readInt()
                if (r12 == 0) goto L90
                r9 = r10
            L90:
                java.lang.Boolean r12 = java.lang.Boolean.valueOf(r9)
                goto L87
            L95:
                java.lang.String r13 = r0.readString()
                java.lang.String r0 = r0.readString()
                r10 = r14
                r14 = r0
                r0 = r8
                r8 = r11
                r11 = r15
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.vk.clips.sdk.models.SdkVideoRestriction.a.createFromParcel(android.os.Parcel):java.lang.Object");
        }

        @Override // android.os.Parcelable.Creator
        public final SdkVideoRestriction[] newArray(int i) {
            return new SdkVideoRestriction[i];
        }
    }

    public SdkVideoRestriction(boolean z, String str, String str2, String str3, boolean z2, boolean z3, boolean z4, SdkRestrictionButton sdkRestrictionButton, SdkImages sdkImages, Integer num, SdkImages sdkImages2, Boolean bool, String str4, String str5) {
        this.b = z;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = sdkRestrictionButton;
        this.j = sdkImages;
        this.k = num;
        this.l = sdkImages2;
        this.m = bool;
        this.n = str4;
        this.o = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdkVideoRestriction)) {
            return false;
        }
        SdkVideoRestriction sdkVideoRestriction = (SdkVideoRestriction) obj;
        return this.b == sdkVideoRestriction.b && epx.f(this.c, sdkVideoRestriction.c) && epx.f(this.d, sdkVideoRestriction.d) && epx.f(this.e, sdkVideoRestriction.e) && this.f == sdkVideoRestriction.f && this.g == sdkVideoRestriction.g && this.h == sdkVideoRestriction.h && epx.f(this.i, sdkVideoRestriction.i) && epx.f(this.j, sdkVideoRestriction.j) && epx.f(this.k, sdkVideoRestriction.k) && epx.f(this.l, sdkVideoRestriction.l) && epx.f(this.m, sdkVideoRestriction.m) && epx.f(this.n, sdkVideoRestriction.n) && epx.f(this.o, sdkVideoRestriction.o);
    }

    public final int hashCode() {
        int a2 = urd0.a(Boolean.hashCode(this.b) * 31, 31, this.c);
        String str = this.d;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int b = qoy.b(qoy.b(qoy.b((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h);
        SdkRestrictionButton sdkRestrictionButton = this.i;
        int hashCode2 = (b + (sdkRestrictionButton == null ? 0 : sdkRestrictionButton.b.hashCode())) * 31;
        SdkImages sdkImages = this.j;
        int hashCode3 = (hashCode2 + (sdkImages == null ? 0 : sdkImages.hashCode())) * 31;
        Integer num = this.k;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        SdkImages sdkImages2 = this.l;
        int hashCode5 = (hashCode4 + (sdkImages2 == null ? 0 : sdkImages2.hashCode())) * 31;
        Boolean bool = this.m;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.n;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.o;
        return hashCode7 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SdkVideoRestriction(accepted=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", text=");
        sb.append(this.d);
        sb.append(", buttonTitle=");
        sb.append(this.e);
        sb.append(", blur=");
        sb.append(this.f);
        sb.append(", canPlay=");
        sb.append(this.g);
        sb.append(", canPreview=");
        sb.append(this.h);
        sb.append(", button=");
        sb.append(this.i);
        sb.append(", cardIcon=");
        sb.append(this.j);
        sb.append(", disclaimerType=");
        sb.append(this.k);
        sb.append(", listIcon=");
        sb.append(this.l);
        sb.append(", alwaysShown=");
        sb.append(this.m);
        sb.append(", muteInfoLink=");
        sb.append(this.n);
        sb.append(", iconName=");
        return ho8.a(sb, this.o, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        SdkRestrictionButton sdkRestrictionButton = this.i;
        if (sdkRestrictionButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sdkRestrictionButton.writeToParcel(parcel, i);
        }
        SdkImages sdkImages = this.j;
        if (sdkImages == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sdkImages.writeToParcel(parcel, i);
        }
        Integer num = this.k;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        SdkImages sdkImages2 = this.l;
        if (sdkImages2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sdkImages2.writeToParcel(parcel, i);
        }
        Boolean bool = this.m;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeString(this.n);
        parcel.writeString(this.o);
    }
}
