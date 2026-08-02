package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.util.Base64;
import com.blaze.blazesdk.ads.models.ui.BlazeAdProvider;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.internal.cast.zzyh;
import com.ironsource.U3;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.MmaEvent;
import com.sofascore.model.mvvm.model.Time;
import com.sofascore.model.mvvm.model.Venue;
import com.sofascore.results.R;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.TemporalAmount;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class tnf implements qs3, lkk, zzyh, fn5, yb2, gg3, op3, pl6, q0g {
    public static Cipher i;
    public final /* synthetic */ int a;
    public static final tnf b = new tnf(1);
    public static final tnf c = new tnf(2);
    public static final /* synthetic */ tnf d = new tnf(3);
    public static final tnf e = new tnf(5);
    public static final tnf f = new tnf(6);
    public static final tnf g = new tnf(7);
    public static final tnf h = new tnf(8);
    public static final Object j = new Object();
    public static final Object k = new Object();
    public static final tnf l = new tnf(10);
    public static final tnf m = new tnf(11);
    public static final tnf n = new tnf(12);
    public static final tnf o = new tnf(13);
    public static final tnf p = new tnf(14);

    public tnf() {
        this.a = 27;
        av9 av9Var = hv9.b;
        vvf vvfVar = vvf.e;
    }

    public static String c(StringBuilder sb) {
        int length = sb.length();
        if (length == 0) {
            a70.r("StringBuilder must not be empty");
            return null;
        }
        int charAt = (sb.charAt(0) << 18) + ((length >= 2 ? sb.charAt(1) : (char) 0) << '\f') + ((length >= 3 ? sb.charAt(2) : (char) 0) << 6) + (length >= 4 ? sb.charAt(3) : (char) 0);
        char c2 = (char) ((charAt >> 16) & 255);
        char c3 = (char) ((charAt >> 8) & 255);
        char c4 = (char) (charAt & 255);
        StringBuilder sb2 = new StringBuilder(3);
        sb2.append(c2);
        if (length >= 2) {
            sb2.append(c3);
        }
        if (length >= 3) {
            sb2.append(c4);
        }
        return sb2.toString();
    }

    public static ucd g(String str) {
        str.getClass();
        ucd ucdVar = new ucd(str);
        hw9 hw9Var = ucdVar.a.a[0];
        hw9Var.d = (byte) 1;
        hw9Var.a = new mz0(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 480, (byte) 7, ucd.g, null, 156);
        hw9Var.b = new xok(ucd.h, new byte[]{7});
        ucdVar.b = new p53[]{new p53(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 480)};
        return ucdVar;
    }

    public static ucd h(String str) {
        str.getClass();
        ucd ucdVar = new ucd(str);
        hw9 hw9Var = ucdVar.a.a[0];
        hw9Var.d = (byte) 1;
        hw9Var.b = new xok(ucd.h, new byte[]{7});
        ucdVar.b = new p53[]{new p53(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 480)};
        td4.v0(ucdVar, 4);
        return ucdVar;
    }

    public static uae j(String str, boolean z) {
        str.getClass();
        gc2 gc2Var = i.a;
        x52 x52Var = new x52();
        x52Var.g1(str);
        return i.d(x52Var, z);
    }

    public static uae k(File file) {
        String str = uae.b;
        file.getClass();
        String file2 = file.toString();
        file2.getClass();
        return j(file2, false);
    }

    public static String n(Context context, Event event) {
        context.getClass();
        Venue venue = event.getVenue();
        if (venue == null) {
            return event.getTournament().getLocation();
        }
        Country country = venue.getCountry();
        String c2 = tv3.c(context, country != null ? country.getName() : null);
        return CollectionsKt.f0(ph0.x(new String[]{venue.getStadium().getName(), venue.getCity().getName(), StringsKt.R(c2) ? null : c2}), ", ", null, null, null, 62);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String o(Context context, MmaEvent mmaEvent) {
        String str;
        context.getClass();
        mmaEvent.getClass();
        Integer finalRound = mmaEvent.getFinalRound();
        String string = context.getString(R.string.mma_status_round_short, Integer.valueOf(finalRound != null ? finalRound.intValue() : 1));
        string.getClass();
        Time time = mmaEvent.getTime();
        if (time != null) {
            Integer finalRound2 = mmaEvent.getFinalRound();
            Long periodTime = time.getPeriodTime(finalRound2 != null ? finalRound2.intValue() : 1);
            if (periodTime != null) {
                int longValue = (int) periodTime.longValue();
                int i2 = longValue / 60;
                str = String.format(dla.d(), "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i2), Integer.valueOf(longValue - (i2 * 60))}, 2));
                return str == null ? lnb.o(string, " | ", str) : string;
            }
        }
        str = null;
        if (str == null) {
        }
    }

    public static int p(String str) {
        str.getClass();
        switch (str.hashCode()) {
            case -2052954472:
                return !str.equals("submission_attempts_by_zones_avg") ? R.string.undefined : R.string.submission_attempts_by_zones_avg;
            case -2014641838:
                return !str.equals("submission_attempts_by_opponents_average") ? R.string.undefined : R.string.sub_attempts_by_opponents;
            case -1909310018:
                return !str.equals("transitions") ? R.string.undefined : R.string.transitions_mma;
            case -1779775739:
                return !str.equals("submission_attempts_by_zones") ? R.string.undefined : R.string.submission_attempts_by_zones;
            case -1705062435:
                return !str.equals("strikes_by_zones") ? R.string.undefined : R.string.strikes_by_zones;
            case -1568801351:
                return !str.equals("right_arm") ? R.string.undefined : R.string.right_arm;
            case -1568791189:
                return !str.equals("right_leg") ? R.string.undefined : R.string.right_leg;
            case -1357704141:
                return !str.equals("clinch") ? R.string.undefined : R.string.clinch;
            case -1237460601:
                return !str.equals("ground") ? R.string.undefined : R.string.ground;
            case -1194214923:
                return !str.equals("significant_strikes") ? R.string.undefined : R.string.significant_strikes;
            case -1165568436:
                return !str.equals("grappling") ? R.string.undefined : R.string.grappling;
            case -995071697:
                return !str.equals("control_in_position_overall") ? R.string.undefined : R.string.control_in_position_overall;
            case -909159058:
                return !str.equals("landed_all_strikes") ? R.string.undefined : R.string.mma_landed_all_strikes;
            case -818714523:
                return !str.equals("control_in_position_ground") ? R.string.undefined : R.string.control_in_ground_position_mma_stat;
            case -676960992:
                return !str.equals("transitions_succeeded") ? R.string.undefined : R.string.transitions_succeeded;
            case -550483487:
                return !str.equals("total_attempts") ? R.string.undefined : R.string.total_attempts;
            case 3029410:
                return !str.equals("body") ? R.string.undefined : R.string.body;
            case 3198432:
                return !str.equals("head") ? R.string.undefined : R.string.head;
            case 3291718:
                return !str.equals("kick") ? R.string.undefined : R.string.kick;
            case 3317797:
                return !str.equals("legs") ? R.string.undefined : R.string.legs;
            case 43069095:
                return !str.equals("submissions") ? R.string.undefined : R.string.submissions;
            case 94636932:
                return !str.equals("choke") ? R.string.undefined : R.string.choke;
            case 107028782:
                return !str.equals("punch") ? R.string.undefined : R.string.punch;
            case 202462141:
                return !str.equals("knockdowns") ? R.string.undefined : R.string.knockdowns;
            case 288459765:
                return !str.equals("distance") ? R.string.undefined : R.string.distance;
            case 410221011:
                return !str.equals("significant_strikes_average") ? R.string.undefined : R.string.significant_strike_avg;
            case 438277382:
                return !str.equals("total_strikes") ? R.string.undefined : R.string.total_strikes;
            case 958350060:
                return !str.equals("grappling_per_15_min") ? R.string.undefined : R.string.grappling_per_min;
            case 961948627:
                return !str.equals("strikes_by_position") ? R.string.undefined : R.string.strikes_by_position;
            case 966455018:
                return !str.equals("significant_strikes_landed_by_zones") ? R.string.undefined : R.string.strikes_landed_by_zones;
            case 998220285:
                return !str.equals("types_of_strikes_average") ? R.string.undefined : R.string.types_of_strikes_avg;
            case 1186089465:
                return !str.equals("position_statistics") ? R.string.undefined : R.string.position_statistics;
            case 1268711712:
                return !str.equals("average_time_in_position_per_round") ? R.string.undefined : R.string.avg_time_in_position;
            case 1268864801:
                return !str.equals("control_in_position") ? R.string.undefined : R.string.control_in_position;
            case 1293163653:
                return !str.equals("submissions_average") ? R.string.undefined : R.string.mma_submissions_average;
            case 1382297500:
                return !str.equals("striking_per_round") ? R.string.undefined : R.string.striking_per_round;
            case 1468337847:
                return !str.equals("submission_attempts_average") ? R.string.undefined : R.string.submission_attempts_avg;
            case 1487369074:
                return !str.equals("position_statistics_live") ? R.string.undefined : R.string.position_statistics;
            case 1503524842:
                return !str.equals("takedowns") ? R.string.undefined : R.string.takedowns_mma;
            case 1630597832:
                return !str.equals("takedowns_average") ? R.string.undefined : R.string.takedowns_avg;
            case 1718742564:
                return !str.equals("left_arm") ? R.string.undefined : R.string.left_arm;
            case 1718752726:
                return !str.equals("left_leg") ? R.string.undefined : R.string.left_leg;
            case 1819778193:
                return !str.equals("time_in_position") ? R.string.undefined : R.string.time_in_position;
            case 1877717744:
                return !str.equals("success_attempted") ? R.string.undefined : R.string.success_attempted;
            default:
                return R.string.undefined;
        }
    }

    public static String q(Context context, String str) {
        Object obj;
        String string;
        context.getClass();
        Iterator<E> it = t5l.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((t5l) obj).a.equals(str)) {
                break;
            }
        }
        t5l t5lVar = (t5l) obj;
        if (t5lVar != null && (string = context.getString(t5lVar.b)) != null) {
            return string;
        }
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char charAt = str.charAt(0);
        Locale locale = Locale.US;
        locale.getClass();
        sb.append((Object) CharsKt.c(charAt, locale));
        sb.append(str.substring(1));
        return sb.toString();
    }

    public static boolean r(Event event) {
        event.getClass();
        Long endTimestamp = event.getEndTimestamp();
        if (endTimestamp != null) {
            long longValue = endTimestamp.longValue();
            Instant now = Instant.now();
            Instant ofEpochSecond = Instant.ofEpochSecond(longValue);
            Instant minus = now.minus((TemporalAmount) Duration.ofHours(24L));
            return ofEpochSecond.isAfter(minus) || ofEpochSecond.equals(minus);
        }
        long startTimestamp = event.getStartTimestamp();
        Instant now2 = Instant.now();
        Instant ofEpochSecond2 = Instant.ofEpochSecond(startTimestamp);
        Instant minus2 = now2.minus((TemporalAmount) Duration.ofHours(24L));
        return ofEpochSecond2.isAfter(minus2) || ofEpochSecond2.equals(minus2);
    }

    public static String s(byte[] bArr, byte[] bArr2) {
        byte[] doFinal;
        byte[] iv;
        int length = bArr.length;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (j) {
                u().init(1, secretKeySpec, (SecureRandom) null);
                doFinal = u().doFinal(bArr2);
                iv = u().getIV();
            }
            int length2 = doFinal.length + iv.length;
            ByteBuffer allocate = ByteBuffer.allocate(length2);
            allocate.put(iv).put(doFinal);
            allocate.flip();
            byte[] bArr3 = new byte[length2];
            allocate.get(bArr3);
            return Base64.encodeToString(bArr3, 2);
        } catch (InvalidKeyException e2) {
            throw new upo(e2);
        } catch (NoSuchAlgorithmException e3) {
            throw new upo(e3);
        } catch (BadPaddingException e4) {
            throw new upo(e4);
        } catch (IllegalBlockSizeException e5) {
            throw new upo(e5);
        } catch (NoSuchPaddingException e6) {
            throw new upo(e6);
        }
    }

    public static byte[] t(String str, byte[] bArr) {
        byte[] doFinal;
        int length = bArr.length;
        try {
            byte[] decode = Base64.decode(str, 2);
            if (decode.length == 0 && str.length() > 0) {
                throw new IllegalArgumentException("Unable to decode ".concat(str));
            }
            int length2 = decode.length;
            if (length2 <= 16) {
                throw new upo();
            }
            ByteBuffer allocate = ByteBuffer.allocate(length2);
            allocate.put(decode);
            allocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[length2 - 16];
            allocate.get(bArr2);
            allocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (j) {
                u().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                doFinal = u().doFinal(bArr3);
            }
            return doFinal;
        } catch (IllegalArgumentException e2) {
            throw new upo(e2);
        } catch (InvalidAlgorithmParameterException e3) {
            throw new upo(e3);
        } catch (InvalidKeyException e4) {
            throw new upo(e4);
        } catch (NoSuchAlgorithmException e5) {
            throw new upo(e5);
        } catch (BadPaddingException e6) {
            throw new upo(e6);
        } catch (IllegalBlockSizeException e7) {
            throw new upo(e7);
        } catch (NoSuchPaddingException e8) {
            throw new upo(e8);
        }
    }

    public static final Cipher u() {
        Cipher cipher;
        synchronized (k) {
            try {
                cipher = i;
                if (cipher == null) {
                    cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                    i = cipher;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cipher;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Serializable a(Context context, sq3 sq3Var) {
        nul nulVar;
        int i2;
        String obj;
        String str;
        AdvertisingIdClient.Info info;
        if (sq3Var instanceof nul) {
            nulVar = (nul) sq3Var;
            int i3 = nulVar.w;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                nulVar.w = i3 - Integer.MIN_VALUE;
                Object obj2 = nulVar.u;
                lu3 lu3Var = lu3.a;
                i2 = nulVar.w;
                String str2 = null;
                Object[] objArr = 0;
                if (i2 != 0) {
                    y6a.M(obj2);
                    String packageName = context != null ? context.getPackageName() : null;
                    if (packageName == null) {
                        packageName = "";
                    }
                    if (context != null) {
                        try {
                            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0);
                            applicationInfo.getClass();
                            obj = context.getPackageManager().getApplicationLabel(applicationInfo).toString();
                        } catch (Exception unused) {
                        }
                        if (obj == null) {
                            obj = "";
                        }
                        if (context != null) {
                            str = packageName;
                            info = null;
                            if (info != null) {
                                this.getClass();
                                str2 = info.getId();
                            }
                            return (Serializable) tub.h(new Pair(jkm.e, str), new Pair(jkm.f, obj), new Pair(jkm.g, str2 != null ? str2 : ""));
                        }
                        hs4 hs4Var = z45.a;
                        hq4 hq4Var = hq4.c;
                        hgd hgdVar = new hgd(2, objArr == true ? 1 : 0, context);
                        nulVar.r = this;
                        nulVar.s = packageName;
                        nulVar.t = obj;
                        nulVar.w = 1;
                        Object R = xw3.R(hq4Var, hgdVar, nulVar);
                        if (R == lu3Var) {
                            return lu3Var;
                        }
                        String str3 = packageName;
                        obj2 = R;
                        str = str3;
                    }
                    obj = null;
                    if (obj == null) {
                    }
                    if (context != null) {
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str4 = nulVar.t;
                    str = nulVar.s;
                    tnf tnfVar = nulVar.r;
                    y6a.M(obj2);
                    obj = str4;
                    this = tnfVar;
                }
                info = (AdvertisingIdClient.Info) obj2;
                if (info != null) {
                }
                return (Serializable) tub.h(new Pair(jkm.e, str), new Pair(jkm.f, obj), new Pair(jkm.g, str2 != null ? str2 : ""));
            }
        }
        nulVar = new nul(this, sq3Var);
        Object obj22 = nulVar.u;
        lu3 lu3Var2 = lu3.a;
        i2 = nulVar.w;
        String str22 = null;
        Object[] objArr2 = 0;
        if (i2 != 0) {
        }
        info = (AdvertisingIdClient.Info) obj22;
        if (info != null) {
        }
        return (Serializable) tub.h(new Pair(jkm.e, str), new Pair(jkm.f, obj), new Pair(jkm.g, str22 != null ? str22 : ""));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(Map map, boolean z, BlazeAdProvider blazeAdProvider, Context context, sq3 sq3Var) {
        o5m o5mVar;
        int i2;
        LinkedHashMap i3;
        LinkedHashMap linkedHashMap;
        if (sq3Var instanceof o5m) {
            o5mVar = (o5m) sq3Var;
            int i4 = o5mVar.w;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                o5mVar.w = i4 - Integer.MIN_VALUE;
                Object obj = o5mVar.u;
                Object obj2 = lu3.a;
                i2 = o5mVar.w;
                if (i2 != 0) {
                    y6a.M(obj);
                    Pair pair = new Pair(jkm.a.a, z ? "1" : "0");
                    ugm ugmVar = jkm.b;
                    Pair pair2 = new Pair(ugmVar.a, ugmVar.b);
                    ugm ugmVar2 = jkm.c;
                    Pair pair3 = new Pair(ugmVar2.a, ugmVar2.b);
                    ugm ugmVar3 = jkm.d;
                    i3 = tub.i(pair, pair2, pair3, new Pair(ugmVar3.a, ugmVar3.b));
                    int i5 = blazeAdProvider == null ? -1 : fql.a[blazeAdProvider.ordinal()];
                    if (i5 != -1) {
                        if (i5 != 1) {
                            zzl.b();
                            return null;
                        }
                        o5mVar.r = map;
                        o5mVar.s = i3;
                        o5mVar.t = i3;
                        o5mVar.w = 1;
                        obj = a(context, o5mVar);
                        if (obj == obj2) {
                            return obj2;
                        }
                        linkedHashMap = i3;
                    }
                    if (!map.isEmpty()) {
                        i3.put("cust_params", CollectionsKt.f0(map.entrySet(), U3.j.c, null, null, new w5m(0), 30));
                    }
                    return i3;
                }
                if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                linkedHashMap = o5mVar.t;
                LinkedHashMap linkedHashMap2 = o5mVar.s;
                Map map2 = o5mVar.r;
                y6a.M(obj);
                i3 = linkedHashMap2;
                map = map2;
                linkedHashMap.putAll((Map) obj);
                if (!map.isEmpty()) {
                }
                return i3;
            }
        }
        o5mVar = new o5m(this, sq3Var);
        Object obj3 = o5mVar.u;
        Object obj22 = lu3.a;
        i2 = o5mVar.w;
        if (i2 != 0) {
        }
        linkedHashMap.putAll((Map) obj3);
        if (!map.isEmpty()) {
        }
        return i3;
    }

    @Override // defpackage.qs3
    public Object convert(Object obj) {
        i2g i2gVar = (i2g) obj;
        try {
            x52 x52Var = new x52();
            i2gVar.source().y0(x52Var);
            return i2g.create(i2gVar.contentType(), i2gVar.contentLength(), x52Var);
        } finally {
            i2gVar.close();
        }
    }

    @Override // defpackage.yb2
    public byte[] d(int i2, int i3, byte[] bArr) {
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        return bArr2;
    }

    @Override // defpackage.op3
    public long e(long j2, long j3) {
        if (Float.intBitsToFloat((int) (j2 >> 32)) <= Float.intBitsToFloat((int) (j3 >> 32)) && Float.intBitsToFloat((int) (j2 & 4294967295L)) <= Float.intBitsToFloat((int) (j3 & 4294967295L))) {
            long floatToRawIntBits = (Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L);
            int i2 = mrg.a;
            return floatToRawIntBits;
        }
        float y = rfo.y(j2, j3);
        long floatToRawIntBits2 = (Float.floatToRawIntBits(y) << 32) | (Float.floatToRawIntBits(y) & 4294967295L);
        int i3 = mrg.a;
        return floatToRawIntBits2;
    }

    @Override // defpackage.pl6
    public void endTracks() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0058, code lost:
    
        defpackage.n4o.H(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x005b, code lost:
    
        throw null;
     */
    @Override // defpackage.fn5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(in5 in5Var) {
        StringBuilder sb;
        int i2 = 0;
        boolean z = true;
        switch (this.a) {
            case 16:
                StringBuilder sb2 = new StringBuilder();
                sb2.append((char) 0);
                while (true) {
                    boolean b2 = in5Var.b();
                    sb = (StringBuilder) in5Var.f;
                    if (b2) {
                        sb2.append(in5Var.a());
                        int i3 = in5Var.a + 1;
                        in5Var.a = i3;
                        if (n4o.M(i3, 5, in5Var.d) != 5) {
                        }
                    }
                }
                int length = sb2.length() - 1;
                int length2 = sb.length() + length + 1;
                in5Var.d(length2);
                boolean z2 = ((hpi) in5Var.g).b - length2 > 0;
                if (in5Var.b() || z2) {
                    if (length <= 249) {
                        sb2.setCharAt(0, (char) length);
                    } else if (length > 1555) {
                        a70.r("Message length not in valid ranges: ".concat(String.valueOf(length)));
                        return;
                    } else {
                        sb2.setCharAt(0, (char) ((length / 250) + 249));
                        sb2.insert(1, (char) (length % 250));
                    }
                }
                int length3 = sb2.length();
                while (i2 < length3) {
                    int length4 = (((sb.length() + 1) * 149) % 255) + 1 + sb2.charAt(i2);
                    if (length4 > 255) {
                        length4 -= 256;
                    }
                    in5Var.e((char) length4);
                    i2++;
                }
                return;
            default:
                String str = in5Var.d;
                StringBuilder sb3 = (StringBuilder) in5Var.f;
                StringBuilder sb4 = new StringBuilder();
                while (true) {
                    if (in5Var.b()) {
                        char a = in5Var.a();
                        if (a >= ' ' && a <= '?') {
                            sb4.append(a);
                        } else if (a >= '@' && a <= '^') {
                            sb4.append((char) (a - '@'));
                        }
                        in5Var.a++;
                        if (sb4.length() >= 4) {
                            sb3.append(c(sb4));
                            sb4.delete(0, 4);
                            if (n4o.M(in5Var.a, 4, str) != 4) {
                                in5Var.b = 0;
                            }
                        }
                    }
                }
                sb4.append((char) 31);
                try {
                    int length5 = sb4.length();
                    if (length5 != 0) {
                        if (length5 == 1) {
                            in5Var.d(sb3.length());
                            int length6 = ((hpi) in5Var.g).b - sb3.length();
                            int length7 = (str.length() - in5Var.c) - in5Var.a;
                            if (length7 > length6) {
                                in5Var.d(sb3.length() + 1);
                                length6 = ((hpi) in5Var.g).b - sb3.length();
                            }
                            if (length7 <= length6 && length6 <= 2) {
                                return;
                            }
                        }
                        if (length5 > 4) {
                            throw new IllegalStateException("Count must not exceed 4");
                        }
                        int i4 = length5 - 1;
                        String c2 = c(sb4);
                        if (in5Var.b() || i4 > 2) {
                            z = false;
                        }
                        if (i4 <= 2) {
                            in5Var.d(sb3.length() + i4);
                            if (((hpi) in5Var.g).b - sb3.length() >= 3) {
                                in5Var.d(sb3.length() + c2.length());
                                z = false;
                            }
                        }
                        if (z) {
                            in5Var.g = null;
                            in5Var.a -= i4;
                        } else {
                            sb3.append(c2);
                        }
                    }
                    return;
                } finally {
                    in5Var.b = 0;
                }
        }
    }

    @Override // defpackage.lkk
    public Object i(wga wgaVar, float f2) {
        boolean z = wgaVar.Z() == 1;
        if (z) {
            wgaVar.h();
        }
        float H = (float) wgaVar.H();
        float H2 = (float) wgaVar.H();
        while (wgaVar.t()) {
            wgaVar.g0();
        }
        if (z) {
            wgaVar.m();
        }
        return new prg((H / 100.0f) * f2, (H2 / 100.0f) * f2);
    }

    @Override // defpackage.hg3
    public int l(f7 f7Var, int i2, Object obj, int i3) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        int limit = byteBuffer.limit();
        byteBuffer.limit(byteBuffer.position() + i2);
        f7Var.p(byteBuffer);
        byteBuffer.limit(limit);
        return 0;
    }

    @Override // defpackage.pl6
    public void m(b0h b0hVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.pl6
    /* renamed from: track */
    public vsj mo2track(int i2, int i3) {
        throw new UnsupportedOperationException();
    }

    public tnf(d4a d4aVar, fp8 fp8Var) {
        this.a = 26;
    }

    public /* synthetic */ tnf(int i2) {
        this.a = i2;
    }
}
