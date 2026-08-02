package com.sofascore.model.fantasy;

import defpackage.a7a;
import defpackage.c88;
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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002@?BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fBi\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000e\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0012\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b'\u0010&J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010)Jn\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b,\u0010#J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010\u001eJ\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b5\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b6\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b8\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b9\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010:\u001a\u0004\b;\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010:\u001a\u0004\b<\u0010&R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\b>\u0010)¨\u0006A"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyLeagueMatchup;", "", "", "id", "Lcom/sofascore/model/fantasy/FantasyUserCompetition;", "homeUserCompetition", "awayUserCompetition", "", "homeName", "awayName", "", "homeScore", "awayScore", "result", "<init>", "(ILcom/sofascore/model/fantasy/FantasyUserCompetition;Lcom/sofascore/model/fantasy/FantasyUserCompetition;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILcom/sofascore/model/fantasy/FantasyUserCompetition;Lcom/sofascore/model/fantasy/FantasyUserCompetition;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/fantasy/FantasyLeagueMatchup;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Lcom/sofascore/model/fantasy/FantasyUserCompetition;", "component3", "component4", "()Ljava/lang/String;", "component5", "component6", "()Ljava/lang/Float;", "component7", "component8", "()Ljava/lang/Integer;", "copy", "(ILcom/sofascore/model/fantasy/FantasyUserCompetition;Lcom/sofascore/model/fantasy/FantasyUserCompetition;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;)Lcom/sofascore/model/fantasy/FantasyLeagueMatchup;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lcom/sofascore/model/fantasy/FantasyUserCompetition;", "getHomeUserCompetition", "getAwayUserCompetition", "Ljava/lang/String;", "getHomeName", "getAwayName", "Ljava/lang/Float;", "getHomeScore", "getAwayScore", "Ljava/lang/Integer;", "getResult", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FantasyLeagueMatchup {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String awayName;

    @Nullable
    private final Float awayScore;

    @Nullable
    private final FantasyUserCompetition awayUserCompetition;

    @Nullable
    private final String homeName;

    @Nullable
    private final Float homeScore;

    @Nullable
    private final FantasyUserCompetition homeUserCompetition;
    private final int id;

    @Nullable
    private final Integer result;

    public /* synthetic */ FantasyLeagueMatchup(int i, int i2, FantasyUserCompetition fantasyUserCompetition, FantasyUserCompetition fantasyUserCompetition2, String str, String str2, Float f, Float f2, Integer num, t5h t5hVar) {
        if (255 != (i & 255)) {
            oea.z(i, 255, FantasyLeagueMatchup$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.homeUserCompetition = fantasyUserCompetition;
        this.awayUserCompetition = fantasyUserCompetition2;
        this.homeName = str;
        this.awayName = str2;
        this.homeScore = f;
        this.awayScore = f2;
        this.result = num;
    }

    public static /* synthetic */ FantasyLeagueMatchup copy$default(FantasyLeagueMatchup fantasyLeagueMatchup, int i, FantasyUserCompetition fantasyUserCompetition, FantasyUserCompetition fantasyUserCompetition2, String str, String str2, Float f, Float f2, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = fantasyLeagueMatchup.id;
        }
        if ((i2 & 2) != 0) {
            fantasyUserCompetition = fantasyLeagueMatchup.homeUserCompetition;
        }
        if ((i2 & 4) != 0) {
            fantasyUserCompetition2 = fantasyLeagueMatchup.awayUserCompetition;
        }
        if ((i2 & 8) != 0) {
            str = fantasyLeagueMatchup.homeName;
        }
        if ((i2 & 16) != 0) {
            str2 = fantasyLeagueMatchup.awayName;
        }
        if ((i2 & 32) != 0) {
            f = fantasyLeagueMatchup.homeScore;
        }
        if ((i2 & 64) != 0) {
            f2 = fantasyLeagueMatchup.awayScore;
        }
        if ((i2 & 128) != 0) {
            num = fantasyLeagueMatchup.result;
        }
        Float f3 = f2;
        Integer num2 = num;
        String str3 = str2;
        Float f4 = f;
        return fantasyLeagueMatchup.copy(i, fantasyUserCompetition, fantasyUserCompetition2, str, str3, f4, f3, num2);
    }

    public static final /* synthetic */ void write$Self$model_release(FantasyLeagueMatchup self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.id, serialDesc);
        FantasyUserCompetition$$serializer fantasyUserCompetition$$serializer = FantasyUserCompetition$$serializer.INSTANCE;
        output.h(serialDesc, 1, fantasyUserCompetition$$serializer, self.homeUserCompetition);
        output.h(serialDesc, 2, fantasyUserCompetition$$serializer, self.awayUserCompetition);
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 3, uhiVar, self.homeName);
        output.h(serialDesc, 4, uhiVar, self.awayName);
        c88 c88Var = c88.a;
        output.h(serialDesc, 5, c88Var, self.homeScore);
        output.h(serialDesc, 6, c88Var, self.awayScore);
        output.h(serialDesc, 7, a7a.a, self.result);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final FantasyUserCompetition getHomeUserCompetition() {
        return this.homeUserCompetition;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final FantasyUserCompetition getAwayUserCompetition() {
        return this.awayUserCompetition;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getHomeName() {
        return this.homeName;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getAwayName() {
        return this.awayName;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Float getHomeScore() {
        return this.homeScore;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Float getAwayScore() {
        return this.awayScore;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Integer getResult() {
        return this.result;
    }

    @NotNull
    public final FantasyLeagueMatchup copy(int id, @Nullable FantasyUserCompetition homeUserCompetition, @Nullable FantasyUserCompetition awayUserCompetition, @Nullable String homeName, @Nullable String awayName, @Nullable Float homeScore, @Nullable Float awayScore, @Nullable Integer result) {
        return new FantasyLeagueMatchup(id, homeUserCompetition, awayUserCompetition, homeName, awayName, homeScore, awayScore, result);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FantasyLeagueMatchup)) {
            return false;
        }
        FantasyLeagueMatchup fantasyLeagueMatchup = (FantasyLeagueMatchup) other;
        return this.id == fantasyLeagueMatchup.id && Intrinsics.c(this.homeUserCompetition, fantasyLeagueMatchup.homeUserCompetition) && Intrinsics.c(this.awayUserCompetition, fantasyLeagueMatchup.awayUserCompetition) && Intrinsics.c(this.homeName, fantasyLeagueMatchup.homeName) && Intrinsics.c(this.awayName, fantasyLeagueMatchup.awayName) && Intrinsics.c(this.homeScore, fantasyLeagueMatchup.homeScore) && Intrinsics.c(this.awayScore, fantasyLeagueMatchup.awayScore) && Intrinsics.c(this.result, fantasyLeagueMatchup.result);
    }

    @Nullable
    public final String getAwayName() {
        return this.awayName;
    }

    @Nullable
    public final Float getAwayScore() {
        return this.awayScore;
    }

    @Nullable
    public final FantasyUserCompetition getAwayUserCompetition() {
        return this.awayUserCompetition;
    }

    @Nullable
    public final String getHomeName() {
        return this.homeName;
    }

    @Nullable
    public final Float getHomeScore() {
        return this.homeScore;
    }

    @Nullable
    public final FantasyUserCompetition getHomeUserCompetition() {
        return this.homeUserCompetition;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final Integer getResult() {
        return this.result;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.id) * 31;
        FantasyUserCompetition fantasyUserCompetition = this.homeUserCompetition;
        int hashCode2 = (hashCode + (fantasyUserCompetition == null ? 0 : fantasyUserCompetition.hashCode())) * 31;
        FantasyUserCompetition fantasyUserCompetition2 = this.awayUserCompetition;
        int hashCode3 = (hashCode2 + (fantasyUserCompetition2 == null ? 0 : fantasyUserCompetition2.hashCode())) * 31;
        String str = this.homeName;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.awayName;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Float f = this.homeScore;
        int hashCode6 = (hashCode5 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.awayScore;
        int hashCode7 = (hashCode6 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Integer num = this.result;
        return hashCode7 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FantasyLeagueMatchup(id=" + this.id + ", homeUserCompetition=" + this.homeUserCompetition + ", awayUserCompetition=" + this.awayUserCompetition + ", homeName=" + this.homeName + ", awayName=" + this.awayName + ", homeScore=" + this.homeScore + ", awayScore=" + this.awayScore + ", result=" + this.result + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyLeagueMatchup$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/fantasy/FantasyLeagueMatchup;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FantasyLeagueMatchup$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FantasyLeagueMatchup(int i, @Nullable FantasyUserCompetition fantasyUserCompetition, @Nullable FantasyUserCompetition fantasyUserCompetition2, @Nullable String str, @Nullable String str2, @Nullable Float f, @Nullable Float f2, @Nullable Integer num) {
        this.id = i;
        this.homeUserCompetition = fantasyUserCompetition;
        this.awayUserCompetition = fantasyUserCompetition2;
        this.homeName = str;
        this.awayName = str2;
        this.homeScore = f;
        this.awayScore = f2;
        this.result = num;
    }
}
