package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class E0 {
    private static final int p = -1;
    private final IronSource.a a;
    private final b b;
    private D0 c;
    private final AbstractC4121i3 d;
    public X8 e;
    public C4397xb f;
    public C4151jg g;
    public R1 h;
    public O i;
    public C4223ng j;
    public Sc k;
    private Map<B0, a> l;
    private Map<B0, a> m;
    private Map<B0, a> n;
    private Map<B0, a> o;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class a {
        private final int a;
        private final int b;

        public a(EnumC4373w5 enumC4373w5, EnumC4373w5 enumC4373w52) {
            if (enumC4373w5 != null) {
                this.a = enumC4373w5.b();
            } else {
                this.a = -1;
            }
            if (enumC4373w52 != null) {
                this.b = enumC4373w52.b();
            } else {
                this.b = -1;
            }
        }

        public int a(b bVar) {
            return b.MEDIATION.equals(bVar) ? this.a : this.b;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public enum b {
        MEDIATION,
        PROVIDER
    }

    public E0(IronSource.a aVar, b bVar, D0 d0, AbstractC4121i3 abstractC4121i3) {
        this.a = aVar;
        this.b = bVar;
        this.c = d0;
        this.d = abstractC4121i3 == null ? a(aVar) : abstractC4121i3;
        b();
        this.e = new X8(this);
        this.f = new C4397xb(this);
        this.g = new C4151jg(this);
        this.h = new R1(this);
        this.i = new O(this);
        this.j = new C4223ng(this);
        this.k = new Sc(this);
    }

    private void d() {
        HashMap hashMap = new HashMap();
        this.o = hashMap;
        hashMap.put(B0.INIT_STARTED, new a(EnumC4373w5.NT_MANAGER_INIT_STARTED, null));
        this.o.put(B0.INIT_ENDED, new a(EnumC4373w5.NT_MANAGER_INIT_ENDED, null));
        this.o.put(B0.PLACEMENT_CAPPED, new a(EnumC4373w5.NT_PLACEMENT_CAPPED, null));
        this.o.put(B0.AUCTION_REQUEST, new a(EnumC4373w5.NT_AUCTION_REQUEST, null));
        this.o.put(B0.AUCTION_SUCCESS, new a(EnumC4373w5.NT_AUCTION_SUCCESS, null));
        Map<B0, a> map = this.o;
        B0 b0 = B0.AUCTION_FAILED;
        EnumC4373w5 enumC4373w5 = EnumC4373w5.NT_AUCTION_FAILED;
        map.put(b0, new a(enumC4373w5, null));
        this.o.put(B0.AUCTION_FAILED_NO_CANDIDATES, new a(enumC4373w5, null));
        this.o.put(B0.AUCTION_REQUEST_WATERFALL, new a(EnumC4373w5.NT_AUCTION_REQUEST_WATERFALL, null));
        this.o.put(B0.AUCTION_RESULT_WATERFALL, new a(EnumC4373w5.NT_AUCTION_RESPONSE_WATERFALL, null));
        this.o.put(B0.INIT_SUCCESS, new a(null, null));
        this.o.put(B0.INIT_FAILED, new a(null, null));
        this.o.put(B0.AD_OPENED, new a(EnumC4373w5.NT_CALLBACK_SHOW, EnumC4373w5.NT_INSTANCE_SHOW));
        this.o.put(B0.AD_CLICKED, new a(EnumC4373w5.NT_CALLBACK_CLICK, EnumC4373w5.NT_INSTANCE_CLICK));
        this.o.put(B0.LOAD_AD, new a(EnumC4373w5.NT_LOAD, EnumC4373w5.NT_INSTANCE_LOAD));
        this.o.put(B0.LOAD_AD_SUCCESS, new a(EnumC4373w5.NT_CALLBACK_LOAD_SUCCESS, EnumC4373w5.NT_INSTANCE_LOAD_SUCCESS));
        this.o.put(B0.LOAD_AD_FAILED_WITH_REASON, new a(EnumC4373w5.NT_CALLBACK_LOAD_ERROR, EnumC4373w5.NT_INSTANCE_LOAD_ERROR));
        this.o.put(B0.LOAD_AD_NO_FILL, new a(null, EnumC4373w5.NT_INSTANCE_LOAD_NO_FILL));
        this.o.put(B0.AD_FORMAT_CAPPED, new a(EnumC4373w5.NT_AD_UNIT_CAPPED, null));
        Map<B0, a> map2 = this.o;
        B0 b02 = B0.COLLECT_TOKEN;
        EnumC4373w5 enumC4373w52 = EnumC4373w5.NT_COLLECT_TOKENS;
        EnumC4373w5 enumC4373w53 = EnumC4373w5.NT_INSTANCE_COLLECT_TOKEN;
        map2.put(b02, new a(enumC4373w52, enumC4373w53));
        this.o.put(B0.COLLECT_TOKENS_COMPLETED, new a(EnumC4373w5.NT_COLLECT_TOKENS_COMPLETED, null));
        this.o.put(B0.COLLECT_TOKENS_FAILED, new a(EnumC4373w5.NT_COLLECT_TOKENS_FAILED, null));
        this.o.put(B0.INSTANCE_COLLECT_TOKEN, new a(enumC4373w53, null));
        Map<B0, a> map3 = this.o;
        B0 b03 = B0.INSTANCE_COLLECT_TOKEN_SUCCESS;
        EnumC4373w5 enumC4373w54 = EnumC4373w5.NT_INSTANCE_COLLECT_TOKEN_SUCCESS;
        map3.put(b03, new a(enumC4373w54, enumC4373w54));
        Map<B0, a> map4 = this.o;
        B0 b04 = B0.INSTANCE_COLLECT_TOKEN_FAILED;
        EnumC4373w5 enumC4373w55 = EnumC4373w5.NT_INSTANCE_COLLECT_TOKEN_FAILED;
        map4.put(b04, new a(enumC4373w55, enumC4373w55));
        Map<B0, a> map5 = this.o;
        B0 b05 = B0.INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        EnumC4373w5 enumC4373w56 = EnumC4373w5.NT_INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        map5.put(b05, new a(enumC4373w56, enumC4373w56));
        this.o.put(B0.DESTROY_AD, new a(EnumC4373w5.NT_DESTROY, EnumC4373w5.NT_INSTANCE_DESTROY));
        this.o.put(B0.TROUBLESHOOT_ILR_REVENUE, new a(EnumC4373w5.TROUBLESHOOTING_NT_ILR_REVENUE, null));
        Map<B0, a> map6 = this.o;
        B0 b06 = B0.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING;
        EnumC4373w5 enumC4373w57 = EnumC4373w5.TROUBLESHOOTING_NT_PROVIDER_SETTINGS_MISSING;
        map6.put(b06, new a(enumC4373w57, enumC4373w57));
        Map<B0, a> map7 = this.o;
        B0 b07 = B0.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS;
        EnumC4373w5 enumC4373w58 = EnumC4373w5.TROUBLESHOOTING_NT_UNEXPECTED_INIT_SUCCESS;
        map7.put(b07, new a(enumC4373w58, enumC4373w58));
        Map<B0, a> map8 = this.o;
        B0 b08 = B0.TROUBLESHOOT_UNEXPECTED_INIT_FAILED;
        EnumC4373w5 enumC4373w59 = EnumC4373w5.TROUBLESHOOTING_NT_UNEXPECTED_INIT_FAILED;
        map8.put(b08, new a(enumC4373w59, enumC4373w59));
        Map<B0, a> map9 = this.o;
        B0 b09 = B0.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS;
        EnumC4373w5 enumC4373w510 = EnumC4373w5.TROUBLESHOOTING_NT_UNEXPECTED_AUCTION_SUCCESS;
        map9.put(b09, new a(enumC4373w510, enumC4373w510));
        Map<B0, a> map10 = this.o;
        B0 b010 = B0.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED;
        EnumC4373w5 enumC4373w511 = EnumC4373w5.TROUBLESHOOTING_NT_UNEXPECTED_AUCTION_FAILED;
        map10.put(b010, new a(enumC4373w511, enumC4373w511));
        Map<B0, a> map11 = this.o;
        B0 b011 = B0.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS;
        EnumC4373w5 enumC4373w512 = EnumC4373w5.TROUBLESHOOTING_NT_UNEXPECTED_LOAD_SUCCESS;
        map11.put(b011, new a(enumC4373w512, enumC4373w512));
        Map<B0, a> map12 = this.o;
        B0 b012 = B0.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED;
        EnumC4373w5 enumC4373w513 = EnumC4373w5.TROUBLESHOOTING_NT_UNEXPECTED_LOAD_FAILED;
        map12.put(b012, new a(enumC4373w513, enumC4373w513));
        Map<B0, a> map13 = this.o;
        B0 b013 = B0.TROUBLESHOOT_UNEXPECTED_TIMEOUT;
        EnumC4373w5 enumC4373w514 = EnumC4373w5.TROUBLESHOOTING_NT_UNEXPECTED_TIMEOUT;
        map13.put(b013, new a(enumC4373w514, enumC4373w514));
        Map<B0, a> map14 = this.o;
        B0 b014 = B0.TROUBLESHOOT_UNEXPECTED_OPENED;
        EnumC4373w5 enumC4373w515 = EnumC4373w5.TROUBLESHOOTING_NT_UNEXPECTED_OPENED;
        map14.put(b014, new a(enumC4373w515, enumC4373w515));
        Map<B0, a> map15 = this.o;
        B0 b015 = B0.TROUBLESHOOT_INTERNAL_ERROR;
        EnumC4373w5 enumC4373w516 = EnumC4373w5.TROUBLESHOOTING_NT_INTERNAL_ERROR;
        map15.put(b015, new a(enumC4373w516, enumC4373w516));
        Map<B0, a> map16 = this.o;
        B0 b016 = B0.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        EnumC4373w5 enumC4373w517 = EnumC4373w5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        map16.put(b016, new a(enumC4373w517, enumC4373w517));
        Map<B0, a> map17 = this.o;
        B0 b017 = B0.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        EnumC4373w5 enumC4373w518 = EnumC4373w5.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        map17.put(b017, new a(enumC4373w518, enumC4373w518));
        this.o.put(B0.TROUBLESHOOT_NOTIFICATION_ERROR, new a(EnumC4373w5.TROUBLESHOOTING_NT_NOTIFICATIONS_ERROR, null));
    }

    public void a() {
        HashMap hashMap = new HashMap();
        this.n = hashMap;
        hashMap.put(B0.INIT_STARTED, new a(EnumC4373w5.BN_MANAGER_INIT_STARTED, null));
        this.n.put(B0.INIT_ENDED, new a(EnumC4373w5.BN_MANAGER_INIT_ENDED, null));
        this.n.put(B0.PLACEMENT_CAPPED, new a(EnumC4373w5.BN_PLACEMENT_CAPPED, null));
        this.n.put(B0.AUCTION_REQUEST, new a(EnumC4373w5.BN_AUCTION_REQUEST, null));
        this.n.put(B0.AUCTION_SUCCESS, new a(EnumC4373w5.BN_AUCTION_SUCCESS, null));
        Map<B0, a> map = this.n;
        B0 b0 = B0.AUCTION_FAILED;
        EnumC4373w5 enumC4373w5 = EnumC4373w5.BN_AUCTION_FAILED;
        map.put(b0, new a(enumC4373w5, null));
        this.n.put(B0.AUCTION_FAILED_NO_CANDIDATES, new a(enumC4373w5, null));
        this.n.put(B0.AUCTION_REQUEST_WATERFALL, new a(EnumC4373w5.BN_AUCTION_REQUEST_WATERFALL, null));
        this.n.put(B0.AUCTION_RESULT_WATERFALL, new a(EnumC4373w5.BN_AUCTION_RESPONSE_WATERFALL, null));
        this.n.put(B0.INIT_SUCCESS, new a(null, null));
        this.n.put(B0.INIT_FAILED, new a(null, null));
        this.n.put(B0.AD_OPENED, new a(EnumC4373w5.BN_CALLBACK_SHOW, EnumC4373w5.BN_INSTANCE_SHOW));
        this.n.put(B0.SHOW_AD_FAILED, new a(EnumC4373w5.BN_CALLBACK_SHOW_FAILED, EnumC4373w5.BN_INSTANCE_SHOW_FAILED));
        this.n.put(B0.AD_CLICKED, new a(EnumC4373w5.BN_CALLBACK_CLICK, EnumC4373w5.BN_INSTANCE_CLICK));
        this.n.put(B0.LOAD_AD, new a(EnumC4373w5.BN_LOAD, EnumC4373w5.BN_INSTANCE_LOAD));
        this.n.put(B0.RELOAD_AD, new a(EnumC4373w5.BN_RELOAD, EnumC4373w5.BN_INSTANCE_RELOAD));
        this.n.put(B0.LOAD_AD_SUCCESS, new a(EnumC4373w5.BN_CALLBACK_LOAD_SUCCESS, EnumC4373w5.BN_INSTANCE_LOAD_SUCCESS));
        this.n.put(B0.RELOAD_AD_SUCCESS, new a(EnumC4373w5.BN_CALLBACK_RELOAD_SUCCESS, EnumC4373w5.BN_INSTANCE_RELOAD_SUCCESS));
        this.n.put(B0.LOAD_AD_FAILED_WITH_REASON, new a(EnumC4373w5.BN_CALLBACK_LOAD_ERROR, EnumC4373w5.BN_INSTANCE_LOAD_ERROR));
        this.n.put(B0.RELOAD_AD_FAILED_WITH_REASON, new a(EnumC4373w5.BN_CALLBACK_RELOAD_ERROR, EnumC4373w5.BN_INSTANCE_RELOAD_ERROR));
        this.n.put(B0.LOAD_AD_NO_FILL, new a(null, EnumC4373w5.BN_INSTANCE_LOAD_NO_FILL));
        this.n.put(B0.RELOAD_AD_NO_FILL, new a(null, EnumC4373w5.BN_INSTANCE_RELOAD_NO_FILL));
        this.n.put(B0.AD_FORMAT_CAPPED, new a(EnumC4373w5.BN_AD_UNIT_CAPPED, null));
        this.n.put(B0.COLLECT_TOKEN, new a(EnumC4373w5.BN_COLLECT_TOKENS, null));
        this.n.put(B0.COLLECT_TOKENS_COMPLETED, new a(EnumC4373w5.BN_COLLECT_TOKENS_COMPLETED, null));
        this.n.put(B0.COLLECT_TOKENS_FAILED, new a(EnumC4373w5.BN_COLLECT_TOKENS_FAILED, null));
        this.n.put(B0.INSTANCE_COLLECT_TOKEN, new a(EnumC4373w5.BN_INSTANCE_COLLECT_TOKEN, null));
        Map<B0, a> map2 = this.n;
        B0 b02 = B0.INSTANCE_COLLECT_TOKEN_SUCCESS;
        EnumC4373w5 enumC4373w52 = EnumC4373w5.BN_INSTANCE_COLLECT_TOKEN_SUCCESS;
        map2.put(b02, new a(enumC4373w52, enumC4373w52));
        Map<B0, a> map3 = this.n;
        B0 b03 = B0.INSTANCE_COLLECT_TOKEN_FAILED;
        EnumC4373w5 enumC4373w53 = EnumC4373w5.BN_INSTANCE_COLLECT_TOKEN_FAILED;
        map3.put(b03, new a(enumC4373w53, enumC4373w53));
        Map<B0, a> map4 = this.n;
        B0 b04 = B0.INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        EnumC4373w5 enumC4373w54 = EnumC4373w5.BN_INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        map4.put(b04, new a(enumC4373w54, enumC4373w54));
        this.n.put(B0.DESTROY_AD, new a(EnumC4373w5.BN_DESTROY, EnumC4373w5.BN_INSTANCE_DESTROY));
        this.n.put(B0.SKIP_RELOAD_AD, new a(EnumC4373w5.BN_SKIP_RELOAD, null));
        this.n.put(B0.AD_LEFT_APPLICATION, new a(EnumC4373w5.BN_CALLBACK_LEAVE_APP, EnumC4373w5.BN_INSTANCE_LEAVE_APP));
        this.n.put(B0.AD_PRESENT_SCREEN, new a(EnumC4373w5.BN_CALLBACK_PRESENT_SCREEN, EnumC4373w5.BN_INSTANCE_PRESENT_SCREEN));
        this.n.put(B0.AD_DISMISS_SCREEN, new a(EnumC4373w5.BN_CALLBACK_DISMISS_SCREEN, EnumC4373w5.BN_INSTANCE_DISMISS_SCREEN));
        this.n.put(B0.AD_VIEW_BOUND, new a(EnumC4373w5.BN_BOUND, EnumC4373w5.BN_INSTANCE_BOUND));
        this.n.put(B0.PAUSE_AD, new a(EnumC4373w5.BN_REFRESH_PAUSE, null));
        this.n.put(B0.RESUME_AD, new a(EnumC4373w5.BN_REFRESH_RESUME, null));
        this.n.put(B0.OPERATIONAL_SET_CONFIGURATIONS, new a(EnumC4373w5.BN_SET_CONFIGURATION, null));
        Map<B0, a> map5 = this.n;
        B0 b05 = B0.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING;
        EnumC4373w5 enumC4373w55 = EnumC4373w5.TROUBLESHOOTING_BN_PROVIDER_SETTINGS_MISSING;
        map5.put(b05, new a(enumC4373w55, enumC4373w55));
        Map<B0, a> map6 = this.n;
        B0 b06 = B0.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS;
        EnumC4373w5 enumC4373w56 = EnumC4373w5.TROUBLESHOOTING_BN_UNEXPECTED_INIT_SUCCESS;
        map6.put(b06, new a(enumC4373w56, enumC4373w56));
        Map<B0, a> map7 = this.n;
        B0 b07 = B0.TROUBLESHOOT_UNEXPECTED_INIT_FAILED;
        EnumC4373w5 enumC4373w57 = EnumC4373w5.TROUBLESHOOTING_BN_UNEXPECTED_INIT_FAILED;
        map7.put(b07, new a(enumC4373w57, enumC4373w57));
        Map<B0, a> map8 = this.n;
        B0 b08 = B0.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS;
        EnumC4373w5 enumC4373w58 = EnumC4373w5.TROUBLESHOOTING_BN_UNEXPECTED_AUCTION_SUCCESS;
        map8.put(b08, new a(enumC4373w58, enumC4373w58));
        Map<B0, a> map9 = this.n;
        B0 b09 = B0.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED;
        EnumC4373w5 enumC4373w59 = EnumC4373w5.TROUBLESHOOTING_BN_UNEXPECTED_AUCTION_FAILED;
        map9.put(b09, new a(enumC4373w59, enumC4373w59));
        Map<B0, a> map10 = this.n;
        B0 b010 = B0.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS;
        EnumC4373w5 enumC4373w510 = EnumC4373w5.TROUBLESHOOTING_BN_UNEXPECTED_LOAD_SUCCESS;
        map10.put(b010, new a(enumC4373w510, enumC4373w510));
        Map<B0, a> map11 = this.n;
        B0 b011 = B0.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED;
        EnumC4373w5 enumC4373w511 = EnumC4373w5.TROUBLESHOOTING_BN_UNEXPECTED_LOAD_FAILED;
        map11.put(b011, new a(enumC4373w511, enumC4373w511));
        Map<B0, a> map12 = this.n;
        B0 b012 = B0.TROUBLESHOOT_UNEXPECTED_RELOAD_SUCCESS;
        EnumC4373w5 enumC4373w512 = EnumC4373w5.TROUBLESHOOTING_BN_UNEXPECTED_RELOAD_SUCCESS;
        map12.put(b012, new a(enumC4373w512, enumC4373w512));
        Map<B0, a> map13 = this.n;
        B0 b013 = B0.TROUBLESHOOT_UNEXPECTED_RELOAD_FAILED;
        EnumC4373w5 enumC4373w513 = EnumC4373w5.TROUBLESHOOTING_BN_UNEXPECTED_RELOAD_FAILED;
        map13.put(b013, new a(enumC4373w513, enumC4373w513));
        Map<B0, a> map14 = this.n;
        B0 b014 = B0.TROUBLESHOOT_UNEXPECTED_TIMEOUT;
        EnumC4373w5 enumC4373w514 = EnumC4373w5.TROUBLESHOOTING_BN_UNEXPECTED_TIMEOUT;
        map14.put(b014, new a(enumC4373w514, enumC4373w514));
        Map<B0, a> map15 = this.n;
        B0 b015 = B0.TROUBLESHOOT_UNEXPECTED_OPENED;
        EnumC4373w5 enumC4373w515 = EnumC4373w5.TROUBLESHOOTING_BN_UNEXPECTED_OPENED;
        map15.put(b015, new a(enumC4373w515, enumC4373w515));
        Map<B0, a> map16 = this.n;
        B0 b016 = B0.TROUBLESHOOT_INTERNAL_ERROR;
        EnumC4373w5 enumC4373w516 = EnumC4373w5.TROUBLESHOOTING_BN_INTERNAL_ERROR;
        map16.put(b016, new a(enumC4373w516, enumC4373w516));
        Map<B0, a> map17 = this.n;
        B0 b017 = B0.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        EnumC4373w5 enumC4373w517 = EnumC4373w5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        map17.put(b017, new a(enumC4373w517, enumC4373w517));
        Map<B0, a> map18 = this.n;
        B0 b018 = B0.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        EnumC4373w5 enumC4373w518 = EnumC4373w5.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        map18.put(b018, new a(enumC4373w518, enumC4373w518));
        this.n.put(B0.TROUBLESHOOT_NOTIFICATION_ERROR, new a(EnumC4373w5.TROUBLESHOOTING_BN_NOTIFICATIONS_ERROR, null));
        this.n.put(B0.TROUBLESHOOT_BN_RELOAD_EXCEPTION, new a(EnumC4373w5.TROUBLESHOOTING_BN_RELOAD_EXCEPTION, null));
        this.n.put(B0.TROUBLESHOOT_IMPRESSION_TIMEOUT, new a(EnumC4373w5.TROUBLESHOOTING_BN_IMPRESSION_TIMEOUT_REACHED, null));
        this.n.put(B0.TROUBLESHOOT_BANNER_REFRESH_TRIGGER_PAUSE, new a(EnumC4373w5.TROUBLESHOOT_BN_BANNER_REFRESH_TRIGGER_PAUSE, null));
        this.n.put(B0.TROUBLESHOOT_BANNER_REFRESH_TRIGGER_RESUME, new a(EnumC4373w5.TROUBLESHOOT_BN_BANNER_REFRESH_TRIGGER_RESUME, null));
        Map<B0, a> map19 = this.n;
        B0 b019 = B0.TROUBLESHOOT_BANNER_REFRESH_TRANSITION;
        EnumC4373w5 enumC4373w519 = EnumC4373w5.TROUBLESHOOT_BN_BANNER_REFRESH_TRANSITION;
        map19.put(b019, new a(enumC4373w519, enumC4373w519));
        Map<B0, a> map20 = this.n;
        B0 b020 = B0.TROUBLESHOOT_BANNER_REFRESH_ANIMATED;
        EnumC4373w5 enumC4373w520 = EnumC4373w5.TROUBLESHOOT_BN_BANNER_REFRESH_ANIMATED;
        map20.put(b020, new a(enumC4373w520, enumC4373w520));
        Map<B0, a> map21 = this.n;
        B0 b021 = B0.TROUBLESHOOT_ILLEGAL_STATE;
        EnumC4373w5 enumC4373w521 = EnumC4373w5.TROUBLESHOOTING_BN_ILLEGAL_STATE;
        map21.put(b021, new a(enumC4373w521, enumC4373w521));
        this.n.put(B0.TROUBLESHOOT_RELOAD, new a(EnumC4373w5.TROUBLESHOOTING_BN_RELOAD, null));
        Map<B0, a> map22 = this.n;
        B0 b022 = B0.TROUBLESHOOT_LOAD_SKIPPED;
        EnumC4373w5 enumC4373w522 = EnumC4373w5.TROUBLESHOOTING_BN_LOAD_SKIPPED;
        map22.put(b022, new a(enumC4373w522, enumC4373w522));
        this.n.put(B0.TROUBLESHOOT_ILR_REVENUE, new a(EnumC4373w5.TROUBLESHOOTING_BN_ILR_REVENUE, null));
        this.n.put(B0.TROUBLESHOOT_ILR_SUBSCRIBE, new a(EnumC4373w5.TROUBLESHOOTING_BN_ILR_SUBSCRIBE, null));
        this.n.put(B0.TROUBLESHOOT_ILR_UNSUBSCRIBE, new a(EnumC4373w5.TROUBLESHOOTING_BN_ILR_UNSUBSCRIBE, null));
        this.n.put(B0.TROUBLESHOOT_ILR_REVENUE_INSTANCE, new a(EnumC4373w5.TROUBLESHOOTING_BN_ILR_REVENUE_INSTANCE, null));
    }

    public void b() {
        c();
        e();
        a();
        d();
    }

    public void c() {
        HashMap hashMap = new HashMap();
        this.l = hashMap;
        hashMap.put(B0.INIT_STARTED, new a(EnumC4373w5.IS_MANAGER_INIT_STARTED, null));
        this.l.put(B0.INIT_ENDED, new a(EnumC4373w5.IS_MANAGER_INIT_ENDED, null));
        this.l.put(B0.SESSION_CAPPED, new a(null, EnumC4373w5.IS_CAP_SESSION));
        this.l.put(B0.PLACEMENT_CAPPED, new a(EnumC4373w5.IS_CAP_PLACEMENT, null));
        this.l.put(B0.CHECK_PLACEMENT_CAPPED, new a(EnumC4373w5.IS_CHECK_PLACEMENT_CAPPED, null));
        this.l.put(B0.AUCTION_REQUEST, new a(EnumC4373w5.IS_AUCTION_REQUEST, null));
        this.l.put(B0.AUCTION_SUCCESS, new a(EnumC4373w5.IS_AUCTION_SUCCESS, null));
        Map<B0, a> map = this.l;
        B0 b0 = B0.AUCTION_FAILED;
        EnumC4373w5 enumC4373w5 = EnumC4373w5.IS_AUCTION_FAILED;
        map.put(b0, new a(enumC4373w5, null));
        this.l.put(B0.AUCTION_FAILED_NO_CANDIDATES, new a(enumC4373w5, null));
        this.l.put(B0.AUCTION_REQUEST_WATERFALL, new a(EnumC4373w5.IS_AUCTION_REQUEST_WATERFALL, null));
        this.l.put(B0.AUCTION_RESULT_WATERFALL, new a(EnumC4373w5.IS_RESULT_WATERFALL, null));
        this.l.put(B0.INIT_SUCCESS, new a(null, null));
        this.l.put(B0.INIT_FAILED, new a(null, null));
        this.l.put(B0.AD_OPENED, new a(null, EnumC4373w5.IS_INSTANCE_OPENED));
        this.l.put(B0.AD_CLOSED, new a(EnumC4373w5.IS_CALLBACK_AD_CLOSED, EnumC4373w5.IS_INSTANCE_CLOSED));
        this.l.put(B0.AD_CLICKED, new a(EnumC4373w5.IS_CALLBACK_AD_CLICKED, EnumC4373w5.IS_INSTANCE_CLICKED));
        this.l.put(B0.AD_INFO_CHANGED, new a(EnumC4373w5.IS_CALLBACK_AD_INFO_CHANGED, null));
        this.l.put(B0.LOAD_AD, new a(EnumC4373w5.IS_LOAD_CALLED, EnumC4373w5.IS_INSTANCE_LOAD));
        this.l.put(B0.LOAD_AD_SUCCESS, new a(EnumC4373w5.IS_CALLBACK_LOAD_SUCCESS, EnumC4373w5.IS_INSTANCE_LOAD_SUCCESS));
        this.l.put(B0.LOAD_AD_FAILED_WITH_REASON, new a(EnumC4373w5.IS_CALLBACK_LOAD_ERROR, EnumC4373w5.IS_INSTANCE_LOAD_FAILED));
        this.l.put(B0.LOAD_AD_NO_FILL, new a(null, EnumC4373w5.IS_INSTANCE_LOAD_NO_FILL));
        this.l.put(B0.SHOW_AD, new a(EnumC4373w5.IS_SHOW_CALLED, EnumC4373w5.IS_INSTANCE_SHOW));
        this.l.put(B0.SHOW_AD_FAILED, new a(EnumC4373w5.IS_CALLBACK_AD_SHOW_ERROR, EnumC4373w5.IS_INSTANCE_SHOW_FAILED));
        this.l.put(B0.AD_FORMAT_CAPPED, new a(EnumC4373w5.IS_AD_FORMAT_CAPPED, null));
        this.l.put(B0.AD_UNIT_CAPPED, new a(EnumC4373w5.IS_AD_UNIT_CAPPED, null));
        this.l.put(B0.COLLECT_TOKEN, new a(EnumC4373w5.IS_COLLECT_TOKENS, null));
        this.l.put(B0.COLLECT_TOKENS_COMPLETED, new a(EnumC4373w5.IS_COLLECT_TOKENS_COMPLETED, null));
        this.l.put(B0.COLLECT_TOKENS_FAILED, new a(EnumC4373w5.IS_COLLECT_TOKENS_FAILED, null));
        this.l.put(B0.INSTANCE_COLLECT_TOKEN, new a(EnumC4373w5.IS_INSTANCE_COLLECT_TOKEN, null));
        this.l.put(B0.INSTANCE_COLLECT_TOKEN_SUCCESS, new a(EnumC4373w5.IS_INSTANCE_COLLECT_TOKEN_SUCCESS, null));
        this.l.put(B0.INSTANCE_COLLECT_TOKEN_FAILED, new a(EnumC4373w5.IS_INSTANCE_COLLECT_TOKEN_FAILED, null));
        this.l.put(B0.INSTANCE_COLLECT_TOKEN_TIMED_OUT, new a(EnumC4373w5.IS_INSTANCE_COLLECT_TOKEN_TIMED_OUT, null));
        this.l.put(B0.AD_READY_TRUE, new a(EnumC4373w5.IS_CHECK_READY_TRUE, null));
        this.l.put(B0.AD_READY_FALSE, new a(EnumC4373w5.IS_CHECK_READY_FALSE, null));
        this.l.put(B0.OPERATIONAL_LOAD_AD, new a(EnumC4373w5.IS_OPERATIONAL_LOAD_AD, null));
        this.l.put(B0.OPERATIONAL_LOAD_SUCCESS, new a(EnumC4373w5.IS_OPERATIONAL_LOAD_SUCCESS, null));
        this.l.put(B0.OPERATIONAL_LOAD_FAILED, new a(EnumC4373w5.IS_OPERATIONAL_LOAD_FAILED, null));
        this.l.put(B0.OPERATIONAL_SET_CONFIGURATIONS, new a(EnumC4373w5.IS_SET_CONFIGURATION, null));
        this.l.put(B0.PRELOAD_ADUNIT_INITIATED, new a(EnumC4373w5.IS_PRELOAD_ADUNIT_INITIATED, null));
        this.l.put(B0.PRELOAD_ADUNIT_FAILED, new a(EnumC4373w5.IS_PRELOAD_ADUNIT_FAILED, null));
        this.l.put(B0.PRELOAD_ADUNIT_LOAD_SUCCESS, new a(EnumC4373w5.IS_PRELOAD_ADUNIT_LOAD_SUCCESS, null));
        Map<B0, a> map2 = this.l;
        B0 b02 = B0.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING;
        EnumC4373w5 enumC4373w52 = EnumC4373w5.TROUBLESHOOTING_IS_PROVIDER_SETTINGS_MISSING;
        map2.put(b02, new a(enumC4373w52, enumC4373w52));
        Map<B0, a> map3 = this.l;
        B0 b03 = B0.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS;
        EnumC4373w5 enumC4373w53 = EnumC4373w5.TROUBLESHOOTING_IS_UNEXPECTED_INIT_SUCCESS;
        map3.put(b03, new a(enumC4373w53, enumC4373w53));
        Map<B0, a> map4 = this.l;
        B0 b04 = B0.TROUBLESHOOT_UNEXPECTED_INIT_FAILED;
        EnumC4373w5 enumC4373w54 = EnumC4373w5.TROUBLESHOOTING_IS_UNEXPECTED_INIT_FAILED;
        map4.put(b04, new a(enumC4373w54, enumC4373w54));
        Map<B0, a> map5 = this.l;
        B0 b05 = B0.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS;
        EnumC4373w5 enumC4373w55 = EnumC4373w5.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_SUCCESS;
        map5.put(b05, new a(enumC4373w55, enumC4373w55));
        Map<B0, a> map6 = this.l;
        B0 b06 = B0.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED;
        EnumC4373w5 enumC4373w56 = EnumC4373w5.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_FAILED;
        map6.put(b06, new a(enumC4373w56, enumC4373w56));
        Map<B0, a> map7 = this.l;
        B0 b07 = B0.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS;
        EnumC4373w5 enumC4373w57 = EnumC4373w5.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_SUCCESS;
        map7.put(b07, new a(enumC4373w57, enumC4373w57));
        Map<B0, a> map8 = this.l;
        B0 b08 = B0.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED;
        EnumC4373w5 enumC4373w58 = EnumC4373w5.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_FAILED;
        map8.put(b08, new a(enumC4373w58, enumC4373w58));
        Map<B0, a> map9 = this.l;
        B0 b09 = B0.TROUBLESHOOT_UNEXPECTED_SHOW_FAILED;
        EnumC4373w5 enumC4373w59 = EnumC4373w5.TROUBLESHOOTING_IS_UNEXPECTED_SHOW_FAILED;
        map9.put(b09, new a(enumC4373w59, enumC4373w59));
        Map<B0, a> map10 = this.l;
        B0 b010 = B0.TROUBLESHOOT_UNEXPECTED_CLOSED;
        EnumC4373w5 enumC4373w510 = EnumC4373w5.TROUBLESHOOTING_IS_UNEXPECTED_CLOSED;
        map10.put(b010, new a(enumC4373w510, enumC4373w510));
        Map<B0, a> map11 = this.l;
        B0 b011 = B0.TROUBLESHOOT_UNEXPECTED_TIMEOUT;
        EnumC4373w5 enumC4373w511 = EnumC4373w5.TROUBLESHOOTING_IS_UNEXPECTED_TIMEOUT;
        map11.put(b011, new a(enumC4373w511, enumC4373w511));
        Map<B0, a> map12 = this.l;
        B0 b012 = B0.TROUBLESHOOT_INTERNAL_ERROR;
        EnumC4373w5 enumC4373w512 = EnumC4373w5.TROUBLESHOOTING_IS_INTERNAL_ERROR;
        map12.put(b012, new a(enumC4373w512, enumC4373w512));
        Map<B0, a> map13 = this.l;
        B0 b013 = B0.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        EnumC4373w5 enumC4373w513 = EnumC4373w5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        map13.put(b013, new a(enumC4373w513, enumC4373w513));
        Map<B0, a> map14 = this.l;
        B0 b014 = B0.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        EnumC4373w5 enumC4373w514 = EnumC4373w5.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        map14.put(b014, new a(enumC4373w514, enumC4373w514));
        this.l.put(B0.TROUBLESHOOT_NOTIFICATION_ERROR, new a(EnumC4373w5.TROUBLESHOOTING_IS_NOTIFICATIONS_ERROR, null));
        Map<B0, a> map15 = this.l;
        B0 b015 = B0.TROUBLESHOOT_AD_EXPIRED;
        EnumC4373w5 enumC4373w515 = EnumC4373w5.TROUBLESHOOTING_IS_AD_EXPIRED;
        map15.put(b015, new a(enumC4373w515, enumC4373w515));
        this.l.put(B0.TROUBLESHOOT_LOAD, new a(EnumC4373w5.TROUBLESHOOTING_IS_LOAD, null));
        this.l.put(B0.TROUBLESHOOT_LOAD_WHILE_LOADED, new a(EnumC4373w5.TROUBLESHOOTING_IS_LOAD_WHILE_LOADED, null));
        this.l.put(B0.TROUBLESHOOT_LOAD_SUCCESS, new a(EnumC4373w5.TROUBLESHOOTING_IS_LOAD_SUCCESS, null));
        this.l.put(B0.TROUBLESHOOT_LOAD_FAILED, new a(EnumC4373w5.TROUBLESHOOTING_IS_LOAD_FAILED, null));
        this.l.put(B0.TROUBLESHOOT_SHOW, new a(EnumC4373w5.TROUBLESHOOTING_IS_SHOW, null));
        this.l.put(B0.TROUBLESHOOT_SHOW_SUCCESS, new a(EnumC4373w5.TROUBLESHOOTING_IS_SHOW_SUCCESS, null));
        this.l.put(B0.TROUBLESHOOT_SHOW_FAILED, new a(EnumC4373w5.TROUBLESHOOTING_IS_SHOW_FAILED, null));
        Map<B0, a> map16 = this.l;
        B0 b016 = B0.TROUBLESHOOT_ILLEGAL_STATE;
        EnumC4373w5 enumC4373w516 = EnumC4373w5.TROUBLESHOOTING_IS_ILLEGAL_STATE;
        map16.put(b016, new a(enumC4373w516, enumC4373w516));
        this.l.put(B0.TROUBLESHOOT_AD_INFO_CHANGED, new a(EnumC4373w5.TROUBLESHOOT_IS_AD_INFO_CHANGED, null));
        this.l.put(B0.TROUBLESHOOT_DESTROY_INSTANCES_READY_TO_SHOW, new a(EnumC4373w5.TROUBLESHOOTING_IS_DESTROY_READY_TO_SHOW_INSTANCES, null));
        this.l.put(B0.TROUBLESHOOT_ILR_REVENUE, new a(EnumC4373w5.TROUBLESHOOTING_IS_ILR_REVENUE, null));
        this.l.put(B0.TROUBLESHOOT_SHOW_RECOVERY_INITIATED, new a(EnumC4373w5.TROUBLESHOOT_IS_SHOW_RECOVERY_INITIATED, null));
        this.l.put(B0.TROUBLESHOOT_ILR_SUBSCRIBE, new a(EnumC4373w5.TROUBLESHOOTING_IS_ILR_SUBSCRIBE, null));
        this.l.put(B0.TROUBLESHOOT_ILR_UNSUBSCRIBE, new a(EnumC4373w5.TROUBLESHOOTING_IS_ILR_UNSUBSCRIBE, null));
        this.l.put(B0.TROUBLESHOOT_ILR_REVENUE_INSTANCE, new a(EnumC4373w5.TROUBLESHOOTING_IS_ILR_REVENUE_INSTANCE, null));
    }

    public void e() {
        HashMap hashMap = new HashMap();
        this.m = hashMap;
        hashMap.put(B0.INIT_STARTED, new a(EnumC4373w5.RV_MANAGER_INIT_STARTED, null));
        this.m.put(B0.INIT_ENDED, new a(EnumC4373w5.RV_MANAGER_INIT_ENDED, null));
        this.m.put(B0.SESSION_CAPPED, new a(null, EnumC4373w5.RV_CAP_SESSION));
        this.m.put(B0.PLACEMENT_CAPPED, new a(EnumC4373w5.RV_CAP_PLACEMENT, null));
        this.m.put(B0.CHECK_PLACEMENT_CAPPED, new a(EnumC4373w5.RV_CHECK_PLACEMENT_CAPPED, null));
        this.m.put(B0.AUCTION_REQUEST, new a(EnumC4373w5.RV_AUCTION_REQUEST, null));
        this.m.put(B0.AUCTION_SUCCESS, new a(EnumC4373w5.RV_AUCTION_SUCCESS, null));
        Map<B0, a> map = this.m;
        B0 b0 = B0.AUCTION_FAILED;
        EnumC4373w5 enumC4373w5 = EnumC4373w5.RV_AUCTION_FAILED;
        map.put(b0, new a(enumC4373w5, null));
        this.m.put(B0.AUCTION_FAILED_NO_CANDIDATES, new a(enumC4373w5, null));
        this.m.put(B0.AUCTION_REQUEST_WATERFALL, new a(EnumC4373w5.RV_AUCTION_REQUEST_WATERFALL, null));
        this.m.put(B0.AUCTION_RESULT_WATERFALL, new a(EnumC4373w5.RV_AUCTION_RESPONSE_WATERFALL, null));
        this.m.put(B0.INIT_SUCCESS, new a(null, null));
        this.m.put(B0.INIT_FAILED, new a(null, null));
        this.m.put(B0.AD_VISIBLE, new a(null, EnumC4373w5.RV_INSTANCE_VISIBLE));
        this.m.put(B0.AD_OPENED, new a(null, EnumC4373w5.RV_BUSINESS_INSTANCE_OPENED));
        this.m.put(B0.AD_CLOSED, new a(null, EnumC4373w5.RV_INSTANCE_CLOSED));
        this.m.put(B0.AD_STARTED, new a(null, EnumC4373w5.RV_INSTANCE_STARTED));
        this.m.put(B0.AD_ENDED, new a(null, EnumC4373w5.RV_INSTANCE_ENDED));
        this.m.put(B0.AD_CLICKED, new a(EnumC4373w5.RV_CALLBACK_AD_CLICKED, EnumC4373w5.RV_BUSINESS_INSTANCE_CLICKED));
        this.m.put(B0.AD_INFO_CHANGED, new a(EnumC4373w5.RV_CALLBACK_AD_INFO_CHANGED, null));
        this.m.put(B0.AD_REWARDED, new a(null, EnumC4373w5.RV_BUSINESS_INSTANCE_REWARDED));
        this.m.put(B0.AD_AVAILABILITY_CHANGED_TRUE, new a(EnumC4373w5.RV_CALLBACK_AVAILABILITY_TRUE, EnumC4373w5.RV_INSTANCE_AVAILABILITY_TRUE));
        this.m.put(B0.AD_AVAILABILITY_CHANGED_FALSE, new a(EnumC4373w5.RV_CALLBACK_AVAILABILITY_FALSE, EnumC4373w5.RV_INSTANCE_AVAILABILITY_FALSE));
        this.m.put(B0.LOAD_AD, new a(EnumC4373w5.RV_BUSINESS_MEDIATION_LOAD, EnumC4373w5.RV_BUSINESS_INSTANCE_LOAD));
        this.m.put(B0.LOAD_AD_SUCCESS, new a(EnumC4373w5.RV_BUSINESS_MEDIATION_LOAD_SUCCESS, EnumC4373w5.RV_BUSINESS_INSTANCE_LOAD_SUCCESS));
        this.m.put(B0.LOAD_AD_FAILED, new a(null, EnumC4373w5.RV_INSTANCE_LOAD_FAILED));
        this.m.put(B0.LOAD_AD_FAILED_WITH_REASON, new a(EnumC4373w5.RV_MEDIATION_LOAD_ERROR, EnumC4373w5.RV_INSTANCE_LOAD_FAILED_REASON));
        this.m.put(B0.LOAD_AD_NO_FILL, new a(null, EnumC4373w5.RV_INSTANCE_LOAD_NO_FILL));
        this.m.put(B0.SHOW_AD, new a(EnumC4373w5.RV_API_SHOW_CALLED, EnumC4373w5.RV_INSTANCE_SHOW));
        this.m.put(B0.SHOW_AD_CHANCE, new a(null, EnumC4373w5.RV_INSTANCE_SHOW_CHANCE));
        this.m.put(B0.SHOW_AD_FAILED, new a(EnumC4373w5.RV_CALLBACK_SHOW_FAILED, EnumC4373w5.RV_INSTANCE_SHOW_FAILED));
        this.m.put(B0.AD_FORMAT_CAPPED, new a(EnumC4373w5.RV_AD_UNIT_CAPPED, null));
        this.m.put(B0.COLLECT_TOKEN, new a(EnumC4373w5.RV_COLLECT_TOKENS, null));
        this.m.put(B0.COLLECT_TOKENS_COMPLETED, new a(EnumC4373w5.RV_COLLECT_TOKENS_COMPLETED, null));
        this.m.put(B0.COLLECT_TOKENS_FAILED, new a(EnumC4373w5.RV_COLLECT_TOKENS_FAILED, null));
        this.m.put(B0.INSTANCE_COLLECT_TOKEN, new a(EnumC4373w5.RV_INSTANCE_COLLECT_TOKEN, null));
        Map<B0, a> map2 = this.m;
        B0 b02 = B0.INSTANCE_COLLECT_TOKEN_SUCCESS;
        EnumC4373w5 enumC4373w52 = EnumC4373w5.RV_INSTANCE_COLLECT_TOKEN_SUCCESS;
        map2.put(b02, new a(enumC4373w52, enumC4373w52));
        Map<B0, a> map3 = this.m;
        B0 b03 = B0.INSTANCE_COLLECT_TOKEN_FAILED;
        EnumC4373w5 enumC4373w53 = EnumC4373w5.RV_INSTANCE_COLLECT_TOKEN_FAILED;
        map3.put(b03, new a(enumC4373w53, enumC4373w53));
        Map<B0, a> map4 = this.m;
        B0 b04 = B0.INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        EnumC4373w5 enumC4373w54 = EnumC4373w5.RV_INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        map4.put(b04, new a(enumC4373w54, enumC4373w54));
        this.m.put(B0.AD_READY_TRUE, new a(EnumC4373w5.RV_CHECK_READY_TRUE, null));
        this.m.put(B0.AD_READY_FALSE, new a(EnumC4373w5.RV_CHECK_READY_FALSE, null));
        this.m.put(B0.OPERATIONAL_LOAD_AD, new a(EnumC4373w5.RV_OPERATIONAL_LOAD_AD, null));
        this.m.put(B0.OPERATIONAL_LOAD_SUCCESS, new a(EnumC4373w5.RV_OPERATIONAL_LOAD_SUCCESS, null));
        this.m.put(B0.OPERATIONAL_LOAD_FAILED, new a(EnumC4373w5.RV_OPERATIONAL_LOAD_FAILED, null));
        this.m.put(B0.OPERATIONAL_SET_CONFIGURATIONS, new a(EnumC4373w5.RV_SET_CONFIGURATION, null));
        this.m.put(B0.OPERATIONAL_GET_REWARD, new a(EnumC4373w5.RV_OPERATIONAL_GET_REWARD, null));
        this.m.put(B0.PRELOAD_ADUNIT_INITIATED, new a(EnumC4373w5.RV_PRELOAD_ADUNIT_INITIATED, null));
        this.m.put(B0.PRELOAD_ADUNIT_FAILED, new a(EnumC4373w5.RV_PRELOAD_ADUNIT_FAILED, null));
        this.m.put(B0.PRELOAD_ADUNIT_LOAD_SUCCESS, new a(EnumC4373w5.RV_PRELOAD_ADUNIT_LOAD_SUCCESS, null));
        Map<B0, a> map5 = this.m;
        B0 b05 = B0.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING;
        EnumC4373w5 enumC4373w55 = EnumC4373w5.TROUBLESHOOTING_RV_PROVIDER_SETTINGS_MISSING;
        map5.put(b05, new a(enumC4373w55, enumC4373w55));
        Map<B0, a> map6 = this.m;
        B0 b06 = B0.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS;
        EnumC4373w5 enumC4373w56 = EnumC4373w5.TROUBLESHOOTING_RV_UNEXPECTED_INIT_SUCCESS;
        map6.put(b06, new a(enumC4373w56, enumC4373w56));
        Map<B0, a> map7 = this.m;
        B0 b07 = B0.TROUBLESHOOT_UNEXPECTED_INIT_FAILED;
        EnumC4373w5 enumC4373w57 = EnumC4373w5.TROUBLESHOOTING_RV_UNEXPECTED_INIT_FAILED;
        map7.put(b07, new a(enumC4373w57, enumC4373w57));
        Map<B0, a> map8 = this.m;
        B0 b08 = B0.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS;
        EnumC4373w5 enumC4373w58 = EnumC4373w5.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_SUCCESS;
        map8.put(b08, new a(enumC4373w58, enumC4373w58));
        Map<B0, a> map9 = this.m;
        B0 b09 = B0.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED;
        EnumC4373w5 enumC4373w59 = EnumC4373w5.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_FAILED;
        map9.put(b09, new a(enumC4373w59, enumC4373w59));
        Map<B0, a> map10 = this.m;
        B0 b010 = B0.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS;
        EnumC4373w5 enumC4373w510 = EnumC4373w5.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_SUCCESS;
        map10.put(b010, new a(enumC4373w510, enumC4373w510));
        Map<B0, a> map11 = this.m;
        B0 b011 = B0.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED;
        EnumC4373w5 enumC4373w511 = EnumC4373w5.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_FAILED;
        map11.put(b011, new a(enumC4373w511, enumC4373w511));
        Map<B0, a> map12 = this.m;
        B0 b012 = B0.TROUBLESHOOT_UNEXPECTED_SHOW_FAILED;
        EnumC4373w5 enumC4373w512 = EnumC4373w5.TROUBLESHOOTING_RV_UNEXPECTED_SHOW_FAILED;
        map12.put(b012, new a(enumC4373w512, enumC4373w512));
        Map<B0, a> map13 = this.m;
        B0 b013 = B0.TROUBLESHOOT_UNEXPECTED_TIMEOUT;
        EnumC4373w5 enumC4373w513 = EnumC4373w5.TROUBLESHOOTING_RV_UNEXPECTED_TIMEOUT;
        map13.put(b013, new a(enumC4373w513, enumC4373w513));
        Map<B0, a> map14 = this.m;
        B0 b014 = B0.TROUBLESHOOT_UNEXPECTED_CLOSED;
        EnumC4373w5 enumC4373w514 = EnumC4373w5.TROUBLESHOOTING_RV_UNEXPECTED_CLOSED;
        map14.put(b014, new a(enumC4373w514, enumC4373w514));
        Map<B0, a> map15 = this.m;
        B0 b015 = B0.TROUBLESHOOT_LOAD_FAILED;
        EnumC4373w5 enumC4373w515 = EnumC4373w5.TROUBLESHOOTING_RV_LOAD_FAILED;
        map15.put(b015, new a(enumC4373w515, enumC4373w515));
        Map<B0, a> map16 = this.m;
        B0 b016 = B0.TROUBLESHOOT_INTERNAL_ERROR;
        EnumC4373w5 enumC4373w516 = EnumC4373w5.TROUBLESHOOTING_RV_INTERNAL_ERROR;
        map16.put(b016, new a(enumC4373w516, enumC4373w516));
        Map<B0, a> map17 = this.m;
        B0 b017 = B0.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        EnumC4373w5 enumC4373w517 = EnumC4373w5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        map17.put(b017, new a(enumC4373w517, enumC4373w517));
        Map<B0, a> map18 = this.m;
        B0 b018 = B0.TROUBLESHOOT_WATERFALL_OVERHEAD;
        EnumC4373w5 enumC4373w518 = EnumC4373w5.TROUBLESHOOTING_RV_WATERFALL_OVERHEAD;
        map18.put(b018, new a(enumC4373w518, enumC4373w518));
        this.m.put(B0.TROUBLESHOOT_NOTIFICATION_ERROR, new a(EnumC4373w5.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, null));
        Map<B0, a> map19 = this.m;
        B0 b019 = B0.TROUBLESHOOT_AD_EXPIRED;
        EnumC4373w5 enumC4373w519 = EnumC4373w5.TROUBLESHOOTING_RV_AD_EXPIRED;
        map19.put(b019, new a(enumC4373w519, enumC4373w519));
        this.m.put(B0.TROUBLESHOOT_LOAD, new a(EnumC4373w5.TROUBLESHOOTING_RV_LOAD, null));
        this.m.put(B0.TROUBLESHOOT_LOAD_WHILE_LOADED, new a(EnumC4373w5.TROUBLESHOOTING_RV_LOAD_WHILE_LOADED, null));
        this.m.put(B0.TROUBLESHOOT_LOAD_SUCCESS, new a(EnumC4373w5.TROUBLESHOOTING_RV_LOAD_SUCCESS, null));
        this.m.put(B0.TROUBLESHOOT_SHOW, new a(EnumC4373w5.TROUBLESHOOTING_RV_SHOW, null));
        this.m.put(B0.TROUBLESHOOT_SHOW_SUCCESS, new a(EnumC4373w5.TROUBLESHOOTING_RV_SHOW_SUCCESS, null));
        this.m.put(B0.TROUBLESHOOT_SHOW_FAILED, new a(EnumC4373w5.TROUBLESHOOTING_RV_SHOW_FAILED, null));
        Map<B0, a> map20 = this.m;
        B0 b020 = B0.TROUBLESHOOT_ILLEGAL_STATE;
        EnumC4373w5 enumC4373w520 = EnumC4373w5.TROUBLESHOOTING_RV_ILLEGAL_STATE;
        map20.put(b020, new a(enumC4373w520, enumC4373w520));
        this.m.put(B0.TROUBLESHOOT_AD_INFO_CHANGED, new a(EnumC4373w5.TROUBLESHOOT_RV_AD_INFO_CHANGED, null));
        this.m.put(B0.TROUBLESHOOT_DESTROY_INSTANCES_READY_TO_SHOW, new a(EnumC4373w5.TROUBLESHOOTING_RV_DESTROY_READY_TO_SHOW_INSTANCES, null));
        this.m.put(B0.TROUBLESHOOT_ILR_REVENUE, new a(EnumC4373w5.TROUBLESHOOTING_RV_ILR_REVENUE, null));
        this.m.put(B0.TROUBLESHOOT_SHOW_RECOVERY_INITIATED, new a(EnumC4373w5.TROUBLESHOOT_RV_SHOW_RECOVERY_INITIATED, null));
        this.m.put(B0.TROUBLESHOOT_ILR_SUBSCRIBE, new a(EnumC4373w5.TROUBLESHOOTING_RV_ILR_SUBSCRIBE, null));
        this.m.put(B0.TROUBLESHOOT_ILR_UNSUBSCRIBE, new a(EnumC4373w5.TROUBLESHOOTING_RV_ILR_UNSUBSCRIBE, null));
        this.m.put(B0.TROUBLESHOOT_ILR_REVENUE_INSTANCE, new a(EnumC4373w5.TROUBLESHOOTING_RV_ILR_REVENUE_INSTANCE, null));
    }

    public void f() {
        this.c = null;
        this.g = null;
        this.h = null;
        this.e = null;
        this.f = null;
        this.i = null;
        this.j = null;
        this.k = null;
    }

    public E0(IronSource.a aVar, b bVar, D0 d0) {
        this(aVar, bVar, d0, a(aVar));
    }

    public void a(B0 b0, Map<String, Object> map) {
        a(b0, map, Calendar.getInstance().getTimeInMillis());
    }

    public void a(B0 b0, Map<String, Object> map, long j) {
        int a2 = a(b0);
        if (-1 == a2) {
            return;
        }
        HashMap hashMap = new HashMap();
        D0 d0 = this.c;
        if (d0 != null) {
            hashMap.putAll(d0.a(b0));
        }
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        this.d.a(new C4355v5(a2, j, new JSONObject(hashMap)));
    }

    private int a(B0 b0) {
        try {
            if (IronSource.a.INTERSTITIAL.equals(this.a) && this.l.containsKey(b0)) {
                return this.l.get(b0).a(this.b);
            }
            if (IronSource.a.REWARDED_VIDEO.equals(this.a) && this.m.containsKey(b0)) {
                return this.m.get(b0).a(this.b);
            }
            if (IronSource.a.BANNER.equals(this.a) && this.n.containsKey(b0)) {
                return this.n.get(b0).a(this.b);
            }
            if (IronSource.a.NATIVE_AD.equals(this.a) && this.o.containsKey(b0)) {
                return this.o.get(b0).a(this.b);
            }
            return -1;
        } catch (Exception e) {
            C4157k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return -1;
        }
    }

    private static AbstractC4121i3 a(IronSource.a aVar) {
        if (aVar.equals(IronSource.a.REWARDED_VIDEO)) {
            return C4078fe.i();
        }
        return F9.i();
    }
}
