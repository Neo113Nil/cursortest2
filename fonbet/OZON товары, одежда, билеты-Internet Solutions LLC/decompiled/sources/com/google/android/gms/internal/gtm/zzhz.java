package com.google.android.gms.internal.gtm;

import C.o0;
import I0.C3173b;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import g.C6594f;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@VisibleForTesting
/* loaded from: classes9.dex */
public final class zzhz {
    private final Context zza;
    private final String zzb;
    private final zzqg zzc;
    private final com.google.android.gms.tagmanager.zzcp zzd;
    private final com.google.android.gms.tagmanager.zzcg zze;
    private final zzib zzf;
    private final zzre zzg;
    private final zzre zzh;
    private final Set<String> zzi;
    private int zzj;
    private zznt zzk;
    private zzgx zzl;
    private final zzhy zzm;

    /* JADX WARN: Multi-variable type inference failed */
    @VisibleForTesting
    public zzhz(Context context, String str, zzqg zzqgVar, zzqp zzqpVar, com.google.android.gms.tagmanager.zzcp zzcpVar, com.google.android.gms.tagmanager.zzcg zzcgVar) {
        zzib zzibVar = new zzib();
        this.zzf = zzibVar;
        zzre zzreVar = new zzre(new HashMap(50));
        this.zzg = zzreVar;
        zzre zzreVar2 = new zzre(new HashMap(10));
        this.zzh = zzreVar2;
        this.zzi = new HashSet();
        zzht zzhtVar = new zzht(this);
        this.zzm = zzhtVar;
        Preconditions.checkNotNull(zzqgVar, "Internal Error: Container resource cannot be null");
        Preconditions.checkNotNull(zzqpVar, "Internal Error: Runtime resource cannot be null");
        Preconditions.checkNotEmpty(str, "Internal Error: ContainerId cannot be empty");
        Preconditions.checkNotNull(zzcpVar);
        Preconditions.checkNotNull(zzcgVar);
        this.zza = context;
        this.zzb = str;
        this.zzc = zzqgVar;
        this.zzd = zzcpVar;
        this.zze = zzcgVar;
        zzibVar.zzc("1", new zzqz(new zzks()));
        zzibVar.zzc("12", new zzqz(new zzkt()));
        zzibVar.zzc("18", new zzqz(new zzku()));
        zzibVar.zzc("19", new zzqz(new zzkv()));
        zzibVar.zzc("20", new zzqz(new zzkw()));
        zzibVar.zzc("21", new zzqz(new zzkx()));
        zzibVar.zzc("23", new zzqz(new zzky()));
        zzibVar.zzc("24", new zzqz(new zzkz()));
        zzibVar.zzc("27", new zzqz(new zzla()));
        zzibVar.zzc("28", new zzqz(new zzlb()));
        zzibVar.zzc("29", new zzqz(new zzlc()));
        zzibVar.zzc("30", new zzqz(new zzld()));
        zzibVar.zzc("32", new zzqz(new zzle()));
        zzibVar.zzc("33", new zzqz(new zzle()));
        zzibVar.zzc("34", new zzqz(new zzlf()));
        zzibVar.zzc("35", new zzqz(new zzlf()));
        zzibVar.zzc("39", new zzqz(new zzlg()));
        zzibVar.zzc("40", new zzqz(new zzlh()));
        zzibVar.zzc("0", new zzqz(new zzme()));
        zzibVar.zzc("10", new zzqz(new zzmf()));
        zzibVar.zzc("25", new zzqz(new zzmg()));
        zzibVar.zzc("26", new zzqz(new zzmh()));
        zzibVar.zzc("37", new zzqz(new zzmi()));
        zzibVar.zzc("2", new zzqz(new zzli()));
        zzibVar.zzc("3", new zzqz(new zzlj()));
        zzibVar.zzc("4", new zzqz(new zzlk()));
        zzibVar.zzc("5", new zzqz(new zzll()));
        zzibVar.zzc("6", new zzqz(new zzlm()));
        zzibVar.zzc("7", new zzqz(new zzln()));
        zzibVar.zzc("8", new zzqz(new zzlo()));
        zzibVar.zzc("9", new zzqz(new zzll()));
        zzibVar.zzc("13", new zzqz(new zzlp()));
        zzibVar.zzc("47", new zzqz(new zzlq()));
        zzibVar.zzc("15", new zzqz(new zzlr()));
        zzibVar.zzc("48", new zzqz(new zzls(this)));
        zzlt zzltVar = new zzlt();
        zzibVar.zzc("16", new zzqz(zzltVar));
        zzibVar.zzc("17", new zzqz(zzltVar));
        zzibVar.zzc("22", new zzqz(new zzlv()));
        zzibVar.zzc("45", new zzqz(new zzlw()));
        zzibVar.zzc("46", new zzqz(new zzlx()));
        zzibVar.zzc("36", new zzqz(new zzly()));
        zzibVar.zzc("43", new zzqz(new zzlz()));
        zzibVar.zzc("38", new zzqz(new zzma()));
        zzibVar.zzc("44", new zzqz(new zzmb()));
        zzibVar.zzc("41", new zzqz(new zzmc()));
        zzibVar.zzc("42", new zzqz(new zzmd()));
        zzl(zza.CONTAINS, new zzoq());
        zzl(zza.ENDS_WITH, new zzor());
        zzl(zza.EQUALS, new zzos());
        zzl(zza.GREATER_EQUALS, new zzot());
        zzl(zza.GREATER_THAN, new zzou());
        zzl(zza.LESS_EQUALS, new zzov());
        zzl(zza.LESS_THAN, new zzow());
        zzl(zza.REGEX, new zzoy());
        zzl(zza.STARTS_WITH, new zzoz());
        zzreVar.zzf("advertiserId", new zzqz(new zznj(context)));
        zzreVar.zzf("advertiserTrackingEnabled", new zzqz(new zznk(context)));
        zzreVar.zzf("adwordsClickReferrer", new zzqz(new zznl(context, zzhtVar)));
        zzreVar.zzf("applicationId", new zzqz(new zznm(context)));
        zzreVar.zzf("applicationName", new zzqz(new zznn(context)));
        zzreVar.zzf("applicationVersion", new zzqz(new zzno(context)));
        zzreVar.zzf("applicationVersionName", new zzqz(new zznp(context)));
        zzreVar.zzf("arbitraryPixieMacro", new zzqz(new zzng(1, zzibVar)));
        zzreVar.zzf("carrier", new zzqz(new zznq(context)));
        zzreVar.zzf("constant", new zzqz(new zzly()));
        zzreVar.zzf("containerId", new zzqz(new zznr(new zzrh(str))));
        zzreVar.zzf("containerVersion", new zzqz(new zznr(new zzrh(zzqgVar.zzb()))));
        zzreVar.zzf("customMacro", new zzqz(new zznf(new zzhx(this, null))));
        zzreVar.zzf("deviceBrand", new zzqz(new zznu()));
        zzreVar.zzf("deviceId", new zzqz(new zznv(context)));
        zzreVar.zzf("deviceModel", new zzqz(new zznw()));
        zzreVar.zzf("deviceName", new zzqz(new zznx()));
        zzreVar.zzf("encode", new zzqz(new zzny()));
        zzreVar.zzf("encrypt", new zzqz(new zznz()));
        zzreVar.zzf("event", new zzqz(new zzns()));
        zzreVar.zzf("eventParameters", new zzqz(new zzoa(zzhtVar)));
        zzreVar.zzf("version", new zzqz(new zzob()));
        zzreVar.zzf("hashcode", new zzqz(new zzoc()));
        zzreVar.zzf("installReferrer", new zzqz(new zzod(context)));
        zzreVar.zzf("join", new zzqz(new zzoe()));
        zzreVar.zzf("language", new zzqz(new zzof()));
        zzreVar.zzf("locale", new zzqz(new zzog()));
        zzreVar.zzf("adWordsUniqueId", new zzqz(new zzoi(context)));
        zzreVar.zzf("osVersion", new zzqz(new zzoj()));
        zzreVar.zzf("platform", new zzqz(new zzok()));
        zzreVar.zzf("random", new zzqz(new zzol()));
        zzreVar.zzf("regexGroup", new zzqz(new zzom()));
        zzreVar.zzf("resolution", new zzqz(new zzoo(context)));
        zzreVar.zzf("runtimeVersion", new zzqz(new zzon()));
        zzreVar.zzf("sdkVersion", new zzqz(new zzop()));
        this.zzk = new zznt();
        zzreVar.zzf("currentTime", new zzqz(this.zzk));
        zzreVar.zzf("userProperty", new zzqz(new zzoh(context, zzhtVar)));
        zzreVar.zzf("arbitraryPixel", new zzqz(new zzpc(zzgv.zza(context))));
        zzreVar.zzf("customTag", new zzqz(new zznf(new zzhv(this, 0 == true ? 1 : 0))));
        zzreVar.zzf("universalAnalytics", new zzqz(new zzpd(context, zzhtVar)));
        zzreVar.zzf("queueRequest", new zzqz(new zzpa(zzgv.zza(context))));
        zzreVar.zzf("sendMeasurement", new zzqz(new zzpb(zzcpVar, zzhtVar)));
        zzreVar.zzf("arbitraryPixieTag", new zzqz(new zzng(0, zzibVar)));
        zzreVar.zzf("suppressPassthrough", new zzqz(new zzni(context, zzhtVar)));
        zzreVar2.zzf("decodeURI", new zzqz(new zzmz()));
        zzreVar2.zzf("decodeURIComponent", new zzqz(new zzna()));
        zzreVar2.zzf("encodeURI", new zzqz(new zznb()));
        zzreVar2.zzf("encodeURIComponent", new zzqz(new zznc()));
        zzreVar2.zzf("log", new zzqz(new zznh()));
        zzreVar2.zzf("isArray", new zzqz(new zznd()));
        for (zzjs zzjsVar : zzqpVar.zza()) {
            zzjsVar.zzc(this.zzf);
            this.zzf.zzc(zzjsVar.zzb(), new zzqz(zzjsVar));
        }
        zzre zzreVar3 = new zzre(new HashMap(1));
        zzreVar3.zzf("mobile", this.zzg);
        zzreVar3.zzf("common", this.zzh);
        this.zzf.zzc("gtmUtils", zzreVar3);
        zzre zzreVar4 = new zzre(new HashMap(this.zzg.zzi()));
        zzreVar4.zzj();
        zzre zzreVar5 = new zzre(new HashMap(this.zzh.zzi()));
        zzreVar5.zzj();
        if (this.zzf.zzf("main") && (this.zzf.zzb("main") instanceof zzqz)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(zzreVar3);
            zzri.zzd(this.zzf, new zzrf("main", arrayList));
        }
        this.zzg.zzf("base", zzreVar4);
        this.zzh.zzf("base", zzreVar5);
        zzreVar3.zzj();
        this.zzg.zzj();
        this.zzh.zzj();
    }

