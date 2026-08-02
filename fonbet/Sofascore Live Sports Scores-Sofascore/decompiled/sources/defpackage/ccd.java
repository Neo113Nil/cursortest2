package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.ParcelFileDescriptor;
import android.view.Display;
import android.view.WindowManager;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.ads.zzifl;
import com.google.android.gms.internal.ads.zzifm;
import com.google.android.gms.internal.cast.zzyh;
import com.google.android.gms.internal.consent_sdk.zzqp;
import com.sofascore.local_persistance.Brand;
import com.sofascore.local_persistance.BrandingConfig;
import com.sofascore.local_persistance.BrandingEvent;
import com.sofascore.local_persistance.BrandingFeaturedTournament;
import com.sofascore.local_persistance.BrandingTeam;
import com.sofascore.local_persistance.BrandingTournament;
import com.sofascore.model.Injury;
import com.sofascore.model.PlayerActiveSuspension;
import com.sofascore.model.branding.BrandLocation;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.network.response.EventStatisticsItem;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ccd implements e3g, mal, eqo, zzqp, zzyh, jr0, ac2, gg3, op3, g18, w1g, n3c {
    public static volatile BrandingConfig b;
    public static final ccd a = new ccd();
    public static final ccd c = new ccd();
    public static final ccd d = new ccd();
    public static final ccd e = new ccd();
    public static final ccd f = new ccd();
    public static final ccd g = new ccd();
    public static final ccd h = new ccd();
    public static final ccd i = new ccd();
    public static final ccd j = new ccd();
    public static final ccd k = new ccd();
    public static final ccd l = new ccd();
    public static final ccd m = new ccd();
    public static final ccd n = new ccd();

    public static BrandingTeam A(int i2, Context context) {
        Map<String, BrandingTeam> teams;
        context.getClass();
        BrandingConfig t = t();
        if (t == null || (teams = t.getTeams()) == null) {
            return null;
        }
        return teams.get(String.valueOf(i2));
    }

    public static Brand B(Context context, Integer num, BrandLocation brandLocation) {
        context.getClass();
        brandLocation.getClass();
        BrandingTournament C = C(context, num);
        if (C == null) {
            return null;
        }
        switch (h32.a[brandLocation.ordinal()]) {
            case 1:
                if (Intrinsics.c(C.getHeader(), Boolean.TRUE)) {
                    break;
                }
                break;
            case 2:
                if (Intrinsics.c(C.getEventList(), Boolean.TRUE)) {
                    break;
                }
                break;
            case 3:
                if (Intrinsics.c(C.getTeamOfTheWeek(), Boolean.TRUE)) {
                    break;
                }
                break;
            case 4:
            case 5:
                if (Intrinsics.c(C.getStandings(), Boolean.TRUE)) {
                    break;
                }
                break;
            case 6:
                if (Intrinsics.c(C.getPlayerOfTheMatch(), Boolean.TRUE)) {
                    break;
                }
                break;
        }
        return C.getBrand();
    }

    public static BrandingTournament C(Context context, Integer num) {
        Map<String, BrandingTournament> uniqueTournaments;
        context.getClass();
        BrandingConfig t = t();
        if (t == null || (uniqueTournaments = t.getUniqueTournaments()) == null) {
            return null;
        }
        return uniqueTournaments.get(num != null ? String.valueOf(num.intValue()) : null);
    }

    public static yqc p(String str, brc brcVar, Double d2, Double d3, Double d4, Double d5, Double d6, Double d7, int i2) {
        boolean z = (i2 & 32768) == 0;
        Double valueOf = Double.valueOf(300.0d);
        Double d8 = (z && d4 == null && d7 == null) ? valueOf : null;
        if (!z) {
            valueOf = null;
        }
        arc arcVar = new arc(d2 != null ? d2.doubleValue() : 0.0d, d3 != null ? d3.doubleValue() : 0.0d, d4 == null ? d8 : d4);
        double doubleValue = d5 != null ? d5.doubleValue() : 0.0d;
        double doubleValue2 = d6 != null ? d6.doubleValue() : 0.0d;
        if (d7 == null) {
            d7 = d8;
        }
        arc arcVar2 = new arc(doubleValue, doubleValue2, d7);
        Double d9 = valueOf;
        return new yqc(str, brcVar, arcVar, arcVar2, new arc(0.0d, 0.0d, d9), new arc(0.0d, 0.0d, d9), null, z, NotificationCompat.FLAG_LOCAL_ONLY);
    }

    public static lnc q(EventStatisticsItem eventStatisticsItem, EventStatisticsItem eventStatisticsItem2) {
        arc arcVar;
        arc arcVar2;
        Double valueOf = Double.valueOf(0.0d);
        loc locVar = null;
        if (eventStatisticsItem == null || eventStatisticsItem2 == null) {
            arcVar = new arc(0.0d, 0.0d, valueOf);
            arcVar2 = new arc(0.0d, 0.0d, valueOf);
        } else {
            double parseDouble = Double.parseDouble(EventStatisticsItem.getHome$default(eventStatisticsItem2, null, 1, null));
            double parseDouble2 = Double.parseDouble(EventStatisticsItem.getAway$default(eventStatisticsItem2, null, 1, null));
            double parseDouble3 = parseDouble > 0.0d ? (Double.parseDouble(EventStatisticsItem.getHome$default(eventStatisticsItem, null, 1, null)) / parseDouble) * 100.0d : 0.0d;
            double parseDouble4 = parseDouble2 > 0.0d ? (Double.parseDouble(EventStatisticsItem.getAway$default(eventStatisticsItem, null, 1, null)) / parseDouble2) * 100.0d : 0.0d;
            arcVar = new arc(parseDouble3, Double.parseDouble(EventStatisticsItem.getHome$default(eventStatisticsItem, null, 1, null)), Double.valueOf(Double.parseDouble(EventStatisticsItem.getHome$default(eventStatisticsItem2, null, 1, null))));
            arc arcVar3 = new arc(parseDouble4, Double.parseDouble(EventStatisticsItem.getAway$default(eventStatisticsItem, null, 1, null)), Double.valueOf(Double.parseDouble(EventStatisticsItem.getAway$default(eventStatisticsItem2, null, 1, null))));
            locVar = y(Integer.valueOf(EventStatisticsItem.getCompareCode$default(eventStatisticsItem, null, 1, null)));
            arcVar2 = arcVar3;
        }
        return new lnc(arcVar, arcVar2, locVar);
    }

    public static bj6 r() {
        bj6 bj6Var = new bj6();
        bj6Var.a = new Random();
        bj6Var.b = 120000000000L;
        bj6Var.c = 1.6d;
        bj6Var.d = 0.2d;
        bj6Var.e = 1000000000L;
        return bj6Var;
    }

    public static BrandingEvent s(int i2, Context context) {
        Map<String, BrandingEvent> boostedOddsEvents;
        context.getClass();
        BrandingConfig t = t();
        if (t == null || (boostedOddsEvents = t.getBoostedOddsEvents()) == null) {
            return null;
        }
        return boostedOddsEvents.get(String.valueOf(i2));
    }

    public static BrandingConfig t() {
        ia0 ia0Var = ia0.q;
        if (mz1.C()) {
            return b;
        }
        return null;
    }

    public static BrandingFeaturedTournament u(Context context) {
        Map<String, BrandingFeaturedTournament> featuredUniqueTournaments;
        BrandingConfig t = t();
        if (t == null || (featuredUniqueTournaments = t.getFeaturedUniqueTournaments()) == null) {
            return null;
        }
        return featuredUniqueTournaments.get(String.valueOf(16));
    }

    public static Map.Entry v(Context context) {
        Map<String, BrandingEvent> boostedOddsEvents;
        Set<Map.Entry<String, BrandingEvent>> entrySet;
        context.getClass();
        BrandingConfig t = t();
        if (t == null || (boostedOddsEvents = t.getBoostedOddsEvents()) == null || (entrySet = boostedOddsEvents.entrySet()) == null) {
            return null;
        }
        return (Map.Entry) CollectionsKt.Z(entrySet);
    }

    public static Map.Entry w(Context context) {
        Map<String, BrandingEvent> partnerEvents;
        Set<Map.Entry<String, BrandingEvent>> entrySet;
        context.getClass();
        BrandingConfig t = t();
        if (t == null || (partnerEvents = t.getPartnerEvents()) == null || (entrySet = partnerEvents.entrySet()) == null) {
            return null;
        }
        return (Map.Entry) CollectionsKt.Z(entrySet);
    }

    public static pp9 x(Player player) {
        player.getClass();
        List<PlayerActiveSuspension> activeSeasonSuspensions = player.getActiveSeasonSuspensions();
        if (activeSeasonSuspensions != null && !activeSeasonSuspensions.isEmpty()) {
            return pp9.d;
        }
        Injury injury = player.getInjury();
        if (injury != null) {
            return Intrinsics.c(injury.getStatus(), "dayToDay") ? pp9.c : pp9.b;
        }
        return null;
    }

    public static loc y(Integer num) {
        if (num != null && num.intValue() == 1) {
            return loc.a;
        }
        if (num != null && num.intValue() == 2) {
            return loc.b;
        }
        return null;
    }

    public static BrandingEvent z(int i2, Context context) {
        Map<String, BrandingEvent> partnerEvents;
        context.getClass();
        BrandingConfig t = t();
        if (t == null || (partnerEvents = t.getPartnerEvents()) == null) {
            return null;
        }
        return partnerEvents.get(String.valueOf(i2));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object D(Context context, sq3 sq3Var) {
        i32 i32Var;
        int i2;
        BrandingConfig brandingConfig;
        if (sq3Var instanceof i32) {
            i32Var = (i32) sq3Var;
            int i3 = i32Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                i32Var.t = i3 - Integer.MIN_VALUE;
                Object obj = i32Var.r;
                lu3 lu3Var = lu3.a;
                i2 = i32Var.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    KProperty[] kPropertyArr = rf4.a;
                    context.getClass();
                    z88 data = ((ye4) rf4.c.getValue(context, rf4.a[1])).getData();
                    i32Var.t = 1;
                    obj = rd0.A(data, i32Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                brandingConfig = (BrandingConfig) obj;
                if (brandingConfig != null) {
                    b = brandingConfig;
                }
                return Unit.a;
            }
        }
        i32Var = new i32(this, sq3Var);
        Object obj2 = i32Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = i32Var.t;
        if (i2 != 0) {
        }
        brandingConfig = (BrandingConfig) obj2;
        if (brandingConfig != null) {
        }
        return Unit.a;
    }

    @Override // defpackage.eqo
    public boolean a(Class cls) {
        return zzifm.class.isAssignableFrom(cls);
    }

    @Override // defpackage.eqo
    public lqo b(Class cls) {
        if (!zzifm.class.isAssignableFrom(cls)) {
            a70.p("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (lqo) zzifm.x(cls.asSubclass(zzifm.class)).z(zzifl.c, null);
        } catch (Exception e2) {
            vp2.e("Unable to get message info for ".concat(cls.getName()), e2);
            return null;
        }
    }

    @Override // defpackage.g18
    public Class c() {
        return ParcelFileDescriptor.class;
    }

    @Override // defpackage.ac2
    public byte[] d(int i2, int i3, byte[] bArr) {
        return Arrays.copyOfRange(bArr, i2, i3 + i2);
    }

    @Override // defpackage.op3
    public long e(long j2, long j3) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) / Float.intBitsToFloat((int) (j2 >> 32));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L);
        int i2 = mrg.a;
        return floatToRawIntBits;
    }

    @Override // defpackage.g18
    public void f(Object obj) {
        ((ParcelFileDescriptor) obj).close();
    }

    @Override // defpackage.mal
    public ial g(Context context, lx4 lx4Var) {
        Context context2 = context;
        while (true) {
            if (!(context2 instanceof ContextWrapper)) {
                context2 = context;
                break;
            }
            if ((context2 instanceof Activity) || (context2 instanceof InputMethodService)) {
                break;
            }
            ContextWrapper contextWrapper = (ContextWrapper) context2;
            if (contextWrapper.getBaseContext() == null) {
                break;
            }
            context2 = contextWrapper.getBaseContext();
            context2.getClass();
        }
        if (context2 instanceof Activity) {
            return k((Activity) context2, lx4Var);
        }
        if (!(context2 instanceof InputMethodService) && !(context2 instanceof Application)) {
            a70.p("Must provide a UiContext or Application Context");
            return null;
        }
        Object systemService = context.getSystemService("window");
        systemService.getClass();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        defaultDisplay.getClass();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new ial(lx4Var.a(context), new Rect(0, 0, point.x, point.y));
    }

    @Override // defpackage.n3c
    public int getCodecCount() {
        return MediaCodecList.getCodecCount();
    }

    @Override // defpackage.n3c
    public MediaCodecInfo getCodecInfoAt(int i2) {
        return MediaCodecList.getCodecInfoAt(i2);
    }

    @Override // defpackage.n3c
    public boolean h(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // defpackage.n3c
    public boolean j(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // defpackage.mal
    public ial k(Activity activity, lx4 lx4Var) {
        u02.h7.getClass();
        return new ial(new t02(f8h.q().f(activity)), lx4Var.a(activity));
    }

    @Override // defpackage.hg3
    public int l(f7 f7Var, int i2, Object obj, int i3) {
        f7Var.M(i2);
        return 0;
    }

    @Override // defpackage.jr0
    public void m(dni dniVar) {
        dniVar.getClass();
        dniVar.E("UPDATE WorkSpec SET `last_enqueue_time` = -1 WHERE `last_enqueue_time` = 0");
    }

    @Override // defpackage.g18
    public Object n(File file) {
        return ParcelFileDescriptor.open(file, 268435456);
    }

    @Override // defpackage.w1g
    public e1g o(e1g e1gVar, uvd uvdVar) {
        nkk nkkVar;
        byte[] bArr;
        ByteBuffer asReadOnlyBuffer = ((dy8) ((xx8) e1gVar.get()).a.b).a.d.asReadOnlyBuffer();
        AtomicReference atomicReference = ha2.a;
        if (asReadOnlyBuffer.isReadOnly() || !asReadOnlyBuffer.hasArray()) {
            nkkVar = null;
        } else {
            byte[] array = asReadOnlyBuffer.array();
            int arrayOffset = asReadOnlyBuffer.arrayOffset();
            int limit = asReadOnlyBuffer.limit();
            nkkVar = new nkk();
            nkkVar.a = array;
            nkkVar.b = arrayOffset;
            nkkVar.c = limit;
        }
        if (nkkVar != null && nkkVar.b == 0 && nkkVar.c == nkkVar.a.length) {
            bArr = asReadOnlyBuffer.array();
        } else {
            ByteBuffer asReadOnlyBuffer2 = asReadOnlyBuffer.asReadOnlyBuffer();
            byte[] bArr2 = new byte[asReadOnlyBuffer2.limit()];
            asReadOnlyBuffer2.get(bArr2);
            bArr = bArr2;
        }
        return new lc2(bArr);
    }

    @Override // defpackage.n3c
    public boolean secureDecodersExplicit() {
        return false;
    }
}
