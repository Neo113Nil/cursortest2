package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.SystemClock;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgChannel;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType;
import com.google.ads.interactivemedia.v3.impl.data.AdsRenderingSettingsImpl;
import com.google.ads.interactivemedia.v3.impl.data.CuePointData;
import com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData;
import com.google.ads.interactivemedia.v3.impl.data.customui.UiConfigImpl;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class rmn implements orn {
    public final /* synthetic */ lnn a;

    public rmn(lnn lnnVar) {
        this.a = lnnVar;
    }

    @Override // defpackage.orn
    public final void b(lda ldaVar) {
        Uri build;
        lnn lnnVar = this.a;
        mqn mqnVar = lnnVar.a;
        c0l c0lVar = lnnVar.d;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType = ldaVar.d;
        JavaScriptMsgData javaScriptMsgData = (JavaScriptMsgData) ldaVar.b;
        gmo gmoVar = (javaScriptMsgData == null || javaScriptMsgData.adData() == null) ? null : new gmo(javaScriptMsgData.adData(), 6);
        int ordinal = javaScriptMessage$MsgType.ordinal();
        if (ordinal == 1) {
            lnnVar.d(new ox9(xf.z, gmoVar, null));
            return;
        }
        if (ordinal == 2) {
            ox9 ox9Var = new ox9(xf.b, null, null);
            String adBreakTime = javaScriptMsgData.adBreakTime();
            ox9Var.d = adBreakTime != null ? z3p.a("adBreakTime", adBreakTime) : null;
            lnnVar.d(ox9Var);
            return;
        }
        if (ordinal == 3) {
            ox9 ox9Var2 = new ox9(xf.j, null, null);
            String adBreakTime2 = javaScriptMsgData.adBreakTime();
            ox9Var2.d = adBreakTime2 != null ? z3p.a("adBreakTime", adBreakTime2) : null;
            lnnVar.d(ox9Var2);
            return;
        }
        if (ordinal == 4) {
            lnnVar.d(new ox9(xf.y, gmoVar, null));
            return;
        }
        if (ordinal == 5) {
            lnnVar.d(new ox9(xf.x, null, null));
            return;
        }
        if (ordinal == 22) {
            lnnVar.d(new ox9(xf.f, null, null));
            return;
        }
        if (ordinal == 23) {
            lnnVar.d(new ox9(xf.g, null, null));
            return;
        }
        if (ordinal == 33) {
            c0lVar.v(new zjo(new tf(2, ((Integer) b2p.l(javaScriptMsgData.errorCode()).h(900)).intValue(), zjo.a(javaScriptMsgData.errorMessage(), javaScriptMsgData.innerError()))));
            return;
        }
        if (ordinal == 34) {
            lnnVar.d(new ox9(xf.h, gmoVar, null));
            return;
        }
        if (ordinal == 93) {
            lnnVar.d(new ox9(xf.r, gmoVar, null));
            return;
        }
        if (ordinal == 94) {
            ox9 ox9Var3 = new ox9(xf.s, null, null);
            if (javaScriptMsgData != null) {
                javaScriptMsgData.iconClickFallbackImages();
            }
            lnnVar.d(ox9Var3);
            return;
        }
        switch (ordinal) {
            case 8:
                lnnVar.d(new ox9(xf.B, null, null));
                break;
            case 9:
                ox9 ox9Var4 = new ox9(xf.A, null, null);
                b2p.l(javaScriptMsgData.totalAds());
                b2p.l(javaScriptMsgData.adsDuration());
                b2p.l(javaScriptMsgData.totalDuration());
                b2p.l(javaScriptMsgData.slateDuration());
                ox9Var4.g = new wje(25);
                lnnVar.d(ox9Var4);
                break;
            case 10:
                ox9 ox9Var5 = new ox9(xf.w, gmoVar, null);
                b2p.l(javaScriptMsgData.currentTime());
                b2p.l(javaScriptMsgData.duration());
                b2p.l(javaScriptMsgData.adPosition());
                b2p.l(javaScriptMsgData.totalAds());
                b2p.l(javaScriptMsgData.adBreakDuration());
                b2p.l(javaScriptMsgData.adPeriodDuration());
                javaScriptMsgData.adsDurationsMs();
                ox9Var5.f = new v9f(26);
                lnnVar.d(ox9Var5);
                break;
            default:
                switch (ordinal) {
                    case 12:
                        lnnVar.d(new ox9(xf.a, null, null));
                        break;
                    case 16:
                        lnnVar.d(new ox9(xf.c, gmoVar, null));
                        break;
                    case 20:
                        lnnVar.d(new ox9(xf.d, gmoVar, null));
                        break;
                    case 26:
                        ox9 ox9Var6 = new ox9(xf.e, null, null);
                        if (javaScriptMsgData.cuepoints() != null) {
                            List<CuePointData> cuepoints = javaScriptMsgData.cuepoints();
                            if (cuepoints instanceof RandomAccess) {
                                new m4p(cuepoints);
                            } else {
                                new p4p(cuepoints);
                            }
                        } else {
                            new ArrayList();
                        }
                        lnnVar.d(ox9Var6);
                        break;
                    case 39:
                        lnnVar.d(new ox9(xf.D, gmoVar, null));
                        break;
                    case 42:
                        lnnVar.d(new ox9(xf.t, null, null));
                        break;
                    case 47:
                        lnnVar.f();
                        break;
                    case 58:
                        String url = javaScriptMsgData.url();
                        String attributionSrc = javaScriptMsgData.attributionSrc();
                        f0o f0oVar = lnnVar.n;
                        if (!wba.Y(url) && !wba.Y(attributionSrc)) {
                            c0l c0lVar2 = lnnVar.k;
                            Uri parse = Uri.parse(url);
                            Uri parse2 = Uri.parse(attributionSrc);
                            b2p b2pVar = ((w2o) mqnVar.b.h).b;
                            String valueOf = String.valueOf(SystemClock.elapsedRealtime());
                            Uri.Builder buildUpon = parse.buildUpon();
                            if (parse2 == null) {
                                build = buildUpon.build();
                            } else if (!Objects.equals(parse.getQueryParameter("ase"), "3")) {
                                build = buildUpon.build();
                            } else if (b2pVar.d()) {
                                r1c r1cVar = (r1c) c0lVar2.b;
                                if (r1cVar == null) {
                                    buildUpon.appendQueryParameter("nis", "10");
                                    build = buildUpon.build();
                                } else {
                                    Uri.Builder buildUpon2 = parse2.buildUpon();
                                    buildUpon.appendQueryParameter("uk", valueOf);
                                    buildUpon2.appendQueryParameter("uk", valueOf);
                                    buildUpon2.appendQueryParameter("nis", "12");
                                    buildUpon2.appendQueryParameter("asr", "1");
                                    try {
                                        ddb c = r1cVar.c();
                                        int i = s7p.h;
                                        s7p t7pVar = c instanceof s7p ? (s7p) c : new t7p(c);
                                        xjn xjnVar = new xjn(buildUpon2, b2pVar, r1cVar);
                                        b7p b7pVar = (b7p) c0lVar2.c;
                                        int i2 = f7p.k;
                                        d7p d7pVar = new d7p(t7pVar, xjnVar);
                                        t7pVar.addListener(d7pVar, b7pVar == q7p.a ? b7pVar : new irb(b7pVar, d7pVar, 4));
                                        mha.I(d7pVar, new y9f(7), b7pVar);
                                        buildUpon.appendQueryParameter("nis", "12");
                                        build = buildUpon.build();
                                    } catch (RuntimeException unused) {
                                        buildUpon.appendQueryParameter("nis", "9");
                                        build = buildUpon.build();
                                    }
                                }
                            } else {
                                buildUpon.appendQueryParameter("nis", "11");
                                build = buildUpon.build();
                            }
                            url = build.toString();
                        }
                        if (!wba.Y(url)) {
                            Context context = (Context) f0oVar.b;
                            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(url)), C.DEFAULT_BUFFER_SEGMENT_SIZE);
                            if (resolveActivity != null && resolveActivity.activityInfo != null) {
                                if (((AdsRenderingSettingsImpl) f0oVar.c).getEnableCustomTabs()) {
                                    new da4().a().a(context, Uri.parse(url));
                                    break;
                                } else {
                                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(url));
                                    if (!(context instanceof Activity)) {
                                        intent.setFlags(268435456);
                                    }
                                    try {
                                        context.startActivity(intent);
                                        break;
                                    } catch (ActivityNotFoundException unused2) {
                                    }
                                }
                            }
                        }
                        mqnVar.d(new lda(JavaScriptMessage$MsgChannel.adsManager, JavaScriptMessage$MsgType.navigationRequestedFailed, lnnVar.b, z3p.a("url", url), null));
                        break;
                    case 63:
                        lnnVar.d(new ox9(xf.m, gmoVar, null));
                        break;
                    case 65:
                        lnnVar.d(new ox9(xf.l, null, null));
                        break;
                    case TokenParametersOuterClass$TokenParameters.TOPICS_FIELD_NUMBER /* 75 */:
                        lnnVar.d(new ox9(xf.n, gmoVar, null));
                        break;
                    case TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER /* 77 */:
                        if (javaScriptMsgData.uiConfig() != null) {
                            lnnVar.d(new ox9(xf.C, gmoVar, new tkn(UiConfigImpl.createFromJavaScriptMessage(javaScriptMsgData.uiConfig()), mqnVar, lnnVar.b)));
                            break;
                        }
                        break;
                    case 87:
                        lnnVar.d(new ox9(xf.u, gmoVar, null));
                        break;
                    default:
                        switch (ordinal) {
                            case 51:
                                if (gmoVar == null) {
                                    c0lVar.v(new zjo(new tf(1, 1, "Ad loaded message did not contain adData.", null)));
                                    break;
                                } else {
                                    lnnVar.d(new ox9(xf.v, gmoVar, null));
                                    break;
                                }
                            case 52:
                                ox9 ox9Var7 = new ox9(xf.i, gmoVar, null);
                                JavaScriptMsgData.LogData logData = javaScriptMsgData.logData();
                                ox9Var7.d = logData != null ? logData.constructMap() : null;
                                lnnVar.d(ox9Var7);
                                break;
                            case 53:
                                lnnVar.d(new ox9(xf.k, gmoVar, null));
                                break;
                            default:
                                switch (ordinal) {
                                    case 79:
                                        ox9 ox9Var8 = new ox9(xf.p, null, null);
                                        javaScriptMsgData.seekTime();
                                        lnnVar.d(ox9Var8);
                                        break;
                                    case 80:
                                        lnnVar.d(new ox9(xf.o, gmoVar, null));
                                        break;
                                    case 81:
                                        lnnVar.d(new ox9(xf.q, gmoVar, null));
                                        break;
                                }
                        }
                }
        }
    }
}
