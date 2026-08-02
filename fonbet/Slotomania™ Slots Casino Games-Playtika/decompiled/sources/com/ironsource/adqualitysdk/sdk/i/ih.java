package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.i.ig;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;

/* loaded from: classes5.dex */
public final class ih {

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f2510 = 1;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f2511 = 0;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static long f2512 = -7336706130906380083L;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f2513 = 1796;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static long f2514;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2515;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private Map<ig.e, ib> f2516;

    public ih() {
        m8025("ꩤꨫໃ\ua7e8٬똘찝혟褳⊶鍠\uf1ef\uec62䆒ﾏ겠", 1 - TextUtils.getCapsMode("", 0, 0)).intern();
        this.f2516 = new HashMap();
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static <T> T m8033(Class cls, Object obj, hz hzVar, T t) {
        int i = 2 % 2;
        int i2 = f2510 + 51;
        f2511 = i2 % 128;
        int i3 = i2 % 2;
        try {
            Field m7871 = id.m7937().m7940().m7871(cls, hzVar);
            if (m7871 == null) {
                return t;
            }
            T t2 = (T) m7871.get(obj);
            int i4 = f2510 + 53;
            f2511 = i4 % 128;
            if (i4 % 2 == 0) {
                return t2;
            }
            throw null;
        } catch (Throwable unused) {
            m.m8527(m8025("ꩤꨫໃ\ua7e8٬똘찝혟褳⊶鍠\uf1ef\uec62䆒ﾏ겠", 1 - View.resolveSizeAndState(0, 0, 0)).intern(), new StringBuilder().append(m8025("㤯㥪왲\uf6ab컍\ue743숈\ud800ᩩ\uea53숂\ufff6缳褳껀ꊩ僔됻", 1 - Color.argb(0, 0, 0, 0)).intern()).append(hzVar.m7888()).append(m8040((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), "\u0000\u0000\u0000\u0000", "ᠵ㩇玕\ue531", "\u1ff0\uaad6㗍坡ꊘ㡷巰蛾渉죦ᒜ", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 1791342824).intern()).append(cls).append(m8040((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 29515), "\u0000\u0000\u0000\u0000", "ﱞ鐲䮳୳", "퉰媈⌫൰筵\ue0f3", ExpandableListView.getPackedPositionGroup(0L)).intern()).toString());
            return null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static List<Object> m8041(Class cls, Object obj, hz hzVar) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        try {
            Iterator<Field> it = id.m7937().m7940().m7870(cls, hzVar).iterator();
            int i2 = f2510 + 19;
            f2511 = i2 % 128;
            int i3 = i2 % 2;
            while (it.hasNext()) {
                int i4 = f2510 + 57;
                f2511 = i4 % 128;
                if (i4 % 2 != 0) {
                    arrayList.add(it.next().get(obj));
                    int i5 = 44 / 0;
                } else {
                    arrayList.add(it.next().get(obj));
                }
            }
            return arrayList;
        } catch (Throwable unused) {
            m.m8527(m8025("ꩤꨫໃ\ua7e8٬똘찝혟褳⊶鍠\uf1ef\uec62䆒ﾏ겠", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1).intern(), new StringBuilder().append(m8025("㤯㥪왲\uf6ab컍\ue743숈\ud800ᩩ\uea53숂\ufff6缳褳껀ꊩ僔됻", (ViewConfiguration.getTouchSlop() >> 8) + 1).intern()).append(hzVar.m7888()).append(m8040((char) View.resolveSize(0, 0), "\u0000\u0000\u0000\u0000", "ᠵ㩇玕\ue531", "\u1ff0\uaad6㗍坡ꊘ㡷巰蛾渉죦ᒜ", (-1791342824) - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern()).append(cls).append(m8040((char) (29515 - (ViewConfiguration.getTapTimeout() >> 16)), "\u0000\u0000\u0000\u0000", "ﱞ鐲䮳୳", "퉰媈⌫൰筵\ue0f3", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern()).toString());
            return arrayList;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final <T> Cif<T> m8048(Object obj, ii iiVar, hx hxVar, List<String> list, int i) {
        int i2 = 2 % 2;
        Cif<T> m8047 = m8047(obj, new ig.d().m7995(true).m7996(iiVar, hxVar, list, i));
        int i3 = f2510 + 11;
        f2511 = i3 % 128;
        int i4 = i3 % 2;
        return m8047;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final <T> Cif<T> m8047(Object obj, ig igVar) {
        float f;
        int i = 2 % 2;
        long currentTimeMillis = System.currentTimeMillis();
        ig.e m7978 = igVar.m7978(obj.getClass());
        ib ibVar = this.f2516.get(m7978);
        if (ibVar != null) {
            Cif<T> m8029 = m8029(obj, ibVar);
            if (m8029 != null) {
                int i2 = f2511 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
                f2510 = i2 % 128;
                if (i2 % 2 == 0) {
                    m8036(igVar.m7979(), m8029);
                    throw null;
                }
                if (m8036(igVar.m7979(), m8029)) {
                    m8026(m8029, obj, new StringBuilder().append(m8040((char) (View.resolveSizeAndState(0, 0, 0) + 19055), "\u0000\u0000\u0000\u0000", "綷\udffe潬橊", "㕍\ue223霘㳙\ue567ꮀ怭ᓥ벝\uf195\u0a65\udc29䂾䪲韄ꚓ挟Ⱒ更", View.getDefaultSize(0, 0) + 1826619005).intern()).append(System.currentTimeMillis() - currentTimeMillis).append(m8025("鶓鷾㕯鑔㷑豱", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern()).toString());
                    return m8029;
                }
            }
            f = 0.0f;
            m.m8527(m8025("ꩤꨫໃ\ua7e8٬똘찝혟褳⊶鍠\uf1ef\uec62䆒ﾏ겠", -TextUtils.lastIndexOf("", '0')).intern(), new StringBuilder().append(obj).append(m8040((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), "\u0000\u0000\u0000\u0000", "藈袥\ueff6㡇", "쀁㜳\udbfe㨆갠맳빵䥨얯ݎ캞", (-158816891) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern()).toString());
            this.f2516.remove(m7978);
        } else {
            f = 0.0f;
        }
        ij<T> ijVar = new ij<>(igVar);
        Cif<T> m8032 = m8032(obj, ijVar, 0, (Cif) null);
        if (m8032 == null) {
            m8026(null, obj, new StringBuilder().append(m8040((char) (2460 - ImageFormat.getBitsPerPixel(0)), "\u0000\u0000\u0000\u0000", "寤ᵌ鵩餉", "\ude8fꕄ㸰殊甂嶶䩏濾⌕亪\ue54b麃䅦", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1763527772).intern()).append(System.currentTimeMillis() - currentTimeMillis).append(m8040((char) (TextUtils.indexOf("", "", 0, 0) + 16992), "\u0000\u0000\u0000\u0000", "둹胵悼婂", "\uee93뫡션պ", ViewConfiguration.getScrollBarSize() >> 8).intern()).append(ijVar.m8056().size()).append(m8025("辢辂\ud8a2婥퀀䮝膇鮊곳\uf4c0滟뱯짪韾ȉ\ue168\ue64dꪮ℧", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1).intern()).toString());
            return null;
        }
        m8026(m8032, obj, new StringBuilder().append(m8040((char) ((AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1)) - 1), "\u0000\u0000\u0000\u0000", "艡旊墽獟", "Ꮚ趝鼋㌻䫁覿ꃁ츄.", View.resolveSize(0, 0) - 1117402494).intern()).append(System.currentTimeMillis() - currentTimeMillis).append(m8040((char) (View.combineMeasuredStates(0, 0) + 16992), "\u0000\u0000\u0000\u0000", "둹胵悼婂", "\uee93뫡션պ", View.MeasureSpec.getMode(0)).intern()).append(ijVar.m8056().size()).append(m8025("辢辂\ud8a2婥퀀䮝膇鮊곳\uf4c0滟뱯짪韾ȉ\ue168\ue64dꪮ℧", -TextUtils.indexOf((CharSequence) "", '0', 0)).intern()).toString());
        this.f2516.put(m7978, ijVar.m8057());
        int i3 = f2510 + 21;
        f2511 = i3 % 128;
        if (i3 % 2 == 0) {
            return m8032;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final List<Cif> m8045(Object obj, ig igVar) {
        int i = 2 % 2;
        ij ijVar = new ij(igVar);
        ijVar.m8059();
        m8032(obj, ijVar, 0, (Cif) null);
        ArrayList arrayList = new ArrayList(ijVar.m8052());
        int i2 = f2510 + 75;
        f2511 = i2 % 128;
        if (i2 % 2 == 0) {
            return arrayList;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private <T> Cif<T> m8029(Object obj, ib ibVar) {
        int i = 2 % 2;
        int i2 = f2511 + 29;
        f2510 = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        try {
            Cif<T> m8038 = m8038(m8039(obj, ibVar.m7920().get(0), (Cif) null), ibVar, 1);
            int i4 = f2510 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
            f2511 = i4 % 128;
            if (i4 % 2 == 0) {
                return m8038;
            }
            super.hashCode();
            throw null;
        } catch (Exception e) {
            m.m8535(m8025("ꩤꨫໃ\ua7e8٬똘찝혟褳⊶鍠\uf1ef\uec62䆒ﾏ겠", 1 - TextUtils.getOffsetAfter("", 0)).intern(), m8040((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), "\u0000\u0000\u0000\u0000", "ꄟ庁ꣃ\ud8ac", "\udd42ꅞ⧭耄㐓\ueef1ꖀꁓ记ᷔ✟ᵽ⯞ܐ蚞\ueefb֖糭卶ꪬ鞵䝌飣ꕱ眾瞹佭鈩ഗ칍턘ᮉ抐鼈世", (-1017216607) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern(), e);
            return null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private <T> Cif<T> m8038(Cif cif, ib ibVar, int i) {
        Cif m8039;
        int i2 = 2 % 2;
        int i3 = f2511 + 61;
        f2510 = i3 % 128;
        int i4 = i3 % 2;
        if (i >= ibVar.m7920().size()) {
            int i5 = f2510 + 3;
            f2511 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 15 / 0;
            }
            return cif;
        }
        int i7 = f2510 + 105;
        f2511 = i7 % 128;
        int i8 = i7 % 2;
        List<Field> list = ibVar.m7920().get(i);
        Object mo7966 = cif.mo7966();
        List m8042 = m8042(mo7966);
        if (m8042 == null) {
            m.m8527(m8025("ꩤꨫໃ\ua7e8٬똘찝혟褳⊶鍠\uf1ef\uec62䆒ﾏ겠", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1).intern(), new StringBuilder().append(m8025("ﰣﱦ焟䲖禪嵼‱㨳\udf74嵪砽᷎멫㹩ᓻ䂒闓̓㟃ꑆ炚\ue4ed튒蜦䱈즼质\uea17⽺굪ꡨ춎\u0a3d蹃䓳ょ\ue5ea匄柉ᑒ샗", TextUtils.getOffsetBefore("", 0) + 1).intern()).append(mo7966.getClass()).toString());
            return null;
        }
        for (Object obj : m8042) {
            int i9 = f2511 + 33;
            f2510 = i9 % 128;
            int i10 = i9 % 2;
            try {
                m8039 = m8039(obj, list, m8024(mo7966, obj, cif));
            } catch (Exception unused) {
            }
            if (m8039 != null) {
                return m8038(m8039, ibVar, i + 1);
            }
            continue;
        }
        int i11 = f2510 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f2511 = i11 % 128;
        if (i11 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static <T> Cif<T> m8039(Object obj, List<Field> list, Cif cif) throws IllegalAccessException {
        Iterator<Field> it;
        Object obj2;
        int i = 2 % 2;
        int i2 = f2510 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f2511 = i2 % 128;
        if (i2 % 2 != 0) {
            it = list.iterator();
            int i3 = 47 / 0;
        } else {
            it = list.iterator();
        }
        while (it.hasNext()) {
            int i4 = f2510 + 71;
            f2511 = i4 % 128;
            if (i4 % 2 == 0) {
                Field next = it.next();
                if (WeakReference.class.isAssignableFrom(next.getType())) {
                    obj2 = ((WeakReference) next.get(obj)).get();
                } else {
                    obj2 = next.get(obj);
                }
                cif = m8030(next, obj, cif);
                obj = obj2;
            } else {
                WeakReference.class.isAssignableFrom(it.next().getType());
                throw null;
            }
        }
        return cif;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
    
        if (r20 <= 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        if ((r18 instanceof android.app.Activity) == true) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        r19.m8056().add(r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
    
        if (r19.m8054().m7980() == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        r6 = r19.m8054().m7980().mo7875(r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
    
        r7 = com.ironsource.adqualitysdk.sdk.i.ih.f2510 + 91;
        com.ironsource.adqualitysdk.sdk.i.ih.f2511 = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        if ((r7 % 2) == 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        r7 = 3 / 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
    
        r7 = r19.m8057();
        r8 = r6.length;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008a, code lost:
    
        if (r9 >= r8) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008c, code lost:
    
        r10 = r6[r9];
        r10.setAccessible(true);
        r7.m7921(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009e, code lost:
    
        r12 = m8031(m8030(r10, r18, r21), r19, r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a2, code lost:
    
        if (r12 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a4, code lost:
    
        r15 = com.ironsource.adqualitysdk.sdk.i.ih.f2511 + com.vungle.ads.internal.protos.Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        r16 = r2;
        com.ironsource.adqualitysdk.sdk.i.ih.f2510 = r15 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b0, code lost:
    
        if ((r15 % 2) != 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b2, code lost:
    
        r15 = 44 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b9, code lost:
    
        if (r19.m8058() != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cf, code lost:
    
        r7.m7919(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d2, code lost:
    
        r9 = r9 + 1;
        r2 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c2, code lost:
    
        r0 = com.ironsource.adqualitysdk.sdk.i.ih.f2511 + 19;
        com.ironsource.adqualitysdk.sdk.i.ih.f2510 = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cc, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c0, code lost:
    
        if (r19.m8058() != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cd, code lost:
    
        r16 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00df, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.m.m8535(m8025("ꩤꨫໃ\ua7e8٬똘찝혟褳⊶鍠\uf1ef\uec62䆒ﾏ겠", ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 1).intern(), m8025("ꭾꬻ鎕⚾鬪㝖ᅛ\u0b53蠸뾴ሗⲥ\ued62\udcd4绕燺슅\ue1dc巇锺⟄٭뢷똘ᬼ⬭\ue745\udb5c砢", (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1).intern(), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0109, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x006b, code lost:
    
        r6 = m8028(r18.getClass(), r19.m8054().m7977(r20));
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x007b, code lost:
    
        r7 = com.ironsource.adqualitysdk.sdk.i.ih.f2511 + 61;
        com.ironsource.adqualitysdk.sdk.i.ih.f2510 = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00dc, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x002d, code lost:
    
        if (r18 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002a, code lost:
    
        if (r18 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0037, code lost:
    
        if (r19.m8056().contains(r18) != false) goto L50;
     */
    /* renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private <T> Cif<T> m8032(Object obj, ij<T> ijVar, int i, Cif cif) {
        char c = 2;
        int i2 = 2 % 2;
        int i3 = f2510 + 67;
        f2511 = i3 % 128;
        int i4 = i3 % 2;
        if (i != ijVar.m8054().m7973()) {
            int i5 = f2510 + 7;
            f2511 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 82 / 0;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0146 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0147  */
    /* renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Cif m8031(Cif cif, ij ijVar, int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = f2511 + 89;
        f2510 = i4 % 128;
        int i5 = i4 % 2;
        Object mo7966 = cif.mo7966();
        Object obj = null;
        if (!ijVar.m8056().contains(mo7966) && !ijVar.m8053().contains(mo7966)) {
            if (ijVar.m8054().m7976(i)) {
                int i6 = f2510 + 65;
                f2511 = i6 % 128;
                int i7 = i6 % 2;
                if (m8036(ijVar.m8054().m7979(), cif)) {
                    if (!ijVar.m8058()) {
                        return cif;
                    }
                    int i8 = f2511 + 45;
                    f2510 = i8 % 128;
                    int i9 = i8 % 2;
                    ijVar.m8055(cif);
                    ijVar.m8060(mo7966);
                    return cif;
                }
            }
            if (mo7966 instanceof WeakReference) {
                WeakReference weakReference = (WeakReference) mo7966;
                if (weakReference.get() != null) {
                    int i10 = f2511 + 25;
                    f2510 = i10 % 128;
                    int i11 = i10 % 2;
                    if (ijVar.m8054().m7974(i) && m8037(weakReference.get(), ijVar.m8054().m7975())) {
                        int i12 = f2511 + 11;
                        f2510 = i12 % 128;
                        return i12 % 2 == 0 ? m8032(weakReference.get(), ijVar, i % 0, cif) : m8032(weakReference.get(), ijVar, i + 1, cif);
                    }
                }
            }
            if (m8037(mo7966, ijVar.m8054().m7975())) {
                int i13 = f2510 + 77;
                f2511 = i13 % 128;
                return i13 % 2 != 0 ? m8032(mo7966, ijVar, i, cif) : m8032(mo7966, ijVar, i + 1, cif);
            }
            if (ijVar.m8054().m7982() && mo7966 != null) {
                ijVar.m8056().add(mo7966);
            }
            List m8043 = m8043(mo7966, ijVar.m8054(), i);
            ib m8057 = ijVar.m8057();
            if (m8043 != null) {
                Iterator it = m8043.iterator();
                Cif cif2 = null;
                while (it.hasNext()) {
                    int i14 = f2511 + 95;
                    f2510 = i14 % 128;
                    if (i14 % 2 == 0) {
                        Cif m8024 = m8024(mo7966, it.next(), cif);
                        m8057.m7918();
                        m8031(m8024, ijVar, i);
                        super.hashCode();
                        throw null;
                    }
                    Cif m80242 = m8024(mo7966, it.next(), cif);
                    m8057.m7918();
                    cif2 = m8031(m80242, ijVar, i);
                    if (cif2 != null) {
                        int i15 = f2510 + 17;
                        f2511 = i15 % 128;
                        if (i15 % 2 != 0) {
                            int i16 = 6 / 0;
                            if (!ijVar.m8058()) {
                                i2 = f2511 + 37;
                                f2510 = i2 % 128;
                                if (i2 % 2 == 0) {
                                    return cif2;
                                }
                                throw null;
                            }
                        } else if (!ijVar.m8058()) {
                            i2 = f2511 + 37;
                            f2510 = i2 % 128;
                            if (i2 % 2 == 0) {
                            }
                        }
                    }
                    m8057.m7922();
                }
                return cif2;
            }
        }
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final List<String> m8051(Object obj, List<String> list, int i) {
        int i2 = 2 % 2;
        ij ijVar = new ij(new ig.d().m7988(true).m7990(true).m7998(true).m7991(-1).m7999(new ii() { // from class: com.ironsource.adqualitysdk.sdk.i.ih.4
            @Override // com.ironsource.adqualitysdk.sdk.i.ii
            /* renamed from: ﻐ */
            public final boolean mo7428(Cif cif) {
                return cif.mo7966() instanceof String;
            }
        }, list, i));
        ijVar.m8059();
        m8032(obj, ijVar, 0, (Cif) null);
        ArrayList arrayList = new ArrayList(ijVar.m8053());
        int i3 = f2511 + 63;
        f2510 = i3 % 128;
        int i4 = i3 % 2;
        return arrayList;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static boolean m8036(ii iiVar, Cif cif) {
        int i = 2 % 2;
        int i2 = f2511 + 85;
        f2510 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                boolean mo7428 = iiVar.mo7428(cif);
                int i3 = f2511 + 7;
                f2510 = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 7 / 0;
                }
                return mo7428;
            }
            iiVar.mo7428(cif);
            throw null;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static boolean m8037(Object obj, List<String> list) {
        int i = 2 % 2;
        if (obj == null) {
            return false;
        }
        int i2 = f2510 + 59;
        f2511 = i2 % 128;
        int i3 = i2 % 2;
        boolean m8432 = kk.m8432(obj.getClass(), list);
        int i4 = f2511 + 107;
        f2510 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 89 / 0;
        }
        return m8432;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static Field[] m8028(Class cls, int i) {
        int i2 = 2 % 2;
        Field[] declaredFields = cls.getDeclaredFields();
        for (int i3 = 0; cls != null && i3 != i; i3++) {
            int i4 = f2510 + 9;
            f2511 = i4 % 128;
            int i5 = i4 % 2;
            cls = cls.getSuperclass();
            if (cls != null) {
                int i6 = f2511 + 31;
                f2510 = i6 % 128;
                int i7 = i6 % 2;
                declaredFields = kk.m8439(declaredFields, cls.getDeclaredFields());
            }
        }
        return declaredFields;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static List m8042(Object obj) {
        int i = 2 % 2;
        int i2 = f2510 + 109;
        f2511 = i2 % 128;
        int i3 = i2 % 2;
        List m8044 = m8044(obj, true, true, true);
        int i4 = f2511 + 31;
        f2510 = i4 % 128;
        int i5 = i4 % 2;
        return m8044;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static List m8043(Object obj, ig igVar, int i) {
        int i2 = 2 % 2;
        int i3 = f2511 + 85;
        f2510 = i3 % 128;
        int i4 = i3 % 2;
        List m8044 = m8044(obj, igVar.m7972(i), igVar.m7981(i), igVar.m7983(i));
        int i5 = f2510 + 39;
        f2511 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 70 / 0;
        }
        return m8044;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static List m8044(Object obj, boolean z, boolean z2, boolean z3) {
        int i = 2 % 2;
        int i2 = f2510 + 39;
        f2511 = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            super.hashCode();
            throw null;
        }
        if (obj != null) {
            if ((obj instanceof Collection) && z) {
                return new ArrayList((Collection) obj);
            }
            if (obj.getClass().isArray()) {
                int i3 = f2511 + 49;
                f2510 = i3 % 128;
                if (i3 % 2 == 0) {
                    super.hashCode();
                    throw null;
                }
                if (z3) {
                    return new ArrayList(Arrays.asList(obj));
                }
            }
            if (obj instanceof Map) {
                int i4 = f2510 + 49;
                f2511 = i4 % 128;
                int i5 = i4 % 2;
                if (z2) {
                    Map map = (Map) obj;
                    ArrayList arrayList = new ArrayList(map.values());
                    arrayList.addAll(map.keySet());
                    return arrayList;
                }
            }
        }
        return null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static <T> Cif<T> m8030(Field field, Object obj, Cif cif) {
        int i = 2 % 2;
        ik ikVar = new ik(field, obj, cif);
        int i2 = f2511 + 25;
        f2510 = i2 % 128;
        if (i2 % 2 != 0) {
            return ikVar;
        }
        Object obj2 = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static <T> Cif<T> m8024(Object obj, Object obj2, Cif cif) {
        int i = 2 % 2;
        int i2 = f2511 + 111;
        f2510 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 91 / 0;
            if (obj == null) {
                return null;
            }
        } else if (obj == null) {
            return null;
        }
        if (obj instanceof Collection) {
            ik ikVar = new ik((Collection) obj, obj2, cif);
            int i4 = f2510 + 101;
            f2511 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 10 / 0;
            }
            return ikVar;
        }
        if (obj instanceof Map) {
            return new ik((Map) obj, obj2, cif);
        }
        if (obj.getClass().isArray()) {
            return new ik(new ArrayList(Arrays.asList(obj)), obj2, cif);
        }
        return null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String m8046(Class cls, String str) {
        int i = 2 % 2;
        int i2 = f2511 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f2510 = i2 % 128;
        int i3 = i2 % 2;
        String m8034 = m8034((Object) null, cls, str);
        int i4 = f2511 + 33;
        f2510 = i4 % 128;
        if (i4 % 2 != 0) {
            return m8034;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m8049(Object obj, String str) {
        int i = 2 % 2;
        int i2 = f2511 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f2510 = i2 % 128;
        if (i2 % 2 == 0) {
            m8034(obj, obj.getClass(), str);
            Object obj2 = null;
            super.hashCode();
            throw null;
        }
        String m8034 = m8034(obj, obj.getClass(), str);
        int i3 = f2511 + 83;
        f2510 = i3 % 128;
        int i4 = i3 % 2;
        return m8034;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m8050(Object obj, JSONArray jSONArray) {
        int i = 2 % 2;
        int i2 = f2510 + 79;
        int i3 = i2 % 128;
        f2511 = i3;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            super.hashCode();
            throw null;
        }
        if (jSONArray != null) {
            int i4 = i3 + 67;
            int i5 = i4 % 128;
            f2510 = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 99;
            f2511 = i7 % 128;
            int i8 = i7 % 2;
            for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                String m8049 = m8049(obj, jSONArray.optString(i9));
                if (m8049 != null) {
                    return m8049;
                }
            }
        }
        return null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private String m8034(Object obj, Class cls, String str) {
        Field[] m8027;
        int length;
        int i = 2 % 2;
        while (cls != null) {
            int i2 = f2510 + 37;
            f2511 = i2 % 128;
            int i3 = i2 % 2;
            if (cls.equals(Object.class)) {
                break;
            }
            int i4 = f2511 + 77;
            f2510 = i4 % 128;
            if (i4 % 2 == 0) {
                m8027 = m8027(cls);
                length = m8027.length;
            } else {
                m8027 = m8027(cls);
                length = m8027.length;
            }
            for (int i5 = 0; i5 < length; i5++) {
                Field field = m8027[i5];
                field.setAccessible(true);
                try {
                    String str2 = (String) field.get(obj);
                    if (str2 != null && !(!Pattern.compile(str).matcher(str2).matches())) {
                        return str2;
                    }
                } catch (Exception unused) {
                }
            }
            cls = cls.getSuperclass();
        }
        int i6 = f2511 + 91;
        f2510 = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static Field[] m8027(Class cls) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        Field[] declaredFields = cls.getDeclaredFields();
        int i2 = f2510 + 85;
        f2511 = i2 % 128;
        int i3 = i2 % 2;
        for (Field field : declaredFields) {
            int i4 = f2511 + 115;
            f2510 = i4 % 128;
            int i5 = i4 % 2;
            if (field.getType().equals(String.class)) {
                arrayList.add(field);
            }
        }
        return (Field[]) arrayList.toArray(new Field[0]);
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static void m8026(Cif cif, Object obj, String str) {
        int i = 2 % 2;
        int i2 = f2511 + 85;
        f2510 = i2 % 128;
        int i3 = i2 % 2;
        if (cif != null) {
            m.m8520(m8025("ꩤꨫໃ\ua7e8٬똘찝혟褳⊶鍠\uf1ef\uec62䆒ﾏ겠", 1 - (ViewConfiguration.getEdgeSlop() >> 16)).intern(), new StringBuilder().append(obj).append(m8040((char) (14703 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), "\u0000\u0000\u0000\u0000", "⩱㜮漑ู", "䪑岍", Process.myTid() >> 22).intern()).append(str).append(m8040((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "\u0000\u0000\u0000\u0000", "ꡇᰮ邿ᮗ", "\uf10c鷿톊犎톤\ueeb5ܨ\ue592", View.MeasureSpec.makeMeasureSpec(0, 0)).intern()).append(cif.mo7966()).toString());
            return;
        }
        m.m8520(m8025("ꩤꨫໃ\ua7e8٬똘찝혟褳⊶鍠\uf1ef\uec62䆒ﾏ겠", Gravity.getAbsoluteGravity(0, 0) + 1).intern(), new StringBuilder().append(obj).append(m8040((char) (14703 - (ViewConfiguration.getPressedStateDuration() >> 16)), "\u0000\u0000\u0000\u0000", "⩱㜮漑ู", "䪑岍", TextUtils.indexOf("", "", 0)).intern()).append(str).toString());
        int i4 = f2510 + 79;
        f2511 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 42 / 0;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static String m8035(Object obj, List<String> list, int i) {
        int i2 = 2 % 2;
        String m7917 = new ia(list, i).m7917(obj);
        int i3 = f2510 + 105;
        f2511 = i3 % 128;
        int i4 = i3 % 2;
        return m7917;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m8025(String str, int i) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (g.f2155) {
            char[] m7785 = g.m7785(f2512, cArr2, i);
            g.f2157 = 4;
            while (g.f2157 < m7785.length) {
                g.f2156 = g.f2157 - 4;
                m7785[g.f2157] = (char) ((m7785[g.f2157] ^ m7785[g.f2157 % 4]) ^ (g.f2156 * f2512));
                g.f2157++;
            }
            str2 = new String(m7785, 4, m7785.length - 4);
        }
        return str2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m8040(char c, String str, String str2, String str3, int i) {
        String str4;
        char[] cArr = str3;
        if (str3 != null) {
            cArr = str3.toCharArray();
        }
        char[] cArr2 = cArr;
        char[] cArr3 = str2;
        if (str2 != null) {
            cArr3 = str2.toCharArray();
        }
        char[] cArr4 = cArr3;
        char[] cArr5 = str;
        if (str != null) {
            cArr5 = str.toCharArray();
        }
        char[] cArr6 = cArr5;
        synchronized (f.f2042) {
            char[] cArr7 = (char[]) cArr4.clone();
            char[] cArr8 = (char[]) cArr6.clone();
            cArr7[0] = (char) (c ^ cArr7[0]);
            cArr8[2] = (char) (cArr8[2] + ((char) i));
            int length = cArr2.length;
            char[] cArr9 = new char[length];
            f.f2041 = 0;
            while (f.f2041 < length) {
                int i2 = (f.f2041 + 2) % 4;
                int i3 = (f.f2041 + 3) % 4;
                f.f2043 = (char) (((cArr7[f.f2041 % 4] * 32718) + cArr8[i2]) % 65535);
                cArr8[i3] = (char) (((cArr7[i3] * 32718) + cArr8[i2]) / 65535);
                cArr7[i3] = f.f2043;
                cArr9[f.f2041] = (char) ((((cArr7[i3] ^ cArr2[f.f2041]) ^ f2514) ^ f2515) ^ f2513);
                f.f2041++;
            }
            str4 = new String(cArr9);
        }
        return str4;
    }
}
