package com.sofascore.model.profile;

import android.os.Parcel;
import android.os.Parcelable;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.dmi;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.vxd;
import defpackage.wf3;
import defpackage.wt3;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002@?BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fBW\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010 \u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\r¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0010\u0010%\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b'\u0010&J\u0010\u0010(\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b(\u0010&J\u0010\u0010)\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b)\u0010&J\u0010\u0010*\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b*\u0010&JZ\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010#J\u0010\u0010.\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b.\u0010\u001cJ\u001a\u00101\u001a\u00020\u00052\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b1\u00102R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010#R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00103\u001a\u0004\b5\u0010#R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b7\u0010&R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b8\u0010&R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b9\u0010&R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b:\u0010&R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b;\u0010&R\u0011\u0010<\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b<\u0010&R\u0011\u0010>\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b=\u0010\u001c¨\u0006A"}, d2 = {"Lcom/sofascore/model/profile/InvitedUser;", "Landroid/os/Parcelable;", "", "userAccountId", "nickname", "", "createdAccount", "followPlayer", "followTeam", "visitEvents", "metActivityThreshold", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZZZZ)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZZZZZLt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/profile/InvitedUser;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;ZZZZZ)Lcom/sofascore/model/profile/InvitedUser;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUserAccountId", "getNickname", "Z", "getCreatedAccount", "getFollowPlayer", "getFollowTeam", "getVisitEvents", "getMetActivityThreshold", "isProgressFinished", "getProgressCount", "progressCount", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class InvitedUser implements Parcelable {
    private final boolean createdAccount;
    private final boolean followPlayer;
    private final boolean followTeam;
    private final boolean metActivityThreshold;

    @Nullable
    private final String nickname;

    @Nullable
    private final String userAccountId;
    private final boolean visitEvents;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<InvitedUser> CREATOR = new Creator();

    public /* synthetic */ InvitedUser(int i, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, t5h t5hVar) {
        if (127 != (i & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE)) {
            oea.z(i, Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, InvitedUser$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.userAccountId = str;
        this.nickname = str2;
        this.createdAccount = z;
        this.followPlayer = z2;
        this.followTeam = z3;
        this.visitEvents = z4;
        this.metActivityThreshold = z5;
    }

    public static /* synthetic */ InvitedUser copy$default(InvitedUser invitedUser, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = invitedUser.userAccountId;
        }
        if ((i & 2) != 0) {
            str2 = invitedUser.nickname;
        }
        if ((i & 4) != 0) {
            z = invitedUser.createdAccount;
        }
        if ((i & 8) != 0) {
            z2 = invitedUser.followPlayer;
        }
        if ((i & 16) != 0) {
            z3 = invitedUser.followTeam;
        }
        if ((i & 32) != 0) {
            z4 = invitedUser.visitEvents;
        }
        if ((i & 64) != 0) {
            z5 = invitedUser.metActivityThreshold;
        }
        boolean z6 = z4;
        boolean z7 = z5;
        boolean z8 = z3;
        boolean z9 = z;
        return invitedUser.copy(str, str2, z9, z2, z8, z6, z7);
    }

    public static final /* synthetic */ void write$Self$model_release(InvitedUser self, wf3 output, SerialDescriptor serialDesc) {
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 0, uhiVar, self.userAccountId);
        output.h(serialDesc, 1, uhiVar, self.nickname);
        output.x(serialDesc, 2, self.createdAccount);
        output.x(serialDesc, 3, self.followPlayer);
        output.x(serialDesc, 4, self.followTeam);
        output.x(serialDesc, 5, self.visitEvents);
        output.x(serialDesc, 6, self.metActivityThreshold);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getUserAccountId() {
        return this.userAccountId;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getCreatedAccount() {
        return this.createdAccount;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getFollowPlayer() {
        return this.followPlayer;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getFollowTeam() {
        return this.followTeam;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getVisitEvents() {
        return this.visitEvents;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getMetActivityThreshold() {
        return this.metActivityThreshold;
    }

    @NotNull
    public final InvitedUser copy(@Nullable String userAccountId, @Nullable String nickname, boolean createdAccount, boolean followPlayer, boolean followTeam, boolean visitEvents, boolean metActivityThreshold) {
        return new InvitedUser(userAccountId, nickname, createdAccount, followPlayer, followTeam, visitEvents, metActivityThreshold);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvitedUser)) {
            return false;
        }
        InvitedUser invitedUser = (InvitedUser) other;
        return Intrinsics.c(this.userAccountId, invitedUser.userAccountId) && Intrinsics.c(this.nickname, invitedUser.nickname) && this.createdAccount == invitedUser.createdAccount && this.followPlayer == invitedUser.followPlayer && this.followTeam == invitedUser.followTeam && this.visitEvents == invitedUser.visitEvents && this.metActivityThreshold == invitedUser.metActivityThreshold;
    }

    public final boolean getCreatedAccount() {
        return this.createdAccount;
    }

    public final boolean getFollowPlayer() {
        return this.followPlayer;
    }

    public final boolean getFollowTeam() {
        return this.followTeam;
    }

    public final boolean getMetActivityThreshold() {
        return this.metActivityThreshold;
    }

    @Nullable
    public final String getNickname() {
        return this.nickname;
    }

    public final int getProgressCount() {
        List j = b.j(Boolean.valueOf(this.createdAccount), Boolean.valueOf(this.followPlayer), Boolean.valueOf(this.followTeam), Boolean.valueOf(this.visitEvents), Boolean.valueOf(this.metActivityThreshold));
        int i = 0;
        if (j != null && j.isEmpty()) {
            return 0;
        }
        Iterator it = j.iterator();
        while (it.hasNext()) {
            if (((Boolean) it.next()).booleanValue() && (i = i + 1) < 0) {
                b.p();
                throw null;
            }
        }
        return i;
    }

    @Nullable
    public final String getUserAccountId() {
        return this.userAccountId;
    }

    public final boolean getVisitEvents() {
        return this.visitEvents;
    }

    public int hashCode() {
        String str = this.userAccountId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.nickname;
        return Boolean.hashCode(this.metActivityThreshold) + dmi.e(dmi.e(dmi.e(dmi.e((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.createdAccount), 31, this.followPlayer), 31, this.followTeam), 31, this.visitEvents);
    }

    public final boolean isProgressFinished() {
        return this.createdAccount && this.followPlayer && this.followTeam && this.visitEvents && this.metActivityThreshold;
    }

    @NotNull
    public String toString() {
        String str = this.userAccountId;
        String str2 = this.nickname;
        boolean z = this.createdAccount;
        boolean z2 = this.followPlayer;
        boolean z3 = this.followTeam;
        boolean z4 = this.visitEvents;
        boolean z5 = this.metActivityThreshold;
        StringBuilder s = mz1.s("InvitedUser(userAccountId=", str, ", nickname=", str2, ", createdAccount=");
        vxd.t(", followPlayer=", ", followTeam=", s, z, z2);
        vxd.t(", visitEvents=", ", metActivityThreshold=", s, z3, z4);
        return wt3.p(s, z5, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.userAccountId);
        dest.writeString(this.nickname);
        dest.writeInt(this.createdAccount ? 1 : 0);
        dest.writeInt(this.followPlayer ? 1 : 0);
        dest.writeInt(this.followTeam ? 1 : 0);
        dest.writeInt(this.visitEvents ? 1 : 0);
        dest.writeInt(this.metActivityThreshold ? 1 : 0);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/profile/InvitedUser$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/profile/InvitedUser;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return InvitedUser$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<InvitedUser> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvitedUser createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            parcel.getClass();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            boolean z5 = false;
            boolean z6 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z5 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z6 = z;
            }
            if (parcel.readInt() != 0) {
                z3 = z2;
            } else {
                z3 = z2;
                z2 = z;
            }
            if (parcel.readInt() != 0) {
                z4 = z3;
            } else {
                z4 = z3;
                z3 = z;
            }
            if (parcel.readInt() == 0) {
                z4 = z;
            }
            return new InvitedUser(readString, readString2, z5, z6, z2, z3, z4);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvitedUser[] newArray(int i) {
            return new InvitedUser[i];
        }
    }

    public InvitedUser(@Nullable String str, @Nullable String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.userAccountId = str;
        this.nickname = str2;
        this.createdAccount = z;
        this.followPlayer = z2;
        this.followTeam = z3;
        this.visitEvents = z4;
        this.metActivityThreshold = z5;
    }
}
