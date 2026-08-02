package com.sofascore.model.newNetwork;

import defpackage.a7a;
import defpackage.joa;
import defpackage.lm5;
import defpackage.oea;
import defpackage.q79;
import defpackage.r5h;
import defpackage.st;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\r\b\u0007\u0018\u0000 (2\u00020\u0001:\u0002)(B'\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B{\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0006\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u001d¢\u0006\u0004\b \u0010\u001fR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010!R\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010!R$\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\"R$\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\"R\u0013\u0010%\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0013\u0010'\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b&\u0010$¨\u0006*"}, d2 = {"Lcom/sofascore/model/newNetwork/AttributeOverviewResponse;", "Lcom/sofascore/model/newNetwork/NetworkResponse;", "", "Lcom/sofascore/model/newNetwork/AttributeOverviewData;", "playerAttributeOverviews", "averageAttributeOverviews", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lcom/sofascore/model/newNetwork/HeadResponse;", "head", "Lcom/sofascore/model/newNetwork/ErrorResponse;", "error", "", "playerAttributesMap", "averageAttributesMap", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/newNetwork/HeadResponse;Lcom/sofascore/model/newNetwork/ErrorResponse;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/AttributeOverviewResponse;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "getPlayerAttributes", "()Ljava/util/Map;", "getAverageAttributes", "Ljava/util/List;", "Ljava/util/Map;", "getCurrentAttributes", "()Lcom/sofascore/model/newNetwork/AttributeOverviewData;", "currentAttributes", "getCurrentAverage", "currentAverage", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AttributeOverviewResponse extends NetworkResponse {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private List<AttributeOverviewData> averageAttributeOverviews;

    @Nullable
    private Map<Integer, AttributeOverviewData> averageAttributesMap;

    @Nullable
    private List<AttributeOverviewData> playerAttributeOverviews;

    @Nullable
    private Map<Integer, AttributeOverviewData> playerAttributesMap;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, null, ypa.a(ysaVar, new st(25)), ypa.a(ysaVar, new st(26)), ypa.a(ysaVar, new st(27)), ypa.a(ysaVar, new st(28))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AttributeOverviewResponse(int i, HeadResponse headResponse, ErrorResponse errorResponse, List list, List list2, Map map, Map map2, t5h t5hVar) {
        super(i, headResponse, errorResponse, t5hVar);
        if (12 != (i & 12)) {
            oea.z(i, 12, AttributeOverviewResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.playerAttributeOverviews = list;
        this.averageAttributeOverviews = list2;
        if ((i & 16) == 0) {
            this.playerAttributesMap = null;
        } else {
            this.playerAttributesMap = map;
        }
        if ((i & 32) == 0) {
            this.averageAttributesMap = null;
        } else {
            this.averageAttributesMap = map2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(AttributeOverviewData$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(AttributeOverviewData$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new q79(a7a.a, AttributeOverviewData$$serializer.INSTANCE, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
        return new q79(a7a.a, AttributeOverviewData$$serializer.INSTANCE, 1);
    }

    public static final /* synthetic */ void write$Self$model_release(AttributeOverviewResponse self, wf3 output, SerialDescriptor serialDesc) {
        NetworkResponse.write$Self(self, output, serialDesc);
        joa[] joaVarArr = $childSerializers;
        output.h(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.playerAttributeOverviews);
        output.h(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.averageAttributeOverviews);
        if (output.o(serialDesc) || self.playerAttributesMap != null) {
            output.h(serialDesc, 4, (KSerializer) joaVarArr[4].getValue(), self.playerAttributesMap);
        }
        if (!output.o(serialDesc) && self.averageAttributesMap == null) {
            return;
        }
        output.h(serialDesc, 5, (KSerializer) joaVarArr[5].getValue(), self.averageAttributesMap);
    }

    @NotNull
    public final Map<Integer, AttributeOverviewData> getAverageAttributes() {
        if (this.averageAttributesMap == null) {
            this.averageAttributesMap = new HashMap();
            List<AttributeOverviewData> list = this.averageAttributeOverviews;
            if (list != null) {
                for (AttributeOverviewData attributeOverviewData : list) {
                    Map<Integer, AttributeOverviewData> map = this.averageAttributesMap;
                    if (map != null) {
                        map.put(Integer.valueOf(attributeOverviewData.getYearShift()), attributeOverviewData);
                    }
                }
            }
        }
        Map<Integer, AttributeOverviewData> map2 = this.averageAttributesMap;
        if (map2 != null) {
            return map2;
        }
        lm5 lm5Var = lm5.a;
        lm5Var.getClass();
        return lm5Var;
    }

    @Nullable
    public final AttributeOverviewData getCurrentAttributes() {
        return getPlayerAttributes().get(0);
    }

    @Nullable
    public final AttributeOverviewData getCurrentAverage() {
        return getAverageAttributes().get(0);
    }

    @NotNull
    public final Map<Integer, AttributeOverviewData> getPlayerAttributes() {
        if (this.playerAttributesMap == null) {
            this.playerAttributesMap = new HashMap();
            List<AttributeOverviewData> list = this.playerAttributeOverviews;
            if (list != null) {
                for (AttributeOverviewData attributeOverviewData : list) {
                    Map<Integer, AttributeOverviewData> map = this.playerAttributesMap;
                    if (map != null) {
                        map.put(Integer.valueOf(attributeOverviewData.getYearShift()), attributeOverviewData);
                    }
                }
            }
        }
        Map<Integer, AttributeOverviewData> map2 = this.playerAttributesMap;
        if (map2 != null) {
            return map2;
        }
        lm5 lm5Var = lm5.a;
        lm5Var.getClass();
        return lm5Var;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/AttributeOverviewResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/AttributeOverviewResponse;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return AttributeOverviewResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AttributeOverviewResponse(@Nullable List<AttributeOverviewData> list, @Nullable List<AttributeOverviewData> list2) {
        super((HeadResponse) null, (ErrorResponse) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        this.playerAttributeOverviews = list;
        this.averageAttributeOverviews = list2;
    }
}
