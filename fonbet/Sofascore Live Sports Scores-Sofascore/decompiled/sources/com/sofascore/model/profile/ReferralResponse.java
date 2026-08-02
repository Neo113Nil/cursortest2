package com.sofascore.model.profile;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dmi;
import defpackage.fc6;
import defpackage.joa;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.w1l;
import defpackage.wf3;
import defpackage.wtf;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002=<B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBM\b\u0010\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b(\u0010\u001bJJ\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b.\u0010\u001bJ\u001a\u00101\u001a\u00020\u00022\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00103\u001a\u0004\b5\u0010\"R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b7\u0010%R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b9\u0010'R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010:\u001a\u0004\b;\u0010\u001b¨\u0006>"}, d2 = {"Lcom/sofascore/model/profile/ReferralResponse;", "Landroid/os/Parcelable;", "", "showInviteFriendsBanner", "canRedeemReward", "", "Lcom/sofascore/model/profile/InvitedUser;", "invitedUsers", "myProgressAsInvitedUser", "", "invitedUsersWhoCompletedTasks", "<init>", "(ZZLjava/util/List;Lcom/sofascore/model/profile/InvitedUser;I)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IZZLjava/util/List;Lcom/sofascore/model/profile/InvitedUser;ILt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/profile/ReferralResponse;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Z", "component2", "component3", "()Ljava/util/List;", "component4", "()Lcom/sofascore/model/profile/InvitedUser;", "component5", "copy", "(ZZLjava/util/List;Lcom/sofascore/model/profile/InvitedUser;I)Lcom/sofascore/model/profile/ReferralResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShowInviteFriendsBanner", "getCanRedeemReward", "Ljava/util/List;", "getInvitedUsers", "Lcom/sofascore/model/profile/InvitedUser;", "getMyProgressAsInvitedUser", "I", "getInvitedUsersWhoCompletedTasks", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ReferralResponse implements Parcelable {
    private final boolean canRedeemReward;

    @NotNull
    private final List<InvitedUser> invitedUsers;
    private final int invitedUsersWhoCompletedTasks;

    @Nullable
    private final InvitedUser myProgressAsInvitedUser;
    private final boolean showInviteFriendsBanner;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<ReferralResponse> CREATOR = new Creator();

    @NotNull
    private static final joa[] $childSerializers = {null, null, ypa.a(ysa.b, new wtf(0)), null, null};

    public /* synthetic */ ReferralResponse(int i, boolean z, boolean z2, List list, InvitedUser invitedUser, int i2, t5h t5hVar) {
        if (31 != (i & 31)) {
            oea.z(i, 31, ReferralResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.showInviteFriendsBanner = z;
        this.canRedeemReward = z2;
        this.invitedUsers = list;
        this.myProgressAsInvitedUser = invitedUser;
        this.invitedUsersWhoCompletedTasks = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(InvitedUser$$serializer.INSTANCE, 0);
    }

    public static /* synthetic */ ReferralResponse copy$default(ReferralResponse referralResponse, boolean z, boolean z2, List list, InvitedUser invitedUser, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = referralResponse.showInviteFriendsBanner;
        }
        if ((i2 & 2) != 0) {
            z2 = referralResponse.canRedeemReward;
        }
        if ((i2 & 4) != 0) {
            list = referralResponse.invitedUsers;
        }
        if ((i2 & 8) != 0) {
            invitedUser = referralResponse.myProgressAsInvitedUser;
        }
        if ((i2 & 16) != 0) {
            i = referralResponse.invitedUsersWhoCompletedTasks;
        }
        int i3 = i;
        List list2 = list;
        return referralResponse.copy(z, z2, list2, invitedUser, i3);
    }

    public static final /* synthetic */ void write$Self$model_release(ReferralResponse self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.x(serialDesc, 0, self.showInviteFriendsBanner);
        output.x(serialDesc, 1, self.canRedeemReward);
        output.f(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.invitedUsers);
        output.h(serialDesc, 3, InvitedUser$$serializer.INSTANCE, self.myProgressAsInvitedUser);
        output.u(4, self.invitedUsersWhoCompletedTasks, serialDesc);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShowInviteFriendsBanner() {
        return this.showInviteFriendsBanner;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getCanRedeemReward() {
        return this.canRedeemReward;
    }

    @NotNull
    public final List<InvitedUser> component3() {
        return this.invitedUsers;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final InvitedUser getMyProgressAsInvitedUser() {
        return this.myProgressAsInvitedUser;
    }

    /* renamed from: component5, reason: from getter */
    public final int getInvitedUsersWhoCompletedTasks() {
        return this.invitedUsersWhoCompletedTasks;
    }

    @NotNull
    public final ReferralResponse copy(boolean showInviteFriendsBanner, boolean canRedeemReward, @NotNull List<InvitedUser> invitedUsers, @Nullable InvitedUser myProgressAsInvitedUser, int invitedUsersWhoCompletedTasks) {
        invitedUsers.getClass();
        return new ReferralResponse(showInviteFriendsBanner, canRedeemReward, invitedUsers, myProgressAsInvitedUser, invitedUsersWhoCompletedTasks);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReferralResponse)) {
            return false;
        }
        ReferralResponse referralResponse = (ReferralResponse) other;
        return this.showInviteFriendsBanner == referralResponse.showInviteFriendsBanner && this.canRedeemReward == referralResponse.canRedeemReward && Intrinsics.c(this.invitedUsers, referralResponse.invitedUsers) && Intrinsics.c(this.myProgressAsInvitedUser, referralResponse.myProgressAsInvitedUser) && this.invitedUsersWhoCompletedTasks == referralResponse.invitedUsersWhoCompletedTasks;
    }

    public final boolean getCanRedeemReward() {
        return this.canRedeemReward;
    }

    @NotNull
    public final List<InvitedUser> getInvitedUsers() {
        return this.invitedUsers;
    }

    public final int getInvitedUsersWhoCompletedTasks() {
        return this.invitedUsersWhoCompletedTasks;
    }

    @Nullable
    public final InvitedUser getMyProgressAsInvitedUser() {
        return this.myProgressAsInvitedUser;
    }

    public final boolean getShowInviteFriendsBanner() {
        return this.showInviteFriendsBanner;
    }

    public int hashCode() {
        int d = dmi.d(dmi.e(Boolean.hashCode(this.showInviteFriendsBanner) * 31, 31, this.canRedeemReward), 31, this.invitedUsers);
        InvitedUser invitedUser = this.myProgressAsInvitedUser;
        return Integer.hashCode(this.invitedUsersWhoCompletedTasks) + ((d + (invitedUser == null ? 0 : invitedUser.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        boolean z = this.showInviteFriendsBanner;
        boolean z2 = this.canRedeemReward;
        List<InvitedUser> list = this.invitedUsers;
        InvitedUser invitedUser = this.myProgressAsInvitedUser;
        int i = this.invitedUsersWhoCompletedTasks;
        StringBuilder k = w1l.k("ReferralResponse(showInviteFriendsBanner=", z, ", canRedeemReward=", z2, ", invitedUsers=");
        k.append(list);
        k.append(", myProgressAsInvitedUser=");
        k.append(invitedUser);
        k.append(", invitedUsersWhoCompletedTasks=");
        return fc6.h(i, ")", k);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(this.showInviteFriendsBanner ? 1 : 0);
        dest.writeInt(this.canRedeemReward ? 1 : 0);
        List<InvitedUser> list = this.invitedUsers;
        dest.writeInt(list.size());
        Iterator<InvitedUser> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        InvitedUser invitedUser = this.myProgressAsInvitedUser;
        if (invitedUser == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            invitedUser.writeToParcel(dest, flags);
        }
        dest.writeInt(this.invitedUsersWhoCompletedTasks);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/profile/ReferralResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/profile/ReferralResponse;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ReferralResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ReferralResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReferralResponse createFromParcel(Parcel parcel) {
            parcel.getClass();
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(InvitedUser.CREATOR.createFromParcel(parcel));
            }
            return new ReferralResponse(z, z2, arrayList, parcel.readInt() == 0 ? null : InvitedUser.CREATOR.createFromParcel(parcel), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReferralResponse[] newArray(int i) {
            return new ReferralResponse[i];
        }
    }

    public ReferralResponse(boolean z, boolean z2, @NotNull List<InvitedUser> list, @Nullable InvitedUser invitedUser, int i) {
        list.getClass();
        this.showInviteFriendsBanner = z;
        this.canRedeemReward = z2;
        this.invitedUsers = list;
        this.myProgressAsInvitedUser = invitedUser;
        this.invitedUsersWhoCompletedTasks = i;
    }
}
