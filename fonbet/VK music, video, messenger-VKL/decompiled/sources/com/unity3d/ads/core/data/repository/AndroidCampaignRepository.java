package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.domain.GetSharedDataTimestamps;
import gatewayprotocol.v1.CampaignKt;
import gatewayprotocol.v1.CampaignStateKt;
import gatewayprotocol.v1.CampaignStateOuterClass;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import xsna.jgp;
import xsna.pn00;
import xsna.s3q0;
import xsna.vtk0;
import xsna.xh50;

/* compiled from: AndroidCampaignRepository.kt */
/* loaded from: classes14.dex */
public final class AndroidCampaignRepository implements CampaignRepository {
    private final xh50<Map<String, CampaignStateOuterClass.Campaign>> campaigns = vtk0.a(jgp.b);
    private final GetSharedDataTimestamps getSharedDataTimestamps;

    public AndroidCampaignRepository(GetSharedDataTimestamps getSharedDataTimestamps) {
        this.getSharedDataTimestamps = getSharedDataTimestamps;
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    public CampaignStateOuterClass.Campaign getCampaign(ByteString byteString) {
        return this.campaigns.getValue().get(byteString.toStringUtf8());
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    public CampaignStateOuterClass.CampaignState getCampaignState() {
        Collection<CampaignStateOuterClass.Campaign> values = this.campaigns.getValue().values();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : values) {
            if (((CampaignStateOuterClass.Campaign) obj).hasShowTimestamp()) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List list = (List) pair.d();
        List list2 = (List) pair.g();
        CampaignStateKt.Dsl _create = CampaignStateKt.Dsl.Companion._create(CampaignStateOuterClass.CampaignState.newBuilder());
        _create.plusAssignAllShownCampaigns(_create.getShownCampaigns(), list);
        _create.plusAssignAllLoadedCampaigns(_create.getLoadedCampaigns(), list2);
        return _create._build();
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    public void removeState(ByteString byteString) {
        Map<String, CampaignStateOuterClass.Campaign> value;
        xh50<Map<String, CampaignStateOuterClass.Campaign>> xh50Var = this.campaigns;
        do {
            value = xh50Var.getValue();
        } while (!xh50Var.compareAndSet(value, pn00.l(byteString.toStringUtf8(), value)));
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    public void setCampaign(ByteString byteString, CampaignStateOuterClass.Campaign campaign) {
        Map<String, CampaignStateOuterClass.Campaign> value;
        xh50<Map<String, CampaignStateOuterClass.Campaign>> xh50Var = this.campaigns;
        do {
            value = xh50Var.getValue();
        } while (!xh50Var.compareAndSet(value, pn00.o(value, new Pair(byteString.toStringUtf8(), campaign))));
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    public void setLoadTimestamp(ByteString byteString) {
        CampaignStateOuterClass.Campaign campaign = getCampaign(byteString);
        if (campaign != null) {
            CampaignKt.Dsl _create = CampaignKt.Dsl.Companion._create(campaign.toBuilder());
            _create.setLoadTimestamp(this.getSharedDataTimestamps.invoke());
            s3q0 s3q0Var = s3q0.a;
            setCampaign(byteString, _create._build());
        }
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    public void setShowTimestamp(ByteString byteString) {
        CampaignStateOuterClass.Campaign campaign = getCampaign(byteString);
        if (campaign != null) {
            CampaignKt.Dsl _create = CampaignKt.Dsl.Companion._create(campaign.toBuilder());
            _create.setShowTimestamp(this.getSharedDataTimestamps.invoke());
            s3q0 s3q0Var = s3q0.a;
            setCampaign(byteString, _create._build());
        }
    }
}
