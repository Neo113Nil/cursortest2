package com.bytedance.adsdk.ugeno.vy.sf;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.bytedance.adsdk.ugeno.sf.pcc;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.sofascore.model.mvvm.model.PlayerKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf extends com.bytedance.adsdk.ugeno.sf.pcc<com.bytedance.adsdk.ugeno.vy.sf.pcc> {
    private com.bytedance.adsdk.ugeno.vy.sf.pcc vd;

    public sf(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.sf.gm
    /* renamed from: gm, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.ugeno.vy.sf.pcc pcc() {
        com.bytedance.adsdk.ugeno.vy.sf.pcc pccVar = new com.bytedance.adsdk.ugeno.vy.sf.pcc(this.sf);
        this.vd = pccVar;
        pccVar.pcc(this);
        return this.vd;
    }

    @Override // com.bytedance.adsdk.ugeno.sf.pcc
    public pcc.C0035pcc ork() {
        return new pcc(this);
    }

    @Override // com.bytedance.adsdk.ugeno.sf.pcc, com.bytedance.adsdk.ugeno.sf.gm
    public void sf() {
        this.vd.setEventMap(this.fy);
        super.sf();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class pcc extends pcc.C0035pcc {
        protected int jsj;

        public pcc(com.bytedance.adsdk.ugeno.sf.pcc pccVar) {
            super(pccVar);
            this.jsj = -1;
        }

        private int pcc(String str) {
            String[] split;
            if (TextUtils.isEmpty(str) || (split = str.split("\\|")) == null || split.length <= 0) {
                return -1;
            }
            int i = 0;
            for (String str2 : split) {
                i |= sf(str2);
            }
            return i;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private int sf(String str) {
            char c;
            str.getClass();
            switch (str.hashCode()) {
                case -1383228885:
                    if (str.equals("bottom")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1364013995:
                    if (str.equals(TtmlNode.CENTER)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -348726240:
                    if (str.equals("center_vertical")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 115029:
                    if (str.equals(PlayerKt.E_SPORTS_TOP)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 3317767:
                    if (str.equals("left")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 108511772:
                    if (str.equals("right")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1063616078:
                    if (str.equals("center_horizontal")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    return 80;
                case 1:
                    return 17;
                case 2:
                    return 16;
                case 3:
                    return 48;
                case 4:
                    return 3;
                case 5:
                    return 5;
                case 6:
                    return 1;
                default:
                    return -1;
            }
        }

        @Override // com.bytedance.adsdk.ugeno.sf.pcc.C0035pcc
        public void pcc(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            super.pcc(context, str, str2);
            if (TextUtils.equals(str, "layoutGravity")) {
                this.jsj = pcc(str2);
            }
        }

        @Override // com.bytedance.adsdk.ugeno.sf.pcc.C0035pcc
        /* renamed from: sf, reason: merged with bridge method [inline-methods] */
        public FrameLayout.LayoutParams pcc() {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) this.pcc, (int) this.sf);
            layoutParams.leftMargin = (int) this.wh;
            layoutParams.rightMargin = (int) this.qf;
            layoutParams.topMargin = (int) this.kj;
            layoutParams.bottomMargin = (int) this.vy;
            layoutParams.gravity = this.jsj;
            return layoutParams;
        }
    }
}
