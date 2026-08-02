package com.bytedance.sdk.openadsdk.pcc.sf;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.activity.single.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.nac;
import com.bytedance.sdk.openadsdk.core.oo.qf;
import com.bytedance.sdk.openadsdk.core.ork;
import com.bytedance.sdk.openadsdk.qy.sf.vj;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.bytedance.sdk.openadsdk.utils.tsz;
import com.bytedance.sdk.openadsdk.utils.zti;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class kj extends PAGNativeAd {
    protected final Context gm;
    private boolean kj;
    protected pcc oo;
    protected nac pcc;
    protected String qf;
    protected final of sf;
    protected int vj;
    private boolean vy;
    protected int wh;

    public kj(@NonNull Context context, @NonNull of ofVar, int i, boolean z) {
        this.sf = ofVar;
        this.gm = context;
        this.vj = i;
        this.wh = ofVar.kot();
        String gm = kun.gm(i);
        this.qf = gm;
        if (z) {
            this.oo = new pcc(context, ofVar, gm);
            this.pcc = new nac(context, this, ofVar, pcc(i), this.oo);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        of ofVar = this.sf;
        if (ofVar == null || ofVar.oa() == null) {
            return null;
        }
        try {
            return this.sf.oa().get(str);
        } catch (Throwable th) {
            lo.gm("TTNativeAdImpl", th.getMessage());
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        of ofVar = this.sf;
        if (ofVar != null) {
            return ofVar.oa();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public PAGNativeAdData getNativeAdData() {
        return new oo(kj());
    }

    public pcc kj() {
        return this.oo;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d, String str, String str2) {
        if (this.vy) {
            return;
        }
        zti.pcc(this.sf, d, str, str2);
        this.vy = true;
    }

    public void pcc(@NonNull ViewGroup viewGroup, @NonNull List<View> list, @NonNull List<View> list2, @Nullable List<View> list3, @Nullable View view, final wh whVar) {
        if (viewGroup == null || list2 == null || list2.size() <= 0) {
            return;
        }
        if (qf()) {
            list3 = pcc(list2, list3);
        }
        List<View> list4 = list3;
        if (view != null && whVar != null && whVar.sf()) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.pcc.sf.kj.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    final String pcc = tsz.pcc();
                    TTDelegateActivity.pcc(kj.this.sf, pcc, new qf.pcc() { // from class: com.bytedance.sdk.openadsdk.pcc.sf.kj.1.1
                        @Override // com.bytedance.sdk.openadsdk.core.oo.qf.pcc
                        public void pcc() {
                            whVar.pcc();
                            ork.sf().wh(pcc);
                            PAGMediaView pcc2 = kj.this.kj().pcc();
                            if (pcc2 != null) {
                                pcc2.close();
                            }
                        }
                    });
                }
            });
        }
        this.pcc.pcc(viewGroup, list, list2, list4, whVar);
        of ofVar = this.sf;
        com.bytedance.sdk.openadsdk.qy.sf.vj.pcc(viewGroup, this.sf, (ofVar == null || ofVar.ei() != 2) ? null : new vj.pcc(this.sf.rt()));
    }

    public boolean qf() {
        of ofVar = this.sf;
        return (ofVar == null || ofVar.az() == 5 || lu.oo().gm(this.wh) != 1) ? false : true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void registerViewForInteraction(@NonNull ViewGroup viewGroup, @NonNull List<View> list, @Nullable List<View> list2, @Nullable View view, PAGNativeAdInteractionListener pAGNativeAdInteractionListener) {
        if (viewGroup == null || list == null || list.size() <= 0) {
            return;
        }
        pcc(viewGroup, null, list, list2, view, new qf(pAGNativeAdInteractionListener));
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d) {
        if (this.kj) {
            return;
        }
        zti.pcc(this.sf, d);
        this.kj = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void showPrivacyActivity() {
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void registerViewForInteraction(@NonNull ViewGroup viewGroup, @NonNull List<View> list, @Nullable List<View> list2, @Nullable View view, PAGNativeAdInteractionCallback pAGNativeAdInteractionCallback) {
        registerViewForInteraction(viewGroup, list, list2, view, (PAGNativeAdInteractionListener) pAGNativeAdInteractionCallback);
    }

    private String pcc(int i) {
        if (i == 1) {
            return "banner_ad";
        }
        if (i != 2) {
            return "embeded_ad";
        }
        return "interaction";
    }

    public void pcc(String str) {
        this.qf = str;
    }

    private List<View> pcc(List<View> list, List<View> list2) {
        LinkedList linkedList = new LinkedList();
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                linkedList.add(list.get(i));
            }
        }
        if (list2 != null && !list2.isEmpty()) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                linkedList.add(list2.get(i2));
            }
        }
        return linkedList;
    }
}
