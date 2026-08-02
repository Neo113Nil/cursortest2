package r6;

import B0.A0;
import C.o0;
import Hj.C3143a;
import Ve.C4598rp;
import android.graphics.Matrix;
import android.util.Log;
import android.util.Xml;
import androidx.recyclerview.widget.m;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.google.protobuf.DescriptorProtos$Edition;
import com.google.protobuf.DescriptorProtos$FileOptions;
import io.sentry.W2;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.maplibre.android.log.Logger;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DefaultHandler2;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import r6.C9176b;
import r6.C9179e;
import r6.C9181g;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.pdp.widgets.richContent.data.RichContentDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.fintech.ui.dots.BaseDotsIndicator;
import ru.ozon.fintech.ui.input.CounterView;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;

/* renamed from: r6.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C9209j {

    /* renamed from: d, reason: collision with root package name */
    private int f83158d;

    /* renamed from: a, reason: collision with root package name */
    private C9181g f83155a = null;

    /* renamed from: b, reason: collision with root package name */
    private C9181g.J f83156b = null;

    /* renamed from: c, reason: collision with root package name */
    private boolean f83157c = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f83159e = false;

    /* renamed from: f, reason: collision with root package name */
    private h f83160f = null;

    /* renamed from: g, reason: collision with root package name */
    private StringBuilder f83161g = null;

    /* renamed from: h, reason: collision with root package name */
    private boolean f83162h = false;

    /* renamed from: i, reason: collision with root package name */
    private StringBuilder f83163i = null;

    /* renamed from: r6.j$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f83164a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f83165b;

        static {
            int[] iArr = new int[g.values().length];
            f83165b = iArr;
            try {
                iArr[g.f83173x.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f83165b[g.f83176y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f83165b[g.width.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f83165b[g.height.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f83165b[g.version.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f83165b[g.href.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f83165b[g.preserveAspectRatio.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f83165b[g.f83171d.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f83165b[g.pathLength.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f83165b[g.rx.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f83165b[g.ry.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f83165b[g.cx.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f83165b[g.cy.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f83165b[g.f83172r.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f83165b[g.f83174x1.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f83165b[g.f83177y1.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f83165b[g.f83175x2.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f83165b[g.f83178y2.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f83165b[g.dx.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f83165b[g.dy.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f83165b[g.requiredFeatures.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f83165b[g.requiredExtensions.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f83165b[g.systemLanguage.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f83165b[g.requiredFormats.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f83165b[g.requiredFonts.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f83165b[g.refX.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f83165b[g.refY.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f83165b[g.markerWidth.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f83165b[g.markerHeight.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f83165b[g.markerUnits.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f83165b[g.orient.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f83165b[g.gradientUnits.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f83165b[g.gradientTransform.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f83165b[g.spreadMethod.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f83165b[g.fx.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f83165b[g.fy.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f83165b[g.offset.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f83165b[g.clipPathUnits.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f83165b[g.startOffset.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f83165b[g.patternUnits.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f83165b[g.patternContentUnits.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f83165b[g.patternTransform.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f83165b[g.maskUnits.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f83165b[g.maskContentUnits.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f83165b[g.style.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f83165b[g.CLASS.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f83165b[g.fill.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f83165b[g.fill_rule.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f83165b[g.fill_opacity.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f83165b[g.stroke.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f83165b[g.stroke_opacity.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                f83165b[g.stroke_width.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                f83165b[g.stroke_linecap.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                f83165b[g.stroke_linejoin.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                f83165b[g.stroke_miterlimit.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                f83165b[g.stroke_dasharray.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                f83165b[g.stroke_dashoffset.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                f83165b[g.opacity.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                f83165b[g.color.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                f83165b[g.font.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                f83165b[g.font_family.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                f83165b[g.font_size.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                f83165b[g.font_weight.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                f83165b[g.font_style.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                f83165b[g.text_decoration.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                f83165b[g.direction.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                f83165b[g.text_anchor.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                f83165b[g.overflow.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                f83165b[g.marker.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                f83165b[g.marker_start.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                f83165b[g.marker_mid.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                f83165b[g.marker_end.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                f83165b[g.display.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                f83165b[g.visibility.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                f83165b[g.stop_color.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                f83165b[g.stop_opacity.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                f83165b[g.clip.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                f83165b[g.clip_path.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                f83165b[g.clip_rule.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                f83165b[g.mask.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                f83165b[g.solid_color.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                f83165b[g.solid_opacity.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                f83165b[g.viewport_fill.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                f83165b[g.viewport_fill_opacity.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                f83165b[g.vector_effect.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                f83165b[g.image_rendering.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                f83165b[g.viewBox.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                f83165b[g.type.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                f83165b[g.media.ordinal()] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            int[] iArr2 = new int[h.values().length];
            f83164a = iArr2;
            try {
                iArr2[h.svg.ordinal()] = 1;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                f83164a[h.f83180g.ordinal()] = 2;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                f83164a[h.f83179a.ordinal()] = 3;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                f83164a[h.defs.ordinal()] = 4;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                f83164a[h.use.ordinal()] = 5;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                f83164a[h.path.ordinal()] = 6;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                f83164a[h.rect.ordinal()] = 7;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                f83164a[h.circle.ordinal()] = 8;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                f83164a[h.ellipse.ordinal()] = 9;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                f83164a[h.line.ordinal()] = 10;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                f83164a[h.polyline.ordinal()] = 11;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                f83164a[h.polygon.ordinal()] = 12;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                f83164a[h.text.ordinal()] = 13;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                f83164a[h.tspan.ordinal()] = 14;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                f83164a[h.tref.ordinal()] = 15;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                f83164a[h.SWITCH.ordinal()] = 16;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                f83164a[h.symbol.ordinal()] = 17;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                f83164a[h.marker.ordinal()] = 18;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                f83164a[h.linearGradient.ordinal()] = 19;
            } catch (NoSuchFieldError unused108) {
            }
            try {
                f83164a[h.radialGradient.ordinal()] = 20;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                f83164a[h.stop.ordinal()] = 21;
            } catch (NoSuchFieldError unused110) {
            }
            try {
                f83164a[h.title.ordinal()] = 22;
            } catch (NoSuchFieldError unused111) {
            }
            try {
                f83164a[h.desc.ordinal()] = 23;
            } catch (NoSuchFieldError unused112) {
            }
            try {
                f83164a[h.clipPath.ordinal()] = 24;
            } catch (NoSuchFieldError unused113) {
            }
            try {
                f83164a[h.textPath.ordinal()] = 25;
            } catch (NoSuchFieldError unused114) {
            }
            try {
                f83164a[h.pattern.ordinal()] = 26;
            } catch (NoSuchFieldError unused115) {
            }
            try {
                f83164a[h.image.ordinal()] = 27;
            } catch (NoSuchFieldError unused116) {
            }
            try {
                f83164a[h.view.ordinal()] = 28;
            } catch (NoSuchFieldError unused117) {
            }
            try {
                f83164a[h.mask.ordinal()] = 29;
            } catch (NoSuchFieldError unused118) {
            }
            try {
                f83164a[h.style.ordinal()] = 30;
            } catch (NoSuchFieldError unused119) {
            }
            try {
                f83164a[h.solidColor.ordinal()] = 31;
            } catch (NoSuchFieldError unused120) {
            }
        }
    }

    /* renamed from: r6.j$b */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final HashMap f83166a;

        static {
            HashMap hashMap = new HashMap(10);
            f83166a = hashMap;
            hashMap.put(DevicePublicKeyStringDef.NONE, C9179e.a.none);
            hashMap.put("xMinYMin", C9179e.a.xMinYMin);
            hashMap.put("xMidYMin", C9179e.a.xMidYMin);
            hashMap.put("xMaxYMin", C9179e.a.xMaxYMin);
            hashMap.put("xMinYMid", C9179e.a.xMinYMid);
            hashMap.put("xMidYMid", C9179e.a.xMidYMid);
            hashMap.put("xMaxYMid", C9179e.a.xMaxYMid);
            hashMap.put("xMinYMax", C9179e.a.xMinYMax);
            hashMap.put("xMidYMax", C9179e.a.xMidYMax);
            hashMap.put("xMaxYMax", C9179e.a.xMaxYMax);
        }

        static C9179e.a a(String str) {
            return (C9179e.a) f83166a.get(str);
        }
    }

    /* renamed from: r6.j$c */
    private static class c {

        /* renamed from: a, reason: collision with root package name */
        private static final HashMap f83167a;

        static {
            HashMap hashMap = new HashMap(47);
            f83167a = hashMap;
            C4598rp.e(-984833, hashMap, "aliceblue", -332841, "antiquewhite");
            Integer valueOf = Integer.valueOf(BaseDotsIndicator.DEFAULT_POINT_COLOR);
            com.google.android.gms.internal.mlkit_common.a.c(hashMap, "aqua", valueOf, -8388652, "aquamarine");
            C4598rp.e(-983041, hashMap, "azure", -657956, "beige");
            C4598rp.e(-6972, hashMap, "bisque", -16777216, "black");
            C4598rp.e(-5171, hashMap, "blanchedalmond", -16776961, "blue");
            C4598rp.e(-7722014, hashMap, "blueviolet", -5952982, "brown");
            C4598rp.e(-2180985, hashMap, "burlywood", -10510688, "cadetblue");
            C4598rp.e(-8388864, hashMap, "chartreuse", -2987746, "chocolate");
            C4598rp.e(-32944, hashMap, "coral", -10185235, "cornflowerblue");
            C4598rp.e(-1828, hashMap, "cornsilk", -2354116, "crimson");
            com.google.android.gms.internal.mlkit_common.a.c(hashMap, "cyan", valueOf, -16777077, "darkblue");
            C4598rp.e(-16741493, hashMap, "darkcyan", -4684277, "darkgoldenrod");
            com.google.android.gms.internal.mlkit_common.a.c(hashMap, "darkgray", -5658199, -16751616, "darkgreen");
            com.google.android.gms.internal.mlkit_common.a.c(hashMap, "darkgrey", -5658199, -4343957, "darkkhaki");
            C4598rp.e(-7667573, hashMap, "darkmagenta", -11179217, "darkolivegreen");
            C4598rp.e(-29696, hashMap, "darkorange", -6737204, "darkorchid");
            C4598rp.e(-7667712, hashMap, "darkred", -1468806, "darksalmon");
            C4598rp.e(-7357297, hashMap, "darkseagreen", -12042869, "darkslateblue");
            hashMap.put("darkslategray", -13676721);
            hashMap.put("darkslategrey", -13676721);
            com.google.android.gms.internal.mlkit_common.a.c(hashMap, "darkturquoise", -16724271, -7077677, "darkviolet");
            C4598rp.e(-60269, hashMap, "deeppink", -16728065, "deepskyblue");
            hashMap.put("dimgray", -9868951);
            hashMap.put("dimgrey", -9868951);
            com.google.android.gms.internal.mlkit_common.a.c(hashMap, "dodgerblue", -14774017, -5103070, "firebrick");
            C4598rp.e(-1296, hashMap, "floralwhite", -14513374, "forestgreen");
            com.google.android.gms.internal.mlkit_common.a.c(hashMap, "fuchsia", -65281, -2302756, "gainsboro");
            C4598rp.e(-460545, hashMap, "ghostwhite", -10496, "gold");
            hashMap.put("goldenrod", -2448096);
            hashMap.put("gray", -8355712);
            C4598rp.e(-16744448, hashMap, "green", -5374161, "greenyellow");
            com.google.android.gms.internal.mlkit_common.a.c(hashMap, "grey", -8355712, -983056, "honeydew");
            C4598rp.e(-38476, hashMap, "hotpink", -3318692, "indianred");
            C4598rp.e(-11861886, hashMap, "indigo", -16, "ivory");
            C4598rp.e(-989556, hashMap, "khaki", -1644806, "lavender");
            C4598rp.e(-3851, hashMap, "lavenderblush", -8586240, "lawngreen");
            C4598rp.e(-1331, hashMap, "lemonchiffon", -5383962, "lightblue");
            C4598rp.e(-1015680, hashMap, "lightcoral", -2031617, "lightcyan");
            hashMap.put("lightgoldenrodyellow", -329006);
            hashMap.put("lightgray", -2894893);
            hashMap.put("lightgreen", -7278960);
            hashMap.put("lightgrey", -2894893);
            C4598rp.e(-18751, hashMap, "lightpink", -24454, "lightsalmon");
            C4598rp.e(-14634326, hashMap, "lightseagreen", -7876870, "lightskyblue");
            hashMap.put("lightslategray", -8943463);
            hashMap.put("lightslategrey", -8943463);
            com.google.android.gms.internal.mlkit_common.a.c(hashMap, "lightsteelblue", -5192482, -32, "lightyellow");
            C4598rp.e(-16711936, hashMap, "lime", -13447886, "limegreen");
            hashMap.put("linen", -331546);
            hashMap.put("magenta", -65281);
            C4598rp.e(-8388608, hashMap, "maroon", -10039894, "mediumaquamarine");
            C4598rp.e(-16777011, hashMap, "mediumblue", -4565549, "mediumorchid");
            C4598rp.e(-7114533, hashMap, "mediumpurple", -12799119, "mediumseagreen");
            C4598rp.e(-8689426, hashMap, "mediumslateblue", -16713062, "mediumspringgreen");
            C4598rp.e(-12004916, hashMap, "mediumturquoise", -3730043, "mediumvioletred");
            C4598rp.e(-15132304, hashMap, "midnightblue", -655366, "mintcream");
            C4598rp.e(-6943, hashMap, "mistyrose", -6987, "moccasin");
            C4598rp.e(-8531, hashMap, "navajowhite", -16777088, "navy");
            C4598rp.e(-133658, hashMap, "oldlace", -8355840, "olive");
            C4598rp.e(-9728477, hashMap, "olivedrab", -23296, "orange");
            C4598rp.e(-47872, hashMap, "orangered", -2461482, "orchid");
            C4598rp.e(-1120086, hashMap, "palegoldenrod", -6751336, "palegreen");
            C4598rp.e(-5247250, hashMap, "paleturquoise", -2396013, "palevioletred");
            C4598rp.e(-4139, hashMap, "papayawhip", -9543, "peachpuff");
            C4598rp.e(-3308225, hashMap, "peru", -16181, "pink");
            C4598rp.e(-2252579, hashMap, "plum", -5185306, "powderblue");
            C4598rp.e(-8388480, hashMap, "purple", -10079335, "rebeccapurple");
            C4598rp.e(-65536, hashMap, "red", -4419697, "rosybrown");
            C4598rp.e(-12490271, hashMap, "royalblue", -7650029, "saddlebrown");
            C4598rp.e(-360334, hashMap, "salmon", -744352, "sandybrown");
            C4598rp.e(-13726889, hashMap, "seagreen", -2578, "seashell");
            C4598rp.e(-6270419, hashMap, "sienna", -4144960, "silver");
            C4598rp.e(-7876885, hashMap, "skyblue", -9807155, "slateblue");
            hashMap.put("slategray", -9404272);
            hashMap.put("slategrey", -9404272);
            com.google.android.gms.internal.mlkit_common.a.c(hashMap, "snow", -1286, -16711809, "springgreen");
            C4598rp.e(-12156236, hashMap, "steelblue", -2968436, "tan");
            C4598rp.e(-16744320, hashMap, "teal", -2572328, "thistle");
            C4598rp.e(-40121, hashMap, "tomato", -12525360, "turquoise");
            C4598rp.e(-1146130, hashMap, "violet", -663885, "wheat");
            C4598rp.e(-1, hashMap, "white", -657931, "whitesmoke");
            C4598rp.e(-256, hashMap, "yellow", -6632142, "yellowgreen");
            hashMap.put("transparent", 0);
        }

        static Integer a(String str) {
            return (Integer) f83167a.get(str);
        }
    }

    /* renamed from: r6.j$d */
    private static class d {

        /* renamed from: a, reason: collision with root package name */
        private static final HashMap f83168a;

        static {
            HashMap hashMap = new HashMap(9);
            f83168a = hashMap;
            C9181g.d0 d0Var = C9181g.d0.pt;
            hashMap.put("xx-small", new C9181g.C9196p(0.694f, d0Var));
            hashMap.put("x-small", new C9181g.C9196p(0.833f, d0Var));
            hashMap.put("small", new C9181g.C9196p(10.0f, d0Var));
            hashMap.put("medium", new C9181g.C9196p(12.0f, d0Var));
            hashMap.put("large", new C9181g.C9196p(14.4f, d0Var));
            hashMap.put("x-large", new C9181g.C9196p(17.3f, d0Var));
            hashMap.put("xx-large", new C9181g.C9196p(20.7f, d0Var));
            C9181g.d0 d0Var2 = C9181g.d0.percent;
            hashMap.put("smaller", new C9181g.C9196p(83.33f, d0Var2));
            hashMap.put("larger", new C9181g.C9196p(120.0f, d0Var2));
        }

        static C9181g.C9196p a(String str) {
            return (C9181g.C9196p) f83168a.get(str);
        }
    }

    /* renamed from: r6.j$e */
    private static class e {

        /* renamed from: a, reason: collision with root package name */
        private static final HashMap f83169a;

        static {
            HashMap hashMap = new HashMap(13);
            f83169a = hashMap;
            hashMap.put("normal", 400);
            hashMap.put("bold", 700);
            C4598rp.e(1, hashMap, "bolder", -1, "lighter");
            C4598rp.e(100, hashMap, "100", m.e.DEFAULT_DRAG_ANIMATION_DURATION, "200");
            hashMap.put("300", 300);
            hashMap.put("400", 400);
            C4598rp.e(CounterView.COUNTER_MAX_DEFAULT, hashMap, "500", 600, "600");
            com.google.android.gms.internal.mlkit_common.a.c(hashMap, "700", 700, 800, "800");
            hashMap.put("900", Integer.valueOf(DescriptorProtos$Edition.EDITION_LEGACY_VALUE));
        }

        static Integer a(String str) {
            return (Integer) f83169a.get(str);
        }
    }

    /* renamed from: r6.j$f */
    private class f extends DefaultHandler2 {
        f() {
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public final void characters(char[] cArr, int i11, int i12) throws SAXException {
            C9209j.this.L(new String(cArr, i11, i12));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public final void endDocument() throws SAXException {
            C9209j.this.getClass();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public final void endElement(String str, String str2, String str3) throws SAXException {
            C9209j.this.h(str, str2, str3);
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public final void processingInstruction(String str, String str2) throws SAXException {
            C9209j.e(C9209j.this, new i(str2));
            str.equals("xml-stylesheet");
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public final void startDocument() throws SAXException {
            C9209j.a(C9209j.this);
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public final void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            C9209j.this.K(str, str2, str3, attributes);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: r6.j$g */
    private static final class g {
        public static final g CLASS = new g("CLASS", 0);
        public static final g clip = new g("clip", 1);
        public static final g clip_path = new g("clip_path", 2);
        public static final g clipPathUnits = new g("clipPathUnits", 3);
        public static final g clip_rule = new g("clip_rule", 4);
        public static final g color = new g("color", 5);
        public static final g cx = new g("cx", 6);
        public static final g cy = new g("cy", 7);
        public static final g direction = new g("direction", 8);
        public static final g dx = new g("dx", 9);
        public static final g dy = new g("dy", 10);
        public static final g fx = new g("fx", 11);
        public static final g fy = new g("fy", 12);

        /* renamed from: d, reason: collision with root package name */
        public static final g f83171d = new g("d", 13);
        public static final g display = new g("display", 14);
        public static final g fill = new g(RichContentDTO.POSITION_FILL, 15);
        public static final g fill_rule = new g("fill_rule", 16);
        public static final g fill_opacity = new g("fill_opacity", 17);
        public static final g font = new g("font", 18);
        public static final g font_family = new g("font_family", 19);
        public static final g font_size = new g("font_size", 20);
        public static final g font_weight = new g("font_weight", 21);
        public static final g font_style = new g("font_style", 22);
        public static final g gradientTransform = new g("gradientTransform", 23);
        public static final g gradientUnits = new g("gradientUnits", 24);
        public static final g height = new g("height", 25);
        public static final g href = new g("href", 26);
        public static final g image_rendering = new g("image_rendering", 27);
        public static final g marker = new g("marker", 28);
        public static final g marker_start = new g("marker_start", 29);
        public static final g marker_mid = new g("marker_mid", 30);
        public static final g marker_end = new g("marker_end", 31);
        public static final g markerHeight = new g("markerHeight", 32);
        public static final g markerUnits = new g("markerUnits", 33);
        public static final g markerWidth = new g("markerWidth", 34);
        public static final g mask = new g(FormPageDTO.Field.FIELD_TYPE_MASK, 35);
        public static final g maskContentUnits = new g("maskContentUnits", 36);
        public static final g maskUnits = new g("maskUnits", 37);
        public static final g media = new g("media", 38);
        public static final g offset = new g("offset", 39);
        public static final g opacity = new g("opacity", 40);
        public static final g orient = new g("orient", 41);
        public static final g overflow = new g("overflow", 42);
        public static final g pathLength = new g("pathLength", 43);
        public static final g patternContentUnits = new g("patternContentUnits", 44);
        public static final g patternTransform = new g("patternTransform", 45);
        public static final g patternUnits = new g("patternUnits", 46);
        public static final g points = new g("points", 47);
        public static final g preserveAspectRatio = new g("preserveAspectRatio", 48);

        /* renamed from: r, reason: collision with root package name */
        public static final g f83172r = new g("r", 49);
        public static final g refX = new g("refX", 50);
        public static final g refY = new g("refY", 51);
        public static final g requiredFeatures = new g("requiredFeatures", 52);
        public static final g requiredExtensions = new g("requiredExtensions", 53);
        public static final g requiredFormats = new g("requiredFormats", 54);
        public static final g requiredFonts = new g("requiredFonts", 55);
        public static final g rx = new g("rx", 56);
        public static final g ry = new g("ry", 57);
        public static final g solid_color = new g("solid_color", 58);
        public static final g solid_opacity = new g("solid_opacity", 59);
        public static final g spreadMethod = new g("spreadMethod", 60);
        public static final g startOffset = new g("startOffset", 61);
        public static final g stop_color = new g("stop_color", 62);
        public static final g stop_opacity = new g("stop_opacity", 63);
        public static final g stroke = new g("stroke", 64);
        public static final g stroke_dasharray = new g("stroke_dasharray", 65);
        public static final g stroke_dashoffset = new g("stroke_dashoffset", 66);
        public static final g stroke_linecap = new g("stroke_linecap", 67);
        public static final g stroke_linejoin = new g("stroke_linejoin", 68);
        public static final g stroke_miterlimit = new g("stroke_miterlimit", 69);
        public static final g stroke_opacity = new g("stroke_opacity", 70);
        public static final g stroke_width = new g("stroke_width", 71);
        public static final g style = new g("style", 72);
        public static final g systemLanguage = new g("systemLanguage", 73);
        public static final g text_anchor = new g("text_anchor", 74);
        public static final g text_decoration = new g("text_decoration", 75);
        public static final g transform = new g("transform", 76);
        public static final g type = new g("type", 77);
        public static final g vector_effect = new g("vector_effect", 78);
        public static final g version = new g("version", 79);
        public static final g viewBox = new g("viewBox", 80);
        public static final g width = new g("width", 81);

        /* renamed from: x, reason: collision with root package name */
        public static final g f83173x = new g("x", 82);

        /* renamed from: y, reason: collision with root package name */
        public static final g f83176y = new g("y", 83);

        /* renamed from: x1, reason: collision with root package name */
        public static final g f83174x1 = new g("x1", 84);

        /* renamed from: y1, reason: collision with root package name */
        public static final g f83177y1 = new g("y1", 85);

        /* renamed from: x2, reason: collision with root package name */
        public static final g f83175x2 = new g("x2", 86);

        /* renamed from: y2, reason: collision with root package name */
        public static final g f83178y2 = new g("y2", 87);
        public static final g viewport_fill = new g("viewport_fill", 88);
        public static final g viewport_fill_opacity = new g("viewport_fill_opacity", 89);
        public static final g visibility = new g("visibility", 90);
        public static final g UNSUPPORTED = new g("UNSUPPORTED", 91);
        private static final /* synthetic */ g[] $VALUES = {CLASS, clip, clip_path, clipPathUnits, clip_rule, color, cx, cy, direction, dx, dy, fx, fy, f83171d, display, fill, fill_rule, fill_opacity, font, font_family, font_size, font_weight, font_style, gradientTransform, gradientUnits, height, href, image_rendering, marker, marker_start, marker_mid, marker_end, markerHeight, markerUnits, markerWidth, mask, maskContentUnits, maskUnits, media, offset, opacity, orient, overflow, pathLength, patternContentUnits, patternTransform, patternUnits, points, preserveAspectRatio, f83172r, refX, refY, requiredFeatures, requiredExtensions, requiredFormats, requiredFonts, rx, ry, solid_color, solid_opacity, spreadMethod, startOffset, stop_color, stop_opacity, stroke, stroke_dasharray, stroke_dashoffset, stroke_linecap, stroke_linejoin, stroke_miterlimit, stroke_opacity, stroke_width, style, systemLanguage, text_anchor, text_decoration, transform, type, vector_effect, version, viewBox, width, f83173x, f83176y, f83174x1, f83177y1, f83175x2, f83178y2, viewport_fill, viewport_fill_opacity, visibility, UNSUPPORTED};
        private static final Map<String, g> cache = new HashMap();

        static {
            for (g gVar : values()) {
                if (gVar == CLASS) {
                    cache.put("class", gVar);
                } else if (gVar != UNSUPPORTED) {
                    cache.put(gVar.name().replace('_', '-'), gVar);
                }
            }
        }

        private g() {
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
    /* renamed from: r6.j$h */
    private static final class h {
        private static final /* synthetic */ h[] $VALUES;
        public static final h SWITCH;
        public static final h UNSUPPORTED;

        /* renamed from: a, reason: collision with root package name */
        public static final h f83179a;
        private static final Map<String, h> cache;
        public static final h circle;
        public static final h clipPath;
        public static final h defs;
        public static final h desc;
        public static final h ellipse;

        /* renamed from: g, reason: collision with root package name */
        public static final h f83180g;
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
            f83179a = hVar2;
            h hVar3 = new h("circle", 2);
            circle = hVar3;
            h hVar4 = new h("clipPath", 3);
            clipPath = hVar4;
            h hVar5 = new h("defs", 4);
            defs = hVar5;
            h hVar6 = new h("desc", 5);
            desc = hVar6;
            h hVar7 = new h("ellipse", 6);
            ellipse = hVar7;
            h hVar8 = new h("g", 7);
            f83180g = hVar8;
            h hVar9 = new h("image", 8);
            image = hVar9;
            h hVar10 = new h("line", 9);
            line = hVar10;
            h hVar11 = new h("linearGradient", 10);
            linearGradient = hVar11;
            h hVar12 = new h("marker", 11);
            marker = hVar12;
            h hVar13 = new h(FormPageDTO.Field.FIELD_TYPE_MASK, 12);
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
            h hVar22 = new h("style", 21);
            style = hVar22;
            h hVar23 = new h("SWITCH", 22);
            SWITCH = hVar23;
            h hVar24 = new h("symbol", 23);
            symbol = hVar24;
            h hVar25 = new h("text", 24);
            text = hVar25;
            h hVar26 = new h("textPath", 25);
            textPath = hVar26;
            h hVar27 = new h(SelectionItemFormDTO.TITLE_FIELD_NAME, 26);
            title = hVar27;
            h hVar28 = new h("tref", 27);
            tref = hVar28;
            h hVar29 = new h("tspan", 28);
            tspan = hVar29;
            h hVar30 = new h("use", 29);
            use = hVar30;
            h hVar31 = new h("view", 30);
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

        private h() {
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

    /* renamed from: r6.j$i */
    static class i {

        /* renamed from: a, reason: collision with root package name */
        String f83181a;

        /* renamed from: c, reason: collision with root package name */
        int f83183c;

        /* renamed from: b, reason: collision with root package name */
        int f83182b = 0;

        /* renamed from: d, reason: collision with root package name */
        private C9178d f83184d = new C9178d();

        i(String str) {
            this.f83183c = 0;
            String trim = str.trim();
            this.f83181a = trim;
            this.f83183c = trim.length();
        }

        static boolean g(int i11) {
            return i11 == 32 || i11 == 10 || i11 == 13 || i11 == 9;
        }

        final int a() {
            int i11 = this.f83182b;
            int i12 = this.f83183c;
            if (i11 == i12) {
                return -1;
            }
            int i13 = i11 + 1;
            this.f83182b = i13;
            if (i13 < i12) {
                return this.f83181a.charAt(i13);
            }
            return -1;
        }

        final Boolean b(Object obj) {
            if (obj == null) {
                return null;
            }
            p();
            int i11 = this.f83182b;
            if (i11 == this.f83183c) {
                return null;
            }
            char charAt = this.f83181a.charAt(i11);
            if (charAt != '0' && charAt != '1') {
                return null;
            }
            this.f83182b++;
            return Boolean.valueOf(charAt == '1');
        }

        final float c(float f7) {
            if (Float.isNaN(f7)) {
                return Float.NaN;
            }
            p();
            return i();
        }

        final boolean d(char c11) {
            int i11 = this.f83182b;
            boolean z11 = i11 < this.f83183c && this.f83181a.charAt(i11) == c11;
            if (z11) {
                this.f83182b++;
            }
            return z11;
        }

        final boolean e(String str) {
            int length = str.length();
            int i11 = this.f83182b;
            boolean z11 = i11 <= this.f83183c - length && this.f83181a.substring(i11, i11 + length).equals(str);
            if (z11) {
                this.f83182b += length;
            }
            return z11;
        }

        final boolean f() {
            return this.f83182b == this.f83183c;
        }

        final Integer h() {
            int i11 = this.f83182b;
            if (i11 == this.f83183c) {
                return null;
            }
            this.f83182b = i11 + 1;
            return Integer.valueOf(this.f83181a.charAt(i11));
        }

        final float i() {
            int i11 = this.f83182b;
            int i12 = this.f83183c;
            C9178d c9178d = this.f83184d;
            float b11 = c9178d.b(i11, i12, this.f83181a);
            if (!Float.isNaN(b11)) {
                this.f83182b = c9178d.a();
            }
            return b11;
        }

        final C9181g.C9196p j() {
            float i11 = i();
            if (Float.isNaN(i11)) {
                return null;
            }
            C9181g.d0 n11 = n();
            return n11 == null ? new C9181g.C9196p(i11, C9181g.d0.px) : new C9181g.C9196p(i11, n11);
        }

        final String k() {
            if (f()) {
                return null;
            }
            int i11 = this.f83182b;
            String str = this.f83181a;
            char charAt = str.charAt(i11);
            if (charAt != '\'' && charAt != '\"') {
                return null;
            }
            int a11 = a();
            while (a11 != -1 && a11 != charAt) {
                a11 = a();
            }
            if (a11 == -1) {
                this.f83182b = i11;
                return null;
            }
            int i12 = this.f83182b;
            this.f83182b = i12 + 1;
            return str.substring(i11 + 1, i12);
        }

        final String l() {
            return m(' ', false);
        }

        final String m(char c11, boolean z11) {
            if (f()) {
                return null;
            }
            int i11 = this.f83182b;
            String str = this.f83181a;
            char charAt = str.charAt(i11);
            if ((!z11 && g(charAt)) || charAt == c11) {
                return null;
            }
            int i12 = this.f83182b;
            int a11 = a();
            while (a11 != -1 && a11 != c11 && (z11 || !g(a11))) {
                a11 = a();
            }
            return str.substring(i12, this.f83182b);
        }

        final C9181g.d0 n() {
            if (f()) {
                return null;
            }
            int i11 = this.f83182b;
            String str = this.f83181a;
            if (str.charAt(i11) == '%') {
                this.f83182b++;
                return C9181g.d0.percent;
            }
            int i12 = this.f83182b;
            if (i12 > this.f83183c - 2) {
                return null;
            }
            try {
                C9181g.d0 valueOf = C9181g.d0.valueOf(str.substring(i12, i12 + 2).toLowerCase(Locale.US));
                this.f83182b += 2;
                return valueOf;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        final float o() {
            p();
            int i11 = this.f83182b;
            int i12 = this.f83183c;
            C9178d c9178d = this.f83184d;
            float b11 = c9178d.b(i11, i12, this.f83181a);
            if (!Float.isNaN(b11)) {
                this.f83182b = c9178d.a();
            }
            return b11;
        }

        final boolean p() {
            q();
            int i11 = this.f83182b;
            if (i11 == this.f83183c || this.f83181a.charAt(i11) != ',') {
                return false;
            }
            this.f83182b++;
            q();
            return true;
        }

        final void q() {
            while (true) {
                int i11 = this.f83182b;
                if (i11 >= this.f83183c || !g(this.f83181a.charAt(i11))) {
                    return;
                } else {
                    this.f83182b++;
                }
            }
        }
    }

    /* renamed from: r6.j$j, reason: collision with other inner class name */
    private class C1414j implements Attributes {

        /* renamed from: a, reason: collision with root package name */
        private XmlPullParser f83185a;

        public C1414j(XmlPullParser xmlPullParser) {
            this.f83185a = xmlPullParser;
        }

        @Override // org.xml.sax.Attributes
        public final int getIndex(String str, String str2) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public final int getLength() {
            return this.f83185a.getAttributeCount();
        }

        @Override // org.xml.sax.Attributes
        public final String getLocalName(int i11) {
            return this.f83185a.getAttributeName(i11);
        }

        @Override // org.xml.sax.Attributes
        public final String getQName(int i11) {
            XmlPullParser xmlPullParser = this.f83185a;
            String attributeName = xmlPullParser.getAttributeName(i11);
            if (xmlPullParser.getAttributePrefix(i11) == null) {
                return attributeName;
            }
            return xmlPullParser.getAttributePrefix(i11) + ':' + attributeName;
        }

        @Override // org.xml.sax.Attributes
        public final String getType(int i11) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public final String getURI(int i11) {
            return this.f83185a.getAttributeNamespace(i11);
        }

        @Override // org.xml.sax.Attributes
        public final String getValue(int i11) {
            return this.f83185a.getAttributeValue(i11);
        }

        @Override // org.xml.sax.Attributes
        public final int getIndex(String str) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public final String getType(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public final String getValue(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public final String getType(String str) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public final String getValue(String str) {
            return null;
        }
    }

    C9209j() {
    }

    private static C9181g.C9196p A(i iVar) {
        return iVar.e("auto") ? new C9181g.C9196p(0.0f) : iVar.j();
    }

    private static Float B(String str) {
        try {
            float v11 = v(str);
            float f7 = 0.0f;
            if (v11 >= 0.0f) {
                f7 = 1.0f;
                if (v11 > 1.0f) {
                }
                return Float.valueOf(v11);
            }
            v11 = f7;
            return Float.valueOf(v11);
        } catch (C9208i unused) {
            return null;
        }
    }

    private static C9181g.O C(String str) {
        boolean startsWith = str.startsWith("url(");
        C9181g.O o11 = C9181g.C9187f.f83054c;
        C9181g.O o12 = null;
        if (!startsWith) {
            if (str.equals(DevicePublicKeyStringDef.NONE)) {
                return o11;
            }
            if (str.equals("currentColor")) {
                return C9181g.C1412g.a();
            }
            try {
                return t(str);
            } catch (C9208i unused) {
                return null;
            }
        }
        int indexOf = str.indexOf(")");
        if (indexOf == -1) {
            return new C9181g.C9201u(str.substring(4).trim(), null);
        }
        String trim = str.substring(4, indexOf).trim();
        String trim2 = str.substring(indexOf + 1).trim();
        if (trim2.length() > 0) {
            if (!trim2.equals(DevicePublicKeyStringDef.NONE)) {
                if (trim2.equals("currentColor")) {
                    o11 = C9181g.C1412g.a();
                } else {
                    try {
                        o11 = t(trim2);
                    } catch (C9208i unused2) {
                        o11 = null;
                    }
                }
            }
            o12 = o11;
        }
        return new C9181g.C9201u(trim, o12);
    }

    private static void D(C9181g.P p11, String str) throws C9208i {
        C9179e.b bVar;
        i iVar = new i(str);
        iVar.q();
        String l11 = iVar.l();
        if ("defer".equals(l11)) {
            iVar.q();
            l11 = iVar.l();
        }
        C9179e.a a11 = b.a(l11);
        iVar.q();
        if (iVar.f()) {
            bVar = null;
        } else {
            String l12 = iVar.l();
            l12.getClass();
            if (l12.equals("meet")) {
                bVar = C9179e.b.meet;
            } else {
                if (!l12.equals("slice")) {
                    throw new C9208i("Invalid preserveAspectRatio definition: ".concat(str));
                }
                bVar = C9179e.b.slice;
            }
        }
        p11.f83015n = new C9179e(a11, bVar);
    }

    private static HashMap E(i iVar) {
        HashMap hashMap = new HashMap();
        iVar.q();
        String m11 = iVar.m('=', false);
        while (m11 != null) {
            iVar.d('=');
            hashMap.put(m11, iVar.k());
            iVar.q();
            m11 = iVar.m('=', false);
        }
        return hashMap;
    }

    private static Matrix F(String str) throws C9208i {
        Matrix matrix = new Matrix();
        i iVar = new i(str);
        iVar.q();
        while (!iVar.f()) {
            String str2 = null;
            if (!iVar.f()) {
                int i11 = iVar.f83182b;
                String str3 = iVar.f83181a;
                int charAt = str3.charAt(i11);
                while (true) {
                    if ((charAt >= 97 && charAt <= 122) || (charAt >= 65 && charAt <= 90)) {
                        charAt = iVar.a();
                    }
                }
                int i12 = iVar.f83182b;
                while (i.g(charAt)) {
                    charAt = iVar.a();
                }
                if (charAt == 40) {
                    iVar.f83182b++;
                    str2 = str3.substring(i11, i12);
                } else {
                    iVar.f83182b = i11;
                }
            }
            if (str2 == null) {
                throw new C9208i("Bad transform function encountered in transform list: ".concat(str));
            }
            switch (str2) {
                case "matrix":
                    iVar.q();
                    float i13 = iVar.i();
                    iVar.p();
                    float i14 = iVar.i();
                    iVar.p();
                    float i15 = iVar.i();
                    iVar.p();
                    float i16 = iVar.i();
                    iVar.p();
                    float i17 = iVar.i();
                    iVar.p();
                    float i18 = iVar.i();
                    iVar.q();
                    if (!Float.isNaN(i18) && iVar.d(')')) {
                        Matrix matrix2 = new Matrix();
                        matrix2.setValues(new float[]{i13, i15, i17, i14, i16, i18, 0.0f, 0.0f, 1.0f});
                        matrix.preConcat(matrix2);
                        break;
                    } else {
                        throw new C9208i("Invalid transform list: ".concat(str));
                    }
                case "rotate":
                    iVar.q();
                    float i19 = iVar.i();
                    float o11 = iVar.o();
                    float o12 = iVar.o();
                    iVar.q();
                    if (Float.isNaN(i19) || !iVar.d(')')) {
                        throw new C9208i("Invalid transform list: ".concat(str));
                    }
                    if (Float.isNaN(o11)) {
                        matrix.preRotate(i19);
                        break;
                    } else if (!Float.isNaN(o12)) {
                        matrix.preRotate(i19, o11, o12);
                        break;
                    } else {
                        throw new C9208i("Invalid transform list: ".concat(str));
                    }
                case "scale":
                    iVar.q();
                    float i21 = iVar.i();
                    float o13 = iVar.o();
                    iVar.q();
                    if (!Float.isNaN(i21) && iVar.d(')')) {
                        if (!Float.isNaN(o13)) {
                            matrix.preScale(i21, o13);
                            break;
                        } else {
                            matrix.preScale(i21, i21);
                            break;
                        }
                    } else {
                        throw new C9208i("Invalid transform list: ".concat(str));
                    }
                    break;
                case "skewX":
                    iVar.q();
                    float i22 = iVar.i();
                    iVar.q();
                    if (!Float.isNaN(i22) && iVar.d(')')) {
                        matrix.preSkew((float) Math.tan(Math.toRadians(i22)), 0.0f);
                        break;
                    } else {
                        throw new C9208i("Invalid transform list: ".concat(str));
                    }
                    break;
                case "skewY":
                    iVar.q();
                    float i23 = iVar.i();
                    iVar.q();
                    if (!Float.isNaN(i23) && iVar.d(')')) {
                        matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians(i23)));
                        break;
                    } else {
                        throw new C9208i("Invalid transform list: ".concat(str));
                    }
                    break;
                case "translate":
                    iVar.q();
                    float i24 = iVar.i();
                    float o14 = iVar.o();
                    iVar.q();
                    if (!Float.isNaN(i24) && iVar.d(')')) {
                        if (!Float.isNaN(o14)) {
                            matrix.preTranslate(i24, o14);
                            break;
                        } else {
                            matrix.preTranslate(i24, 0.0f);
                            break;
                        }
                    } else {
                        throw new C9208i("Invalid transform list: ".concat(str));
                    }
                    break;
                default:
                    throw new C9208i(A0.b("Invalid transform list fn: ", str2, ")"));
            }
            if (iVar.f()) {
                return matrix;
            }
            iVar.p();
        }
        return matrix;
    }

    private void G(InputStream inputStream) throws C9208i {
        Log.d("SVGParser", "Falling back to SAX parser");
        try {
            SAXParserFactory newInstance = SAXParserFactory.newInstance();
            newInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            newInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = newInstance.newSAXParser().getXMLReader();
            f fVar = new f();
            xMLReader.setContentHandler(fVar);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", fVar);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e11) {
            throw new C9208i("Stream error", e11);
        } catch (ParserConfigurationException e12) {
            throw new C9208i("XML parser problem", e12);
        } catch (SAXException e13) {
            throw new C9208i("SVG parse error", e13);
        }
    }

    private void H(InputStream inputStream) throws C9208i {
        try {
            try {
                XmlPullParser newPullParser = Xml.newPullParser();
                C1414j c1414j = new C1414j(newPullParser);
                newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                newPullParser.setInput(inputStream, null);
                for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.nextToken()) {
                    if (eventType == 0) {
                        this.f83155a = new C9181g();
                    } else if (eventType == 8) {
                        Log.d("SVGParser", "PROC INSTR: " + newPullParser.getText());
                        i iVar = new i(newPullParser.getText());
                        String l11 = iVar.l();
                        E(iVar);
                        l11.equals("xml-stylesheet");
                    } else if (eventType != 10) {
                        if (eventType == 2) {
                            String name = newPullParser.getName();
                            if (newPullParser.getPrefix() != null) {
                                name = newPullParser.getPrefix() + ':' + name;
                            }
                            K(newPullParser.getNamespace(), newPullParser.getName(), name, c1414j);
                        } else if (eventType == 3) {
                            String name2 = newPullParser.getName();
                            if (newPullParser.getPrefix() != null) {
                                name2 = newPullParser.getPrefix() + ':' + name2;
                            }
                            h(newPullParser.getNamespace(), newPullParser.getName(), name2);
                        } else if (eventType == 4) {
                            int[] iArr = new int[2];
                            M(newPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                        } else if (eventType == 5) {
                            L(newPullParser.getText());
                        }
                    } else if (this.f83155a.j() == null && newPullParser.getText().contains("<!ENTITY ")) {
                        try {
                            Log.d("SVGParser", "Switching to SAX parser to process entities");
                            inputStream.reset();
                            G(inputStream);
                            return;
                        } catch (IOException unused) {
                            Log.w("SVGParser", "Detected internal entity definitions, but could not parse them.");
                            return;
                        }
                    }
                }
            } catch (IOException e11) {
                throw new C9208i("Stream error", e11);
            }
        } catch (XmlPullParserException e12) {
            throw new C9208i("XML parser problem", e12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x032e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void I(Attributes attributes) throws C9208i {
        float i11;
        float f7;
        char c11;
        float f11;
        float f12;
        float f13;
        float f14;
        char charAt;
        Attributes attributes2 = attributes;
        if (this.f83156b == null) {
            throw new C9208i("Invalid document. Root element must be <svg>");
        }
        C9181g.C9202v c9202v = new C9181g.C9202v();
        c9202v.f83013a = this.f83155a;
        c9202v.f83014b = this.f83156b;
        m(c9202v, attributes2);
        p(c9202v, attributes2);
        r(c9202v, attributes2);
        l(c9202v, attributes2);
        int i12 = 0;
        while (i12 < attributes2.getLength()) {
            String trim = attributes2.getValue(i12).trim();
            int i13 = a.f83165b[g.a(attributes2.getLocalName(i12)).ordinal()];
            float f15 = 0.0f;
            if (i13 == 8) {
                i iVar = new i(trim);
                C9181g.C9203w c9203w = new C9181g.C9203w();
                if (!iVar.f()) {
                    int intValue = iVar.h().intValue();
                    char c12 = 'm';
                    if (intValue == 77 || intValue == 109) {
                        float f16 = 0.0f;
                        float f17 = 0.0f;
                        float f18 = 0.0f;
                        float f19 = 0.0f;
                        float f21 = 0.0f;
                        float f22 = 0.0f;
                        while (true) {
                            iVar.q();
                            float f23 = f15;
                            switch (intValue) {
                                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                                case 97:
                                    float i14 = iVar.i();
                                    float f24 = f18;
                                    float c13 = iVar.c(i14);
                                    float c14 = iVar.c(c13);
                                    Boolean b11 = iVar.b(Float.valueOf(c14));
                                    Boolean b12 = iVar.b(b11);
                                    if (b12 == null) {
                                        i11 = Float.NaN;
                                    } else {
                                        iVar.p();
                                        i11 = iVar.i();
                                    }
                                    float f25 = i11;
                                    float c15 = iVar.c(f25);
                                    if (!Float.isNaN(c15) && i14 >= f23 && c13 >= f23) {
                                        if (intValue == 97) {
                                            c15 += f24;
                                            f7 = f25 + f16;
                                        } else {
                                            f7 = f25;
                                        }
                                        boolean booleanValue = b11.booleanValue();
                                        boolean booleanValue2 = b12.booleanValue();
                                        float f26 = c15;
                                        c11 = 'm';
                                        c9203w.e(i14, c13, c14, booleanValue, booleanValue2, f7, f26);
                                        f16 = f7;
                                        f17 = f16;
                                        f18 = f26;
                                        f19 = f18;
                                        iVar.p();
                                        if (!iVar.f()) {
                                            break;
                                        } else {
                                            int i15 = iVar.f83182b;
                                            if (i15 != iVar.f83183c && (((charAt = iVar.f83181a.charAt(i15)) >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z'))) {
                                                intValue = iVar.h().intValue();
                                            }
                                            f15 = f23;
                                            c12 = c11;
                                        }
                                    }
                                    break;
                                case 67:
                                case Logger.NONE /* 99 */:
                                    float i16 = iVar.i();
                                    float c16 = iVar.c(i16);
                                    float c17 = iVar.c(c16);
                                    float c18 = iVar.c(c17);
                                    float c19 = iVar.c(c18);
                                    float c21 = iVar.c(c19);
                                    if (Float.isNaN(c21)) {
                                        Log.e("SVGParser", "Bad path coords for " + ((char) intValue) + " path segment");
                                        break;
                                    } else {
                                        if (intValue == 99) {
                                            c19 += f16;
                                            c21 += f18;
                                            i16 += f16;
                                            c16 += f18;
                                            c17 += f16;
                                            c18 += f18;
                                        }
                                        float f27 = c16;
                                        f11 = c17;
                                        f12 = c18;
                                        f13 = c21;
                                        f14 = c19;
                                        c9203w.c(i16, f27, f11, f12, f14, f13);
                                        f17 = f11;
                                        f19 = f12;
                                        f16 = f14;
                                        f18 = f13;
                                        c11 = 'm';
                                        iVar.p();
                                        if (!iVar.f()) {
                                        }
                                    }
                                    break;
                                case 72:
                                case 104:
                                    float i17 = iVar.i();
                                    if (Float.isNaN(i17)) {
                                        Log.e("SVGParser", "Bad path coords for " + ((char) intValue) + " path segment");
                                        break;
                                    } else {
                                        if (intValue == 104) {
                                            i17 += f16;
                                        }
                                        f16 = i17;
                                        c9203w.b(f16, f18);
                                        f17 = f16;
                                        c11 = c12;
                                        iVar.p();
                                        if (!iVar.f()) {
                                        }
                                    }
                                    break;
                                case 76:
                                case 108:
                                    float i18 = iVar.i();
                                    float c22 = iVar.c(i18);
                                    if (Float.isNaN(c22)) {
                                        Log.e("SVGParser", "Bad path coords for " + ((char) intValue) + " path segment");
                                        break;
                                    } else {
                                        if (intValue == 108) {
                                            i18 += f16;
                                            c22 += f18;
                                        }
                                        f16 = i18;
                                        f18 = c22;
                                        c9203w.b(f16, f18);
                                        f17 = f16;
                                        f19 = f18;
                                        c11 = c12;
                                        iVar.p();
                                        if (!iVar.f()) {
                                        }
                                    }
                                    break;
                                case 77:
                                case 109:
                                    float i19 = iVar.i();
                                    float c23 = iVar.c(i19);
                                    if (Float.isNaN(c23)) {
                                        Log.e("SVGParser", "Bad path coords for " + ((char) intValue) + " path segment");
                                        break;
                                    } else {
                                        c12 = 'm';
                                        if (intValue == 109 && !c9203w.i()) {
                                            i19 += f16;
                                            c23 += f18;
                                        }
                                        f16 = i19;
                                        f18 = c23;
                                        c9203w.a(f16, f18);
                                        f17 = f16;
                                        f21 = f17;
                                        f19 = f18;
                                        f22 = f19;
                                        intValue = intValue != 109 ? 76 : 108;
                                        c11 = c12;
                                        iVar.p();
                                        if (!iVar.f()) {
                                        }
                                    }
                                    break;
                                case 81:
                                case 113:
                                    f17 = iVar.i();
                                    f19 = iVar.c(f17);
                                    float c24 = iVar.c(f19);
                                    float c25 = iVar.c(c24);
                                    if (Float.isNaN(c25)) {
                                        Log.e("SVGParser", "Bad path coords for " + ((char) intValue) + " path segment");
                                        break;
                                    } else {
                                        if (intValue == 113) {
                                            c24 += f16;
                                            c25 += f18;
                                            f17 += f16;
                                            f19 += f18;
                                        }
                                        f16 = c24;
                                        f18 = c25;
                                        c9203w.d(f17, f19, f16, f18);
                                        c11 = 'm';
                                        iVar.p();
                                        if (!iVar.f()) {
                                        }
                                    }
                                    break;
                                case 83:
                                case 115:
                                    float f28 = (f16 * 2.0f) - f17;
                                    float f29 = (f18 * 2.0f) - f19;
                                    f11 = iVar.i();
                                    float c26 = iVar.c(f11);
                                    float c27 = iVar.c(c26);
                                    float c28 = iVar.c(c27);
                                    if (Float.isNaN(c28)) {
                                        Log.e("SVGParser", "Bad path coords for " + ((char) intValue) + " path segment");
                                        break;
                                    } else {
                                        if (intValue == 115) {
                                            c27 += f16;
                                            c28 += f18;
                                            f11 += f16;
                                            c26 += f18;
                                        }
                                        f12 = c26;
                                        f13 = c28;
                                        f14 = c27;
                                        c9203w.c(f28, f29, f11, f12, f14, f13);
                                        f17 = f11;
                                        f19 = f12;
                                        f16 = f14;
                                        f18 = f13;
                                        c11 = 'm';
                                        iVar.p();
                                        if (!iVar.f()) {
                                        }
                                    }
                                    break;
                                case 84:
                                case 116:
                                    f17 = (f16 * 2.0f) - f17;
                                    f19 = (f18 * 2.0f) - f19;
                                    float i21 = iVar.i();
                                    float c29 = iVar.c(i21);
                                    if (Float.isNaN(c29)) {
                                        Log.e("SVGParser", "Bad path coords for " + ((char) intValue) + " path segment");
                                        break;
                                    } else {
                                        if (intValue == 116) {
                                            i21 += f16;
                                            c29 += f18;
                                        }
                                        f16 = i21;
                                        f18 = c29;
                                        c9203w.d(f17, f19, f16, f18);
                                        c11 = c12;
                                        iVar.p();
                                        if (!iVar.f()) {
                                        }
                                    }
                                    break;
                                case 86:
                                case 118:
                                    float i22 = iVar.i();
                                    if (Float.isNaN(i22)) {
                                        Log.e("SVGParser", "Bad path coords for " + ((char) intValue) + " path segment");
                                        break;
                                    } else {
                                        if (intValue == 118) {
                                            i22 += f18;
                                        }
                                        f18 = i22;
                                        c9203w.b(f16, f18);
                                        f19 = f18;
                                        c11 = c12;
                                        iVar.p();
                                        if (!iVar.f()) {
                                        }
                                    }
                                    break;
                                case 90:
                                case 122:
                                    c9203w.close();
                                    c11 = c12;
                                    f16 = f21;
                                    f17 = f16;
                                    f18 = f22;
                                    f19 = f18;
                                    iVar.p();
                                    if (!iVar.f()) {
                                    }
                                    break;
                            }
                        }
                    }
                }
                c9202v.f83092o = c9203w;
            } else if (i13 == 9 && v(trim) < 0.0f) {
                throw new C9208i("Invalid <path> element. pathLength cannot be negative");
            }
            i12++;
            attributes2 = attributes;
        }
        this.f83156b.i(c9202v);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void J(C9181g.E e11, String str, String str2) {
        C9181g.C9196p c9196p;
        C9181g.C9196p j11;
        C9181g.C9196p c9196p2;
        String substring;
        C9181g.E.b bVar;
        C9181g.E.EnumC1411g enumC1411g;
        C9181g.E.f fVar;
        Boolean bool;
        C9181g.C9184c c9184c;
        C9181g.E.e eVar;
        if (str2.length() == 0 || str2.equals("inherit")) {
            return;
        }
        try {
            switch (a.f83165b[g.a(str).ordinal()]) {
                case 47:
                    C9181g.O C11 = C(str2);
                    e11.f82964b = C11;
                    if (C11 != null) {
                        e11.f82963a |= 1;
                        break;
                    }
                    break;
                case 48:
                    C9181g.E.a aVar = "nonzero".equals(str2) ? C9181g.E.a.NonZero : "evenodd".equals(str2) ? C9181g.E.a.EvenOdd : null;
                    e11.f82965c = aVar;
                    if (aVar != null) {
                        e11.f82963a |= 2;
                        break;
                    }
                    break;
                case 49:
                    Float B11 = B(str2);
                    e11.f82966d = B11;
                    if (B11 != null) {
                        e11.f82963a |= 4;
                        break;
                    }
                    break;
                case 50:
                    C9181g.O C12 = C(str2);
                    e11.f82967e = C12;
                    if (C12 != null) {
                        e11.f82963a |= 8;
                        break;
                    }
                    break;
                case 51:
                    Float B12 = B(str2);
                    e11.f82968f = B12;
                    if (B12 != null) {
                        e11.f82963a |= 16;
                        break;
                    }
                    break;
                case 52:
                    e11.f82969g = y(str2);
                    e11.f82963a |= 32;
                    break;
                case 53:
                    C9181g.E.c cVar = "butt".equals(str2) ? C9181g.E.c.Butt : "round".equals(str2) ? C9181g.E.c.Round : "square".equals(str2) ? C9181g.E.c.Square : null;
                    e11.f82970h = cVar;
                    if (cVar != null) {
                        e11.f82963a |= 64;
                        break;
                    }
                    break;
                case 54:
                    C9181g.E.d dVar = "miter".equals(str2) ? C9181g.E.d.Miter : "round".equals(str2) ? C9181g.E.d.Round : "bevel".equals(str2) ? C9181g.E.d.Bevel : null;
                    e11.f82971i = dVar;
                    if (dVar != null) {
                        e11.f82963a |= 128;
                        break;
                    }
                    break;
                case 55:
                    e11.f82972j = Float.valueOf(v(str2));
                    e11.f82963a |= 256;
                    break;
                case 56:
                    if (!DevicePublicKeyStringDef.NONE.equals(str2)) {
                        C9181g.C9196p[] c9196pArr = null;
                        i iVar = new i(str2);
                        iVar.q();
                        if (!iVar.f() && (j11 = iVar.j()) != null && !j11.f()) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(j11);
                            float f7 = j11.f83074a;
                            while (true) {
                                if (!iVar.f()) {
                                    iVar.p();
                                    C9181g.C9196p j12 = iVar.j();
                                    if (j12 != null && !j12.f()) {
                                        arrayList.add(j12);
                                        f7 += j12.f83074a;
                                    }
                                } else if (f7 != 0.0f) {
                                    c9196pArr = (C9181g.C9196p[]) arrayList.toArray(new C9181g.C9196p[arrayList.size()]);
                                }
                            }
                        }
                        e11.f82973k = c9196pArr;
                        if (c9196pArr != null) {
                            e11.f82963a |= 512;
                            break;
                        }
                    } else {
                        e11.f82973k = null;
                        e11.f82963a |= 512;
                        break;
                    }
                    break;
                case 57:
                    e11.f82974l = y(str2);
                    e11.f82963a |= 1024;
                    break;
                case 58:
                    e11.f82975m = B(str2);
                    e11.f82963a |= 2048;
                    break;
                case 59:
                    e11.f82976n = t(str2);
                    e11.f82963a |= 4096;
                    break;
                case 60:
                    if ("|caption|icon|menu|message-box|small-caption|status-bar|".contains("|" + str2 + '|')) {
                        i iVar2 = new i(str2);
                        Integer num = null;
                        C9181g.E.b bVar2 = null;
                        String str3 = null;
                        while (true) {
                            String m11 = iVar2.m('/', false);
                            iVar2.q();
                            if (m11 != null) {
                                if (num == null || bVar2 == null) {
                                    if (!m11.equals("normal") && (num != null || (num = e.a(m11)) == null)) {
                                        if (bVar2 == null) {
                                            switch (m11) {
                                                case "oblique":
                                                    bVar2 = C9181g.E.b.Oblique;
                                                    break;
                                                case "italic":
                                                    bVar2 = C9181g.E.b.Italic;
                                                    break;
                                                case "normal":
                                                    bVar2 = C9181g.E.b.Normal;
                                                    break;
                                                default:
                                                    bVar2 = null;
                                                    break;
                                            }
                                            if (bVar2 != null) {
                                                continue;
                                            }
                                        }
                                        if (str3 == null && m11.equals("small-caps")) {
                                            str3 = m11;
                                        }
                                    }
                                }
                                try {
                                    c9196p2 = d.a(m11);
                                    if (c9196p2 == null) {
                                        c9196p2 = y(m11);
                                    }
                                } catch (C9208i unused) {
                                    c9196p2 = null;
                                }
                                if (iVar2.d('/')) {
                                    iVar2.q();
                                    String l11 = iVar2.l();
                                    if (l11 != null) {
                                        y(l11);
                                    }
                                    iVar2.q();
                                }
                                if (iVar2.f()) {
                                    substring = null;
                                } else {
                                    int i11 = iVar2.f83182b;
                                    iVar2.f83182b = iVar2.f83183c;
                                    substring = iVar2.f83181a.substring(i11);
                                }
                                e11.f82977o = w(substring);
                                e11.f82978p = c9196p2;
                                e11.f82979q = Integer.valueOf(num == null ? 400 : num.intValue());
                                if (bVar2 == null) {
                                    bVar2 = C9181g.E.b.Normal;
                                }
                                e11.f82980r = bVar2;
                                e11.f82963a |= 122880;
                                break;
                            } else {
                                break;
                            }
                        }
                    }
                    break;
                case 61:
                    ArrayList w11 = w(str2);
                    e11.f82977o = w11;
                    if (w11 != null) {
                        e11.f82963a |= 8192;
                        break;
                    }
                    break;
                case 62:
                    try {
                        C9181g.C9196p a11 = d.a(str2);
                        c9196p = a11 == null ? y(str2) : a11;
                    } catch (C9208i unused2) {
                        c9196p = null;
                    }
                    e11.f82978p = c9196p;
                    if (c9196p != null) {
                        e11.f82963a |= 16384;
                        break;
                    }
                    break;
                case 63:
                    Integer a12 = e.a(str2);
                    e11.f82979q = a12;
                    if (a12 != null) {
                        e11.f82963a |= 32768;
                        break;
                    }
                    break;
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    switch (str2) {
                        case "oblique":
                            bVar = C9181g.E.b.Oblique;
                            break;
                        case "italic":
                            bVar = C9181g.E.b.Italic;
                            break;
                        case "normal":
                            bVar = C9181g.E.b.Normal;
                            break;
                        default:
                            bVar = null;
                            break;
                    }
                    e11.f82980r = bVar;
                    if (bVar != null) {
                        e11.f82963a |= 65536;
                        break;
                    }
                    break;
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    switch (str2) {
                        case "line-through":
                            enumC1411g = C9181g.E.EnumC1411g.LineThrough;
                            break;
                        case "underline":
                            enumC1411g = C9181g.E.EnumC1411g.Underline;
                            break;
                        case "none":
                            enumC1411g = C9181g.E.EnumC1411g.None;
                            break;
                        case "blink":
                            enumC1411g = C9181g.E.EnumC1411g.Blink;
                            break;
                        case "overline":
                            enumC1411g = C9181g.E.EnumC1411g.Overline;
                            break;
                        default:
                            enumC1411g = null;
                            break;
                    }
                    e11.f82981s = enumC1411g;
                    if (enumC1411g != null) {
                        e11.f82963a |= 131072;
                        break;
                    }
                    break;
                case 66:
                    C9181g.E.h hVar = !str2.equals("ltr") ? !str2.equals("rtl") ? null : C9181g.E.h.RTL : C9181g.E.h.LTR;
                    e11.f82982t = hVar;
                    if (hVar != null) {
                        e11.f82963a |= 68719476736L;
                        break;
                    }
                    break;
                case 67:
                    switch (str2) {
                        case "middle":
                            fVar = C9181g.E.f.Middle;
                            break;
                        case "end":
                            fVar = C9181g.E.f.End;
                            break;
                        case "start":
                            fVar = C9181g.E.f.Start;
                            break;
                        default:
                            fVar = null;
                            break;
                    }
                    e11.f82983u = fVar;
                    if (fVar != null) {
                        e11.f82963a |= 262144;
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
                        default:
                            bool = null;
                            break;
                    }
                    e11.f82984v = bool;
                    if (bool != null) {
                        e11.f82963a |= 524288;
                        break;
                    }
                    break;
                case 69:
                    String x11 = x(str2);
                    e11.f82986x = x11;
                    e11.f82987y = x11;
                    e11.f82988z = x11;
                    e11.f82963a |= 14680064;
                    break;
                case 70:
                    e11.f82986x = x(str2);
                    e11.f82963a |= 2097152;
                    break;
                case 71:
                    e11.f82987y = x(str2);
                    e11.f82963a |= 4194304;
                    break;
                case 72:
                    e11.f82988z = x(str2);
                    e11.f82963a |= 8388608;
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 73 */:
                    if (str2.indexOf(124) < 0) {
                        if ("|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".contains("|" + str2 + '|')) {
                            e11.f82950A = Boolean.valueOf(!str2.equals(DevicePublicKeyStringDef.NONE));
                            e11.f82963a |= 16777216;
                            break;
                        }
                    }
                    break;
                case 74:
                    if (str2.indexOf(124) < 0) {
                        if ("|visible|hidden|collapse|".contains("|" + str2 + '|')) {
                            e11.f82951B = Boolean.valueOf(str2.equals("visible"));
                            e11.f82963a |= 33554432;
                            break;
                        }
                    }
                    break;
                case 75:
                    if (str2.equals("currentColor")) {
                        e11.f82952C = C9181g.C1412g.a();
                    } else {
                        try {
                            e11.f82952C = t(str2);
                        } catch (C9208i e12) {
                            Log.w("SVGParser", e12.getMessage());
                            return;
                        }
                    }
                    e11.f82963a |= 67108864;
                    break;
                case 76:
                    e11.f82953D = B(str2);
                    e11.f82963a |= 134217728;
                    break;
                case 77:
                    if (!"auto".equals(str2) && str2.startsWith("rect(")) {
                        i iVar3 = new i(str2.substring(5));
                        iVar3.q();
                        C9181g.C9196p A11 = A(iVar3);
                        iVar3.p();
                        C9181g.C9196p A12 = A(iVar3);
                        iVar3.p();
                        C9181g.C9196p A13 = A(iVar3);
                        iVar3.p();
                        C9181g.C9196p A14 = A(iVar3);
                        iVar3.q();
                        if (iVar3.d(')') || iVar3.f()) {
                            C9181g.C9184c c9184c2 = new C9181g.C9184c();
                            c9184c2.f83038a = A11;
                            c9184c2.f83039b = A12;
                            c9184c2.f83040c = A13;
                            c9184c2.f83041d = A14;
                            c9184c = c9184c2;
                            e11.f82985w = c9184c;
                            if (c9184c == null) {
                                e11.f82963a |= W2.MAX_EVENT_SIZE_BYTES;
                                break;
                            }
                        }
                    }
                    c9184c = null;
                    e11.f82985w = c9184c;
                    if (c9184c == null) {
                    }
                    break;
                case 78:
                    e11.f82954E = x(str2);
                    e11.f82963a |= 268435456;
                    break;
                case 79:
                    e11.f82955F = "nonzero".equals(str2) ? C9181g.E.a.NonZero : "evenodd".equals(str2) ? C9181g.E.a.EvenOdd : null;
                    e11.f82963a |= 536870912;
                    break;
                case 80:
                    e11.f82956G = x(str2);
                    e11.f82963a |= 1073741824;
                    break;
                case 81:
                    if (str2.equals("currentColor")) {
                        e11.f82957H = C9181g.C1412g.a();
                    } else {
                        try {
                            e11.f82957H = t(str2);
                        } catch (C9208i e13) {
                            Log.w("SVGParser", e13.getMessage());
                            return;
                        }
                    }
                    e11.f82963a |= 2147483648L;
                    break;
                case 82:
                    e11.f82958I = B(str2);
                    e11.f82963a |= 4294967296L;
                    break;
                case 83:
                    if (str2.equals("currentColor")) {
                        e11.f82959J = C9181g.C1412g.a();
                    } else {
                        try {
                            e11.f82959J = t(str2);
                        } catch (C9208i e14) {
                            Log.w("SVGParser", e14.getMessage());
                            return;
                        }
                    }
                    e11.f82963a |= 8589934592L;
                    break;
                case 84:
                    e11.f82960K = B(str2);
                    e11.f82963a |= 17179869184L;
                    break;
                case 85:
                    C9181g.E.i iVar4 = !str2.equals(DevicePublicKeyStringDef.NONE) ? !str2.equals("non-scaling-stroke") ? null : C9181g.E.i.NonScalingStroke : C9181g.E.i.None;
                    e11.f82961L = iVar4;
                    if (iVar4 != null) {
                        e11.f82963a |= 34359738368L;
                        break;
                    }
                    break;
                case 86:
                    switch (str2) {
                        case "optimizeQuality":
                            eVar = C9181g.E.e.optimizeQuality;
                            break;
                        case "auto":
                            eVar = C9181g.E.e.auto;
                            break;
                        case "optimizeSpeed":
                            eVar = C9181g.E.e.optimizeSpeed;
                            break;
                        default:
                            eVar = null;
                            break;
                    }
                    e11.f82962M = eVar;
                    if (eVar != null) {
                        e11.f82963a |= 137438953472L;
                        break;
                    }
                    break;
            }
        } catch (C9208i unused3) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0342, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0563, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void K(String str, String str2, String str3, Attributes attributes) throws C9208i {
        boolean z11;
        if (this.f83157c) {
            this.f83158d++;
            return;
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            h a11 = h.a(str2.length() > 0 ? str2 : str3);
            switch (a.f83164a[a11.ordinal()]) {
                case 1:
                    C9181g.F f7 = new C9181g.F();
                    f7.f83013a = this.f83155a;
                    f7.f83014b = this.f83156b;
                    m(f7, attributes);
                    p(f7, attributes);
                    l(f7, attributes);
                    s(f7, attributes);
                    for (int i11 = 0; i11 < attributes.getLength(); i11++) {
                        String trim = attributes.getValue(i11).trim();
                        int i12 = a.f83165b[g.a(attributes.getLocalName(i11)).ordinal()];
                        if (i12 == 1) {
                            f7.f82989p = y(trim);
                        } else if (i12 == 2) {
                            f7.f82990q = y(trim);
                        } else if (i12 == 3) {
                            C9181g.C9196p y11 = y(trim);
                            f7.f82991r = y11;
                            if (y11.f()) {
                                throw new C9208i("Invalid <svg> element. width cannot be negative");
                            }
                        } else if (i12 != 4) {
                            continue;
                        } else {
                            C9181g.C9196p y12 = y(trim);
                            f7.f82992s = y12;
                            if (y12.f()) {
                                throw new C9208i("Invalid <svg> element. height cannot be negative");
                            }
                        }
                    }
                    C9181g.J j11 = this.f83156b;
                    if (j11 == null) {
                        this.f83155a.q(f7);
                    } else {
                        j11.i(f7);
                    }
                    this.f83156b = f7;
                    return;
                case 2:
                case 3:
                    if (this.f83156b == null) {
                        throw new C9208i("Invalid document. Root element must be <svg>");
                    }
                    C9181g.C9193m c9193m = new C9181g.C9193m();
                    c9193m.f83013a = this.f83155a;
                    c9193m.f83014b = this.f83156b;
                    m(c9193m, attributes);
                    p(c9193m, attributes);
                    r(c9193m, attributes);
                    l(c9193m, attributes);
                    this.f83156b.i(c9193m);
                    this.f83156b = c9193m;
                    return;
                case 4:
                    if (this.f83156b == null) {
                        throw new C9208i("Invalid document. Root element must be <svg>");
                    }
                    C9181g.C9188h c9188h = new C9181g.C9188h();
                    c9188h.f83013a = this.f83155a;
                    c9188h.f83014b = this.f83156b;
                    m(c9188h, attributes);
                    p(c9188h, attributes);
                    r(c9188h, attributes);
                    this.f83156b.i(c9188h);
                    this.f83156b = c9188h;
                    return;
                case 5:
                    if (this.f83156b == null) {
                        throw new C9208i("Invalid document. Root element must be <svg>");
                    }
                    C9181g.e0 e0Var = new C9181g.e0();
                    e0Var.f83013a = this.f83155a;
                    e0Var.f83014b = this.f83156b;
                    m(e0Var, attributes);
                    p(e0Var, attributes);
                    r(e0Var, attributes);
                    l(e0Var, attributes);
                    for (int i13 = 0; i13 < attributes.getLength(); i13++) {
                        String trim2 = attributes.getValue(i13).trim();
                        int i14 = a.f83165b[g.a(attributes.getLocalName(i13)).ordinal()];
                        if (i14 == 1) {
                            e0Var.f83049p = y(trim2);
                        } else if (i14 == 2) {
                            e0Var.f83050q = y(trim2);
                        } else if (i14 == 3) {
                            C9181g.C9196p y13 = y(trim2);
                            e0Var.f83051r = y13;
                            if (y13.f()) {
                                throw new C9208i("Invalid <use> element. width cannot be negative");
                            }
                        } else if (i14 == 4) {
                            C9181g.C9196p y14 = y(trim2);
                            e0Var.f83052s = y14;
                            if (y14.f()) {
                                throw new C9208i("Invalid <use> element. height cannot be negative");
                            }
                        } else if (i14 == 6 && ("".equals(attributes.getURI(i13)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i13)))) {
                            e0Var.f83048o = trim2;
                        }
                    }
                    this.f83156b.i(e0Var);
                    this.f83156b = e0Var;
                    return;
                case 6:
                    I(attributes);
                    return;
                case 7:
                    if (this.f83156b == null) {
                        throw new C9208i("Invalid document. Root element must be <svg>");
                    }
                    C9181g.B b11 = new C9181g.B();
                    b11.f83013a = this.f83155a;
                    b11.f83014b = this.f83156b;
                    m(b11, attributes);
                    p(b11, attributes);
                    r(b11, attributes);
                    l(b11, attributes);
                    for (int i15 = 0; i15 < attributes.getLength(); i15++) {
                        String trim3 = attributes.getValue(i15).trim();
                        int i16 = a.f83165b[g.a(attributes.getLocalName(i15)).ordinal()];
                        if (i16 == 1) {
                            b11.f82943o = y(trim3);
                        } else if (i16 == 2) {
                            b11.f82944p = y(trim3);
                        } else if (i16 == 3) {
                            C9181g.C9196p y15 = y(trim3);
                            b11.f82945q = y15;
                            if (y15.f()) {
                                throw new C9208i("Invalid <rect> element. width cannot be negative");
                            }
                        } else if (i16 == 4) {
                            C9181g.C9196p y16 = y(trim3);
                            b11.f82946r = y16;
                            if (y16.f()) {
                                throw new C9208i("Invalid <rect> element. height cannot be negative");
                            }
                        } else if (i16 == 10) {
                            C9181g.C9196p y17 = y(trim3);
                            b11.f82947s = y17;
                            if (y17.f()) {
                                throw new C9208i("Invalid <rect> element. rx cannot be negative");
                            }
                        } else if (i16 != 11) {
                            continue;
                        } else {
                            C9181g.C9196p y18 = y(trim3);
                            b11.f82948t = y18;
                            if (y18.f()) {
                                throw new C9208i("Invalid <rect> element. ry cannot be negative");
                            }
                        }
                    }
                    this.f83156b.i(b11);
                    return;
                case 8:
                    if (this.f83156b == null) {
                        throw new C9208i("Invalid document. Root element must be <svg>");
                    }
                    C9181g.C9185d c9185d = new C9181g.C9185d();
                    c9185d.f83013a = this.f83155a;
                    c9185d.f83014b = this.f83156b;
                    m(c9185d, attributes);
                    p(c9185d, attributes);
                    r(c9185d, attributes);
                    l(c9185d, attributes);
                    for (int i17 = 0; i17 < attributes.getLength(); i17++) {
                        String trim4 = attributes.getValue(i17).trim();
                        switch (a.f83165b[g.a(attributes.getLocalName(i17)).ordinal()]) {
                            case 12:
                                c9185d.f83043o = y(trim4);
                                break;
                            case 13:
                                c9185d.f83044p = y(trim4);
                                break;
                            case 14:
                                C9181g.C9196p y19 = y(trim4);
                                c9185d.f83045q = y19;
                                if (y19.f()) {
                                    throw new C9208i("Invalid <circle> element. r cannot be negative");
                                }
                                break;
                        }
                    }
                    this.f83156b.i(c9185d);
                    return;
                case 9:
                    if (this.f83156b == null) {
                        throw new C9208i("Invalid document. Root element must be <svg>");
                    }
                    C9181g.C9189i c9189i = new C9181g.C9189i();
                    c9189i.f83013a = this.f83155a;
                    c9189i.f83014b = this.f83156b;
                    m(c9189i, attributes);
                    p(c9189i, attributes);
                    r(c9189i, attributes);
                    l(c9189i, attributes);
                    for (int i18 = 0; i18 < attributes.getLength(); i18++) {
                        String trim5 = attributes.getValue(i18).trim();
                        switch (a.f83165b[g.a(attributes.getLocalName(i18)).ordinal()]) {
                            case 10:
                                C9181g.C9196p y21 = y(trim5);
                                c9189i.f83059q = y21;
                                if (y21.f()) {
                                    throw new C9208i("Invalid <ellipse> element. rx cannot be negative");
                                }
                                break;
                            case 11:
                                C9181g.C9196p y22 = y(trim5);
                                c9189i.f83060r = y22;
                                if (y22.f()) {
                                    throw new C9208i("Invalid <ellipse> element. ry cannot be negative");
                                }
                                break;
                            case 12:
                                c9189i.f83057o = y(trim5);
                                break;
                            case 13:
                                c9189i.f83058p = y(trim5);
                                break;
                        }
                    }
                    this.f83156b.i(c9189i);
                    return;
                case 10:
                    if (this.f83156b == null) {
                        throw new C9208i("Invalid document. Root element must be <svg>");
                    }
                    C9181g.C9197q c9197q = new C9181g.C9197q();
                    c9197q.f83013a = this.f83155a;
                    c9197q.f83014b = this.f83156b;
                    m(c9197q, attributes);
                    p(c9197q, attributes);
                    r(c9197q, attributes);
                    l(c9197q, attributes);
                    for (int i19 = 0; i19 < attributes.getLength(); i19++) {
                        String trim6 = attributes.getValue(i19).trim();
                        switch (a.f83165b[g.a(attributes.getLocalName(i19)).ordinal()]) {
                            case 15:
                                c9197q.f83076o = y(trim6);
                                break;
                            case 16:
                                c9197q.f83077p = y(trim6);
                                break;
                            case 17:
                                c9197q.f83078q = y(trim6);
                                break;
                            case 18:
                                c9197q.f83079r = y(trim6);
                                break;
                        }
                    }
                    this.f83156b.i(c9197q);
                    return;
                case 11:
                    if (this.f83156b == null) {
                        throw new C9208i("Invalid document. Root element must be <svg>");
                    }
                    C9181g.C9206z c9206z = new C9181g.C9206z();
                    c9206z.f83013a = this.f83155a;
                    c9206z.f83014b = this.f83156b;
                    m(c9206z, attributes);
                    p(c9206z, attributes);
                    r(c9206z, attributes);
                    l(c9206z, attributes);
                    o(c9206z, attributes, "polyline");
                    this.f83156b.i(c9206z);
                    return;
                case 12:
                    if (this.f83156b == null) {
                        throw new C9208i("Invalid document. Root element must be <svg>");
                    }
                    C9181g.A a12 = new C9181g.A();
                    a12.f83013a = this.f83155a;
                    a12.f83014b = this.f83156b;
                    m(a12, attributes);
                    p(a12, attributes);
                    r(a12, attributes);
                    l(a12, attributes);
                    o(a12, attributes, "polygon");
                    this.f83156b.i(a12);
                    return;
                case 13:
                    if (this.f83156b == null) {
                        throw new C9208i("Invalid document. Root element must be <svg>");
                    }
                    C9181g.W w11 = new C9181g.W();
                    w11.f83013a = this.f83155a;
                    w11.f83014b = this.f83156b;
                    m(w11, attributes);
                    p(w11, attributes);
                    r(w11, attributes);
                    l(w11, attributes);
                    q(w11, attributes);
                    this.f83156b.i(w11);
                    this.f83156b = w11;
                    return;
                case 14:
                    C9181g.J j12 = this.f83156b;
                    if (j12 == null) {
                        throw new C9208i("Invalid document. Root element must be <svg>");
                    }
                    if (!(j12 instanceof C9181g.Y)) {
                        throw new C9208i("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
                    }
                    C9181g.V v11 = new C9181g.V();
                    v11.f83013a = this.f83155a;
                    v11.f83014b = this.f83156b;
                    m(v11, attributes);
                    p(v11, attributes);
                    l(v11, attributes);
                    q(v11, attributes);
                    this.f83156b.i(v11);
                    this.f83156b = v11;
                    C9181g.J j13 = v11.f83014b;
                    if (j13 instanceof C9181g.b0) {
                        v11.o((C9181g.b0) j13);
                        return;
                    } else {
                        v11.o(((C9181g.X) j13).b());
                        return;
                    }
                case 15:
                    C9181g.J j14 = this.f83156b;
                    if (j14 == null) {
                        throw new C9208i("Invalid document. Root element must be <svg>");
                    }
                    if (!(j14 instanceof C9181g.Y)) {
                        throw new C9208i("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
                    }
                    C9181g.U u11 = new C9181g.U();
                    u11.f83013a = this.f83155a;
                    u11.f83014b = this.f83156b;
                    m(u11, attributes);
                    p(u11, attributes);
                    l(u11, attributes);
                    for (int i21 = 0; i21 < attributes.getLength(); i21++) {
                        String trim7 = attributes.getValue(i21).trim();
                        if (a.f83165b[g.a(attributes.getLocalName(i21)).ordinal()] == 6 && ("".equals(attributes.getURI(i21)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i21)))) {
                            u11.f83022n = trim7;
                        }
                    }
                    this.f83156b.i(u11);
                    C9181g.J j15 = u11.f83014b;
                    if (j15 instanceof C9181g.b0) {
                        u11.o((C9181g.b0) j15);
                        return;
                    } else {
                        u11.o(((C9181g.X) j15).b());
                        return;
                    }
                case 16:
                    if (this.f83156b == null) {
                        throw new C9208i("Invalid document. Root element must be <svg>");
                    }
                    C9181g.S s11 = new C9181g.S();
                    s11.f83013a = this.f83155a;
                    s11.f83014b = this.f83156b;
                    m(s11, attributes);
                    p(s11, attributes);
                    r(s11, attributes);
                    l(s11, attributes);
                    this.f83156b.i(s11);
                    this.f83156b = s11;
                    return;
                case 17:
                    if (this.f83156b == null) {
                        throw new C9208i("Invalid document. Root element must be <svg>");
                    }
                    C9181g.T t2 = new C9181g.T();
                    t2.f83013a = this.f83155a;
                    t2.f83014b = this.f83156b;
                    m(t2, attributes);
                    p(t2, attributes);
                    l(t2, attributes);
                    s(t2, attributes);
                    this.f83156b.i(t2);
                    this.f83156b = t2;
                    return;
                case 18:
                    if (this.f83156b == null) {
                        throw new C9208i("Invalid document. Root element must be <svg>");
                    }
                    C9181g.C9198r c9198r = new C9181g.C9198r();
                    c9198r.f83013a = this.f83155a;
                    c9198r.f83014b = this.f83156b;
                    m(c9198r, attributes);
                    p(c9198r, attributes);
                    l(c9198r, attributes);
                    s(c9198r, attributes);
                    for (int i22 = 0; i22 < attributes.getLength(); i22++) {
                        String trim8 = attributes.getValue(i22).trim();
                        switch (a.f83165b[g.a(attributes.getLocalName(i22)).ordinal()]) {
                            case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                                c9198r.f83081q = y(trim8);
                                continue;
                            case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                                c9198r.f83082r = y(trim8);
                                continue;
                            case 28:
                                C9181g.C9196p y23 = y(trim8);
                                c9198r.f83083s = y23;
                                if (y23.f()) {
                                    throw new C9208i("Invalid <marker> element. markerWidth cannot be negative");
                                }
                                continue;
                            case 29:
                                C9181g.C9196p y24 = y(trim8);
                                c9198r.f83084t = y24;
                                if (y24.f()) {
                                    throw new C9208i("Invalid <marker> element. markerHeight cannot be negative");
                                }
                                continue;
                            case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                                if ("strokeWidth".equals(trim8)) {
                                    c9198r.f83080p = false;
                                    continue;
                                } else {
                                    if (!"userSpaceOnUse".equals(trim8)) {
                                        throw new C9208i("Invalid value for attribute markerUnits");
                                    }
                                    c9198r.f83080p = true;
                                }
                            case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                                if ("auto".equals(trim8)) {
                                    c9198r.f83085u = Float.valueOf(Float.NaN);
                                    break;
                                } else {
                                    c9198r.f83085u = Float.valueOf(v(trim8));
                                    break;
                                }
                        }
                    }
                    this.f83156b.i(c9198r);
                    this.f83156b = c9198r;
                    return;
                case 19:
                    if (this.f83156b == null) {
                        throw new C9208i("Invalid document. Root element must be <svg>");
                    }
                    C9181g.M m11 = new C9181g.M();
                    m11.f83013a = this.f83155a;
                    m11.f83014b = this.f83156b;
                    m(m11, attributes);
                    p(m11, attributes);
                    n(m11, attributes);
                    for (int i23 = 0; i23 < attributes.getLength(); i23++) {
                        String trim9 = attributes.getValue(i23).trim();
                        switch (a.f83165b[g.a(attributes.getLocalName(i23)).ordinal()]) {
                            case 15:
                                m11.f83009m = y(trim9);
                                break;
                            case 16:
                                m11.f83010n = y(trim9);
                                break;
                            case 17:
                                m11.f83011o = y(trim9);
                                break;
                            case 18:
                                m11.f83012p = y(trim9);
                                break;
                        }
                    }
                    this.f83156b.i(m11);
                    this.f83156b = m11;
                    return;
                case 20:
                    if (this.f83156b == null) {
                        throw new C9208i("Invalid document. Root element must be <svg>");
                    }
                    C9181g.Q q11 = new C9181g.Q();
                    q11.f83013a = this.f83155a;
                    q11.f83014b = this.f83156b;
                    m(q11, attributes);
                    p(q11, attributes);
                    n(q11, attributes);
                    for (int i24 = 0; i24 < attributes.getLength(); i24++) {
                        String trim10 = attributes.getValue(i24).trim();
                        int i25 = a.f83165b[g.a(attributes.getLocalName(i24)).ordinal()];
                        if (i25 == 35) {
                            q11.f83019p = y(trim10);
                        } else if (i25 != 36) {
                            switch (i25) {
                                case 12:
                                    q11.f83016m = y(trim10);
                                    break;
                                case 13:
                                    q11.f83017n = y(trim10);
                                    break;
                                case 14:
                                    C9181g.C9196p y25 = y(trim10);
                                    q11.f83018o = y25;
                                    if (y25.f()) {
                                        throw new C9208i("Invalid <radialGradient> element. r cannot be negative");
                                    }
                                    break;
                            }
                        } else {
                            q11.f83020q = y(trim10);
                        }
                    }
                    this.f83156b.i(q11);
                    this.f83156b = q11;
                    return;
                case 21:
                    C9181g.J j16 = this.f83156b;
                    if (j16 == null) {
                        throw new C9208i("Invalid document. Root element must be <svg>");
                    }
                    if (!(j16 instanceof C9181g.AbstractC9190j)) {
                        throw new C9208i("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.");
                    }
                    C9181g.D d11 = new C9181g.D();
                    d11.f83013a = this.f83155a;
                    d11.f83014b = this.f83156b;
                    m(d11, attributes);
                    p(d11, attributes);
                    for (int i26 = 0; i26 < attributes.getLength(); i26++) {
                        String trim11 = attributes.getValue(i26).trim();
                        if (a.f83165b[g.a(attributes.getLocalName(i26)).ordinal()] == 37) {
                            if (trim11.length() == 0) {
                                throw new C9208i("Invalid offset value in <stop> (empty string)");
                            }
                            int length = trim11.length();
                            if (trim11.charAt(trim11.length() - 1) == '%') {
                                length--;
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            try {
                                float u12 = u(length, trim11);
                                float f11 = 100.0f;
                                if (z11) {
                                    u12 /= 100.0f;
                                }
                                if (u12 < 0.0f) {
                                    f11 = 0.0f;
                                } else if (u12 <= 100.0f) {
                                    f11 = u12;
                                }
                                d11.f82949h = Float.valueOf(f11);
                            } catch (NumberFormatException e11) {
                                throw new C9208i("Invalid offset value in <stop>: ".concat(trim11), e11);
                            }
                        }
                    }
                    this.f83156b.i(d11);
                    this.f83156b = d11;
                    return;
                case 22:
                case 23:
                    this.f83159e = true;
                    this.f83160f = a11;
                    return;
                case 24:
                    if (this.f83156b == null) {
                        throw new C9208i("Invalid document. Root element must be <svg>");
                    }
                    C9181g.C9186e c9186e = new C9181g.C9186e();
                    c9186e.f83013a = this.f83155a;
                    c9186e.f83014b = this.f83156b;
                    m(c9186e, attributes);
                    p(c9186e, attributes);
                    r(c9186e, attributes);
                    l(c9186e, attributes);
                    for (int i27 = 0; i27 < attributes.getLength(); i27++) {
                        String trim12 = attributes.getValue(i27).trim();
                        if (a.f83165b[g.a(attributes.getLocalName(i27)).ordinal()] == 38) {
                            if ("objectBoundingBox".equals(trim12)) {
                                c9186e.f83047o = Boolean.FALSE;
                            } else {
                                if (!"userSpaceOnUse".equals(trim12)) {
                                    throw new C9208i("Invalid value for attribute clipPathUnits");
                                }
                                c9186e.f83047o = Boolean.TRUE;
                            }
                        }
                    }
                    this.f83156b.i(c9186e);
                    this.f83156b = c9186e;
                    return;
                case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                    if (this.f83156b == null) {
                        throw new C9208i("Invalid document. Root element must be <svg>");
                    }
                    C9181g.Z z12 = new C9181g.Z();
                    z12.f83013a = this.f83155a;
                    z12.f83014b = this.f83156b;
                    m(z12, attributes);
                    p(z12, attributes);
                    l(z12, attributes);
                    for (int i28 = 0; i28 < attributes.getLength(); i28++) {
                        String trim13 = attributes.getValue(i28).trim();
                        int i29 = a.f83165b[g.a(attributes.getLocalName(i28)).ordinal()];
                        if (i29 != 6) {
                            if (i29 == 39) {
                                z12.f83027o = y(trim13);
                            }
                        } else if ("".equals(attributes.getURI(i28)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i28))) {
                            z12.f83026n = trim13;
                        }
                    }
                    this.f83156b.i(z12);
                    this.f83156b = z12;
                    C9181g.J j17 = z12.f83014b;
                    if (j17 instanceof C9181g.b0) {
                        z12.o((C9181g.b0) j17);
                        return;
                    } else {
                        z12.o(((C9181g.X) j17).b());
                        return;
                    }
                case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                    if (this.f83156b == null) {
                        throw new C9208i("Invalid document. Root element must be <svg>");
                    }
                    C9181g.C9205y c9205y = new C9181g.C9205y();
                    c9205y.f83013a = this.f83155a;
                    c9205y.f83014b = this.f83156b;
                    m(c9205y, attributes);
                    p(c9205y, attributes);
                    l(c9205y, attributes);
                    s(c9205y, attributes);
                    for (int i31 = 0; i31 < attributes.getLength(); i31++) {
                        String trim14 = attributes.getValue(i31).trim();
                        int i32 = a.f83165b[g.a(attributes.getLocalName(i31)).ordinal()];
                        if (i32 == 1) {
                            c9205y.f83100s = y(trim14);
                        } else if (i32 == 2) {
                            c9205y.f83101t = y(trim14);
                        } else if (i32 == 3) {
                            C9181g.C9196p y26 = y(trim14);
                            c9205y.f83102u = y26;
                            if (y26.f()) {
                                throw new C9208i("Invalid <pattern> element. width cannot be negative");
                            }
                        } else if (i32 == 4) {
                            C9181g.C9196p y27 = y(trim14);
                            c9205y.f83103v = y27;
                            if (y27.f()) {
                                throw new C9208i("Invalid <pattern> element. height cannot be negative");
                            }
                        } else if (i32 != 6) {
                            switch (i32) {
                                case 40:
                                    if (!"objectBoundingBox".equals(trim14)) {
                                        if (!"userSpaceOnUse".equals(trim14)) {
                                            throw new C9208i("Invalid value for attribute patternUnits");
                                        }
                                        c9205y.f83097p = Boolean.TRUE;
                                        break;
                                    } else {
                                        c9205y.f83097p = Boolean.FALSE;
                                        break;
                                    }
                                case 41:
                                    if (!"objectBoundingBox".equals(trim14)) {
                                        if (!"userSpaceOnUse".equals(trim14)) {
                                            throw new C9208i("Invalid value for attribute patternContentUnits");
                                        }
                                        c9205y.f83098q = Boolean.TRUE;
                                        break;
                                    } else {
                                        c9205y.f83098q = Boolean.FALSE;
                                        break;
                                    }
                                case 42:
                                    c9205y.f83099r = F(trim14);
                                    break;
                            }
                        } else if ("".equals(attributes.getURI(i31)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i31))) {
                            c9205y.f83104w = trim14;
                        }
                    }
                    this.f83156b.i(c9205y);
                    this.f83156b = c9205y;
                    return;
                case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    if (this.f83156b == null) {
                        throw new C9208i("Invalid document. Root element must be <svg>");
                    }
                    C9181g.C9195o c9195o = new C9181g.C9195o();
                    c9195o.f83013a = this.f83155a;
                    c9195o.f83014b = this.f83156b;
                    m(c9195o, attributes);
                    p(c9195o, attributes);
                    r(c9195o, attributes);
                    l(c9195o, attributes);
                    for (int i33 = 0; i33 < attributes.getLength(); i33++) {
                        String trim15 = attributes.getValue(i33).trim();
                        int i34 = a.f83165b[g.a(attributes.getLocalName(i33)).ordinal()];
                        if (i34 == 1) {
                            c9195o.f83069p = y(trim15);
                        } else if (i34 == 2) {
                            c9195o.f83070q = y(trim15);
                        } else if (i34 == 3) {
                            C9181g.C9196p y28 = y(trim15);
                            c9195o.f83071r = y28;
                            if (y28.f()) {
                                throw new C9208i("Invalid <use> element. width cannot be negative");
                            }
                        } else if (i34 == 4) {
                            C9181g.C9196p y29 = y(trim15);
                            c9195o.f83072s = y29;
                            if (y29.f()) {
                                throw new C9208i("Invalid <use> element. height cannot be negative");
                            }
                        } else if (i34 != 6) {
                            if (i34 == 7) {
                                D(c9195o, trim15);
                            }
                        } else if ("".equals(attributes.getURI(i33)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i33))) {
                            c9195o.f83068o = trim15;
                        }
                    }
                    this.f83156b.i(c9195o);
                    this.f83156b = c9195o;
                    return;
                case 28:
                    if (this.f83156b == null) {
                        throw new C9208i("Invalid document. Root element must be <svg>");
                    }
                    C9181g.f0 f0Var = new C9181g.f0();
                    f0Var.f83013a = this.f83155a;
                    f0Var.f83014b = this.f83156b;
                    m(f0Var, attributes);
                    l(f0Var, attributes);
                    s(f0Var, attributes);
                    this.f83156b.i(f0Var);
                    this.f83156b = f0Var;
                    return;
                case 29:
                    if (this.f83156b == null) {
                        throw new C9208i("Invalid document. Root element must be <svg>");
                    }
                    C9181g.C9199s c9199s = new C9181g.C9199s();
                    c9199s.f83013a = this.f83155a;
                    c9199s.f83014b = this.f83156b;
                    m(c9199s, attributes);
                    p(c9199s, attributes);
                    l(c9199s, attributes);
                    for (int i35 = 0; i35 < attributes.getLength(); i35++) {
                        String trim16 = attributes.getValue(i35).trim();
                        int i36 = a.f83165b[g.a(attributes.getLocalName(i35)).ordinal()];
                        if (i36 == 1) {
                            y(trim16);
                        } else if (i36 == 2) {
                            y(trim16);
                        } else if (i36 == 3) {
                            C9181g.C9196p y31 = y(trim16);
                            c9199s.f83088p = y31;
                            if (y31.f()) {
                                throw new C9208i("Invalid <mask> element. width cannot be negative");
                            }
                        } else if (i36 == 4) {
                            C9181g.C9196p y32 = y(trim16);
                            c9199s.f83089q = y32;
                            if (y32.f()) {
                                throw new C9208i("Invalid <mask> element. height cannot be negative");
                            }
                        } else if (i36 != 43) {
                            if (i36 != 44) {
                                continue;
                            } else if ("objectBoundingBox".equals(trim16)) {
                                c9199s.f83087o = Boolean.FALSE;
                            } else {
                                if (!"userSpaceOnUse".equals(trim16)) {
                                    throw new C9208i("Invalid value for attribute maskContentUnits");
                                }
                                c9199s.f83087o = Boolean.TRUE;
                            }
                        } else if ("objectBoundingBox".equals(trim16)) {
                            c9199s.f83086n = Boolean.FALSE;
                        } else {
                            if (!"userSpaceOnUse".equals(trim16)) {
                                throw new C9208i("Invalid value for attribute maskUnits");
                            }
                            c9199s.f83086n = Boolean.TRUE;
                        }
                    }
                    this.f83156b.i(c9199s);
                    this.f83156b = c9199s;
                    return;
                case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                    if (this.f83156b == null) {
                        throw new C9208i("Invalid document. Root element must be <svg>");
                    }
                    String str4 = "all";
                    boolean z13 = true;
                    for (int i37 = 0; i37 < attributes.getLength(); i37++) {
                        String trim17 = attributes.getValue(i37).trim();
                        int i38 = a.f83165b[g.a(attributes.getLocalName(i37)).ordinal()];
                        if (i38 == 88) {
                            z13 = trim17.equals("text/css");
                        } else if (i38 == 89) {
                            str4 = trim17;
                        }
                    }
                    if (z13 && C9176b.b(str4, C9176b.f.screen)) {
                        this.f83162h = true;
                        return;
                    } else {
                        this.f83157c = true;
                        this.f83158d = 1;
                        return;
                    }
                case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    if (this.f83156b == null) {
                        throw new C9208i("Invalid document. Root element must be <svg>");
                    }
                    C9181g.C c11 = new C9181g.C();
                    c11.f83013a = this.f83155a;
                    c11.f83014b = this.f83156b;
                    m(c11, attributes);
                    p(c11, attributes);
                    this.f83156b.i(c11);
                    this.f83156b = c11;
                    return;
                default:
                    this.f83157c = true;
                    this.f83158d = 1;
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L(String str) throws C9208i {
        if (this.f83157c) {
            return;
        }
        if (this.f83159e) {
            if (this.f83161g == null) {
                this.f83161g = new StringBuilder(str.length());
            }
            this.f83161g.append(str);
        } else if (this.f83162h) {
            if (this.f83163i == null) {
                this.f83163i = new StringBuilder(str.length());
            }
            this.f83163i.append(str);
        } else if (this.f83156b instanceof C9181g.Y) {
            f(str);
        }
    }

    private void M(char[] cArr, int i11, int i12) throws C9208i {
        if (this.f83157c) {
            return;
        }
        if (this.f83159e) {
            if (this.f83161g == null) {
                this.f83161g = new StringBuilder(i12);
            }
            this.f83161g.append(cArr, i11, i12);
        } else if (this.f83162h) {
            if (this.f83163i == null) {
                this.f83163i = new StringBuilder(i12);
            }
            this.f83163i.append(cArr, i11, i12);
        } else if (this.f83156b instanceof C9181g.Y) {
            f(new String(cArr, i11, i12));
        }
    }

    static void a(C9209j c9209j) {
        c9209j.getClass();
        c9209j.f83155a = new C9181g();
    }

    static /* synthetic */ HashMap e(C9209j c9209j, i iVar) {
        c9209j.getClass();
        return E(iVar);
    }

    private void f(String str) throws C9208i {
        C9181g.H h11 = (C9181g.H) this.f83156b;
        int size = h11.f82993i.size();
        C9181g.N n11 = size == 0 ? null : (C9181g.N) h11.f82993i.get(size - 1);
        if (n11 instanceof C9181g.c0) {
            C9181g.c0 c0Var = (C9181g.c0) n11;
            c0Var.f83042c = o0.c(new StringBuilder(), c0Var.f83042c, str);
        } else {
            C9181g.J j11 = this.f83156b;
            C9181g.c0 c0Var2 = new C9181g.c0();
            c0Var2.f83042c = str;
            j11.i(c0Var2);
        }
    }

    private static int g(float f7) {
        if (f7 < 0.0f) {
            return 0;
        }
        if (f7 > 255.0f) {
            return 255;
        }
        return Math.round(f7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(String str, String str2, String str3) throws C9208i {
        if (this.f83157c) {
            int i11 = this.f83158d - 1;
            this.f83158d = i11;
            if (i11 == 0) {
                this.f83157c = false;
                return;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            int i12 = a.f83164a[h.a(str2).ordinal()];
            if (i12 != 1 && i12 != 2 && i12 != 4 && i12 != 5 && i12 != 13 && i12 != 14) {
                switch (i12) {
                    case 22:
                    case 23:
                        this.f83159e = false;
                        if (this.f83161g != null) {
                            h hVar = this.f83160f;
                            if (hVar == h.title) {
                                this.f83155a.getClass();
                            } else if (hVar == h.desc) {
                                this.f83155a.getClass();
                            }
                            this.f83161g.setLength(0);
                            break;
                        }
                        break;
                    case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                        StringBuilder sb2 = this.f83163i;
                        if (sb2 != null) {
                            this.f83162h = false;
                            String sb3 = sb2.toString();
                            this.f83155a.a(new C9176b(C9176b.f.screen, C9176b.t.Document).c(sb3));
                            this.f83163i.setLength(0);
                            break;
                        }
                        break;
                }
                return;
            }
            this.f83156b = ((C9181g.N) this.f83156b).f83014b;
        }
    }

    private static int i(float f7, float f11, float f12) {
        float f13 = f7 % 360.0f;
        if (f7 < 0.0f) {
            f13 += 360.0f;
        }
        float f14 = f13 / 60.0f;
        float f15 = f11 / 100.0f;
        float f16 = f12 / 100.0f;
        if (f15 < 0.0f) {
            f15 = 0.0f;
        } else if (f15 > 1.0f) {
            f15 = 1.0f;
        }
        float f17 = f16 >= 0.0f ? f16 > 1.0f ? 1.0f : f16 : 0.0f;
        float f18 = f17 <= 0.5f ? (f15 + 1.0f) * f17 : (f17 + f15) - (f15 * f17);
        float f19 = (f17 * 2.0f) - f18;
        return g(j(f19, f18, f14 - 2.0f) * 256.0f) | (g(j(f19, f18, f14 + 2.0f) * 256.0f) << 16) | (g(j(f19, f18, f14) * 256.0f) << 8);
    }

    private static float j(float f7, float f11, float f12) {
        if (f12 < 0.0f) {
            f12 += 6.0f;
        }
        if (f12 >= 6.0f) {
            f12 -= 6.0f;
        }
        return f12 < 1.0f ? C3143a.d(f11, f7, f12, f7) : f12 < 3.0f ? f11 : f12 < 4.0f ? C3143a.d(4.0f, f12, f11 - f7, f7) : f7;
    }

    private static void l(C9181g.G g10, Attributes attributes) throws C9208i {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String trim = attributes.getValue(i11).trim();
            switch (a.f83165b[g.a(attributes.getLocalName(i11)).ordinal()]) {
                case 21:
                    i iVar = new i(trim);
                    HashSet hashSet = new HashSet();
                    while (!iVar.f()) {
                        String l11 = iVar.l();
                        if (l11.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                            hashSet.add(l11.substring(35));
                        } else {
                            hashSet.add("UNSUPPORTED");
                        }
                        iVar.q();
                    }
                    g10.g(hashSet);
                    break;
                case 22:
                    g10.k(trim);
                    break;
                case 23:
                    i iVar2 = new i(trim);
                    HashSet hashSet2 = new HashSet();
                    while (!iVar2.f()) {
                        String l12 = iVar2.l();
                        int indexOf = l12.indexOf(45);
                        if (indexOf != -1) {
                            l12 = l12.substring(0, indexOf);
                        }
                        hashSet2.add(new Locale(l12, "", "").getLanguage());
                        iVar2.q();
                    }
                    g10.h(hashSet2);
                    break;
                case 24:
                    i iVar3 = new i(trim);
                    HashSet hashSet3 = new HashSet();
                    while (!iVar3.f()) {
                        hashSet3.add(iVar3.l());
                        iVar3.q();
                    }
                    g10.c(hashSet3);
                    break;
                case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                    ArrayList w11 = w(trim);
                    g10.j(w11 != null ? new HashSet(w11) : new HashSet(0));
                    break;
            }
        }
    }

    private static void m(C9181g.L l11, Attributes attributes) throws C9208i {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String qName = attributes.getQName(i11);
            if (qName.equals("id") || qName.equals("xml:id")) {
                l11.f83004c = attributes.getValue(i11).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String trim = attributes.getValue(i11).trim();
                if ("default".equals(trim)) {
                    l11.f83005d = Boolean.FALSE;
                    return;
                } else {
                    if (!"preserve".equals(trim)) {
                        throw new C9208i(Nk.a.b("Invalid value for \"xml:space\" attribute: ", trim));
                    }
                    l11.f83005d = Boolean.TRUE;
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void n(C9181g.AbstractC9190j abstractC9190j, Attributes attributes) throws C9208i {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String trim = attributes.getValue(i11).trim();
            int i12 = a.f83165b[g.a(attributes.getLocalName(i11)).ordinal()];
            if (i12 != 6) {
                switch (i12) {
                    case 32:
                        if (!"objectBoundingBox".equals(trim)) {
                            if (!"userSpaceOnUse".equals(trim)) {
                                throw new C9208i("Invalid value for attribute gradientUnits");
                            }
                            abstractC9190j.f83062i = Boolean.TRUE;
                            break;
                        } else {
                            abstractC9190j.f83062i = Boolean.FALSE;
                            break;
                        }
                    case 33:
                        abstractC9190j.f83063j = F(trim);
                        break;
                    case 34:
                        try {
                            abstractC9190j.f83064k = C9181g.EnumC9191k.valueOf(trim);
                            break;
                        } catch (IllegalArgumentException unused) {
                            throw new C9208i(A0.b("Invalid spreadMethod attribute. \"", trim, "\" is not a valid value."));
                        }
                }
            } else if ("".equals(attributes.getURI(i11)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i11))) {
                abstractC9190j.f83065l = trim;
            }
        }
    }

    private static void o(C9181g.C9206z c9206z, Attributes attributes, String str) throws C9208i {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            if (g.a(attributes.getLocalName(i11)) == g.points) {
                i iVar = new i(attributes.getValue(i11));
                ArrayList arrayList = new ArrayList();
                iVar.q();
                while (!iVar.f()) {
                    float i12 = iVar.i();
                    if (Float.isNaN(i12)) {
                        throw new C9208i(A0.b("Invalid <", str, "> points attribute. Non-coordinate content found in list."));
                    }
                    iVar.p();
                    float i13 = iVar.i();
                    if (Float.isNaN(i13)) {
                        throw new C9208i(A0.b("Invalid <", str, "> points attribute. There should be an even number of coordinates."));
                    }
                    iVar.p();
                    arrayList.add(Float.valueOf(i12));
                    arrayList.add(Float.valueOf(i13));
                }
                c9206z.f83105o = new float[arrayList.size()];
                Iterator it = arrayList.iterator();
                int i14 = 0;
                while (it.hasNext()) {
                    c9206z.f83105o[i14] = ((Float) it.next()).floatValue();
                    i14++;
                }
            }
        }
    }

    private static void p(C9181g.L l11, Attributes attributes) throws C9208i {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String trim = attributes.getValue(i11).trim();
            if (trim.length() != 0) {
                int i12 = a.f83165b[g.a(attributes.getLocalName(i11)).ordinal()];
                if (i12 == 45) {
                    i iVar = new i(trim.replaceAll("/\\*.*?\\*/", ""));
                    while (true) {
                        String m11 = iVar.m(':', false);
                        iVar.q();
                        if (!iVar.d(':')) {
                            break;
                        }
                        iVar.q();
                        String m12 = iVar.m(';', true);
                        if (m12 == null) {
                            break;
                        }
                        iVar.q();
                        if (iVar.f() || iVar.d(';')) {
                            if (l11.f83007f == null) {
                                l11.f83007f = new C9181g.E();
                            }
                            J(l11.f83007f, m11, m12);
                            iVar.q();
                        }
                    }
                } else if (i12 != 46) {
                    if (l11.f83006e == null) {
                        l11.f83006e = new C9181g.E();
                    }
                    J(l11.f83006e, attributes.getLocalName(i11), attributes.getValue(i11).trim());
                } else {
                    C9176b.d dVar = new C9176b.d(trim);
                    ArrayList arrayList = null;
                    while (!dVar.f()) {
                        String l12 = dVar.l();
                        if (l12 != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(l12);
                            dVar.q();
                        }
                    }
                    l11.f83008g = arrayList;
                }
            }
        }
    }

    private static void q(C9181g.a0 a0Var, Attributes attributes) throws C9208i {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String trim = attributes.getValue(i11).trim();
            int i12 = a.f83165b[g.a(attributes.getLocalName(i11)).ordinal()];
            if (i12 == 1) {
                a0Var.f83030n = z(trim);
            } else if (i12 == 2) {
                a0Var.f83031o = z(trim);
            } else if (i12 == 19) {
                a0Var.f83032p = z(trim);
            } else if (i12 == 20) {
                a0Var.f83033q = z(trim);
            }
        }
    }

    private static void r(C9181g.InterfaceC9194n interfaceC9194n, Attributes attributes) throws C9208i {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            if (g.a(attributes.getLocalName(i11)) == g.transform) {
                interfaceC9194n.l(F(attributes.getValue(i11)));
            }
        }
    }

    private static void s(C9181g.R r11, Attributes attributes) throws C9208i {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String trim = attributes.getValue(i11).trim();
            int i12 = a.f83165b[g.a(attributes.getLocalName(i11)).ordinal()];
            if (i12 == 7) {
                D(r11, trim);
            } else if (i12 != 87) {
                continue;
            } else {
                i iVar = new i(trim);
                iVar.q();
                float i13 = iVar.i();
                iVar.p();
                float i14 = iVar.i();
                iVar.p();
                float i15 = iVar.i();
                iVar.p();
                float i16 = iVar.i();
                if (Float.isNaN(i13) || Float.isNaN(i14) || Float.isNaN(i15) || Float.isNaN(i16)) {
                    throw new C9208i("Invalid viewBox definition - should have four numbers");
                }
                if (i15 < 0.0f) {
                    throw new C9208i("Invalid viewBox. width cannot be negative");
                }
                if (i16 < 0.0f) {
                    throw new C9208i("Invalid viewBox. height cannot be negative");
                }
                r11.f83021o = new C9181g.C9183b(i13, i14, i15, i16);
            }
        }
    }

    private static C9181g.C9187f t(String str) throws C9208i {
        long j11;
        int i11;
        if (str.charAt(0) == '#') {
            int length = str.length();
            C9177c c9177c = null;
            if (1 < length) {
                long j12 = 0;
                int i12 = 1;
                while (i12 < length) {
                    char charAt = str.charAt(i12);
                    if (charAt < '0' || charAt > '9') {
                        if (charAt >= 'A' && charAt <= 'F') {
                            j11 = j12 * 16;
                            i11 = charAt - 'A';
                        } else {
                            if (charAt < 'a' || charAt > 'f') {
                                break;
                            }
                            j11 = j12 * 16;
                            i11 = charAt - 'a';
                        }
                        j12 = j11 + i11 + 10;
                    } else {
                        j12 = (j12 * 16) + (charAt - '0');
                    }
                    if (j12 > 4294967295L) {
                        break;
                    }
                    i12++;
                }
                if (i12 != 1) {
                    c9177c = new C9177c(j12, i12);
                }
            }
            if (c9177c == null) {
                throw new C9208i("Bad hex colour value: ".concat(str));
            }
            int a11 = c9177c.a();
            if (a11 == 4) {
                int c11 = c9177c.c();
                int i13 = c11 & 3840;
                int i14 = c11 & 240;
                int i15 = c11 & 15;
                return new C9181g.C9187f(i15 | (i13 << 8) | (-16777216) | (i13 << 12) | (i14 << 8) | (i14 << 4) | (i15 << 4));
            }
            if (a11 != 5) {
                if (a11 == 7) {
                    return new C9181g.C9187f(c9177c.c() | (-16777216));
                }
                if (a11 == 9) {
                    return new C9181g.C9187f((c9177c.c() << 24) | (c9177c.c() >>> 8));
                }
                throw new C9208i("Bad hex colour value: ".concat(str));
            }
            int c12 = c9177c.c();
            int i16 = 61440 & c12;
            int i17 = c12 & 3840;
            int i18 = c12 & 240;
            int i19 = c12 & 15;
            return new C9181g.C9187f((i19 << 24) | (i19 << 28) | (i16 << 8) | (i16 << 4) | (i17 << 4) | i17 | i18 | (i18 >> 4));
        }
        String lowerCase = str.toLowerCase(Locale.US);
        boolean startsWith = lowerCase.startsWith("rgba(");
        if (startsWith || lowerCase.startsWith("rgb(")) {
            i iVar = new i(str.substring(startsWith ? 5 : 4));
            iVar.q();
            float i21 = iVar.i();
            if (!Float.isNaN(i21) && iVar.d('%')) {
                i21 = (i21 * 256.0f) / 100.0f;
            }
            float c13 = iVar.c(i21);
            if (!Float.isNaN(c13) && iVar.d('%')) {
                c13 = (c13 * 256.0f) / 100.0f;
            }
            float c14 = iVar.c(c13);
            if (!Float.isNaN(c14) && iVar.d('%')) {
                c14 = (c14 * 256.0f) / 100.0f;
            }
            if (!startsWith) {
                iVar.q();
                if (Float.isNaN(c14) || !iVar.d(')')) {
                    throw new C9208i("Bad rgb() colour value: ".concat(str));
                }
                return new C9181g.C9187f((g(i21) << 16) | (-16777216) | (g(c13) << 8) | g(c14));
            }
            float c15 = iVar.c(c14);
            iVar.q();
            if (Float.isNaN(c15) || !iVar.d(')')) {
                throw new C9208i("Bad rgba() colour value: ".concat(str));
            }
            return new C9181g.C9187f((g(c15 * 256.0f) << 24) | (g(i21) << 16) | (g(c13) << 8) | g(c14));
        }
        boolean startsWith2 = lowerCase.startsWith("hsla(");
        if (!startsWith2 && !lowerCase.startsWith("hsl(")) {
            Integer a12 = c.a(lowerCase);
            if (a12 != null) {
                return new C9181g.C9187f(a12.intValue());
            }
            throw new C9208i("Invalid colour keyword: ".concat(lowerCase));
        }
        i iVar2 = new i(str.substring(startsWith2 ? 5 : 4));
        iVar2.q();
        float i22 = iVar2.i();
        float c16 = iVar2.c(i22);
        if (!Float.isNaN(c16)) {
            iVar2.d('%');
        }
        float c17 = iVar2.c(c16);
        if (!Float.isNaN(c17)) {
            iVar2.d('%');
        }
        if (!startsWith2) {
            iVar2.q();
            if (Float.isNaN(c17) || !iVar2.d(')')) {
                throw new C9208i("Bad hsl() colour value: ".concat(str));
            }
            return new C9181g.C9187f(i(i22, c16, c17) | (-16777216));
        }
        float c18 = iVar2.c(c17);
        iVar2.q();
        if (Float.isNaN(c18) || !iVar2.d(')')) {
            throw new C9208i("Bad hsla() colour value: ".concat(str));
        }
        return new C9181g.C9187f((g(c18 * 256.0f) << 24) | i(i22, c16, c17));
    }

    private static float u(int i11, String str) throws C9208i {
        float b11 = new C9178d().b(0, i11, str);
        if (Float.isNaN(b11)) {
            throw new C9208i(Nk.a.b("Invalid float value: ", str));
        }
        return b11;
    }

    private static float v(String str) throws C9208i {
        int length = str.length();
        if (length != 0) {
            return u(length, str);
        }
        throw new C9208i("Invalid float value (empty string)");
    }

    private static ArrayList w(String str) {
        i iVar = new i(str);
        ArrayList arrayList = null;
        do {
            String k11 = iVar.k();
            if (k11 == null) {
                k11 = iVar.m(',', true);
            }
            if (k11 == null) {
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(k11);
            iVar.p();
        } while (!iVar.f());
        return arrayList;
    }

    private static String x(String str) {
        if (!str.equals(DevicePublicKeyStringDef.NONE) && str.startsWith("url(")) {
            return str.endsWith(")") ? str.substring(4, str.length() - 1).trim() : str.substring(4).trim();
        }
        return null;
    }

    static C9181g.C9196p y(String str) throws C9208i {
        if (str.length() == 0) {
            throw new C9208i("Invalid length value (empty string)");
        }
        int length = str.length();
        C9181g.d0 d0Var = C9181g.d0.px;
        char charAt = str.charAt(length - 1);
        if (charAt == '%') {
            length--;
            d0Var = C9181g.d0.percent;
        } else if (length > 2 && Character.isLetter(charAt) && Character.isLetter(str.charAt(length - 2))) {
            length -= 2;
            try {
                d0Var = C9181g.d0.valueOf(str.substring(length).toLowerCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                throw new C9208i("Invalid length unit specifier: ".concat(str));
            }
        }
        try {
            return new C9181g.C9196p(u(length, str), d0Var);
        } catch (NumberFormatException e11) {
            throw new C9208i("Invalid length value: ".concat(str), e11);
        }
    }

    private static ArrayList z(String str) throws C9208i {
        String str2;
        if (str.length() == 0) {
            throw new C9208i("Invalid length list (empty string)");
        }
        ArrayList arrayList = new ArrayList(1);
        i iVar = new i(str);
        iVar.q();
        while (!iVar.f()) {
            float i11 = iVar.i();
            if (Float.isNaN(i11)) {
                StringBuilder sb2 = new StringBuilder("Invalid length list value: ");
                int i12 = iVar.f83182b;
                while (true) {
                    boolean f7 = iVar.f();
                    str2 = iVar.f83181a;
                    if (f7 || i.g(str2.charAt(iVar.f83182b))) {
                        break;
                    }
                    iVar.f83182b++;
                }
                String substring = str2.substring(i12, iVar.f83182b);
                iVar.f83182b = i12;
                sb2.append(substring);
                throw new C9208i(sb2.toString());
            }
            C9181g.d0 n11 = iVar.n();
            if (n11 == null) {
                n11 = C9181g.d0.px;
            }
            arrayList.add(new C9181g.C9196p(i11, n11));
            iVar.p();
        }
        return arrayList;
    }

    final C9181g k(InputStream inputStream) throws C9208i {
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        try {
            inputStream.mark(3);
            int read = inputStream.read() + (inputStream.read() << 8);
            inputStream.reset();
            if (read == 35615) {
                inputStream = new BufferedInputStream(new GZIPInputStream(inputStream));
            }
        } catch (IOException unused) {
        }
        try {
            inputStream.mark(4096);
            H(inputStream);
            return this.f83155a;
        } finally {
            try {
                inputStream.close();
            } catch (IOException unused2) {
                Log.e("SVGParser", "Exception thrown closing input stream");
            }
        }
    }
}
