package com.bytedance.sdk.openadsdk.api.init;

import android.text.TextUtils;
import com.bytedance.sdk.component.qf.gm.oo;
import com.bytedance.sdk.component.utils.jr;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.InitConfig;
import com.bytedance.sdk.openadsdk.api.PAGConstant;
import com.bytedance.sdk.openadsdk.core.zti;
import com.bytedance.sdk.openadsdk.utils.kun;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class PAGConfig implements InitConfig {
    private static String qf;
    private String kj;
    private String pcc;
    private boolean sf;
    private String vj;
    private String wh;
    private int gm = -1;
    private int oo = 0;

    public static void debugLog(boolean z) {
        if (zti.pcc() != null) {
            if (z) {
                zti.pcc().sf(1);
                zti.pcc().sf();
            } else {
                zti.pcc().sf(0);
                oo.pcc(oo.pcc.OFF);
                jr.sf();
                lo.sf();
            }
        }
    }

    public static int getPAConsent() {
        if (kun.vh("getPAConsent")) {
            return zti.pcc().vj();
        }
        return -1;
    }

    public static void setAppIconId(int i) {
        if (zti.pcc() != null) {
            zti.pcc().gm(i);
        }
    }

    public static void setPAConsent(@PAGConstant.PAGPAConsentType int i) {
        if (kun.vh("setPAConsent")) {
            if (i == 1 || i == 0) {
                zti.pcc().oo(i);
            } else {
                zti.pcc().oo(-2);
            }
        }
    }

    public static void setPackageName(String str) {
        qf = str;
    }

    public static void setUserData(String str) {
        if (zti.pcc() != null) {
            zti.pcc().sf(str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getAdxId() {
        return this.kj;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getAppId() {
        return this.pcc;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getData() {
        return this.wh;
    }

    public boolean getDebugLog() {
        return this.sf;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getPA() {
        return this.gm;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getPackageName() {
        return TextUtils.isEmpty(this.vj) ? qf : this.vj;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getTitleBarTheme() {
        return this.oo;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public boolean isSupportMultiProcess() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public boolean isUseTextureView() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gm(String str) {
        this.vj = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oo(String str) {
        this.kj = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sf(String str) {
        this.pcc = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(String str) {
        this.wh = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sf(int i) {
        this.oo = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(boolean z) {
        this.sf = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(int i) {
        this.gm = i;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class Builder {
        private String pcc;
        private String qf;
        private boolean sf;
        private String[] vj;
        private String wh;
        private int gm = -1;
        private int oo = 0;
        private String kj = "";

        public Builder appId(String str) {
            this.pcc = str;
            return this;
        }

        public PAGConfig build() {
            PAGConfig pAGConfig = new PAGConfig();
            pAGConfig.sf(this.pcc);
            pAGConfig.sf(this.oo);
            pAGConfig.pcc(this.gm);
            pAGConfig.pcc(this.sf);
            pAGConfig.gm(this.wh);
            pAGConfig.pcc(this.qf);
            pAGConfig.oo(this.kj);
            return pAGConfig;
        }

        public Builder debugLog(boolean z) {
            this.sf = z;
            return this;
        }

        public Builder needClearTaskReset(String... strArr) {
            this.vj = strArr;
            return this;
        }

        public Builder setAdxId(String str) {
            this.kj = str;
            return this;
        }

        public Builder setPAConsent(@PAGConstant.PAGPAConsentType int i) {
            if (i == 0 || i == 1) {
                this.gm = i;
                return this;
            }
            this.gm = -2;
            return this;
        }

        public Builder setPackageName(String str) {
            this.wh = str;
            return this;
        }

        public Builder setUserData(String str) {
            this.qf = str;
            return this;
        }

        public Builder titleBarTheme(int i) {
            this.oo = i;
            return this;
        }

        @Deprecated
        public Builder appIcon(int i) {
            return this;
        }

        public Builder supportMultiProcess(boolean z) {
            return this;
        }

        public Builder useTextureView(boolean z) {
            return this;
        }
    }
}
