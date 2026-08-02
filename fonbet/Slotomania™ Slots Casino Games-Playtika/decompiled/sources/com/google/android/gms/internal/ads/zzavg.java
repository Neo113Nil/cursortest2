package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final /* synthetic */ class zzavg implements zzavx {
    public static final /* synthetic */ zzavg zza;
    public static final /* synthetic */ zzavg zzb;
    public static final /* synthetic */ zzavg zzc;
    public static final /* synthetic */ zzavg zzd;
    public static final /* synthetic */ zzavg zze;
    public static final /* synthetic */ zzavg zzf;
    public static final /* synthetic */ zzavg zzg;
    public static final /* synthetic */ zzavg zzh;
    public static final /* synthetic */ zzavg zzi;
    public static final /* synthetic */ zzavg zzj;
    public static final /* synthetic */ zzavg zzk;
    public static final /* synthetic */ zzavg zzl;
    public static final /* synthetic */ zzavg zzm;
    public static final /* synthetic */ zzavg zzn;
    public static final /* synthetic */ zzavg zzo;
    public static final /* synthetic */ zzavg zzp;
    private final /* synthetic */ int zzq;

    static {
        int i = (((((~358984857) & 11257432) | 369424399) + ((358984857 & 615188052) | 873771151)) - 1245366369) ^ (1985433483 % 395279207);
        int i2 = (((((~1402492972) & 1009329808) | 1643537068) + ((1402492972 & 503911450) | 580170602)) - (-2136216298)) ^ (1489001354 % 953691761);
        int i3 = (((((~1389079342) & 405954790) | 5768193) + ((1389079342 & 967468022) | 1640566552)) - 1618010502) ^ (1588695568 % 1155465115);
        int i4 = (((((~1666231349) & 289538432) | 621649449) + ((1666231349 & 406985104) | 264059443)) - 1093855303) ^ (1698487330 % 272312086);
        int i5 = (((((~1953161956) & 2021553924) | 1308628610) + ((1953161956 & 813590916) | 134225131)) - 2074905685) ^ (1172063133 % 990526343);
        int i6 = (((((~1889804310) & 69748745) | 707083896) + ((1889804310 & 604795185) | 951435262)) - 1284100923) ^ (1663080928 % 610506582);
        int i7 = (((((~279121308) & 136482862) | 293951273) + ((279121308 & 1302561302) | 1440046744)) - 1857458389) ^ (1404515797 % 695748720);
        int i8 = (((((~1460082195) & 849562858) | 543970048) + ((1460082195 & 381881578) | 1279262981)) - 1872584419) ^ (1122336503 % 861109485);
        int i9 = (((((~70788355) & 1377181904) | 713084892) + ((70788355 & 1410740224) | 99160279)) - 1955016785) ^ (1156541312 % 318561886);
        int i10 = (((((~12895151) & 1277237303) | 185162640) + ((12895151 & 1411547303) | 306429832)) - 1475739783) ^ (1498617647 % 669908538);
        int i11 = (((((~1566288819) & 1018167620) | 793479703) + ((1566288819 & 284165456) | 1648575546)) - (-1895196318)) ^ (846942590 % 524688209);
        int i12 = (((((~1540846267) & 571107379) | 1484708373) + ((1540846267 & 709108258) | 1568035525)) - (-834164565)) ^ (2037335344 % 1874960596);
        zzp = new zzavg((((((~1245644428) & 268473430) | 2019232319) + ((1245644428 & 2266696) | 1693582250)) - (-827594116)) ^ (1308581515 % 354367395));
        zzo = new zzavg((((((~464837581) & 1181588952) | 603091067) + ((464837581 & 1544523140) | 967967255)) - (-2124025763)) ^ (1295815494 % 753959819));
        zzn = new zzavg(i12);
        zzm = new zzavg(i3);
        zzl = new zzavg(i4);
        zzk = new zzavg(i5);
        zzj = new zzavg(i2);
        zzi = new zzavg(i6);
        zzh = new zzavg(i7);
        zzg = new zzavg(i8);
        zzf = new zzavg(i);
        zze = new zzavg(i9);
        zzd = new zzavg(i10);
        zzc = new zzavg(i11);
        zzb = new zzavg(1);
        zza = new zzavg(0);
    }

    private /* synthetic */ zzavg(int i) {
        this.zzq = i;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        zzaup zzaupVar;
        zzawf zzawfVar;
        int i = ((((~603123090) & 1079339320) | 204100681) + ((603123090 & 1131784560) | 52466888)) - 1316176740;
        int i2 = 1216803069 % 33252481;
        try {
            try {
                try {
                    try {
                        try {
                            switch (this.zzq) {
                                case 0:
                                    return ((zzawa) obj).zza();
                                case 1:
                                    try {
                                        zzavw zzavwVar = ((zzawa) obj).zzb;
                                        long zzm2 = zzavwVar.zzc().zzm();
                                        zzawf zzc2 = zzavwVar.zzc();
                                        List zzo2 = zzc2.zzo();
                                        if (zzm2 < 0) {
                                            zzm2 += zzo2.size();
                                        }
                                        if (zzm2 < 0 || zzm2 >= zzo2.size()) {
                                            throw new zzawd();
                                        }
                                        zzo2.remove((int) zzm2);
                                        zzavwVar.zzb(zzc2);
                                        return Optional.empty();
                                    } catch (zzawd unused) {
                                        zzaupVar = zzaup.zzI;
                                        break;
                                    }
                                case 2:
                                    zzawa zzawaVar = (zzawa) obj;
                                    zzavw zzavwVar2 = zzawaVar.zzb;
                                    zzawf zzc3 = zzavwVar2.zzc();
                                    zzavj zzn2 = zzavwVar2.zzc().zzn();
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    zzc3.zzk(byteArrayOutputStream);
                                    zzawaVar.zzb.zzb(zzawf.zzd(zzn2.zzd(zzavj.zze(byteArrayOutputStream.toByteArray()))));
                                    return Optional.empty();
                                case 3:
                                    zzawa zzawaVar2 = (zzawa) obj;
                                    zzavw zzavwVar3 = zzawaVar2.zzb;
                                    zzawf zzc4 = zzavwVar3.zzc();
                                    zzavj zzn3 = zzavwVar3.zzc().zzn();
                                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                    zzavf.zzb(zzc4.zzm(), new zzawe(byteArrayOutputStream2, i ^ i2), false);
                                    zzawaVar2.zzb.zzb(zzawf.zzd(zzn3.zzd(zzavj.zze(byteArrayOutputStream2.toByteArray()))));
                                    return Optional.empty();
                                case 4:
                                    zzawa zzawaVar3 = (zzawa) obj;
                                    zzawaVar3.zzb.zze(-(zzawaVar3.zzc.zzb().zzb + zzawaVar3.zzd.zze()), zzawaVar3.zzb.zzc());
                                    return Optional.empty();
                                case 5:
                                    zzavw zzavwVar4 = ((zzawa) obj).zzb;
                                    zzavwVar4.zzb(zzawf.zzb(zzavwVar4.zzc().zzm() << ((int) zzavwVar4.zzc().zzm())));
                                    return Optional.empty();
                                case 6:
                                    zzavw zzavwVar5 = ((zzawa) obj).zzb;
                                    zzavwVar5.zzb(zzawf.zzb(zzavwVar5.zzc().zzm() >>> ((int) zzavwVar5.zzc().zzm())));
                                    return Optional.empty();
                                case 7:
                                    zzavw zzavwVar6 = ((zzawa) obj).zzb;
                                    zzavwVar6.zzb(zzawf.zzc(zzavwVar6.zzc().zzq() - zzavwVar6.zzc().zzq()));
                                    return Optional.empty();
                                case 8:
                                    zzavw zzavwVar7 = ((zzawa) obj).zzb;
                                    zzavwVar7.zzb(zzawf.zzb(zzavwVar7.zzc().zzm() - zzavwVar7.zzc().zzm()));
                                    return Optional.empty();
                                case 9:
                                    zzawa zzawaVar4 = (zzawa) obj;
                                    zzavw zzavwVar8 = zzawaVar4.zzb;
                                    long zzm3 = zzavwVar8.zzc().zzm();
                                    zzawf zzc5 = zzavwVar8.zzc();
                                    zzavw zzavwVar9 = zzawaVar4.zzb;
                                    zzawf zzd2 = zzavwVar9.zzd(zzm3);
                                    zzavwVar9.zze(zzm3, zzc5);
                                    zzavwVar9.zzb(zzd2);
                                    return Optional.empty();
                                case 10:
                                    zzawa zzawaVar5 = (zzawa) obj;
                                    zzavw zzavwVar10 = zzawaVar5.zzb;
                                    long zzm4 = zzawaVar5.zzc.zzb().zzb + zzavwVar10.zzc().zzm();
                                    zzawf zzc6 = zzavwVar10.zzc();
                                    zzavw zzavwVar11 = zzawaVar5.zzb;
                                    long j = -zzm4;
                                    zzawf zzd3 = zzavwVar11.zzd(j);
                                    zzavwVar11.zze(j, zzc6);
                                    zzavwVar11.zzb(zzd3);
                                    return Optional.empty();
                                case 11:
                                    zzawa zzawaVar6 = (zzawa) obj;
                                    long zze2 = zzawaVar6.zzc.zzb().zzb + zzawaVar6.zzd.zze();
                                    zzawf zzc7 = zzawaVar6.zzb.zzc();
                                    zzavw zzavwVar12 = zzawaVar6.zzb;
                                    long j2 = -zze2;
                                    zzawf zzd4 = zzavwVar12.zzd(j2);
                                    zzavwVar12.zze(j2, zzc7);
                                    zzavwVar12.zzb(zzd4);
                                    return Optional.empty();
                                case 12:
                                    zzawa zzawaVar7 = (zzawa) obj;
                                    long zzm5 = zzawaVar7.zzb.zzc().zzm();
                                    try {
                                        zzavw zzavwVar13 = zzawaVar7.zzb;
                                        int i3 = ((((~1349029729) & 1683806466) | 298308136) + ((1349029729 & (-199751405)) | (-1830723495))) - 438321650;
                                        int i4 = 1478326644 % 593443203;
                                        if (zzm5 == 0) {
                                            zzawfVar = zzavwVar13.zzc();
                                        } else {
                                            int zza2 = zzavwVar13.zza(zzm5);
                                            zzavwVar13.zzb += i3 ^ i4;
                                            zzawfVar = (zzawf) zzavwVar13.zza.remove(zza2);
                                        }
                                        zzavwVar13.zzb(zzawfVar);
                                        return Optional.empty();
                                    } catch (zzavu unused2) {
                                        zzaupVar = zzaup.zzg;
                                        break;
                                    }
                                case 13:
                                    zzawa zzawaVar8 = (zzawa) obj;
                                    try {
                                        zzavw zzavwVar14 = zzawaVar8.zzb;
                                        long zzm6 = zzavwVar14.zzc().zzm();
                                        long zzm7 = zzavwVar14.zzc().zzm();
                                        zzavt zzavtVar = zzawaVar8.zzc;
                                        zzavo zzavoVar = zzawaVar8.zzd;
                                        zzavtVar.zza(zzavoVar.zzb(), zzm7, zzavtVar.zzb().zzb);
                                        zzavoVar.zza(zzm6);
                                        return Optional.empty();
                                    } catch (zzavm | zzavn unused3) {
                                        zzaupVar = zzaup.zzr;
                                        break;
                                    } catch (zzavr unused4) {
                                        zzaupVar = zzaup.zzB;
                                        break;
                                    } catch (zzavs unused5) {
                                        zzaupVar = zzaup.zzw;
                                        break;
                                    }
                                case 14:
                                    zzawa zzawaVar9 = (zzawa) obj;
                                    try {
                                        zzawaVar9.zzb.zzb(zzawf.zzg(zzawaVar9.zzb.zzc().zzl()));
                                        return Optional.empty();
                                    } catch (zzawc unused6) {
                                        zzaupVar = zzaup.zzp;
                                        break;
                                    }
                                default:
                                    try {
                                        zzavw zzavwVar15 = ((zzawa) obj).zzb;
                                        Iterator it = zzavwVar15.zzc().zzo().iterator();
                                        while (it.hasNext()) {
                                            zzavwVar15.zzb((zzawf) it.next());
                                        }
                                        return Optional.empty();
                                    } catch (zzavv unused7) {
                                        zzaupVar = zzaup.zza;
                                        break;
                                    }
                            }
                        } catch (zzavu unused8) {
                            zzaupVar = zzaup.zzh;
                        }
                    } catch (zzavl | zzavn | zzawc unused9) {
                        zzaupVar = zzaup.zzy;
                    }
                } catch (zzavs | zzavu unused10) {
                    zzaupVar = zzaup.zzx;
                }
            } catch (zzavv e) {
                e = e;
                throw new AssertionError(zzavh.zza("CEiv6BFfPnitUE+D"), e);
            }
        } catch (zzawc unused11) {
            zzaupVar = zzaup.zzk;
        } catch (IOException e2) {
            e = e2;
            throw new AssertionError(zzavh.zza("CEiv6BFfPnitUE+D"), e);
        }
        return Optional.of(zzaupVar);
    }
}
