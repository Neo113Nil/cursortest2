package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.e;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.custom_views.BlazeTextWithIconButton;
import com.blaze.blazesdk.features.shared.models.ui_shared.i;
import com.google.android.gms.internal.ads.zzagi;
import com.google.android.gms.internal.ads.zzat;
import com.google.android.gms.internal.ads.zzeh;
import com.google.android.gms.internal.ads.zzeu;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.fantasy.FantasyLeagueGameType;
import com.sofascore.results.R;
import com.sofascore.results.weeklyChallenge.WeeklyChallengeViewModel;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.RejectedExecutionException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;
import kotlin.text.c;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class l6g {
    public static final tc3 a = new tc3(-935903021, new qs2(15), false);
    public static final tc3 b = new tc3(1793081675, new ed3(13), false);
    public static final tc3 c = new tc3(1625731024, new ed3(14), false);
    public static final tc3 d = new tc3(-1885395165, new ud3(7), false);
    public static final Object e = new Object();
    public static final Object f = new Object();
    public static final Object g = new Object();
    public static final Object h = new Object();
    public static final Object i = new Object();
    public static final byte[] j = {0, 0, 0, 0, 16, 0, Byte.MIN_VALUE, 0, 0, -86, 0, 56, -101, 113};
    public static final byte[] k = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};
    public static final /* synthetic */ int l = 0;
    public static volatile boolean m = true;
    public static final /* synthetic */ int n = 0;
    public static final /* synthetic */ int o = 0;
    public static final /* synthetic */ int p = 0;

    /* JADX WARN: Code restructure failed: missing block: B:31:0x009d, code lost:
    
        if (r0 != r2) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071 A[Catch: all -> 0x00a0, TRY_LEAVE, TryCatch #0 {all -> 0x00a0, blocks: (B:25:0x006b, B:27:0x0071, B:34:0x00a6, B:39:0x00c2), top: B:24:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6 A[Catch: all -> 0x00a0, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00a0, blocks: (B:25:0x006b, B:27:0x0071, B:34:0x00a6, B:39:0x00c2), top: B:24:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r14v0, types: [db2] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [hc2] */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v5, types: [hc2] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2, types: [db2] */
    /* JADX WARN: Type inference failed for: r3v4, types: [db2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x009d -> B:23:0x0050). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object A(db2 db2Var, ez2 ez2Var, sq3 sq3Var) {
        eb2 eb2Var;
        ?? r3;
        long j2;
        eb2 eb2Var2;
        hc2 hc2Var;
        db2 db2Var2;
        long j3;
        hc2 hc2Var2;
        db2 db2Var3;
        try {
            if (sq3Var instanceof eb2) {
                eb2Var = (eb2) sq3Var;
                int i2 = eb2Var.v;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    eb2Var.v = i2 - Integer.MIN_VALUE;
                    Object obj = eb2Var.u;
                    lu3 lu3Var = lu3.a;
                    r3 = eb2Var.v;
                    if (r3 != 0) {
                        y6a.M(obj);
                        j2 = 0;
                        eb2Var2 = eb2Var;
                        hc2Var = ez2Var;
                        db2Var2 = db2Var;
                        if (db2Var2.h()) {
                        }
                        return lu3Var;
                    }
                    if (r3 == 1) {
                        j2 = eb2Var.t;
                        hc2 hc2Var3 = eb2Var.s;
                        db2 db2Var4 = (db2) eb2Var.r;
                        y6a.M(obj);
                        r3 = db2Var4;
                        db2Var = hc2Var3;
                        eb2Var.r = r3;
                        eb2Var.s = db2Var;
                        eb2Var.t = j2;
                        eb2Var.v = 2;
                        Object g2 = r3.g(1, eb2Var);
                        db2Var3 = r3;
                        hc2Var2 = db2Var;
                    } else {
                        if (r3 != 2) {
                            if (r3 == 3) {
                                j3 = eb2Var.t;
                                y6a.M(obj);
                                return new Long(j3);
                            }
                            if (r3 != 4) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Throwable th = (Throwable) eb2Var.r;
                            y6a.M(obj);
                            throw th;
                        }
                        j2 = eb2Var.t;
                        hc2 hc2Var4 = eb2Var.s;
                        db2 db2Var5 = (db2) eb2Var.r;
                        y6a.M(obj);
                        db2Var3 = db2Var5;
                        hc2Var2 = hc2Var4;
                        eb2 eb2Var3 = eb2Var;
                        hc2Var = hc2Var2;
                        db2Var2 = db2Var3;
                        eb2Var2 = eb2Var3;
                        try {
                            if (db2Var2.h()) {
                                j2 += db2Var2.f().j(hc2Var.d());
                                eb2Var2.r = db2Var2;
                                eb2Var2.s = hc2Var;
                                eb2Var2.t = j2;
                                eb2Var2.v = 1;
                                if (hc2Var.c(eb2Var2) != lu3Var) {
                                    eb2 eb2Var4 = eb2Var2;
                                    r3 = db2Var2;
                                    db2Var = hc2Var;
                                    eb2Var = eb2Var4;
                                    eb2Var.r = r3;
                                    eb2Var.s = db2Var;
                                    eb2Var.t = j2;
                                    eb2Var.v = 2;
                                    Object g22 = r3.g(1, eb2Var);
                                    db2Var3 = r3;
                                    hc2Var2 = db2Var;
                                }
                            } else {
                                Throwable b2 = db2Var2.b();
                                if (b2 != null) {
                                    throw b2;
                                }
                                eb2Var2.r = null;
                                eb2Var2.s = null;
                                eb2Var2.t = j2;
                                eb2Var2.v = 3;
                                if (hc2Var.e(eb2Var2) != lu3Var) {
                                    j3 = j2;
                                    return new Long(j3);
                                }
                            }
                            return lu3Var;
                        } catch (Throwable th2) {
                            th = th2;
                            eb2 eb2Var5 = eb2Var2;
                            r3 = db2Var2;
                            db2Var = hc2Var;
                            eb2Var = eb2Var5;
                            try {
                                r3.a(th);
                                kc2.a(db2Var, th);
                                throw th;
                            } catch (Throwable th3) {
                                eb2Var.r = th3;
                                eb2Var.s = null;
                                eb2Var.v = 4;
                                if (db2Var.e(eb2Var) != lu3Var) {
                                    throw th3;
                                }
                            }
                        }
                    }
                }
            }
            if (r3 != 0) {
            }
        } catch (Throwable th4) {
            th = th4;
        }
        eb2Var = new eb2(sq3Var);
        Object obj2 = eb2Var.u;
        lu3 lu3Var2 = lu3.a;
        r3 = eb2Var.v;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x009b, code lost:
    
        if (r1.g(r7, r13) == r2) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d0, code lost:
    
        if (r0 != r2) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v2, types: [hc2] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [hc2] */
    /* JADX WARN: Type inference failed for: r3v5, types: [hc2] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00d0 -> B:23:0x0054). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object B(db2 db2Var, hc2 hc2Var, long j2, sq3 sq3Var) {
        fb2 fb2Var;
        ?? r3;
        db2 db2Var2;
        long j3;
        long j4;
        fb2 fb2Var2;
        db2 db2Var3;
        long j5;
        long j6;
        hc2 hc2Var2;
        try {
            if (sq3Var instanceof fb2) {
                fb2Var = (fb2) sq3Var;
                int i2 = fb2Var.w;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    fb2Var.w = i2 - Integer.MIN_VALUE;
                    Object obj = fb2Var.v;
                    lu3 lu3Var = lu3.a;
                    r3 = fb2Var.w;
                    int i3 = 1;
                    if (r3 != 0) {
                        y6a.M(obj);
                        r3 = hc2Var;
                        j3 = j2;
                        j4 = j3;
                        fb2Var2 = fb2Var;
                        db2Var3 = db2Var;
                        if (db2Var3.h()) {
                        }
                        fb2Var2.r = null;
                        fb2Var2.s = null;
                        fb2Var2.t = j4;
                        fb2Var2.u = j3;
                        fb2Var2.w = 3;
                        if (r3.c(fb2Var2) != lu3Var) {
                        }
                        return lu3Var;
                    }
                    if (r3 == 1) {
                        j3 = fb2Var.u;
                        j4 = fb2Var.t;
                        hc2 hc2Var3 = fb2Var.s;
                        db2Var2 = (db2) fb2Var.r;
                        y6a.M(obj);
                        r3 = hc2Var3;
                        long min = Math.min(j3, o1j.D(db2Var2.f()));
                        db2Var2.f().f(r3.d(), min);
                        j3 -= min;
                        fb2Var.r = db2Var2;
                        fb2Var.s = r3;
                        fb2Var.t = j4;
                        fb2Var.u = j3;
                        fb2Var.w = 2;
                        Object c2 = r3.c(fb2Var);
                        hc2Var2 = r3;
                    } else {
                        if (r3 != 2) {
                            if (r3 == 3) {
                                j5 = fb2Var.u;
                                j6 = fb2Var.t;
                                y6a.M(obj);
                                return new Long(j6 - j5);
                            }
                            if (r3 != 4) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Throwable th = (Throwable) fb2Var.r;
                            y6a.M(obj);
                            throw th;
                        }
                        j3 = fb2Var.u;
                        j4 = fb2Var.t;
                        hc2 hc2Var4 = fb2Var.s;
                        db2Var2 = (db2) fb2Var.r;
                        y6a.M(obj);
                        hc2Var2 = hc2Var4;
                        try {
                            db2 db2Var4 = db2Var2;
                            fb2Var2 = fb2Var;
                            db2Var3 = db2Var4;
                            if (!db2Var3.h() || j3 <= 0) {
                                fb2Var2.r = null;
                                fb2Var2.s = null;
                                fb2Var2.t = j4;
                                fb2Var2.u = j3;
                                fb2Var2.w = 3;
                                if (r3.c(fb2Var2) != lu3Var) {
                                    j5 = j3;
                                    j6 = j4;
                                    return new Long(j6 - j5);
                                }
                            } else {
                                if (db2Var3.f().w()) {
                                    fb2Var2.r = db2Var3;
                                    fb2Var2.s = r3;
                                    fb2Var2.t = j4;
                                    fb2Var2.u = j3;
                                    fb2Var2.w = i3;
                                }
                                fb2 fb2Var3 = fb2Var2;
                                db2Var2 = db2Var3;
                                fb2Var = fb2Var3;
                                r3 = r3;
                                long min2 = Math.min(j3, o1j.D(db2Var2.f()));
                                db2Var2.f().f(r3.d(), min2);
                                j3 -= min2;
                                fb2Var.r = db2Var2;
                                fb2Var.s = r3;
                                fb2Var.t = j4;
                                fb2Var.u = j3;
                                fb2Var.w = 2;
                                Object c22 = r3.c(fb2Var);
                                hc2Var2 = r3;
                            }
                            return lu3Var;
                        } catch (Throwable th2) {
                            th = th2;
                            fb2 fb2Var4 = fb2Var2;
                            db2Var2 = db2Var3;
                            fb2Var = fb2Var4;
                            try {
                                db2Var2.a(th);
                                kc2.a(r3, th);
                                throw th;
                            } catch (Throwable th3) {
                                fb2Var.r = th3;
                                fb2Var.s = null;
                                fb2Var.w = 4;
                                if (r3.c(fb2Var) != lu3Var) {
                                    throw th3;
                                }
                            }
                        }
                        i3 = 1;
                        r3 = hc2Var2;
                    }
                }
            }
            if (r3 != 0) {
            }
        } catch (Throwable th4) {
            th = th4;
        }
        fb2Var = new fb2(sq3Var);
        Object obj2 = fb2Var.v;
        lu3 lu3Var2 = lu3.a;
        r3 = fb2Var.w;
        int i32 = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004e -> B:11:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x005f -> B:10:0x0062). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object C(db2 db2Var, long j2, sq3 sq3Var) {
        gb2 gb2Var;
        int i2;
        long j3;
        if (sq3Var instanceof gb2) {
            gb2Var = (gb2) sq3Var;
            int i3 = gb2Var.v;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gb2Var.v = i3 - Integer.MIN_VALUE;
                Object obj = gb2Var.u;
                lu3 lu3Var = lu3.a;
                i2 = gb2Var.v;
                if (i2 != 0) {
                    y6a.M(obj);
                    j3 = j2;
                    if (j2 > 0) {
                    }
                    return new Long(j3 - j2);
                }
                if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                long j4 = gb2Var.t;
                j3 = gb2Var.s;
                db2 db2Var2 = gb2Var.r;
                y6a.M(obj);
                long j5 = j4;
                db2Var = db2Var2;
                j2 = j5;
                long min = Math.min(j2, o1j.D(db2Var.f()));
                w52 f2 = db2Var.f();
                f2.getClass();
                f2.request(min);
                f2.skip(Math.min(min, f2.c));
                j2 -= min;
                if (j2 > 0 || db2Var.h()) {
                    return new Long(j3 - j2);
                }
                w52 f3 = db2Var.f();
                f3.getClass();
                if (((int) f3.c) == 0) {
                    gb2Var.r = db2Var;
                    gb2Var.s = j3;
                    gb2Var.t = j2;
                    gb2Var.v = 1;
                    if (db2Var.g(1, gb2Var) == lu3Var) {
                        return lu3Var;
                    }
                    db2Var2 = db2Var;
                    j4 = j2;
                    long j52 = j4;
                    db2Var = db2Var2;
                    j2 = j52;
                }
                long min2 = Math.min(j2, o1j.D(db2Var.f()));
                w52 f22 = db2Var.f();
                f22.getClass();
                f22.request(min2);
                f22.skip(Math.min(min2, f22.c));
                j2 -= min2;
                if (j2 > 0) {
                }
                return new Long(j3 - j2);
            }
        }
        gb2Var = new gb2(sq3Var);
        Object obj2 = gb2Var.u;
        lu3 lu3Var2 = lu3.a;
        i2 = gb2Var.v;
        if (i2 != 0) {
        }
    }

    public static final y8g D(ku3 ku3Var, XmlPullParser xmlPullParser, t9e t9eVar) {
        ku3Var.getClass();
        t9eVar.getClass();
        String str = t9eVar.b;
        qn2 qn2Var = new qn2(0);
        x8g x8gVar = (x8g) qn2Var.a;
        int eventType = xmlPullParser.getEventType();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (eventType != 1 && s9a.w(ku3Var)) {
            if (eventType == 2) {
                if (yfa.i(xmlPullParser, tl0.b)) {
                    z2 = true;
                } else if (yfa.i(xmlPullParser, tl0.j)) {
                    z = true;
                } else if (yfa.i(xmlPullParser, tl0.r)) {
                    if (z) {
                        z3 = true;
                    }
                } else if (yfa.i(xmlPullParser, tl0.v)) {
                    if (z) {
                        z4 = true;
                    }
                } else if (yfa.i(xmlPullParser, tl0.d)) {
                    if (z2) {
                        ((z8g) qn2Var.b).b = yfa.w(xmlPullParser);
                    }
                } else if (yfa.i(xmlPullParser, tl0.q)) {
                    if (z) {
                        ((b9g) qn2Var.c).c = yfa.w(xmlPullParser);
                    }
                } else if (yfa.i(xmlPullParser, tl0.n)) {
                    if (z) {
                        String w = yfa.w(xmlPullParser);
                        String g2 = yfa.g(xmlPullParser, tl0.o);
                        if (w != null && w.length() == 0) {
                            w = g2;
                        }
                        b9g b9gVar = (b9g) qn2Var.c;
                        if (w != null) {
                            b9gVar.m.add(w);
                        }
                    }
                } else if (yfa.i(xmlPullParser, tl0.k)) {
                    if (z) {
                        ((b9g) qn2Var.c).a = yfa.w(xmlPullParser);
                    }
                } else if (yfa.i(xmlPullParser, tl0.l)) {
                    if (z) {
                        String w2 = yfa.w(xmlPullParser);
                        ((b9g) qn2Var.c).g = w2;
                        qn2Var.n(w2);
                    }
                } else if (yfa.i(xmlPullParser, tl0.f)) {
                    if (z) {
                        b9g b9gVar2 = (b9g) qn2Var.c;
                        String w3 = yfa.w(xmlPullParser);
                        if (b9gVar2.e == null) {
                            b9gVar2.e = w3;
                        }
                    } else if (z2) {
                        x8gVar.e = yfa.w(xmlPullParser);
                    }
                } else if (yfa.i(xmlPullParser, tl0.m)) {
                    if (z) {
                        b9g b9gVar3 = (b9g) qn2Var.c;
                        String w4 = yfa.w(xmlPullParser);
                        if (b9gVar3.e == null) {
                            b9gVar3.e = w4;
                        }
                    }
                } else if (yfa.i(xmlPullParser, tl0.e)) {
                    if (z2) {
                        x8gVar.c = yfa.w(xmlPullParser);
                    }
                } else if (yfa.i(xmlPullParser, tl0.p)) {
                    if (z) {
                        String w5 = yfa.w(xmlPullParser);
                        ((b9g) qn2Var.c).f = w5;
                        qn2Var.n(w5);
                    }
                } else if (yfa.i(xmlPullParser, tl0.c)) {
                    if (z && !z3) {
                        ((b9g) qn2Var.c).b = yfa.w(xmlPullParser);
                    } else if (z2 && !z) {
                        x8gVar.a = yfa.w(xmlPullParser);
                    }
                } else if (yfa.i(xmlPullParser, tl0.g)) {
                    if (z2) {
                        String g3 = yfa.g(xmlPullParser, tl0.h);
                        String g4 = yfa.g(xmlPullParser, tl0.i);
                        if (str != null) {
                            tl0 tl0Var = tl0.b;
                            if (Intrinsics.c(g4, "alternate") && g3 != null && c.v(g3, "/", false)) {
                                g3 = dmi.y(str, g3);
                            }
                        }
                        tl0 tl0Var2 = tl0.b;
                        if (!Intrinsics.c(g4, "edit")) {
                            tl0 tl0Var3 = tl0.b;
                            if (!Intrinsics.c(g4, "self")) {
                                tl0 tl0Var4 = tl0.b;
                                if (!Intrinsics.c(g4, "replies")) {
                                    tl0 tl0Var5 = tl0.b;
                                    if (!Intrinsics.c(g4, "enclosure")) {
                                        if (z) {
                                            ((b9g) qn2Var.c).b(g3, g4);
                                        } else if (!z) {
                                            x8gVar.b = g3;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (yfa.i(xmlPullParser, tl0.t)) {
                    if (z) {
                        ((dol) qn2Var.g).a = yfa.w(xmlPullParser);
                    }
                } else if (yfa.i(xmlPullParser, tl0.u)) {
                    if (z) {
                        ((fol) qn2Var.h).a = yfa.w(xmlPullParser);
                    }
                } else if (yfa.i(xmlPullParser, tl0.w)) {
                    if (z && z4) {
                        ((fol) qn2Var.h).b = yfa.w(xmlPullParser);
                    }
                } else if (yfa.i(xmlPullParser, tl0.A)) {
                    if (z && z4) {
                        ((fol) qn2Var.h).e = yfa.w(xmlPullParser);
                    }
                } else if (yfa.i(xmlPullParser, tl0.s)) {
                    if (z) {
                        if (z4) {
                            ((fol) qn2Var.h).c = yfa.g(xmlPullParser, tl0.x);
                        } else {
                            String h2 = yfa.h(xmlPullParser, d9g.g);
                            String h3 = yfa.h(xmlPullParser, d9g.J);
                            String h4 = yfa.h(xmlPullParser, d9g.P);
                            ((hnf) qn2Var.j).a = h2;
                            ((hnf) qn2Var.j).b = h3;
                            ((hnf) qn2Var.j).c = h4;
                            if (h4 == null || StringsKt.R(h4)) {
                                if (h3 != null && !StringsKt.R(h3)) {
                                    if (StringsKt.J(h3, "image", true)) {
                                        ((b9g) qn2Var.c).a(h2);
                                    } else if (StringsKt.J(h3, "audio", true)) {
                                        b9g b9gVar4 = (b9g) qn2Var.c;
                                        if (b9gVar4.i == null) {
                                            b9gVar4.i = h2;
                                        }
                                    } else if (StringsKt.J(h3, "video", true)) {
                                        b9g b9gVar5 = (b9g) qn2Var.c;
                                        if (b9gVar5.j == null) {
                                            b9gVar5.j = h2;
                                        }
                                    }
                                }
                            } else if (h4.equalsIgnoreCase("image")) {
                                ((b9g) qn2Var.c).a(h2);
                            } else if (h4.equalsIgnoreCase("audio")) {
                                b9g b9gVar6 = (b9g) qn2Var.c;
                                if (b9gVar6.i == null) {
                                    b9gVar6.i = h2;
                                }
                            } else if (h4.equalsIgnoreCase("video")) {
                                b9g b9gVar7 = (b9g) qn2Var.c;
                                if (b9gVar7.j == null) {
                                    b9gVar7.j = h2;
                                }
                            }
                        }
                    }
                } else if (!yfa.i(xmlPullParser, tl0.y)) {
                    if (yfa.i(xmlPullParser, tl0.D)) {
                        if (z && z4) {
                            String g5 = yfa.g(xmlPullParser, tl0.E);
                            ((fol) qn2Var.h).f = g5 != null ? StringsKt.toIntOrNull(g5) : null;
                        }
                    } else if (yfa.i(xmlPullParser, tl0.B) && z && z4) {
                        String g6 = yfa.g(xmlPullParser, tl0.C);
                        ((fol) qn2Var.h).g = g6 != null ? StringsKt.toIntOrNull(g6) : null;
                    }
                } else if (z) {
                    String g7 = yfa.g(xmlPullParser, tl0.z);
                    if (z4) {
                        ((fol) qn2Var.h).d = g7;
                    } else {
                        ((b9g) qn2Var.c).a(g7);
                    }
                }
            } else if (eventType == 3 && yfa.i(xmlPullParser, tl0.v)) {
                z4 = false;
            } else if (eventType == 3 && yfa.i(xmlPullParser, tl0.j)) {
                qn2Var.b();
                z = false;
                z4 = false;
            } else if (eventType == 3 && yfa.i(xmlPullParser, tl0.r)) {
                z3 = false;
            } else if (eventType == 3 && yfa.i(xmlPullParser, tl0.b)) {
                z2 = false;
            }
            eventType = xmlPullParser.next();
        }
        return qn2Var.a();
    }

    public static Drawable E(Context context, Context context2, int i2, Resources.Theme theme) {
        try {
            if (m) {
                return I(context2, i2, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e2) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e2;
            }
            return context2.getDrawable(i2);
        } catch (NoClassDefFoundError unused2) {
            m = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal threadLocal = z1g.a;
        return resources.getDrawable(i2, theme);
    }

    public static final float F(int i2, int i3, long j2, float f2, boolean z) {
        if (!z) {
            return (Float.intBitsToFloat((int) (j2 >> 32)) * ((i2 - 1.0f) / (i3 - 1.0f))) + f2;
        }
        int i4 = (int) (j2 >> 32);
        return Float.intBitsToFloat(i4) - (Float.intBitsToFloat(i4) * ((i2 - 1.0f) / (i3 - 1.0f)));
    }

    public static final float G(float f2, int i2, int i3, long j2) {
        return Float.intBitsToFloat((int) (j2 & 4294967295L)) * (1.0f - ((f2 - i2) / i3));
    }

    public static String H(long j2) {
        return lhk.b("yMMMd", Locale.getDefault()).format(new Date(j2));
    }

    public static Drawable I(Context context, int i2, Resources.Theme theme) {
        if (theme != null) {
            lq3 lq3Var = new lq3(context);
            lq3Var.b = theme;
            lq3Var.a(theme.getResources().getConfiguration());
            context = lq3Var;
        }
        return td4.d0(i2, context);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Comparable J(db2 db2Var, int i2, sq3 sq3Var) {
        hb2 hb2Var;
        Object obj;
        int i3;
        if (sq3Var instanceof hb2) {
            hb2Var = (hb2) sq3Var;
            int i4 = hb2Var.u;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                hb2Var.u = i4 - Integer.MIN_VALUE;
                obj = hb2Var.t;
                lu3 lu3Var = lu3.a;
                i3 = hb2Var.u;
                if (i3 != 0) {
                    y6a.M(obj);
                    if (!db2Var.h()) {
                        hb2Var.r = db2Var;
                        hb2Var.s = i2;
                        hb2Var.u = 1;
                        obj = db2Var.g(i2, hb2Var);
                        if (obj == lu3Var) {
                            return lu3Var;
                        }
                    }
                    return null;
                }
                if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = hb2Var.s;
                db2Var = hb2Var.r;
                y6a.M(obj);
                if (((Boolean) obj).booleanValue()) {
                    w52 f2 = db2Var.f();
                    f2.getClass();
                    return new fc2(yaa.L(new lpf(new sce(f2)), i2));
                }
                return null;
            }
        }
        hb2Var = new hb2(sq3Var);
        obj = hb2Var.t;
        lu3 lu3Var2 = lu3.a;
        i3 = hb2Var.u;
        if (i3 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return null;
    }

    public static final b7 K(Object... objArr) {
        rlh rlhVar = rlh.b;
        List asList = Arrays.asList(objArr);
        asList.getClass();
        rlhVar.getClass();
        return rlhVar.c(asList);
    }

    public static final tee L(Pair... pairArr) {
        uee ueeVar = uee.g;
        ueeVar.getClass();
        vee veeVar = new vee(ueeVar);
        tub.n(veeVar, pairArr);
        return veeVar.build();
    }

    public static final bfe M(Object... objArr) {
        bfe bfeVar = bfe.e;
        List asList = Arrays.asList(objArr);
        asList.getClass();
        bfeVar.getClass();
        if (asList.isEmpty()) {
            return bfeVar;
        }
        dfe dfeVar = new dfe(bfeVar);
        dfeVar.addAll(asList);
        return dfeVar.m();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object N(db2 db2Var, sq3 sq3Var) {
        ib2 ib2Var;
        int i2;
        w52 w52Var;
        Throwable b2;
        if (sq3Var instanceof ib2) {
            ib2Var = (ib2) sq3Var;
            int i3 = ib2Var.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ib2Var.u = i3 - Integer.MIN_VALUE;
                Object obj = ib2Var.t;
                lu3 lu3Var = lu3.a;
                i2 = ib2Var.u;
                if (i2 != 0) {
                    y6a.M(obj);
                    w52Var = new w52();
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w52 w52Var2 = ib2Var.s;
                    db2 db2Var2 = ib2Var.r;
                    y6a.M(obj);
                    w52Var = w52Var2;
                    db2Var = db2Var2;
                }
                while (!db2Var.h()) {
                    w52Var.i(db2Var.f());
                    ib2Var.r = db2Var;
                    ib2Var.s = w52Var;
                    ib2Var.u = 1;
                    if (db2Var.g(1, ib2Var) == lu3Var) {
                        return lu3Var;
                    }
                }
                b2 = db2Var.b();
                if (b2 != null) {
                    return w52Var;
                }
                throw b2;
            }
        }
        ib2Var = new ib2(sq3Var);
        Object obj2 = ib2Var.t;
        lu3 lu3Var2 = lu3.a;
        i2 = ib2Var.u;
        if (i2 != 0) {
        }
        while (!db2Var.h()) {
        }
        b2 = db2Var.b();
        if (b2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004e -> B:11:0x0063). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005f -> B:10:0x0061). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object O(yu3 yu3Var, int i2, sq3 sq3Var) {
        jb2 jb2Var;
        int i3;
        int i4;
        w52 w52Var;
        db2 db2Var;
        if (sq3Var instanceof jb2) {
            jb2Var = (jb2) sq3Var;
            int i5 = jb2Var.v;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                jb2Var.v = i5 - Integer.MIN_VALUE;
                Object obj = jb2Var.u;
                lu3 lu3Var = lu3.a;
                i3 = jb2Var.v;
                if (i3 == 0) {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i6 = jb2Var.t;
                    w52Var = jb2Var.s;
                    db2 db2Var2 = jb2Var.r;
                    y6a.M(obj);
                    i4 = i6;
                    db2 db2Var3 = db2Var2;
                    if (!db2Var3.h()) {
                        long j2 = i4;
                        if (o1j.D(db2Var3.f()) > j2 - w52Var.c) {
                            db2Var3.f().f(w52Var, j2 - w52Var.c);
                            db2Var = db2Var3;
                        } else {
                            o02.L(db2Var3.f().j(w52Var));
                            db2Var = db2Var3;
                        }
                        if (w52Var.c < i4) {
                            boolean w = db2Var.f().w();
                            db2Var3 = db2Var;
                            if (w) {
                                jb2Var.r = db2Var;
                                jb2Var.s = w52Var;
                                jb2Var.t = i4;
                                jb2Var.v = 1;
                                if (db2Var.g(1, jb2Var) == lu3Var) {
                                    return lu3Var;
                                }
                                db2Var2 = db2Var;
                                i6 = i4;
                                i4 = i6;
                                db2 db2Var32 = db2Var2;
                            }
                            if (!db2Var32.h()) {
                            }
                        }
                    }
                    if (w52Var.c < i4) {
                        return w52Var;
                    }
                    throw new EOFException(lnb.l(w52Var.c, " available", lnb.t(i4, "Not enough data available, required ", " bytes but only ")));
                }
                y6a.M(obj);
                i4 = i2;
                w52Var = new w52();
                db2Var = yu3Var;
                if (w52Var.c < i4) {
                }
                if (w52Var.c < i4) {
                }
            }
        }
        jb2Var = new jb2(sq3Var);
        Object obj2 = jb2Var.u;
        lu3 lu3Var2 = lu3.a;
        i3 = jb2Var.v;
        if (i3 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(db2 db2Var, long j2, sq3 sq3Var) {
        lb2 lb2Var;
        int i2;
        w52 w52Var;
        if (sq3Var instanceof lb2) {
            lb2Var = (lb2) sq3Var;
            int i3 = lb2Var.v;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                lb2Var.v = i3 - Integer.MIN_VALUE;
                Object obj = lb2Var.u;
                lu3 lu3Var = lu3.a;
                i2 = lb2Var.v;
                if (i2 != 0) {
                    y6a.M(obj);
                    w52Var = new w52();
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    long j3 = lb2Var.t;
                    w52 w52Var2 = lb2Var.s;
                    db2 db2Var2 = lb2Var.r;
                    y6a.M(obj);
                    w52Var = w52Var2;
                    j2 = j3;
                    db2Var = db2Var2;
                }
                while (!db2Var.h()) {
                    long j4 = 0;
                    if (j2 <= 0) {
                        break;
                    }
                    if (j2 >= o1j.D(db2Var.f())) {
                        j4 = j2 - o1j.D(db2Var.f());
                        o02.L(db2Var.f().j(w52Var));
                    } else {
                        db2Var.f().f(w52Var, j2);
                    }
                    lb2Var.r = db2Var;
                    lb2Var.s = w52Var;
                    lb2Var.t = j4;
                    lb2Var.v = 1;
                    if (db2Var.g(1, lb2Var) == lu3Var) {
                        return lu3Var;
                    }
                    j2 = j4;
                }
                w52Var.getClass();
                return w52Var;
            }
        }
        lb2Var = new lb2(sq3Var);
        Object obj2 = lb2Var.u;
        lu3 lu3Var2 = lu3.a;
        i2 = lb2Var.v;
        if (i2 != 0) {
        }
        while (!db2Var.h()) {
        }
        w52Var.getClass();
        return w52Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Q(db2 db2Var, sq3 sq3Var) {
        kb2 kb2Var;
        int i2;
        w52 w52Var;
        Throwable b2;
        if (sq3Var instanceof kb2) {
            kb2Var = (kb2) sq3Var;
            int i3 = kb2Var.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                kb2Var.u = i3 - Integer.MIN_VALUE;
                Object obj = kb2Var.t;
                lu3 lu3Var = lu3.a;
                i2 = kb2Var.u;
                if (i2 != 0) {
                    y6a.M(obj);
                    w52Var = new w52();
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w52 w52Var2 = kb2Var.s;
                    db2 db2Var2 = kb2Var.r;
                    y6a.M(obj);
                    w52Var = w52Var2;
                    db2Var = db2Var2;
                }
                while (!db2Var.h()) {
                    w52Var.i(db2Var.f());
                    kb2Var.r = db2Var;
                    kb2Var.s = w52Var;
                    kb2Var.u = 1;
                    if (db2Var.g(1, kb2Var) == lu3Var) {
                        return lu3Var;
                    }
                }
                b2 = db2Var.b();
                if (b2 == null) {
                    throw b2;
                }
                w52Var.getClass();
                return w52Var;
            }
        }
        kb2Var = new kb2(sq3Var);
        Object obj2 = kb2Var.t;
        lu3 lu3Var2 = lu3.a;
        i2 = kb2Var.u;
        if (i2 != 0) {
        }
        while (!db2Var.h()) {
        }
        b2 = db2Var.b();
        if (b2 == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x018e, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0177, code lost:
    
        if (r13.c >= r4) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0179, code lost:
    
        r2.r = r6;
        r2.s = r15;
        r2.t = r14;
        r2.u = r13;
        r2.v = r4;
        r2.w = r0;
        r2.y = 3;
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x018c, code lost:
    
        if (r6.g(1, r2) != r3) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01b0, code lost:
    
        throw new defpackage.yjj("Line exceeds limit of " + r4 + " characters");
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0094, code lost:
    
        if (r0.g(1, r2) == r3) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x01d1: INVOKE (r14 I:java.lang.AutoCloseable), (r1 I:java.lang.Throwable) STATIC call: o1j.t(java.lang.AutoCloseable, java.lang.Throwable):void A[MD:(java.lang.AutoCloseable, java.lang.Throwable):void (m)] (LINE:466), block:B:86:0x01d1 */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b8 A[Catch: all -> 0x0045, LOOP:0: B:18:0x00b8->B:24:0x016d, LOOP_START, TryCatch #1 {all -> 0x0045, blocks: (B:13:0x003f, B:16:0x00b2, B:18:0x00b8, B:20:0x00c2, B:31:0x00ce, B:33:0x00d8, B:39:0x00f2, B:41:0x00ff, B:43:0x011d, B:44:0x0141, B:47:0x013c, B:48:0x0109, B:26:0x0155, B:24:0x016d, B:50:0x0172, B:52:0x0179, B:54:0x0195, B:55:0x01b0, B:56:0x01b1, B:59:0x01bb, B:61:0x01c1, B:68:0x005b), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ff A[Catch: all -> 0x0045, TryCatch #1 {all -> 0x0045, blocks: (B:13:0x003f, B:16:0x00b2, B:18:0x00b8, B:20:0x00c2, B:31:0x00ce, B:33:0x00d8, B:39:0x00f2, B:41:0x00ff, B:43:0x011d, B:44:0x0141, B:47:0x013c, B:48:0x0109, B:26:0x0155, B:24:0x016d, B:50:0x0172, B:52:0x0179, B:54:0x0195, B:55:0x01b0, B:56:0x01b1, B:59:0x01bb, B:61:0x01c1, B:68:0x005b), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011d A[Catch: all -> 0x0045, TryCatch #1 {all -> 0x0045, blocks: (B:13:0x003f, B:16:0x00b2, B:18:0x00b8, B:20:0x00c2, B:31:0x00ce, B:33:0x00d8, B:39:0x00f2, B:41:0x00ff, B:43:0x011d, B:44:0x0141, B:47:0x013c, B:48:0x0109, B:26:0x0155, B:24:0x016d, B:50:0x0172, B:52:0x0179, B:54:0x0195, B:55:0x01b0, B:56:0x01b1, B:59:0x01bb, B:61:0x01c1, B:68:0x005b), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013c A[Catch: all -> 0x0045, TryCatch #1 {all -> 0x0045, blocks: (B:13:0x003f, B:16:0x00b2, B:18:0x00b8, B:20:0x00c2, B:31:0x00ce, B:33:0x00d8, B:39:0x00f2, B:41:0x00ff, B:43:0x011d, B:44:0x0141, B:47:0x013c, B:48:0x0109, B:26:0x0155, B:24:0x016d, B:50:0x0172, B:52:0x0179, B:54:0x0195, B:55:0x01b0, B:56:0x01b1, B:59:0x01bb, B:61:0x01c1, B:68:0x005b), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0109 A[Catch: all -> 0x0045, TryCatch #1 {all -> 0x0045, blocks: (B:13:0x003f, B:16:0x00b2, B:18:0x00b8, B:20:0x00c2, B:31:0x00ce, B:33:0x00d8, B:39:0x00f2, B:41:0x00ff, B:43:0x011d, B:44:0x0141, B:47:0x013c, B:48:0x0109, B:26:0x0155, B:24:0x016d, B:50:0x0172, B:52:0x0179, B:54:0x0195, B:55:0x01b0, B:56:0x01b1, B:59:0x01bb, B:61:0x01c1, B:68:0x005b), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01b1 A[Catch: all -> 0x0045, TryCatch #1 {all -> 0x0045, blocks: (B:13:0x003f, B:16:0x00b2, B:18:0x00b8, B:20:0x00c2, B:31:0x00ce, B:33:0x00d8, B:39:0x00f2, B:41:0x00ff, B:43:0x011d, B:44:0x0141, B:47:0x013c, B:48:0x0109, B:26:0x0155, B:24:0x016d, B:50:0x0172, B:52:0x0179, B:54:0x0195, B:55:0x01b0, B:56:0x01b1, B:59:0x01bb, B:61:0x01c1, B:68:0x005b), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Appendable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x018c -> B:15:0x018f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object R(db2 db2Var, oo2 oo2Var, int i2, int i3, sq3 sq3Var) {
        mb2 mb2Var;
        int i4;
        long j2;
        oo2 oo2Var2;
        int i5;
        int i6;
        db2 db2Var2;
        int i7;
        Appendable appendable;
        w52 w52Var;
        AutoCloseable autoCloseable;
        w52 f2;
        Appendable appendable2;
        w52 w52Var2;
        db2 db2Var3;
        db2 db2Var4 = db2Var;
        try {
            if (sq3Var instanceof mb2) {
                mb2Var = (mb2) sq3Var;
                int i8 = mb2Var.y;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    mb2Var.y = i8 - Integer.MIN_VALUE;
                    Object obj = mb2Var.x;
                    lu3 lu3Var = lu3.a;
                    i4 = mb2Var.y;
                    int i9 = 2;
                    byte b2 = 0;
                    int i10 = 1;
                    Throwable th = null;
                    if (i4 != 0) {
                        j2 = 0;
                        y6a.M(obj);
                        if (db2Var4.f().w()) {
                            mb2Var.r = db2Var4;
                            oo2Var2 = oo2Var;
                            mb2Var.s = oo2Var2;
                            i5 = i2;
                            mb2Var.v = i5;
                            i6 = i3;
                            mb2Var.w = i6;
                            mb2Var.y = 1;
                        } else {
                            oo2Var2 = oo2Var;
                            i5 = i2;
                            i6 = i3;
                        }
                    } else {
                        if (i4 != 1) {
                            if (i4 == 2) {
                                j2 = 0;
                                i7 = mb2Var.v;
                                w52Var2 = mb2Var.u;
                                autoCloseable = mb2Var.t;
                                appendable2 = mb2Var.s;
                                db2Var3 = mb2Var.r;
                                y6a.M(obj);
                                db2Var2 = db2Var3;
                                w52Var = w52Var2;
                                appendable = appendable2;
                                f2 = db2Var2.f();
                                f2.getClass();
                                if (j2 >= f2.c) {
                                }
                                if (b2 != 10) {
                                }
                                w52Var.getClass();
                                appendable.append(qha.q(w52Var, w52Var.c));
                                Boolean bool = Boolean.TRUE;
                                o1j.t(autoCloseable, th);
                                return bool;
                            }
                            if (i4 != 3) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i7 = mb2Var.w;
                            i5 = mb2Var.v;
                            w52Var = mb2Var.u;
                            autoCloseable = mb2Var.t;
                            appendable = mb2Var.s;
                            j2 = 0;
                            db2Var2 = mb2Var.r;
                            y6a.M(obj);
                            int i11 = 1;
                            i10 = i11;
                            i9 = 2;
                            b2 = 0;
                            th = null;
                            if (!db2Var2.h()) {
                                ?? r10 = w52Var.c > j2 ? i10 : 0;
                                Boolean valueOf = Boolean.valueOf((boolean) r10);
                                if (r10 != 0) {
                                    appendable.append(qha.q(w52Var, w52Var.c));
                                }
                                o1j.t(autoCloseable, null);
                                return valueOf;
                            }
                            while (true) {
                                if (db2Var2.f().w()) {
                                    break;
                                }
                                byte readByte = db2Var2.f().readByte();
                                if (readByte == 13) {
                                    if (db2Var2.f().w()) {
                                        mb2Var.r = db2Var2;
                                        mb2Var.s = appendable;
                                        mb2Var.t = autoCloseable;
                                        mb2Var.u = w52Var;
                                        mb2Var.v = i7;
                                        mb2Var.y = i9;
                                        if (db2Var2.g(i10, mb2Var) != lu3Var) {
                                            db2Var3 = db2Var2;
                                            w52Var2 = w52Var;
                                            appendable2 = appendable;
                                        }
                                    }
                                } else {
                                    if (readByte == 10) {
                                        List list = m7b.b;
                                        S(i7, i9);
                                        w52Var.getClass();
                                        appendable.append(qha.q(w52Var, w52Var.c));
                                        Boolean bool2 = Boolean.TRUE;
                                        o1j.t(autoCloseable, th);
                                        return bool2;
                                    }
                                    w52Var.p(readByte);
                                }
                            }
                            f2 = db2Var2.f();
                            f2.getClass();
                            if (j2 >= f2.c) {
                                a1h a1hVar = f2.a;
                                a1hVar.getClass();
                                b2 = a1hVar.b(b2);
                            } else {
                                zzl.r(lnb.l(f2.c, "))", new StringBuilder("position (0) is not within the range [0..size(")));
                            }
                            if (b2 != 10) {
                                List list2 = m7b.b;
                                S(i7, 4);
                                w52 f3 = db2Var2.f();
                                f3.getClass();
                                f3.request(1L);
                                long min = Math.min(1L, f3.c);
                                f3.skip(min);
                                o02.L(min);
                            } else {
                                List list3 = m7b.b;
                                S(i7, i10);
                            }
                            w52Var.getClass();
                            appendable.append(qha.q(w52Var, w52Var.c));
                            Boolean bool3 = Boolean.TRUE;
                            o1j.t(autoCloseable, th);
                            return bool3;
                        }
                        j2 = 0;
                        int i12 = mb2Var.w;
                        i5 = mb2Var.v;
                        ?? r6 = mb2Var.s;
                        db2 db2Var5 = mb2Var.r;
                        y6a.M(obj);
                        oo2Var2 = r6;
                        i6 = i12;
                        db2Var4 = db2Var5;
                    }
                    if (!db2Var4.h()) {
                        return Boolean.FALSE;
                    }
                    int i13 = i6;
                    db2Var2 = db2Var4;
                    i7 = i13;
                    appendable = oo2Var2;
                    w52Var = new w52();
                    autoCloseable = w52Var;
                    if (!db2Var2.h()) {
                    }
                }
            }
            if (i4 != 0) {
            }
            if (!db2Var4.h()) {
            }
        } finally {
        }
        mb2Var = new mb2(sq3Var);
        Object obj2 = mb2Var.x;
        lu3 lu3Var2 = lu3.a;
        i4 = mb2Var.y;
        int i92 = 2;
        byte b22 = 0;
        int i102 = 1;
        Throwable th2 = null;
    }

    public static final void S(int i2, int i3) {
        List list = m7b.b;
        if ((i2 | i3) == i2) {
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected line ending ");
        sb.append((Object) m7b.a(i3));
        String a2 = m7b.a(i2);
        sb.append(", while expected ");
        sb.append((Object) a2);
        throw new IOException(sb.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object T(File file, Function1 function1, sq3 sq3Var) {
        p18 p18Var;
        int i2;
        try {
            if (sq3Var instanceof p18) {
                p18Var = (p18) sq3Var;
                int i3 = p18Var.t;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    p18Var.t = i3 - Integer.MIN_VALUE;
                    Object obj = p18Var.s;
                    Object obj2 = lu3.a;
                    i2 = p18Var.t;
                    if (i2 != 0) {
                        y6a.M(obj);
                        p18Var.r = file;
                        p18Var.t = 1;
                        Object invoke = function1.invoke(p18Var);
                        return invoke == obj2 ? obj2 : invoke;
                    }
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    File file2 = p18Var.r;
                    y6a.M(obj);
                    return obj;
                }
            }
            if (i2 != 0) {
            }
        } catch (IOException e2) {
            if (e2 instanceof uu3) {
                throw e2;
            }
            file.getClass();
            if (!file.exists()) {
                throw fkf.w(file, e2);
            }
            if (file.isFile()) {
                if (file.canRead()) {
                    if (file.canWrite()) {
                        throw fkf.w(file, e2);
                    }
                    throw fkf.w(file, e2);
                }
                if (file.canWrite()) {
                    throw fkf.w(file, e2);
                }
                throw fkf.w(file, e2);
            }
            if (file.canRead()) {
                if (file.canWrite()) {
                    throw fkf.w(file, e2);
                }
                throw fkf.w(file, e2);
            }
            if (file.canWrite()) {
                throw fkf.w(file, e2);
            }
            throw fkf.w(file, e2);
        }
        p18Var = new p18(sq3Var);
        Object obj3 = p18Var.s;
        Object obj22 = lu3.a;
        i2 = p18Var.t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        if (C(r6, r7, r0) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0049, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object U(db2 db2Var, fc2 fc2Var, sq3 sq3Var) {
        nb2 nb2Var;
        Object obj;
        int i2;
        if (sq3Var instanceof nb2) {
            nb2Var = (nb2) sq3Var;
            int i3 = nb2Var.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                nb2Var.u = i3 - Integer.MIN_VALUE;
                obj = nb2Var.t;
                lu3 lu3Var = lu3.a;
                i2 = nb2Var.u;
                if (i2 != 0) {
                    y6a.M(obj);
                    int length = fc2Var.a.length;
                    nb2Var.r = db2Var;
                    nb2Var.s = fc2Var;
                    nb2Var.u = 1;
                    obj = J(db2Var, length, nb2Var);
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            y6a.M(obj);
                            return Boolean.TRUE;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fc2Var = nb2Var.s;
                    db2Var = nb2Var.r;
                    y6a.M(obj);
                }
                if (Intrinsics.c(obj, fc2Var)) {
                    return Boolean.FALSE;
                }
                long length2 = fc2Var.a.length;
                nb2Var.r = null;
                nb2Var.s = null;
                nb2Var.u = 2;
            }
        }
        nb2Var = new nb2(sq3Var);
        obj = nb2Var.t;
        lu3 lu3Var2 = lu3.a;
        i2 = nb2Var.u;
        if (i2 != 0) {
        }
        if (Intrinsics.c(obj, fc2Var)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r4v2, types: [byte[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable V(db2 db2Var, sq3 sq3Var) {
        ob2 ob2Var;
        int i2;
        if (sq3Var instanceof ob2) {
            ob2Var = (ob2) sq3Var;
            int i3 = ob2Var.s;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ob2Var.s = i3 - Integer.MIN_VALUE;
                Object obj = ob2Var.r;
                lu3 lu3Var = lu3.a;
                i2 = ob2Var.s;
                if (i2 != 0) {
                    y6a.M(obj);
                    ob2Var.s = 1;
                    obj = N(db2Var, ob2Var);
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
                w52 w52Var = (w52) obj;
                return yaa.L(w52Var, (int) w52Var.c);
            }
        }
        ob2Var = new ob2(sq3Var);
        Object obj2 = ob2Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = ob2Var.s;
        if (i2 != 0) {
        }
        w52 w52Var2 = (w52) obj2;
        return yaa.L(w52Var2, (int) w52Var2.c);
    }

    public static final gv9 W(Iterable iterable) {
        iterable.getClass();
        gv9 gv9Var = iterable instanceof gv9 ? (gv9) iterable : null;
        return gv9Var == null ? Z(iterable) : gv9Var;
    }

    public static final tee X(Map map) {
        map.getClass();
        tee teeVar = map instanceof tee ? (tee) map : null;
        if (teeVar != null) {
            return teeVar;
        }
        see seeVar = map instanceof see ? (see) map : null;
        tee build = seeVar != null ? seeVar.build() : null;
        if (build != null) {
            return build;
        }
        uee ueeVar = uee.g;
        ueeVar.getClass();
        return ueeVar.h(map);
    }

    public static final wv9 Y(Iterable iterable) {
        iterable.getClass();
        wv9 wv9Var = iterable instanceof wv9 ? (wv9) iterable : null;
        if (wv9Var != null) {
            return wv9Var;
        }
        dfe dfeVar = iterable instanceof dfe ? (dfe) iterable : null;
        bfe m2 = dfeVar != null ? dfeVar.m() : null;
        if (m2 != null) {
            return m2;
        }
        bfe bfeVar = bfe.e;
        bfeVar.getClass();
        if (!(iterable instanceof Collection)) {
            dfe dfeVar2 = new dfe(bfeVar);
            o13.v(iterable, dfeVar2);
            return dfeVar2.m();
        }
        Collection collection = (Collection) iterable;
        if (collection.isEmpty()) {
            return bfeVar;
        }
        dfe dfeVar3 = new dfe(bfeVar);
        dfeVar3.addAll(collection);
        return dfeVar3.m();
    }

    public static final b7 Z(Iterable iterable) {
        iterable.getClass();
        b7 b7Var = iterable instanceof b7 ? (b7) iterable : null;
        if (b7Var != null) {
            return b7Var;
        }
        hfe hfeVar = iterable instanceof hfe ? (hfe) iterable : null;
        b7 d2 = hfeVar != null ? hfeVar.d() : null;
        if (d2 != null) {
            return d2;
        }
        rlh rlhVar = rlh.b;
        rlhVar.getClass();
        if (iterable instanceof Collection) {
            return rlhVar.c((Collection) iterable);
        }
        hfe d3 = rlhVar.d();
        o13.v(iterable, d3);
        return d3.d();
    }

    public static final void a(int i2, of3 of3Var, xtc xtcVar, Function0 function0) {
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-312354277);
        int i3 = i2 | (av8Var.i(function0) ? 4 : 2) | (av8Var.g(xtcVar) ? 32 : 16);
        int i4 = 0;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            xtc q = n9e.q(bkh.d(xtcVar, 1.0f), lz.D(R.color.surface_1, av8Var), o7g.a(16.0f));
            long D = lz.D(R.color.n_lv_4, av8Var);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = mz1.e(av8Var);
            }
            wzc wzcVar = (wzc) O;
            Object[] objArr = new Object[0];
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = fi.c;
                av8Var.n0(O2);
            }
            xtc c0 = l98.c0(tol.y(q, true, true, true, D, wzcVar, new gm((boh) o3a.N(objArr, (Function0) O2, av8Var, 48), function0, i4), av8Var, 0), 16.0f, 12.0f);
            u23 a2 = t23.a(ww9.d, uxf.p, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, c0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            utc utcVar = utc.a;
            xtc d2 = bkh.d(utcVar, 1.0f);
            lv1 lv1Var = uxf.m;
            l8g a3 = k8g.a(ww9.b, lv1Var, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, d2);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            String v = oea.v(R.string.sofascore_analyst_smarter_predictions, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, new goa(1.0f, true), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var, 0, 0, 131064);
            kq9.b(s6a.N(R.drawable.ic_ai, 6, av8Var), null, l98.f0(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), lz.D(R.color.brand_tertiary_variant, av8Var), av8Var, 432, 0);
            av8Var.s(true);
            udj.c(oea.v(R.string.sofascore_analyst_odds_prematch_body, av8Var), l98.d0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var, 48, 0, 131064);
            xtc f0 = l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 5);
            l8g a4 = k8g.a(new ng0(4.0f, true, new a70(6)), lv1Var, av8Var, 54);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C3 = fqj.C(av8Var, f0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a4, f50Var);
            waa.K(av8Var, m4, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            udj.c(oea.v(R.string.learn_more_button, av8Var), null, lz.D(R.color.primary_default, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, 0, 0, 131066);
            av8Var = av8Var;
            kq9.b(s6a.N(R.drawable.ic_chevron_right_large_16, 6, av8Var), null, bkh.l(utcVar, 16.0f), lz.D(R.color.primary_default, av8Var), av8Var, 432, 0);
            av8Var.s(true);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new fm(function0, xtcVar, i2, 0);
        }
    }

    public static final b7 a0(Sequence sequence) {
        rlh rlhVar = rlh.b;
        rlhVar.getClass();
        hfe d2 = rlhVar.d();
        Iterator it = sequence.iterator();
        while (it.hasNext()) {
            d2.add(it.next());
        }
        return d2.d();
    }

    public static final void b(fm8 fm8Var, Function1 function1, of3 of3Var, int i2) {
        av8 av8Var;
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-858640839);
        int i3 = (av8Var2.g(fm8Var) ? 4 : 2) | i2 | (av8Var2.i(function1) ? 32 : 16);
        int i4 = 0;
        if (av8Var2.T(i3 & 1, (i3 & 19) != 18)) {
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = hz8.G(g.a, av8Var2);
                av8Var2.n0(O);
            }
            ku3 ku3Var = (ku3) O;
            boolean z = true;
            n29 a2 = r29.a(av8Var2);
            Object O2 = av8Var2.O();
            if (O2 == a99Var) {
                O2 = e.f(Boolean.FALSE);
                av8Var2.n0(O2);
            }
            e1d e1dVar = (e1d) O2;
            xtc p2 = qx9.p(bkh.c, 0.5625f);
            boolean i5 = av8Var2.i(ku3Var) | av8Var2.i(a2);
            if ((i3 & 112) != 32) {
                z = false;
            }
            boolean z2 = i5 | z;
            Object O3 = av8Var2.O();
            if (z2 || O3 == a99Var) {
                m61 m61Var = new m61(ku3Var, e1dVar, a2, function1, 0);
                av8Var2.n0(m61Var);
                O3 = m61Var;
            }
            av8Var = av8Var2;
            uni.a(k53.b0(p2, a2, (Function0) O3, false, 12), null, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, yqo.H(1528979796, av8Var2, new n61(fm8Var, i3, i4)), av8Var, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new vn6(fm8Var, function1, i2, 5);
        }
    }

    public static final tee b0(Map map) {
        uee ueeVar = map instanceof uee ? (uee) map : null;
        if (ueeVar != null) {
            return ueeVar;
        }
        vee veeVar = map instanceof vee ? (vee) map : null;
        tee build = veeVar != null ? veeVar.build() : null;
        if (build != null) {
            return build;
        }
        uee ueeVar2 = uee.g;
        ueeVar2.getClass();
        return ueeVar2.h(map);
    }

    public static final void c(bt1 bt1Var, Function1 function1, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        av8 av8Var;
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-109996191);
        if ((i2 & 6) == 0) {
            i3 = (av8Var2.g(bt1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = 16;
        if ((i2 & 48) == 0) {
            i3 |= av8Var2.i(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i5 = 0;
        if (av8Var2.T(i3 & 1, (i3 & 147) != 146)) {
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = e.c(0);
                av8Var2.n0(O);
            }
            znh znhVar = (znh) O;
            Unit unit = Unit.a;
            Object O2 = av8Var2.O();
            if (O2 == a99Var) {
                O2 = new at1(znhVar, null, i5);
                av8Var2.n0(O2);
            }
            hz8.o(av8Var2, unit, (Function2) O2);
            int i6 = bt1Var.g;
            x43 x43Var = bt1Var.o;
            boolean z = bt1Var.e;
            String str = bt1Var.h;
            String str2 = bt1Var.i;
            tc3 H = yqo.H(-1572159865, av8Var2, new kr1(bt1Var, i4));
            tc3 H2 = yqo.H(-101385277, av8Var2, new ws1(bt1Var, znhVar, i5));
            int i7 = i3 & 112;
            int i8 = i3 & 14;
            boolean z2 = (i8 == 4) | (i7 == 32);
            Object O3 = av8Var2.O();
            if (z2 || O3 == a99Var) {
                O3 = new xs1(function1, bt1Var, 0);
                av8Var2.n0(O3);
            }
            Function0 function0 = (Function0) O3;
            boolean z3 = (i7 == 32) | (i8 == 4);
            Object O4 = av8Var2.O();
            if (z3 || O4 == a99Var) {
                O4 = new xs1(function1, bt1Var, 1);
                av8Var2.n0(O4);
            }
            av8Var = av8Var2;
            pco.a(i6, x43Var, xtcVar, H, null, null, H2, null, str, str2, false, z, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, function1, function0, (Function0) O4, av8Var, (i3 & 896) | 1575936, (i3 << 15) & 3670016, 62640);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ys1(bt1Var, function1, xtcVar, i2, 0);
        }
    }

    public static final Object c0(rq3 rq3Var, k6g k6gVar, Function1 function1) {
        hb4 hb4Var = new hb4(function1, null);
        xuj xujVar = (xuj) rq3Var.getContext().get(xuj.b);
        d dVar = xujVar != null ? xujVar.a : null;
        if (dVar != null) {
            return xw3.R(dVar, hb4Var, rq3Var);
        }
        lj2 lj2Var = new lj2(1, z9a.b(rq3Var));
        lj2Var.t();
        try {
            k6gVar.getTransactionExecutor().execute(new lv4(lj2Var, k6gVar, hb4Var, false, 10));
        } catch (RejectedExecutionException e2) {
            lj2Var.a(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e2));
        }
        Object q = lj2Var.q();
        lu3 lu3Var = lu3.a;
        return q;
    }

    public static final void d(boolean z, Function1 function1, xtc xtcVar, boolean z2, bt2 bt2Var, of3 of3Var, int i2, int i3) {
        boolean z3;
        int i4;
        xtc xtcVar2;
        boolean z4;
        xtc xtcVar3;
        Function0 function0;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1406741137);
        int i5 = i2 | (av8Var.h(z) ? 4 : 2) | (av8Var.i(function1) ? 32 : 16);
        int i6 = i5 | 384;
        int i7 = i3 & 8;
        if (i7 != 0) {
            i4 = i5 | 3456;
            z3 = z2;
        } else {
            z3 = z2;
            i4 = i6 | (av8Var.h(z3) ? a.o : 1024);
        }
        int i8 = i4 | (av8Var.g(bt2Var) ? 16384 : 8192) | 196608;
        int i9 = 0;
        if (av8Var.T(i8 & 1, (74899 & i8) != 74898)) {
            av8Var.Y();
            if ((i2 & 1) == 0 || av8Var.B()) {
                if (i7 != 0) {
                    z3 = true;
                }
                xtcVar3 = utc.a;
            } else {
                av8Var.W();
                xtcVar3 = xtcVar;
            }
            boolean z5 = z3;
            av8Var.t();
            float floor = (float) Math.floor(((kx4) av8Var.k(dh3.h)).H0(2.0f));
            vjj vjjVar = z ? vjj.a : vjj.b;
            if (function1 != null) {
                av8Var.d0(2066152950);
                boolean z6 = ((i8 & 112) == 32) | ((i8 & 14) == 4);
                Object O = av8Var.O();
                if (z6 || O == nf3.a) {
                    O = new ct2(function1, z, i9);
                    av8Var.n0(O);
                }
                function0 = (Function0) O;
                av8Var.s(false);
            } else {
                av8Var.d0(2066218639);
                av8Var.s(false);
                function0 = null;
            }
            w(vjjVar, function0, new jii(floor, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, 0, null, 26), new jii(floor, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, null, 30), xtcVar3, z5, bt2Var, av8Var, (i8 << 6) & 33546240);
            xtcVar2 = xtcVar3;
            z4 = z5;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
            z4 = z3;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new dt2(z, function1, xtcVar2, z4, bt2Var, i2, i3);
        }
    }

    public static boolean d0(zzagi zzagiVar) {
        zzeu zzeuVar = new zzeu(8);
        int i2 = r5a.g(zzagiVar, zzeuVar).a;
        if (i2 != 1380533830 && i2 != 1380333108) {
            return false;
        }
        zzagiVar.h(0, 4, zzeuVar.a);
        zzeuVar.D(0);
        int b2 = zzeuVar.b();
        if (b2 == 1463899717) {
            return true;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(b2).length() + 23);
        sb.append("Unsupported form type: ");
        sb.append(b2);
        zzeh.e(sb.toString());
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(boolean z, vjj vjjVar, xtc xtcVar, bt2 bt2Var, jii jiiVar, jii jiiVar2, of3 of3Var, int i2) {
        int i3;
        av8 av8Var;
        float f2;
        int ordinal;
        float f3;
        vjj vjjVar2;
        int ordinal2;
        float f4;
        int ordinal3;
        twj f5;
        j38 mnhVar;
        Object O;
        a99 a99Var;
        long j2;
        cdi g2;
        long j3;
        cdi g3;
        boolean g4;
        Object O2;
        int i4;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-891330208);
        if ((i2 & 6) == 0) {
            i3 = (av8Var2.h(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var2.e(vjjVar.ordinal()) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var2.g(bt2Var) ? a.o : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= av8Var2.i(jiiVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= av8Var2.i(jiiVar2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if (av8Var2.T(i3 & 1, (74899 & i3) != 74898)) {
            axj L = yso.L(vjjVar, null, av8Var2, (i3 >> 3) & 14, 2);
            e1d e1dVar = L.d;
            t01 t01Var = L.a;
            j38 I = ufa.I(bwc.a, av8Var2);
            q4k q4kVar = lz.f;
            vjj vjjVar3 = (vjj) t01Var.w();
            av8Var2.d0(-768316570);
            int ordinal4 = vjjVar3.ordinal();
            float f6 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (ordinal4 != 0) {
                if (ordinal4 == 1) {
                    f2 = 0.0f;
                    av8Var2.s(false);
                    Float valueOf = Float.valueOf(f2);
                    eoh eohVar = (eoh) e1dVar;
                    vjj vjjVar4 = (vjj) eohVar.getValue();
                    av8Var2.d0(-768316570);
                    ordinal = vjjVar4.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            f3 = 0.0f;
                            av8Var2.s(false);
                            Float valueOf2 = Float.valueOf(f3);
                            twj f7 = L.f();
                            av8Var2.d0(1780794470);
                            Object b2 = f7.b();
                            vjjVar2 = vjj.b;
                            j38 mnhVar2 = (b2 != vjjVar2 && f7.a() == vjjVar2) ? new mnh(100) : I;
                            av8Var2.s(false);
                            vwj x = yso.x(L, valueOf, valueOf2, mnhVar2, q4kVar, av8Var2, 0);
                            vjj vjjVar5 = (vjj) t01Var.w();
                            av8Var2.d0(1840054703);
                            ordinal2 = vjjVar5.ordinal();
                            if (ordinal2 != 0 || ordinal2 == 1) {
                                f4 = 0.0f;
                            } else {
                                if (ordinal2 != 2) {
                                    zzl.b();
                                    return;
                                }
                                f4 = 1.0f;
                            }
                            av8Var2.s(false);
                            Float valueOf3 = Float.valueOf(f4);
                            vjj vjjVar6 = (vjj) eohVar.getValue();
                            av8Var2.d0(1840054703);
                            ordinal3 = vjjVar6.ordinal();
                            if (ordinal3 != 0 && ordinal3 != 1) {
                                if (ordinal3 == 2) {
                                    zzl.b();
                                    return;
                                }
                                f6 = 1.0f;
                            }
                            av8Var2.s(false);
                            Float valueOf4 = Float.valueOf(f6);
                            f5 = L.f();
                            av8Var2.d0(630790831);
                            if (f5.b() != vjjVar2) {
                                I = s02.d0();
                            } else if (f5.a() == vjjVar2) {
                                mnhVar = new mnh(100);
                                av8Var2.s(false);
                                vwj x2 = yso.x(L, valueOf3, valueOf4, mnhVar, q4kVar, av8Var2, 0);
                                O = av8Var2.O();
                                a99Var = nf3.a;
                                if (O == a99Var) {
                                    O = new zs2();
                                    av8Var2.n0(O);
                                }
                                zs2 zs2Var = (zs2) O;
                                cdi a2 = wih.a(vjjVar == vjjVar2 ? bt2Var.b : bt2Var.a, bt2.a(vjjVar, av8Var2), null, av8Var2, 0, 12);
                                av8 av8Var3 = av8Var2;
                                if (z) {
                                    int ordinal5 = vjjVar.ordinal();
                                    if (ordinal5 != 0) {
                                        if (ordinal5 == 1) {
                                            j2 = bt2Var.d;
                                        } else if (ordinal5 != 2) {
                                            zzl.b();
                                            return;
                                        }
                                    }
                                    j2 = bt2Var.c;
                                } else {
                                    int ordinal6 = vjjVar.ordinal();
                                    if (ordinal6 == 0) {
                                        j2 = bt2Var.e;
                                    } else if (ordinal6 == 1) {
                                        j2 = bt2Var.f;
                                    } else {
                                        if (ordinal6 != 2) {
                                            zzl.b();
                                            return;
                                        }
                                        j2 = bt2Var.g;
                                    }
                                }
                                if (z) {
                                    av8Var3.d0(496051715);
                                    g2 = wih.a(j2, bt2.a(vjjVar, av8Var3), null, av8Var3, 0, 12);
                                    av8Var3 = av8Var3;
                                    av8Var3.s(false);
                                } else {
                                    av8Var3.d0(496141925);
                                    g2 = e.g(new r13(j2), av8Var3);
                                    av8Var3.s(false);
                                }
                                if (z) {
                                    int ordinal7 = vjjVar.ordinal();
                                    if (ordinal7 != 0) {
                                        if (ordinal7 == 1) {
                                            j3 = bt2Var.i;
                                        } else if (ordinal7 != 2) {
                                            zzl.b();
                                            return;
                                        }
                                    }
                                    j3 = bt2Var.h;
                                } else {
                                    int ordinal8 = vjjVar.ordinal();
                                    if (ordinal8 == 0) {
                                        j3 = bt2Var.j;
                                    } else if (ordinal8 == 1) {
                                        j3 = bt2Var.k;
                                    } else {
                                        if (ordinal8 != 2) {
                                            zzl.b();
                                            return;
                                        }
                                        j3 = bt2Var.l;
                                    }
                                }
                                if (z) {
                                    av8Var3.d0(633231558);
                                    av8 av8Var4 = av8Var3;
                                    g3 = wih.a(j3, bt2.a(vjjVar, av8Var3), null, av8Var4, 0, 12);
                                    av8Var = av8Var4;
                                    av8Var.s(false);
                                } else {
                                    long j4 = j3;
                                    av8Var = av8Var3;
                                    av8Var.d0(633321768);
                                    g3 = e.g(new r13(j4), av8Var);
                                    av8Var.s(false);
                                }
                                xtc i5 = bkh.i(bkh.s(xtcVar, 2), 20.0f);
                                g4 = av8Var.g(g2) | av8Var.g(g3) | av8Var.i(jiiVar2) | av8Var.g(a2) | av8Var.g(x) | av8Var.g(x2) | av8Var.i(jiiVar);
                                O2 = av8Var.O();
                                if (!g4 || O2 == a99Var) {
                                    cdi cdiVar = g3;
                                    i4 = 0;
                                    ft2 ft2Var = new ft2(g2, cdiVar, jiiVar2, a2, x, x2, jiiVar, zs2Var);
                                    av8Var.n0(ft2Var);
                                    O2 = ft2Var;
                                } else {
                                    i4 = 0;
                                }
                                lz.d(i4, av8Var, i5, (Function1) O2);
                            }
                            mnhVar = I;
                            av8Var2.s(false);
                            vwj x22 = yso.x(L, valueOf3, valueOf4, mnhVar, q4kVar, av8Var2, 0);
                            O = av8Var2.O();
                            a99Var = nf3.a;
                            if (O == a99Var) {
                            }
                            zs2 zs2Var2 = (zs2) O;
                            cdi a22 = wih.a(vjjVar == vjjVar2 ? bt2Var.b : bt2Var.a, bt2.a(vjjVar, av8Var2), null, av8Var2, 0, 12);
                            av8 av8Var32 = av8Var2;
                            if (z) {
                            }
                            if (z) {
                            }
                            if (z) {
                            }
                            if (z) {
                            }
                            xtc i52 = bkh.i(bkh.s(xtcVar, 2), 20.0f);
                            g4 = av8Var.g(g2) | av8Var.g(g3) | av8Var.i(jiiVar2) | av8Var.g(a22) | av8Var.g(x) | av8Var.g(x22) | av8Var.i(jiiVar);
                            O2 = av8Var.O();
                            if (g4) {
                            }
                            cdi cdiVar2 = g3;
                            i4 = 0;
                            ft2 ft2Var2 = new ft2(g2, cdiVar2, jiiVar2, a22, x, x22, jiiVar, zs2Var2);
                            av8Var.n0(ft2Var2);
                            O2 = ft2Var2;
                            lz.d(i4, av8Var, i52, (Function1) O2);
                        } else if (ordinal != 2) {
                            zzl.b();
                            return;
                        }
                    }
                    f3 = 1.0f;
                    av8Var2.s(false);
                    Float valueOf22 = Float.valueOf(f3);
                    twj f72 = L.f();
                    av8Var2.d0(1780794470);
                    Object b22 = f72.b();
                    vjjVar2 = vjj.b;
                    if (b22 != vjjVar2) {
                        av8Var2.s(false);
                        vwj x3 = yso.x(L, valueOf, valueOf22, mnhVar2, q4kVar, av8Var2, 0);
                        vjj vjjVar52 = (vjj) t01Var.w();
                        av8Var2.d0(1840054703);
                        ordinal2 = vjjVar52.ordinal();
                        if (ordinal2 != 0) {
                        }
                        f4 = 0.0f;
                        av8Var2.s(false);
                        Float valueOf32 = Float.valueOf(f4);
                        vjj vjjVar62 = (vjj) eohVar.getValue();
                        av8Var2.d0(1840054703);
                        ordinal3 = vjjVar62.ordinal();
                        if (ordinal3 != 0) {
                            if (ordinal3 == 2) {
                            }
                        }
                        av8Var2.s(false);
                        Float valueOf42 = Float.valueOf(f6);
                        f5 = L.f();
                        av8Var2.d0(630790831);
                        if (f5.b() != vjjVar2) {
                        }
                        mnhVar = I;
                        av8Var2.s(false);
                        vwj x222 = yso.x(L, valueOf32, valueOf42, mnhVar, q4kVar, av8Var2, 0);
                        O = av8Var2.O();
                        a99Var = nf3.a;
                        if (O == a99Var) {
                        }
                        zs2 zs2Var22 = (zs2) O;
                        cdi a222 = wih.a(vjjVar == vjjVar2 ? bt2Var.b : bt2Var.a, bt2.a(vjjVar, av8Var2), null, av8Var2, 0, 12);
                        av8 av8Var322 = av8Var2;
                        if (z) {
                        }
                        if (z) {
                        }
                        if (z) {
                        }
                        if (z) {
                        }
                        xtc i522 = bkh.i(bkh.s(xtcVar, 2), 20.0f);
                        g4 = av8Var.g(g2) | av8Var.g(g3) | av8Var.i(jiiVar2) | av8Var.g(a222) | av8Var.g(x3) | av8Var.g(x222) | av8Var.i(jiiVar);
                        O2 = av8Var.O();
                        if (g4) {
                        }
                        cdi cdiVar22 = g3;
                        i4 = 0;
                        ft2 ft2Var22 = new ft2(g2, cdiVar22, jiiVar2, a222, x3, x222, jiiVar, zs2Var22);
                        av8Var.n0(ft2Var22);
                        O2 = ft2Var22;
                        lz.d(i4, av8Var, i522, (Function1) O2);
                    }
                    av8Var2.s(false);
                    vwj x32 = yso.x(L, valueOf, valueOf22, mnhVar2, q4kVar, av8Var2, 0);
                    vjj vjjVar522 = (vjj) t01Var.w();
                    av8Var2.d0(1840054703);
                    ordinal2 = vjjVar522.ordinal();
                    if (ordinal2 != 0) {
                    }
                    f4 = 0.0f;
                    av8Var2.s(false);
                    Float valueOf322 = Float.valueOf(f4);
                    vjj vjjVar622 = (vjj) eohVar.getValue();
                    av8Var2.d0(1840054703);
                    ordinal3 = vjjVar622.ordinal();
                    if (ordinal3 != 0) {
                    }
                    av8Var2.s(false);
                    Float valueOf422 = Float.valueOf(f6);
                    f5 = L.f();
                    av8Var2.d0(630790831);
                    if (f5.b() != vjjVar2) {
                    }
                    mnhVar = I;
                    av8Var2.s(false);
                    vwj x2222 = yso.x(L, valueOf322, valueOf422, mnhVar, q4kVar, av8Var2, 0);
                    O = av8Var2.O();
                    a99Var = nf3.a;
                    if (O == a99Var) {
                    }
                    zs2 zs2Var222 = (zs2) O;
                    cdi a2222 = wih.a(vjjVar == vjjVar2 ? bt2Var.b : bt2Var.a, bt2.a(vjjVar, av8Var2), null, av8Var2, 0, 12);
                    av8 av8Var3222 = av8Var2;
                    if (z) {
                    }
                    if (z) {
                    }
                    if (z) {
                    }
                    if (z) {
                    }
                    xtc i5222 = bkh.i(bkh.s(xtcVar, 2), 20.0f);
                    g4 = av8Var.g(g2) | av8Var.g(g3) | av8Var.i(jiiVar2) | av8Var.g(a2222) | av8Var.g(x32) | av8Var.g(x2222) | av8Var.i(jiiVar);
                    O2 = av8Var.O();
                    if (g4) {
                    }
                    cdi cdiVar222 = g3;
                    i4 = 0;
                    ft2 ft2Var222 = new ft2(g2, cdiVar222, jiiVar2, a2222, x32, x2222, jiiVar, zs2Var222);
                    av8Var.n0(ft2Var222);
                    O2 = ft2Var222;
                    lz.d(i4, av8Var, i5222, (Function1) O2);
                } else if (ordinal4 != 2) {
                    zzl.b();
                    return;
                }
            }
            f2 = 1.0f;
            av8Var2.s(false);
            Float valueOf5 = Float.valueOf(f2);
            eoh eohVar2 = (eoh) e1dVar;
            vjj vjjVar42 = (vjj) eohVar2.getValue();
            av8Var2.d0(-768316570);
            ordinal = vjjVar42.ordinal();
            if (ordinal != 0) {
            }
            f3 = 1.0f;
            av8Var2.s(false);
            Float valueOf222 = Float.valueOf(f3);
            twj f722 = L.f();
            av8Var2.d0(1780794470);
            Object b222 = f722.b();
            vjjVar2 = vjj.b;
            if (b222 != vjjVar2) {
            }
            av8Var2.s(false);
            vwj x322 = yso.x(L, valueOf5, valueOf222, mnhVar2, q4kVar, av8Var2, 0);
            vjj vjjVar5222 = (vjj) t01Var.w();
            av8Var2.d0(1840054703);
            ordinal2 = vjjVar5222.ordinal();
            if (ordinal2 != 0) {
            }
            f4 = 0.0f;
            av8Var2.s(false);
            Float valueOf3222 = Float.valueOf(f4);
            vjj vjjVar6222 = (vjj) eohVar2.getValue();
            av8Var2.d0(1840054703);
            ordinal3 = vjjVar6222.ordinal();
            if (ordinal3 != 0) {
            }
            av8Var2.s(false);
            Float valueOf4222 = Float.valueOf(f6);
            f5 = L.f();
            av8Var2.d0(630790831);
            if (f5.b() != vjjVar2) {
            }
            mnhVar = I;
            av8Var2.s(false);
            vwj x22222 = yso.x(L, valueOf3222, valueOf4222, mnhVar, q4kVar, av8Var2, 0);
            O = av8Var2.O();
            a99Var = nf3.a;
            if (O == a99Var) {
            }
            zs2 zs2Var2222 = (zs2) O;
            cdi a22222 = wih.a(vjjVar == vjjVar2 ? bt2Var.b : bt2Var.a, bt2.a(vjjVar, av8Var2), null, av8Var2, 0, 12);
            av8 av8Var32222 = av8Var2;
            if (z) {
            }
            if (z) {
            }
            if (z) {
            }
            if (z) {
            }
            xtc i52222 = bkh.i(bkh.s(xtcVar, 2), 20.0f);
            g4 = av8Var.g(g2) | av8Var.g(g3) | av8Var.i(jiiVar2) | av8Var.g(a22222) | av8Var.g(x322) | av8Var.g(x22222) | av8Var.i(jiiVar);
            O2 = av8Var.O();
            if (g4) {
            }
            cdi cdiVar2222 = g3;
            i4 = 0;
            ft2 ft2Var2222 = new ft2(g2, cdiVar2222, jiiVar2, a22222, x322, x22222, jiiVar, zs2Var2222);
            av8Var.n0(ft2Var2222);
            O2 = ft2Var2222;
            lz.d(i4, av8Var, i52222, (Function1) O2);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new hp1(z, vjjVar, xtcVar, bt2Var, jiiVar, jiiVar2, i2);
        }
    }

    public static r5a e0(int i2, zzagi zzagiVar, zzeu zzeuVar) {
        r5a g2 = r5a.g(zzagiVar, zzeuVar);
        while (true) {
            int i3 = g2.a;
            if (i3 == i2) {
                return g2;
            }
            x5n.p(i3, "Ignoring unknown WAV chunk: ", new StringBuilder(String.valueOf(i3).length() + 28));
            long j2 = g2.b;
            long j3 = 8 + j2;
            if ((1 & j2) != 0) {
                j3 = 9 + j2;
            }
            if (j3 > 2147483647L) {
                StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 40);
                sb.append("Chunk is too large (~2GB+) to skip; id: ");
                sb.append(i3);
                throw zzat.b(sb.toString());
            }
            zzagiVar.zzf((int) j3);
            g2 = r5a.g(zzagiVar, zzeuVar);
        }
    }

    public static final void f(bnh bnhVar, of3 of3Var, int i2) {
        r13 r13Var;
        bnhVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(426467024);
        int i3 = (av8Var.g(bnhVar) ? 4 : 2) | i2;
        if (av8Var.T(i3 & 1, (i3 & 3) != 2)) {
            lv1 lv1Var = uxf.m;
            utc utcVar = utc.a;
            xtc c0 = l98.c0(n9e.q(bkh.d(utcVar, 1.0f), lz.D(R.color.surface_T, av8Var), o7g.a(16.0f)), 16.0f, 12.0f);
            l8g a2 = k8g.a(ww9.b, lv1Var, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, c0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            Integer num = bnhVar.b;
            av8Var.d0(1789532536);
            d7e t = haa.t(num.intValue(), 0, av8Var);
            long D = lz.D(bnhVar.d, av8Var);
            av8Var.d0(-2020474679);
            xtc l2 = bkh.l(utcVar, 24.0f);
            Integer num2 = bnhVar.c;
            if (num2 != null) {
                if (num2 == null) {
                    av8Var.d0(-1352025944);
                    av8Var.s(false);
                    r13Var = null;
                } else {
                    av8Var.d0(-1352025943);
                    r13Var = new r13(lz.D(num2.intValue(), av8Var));
                    av8Var.s(false);
                }
                l2 = l2.z(l98.b0(n9e.q(utcVar, r13Var != null ? r13Var.a : r13.i, o7g.a), 4.0f));
            }
            av8Var.s(false);
            kq9.a(t, null, l2, D, av8Var, 56, 0);
            bf3.u(utcVar, 16.0f, av8Var, false);
            String v = oea.v(bnhVar.a, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, null, lz.D(R.color.surface_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 0, 0, null, xth.e(), av8Var, 0, 384, 126970);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new af3(bnhVar, i2);
        }
    }

    public static final void g(int i2, of3 of3Var, xtc xtcVar, Function0 function0) {
        int i3;
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(2124858950);
        if ((i2 & 6) == 0) {
            i3 = i2 | (av8Var.i(function0) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) av8Var.k(nz.b);
            xtc q = n9e.q(bkh.d(xtcVar, 1.0f), lz.D(R.color.surface_1, av8Var), o7g.a(16.0f));
            long D = lz.D(R.color.n_lv_4, av8Var);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = mz1.e(av8Var);
            }
            wzc wzcVar = (wzc) O;
            Object[] objArr = new Object[0];
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = b74.f;
                av8Var.n0(O2);
            }
            xtc b0 = l98.b0(tol.y(q, true, true, true, D, wzcVar, new gi(5, (boh) o3a.N(objArr, (Function0) O2, av8Var, 48), context, function0), av8Var, 0), 16.0f);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, b0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            utc utcVar = utc.a;
            xtc f0 = l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6.0f, 7);
            yf8 yf8Var = xth.a;
            udj.c(oea.v(R.string.stay_ahead_of_the_game, av8Var), f0, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var, 48, 0, 131064);
            udj.c(oea.v(R.string.sofascore_analyst_call_to_action, av8Var), l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var, 48, 0, 131064);
            xtc f02 = l98.f0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 5);
            l8g a3 = k8g.a(ww9.f, uxf.m, av8Var, 54);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, f02);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            udj.c(oea.v(R.string.view_subscription_plans, av8Var), null, lz.D(R.color.primary_default, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, 0, 0, 131066);
            av8Var = av8Var;
            kq9.b(s6a.N(R.drawable.ic_chevron_right_large_16, 6, av8Var), null, bkh.l(l98.f0(utcVar, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), 16.0f), lz.D(R.color.primary_default, av8Var), av8Var, 432, 0);
            av8Var.s(true);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new zk1(function0, xtcVar, i2, 3);
        }
    }

    public static final void h(m46 m46Var, Function1 function1, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        xtc xtcVar2;
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-245314285);
        if ((i2 & 6) == 0) {
            i3 = i2 | ((i2 & 8) == 0 ? av8Var.g(m46Var) : av8Var.i(m46Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.i(function1) ? 32 : 16;
        }
        int i4 = i3 | 384;
        if (av8Var.T(i4 & 1, (i4 & 147) != 146)) {
            xtc J = lz.J(bkh.c, jaa.L(av8Var), null);
            t3e C = l98.C(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 72.0f, 5);
            boolean i5 = av8Var.i(m46Var) | ((i4 & 112) == 32);
            Object O = av8Var.O();
            if (i5 || O == nf3.a) {
                O = new xw5(9, m46Var, function1);
                av8Var.n0(O);
            }
            v8a.a(J, null, C, null, null, null, false, null, (Function1) O, av8Var, 100663680, 250);
            xtcVar2 = utc.a;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new b30(m46Var, function1, xtcVar2, i2, 22);
        }
    }

    public static final void i(boolean z, ct8 ct8Var, xtc xtcVar, qug qugVar, boolean z2, of3 of3Var, int i2) {
        av8 av8Var;
        xtc xtcVar2;
        boolean z3;
        boolean booleanValue;
        xtc xtcVar3;
        e1d e1dVar;
        e1d e1dVar2;
        boolean z4;
        ct8Var.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1740768186);
        int i3 = i2 | (av8Var2.h(z) ? 4 : 2) | (av8Var2.i(ct8Var) ? 32 : 16) | 384 | (av8Var2.g(qugVar) ? a.o : 1024) | 24576;
        if (av8Var2.T(i3 & 1, (i3 & 9363) != 9362)) {
            av8Var2.Y();
            int i4 = i2 & 1;
            utc utcVar = utc.a;
            Object obj = nf3.a;
            if (i4 == 0 || av8Var2.B()) {
                Object O = av8Var2.O();
                if (O == obj) {
                    yea yeaVar = j58.a;
                    e58 f2 = e58.f();
                    f2.getClass();
                    nxf[] nxfVarArr = nxf.a;
                    O = Boolean.valueOf(f2.c("fantasy_h2h_leagues_enabled"));
                    av8Var2.n0(O);
                }
                booleanValue = ((Boolean) O).booleanValue();
                xtcVar3 = utcVar;
            } else {
                av8Var2.W();
                xtcVar3 = xtcVar;
                booleanValue = z2;
            }
            av8Var2.t();
            wd8 wd8Var = (wd8) av8Var2.k(dh3.i);
            Object O2 = av8Var2.O();
            if (O2 == obj) {
                O2 = e.f("");
                av8Var2.n0(O2);
            }
            e1d e1dVar3 = (e1d) O2;
            Object O3 = av8Var2.O();
            if (O3 == obj) {
                O3 = e.f("");
                av8Var2.n0(O3);
            }
            e1d e1dVar4 = (e1d) O3;
            Object O4 = av8Var2.O();
            if (O4 == obj) {
                O4 = e.f(FantasyLeagueGameType.CLASSIC);
                av8Var2.n0(O4);
            }
            e1d e1dVar5 = (e1d) O4;
            Object O5 = av8Var2.O();
            if (O5 == obj) {
                O5 = goh.b(new fu5(qugVar, 3));
                av8Var2.n0(O5);
            }
            cdi cdiVar = (cdi) O5;
            Object O6 = av8Var2.O();
            if (O6 == obj) {
                O6 = goh.b(new v30(20, e1dVar3));
                av8Var2.n0(O6);
            }
            cdi cdiVar2 = (cdi) O6;
            xtc o2 = tol.o(bkh.d(xtcVar3, 1.0f));
            p4h p4hVar = ww9.d;
            kv1 kv1Var = uxf.o;
            u23 a2 = t23.a(p4hVar, kv1Var, av8Var2, 0);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C = fqj.C(av8Var2, o2);
            if3.k7.getClass();
            Function0 function0 = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(function0);
            } else {
                av8Var2.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var2, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var2, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var2, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var2, ryVar);
            f50 f50Var3 = hf3.d;
            xtc xtcVar4 = xtcVar3;
            xtc d0 = l98.d0(hkg.u0(ljg.g(av8Var2, C, f50Var3, 1.0f, false), qugVar, false, 14), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            u23 a3 = t23.a(p4hVar, kv1Var, av8Var2, 0);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m3 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, d0);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(function0);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a3, f50Var);
            waa.K(av8Var2, m3, ff3Var);
            bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C2, f50Var3);
            int i5 = 1;
            xtc d02 = l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
            String str = (String) e1dVar3.getValue();
            String v = oea.v(R.string.fantasy_league_name, av8Var2);
            String v2 = oea.v(R.string.fantasy_league_name_restriction, av8Var2);
            t28 C3 = r4a.C(30);
            Object O7 = av8Var2.O();
            if (O7 == obj) {
                O7 = new w30(26, e1dVar3);
                av8Var2.n0(O7);
            }
            q5a.r(str, d02, null, (Function1) O7, null, null, null, v, null, v2, null, false, C3, 0L, 0, 0, null, 0L, 0L, 6, false, false, false, av8Var2, 3120, 384, 6, 15723892);
            xtc d03 = l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
            String str2 = (String) e1dVar4.getValue();
            String v3 = oea.v(R.string.fantasy_league_description, av8Var2);
            String v4 = oea.v(R.string.fantasy_league_description_restriction, av8Var2);
            t28 C4 = r4a.C(1000);
            Object O8 = av8Var2.O();
            if (O8 == obj) {
                e1dVar = e1dVar4;
                O8 = new w30(27, e1dVar);
                av8Var2.n0(O8);
            } else {
                e1dVar = e1dVar4;
            }
            e1d e1dVar6 = e1dVar;
            q5a.r(str2, d03, null, (Function1) O8, null, null, null, v3, null, v4, null, false, C4, 0L, 0, 0, null, 0L, 0L, 0, false, false, false, av8Var2, 3120, 384, 384, 12578164);
            if (booleanValue) {
                av8Var2.d0(1069038094);
                xtc d04 = l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
                FantasyLeagueGameType fantasyLeagueGameType = (FantasyLeagueGameType) e1dVar5.getValue();
                boolean i6 = av8Var2.i(wd8Var);
                Object O9 = av8Var2.O();
                if (i6 || O9 == obj) {
                    e1dVar2 = e1dVar5;
                    O9 = new d05(wd8Var, e1dVar2, i5);
                    av8Var2.n0(O9);
                } else {
                    e1dVar2 = e1dVar5;
                }
                hz8.m(fantasyLeagueGameType, (Function1) O9, d04, av8Var2, 384);
                z4 = false;
                av8Var2.s(false);
            } else {
                e1dVar2 = e1dVar5;
                z4 = false;
                av8Var2.d0(1069334516);
                av8Var2.s(false);
            }
            w1l.s(utcVar, 48.0f, av8Var2, true);
            String v5 = oea.v(R.string.fantasy_create_button, av8Var2);
            boolean booleanValue2 = ((Boolean) cdiVar2.getValue()).booleanValue();
            xtc b0 = l98.b0(n9e.q(d2a.E(bkh.d(utcVar, 1.0f), ((Boolean) cdiVar.getValue()).booleanValue() ? 8.0f : 0.0f, null, false, 0L, 30), lz.D(R.color.surface_P, av8Var2), oyn.e), 16.0f);
            boolean z5 = (i3 & 112) == 32 ? true : z4;
            Object O10 = av8Var2.O();
            if (z5 || O10 == obj) {
                Object pz4Var = new pz4(ct8Var, e1dVar3, e1dVar6, e1dVar2, 1);
                av8Var2.n0(pz4Var);
                O10 = pz4Var;
            }
            mha.h(v5, (Function0) O10, b0, null, null, booleanValue2, z, false, 0L, 0, 0, av8Var2, (i3 << 18) & 3670016, 0, 1944);
            av8Var = av8Var2;
            av8Var.s(true);
            z3 = booleanValue;
            xtcVar2 = xtcVar4;
        } else {
            av8Var = av8Var2;
            av8Var.W();
            xtcVar2 = xtcVar;
            z3 = z2;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new u93(z, ct8Var, xtcVar2, qugVar, z3, i2);
        }
    }

    public static final void j(String str, boolean z, boolean z2, String str2, Function0 function0, Function0 function02, xtc xtcVar, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1778809954);
        int i3 = i2 | (av8Var.g(str) ? 4 : 2) | (av8Var.h(z) ? 32 : 16) | (av8Var.h(z2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.g(str2) ? a.o : 1024) | (av8Var.i(function0) ? 16384 : 8192) | (av8Var.i(function02) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE);
        if (av8Var.T(i3 & 1, (i3 & 599187) != 599186)) {
            lv1 lv1Var = uxf.m;
            xtc d0 = l98.d0(n9e.q(fz8.Y(bkh.d(xtcVar, 1.0f), n9a.b), lz.D(R.color.surface_1, av8Var), o7g.a(16.0f)), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            l8g a2 = k8g.a(ww9.b, lv1Var, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, d0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            p8g p8gVar = p8g.a;
            utc utcVar = utc.a;
            nq8.h(av8Var, p8gVar.a(1.0f, utcVar, true));
            long D = lz.D(R.color.n_lv_1, av8Var);
            yf8 yf8Var = xth.a;
            z8e.i(str, oea.v(R.string.fantasy_expected_fantasy_points_short, av8Var), p8gVar.a(1.0f, utcVar, true), D, xth.h(), function0, false, true, av8Var, (i3 & 14) | 12582912 | ((i3 << 3) & 458752), 64);
            k(z, z2, str2, function02, p8gVar.a(1.0f, utcVar, true), av8Var, ((i3 >> 3) & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW) | ((i3 >> 6) & 7168));
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ri4(str, z, z2, str2, function0, function02, xtcVar, i2);
        }
    }

    public static final void k(boolean z, boolean z2, String str, Function0 function0, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        boolean z3;
        int i4;
        int i5;
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1709025739);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.h(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.h(z2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.g(str) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var.i(function0) ? a.o : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= av8Var.g(xtcVar) ? 16384 : 8192;
        }
        if (av8Var.T(i3 & 1, (i3 & 9363) != 9362)) {
            if (z2) {
                i4 = 1696237152;
                i5 = R.color.secondary_default;
            } else {
                i4 = 1696238008;
                i5 = R.color.surface_2;
            }
            z3 = z2;
            un0.a(tol.y(wnn.A(xtcVar, o7g.a(8.0f)), z2, false, false, 0L, null, function0, av8Var, 30), o7g.a(8.0f), rd0.t(ljg.f(av8Var, i4, i5, av8Var, false), av8Var, 0), rd0.u(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 62), null, yqo.H(271031449, av8Var, new k77(str, z3, z)), av8Var, 196608, 16);
            av8Var = av8Var;
        } else {
            z3 = z2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new dt2(z, z3, str, function0, xtcVar, i2);
        }
    }

    public static final void l(ho7 ho7Var, final rx6 rx6Var, gv9 gv9Var, final String str, final Function0 function0, final Function0 function02, boolean z, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        ho7Var.getClass();
        gv9Var.getClass();
        str.getClass();
        function0.getClass();
        function02.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(337266093);
        int i3 = (av8Var.g(ho7Var) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(rx6Var) ? 32 : 16;
        }
        int i4 = i3 | (av8Var.g(gv9Var) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.g(str) ? a.o : 1024);
        if ((i2 & 24576) == 0) {
            i4 |= av8Var.i(function0) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= av8Var.i(function02) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        int i5 = i4 | (av8Var.h(z) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | 12582912;
        if (av8Var.T(i5 & 1, (4793491 & i5) != 4793490)) {
            final Context context = (Context) av8Var.k(nz.b);
            u23 a2 = t23.a(new ng0(8.0f, true, new a70(6)), uxf.o, av8Var, 6);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            utc utcVar = utc.a;
            xtc C = fqj.C(av8Var, utcVar);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            mv1 mv1Var = uxf.g;
            xtc g2 = bkh.g(utcVar, 62.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = new yt6(27);
                av8Var.n0(O);
            }
            Function1 function1 = (Function1) O;
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = new yt6(28);
                av8Var.n0(O2);
            }
            l98.b(ho7Var, g2, function1, mv1Var, null, (Function1) O2, yqo.H(2096518660, av8Var, new et8() { // from class: a87
                @Override // defpackage.et8
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    String str2;
                    String str3;
                    ho7 ho7Var2 = (ho7) obj2;
                    of3 of3Var2 = (of3) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    ((k60) obj).getClass();
                    ho7Var2.getClass();
                    k1c c2 = e12.c(uxf.d, false);
                    av8 av8Var2 = (av8) of3Var2;
                    int hashCode2 = Long.hashCode(av8Var2.T);
                    aee m3 = av8Var2.m();
                    utc utcVar2 = utc.a;
                    xtc C2 = fqj.C(of3Var2, utcVar2);
                    if3.k7.getClass();
                    Function0 function03 = hf3.b;
                    av8 av8Var3 = (av8) of3Var2;
                    av8Var3.h0();
                    if (av8Var3.S) {
                        av8Var3.l(function03);
                    } else {
                        av8Var3.q0();
                    }
                    waa.K(of3Var2, c2, hf3.g);
                    waa.K(of3Var2, m3, hf3.f);
                    waa.K(of3Var2, Integer.valueOf(hashCode2), hf3.j);
                    waa.J(of3Var2, hf3.k);
                    waa.K(of3Var2, C2, hf3.d);
                    mj7 mj7Var = ho7Var2.a;
                    if (mj7Var.h()) {
                        av8Var3.d0(41441936);
                        xtc d0 = l98.d0(utcVar2, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                        Float f2 = mj7Var.g;
                        String format = f2 != null ? String.format(dla.d(), "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f2.floatValue())}, 1)) : "-";
                        Integer num = ho7Var2.b;
                        if (num == null || (str2 = String.valueOf(num.intValue())) == null) {
                            str2 = "-";
                        }
                        Integer num2 = mj7Var.i;
                        if (num2 == null || (str3 = String.valueOf(num2.intValue())) == null) {
                            str3 = "-";
                        }
                        boolean z2 = ho7Var2.h;
                        String str4 = mj7Var.k;
                        Function0 function04 = null;
                        if (Intrinsics.c(str4, str)) {
                            str4 = null;
                        }
                        if (str4 == null) {
                            av8Var3.d0(42009080);
                            av8Var3.s(false);
                        } else {
                            av8Var3.d0(42009081);
                            Context context2 = context;
                            boolean i6 = ((((intValue & 112) ^ 48) > 32 && av8Var3.g(ho7Var2)) || (intValue & 48) == 32) | av8Var3.i(context2) | av8Var3.g(str4);
                            Object O3 = av8Var3.O();
                            if (i6 || O3 == nf3.a) {
                                O3 = new z77(context2, ho7Var2, str4, 1);
                                av8Var3.n0(O3);
                            }
                            function04 = (Function0) O3;
                            av8Var3.s(false);
                        }
                        z8e.g(format, str2, str3, z2, function04, d0, of3Var2, 196608);
                        av8Var3.s(false);
                    } else {
                        av8Var3.d0(40614887);
                        xtc d02 = l98.d0(utcVar2, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                        boolean i7 = mj7Var.i();
                        rx6 rx6Var2 = rx6.this;
                        l6g.j(rx6Var2 != null ? String.format(dla.d(), "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(rx6Var2.a.floatValue())}, 1)) : "-", i7, (rx6Var2 != null ? rx6Var2.b.floatValue() : 0.0f) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, rx6Var2 != null ? String.format(dla.d(), "+%.1f", Arrays.copyOf(new Object[]{Float.valueOf(rx6Var2.b.floatValue())}, 1)) : "-", function0, function02, d02, of3Var2, 1572864);
                        av8Var3.s(false);
                    }
                    av8Var3.s(true);
                    return Unit.a;
                }
            }), av8Var, (i5 & 14) | 1772976, 16);
            tol.b(nyd.a.a(null), yqo.H(-282647241, av8Var, new m81(gv9Var, z, 5)), av8Var, 56);
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new b87(ho7Var, rx6Var, gv9Var, str, function0, function02, z, xtcVar2, i2);
        }
    }

    public static final void m(yd7 yd7Var, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        yd7Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1242225158);
        int i3 = (av8Var.g(yd7Var) ? 4 : 2) | i2 | (av8Var.g(xtcVar) ? 32 : 16);
        int i4 = 18;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            xtcVar2 = xtcVar;
            un0.a(xtcVar2, o7g.a(16.0f), rd0.t(lz.D(R.color.surface_1, av8Var), av8Var, 0), null, null, yqo.H(1647381368, av8Var, new qm4(i4, yd7Var, (Context) av8Var.k(nz.b))), av8Var, ((i3 >> 3) & 14) | 196608, 24);
        } else {
            xtcVar2 = xtcVar;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new kz6(yd7Var, xtcVar2, i2, 11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(int i2, String str, xtc xtcVar, boolean z, long j2, float f2, of3 of3Var, int i3, int i4) {
        xtc xtcVar2;
        int i5;
        int i6;
        float f3;
        xtc xtcVar3;
        long j3;
        float f4;
        eqf u;
        float f5;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1022383044);
        int i7 = (av8Var.e(i2) ? 4 : 2) | i3 | (av8Var.g(str) ? 32 : 16);
        int i8 = i4 & 4;
        if (i8 != 0) {
            i7 |= 384;
        } else if ((i3 & 384) == 0) {
            xtcVar2 = xtcVar;
            i7 |= av8Var.g(xtcVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            long j4 = j2;
            i5 = i7 | (!av8Var.h(z) ? a.o : 1024) | (((i4 & 16) == 0 || !av8Var.f(j4)) ? 8192 : 16384);
            i6 = i4 & 32;
            if (i6 == 0) {
                i5 |= 196608;
            } else if ((196608 & i3) == 0) {
                f3 = f2;
                i5 |= av8Var.d(f3) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
                if (av8Var.T(i5 & 1, (74899 & i5) != 74898)) {
                    av8Var.Y();
                    int i9 = i3 & 1;
                    utc utcVar = utc.a;
                    if (i9 == 0 || av8Var.B()) {
                        if (i8 != 0) {
                            xtcVar2 = utcVar;
                        }
                        if ((i4 & 16) != 0) {
                            j4 = lz.D(R.color.surface_0, av8Var);
                            i5 &= -57345;
                        }
                        if (i6 != 0) {
                            f5 = 16.0f;
                            av8Var.t();
                            long j5 = j4;
                            cdi b2 = a60.b(!z ? 1.4f : 1.0f, s02.h0(600, 0, null, 4), "ball_scale", av8Var, 3120, 20);
                            xtc c0 = l98.c0(n9e.q(xtcVar2, j5, o7g.a(12.0f)), f5, 8.0f);
                            u23 a2 = t23.a(new ng0(8.0f, true, new a70(6)), uxf.p, av8Var, 54);
                            int hashCode = Long.hashCode(av8Var.T);
                            aee m2 = av8Var.m();
                            xtc C = fqj.C(av8Var, c0);
                            if3.k7.getClass();
                            zg3 zg3Var = hf3.b;
                            av8Var.h0();
                            if (av8Var.S) {
                                av8Var.q0();
                            } else {
                                av8Var.l(zg3Var);
                            }
                            f50 f50Var = hf3.g;
                            waa.K(av8Var, a2, f50Var);
                            ff3 ff3Var = hf3.f;
                            waa.K(av8Var, m2, ff3Var);
                            Integer valueOf = Integer.valueOf(hashCode);
                            f50 f50Var2 = hf3.j;
                            waa.K(av8Var, valueOf, f50Var2);
                            ry ryVar = hf3.k;
                            waa.J(av8Var, ryVar);
                            f50 f50Var3 = hf3.d;
                            waa.K(av8Var, C, f50Var3);
                            int i10 = i5;
                            String upperCase = oea.v(i2, av8Var).toUpperCase(Locale.ROOT);
                            upperCase.getClass();
                            yf8 yf8Var = xth.a;
                            xtc xtcVar4 = xtcVar2;
                            float f6 = f5;
                            udj.c(upperCase, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var, 0, 0, 131066);
                            k1c c2 = e12.c(uxf.g, false);
                            int hashCode2 = Long.hashCode(av8Var.T);
                            aee m3 = av8Var.m();
                            xtc C2 = fqj.C(av8Var, utcVar);
                            av8Var.h0();
                            if (av8Var.S) {
                                av8Var.q0();
                            } else {
                                av8Var.l(zg3Var);
                            }
                            waa.K(av8Var, c2, f50Var);
                            waa.K(av8Var, m3, ff3Var);
                            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
                            waa.K(av8Var, C2, f50Var3);
                            xtc l2 = bkh.l(utcVar, 54.0f);
                            float floatValue = ((Number) b2.getValue()).floatValue();
                            kq9.b(s6a.N(R.drawable.ic_basketball, 6, av8Var), null, f6a.D(l2, floatValue, floatValue), lz.D(R.color.n_lv_4, av8Var), av8Var, 48, 0);
                            udj.c(str, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.h(), av8Var, (i10 >> 3) & 14, 0, 131066);
                            av8Var = av8Var;
                            av8Var.s(true);
                            av8Var.s(true);
                            j3 = j5;
                            f4 = f6;
                            xtcVar3 = xtcVar4;
                        }
                    } else {
                        av8Var.W();
                        if ((i4 & 16) != 0) {
                            i5 &= -57345;
                        }
                    }
                    f5 = f3;
                    av8Var.t();
                    long j52 = j4;
                    cdi b22 = a60.b(!z ? 1.4f : 1.0f, s02.h0(600, 0, null, 4), "ball_scale", av8Var, 3120, 20);
                    xtc c02 = l98.c0(n9e.q(xtcVar2, j52, o7g.a(12.0f)), f5, 8.0f);
                    u23 a22 = t23.a(new ng0(8.0f, true, new a70(6)), uxf.p, av8Var, 54);
                    int hashCode3 = Long.hashCode(av8Var.T);
                    aee m22 = av8Var.m();
                    xtc C3 = fqj.C(av8Var, c02);
                    if3.k7.getClass();
                    zg3 zg3Var2 = hf3.b;
                    av8Var.h0();
                    if (av8Var.S) {
                    }
                    f50 f50Var4 = hf3.g;
                    waa.K(av8Var, a22, f50Var4);
                    ff3 ff3Var2 = hf3.f;
                    waa.K(av8Var, m22, ff3Var2);
                    Integer valueOf2 = Integer.valueOf(hashCode3);
                    f50 f50Var22 = hf3.j;
                    waa.K(av8Var, valueOf2, f50Var22);
                    ry ryVar2 = hf3.k;
                    waa.J(av8Var, ryVar2);
                    f50 f50Var32 = hf3.d;
                    waa.K(av8Var, C3, f50Var32);
                    int i102 = i5;
                    String upperCase2 = oea.v(i2, av8Var).toUpperCase(Locale.ROOT);
                    upperCase2.getClass();
                    yf8 yf8Var2 = xth.a;
                    xtc xtcVar42 = xtcVar2;
                    float f62 = f5;
                    udj.c(upperCase2, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var, 0, 0, 131066);
                    k1c c22 = e12.c(uxf.g, false);
                    int hashCode22 = Long.hashCode(av8Var.T);
                    aee m32 = av8Var.m();
                    xtc C22 = fqj.C(av8Var, utcVar);
                    av8Var.h0();
                    if (av8Var.S) {
                    }
                    waa.K(av8Var, c22, f50Var4);
                    waa.K(av8Var, m32, ff3Var2);
                    bf3.s(hashCode22, av8Var, f50Var22, av8Var, ryVar2);
                    waa.K(av8Var, C22, f50Var32);
                    xtc l22 = bkh.l(utcVar, 54.0f);
                    float floatValue2 = ((Number) b22.getValue()).floatValue();
                    kq9.b(s6a.N(R.drawable.ic_basketball, 6, av8Var), null, f6a.D(l22, floatValue2, floatValue2), lz.D(R.color.n_lv_4, av8Var), av8Var, 48, 0);
                    udj.c(str, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.h(), av8Var, (i102 >> 3) & 14, 0, 131066);
                    av8Var = av8Var;
                    av8Var.s(true);
                    av8Var.s(true);
                    j3 = j52;
                    f4 = f62;
                    xtcVar3 = xtcVar42;
                } else {
                    av8Var.W();
                    xtcVar3 = xtcVar2;
                    j3 = j4;
                    f4 = f3;
                }
                u = av8Var.u();
                if (u != null) {
                    u.d = new zs1(i2, str, xtcVar3, z, j3, f4, i3, i4);
                    return;
                }
                return;
            }
            f3 = f2;
            if (av8Var.T(i5 & 1, (74899 & i5) != 74898)) {
            }
            u = av8Var.u();
            if (u != null) {
            }
        }
        xtcVar2 = xtcVar;
        long j42 = j2;
        i5 = i7 | (!av8Var.h(z) ? a.o : 1024) | (((i4 & 16) == 0 || !av8Var.f(j42)) ? 8192 : 16384);
        i6 = i4 & 32;
        if (i6 == 0) {
        }
        f3 = f2;
        if (av8Var.T(i5 & 1, (74899 & i5) != 74898)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void o(h06 h06Var, r8b r8bVar, bnf bnfVar, int i2, Function1 function1, of3 of3Var, int i3) {
        av8 av8Var;
        a99 a99Var;
        tt2 tt2Var;
        h06Var.getClass();
        r8bVar.getClass();
        bnfVar.getClass();
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-90580804);
        int i4 = i3 | (av8Var2.g(h06Var) ? 4 : 2) | (av8Var2.e(r8bVar.ordinal()) ? 32 : 16) | (av8Var2.e(bnfVar.ordinal()) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.e(i2) ? a.o : 1024) | (av8Var2.i(function1) ? 16384 : 8192);
        int i5 = 1;
        int i6 = 0;
        if (av8Var2.T(i4 & 1, (i4 & 9363) != 9362)) {
            av8Var2.d0(-1148796217);
            gv9 gv9Var = h06Var.a;
            int i7 = 10;
            ArrayList arrayList = new ArrayList(k13.r(gv9Var, 10));
            Iterator<E> it = gv9Var.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                a99Var = nf3.a;
                if (!hasNext) {
                    break;
                }
                r8b r8bVar2 = (r8b) it.next();
                boolean z = (i2 <= i5 || r8bVar2 != r8b.b) ? 0 : i5;
                String a2 = r8bVar2.a.a(av8Var2);
                av8Var2.d0(-1148787964);
                if (Boolean.valueOf(z).equals(Boolean.TRUE)) {
                    av8Var2.d0(-1148784608);
                    gv9<bnf> gv9Var2 = h06Var.b;
                    ArrayList arrayList2 = new ArrayList(k13.r(gv9Var2, i7));
                    for (bnf bnfVar2 : gv9Var2) {
                        arrayList2.add(new ut2(bnfVar2.name(), bnfVar2.a.a(av8Var2)));
                    }
                    av8Var2.s(false);
                    gv9 W = W(arrayList2);
                    String name = bnfVar.name();
                    boolean z2 = (i4 & 57344) == 16384;
                    Object O = av8Var2.O();
                    if (z2 || O == a99Var) {
                        O = new k46(29, function1);
                        av8Var2.n0(O);
                    }
                    tt2Var = new tt2(W, name, (Function1) O);
                } else {
                    tt2Var = null;
                }
                tt2 tt2Var2 = tt2Var;
                av8Var2.s(false);
                arrayList.add(new vt2(r8bVar2, a2, false, null, null, null, tt2Var2, 188));
                i5 = 1;
                i7 = 10;
            }
            av8Var2.s(false);
            gv9 W2 = W(arrayList);
            boolean z3 = (i4 & 57344) == 16384;
            Object O2 = av8Var2.O();
            if (z3 || O2 == a99Var) {
                O2 = new uj8(i6, function1);
                av8Var2.n0(O2);
            }
            Function1 function12 = (Function1) O2;
            xtc q = n9e.q(bkh.d(utc.a, 1.0f), lz.D(R.color.surface_1, av8Var2), oyn.e);
            q.getClass();
            av8Var = av8Var2;
            trh.a(W2, r8bVar, function12, td4.X(q, new s81(4.0f, 7)), null, null, null, false, false, false, null, null, av8Var, i4 & 112, 4080);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bk1(h06Var, r8bVar, bnfVar, i2, function1, i3);
        }
    }

    public static final void p(final gv9 gv9Var, final Object obj, final Function1 function1, xtc xtcVar, uah uahVar, boolean z, final tc3 tc3Var, of3 of3Var, int i2) {
        uah uahVar2;
        boolean z2;
        int i3;
        final uah a2;
        final boolean z3;
        gv9Var.getClass();
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1737172008);
        int i4 = i2 | (av8Var.g(gv9Var) ? 4 : 2) | (av8Var.g(obj) ? 32 : 16) | (av8Var.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | 14360576;
        if (av8Var.T(i4 & 1, (306783379 & i4) != 306783378)) {
            av8Var.Y();
            if ((i2 & 1) == 0 || av8Var.B()) {
                i3 = i4 & (-57345);
                a2 = o7g.a(8.0f);
                z3 = true;
            } else {
                av8Var.W();
                i3 = i4 & (-57345);
                a2 = uahVar;
                z3 = z;
            }
            final int i5 = i3;
            av8Var.t();
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = e.f(Boolean.FALSE);
                av8Var.n0(O);
            }
            final e1d e1dVar = (e1d) O;
            boolean booleanValue = ((Boolean) e1dVar.getValue()).booleanValue();
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = new yo9(5);
                av8Var.n0(O2);
            }
            ww9.d(booleanValue, (Function1) O2, xtcVar, yqo.H(-599585858, av8Var, new ct8() { // from class: mq9
                @Override // defpackage.ct8
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    tc3 tc3Var2 = tol.c;
                    jj6 jj6Var = (jj6) obj2;
                    of3 of3Var2 = (of3) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    jj6Var.getClass();
                    if ((intValue & 6) == 0) {
                        intValue |= (intValue & 8) == 0 ? ((av8) of3Var2).g(jj6Var) : ((av8) of3Var2).i(jj6Var) ? 4 : 2;
                    }
                    av8 av8Var2 = (av8) of3Var2;
                    if (av8Var2.T(intValue & 1, (intValue & 19) != 18)) {
                        utc utcVar = utc.a;
                        xtc A = wnn.A(utcVar, uah.this);
                        Object O3 = av8Var2.O();
                        a99 a99Var2 = nf3.a;
                        e1d e1dVar2 = e1dVar;
                        if (O3 == a99Var2) {
                            O3 = new v30(24, e1dVar2);
                            av8Var2.n0(O3);
                        }
                        boolean z4 = z3;
                        xtc y = tol.y(A, z4, false, false, 0L, null, (Function0) O3, av8Var2, 30);
                        if (!z4) {
                            y = y.z(u6h.C(utcVar, 0.5f));
                        }
                        xtc b2 = jj6Var.b(y, "PrimaryNotEditable");
                        k1c c2 = e12.c(uxf.c, false);
                        int hashCode = Long.hashCode(av8Var2.T);
                        aee m2 = av8Var2.m();
                        xtc C = fqj.C(av8Var2, b2);
                        if3.k7.getClass();
                        zg3 zg3Var = hf3.b;
                        av8Var2.h0();
                        if (av8Var2.S) {
                            av8Var2.l(zg3Var);
                        } else {
                            av8Var2.q0();
                        }
                        waa.K(av8Var2, c2, hf3.g);
                        waa.K(av8Var2, m2, hf3.f);
                        waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
                        waa.J(av8Var2, hf3.k);
                        waa.K(av8Var2, C, hf3.d);
                        int i6 = i5;
                        Integer valueOf = Integer.valueOf((((i6 >> 3) & 8) << 3) | 6);
                        n12 n12Var = n12.a;
                        Object obj5 = obj;
                        tc3Var2.invoke(n12Var, obj5, av8Var2, valueOf);
                        av8Var2.s(true);
                        cch cchVar = (cch) av8Var2.k(ech.a);
                        tzb.b(null, new cch(o7g.a(8.0f), cchVar.b, cchVar.c, cchVar.d, cchVar.e), null, yqo.H(-213404270, av8Var2, new bi(jj6Var, e1dVar2, gv9Var, obj5, function1, tc3Var, i6, 5)), av8Var2, 3072, 5);
                    } else {
                        av8Var2.W();
                    }
                    return Unit.a;
                }
            }), av8Var, 3456);
            uahVar2 = a2;
            z2 = z3;
        } else {
            av8Var.W();
            uahVar2 = uahVar;
            z2 = z;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new rc7(gv9Var, obj, function1, xtcVar, uahVar2, z2, tc3Var, i2);
        }
    }

    public static final void q(osa osaVar, vnb vnbVar, Function1 function1, boolean z, xtc xtcVar, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(392298979);
        int i3 = i2 | (av8Var.i(osaVar) ? 4 : 2) | (av8Var.g(vnbVar) ? 32 : 16) | (av8Var.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.h(z) ? a.o : 1024) | (av8Var.g(xtcVar) ? 16384 : 8192);
        int i4 = 0;
        if (av8Var.T(i3 & 1, (i3 & 9363) != 9362)) {
            boolean z2 = (i3 & 112) == 32;
            Object O = av8Var.O();
            if (z2 || O == nf3.a) {
                O = new k4b(vnbVar, 0);
                av8Var.n0(O);
            }
            wkn.a(vnbVar, xtcVar, null, (Function1) O, yqo.H(316307937, av8Var, new l4b(osaVar, z, function1, i4)), av8Var, ((i3 >> 3) & 14) | 24576 | ((i3 >> 9) & 112), 4);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new f70(osaVar, vnbVar, function1, z, xtcVar, i2, 10);
        }
    }

    public static final void r(o4b o4bVar, int i2, Integer num, String str, boolean z, xtc xtcVar, of3 of3Var, int i3) {
        xtc xtcVar2;
        m4b m4bVar;
        o4bVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-138575154);
        int i4 = i3 | (av8Var.i(o4bVar) ? 4 : 2) | (av8Var.e(i2) ? 32 : 16) | (av8Var.g(num) ? 256 : 128) | (av8Var.g(str) ? 2048 : 1024) | (av8Var.h(z) ? 16384 : 8192) | 196608;
        if (av8Var.T(i4 & 1, (74899 & i4) != 74898)) {
            e1d x = rfo.x(o4bVar.f, av8Var, 0);
            osa a2 = rsa.a(o4bVar.n, av8Var);
            xhf J = x2a.J(av8Var);
            vnb vnbVar = (vnb) x.getValue();
            Boolean bool = null;
            unb unbVar = vnbVar instanceof unb ? (unb) vnbVar : null;
            if (unbVar != null && (m4bVar = (m4b) unbVar.a) != null) {
                bool = Boolean.valueOf(m4bVar.f);
            }
            boolean c2 = Intrinsics.c(bool, Boolean.TRUE);
            g28 g28Var = bkh.c;
            boolean i5 = av8Var.i(o4bVar) | ((i4 & 112) == 32) | ((i4 & 896) == 256) | ((i4 & 7168) == 2048);
            Object O = av8Var.O();
            if (i5 || O == nf3.a) {
                im1 im1Var = new im1(o4bVar, i2, num, str, 5);
                av8Var.n0(im1Var);
                O = im1Var;
            }
            x2a.h(c2, (Function0) O, g28Var, J, null, yqo.H(162397735, av8Var, new ak1(J, x, 2)), yqo.H(1652966440, av8Var, new a93(o4bVar, a2, z, x)), av8Var, 1769856);
            xtcVar2 = utc.a;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ki4(o4bVar, i2, num, str, z, xtcVar2, i3);
        }
    }

    public static final void s(WeeklyChallengeViewModel weeklyChallengeViewModel, Function0 function0, xtc xtcVar, of3 of3Var, int i2) {
        weeklyChallengeViewModel.getClass();
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(146601900);
        int i3 = 4;
        int i4 = (av8Var.i(weeklyChallengeViewModel) ? 4 : 2) | i2 | (av8Var.i(function0) ? 32 : 16) | 384;
        int i5 = 0;
        if (av8Var.T(i4 & 1, (i4 & 147) != 146)) {
            e1d x = rfo.x(weeklyChallengeViewModel.n, av8Var, 0);
            xhf J = x2a.J(av8Var);
            Object O = av8Var.O();
            Object obj = nf3.a;
            if (O == obj) {
                O = hz8.G(g.a, av8Var);
                av8Var.n0(O);
            }
            ku3 ku3Var = (ku3) O;
            Object O2 = av8Var.O();
            if (O2 == obj) {
                O2 = e.f(Boolean.FALSE);
                av8Var.n0(O2);
            }
            e1d e1dVar = (e1d) O2;
            boolean i6 = av8Var.i(weeklyChallengeViewModel) | av8Var.i(ku3Var);
            Object O3 = av8Var.O();
            if (i6 || O3 == obj) {
                O3 = new p6f(weeklyChallengeViewModel, ku3Var, e1dVar, i5);
                av8Var.n0(O3);
            }
            x2a.h(((Boolean) e1dVar.getValue()).booleanValue(), (Function0) O3, bkh.c, J, null, yqo.H(1872122099, av8Var, new ak1(J, e1dVar, i3)), yqo.H(1635504274, av8Var, new hl6(8, x, function0)), av8Var, 1769472);
            xtcVar = utc.a;
        } else {
            av8Var.W();
        }
        xtc xtcVar2 = xtcVar;
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new wbc(weeklyChallengeViewModel, function0, xtcVar2, i2, 12);
        }
    }

    public static final void t(final String str, final String str2, final String str3, final long j2, final xtc xtcVar, of3 of3Var, final int i2) {
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1115071281);
        int i3 = i2 | (av8Var2.g(str) ? 4 : 2) | (av8Var2.g(str2) ? 32 : 16) | (av8Var2.g(str3) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.f(j2) ? a.o : 1024) | (av8Var2.g(xtcVar) ? 16384 : 8192);
        if (av8Var2.T(i3 & 1, (i3 & 9363) != 9362)) {
            xtc h2 = ljg.h(8.0f, xtcVar, lz.D(R.color.surface_2, av8Var2), 8.0f);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var2, 0);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C = fqj.C(av8Var2, h2);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var2, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var2, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var2, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var2, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var2, C, f50Var3);
            String upperCase = str.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            yf8 yf8Var = xth.a;
            udj.c(upperCase, null, lz.D(R.color.n_lv_3, av8Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.c(), av8Var2, 0, 24960, 110586);
            utc utcVar = utc.a;
            nq8.h(av8Var2, bkh.e(utcVar, 4.0f));
            l8g a3 = k8g.a(ww9.b, uxf.m, av8Var2, 48);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m3 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, utcVar);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a3, f50Var);
            waa.K(av8Var2, m3, ff3Var);
            bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C2, f50Var3);
            int i4 = i3 >> 3;
            udj.c(str3, null, j2, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var2, ((i3 >> 6) & 14) | (i4 & 896), 24960, 110586);
            nq8.h(av8Var2, bkh.p(utcVar, 8.0f));
            udj.c(str2, new goa(1.0f, true), lz.D(R.color.n_lv_3, av8Var2), null, 0L, null, 0L, null, new p7j(6), 0L, 2, false, 1, 0, null, xth.c(), av8Var2, i4 & 14, 24960, 109560);
            av8Var = av8Var2;
            av8Var.s(true);
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2(str, str2, str3, j2, xtcVar, i2) { // from class: xd7
                public final /* synthetic */ String a;
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;
                public final /* synthetic */ long d;
                public final /* synthetic */ xtc e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(1);
                    l6g.t(this.a, this.b, this.c, this.d, this.e, (of3) obj, K);
                    return Unit.a;
                }
            };
        }
    }

    public static final void u(final tee teeVar, final int i2, final Integer num, final float f2, xtc xtcVar, of3 of3Var, final int i3) {
        av8 av8Var;
        final xtc xtcVar2;
        jej jejVar;
        a99 a99Var;
        Object c7aVar;
        long j2;
        long j3;
        xtc xtcVar3;
        utc utcVar;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1295607662);
        int i4 = i3 | (av8Var2.g(teeVar) ? 4 : 2) | (av8Var2.e(i2) ? 32 : 16) | (av8Var2.g(num) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.g(null) ? a.o : 1024) | (av8Var2.d(f2) ? 16384 : 8192) | 196608;
        if (av8Var2.T(i4 & 1, (74899 & i4) != 74898)) {
            Context context = (Context) av8Var2.k(nz.b);
            jej Q = h5a.Q(0, 0, 1, av8Var2);
            boolean z = ((Configuration) av8Var2.k(nz.a)).getLayoutDirection() == 1;
            final long D = lz.D(R.color.primary_default, av8Var2);
            final long D2 = lz.D(R.color.error, av8Var2);
            final long D3 = lz.D(R.color.surface_1, av8Var2);
            final long D4 = lz.D(R.color.secondary_highlight, av8Var2);
            final boolean z2 = z;
            final long D5 = lz.D(R.color.secondary_variant, av8Var2);
            final long D6 = lz.D(R.color.n_lv_4, av8Var2);
            long D7 = lz.D(R.color.n_lv_3, av8Var2);
            final long D8 = lz.D(R.color.rating_10, av8Var2);
            final long D9 = lz.D(R.color.rating_60, av8Var2);
            final long D10 = lz.D(R.color.rating_65, av8Var2);
            final long D11 = lz.D(R.color.rating_70, av8Var2);
            long D12 = lz.D(R.color.value, av8Var2);
            ff5 ff5Var = dh3.h;
            final float H0 = ((kx4) av8Var2.k(ff5Var)).H0(20.0f);
            long u = ((kx4) av8Var2.k(ff5Var)).u(12.0f);
            d7e t = haa.t(R.drawable.ic_transfer_in, 0, av8Var2);
            long floatToRawIntBits = (Float.floatToRawIntBits(H0) << 32) | (Float.floatToRawIntBits(H0) & 4294967295L);
            kx4 kx4Var = (kx4) av8Var2.k(ff5Var);
            ema emaVar = (ema) av8Var2.k(dh3.n);
            t.getClass();
            kx4Var.getClass();
            emaVar.getClass();
            final a10 k2 = tgj.k((int) Float.intBitsToFloat((int) (floatToRawIntBits >> 32)), (int) Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)), 0, 28);
            wx a2 = xx.a(k2);
            wj2 wj2Var = new wj2();
            vj2 vj2Var = wj2Var.a;
            kx4 kx4Var2 = vj2Var.a;
            ema emaVar2 = vj2Var.b;
            uj2 uj2Var = vj2Var.c;
            long j4 = vj2Var.d;
            vj2Var.a = kx4Var;
            vj2Var.b = emaVar;
            vj2Var.c = a2;
            vj2Var.d = floatToRawIntBits;
            a2.o();
            d7e.h(t, wj2Var, floatToRawIntBits, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 6);
            a2.h();
            vj2Var.a = kx4Var2;
            vj2Var.b = emaVar2;
            vj2Var.c = uj2Var;
            vj2Var.d = j4;
            yf8 yf8Var = xth.a;
            final dfj a3 = dfj.a(xth.c(), D7, u, null, null, 0L, null, 5, 0, u, null, null, 0, 16613372);
            final dfj a4 = dfj.a(xth.b(), D12, u, null, null, 0L, null, 5, 0, u, null, null, 0, 16613372);
            String v = oea.v(R.string.fan_avg, av8Var2);
            context.getClass();
            Locale d2 = dla.d();
            Set set = o84.a;
            final String i5 = wv8.i(v, " ", String.format(d2, "%s%.1fM", Arrays.copyOf(new Object[]{o84.e(context), Float.valueOf(f2)}, 2)));
            xbb b2 = kotlin.collections.a.b();
            b2.add(1);
            for (int i6 = 5; i6 <= i2; i6 += 5) {
                b2.add(Integer.valueOf(i6));
            }
            if (((Number) CollectionsKt.h0(b2)).intValue() != i2) {
                b2.add(Integer.valueOf(i2));
            }
            final xbb a5 = kotlin.collections.a.a(b2);
            int i7 = i4 & 112;
            boolean z3 = i7 == 32;
            Object O = av8Var2.O();
            a99 a99Var2 = nf3.a;
            if (z3 || O == a99Var2) {
                jejVar = Q;
                a99Var = a99Var2;
                c7aVar = new c7a(jej.a(jejVar, "0", a3, 1020).c);
                av8Var2.n0(c7aVar);
            } else {
                c7aVar = O;
                jejVar = Q;
                a99Var = a99Var2;
            }
            final long j5 = ((c7a) c7aVar).a;
            Object O2 = av8Var2.O();
            a99 a99Var3 = a99Var;
            if (O2 == a99Var3) {
                j2 = D12;
                O2 = new c7a(jej.a(jejVar, String.valueOf(i2), a3, 1020).c);
                av8Var2.n0(O2);
            } else {
                j2 = D12;
            }
            long j6 = ((c7a) O2).a;
            Object O3 = av8Var2.O();
            if (O3 == a99Var3) {
                j3 = j6;
                O3 = new c7a(jej.a(jejVar, i5, a4, 1020).c);
                av8Var2.n0(O3);
            } else {
                j3 = j6;
            }
            final long j7 = ((c7a) O3).a;
            int floor = ((int) Math.floor(CollectionsKt.r0(teeVar.values()))) - 1;
            if (floor < 0) {
                floor = 0;
            }
            int ceil = ((int) Math.ceil(CollectionsKt.n0(teeVar.values()))) + 1;
            if (ceil > 16) {
                ceil = 16;
            }
            final int i8 = ceil - floor;
            final List S0 = CollectionsKt.S0(new IntRange(floor, ceil, 1));
            utc utcVar2 = utc.a;
            xtc e2 = bkh.e(bkh.d(utcVar2, 1.0f), 180.0f);
            boolean f3 = ((i4 & 7168) == 2048) | av8Var2.f(D6) | ((i4 & 896) == 256) | ((i4 & 14) == 4) | (i7 == 32) | av8Var2.e(floor) | av8Var2.e(i8) | av8Var2.h(z2) | av8Var2.f(D8) | av8Var2.f(D9) | av8Var2.f(D10) | av8Var2.f(D11) | av8Var2.f(D5) | av8Var2.f(D4) | av8Var2.i(S0) | av8Var2.g(jejVar) | av8Var2.g(a3) | av8Var2.i(a5) | av8Var2.f(j5) | av8Var2.f(D) | av8Var2.d(H0) | av8Var2.i(k2) | av8Var2.f(D2);
            boolean z4 = (i4 & 57344) == 16384;
            final long j8 = j2;
            boolean f4 = f3 | z4 | av8Var2.f(D3) | av8Var2.g(i5) | av8Var2.g(a4) | av8Var2.f(j8);
            Object O4 = av8Var2.O();
            if (f4 || O4 == a99Var3) {
                final int i9 = floor;
                xtcVar3 = e2;
                final long j9 = j3;
                final jej jejVar2 = jejVar;
                utcVar = utcVar2;
                O4 = new Function1(j9, teeVar, i2, i9, i8, z2, num, D8, D9, D10, D11, D5, D4, S0, a5, f2, D3, j7, jejVar2, i5, a4, j8, a3, j5, D6, D, H0, k2, D2) { // from class: vd7
                    public final /* synthetic */ float A;
                    public final /* synthetic */ a10 B;
                    public final /* synthetic */ long a;
                    public final /* synthetic */ tee b;
                    public final /* synthetic */ int c;
                    public final /* synthetic */ int d;
                    public final /* synthetic */ int e;
                    public final /* synthetic */ boolean f;
                    public final /* synthetic */ Integer g;
                    public final /* synthetic */ long h;
                    public final /* synthetic */ long i;
                    public final /* synthetic */ long j;
                    public final /* synthetic */ long k;
                    public final /* synthetic */ long l;
                    public final /* synthetic */ long m;
                    public final /* synthetic */ List n;
                    public final /* synthetic */ List o;
                    public final /* synthetic */ float p;
                    public final /* synthetic */ long q;
                    public final /* synthetic */ long r;
                    public final /* synthetic */ jej s;
                    public final /* synthetic */ String t;
                    public final /* synthetic */ dfj u;
                    public final /* synthetic */ long v;
                    public final /* synthetic */ dfj w;
                    public final /* synthetic */ long x;
                    public final /* synthetic */ long y;
                    public final /* synthetic */ long z;

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        sx2 sx2Var;
                        long j10;
                        long j11;
                        float f5;
                        int i10;
                        jej jejVar3;
                        float f6;
                        int i11;
                        String str;
                        float f7;
                        ha5 ha5Var = (ha5) obj;
                        ha5Var.getClass();
                        float H02 = ha5Var.H0(4.0f);
                        float H03 = ha5Var.H0(3.0f);
                        float H04 = ha5Var.H0(2.0f);
                        float H05 = ha5Var.H0(1.0f);
                        float H06 = ha5Var.H0(18.0f);
                        float H07 = ha5Var.H0(30.0f);
                        float intBitsToFloat = Float.intBitsToFloat((int) (ha5Var.n() >> 32)) - H07;
                        int i12 = (int) (this.a >> 32);
                        float f8 = i12;
                        float f9 = f8 / 2.0f;
                        float f10 = 1.0f;
                        long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat - f9) << 32) | (Float.floatToRawIntBits(ha5Var.H0(160.0f)) & 4294967295L);
                        float H08 = ha5Var.H0(30.0f);
                        tee teeVar2 = this.b;
                        ArrayList U0 = CollectionsKt.U0(CollectionsKt.G0(teeVar2.keySet()));
                        int intValue = ((Number) CollectionsKt.Y(U0)).intValue();
                        Float f11 = (Float) teeVar2.get(Integer.valueOf(intValue));
                        float floatValue = f11 != null ? f11.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        b20 a6 = e20.a();
                        int i13 = this.c;
                        boolean z5 = this.f;
                        float F = l6g.F(intValue, i13, floatToRawIntBits2, H08, z5);
                        tee teeVar3 = teeVar2;
                        long j12 = floatToRawIntBits2;
                        int i14 = this.d;
                        int i15 = this.e;
                        a6.g(F, l6g.G(floatValue, i14, i15, j12));
                        boolean z6 = true;
                        Iterator it = CollectionsKt.S(U0, 1).iterator();
                        while (it.hasNext()) {
                            int intValue2 = ((Number) it.next()).intValue();
                            long j13 = j12;
                            float F2 = l6g.F(intValue2, i13, j13, H08, z5);
                            boolean z7 = z6;
                            float f12 = H02;
                            tee teeVar4 = teeVar3;
                            Float f13 = (Float) teeVar4.get(Integer.valueOf(intValue2));
                            a6.f(F2, l6g.G(f13 != null ? f13.floatValue() : 0.0f, i14, i15, j13));
                            teeVar3 = teeVar4;
                            j12 = j13;
                            H02 = f12;
                            z6 = z7;
                        }
                        boolean z8 = z6;
                        float f14 = H02;
                        tee teeVar5 = teeVar3;
                        long j14 = j12;
                        Integer num2 = this.g;
                        int intValue3 = num2 != null ? num2.intValue() : 0;
                        float H09 = ha5Var.H0(30.0f);
                        int intValue4 = ((Number) CollectionsKt.o0(teeVar5.keySet())).intValue();
                        b20 a7 = e20.a();
                        b20.a(a7, a6);
                        int i16 = (int) (j14 & 4294967295L);
                        a7.f(l6g.F(intValue4, i13, j14, H09, z5), Float.intBitsToFloat(i16));
                        a7.f(l6g.F(intValue3, i13, j14, H09, z5), Float.intBitsToFloat(i16));
                        a7.d();
                        float intBitsToFloat2 = Float.intBitsToFloat(i16);
                        b20 b20Var = a7;
                        b20 b20Var2 = a6;
                        Pair[] pairArr = {new Pair(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), new r13(this.h)), new Pair(Float.valueOf(4.5f), new r13(this.i)), new Pair(Float.valueOf(6.5f), new r13(this.j)), new Pair(Float.valueOf(8.5f), new r13(this.k)), new Pair(Float.valueOf(11.0f), new r13(this.l))};
                        ArrayList arrayList = new ArrayList(5);
                        for (int i17 = 0; i17 < 5; i17++) {
                            Pair pair = pairArr[i17];
                            float floatValue2 = ((Number) pair.a).floatValue();
                            r13 r13Var = (r13) pair.b;
                            long j15 = r13Var.a;
                            arrayList.add(new Pair(Float.valueOf((floatValue2 - i14) / i15), r13Var));
                        }
                        int i18 = 0;
                        Pair[] pairArr2 = (Pair[]) arrayList.toArray(new Pair[0]);
                        v7b D13 = wxf.D((Pair[]) Arrays.copyOf(pairArr2, pairArr2.length), intBitsToFloat2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        float intBitsToFloat3 = Float.intBitsToFloat(i16);
                        long j16 = this.m;
                        v7b E = wxf.E(b.j(new r13(r13.c(j16, 0.3f)), new r13(r13.c(j16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, intBitsToFloat3, 8);
                        List list = this.n;
                        Iterator it2 = list.iterator();
                        int i19 = 0;
                        while (true) {
                            boolean hasNext = it2.hasNext();
                            jej jejVar4 = this.s;
                            dfj dfjVar = this.w;
                            if (hasNext) {
                                Object next = it2.next();
                                int i20 = i19 + 1;
                                if (i19 < 0) {
                                    b.q();
                                    throw null;
                                }
                                String valueOf = String.valueOf(((Number) next).intValue());
                                if (z5) {
                                    str = valueOf;
                                    f7 = Float.intBitsToFloat((int) (ha5Var.n() >> 32)) - f8;
                                } else {
                                    str = valueOf;
                                    f7 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                }
                                o6a.v(ha5Var, jejVar4, str, (Float.floatToRawIntBits(f7) << 32) | (Float.floatToRawIntBits(((1.0f - (i19 / (list.size() - 1))) * Float.intBitsToFloat(i16)) - (((int) (r10 & 4294967295L)) / 2.0f)) & 4294967295L), dfjVar, 432);
                                f8 = f8;
                                i19 = i20;
                                i18 = 0;
                                b20Var = b20Var;
                                H03 = H03;
                            } else {
                                int i21 = i18;
                                float f15 = H03;
                                ha5 ha5Var2 = ha5Var;
                                b20 b20Var3 = b20Var;
                                Iterator it3 = this.o.iterator();
                                while (it3.hasNext()) {
                                    int intValue5 = ((Number) it3.next()).intValue();
                                    float F3 = l6g.F(intValue5, i13, j14, H07, z5);
                                    if (intValue5 < 10) {
                                        jejVar3 = jejVar4;
                                        f6 = F3;
                                        i11 = (int) (this.x >> 32);
                                    } else {
                                        jejVar3 = jejVar4;
                                        f6 = F3;
                                        i11 = i12;
                                    }
                                    ha5 ha5Var3 = ha5Var2;
                                    long floatToRawIntBits3 = (Float.floatToRawIntBits(f6 - (i11 / 2.0f)) << 32) | (Float.floatToRawIntBits(ha5Var2.H0(8.0f) + Float.intBitsToFloat(i16)) & 4294967295L);
                                    jejVar4 = jejVar3;
                                    ha5Var2 = ha5Var3;
                                    o6a.v(ha5Var2, jejVar4, String.valueOf(intValue5), floatToRawIntBits3, dfjVar, 432);
                                }
                                jej jejVar5 = jejVar4;
                                int i22 = i21;
                                for (Object obj2 : list) {
                                    int i23 = i22 + 1;
                                    if (i22 < 0) {
                                        b.q();
                                        throw null;
                                    }
                                    ((Number) obj2).intValue();
                                    float[] fArr = new float[2];
                                    fArr[i21] = H04;
                                    fArr[z8 ? 1 : 0] = 2.0f * f14;
                                    c20 r = f5p.r(fArr, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                    float intBitsToFloat4 = z5 ? 0.0f : Float.intBitsToFloat((int) (ha5Var2.n() >> 32)) - f9;
                                    float f16 = i22;
                                    long floatToRawIntBits4 = (Float.floatToRawIntBits((f10 - (f16 / (list.size() - 1))) * Float.intBitsToFloat(i16)) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat4) << 32);
                                    float intBitsToFloat5 = z5 ? (Float.intBitsToFloat((int) (ha5Var2.n() >> 32)) - H06) - f9 : H06;
                                    ha5Var2 = ha5Var2;
                                    ha5.W0(ha5Var2, this.y, floatToRawIntBits4, (Float.floatToRawIntBits(intBitsToFloat5) << 32) | (Float.floatToRawIntBits((f10 - (f16 / (list.size() - 1))) * Float.intBitsToFloat(i16)) & 4294967295L), H05, 1, r, 448);
                                    i15 = i15;
                                    i22 = i23;
                                    b20Var2 = b20Var2;
                                    list = list;
                                    jejVar5 = jejVar5;
                                    f10 = f10;
                                }
                                b20 b20Var4 = b20Var2;
                                jej jejVar6 = jejVar5;
                                int i24 = i15;
                                sx2 L0 = ha5Var2.L0();
                                long D14 = L0.D();
                                L0.t().o();
                                try {
                                    ((hpo) L0.a).p(b20Var3);
                                    sx2Var = L0;
                                    j10 = D14;
                                    try {
                                        ha5.g0(ha5Var2, E, (Float.floatToRawIntBits(z5 ? 0.0f : H07) << 32) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L), j14, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, 120);
                                        sx2Var.t().h();
                                        sx2Var.N(j10);
                                        ha5.D(ha5Var2, b20Var4, D13, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new jii(f15, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 1, null, 22), 0, 52);
                                        if (num2 != null) {
                                            long floatToRawIntBits5 = Float.floatToRawIntBits(l6g.F(num2.intValue(), i13, j14, H07, z5));
                                            float f17 = this.A;
                                            long floatToRawIntBits6 = (Float.floatToRawIntBits(f17) & 4294967295L) | (floatToRawIntBits5 << 32);
                                            long floatToRawIntBits7 = (Float.floatToRawIntBits(r12) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat(i16)) & 4294967295L);
                                            long j17 = this.z;
                                            j11 = j14;
                                            i10 = 2;
                                            ha5.W0(ha5Var2, j17, floatToRawIntBits6, floatToRawIntBits7, H04, 0, null, 496);
                                            f5 = H04;
                                            ha5.x(ha5Var2, this.B, (Float.floatToRawIntBits(r12 - (f17 / 2.0f)) << 32) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L), new ay1(j17, 5), 44);
                                            Unit unit = Unit.a;
                                        } else {
                                            j11 = j14;
                                            f5 = H04;
                                            i10 = 2;
                                        }
                                        float G = l6g.G(this.p, i14, i24, j11);
                                        long c2 = r13.c(this.q, 0.7f);
                                        long j18 = this.r;
                                        float f18 = (int) (j18 >> 32);
                                        float f19 = (int) (j18 & 4294967295L);
                                        ha5.f0(ha5Var2, c2, (Float.floatToRawIntBits((G - f19) - f5) & 4294967295L) | (Float.floatToRawIntBits(z5 ? (((Float.intBitsToFloat((int) (ha5Var2.n() >> 32)) - H07) - f18) - f9) - f5 : H07 - f5) << 32), (Float.floatToRawIntBits(f19) & 4294967295L) | (Float.floatToRawIntBits((f5 * 2.0f) + f18) << 32), (Float.floatToRawIntBits(f14) & 4294967295L) | (Float.floatToRawIntBits(f14) << 32), null, 240);
                                        o6a.v(ha5Var2, jejVar6, this.t, (Float.floatToRawIntBits(z5 ? ((Float.intBitsToFloat((int) (ha5Var2.n() >> 32)) - H07) - f18) - f9 : H07) << 32) | (Float.floatToRawIntBits((G - f5) - f19) & 4294967295L), this.u, 432);
                                        float f20 = f14 * 2.0f;
                                        float[] fArr2 = new float[i10];
                                        fArr2[i21] = f20;
                                        fArr2[z8 ? 1 : 0] = f20;
                                        c20 r2 = f5p.r(fArr2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                        if (z5) {
                                            H07 = (Float.intBitsToFloat((int) (ha5Var2.n() >> 32)) - H07) - f9;
                                        }
                                        long floatToRawIntBits8 = (Float.floatToRawIntBits(H07) << 32) | (Float.floatToRawIntBits(G) & 4294967295L);
                                        float intBitsToFloat6 = z5 ? 0.0f : Float.intBitsToFloat((int) (ha5Var2.n() >> 32)) - f9;
                                        ha5.W0(ha5Var2, this.v, floatToRawIntBits8, (Float.floatToRawIntBits(intBitsToFloat6) << 32) | (Float.floatToRawIntBits(G) & 4294967295L), f5, 0, r2, 464);
                                        return Unit.a;
                                    } catch (Throwable th) {
                                        th = th;
                                        mz1.v(sx2Var, j10);
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    sx2Var = L0;
                                    j10 = D14;
                                }
                            }
                        }
                    }
                };
                av8Var = av8Var2;
                av8Var.n0(O4);
            } else {
                av8Var = av8Var2;
                utcVar = utcVar2;
                xtcVar3 = e2;
            }
            lz.d(0, av8Var, xtcVar3, (Function1) O4);
            xtcVar2 = utcVar;
        } else {
            av8Var = av8Var2;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new Function2(i2, num, f2, xtcVar2, i3) { // from class: wd7
                public final /* synthetic */ int b;
                public final /* synthetic */ Integer c;
                public final /* synthetic */ float d;
                public final /* synthetic */ xtc e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(1);
                    l6g.u(tee.this, this.b, this.c, this.d, this.e, (of3) obj, K);
                    return Unit.a;
                }
            };
        }
    }

    public static final void v(int i2, gv9 gv9Var, gv9 gv9Var2, tc3 tc3Var, of3 of3Var, int i3) {
        ct8 ct8Var;
        zg3 zg3Var;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1955404216);
        int i4 = i3 | (av8Var.e(i2) ? 4 : 2) | (av8Var.g(gv9Var) ? 32 : 16) | (av8Var.g(gv9Var2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i4 & 1, (i4 & 1171) != 1170)) {
            g28 g28Var = bkh.c;
            mv1 mv1Var = uxf.c;
            k1c c2 = e12.c(mv1Var, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, g28Var);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, c2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            wkn.k(haa.t(i2, i4 & 14, av8Var), null, yqo.u(g28Var, 10.0f, 10.0f, oyn.e), null, mp3.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 25016, 104);
            av8Var = av8Var;
            e12.a(0, av8Var, td4.Y(g28Var, new dt(26)));
            xtc c0 = l98.c0(g28Var, 20.0f, 60.0f);
            k1c c3 = e12.c(mv1Var, false);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, c0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c3, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            xtc d0 = l98.d0(yso.p(n9e.p(g28Var, wxf.E(gv9Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), o7g.a(8.0f), 4), 1.0f, new v7b(gv9Var2, null, 0L, 9187343241974906880L), o7g.a(8.0f)), 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            k1c c4 = e12.c(uxf.g, false);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C3 = fqj.C(av8Var, d0);
            av8Var.h0();
            if (av8Var.S) {
                zg3Var = zg3Var2;
                av8Var.l(zg3Var);
            } else {
                zg3Var = zg3Var2;
                av8Var.q0();
            }
            waa.K(av8Var, c4, f50Var);
            waa.K(av8Var, m4, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            u23 a2 = t23.a(ww9.d, uxf.p, av8Var, 48);
            int hashCode4 = Long.hashCode(av8Var.T);
            aee m5 = av8Var.m();
            xtc C4 = fqj.C(av8Var, g28Var);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, f50Var);
            waa.K(av8Var, m5, ff3Var);
            bf3.s(hashCode4, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C4, f50Var3);
            ct8Var = tc3Var;
            ct8Var.invoke(x23.a, av8Var, 54);
            ImageVector N = s6a.N(R.drawable.sofa_season_2025, 6, av8Var);
            long D = lz.D(R.color.on_color_primary, av8Var);
            utc utcVar = utc.a;
            kq9.b(N, null, bkh.d(utcVar, 1.0f), D, av8Var, 432, 0);
            nq8.h(av8Var, bkh.e(utcVar, 24.0f));
            av8Var.s(true);
            av8Var.s(true);
            av8Var.s(true);
            av8Var.s(true);
        } else {
            ct8Var = tc3Var;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new b30(i2, i3, 2, gv9Var, gv9Var2, ct8Var);
        }
    }

    public static final void w(vjj vjjVar, Function0 function0, jii jiiVar, jii jiiVar2, xtc xtcVar, boolean z, bt2 bt2Var, of3 of3Var, int i2) {
        int i3;
        int i4;
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-406243761);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.e(vjjVar.ordinal()) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.i(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.i(jiiVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var.i(jiiVar2) ? a.o : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= av8Var.g(xtcVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= av8Var.h(z) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i2) == 0) {
            i3 |= av8Var.g(bt2Var) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= av8Var.g(null) ? 8388608 : 4194304;
        }
        if (av8Var.T(i3 & 1, (4793491 & i3) != 4793490)) {
            av8Var.Y();
            if ((i2 & 1) != 0 && !av8Var.B()) {
                av8Var.W();
            }
            av8Var.t();
            xtc xtcVar3 = utc.a;
            if (function0 != null) {
                i4 = i3;
                xtcVar2 = c5n.P(vjjVar, n5g.a(gt2.d / 2.0f, 4, 0L, false), z, new u5g(1), function0);
            } else {
                i4 = i3;
                xtcVar2 = xtcVar3;
            }
            if (function0 != null) {
                ye9 ye9Var = l7a.a;
                xtcVar3 = yjc.a;
            }
            int i5 = i4 << 6;
            e(z, vjjVar, l98.b0(xtcVar.z(xtcVar3).z(xtcVar2), 2.0f), bt2Var, jiiVar, jiiVar2, av8Var, ((i4 >> 15) & 14) | ((i4 << 3) & 112) | ((i4 >> 9) & 7168) | (57344 & i5) | (i5 & 458752));
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new et2(vjjVar, function0, jiiVar, jiiVar2, xtcVar, z, bt2Var, i2);
        }
    }

    public static final void x(BlazeTextWithIconButton blazeTextWithIconButton, i iVar) {
        blazeTextWithIconButton.getClass();
        iVar.getClass();
        try {
            Integer a2 = ipl.a(Integer.valueOf(Color.parseColor("#FFFFFF")), iVar.d);
            if (a2 != null) {
                blazeTextWithIconButton.setCardBackgroundColor(a2.intValue());
            }
        } catch (Exception unused) {
            String str = iVar.d;
        }
        try {
            Integer a3 = ipl.a(Integer.valueOf(Color.parseColor("#000000")), iVar.e);
            if (a3 != null) {
                blazeTextWithIconButton.setTextColor(a3.intValue());
            }
        } catch (Exception unused2) {
            String str2 = iVar.e;
        }
    }

    public static final void y(BlazeTextWithIconButton blazeTextWithIconButton, Integer num, i iVar) {
        String str;
        blazeTextWithIconButton.getClass();
        if (num != null) {
            blazeTextWithIconButton.setDrawableStartTintColor(num.intValue());
            return;
        }
        if (iVar == null || (str = iVar.e) == null) {
            return;
        }
        try {
            Integer rgbaToColorInt$default = ipl.rgbaToColorInt$default(ipl.a, str, null, 2, null);
            if (rgbaToColorInt$default != null) {
                blazeTextWithIconButton.setDrawableStartTintColor(rgbaToColorInt$default.intValue());
                Unit unit = Unit.a;
            }
        } catch (Exception unused) {
        }
    }

    public static final Object z(rq3 rq3Var, k6g k6gVar, Function1 function1) {
        return (k6gVar.inCompatibilityMode() && k6gVar.isOpenInternal$room_runtime() && k6gVar.inTransaction()) ? function1.invoke(rq3Var) : rq3Var.getContext().get(m6g.a) == null ? function1.invoke(rq3Var) : c0(rq3Var, k6gVar, function1);
    }
}