    private final zzqw zzg(Map<String, zzqw<?>> map) {
        zzrf zzrfVar;
        zzqw<?> zzqwVar = map.get(zzb.FUNCTION.toString());
        if (!(zzqwVar instanceof zzrh)) {
            zzgt.zza("No function id in properties", this.zza);
            return zzra.zze;
        }
        String zzk = ((zzrh) zzqwVar).zzk();
        if (this.zzf.zzf(zzk)) {
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, zzqw<?>> entry : map.entrySet()) {
                if (entry.getKey().startsWith("vtp_")) {
                    hashMap.put(entry.getKey().substring(4), entry.getValue());
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new zzre(hashMap));
            zzrfVar = new zzrf(zzk, arrayList);
        } else {
            String zzc = zzjr.zzc(zzk);
            if (zzc == null || !this.zzg.zzh(zzc)) {
                zzgt.zza(C6594f.a("functionId '", zzk, "' is not supported", new StringBuilder(String.valueOf(zzk).length() + 30)), this.zza);
                return zzra.zze;
            }
            try {
                zzrfVar = zzjr.zza(zzk, map, this.zzf);
            } catch (RuntimeException e11) {
                String message = e11.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(zzk).length() + 30 + String.valueOf(message).length());
                sb2.append("Incorrect keys for function ");
                sb2.append(zzk);
                sb2.append(". ");
                sb2.append(message);
                zzhl.zza(sb2.toString());
                zzrfVar = null;
            }
        }
        if (zzrfVar == null) {
            zzgt.zza("Internal error: failed to convert function to a valid statement", this.zza);
            return zzra.zze;
        }
        String valueOf = String.valueOf(zzrfVar.zzi());
        zzhl.zzd(valueOf.length() != 0 ? "Executing: ".concat(valueOf) : new String("Executing: "));
        zzqw zzd = zzri.zzd(this.zzf, zzrfVar);
        if (!(zzd instanceof zzra)) {
            return zzd;
        }
        zzra zzraVar = (zzra) zzd;
        return zzraVar.zzj() ? zzraVar.zzi() : zzd;
    }

    private final zzqw<?> zzh(zzqs zzqsVar) {
        switch (zzqsVar.zza()) {
            case 1:
                try {
                    return new zzqy(Double.valueOf(Double.parseDouble((String) zzqsVar.zzb())));
                } catch (NumberFormatException unused) {
                    return new zzrh((String) zzqsVar.zzb());
                }
            case 2:
                List list = (List) zzqsVar.zzb();
                ArrayList arrayList = new ArrayList(list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(zzh((zzqs) it.next()));
                }
                return new zzrd(arrayList);
            case 3:
                Map map = (Map) zzqsVar.zzb();
                HashMap hashMap = new HashMap(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    zzqw<?> zzh = zzh((zzqs) entry.getKey());
                    hashMap.put(zzju.zzd(zzh), zzh((zzqs) entry.getValue()));
                }
                return new zzre(hashMap);
            case 4:
                zzqw<?> zzi = zzi((String) zzqsVar.zzb());
                if (!(zzi instanceof zzrh) || zzqsVar.zzc().isEmpty()) {
                    return zzi;
                }
                String zzk = ((zzrh) zzi).zzk();
                Iterator<Integer> it2 = zzqsVar.zzc().iterator();
                while (it2.hasNext()) {
                    int intValue = it2.next().intValue();
                    if (intValue != 12) {
                        StringBuilder sb2 = new StringBuilder(39);
                        sb2.append("Unsupported Value Escaping: ");
                        sb2.append(intValue);
                        zzhl.zza(sb2.toString());
                    } else {
                        try {
                            zzk = URLEncoder.encode(zzk, "UTF-8").replaceAll("\\+", "%20");
                        } catch (UnsupportedEncodingException e11) {
                            zzhl.zzb("Escape URI: unsupported encoding", e11);
                        }
                    }
                }
                return new zzrh(zzk);
            case 5:
                return new zzrh((String) zzqsVar.zzb());
            case 6:
                return new zzqy(Double.valueOf(((Integer) zzqsVar.zzb()).doubleValue()));
            case 7:
                StringBuilder sb3 = new StringBuilder();
                Iterator it3 = ((List) zzqsVar.zzb()).iterator();
                while (it3.hasNext()) {
                    sb3.append(zzju.zzd(zzh((zzqs) it3.next())));
                }
                return new zzrh(sb3.toString());
            case 8:
                return new zzqx((Boolean) zzqsVar.zzb());
            default:
                int zza = zzqsVar.zza();
                StringBuilder sb4 = new StringBuilder(52);
                sb4.append("Attempting to expand unknown Value type ");
                sb4.append(zza);
                sb4.append(".");
                throw new IllegalStateException(sb4.toString());
        }
    }

    private final zzqw<?> zzi(String str) {
        this.zzj++;
        String zzj = zzj();
        StringBuilder sb2 = new StringBuilder(String.valueOf(zzj).length() + 31 + String.valueOf(str).length());
        sb2.append(zzj);
        sb2.append("Beginning to evaluate variable ");
        sb2.append(str);
        zzhl.zzd(sb2.toString());
        if (this.zzi.contains(str)) {
            this.zzj--;
            String obj = this.zzi.toString();
            throw new IllegalStateException(C3173b.c(new StringBuilder(String.valueOf(str).length() + 77 + String.valueOf(obj).length()), "Macro cycle detected.  Current macro reference: ", str, ". Previous macro references: ", obj));
        }
        this.zzi.add(str);
        zzqj zza = this.zzc.zza(str);
        if (zza == null) {
            this.zzj--;
            this.zzi.remove(str);
            String zzj2 = zzj();
            throw new IllegalStateException(C6594f.a(zzj2, "Attempting to resolve unknown macro ", str, new StringBuilder(String.valueOf(zzj2).length() + 36 + String.valueOf(str).length())));
        }
        zzqw<?> zzg = zzg(zzk(zza.zza()));
        String zzj3 = zzj();
        StringBuilder sb3 = new StringBuilder(String.valueOf(zzj3).length() + 25 + String.valueOf(str).length());
        sb3.append(zzj3);
        sb3.append("Done evaluating variable ");
        sb3.append(str);
        zzhl.zzd(sb3.toString());
        this.zzj--;
        this.zzi.remove(str);
        return zzg;
    }

    private final String zzj() {
        if (this.zzj <= 1) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Integer.toString(this.zzj));
        for (int i11 = 2; i11 < this.zzj; i11++) {
            sb2.append(' ');
        }
        sb2.append(": ");
        return sb2.toString();
    }

    private final Map<String, zzqw<?>> zzk(Map<String, zzqs> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, zzqs> entry : map.entrySet()) {
            hashMap.put(entry.getKey(), zzh(entry.getValue()));
        }
        return hashMap;
    }

    private final void zzl(zza zzaVar, zzjt zzjtVar) {
        this.zzg.zzf(zzjr.zzb(zzaVar), new zzqz(zzjtVar));
    }

    public final zzqw<?> zzc(String str) {
        if (!this.zzi.contains(str)) {
            this.zzj = 0;
            return zzi(str);
        }
        String obj = this.zzi.toString();
        throw new IllegalStateException(C3173b.c(new StringBuilder(String.valueOf(str).length() + 77 + String.valueOf(obj).length()), "Macro cycle detected.  Current macro reference: ", str, ". Previous macro references: ", obj));
    }

    @VisibleForTesting
    final zzqw<?> zzd(zzqj zzqjVar) {
        this.zzi.clear();
        try {
            zzqw<?> zzg = zzg(zzk(zzqjVar.zza()));
            if (zzg instanceof zzqx) {
                return zzg;
            }
            zzgt.zza("Predicate must return a boolean value", this.zza);
            return new zzqx(Boolean.FALSE);
        } catch (IllegalStateException unused) {
            zzhl.zza("Error evaluating predicate.");
            return zzra.zzd;
        }
    }

    public final void zze() {
        zzgv.zza(this.zza);
        zzik.zzf().zzi();
    }

    public final void zzf(zzgx zzgxVar) {
        zzqw<?> zzqxVar;
        this.zzf.zzc("gtm.globals.eventName", new zzrh(zzgxVar.zzb()));
        this.zzk.zza(zzgxVar);
        this.zzl = zzgxVar;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashMap hashMap = new HashMap();
        for (zzqm zzqmVar : this.zzc.zzc()) {
            if (zzqmVar.zza().isEmpty() && zzqmVar.zzd().isEmpty()) {
                String valueOf = String.valueOf(zzqmVar);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 64);
                sb2.append("Trigger is not being evaluated since it has no associated tags: ");
                sb2.append(valueOf);
                zzhl.zzd(sb2.toString());
            } else {
                String valueOf2 = String.valueOf(zzqmVar);
                StringBuilder sb3 = new StringBuilder(valueOf2.length() + 19);
                sb3.append("Evaluating trigger ");
                sb3.append(valueOf2);
                zzhl.zzd(sb3.toString());
                Iterator<zzqj> it = zzqmVar.zzb().iterator();
                while (true) {
                    if (it.hasNext()) {
                        zzqj next = it.next();
                        zzqw<?> zzqwVar = (zzqw) hashMap.get(next);
                        if (zzqwVar == null) {
                            zzqwVar = zzd(next);
                            hashMap.put(next, zzqwVar);
                        }
                        zzqxVar = zzra.zzd;
                        if (zzqwVar != zzqxVar) {
                            if (((zzqx) zzqwVar).zzi().booleanValue()) {
                                zzqxVar = new zzqx(Boolean.FALSE);
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        Iterator<zzqj> it2 = zzqmVar.zzc().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                zzqxVar = new zzqx(Boolean.TRUE);
                                break;
                            }
                            zzqj next2 = it2.next();
                            zzqw<?> zzqwVar2 = (zzqw) hashMap.get(next2);
                            if (zzqwVar2 == null) {
                                zzqwVar2 = zzd(next2);
                                hashMap.put(next2, zzqwVar2);
                            }
                            zzqxVar = zzra.zzd;
                            if (zzqwVar2 != zzqxVar) {
                                if (!((zzqx) zzqwVar2).zzi().booleanValue()) {
                                    zzqxVar = new zzqx(Boolean.FALSE);
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                }
                if (zzqxVar == zzra.zzd) {
                    String valueOf3 = String.valueOf(zzqmVar);
                    zzgt.zzc(o0.c(new StringBuilder(valueOf3.length() + 41), "Error encounted while evaluating trigger ", valueOf3), this.zza);
                    if (!zzqmVar.zzd().isEmpty()) {
                        String valueOf4 = String.valueOf(zzqmVar.zzd());
                        StringBuilder sb4 = new StringBuilder(valueOf4.length() + 15);
                        sb4.append("Blocking tags: ");
                        sb4.append(valueOf4);
                        zzhl.zzd(sb4.toString());
                        hashSet2.addAll(zzqmVar.zzd());
                    }
                } else if (((zzqx) zzqxVar).zzi().booleanValue()) {
                    String valueOf5 = String.valueOf(zzqmVar);
                    StringBuilder sb5 = new StringBuilder(valueOf5.length() + 19);
                    sb5.append("Trigger is firing: ");
                    sb5.append(valueOf5);
                    zzhl.zzd(sb5.toString());
                    if (!zzqmVar.zza().isEmpty()) {
                        String valueOf6 = String.valueOf(zzqmVar.zza());
                        StringBuilder sb6 = new StringBuilder(valueOf6.length() + 34);
                        sb6.append("Adding tags to firing candidates: ");
                        sb6.append(valueOf6);
                        zzhl.zzd(sb6.toString());
                        hashSet.addAll(zzqmVar.zza());
                    }
                    if (!zzqmVar.zzd().isEmpty()) {
                        String valueOf7 = String.valueOf(zzqmVar.zzd());
                        StringBuilder sb7 = new StringBuilder(valueOf7.length() + 24);
                        sb7.append("Blocking disabled tags: ");
                        sb7.append(valueOf7);
                        zzhl.zzd(sb7.toString());
                        hashSet2.addAll(zzqmVar.zzd());
                    }
                }
            }
        }
        hashSet.removeAll(hashSet2);
        Iterator it3 = hashSet.iterator();
        boolean z11 = false;
        while (it3.hasNext()) {
            zzqj zzqjVar = (zzqj) it3.next();
            this.zzi.clear();
            String valueOf8 = String.valueOf(zzqjVar);
            StringBuilder sb8 = new StringBuilder(valueOf8.length() + 21);
            sb8.append("Executing firing tag ");
            sb8.append(valueOf8);
            zzhl.zzd(sb8.toString());
            try {
                zzg(zzk(zzqjVar.zza()));
                zzqs zzqsVar = zzqjVar.zza().get(zzb.DISPATCH_ON_FIRE.toString());
                if (zzqsVar != null && zzqsVar.zza() == 8 && ((Boolean) zzqsVar.zzb()).booleanValue()) {
                    z11 = true;
                    String valueOf9 = String.valueOf(zzqjVar);
                    StringBuilder sb9 = new StringBuilder(valueOf9.length() + 36);
                    sb9.append("Tag configured to dispatch on fire: ");
                    sb9.append(valueOf9);
                    zzhl.zzd(sb9.toString());
                }
            } catch (IllegalStateException e11) {
                String valueOf10 = String.valueOf(zzqjVar);
                zzgt.zzb(C6594f.a("Error firing tag ", valueOf10, ": ", new StringBuilder(valueOf10.length() + 19)), e11, this.zza);
            }
        }
        this.zzf.zzd("gtm.globals.eventName");
        if (zzgxVar.zzf()) {
            String zzb = zzgxVar.zzb();
            StringBuilder sb10 = new StringBuilder(String.valueOf(zzb).length() + 35);
            sb10.append("Log passthrough event ");
            sb10.append(zzb);
            sb10.append(" to Firebase.");
            zzhl.zzd(sb10.toString());
            try {
                this.zzd.zzc(zzgxVar.zzc(), zzgxVar.zzb(), zzgxVar.zza(), zzgxVar.currentTimeMillis());
            } catch (RemoteException e12) {
                zzgt.zzb("Error calling measurement proxy: ", e12, this.zza);
            }
        } else {
            String zzb2 = zzgxVar.zzb();
            StringBuilder sb11 = new StringBuilder(String.valueOf(zzb2).length() + 63);
            sb11.append("Non-passthrough event ");
            sb11.append(zzb2);
            sb11.append(" doesn't get logged to Firebase directly.");
            zzhl.zzd(sb11.toString());
        }
        if (z11) {
            zzhl.zzd("Dispatch called for dispatchOnFire tags.");
            zze();
        }
    }
}
