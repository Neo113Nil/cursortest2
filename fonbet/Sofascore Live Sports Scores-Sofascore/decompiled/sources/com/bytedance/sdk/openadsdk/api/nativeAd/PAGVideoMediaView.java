package com.bytedance.sdk.openadsdk.api.nativeAd;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.gm.pcc;
import com.bytedance.sdk.openadsdk.core.jr.sf.wh;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.utils.oo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class PAGVideoMediaView extends PAGMediaView implements pcc.InterfaceC0074pcc {
    private final com.bytedance.sdk.openadsdk.pcc.sf.pcc gm;
    private of oo;
    private wh sf;

    public PAGVideoMediaView(Context context, @Nullable View view, @Nullable com.bytedance.sdk.openadsdk.pcc.sf.pcc pccVar) {
        super(context);
        pcc(view);
        this.gm = pccVar;
    }

    private void pcc(View view) {
        if (view instanceof wh) {
            wh whVar = (wh) view;
            this.sf = whVar;
            addView(whVar, -1, -1);
        }
    }

    private boolean sf() {
        wh whVar = this.sf;
        if (whVar != null) {
            return whVar.hc();
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView
    public void close() {
        wh whVar = this.sf;
        if (whVar != null) {
            whVar.dax();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.gm.pcc.InterfaceC0074pcc
    public long getVideoProgress() {
        wh whVar = this.sf;
        if (whVar == null || whVar.getNativeVideoController() == null) {
            return 0L;
        }
        return this.sf.getNativeVideoController().wh();
    }

    public void handleInterruptVideo() {
        if (sf()) {
            return;
        }
        pcc();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        oo.pcc(this, this.oo);
    }

    public void setMaterialMeta(of ofVar) {
        this.oo = ofVar;
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        if (onClickListener instanceof pcc) {
            ((pcc) onClickListener).pcc((pcc.InterfaceC0074pcc) this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView
    public void setVideoAdListener(final PAGVideoAdListener pAGVideoAdListener) {
        com.bytedance.sdk.openadsdk.pcc.sf.pcc pccVar = this.gm;
        if (pccVar == null) {
            return;
        }
        pccVar.pcc(new PAGVideoAdListener() { // from class: com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView.1
            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
            public void onVideoAdComplete() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdComplete();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
            public void onVideoAdPaused() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPaused();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
            public void onVideoAdPlay() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPlay();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
            public void onVideoError() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoError();
                }
            }
        });
    }

    private void pcc() {
        wh whVar = this.sf;
        if (whVar != null) {
            whVar.jr();
        }
    }
}
