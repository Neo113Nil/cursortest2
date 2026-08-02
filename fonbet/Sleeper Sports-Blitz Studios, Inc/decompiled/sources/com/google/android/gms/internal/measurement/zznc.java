package com.google.android.gms.internal.measurement;

import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.amplitude.api.Constants;
import org.apache.commons.lang3.time.DateUtils;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.1 */
/* loaded from: classes7.dex */
public final class zznc implements zzmz {
    private static final zzgw<Long> zza;
    private static final zzgw<String> zzaa;
    private static final zzgw<String> zzab;
    private static final zzgw<String> zzac;
    private static final zzgw<String> zzad;
    private static final zzgw<Long> zzae;
    private static final zzgw<Long> zzaf;
    private static final zzgw<Long> zzag;
    private static final zzgw<Long> zzah;
    private static final zzgw<Long> zzai;
    private static final zzgw<Long> zzaj;
    private static final zzgw<Long> zzak;
    private static final zzgw<Long> zzal;
    private static final zzgw<Long> zzam;
    private static final zzgw<Long> zzan;
    private static final zzgw<Long> zzao;
    private static final zzgw<Long> zzap;
    private static final zzgw<Long> zzaq;
    private static final zzgw<Long> zzar;
    private static final zzgw<Long> zzas;
    private static final zzgw<Long> zzat;
    private static final zzgw<Long> zzau;
    private static final zzgw<String> zzav;
    private static final zzgw<Long> zzaw;
    private static final zzgw<String> zzax;
    private static final zzgw<Long> zzb;
    private static final zzgw<Long> zzc;
    private static final zzgw<Long> zzd;
    private static final zzgw<String> zze;
    private static final zzgw<String> zzf;
    private static final zzgw<Long> zzg;
    private static final zzgw<Long> zzh;
    private static final zzgw<String> zzi;
    private static final zzgw<Long> zzj;
    private static final zzgw<Long> zzk;
    private static final zzgw<Long> zzl;
    private static final zzgw<Long> zzm;
    private static final zzgw<Long> zzn;
    private static final zzgw<Long> zzo;
    private static final zzgw<Long> zzp;
    private static final zzgw<Long> zzq;
    private static final zzgw<Long> zzr;
    private static final zzgw<Long> zzs;
    private static final zzgw<Long> zzt;
    private static final zzgw<String> zzu;
    private static final zzgw<Long> zzv;
    private static final zzgw<Long> zzw;
    private static final zzgw<Long> zzx;
    private static final zzgw<String> zzy;
    private static final zzgw<Long> zzz;

