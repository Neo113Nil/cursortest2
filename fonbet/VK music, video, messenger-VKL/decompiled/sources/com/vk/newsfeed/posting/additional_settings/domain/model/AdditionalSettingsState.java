package com.vk.newsfeed.posting.additional_settings.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.core.serialize.Serializer;
import com.vk.newsfeed.posting.additional_settings.data.AdditionalSettingsConfiguration;
import com.vk.newsfeed.posting.additional_settings.domain.model.author.WallOwner;
import com.vk.newsfeed.posting.impl.domain.model.UserType;
import java.util.UUID;
import xsna.epx;
import xsna.km50;
import xsna.qoy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AdditionalSettingsState.kt */
/* loaded from: classes4.dex */
public abstract class AdditionalSettingsState implements km50, Parcelable {

    /* compiled from: AdditionalSettingsState.kt */
    public static final class Data extends AdditionalSettingsState {
        public static final Parcelable.Creator<Data> CREATOR = new a();
        public final WallOwner b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final boolean f;
        public final AdditionalSettingsConfiguration g;
        public final boolean h;
        public final boolean i;
        public final boolean j;
        public final UserType k;
        public final boolean l;
        public final boolean m;
        public final String n;
        public final String o;
        public final UUID p;

        /* compiled from: AdditionalSettingsState.kt */
        public static final class a implements Parcelable.Creator<Data> {
            /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
                java.lang.NullPointerException
                */
            @Override // android.os.Parcelable.Creator
            public final com.vk.newsfeed.posting.additional_settings.domain.model.AdditionalSettingsState.Data createFromParcel(
            /*  JADX ERROR: Method generation error
                jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r18v0 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
                	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                */
            /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
                java.lang.NullPointerException
                */

            @Override // android.os.Parcelable.Creator
            public final Data[] newArray(int i) {
                return new Data[i];
            }
        }

        public Data(WallOwner wallOwner, boolean z, boolean z2, boolean z3, boolean z4, AdditionalSettingsConfiguration additionalSettingsConfiguration, boolean z5, boolean z6, boolean z7, UserType userType, boolean z8, boolean z9, String str, String str2, UUID uuid) {
            super(null);
            this.b = wallOwner;
            this.c = z;
            this.d = z2;
            this.e = z3;
            this.f = z4;
            this.g = additionalSettingsConfiguration;
            this.h = z5;
            this.i = z6;
            this.j = z7;
            this.k = userType;
            this.l = z8;
            this.m = z9;
            this.n = str;
            this.o = str2;
            this.p = uuid;
        }

        public static Data a(Data data, AdditionalSettingsConfiguration additionalSettingsConfiguration, boolean z, int i) {
            WallOwner wallOwner = data.b;
            boolean z2 = data.c;
            boolean z3 = data.d;
            boolean z4 = (i & 8) != 0 ? data.e : true;
            boolean z5 = data.f;
            AdditionalSettingsConfiguration additionalSettingsConfiguration2 = (i & 32) != 0 ? data.g : additionalSettingsConfiguration;
            boolean z6 = data.h;
            boolean z7 = z4;
            AdditionalSettingsConfiguration additionalSettingsConfiguration3 = additionalSettingsConfiguration2;
            boolean z8 = data.i;
            boolean z9 = (i & 256) != 0 ? data.j : z;
            UserType userType = data.k;
            boolean z10 = data.l;
            boolean z11 = data.m;
            String str = data.n;
            String str2 = data.o;
            UUID uuid = data.p;
            data.getClass();
            return new Data(wallOwner, z2, z3, z7, z5, additionalSettingsConfiguration3, z6, z8, z9, userType, z10, z11, str, str2, uuid);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return epx.f(this.b, data.b) && this.c == data.c && this.d == data.d && this.e == data.e && this.f == data.f && epx.f(this.g, data.g) && this.h == data.h && this.i == data.i && this.j == data.j && this.k == data.k && this.l == data.l && this.m == data.m && epx.f(this.n, data.n) && epx.f(this.o, data.o) && epx.f(this.p, data.p);
        }

        public final int hashCode() {
            return this.p.hashCode() + urd0.a(urd0.a(qoy.b(qoy.b((this.k.hashCode() + qoy.b(qoy.b(qoy.b((this.g.hashCode() + qoy.b(qoy.b(qoy.b(qoy.b(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31, 31, this.h), 31, this.i), 31, this.j)) * 31, 31, this.l), 31, this.m), 31, this.n), 31, this.o);
        }

        public final String toString() {
            return "Data(owner=" + this.b + ", isEditMode=" + this.c + ", isDraft=" + this.d + ", isCommentChangeAvailable=" + this.e + ", shouldShowNotificationsButton=" + this.f + ", additionalSettingsConfiguration=" + this.g + ", isCommunity=" + this.h + ", hasCoauthors=" + this.i + ", showTurnOnCommentsAlert=" + this.j + ", userType=" + this.k + ", isSuggest=" + this.l + ", isAdmin=" + this.m + ", signerFirstNameGen=" + this.n + ", signerLastNameGen=" + this.o + ", targetScreenUniqueId=" + this.p + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            WallOwner wallOwner = this.b;
            wallOwner.getClass();
            Serializer.StreamParcelable.a.a(wallOwner, parcel);
            parcel.writeInt(this.c ? 1 : 0);
            parcel.writeInt(this.d ? 1 : 0);
            parcel.writeInt(this.e ? 1 : 0);
            parcel.writeInt(this.f ? 1 : 0);
            this.g.writeToParcel(parcel, i);
            parcel.writeInt(this.h ? 1 : 0);
            parcel.writeInt(this.i ? 1 : 0);
            parcel.writeInt(this.j ? 1 : 0);
            parcel.writeString(this.k.name());
            parcel.writeInt(this.l ? 1 : 0);
            parcel.writeInt(this.m ? 1 : 0);
            parcel.writeString(this.n);
            parcel.writeString(this.o);
            parcel.writeSerializable(this.p);
        }
    }

    /* compiled from: AdditionalSettingsState.kt */
    public static final class Init extends AdditionalSettingsState {
        public static final Parcelable.Creator<Init> CREATOR = new a();
        public final WallOwner b;

        /* compiled from: AdditionalSettingsState.kt */
        public static final class a implements Parcelable.Creator<Init> {
            @Override // android.os.Parcelable.Creator
            public final Init createFromParcel(Parcel parcel) {
                return new Init(WallOwner.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Init[] newArray(int i) {
                return new Init[i];
            }
        }

        public Init(WallOwner wallOwner) {
            super(null);
            this.b = wallOwner;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Init) && epx.f(this.b, ((Init) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Init(owner=" + this.b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            WallOwner wallOwner = this.b;
            wallOwner.getClass();
            Serializer.StreamParcelable.a.a(wallOwner, parcel);
        }
    }

    public /* synthetic */ AdditionalSettingsState(zcl zclVar) {
        this();
    }

    public AdditionalSettingsState() {
    }
}
