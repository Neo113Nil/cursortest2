package com.sofascore.model.chat;

import androidx.core.app.NotificationCompat;
import com.sofascore.model.profile.UserBadge;
import com.sofascore.model.profile.UserBadgeSerializer;
import defpackage.bf3;
import defpackage.dmi;
import defpackage.me4;
import defpackage.mz1;
import defpackage.oea;
import defpackage.q5h;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.vxd;
import defpackage.wf3;
import defpackage.wv8;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b#\b\u0087\b\u0018\u0000 S2\u00020\u0001:\u0002TSBw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012B}\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0011\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0018J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0018J\u0010\u0010!\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0084\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u0018J\u0010\u0010)\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b)\u0010\"J\u001a\u0010+\u001a\u00020\u00052\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,J'\u00105\u001a\u0002022\u0006\u0010-\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0001¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010\u0018R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00106\u0012\u0004\b9\u0010:\u001a\u0004\b8\u0010\u0018R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010;\u001a\u0004\b\u0006\u0010\u001b\"\u0004\b<\u0010=R(\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u0010;\u0012\u0004\b?\u0010:\u001a\u0004\b\u0007\u0010\u001b\"\u0004\b>\u0010=R(\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\b\u0010;\u0012\u0004\bA\u0010:\u001a\u0004\b\b\u0010\u001b\"\u0004\b@\u0010=R(\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\t\u0010;\u0012\u0004\bC\u0010:\u001a\u0004\b\t\u0010\u001b\"\u0004\bB\u0010=R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u00106\u001a\u0004\bD\u0010\u0018\"\u0004\bE\u0010FR$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u00106\u001a\u0004\bG\u0010\u0018\"\u0004\bH\u0010FR(\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\r\u0010I\u0012\u0004\bM\u0010:\u001a\u0004\bJ\u0010\"\"\u0004\bK\u0010LR(\u0010\u000e\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000e\u0010I\u0012\u0004\bP\u0010:\u001a\u0004\bN\u0010\"\"\u0004\bO\u0010LR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010Q\u001a\u0004\bR\u0010%¨\u0006U"}, d2 = {"Lcom/sofascore/model/chat/ChatUser;", "", "", "id", "name", "", "isLoggedIn", "isAdmin", "isBanned", "isModerator", "color", "chatFlag", "", "warns", "bans", "Lcom/sofascore/model/profile/UserBadge;", "userBadge", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZZZLjava/lang/String;Ljava/lang/String;IILcom/sofascore/model/profile/UserBadge;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZZZZLjava/lang/String;Ljava/lang/String;IILcom/sofascore/model/profile/UserBadge;Lt5h;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "component5", "component6", "component7", "component8", "component9", "()I", "component10", "component11", "()Lcom/sofascore/model/profile/UserBadge;", "copy", "(Ljava/lang/String;Ljava/lang/String;ZZZZLjava/lang/String;Ljava/lang/String;IILcom/sofascore/model/profile/UserBadge;)Lcom/sofascore/model/chat/ChatUser;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/chat/ChatUser;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getId", "getName", "getName$annotations", "()V", "Z", "setLoggedIn", "(Z)V", "setAdmin", "isAdmin$annotations", "setBanned", "isBanned$annotations", "setModerator", "isModerator$annotations", "getColor", "setColor", "(Ljava/lang/String;)V", "getChatFlag", "setChatFlag", "I", "getWarns", "setWarns", "(I)V", "getWarns$annotations", "getBans", "setBans", "getBans$annotations", "Lcom/sofascore/model/profile/UserBadge;", "getUserBadge", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ChatUser {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private int bans;

    @Nullable
    private String chatFlag;

    @Nullable
    private String color;

    @NotNull
    private final String id;
    private boolean isAdmin;
    private boolean isBanned;
    private boolean isLoggedIn;
    private boolean isModerator;

    @NotNull
    private final String name;

    @Nullable
    private final UserBadge userBadge;
    private int warns;

    public /* synthetic */ ChatUser(int i, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, String str3, String str4, int i2, int i3, UserBadge userBadge, t5h t5hVar) {
        if (3 != (i & 3)) {
            oea.z(i, 3, ChatUser$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = str;
        this.name = str2;
        if ((i & 4) == 0) {
            this.isLoggedIn = false;
        } else {
            this.isLoggedIn = z;
        }
        if ((i & 8) == 0) {
            this.isAdmin = false;
        } else {
            this.isAdmin = z2;
        }
        if ((i & 16) == 0) {
            this.isBanned = false;
        } else {
            this.isBanned = z3;
        }
        if ((i & 32) == 0) {
            this.isModerator = false;
        } else {
            this.isModerator = z4;
        }
        if ((i & 64) == 0) {
            this.color = null;
        } else {
            this.color = str3;
        }
        if ((i & 128) == 0) {
            this.chatFlag = null;
        } else {
            this.chatFlag = str4;
        }
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
            this.warns = 0;
        } else {
            this.warns = i2;
        }
        if ((i & 512) == 0) {
            this.bans = 0;
        } else {
            this.bans = i3;
        }
        if ((i & 1024) == 0) {
            this.userBadge = null;
        } else {
            this.userBadge = userBadge;
        }
    }

    public static /* synthetic */ ChatUser copy$default(ChatUser chatUser, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, String str3, String str4, int i, int i2, UserBadge userBadge, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = chatUser.id;
        }
        if ((i3 & 2) != 0) {
            str2 = chatUser.name;
        }
        if ((i3 & 4) != 0) {
            z = chatUser.isLoggedIn;
        }
        if ((i3 & 8) != 0) {
            z2 = chatUser.isAdmin;
        }
        if ((i3 & 16) != 0) {
            z3 = chatUser.isBanned;
        }
        if ((i3 & 32) != 0) {
            z4 = chatUser.isModerator;
        }
        if ((i3 & 64) != 0) {
            str3 = chatUser.color;
        }
        if ((i3 & 128) != 0) {
            str4 = chatUser.chatFlag;
        }
        if ((i3 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            i = chatUser.warns;
        }
        if ((i3 & 512) != 0) {
            i2 = chatUser.bans;
        }
        if ((i3 & 1024) != 0) {
            userBadge = chatUser.userBadge;
        }
        int i4 = i2;
        UserBadge userBadge2 = userBadge;
        String str5 = str4;
        int i5 = i;
        boolean z5 = z4;
        String str6 = str3;
        boolean z6 = z3;
        boolean z7 = z;
        return chatUser.copy(str, str2, z7, z2, z6, z5, str6, str5, i5, i4, userBadge2);
    }

    public static final /* synthetic */ void write$Self$model_release(ChatUser self, wf3 output, SerialDescriptor serialDesc) {
        output.y(serialDesc, 0, self.id);
        output.y(serialDesc, 1, self.name);
        if (output.o(serialDesc) || self.isLoggedIn) {
            output.x(serialDesc, 2, self.isLoggedIn);
        }
        if (output.o(serialDesc) || self.isAdmin) {
            output.x(serialDesc, 3, self.isAdmin);
        }
        if (output.o(serialDesc) || self.isBanned) {
            output.x(serialDesc, 4, self.isBanned);
        }
        if (output.o(serialDesc) || self.isModerator) {
            output.x(serialDesc, 5, self.isModerator);
        }
        if (output.o(serialDesc) || self.color != null) {
            output.h(serialDesc, 6, uhi.a, self.color);
        }
        if (output.o(serialDesc) || self.chatFlag != null) {
            output.h(serialDesc, 7, uhi.a, self.chatFlag);
        }
        if (output.o(serialDesc) || self.warns != 0) {
            output.u(8, self.warns, serialDesc);
        }
        if (output.o(serialDesc) || self.bans != 0) {
            output.u(9, self.bans, serialDesc);
        }
        if (!output.o(serialDesc) && self.userBadge == null) {
            return;
        }
        output.h(serialDesc, 10, UserBadgeSerializer.INSTANCE, self.userBadge);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final int getBans() {
        return this.bans;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final UserBadge getUserBadge() {
        return this.userBadge;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsLoggedIn() {
        return this.isLoggedIn;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsAdmin() {
        return this.isAdmin;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsBanned() {
        return this.isBanned;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsModerator() {
        return this.isModerator;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getChatFlag() {
        return this.chatFlag;
    }

    /* renamed from: component9, reason: from getter */
    public final int getWarns() {
        return this.warns;
    }

    @NotNull
    public final ChatUser copy(@NotNull String id, @NotNull String name, boolean isLoggedIn, boolean isAdmin, boolean isBanned, boolean isModerator, @Nullable String color, @Nullable String chatFlag, int warns, int bans, @Nullable UserBadge userBadge) {
        id.getClass();
        name.getClass();
        return new ChatUser(id, name, isLoggedIn, isAdmin, isBanned, isModerator, color, chatFlag, warns, bans, userBadge);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatUser)) {
            return false;
        }
        ChatUser chatUser = (ChatUser) other;
        return Intrinsics.c(this.id, chatUser.id) && Intrinsics.c(this.name, chatUser.name) && this.isLoggedIn == chatUser.isLoggedIn && this.isAdmin == chatUser.isAdmin && this.isBanned == chatUser.isBanned && this.isModerator == chatUser.isModerator && Intrinsics.c(this.color, chatUser.color) && Intrinsics.c(this.chatFlag, chatUser.chatFlag) && this.warns == chatUser.warns && this.bans == chatUser.bans && this.userBadge == chatUser.userBadge;
    }

    public final int getBans() {
        return this.bans;
    }

    @Nullable
    public final String getChatFlag() {
        return this.chatFlag;
    }

    @Nullable
    public final String getColor() {
        return this.color;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final UserBadge getUserBadge() {
        return this.userBadge;
    }

    public final int getWarns() {
        return this.warns;
    }

    public int hashCode() {
        int e = dmi.e(dmi.e(dmi.e(dmi.e(dmi.c(this.id.hashCode() * 31, 31, this.name), 31, this.isLoggedIn), 31, this.isAdmin), 31, this.isBanned), 31, this.isModerator);
        String str = this.color;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.chatFlag;
        int a = wv8.a(this.bans, wv8.a(this.warns, (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31);
        UserBadge userBadge = this.userBadge;
        return a + (userBadge != null ? userBadge.hashCode() : 0);
    }

    public final boolean isAdmin() {
        return this.isAdmin;
    }

    public final boolean isBanned() {
        return this.isBanned;
    }

    public final boolean isLoggedIn() {
        return this.isLoggedIn;
    }

    public final boolean isModerator() {
        return this.isModerator;
    }

    public final void setAdmin(boolean z) {
        this.isAdmin = z;
    }

    public final void setBanned(boolean z) {
        this.isBanned = z;
    }

    public final void setBans(int i) {
        this.bans = i;
    }

    public final void setChatFlag(@Nullable String str) {
        this.chatFlag = str;
    }

    public final void setColor(@Nullable String str) {
        this.color = str;
    }

    public final void setLoggedIn(boolean z) {
        this.isLoggedIn = z;
    }

    public final void setModerator(boolean z) {
        this.isModerator = z;
    }

    public final void setWarns(int i) {
        this.warns = i;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.name;
        boolean z = this.isLoggedIn;
        boolean z2 = this.isAdmin;
        boolean z3 = this.isBanned;
        boolean z4 = this.isModerator;
        String str3 = this.color;
        String str4 = this.chatFlag;
        int i = this.warns;
        int i2 = this.bans;
        UserBadge userBadge = this.userBadge;
        StringBuilder s = mz1.s("ChatUser(id=", str, ", name=", str2, ", isLoggedIn=");
        vxd.t(", isAdmin=", ", isBanned=", s, z, z2);
        vxd.t(", isModerator=", ", color=", s, z3, z4);
        bf3.v(s, str3, ", chatFlag=", str4, ", warns=");
        me4.q(s, i, ", bans=", i2, ", userBadge=");
        s.append(userBadge);
        s.append(")");
        return s.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/chat/ChatUser$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/chat/ChatUser;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ChatUser$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @q5h("chatBans")
    public static /* synthetic */ void getBans$annotations() {
    }

    @q5h("nickname")
    public static /* synthetic */ void getName$annotations() {
    }

    @q5h("chatWarnings")
    public static /* synthetic */ void getWarns$annotations() {
    }

    @q5h("chatAdmin")
    public static /* synthetic */ void isAdmin$annotations() {
    }

    @q5h("banned")
    public static /* synthetic */ void isBanned$annotations() {
    }

    @q5h("chatModerator")
    public static /* synthetic */ void isModerator$annotations() {
    }

    public ChatUser(@NotNull String str, @NotNull String str2, boolean z, boolean z2, boolean z3, boolean z4, @Nullable String str3, @Nullable String str4, int i, int i2, @Nullable UserBadge userBadge) {
        str.getClass();
        str2.getClass();
        this.id = str;
        this.name = str2;
        this.isLoggedIn = z;
        this.isAdmin = z2;
        this.isBanned = z3;
        this.isModerator = z4;
        this.color = str3;
        this.chatFlag = str4;
        this.warns = i;
        this.bans = i2;
        this.userBadge = userBadge;
    }

    public /* synthetic */ ChatUser(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, String str3, String str4, int i, int i2, UserBadge userBadge, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i3 & 4) != 0 ? false : z, (i3 & 8) != 0 ? false : z2, (i3 & 16) != 0 ? false : z3, (i3 & 32) != 0 ? false : z4, (i3 & 64) != 0 ? null : str3, (i3 & 128) != 0 ? null : str4, (i3 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? 0 : i, (i3 & 512) != 0 ? 0 : i2, (i3 & 1024) != 0 ? null : userBadge);
    }
}