    @Override // com.google.android.gms.internal.measurement.zzmz
    public final long zza() {
        return zza.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmz
    public final long zzb() {
        return zzb.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmz
    public final long zzc() {
        return zzc.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmz
    public final long zzd() {
        return zzd.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmz
    public final long zze() {
        return zzg.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmz
    public final long zzf() {
        return zzh.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmz
    public final long zzg() {
        return zzj.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmz
    public final long zzh() {
        return zzk.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmz
    public final long zzi() {
        return zzl.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmz
    public final long zzj() {
        return zzm.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmz
    public final long zzk() {
        return zzn.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmz
    public final long zzl() {
        return zzo.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmz
    public final long zzm() {
        return zzp.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmz
    public final long zzn() {
        return zzq.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmz
    public final long zzo() {
        return zzr.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmz
    public final long zzp() {
        return zzs.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmz
    public final long zzq() {
        return zzt.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmz
    public final long zzr() {
        return zzv.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmz
    public final long zzs() {
        return zzw.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmz
    public final long zzt() {
        return zzx.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmz
    public final long zzu() {
        return zzz.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmz
    public final long zzv() {
        return zzae.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmz
    public final long zzw() {
        return zzaf.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmz
    public final long zzx() {
        return zzag.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmz
    public final long zzy() {
        return zzah.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmz
    public final long zzz() {
        return zzai.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmz
    public final long zzaa() {
        return zzaj.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmz
    public final long zzab() {
        return zzak.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmz
    public final long zzac() {
        return zzal.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmz
    public final long zzad() {
        return zzam.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmz
    public final long zzae() {
        return zzan.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmz
    public final long zzaf() {
        return zzao.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmz
    public final long zzag() {
        return zzap.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmz
    public final long zzah() {
        return zzaq.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmz
    public final long zzai() {
        return zzar.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmz
    public final long zzaj() {
        return zzas.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmz
    public final long zzak() {
        return zzat.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmz
    public final long zzal() {
        return zzau.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmz
    public final long zzam() {
        return zzaw.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmz
    public final String zzan() {
        return zze.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzmz
    public final String zzao() {
        return zzf.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzmz
    public final String zzap() {
        return zzi.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzmz
    public final String zzaq() {
        return zzu.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzmz
    public final String zzar() {
        return zzy.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzmz
    public final String zzas() {
        return zzaa.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzmz
    public final String zzat() {
        return zzab.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzmz
    public final String zzau() {
        return zzac.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzmz
    public final String zzav() {
        return zzad.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzmz
    public final String zzaw() {
        return zzav.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzmz
    public final String zzax() {
        return zzax.zza();
    }

    static {
        zzhe zza2 = new zzhe(zzgx.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zza2.zza("measurement.ad_id_cache_time", 10000L);
        zzb = zza2.zza("measurement.app_uninstalled_additional_ad_id_cache_time", DateUtils.MILLIS_PER_HOUR);
        zzc = zza2.zza("measurement.max_bundles_per_iteration", 100L);
        zzd = zza2.zza("measurement.config.cache_time", 86400000L);
        zza2.zza("measurement.log_tag", "FA");
        zze = zza2.zza("measurement.config.url_authority", "app-measurement.com");
        zzf = zza2.zza("measurement.config.url_scheme", "https");
        zzg = zza2.zza("measurement.upload.debug_upload_interval", 1000L);
        zzh = zza2.zza("measurement.session.engagement_interval", DateUtils.MILLIS_PER_HOUR);
        zzi = zza2.zza("measurement.rb.attribution.event_params", "value|currency");
        zza2.zza("measurement.id.rb.attribution.app_allowlist", 0L);
        zzj = zza2.zza("measurement.lifetimevalue.max_currency_tracked", 4L);
        zzk = zza2.zza("measurement.dma_consent.max_daily_dcu_realtime_events", 1L);
        zzl = zza2.zza("measurement.upload.max_event_parameter_value_length", 100L);
        zzm = zza2.zza("measurement.store.max_stored_events_per_app", SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US);
        zzn = zza2.zza("measurement.experiment.max_ids", 50L);
        zzo = zza2.zza("measurement.audience.filter_result_max_count", 200L);
        zzp = zza2.zza("measurement.upload.max_item_scoped_custom_parameters", 27L);
        zzq = zza2.zza("measurement.rb.attribution.client.min_ad_services_version", 7L);
        zzr = zza2.zza("measurement.alarm_manager.minimum_interval", 60000L);
        zzs = zza2.zza("measurement.upload.minimum_delay", 500L);
        zzt = zza2.zza("measurement.monitoring.sample_period_millis", 86400000L);
        zzu = zza2.zza("measurement.rb.attribution.app_allowlist", "com.labpixies.flood,com.sofascore.results,games.spearmint.triplecrush,com.block.juggle,io.supercent.linkedcubic,com.cdtg.gunsound,com.corestudios.storemanagementidle,com.cdgames.fidget3d,io.supercent.burgeridle,io.supercent.pizzaidle,jp.ne.ibis.ibispaintx.app,com.dencreak.dlcalculator,com.ebay.kleinanzeigen,de.wetteronline.wetterapp,com.game.shape.shift,com.champion.cubes,bubbleshooter.orig,com.wolt.android,com.master.hotelmaster,com.games.bus.arrival,com.playstrom.dop2,com.huuuge.casino.slots,com.ig.spider.fighting,com.jura.coloring.page,com.rikkogame.ragdoll2,com.ludo.king,com.sigma.prank.sound.haircut,com.crazy.block.robo.monster.cliffs.craft,com.fugo.wow,com.maps.locator.gps.gpstracker.phone,com.gamovation.tileclub,com.pronetis.ironball2,com.meesho.supply,pdf.pdfreader.viewer.editor.free,com.dino.race.master,com.ig.moto.racing,ai.photo.enhancer.photoclear,com.duolingo,com.candle.magic_piano,com.free.vpn.super.hotspot.open,sg.bigo.live,com.cdg.tictactoe,com.zhiliaoapp.musically.go,com.wildspike.wormszone,com.mast.status.video.edit,com.vyroai.photoeditorone,com.pujiagames.deeeersimulator,com.superbinogo.jungleboyadventure,com.trustedapp.pdfreaderpdfviewer,com.artimind.aiart.artgenerator.artavatar,de.cellular.ottohybrid,com.zeptolab.cats.google,in.crossy.daily_crossword");
        zzv = zza2.zza("measurement.upload.realtime_upload_interval", 10000L);
        zzw = zza2.zza("measurement.upload.refresh_blacklisted_config_interval", 604800000L);
        zza2.zza("measurement.config.cache_time.service", DateUtils.MILLIS_PER_HOUR);
        zzx = zza2.zza("measurement.service_client.idle_disconnect_millis", 5000L);
        zza2.zza("measurement.log_tag.service", "FA-SVC");
        zzy = zza2.zza("measurement.sgtm.app_allowlist", "de.zalando.mobile.internal,de.zalando.mobile.internal.debug,de.zalando.lounge.dev,grit.storytel.app,com.rbc.mobile.android,com.rbc.mobile.android,com.dylvian.mango.activities,com.home24.android,com.home24.android.staging,se.lf.mobile.android,se.lf.mobile.android.beta,se.lf.mobile.android.rc,se.lf.mobile.android.test,se.lf.mobile.android.test.debug,com.boots.flagship.android,com.boots.flagshiproi.android,de.zalando.mobile,com.trivago,com.getyourguide.android,es.mobail.meliarewards,se.nansen.coop.debug,se.nansen.coop,se.coop.coop.qa");
        zzz = zza2.zza("measurement.upload.stale_data_deletion_interval", 86400000L);
        zzaa = zza2.zza("measurement.rb.attribution.uri_authority", "google-analytics.com");
        zzab = zza2.zza("measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion");
        zzac = zza2.zza("measurement.rb.attribution.query_parameters_to_remove", "");
        zzad = zza2.zza("measurement.rb.attribution.uri_scheme", "https");
        zzae = zza2.zza("measurement.sdk.attribution.cache.ttl", 604800000L);
        zzaf = zza2.zza("measurement.redaction.app_instance_id.ttl", 7200000L);
        zzag = zza2.zza("measurement.upload.backoff_period", 43200000L);
        zzah = zza2.zza("measurement.upload.initial_upload_delay_time", 15000L);
        zzai = zza2.zza("measurement.upload.interval", DateUtils.MILLIS_PER_HOUR);
        zzaj = zza2.zza("measurement.upload.max_bundle_size", 65536L);
        zzak = zza2.zza("measurement.upload.max_bundles", 100L);
        zzal = zza2.zza("measurement.upload.max_conversions_per_day", 500L);
        zzam = zza2.zza("measurement.upload.max_error_events_per_day", 1000L);
        zzan = zza2.zza("measurement.upload.max_events_per_bundle", 1000L);
        zzao = zza2.zza("measurement.upload.max_events_per_day", SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US);
        zzap = zza2.zza("measurement.upload.max_public_events_per_day", 50000L);
        zzaq = zza2.zza("measurement.upload.max_queue_time", 2419200000L);
        zzar = zza2.zza("measurement.upload.max_realtime_events_per_day", 10L);
        zzas = zza2.zza("measurement.upload.max_batch_size", 65536L);
        zzat = zza2.zza("measurement.upload.retry_count", 6L);
        zzau = zza2.zza("measurement.upload.retry_time", Constants.SESSION_TIMEOUT_MILLIS);
        zzav = zza2.zza("measurement.upload.url", "https://app-measurement.com/a");
        zzaw = zza2.zza("measurement.upload.window_interval", DateUtils.MILLIS_PER_HOUR);
        zzax = zza2.zza("measurement.rb.attribution.user_properties", "_npa,npa");
    }
}
