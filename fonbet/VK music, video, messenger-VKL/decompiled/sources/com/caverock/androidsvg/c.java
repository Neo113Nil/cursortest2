package com.caverock.androidsvg;

import android.graphics.Matrix;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.util.Xml;
import androidx.car.app.hardware.common.CarZone;
import com.caverock.androidsvg.PreserveAspectRatio;
import com.caverock.androidsvg.SVG;
import com.caverock.androidsvg.a;
import com.coremedia.iso.boxes.TrackReferenceBox;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ironsource.B5;
import com.ironsource.X3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.ads.BuildConfig;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import io.requery.android.database.sqlite.SQLiteStatementType;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DefaultHandler2;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import ru.ok.android.externcalls.sdk.ml.config.MLFeatureConfigProviderBase;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.a7g;
import xsna.gn70;
import xsna.go9;
import xsna.i5s;
import xsna.u11;
import xsna.v9x;
import xsna.vq;
import xsna.yga0;
import xsna.zr;

/* compiled from: SVGParser.java */
/* loaded from: classes12.dex */
public final class c {
    public SVG a;
    public SVG.i0 b;
    public boolean c;
    public int d;
    public boolean e;
    public h f;
    public StringBuilder g;
    public boolean h;
    public StringBuilder i;

    /* compiled from: SVGParser.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[g.values().length];
            b = iArr;
            try {
                iArr[g.x.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[g.y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[g.width.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[g.height.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[g.version.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[g.href.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[g.preserveAspectRatio.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[g.d.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[g.pathLength.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                b[g.rx.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                b[g.ry.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                b[g.cx.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                b[g.cy.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                b[g.r.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                b[g.x1.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                b[g.y1.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                b[g.x2.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                b[g.y2.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                b[g.dx.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                b[g.dy.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                b[g.requiredFeatures.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                b[g.requiredExtensions.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                b[g.systemLanguage.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                b[g.requiredFormats.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                b[g.requiredFonts.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                b[g.refX.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                b[g.refY.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                b[g.markerWidth.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                b[g.markerHeight.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                b[g.markerUnits.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                b[g.orient.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                b[g.gradientUnits.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                b[g.gradientTransform.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                b[g.spreadMethod.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                b[g.fx.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                b[g.fy.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                b[g.offset.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                b[g.clipPathUnits.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                b[g.startOffset.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                b[g.patternUnits.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                b[g.patternContentUnits.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                b[g.patternTransform.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                b[g.maskUnits.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                b[g.maskContentUnits.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                b[g.style.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                b[g.CLASS.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                b[g.fill.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                b[g.fill_rule.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                b[g.fill_opacity.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                b[g.stroke.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                b[g.stroke_opacity.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                b[g.stroke_width.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                b[g.stroke_linecap.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                b[g.stroke_linejoin.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                b[g.stroke_miterlimit.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                b[g.stroke_dasharray.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                b[g.stroke_dashoffset.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                b[g.opacity.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                b[g.color.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                b[g.font.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                b[g.font_family.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                b[g.font_size.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                b[g.font_weight.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                b[g.font_style.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                b[g.text_decoration.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                b[g.direction.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                b[g.text_anchor.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                b[g.overflow.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                b[g.marker.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                b[g.marker_start.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                b[g.marker_mid.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                b[g.marker_end.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                b[g.display.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                b[g.visibility.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                b[g.stop_color.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                b[g.stop_opacity.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                b[g.clip.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                b[g.clip_path.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                b[g.clip_rule.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                b[g.mask.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                b[g.solid_color.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                b[g.solid_opacity.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                b[g.viewport_fill.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                b[g.viewport_fill_opacity.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                b[g.vector_effect.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                b[g.image_rendering.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                b[g.viewBox.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                b[g.type.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                b[g.media.ordinal()] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            int[] iArr2 = new int[h.values().length];
            a = iArr2;
            try {
                iArr2[h.svg.ordinal()] = 1;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                a[h.g.ordinal()] = 2;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                a[h.a.ordinal()] = 3;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                a[h.defs.ordinal()] = 4;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                a[h.use.ordinal()] = 5;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                a[h.path.ordinal()] = 6;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                a[h.rect.ordinal()] = 7;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                a[h.circle.ordinal()] = 8;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                a[h.ellipse.ordinal()] = 9;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                a[h.line.ordinal()] = 10;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                a[h.polyline.ordinal()] = 11;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                a[h.polygon.ordinal()] = 12;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                a[h.text.ordinal()] = 13;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                a[h.tspan.ordinal()] = 14;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                a[h.tref.ordinal()] = 15;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                a[h.SWITCH.ordinal()] = 16;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                a[h.symbol.ordinal()] = 17;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                a[h.marker.ordinal()] = 18;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                a[h.linearGradient.ordinal()] = 19;
            } catch (NoSuchFieldError unused108) {
            }
            try {
                a[h.radialGradient.ordinal()] = 20;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                a[h.stop.ordinal()] = 21;
            } catch (NoSuchFieldError unused110) {
            }
            try {
                a[h.title.ordinal()] = 22;
            } catch (NoSuchFieldError unused111) {
            }
            try {
                a[h.desc.ordinal()] = 23;
            } catch (NoSuchFieldError unused112) {
            }
            try {
                a[h.clipPath.ordinal()] = 24;
            } catch (NoSuchFieldError unused113) {
            }
            try {
                a[h.textPath.ordinal()] = 25;
            } catch (NoSuchFieldError unused114) {
            }
            try {
                a[h.pattern.ordinal()] = 26;
            } catch (NoSuchFieldError unused115) {
            }
            try {
                a[h.image.ordinal()] = 27;
            } catch (NoSuchFieldError unused116) {
            }
            try {
                a[h.view.ordinal()] = 28;
            } catch (NoSuchFieldError unused117) {
            }
            try {
                a[h.mask.ordinal()] = 29;
            } catch (NoSuchFieldError unused118) {
            }
            try {
                a[h.style.ordinal()] = 30;
            } catch (NoSuchFieldError unused119) {
            }
            try {
                a[h.solidColor.ordinal()] = 31;
            } catch (NoSuchFieldError unused120) {
            }
        }
    }

    /* compiled from: SVGParser.java */
    public static class b {
        public static final HashMap a;

        static {
            HashMap hashMap = new HashMap(10);
            a = hashMap;
            hashMap.put("none", PreserveAspectRatio.Alignment.none);
            hashMap.put("xMinYMin", PreserveAspectRatio.Alignment.xMinYMin);
            hashMap.put("xMidYMin", PreserveAspectRatio.Alignment.xMidYMin);
            hashMap.put("xMaxYMin", PreserveAspectRatio.Alignment.xMaxYMin);
            hashMap.put("xMinYMid", PreserveAspectRatio.Alignment.xMinYMid);
            hashMap.put("xMidYMid", PreserveAspectRatio.Alignment.xMidYMid);
            hashMap.put("xMaxYMid", PreserveAspectRatio.Alignment.xMaxYMid);
            hashMap.put("xMinYMax", PreserveAspectRatio.Alignment.xMinYMax);
            hashMap.put("xMidYMax", PreserveAspectRatio.Alignment.xMidYMax);
            hashMap.put("xMaxYMax", PreserveAspectRatio.Alignment.xMaxYMax);
        }
    }

    /* compiled from: SVGParser.java */
    /* renamed from: com.caverock.androidsvg.c$c, reason: collision with other inner class name */
    public static class C0105c {
        public static final HashMap a;

        static {
            HashMap hashMap = new HashMap(47);
            a = hashMap;
            a7g.a(-984833, hashMap, "aliceblue", -332841, "antiquewhite");
            vq.f(hashMap, "aqua", -16711681, -8388652, "aquamarine");
            a7g.a(-983041, hashMap, "azure", -657956, "beige");
            a7g.a(-6972, hashMap, "bisque", -16777216, "black");
            a7g.a(-5171, hashMap, "blanchedalmond", -16776961, "blue");
            a7g.a(-7722014, hashMap, "blueviolet", -5952982, "brown");
            a7g.a(-2180985, hashMap, "burlywood", -10510688, "cadetblue");
            a7g.a(-8388864, hashMap, "chartreuse", -2987746, "chocolate");
            a7g.a(-32944, hashMap, "coral", -10185235, "cornflowerblue");
            a7g.a(-1828, hashMap, "cornsilk", -2354116, "crimson");
            vq.f(hashMap, "cyan", -16711681, -16777077, "darkblue");
            a7g.a(-16741493, hashMap, "darkcyan", -4684277, "darkgoldenrod");
            vq.f(hashMap, "darkgray", -5658199, -16751616, "darkgreen");
            vq.f(hashMap, "darkgrey", -5658199, -4343957, "darkkhaki");
            a7g.a(-7667573, hashMap, "darkmagenta", -11179217, "darkolivegreen");
            a7g.a(-29696, hashMap, "darkorange", -6737204, "darkorchid");
            a7g.a(-7667712, hashMap, "darkred", -1468806, "darksalmon");
            a7g.a(-7357297, hashMap, "darkseagreen", -12042869, "darkslateblue");
            hashMap.put("darkslategray", -13676721);
            hashMap.put("darkslategrey", -13676721);
            vq.f(hashMap, "darkturquoise", -16724271, -7077677, "darkviolet");
            a7g.a(-60269, hashMap, "deeppink", -16728065, "deepskyblue");
            hashMap.put("dimgray", -9868951);
            hashMap.put("dimgrey", -9868951);
            vq.f(hashMap, "dodgerblue", -14774017, -5103070, "firebrick");
            a7g.a(-1296, hashMap, "floralwhite", -14513374, "forestgreen");
            vq.f(hashMap, "fuchsia", -65281, -2302756, "gainsboro");
            a7g.a(-460545, hashMap, "ghostwhite", -10496, "gold");
            hashMap.put("goldenrod", -2448096);
            hashMap.put("gray", -8355712);
            a7g.a(-16744448, hashMap, "green", -5374161, "greenyellow");
            vq.f(hashMap, "grey", -8355712, -983056, "honeydew");
            a7g.a(-38476, hashMap, "hotpink", -3318692, "indianred");
            a7g.a(-11861886, hashMap, "indigo", -16, "ivory");
            a7g.a(-989556, hashMap, "khaki", -1644806, "lavender");
            a7g.a(-3851, hashMap, "lavenderblush", -8586240, "lawngreen");
            a7g.a(-1331, hashMap, "lemonchiffon", -5383962, "lightblue");
            a7g.a(-1015680, hashMap, "lightcoral", -2031617, "lightcyan");
            hashMap.put("lightgoldenrodyellow", -329006);
            hashMap.put("lightgray", -2894893);
            hashMap.put("lightgreen", -7278960);
            hashMap.put("lightgrey", -2894893);
            a7g.a(-18751, hashMap, "lightpink", -24454, "lightsalmon");
            a7g.a(-14634326, hashMap, "lightseagreen", -7876870, "lightskyblue");
            hashMap.put("lightslategray", -8943463);
            hashMap.put("lightslategrey", -8943463);
            vq.f(hashMap, "lightsteelblue", -5192482, -32, "lightyellow");
            a7g.a(-16711936, hashMap, "lime", -13447886, "limegreen");
            hashMap.put("linen", -331546);
            hashMap.put("magenta", -65281);
            a7g.a(-8388608, hashMap, "maroon", -10039894, "mediumaquamarine");
            a7g.a(-16777011, hashMap, "mediumblue", -4565549, "mediumorchid");
            a7g.a(-7114533, hashMap, "mediumpurple", -12799119, "mediumseagreen");
            a7g.a(-8689426, hashMap, "mediumslateblue", -16713062, "mediumspringgreen");
            a7g.a(-12004916, hashMap, "mediumturquoise", -3730043, "mediumvioletred");
            a7g.a(-15132304, hashMap, "midnightblue", -655366, "mintcream");
            a7g.a(-6943, hashMap, "mistyrose", -6987, "moccasin");
            a7g.a(-8531, hashMap, "navajowhite", -16777088, "navy");
            a7g.a(-133658, hashMap, "oldlace", -8355840, "olive");
            a7g.a(-9728477, hashMap, "olivedrab", -23296, "orange");
            a7g.a(-47872, hashMap, "orangered", -2461482, "orchid");
            a7g.a(-1120086, hashMap, "palegoldenrod", -6751336, "palegreen");
            a7g.a(-5247250, hashMap, "paleturquoise", -2396013, "palevioletred");
            a7g.a(-4139, hashMap, "papayawhip", -9543, "peachpuff");
            a7g.a(-3308225, hashMap, "peru", -16181, "pink");
            a7g.a(-2252579, hashMap, "plum", -5185306, "powderblue");
            a7g.a(-8388480, hashMap, "purple", -10079335, "rebeccapurple");
            a7g.a(-65536, hashMap, "red", -4419697, "rosybrown");
            a7g.a(-12490271, hashMap, "royalblue", -7650029, "saddlebrown");
            a7g.a(-360334, hashMap, "salmon", -744352, "sandybrown");
            a7g.a(-13726889, hashMap, "seagreen", -2578, "seashell");
            a7g.a(-6270419, hashMap, "sienna", -4144960, "silver");
            a7g.a(-7876885, hashMap, "skyblue", -9807155, "slateblue");
            hashMap.put("slategray", -9404272);
            hashMap.put("slategrey", -9404272);
            vq.f(hashMap, "snow", -1286, -16711809, "springgreen");
            a7g.a(-12156236, hashMap, "steelblue", -2968436, "tan");
            a7g.a(-16744320, hashMap, "teal", -2572328, "thistle");
            a7g.a(-40121, hashMap, "tomato", -12525360, "turquoise");
            a7g.a(-1146130, hashMap, "violet", -663885, "wheat");
            a7g.a(-1, hashMap, "white", -657931, "whitesmoke");
            a7g.a(-256, hashMap, "yellow", -6632142, "yellowgreen");
            hashMap.put(X3.i.T, 0);
        }
    }

    /* compiled from: SVGParser.java */
    public static class d {
        public static final HashMap a;

        static {
            HashMap hashMap = new HashMap(9);
            a = hashMap;
            SVG.c1 c1Var = SVG.c1.pt;
            hashMap.put("xx-small", new SVG.p(0.694f, c1Var));
            hashMap.put("x-small", new SVG.p(0.833f, c1Var));
            hashMap.put("small", new SVG.p(10.0f, c1Var));
            hashMap.put("medium", new SVG.p(12.0f, c1Var));
            hashMap.put("large", new SVG.p(14.4f, c1Var));
            hashMap.put("x-large", new SVG.p(17.3f, c1Var));
            hashMap.put("xx-large", new SVG.p(20.7f, c1Var));
            SVG.c1 c1Var2 = SVG.c1.percent;
            hashMap.put("smaller", new SVG.p(83.33f, c1Var2));
            hashMap.put("larger", new SVG.p(120.0f, c1Var2));
        }
    }

