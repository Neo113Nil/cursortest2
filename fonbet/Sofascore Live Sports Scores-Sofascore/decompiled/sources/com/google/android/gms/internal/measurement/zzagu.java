package com.google.android.gms.internal.measurement;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ironsource.Ua;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.unity3d.services.core.network.model.HttpRequest;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzagu implements zzagt {
    public static final zzpo a = new zzpo(zzagr.c, 81);

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long A() {
        return ((Long) a.b(74, 10L, "measurement.upload.max_realtime_events_per_day").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long B() {
        return ((Long) a.b(62, 7200000L, "measurement.redaction.app_instance_id.ttl").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long C() {
        return ((Long) a.b(79, 3600000L, "measurement.upload.window_interval").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final String D() {
        return (String) a.c(80, "measurement.rb.attribution.user_properties", "_npa,npa|_fot,fot").get();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final String E() {
        return (String) a.c(60, "measurement.rb.attribution.uri_scheme", HttpRequest.DEFAULT_SCHEME).get();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final String F() {
        return (String) a.c(78, "measurement.upload.url", "https://app-measurement.com/a").get();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long G() {
        return ((Long) a.b(67, 100L, "measurement.upload.max_bundles").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long H() {
        return ((Long) a.b(68, Ua.s, "measurement.upload.max_conversions_per_day").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long I() {
        return ((Long) a.b(65, 3600000L, "measurement.upload.interval").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long J() {
        return ((Long) a.b(66, 65536L, "measurement.upload.max_bundle_size").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long K() {
        return ((Long) a.b(69, 1000L, "measurement.upload.max_error_events_per_day").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long L() {
        return ((Long) a.b(70, 1000L, "measurement.upload.max_events_per_bundle").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final String M() {
        return (String) a.c(59, "measurement.rb.attribution.query_parameters_to_remove", "").get();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long N() {
        return ((Long) a.b(76, 6L, "measurement.upload.retry_count").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long a() {
        return ((Long) a.b(51, TTAdConstant.AD_MAX_EVENT_TIME, "measurement.sgtm.upload.retry_interval").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long b() {
        return ((Long) a.b(40, 240000L, "measurement.sgtm.batch.long_queuing_threshold").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long c() {
        return ((Long) a.b(61, 604800000L, "measurement.sdk.attribution.cache.ttl").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long d() {
        return ((Long) a.b(52, 21600000L, "measurement.sgtm.upload.retry_max_wait").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long e() {
        return ((Long) a.b(29, 86400000L, "measurement.monitoring.sample_period_millis").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long f() {
        return ((Long) a.b(63, 43200000L, "measurement.upload.backoff_period").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long g() {
        return ((Long) a.b(64, 15000L, "measurement.upload.initial_upload_delay_time").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final String h() {
        return (String) a.c(58, "measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion").get();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long i() {
        return ((Long) a.b(55, 90L, "measurement.rb.attribution.client.min_time_after_boot_seconds").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long j() {
        return ((Long) a.b(25, 0L, "measurement.rb.attribution.max_trigger_uris_queried_at_once").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long k() {
        return ((Long) a.b(75, 65536L, "measurement.upload.max_batch_size").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long l() {
        return ((Long) a.b(36, 5000L, "measurement.service_client.idle_disconnect_millis").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final String m() {
        return (String) a.c(44, "measurement.sgtm.service_upload_apps_list", "").get();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long n() {
        return ((Long) a.b(72, 50000L, "measurement.upload.max_public_events_per_day").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long o() {
        return ((Long) a.b(33, Ua.s, "measurement.upload.realtime_upload_interval").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long p() {
        return ((Long) a.b(48, TTAdConstant.AD_MAX_EVENT_TIME, "measurement.sgtm.upload.min_delay_after_background").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long q() {
        return ((Long) a.b(53, 86400000L, "measurement.upload.stale_data_deletion_interval").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long r() {
        return ((Long) a.b(77, 1800000L, "measurement.upload.retry_time").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long s() {
        return ((Long) a.b(50, 5000L, "measurement.sgtm.upload.min_delay_after_startup").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long t() {
        return ((Long) a.b(46, 5L, "measurement.sgtm.upload.batches_retrieval_limit").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long u() {
        return ((Long) a.b(54, 16L, "measurement.rb.attribution.max_retry_delay_seconds").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long v() {
        return ((Long) a.b(71, 100000L, "measurement.upload.max_events_per_day").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long w() {
        return ((Long) a.b(42, 10L, "measurement.sgtm.batch.retry_max_count").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long x() {
        return ((Long) a.b(57, 864000000L, "measurement.rb.attribution.max_queue_time").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final String y() {
        return (String) a.c(56, "measurement.rb.attribution.uri_authority", "google-analytics.com").get();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long z() {
        return ((Long) a.b(73, 518400000L, "measurement.upload.max_queue_time").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long zzA() {
        return ((Long) a.b(27, ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS, "measurement.alarm_manager.minimum_interval").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long zzB() {
        return ((Long) a.b(28, 500L, "measurement.upload.minimum_delay").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long zzD() {
        return ((Long) a.b(30, Ua.C, "measurement.rb.attribution.notify_app_delay_millis").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final boolean zzE() {
        return ((Boolean) a.a(31, "measurement.config.notify_trigger_uris_on_backgrounded", true).get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final String zzF() {
        return (String) a.c(32, "measurement.rb.attribution.app_allowlist", "").get();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long zzH() {
        return ((Long) a.b(34, 604800000L, "measurement.upload.refresh_blacklisted_config_interval").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long zzJ() {
        return ((Long) a.b(38, 1000L, "measurement.service_client.reconnect_millis").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long zzL() {
        return ((Long) a.b(41, 1800000L, "measurement.sgtm.batch.retry_interval").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long zzN() {
        return ((Long) a.b(43, 21600000L, "measurement.sgtm.batch.retry_max_wait").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final String zzP() {
        return (String) a.c(45, "measurement.sgtm.upload.backoff_http_codes", "404,429,503,504").get();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long zzR() {
        return ((Long) a.b(47, 5000L, "measurement.sgtm.upload.max_queued_batches").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long zzT() {
        return ((Long) a.b(49, 1000L, "measurement.sgtm.upload.min_delay_after_broadcast").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long zza() {
        return ((Long) a.b(0, Ua.s, "measurement.ad_id_cache_time").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long zzb() {
        return ((Long) a.b(1, 3600000L, "measurement.app_uninstalled_additional_ad_id_cache_time").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final boolean zzc() {
        return ((Boolean) a.a(2, "measurement.config.bundle_for_all_apps_on_backgrounded", true).get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long zzd() {
        return ((Long) a.b(3, 100L, "measurement.max_bundles_per_iteration").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final String zze() {
        return (String) a.c(4, "measurement.gbraid_campaign.campaign_params_triggering_info_update", "gclid,gbraid,gad_campaignid").get();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long zzf() {
        return ((Long) a.b(5, 86400000L, "measurement.config.cache_time").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final String zzg() {
        return (String) a.c(7, "measurement.config.url_authority", "app-measurement.com").get();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final String zzh() {
        return (String) a.c(8, "measurement.config.url_scheme", HttpRequest.DEFAULT_SCHEME).get();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long zzi() {
        return ((Long) a.b(9, 1000L, "measurement.upload.debug_upload_interval").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final boolean zzj() {
        return ((Boolean) a.a(10, "measurement.config.default_flag_values", true).get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long zzk() {
        return ((Long) a.b(11, 3600000L, "45769094").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long zzl() {
        return ((Long) a.b(12, 3600000L, "measurement.session.engagement_interval").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final String zzm() {
        return (String) a.c(13, "measurement.rb.attribution.event_params", "value|currency").get();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final String zzn() {
        return (String) a.c(14, "measurement.edpb.events_cached_in_no_data_mode", "_f,_v,_cmp").get();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long zzo() {
        return ((Long) a.b(15, 605000L, "measurement.upload.google_signal_max_queue_time").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final String zzp() {
        return (String) a.c(16, "measurement.sgtm.google_signal.url", "https://app-measurement.com/s/d").get();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long zzq() {
        return ((Long) a.b(17, 4L, "measurement.lifetimevalue.max_currency_tracked").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long zzr() {
        return ((Long) a.b(18, 1L, "measurement.dma_consent.max_daily_dcu_realtime_events").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long zzs() {
        return ((Long) a.b(19, 500L, "measurement.upload.max_event_parameter_value_length").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long zzt() {
        return ((Long) a.b(20, 100000L, "measurement.store.max_stored_events_per_app").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long zzu() {
        return ((Long) a.b(21, 50L, "measurement.experiment.max_ids").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long zzv() {
        return ((Long) a.b(22, 200L, "measurement.audience.filter_result_max_count").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long zzw() {
        return ((Long) a.b(23, 27L, "measurement.upload.max_item_scoped_custom_parameters").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long zzx() {
        return ((Long) a.b(24, 1000L, "measurement.rb.max_trigger_registrations_per_day").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long zzz() {
        return ((Long) a.b(26, 7L, "measurement.rb.attribution.client.min_ad_services_version").get()).longValue();
    }
}
