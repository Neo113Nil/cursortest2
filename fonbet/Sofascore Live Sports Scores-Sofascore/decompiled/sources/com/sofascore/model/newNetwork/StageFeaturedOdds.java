package com.sofascore.model.newNetwork;

import com.sofascore.model.odds.OddsChoice;
import com.sofascore.model.odds.OddsChoice$$serializer;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a7a;
import defpackage.gz1;
import defpackage.oea;
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
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b#\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:9BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eBa\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001dJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001dJd\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b)\u0010 J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010-\u001a\u00020\u00072\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001dR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b3\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b\b\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b6\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b7\u0010\u001dR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b8\u0010\u001d¨\u0006;"}, d2 = {"Lcom/sofascore/model/newNetwork/StageFeaturedOdds;", "", "", "id", "marketId", "", "marketName", "", "isLive", "Lcom/sofascore/model/odds/OddsChoice;", "choice", "sourceId", "fid", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lcom/sofascore/model/odds/OddsChoice;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lcom/sofascore/model/odds/OddsChoice;Ljava/lang/Integer;Ljava/lang/Integer;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/StageFeaturedOdds;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Integer;", "component2", "component3", "()Ljava/lang/String;", "component4", "()Ljava/lang/Boolean;", "component5", "()Lcom/sofascore/model/odds/OddsChoice;", "component6", "component7", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lcom/sofascore/model/odds/OddsChoice;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sofascore/model/newNetwork/StageFeaturedOdds;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getId", "getMarketId", "Ljava/lang/String;", "getMarketName", "Ljava/lang/Boolean;", "Lcom/sofascore/model/odds/OddsChoice;", "getChoice", "getSourceId", "getFid", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class StageFeaturedOdds {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final OddsChoice choice;

    @Nullable
    private final Integer fid;

    @Nullable
    private final Integer id;

    @Nullable
    private final Boolean isLive;

    @Nullable
    private final Integer marketId;

    @Nullable
    private final String marketName;

    @Nullable
    private final Integer sourceId;

    public /* synthetic */ StageFeaturedOdds(int i, Integer num, Integer num2, String str, Boolean bool, OddsChoice oddsChoice, Integer num3, Integer num4, t5h t5hVar) {
        if (127 != (i & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE)) {
            oea.z(i, Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, StageFeaturedOdds$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = num;
        this.marketId = num2;
        this.marketName = str;
        this.isLive = bool;
        this.choice = oddsChoice;
        this.sourceId = num3;
        this.fid = num4;
    }

    public static /* synthetic */ StageFeaturedOdds copy$default(StageFeaturedOdds stageFeaturedOdds, Integer num, Integer num2, String str, Boolean bool, OddsChoice oddsChoice, Integer num3, Integer num4, int i, Object obj) {
        if ((i & 1) != 0) {
            num = stageFeaturedOdds.id;
        }
        if ((i & 2) != 0) {
            num2 = stageFeaturedOdds.marketId;
        }
        if ((i & 4) != 0) {
            str = stageFeaturedOdds.marketName;
        }
        if ((i & 8) != 0) {
            bool = stageFeaturedOdds.isLive;
        }
        if ((i & 16) != 0) {
            oddsChoice = stageFeaturedOdds.choice;
        }
        if ((i & 32) != 0) {
            num3 = stageFeaturedOdds.sourceId;
        }
        if ((i & 64) != 0) {
            num4 = stageFeaturedOdds.fid;
        }
        Integer num5 = num3;
        Integer num6 = num4;
        OddsChoice oddsChoice2 = oddsChoice;
        String str2 = str;
        return stageFeaturedOdds.copy(num, num2, str2, bool, oddsChoice2, num5, num6);
    }

    public static final /* synthetic */ void write$Self$model_release(StageFeaturedOdds self, wf3 output, SerialDescriptor serialDesc) {
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 0, a7aVar, self.id);
        output.h(serialDesc, 1, a7aVar, self.marketId);
        output.h(serialDesc, 2, uhi.a, self.marketName);
        output.h(serialDesc, 3, gz1.a, self.isLive);
        output.h(serialDesc, 4, OddsChoice$$serializer.INSTANCE, self.choice);
        output.h(serialDesc, 5, a7aVar, self.sourceId);
        output.h(serialDesc, 6, a7aVar, self.fid);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getMarketId() {
        return this.marketId;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getMarketName() {
        return this.marketName;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Boolean getIsLive() {
        return this.isLive;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final OddsChoice getChoice() {
        return this.choice;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getSourceId() {
        return this.sourceId;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getFid() {
        return this.fid;
    }

    @NotNull
    public final StageFeaturedOdds copy(@Nullable Integer id, @Nullable Integer marketId, @Nullable String marketName, @Nullable Boolean isLive, @Nullable OddsChoice choice, @Nullable Integer sourceId, @Nullable Integer fid) {
        return new StageFeaturedOdds(id, marketId, marketName, isLive, choice, sourceId, fid);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StageFeaturedOdds)) {
            return false;
        }
        StageFeaturedOdds stageFeaturedOdds = (StageFeaturedOdds) other;
        return Intrinsics.c(this.id, stageFeaturedOdds.id) && Intrinsics.c(this.marketId, stageFeaturedOdds.marketId) && Intrinsics.c(this.marketName, stageFeaturedOdds.marketName) && Intrinsics.c(this.isLive, stageFeaturedOdds.isLive) && Intrinsics.c(this.choice, stageFeaturedOdds.choice) && Intrinsics.c(this.sourceId, stageFeaturedOdds.sourceId) && Intrinsics.c(this.fid, stageFeaturedOdds.fid);
    }

    @Nullable
    public final OddsChoice getChoice() {
        return this.choice;
    }

    @Nullable
    public final Integer getFid() {
        return this.fid;
    }

    @Nullable
    public final Integer getId() {
        return this.id;
    }

    @Nullable
    public final Integer getMarketId() {
        return this.marketId;
    }

    @Nullable
    public final String getMarketName() {
        return this.marketName;
    }

    @Nullable
    public final Integer getSourceId() {
        return this.sourceId;
    }

    public int hashCode() {
        Integer num = this.id;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.marketId;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.marketName;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isLive;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        OddsChoice oddsChoice = this.choice;
        int hashCode5 = (hashCode4 + (oddsChoice == null ? 0 : oddsChoice.hashCode())) * 31;
        Integer num3 = this.sourceId;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.fid;
        return hashCode6 + (num4 != null ? num4.hashCode() : 0);
    }

    @Nullable
    public final Boolean isLive() {
        return this.isLive;
    }

    @NotNull
    public String toString() {
        Integer num = this.id;
        Integer num2 = this.marketId;
        String str = this.marketName;
        Boolean bool = this.isLive;
        OddsChoice oddsChoice = this.choice;
        Integer num3 = this.sourceId;
        Integer num4 = this.fid;
        StringBuilder k = wv8.k(num, "StageFeaturedOdds(id=", ", marketId=", ", marketName=", num2);
        k.append(str);
        k.append(", isLive=");
        k.append(bool);
        k.append(", choice=");
        k.append(oddsChoice);
        k.append(", sourceId=");
        k.append(num3);
        k.append(", fid=");
        return vxd.n(k, num4, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/StageFeaturedOdds$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/StageFeaturedOdds;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return StageFeaturedOdds$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public StageFeaturedOdds(@Nullable Integer num, @Nullable Integer num2, @Nullable String str, @Nullable Boolean bool, @Nullable OddsChoice oddsChoice, @Nullable Integer num3, @Nullable Integer num4) {
        this.id = num;
        this.marketId = num2;
        this.marketName = str;
        this.isLive = bool;
        this.choice = oddsChoice;
        this.sourceId = num3;
        this.fid = num4;
    }
}
