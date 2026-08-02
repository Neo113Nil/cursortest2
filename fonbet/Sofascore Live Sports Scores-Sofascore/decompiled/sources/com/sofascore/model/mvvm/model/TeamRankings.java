package com.sofascore.model.mvvm.model;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.sofascore.model.newNetwork.ErrorResponse;
import com.sofascore.model.newNetwork.HeadResponse;
import com.sofascore.model.newNetwork.NetworkResponse;
import defpackage.a7a;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0016\b\u0007\u0018\u0000 02\u00020\u0001:\u000210BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB}\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\r\u0010\u0016J'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b&\u0010%R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b*\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b+\u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b,\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b.\u0010/¨\u00062"}, d2 = {"Lcom/sofascore/model/mvvm/model/TeamRankings;", "Lcom/sofascore/model/newNetwork/NetworkResponse;", "", "position", "", "rankingTypeName", "rankingTypeSlug", "uniqueTournamentId", "uniqueTournamentName", "uniqueTournamentSlug", "weightClass", "Lcom/sofascore/model/mvvm/model/Gender;", InneractiveMediationDefs.KEY_GENDER, "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Gender;)V", "seen0", "Lcom/sofascore/model/newNetwork/HeadResponse;", "head", "Lcom/sofascore/model/newNetwork/ErrorResponse;", "error", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/newNetwork/HeadResponse;Lcom/sofascore/model/newNetwork/ErrorResponse;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Gender;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/TeamRankings;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getPosition", "()I", "Ljava/lang/String;", "getRankingTypeName", "()Ljava/lang/String;", "getRankingTypeSlug", "Ljava/lang/Integer;", "getUniqueTournamentId", "()Ljava/lang/Integer;", "getUniqueTournamentName", "getUniqueTournamentSlug", "getWeightClass", "Lcom/sofascore/model/mvvm/model/Gender;", "getGender", "()Lcom/sofascore/model/mvvm/model/Gender;", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TeamRankings extends NetworkResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Gender gender;
    private final int position;

    @NotNull
    private final String rankingTypeName;

    @NotNull
    private final String rankingTypeSlug;

    @Nullable
    private final Integer uniqueTournamentId;

    @Nullable
    private final String uniqueTournamentName;

    @Nullable
    private final String uniqueTournamentSlug;

    @Nullable
    private final String weightClass;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TeamRankings(int i, HeadResponse headResponse, ErrorResponse errorResponse, int i2, String str, String str2, Integer num, String str3, String str4, String str5, Gender gender, t5h t5hVar) {
        super(i, headResponse, errorResponse, t5hVar);
        if (1020 != (i & 1020)) {
            oea.z(i, 1020, TeamRankings$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.position = i2;
        this.rankingTypeName = str;
        this.rankingTypeSlug = str2;
        this.uniqueTournamentId = num;
        this.uniqueTournamentName = str3;
        this.uniqueTournamentSlug = str4;
        this.weightClass = str5;
        this.gender = gender;
    }

    public static final /* synthetic */ void write$Self$model_release(TeamRankings self, wf3 output, SerialDescriptor serialDesc) {
        NetworkResponse.write$Self(self, output, serialDesc);
        output.u(2, self.position, serialDesc);
        output.y(serialDesc, 3, self.rankingTypeName);
        output.y(serialDesc, 4, self.rankingTypeSlug);
        output.h(serialDesc, 5, a7a.a, self.uniqueTournamentId);
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 6, uhiVar, self.uniqueTournamentName);
        output.h(serialDesc, 7, uhiVar, self.uniqueTournamentSlug);
        output.h(serialDesc, 8, uhiVar, self.weightClass);
        output.h(serialDesc, 9, GenderSerializer.INSTANCE, self.gender);
    }

    @Nullable
    public final Gender getGender() {
        return this.gender;
    }

    public final int getPosition() {
        return this.position;
    }

    @NotNull
    public final String getRankingTypeName() {
        return this.rankingTypeName;
    }

    @NotNull
    public final String getRankingTypeSlug() {
        return this.rankingTypeSlug;
    }

    @Nullable
    public final Integer getUniqueTournamentId() {
        return this.uniqueTournamentId;
    }

    @Nullable
    public final String getUniqueTournamentName() {
        return this.uniqueTournamentName;
    }

    @Nullable
    public final String getUniqueTournamentSlug() {
        return this.uniqueTournamentSlug;
    }

    @Nullable
    public final String getWeightClass() {
        return this.weightClass;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/TeamRankings$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/TeamRankings;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return TeamRankings$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeamRankings(int i, @NotNull String str, @NotNull String str2, @Nullable Integer num, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Gender gender) {
        super((HeadResponse) null, (ErrorResponse) null, 3, (DefaultConstructorMarker) null);
        str.getClass();
        str2.getClass();
        this.position = i;
        this.rankingTypeName = str;
        this.rankingTypeSlug = str2;
        this.uniqueTournamentId = num;
        this.uniqueTournamentName = str3;
        this.uniqueTournamentSlug = str4;
        this.weightClass = str5;
        this.gender = gender;
    }
}
