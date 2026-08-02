package com.sofascore.model.fantasy;

import androidx.core.app.NotificationCompat;
import com.sofascore.model.mvvm.model.FieldTranslations;
import com.sofascore.model.mvvm.model.FieldTranslations$$serializer;
import defpackage.bf3;
import defpackage.dmi;
import defpackage.fc6;
import defpackage.joa;
import defpackage.lnb;
import defpackage.m97;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.vxd;
import defpackage.wf3;
import defpackage.wv8;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
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
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u0000 G2\u00020\u0001:\u0002HGBa\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013B{\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0012\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\nHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b%\u0010&J|\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b)\u0010\u001dJ\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u0019J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.J'\u00107\u001a\u0002042\u0006\u0010/\u001a\u00020\u00002\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0001¢\u0006\u0004\b5\u00106R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00108\u001a\u0004\b:\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\b;\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010<\u001a\u0004\b=\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010<\u001a\u0004\b>\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010<\u001a\u0004\b?\u0010\u001dR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010@\u001a\u0004\bA\u0010!R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u0010@\u001a\u0004\bB\u0010!R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010C\u001a\u0004\bD\u0010$R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010E\u001a\u0004\bF\u0010&¨\u0006I"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyPlayerPriceChanges;", "", "", "playerId", "fantasyPlayerId", "teamId", "", "shortName", "teamNameCode", "position", "", "fantasyPlayerFinalPrice", "totalPriceChange", "", "Lcom/sofascore/model/fantasy/FantasyPriceChange;", "priceChanges", "Lcom/sofascore/model/mvvm/model/FieldTranslations;", "fieldTranslations", "<init>", "(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;FFLjava/util/List;Lcom/sofascore/model/mvvm/model/FieldTranslations;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;FFLjava/util/List;Lcom/sofascore/model/mvvm/model/FieldTranslations;Lt5h;)V", "component1", "()I", "component2", "component3", "component4", "()Ljava/lang/String;", "component5", "component6", "component7", "()F", "component8", "component9", "()Ljava/util/List;", "component10", "()Lcom/sofascore/model/mvvm/model/FieldTranslations;", "copy", "(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;FFLjava/util/List;Lcom/sofascore/model/mvvm/model/FieldTranslations;)Lcom/sofascore/model/fantasy/FantasyPlayerPriceChanges;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/fantasy/FantasyPlayerPriceChanges;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getPlayerId", "getFantasyPlayerId", "getTeamId", "Ljava/lang/String;", "getShortName", "getTeamNameCode", "getPosition", "F", "getFantasyPlayerFinalPrice", "getTotalPriceChange", "Ljava/util/List;", "getPriceChanges", "Lcom/sofascore/model/mvvm/model/FieldTranslations;", "getFieldTranslations", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FantasyPlayerPriceChanges {
    private final float fantasyPlayerFinalPrice;
    private final int fantasyPlayerId;

    @Nullable
    private final FieldTranslations fieldTranslations;
    private final int playerId;

    @NotNull
    private final String position;

    @NotNull
    private final List<FantasyPriceChange> priceChanges;

    @NotNull
    private final String shortName;
    private final int teamId;

    @NotNull
    private final String teamNameCode;
    private final float totalPriceChange;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, null, null, null, null, null, null, null, ypa.a(ysa.b, new m97(21)), null};

    public /* synthetic */ FantasyPlayerPriceChanges(int i, int i2, int i3, int i4, String str, String str2, String str3, float f, float f2, List list, FieldTranslations fieldTranslations, t5h t5hVar) {
        if (511 != (i & 511)) {
            oea.z(i, 511, FantasyPlayerPriceChanges$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.playerId = i2;
        this.fantasyPlayerId = i3;
        this.teamId = i4;
        this.shortName = str;
        this.teamNameCode = str2;
        this.position = str3;
        this.fantasyPlayerFinalPrice = f;
        this.totalPriceChange = f2;
        this.priceChanges = list;
        if ((i & 512) == 0) {
            this.fieldTranslations = null;
        } else {
            this.fieldTranslations = fieldTranslations;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(FantasyPriceChange$$serializer.INSTANCE, 0);
    }

    public static /* synthetic */ FantasyPlayerPriceChanges copy$default(FantasyPlayerPriceChanges fantasyPlayerPriceChanges, int i, int i2, int i3, String str, String str2, String str3, float f, float f2, List list, FieldTranslations fieldTranslations, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = fantasyPlayerPriceChanges.playerId;
        }
        if ((i4 & 2) != 0) {
            i2 = fantasyPlayerPriceChanges.fantasyPlayerId;
        }
        if ((i4 & 4) != 0) {
            i3 = fantasyPlayerPriceChanges.teamId;
        }
        if ((i4 & 8) != 0) {
            str = fantasyPlayerPriceChanges.shortName;
        }
        if ((i4 & 16) != 0) {
            str2 = fantasyPlayerPriceChanges.teamNameCode;
        }
        if ((i4 & 32) != 0) {
            str3 = fantasyPlayerPriceChanges.position;
        }
        if ((i4 & 64) != 0) {
            f = fantasyPlayerPriceChanges.fantasyPlayerFinalPrice;
        }
        if ((i4 & 128) != 0) {
            f2 = fantasyPlayerPriceChanges.totalPriceChange;
        }
        if ((i4 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            list = fantasyPlayerPriceChanges.priceChanges;
        }
        if ((i4 & 512) != 0) {
            fieldTranslations = fantasyPlayerPriceChanges.fieldTranslations;
        }
        List list2 = list;
        FieldTranslations fieldTranslations2 = fieldTranslations;
        float f3 = f;
        float f4 = f2;
        String str4 = str2;
        String str5 = str3;
        return fantasyPlayerPriceChanges.copy(i, i2, i3, str, str4, str5, f3, f4, list2, fieldTranslations2);
    }

    public static final /* synthetic */ void write$Self$model_release(FantasyPlayerPriceChanges self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.u(0, self.playerId, serialDesc);
        output.u(1, self.fantasyPlayerId, serialDesc);
        output.u(2, self.teamId, serialDesc);
        output.y(serialDesc, 3, self.shortName);
        output.y(serialDesc, 4, self.teamNameCode);
        output.y(serialDesc, 5, self.position);
        output.t(serialDesc, 6, self.fantasyPlayerFinalPrice);
        output.t(serialDesc, 7, self.totalPriceChange);
        output.f(serialDesc, 8, (KSerializer) joaVarArr[8].getValue(), self.priceChanges);
        if (!output.o(serialDesc) && self.fieldTranslations == null) {
            return;
        }
        output.h(serialDesc, 9, FieldTranslations$$serializer.INSTANCE, self.fieldTranslations);
    }

    /* renamed from: component1, reason: from getter */
    public final int getPlayerId() {
        return this.playerId;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final FieldTranslations getFieldTranslations() {
        return this.fieldTranslations;
    }

    /* renamed from: component2, reason: from getter */
    public final int getFantasyPlayerId() {
        return this.fantasyPlayerId;
    }

    /* renamed from: component3, reason: from getter */
    public final int getTeamId() {
        return this.teamId;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getShortName() {
        return this.shortName;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getTeamNameCode() {
        return this.teamNameCode;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getPosition() {
        return this.position;
    }

    /* renamed from: component7, reason: from getter */
    public final float getFantasyPlayerFinalPrice() {
        return this.fantasyPlayerFinalPrice;
    }

    /* renamed from: component8, reason: from getter */
    public final float getTotalPriceChange() {
        return this.totalPriceChange;
    }

    @NotNull
    public final List<FantasyPriceChange> component9() {
        return this.priceChanges;
    }

    @NotNull
    public final FantasyPlayerPriceChanges copy(int playerId, int fantasyPlayerId, int teamId, @NotNull String shortName, @NotNull String teamNameCode, @NotNull String position, float fantasyPlayerFinalPrice, float totalPriceChange, @NotNull List<FantasyPriceChange> priceChanges, @Nullable FieldTranslations fieldTranslations) {
        shortName.getClass();
        teamNameCode.getClass();
        position.getClass();
        priceChanges.getClass();
        return new FantasyPlayerPriceChanges(playerId, fantasyPlayerId, teamId, shortName, teamNameCode, position, fantasyPlayerFinalPrice, totalPriceChange, priceChanges, fieldTranslations);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FantasyPlayerPriceChanges)) {
            return false;
        }
        FantasyPlayerPriceChanges fantasyPlayerPriceChanges = (FantasyPlayerPriceChanges) other;
        return this.playerId == fantasyPlayerPriceChanges.playerId && this.fantasyPlayerId == fantasyPlayerPriceChanges.fantasyPlayerId && this.teamId == fantasyPlayerPriceChanges.teamId && Intrinsics.c(this.shortName, fantasyPlayerPriceChanges.shortName) && Intrinsics.c(this.teamNameCode, fantasyPlayerPriceChanges.teamNameCode) && Intrinsics.c(this.position, fantasyPlayerPriceChanges.position) && Float.compare(this.fantasyPlayerFinalPrice, fantasyPlayerPriceChanges.fantasyPlayerFinalPrice) == 0 && Float.compare(this.totalPriceChange, fantasyPlayerPriceChanges.totalPriceChange) == 0 && Intrinsics.c(this.priceChanges, fantasyPlayerPriceChanges.priceChanges) && Intrinsics.c(this.fieldTranslations, fantasyPlayerPriceChanges.fieldTranslations);
    }

    public final float getFantasyPlayerFinalPrice() {
        return this.fantasyPlayerFinalPrice;
    }

    public final int getFantasyPlayerId() {
        return this.fantasyPlayerId;
    }

    @Nullable
    public final FieldTranslations getFieldTranslations() {
        return this.fieldTranslations;
    }

    public final int getPlayerId() {
        return this.playerId;
    }

    @NotNull
    public final String getPosition() {
        return this.position;
    }

    @NotNull
    public final List<FantasyPriceChange> getPriceChanges() {
        return this.priceChanges;
    }

    @NotNull
    public final String getShortName() {
        return this.shortName;
    }

    public final int getTeamId() {
        return this.teamId;
    }

    @NotNull
    public final String getTeamNameCode() {
        return this.teamNameCode;
    }

    public final float getTotalPriceChange() {
        return this.totalPriceChange;
    }

    public int hashCode() {
        int d = dmi.d(fc6.a(this.totalPriceChange, fc6.a(this.fantasyPlayerFinalPrice, dmi.c(dmi.c(dmi.c(wv8.a(this.teamId, wv8.a(this.fantasyPlayerId, Integer.hashCode(this.playerId) * 31, 31), 31), 31, this.shortName), 31, this.teamNameCode), 31, this.position), 31), 31), 31, this.priceChanges);
        FieldTranslations fieldTranslations = this.fieldTranslations;
        return d + (fieldTranslations == null ? 0 : fieldTranslations.hashCode());
    }

    @NotNull
    public String toString() {
        int i = this.playerId;
        int i2 = this.fantasyPlayerId;
        int i3 = this.teamId;
        String str = this.shortName;
        String str2 = this.teamNameCode;
        String str3 = this.position;
        float f = this.fantasyPlayerFinalPrice;
        float f2 = this.totalPriceChange;
        List<FantasyPriceChange> list = this.priceChanges;
        FieldTranslations fieldTranslations = this.fieldTranslations;
        StringBuilder s = lnb.s(i, i2, "FantasyPlayerPriceChanges(playerId=", ", fantasyPlayerId=", ", teamId=");
        vxd.p(i3, ", shortName=", str, ", teamNameCode=", s);
        bf3.v(s, str2, ", position=", str3, ", fantasyPlayerFinalPrice=");
        s.append(f);
        s.append(", totalPriceChange=");
        s.append(f2);
        s.append(", priceChanges=");
        s.append(list);
        s.append(", fieldTranslations=");
        s.append(fieldTranslations);
        s.append(")");
        return s.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyPlayerPriceChanges$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/fantasy/FantasyPlayerPriceChanges;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FantasyPlayerPriceChanges$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FantasyPlayerPriceChanges(int i, int i2, int i3, @NotNull String str, @NotNull String str2, @NotNull String str3, float f, float f2, @NotNull List<FantasyPriceChange> list, @Nullable FieldTranslations fieldTranslations) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        this.playerId = i;
        this.fantasyPlayerId = i2;
        this.teamId = i3;
        this.shortName = str;
        this.teamNameCode = str2;
        this.position = str3;
        this.fantasyPlayerFinalPrice = f;
        this.totalPriceChange = f2;
        this.priceChanges = list;
        this.fieldTranslations = fieldTranslations;
    }

    public /* synthetic */ FantasyPlayerPriceChanges(int i, int i2, int i3, String str, String str2, String str3, float f, float f2, List list, FieldTranslations fieldTranslations, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, str, str2, str3, f, f2, list, (i4 & 512) != 0 ? null : fieldTranslations);
    }
}
