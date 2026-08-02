package com.sofascore.model.odds;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.a7a;
import defpackage.bf3;
import defpackage.dmi;
import defpackage.gz1;
import defpackage.h75;
import defpackage.ild;
import defpackage.joa;
import defpackage.k13;
import defpackage.km5;
import defpackage.me4;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
import defpackage.wv8;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b'\b\u0087\b\u0018\u0000 o2\u00020\u0001:\u0002poB\u009d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0018\u0010\u0019BÏ\u0001\b\u0010\u0012\u0006\u0010\u001a\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u001b\u0012\u0006\u0010\u001d\u001a\u00020\r\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u0018\u0010 J\r\u0010!\u001a\u00020\n¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\n¢\u0006\u0004\b#\u0010\"J\u0013\u0010$\u001a\b\u0012\u0004\u0012\u00020\n0\u001b¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b,\u0010+J\u0010\u0010-\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b-\u0010+J\u0012\u0010.\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010'J\u0012\u00101\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b3\u0010+J\u0012\u00104\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b6\u0010+J\u0012\u00107\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b7\u0010/J\u0012\u00108\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b8\u00109J\u0012\u0010:\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b:\u0010+JÆ\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0011\u001a\u00020\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b=\u0010+J\u0010\u0010>\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b>\u0010\"J\u001a\u0010A\u001a\u00020\u00042\b\u0010@\u001a\u0004\u0018\u00010?HÖ\u0003¢\u0006\u0004\bA\u0010BJ\u0012\u0010C\u001a\u0004\u0018\u00010\nHÂ\u0003¢\u0006\u0004\bC\u0010/J\u0010\u0010D\u001a\u00020\nHÂ\u0003¢\u0006\u0004\bD\u0010\"J'\u0010M\u001a\u00020J2\u0006\u0010E\u001a\u00020\u00002\u0006\u0010G\u001a\u00020F2\u0006\u0010I\u001a\u00020HH\u0001¢\u0006\u0004\bK\u0010LR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010N\u001a\u0004\bO\u0010'R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010P\u001a\u0004\bQ\u0010)R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010R\u001a\u0004\bS\u0010+R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010R\u001a\u0004\bT\u0010+R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010R\u001a\u0004\bU\u0010+R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010V\u001a\u0004\bW\u0010/R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010N\u001a\u0004\bX\u0010'R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010Y\u001a\u0004\bZ\u00102R$\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010R\u001a\u0004\b[\u0010+\"\u0004\b\\\u0010]R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010VR\u0014\u0010\u0011\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010^R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010_\u001a\u0004\b`\u00105R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010R\u001a\u0004\ba\u0010+R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0014\u0010V\u001a\u0004\bb\u0010/R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010c\u001a\u0004\bd\u00109R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010R\u001a\u0004\be\u0010+R*\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010f\u001a\u0004\bg\u0010%\"\u0004\bh\u0010iR\"\u0010\u001d\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010n¨\u0006q"}, d2 = {"Lcom/sofascore/model/odds/OddsCountryProvider;", "Ljava/io/Serializable;", "Lcom/sofascore/model/odds/OddsProvider;", IronSourceConstants.EVENTS_PROVIDER, "", "branded", "", "featuredOddsType", "defaultBetSlipLink", "betSlipLink", "", "group", "fallbackProvider", "", "oddsOffset", "impressionCostEncrypted", "sort", "weight", "oddsMayDiffer", "signupLink", "featuredUniqueTournamentId", "Lcom/sofascore/model/odds/FeaturedOddsDisplayArea;", "featuredOddsDisplayArea", "type", "<init>", "(Lcom/sofascore/model/odds/OddsProvider;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/sofascore/model/odds/OddsProvider;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Lcom/sofascore/model/odds/FeaturedOddsDisplayArea;Ljava/lang/String;)V", "seen0", "", "subProviders", "impressionCostDecrypted", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/odds/OddsProvider;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/sofascore/model/odds/OddsProvider;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Lcom/sofascore/model/odds/FeaturedOddsDisplayArea;Ljava/lang/String;Ljava/util/List;DLt5h;)V", "getSort", "()I", "getWeight", "getSubProviderIds", "()Ljava/util/List;", "component1", "()Lcom/sofascore/model/odds/OddsProvider;", "component2", "()Z", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "()Ljava/lang/Integer;", "component7", "component8", "()Ljava/lang/Double;", "component9", "component12", "()Ljava/lang/Boolean;", "component13", "component14", "component15", "()Lcom/sofascore/model/odds/FeaturedOddsDisplayArea;", "component16", "copy", "(Lcom/sofascore/model/odds/OddsProvider;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/sofascore/model/odds/OddsProvider;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Lcom/sofascore/model/odds/FeaturedOddsDisplayArea;Ljava/lang/String;)Lcom/sofascore/model/odds/OddsCountryProvider;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "component10", "component11", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/odds/OddsCountryProvider;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/sofascore/model/odds/OddsProvider;", "getProvider", "Z", "getBranded", "Ljava/lang/String;", "getFeaturedOddsType", "getDefaultBetSlipLink", "getBetSlipLink", "Ljava/lang/Integer;", "getGroup", "getFallbackProvider", "Ljava/lang/Double;", "getOddsOffset", "getImpressionCostEncrypted", "setImpressionCostEncrypted", "(Ljava/lang/String;)V", "I", "Ljava/lang/Boolean;", "getOddsMayDiffer", "getSignupLink", "getFeaturedUniqueTournamentId", "Lcom/sofascore/model/odds/FeaturedOddsDisplayArea;", "getFeaturedOddsDisplayArea", "getType", "Ljava/util/List;", "getSubProviders", "setSubProviders", "(Ljava/util/List;)V", "D", "getImpressionCostDecrypted", "()D", "setImpressionCostDecrypted", "(D)V", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class OddsCountryProvider implements Serializable {

    @NotNull
    private final String betSlipLink;
    private final boolean branded;

    @Nullable
    private final String defaultBetSlipLink;

    @Nullable
    private final OddsProvider fallbackProvider;

    @Nullable
    private final FeaturedOddsDisplayArea featuredOddsDisplayArea;

    @NotNull
    private final String featuredOddsType;

    @Nullable
    private final Integer featuredUniqueTournamentId;

    @Nullable
    private final Integer group;
    private double impressionCostDecrypted;

    @Nullable
    private String impressionCostEncrypted;

    @Nullable
    private final Boolean oddsMayDiffer;

    @Nullable
    private final Double oddsOffset;

    @NotNull
    private final OddsProvider provider;

    @Nullable
    private final String signupLink;

    @Nullable
    private final Integer sort;

    @Nullable
    private List<OddsCountryProvider> subProviders;

    @Nullable
    private final String type;
    private final int weight;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ypa.a(ysa.b, new ild(1)), null};

    public /* synthetic */ OddsCountryProvider(int i, OddsProvider oddsProvider, boolean z, String str, String str2, String str3, Integer num, OddsProvider oddsProvider2, Double d, String str4, Integer num2, int i2, Boolean bool, String str5, Integer num3, FeaturedOddsDisplayArea featuredOddsDisplayArea, String str6, List list, double d2, t5h t5hVar) {
        if (65535 != (i & 65535)) {
            oea.z(i, 65535, OddsCountryProvider$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.provider = oddsProvider;
        this.branded = z;
        this.featuredOddsType = str;
        this.defaultBetSlipLink = str2;
        this.betSlipLink = str3;
        this.group = num;
        this.fallbackProvider = oddsProvider2;
        this.oddsOffset = d;
        this.impressionCostEncrypted = str4;
        this.sort = num2;
        this.weight = i2;
        this.oddsMayDiffer = bool;
        this.signupLink = str5;
        this.featuredUniqueTournamentId = num3;
        this.featuredOddsDisplayArea = featuredOddsDisplayArea;
        this.type = str6;
        if ((65536 & i) == 0) {
            this.subProviders = null;
        } else {
            this.subProviders = list;
        }
        this.impressionCostDecrypted = (i & 131072) == 0 ? 0.0d : d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(OddsCountryProvider$$serializer.INSTANCE, 0);
    }

    /* renamed from: component10, reason: from getter */
    private final Integer getSort() {
        return this.sort;
    }

    /* renamed from: component11, reason: from getter */
    private final int getWeight() {
        return this.weight;
    }

    public static final /* synthetic */ void write$Self$model_release(OddsCountryProvider self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        OddsProvider$$serializer oddsProvider$$serializer = OddsProvider$$serializer.INSTANCE;
        output.f(serialDesc, 0, oddsProvider$$serializer, self.provider);
        output.x(serialDesc, 1, self.branded);
        output.y(serialDesc, 2, self.featuredOddsType);
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 3, uhiVar, self.defaultBetSlipLink);
        output.y(serialDesc, 4, self.betSlipLink);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 5, a7aVar, self.group);
        output.h(serialDesc, 6, oddsProvider$$serializer, self.fallbackProvider);
        output.h(serialDesc, 7, h75.a, self.oddsOffset);
        output.h(serialDesc, 8, uhiVar, self.impressionCostEncrypted);
        output.h(serialDesc, 9, a7aVar, self.sort);
        output.u(10, self.weight, serialDesc);
        output.h(serialDesc, 11, gz1.a, self.oddsMayDiffer);
        output.h(serialDesc, 12, uhiVar, self.signupLink);
        output.h(serialDesc, 13, a7aVar, self.featuredUniqueTournamentId);
        output.h(serialDesc, 14, FeaturedOddsDisplayAreaSerializer.INSTANCE, self.featuredOddsDisplayArea);
        output.h(serialDesc, 15, uhiVar, self.type);
        if (output.o(serialDesc) || self.subProviders != null) {
            output.h(serialDesc, 16, (KSerializer) joaVarArr[16].getValue(), self.subProviders);
        }
        if (!output.o(serialDesc) && Double.compare(self.impressionCostDecrypted, 0.0d) == 0) {
            return;
        }
        output.D(serialDesc, 17, self.impressionCostDecrypted);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final OddsProvider getProvider() {
        return this.provider;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Boolean getOddsMayDiffer() {
        return this.oddsMayDiffer;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final String getSignupLink() {
        return this.signupLink;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Integer getFeaturedUniqueTournamentId() {
        return this.featuredUniqueTournamentId;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final FeaturedOddsDisplayArea getFeaturedOddsDisplayArea() {
        return this.featuredOddsDisplayArea;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getBranded() {
        return this.branded;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getFeaturedOddsType() {
        return this.featuredOddsType;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getDefaultBetSlipLink() {
        return this.defaultBetSlipLink;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getBetSlipLink() {
        return this.betSlipLink;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getGroup() {
        return this.group;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final OddsProvider getFallbackProvider() {
        return this.fallbackProvider;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Double getOddsOffset() {
        return this.oddsOffset;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final String getImpressionCostEncrypted() {
        return this.impressionCostEncrypted;
    }

    @NotNull
    public final OddsCountryProvider copy(@NotNull OddsProvider provider, boolean branded, @NotNull String featuredOddsType, @Nullable String defaultBetSlipLink, @NotNull String betSlipLink, @Nullable Integer group, @Nullable OddsProvider fallbackProvider, @Nullable Double oddsOffset, @Nullable String impressionCostEncrypted, @Nullable Integer sort, int weight, @Nullable Boolean oddsMayDiffer, @Nullable String signupLink, @Nullable Integer featuredUniqueTournamentId, @Nullable FeaturedOddsDisplayArea featuredOddsDisplayArea, @Nullable String type) {
        provider.getClass();
        featuredOddsType.getClass();
        betSlipLink.getClass();
        return new OddsCountryProvider(provider, branded, featuredOddsType, defaultBetSlipLink, betSlipLink, group, fallbackProvider, oddsOffset, impressionCostEncrypted, sort, weight, oddsMayDiffer, signupLink, featuredUniqueTournamentId, featuredOddsDisplayArea, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OddsCountryProvider)) {
            return false;
        }
        OddsCountryProvider oddsCountryProvider = (OddsCountryProvider) other;
        return Intrinsics.c(this.provider, oddsCountryProvider.provider) && this.branded == oddsCountryProvider.branded && Intrinsics.c(this.featuredOddsType, oddsCountryProvider.featuredOddsType) && Intrinsics.c(this.defaultBetSlipLink, oddsCountryProvider.defaultBetSlipLink) && Intrinsics.c(this.betSlipLink, oddsCountryProvider.betSlipLink) && Intrinsics.c(this.group, oddsCountryProvider.group) && Intrinsics.c(this.fallbackProvider, oddsCountryProvider.fallbackProvider) && Intrinsics.c(this.oddsOffset, oddsCountryProvider.oddsOffset) && Intrinsics.c(this.impressionCostEncrypted, oddsCountryProvider.impressionCostEncrypted) && Intrinsics.c(this.sort, oddsCountryProvider.sort) && this.weight == oddsCountryProvider.weight && Intrinsics.c(this.oddsMayDiffer, oddsCountryProvider.oddsMayDiffer) && Intrinsics.c(this.signupLink, oddsCountryProvider.signupLink) && Intrinsics.c(this.featuredUniqueTournamentId, oddsCountryProvider.featuredUniqueTournamentId) && this.featuredOddsDisplayArea == oddsCountryProvider.featuredOddsDisplayArea && Intrinsics.c(this.type, oddsCountryProvider.type);
    }

    @NotNull
    public final String getBetSlipLink() {
        return this.betSlipLink;
    }

    public final boolean getBranded() {
        return this.branded;
    }

    @Nullable
    public final String getDefaultBetSlipLink() {
        return this.defaultBetSlipLink;
    }

    @Nullable
    public final OddsProvider getFallbackProvider() {
        return this.fallbackProvider;
    }

    @Nullable
    public final FeaturedOddsDisplayArea getFeaturedOddsDisplayArea() {
        return this.featuredOddsDisplayArea;
    }

    @NotNull
    public final String getFeaturedOddsType() {
        return this.featuredOddsType;
    }

    @Nullable
    public final Integer getFeaturedUniqueTournamentId() {
        return this.featuredUniqueTournamentId;
    }

    @Nullable
    public final Integer getGroup() {
        return this.group;
    }

    public final double getImpressionCostDecrypted() {
        return this.impressionCostDecrypted;
    }

    @Nullable
    public final String getImpressionCostEncrypted() {
        return this.impressionCostEncrypted;
    }

    @Nullable
    public final Boolean getOddsMayDiffer() {
        return this.oddsMayDiffer;
    }

    @Nullable
    public final Double getOddsOffset() {
        return this.oddsOffset;
    }

    @NotNull
    public final OddsProvider getProvider() {
        return this.provider;
    }

    @Nullable
    public final String getSignupLink() {
        return this.signupLink;
    }

    public final int getSort() {
        Integer num = this.sort;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [km5] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    @NotNull
    public final List<Integer> getSubProviderIds() {
        ?? r1;
        List c = a.c(Integer.valueOf(this.provider.getId()));
        List<OddsCountryProvider> list = this.subProviders;
        if (list != null) {
            r1 = new ArrayList(k13.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                r1.add(Integer.valueOf(((OddsCountryProvider) it.next()).provider.getId()));
            }
        } else {
            r1 = km5.a;
        }
        return CollectionsKt.w0(r1, c);
    }

    @Nullable
    public final List<OddsCountryProvider> getSubProviders() {
        return this.subProviders;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public final int getWeight() {
        List<OddsCountryProvider> list = this.subProviders;
        if (list == null) {
            return this.weight;
        }
        Iterator<T> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((OddsCountryProvider) it.next()).weight;
        }
        return i + this.weight;
    }

    public int hashCode() {
        int c = dmi.c(dmi.e(this.provider.hashCode() * 31, 31, this.branded), 31, this.featuredOddsType);
        String str = this.defaultBetSlipLink;
        int c2 = dmi.c((c + (str == null ? 0 : str.hashCode())) * 31, 31, this.betSlipLink);
        Integer num = this.group;
        int hashCode = (c2 + (num == null ? 0 : num.hashCode())) * 31;
        OddsProvider oddsProvider = this.fallbackProvider;
        int hashCode2 = (hashCode + (oddsProvider == null ? 0 : oddsProvider.hashCode())) * 31;
        Double d = this.oddsOffset;
        int hashCode3 = (hashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        String str2 = this.impressionCostEncrypted;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.sort;
        int a = wv8.a(this.weight, (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31, 31);
        Boolean bool = this.oddsMayDiffer;
        int hashCode5 = (a + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.signupLink;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num3 = this.featuredUniqueTournamentId;
        int hashCode7 = (hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        FeaturedOddsDisplayArea featuredOddsDisplayArea = this.featuredOddsDisplayArea;
        int hashCode8 = (hashCode7 + (featuredOddsDisplayArea == null ? 0 : featuredOddsDisplayArea.hashCode())) * 31;
        String str4 = this.type;
        return hashCode8 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setImpressionCostDecrypted(double d) {
        this.impressionCostDecrypted = d;
    }

    public final void setImpressionCostEncrypted(@Nullable String str) {
        this.impressionCostEncrypted = str;
    }

    public final void setSubProviders(@Nullable List<OddsCountryProvider> list) {
        this.subProviders = list;
    }

    @NotNull
    public String toString() {
        OddsProvider oddsProvider = this.provider;
        boolean z = this.branded;
        String str = this.featuredOddsType;
        String str2 = this.defaultBetSlipLink;
        String str3 = this.betSlipLink;
        Integer num = this.group;
        OddsProvider oddsProvider2 = this.fallbackProvider;
        Double d = this.oddsOffset;
        String str4 = this.impressionCostEncrypted;
        Integer num2 = this.sort;
        int i = this.weight;
        Boolean bool = this.oddsMayDiffer;
        String str5 = this.signupLink;
        Integer num3 = this.featuredUniqueTournamentId;
        FeaturedOddsDisplayArea featuredOddsDisplayArea = this.featuredOddsDisplayArea;
        String str6 = this.type;
        StringBuilder sb = new StringBuilder("OddsCountryProvider(provider=");
        sb.append(oddsProvider);
        sb.append(", branded=");
        sb.append(z);
        sb.append(", featuredOddsType=");
        bf3.v(sb, str, ", defaultBetSlipLink=", str2, ", betSlipLink=");
        me4.o(num, str3, ", group=", ", fallbackProvider=", sb);
        sb.append(oddsProvider2);
        sb.append(", oddsOffset=");
        sb.append(d);
        sb.append(", impressionCostEncrypted=");
        me4.o(num2, str4, ", sort=", ", weight=", sb);
        sb.append(i);
        sb.append(", oddsMayDiffer=");
        sb.append(bool);
        sb.append(", signupLink=");
        me4.o(num3, str5, ", featuredUniqueTournamentId=", ", featuredOddsDisplayArea=", sb);
        sb.append(featuredOddsDisplayArea);
        sb.append(", type=");
        sb.append(str6);
        sb.append(")");
        return sb.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/odds/OddsCountryProvider$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/odds/OddsCountryProvider;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return OddsCountryProvider$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public OddsCountryProvider(@NotNull OddsProvider oddsProvider, boolean z, @NotNull String str, @Nullable String str2, @NotNull String str3, @Nullable Integer num, @Nullable OddsProvider oddsProvider2, @Nullable Double d, @Nullable String str4, @Nullable Integer num2, int i, @Nullable Boolean bool, @Nullable String str5, @Nullable Integer num3, @Nullable FeaturedOddsDisplayArea featuredOddsDisplayArea, @Nullable String str6) {
        oddsProvider.getClass();
        str.getClass();
        str3.getClass();
        this.provider = oddsProvider;
        this.branded = z;
        this.featuredOddsType = str;
        this.defaultBetSlipLink = str2;
        this.betSlipLink = str3;
        this.group = num;
        this.fallbackProvider = oddsProvider2;
        this.oddsOffset = d;
        this.impressionCostEncrypted = str4;
        this.sort = num2;
        this.weight = i;
        this.oddsMayDiffer = bool;
        this.signupLink = str5;
        this.featuredUniqueTournamentId = num3;
        this.featuredOddsDisplayArea = featuredOddsDisplayArea;
        this.type = str6;
    }
}
