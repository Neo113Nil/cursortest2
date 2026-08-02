package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.unity3d.ads.core.domain.GetSharedDataTimestamps;
import defpackage.f1d;
import defpackage.fdi;
import defpackage.gdi;
import defpackage.lm5;
import defpackage.tub;
import gatewayprotocol.v1.CampaignKt;
import gatewayprotocol.v1.CampaignStateKt;
import gatewayprotocol.v1.CampaignStateOuterClass;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u000eJ\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R&\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\b0\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/unity3d/ads/core/data/repository/AndroidCampaignRepository;", "Lcom/unity3d/ads/core/data/repository/CampaignRepository;", "Lcom/unity3d/ads/core/domain/GetSharedDataTimestamps;", "getSharedDataTimestamps", "<init>", "(Lcom/unity3d/ads/core/domain/GetSharedDataTimestamps;)V", "Lcom/google/protobuf/ByteString;", "opportunityId", "Lgatewayprotocol/v1/CampaignStateOuterClass$Campaign;", MBInterstitialActivity.INTENT_CAMAPIGN, "", "setCampaign", "(Lcom/google/protobuf/ByteString;Lgatewayprotocol/v1/CampaignStateOuterClass$Campaign;)V", "setShowTimestamp", "(Lcom/google/protobuf/ByteString;)V", "getCampaign", "(Lcom/google/protobuf/ByteString;)Lgatewayprotocol/v1/CampaignStateOuterClass$Campaign;", "removeState", "setLoadTimestamp", "Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignState;", "getCampaignState", "()Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignState;", "Lcom/unity3d/ads/core/domain/GetSharedDataTimestamps;", "Lf1d;", "", "", "campaigns", "Lf1d;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidCampaignRepository implements CampaignRepository {

    @NotNull
    private final f1d campaigns;

    @NotNull
    private final GetSharedDataTimestamps getSharedDataTimestamps;

    public AndroidCampaignRepository(@NotNull GetSharedDataTimestamps getSharedDataTimestamps) {
        getSharedDataTimestamps.getClass();
        this.getSharedDataTimestamps = getSharedDataTimestamps;
        lm5 lm5Var = lm5.a;
        lm5Var.getClass();
        this.campaigns = gdi.a(lm5Var);
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    @Nullable
    public CampaignStateOuterClass.Campaign getCampaign(@NotNull ByteString opportunityId) {
        opportunityId.getClass();
        return (CampaignStateOuterClass.Campaign) ((Map) ((fdi) this.campaigns).getValue()).get(opportunityId.toStringUtf8());
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    @NotNull
    public CampaignStateOuterClass.CampaignState getCampaignState() {
        Collection values = ((Map) ((fdi) this.campaigns).getValue()).values();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : values) {
            if (((CampaignStateOuterClass.Campaign) obj).hasShowTimestamp()) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        CampaignStateKt.Dsl.Companion companion = CampaignStateKt.Dsl.INSTANCE;
        CampaignStateOuterClass.CampaignState.Builder newBuilder = CampaignStateOuterClass.CampaignState.newBuilder();
        newBuilder.getClass();
        CampaignStateKt.Dsl _create = companion._create(newBuilder);
        _create.addAllShownCampaigns(_create.getShownCampaigns(), arrayList);
        _create.addAllLoadedCampaigns(_create.getLoadedCampaigns(), arrayList2);
        return _create._build();
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    public void removeState(@NotNull ByteString opportunityId) {
        fdi fdiVar;
        Object value;
        LinkedHashMap linkedHashMap;
        opportunityId.getClass();
        f1d f1dVar = this.campaigns;
        do {
            fdiVar = (fdi) f1dVar;
            value = fdiVar.getValue();
            Map map = (Map) value;
            String stringUtf8 = opportunityId.toStringUtf8();
            map.getClass();
            linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.remove(stringUtf8);
        } while (!fdiVar.k(value, tub.j(linkedHashMap)));
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    public void setCampaign(@NotNull ByteString opportunityId, @NotNull CampaignStateOuterClass.Campaign campaign) {
        fdi fdiVar;
        Object value;
        opportunityId.getClass();
        campaign.getClass();
        f1d f1dVar = this.campaigns;
        do {
            fdiVar = (fdi) f1dVar;
            value = fdiVar.getValue();
        } while (!fdiVar.k(value, tub.l((Map) value, new Pair(opportunityId.toStringUtf8(), campaign))));
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    public void setLoadTimestamp(@NotNull ByteString opportunityId) {
        opportunityId.getClass();
        CampaignStateOuterClass.Campaign campaign = getCampaign(opportunityId);
        if (campaign != null) {
            CampaignKt.Dsl.Companion companion = CampaignKt.Dsl.INSTANCE;
            CampaignStateOuterClass.Campaign.Builder builder = campaign.toBuilder();
            builder.getClass();
            CampaignKt.Dsl _create = companion._create(builder);
            _create.setLoadTimestamp(this.getSharedDataTimestamps.invoke());
            Unit unit = Unit.a;
            setCampaign(opportunityId, _create._build());
        }
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    public void setShowTimestamp(@NotNull ByteString opportunityId) {
        opportunityId.getClass();
        CampaignStateOuterClass.Campaign campaign = getCampaign(opportunityId);
        if (campaign != null) {
            CampaignKt.Dsl.Companion companion = CampaignKt.Dsl.INSTANCE;
            CampaignStateOuterClass.Campaign.Builder builder = campaign.toBuilder();
            builder.getClass();
            CampaignKt.Dsl _create = companion._create(builder);
            _create.setShowTimestamp(this.getSharedDataTimestamps.invoke());
            Unit unit = Unit.a;
            setCampaign(opportunityId, _create._build());
        }
    }
}