    /* compiled from: SVGParser.java */
    public static class e {
        public static final HashMap a;

        static {
            HashMap hashMap = new HashMap(13);
            a = hashMap;
            hashMap.put("normal", 400);
            Integer valueOf = Integer.valueOf(IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED);
            hashMap.put(TtmlNode.BOLD, valueOf);
            a7g.a(1, hashMap, "bolder", -1, "lighter");
            a7g.a(100, hashMap, "100", 200, "200");
            hashMap.put("300", 300);
            hashMap.put("400", 400);
            a7g.a(500, hashMap, "500", 600, "600");
            vq.f(hashMap, "700", valueOf, 800, "800");
            hashMap.put("900", 900);
        }
    }

    /* compiled from: SVGParser.java */
    public class f extends DefaultHandler2 {
        public f() {
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public final void characters(char[] cArr, int i, int i2) throws SAXException {
            c.this.G(new String(cArr, i, i2));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public final void endDocument() throws SAXException {
            c.this.getClass();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public final void endElement(String str, String str2, String str3) throws SAXException {
            c.this.c(str, str2, str3);
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public final void processingInstruction(String str, String str2) throws SAXException {
            c.y(new i(str2));
            str.equals("xml-stylesheet");
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public final void startDocument() throws SAXException {
            c.this.E();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public final void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            c.this.F(str, str2, str3, attributes);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SVGParser.java */
    public static final class g {
        private static final /* synthetic */ g[] $VALUES;
        public static final g CLASS;
        public static final g UNSUPPORTED;
        private static final Map<String, g> cache;
        public static final g clip;
        public static final g clipPathUnits;
        public static final g clip_path;
        public static final g clip_rule;
        public static final g color;
        public static final g cx;
        public static final g cy;
        public static final g d;
        public static final g direction;
        public static final g display;
        public static final g dx;
        public static final g dy;
        public static final g fill;
        public static final g fill_opacity;
        public static final g fill_rule;
        public static final g font;
        public static final g font_family;
        public static final g font_size;
        public static final g font_style;
        public static final g font_weight;
        public static final g fx;
        public static final g fy;
        public static final g gradientTransform;
        public static final g gradientUnits;
        public static final g height;
        public static final g href;
        public static final g image_rendering;
        public static final g marker;
        public static final g markerHeight;
        public static final g markerUnits;
        public static final g markerWidth;
        public static final g marker_end;
        public static final g marker_mid;
        public static final g marker_start;
        public static final g mask;
        public static final g maskContentUnits;
        public static final g maskUnits;
        public static final g media;
        public static final g offset;
        public static final g opacity;
        public static final g orient;
        public static final g overflow;
        public static final g pathLength;
        public static final g patternContentUnits;
        public static final g patternTransform;
        public static final g patternUnits;
        public static final g points;
        public static final g preserveAspectRatio;
        public static final g r;
        public static final g refX;
        public static final g refY;
        public static final g requiredExtensions;
        public static final g requiredFeatures;
        public static final g requiredFonts;
        public static final g requiredFormats;
        public static final g rx;
        public static final g ry;
        public static final g solid_color;
        public static final g solid_opacity;
        public static final g spreadMethod;
        public static final g startOffset;
        public static final g stop_color;
        public static final g stop_opacity;
        public static final g stroke;
        public static final g stroke_dasharray;
        public static final g stroke_dashoffset;
        public static final g stroke_linecap;
        public static final g stroke_linejoin;
        public static final g stroke_miterlimit;
        public static final g stroke_opacity;
        public static final g stroke_width;
        public static final g style;
        public static final g systemLanguage;
        public static final g text_anchor;
        public static final g text_decoration;
        public static final g transform;
        public static final g type;
        public static final g vector_effect;
        public static final g version;
        public static final g viewBox;
        public static final g viewport_fill;
        public static final g viewport_fill_opacity;
        public static final g visibility;
        public static final g width;
        public static final g x;
        public static final g x1;
        public static final g x2;
        public static final g y;
        public static final g y1;
        public static final g y2;

        static {
            g gVar = new g("CLASS", 0);
            CLASS = gVar;
            g gVar2 = new g("clip", 1);
            clip = gVar2;
            g gVar3 = new g("clip_path", 2);
            clip_path = gVar3;
            g gVar4 = new g("clipPathUnits", 3);
            clipPathUnits = gVar4;
            g gVar5 = new g("clip_rule", 4);
            clip_rule = gVar5;
            g gVar6 = new g("color", 5);
            color = gVar6;
            g gVar7 = new g("cx", 6);
            cx = gVar7;
            g gVar8 = new g("cy", 7);
            cy = gVar8;
            g gVar9 = new g(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, 8);
            direction = gVar9;
            g gVar10 = new g("dx", 9);
            dx = gVar10;
            g gVar11 = new g("dy", 10);
            dy = gVar11;
            g gVar12 = new g("fx", 11);
            fx = gVar12;
            g gVar13 = new g("fy", 12);
            fy = gVar13;
            g gVar14 = new g("d", 13);
            d = gVar14;
            g gVar15 = new g("display", 14);
            display = gVar15;
            g gVar16 = new g("fill", 15);
            fill = gVar16;
            g gVar17 = new g("fill_rule", 16);
            fill_rule = gVar17;
            g gVar18 = new g("fill_opacity", 17);
            fill_opacity = gVar18;
            g gVar19 = new g("font", 18);
            font = gVar19;
            g gVar20 = new g("font_family", 19);
            font_family = gVar20;
            g gVar21 = new g("font_size", 20);
            font_size = gVar21;
            g gVar22 = new g("font_weight", 21);
            font_weight = gVar22;
            g gVar23 = new g("font_style", 22);
            font_style = gVar23;
            g gVar24 = new g("gradientTransform", 23);
            gradientTransform = gVar24;
            g gVar25 = new g("gradientUnits", 24);
            gradientUnits = gVar25;
            g gVar26 = new g("height", 25);
            height = gVar26;
            g gVar27 = new g("href", 26);
            href = gVar27;
            g gVar28 = new g("image_rendering", 27);
            image_rendering = gVar28;
            g gVar29 = new g("marker", 28);
            marker = gVar29;
            g gVar30 = new g("marker_start", 29);
            marker_start = gVar30;
            g gVar31 = new g("marker_mid", 30);
            marker_mid = gVar31;
            g gVar32 = new g("marker_end", 31);
            marker_end = gVar32;
            g gVar33 = new g("markerHeight", 32);
            markerHeight = gVar33;
            g gVar34 = new g("markerUnits", 33);
            markerUnits = gVar34;
            g gVar35 = new g("markerWidth", 34);
            markerWidth = gVar35;
            g gVar36 = new g("mask", 35);
            mask = gVar36;
            g gVar37 = new g("maskContentUnits", 36);
            maskContentUnits = gVar37;
            g gVar38 = new g("maskUnits", 37);
            maskUnits = gVar38;
            g gVar39 = new g(X3.i.I0, 38);
            media = gVar39;
            g gVar40 = new g(SignalingProtocol.KEY_OFFSET, 39);
            offset = gVar40;
            g gVar41 = new g("opacity", 40);
            opacity = gVar41;
            g gVar42 = new g("orient", 41);
            orient = gVar42;
            g gVar43 = new g("overflow", 42);
            overflow = gVar43;
            g gVar44 = new g("pathLength", 43);
            pathLength = gVar44;
            g gVar45 = new g("patternContentUnits", 44);
            patternContentUnits = gVar45;
            g gVar46 = new g("patternTransform", 45);
            patternTransform = gVar46;
            g gVar47 = new g("patternUnits", 46);
            patternUnits = gVar47;
            g gVar48 = new g("points", 47);
            points = gVar48;
            g gVar49 = new g("preserveAspectRatio", 48);
            preserveAspectRatio = gVar49;
            g gVar50 = new g("r", 49);
            r = gVar50;
            g gVar51 = new g("refX", 50);
            refX = gVar51;
            g gVar52 = new g("refY", 51);
            refY = gVar52;
            g gVar53 = new g("requiredFeatures", 52);
            requiredFeatures = gVar53;
            g gVar54 = new g("requiredExtensions", 53);
            requiredExtensions = gVar54;
            g gVar55 = new g("requiredFormats", 54);
            requiredFormats = gVar55;
            g gVar56 = new g("requiredFonts", 55);
            requiredFonts = gVar56;
            g gVar57 = new g("rx", 56);
            rx = gVar57;
            g gVar58 = new g("ry", 57);
            ry = gVar58;
            g gVar59 = new g("solid_color", 58);
            solid_color = gVar59;
            g gVar60 = new g("solid_opacity", 59);
            solid_opacity = gVar60;
            g gVar61 = new g("spreadMethod", 60);
            spreadMethod = gVar61;
            g gVar62 = new g("startOffset", 61);
            startOffset = gVar62;
            g gVar63 = new g("stop_color", 62);
            stop_color = gVar63;
            g gVar64 = new g("stop_opacity", 63);
            stop_opacity = gVar64;
            g gVar65 = new g("stroke", 64);
            stroke = gVar65;
            g gVar66 = new g("stroke_dasharray", 65);
            stroke_dasharray = gVar66;
            g gVar67 = new g("stroke_dashoffset", 66);
            stroke_dashoffset = gVar67;
            g gVar68 = new g("stroke_linecap", 67);
            stroke_linecap = gVar68;
            g gVar69 = new g("stroke_linejoin", 68);
            stroke_linejoin = gVar69;
            g gVar70 = new g("stroke_miterlimit", 69);
            stroke_miterlimit = gVar70;
            g gVar71 = new g("stroke_opacity", 70);
            stroke_opacity = gVar71;
            g gVar72 = new g("stroke_width", 71);
            stroke_width = gVar72;
            g gVar73 = new g(TtmlNode.TAG_STYLE, 72);
            style = gVar73;
            g gVar74 = new g("systemLanguage", 73);
            systemLanguage = gVar74;
            g gVar75 = new g("text_anchor", 74);
            text_anchor = gVar75;
            g gVar76 = new g("text_decoration", 75);
            text_decoration = gVar76;
            g gVar77 = new g("transform", 76);
            transform = gVar77;
            g gVar78 = new g("type", 77);
            type = gVar78;
            g gVar79 = new g("vector_effect", 78);
            vector_effect = gVar79;
            g gVar80 = new g("version", 79);
            version = gVar80;
            g gVar81 = new g("viewBox", 80);
            viewBox = gVar81;
            g gVar82 = new g("width", 81);
            width = gVar82;
            g gVar83 = new g("x", 82);
            x = gVar83;
            g gVar84 = new g("y", 83);
            y = gVar84;
            g gVar85 = new g("x1", 84);
            x1 = gVar85;
            g gVar86 = new g("y1", 85);
            y1 = gVar86;
            g gVar87 = new g("x2", 86);
            x2 = gVar87;
            g gVar88 = new g("y2", 87);
            y2 = gVar88;
            g gVar89 = new g("viewport_fill", 88);
            viewport_fill = gVar89;
            g gVar90 = new g("viewport_fill_opacity", 89);
            viewport_fill_opacity = gVar90;
            g gVar91 = new g("visibility", 90);
            visibility = gVar91;
            g gVar92 = new g("UNSUPPORTED", 91);
            UNSUPPORTED = gVar92;
            $VALUES = new g[]{gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10, gVar11, gVar12, gVar13, gVar14, gVar15, gVar16, gVar17, gVar18, gVar19, gVar20, gVar21, gVar22, gVar23, gVar24, gVar25, gVar26, gVar27, gVar28, gVar29, gVar30, gVar31, gVar32, gVar33, gVar34, gVar35, gVar36, gVar37, gVar38, gVar39, gVar40, gVar41, gVar42, gVar43, gVar44, gVar45, gVar46, gVar47, gVar48, gVar49, gVar50, gVar51, gVar52, gVar53, gVar54, gVar55, gVar56, gVar57, gVar58, gVar59, gVar60, gVar61, gVar62, gVar63, gVar64, gVar65, gVar66, gVar67, gVar68, gVar69, gVar70, gVar71, gVar72, gVar73, gVar74, gVar75, gVar76, gVar77, gVar78, gVar79, gVar80, gVar81, gVar82, gVar83, gVar84, gVar85, gVar86, gVar87, gVar88, gVar89, gVar90, gVar91, gVar92};
            cache = new HashMap();
            for (g gVar93 : values()) {
                if (gVar93 == CLASS) {
                    cache.put("class", gVar93);
                } else if (gVar93 != UNSUPPORTED) {
                    cache.put(gVar93.name().replace('_', '-'), gVar93);
                }
            }
        }

        public g() {
            throw null;
        }

        public static g a(String str) {
            g gVar = cache.get(str);
            return gVar != null ? gVar : UNSUPPORTED;
        }

        public static g valueOf(String str) {
            return (g) Enum.valueOf(g.class, str);
        }

        public static g[] values() {
            return (g[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SVGParser.java */
    public static final class h {
        private static final /* synthetic */ h[] $VALUES;
        public static final h SWITCH;
        public static final h UNSUPPORTED;
        public static final h a;
        private static final Map<String, h> cache;
        public static final h circle;
        public static final h clipPath;
        public static final h defs;
        public static final h desc;
        public static final h ellipse;
        public static final h g;
        public static final h image;
        public static final h line;
        public static final h linearGradient;
        public static final h marker;
        public static final h mask;
        public static final h path;
        public static final h pattern;
        public static final h polygon;
        public static final h polyline;
        public static final h radialGradient;
        public static final h rect;
        public static final h solidColor;
        public static final h stop;
        public static final h style;
        public static final h svg;
        public static final h symbol;
        public static final h text;
        public static final h textPath;
        public static final h title;
        public static final h tref;
        public static final h tspan;
        public static final h use;
        public static final h view;

        static {
            h hVar = new h("svg", 0);
            svg = hVar;
            h hVar2 = new h("a", 1);
            a = hVar2;
            h hVar3 = new h("circle", 2);
            circle = hVar3;
            h hVar4 = new h("clipPath", 3);
            clipPath = hVar4;
            h hVar5 = new h("defs", 4);
            defs = hVar5;
            h hVar6 = new h(CampaignEx.JSON_KEY_DESC, 5);
            desc = hVar6;
            h hVar7 = new h("ellipse", 6);
            ellipse = hVar7;
            h hVar8 = new h(com.vungle.ads.internal.task.g.e, 7);
            g = hVar8;
            h hVar9 = new h("image", 8);
            image = hVar9;
            h hVar10 = new h("line", 9);
            line = hVar10;
            h hVar11 = new h("linearGradient", 10);
            linearGradient = hVar11;
            h hVar12 = new h("marker", 11);
            marker = hVar12;
            h hVar13 = new h("mask", 12);
            mask = hVar13;
            h hVar14 = new h("path", 13);
            path = hVar14;
            h hVar15 = new h("pattern", 14);
            pattern = hVar15;
            h hVar16 = new h("polygon", 15);
            polygon = hVar16;
            h hVar17 = new h("polyline", 16);
            polyline = hVar17;
            h hVar18 = new h("radialGradient", 17);
            radialGradient = hVar18;
            h hVar19 = new h("rect", 18);
            rect = hVar19;
            h hVar20 = new h("solidColor", 19);
            solidColor = hVar20;
            h hVar21 = new h("stop", 20);
            stop = hVar21;
            h hVar22 = new h(TtmlNode.TAG_STYLE, 21);
            style = hVar22;
            h hVar23 = new h("SWITCH", 22);
            SWITCH = hVar23;
            h hVar24 = new h("symbol", 23);
            symbol = hVar24;
            h hVar25 = new h("text", 24);
            text = hVar25;
            h hVar26 = new h("textPath", 25);
            textPath = hVar26;
            h hVar27 = new h("title", 26);
            title = hVar27;
            h hVar28 = new h(TrackReferenceBox.TYPE, 27);
            tref = hVar28;
            h hVar29 = new h("tspan", 28);
            tspan = hVar29;
            h hVar30 = new h(MLFeatureConfigProviderBase.ENABLED_KEY, 29);
            use = hVar30;
            h hVar31 = new h(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, 30);
            view = hVar31;
            h hVar32 = new h("UNSUPPORTED", 31);
            UNSUPPORTED = hVar32;
            $VALUES = new h[]{hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9, hVar10, hVar11, hVar12, hVar13, hVar14, hVar15, hVar16, hVar17, hVar18, hVar19, hVar20, hVar21, hVar22, hVar23, hVar24, hVar25, hVar26, hVar27, hVar28, hVar29, hVar30, hVar31, hVar32};
            cache = new HashMap();
            for (h hVar33 : values()) {
                if (hVar33 == SWITCH) {
                    cache.put("switch", hVar33);
                } else if (hVar33 != UNSUPPORTED) {
                    cache.put(hVar33.name(), hVar33);
                }
            }
        }

        public h() {
            throw null;
        }

        public static h a(String str) {
            h hVar = cache.get(str);
            return hVar != null ? hVar : UNSUPPORTED;
        }

        public static h valueOf(String str) {
            return (h) Enum.valueOf(h.class, str);
        }

        public static h[] values() {
            return (h[]) $VALUES.clone();
        }
    }

    /* compiled from: SVGParser.java */
    public static class i {
        public final String a;
        public final int c;
        public int b = 0;
        public final gn70 d = new gn70();

        public i(String str) {
            this.c = 0;
            String trim = str.trim();
            this.a = trim;
            this.c = trim.length();
        }

        public static boolean g(int i) {
            return i == 32 || i == 10 || i == 13 || i == 9;
        }

        public final int a() {
            int i = this.b;
            int i2 = this.c;
            if (i == i2) {
                return -1;
            }
            int i3 = i + 1;
            this.b = i3;
            if (i3 < i2) {
                return this.a.charAt(i3);
            }
            return -1;
        }

        public final Boolean b(Object obj) {
            if (obj == null) {
                return null;
            }
            p();
            int i = this.b;
            if (i == this.c) {
                return null;
            }
            char charAt = this.a.charAt(i);
            if (charAt != '0' && charAt != '1') {
                return null;
            }
            this.b++;
            return Boolean.valueOf(charAt == '1');
        }

        public final float c(float f) {
            if (Float.isNaN(f)) {
                return Float.NaN;
            }
            p();
            return i();
        }

        public final boolean d(char c) {
            int i = this.b;
            boolean z = i < this.c && this.a.charAt(i) == c;
            if (z) {
                this.b++;
            }
            return z;
        }

        public final boolean e(String str) {
            int length = str.length();
            int i = this.b;
            boolean z = i <= this.c - length && this.a.substring(i, i + length).equals(str);
            if (z) {
                this.b += length;
            }
            return z;
        }

        public final boolean f() {
            return this.b == this.c;
        }

        public final Integer h() {
            int i = this.b;
            if (i == this.c) {
                return null;
            }
            this.b = i + 1;
            return Integer.valueOf(this.a.charAt(i));
        }

        public final float i() {
            int i = this.b;
            int i2 = this.c;
            gn70 gn70Var = this.d;
            float a = gn70Var.a(i, i2, this.a);
            if (!Float.isNaN(a)) {
                this.b = gn70Var.a;
            }
            return a;
        }

        public final SVG.p j() {
            float i = i();
            if (Float.isNaN(i)) {
                return null;
            }
            SVG.c1 n = n();
            return n == null ? new SVG.p(i, SVG.c1.px) : new SVG.p(i, n);
        }

        public final String k() {
            if (f()) {
                return null;
            }
            int i = this.b;
            String str = this.a;
            char charAt = str.charAt(i);
            if (charAt != '\'' && charAt != '\"') {
                return null;
            }
            int a = a();
            while (a != -1 && a != charAt) {
                a = a();
            }
            if (a == -1) {
                this.b = i;
                return null;
            }
            int i2 = this.b;
            this.b = i2 + 1;
            return str.substring(i + 1, i2);
        }

        public final String l() {
            return m(' ', false);
        }

        public final String m(char c, boolean z) {
            if (f()) {
                return null;
            }
            int i = this.b;
            String str = this.a;
            char charAt = str.charAt(i);
            if ((!z && g(charAt)) || charAt == c) {
                return null;
            }
            int i2 = this.b;
            int a = a();
            while (a != -1 && a != c && (z || !g(a))) {
                a = a();
            }
            return str.substring(i2, this.b);
        }

        public final SVG.c1 n() {
            if (f()) {
                return null;
            }
            int i = this.b;
            String str = this.a;
            if (str.charAt(i) == '%') {
                this.b++;
                return SVG.c1.percent;
            }
            int i2 = this.b;
            if (i2 > this.c - 2) {
                return null;
            }
            try {
                SVG.c1 valueOf = SVG.c1.valueOf(str.substring(i2, i2 + 2).toLowerCase(Locale.US));
                this.b += 2;
                return valueOf;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final float o() {
            p();
            int i = this.b;
            int i2 = this.c;
            gn70 gn70Var = this.d;
            float a = gn70Var.a(i, i2, this.a);
            if (!Float.isNaN(a)) {
                this.b = gn70Var.a;
            }
            return a;
        }

        public final boolean p() {
            q();
            int i = this.b;
            if (i == this.c || this.a.charAt(i) != ',') {
                return false;
            }
            this.b++;
            q();
            return true;
        }

        public final void q() {
            while (true) {
                int i = this.b;
                if (i >= this.c || !g(this.a.charAt(i))) {
                    return;
                } else {
                    this.b++;
                }
            }
        }
    }

    /* compiled from: SVGParser.java */
    public class j implements Attributes {
        public XmlPullParser a;

        @Override // org.xml.sax.Attributes
        public final int getIndex(String str) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public final int getLength() {
            return this.a.getAttributeCount();
        }

        @Override // org.xml.sax.Attributes
        public final String getLocalName(int i) {
            return this.a.getAttributeName(i);
        }

        @Override // org.xml.sax.Attributes
        public final String getQName(int i) {
            XmlPullParser xmlPullParser = this.a;
            String attributeName = xmlPullParser.getAttributeName(i);
            if (xmlPullParser.getAttributePrefix(i) == null) {
                return attributeName;
            }
            return xmlPullParser.getAttributePrefix(i) + ':' + attributeName;
        }

        @Override // org.xml.sax.Attributes
        public final String getType(int i) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public final String getURI(int i) {
            return this.a.getAttributeNamespace(i);
        }

        @Override // org.xml.sax.Attributes
        public final String getValue(String str) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public final int getIndex(String str, String str2) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public final String getType(String str) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public final String getValue(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public final String getType(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public final String getValue(int i) {
            return this.a.getAttributeValue(i);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void D(SVG.Style style, String str, String str2) {
        SVG.p j2;
        SVG.p pVar;
        if (str2.length() == 0 || str2.equals("inherit")) {
            return;
        }
        int i2 = a.b[g.a(str).ordinal()];
        SVG.g gVar = SVG.g.b;
        SVG.Style.FillRule fillRule = null;
        SVG.p pVar2 = null;
        SVG.Style.RenderQuality renderQuality = null;
        SVG.Style.VectorEffect vectorEffect = null;
        SVG.Style.FillRule fillRule2 = null;
        r12 = null;
        r12 = null;
        SVG.c cVar = null;
        Boolean bool = null;
        SVG.Style.TextAnchor textAnchor = null;
        SVG.Style.TextDirection textDirection = null;
        SVG.Style.TextDecoration textDecoration = null;
        SVG.Style.FontStyle fontStyle = null;
        String str3 = null;
        r12 = null;
        r12 = null;
        r12 = null;
        r12 = null;
        r12 = null;
        SVG.p[] pVarArr = null;
        SVG.Style.LineJoin lineJoin = null;
        SVG.Style.LineCap lineCap = null;
        try {
            switch (i2) {
                case 47:
                    SVG.n0 w = w(str2);
                    style.c = w;
                    if (w != null) {
                        style.b |= 1;
                        break;
                    }
                    break;
                case 48:
                    if ("nonzero".equals(str2)) {
                        fillRule = SVG.Style.FillRule.NonZero;
                    } else if ("evenodd".equals(str2)) {
                        fillRule = SVG.Style.FillRule.EvenOdd;
                    }
                    style.d = fillRule;
                    if (fillRule != null) {
                        style.b |= 2;
                        break;
                    }
                    break;
                case 49:
                    Float v = v(str2);
                    style.e = v;
                    if (v != null) {
                        style.b |= 4;
                        break;
                    }
                    break;
                case 50:
                    SVG.n0 w2 = w(str2);
                    style.f = w2;
                    if (w2 != null) {
                        style.b |= 8;
                        break;
                    }
                    break;
                case 51:
                    Float v2 = v(str2);
                    style.g = v2;
                    if (v2 != null) {
                        style.b |= 16;
                        break;
                    }
                    break;
                case 52:
                    style.h = s(str2);
                    style.b |= 32;
                    break;
                case 53:
                    if ("butt".equals(str2)) {
                        lineCap = SVG.Style.LineCap.Butt;
                    } else if ("round".equals(str2)) {
                        lineCap = SVG.Style.LineCap.Round;
                    } else if ("square".equals(str2)) {
                        lineCap = SVG.Style.LineCap.Square;
                    }
                    style.i = lineCap;
                    if (lineCap != null) {
                        style.b |= 64;
                        break;
                    }
                    break;
                case 54:
                    if ("miter".equals(str2)) {
                        lineJoin = SVG.Style.LineJoin.Miter;
                    } else if ("round".equals(str2)) {
                        lineJoin = SVG.Style.LineJoin.Round;
                    } else if ("bevel".equals(str2)) {
                        lineJoin = SVG.Style.LineJoin.Bevel;
                    }
                    style.j = lineJoin;
                    if (lineJoin != null) {
                        style.b |= 128;
                        break;
                    }
                    break;
                case 55:
                    style.k = Float.valueOf(p(str2));
                    style.b |= 256;
                    break;
                case 56:
                    if (!"none".equals(str2)) {
                        i iVar = new i(str2);
                        iVar.q();
                        if (!iVar.f() && (j2 = iVar.j()) != null && !j2.i()) {
                            float f2 = j2.b;
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(j2);
                            while (true) {
                                if (!iVar.f()) {
                                    iVar.p();
                                    SVG.p j3 = iVar.j();
                                    if (j3 != null && !j3.i()) {
                                        arrayList.add(j3);
                                        f2 += j3.b;
                                    }
                                } else if (f2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                    pVarArr = (SVG.p[]) arrayList.toArray(new SVG.p[arrayList.size()]);
                                }
                            }
                        }
                        style.l = pVarArr;
                        if (pVarArr != null) {
                            style.b |= 512;
                            break;
                        }
                    } else {
                        style.l = null;
                        style.b |= 512;
                        break;
                    }
                    break;
                case 57:
                    style.m = s(str2);
                    style.b |= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
                    break;
                case 58:
                    style.n = v(str2);
                    style.b |= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
                    break;
                case 59:
                    style.o = n(str2);
                    style.b |= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
                    break;
                case 60:
                    if ("|caption|icon|menu|message-box|small-caption|status-bar|".contains(HiAnalyticsConstant.REPORT_VAL_SEPARATOR + str2 + '|')) {
                        i iVar2 = new i(str2);
                        Integer num = null;
                        SVG.Style.FontStyle fontStyle2 = null;
                        String str4 = null;
                        while (true) {
                            String m = iVar2.m('/', false);
                            iVar2.q();
                            if (m != null) {
                                if (num == null || fontStyle2 == null) {
                                    if (!m.equals("normal") && (num != null || (num = (Integer) e.a.get(m)) == null)) {
                                        if (fontStyle2 == null) {
                                            switch (m) {
                                                case "oblique":
                                                    fontStyle2 = SVG.Style.FontStyle.Oblique;
                                                    break;
                                                case "italic":
                                                    fontStyle2 = SVG.Style.FontStyle.Italic;
                                                    break;
                                                case "normal":
                                                    fontStyle2 = SVG.Style.FontStyle.Normal;
                                                    break;
                                                default:
                                                    fontStyle2 = null;
                                                    break;
                                            }
                                            if (fontStyle2 != null) {
                                                continue;
                                            }
                                        }
                                        if (str4 == null && m.equals("small-caps")) {
                                            str4 = m;
                                        }
                                    }
                                }
                                try {
                                    pVar = (SVG.p) d.a.get(m);
                                    if (pVar == null) {
                                        pVar = s(m);
                                    }
                                } catch (SVGParseException unused) {
                                    pVar = null;
                                }
                                if (iVar2.d('/')) {
                                    iVar2.q();
                                    String l = iVar2.l();
                                    if (l != null) {
                                        s(l);
                                    }
                                    iVar2.q();
                                }
                                if (!iVar2.f()) {
                                    int i3 = iVar2.b;
                                    iVar2.b = iVar2.c;
                                    str3 = iVar2.a.substring(i3);
                                }
                                style.p = q(str3);
                                style.q = pVar;
                                style.r = Integer.valueOf(num == null ? 400 : num.intValue());
                                if (fontStyle2 == null) {
                                    fontStyle2 = SVG.Style.FontStyle.Normal;
                                }
                                style.s = fontStyle2;
                                style.b |= 122880;
                                break;
                            } else {
                                break;
                            }
                        }
                    }
                    break;
                case 61:
                    ArrayList q = q(str2);
                    style.p = q;
                    if (q != null) {
                        style.b |= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
                        break;
                    }
                    break;
                case 62:
                    try {
                        SVG.p pVar3 = (SVG.p) d.a.get(str2);
                        pVar2 = pVar3 == null ? s(str2) : pVar3;
                    } catch (SVGParseException unused2) {
                    }
                    style.q = pVar2;
                    if (pVar2 != null) {
                        style.b |= PlaybackStateCompat.ACTION_PREPARE;
                        break;
                    }
                    break;
                case 63:
                    Integer num2 = (Integer) e.a.get(str2);
                    style.r = num2;
                    if (num2 != null) {
                        style.b |= PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID;
                        break;
                    }
                    break;
                case 64:
                    switch (str2) {
                        case "oblique":
                            fontStyle = SVG.Style.FontStyle.Oblique;
                            break;
                        case "italic":
                            fontStyle = SVG.Style.FontStyle.Italic;
                            break;
                        case "normal":
                            fontStyle = SVG.Style.FontStyle.Normal;
                            break;
                    }
                    style.s = fontStyle;
                    if (fontStyle != null) {
                        style.b |= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
                        break;
                    }
                    break;
                case 65:
                    switch (str2) {
                        case "line-through":
                            textDecoration = SVG.Style.TextDecoration.LineThrough;
                            break;
                        case "underline":
                            textDecoration = SVG.Style.TextDecoration.Underline;
                            break;
                        case "none":
                            textDecoration = SVG.Style.TextDecoration.None;
                            break;
                        case "blink":
                            textDecoration = SVG.Style.TextDecoration.Blink;
                            break;
                        case "overline":
                            textDecoration = SVG.Style.TextDecoration.Overline;
                            break;
                    }
                    style.t = textDecoration;
                    if (textDecoration != null) {
                        style.b |= PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
                        break;
                    }
                    break;
                case 66:
                    if (str2.equals("ltr")) {
                        textDirection = SVG.Style.TextDirection.LTR;
                    } else if (str2.equals("rtl")) {
                        textDirection = SVG.Style.TextDirection.RTL;
                    }
                    style.u = textDirection;
                    if (textDirection != null) {
                        style.b |= 68719476736L;
                        break;
                    }
                    break;
                case 67:
                    switch (str2) {
                        case "middle":
                            textAnchor = SVG.Style.TextAnchor.Middle;
                            break;
                        case "end":
                            textAnchor = SVG.Style.TextAnchor.End;
                            break;
                        case "start":
                            textAnchor = SVG.Style.TextAnchor.Start;
                            break;
                    }
                    style.v = textAnchor;
                    if (textAnchor != null) {
                        style.b |= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                        break;
                    }
                    break;
                case 68:
                    switch (str2) {
                        case "hidden":
                        case "scroll":
                            bool = Boolean.FALSE;
                            break;
                        case "auto":
                        case "visible":
                            bool = Boolean.TRUE;
                            break;
                    }
                    style.w = bool;
                    if (bool != null) {
                        style.b |= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED;
                        break;
                    }
                    break;
                case 69:
                    String r = r(str2);
                    style.y = r;
                    style.z = r;
                    style.A = r;
                    style.b |= 14680064;
                    break;
                case 70:
                    style.y = r(str2);
                    style.b |= 2097152;
                    break;
                case 71:
                    style.z = r(str2);
                    style.b |= PlaybackStateCompat.ACTION_SET_PLAYBACK_SPEED;
                    break;
                case 72:
                    style.A = r(str2);
                    style.b |= 8388608;
                    break;
                case TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER /* 73 */:
                    if (str2.indexOf(Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE) < 0) {
                        if ("|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".contains(HiAnalyticsConstant.REPORT_VAL_SEPARATOR + str2 + '|')) {
                            style.B = Boolean.valueOf(!str2.equals("none"));
                            style.b |= 16777216;
                            break;
                        }
                    }
                    break;
                case TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER /* 74 */:
                    if (str2.indexOf(Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE) < 0) {
                        if ("|visible|hidden|collapse|".contains(HiAnalyticsConstant.REPORT_VAL_SEPARATOR + str2 + '|')) {
                            style.C = Boolean.valueOf(str2.equals("visible"));
                            style.b |= 33554432;
                            break;
                        }
                    }
                    break;
                case TokenParametersOuterClass$TokenParameters.TOPICS_FIELD_NUMBER /* 75 */:
                    if (str2.equals("currentColor")) {
                        style.D = gVar;
                    } else {
                        try {
                            style.D = n(str2);
                        } catch (SVGParseException e2) {
                            e2.getMessage();
                            return;
                        }
                    }
                    style.b |= 67108864;
                    break;
                case TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER /* 76 */:
                    style.E = v(str2);
                    style.b |= 134217728;
                    break;
                case TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER /* 77 */:
                    if (!"auto".equals(str2) && str2.startsWith("rect(")) {
                        i iVar3 = new i(str2.substring(5));
                        iVar3.q();
                        SVG.p u = u(iVar3);
                        iVar3.p();
                        SVG.p u2 = u(iVar3);
                        iVar3.p();
                        SVG.p u3 = u(iVar3);
                        iVar3.p();
                        SVG.p u4 = u(iVar3);
                        iVar3.q();
                        if (iVar3.d(')') || iVar3.f()) {
                            cVar = new SVG.c();
                            cVar.a = u;
                            cVar.b = u2;
                            cVar.c = u3;
                            cVar.d = u4;
                        }
                    }
                    style.x = cVar;
                    if (cVar != null) {
                        style.b |= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
                        break;
                    }
                    break;
                case TokenParametersOuterClass$TokenParameters.GPP_FIELD_NUMBER /* 78 */:
                    style.F = r(str2);
                    style.b |= 268435456;
                    break;
                case 79:
                    if ("nonzero".equals(str2)) {
                        fillRule2 = SVG.Style.FillRule.NonZero;
                    } else if ("evenodd".equals(str2)) {
                        fillRule2 = SVG.Style.FillRule.EvenOdd;
                    }
                    style.G = fillRule2;
                    style.b |= 536870912;
                    break;
                case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                    style.H = r(str2);
                    style.b |= 1073741824;
                    break;
                case IMAGES_IMAGE_LOADED_VALUE:
                    if (str2.equals("currentColor")) {
                        style.I = gVar;
                    } else {
                        try {
                            style.I = n(str2);
                        } catch (SVGParseException e3) {
                            e3.getMessage();
                            return;
                        }
                    }
                    style.b |= 2147483648L;
                    break;
                case 82:
                    style.J = v(str2);
                    style.b |= 4294967296L;
                    break;
                case 83:
                    if (str2.equals("currentColor")) {
                        style.K = gVar;
                    } else {
                        try {
                            style.K = n(str2);
                        } catch (SVGParseException e4) {
                            e4.getMessage();
                            return;
                        }
                    }
                    style.b |= 8589934592L;
                    break;
                case 84:
                    style.L = v(str2);
                    style.b |= 17179869184L;
                    break;
                case 85:
                    if (str2.equals("none")) {
                        vectorEffect = SVG.Style.VectorEffect.None;
                    } else if (str2.equals("non-scaling-stroke")) {
                        vectorEffect = SVG.Style.VectorEffect.NonScalingStroke;
                    }
                    style.M = vectorEffect;
                    if (vectorEffect != null) {
                        style.b |= 34359738368L;
                        break;
                    }
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 86 */:
                    switch (str2) {
                        case "optimizeQuality":
                            renderQuality = SVG.Style.RenderQuality.optimizeQuality;
                            break;
                        case "auto":
                            renderQuality = SVG.Style.RenderQuality.auto;
                            break;
                        case "optimizeSpeed":
                            renderQuality = SVG.Style.RenderQuality.optimizeSpeed;
                            break;
                    }
                    style.N = renderQuality;
                    if (renderQuality != null) {
                        style.b |= 137438953472L;
                        break;
                    }
                    break;
            }
        } catch (SVGParseException unused3) {
        }
    }

    public static int b(float f2) {
        if (f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return 0;
        }
        if (f2 > 255.0f) {
            return 255;
        }
        return Math.round(f2);
    }

    public static int d(float f2, float f3, float f4) {
        float f5 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f6 = f2 % 360.0f;
        if (f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f6 += 360.0f;
        }
        float f7 = f6 / 60.0f;
        float f8 = f3 / 100.0f;
        float f9 = f4 / 100.0f;
        if (f8 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f8 = 0.0f;
        } else if (f8 > 1.0f) {
            f8 = 1.0f;
        }
        if (f9 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f5 = f9 > 1.0f ? 1.0f : f9;
        }
        float f10 = f5 <= 0.5f ? (f8 + 1.0f) * f5 : (f5 + f8) - (f8 * f5);
        float f11 = (f5 * 2.0f) - f10;
        return b(e(f11, f10, f7 - 2.0f) * 256.0f) | (b(e(f11, f10, f7 + 2.0f) * 256.0f) << 16) | (b(e(f11, f10, f7) * 256.0f) << 8);
    }

    public static float e(float f2, float f3, float f4) {
        if (f4 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f4 += 6.0f;
        }
        if (f4 >= 6.0f) {
            f4 -= 6.0f;
        }
        return f4 < 1.0f ? u11.b(f3, f2, f4, f2) : f4 < 3.0f ? f3 : f4 < 4.0f ? u11.b(4.0f, f4, f3 - f2, f2) : f2;
    }

    public static void f(SVG.f0 f0Var, Attributes attributes) throws SVGParseException {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String trim = attributes.getValue(i2).trim();
            switch (a.b[yga0.a(attributes, i2)]) {
                case 21:
                    i iVar = new i(trim);
                    HashSet hashSet = new HashSet();
                    while (!iVar.f()) {
                        String l = iVar.l();
                        if (l.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                            hashSet.add(l.substring(35));
                        } else {
                            hashSet.add("UNSUPPORTED");
                        }
                        iVar.q();
                    }
                    f0Var.c(hashSet);
                    break;
                case 22:
                    f0Var.e(trim);
                    break;
                case 23:
                    i iVar2 = new i(trim);
                    HashSet hashSet2 = new HashSet();
                    while (!iVar2.f()) {
                        String l2 = iVar2.l();
                        int indexOf = l2.indexOf(45);
                        if (indexOf != -1) {
                            l2 = l2.substring(0, indexOf);
                        }
                        hashSet2.add(new Locale(l2, "", "").getLanguage());
                        iVar2.q();
                    }
                    f0Var.i(hashSet2);
                    break;
                case 24:
                    i iVar3 = new i(trim);
                    HashSet hashSet3 = new HashSet();
                    while (!iVar3.f()) {
                        hashSet3.add(iVar3.l());
                        iVar3.q();
                    }
                    f0Var.b(hashSet3);
                    break;
                case 25:
                    ArrayList q = q(trim);
                    f0Var.j(q != null ? new HashSet(q) : new HashSet(0));
                    break;
            }
        }
    }

    public static void g(SVG.k0 k0Var, Attributes attributes) throws SVGParseException {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String qName = attributes.getQName(i2);
            if (qName.equals("id") || qName.equals("xml:id")) {
                k0Var.c = attributes.getValue(i2).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String trim = attributes.getValue(i2).trim();
                if (BuildConfig.FLAVOR.equals(trim)) {
                    k0Var.d = Boolean.FALSE;
                    return;
                } else {
                    if (!"preserve".equals(trim)) {
                        throw new SVGParseException(go9.b("Invalid value for \"xml:space\" attribute: ", trim));
                    }
                    k0Var.d = Boolean.TRUE;
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void h(SVG.j jVar, Attributes attributes) throws SVGParseException {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String trim = attributes.getValue(i2).trim();
            int i3 = a.b[yga0.a(attributes, i2)];
            if (i3 != 6) {
                switch (i3) {
                    case 32:
                        if (!"objectBoundingBox".equals(trim)) {
                            if (!"userSpaceOnUse".equals(trim)) {
                                throw new SVGParseException("Invalid value for attribute gradientUnits");
                            }
                            jVar.i = Boolean.TRUE;
                            break;
                        } else {
                            jVar.i = Boolean.FALSE;
                            break;
                        }
                    case 33:
                        jVar.j = z(trim);
                        break;
                    case 34:
                        try {
                            jVar.k = SVG.k.valueOf(trim);
                            break;
                        } catch (IllegalArgumentException unused) {
                            throw new SVGParseException(zr.a("Invalid spreadMethod attribute. \"", trim, "\" is not a valid value."));
                        }
                }
            } else if ("".equals(attributes.getURI(i2)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i2))) {
                jVar.l = trim;
            }
        }
    }

    public static void i(SVG.z zVar, Attributes attributes, String str) throws SVGParseException {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            if (g.a(attributes.getLocalName(i2)) == g.points) {
                i iVar = new i(attributes.getValue(i2));
                ArrayList arrayList = new ArrayList();
                iVar.q();
                while (!iVar.f()) {
                    float i3 = iVar.i();
                    if (Float.isNaN(i3)) {
                        throw new SVGParseException(zr.a("Invalid <", str, "> points attribute. Non-coordinate content found in list."));
                    }
                    iVar.p();
                    float i4 = iVar.i();
                    if (Float.isNaN(i4)) {
                        throw new SVGParseException(zr.a("Invalid <", str, "> points attribute. There should be an even number of coordinates."));
                    }
                    iVar.p();
                    arrayList.add(Float.valueOf(i3));
                    arrayList.add(Float.valueOf(i4));
                }
                zVar.o = new float[arrayList.size()];
                Iterator it = arrayList.iterator();
                int i5 = 0;
                while (it.hasNext()) {
                    zVar.o[i5] = ((Float) it.next()).floatValue();
                    i5++;
                }
            }
        }
    }

    public static void j(SVG.k0 k0Var, Attributes attributes) throws SVGParseException {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String trim = attributes.getValue(i2).trim();
            if (trim.length() != 0) {
                int i3 = a.b[yga0.a(attributes, i2)];
                if (i3 == 45) {
                    i iVar = new i(trim.replaceAll("/\\*.*?\\*/", ""));
                    while (true) {
                        String m = iVar.m(':', false);
                        iVar.q();
                        if (!iVar.d(':')) {
                            break;
                        }
                        iVar.q();
                        String m2 = iVar.m(';', true);
                        if (m2 == null) {
                            break;
                        }
                        iVar.q();
                        if (iVar.f() || iVar.d(';')) {
                            if (k0Var.f == null) {
                                k0Var.f = new SVG.Style();
                            }
                            D(k0Var.f, m, m2);
                            iVar.q();
                        }
                    }
                } else if (i3 != 46) {
                    if (k0Var.e == null) {
                        k0Var.e = new SVG.Style();
                    }
                    D(k0Var.e, attributes.getLocalName(i2), attributes.getValue(i2).trim());
                } else {
                    a.d dVar = new a.d(trim);
                    ArrayList arrayList = null;
                    while (!dVar.f()) {
                        String l = dVar.l();
                        if (l != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(l);
                            dVar.q();
                        }
                    }
                    k0Var.g = arrayList;
                }
            }
        }
    }

    public static void k(SVG.z0 z0Var, Attributes attributes) throws SVGParseException {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String trim = attributes.getValue(i2).trim();
            int i3 = a.b[yga0.a(attributes, i2)];
            if (i3 == 1) {
                z0Var.n = t(trim);
            } else if (i3 == 2) {
                z0Var.o = t(trim);
            } else if (i3 == 19) {
                z0Var.p = t(trim);
            } else if (i3 == 20) {
                z0Var.q = t(trim);
            }
        }
    }

    public static void l(SVG.n nVar, Attributes attributes) throws SVGParseException {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            if (g.a(attributes.getLocalName(i2)) == g.transform) {
                nVar.k(z(attributes.getValue(i2)));
            }
        }
    }

    public static void m(SVG.q0 q0Var, Attributes attributes) throws SVGParseException {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String trim = attributes.getValue(i2).trim();
            int i3 = a.b[yga0.a(attributes, i2)];
            if (i3 == 7) {
                x(q0Var, trim);
            } else if (i3 != 87) {
                continue;
            } else {
                i iVar = new i(trim);
                iVar.q();
                float i4 = iVar.i();
                iVar.p();
                float i5 = iVar.i();
                iVar.p();
                float i6 = iVar.i();
                iVar.p();
                float i7 = iVar.i();
                if (Float.isNaN(i4) || Float.isNaN(i5) || Float.isNaN(i6) || Float.isNaN(i7)) {
                    throw new SVGParseException("Invalid viewBox definition - should have four numbers");
                }
                if (i6 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    throw new SVGParseException("Invalid viewBox. width cannot be negative");
                }
                if (i7 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    throw new SVGParseException("Invalid viewBox. height cannot be negative");
                }
                q0Var.o = new SVG.b(i4, i5, i6, i7);
            }
        }
    }

    public static SVG.f n(String str) throws SVGParseException {
        long j2;
        int i2;
        if (str.charAt(0) == '#') {
            int length = str.length();
            v9x v9xVar = null;
            if (1 < length) {
                long j3 = 0;
                int i3 = 1;
                while (i3 < length) {
                    char charAt = str.charAt(i3);
                    if (charAt < '0' || charAt > '9') {
                        if (charAt >= 'A' && charAt <= 'F') {
                            j2 = j3 * 16;
                            i2 = charAt - 'A';
                        } else {
                            if (charAt < 'a' || charAt > 'f') {
                                break;
                            }
                            j2 = j3 * 16;
                            i2 = charAt - 'a';
                        }
                        j3 = j2 + i2 + 10;
                    } else {
                        j3 = (j3 * 16) + (charAt - '0');
                    }
                    if (j3 > 4294967295L) {
                        break;
                    }
                    i3++;
                }
                if (i3 != 1) {
                    v9xVar = new v9x(j3, i3);
                }
            }
            if (v9xVar == null) {
                throw new SVGParseException("Bad hex colour value: ".concat(str));
            }
            long j4 = v9xVar.b;
            int i4 = v9xVar.a;
            if (i4 == 4) {
                int i5 = (int) j4;
                int i6 = i5 & 3840;
                int i7 = i5 & PsExtractor.VIDEO_STREAM_MASK;
                int i8 = i5 & 15;
                return new SVG.f(i8 | (i6 << 8) | (-16777216) | (i6 << 12) | (i7 << 8) | (i7 << 4) | (i8 << 4));
            }
            if (i4 != 5) {
                if (i4 == 7) {
                    return new SVG.f(((int) j4) | (-16777216));
                }
                if (i4 != 9) {
                    throw new SVGParseException("Bad hex colour value: ".concat(str));
                }
                int i9 = (int) j4;
                return new SVG.f((i9 >>> 8) | (i9 << 24));
            }
            int i10 = (int) j4;
            int i11 = 61440 & i10;
            int i12 = i10 & 3840;
            int i13 = i10 & PsExtractor.VIDEO_STREAM_MASK;
            int i14 = i10 & 15;
            return new SVG.f((i14 << 24) | (i14 << 28) | (i11 << 8) | (i11 << 4) | (i12 << 4) | i12 | i13 | (i13 >> 4));
        }
        String lowerCase = str.toLowerCase(Locale.US);
        boolean startsWith = lowerCase.startsWith("rgba(");
        if (startsWith || lowerCase.startsWith("rgb(")) {
            i iVar = new i(str.substring(startsWith ? 5 : 4));
            iVar.q();
            float i15 = iVar.i();
            if (!Float.isNaN(i15) && iVar.d('%')) {
                i15 = (i15 * 256.0f) / 100.0f;
            }
            float c = iVar.c(i15);
            if (!Float.isNaN(c) && iVar.d('%')) {
                c = (c * 256.0f) / 100.0f;
            }
            float c2 = iVar.c(c);
            if (!Float.isNaN(c2) && iVar.d('%')) {
                c2 = (c2 * 256.0f) / 100.0f;
            }
            if (!startsWith) {
                iVar.q();
                if (Float.isNaN(c2) || !iVar.d(')')) {
                    throw new SVGParseException("Bad rgb() colour value: ".concat(str));
                }
                return new SVG.f((b(i15) << 16) | (-16777216) | (b(c) << 8) | b(c2));
            }
            float c3 = iVar.c(c2);
            iVar.q();
            if (Float.isNaN(c3) || !iVar.d(')')) {
                throw new SVGParseException("Bad rgba() colour value: ".concat(str));
            }
            return new SVG.f((b(c3 * 256.0f) << 24) | (b(i15) << 16) | (b(c) << 8) | b(c2));
        }
        boolean startsWith2 = lowerCase.startsWith("hsla(");
        if (!startsWith2 && !lowerCase.startsWith("hsl(")) {
            Integer num = (Integer) C0105c.a.get(lowerCase);
            if (num != null) {
                return new SVG.f(num.intValue());
            }
            throw new SVGParseException("Invalid colour keyword: ".concat(lowerCase));
        }
        i iVar2 = new i(str.substring(startsWith2 ? 5 : 4));
        iVar2.q();
        float i16 = iVar2.i();
        float c4 = iVar2.c(i16);
        if (!Float.isNaN(c4)) {
            iVar2.d('%');
        }
        float c5 = iVar2.c(c4);
        if (!Float.isNaN(c5)) {
            iVar2.d('%');
        }
        if (!startsWith2) {
            iVar2.q();
            if (Float.isNaN(c5) || !iVar2.d(')')) {
                throw new SVGParseException("Bad hsl() colour value: ".concat(str));
            }
            return new SVG.f(d(i16, c4, c5) | (-16777216));
        }
        float c6 = iVar2.c(c5);
        iVar2.q();
        if (Float.isNaN(c6) || !iVar2.d(')')) {
            throw new SVGParseException("Bad hsla() colour value: ".concat(str));
        }
        return new SVG.f((b(c6 * 256.0f) << 24) | d(i16, c4, c5));
    }

    public static float o(int i2, String str) throws SVGParseException {
        float a2 = new gn70().a(0, i2, str);
        if (Float.isNaN(a2)) {
            throw new SVGParseException(go9.b("Invalid float value: ", str));
        }
        return a2;
    }

    public static float p(String str) throws SVGParseException {
        int length = str.length();
        if (length != 0) {
            return o(length, str);
        }
        throw new SVGParseException("Invalid float value (empty string)");
    }

    public static ArrayList q(String str) {
        i iVar = new i(str);
        ArrayList arrayList = null;
        do {
            String k = iVar.k();
            if (k == null) {
                k = iVar.m(',', true);
            }
            if (k == null) {
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(k);
            iVar.p();
        } while (!iVar.f());
        return arrayList;
    }

    public static String r(String str) {
        if (!str.equals("none") && str.startsWith("url(")) {
            return str.endsWith(")") ? str.substring(4, str.length() - 1).trim() : str.substring(4).trim();
        }
        return null;
    }

    public static SVG.p s(String str) throws SVGParseException {
        if (str.length() == 0) {
            throw new SVGParseException("Invalid length value (empty string)");
        }
        int length = str.length();
        SVG.c1 c1Var = SVG.c1.px;
        char charAt = str.charAt(length - 1);
        if (charAt == '%') {
            length--;
            c1Var = SVG.c1.percent;
        } else if (length > 2 && Character.isLetter(charAt) && Character.isLetter(str.charAt(length - 2))) {
            length -= 2;
            try {
                c1Var = SVG.c1.valueOf(str.substring(length).toLowerCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                throw new SVGParseException("Invalid length unit specifier: ".concat(str));
            }
        }
        try {
            return new SVG.p(o(length, str), c1Var);
        } catch (NumberFormatException e2) {
            throw new SVGParseException("Invalid length value: ".concat(str), e2);
        }
    }

    public static ArrayList t(String str) throws SVGParseException {
        String str2;
        if (str.length() == 0) {
            throw new SVGParseException("Invalid length list (empty string)");
        }
        ArrayList arrayList = new ArrayList(1);
        i iVar = new i(str);
        iVar.q();
        while (!iVar.f()) {
            float i2 = iVar.i();
            if (Float.isNaN(i2)) {
                StringBuilder sb = new StringBuilder("Invalid length list value: ");
                int i3 = iVar.b;
                while (true) {
                    boolean f2 = iVar.f();
                    str2 = iVar.a;
                    if (f2 || i.g(str2.charAt(iVar.b))) {
                        break;
                    }
                    iVar.b++;
                }
                String substring = str2.substring(i3, iVar.b);
                iVar.b = i3;
                sb.append(substring);
                throw new SVGParseException(sb.toString());
            }
            SVG.c1 n = iVar.n();
            if (n == null) {
                n = SVG.c1.px;
            }
            arrayList.add(new SVG.p(i2, n));
            iVar.p();
        }
        return arrayList;
    }

    public static SVG.p u(i iVar) {
        return iVar.e("auto") ? new SVG.p(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) : iVar.j();
    }

    public static Float v(String str) {
        try {
            float p = p(str);
            float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (p >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f2 = 1.0f;
                if (p > 1.0f) {
                }
                return Float.valueOf(p);
            }
            p = f2;
            return Float.valueOf(p);
        } catch (SVGParseException unused) {
            return null;
        }
    }

    public static SVG.n0 w(String str) {
        boolean startsWith = str.startsWith("url(");
        SVG.n0 n0Var = SVG.f.d;
        SVG.n0 n0Var2 = SVG.g.b;
        SVG.n0 n0Var3 = null;
        if (!startsWith) {
            if (str.equals("none")) {
                return n0Var;
            }
            if (str.equals("currentColor")) {
                return n0Var2;
            }
            try {
                return n(str);
            } catch (SVGParseException unused) {
                return null;
            }
        }
        int indexOf = str.indexOf(")");
        if (indexOf == -1) {
            return new SVG.u(str.substring(4).trim(), null);
        }
        String trim = str.substring(4, indexOf).trim();
        String trim2 = str.substring(indexOf + 1).trim();
        if (trim2.length() > 0) {
            if (!trim2.equals("none")) {
                if (trim2.equals("currentColor")) {
                    n0Var = n0Var2;
                } else {
                    try {
                        n0Var = n(trim2);
                    } catch (SVGParseException unused2) {
                        n0Var = null;
                    }
                }
            }
            n0Var3 = n0Var;
        }
        return new SVG.u(trim, n0Var3);
    }

    public static void x(SVG.o0 o0Var, String str) throws SVGParseException {
        PreserveAspectRatio.Scale scale;
        i iVar = new i(str);
        iVar.q();
        String l = iVar.l();
        if ("defer".equals(l)) {
            iVar.q();
            l = iVar.l();
        }
        PreserveAspectRatio.Alignment alignment = (PreserveAspectRatio.Alignment) b.a.get(l);
        iVar.q();
        if (iVar.f()) {
            scale = null;
        } else {
            String l2 = iVar.l();
            l2.getClass();
            if (l2.equals("meet")) {
                scale = PreserveAspectRatio.Scale.meet;
            } else {
                if (!l2.equals("slice")) {
                    throw new SVGParseException("Invalid preserveAspectRatio definition: ".concat(str));
                }
                scale = PreserveAspectRatio.Scale.slice;
            }
        }
        o0Var.n = new PreserveAspectRatio(alignment, scale);
    }

    public static HashMap y(i iVar) {
        HashMap hashMap = new HashMap();
        iVar.q();
        String m = iVar.m(B5.U, false);
        while (m != null) {
            iVar.d(B5.U);
            hashMap.put(m, iVar.k());
            iVar.q();
            m = iVar.m(B5.U, false);
        }
        return hashMap;
    }

    public static Matrix z(String str) throws SVGParseException {
        Matrix matrix = new Matrix();
        i iVar = new i(str);
        iVar.q();
        while (!iVar.f()) {
            String str2 = null;
            if (!iVar.f()) {
                int i2 = iVar.b;
                String str3 = iVar.a;
                int charAt = str3.charAt(i2);
                while (true) {
                    if ((charAt >= 97 && charAt <= 122) || (charAt >= 65 && charAt <= 90)) {
                        charAt = iVar.a();
                    }
                }
                int i3 = iVar.b;
                while (i.g(charAt)) {
                    charAt = iVar.a();
                }
                if (charAt == 40) {
                    iVar.b++;
                    str2 = str3.substring(i2, i3);
                } else {
                    iVar.b = i2;
                }
            }
            if (str2 == null) {
                throw new SVGParseException("Bad transform function encountered in transform list: ".concat(str));
            }
            switch (str2) {
                case "matrix":
                    iVar.q();
                    float i4 = iVar.i();
                    iVar.p();
                    float i5 = iVar.i();
                    iVar.p();
                    float i6 = iVar.i();
                    iVar.p();
                    float i7 = iVar.i();
                    iVar.p();
                    float i8 = iVar.i();
                    iVar.p();
                    float i9 = iVar.i();
                    iVar.q();
                    if (!Float.isNaN(i9) && iVar.d(')')) {
                        Matrix matrix2 = new Matrix();
                        matrix2.setValues(new float[]{i4, i6, i8, i5, i7, i9, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f});
                        matrix.preConcat(matrix2);
                        break;
                    } else {
                        throw new SVGParseException("Invalid transform list: ".concat(str));
                    }
                case "rotate":
                    iVar.q();
                    float i10 = iVar.i();
                    float o = iVar.o();
                    float o2 = iVar.o();
                    iVar.q();
                    if (Float.isNaN(i10) || !iVar.d(')')) {
                        throw new SVGParseException("Invalid transform list: ".concat(str));
                    }
                    if (Float.isNaN(o)) {
                        matrix.preRotate(i10);
                        break;
                    } else if (!Float.isNaN(o2)) {
                        matrix.preRotate(i10, o, o2);
                        break;
                    } else {
                        throw new SVGParseException("Invalid transform list: ".concat(str));
                    }
                case "scale":
                    iVar.q();
                    float i11 = iVar.i();
                    float o3 = iVar.o();
                    iVar.q();
                    if (!Float.isNaN(i11) && iVar.d(')')) {
                        if (!Float.isNaN(o3)) {
                            matrix.preScale(i11, o3);
                            break;
                        } else {
                            matrix.preScale(i11, i11);
                            break;
                        }
                    } else {
                        throw new SVGParseException("Invalid transform list: ".concat(str));
                    }
                    break;
                case "skewX":
                    iVar.q();
                    float i12 = iVar.i();
                    iVar.q();
                    if (!Float.isNaN(i12) && iVar.d(')')) {
                        matrix.preSkew((float) Math.tan(Math.toRadians(i12)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        break;
                    } else {
                        throw new SVGParseException("Invalid transform list: ".concat(str));
                    }
                    break;
                case "skewY":
                    iVar.q();
                    float i13 = iVar.i();
                    iVar.q();
                    if (!Float.isNaN(i13) && iVar.d(')')) {
                        matrix.preSkew(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (float) Math.tan(Math.toRadians(i13)));
                        break;
                    } else {
                        throw new SVGParseException("Invalid transform list: ".concat(str));
                    }
                    break;
                case "translate":
                    iVar.q();
                    float i14 = iVar.i();
                    float o4 = iVar.o();
                    iVar.q();
                    if (!Float.isNaN(i14) && iVar.d(')')) {
                        if (!Float.isNaN(o4)) {
                            matrix.preTranslate(i14, o4);
                            break;
                        } else {
                            matrix.preTranslate(i14, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            break;
                        }
                    } else {
                        throw new SVGParseException("Invalid transform list: ".concat(str));
                    }
                    break;
                default:
                    throw new SVGParseException(zr.a("Invalid transform list fn: ", str2, ")"));
            }
            if (iVar.f()) {
                return matrix;
            }
            iVar.p();
        }
        return matrix;
    }

    public final void A(InputStream inputStream) throws SVGParseException {
        try {
            SAXParserFactory newInstance = SAXParserFactory.newInstance();
            newInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            newInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = newInstance.newSAXParser().getXMLReader();
            f fVar = new f();
            xMLReader.setContentHandler(fVar);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", fVar);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e2) {
            throw new SVGParseException("Stream error", e2);
        } catch (ParserConfigurationException e3) {
            throw new SVGParseException("XML parser problem", e3);
        } catch (SAXException e4) {
            throw new SVGParseException("SVG parse error", e4);
        }
    }

    public final void B(InputStream inputStream) throws SVGParseException {
        try {
            try {
                XmlPullParser newPullParser = Xml.newPullParser();
                j jVar = new j();
                jVar.a = newPullParser;
                newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                newPullParser.setInput(inputStream, null);
                for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.nextToken()) {
                    if (eventType == 0) {
                        E();
                    } else if (eventType == 8) {
                        newPullParser.getText();
                        i iVar = new i(newPullParser.getText());
                        String l = iVar.l();
                        y(iVar);
                        l.equals("xml-stylesheet");
                    } else if (eventType != 10) {
                        if (eventType == 2) {
                            String name = newPullParser.getName();
                            if (newPullParser.getPrefix() != null) {
                                name = newPullParser.getPrefix() + ':' + name;
                            }
                            F(newPullParser.getNamespace(), newPullParser.getName(), name, jVar);
                        } else if (eventType == 3) {
                            String name2 = newPullParser.getName();
                            if (newPullParser.getPrefix() != null) {
                                name2 = newPullParser.getPrefix() + ':' + name2;
                            }
                            c(newPullParser.getNamespace(), newPullParser.getName(), name2);
                        } else if (eventType == 4) {
                            int[] iArr = new int[2];
                            H(newPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                        } else if (eventType == 5) {
                            G(newPullParser.getText());
                        }
                    } else if (this.a.a == null && newPullParser.getText().contains("<!ENTITY ")) {
                        try {
                            inputStream.reset();
                            A(inputStream);
                            return;
                        } catch (IOException unused) {
                            return;
                        }
                    }
                }
            } catch (IOException e2) {
                throw new SVGParseException("Stream error", e2);
            }
        } catch (XmlPullParserException e3) {
            throw new SVGParseException("XML parser problem", e3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0358 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C(Attributes attributes) throws SVGParseException {
        int i2;
        int intValue;
        char c;
        float i3;
        float f2;
        float f3;
        float f4;
        float f5;
        char charAt;
        Attributes attributes2 = attributes;
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.v vVar = new SVG.v();
        vVar.a = this.a;
        vVar.b = this.b;
        g(vVar, attributes2);
        j(vVar, attributes2);
        l(vVar, attributes2);
        f(vVar, attributes2);
        int i4 = 0;
        int i5 = 0;
        while (i5 < attributes2.getLength()) {
            String trim = attributes2.getValue(i5).trim();
            int i6 = a.b[yga0.a(attributes2, i5)];
            float f6 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (i6 == 8) {
                i iVar = new i(trim);
                SVG.w wVar = new SVG.w();
                wVar.b = i4;
                wVar.d = i4;
                wVar.a = new byte[8];
                wVar.c = new float[16];
                if (!iVar.f() && ((intValue = iVar.h().intValue()) == 77 || intValue == 109)) {
                    float f7 = 0.0f;
                    float f8 = 0.0f;
                    float f9 = 0.0f;
                    float f10 = 0.0f;
                    float f11 = 0.0f;
                    float f12 = 0.0f;
                    while (true) {
                        iVar.q();
                        float f13 = f6;
                        switch (intValue) {
                            case 65:
                            case 97:
                                c = 'm';
                                float i7 = iVar.i();
                                float c2 = iVar.c(i7);
                                float f14 = f9;
                                float c3 = iVar.c(c2);
                                Boolean b2 = iVar.b(Float.valueOf(c3));
                                Boolean b3 = iVar.b(b2);
                                if (b3 == null) {
                                    i3 = Float.NaN;
                                } else {
                                    iVar.p();
                                    i3 = iVar.i();
                                }
                                i2 = i5;
                                float f15 = i3;
                                float c4 = iVar.c(f15);
                                if (!Float.isNaN(c4) && i7 >= f13 && c2 >= f13) {
                                    if (intValue == 97) {
                                        f2 = f15 + f7;
                                        c4 += f14;
                                    } else {
                                        f2 = f15;
                                    }
                                    boolean booleanValue = b2.booleanValue();
                                    boolean booleanValue2 = b3.booleanValue();
                                    float f16 = f2;
                                    wVar.d(i7, c2, c3, booleanValue, booleanValue2, f16, c4);
                                    f7 = f16;
                                    f8 = f7;
                                    f9 = c4;
                                    f10 = f9;
                                    iVar.p();
                                    if (!iVar.f()) {
                                        break;
                                    } else {
                                        int i8 = iVar.b;
                                        if (i8 != iVar.c && (((charAt = iVar.a.charAt(i8)) >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z'))) {
                                            intValue = iVar.h().intValue();
                                        }
                                        f6 = f13;
                                        i5 = i2;
                                    }
                                }
                                break;
                            case 67:
                            case SQLiteStatementType.STATEMENT_OTHER /* 99 */:
                                float i9 = iVar.i();
                                float c5 = iVar.c(i9);
                                float c6 = iVar.c(c5);
                                float c7 = iVar.c(c6);
                                float c8 = iVar.c(c7);
                                float c9 = iVar.c(c8);
                                if (Float.isNaN(c9)) {
                                    Log.e("SVGParser", "Bad path coords for " + ((char) intValue) + " path segment");
                                    break;
                                } else {
                                    if (intValue == 99) {
                                        c8 += f7;
                                        c9 += f9;
                                        i9 += f7;
                                        c5 += f9;
                                        c6 += f7;
                                        c7 += f9;
                                    }
                                    float f17 = i9;
                                    f3 = c6;
                                    f4 = c9;
                                    c = 'm';
                                    f10 = c7;
                                    float f18 = c5;
                                    f5 = c8;
                                    wVar.b(f17, f18, f3, f10, f5, f4);
                                    f8 = f3;
                                    f7 = f5;
                                    f9 = f4;
                                    i2 = i5;
                                    iVar.p();
                                    if (!iVar.f()) {
                                    }
                                }
                                break;
                            case 72:
                            case 104:
                                float i10 = iVar.i();
                                if (Float.isNaN(i10)) {
                                    Log.e("SVGParser", "Bad path coords for " + ((char) intValue) + " path segment");
                                    break;
                                } else {
                                    if (intValue == 104) {
                                        i10 += f7;
                                    }
                                    f7 = i10;
                                    wVar.c(f7, f9);
                                    i2 = i5;
                                    c = 'm';
                                    f8 = f7;
                                    iVar.p();
                                    if (!iVar.f()) {
                                    }
                                }
                                break;
                            case TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER /* 76 */:
                            case 108:
                                float i11 = iVar.i();
                                float c10 = iVar.c(i11);
                                if (Float.isNaN(c10)) {
                                    Log.e("SVGParser", "Bad path coords for " + ((char) intValue) + " path segment");
                                    break;
                                } else {
                                    if (intValue == 108) {
                                        i11 += f7;
                                        c10 += f9;
                                    }
                                    f7 = i11;
                                    f9 = c10;
                                    wVar.c(f7, f9);
                                    i2 = i5;
                                    c = 'm';
                                    f10 = f9;
                                    f8 = f7;
                                    iVar.p();
                                    if (!iVar.f()) {
                                    }
                                }
                                break;
                            case TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER /* 77 */:
                            case 109:
                                float i12 = iVar.i();
                                float c11 = iVar.c(i12);
                                if (Float.isNaN(c11)) {
                                    Log.e("SVGParser", "Bad path coords for " + ((char) intValue) + " path segment");
                                    break;
                                } else {
                                    if (intValue == 109 && wVar.b != 0) {
                                        i12 += f7;
                                        c11 += f9;
                                    }
                                    f7 = i12;
                                    f9 = c11;
                                    wVar.a(f7, f9);
                                    i2 = i5;
                                    f11 = f7;
                                    c = 'm';
                                    f10 = f9;
                                    f12 = f10;
                                    intValue = intValue != 109 ? 76 : 108;
                                    f8 = f11;
                                    iVar.p();
                                    if (!iVar.f()) {
                                    }
                                }
                                break;
                            case IMAGES_IMAGE_LOADED_VALUE:
                            case 113:
                                float i13 = iVar.i();
                                float c12 = iVar.c(i13);
                                float c13 = iVar.c(c12);
                                float c14 = iVar.c(c13);
                                if (Float.isNaN(c14)) {
                                    Log.e("SVGParser", "Bad path coords for " + ((char) intValue) + " path segment");
                                    break;
                                } else {
                                    if (intValue == 113) {
                                        c13 += f7;
                                        c14 += f9;
                                        i13 += f7;
                                        c12 += f9;
                                    }
                                    f7 = c13;
                                    f9 = c14;
                                    wVar.e(i13, c12, f7, f9);
                                    i2 = i5;
                                    c = 'm';
                                    f8 = i13;
                                    f10 = c12;
                                    iVar.p();
                                    if (!iVar.f()) {
                                    }
                                }
                                break;
                            case 83:
                            case INVALID_INDEX_URL_VALUE:
                                float f19 = (f7 * 2.0f) - f8;
                                float f20 = (2.0f * f9) - f10;
                                float i14 = iVar.i();
                                float c15 = iVar.c(i14);
                                float c16 = iVar.c(c15);
                                float c17 = iVar.c(c16);
                                if (Float.isNaN(c17)) {
                                    Log.e("SVGParser", "Bad path coords for " + ((char) intValue) + " path segment");
                                    break;
                                } else {
                                    if (intValue == 115) {
                                        c16 += f7;
                                        c17 += f9;
                                        i14 += f7;
                                        c15 += f9;
                                    }
                                    f3 = i14;
                                    f10 = c15;
                                    f4 = c17;
                                    c = 'm';
                                    f5 = c16;
                                    wVar.b(f19, f20, f3, f10, f5, f4);
                                    f8 = f3;
                                    f7 = f5;
                                    f9 = f4;
                                    i2 = i5;
                                    iVar.p();
                                    if (!iVar.f()) {
                                    }
                                }
                                break;
                            case 84:
                            case 116:
                                f8 = (f7 * 2.0f) - f8;
                                f10 = (2.0f * f9) - f10;
                                float i15 = iVar.i();
                                float c18 = iVar.c(i15);
                                if (Float.isNaN(c18)) {
                                    Log.e("SVGParser", "Bad path coords for " + ((char) intValue) + " path segment");
                                    break;
                                } else {
                                    if (intValue == 116) {
                                        i15 += f7;
                                        c18 += f9;
                                    }
                                    f7 = i15;
                                    f9 = c18;
                                    wVar.e(f8, f10, f7, f9);
                                    i2 = i5;
                                    c = 'm';
                                    iVar.p();
                                    if (!iVar.f()) {
                                    }
                                }
                                break;
                            case ModuleDescriptor.MODULE_VERSION /* 86 */:
                            case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                                float i16 = iVar.i();
                                if (Float.isNaN(i16)) {
                                    Log.e("SVGParser", "Bad path coords for " + ((char) intValue) + " path segment");
                                    break;
                                } else {
                                    if (intValue == 118) {
                                        i16 += f9;
                                    }
                                    f9 = i16;
                                    wVar.c(f7, f9);
                                    i2 = i5;
                                    f10 = f9;
                                    c = 'm';
                                    iVar.p();
                                    if (!iVar.f()) {
                                    }
                                }
                                break;
                            case 90:
                            case INVALID_ADS_ENDPOINT_VALUE:
                                wVar.close();
                                i2 = i5;
                                f7 = f11;
                                f8 = f7;
                                f9 = f12;
                                f10 = f9;
                                c = 'm';
                                iVar.p();
                                if (!iVar.f()) {
                                }
                                break;
                        }
                    }
                }
                i2 = i5;
                vVar.o = wVar;
            } else {
                if (i6 == 9 && p(trim) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    throw new SVGParseException("Invalid <path> element. pathLength cannot be negative");
                }
                i2 = i5;
            }
            i5 = i2 + 1;
            attributes2 = attributes;
            i4 = 0;
        }
        this.b.o(vVar);
    }

    public final void E() {
        SVG svg = new SVG();
        svg.a = null;
        svg.b = new a.q();
        svg.c = new HashMap();
        this.a = svg;
    }

    /* JADX WARN: Code restructure failed: missing block: B:204:0x033e, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x053d, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F(String str, String str2, String str3, Attributes attributes) throws SVGParseException {
        boolean z;
        if (this.c) {
            this.d++;
            return;
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            h a2 = h.a(str2.length() > 0 ? str2 : str3);
            switch (a.a[a2.ordinal()]) {
                case 1:
                    SVG.e0 e0Var = new SVG.e0();
                    e0Var.a = this.a;
                    e0Var.b = this.b;
                    g(e0Var, attributes);
                    j(e0Var, attributes);
                    f(e0Var, attributes);
                    m(e0Var, attributes);
                    for (int i2 = 0; i2 < attributes.getLength(); i2++) {
                        String trim = attributes.getValue(i2).trim();
                        int i3 = a.b[yga0.a(attributes, i2)];
                        if (i3 == 1) {
                            e0Var.p = s(trim);
                        } else if (i3 == 2) {
                            e0Var.q = s(trim);
                        } else if (i3 == 3) {
                            SVG.p s = s(trim);
                            e0Var.r = s;
                            if (s.i()) {
                                throw new SVGParseException("Invalid <svg> element. width cannot be negative");
                            }
                        } else if (i3 != 4) {
                            continue;
                        } else {
                            SVG.p s2 = s(trim);
                            e0Var.s = s2;
                            if (s2.i()) {
                                throw new SVGParseException("Invalid <svg> element. height cannot be negative");
                            }
                        }
                    }
                    SVG.i0 i0Var = this.b;
                    if (i0Var == null) {
                        this.a.a = e0Var;
                    } else {
                        i0Var.o(e0Var);
                    }
                    this.b = e0Var;
                    return;
                case 2:
                case 3:
                    if (this.b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    SVG.m mVar = new SVG.m();
                    mVar.a = this.a;
                    mVar.b = this.b;
                    g(mVar, attributes);
                    j(mVar, attributes);
                    l(mVar, attributes);
                    f(mVar, attributes);
                    this.b.o(mVar);
                    this.b = mVar;
                    return;
                case 4:
                    if (this.b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    SVG.h hVar = new SVG.h();
                    hVar.a = this.a;
                    hVar.b = this.b;
                    g(hVar, attributes);
                    j(hVar, attributes);
                    l(hVar, attributes);
                    this.b.o(hVar);
                    this.b = hVar;
                    return;
                case 5:
                    if (this.b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    SVG.d1 d1Var = new SVG.d1();
                    d1Var.a = this.a;
                    d1Var.b = this.b;
                    g(d1Var, attributes);
                    j(d1Var, attributes);
                    l(d1Var, attributes);
                    f(d1Var, attributes);
                    for (int i4 = 0; i4 < attributes.getLength(); i4++) {
                        String trim2 = attributes.getValue(i4).trim();
                        int i5 = a.b[yga0.a(attributes, i4)];
                        if (i5 == 1) {
                            d1Var.p = s(trim2);
                        } else if (i5 == 2) {
                            d1Var.q = s(trim2);
                        } else if (i5 == 3) {
                            SVG.p s3 = s(trim2);
                            d1Var.r = s3;
                            if (s3.i()) {
                                throw new SVGParseException("Invalid <use> element. width cannot be negative");
                            }
                        } else if (i5 == 4) {
                            SVG.p s4 = s(trim2);
                            d1Var.s = s4;
                            if (s4.i()) {
                                throw new SVGParseException("Invalid <use> element. height cannot be negative");
                            }
                        } else if (i5 == 6 && ("".equals(attributes.getURI(i4)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i4)))) {
                            d1Var.o = trim2;
                        }
                    }
                    this.b.o(d1Var);
                    this.b = d1Var;
                    return;
                case 6:
                    C(attributes);
                    return;
                case 7:
                    if (this.b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    SVG.b0 b0Var = new SVG.b0();
                    b0Var.a = this.a;
                    b0Var.b = this.b;
                    g(b0Var, attributes);
                    j(b0Var, attributes);
                    l(b0Var, attributes);
                    f(b0Var, attributes);
                    for (int i6 = 0; i6 < attributes.getLength(); i6++) {
                        String trim3 = attributes.getValue(i6).trim();
                        int i7 = a.b[yga0.a(attributes, i6)];
                        if (i7 == 1) {
                            b0Var.o = s(trim3);
                        } else if (i7 == 2) {
                            b0Var.p = s(trim3);
                        } else if (i7 == 3) {
                            SVG.p s5 = s(trim3);
                            b0Var.q = s5;
                            if (s5.i()) {
                                throw new SVGParseException("Invalid <rect> element. width cannot be negative");
                            }
                        } else if (i7 == 4) {
                            SVG.p s6 = s(trim3);
                            b0Var.r = s6;
                            if (s6.i()) {
                                throw new SVGParseException("Invalid <rect> element. height cannot be negative");
                            }
                        } else if (i7 == 10) {
                            SVG.p s7 = s(trim3);
                            b0Var.s = s7;
                            if (s7.i()) {
                                throw new SVGParseException("Invalid <rect> element. rx cannot be negative");
                            }
                        } else if (i7 != 11) {
                            continue;
                        } else {
                            SVG.p s8 = s(trim3);
                            b0Var.t = s8;
                            if (s8.i()) {
                                throw new SVGParseException("Invalid <rect> element. ry cannot be negative");
                            }
                        }
                    }
                    this.b.o(b0Var);
                    return;
                case 8:
                    if (this.b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    SVG.d dVar = new SVG.d();
                    dVar.a = this.a;
                    dVar.b = this.b;
                    g(dVar, attributes);
                    j(dVar, attributes);
                    l(dVar, attributes);
                    f(dVar, attributes);
                    for (int i8 = 0; i8 < attributes.getLength(); i8++) {
                        String trim4 = attributes.getValue(i8).trim();
                        switch (a.b[yga0.a(attributes, i8)]) {
                            case 12:
                                dVar.o = s(trim4);
                                break;
                            case 13:
                                dVar.p = s(trim4);
                                break;
                            case 14:
                                SVG.p s9 = s(trim4);
                                dVar.q = s9;
                                if (s9.i()) {
                                    throw new SVGParseException("Invalid <circle> element. r cannot be negative");
                                }
                                break;
                        }
                    }
                    this.b.o(dVar);
                    return;
                case 9:
                    if (this.b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    SVG.i iVar = new SVG.i();
                    iVar.a = this.a;
                    iVar.b = this.b;
                    g(iVar, attributes);
                    j(iVar, attributes);
                    l(iVar, attributes);
                    f(iVar, attributes);
                    for (int i9 = 0; i9 < attributes.getLength(); i9++) {
                        String trim5 = attributes.getValue(i9).trim();
                        switch (a.b[yga0.a(attributes, i9)]) {
                            case 10:
                                SVG.p s10 = s(trim5);
                                iVar.q = s10;
                                if (s10.i()) {
                                    throw new SVGParseException("Invalid <ellipse> element. rx cannot be negative");
                                }
                                break;
                            case 11:
                                SVG.p s11 = s(trim5);
                                iVar.r = s11;
                                if (s11.i()) {
                                    throw new SVGParseException("Invalid <ellipse> element. ry cannot be negative");
                                }
                                break;
                            case 12:
                                iVar.o = s(trim5);
                                break;
                            case 13:
                                iVar.p = s(trim5);
                                break;
                        }
                    }
                    this.b.o(iVar);
                    return;
                case 10:
                    if (this.b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    SVG.q qVar = new SVG.q();
                    qVar.a = this.a;
                    qVar.b = this.b;
                    g(qVar, attributes);
                    j(qVar, attributes);
                    l(qVar, attributes);
                    f(qVar, attributes);
                    for (int i10 = 0; i10 < attributes.getLength(); i10++) {
                        String trim6 = attributes.getValue(i10).trim();
                        switch (a.b[yga0.a(attributes, i10)]) {
                            case 15:
                                qVar.o = s(trim6);
                                break;
                            case 16:
                                qVar.p = s(trim6);
                                break;
                            case 17:
                                qVar.q = s(trim6);
                                break;
                            case 18:
                                qVar.r = s(trim6);
                                break;
                        }
                    }
                    this.b.o(qVar);
                    return;
                case 11:
                    if (this.b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    SVG.z zVar = new SVG.z();
                    zVar.a = this.a;
                    zVar.b = this.b;
                    g(zVar, attributes);
                    j(zVar, attributes);
                    l(zVar, attributes);
                    f(zVar, attributes);
                    i(zVar, attributes, "polyline");
                    this.b.o(zVar);
                    return;
                case 12:
                    if (this.b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    SVG.a0 a0Var = new SVG.a0();
                    a0Var.a = this.a;
                    a0Var.b = this.b;
                    g(a0Var, attributes);
                    j(a0Var, attributes);
                    l(a0Var, attributes);
                    f(a0Var, attributes);
                    i(a0Var, attributes, "polygon");
                    this.b.o(a0Var);
                    return;
                case 13:
                    if (this.b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    SVG.v0 v0Var = new SVG.v0();
                    v0Var.a = this.a;
                    v0Var.b = this.b;
                    g(v0Var, attributes);
                    j(v0Var, attributes);
                    l(v0Var, attributes);
                    f(v0Var, attributes);
                    k(v0Var, attributes);
                    this.b.o(v0Var);
                    this.b = v0Var;
                    return;
                case 14:
                    SVG.i0 i0Var2 = this.b;
                    if (i0Var2 == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    if (!(i0Var2 instanceof SVG.x0)) {
                        throw new SVGParseException("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
                    }
                    SVG.u0 u0Var = new SVG.u0();
                    u0Var.a = this.a;
                    u0Var.b = this.b;
                    g(u0Var, attributes);
                    j(u0Var, attributes);
                    f(u0Var, attributes);
                    k(u0Var, attributes);
                    this.b.o(u0Var);
                    this.b = u0Var;
                    SVG.i0 i0Var3 = u0Var.b;
                    if (i0Var3 instanceof SVG.a1) {
                        u0Var.r = (SVG.a1) i0Var3;
                        return;
                    } else {
                        u0Var.r = ((SVG.w0) i0Var3).a();
                        return;
                    }
                case 15:
                    SVG.i0 i0Var4 = this.b;
                    if (i0Var4 == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    if (!(i0Var4 instanceof SVG.x0)) {
                        throw new SVGParseException("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
                    }
                    SVG.t0 t0Var = new SVG.t0();
                    t0Var.a = this.a;
                    t0Var.b = this.b;
                    g(t0Var, attributes);
                    j(t0Var, attributes);
                    f(t0Var, attributes);
                    for (int i11 = 0; i11 < attributes.getLength(); i11++) {
                        String trim7 = attributes.getValue(i11).trim();
                        if (a.b[yga0.a(attributes, i11)] == 6 && ("".equals(attributes.getURI(i11)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i11)))) {
                            t0Var.n = trim7;
                        }
                    }
                    this.b.o(t0Var);
                    SVG.i0 i0Var5 = t0Var.b;
                    if (i0Var5 instanceof SVG.a1) {
                        t0Var.o = (SVG.a1) i0Var5;
                        return;
                    } else {
                        t0Var.o = ((SVG.w0) i0Var5).a();
                        return;
                    }
                case 16:
                    if (this.b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    SVG.r0 r0Var = new SVG.r0();
                    r0Var.a = this.a;
                    r0Var.b = this.b;
                    g(r0Var, attributes);
                    j(r0Var, attributes);
                    l(r0Var, attributes);
                    f(r0Var, attributes);
                    this.b.o(r0Var);
                    this.b = r0Var;
                    return;
                case 17:
                    if (this.b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    SVG.s0 s0Var = new SVG.s0();
                    s0Var.a = this.a;
                    s0Var.b = this.b;
                    g(s0Var, attributes);
                    j(s0Var, attributes);
                    f(s0Var, attributes);
                    m(s0Var, attributes);
                    this.b.o(s0Var);
                    this.b = s0Var;
                    return;
                case 18:
                    if (this.b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    SVG.r rVar = new SVG.r();
                    rVar.a = this.a;
                    rVar.b = this.b;
                    g(rVar, attributes);
                    j(rVar, attributes);
                    f(rVar, attributes);
                    m(rVar, attributes);
                    for (int i12 = 0; i12 < attributes.getLength(); i12++) {
                        String trim8 = attributes.getValue(i12).trim();
                        switch (a.b[yga0.a(attributes, i12)]) {
                            case 26:
                                rVar.q = s(trim8);
                                continue;
                            case 27:
                                rVar.r = s(trim8);
                                continue;
                            case 28:
                                SVG.p s12 = s(trim8);
                                rVar.s = s12;
                                if (s12.i()) {
                                    throw new SVGParseException("Invalid <marker> element. markerWidth cannot be negative");
                                }
                                continue;
                            case 29:
                                SVG.p s13 = s(trim8);
                                rVar.t = s13;
                                if (s13.i()) {
                                    throw new SVGParseException("Invalid <marker> element. markerHeight cannot be negative");
                                }
                                continue;
                            case 30:
                                if ("strokeWidth".equals(trim8)) {
                                    rVar.p = false;
                                    continue;
                                } else {
                                    if (!"userSpaceOnUse".equals(trim8)) {
                                        throw new SVGParseException("Invalid value for attribute markerUnits");
                                    }
                                    rVar.p = true;
                                }
                            case 31:
                                if ("auto".equals(trim8)) {
                                    rVar.u = Float.valueOf(Float.NaN);
                                    break;
                                } else {
                                    rVar.u = Float.valueOf(p(trim8));
                                    break;
                                }
                        }
                    }
                    this.b.o(rVar);
                    this.b = rVar;
                    return;
                case 19:
                    if (this.b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    SVG.l0 l0Var = new SVG.l0();
                    l0Var.a = this.a;
                    l0Var.b = this.b;
                    g(l0Var, attributes);
                    j(l0Var, attributes);
                    h(l0Var, attributes);
                    for (int i13 = 0; i13 < attributes.getLength(); i13++) {
                        String trim9 = attributes.getValue(i13).trim();
                        switch (a.b[yga0.a(attributes, i13)]) {
                            case 15:
                                l0Var.m = s(trim9);
                                break;
                            case 16:
                                l0Var.n = s(trim9);
                                break;
                            case 17:
                                l0Var.o = s(trim9);
                                break;
                            case 18:
                                l0Var.p = s(trim9);
                                break;
                        }
                    }
                    this.b.o(l0Var);
                    this.b = l0Var;
                    return;
                case 20:
                    if (this.b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    SVG.p0 p0Var = new SVG.p0();
                    p0Var.a = this.a;
                    p0Var.b = this.b;
                    g(p0Var, attributes);
                    j(p0Var, attributes);
                    h(p0Var, attributes);
                    for (int i14 = 0; i14 < attributes.getLength(); i14++) {
                        String trim10 = attributes.getValue(i14).trim();
                        int i15 = a.b[yga0.a(attributes, i14)];
                        if (i15 == 35) {
                            p0Var.p = s(trim10);
                        } else if (i15 != 36) {
                            switch (i15) {
                                case 12:
                                    p0Var.m = s(trim10);
                                    break;
                                case 13:
                                    p0Var.n = s(trim10);
                                    break;
                                case 14:
                                    SVG.p s14 = s(trim10);
                                    p0Var.o = s14;
                                    if (s14.i()) {
                                        throw new SVGParseException("Invalid <radialGradient> element. r cannot be negative");
                                    }
                                    break;
                            }
                        } else {
                            p0Var.q = s(trim10);
                        }
                    }
                    this.b.o(p0Var);
                    this.b = p0Var;
                    return;
                case 21:
                    SVG.i0 i0Var6 = this.b;
                    if (i0Var6 == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    if (!(i0Var6 instanceof SVG.j)) {
                        throw new SVGParseException("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.");
                    }
                    SVG.d0 d0Var = new SVG.d0();
                    d0Var.a = this.a;
                    d0Var.b = this.b;
                    g(d0Var, attributes);
                    j(d0Var, attributes);
                    for (int i16 = 0; i16 < attributes.getLength(); i16++) {
                        String trim11 = attributes.getValue(i16).trim();
                        if (a.b[yga0.a(attributes, i16)] == 37) {
                            if (trim11.length() == 0) {
                                throw new SVGParseException("Invalid offset value in <stop> (empty string)");
                            }
                            int length = trim11.length();
                            if (trim11.charAt(trim11.length() - 1) == '%') {
                                length--;
                                z = true;
                            } else {
                                z = false;
                            }
                            try {
                                float o = o(length, trim11);
                                float f2 = 100.0f;
                                if (z) {
                                    o /= 100.0f;
                                }
                                if (o < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                    f2 = 0.0f;
                                } else if (o <= 100.0f) {
                                    f2 = o;
                                }
                                d0Var.h = Float.valueOf(f2);
                            } catch (NumberFormatException e2) {
                                throw new SVGParseException("Invalid offset value in <stop>: ".concat(trim11), e2);
                            }
                        }
                    }
                    this.b.o(d0Var);
                    this.b = d0Var;
                    return;
                case 22:
                case 23:
                    this.e = true;
                    this.f = a2;
                    return;
                case 24:
                    if (this.b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    SVG.e eVar = new SVG.e();
                    eVar.a = this.a;
                    eVar.b = this.b;
                    g(eVar, attributes);
                    j(eVar, attributes);
                    l(eVar, attributes);
                    f(eVar, attributes);
                    for (int i17 = 0; i17 < attributes.getLength(); i17++) {
                        String trim12 = attributes.getValue(i17).trim();
                        if (a.b[yga0.a(attributes, i17)] == 38) {
                            if ("objectBoundingBox".equals(trim12)) {
                                eVar.o = Boolean.FALSE;
                            } else {
                                if (!"userSpaceOnUse".equals(trim12)) {
                                    throw new SVGParseException("Invalid value for attribute clipPathUnits");
                                }
                                eVar.o = Boolean.TRUE;
                            }
                        }
                    }
                    this.b.o(eVar);
                    this.b = eVar;
                    return;
                case 25:
                    if (this.b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    SVG.y0 y0Var = new SVG.y0();
                    y0Var.a = this.a;
                    y0Var.b = this.b;
                    g(y0Var, attributes);
                    j(y0Var, attributes);
                    f(y0Var, attributes);
                    for (int i18 = 0; i18 < attributes.getLength(); i18++) {
                        String trim13 = attributes.getValue(i18).trim();
                        int i19 = a.b[yga0.a(attributes, i18)];
                        if (i19 != 6) {
                            if (i19 == 39) {
                                y0Var.o = s(trim13);
                            }
                        } else if ("".equals(attributes.getURI(i18)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i18))) {
                            y0Var.n = trim13;
                        }
                    }
                    this.b.o(y0Var);
                    this.b = y0Var;
                    SVG.i0 i0Var7 = y0Var.b;
                    if (i0Var7 instanceof SVG.a1) {
                        y0Var.p = (SVG.a1) i0Var7;
                        return;
                    } else {
                        y0Var.p = ((SVG.w0) i0Var7).a();
                        return;
                    }
                case 26:
                    if (this.b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    SVG.y yVar = new SVG.y();
                    yVar.a = this.a;
                    yVar.b = this.b;
                    g(yVar, attributes);
                    j(yVar, attributes);
                    f(yVar, attributes);
                    m(yVar, attributes);
                    for (int i20 = 0; i20 < attributes.getLength(); i20++) {
                        String trim14 = attributes.getValue(i20).trim();
                        int i21 = a.b[yga0.a(attributes, i20)];
                        if (i21 == 1) {
                            yVar.s = s(trim14);
                        } else if (i21 == 2) {
                            yVar.t = s(trim14);
                        } else if (i21 == 3) {
                            SVG.p s15 = s(trim14);
                            yVar.u = s15;
                            if (s15.i()) {
                                throw new SVGParseException("Invalid <pattern> element. width cannot be negative");
                            }
                        } else if (i21 == 4) {
                            SVG.p s16 = s(trim14);
                            yVar.v = s16;
                            if (s16.i()) {
                                throw new SVGParseException("Invalid <pattern> element. height cannot be negative");
                            }
                        } else if (i21 != 6) {
                            switch (i21) {
                                case 40:
                                    if (!"objectBoundingBox".equals(trim14)) {
                                        if (!"userSpaceOnUse".equals(trim14)) {
                                            throw new SVGParseException("Invalid value for attribute patternUnits");
                                        }
                                        yVar.p = Boolean.TRUE;
                                        break;
                                    } else {
                                        yVar.p = Boolean.FALSE;
                                        break;
                                    }
                                case 41:
                                    if (!"objectBoundingBox".equals(trim14)) {
                                        if (!"userSpaceOnUse".equals(trim14)) {
                                            throw new SVGParseException("Invalid value for attribute patternContentUnits");
                                        }
                                        yVar.q = Boolean.TRUE;
                                        break;
                                    } else {
                                        yVar.q = Boolean.FALSE;
                                        break;
                                    }
                                case 42:
                                    yVar.r = z(trim14);
                                    break;
                            }
                        } else if ("".equals(attributes.getURI(i20)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i20))) {
                            yVar.w = trim14;
                        }
                    }
                    this.b.o(yVar);
                    this.b = yVar;
                    return;
                case 27:
                    if (this.b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    SVG.o oVar = new SVG.o();
                    oVar.a = this.a;
                    oVar.b = this.b;
                    g(oVar, attributes);
                    j(oVar, attributes);
                    l(oVar, attributes);
                    f(oVar, attributes);
                    for (int i22 = 0; i22 < attributes.getLength(); i22++) {
                        String trim15 = attributes.getValue(i22).trim();
                        int i23 = a.b[yga0.a(attributes, i22)];
                        if (i23 == 1) {
                            oVar.p = s(trim15);
                        } else if (i23 == 2) {
                            oVar.q = s(trim15);
                        } else if (i23 == 3) {
                            SVG.p s17 = s(trim15);
                            oVar.r = s17;
                            if (s17.i()) {
                                throw new SVGParseException("Invalid <use> element. width cannot be negative");
                            }
                        } else if (i23 == 4) {
                            SVG.p s18 = s(trim15);
                            oVar.s = s18;
                            if (s18.i()) {
                                throw new SVGParseException("Invalid <use> element. height cannot be negative");
                            }
                        } else if (i23 != 6) {
                            if (i23 == 7) {
                                x(oVar, trim15);
                            }
                        } else if ("".equals(attributes.getURI(i22)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i22))) {
                            oVar.o = trim15;
                        }
                    }
                    this.b.o(oVar);
                    this.b = oVar;
                    return;
                case 28:
                    if (this.b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    SVG.e1 e1Var = new SVG.e1();
                    e1Var.a = this.a;
                    e1Var.b = this.b;
                    g(e1Var, attributes);
                    f(e1Var, attributes);
                    m(e1Var, attributes);
                    this.b.o(e1Var);
                    this.b = e1Var;
                    return;
                case 29:
                    if (this.b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    SVG.s sVar = new SVG.s();
                    sVar.a = this.a;
                    sVar.b = this.b;
                    g(sVar, attributes);
                    j(sVar, attributes);
                    f(sVar, attributes);
                    for (int i24 = 0; i24 < attributes.getLength(); i24++) {
                        String trim16 = attributes.getValue(i24).trim();
                        int i25 = a.b[yga0.a(attributes, i24)];
                        if (i25 == 1) {
                            s(trim16);
                        } else if (i25 == 2) {
                            s(trim16);
                        } else if (i25 == 3) {
                            SVG.p s19 = s(trim16);
                            sVar.p = s19;
                            if (s19.i()) {
                                throw new SVGParseException("Invalid <mask> element. width cannot be negative");
                            }
                        } else if (i25 == 4) {
                            SVG.p s20 = s(trim16);
                            sVar.q = s20;
                            if (s20.i()) {
                                throw new SVGParseException("Invalid <mask> element. height cannot be negative");
                            }
                        } else if (i25 != 43) {
                            if (i25 != 44) {
                                continue;
                            } else if ("objectBoundingBox".equals(trim16)) {
                                sVar.o = Boolean.FALSE;
                            } else {
                                if (!"userSpaceOnUse".equals(trim16)) {
                                    throw new SVGParseException("Invalid value for attribute maskContentUnits");
                                }
                                sVar.o = Boolean.TRUE;
                            }
                        } else if ("objectBoundingBox".equals(trim16)) {
                            sVar.n = Boolean.FALSE;
                        } else {
                            if (!"userSpaceOnUse".equals(trim16)) {
                                throw new SVGParseException("Invalid value for attribute maskUnits");
                            }
                            sVar.n = Boolean.TRUE;
                        }
                    }
                    this.b.o(sVar);
                    this.b = sVar;
                    return;
                case 30:
                    if (this.b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    String str4 = "all";
                    boolean z2 = true;
                    for (int i26 = 0; i26 < attributes.getLength(); i26++) {
                        String trim17 = attributes.getValue(i26).trim();
                        int i27 = a.b[yga0.a(attributes, i26)];
                        if (i27 == 88) {
                            z2 = trim17.equals("text/css");
                        } else if (i27 == 89) {
                            str4 = trim17;
                        }
                    }
                    if (z2) {
                        a.f fVar = a.f.screen;
                        a.d dVar2 = new a.d(str4);
                        dVar2.q();
                        Iterator it = com.caverock.androidsvg.a.c(dVar2).iterator();
                        while (it.hasNext()) {
                            a.f fVar2 = (a.f) it.next();
                            if (fVar2 == a.f.all || fVar2 == fVar) {
                                this.h = true;
                                return;
                            }
                        }
                    }
                    this.c = true;
                    this.d = 1;
                    return;
                case 31:
                    if (this.b == null) {
                        throw new SVGParseException("Invalid document. Root element must be <svg>");
                    }
                    SVG.c0 c0Var = new SVG.c0();
                    c0Var.a = this.a;
                    c0Var.b = this.b;
                    g(c0Var, attributes);
                    j(c0Var, attributes);
                    this.b.o(c0Var);
                    this.b = c0Var;
                    return;
                default:
                    this.c = true;
                    this.d = 1;
                    return;
            }
        }
    }

    public final void G(String str) throws SVGParseException {
        if (this.c) {
            return;
        }
        if (this.e) {
            if (this.g == null) {
                this.g = new StringBuilder(str.length());
            }
            this.g.append(str);
        } else if (this.h) {
            if (this.i == null) {
                this.i = new StringBuilder(str.length());
            }
            this.i.append(str);
        } else if (this.b instanceof SVG.x0) {
            a(str);
        }
    }

    public final void H(char[] cArr, int i2, int i3) throws SVGParseException {
        if (this.c) {
            return;
        }
        if (this.e) {
            if (this.g == null) {
                this.g = new StringBuilder(i3);
            }
            this.g.append(cArr, i2, i3);
        } else if (this.h) {
            if (this.i == null) {
                this.i = new StringBuilder(i3);
            }
            this.i.append(cArr, i2, i3);
        } else if (this.b instanceof SVG.x0) {
            a(new String(cArr, i2, i3));
        }
    }

    public final void a(String str) throws SVGParseException {
        SVG.g0 g0Var = (SVG.g0) this.b;
        int size = g0Var.i.size();
        SVG.m0 m0Var = size == 0 ? null : g0Var.i.get(size - 1);
        if (m0Var instanceof SVG.b1) {
            SVG.b1 b1Var = (SVG.b1) m0Var;
            b1Var.c = i5s.a(new StringBuilder(), b1Var.c, str);
        } else {
            SVG.i0 i0Var = this.b;
            SVG.b1 b1Var2 = new SVG.b1();
            b1Var2.c = str;
            i0Var.o(b1Var2);
        }
    }

    public final void c(String str, String str2, String str3) throws SVGParseException {
        if (this.c) {
            int i2 = this.d - 1;
            this.d = i2;
            if (i2 == 0) {
                this.c = false;
                return;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            int i3 = a.a[h.a(str2).ordinal()];
            if (i3 != 1 && i3 != 2 && i3 != 4 && i3 != 5 && i3 != 13 && i3 != 14) {
                switch (i3) {
                    case 22:
                    case 23:
                        this.e = false;
                        if (this.g != null) {
                            h hVar = this.f;
                            if (hVar == h.title) {
                                this.a.getClass();
                            } else if (hVar == h.desc) {
                                this.a.getClass();
                            }
                            this.g.setLength(0);
                            break;
                        }
                        break;
                    case 30:
                        StringBuilder sb = this.i;
                        if (sb != null) {
                            this.h = false;
                            String sb2 = sb.toString();
                            a.f fVar = a.f.screen;
                            a.t tVar = a.t.Document;
                            com.caverock.androidsvg.a aVar = new com.caverock.androidsvg.a();
                            aVar.c = false;
                            aVar.a = fVar;
                            aVar.b = tVar;
                            SVG svg = this.a;
                            a.d dVar = new a.d(sb2);
                            dVar.q();
                            svg.b.b(aVar.e(dVar));
                            this.i.setLength(0);
                            break;
                        }
                        break;
                }
                return;
            }
            this.b = ((SVG.m0) this.b).b;
        }
    }
}
