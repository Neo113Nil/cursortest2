package com.google.android.gms.measurement.internal;

import android.content.Context;
import androidx.recyclerview.widget.m;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzne;
import com.google.android.gms.internal.measurement.zznh;
import com.google.android.gms.internal.measurement.zznk;
import com.google.android.gms.internal.measurement.zznn;
import com.google.android.gms.internal.measurement.zznq;
import com.google.android.gms.internal.measurement.zznt;
import com.google.android.gms.internal.measurement.zznw;
import com.google.android.gms.internal.measurement.zznz;
import com.google.android.gms.internal.measurement.zzoc;
import com.google.android.gms.internal.measurement.zzof;
import com.google.android.gms.internal.measurement.zzoi;
import com.google.android.gms.internal.measurement.zzol;
import com.google.android.gms.internal.measurement.zzoo;
import com.google.android.gms.internal.measurement.zzor;
import com.google.android.gms.internal.measurement.zzou;
import com.google.android.gms.internal.measurement.zzox;
import com.google.android.gms.internal.measurement.zzpa;
import com.google.android.gms.internal.measurement.zzpd;
import com.google.android.gms.internal.measurement.zzpg;
import com.google.android.gms.internal.measurement.zzpj;
import com.google.android.gms.internal.measurement.zzpm;
import com.google.android.gms.internal.measurement.zzpp;
import com.google.android.gms.internal.measurement.zzps;
import com.google.android.gms.internal.measurement.zzpv;
import com.google.android.gms.internal.measurement.zzpy;
import com.google.android.gms.internal.measurement.zzqb;
import com.google.android.gms.internal.measurement.zzqe;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ru.ozon.fintech.ui.input.CounterView;

