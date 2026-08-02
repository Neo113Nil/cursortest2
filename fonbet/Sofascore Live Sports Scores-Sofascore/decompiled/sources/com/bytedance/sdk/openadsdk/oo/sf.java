package com.bytedance.sdk.openadsdk.oo;

import com.bytedance.sdk.openadsdk.oo.gm.pcc;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf {
    public static final String pcc = pcc.InterfaceC0116pcc.pcc;
    public static final String sf = pcc.InterfaceC0116pcc.sf;
    public static final String gm = pcc.InterfaceC0116pcc.gm;
    public static final String oo = pcc.InterfaceC0116pcc.oo;
    public static final String vj = pcc.InterfaceC0116pcc.vj;
    public static final String wh = pcc.InterfaceC0116pcc.wh;
    public static final Set<String> qf = new HashSet(Arrays.asList("click", "show", "insight_log"));

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class pcc {
        public static String gm = "direct";
        public static String oo = "saLandingPageLinks";
        public static String pcc = "openDetailPage";
        public static String sf = "openAdLandPageLinks";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.bytedance.sdk.openadsdk.oo.sf$sf, reason: collision with other inner class name */
    public static class C0122sf {
        public static int gm = 100;
        public static int pcc = 1;
        public static int sf = 2;
    }

    public static boolean pcc(String str) {
        return "embeded_ad".equals(str) || "banner_ad".equals(str) || "interaction".equals(str) || "slide_banner_ad".equals(str);
    }
}
