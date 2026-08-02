package com.google.android.gms.auth;

import com.google.android.gms.common.Feature;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zze {
    public static final Feature a = new Feature("account_capability_api", 1);
    public static final Feature b;
    public static final Feature c;
    public static final Feature d;

    static {
        new Feature("account_data_service", 6L);
        new Feature("account_data_service_legacy", 1L);
        new Feature("account_data_service_token", 8L);
        new Feature("account_data_service_visibility", 1L);
        new Feature("config_sync", 1L);
        new Feature("device_account_api", 1L);
        new Feature("device_account_jwt_creation", 1L);
        new Feature("gaiaid_primary_email_api", 1L);
        new Feature("get_restricted_accounts_api", 1L);
        b = new Feature("google_auth_service_accounts", 2L);
        c = new Feature("google_auth_service_token", 3L);
        new Feature("hub_mode_api", 1L);
        d = new Feature("work_account_client_is_whitelisted", 1L);
        new Feature("factory_reset_protection_api", 1L);
        new Feature("google_auth_api", 1L);
    }
}
