package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.safedk.android.analytics.brandsafety.m;
import io.sentry.profilemeasurements.ProfileMeasurement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Optional;
import org.apache.cordova.globalization.Globalization;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final /* synthetic */ class zzavc implements zzavx {
    public static final /* synthetic */ zzavc zza;
    public static final /* synthetic */ zzavc zzb;
    public static final /* synthetic */ zzavc zzc;
    public static final /* synthetic */ zzavc zzd;
    public static final /* synthetic */ zzavc zze;
    public static final /* synthetic */ zzavc zzf;
    public static final /* synthetic */ zzavc zzg;
    public static final /* synthetic */ zzavc zzh;
    public static final /* synthetic */ zzavc zzi;
    public static final /* synthetic */ zzavc zzj;
    public static final /* synthetic */ zzavc zzk;
    public static final /* synthetic */ zzavc zzl;
    public static final /* synthetic */ zzavc zzm;
    public static final /* synthetic */ zzavc zzn;
    public static final /* synthetic */ zzavc zzo;
    public static final /* synthetic */ zzavc zzp;
    public static final /* synthetic */ zzavc zzq;
    public static final /* synthetic */ zzavc zzr;
    public static final /* synthetic */ zzavc zzs;
    public static final /* synthetic */ zzavc zzt;
    public static final /* synthetic */ zzavc zzu;
    private final /* synthetic */ int zzv;

    static {
        int i = (((((~1272469786) & 1097507524) | 723881402) + ((1272469786 & 1078604356) | 746642480)) - (-1830851820)) ^ (1544617505 % 243268139);
        int i2 = (((((~1722060049) & 1087578905) | 70644109) + ((1722060049 & 1625428690) | 673239279)) - 1747544094) ^ (860516127 % 777720504);
        int i3 = (((((~168057522) & 567809569) | 2007585082) + ((168057522 & 1112917761) | 1200484666)) - (-1753249985)) ^ (1761250573 % 1089653714);
        int i4 = (((((~386839851) & 502322088) | 1879579687) + ((386839851 & 1341449096) | 1376723987)) - (-1804183292)) ^ (2118801173 % 1119399015);
        int i5 = (((((~627992393) & 399075139) | 1263590114) + ((627992393 & 1418280193) | 1644468862)) - (-1502362592)) ^ (1449228398 % 989241888);
        int i6 = (((((~1687776787) & 1627592001) | 771768986) + ((1687776787 & 1226806633) | 136094264)) - 1910482017) ^ (992028067 % 180785147);
        int i7 = (((((~1111088131) & 1881672142) | 1222111317) + ((1111088131 & 807995786) | 38123124)) - 1508183881) ^ (1348361729 % 788380902);
        zzu = new zzavc((((((~636453333) & 363983206) | 1075208291) + ((636453333 & 2146013964) | 1783382730)) - (-1139191409)) ^ (1564003050 % 99885196));
        zzt = new zzavc((((((~338346092) & 646267944) | 2030210865) + ((338346092 & 109431182) | 1768591350)) - (-956795148)) ^ (1912163036 % 671068506));
        zzs = new zzavc((((((~1374600938) & 269492393) | 962980710) + ((1374600938 & (-2079309685)) | (-1096234186))) - (-724963331)) ^ (1587992726 % 995234140));
        zzr = new zzavc(i7);
        zzq = new zzavc(i4);
        zzp = new zzavc(i5);
        zzavc zzavcVar = new zzavc(i6);
        int i8 = (((((~406011017) & 1269108768) | 73167649) + ((406011017 & 2074166272) | 872470299)) - 1878158194) ^ (1615935710 % 639806732);
        int i9 = (((((~257675105) & 286888065) | 1680106172) + ((257675105 & 353998857) | 216033710)) - (-2120570644)) ^ (2033505236 % 29777560);
        int i10 = (((((~2137100237) & 243279585) | 1476690352) + ((2137100237 & 1182836297) | 1215531406)) - (-1785612177)) ^ (1251300606 % 959372260);
        int i11 = (((((~1280321648) & 1509448282) | 1074834725) + ((1280321648 & 434689663) | 67544101)) - 1396684682) ^ (1309383303 % 1129033333);
        int i12 = (((((~1635905385) & 436500164) | 1627617040) + ((1635905385 & 1527677388) | 1092341018)) - (-1251599253)) ^ (1253207672 % 570073850);
        int i13 = (((((~2058657199) & 1077280871) | 426331554) + ((2058657199 & 1242960213) | 260153146)) - 1453981149) ^ (711845894 % 404158660);
        int i14 = (((((~2077486715) & 1348527492) | 196553360) + ((2077486715 & 1547749134) | 218380923)) - 1621461405) ^ (1713258270 % 1573363368);
        int i15 = (((((~1194953865) & 541827704) | 1410336387) + ((1194953865 & 676044922) | 221517442)) - 2090845028) ^ (485560280 % 402724286);
        int i16 = (((((~1424268980) & 433259076) | 136627722) + ((1424268980 & 299303110) | 33824130)) - 448747429) ^ (1129566413 % 184803526);
        zzo = zzavcVar;
        zzn = new zzavc(i3);
        zzm = new zzavc(i8);
        zzl = new zzavc(i9);
        zzk = new zzavc(i10);
        zzj = new zzavc(i2);
        zzi = new zzavc(i11);
        zzh = new zzavc(i12);
        zzg = new zzavc(i13);
        zzf = new zzavc(i);
        zze = new zzavc(i14);
        zzd = new zzavc(i15);
        zzc = new zzavc(i16);
        zzb = new zzavc(1);
        zza = new zzavc(0);
    }

    private /* synthetic */ zzavc(int i) {
        this.zzv = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        zzaup zzaupVar;
        Object obj2;
        zzavw zzavwVar;
        zzawf zza2;
        zzaup zzaupVar2;
        Class<?> cls;
        zzaup zzaupVar3;
        long j = 1;
        int i = 0;
        try {
            try {
                try {
                    try {
                        switch (this.zzv) {
                            case 0:
                                zzavw zzavwVar2 = ((zzawa) obj).zzb;
                                zzavwVar2.zzb(zzawf.zzb(zzavwVar2.zzc().zzm() + zzavwVar2.zzc().zzm()));
                                return Optional.empty();
                            case 1:
                                zzavw zzavwVar3 = ((zzawa) obj).zzb;
                                zzavwVar3.zzb(zzawf.zzc(zzavwVar3.zzc().zzq() + zzavwVar3.zzc().zzq()));
                                return Optional.empty();
                            case 2:
                                zzavw zzavwVar4 = ((zzawa) obj).zzb;
                                zzavwVar4.zzb(zzawf.zzd(zzavwVar4.zzc().zzn().zzd(zzavwVar4.zzc().zzn())));
                                return Optional.empty();
                            case 3:
                                zzawa zzawaVar = (zzawa) obj;
                                try {
                                    long zze2 = zzawaVar.zzd.zze();
                                    for (long j2 = 0; j2 < zze2; j2++) {
                                        zzawaVar.zzb.zzb(zzawf.zza(null));
                                    }
                                    return Optional.empty();
                                } catch (zzavv unused) {
                                    zzaupVar = zzaup.zza;
                                    return Optional.of(zzaupVar);
                                }
                            case 4:
                                zzavw zzavwVar5 = ((zzawa) obj).zzb;
                                zzavwVar5.zzb(zzawf.zzb(zzavwVar5.zzc().zzm() & zzavwVar5.zzc().zzm()));
                                return Optional.empty();
                            case 5:
                                long[] jArr = {916768482, 1259538933, 805446160, -15648283, -1266372608, 883303887, 6538657, 384868448, 102194872};
                                long j3 = jArr[0];
                                long j4 = jArr[1];
                                long j5 = jArr[2];
                                long j6 = jArr[3];
                                long j7 = jArr[4];
                                long j8 = jArr[5];
                                long j9 = jArr[6];
                                long j10 = jArr[7];
                                long j11 = j9 + (((((~j3) & j4) | j5) + ((j3 & j6) | j7)) - j8);
                                long j12 = j10 % 102194872;
                                zzavw zzavwVar6 = ((zzawa) obj).zzb;
                                zzavwVar6.zzb(zzawf.zzb(zzavwVar6.zzc().zzm() ^ (j11 ^ j12)));
                                return Optional.empty();
                            case 6:
                                zzavw zzavwVar7 = ((zzawa) obj).zzb;
                                zzavwVar7.zzb(zzawf.zzb(zzavwVar7.zzc().zzm() | zzavwVar7.zzc().zzm()));
                                return Optional.empty();
                            case 7:
                                zzavw zzavwVar8 = ((zzawa) obj).zzb;
                                zzavwVar8.zzb(zzawf.zzb(zzavwVar8.zzc().zzm() ^ zzavwVar8.zzc().zzm()));
                                return Optional.empty();
                            case 8:
                                zzawa zzawaVar2 = (zzawa) obj;
                                try {
                                    long zzm2 = zzawaVar2.zzb.zzc().zzm();
                                    zzavt zzavtVar = zzawaVar2.zzc;
                                    zzavo zzavoVar = zzawaVar2.zzd;
                                    zzavtVar.zza(zzavoVar.zzb(), 0L, r2.zzb);
                                    zzavoVar.zza(zzm2);
                                    return Optional.empty();
                                } catch (zzavm | zzavn unused2) {
                                    zzaupVar = zzaup.zzr;
                                    return Optional.of(zzaupVar);
                                } catch (zzavr unused3) {
                                    zzaupVar = zzaup.zzB;
                                    return Optional.of(zzaupVar);
                                }
                            case 9:
                                zzawa zzawaVar3 = (zzawa) obj;
                                try {
                                    zzavw zzavwVar9 = zzawaVar3.zzb;
                                    long zzm3 = zzavwVar9.zzc().zzm();
                                    List zzo2 = zzavwVar9.zzc().zzo();
                                    int size = zzo2.size();
                                    Object zzh2 = zzavwVar9.zzc().zzh();
                                    Object zzl2 = zzavwVar9.zzc().zzl();
                                    if (zzl2 instanceof Method) {
                                        Method method = (Method) zzl2;
                                        Class<?>[] parameterTypes = method.getParameterTypes();
                                        if (parameterTypes.length == size) {
                                            Object[] objArr = new Object[size];
                                            if (zzh2 instanceof Constructor) {
                                                Class<?>[] parameterTypes2 = ((Constructor) zzh2).getParameterTypes();
                                                int length = parameterTypes2.length;
                                                Object[] objArr2 = new Object[length];
                                                List zzo3 = ((zzawf) zzo2.get(0)).zzo();
                                                if (zzo3.size() == length) {
                                                    for (int i2 = 0; i2 < zzo3.size(); i2++) {
                                                        objArr2[i2] = ((zzawf) zzo3.get(i2)).zzi(parameterTypes2[i2]);
                                                    }
                                                    obj2 = null;
                                                    objArr[0] = objArr2;
                                                }
                                            } else {
                                                obj2 = null;
                                                while (i < size) {
                                                    objArr[i] = ((zzawf) zzo2.get(i)).zzi(parameterTypes[i]);
                                                    i++;
                                                }
                                            }
                                            try {
                                                Object invoke = method.invoke(zzh2, objArr);
                                                if (method.getReturnType() == Void.class || method.getReturnType() == Void.TYPE) {
                                                    zzavwVar = zzawaVar3.zzb;
                                                    zza2 = zzawf.zza(obj2);
                                                } else if (zzm3 != 0) {
                                                    zzavwVar = zzawaVar3.zzb;
                                                    zza2 = zzawf.zzg(invoke);
                                                } else {
                                                    zzavwVar = zzawaVar3.zzb;
                                                    zza2 = zzawf.zza(invoke);
                                                }
                                                zzavwVar.zzb(zza2);
                                                return Optional.empty();
                                            } catch (Throwable unused4) {
                                                zzaupVar = zzaup.zzq;
                                                return Optional.of(zzaupVar);
                                            }
                                        }
                                    }
                                    return Optional.of(zzaup.zzp);
                                } catch (zzawc unused5) {
                                    zzaupVar = zzaup.zzp;
                                }
                                break;
                            case 10:
                                int i3 = ((((~2084546560) & 73475461) | 438076064) + ((2084546560 & 611428101) | 2023412224)) - (-1830321789);
                                int i4 = 1073781763 % 1003463633;
                                int i5 = ((((~461273879) & 107429921) | 378966045) + ((461273879 & 283197472) | 1937909388)) - 2133058944;
                                int i6 = 1917305981 % 575705360;
                                zzawa zzawaVar4 = (zzawa) obj;
                                zzavw zzavwVar10 = zzawaVar4.zzb;
                                int intExact = Math.toIntExact(zzavwVar10.zzc().zzm());
                                zzavj zzn2 = zzavwVar10.zzc().zzn();
                                zzavj zzn3 = zzavwVar10.zzc().zzn();
                                if (zzn2.zza.length != (i3 ^ i4)) {
                                    return Optional.of(zzaup.zzH);
                                }
                                int[] iArr = new int[i5 ^ i6];
                                ByteBuffer.wrap(zzn2.zza()).asIntBuffer().get(iArr);
                                zzavb zzavbVar = new zzavb(intExact, iArr);
                                int i7 = ((((~1183912267) & 781500673) | 1683555012) + ((1183912267 & 180666625) | 541077750)) - (-1949988574);
                                int i8 = 1527793660 % 245277883;
                                int i9 = ((((~95266356) & 568641509) | 183483904) + ((95266356 & 553669093) | 504469010)) - 874379764;
                                int i10 = 2026478004 % 1659239833;
                                byte[] zza3 = zzn3.zza();
                                int i11 = (((((~1787189168) & 1360184381) | 611517270) + ((1787189168 & 1426637867) | 612056018)) - 1771476931) ^ (1821115873 % 1010014811);
                                byte[] bArr = new byte[i11];
                                int i12 = 0;
                                while (i12 < zza3.length) {
                                    if (i12 % i11 != 0) {
                                        if (i12 == 0) {
                                            i12 = 0;
                                        } else {
                                            int i13 = i9 ^ i10;
                                            zza3[i12] = (byte) (((zza3[i12] ^ bArr[i12 % i11]) << i13) >> i13);
                                            i12++;
                                        }
                                    }
                                    zzavbVar.zza(i12 >>> (i7 ^ i8), bArr);
                                    int i132 = i9 ^ i10;
                                    zza3[i12] = (byte) (((zza3[i12] ^ bArr[i12 % i11]) << i132) >> i132);
                                    i12++;
                                }
                                zzawaVar4.zzb.zzb(zzawf.zzd(zzavj.zze(zza3)));
                                return Optional.empty();
                            case 11:
                                zzavw zzavwVar11 = ((zzawa) obj).zzb;
                                double zzq2 = zzavwVar11.zzc().zzq();
                                double zzq3 = zzavwVar11.zzc().zzq();
                                if (zzq2 == 0.0d) {
                                    zzaupVar2 = zzaup.zzF;
                                    return Optional.of(zzaupVar2);
                                }
                                zzavwVar11.zzb(zzawf.zzc(zzq3 / zzq2));
                                return Optional.empty();
                            case 12:
                                zzavw zzavwVar12 = ((zzawa) obj).zzb;
                                long zzm4 = zzavwVar12.zzc().zzm();
                                long zzm5 = zzavwVar12.zzc().zzm();
                                if (zzm4 == 0) {
                                    zzaupVar2 = zzaup.zzF;
                                    return Optional.of(zzaupVar2);
                                }
                                zzavwVar12.zzb(zzawf.zzb(zzm5 / zzm4));
                                return Optional.empty();
                            case 13:
                                try {
                                    ((zzawa) obj).zzb.zzc();
                                    return Optional.empty();
                                } catch (zzavu unused6) {
                                    zzaupVar = zzaup.zzA;
                                    return Optional.of(zzaupVar);
                                }
                            case 14:
                                zzawa zzawaVar5 = (zzawa) obj;
                                long zzm6 = zzawaVar5.zzb.zzc().zzm();
                                zzavw zzavwVar13 = zzawaVar5.zzb;
                                zzavwVar13.zzb(zzawf.zzj(zzavwVar13.zzd(zzm6)));
                                return Optional.empty();
                            case 15:
                                zzawa zzawaVar6 = (zzawa) obj;
                                long zzm7 = zzawaVar6.zzc.zzb().zzb + zzawaVar6.zzb.zzc().zzm();
                                zzavw zzavwVar14 = zzawaVar6.zzb;
                                zzavwVar14.zzb(zzawf.zzj(zzavwVar14.zzd(-zzm7)));
                                return Optional.empty();
                            case 16:
                                zzawa zzawaVar7 = (zzawa) obj;
                                long zze3 = zzawaVar7.zzc.zzb().zzb + zzawaVar7.zzd.zze();
                                zzavw zzavwVar15 = zzawaVar7.zzb;
                                zzavwVar15.zzb(zzawf.zzj(zzavwVar15.zzd(-zze3)));
                                return Optional.empty();
                            case 17:
                                try {
                                    zzavw zzavwVar16 = ((zzawa) obj).zzb;
                                    if (new zzawb(true).compare(zzavwVar16.zzc(), zzavwVar16.zzc()) != 0) {
                                        j = 0;
                                    }
                                    zzavwVar16.zzb(zzawf.zzb(j));
                                    return Optional.empty();
                                } catch (IllegalArgumentException unused7) {
                                    zzaupVar = zzaup.zzd;
                                    return Optional.of(zzaupVar);
                                }
                            case 18:
                                try {
                                    zzavw zzavwVar17 = ((zzawa) obj).zzb;
                                    String zzc2 = zzavwVar17.zzc().zzn().zzc();
                                    switch (zzc2.hashCode()) {
                                        case -1325958191:
                                            if (zzc2.equals("double")) {
                                                cls = Double.TYPE;
                                                break;
                                            }
                                            cls = Class.forName(zzc2);
                                            break;
                                        case 104431:
                                            if (zzc2.equals(m.w)) {
                                                cls = Integer.TYPE;
                                                break;
                                            }
                                            cls = Class.forName(zzc2);
                                            break;
                                        case 3039496:
                                            if (zzc2.equals(ProfileMeasurement.UNIT_BYTES)) {
                                                cls = Byte.TYPE;
                                                break;
                                            }
                                            cls = Class.forName(zzc2);
                                            break;
                                        case 3052374:
                                            if (zzc2.equals("char")) {
                                                cls = Character.TYPE;
                                                break;
                                            }
                                            cls = Class.forName(zzc2);
                                            break;
                                        case 3327612:
                                            if (zzc2.equals(Globalization.LONG)) {
                                                cls = Long.TYPE;
                                                break;
                                            }
                                            cls = Class.forName(zzc2);
                                            break;
                                        case 3625364:
                                            if (zzc2.equals("void")) {
                                                cls = Void.TYPE;
                                                break;
                                            }
                                            cls = Class.forName(zzc2);
                                            break;
                                        case 64711720:
                                            if (zzc2.equals("boolean")) {
                                                cls = Boolean.TYPE;
                                                break;
                                            }
                                            cls = Class.forName(zzc2);
                                            break;
                                        case 97526364:
                                            if (zzc2.equals(TypedValues.Custom.S_FLOAT)) {
                                                cls = Float.TYPE;
                                                break;
                                            }
                                            cls = Class.forName(zzc2);
                                            break;
                                        case 109413500:
                                            if (zzc2.equals("short")) {
                                                cls = Short.TYPE;
                                                break;
                                            }
                                            cls = Class.forName(zzc2);
                                            break;
                                        default:
                                            cls = Class.forName(zzc2);
                                            break;
                                    }
                                    zzavwVar17.zzb(zzawf.zza(cls));
                                    return Optional.empty();
                                } catch (zzawc unused8) {
                                    zzaupVar = zzaup.zzl;
                                    return Optional.of(zzaupVar);
                                } catch (ClassNotFoundException unused9) {
                                    zzaupVar = zzaup.zzm;
                                    return Optional.of(zzaupVar);
                                }
                            case 19:
                                try {
                                    zzavw zzavwVar18 = ((zzawa) obj).zzb;
                                    List zzo4 = zzavwVar18.zzc().zzo();
                                    Class<?>[] clsArr = new Class[zzo4.size()];
                                    while (true) {
                                        if (i < zzo4.size()) {
                                            Object zzl3 = ((zzawf) zzo4.get(i)).zzl();
                                            if (zzl3 instanceof Class) {
                                                clsArr[i] = (Class) zzl3;
                                                i++;
                                            } else {
                                                zzaupVar3 = zzaup.zzn;
                                            }
                                        } else {
                                            String zzc3 = zzavwVar18.zzc().zzn().zzc();
                                            Object zzl4 = zzavwVar18.zzc().zzl();
                                            if (zzl4 instanceof Class) {
                                                zzavwVar18.zzb(zzawf.zza(((Class) zzl4).getMethod(zzc3, clsArr)));
                                                return Optional.empty();
                                            }
                                            zzaupVar3 = zzaup.zzn;
                                        }
                                    }
                                    return Optional.of(zzaupVar3);
                                } catch (zzawc unused10) {
                                    zzaupVar = zzaup.zzn;
                                    return Optional.of(zzaupVar);
                                } catch (NoSuchMethodException unused11) {
                                    zzaupVar = zzaup.zzo;
                                    return Optional.of(zzaupVar);
                                } catch (SecurityException unused12) {
                                    zzaupVar = zzaup.zzC;
                                    return Optional.of(zzaupVar);
                                }
                            default:
                                int i14 = ((((~306851320) & 2040670728) | 1372152390) + ((306851320 & (-1473639347)) | (-2036492681))) - 244167092;
                                int i15 = 1764892438 % 764851988;
                                zzavw zzavwVar19 = ((zzawa) obj).zzb;
                                long zzm8 = zzavwVar19.zzc().zzm();
                                zzawf zzc4 = zzavwVar19.zzc();
                                zzawf zzc5 = zzavwVar19.zzc();
                                int i16 = zzc5.zza;
                                int i17 = (i14 ^ i15) + i16;
                                if (i16 == 0) {
                                    throw null;
                                }
                                if (i17 == 3) {
                                    zzavj zzn4 = zzc5.zzn();
                                    int i18 = ((((~284327308) & 44384696) | 1708231444) + ((284327308 & 1647591593) | 1951966997)) - (-1088446899);
                                    int i19 = 2085308422 % 531900034;
                                    if (zzm8 < 0) {
                                        zzm8 += zzn4.zza.length;
                                    }
                                    if (zzc4.zza != (i18 ^ i19)) {
                                        throw new zzawc();
                                    }
                                    if (zzm8 >= 0 && zzm8 < zzn4.zza.length) {
                                        char charAt = zzn4.zzc().charAt((int) zzm8);
                                        StringBuilder sb = new StringBuilder(String.valueOf(charAt).length());
                                        sb.append(charAt);
                                        zzc4 = zzawf.zzd(zzavj.zzf(sb.toString()));
                                    }
                                } else {
                                    if (i17 != 4) {
                                        throw new zzawc();
                                    }
                                    List zzo5 = zzc5.zzo();
                                    if (zzm8 < 0) {
                                        zzm8 += zzo5.size();
                                    }
                                    if (zzm8 >= 0 && zzm8 < zzo5.size()) {
                                        zzc4 = (zzawf) zzo5.get((int) zzm8);
                                    }
                                }
                                zzavwVar19.zzb(zzc4);
                                return Optional.empty();
                        }
                    } catch (zzavl | zzavn | zzawc unused13) {
                        zzaupVar = zzaup.zzy;
                    }
                } catch (zzavv e) {
                    throw new AssertionError(zzavh.zza("CEiv6BFfPnitUE+D"), e);
                }
            } catch (zzavs | zzavu unused14) {
                zzaupVar = zzaup.zzx;
            }
        } catch (zzavu unused15) {
            zzaupVar = zzaup.zzf;
        }
    }
}
