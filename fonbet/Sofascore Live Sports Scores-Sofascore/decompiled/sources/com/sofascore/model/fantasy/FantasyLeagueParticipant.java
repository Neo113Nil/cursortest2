package com.sofascore.model.fantasy;

import defpackage.dmi;
import defpackage.fc6;
import defpackage.me4;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J:\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b(\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b)\u0010\u0018¨\u0006,"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyLeagueParticipant;", "", "", "userId", "teamName", "userNickname", "userImageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/fantasy/FantasyLeagueParticipant;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/sofascore/model/fantasy/FantasyLeagueParticipant;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUserId", "getTeamName", "getUserNickname", "getUserImageUrl", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FantasyLeagueParticipant {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String teamName;

    @NotNull
    private final String userId;

    @Nullable
    private final String userImageUrl;

    @NotNull
    private final String userNickname;

    public /* synthetic */ FantasyLeagueParticipant(int i, String str, String str2, String str3, String str4, t5h t5hVar) {
        if (15 != (i & 15)) {
            oea.z(i, 15, FantasyLeagueParticipant$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.userId = str;
        this.teamName = str2;
        this.userNickname = str3;
        this.userImageUrl = str4;
    }

    public static /* synthetic */ FantasyLeagueParticipant copy$default(FantasyLeagueParticipant fantasyLeagueParticipant, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fantasyLeagueParticipant.userId;
        }
        if ((i & 2) != 0) {
            str2 = fantasyLeagueParticipant.teamName;
        }
        if ((i & 4) != 0) {
            str3 = fantasyLeagueParticipant.userNickname;
        }
        if ((i & 8) != 0) {
            str4 = fantasyLeagueParticipant.userImageUrl;
        }
        return fantasyLeagueParticipant.copy(str, str2, str3, str4);
    }

    public static final /* synthetic */ void write$Self$model_release(FantasyLeagueParticipant self, wf3 output, SerialDescriptor serialDesc) {
        output.y(serialDesc, 0, self.userId);
        output.y(serialDesc, 1, self.teamName);
        output.y(serialDesc, 2, self.userNickname);
        output.h(serialDesc, 3, uhi.a, self.userImageUrl);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTeamName() {
        return this.teamName;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getUserNickname() {
        return this.userNickname;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getUserImageUrl() {
        return this.userImageUrl;
    }

    @NotNull
    public final FantasyLeagueParticipant copy(@NotNull String userId, @NotNull String teamName, @NotNull String userNickname, @Nullable String userImageUrl) {
        userId.getClass();
        teamName.getClass();
        userNickname.getClass();
        return new FantasyLeagueParticipant(userId, teamName, userNickname, userImageUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FantasyLeagueParticipant)) {
            return false;
        }
        FantasyLeagueParticipant fantasyLeagueParticipant = (FantasyLeagueParticipant) other;
        return Intrinsics.c(this.userId, fantasyLeagueParticipant.userId) && Intrinsics.c(this.teamName, fantasyLeagueParticipant.teamName) && Intrinsics.c(this.userNickname, fantasyLeagueParticipant.userNickname) && Intrinsics.c(this.userImageUrl, fantasyLeagueParticipant.userImageUrl);
    }

    @NotNull
    public final String getTeamName() {
        return this.teamName;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    @Nullable
    public final String getUserImageUrl() {
        return this.userImageUrl;
    }

    @NotNull
    public final String getUserNickname() {
        return this.userNickname;
    }

    public int hashCode() {
        int c = dmi.c(dmi.c(this.userId.hashCode() * 31, 31, this.teamName), 31, this.userNickname);
        String str = this.userImageUrl;
        return c + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.userId;
        String str2 = this.teamName;
        return fc6.o(mz1.s("FantasyLeagueParticipant(userId=", str, ", teamName=", str2, ", userNickname="), this.userNickname, ", userImageUrl=", this.userImageUrl, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyLeagueParticipant$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/fantasy/FantasyLeagueParticipant;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FantasyLeagueParticipant$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FantasyLeagueParticipant(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable String str4) {
        me4.p(str, str2, str3);
        this.userId = str;
        this.teamName = str2;
        this.userNickname = str3;
        this.userImageUrl = str4;
    }
}
