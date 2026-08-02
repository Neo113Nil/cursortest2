package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class F0 {
    private static final int p = -1;
    private final IronSource.a a;
    private final b b;
    private E0 c;
    private final AbstractC2519l3 d;
    public W8 e;
    public C2760yb f;
    public C2443gg g;
    public T1 h;
    public O i;
    public C2514kg j;
    public Sc k;
    private Map<C0, a> l;
    private Map<C0, a> m;
    private Map<C0, a> n;
    private Map<C0, a> o;

    private static class a {
        private final int a;
        private final int b;

        public a(EnumC2754y5 enumC2754y5, EnumC2754y5 enumC2754y52) {
            if (enumC2754y5 != null) {
                this.a = enumC2754y5.b();
            } else {
                this.a = -1;
            }
            if (enumC2754y52 != null) {
                this.b = enumC2754y52.b();
            } else {
                this.b = -1;
            }
        }

        int a(b bVar) {
            return b.MEDIATION.equals(bVar) ? this.a : this.b;
        }
    }

    public enum b {
        MEDIATION,
        PROVIDER
    }

    public F0(IronSource.a aVar, b bVar, E0 e0) {
        this(aVar, bVar, e0, a(aVar));
    }

    private static AbstractC2519l3 a(IronSource.a aVar) {
        return aVar.equals(IronSource.a.REWARDED_VIDEO) ? C2441ge.i() : F9.i();
    }

    private void d() {
        HashMap hashMap = new HashMap();
        this.o = hashMap;
        hashMap.put(C0.INIT_STARTED, new a(EnumC2754y5.NT_MANAGER_INIT_STARTED, null));
        this.o.put(C0.INIT_ENDED, new a(EnumC2754y5.NT_MANAGER_INIT_ENDED, null));
        this.o.put(C0.PLACEMENT_CAPPED, new a(EnumC2754y5.NT_PLACEMENT_CAPPED, null));
        this.o.put(C0.AUCTION_REQUEST, new a(EnumC2754y5.NT_AUCTION_REQUEST, null));
        this.o.put(C0.AUCTION_SUCCESS, new a(EnumC2754y5.NT_AUCTION_SUCCESS, null));
        Map<C0, a> map = this.o;
        C0 c0 = C0.AUCTION_FAILED;
        EnumC2754y5 enumC2754y5 = EnumC2754y5.NT_AUCTION_FAILED;
        map.put(c0, new a(enumC2754y5, null));
        this.o.put(C0.AUCTION_FAILED_NO_CANDIDATES, new a(enumC2754y5, null));
        this.o.put(C0.AUCTION_REQUEST_WATERFALL, new a(EnumC2754y5.NT_AUCTION_REQUEST_WATERFALL, null));
        this.o.put(C0.AUCTION_RESULT_WATERFALL, new a(EnumC2754y5.NT_AUCTION_RESPONSE_WATERFALL, null));
        this.o.put(C0.INIT_SUCCESS, new a(null, null));
        this.o.put(C0.INIT_FAILED, new a(null, null));
        this.o.put(C0.AD_OPENED, new a(EnumC2754y5.NT_CALLBACK_SHOW, EnumC2754y5.NT_INSTANCE_SHOW));
        this.o.put(C0.AD_CLICKED, new a(EnumC2754y5.NT_CALLBACK_CLICK, EnumC2754y5.NT_INSTANCE_CLICK));
        this.o.put(C0.LOAD_AD, new a(EnumC2754y5.NT_LOAD, EnumC2754y5.NT_INSTANCE_LOAD));
        this.o.put(C0.LOAD_AD_SUCCESS, new a(EnumC2754y5.NT_CALLBACK_LOAD_SUCCESS, EnumC2754y5.NT_INSTANCE_LOAD_SUCCESS));
        this.o.put(C0.LOAD_AD_FAILED_WITH_REASON, new a(EnumC2754y5.NT_CALLBACK_LOAD_ERROR, EnumC2754y5.NT_INSTANCE_LOAD_ERROR));
        this.o.put(C0.LOAD_AD_NO_FILL, new a(null, EnumC2754y5.NT_INSTANCE_LOAD_NO_FILL));
        this.o.put(C0.AD_FORMAT_CAPPED, new a(EnumC2754y5.NT_AD_UNIT_CAPPED, null));
        Map<C0, a> map2 = this.o;
        C0 c02 = C0.COLLECT_TOKEN;
        EnumC2754y5 enumC2754y52 = EnumC2754y5.NT_COLLECT_TOKENS;
        EnumC2754y5 enumC2754y53 = EnumC2754y5.NT_INSTANCE_COLLECT_TOKEN;
        map2.put(c02, new a(enumC2754y52, enumC2754y53));
        this.o.put(C0.COLLECT_TOKENS_COMPLETED, new a(EnumC2754y5.NT_COLLECT_TOKENS_COMPLETED, null));
        this.o.put(C0.COLLECT_TOKENS_FAILED, new a(EnumC2754y5.NT_COLLECT_TOKENS_FAILED, null));
        this.o.put(C0.INSTANCE_COLLECT_TOKEN, new a(enumC2754y53, null));
        Map<C0, a> map3 = this.o;
        C0 c03 = C0.INSTANCE_COLLECT_TOKEN_SUCCESS;
        EnumC2754y5 enumC2754y54 = EnumC2754y5.NT_INSTANCE_COLLECT_TOKEN_SUCCESS;
        map3.put(c03, new a(enumC2754y54, enumC2754y54));
        Map<C0, a> map4 = this.o;
        C0 c04 = C0.INSTANCE_COLLECT_TOKEN_FAILED;
        EnumC2754y5 enumC2754y55 = EnumC2754y5.NT_INSTANCE_COLLECT_TOKEN_FAILED;
        map4.put(c04, new a(enumC2754y55, enumC2754y55));
        Map<C0, a> map5 = this.o;
        C0 c05 = C0.INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        EnumC2754y5 enumC2754y56 = EnumC2754y5.NT_INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        map5.put(c05, new a(enumC2754y56, enumC2754y56));
        this.o.put(C0.DESTROY_AD, new a(EnumC2754y5.NT_DESTROY, EnumC2754y5.NT_INSTANCE_DESTROY));
        this.o.put(C0.TROUBLESHOOT_ILR_REVENUE, new a(EnumC2754y5.TROUBLESHOOTING_NT_ILR_REVENUE, null));
        Map<C0, a> map6 = this.o;
        C0 c06 = C0.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING;
        EnumC2754y5 enumC2754y57 = EnumC2754y5.TROUBLESHOOTING_NT_PROVIDER_SETTINGS_MISSING;
        map6.put(c06, new a(enumC2754y57, enumC2754y57));
        Map<C0, a> map7 = this.o;
        C0 c07 = C0.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS;
        EnumC2754y5 enumC2754y58 = EnumC2754y5.TROUBLESHOOTING_NT_UNEXPECTED_INIT_SUCCESS;
        map7.put(c07, new a(enumC2754y58, enumC2754y58));
        Map<C0, a> map8 = this.o;
        C0 c08 = C0.TROUBLESHOOT_UNEXPECTED_INIT_FAILED;
        EnumC2754y5 enumC2754y59 = EnumC2754y5.TROUBLESHOOTING_NT_UNEXPECTED_INIT_FAILED;
        map8.put(c08, new a(enumC2754y59, enumC2754y59));
        Map<C0, a> map9 = this.o;
        C0 c09 = C0.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS;
        EnumC2754y5 enumC2754y510 = EnumC2754y5.TROUBLESHOOTING_NT_UNEXPECTED_AUCTION_SUCCESS;
        map9.put(c09, new a(enumC2754y510, enumC2754y510));
        Map<C0, a> map10 = this.o;
        C0 c010 = C0.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED;
        EnumC2754y5 enumC2754y511 = EnumC2754y5.TROUBLESHOOTING_NT_UNEXPECTED_AUCTION_FAILED;
        map10.put(c010, new a(enumC2754y511, enumC2754y511));
        Map<C0, a> map11 = this.o;
        C0 c011 = C0.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS;
        EnumC2754y5 enumC2754y512 = EnumC2754y5.TROUBLESHOOTING_NT_UNEXPECTED_LOAD_SUCCESS;
        map11.put(c011, new a(enumC2754y512, enumC2754y512));
        Map<C0, a> map12 = this.o;
        C0 c012 = C0.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED;
        EnumC2754y5 enumC2754y513 = EnumC2754y5.TROUBLESHOOTING_NT_UNEXPECTED_LOAD_FAILED;
        map12.put(c012, new a(enumC2754y513, enumC2754y513));
        Map<C0, a> map13 = this.o;
        C0 c013 = C0.TROUBLESHOOT_UNEXPECTED_TIMEOUT;
        EnumC2754y5 enumC2754y514 = EnumC2754y5.TROUBLESHOOTING_NT_UNEXPECTED_TIMEOUT;
        map13.put(c013, new a(enumC2754y514, enumC2754y514));
        Map<C0, a> map14 = this.o;
        C0 c014 = C0.TROUBLESHOOT_UNEXPECTED_OPENED;
        EnumC2754y5 enumC2754y515 = EnumC2754y5.TROUBLESHOOTING_NT_UNEXPECTED_OPENED;
        map14.put(c014, new a(enumC2754y515, enumC2754y515));
        Map<C0, a> map15 = this.o;
        C0 c015 = C0.TROUBLESHOOT_INTERNAL_ERROR;
        EnumC2754y5 enumC2754y516 = EnumC2754y5.TROUBLESHOOTING_NT_INTERNAL_ERROR;
        map15.put(c015, new a(enumC2754y516, enumC2754y516));
        Map<C0, a> map16 = this.o;
        C0 c016 = C0.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        EnumC2754y5 enumC2754y517 = EnumC2754y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        map16.put(c016, new a(enumC2754y517, enumC2754y517));
        Map<C0, a> map17 = this.o;
        C0 c017 = C0.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        EnumC2754y5 enumC2754y518 = EnumC2754y5.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        map17.put(c017, new a(enumC2754y518, enumC2754y518));
        this.o.put(C0.TROUBLESHOOT_NOTIFICATION_ERROR, new a(EnumC2754y5.TROUBLESHOOTING_NT_NOTIFICATIONS_ERROR, null));
    }

    void b() {
        c();
        e();
        a();
        d();
    }

    void c() {
        HashMap hashMap = new HashMap();
        this.l = hashMap;
        hashMap.put(C0.INIT_STARTED, new a(EnumC2754y5.IS_MANAGER_INIT_STARTED, null));
        this.l.put(C0.INIT_ENDED, new a(EnumC2754y5.IS_MANAGER_INIT_ENDED, null));
        this.l.put(C0.SESSION_CAPPED, new a(null, EnumC2754y5.IS_CAP_SESSION));
        this.l.put(C0.PLACEMENT_CAPPED, new a(EnumC2754y5.IS_CAP_PLACEMENT, null));
        this.l.put(C0.CHECK_PLACEMENT_CAPPED, new a(EnumC2754y5.IS_CHECK_PLACEMENT_CAPPED, null));
        this.l.put(C0.AUCTION_REQUEST, new a(EnumC2754y5.IS_AUCTION_REQUEST, null));
        this.l.put(C0.AUCTION_SUCCESS, new a(EnumC2754y5.IS_AUCTION_SUCCESS, null));
        Map<C0, a> map = this.l;
        C0 c0 = C0.AUCTION_FAILED;
        EnumC2754y5 enumC2754y5 = EnumC2754y5.IS_AUCTION_FAILED;
        map.put(c0, new a(enumC2754y5, null));
        this.l.put(C0.AUCTION_FAILED_NO_CANDIDATES, new a(enumC2754y5, null));
        this.l.put(C0.AUCTION_REQUEST_WATERFALL, new a(EnumC2754y5.IS_AUCTION_REQUEST_WATERFALL, null));
        this.l.put(C0.AUCTION_RESULT_WATERFALL, new a(EnumC2754y5.IS_RESULT_WATERFALL, null));
        this.l.put(C0.INIT_SUCCESS, new a(null, null));
        this.l.put(C0.INIT_FAILED, new a(null, null));
        this.l.put(C0.AD_OPENED, new a(null, EnumC2754y5.IS_INSTANCE_OPENED));
        this.l.put(C0.AD_CLOSED, new a(EnumC2754y5.IS_CALLBACK_AD_CLOSED, EnumC2754y5.IS_INSTANCE_CLOSED));
        this.l.put(C0.AD_CLICKED, new a(EnumC2754y5.IS_CALLBACK_AD_CLICKED, EnumC2754y5.IS_INSTANCE_CLICKED));
        this.l.put(C0.AD_INFO_CHANGED, new a(EnumC2754y5.IS_CALLBACK_AD_INFO_CHANGED, null));
        this.l.put(C0.LOAD_AD, new a(EnumC2754y5.IS_LOAD_CALLED, EnumC2754y5.IS_INSTANCE_LOAD));
        this.l.put(C0.LOAD_AD_SUCCESS, new a(EnumC2754y5.IS_CALLBACK_LOAD_SUCCESS, EnumC2754y5.IS_INSTANCE_LOAD_SUCCESS));
        this.l.put(C0.LOAD_AD_FAILED_WITH_REASON, new a(EnumC2754y5.IS_CALLBACK_LOAD_ERROR, EnumC2754y5.IS_INSTANCE_LOAD_FAILED));
        this.l.put(C0.LOAD_AD_NO_FILL, new a(null, EnumC2754y5.IS_INSTANCE_LOAD_NO_FILL));
        this.l.put(C0.SHOW_AD, new a(EnumC2754y5.IS_SHOW_CALLED, EnumC2754y5.IS_INSTANCE_SHOW));
        this.l.put(C0.SHOW_AD_FAILED, new a(EnumC2754y5.IS_CALLBACK_AD_SHOW_ERROR, EnumC2754y5.IS_INSTANCE_SHOW_FAILED));
        this.l.put(C0.AD_FORMAT_CAPPED, new a(EnumC2754y5.IS_AD_FORMAT_CAPPED, null));
        this.l.put(C0.AD_UNIT_CAPPED, new a(EnumC2754y5.IS_AD_UNIT_CAPPED, null));
        this.l.put(C0.COLLECT_TOKEN, new a(EnumC2754y5.IS_COLLECT_TOKENS, null));
        this.l.put(C0.COLLECT_TOKENS_COMPLETED, new a(EnumC2754y5.IS_COLLECT_TOKENS_COMPLETED, null));
        this.l.put(C0.COLLECT_TOKENS_FAILED, new a(EnumC2754y5.IS_COLLECT_TOKENS_FAILED, null));
        this.l.put(C0.INSTANCE_COLLECT_TOKEN, new a(EnumC2754y5.IS_INSTANCE_COLLECT_TOKEN, null));
        this.l.put(C0.INSTANCE_COLLECT_TOKEN_SUCCESS, new a(EnumC2754y5.IS_INSTANCE_COLLECT_TOKEN_SUCCESS, null));
        this.l.put(C0.INSTANCE_COLLECT_TOKEN_FAILED, new a(EnumC2754y5.IS_INSTANCE_COLLECT_TOKEN_FAILED, null));
        this.l.put(C0.INSTANCE_COLLECT_TOKEN_TIMED_OUT, new a(EnumC2754y5.IS_INSTANCE_COLLECT_TOKEN_TIMED_OUT, null));
        this.l.put(C0.AD_READY_TRUE, new a(EnumC2754y5.IS_CHECK_READY_TRUE, null));
        this.l.put(C0.AD_READY_FALSE, new a(EnumC2754y5.IS_CHECK_READY_FALSE, null));
        this.l.put(C0.OPERATIONAL_LOAD_AD, new a(EnumC2754y5.IS_OPERATIONAL_LOAD_AD, null));
        this.l.put(C0.OPERATIONAL_LOAD_SUCCESS, new a(EnumC2754y5.IS_OPERATIONAL_LOAD_SUCCESS, null));
        this.l.put(C0.OPERATIONAL_LOAD_FAILED, new a(EnumC2754y5.IS_OPERATIONAL_LOAD_FAILED, null));
        this.l.put(C0.OPERATIONAL_SET_CONFIGURATIONS, new a(EnumC2754y5.IS_SET_CONFIGURATION, null));
        this.l.put(C0.PRELOAD_ADUNIT_INITIATED, new a(EnumC2754y5.IS_PRELOAD_ADUNIT_INITIATED, null));
        this.l.put(C0.PRELOAD_ADUNIT_FAILED, new a(EnumC2754y5.IS_PRELOAD_ADUNIT_FAILED, null));
        this.l.put(C0.PRELOAD_ADUNIT_LOAD_SUCCESS, new a(EnumC2754y5.IS_PRELOAD_ADUNIT_LOAD_SUCCESS, null));
        Map<C0, a> map2 = this.l;
        C0 c02 = C0.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING;
        EnumC2754y5 enumC2754y52 = EnumC2754y5.TROUBLESHOOTING_IS_PROVIDER_SETTINGS_MISSING;
        map2.put(c02, new a(enumC2754y52, enumC2754y52));
        Map<C0, a> map3 = this.l;
        C0 c03 = C0.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS;
        EnumC2754y5 enumC2754y53 = EnumC2754y5.TROUBLESHOOTING_IS_UNEXPECTED_INIT_SUCCESS;
        map3.put(c03, new a(enumC2754y53, enumC2754y53));
        Map<C0, a> map4 = this.l;
        C0 c04 = C0.TROUBLESHOOT_UNEXPECTED_INIT_FAILED;
        EnumC2754y5 enumC2754y54 = EnumC2754y5.TROUBLESHOOTING_IS_UNEXPECTED_INIT_FAILED;
        map4.put(c04, new a(enumC2754y54, enumC2754y54));
        Map<C0, a> map5 = this.l;
        C0 c05 = C0.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS;
        EnumC2754y5 enumC2754y55 = EnumC2754y5.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_SUCCESS;
        map5.put(c05, new a(enumC2754y55, enumC2754y55));
        Map<C0, a> map6 = this.l;
        C0 c06 = C0.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED;
        EnumC2754y5 enumC2754y56 = EnumC2754y5.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_FAILED;
        map6.put(c06, new a(enumC2754y56, enumC2754y56));
        Map<C0, a> map7 = this.l;
        C0 c07 = C0.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS;
        EnumC2754y5 enumC2754y57 = EnumC2754y5.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_SUCCESS;
        map7.put(c07, new a(enumC2754y57, enumC2754y57));
        Map<C0, a> map8 = this.l;
        C0 c08 = C0.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED;
        EnumC2754y5 enumC2754y58 = EnumC2754y5.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_FAILED;
        map8.put(c08, new a(enumC2754y58, enumC2754y58));
        Map<C0, a> map9 = this.l;
        C0 c09 = C0.TROUBLESHOOT_UNEXPECTED_SHOW_FAILED;
        EnumC2754y5 enumC2754y59 = EnumC2754y5.TROUBLESHOOTING_IS_UNEXPECTED_SHOW_FAILED;
        map9.put(c09, new a(enumC2754y59, enumC2754y59));
        Map<C0, a> map10 = this.l;
        C0 c010 = C0.TROUBLESHOOT_UNEXPECTED_CLOSED;
        EnumC2754y5 enumC2754y510 = EnumC2754y5.TROUBLESHOOTING_IS_UNEXPECTED_CLOSED;
        map10.put(c010, new a(enumC2754y510, enumC2754y510));
        Map<C0, a> map11 = this.l;
        C0 c011 = C0.TROUBLESHOOT_UNEXPECTED_TIMEOUT;
        EnumC2754y5 enumC2754y511 = EnumC2754y5.TROUBLESHOOTING_IS_UNEXPECTED_TIMEOUT;
        map11.put(c011, new a(enumC2754y511, enumC2754y511));
        Map<C0, a> map12 = this.l;
        C0 c012 = C0.TROUBLESHOOT_INTERNAL_ERROR;
        EnumC2754y5 enumC2754y512 = EnumC2754y5.TROUBLESHOOTING_IS_INTERNAL_ERROR;
        map12.put(c012, new a(enumC2754y512, enumC2754y512));
        Map<C0, a> map13 = this.l;
        C0 c013 = C0.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        EnumC2754y5 enumC2754y513 = EnumC2754y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        map13.put(c013, new a(enumC2754y513, enumC2754y513));
        Map<C0, a> map14 = this.l;
        C0 c014 = C0.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        EnumC2754y5 enumC2754y514 = EnumC2754y5.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        map14.put(c014, new a(enumC2754y514, enumC2754y514));
        this.l.put(C0.TROUBLESHOOT_NOTIFICATION_ERROR, new a(EnumC2754y5.TROUBLESHOOTING_IS_NOTIFICATIONS_ERROR, null));
        Map<C0, a> map15 = this.l;
        C0 c015 = C0.TROUBLESHOOT_AD_EXPIRED;
        EnumC2754y5 enumC2754y515 = EnumC2754y5.TROUBLESHOOTING_IS_AD_EXPIRED;
        map15.put(c015, new a(enumC2754y515, enumC2754y515));
        this.l.put(C0.TROUBLESHOOT_LOAD, new a(EnumC2754y5.TROUBLESHOOTING_IS_LOAD, null));
        this.l.put(C0.TROUBLESHOOT_LOAD_WHILE_LOADED, new a(EnumC2754y5.TROUBLESHOOTING_IS_LOAD_WHILE_LOADED, null));
        this.l.put(C0.TROUBLESHOOT_LOAD_SUCCESS, new a(EnumC2754y5.TROUBLESHOOTING_IS_LOAD_SUCCESS, null));
        this.l.put(C0.TROUBLESHOOT_LOAD_FAILED, new a(EnumC2754y5.TROUBLESHOOTING_IS_LOAD_FAILED, null));
        this.l.put(C0.TROUBLESHOOT_SHOW, new a(EnumC2754y5.TROUBLESHOOTING_IS_SHOW, null));
        this.l.put(C0.TROUBLESHOOT_SHOW_SUCCESS, new a(EnumC2754y5.TROUBLESHOOTING_IS_SHOW_SUCCESS, null));
        this.l.put(C0.TROUBLESHOOT_SHOW_FAILED, new a(EnumC2754y5.TROUBLESHOOTING_IS_SHOW_FAILED, null));
        Map<C0, a> map16 = this.l;
        C0 c016 = C0.TROUBLESHOOT_ILLEGAL_STATE;
        EnumC2754y5 enumC2754y516 = EnumC2754y5.TROUBLESHOOTING_IS_ILLEGAL_STATE;
        map16.put(c016, new a(enumC2754y516, enumC2754y516));
        this.l.put(C0.TROUBLESHOOT_AD_INFO_CHANGED, new a(EnumC2754y5.TROUBLESHOOT_IS_AD_INFO_CHANGED, null));
        this.l.put(C0.TROUBLESHOOT_DESTROY_INSTANCES_READY_TO_SHOW, new a(EnumC2754y5.TROUBLESHOOTING_IS_DESTROY_READY_TO_SHOW_INSTANCES, null));
        this.l.put(C0.TROUBLESHOOT_ILR_REVENUE, new a(EnumC2754y5.TROUBLESHOOTING_IS_ILR_REVENUE, null));
        this.l.put(C0.TROUBLESHOOT_SHOW_RECOVERY_INITIATED, new a(EnumC2754y5.TROUBLESHOOT_IS_SHOW_RECOVERY_INITIATED, null));
    }

    void e() {
        HashMap hashMap = new HashMap();
        this.m = hashMap;
        hashMap.put(C0.INIT_STARTED, new a(EnumC2754y5.RV_MANAGER_INIT_STARTED, null));
        this.m.put(C0.INIT_ENDED, new a(EnumC2754y5.RV_MANAGER_INIT_ENDED, null));
        this.m.put(C0.SESSION_CAPPED, new a(null, EnumC2754y5.RV_CAP_SESSION));
        this.m.put(C0.PLACEMENT_CAPPED, new a(EnumC2754y5.RV_CAP_PLACEMENT, null));
        this.m.put(C0.CHECK_PLACEMENT_CAPPED, new a(EnumC2754y5.RV_CHECK_PLACEMENT_CAPPED, null));
        this.m.put(C0.AUCTION_REQUEST, new a(EnumC2754y5.RV_AUCTION_REQUEST, null));
        this.m.put(C0.AUCTION_SUCCESS, new a(EnumC2754y5.RV_AUCTION_SUCCESS, null));
        Map<C0, a> map = this.m;
        C0 c0 = C0.AUCTION_FAILED;
        EnumC2754y5 enumC2754y5 = EnumC2754y5.RV_AUCTION_FAILED;
        map.put(c0, new a(enumC2754y5, null));
        this.m.put(C0.AUCTION_FAILED_NO_CANDIDATES, new a(enumC2754y5, null));
        this.m.put(C0.AUCTION_REQUEST_WATERFALL, new a(EnumC2754y5.RV_AUCTION_REQUEST_WATERFALL, null));
        this.m.put(C0.AUCTION_RESULT_WATERFALL, new a(EnumC2754y5.RV_AUCTION_RESPONSE_WATERFALL, null));
        this.m.put(C0.INIT_SUCCESS, new a(null, null));
        this.m.put(C0.INIT_FAILED, new a(null, null));
        this.m.put(C0.AD_VISIBLE, new a(null, EnumC2754y5.RV_INSTANCE_VISIBLE));
        this.m.put(C0.AD_OPENED, new a(null, EnumC2754y5.RV_BUSINESS_INSTANCE_OPENED));
        this.m.put(C0.AD_CLOSED, new a(null, EnumC2754y5.RV_INSTANCE_CLOSED));
        this.m.put(C0.AD_STARTED, new a(null, EnumC2754y5.RV_INSTANCE_STARTED));
        this.m.put(C0.AD_ENDED, new a(null, EnumC2754y5.RV_INSTANCE_ENDED));
        this.m.put(C0.AD_CLICKED, new a(EnumC2754y5.RV_CALLBACK_AD_CLICKED, EnumC2754y5.RV_BUSINESS_INSTANCE_CLICKED));
        this.m.put(C0.AD_INFO_CHANGED, new a(EnumC2754y5.RV_CALLBACK_AD_INFO_CHANGED, null));
        this.m.put(C0.AD_REWARDED, new a(null, EnumC2754y5.RV_BUSINESS_INSTANCE_REWARDED));
        this.m.put(C0.AD_AVAILABILITY_CHANGED_TRUE, new a(EnumC2754y5.RV_CALLBACK_AVAILABILITY_TRUE, EnumC2754y5.RV_INSTANCE_AVAILABILITY_TRUE));
        this.m.put(C0.AD_AVAILABILITY_CHANGED_FALSE, new a(EnumC2754y5.RV_CALLBACK_AVAILABILITY_FALSE, EnumC2754y5.RV_INSTANCE_AVAILABILITY_FALSE));
        this.m.put(C0.LOAD_AD, new a(EnumC2754y5.RV_BUSINESS_MEDIATION_LOAD, EnumC2754y5.RV_BUSINESS_INSTANCE_LOAD));
        this.m.put(C0.LOAD_AD_SUCCESS, new a(EnumC2754y5.RV_BUSINESS_MEDIATION_LOAD_SUCCESS, EnumC2754y5.RV_BUSINESS_INSTANCE_LOAD_SUCCESS));
        this.m.put(C0.LOAD_AD_FAILED, new a(null, EnumC2754y5.RV_INSTANCE_LOAD_FAILED));
        this.m.put(C0.LOAD_AD_FAILED_WITH_REASON, new a(EnumC2754y5.RV_MEDIATION_LOAD_ERROR, EnumC2754y5.RV_INSTANCE_LOAD_FAILED_REASON));
        this.m.put(C0.LOAD_AD_NO_FILL, new a(null, EnumC2754y5.RV_INSTANCE_LOAD_NO_FILL));
        this.m.put(C0.SHOW_AD, new a(EnumC2754y5.RV_API_SHOW_CALLED, EnumC2754y5.RV_INSTANCE_SHOW));
        this.m.put(C0.SHOW_AD_CHANCE, new a(null, EnumC2754y5.RV_INSTANCE_SHOW_CHANCE));
        this.m.put(C0.SHOW_AD_FAILED, new a(EnumC2754y5.RV_CALLBACK_SHOW_FAILED, EnumC2754y5.RV_INSTANCE_SHOW_FAILED));
        this.m.put(C0.AD_FORMAT_CAPPED, new a(EnumC2754y5.RV_AD_UNIT_CAPPED, null));
        this.m.put(C0.COLLECT_TOKEN, new a(EnumC2754y5.RV_COLLECT_TOKENS, null));
        this.m.put(C0.COLLECT_TOKENS_COMPLETED, new a(EnumC2754y5.RV_COLLECT_TOKENS_COMPLETED, null));
        this.m.put(C0.COLLECT_TOKENS_FAILED, new a(EnumC2754y5.RV_COLLECT_TOKENS_FAILED, null));
        this.m.put(C0.INSTANCE_COLLECT_TOKEN, new a(EnumC2754y5.RV_INSTANCE_COLLECT_TOKEN, null));
        Map<C0, a> map2 = this.m;
        C0 c02 = C0.INSTANCE_COLLECT_TOKEN_SUCCESS;
        EnumC2754y5 enumC2754y52 = EnumC2754y5.RV_INSTANCE_COLLECT_TOKEN_SUCCESS;
        map2.put(c02, new a(enumC2754y52, enumC2754y52));
        Map<C0, a> map3 = this.m;
        C0 c03 = C0.INSTANCE_COLLECT_TOKEN_FAILED;
        EnumC2754y5 enumC2754y53 = EnumC2754y5.RV_INSTANCE_COLLECT_TOKEN_FAILED;
        map3.put(c03, new a(enumC2754y53, enumC2754y53));
        Map<C0, a> map4 = this.m;
        C0 c04 = C0.INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        EnumC2754y5 enumC2754y54 = EnumC2754y5.RV_INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        map4.put(c04, new a(enumC2754y54, enumC2754y54));
        this.m.put(C0.AD_READY_TRUE, new a(EnumC2754y5.RV_CHECK_READY_TRUE, null));
        this.m.put(C0.AD_READY_FALSE, new a(EnumC2754y5.RV_CHECK_READY_FALSE, null));
        this.m.put(C0.OPERATIONAL_LOAD_AD, new a(EnumC2754y5.RV_OPERATIONAL_LOAD_AD, null));
        this.m.put(C0.OPERATIONAL_LOAD_SUCCESS, new a(EnumC2754y5.RV_OPERATIONAL_LOAD_SUCCESS, null));
        this.m.put(C0.OPERATIONAL_LOAD_FAILED, new a(EnumC2754y5.RV_OPERATIONAL_LOAD_FAILED, null));
        this.m.put(C0.OPERATIONAL_SET_CONFIGURATIONS, new a(EnumC2754y5.RV_SET_CONFIGURATION, null));
        this.m.put(C0.OPERATIONAL_GET_REWARD, new a(EnumC2754y5.RV_OPERATIONAL_GET_REWARD, null));
        this.m.put(C0.PRELOAD_ADUNIT_INITIATED, new a(EnumC2754y5.RV_PRELOAD_ADUNIT_INITIATED, null));
        this.m.put(C0.PRELOAD_ADUNIT_FAILED, new a(EnumC2754y5.RV_PRELOAD_ADUNIT_FAILED, null));
        this.m.put(C0.PRELOAD_ADUNIT_LOAD_SUCCESS, new a(EnumC2754y5.RV_PRELOAD_ADUNIT_LOAD_SUCCESS, null));
        Map<C0, a> map5 = this.m;
        C0 c05 = C0.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING;
        EnumC2754y5 enumC2754y55 = EnumC2754y5.TROUBLESHOOTING_RV_PROVIDER_SETTINGS_MISSING;
        map5.put(c05, new a(enumC2754y55, enumC2754y55));
        Map<C0, a> map6 = this.m;
        C0 c06 = C0.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS;
        EnumC2754y5 enumC2754y56 = EnumC2754y5.TROUBLESHOOTING_RV_UNEXPECTED_INIT_SUCCESS;
        map6.put(c06, new a(enumC2754y56, enumC2754y56));
        Map<C0, a> map7 = this.m;
        C0 c07 = C0.TROUBLESHOOT_UNEXPECTED_INIT_FAILED;
        EnumC2754y5 enumC2754y57 = EnumC2754y5.TROUBLESHOOTING_RV_UNEXPECTED_INIT_FAILED;
        map7.put(c07, new a(enumC2754y57, enumC2754y57));
        Map<C0, a> map8 = this.m;
        C0 c08 = C0.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS;
        EnumC2754y5 enumC2754y58 = EnumC2754y5.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_SUCCESS;
        map8.put(c08, new a(enumC2754y58, enumC2754y58));
        Map<C0, a> map9 = this.m;
        C0 c09 = C0.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED;
        EnumC2754y5 enumC2754y59 = EnumC2754y5.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_FAILED;
        map9.put(c09, new a(enumC2754y59, enumC2754y59));
        Map<C0, a> map10 = this.m;
        C0 c010 = C0.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS;
        EnumC2754y5 enumC2754y510 = EnumC2754y5.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_SUCCESS;
        map10.put(c010, new a(enumC2754y510, enumC2754y510));
        Map<C0, a> map11 = this.m;
        C0 c011 = C0.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED;
        EnumC2754y5 enumC2754y511 = EnumC2754y5.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_FAILED;
        map11.put(c011, new a(enumC2754y511, enumC2754y511));
        Map<C0, a> map12 = this.m;
        C0 c012 = C0.TROUBLESHOOT_UNEXPECTED_SHOW_FAILED;
        EnumC2754y5 enumC2754y512 = EnumC2754y5.TROUBLESHOOTING_RV_UNEXPECTED_SHOW_FAILED;
        map12.put(c012, new a(enumC2754y512, enumC2754y512));
        Map<C0, a> map13 = this.m;
        C0 c013 = C0.TROUBLESHOOT_UNEXPECTED_TIMEOUT;
        EnumC2754y5 enumC2754y513 = EnumC2754y5.TROUBLESHOOTING_RV_UNEXPECTED_TIMEOUT;
        map13.put(c013, new a(enumC2754y513, enumC2754y513));
        Map<C0, a> map14 = this.m;
        C0 c014 = C0.TROUBLESHOOT_UNEXPECTED_CLOSED;
        EnumC2754y5 enumC2754y514 = EnumC2754y5.TROUBLESHOOTING_RV_UNEXPECTED_CLOSED;
        map14.put(c014, new a(enumC2754y514, enumC2754y514));
        Map<C0, a> map15 = this.m;
        C0 c015 = C0.TROUBLESHOOT_LOAD_FAILED;
        EnumC2754y5 enumC2754y515 = EnumC2754y5.TROUBLESHOOTING_RV_LOAD_FAILED;
        map15.put(c015, new a(enumC2754y515, enumC2754y515));
        Map<C0, a> map16 = this.m;
        C0 c016 = C0.TROUBLESHOOT_INTERNAL_ERROR;
        EnumC2754y5 enumC2754y516 = EnumC2754y5.TROUBLESHOOTING_RV_INTERNAL_ERROR;
        map16.put(c016, new a(enumC2754y516, enumC2754y516));
        Map<C0, a> map17 = this.m;
        C0 c017 = C0.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        EnumC2754y5 enumC2754y517 = EnumC2754y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        map17.put(c017, new a(enumC2754y517, enumC2754y517));
        Map<C0, a> map18 = this.m;
        C0 c018 = C0.TROUBLESHOOT_WATERFALL_OVERHEAD;
        EnumC2754y5 enumC2754y518 = EnumC2754y5.TROUBLESHOOTING_RV_WATERFALL_OVERHEAD;
        map18.put(c018, new a(enumC2754y518, enumC2754y518));
        this.m.put(C0.TROUBLESHOOT_NOTIFICATION_ERROR, new a(EnumC2754y5.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, null));
        Map<C0, a> map19 = this.m;
        C0 c019 = C0.TROUBLESHOOT_AD_EXPIRED;
        EnumC2754y5 enumC2754y519 = EnumC2754y5.TROUBLESHOOTING_RV_AD_EXPIRED;
        map19.put(c019, new a(enumC2754y519, enumC2754y519));
        this.m.put(C0.TROUBLESHOOT_LOAD, new a(EnumC2754y5.TROUBLESHOOTING_RV_LOAD, null));
        this.m.put(C0.TROUBLESHOOT_LOAD_WHILE_LOADED, new a(EnumC2754y5.TROUBLESHOOTING_RV_LOAD_WHILE_LOADED, null));
        this.m.put(C0.TROUBLESHOOT_LOAD_SUCCESS, new a(EnumC2754y5.TROUBLESHOOTING_RV_LOAD_SUCCESS, null));
        this.m.put(C0.TROUBLESHOOT_SHOW, new a(EnumC2754y5.TROUBLESHOOTING_RV_SHOW, null));
        this.m.put(C0.TROUBLESHOOT_SHOW_SUCCESS, new a(EnumC2754y5.TROUBLESHOOTING_RV_SHOW_SUCCESS, null));
        this.m.put(C0.TROUBLESHOOT_SHOW_FAILED, new a(EnumC2754y5.TROUBLESHOOTING_RV_SHOW_FAILED, null));
        Map<C0, a> map20 = this.m;
        C0 c020 = C0.TROUBLESHOOT_ILLEGAL_STATE;
        EnumC2754y5 enumC2754y520 = EnumC2754y5.TROUBLESHOOTING_RV_ILLEGAL_STATE;
        map20.put(c020, new a(enumC2754y520, enumC2754y520));
        this.m.put(C0.TROUBLESHOOT_AD_INFO_CHANGED, new a(EnumC2754y5.TROUBLESHOOT_RV_AD_INFO_CHANGED, null));
        this.m.put(C0.TROUBLESHOOT_DESTROY_INSTANCES_READY_TO_SHOW, new a(EnumC2754y5.TROUBLESHOOTING_RV_DESTROY_READY_TO_SHOW_INSTANCES, null));
        this.m.put(C0.TROUBLESHOOT_ILR_REVENUE, new a(EnumC2754y5.TROUBLESHOOTING_RV_ILR_REVENUE, null));
        this.m.put(C0.TROUBLESHOOT_SHOW_RECOVERY_INITIATED, new a(EnumC2754y5.TROUBLESHOOT_RV_SHOW_RECOVERY_INITIATED, null));
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

    public F0(IronSource.a aVar, b bVar, E0 e0, AbstractC2519l3 abstractC2519l3) {
        this.a = aVar;
        this.b = bVar;
        this.c = e0;
        this.d = abstractC2519l3 == null ? a(aVar) : abstractC2519l3;
        b();
        this.e = new W8(this);
        this.f = new C2760yb(this);
        this.g = new C2443gg(this);
        this.h = new T1(this);
        this.i = new O(this);
        this.j = new C2514kg(this);
        this.k = new Sc(this);
    }

    protected void a(C0 c0, Map<String, Object> map) {
        a(c0, map, Calendar.getInstance().getTimeInMillis());
    }

    public void a(C0 c0, Map<String, Object> map, long j) {
        int a2 = a(c0);
        if (-1 == a2) {
            return;
        }
        HashMap hashMap = new HashMap();
        E0 e0 = this.c;
        if (e0 != null) {
            hashMap.putAll(e0.a(c0));
        }
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        this.d.a(new C2736x5(a2, j, new JSONObject(hashMap)));
    }

    private int a(C0 c0) {
        try {
            if (IronSource.a.INTERSTITIAL.equals(this.a) && this.l.containsKey(c0)) {
                return this.l.get(c0).a(this.b);
            }
            if (IronSource.a.REWARDED_VIDEO.equals(this.a) && this.m.containsKey(c0)) {
                return this.m.get(c0).a(this.b);
            }
            if (IronSource.a.BANNER.equals(this.a) && this.n.containsKey(c0)) {
                return this.n.get(c0).a(this.b);
            }
            if (IronSource.a.NATIVE_AD.equals(this.a) && this.o.containsKey(c0)) {
                return this.o.get(c0).a(this.b);
            }
            return -1;
        } catch (Exception e) {
            C2556n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return -1;
        }
    }

    void a() {
        HashMap hashMap = new HashMap();
        this.n = hashMap;
        hashMap.put(C0.INIT_STARTED, new a(EnumC2754y5.BN_MANAGER_INIT_STARTED, null));
        this.n.put(C0.INIT_ENDED, new a(EnumC2754y5.BN_MANAGER_INIT_ENDED, null));
        this.n.put(C0.PLACEMENT_CAPPED, new a(EnumC2754y5.BN_PLACEMENT_CAPPED, null));
        this.n.put(C0.AUCTION_REQUEST, new a(EnumC2754y5.BN_AUCTION_REQUEST, null));
        this.n.put(C0.AUCTION_SUCCESS, new a(EnumC2754y5.BN_AUCTION_SUCCESS, null));
        Map<C0, a> map = this.n;
        C0 c0 = C0.AUCTION_FAILED;
        EnumC2754y5 enumC2754y5 = EnumC2754y5.BN_AUCTION_FAILED;
        map.put(c0, new a(enumC2754y5, null));
        this.n.put(C0.AUCTION_FAILED_NO_CANDIDATES, new a(enumC2754y5, null));
        this.n.put(C0.AUCTION_REQUEST_WATERFALL, new a(EnumC2754y5.BN_AUCTION_REQUEST_WATERFALL, null));
        this.n.put(C0.AUCTION_RESULT_WATERFALL, new a(EnumC2754y5.BN_AUCTION_RESPONSE_WATERFALL, null));
        this.n.put(C0.INIT_SUCCESS, new a(null, null));
        this.n.put(C0.INIT_FAILED, new a(null, null));
        this.n.put(C0.AD_OPENED, new a(EnumC2754y5.BN_CALLBACK_SHOW, EnumC2754y5.BN_INSTANCE_SHOW));
        this.n.put(C0.SHOW_AD_FAILED, new a(EnumC2754y5.BN_CALLBACK_SHOW_FAILED, EnumC2754y5.BN_INSTANCE_SHOW_FAILED));
        this.n.put(C0.AD_CLICKED, new a(EnumC2754y5.BN_CALLBACK_CLICK, EnumC2754y5.BN_INSTANCE_CLICK));
        this.n.put(C0.LOAD_AD, new a(EnumC2754y5.BN_LOAD, EnumC2754y5.BN_INSTANCE_LOAD));
        this.n.put(C0.RELOAD_AD, new a(EnumC2754y5.BN_RELOAD, EnumC2754y5.BN_INSTANCE_RELOAD));
        this.n.put(C0.LOAD_AD_SUCCESS, new a(EnumC2754y5.BN_CALLBACK_LOAD_SUCCESS, EnumC2754y5.BN_INSTANCE_LOAD_SUCCESS));
        this.n.put(C0.RELOAD_AD_SUCCESS, new a(EnumC2754y5.BN_CALLBACK_RELOAD_SUCCESS, EnumC2754y5.BN_INSTANCE_RELOAD_SUCCESS));
        this.n.put(C0.LOAD_AD_FAILED_WITH_REASON, new a(EnumC2754y5.BN_CALLBACK_LOAD_ERROR, EnumC2754y5.BN_INSTANCE_LOAD_ERROR));
        this.n.put(C0.RELOAD_AD_FAILED_WITH_REASON, new a(EnumC2754y5.BN_CALLBACK_RELOAD_ERROR, EnumC2754y5.BN_INSTANCE_RELOAD_ERROR));
        this.n.put(C0.LOAD_AD_NO_FILL, new a(null, EnumC2754y5.BN_INSTANCE_LOAD_NO_FILL));
        this.n.put(C0.RELOAD_AD_NO_FILL, new a(null, EnumC2754y5.BN_INSTANCE_RELOAD_NO_FILL));
        this.n.put(C0.AD_FORMAT_CAPPED, new a(EnumC2754y5.BN_AD_UNIT_CAPPED, null));
        this.n.put(C0.COLLECT_TOKEN, new a(EnumC2754y5.BN_COLLECT_TOKENS, null));
        this.n.put(C0.COLLECT_TOKENS_COMPLETED, new a(EnumC2754y5.BN_COLLECT_TOKENS_COMPLETED, null));
        this.n.put(C0.COLLECT_TOKENS_FAILED, new a(EnumC2754y5.BN_COLLECT_TOKENS_FAILED, null));
        this.n.put(C0.INSTANCE_COLLECT_TOKEN, new a(EnumC2754y5.BN_INSTANCE_COLLECT_TOKEN, null));
        Map<C0, a> map2 = this.n;
        C0 c02 = C0.INSTANCE_COLLECT_TOKEN_SUCCESS;
        EnumC2754y5 enumC2754y52 = EnumC2754y5.BN_INSTANCE_COLLECT_TOKEN_SUCCESS;
        map2.put(c02, new a(enumC2754y52, enumC2754y52));
        Map<C0, a> map3 = this.n;
        C0 c03 = C0.INSTANCE_COLLECT_TOKEN_FAILED;
        EnumC2754y5 enumC2754y53 = EnumC2754y5.BN_INSTANCE_COLLECT_TOKEN_FAILED;
        map3.put(c03, new a(enumC2754y53, enumC2754y53));
        Map<C0, a> map4 = this.n;
        C0 c04 = C0.INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        EnumC2754y5 enumC2754y54 = EnumC2754y5.BN_INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        map4.put(c04, new a(enumC2754y54, enumC2754y54));
        this.n.put(C0.DESTROY_AD, new a(EnumC2754y5.BN_DESTROY, EnumC2754y5.BN_INSTANCE_DESTROY));
        this.n.put(C0.SKIP_RELOAD_AD, new a(EnumC2754y5.BN_SKIP_RELOAD, null));
        this.n.put(C0.AD_LEFT_APPLICATION, new a(EnumC2754y5.BN_CALLBACK_LEAVE_APP, EnumC2754y5.BN_INSTANCE_LEAVE_APP));
        this.n.put(C0.AD_PRESENT_SCREEN, new a(EnumC2754y5.BN_CALLBACK_PRESENT_SCREEN, EnumC2754y5.BN_INSTANCE_PRESENT_SCREEN));
        this.n.put(C0.AD_DISMISS_SCREEN, new a(EnumC2754y5.BN_CALLBACK_DISMISS_SCREEN, EnumC2754y5.BN_INSTANCE_DISMISS_SCREEN));
        this.n.put(C0.AD_VIEW_BOUND, new a(EnumC2754y5.BN_BOUND, EnumC2754y5.BN_INSTANCE_BOUND));
        this.n.put(C0.PAUSE_AD, new a(EnumC2754y5.BN_REFRESH_PAUSE, null));
        this.n.put(C0.RESUME_AD, new a(EnumC2754y5.BN_REFRESH_RESUME, null));
        this.n.put(C0.OPERATIONAL_SET_CONFIGURATIONS, new a(EnumC2754y5.BN_SET_CONFIGURATION, null));
        Map<C0, a> map5 = this.n;
        C0 c05 = C0.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING;
        EnumC2754y5 enumC2754y55 = EnumC2754y5.TROUBLESHOOTING_BN_PROVIDER_SETTINGS_MISSING;
        map5.put(c05, new a(enumC2754y55, enumC2754y55));
        Map<C0, a> map6 = this.n;
        C0 c06 = C0.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS;
        EnumC2754y5 enumC2754y56 = EnumC2754y5.TROUBLESHOOTING_BN_UNEXPECTED_INIT_SUCCESS;
        map6.put(c06, new a(enumC2754y56, enumC2754y56));
        Map<C0, a> map7 = this.n;
        C0 c07 = C0.TROUBLESHOOT_UNEXPECTED_INIT_FAILED;
        EnumC2754y5 enumC2754y57 = EnumC2754y5.TROUBLESHOOTING_BN_UNEXPECTED_INIT_FAILED;
        map7.put(c07, new a(enumC2754y57, enumC2754y57));
        Map<C0, a> map8 = this.n;
        C0 c08 = C0.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS;
        EnumC2754y5 enumC2754y58 = EnumC2754y5.TROUBLESHOOTING_BN_UNEXPECTED_AUCTION_SUCCESS;
        map8.put(c08, new a(enumC2754y58, enumC2754y58));
        Map<C0, a> map9 = this.n;
        C0 c09 = C0.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED;
        EnumC2754y5 enumC2754y59 = EnumC2754y5.TROUBLESHOOTING_BN_UNEXPECTED_AUCTION_FAILED;
        map9.put(c09, new a(enumC2754y59, enumC2754y59));
        Map<C0, a> map10 = this.n;
        C0 c010 = C0.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS;
        EnumC2754y5 enumC2754y510 = EnumC2754y5.TROUBLESHOOTING_BN_UNEXPECTED_LOAD_SUCCESS;
        map10.put(c010, new a(enumC2754y510, enumC2754y510));
        Map<C0, a> map11 = this.n;
        C0 c011 = C0.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED;
        EnumC2754y5 enumC2754y511 = EnumC2754y5.TROUBLESHOOTING_BN_UNEXPECTED_LOAD_FAILED;
        map11.put(c011, new a(enumC2754y511, enumC2754y511));
        Map<C0, a> map12 = this.n;
        C0 c012 = C0.TROUBLESHOOT_UNEXPECTED_RELOAD_SUCCESS;
        EnumC2754y5 enumC2754y512 = EnumC2754y5.TROUBLESHOOTING_BN_UNEXPECTED_RELOAD_SUCCESS;
        map12.put(c012, new a(enumC2754y512, enumC2754y512));
        Map<C0, a> map13 = this.n;
        C0 c013 = C0.TROUBLESHOOT_UNEXPECTED_RELOAD_FAILED;
        EnumC2754y5 enumC2754y513 = EnumC2754y5.TROUBLESHOOTING_BN_UNEXPECTED_RELOAD_FAILED;
        map13.put(c013, new a(enumC2754y513, enumC2754y513));
        Map<C0, a> map14 = this.n;
        C0 c014 = C0.TROUBLESHOOT_UNEXPECTED_TIMEOUT;
        EnumC2754y5 enumC2754y514 = EnumC2754y5.TROUBLESHOOTING_BN_UNEXPECTED_TIMEOUT;
        map14.put(c014, new a(enumC2754y514, enumC2754y514));
        Map<C0, a> map15 = this.n;
        C0 c015 = C0.TROUBLESHOOT_UNEXPECTED_OPENED;
        EnumC2754y5 enumC2754y515 = EnumC2754y5.TROUBLESHOOTING_BN_UNEXPECTED_OPENED;
        map15.put(c015, new a(enumC2754y515, enumC2754y515));
        Map<C0, a> map16 = this.n;
        C0 c016 = C0.TROUBLESHOOT_INTERNAL_ERROR;
        EnumC2754y5 enumC2754y516 = EnumC2754y5.TROUBLESHOOTING_BN_INTERNAL_ERROR;
        map16.put(c016, new a(enumC2754y516, enumC2754y516));
        Map<C0, a> map17 = this.n;
        C0 c017 = C0.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        EnumC2754y5 enumC2754y517 = EnumC2754y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        map17.put(c017, new a(enumC2754y517, enumC2754y517));
        Map<C0, a> map18 = this.n;
        C0 c018 = C0.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        EnumC2754y5 enumC2754y518 = EnumC2754y5.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        map18.put(c018, new a(enumC2754y518, enumC2754y518));
        this.n.put(C0.TROUBLESHOOT_NOTIFICATION_ERROR, new a(EnumC2754y5.TROUBLESHOOTING_BN_NOTIFICATIONS_ERROR, null));
        this.n.put(C0.TROUBLESHOOT_BN_RELOAD_EXCEPTION, new a(EnumC2754y5.TROUBLESHOOTING_BN_RELOAD_EXCEPTION, null));
        this.n.put(C0.TROUBLESHOOT_IMPRESSION_TIMEOUT, new a(EnumC2754y5.TROUBLESHOOTING_BN_IMPRESSION_TIMEOUT_REACHED, null));
        this.n.put(C0.TROUBLESHOOT_BANNER_REFRESH_TRIGGER_PAUSE, new a(EnumC2754y5.TROUBLESHOOT_BN_BANNER_REFRESH_TRIGGER_PAUSE, null));
        this.n.put(C0.TROUBLESHOOT_BANNER_REFRESH_TRIGGER_RESUME, new a(EnumC2754y5.TROUBLESHOOT_BN_BANNER_REFRESH_TRIGGER_RESUME, null));
        Map<C0, a> map19 = this.n;
        C0 c019 = C0.TROUBLESHOOT_BANNER_REFRESH_TRANSITION;
        EnumC2754y5 enumC2754y519 = EnumC2754y5.TROUBLESHOOT_BN_BANNER_REFRESH_TRANSITION;
        map19.put(c019, new a(enumC2754y519, enumC2754y519));
        Map<C0, a> map20 = this.n;
        C0 c020 = C0.TROUBLESHOOT_BANNER_REFRESH_ANIMATED;
        EnumC2754y5 enumC2754y520 = EnumC2754y5.TROUBLESHOOT_BN_BANNER_REFRESH_ANIMATED;
        map20.put(c020, new a(enumC2754y520, enumC2754y520));
        Map<C0, a> map21 = this.n;
        C0 c021 = C0.TROUBLESHOOT_ILLEGAL_STATE;
        EnumC2754y5 enumC2754y521 = EnumC2754y5.TROUBLESHOOTING_BN_ILLEGAL_STATE;
        map21.put(c021, new a(enumC2754y521, enumC2754y521));
        this.n.put(C0.TROUBLESHOOT_RELOAD, new a(EnumC2754y5.TROUBLESHOOTING_BN_RELOAD, null));
        Map<C0, a> map22 = this.n;
        C0 c022 = C0.TROUBLESHOOT_LOAD_SKIPPED;
        EnumC2754y5 enumC2754y522 = EnumC2754y5.TROUBLESHOOTING_BN_LOAD_SKIPPED;
        map22.put(c022, new a(enumC2754y522, enumC2754y522));
        this.n.put(C0.TROUBLESHOOT_ILR_REVENUE, new a(EnumC2754y5.TROUBLESHOOTING_BN_ILR_REVENUE, null));
    }
}