@VisibleForTesting
/* loaded from: classes.dex */
public final class zzen {
    public static final zzem zzE;
    public static final zzem zzF;
    public static final zzem zzG;
    public static final zzem zzH;
    public static final zzem zzI;
    public static final zzem zzJ;
    public static final zzem zzK;
    public static final zzem zzL;
    public static final zzem zzM;
    public static final zzem zzN;
    public static final zzem zzO;
    public static final zzem zzP;
    public static final zzem zzQ;
    public static final zzem zzR;
    public static final zzem zzS;
    public static final zzem zzT;
    public static final zzem zzU;
    public static final zzem zzV;
    public static final zzem zzW;
    public static final zzem zzX;
    public static final zzem zzY;
    public static final zzem zzZ;
    public static final zzem zzaA;
    public static final zzem zzaB;
    public static final zzem zzaC;
    public static final zzem zzaD;
    public static final zzem zzaE;
    public static final zzem zzaF;
    public static final zzem zzaG;
    public static final zzem zzaH;
    public static final zzem zzaI;
    public static final zzem zzaJ;
    public static final zzem zzaK;
    public static final zzem zzaL;
    public static final zzem zzaM;
    public static final zzem zzaN;
    public static final zzem zzaO;
    public static final zzem zzaa;
    public static final zzem zzab;
    public static final zzem zzac;
    public static final zzem zzad;
    public static final zzem zzae;
    public static final zzem zzaf;
    public static final zzem zzag;
    public static final zzem zzah;
    public static final zzem zzai;
    public static final zzem zzaj;
    public static final zzem zzak;
    public static final zzem zzal;
    public static final zzem zzam;
    public static final zzem zzan;
    public static final zzem zzao;
    public static final zzem zzap;
    public static final zzem zzaq;
    public static final zzem zzar;
    public static final zzem zzas;
    public static final zzem zzat;
    public static final zzem zzau;
    public static final zzem zzav;
    public static final zzem zzaw;
    public static final zzem zzax;
    public static final zzem zzay;
    public static final zzem zzaz;
    private static final List zzaP = Collections.synchronizedList(new ArrayList());
    private static final Set zzaQ = Collections.synchronizedSet(new HashSet());
    public static final zzem zza = zza("measurement.ad_id_cache_time", 10000L, 10000L, new zzej() { // from class: com.google.android.gms.measurement.internal.zzay
        @Override // com.google.android.gms.measurement.internal.zzej
        public final Object zza() {
            zzem zzemVar = zzen.zza;
            return Long.valueOf(zznq.zzb());
        }
    });
    public static final zzem zzb = zza("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, new zzej() { // from class: com.google.android.gms.measurement.internal.zzba
        @Override // com.google.android.gms.measurement.internal.zzej
        public final Object zza() {
            zzem zzemVar = zzen.zza;
            return Long.valueOf(zznq.zzl());
        }
    });
    public static final zzem zzc = zza("measurement.config.cache_time", 86400000L, 3600000L, new zzej() { // from class: com.google.android.gms.measurement.internal.zzbm
        @Override // com.google.android.gms.measurement.internal.zzej
        public final Object zza() {
            zzem zzemVar = zzen.zza;
            return Long.valueOf(zznq.zzd());
        }
    });
    public static final zzem zzd = zza("measurement.config.url_scheme", "https", "https", new zzej() { // from class: com.google.android.gms.measurement.internal.zzby
        @Override // com.google.android.gms.measurement.internal.zzej
        public final Object zza() {
            zzem zzemVar = zzen.zza;
            return zznq.zzK();
        }
    });
    public static final zzem zze = zza("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", new zzej() { // from class: com.google.android.gms.measurement.internal.zzck
        @Override // com.google.android.gms.measurement.internal.zzej
        public final Object zza() {
            zzem zzemVar = zzen.zza;
            return zznq.zzJ();
        }
    });
    public static final zzem zzf = zza("measurement.upload.max_bundles", 100, 100, new zzej() { // from class: com.google.android.gms.measurement.internal.zzcw
        @Override // com.google.android.gms.measurement.internal.zzej
        public final Object zza() {
            zzem zzemVar = zzen.zza;
            return Integer.valueOf((int) zznq.zzw());
        }
    });
    public static final zzem zzg = zza("measurement.upload.max_batch_size", 65536, 65536, new zzej() { // from class: com.google.android.gms.measurement.internal.zzdi
        @Override // com.google.android.gms.measurement.internal.zzej
        public final Object zza() {
            zzem zzemVar = zzen.zza;
            return Integer.valueOf((int) zznq.zzE());
        }
    });
    public static final zzem zzh = zza("measurement.upload.max_bundle_size", 65536, 65536, new zzej() { // from class: com.google.android.gms.measurement.internal.zzdu
        @Override // com.google.android.gms.measurement.internal.zzej
        public final Object zza() {
            zzem zzemVar = zzen.zza;
            return Integer.valueOf((int) zznq.zzv());
        }
    });
    public static final zzem zzi = zza("measurement.upload.max_events_per_bundle", 1000, 1000, new zzej() { // from class: com.google.android.gms.measurement.internal.zzef
        @Override // com.google.android.gms.measurement.internal.zzej
        public final Object zza() {
            zzem zzemVar = zzen.zza;
            return Integer.valueOf((int) zznq.zzz());
        }
    });
    public static final zzem zzj = zza("measurement.upload.max_events_per_day", 100000, 100000, new zzej() { // from class: com.google.android.gms.measurement.internal.zzeg
        @Override // com.google.android.gms.measurement.internal.zzej
        public final Object zza() {
            zzem zzemVar = zzen.zza;
            return Integer.valueOf((int) zznq.zzA());
        }
    });
    public static final zzem zzk = zza("measurement.upload.max_error_events_per_day", 1000, 1000, new zzej() { // from class: com.google.android.gms.measurement.internal.zzbj
        @Override // com.google.android.gms.measurement.internal.zzej
        public final Object zza() {
            zzem zzemVar = zzen.zza;
            return Integer.valueOf((int) zznq.zzy());
        }
    });
    public static final zzem zzl = zza("measurement.upload.max_public_events_per_day", 50000, 50000, new zzej() { // from class: com.google.android.gms.measurement.internal.zzbu
        @Override // com.google.android.gms.measurement.internal.zzej
        public final Object zza() {
            zzem zzemVar = zzen.zza;
            return Integer.valueOf((int) zznq.zzB());
        }
    });
    public static final zzem zzm = zza("measurement.upload.max_conversions_per_day", 10000, 10000, new zzej() { // from class: com.google.android.gms.measurement.internal.zzcf
        @Override // com.google.android.gms.measurement.internal.zzej
        public final Object zza() {
            zzem zzemVar = zzen.zza;
            return Integer.valueOf((int) zznq.zzx());
        }
    });
    public static final zzem zzn = zza("measurement.upload.max_realtime_events_per_day", 10, 10, new zzej() { // from class: com.google.android.gms.measurement.internal.zzcq
        @Override // com.google.android.gms.measurement.internal.zzej
        public final Object zza() {
            zzem zzemVar = zzen.zza;
            return Integer.valueOf((int) zznq.zzD());
        }
    });
    public static final zzem zzo = zza("measurement.store.max_stored_events_per_app", 100000, 100000, new zzej() { // from class: com.google.android.gms.measurement.internal.zzdb
        @Override // com.google.android.gms.measurement.internal.zzej
        public final Object zza() {
            zzem zzemVar = zzen.zza;
            return Integer.valueOf((int) zznq.zzg());
        }
    });
    public static final zzem zzp = zza("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", new zzej() { // from class: com.google.android.gms.measurement.internal.zzdm
        @Override // com.google.android.gms.measurement.internal.zzej
        public final Object zza() {
            zzem zzemVar = zzen.zza;
            return zznq.zzL();
        }
    });
    public static final zzem zzq = zza("measurement.upload.backoff_period", 43200000L, 43200000L, new zzej() { // from class: com.google.android.gms.measurement.internal.zzdx
        @Override // com.google.android.gms.measurement.internal.zzej
        public final Object zza() {
            zzem zzemVar = zzen.zza;
            return Long.valueOf(zznq.zzs());
        }
    });
    public static final zzem zzr = zza("measurement.upload.window_interval", 3600000L, 3600000L, new zzej() { // from class: com.google.android.gms.measurement.internal.zzeh
        @Override // com.google.android.gms.measurement.internal.zzej
        public final Object zza() {
            zzem zzemVar = zzen.zza;
            return Long.valueOf(zznq.zzH());
        }
    });
    public static final zzem zzs = zza("measurement.upload.interval", 3600000L, 3600000L, new zzej() { // from class: com.google.android.gms.measurement.internal.zzei
        @Override // com.google.android.gms.measurement.internal.zzej
        public final Object zza() {
            zzem zzemVar = zzen.zza;
            return Long.valueOf(zznq.zzu());
        }
    });
    public static final zzem zzt = zza("measurement.upload.realtime_upload_interval", 10000L, 10000L, new zzej() { // from class: com.google.android.gms.measurement.internal.zzaz
        @Override // com.google.android.gms.measurement.internal.zzej
        public final Object zza() {
            zzem zzemVar = zzen.zza;
            return Long.valueOf(zznq.zzm());
        }
    });
    public static final zzem zzu = zza("measurement.upload.debug_upload_interval", 1000L, 1000L, new zzej() { // from class: com.google.android.gms.measurement.internal.zzbb
        @Override // com.google.android.gms.measurement.internal.zzej
        public final Object zza() {
            zzem zzemVar = zzen.zza;
            return Long.valueOf(zznq.zze());
        }
    });
    public static final zzem zzv = zza("measurement.upload.minimum_delay", 500L, 500L, new zzej() { // from class: com.google.android.gms.measurement.internal.zzbc
        @Override // com.google.android.gms.measurement.internal.zzej
        public final Object zza() {
            zzem zzemVar = zzen.zza;
            return Long.valueOf(zznq.zzk());
        }
    });
    public static final zzem zzw = zza("measurement.alarm_manager.minimum_interval", 60000L, 60000L, new zzej() { // from class: com.google.android.gms.measurement.internal.zzbd
        @Override // com.google.android.gms.measurement.internal.zzej
        public final Object zza() {
            zzem zzemVar = zzen.zza;
            return Long.valueOf(zznq.zzj());
        }
    });
    public static final zzem zzx = zza("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, new zzej() { // from class: com.google.android.gms.measurement.internal.zzbe
        @Override // com.google.android.gms.measurement.internal.zzej
        public final Object zza() {
            zzem zzemVar = zzen.zza;
            return Long.valueOf(zznq.zzp());
        }
    });
    public static final zzem zzy = zza("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, new zzej() { // from class: com.google.android.gms.measurement.internal.zzbf
        @Override // com.google.android.gms.measurement.internal.zzej
        public final Object zza() {
            zzem zzemVar = zzen.zza;
            return Long.valueOf(zznq.zzn());
        }
    });
    public static final zzem zzz = zza("measurement.upload.initial_upload_delay_time", 15000L, 15000L, new zzej() { // from class: com.google.android.gms.measurement.internal.zzbg
        @Override // com.google.android.gms.measurement.internal.zzej
        public final Object zza() {
            zzem zzemVar = zzen.zza;
            return Long.valueOf(zznq.zzt());
        }
    });
    public static final zzem zzA = zza("measurement.upload.retry_time", 1800000L, 1800000L, new zzej() { // from class: com.google.android.gms.measurement.internal.zzbh
        @Override // com.google.android.gms.measurement.internal.zzej
        public final Object zza() {
            zzem zzemVar = zzen.zza;
            return Long.valueOf(zznq.zzG());
        }
    });
    public static final zzem zzB = zza("measurement.upload.retry_count", 6, 6, new zzej() { // from class: com.google.android.gms.measurement.internal.zzbi
        @Override // com.google.android.gms.measurement.internal.zzej
        public final Object zza() {
            zzem zzemVar = zzen.zza;
            return Integer.valueOf((int) zznq.zzF());
        }
    });
    public static final zzem zzC = zza("measurement.upload.max_queue_time", 2419200000L, 2419200000L, new zzej() { // from class: com.google.android.gms.measurement.internal.zzbk
        @Override // com.google.android.gms.measurement.internal.zzej
        public final Object zza() {
            zzem zzemVar = zzen.zza;
            return Long.valueOf(zznq.zzC());
        }
    });
    public static final zzem zzD = zza("measurement.lifetimevalue.max_currency_tracked", 4, 4, new zzej() { // from class: com.google.android.gms.measurement.internal.zzbl
        @Override // com.google.android.gms.measurement.internal.zzej
        public final Object zza() {
            zzem zzemVar = zzen.zza;
            return Integer.valueOf((int) zznq.zzf());
        }
    });

    static {
        Integer valueOf = Integer.valueOf(m.e.DEFAULT_DRAG_ANIMATION_DURATION);
        zzE = zza("measurement.audience.filter_result_max_count", valueOf, valueOf, new zzej() { // from class: com.google.android.gms.measurement.internal.zzbn
            @Override // com.google.android.gms.measurement.internal.zzej
            public final Object zza() {
                zzem zzemVar = zzen.zza;
                return Integer.valueOf((int) zznq.zzi());
            }
        });
        zzF = zza("measurement.upload.max_public_user_properties", 25, 25, null);
        Integer valueOf2 = Integer.valueOf(CounterView.COUNTER_MAX_DEFAULT);
        zzG = zza("measurement.upload.max_event_name_cardinality", valueOf2, valueOf2, null);
        zzH = zza("measurement.upload.max_public_event_params", 25, 25, null);
        zzI = zza("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, new zzej() { // from class: com.google.android.gms.measurement.internal.zzbo
            @Override // com.google.android.gms.measurement.internal.zzej
            public final Object zza() {
                zzem zzemVar = zzen.zza;
                return Long.valueOf(zznq.zzo());
            }
        });
        Boolean bool = Boolean.FALSE;
        zzJ = zza("measurement.test.boolean_flag", bool, bool, new zzej() { // from class: com.google.android.gms.measurement.internal.zzbp
            @Override // com.google.android.gms.measurement.internal.zzej
            public final Object zza() {
                zzem zzemVar = zzen.zza;
                return Boolean.valueOf(zzpa.zzg());
            }
        });
        zzK = zza("measurement.test.string_flag", "---", "---", new zzej() { // from class: com.google.android.gms.measurement.internal.zzbq
            @Override // com.google.android.gms.measurement.internal.zzej
            public final Object zza() {
                zzem zzemVar = zzen.zza;
                return zzpa.zzf();
            }
        });
        zzL = zza("measurement.test.long_flag", -1L, -1L, new zzej() { // from class: com.google.android.gms.measurement.internal.zzbr
            @Override // com.google.android.gms.measurement.internal.zzej
            public final Object zza() {
                zzem zzemVar = zzen.zza;
                return Long.valueOf(zzpa.zzd());
            }
        });
        zzM = zza("measurement.test.int_flag", -2, -2, new zzej() { // from class: com.google.android.gms.measurement.internal.zzbs
            @Override // com.google.android.gms.measurement.internal.zzej
            public final Object zza() {
                zzem zzemVar = zzen.zza;
                return Integer.valueOf((int) zzpa.zzc());
            }
        });
        Double valueOf3 = Double.valueOf(-3.0d);
        zzN = zza("measurement.test.double_flag", valueOf3, valueOf3, new zzej() { // from class: com.google.android.gms.measurement.internal.zzbt
            @Override // com.google.android.gms.measurement.internal.zzej
            public final Object zza() {
                zzem zzemVar = zzen.zza;
                return Double.valueOf(zzpa.zzb());
            }
        });
        zzO = zza("measurement.experiment.max_ids", 50, 50, new zzej() { // from class: com.google.android.gms.measurement.internal.zzbv
            @Override // com.google.android.gms.measurement.internal.zzej
            public final Object zza() {
                zzem zzemVar = zzen.zza;
                return Integer.valueOf((int) zznq.zzh());
            }
        });
        zzP = zza("measurement.max_bundles_per_iteration", 100, 100, new zzej() { // from class: com.google.android.gms.measurement.internal.zzbw
            @Override // com.google.android.gms.measurement.internal.zzej
            public final Object zza() {
                zzem zzemVar = zzen.zza;
                return Integer.valueOf((int) zznq.zzc());
            }
        });
        zzQ = zza("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, new zzej() { // from class: com.google.android.gms.measurement.internal.zzbx
            @Override // com.google.android.gms.measurement.internal.zzej
            public final Object zza() {
                zzem zzemVar = zzen.zza;
                return Long.valueOf(zznq.zzq());
            }
        });
        zzR = zza("measurement.redaction.app_instance_id.ttl", 7200000L, 7200000L, new zzej() { // from class: com.google.android.gms.measurement.internal.zzbz
            @Override // com.google.android.gms.measurement.internal.zzej
            public final Object zza() {
                zzem zzemVar = zzen.zza;
                return Long.valueOf(zznq.zzr());
            }
        });
        Boolean bool2 = Boolean.TRUE;
        zzS = zza("measurement.validation.internal_limits_internal_event_params", bool2, bool2, new zzej() { // from class: com.google.android.gms.measurement.internal.zzca
            @Override // com.google.android.gms.measurement.internal.zzej
            public final Object zza() {
                zzem zzemVar = zzen.zza;
                return Boolean.valueOf(zzox.zzc());
            }
        });
        zzT = zza("measurement.collection.log_event_and_bundle_v2", bool2, bool2, new zzej() { // from class: com.google.android.gms.measurement.internal.zzcb
            @Override // com.google.android.gms.measurement.internal.zzej
            public final Object zza() {
                zzem zzemVar = zzen.zza;
                return Boolean.valueOf(zzpg.zzc());
            }
        });
        zzU = zza("measurement.quality.checksum", bool, bool, null);
        zzV = zza("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, new zzej() { // from class: com.google.android.gms.measurement.internal.zzcc
            @Override // com.google.android.gms.measurement.internal.zzej
            public final Object zza() {
                zzem zzemVar = zzen.zza;
                return Boolean.valueOf(zzoi.zze());
            }
        });
        zzW = zza("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, new zzej() { // from class: com.google.android.gms.measurement.internal.zzcd
            @Override // com.google.android.gms.measurement.internal.zzej
            public final Object zza() {
                zzem zzemVar = zzen.zza;
                return Boolean.valueOf(zzoi.zzd());
            }
        });
        zzX = zza("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, new zzej() { // from class: com.google.android.gms.measurement.internal.zzce
            @Override // com.google.android.gms.measurement.internal.zzej
            public final Object zza() {
                zzem zzemVar = zzen.zza;
                return Boolean.valueOf(zzoi.zzf());
            }
        });
        zzY = zza("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, new zzej() { // from class: com.google.android.gms.measurement.internal.zzcg
            @Override // com.google.android.gms.measurement.internal.zzej
            public final Object zza() {
                zzem zzemVar = zzen.zza;
                return Boolean.valueOf(zzqb.zzc());
            }
        });
        zzZ = zza("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, new zzej() { // from class: com.google.android.gms.measurement.internal.zzch
            @Override // com.google.android.gms.measurement.internal.zzej
            public final Object zza() {
                zzem zzemVar = zzen.zza;
                return Boolean.valueOf(zzor.zzc());
            }
        });
        zzaa = zza("measurement.lifecycle.app_in_background_parameter", bool, bool, new zzej() { // from class: com.google.android.gms.measurement.internal.zzci
            @Override // com.google.android.gms.measurement.internal.zzej
            public final Object zza() {
                zzem zzemVar = zzen.zza;
                return Boolean.valueOf(zzou.zzc());
            }
        });
        zzab = zza("measurement.integration.disable_firebase_instance_id", bool, bool, new zzej() { // from class: com.google.android.gms.measurement.internal.zzcj
            @Override // com.google.android.gms.measurement.internal.zzej
            public final Object zza() {
                zzem zzemVar = zzen.zza;
                return Boolean.valueOf(zzpy.zzd());
            }
        });
        zzac = zza("measurement.collection.service.update_with_analytics_fix", bool, bool, new zzej() { // from class: com.google.android.gms.measurement.internal.zzcl
            @Override // com.google.android.gms.measurement.internal.zzej
            public final Object zza() {
                zzem zzemVar = zzen.zza;
                return Boolean.valueOf(zzqe.zzc());
            }
        });
        zzad = zza("measurement.client.firebase_feature_rollout.v1.enable", bool2, bool2, new zzej() { // from class: com.google.android.gms.measurement.internal.zzcm
            @Override // com.google.android.gms.measurement.internal.zzej
            public final Object zza() {
                zzem zzemVar = zzen.zza;
                return Boolean.valueOf(zzoc.zzd());
            }
        });
        zzae = zza("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, new zzej() { // from class: com.google.android.gms.measurement.internal.zzcn
            @Override // com.google.android.gms.measurement.internal.zzej
            public final Object zza() {
                zzem zzemVar = zzen.zza;
                return Boolean.valueOf(zzoo.zzd());
            }
        });
        zzaf = zza("measurement.scheduler.task_thread.cleanup_on_exit", bool, bool, new zzej() { // from class: com.google.android.gms.measurement.internal.zzco
            @Override // com.google.android.gms.measurement.internal.zzej
            public final Object zza() {
                zzem zzemVar = zzen.zza;
                return Boolean.valueOf(zzpm.zzc());
            }
        });
        zzag = zza("measurement.collection.synthetic_data_mitigation", bool, bool, new zzej() { // from class: com.google.android.gms.measurement.internal.zzcp
            @Override // com.google.android.gms.measurement.internal.zzej
            public final Object zza() {
                zzem zzemVar = zzen.zza;
                return Boolean.valueOf(zzpv.zzc());
            }
        });
        zzah = zza("measurement.androidId.delete_feature", bool2, bool2, new zzej() { // from class: com.google.android.gms.measurement.internal.zzcr
            @Override // com.google.android.gms.measurement.internal.zzej
            public final Object zza() {
                zzem zzemVar = zzen.zza;
                return Boolean.valueOf(zznh.zzc());
            }
        });
        zzai = zza("measurement.service.storage_consent_support_version", 203600, 203600, new zzej() { // from class: com.google.android.gms.measurement.internal.zzcs
            @Override // com.google.android.gms.measurement.internal.zzej
            public final Object zza() {
                zzem zzemVar = zzen.zza;
                return Integer.valueOf((int) zznt.zzb());
            }
        });
        zzaj = zza("measurement.client.click_identifier_control.dev", bool, bool, new zzej() { // from class: com.google.android.gms.measurement.internal.zzct
            @Override // com.google.android.gms.measurement.internal.zzej
            public final Object zza() {
                zzem zzemVar = zzen.zza;
                return Boolean.valueOf(zznk.zzc());
            }
        });
        zzak = zza("measurement.service.click_identifier_control", bool, bool, new zzej() { // from class: com.google.android.gms.measurement.internal.zzcu
            @Override // com.google.android.gms.measurement.internal.zzej
            public final Object zza() {
                zzem zzemVar = zzen.zza;
                return Boolean.valueOf(zznn.zzc());
            }
        });
        zzal = zza("measurement.client.consent.gmpappid_worker_thread_fix", bool2, bool2, new zzej() { // from class: com.google.android.gms.measurement.internal.zzcv
            @Override // com.google.android.gms.measurement.internal.zzej
            public final Object zza() {
                zzem zzemVar = zzen.zza;
                return Boolean.valueOf(zzof.zzd());
            }
        });
        zzam = zza("measurement.module.pixie.fix_array", bool2, bool2, new zzej() { // from class: com.google.android.gms.measurement.internal.zzcx
            @Override // com.google.android.gms.measurement.internal.zzej
            public final Object zza() {
                zzem zzemVar = zzen.zza;
                return Boolean.valueOf(zzpd.zzd());
            }
        });
        zzan = zza("measurement.adid_zero.service", bool2, bool2, new zzej() { // from class: com.google.android.gms.measurement.internal.zzcy
            @Override // com.google.android.gms.measurement.internal.zzej
            public final Object zza() {
                zzem zzemVar = zzen.zza;
                return Boolean.valueOf(zzne.zze());
            }
        });
        zzao = zza("measurement.adid_zero.remove_lair_if_adidzero_false", bool2, bool2, new zzej() { // from class: com.google.android.gms.measurement.internal.zzcz
            @Override // com.google.android.gms.measurement.internal.zzej
            public final Object zza() {
                zzem zzemVar = zzen.zza;
                return Boolean.valueOf(zzne.zzg());
            }
        });
        zzap = zza("measurement.adid_zero.remove_lair_if_userid_cleared", bool2, bool2, new zzej() { // from class: com.google.android.gms.measurement.internal.zzda
            @Override // com.google.android.gms.measurement.internal.zzej
            public final Object zza() {
                zzem zzemVar = zzen.zza;
                return Boolean.valueOf(zzne.zzh());
            }
        });
        zzaq = zza("measurement.adid_zero.remove_lair_on_id_value_change_only", bool2, bool2, new zzej() { // from class: com.google.android.gms.measurement.internal.zzdc
            @Override // com.google.android.gms.measurement.internal.zzej
            public final Object zza() {
                zzem zzemVar = zzen.zza;
                return Boolean.valueOf(zzne.zzi());
            }
        });
        zzar = zza("measurement.adid_zero.adid_uid", bool2, bool2, new zzej() { // from class: com.google.android.gms.measurement.internal.zzdd
            @Override // com.google.android.gms.measurement.internal.zzej
            public final Object zza() {
                zzem zzemVar = zzen.zza;
                return Boolean.valueOf(zzne.zzf());
            }
        });
        zzas = zza("measurement.adid_zero.app_instance_id_fix", bool2, bool2, new zzej() { // from class: com.google.android.gms.measurement.internal.zzde
            @Override // com.google.android.gms.measurement.internal.zzej
            public final Object zza() {
                zzem zzemVar = zzen.zza;
                return Boolean.valueOf(zzne.zzd());
            }
        });
        zzat = zza("measurement.service.refactor.package_side_screen", bool2, bool2, new zzej() { // from class: com.google.android.gms.measurement.internal.zzdf
            @Override // com.google.android.gms.measurement.internal.zzej
            public final Object zza() {
                zzem zzemVar = zzen.zza;
                return Boolean.valueOf(zzpp.zzd());
            }
        });
        zzau = zza("measurement.enhanced_campaign.service", bool2, bool2, new zzej() { // from class: com.google.android.gms.measurement.internal.zzdg
            @Override // com.google.android.gms.measurement.internal.zzej
            public final Object zza() {
                zzem zzemVar = zzen.zza;
                return Boolean.valueOf(zznw.zze());
            }
        });
        zzav = zza("measurement.enhanced_campaign.client", bool2, bool2, new zzej() { // from class: com.google.android.gms.measurement.internal.zzdh
            @Override // com.google.android.gms.measurement.internal.zzej
            public final Object zza() {
                zzem zzemVar = zzen.zza;
                return Boolean.valueOf(zznw.zzd());
            }
        });
        zzaw = zza("measurement.enhanced_campaign.srsltid.client", bool2, bool2, new zzej() { // from class: com.google.android.gms.measurement.internal.zzdj
            @Override // com.google.android.gms.measurement.internal.zzej
            public final Object zza() {
                zzem zzemVar = zzen.zza;
                return Boolean.valueOf(zznw.zzf());
            }
        });
        zzax = zza("measurement.enhanced_campaign.srsltid.service", bool2, bool2, new zzej() { // from class: com.google.android.gms.measurement.internal.zzdk
            @Override // com.google.android.gms.measurement.internal.zzej
            public final Object zza() {
                zzem zzemVar = zzen.zza;
                return Boolean.valueOf(zznw.zzg());
            }
        });
        zzay = zza("measurement.service.store_null_safelist", bool2, bool2, new zzej() { // from class: com.google.android.gms.measurement.internal.zzdl
            @Override // com.google.android.gms.measurement.internal.zzej
            public final Object zza() {
                zzem zzemVar = zzen.zza;
                return Boolean.valueOf(zznz.zzd());
            }
        });
        zzaz = zza("measurement.service.store_safelist", bool2, bool2, new zzej() { // from class: com.google.android.gms.measurement.internal.zzdn
            @Override // com.google.android.gms.measurement.internal.zzej
            public final Object zza() {
                zzem zzemVar = zzen.zza;
                return Boolean.valueOf(zznz.zze());
            }
        });
        zzaA = zza("measurement.redaction.no_aiid_in_config_request", bool2, bool2, new zzej() { // from class: com.google.android.gms.measurement.internal.zzdo
            @Override // com.google.android.gms.measurement.internal.zzej
            public final Object zza() {
                zzem zzemVar = zzen.zza;
                return Boolean.valueOf(zzpj.zzl());
            }
        });
        zzaB = zza("measurement.redaction.config_redacted_fields", bool2, bool2, new zzej() { // from class: com.google.android.gms.measurement.internal.zzdp
            @Override // com.google.android.gms.measurement.internal.zzej
            public final Object zza() {
                zzem zzemVar = zzen.zza;
                return Boolean.valueOf(zzpj.zzf());
            }
        });
        zzaC = zza("measurement.redaction.upload_redacted_fields", bool2, bool2, new zzej() { // from class: com.google.android.gms.measurement.internal.zzdq
            @Override // com.google.android.gms.measurement.internal.zzej
            public final Object zza() {
                zzem zzemVar = zzen.zza;
                return Boolean.valueOf(zzpj.zzm());
            }
        });
        zzaD = zza("measurement.redaction.upload_subdomain_override", bool2, bool2, new zzej() { // from class: com.google.android.gms.measurement.internal.zzdr
            @Override // com.google.android.gms.measurement.internal.zzej
            public final Object zza() {
                zzem zzemVar = zzen.zza;
                return Boolean.valueOf(zzpj.zzn());
            }
        });
        zzaE = zza("measurement.redaction.device_info", bool2, bool2, new zzej() { // from class: com.google.android.gms.measurement.internal.zzds
            @Override // com.google.android.gms.measurement.internal.zzej
            public final Object zza() {
                zzem zzemVar = zzen.zza;
                return Boolean.valueOf(zzpj.zzg());
            }
        });
        zzaF = zza("measurement.redaction.user_id", bool2, bool2, new zzej() { // from class: com.google.android.gms.measurement.internal.zzdt
            @Override // com.google.android.gms.measurement.internal.zzej
            public final Object zza() {
                zzem zzemVar = zzen.zza;
                return Boolean.valueOf(zzpj.zzo());
            }
        });
        zzaG = zza("measurement.redaction.google_signals", bool2, bool2, new zzej() { // from class: com.google.android.gms.measurement.internal.zzdv
            @Override // com.google.android.gms.measurement.internal.zzej
            public final Object zza() {
                zzem zzemVar = zzen.zza;
                return Boolean.valueOf(zzpj.zzk());
            }
        });
        zzaH = zza("measurement.collection.enable_session_stitching_token.service", bool, bool, new zzej() { // from class: com.google.android.gms.measurement.internal.zzdw
            @Override // com.google.android.gms.measurement.internal.zzej
            public final Object zza() {
                zzem zzemVar = zzen.zza;
                return Boolean.valueOf(zzps.zze());
            }
        });
        zzaI = zza("measurement.collection.enable_session_stitching_token.client.dev", bool, bool, new zzej() { // from class: com.google.android.gms.measurement.internal.zzdy
            @Override // com.google.android.gms.measurement.internal.zzej
            public final Object zza() {
                zzem zzemVar = zzen.zza;
                return Boolean.valueOf(zzps.zzd());
            }
        });
        zzaJ = zza("measurement.redaction.app_instance_id", bool2, bool2, new zzej() { // from class: com.google.android.gms.measurement.internal.zzdz
            @Override // com.google.android.gms.measurement.internal.zzej
            public final Object zza() {
                zzem zzemVar = zzen.zza;
                return Boolean.valueOf(zzpj.zzd());
            }
        });
        zzaK = zza("measurement.redaction.populate_ephemeral_app_instance_id", bool2, bool2, new zzej() { // from class: com.google.android.gms.measurement.internal.zzea
            @Override // com.google.android.gms.measurement.internal.zzej
            public final Object zza() {
                zzem zzemVar = zzen.zza;
                return Boolean.valueOf(zzpj.zzj());
            }
        });
        zzaL = zza("measurement.redaction.enhanced_uid", bool2, bool2, new zzej() { // from class: com.google.android.gms.measurement.internal.zzeb
            @Override // com.google.android.gms.measurement.internal.zzej
            public final Object zza() {
                zzem zzemVar = zzen.zza;
                return Boolean.valueOf(zzpj.zzi());
            }
        });
        zzaM = zza("measurement.redaction.e_tag", bool, bool, new zzej() { // from class: com.google.android.gms.measurement.internal.zzec
            @Override // com.google.android.gms.measurement.internal.zzej
            public final Object zza() {
                zzem zzemVar = zzen.zza;
                return Boolean.valueOf(zzpj.zzh());
            }
        });
        zzaN = zza("measurement.redaction.client_ephemeral_aiid_generation", bool2, bool2, new zzej() { // from class: com.google.android.gms.measurement.internal.zzed
            @Override // com.google.android.gms.measurement.internal.zzej
            public final Object zza() {
                zzem zzemVar = zzen.zza;
                return Boolean.valueOf(zzpj.zze());
            }
        });
        zzaO = zza("measurement.audience.dynamic_filters.oob_fix", bool2, bool2, new zzej() { // from class: com.google.android.gms.measurement.internal.zzee
            @Override // com.google.android.gms.measurement.internal.zzej
            public final Object zza() {
                zzem zzemVar = zzen.zza;
                return Boolean.valueOf(zzol.zzd());
            }
        });
    }

    @VisibleForTesting
    static zzem zza(String str, Object obj, Object obj2, zzej zzejVar) {
        zzem zzemVar = new zzem(str, obj, obj2, zzejVar, null);
        zzaP.add(zzemVar);
        return zzemVar;
    }

    public static Map zzc(Context context) {
        com.google.android.gms.internal.measurement.zzhe zza2 = com.google.android.gms.internal.measurement.zzhe.zza(context.getContentResolver(), com.google.android.gms.internal.measurement.zzho.zza("com.google.android.gms.measurement"));
        return zza2 == null ? Collections.EMPTY_MAP : zza2.zzc();
    }
}
