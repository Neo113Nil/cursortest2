package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.blaze.blazesdk.style.shared.models.BlazeDp;
import com.google.android.gms.internal.ads.v;
import com.google.android.gms.internal.ads.zzagn;
import com.google.android.gms.internal.ads.zziei;
import com.google.android.gms.internal.ads.zzify;
import com.google.android.gms.internal.ads.zziib;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.U3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.results.R;
import com.sofascore.results.stagesport.fragments.raceFlow.RaceFlowModels$RaceEntrant;
import com.sofascore.results.stagesport.fragments.raceFlow.RaceFlowModels$RaceTeam;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.c;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class s6a implements zzagn {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;
    public static final /* synthetic */ int d = 0;
    public static final /* synthetic */ int e = 0;

    public static boolean A(Context context) {
        SharedPreferences d2;
        context.getClass();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                d2 = a5f.d(applicationContext);
                uic.j = d2;
            }
            d2.getClass();
            sharedPreferences = d2;
        }
        String string = sharedPreferences.getString("PR_XAIST", null);
        boolean z = string == null || string.length() == 0;
        ia0 ia0Var = ia0.q;
        Long premiumTokenExpirationTimestamp = ok3.p().e().getPremiumTokenExpirationTimestamp();
        return !z || (premiumTokenExpirationTimestamp != null && (premiumTokenExpirationTimestamp.longValue() > yaa.w() ? 1 : (premiumTokenExpirationTimestamp.longValue() == yaa.w() ? 0 : -1)) >= 0);
    }

    public static final String B(Collection collection) {
        return dii.b(CollectionsKt.f0(collection, BlazeDataSourcePersonalizedType.STRING_SEPARATOR, null, null, null, 62), "    ").concat(dii.b(" }", "    "));
    }

    public static final String C(Collection collection) {
        return dii.b(CollectionsKt.f0(collection, BlazeDataSourcePersonalizedType.STRING_SEPARATOR, null, null, null, 62), "    ").concat(dii.b("},", "    "));
    }

    public static boolean D(uae uaeVar) {
        return !c.n(uaeVar.b(), ".class", true);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final gu9 E(Resources.Theme theme, Resources resources, XmlResourceParser xmlResourceParser, int i) {
        long j;
        int i2;
        fu9 fu9Var;
        int i3;
        int i4;
        int eventType;
        int i5;
        int i6;
        int i7;
        List list;
        List list2;
        n52 n52Var;
        int i8;
        int i9;
        int i10;
        int i11;
        XmlResourceParser xmlResourceParser2 = xmlResourceParser;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser2);
        r40 r40Var = new r40(xmlResourceParser2);
        TypedArray D = r4a.D(resources, theme, asAttributeSet, ok3.a);
        r40Var.b(D.getChangingConfigurations());
        boolean z = !r4a.z(xmlResourceParser2, "autoMirrored") ? false : D.getBoolean(5, false);
        r40Var.b(D.getChangingConfigurations());
        float a2 = r40Var.a(D, "viewportWidth", 7, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        float a3 = r40Var.a(D, "viewportHeight", 8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (a2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            throw new XmlPullParserException(D.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
        }
        if (a3 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            throw new XmlPullParserException(D.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
        }
        int i12 = 3;
        float dimension = D.getDimension(3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        r40Var.b(D.getChangingConfigurations());
        float dimension2 = D.getDimension(2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        r40Var.b(D.getChangingConfigurations());
        if (D.hasValue(1)) {
            TypedValue typedValue = new TypedValue();
            D.getValue(1, typedValue);
            if (typedValue.type == 2) {
                j = r13.i;
            } else {
                ColorStateList x = r4a.x(D, xmlResourceParser2, theme);
                r40Var.b(D.getChangingConfigurations());
                j = x != null ? hkg.b(x.getDefaultColor()) : r13.i;
            }
        } else {
            j = r13.i;
        }
        long j2 = j;
        int i13 = D.getInt(6, -1);
        r40Var.b(D.getChangingConfigurations());
        if (i13 != -1) {
            if (i13 == 3) {
                i2 = 3;
            } else if (i13 != 5) {
                if (i13 != 9) {
                    switch (i13) {
                        case 14:
                            i2 = 13;
                            break;
                        case 15:
                            i2 = 14;
                            break;
                        case 16:
                            i2 = 12;
                            break;
                    }
                } else {
                    i2 = 9;
                }
            }
            float f = dimension / resources.getDisplayMetrics().density;
            float f2 = dimension2 / resources.getDisplayMetrics().density;
            D.recycle();
            i3 = 2;
            i4 = 1;
            fu9Var = new fu9(null, f, f2, a2, a3, j2, i2, z, 1);
            int i14 = 0;
            while (xmlResourceParser2.getEventType() != i4 && (xmlResourceParser2.getDepth() >= i4 || xmlResourceParser2.getEventType() != i12)) {
                XmlPullParser xmlPullParser = r40Var.a;
                eventType = xmlPullParser.getEventType();
                ArrayList arrayList = fu9Var.i;
                if (eventType == i3) {
                    if (eventType == i12 && "group".equals(xmlPullParser.getName())) {
                        int i15 = i14 + 1;
                        int i16 = 0;
                        while (i16 < i15) {
                            if (fu9Var.k) {
                                r3a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                            }
                            eu9 eu9Var = (eu9) arrayList.remove(arrayList.size() - i4);
                            ((eu9) mz1.h(arrayList, i4)).j.add(new imk(eu9Var.a, eu9Var.b, eu9Var.c, eu9Var.d, eu9Var.e, eu9Var.f, eu9Var.g, eu9Var.h, eu9Var.i, eu9Var.j));
                            i16++;
                            i4 = 1;
                            i12 = 3;
                            i3 = 2;
                        }
                        i7 = i12;
                        i6 = i3;
                        i14 = 0;
                    } else {
                        i7 = i12;
                        i6 = i3;
                    }
                    i5 = i4;
                } else {
                    String name = xmlPullParser.getName();
                    if (name != null) {
                        int hashCode = name.hashCode();
                        p95 p95Var = r40Var.c;
                        if (hashCode != -1649314686) {
                            if (hashCode != 3433509) {
                                if (hashCode == 98629247 && name.equals("group")) {
                                    TypedArray D2 = r4a.D(resources, theme, asAttributeSet, ok3.b);
                                    r40Var.b(D2.getChangingConfigurations());
                                    float a4 = r40Var.a(D2, "rotation", 5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                    float f3 = D2.getFloat(1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                    r40Var.b(D2.getChangingConfigurations());
                                    float f4 = D2.getFloat(2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                    r40Var.b(D2.getChangingConfigurations());
                                    float a5 = r40Var.a(D2, "scaleX", 3, 1.0f);
                                    float a6 = r40Var.a(D2, "scaleY", 4, 1.0f);
                                    float a7 = r40Var.a(D2, "translateX", 6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                    float a8 = r40Var.a(D2, "translateY", 7, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                    String string = D2.getString(0);
                                    r40Var.b(D2.getChangingConfigurations());
                                    String str = string == null ? "" : string;
                                    D2.recycle();
                                    km5 km5Var = jmk.a;
                                    if (fu9Var.k) {
                                        r3a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                    }
                                    arrayList.add(new eu9(str, a4, f3, f4, a5, a6, a7, a8, km5Var, 512));
                                }
                            } else if (name.equals("path")) {
                                TypedArray D3 = r4a.D(resources, theme, asAttributeSet, ok3.c);
                                r40Var.b(D3.getChangingConfigurations());
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") == null) {
                                    a70.p("No path data available");
                                    return null;
                                }
                                String string2 = D3.getString(0);
                                r40Var.b(D3.getChangingConfigurations());
                                String str2 = string2 == null ? "" : string2;
                                String string3 = D3.getString(2);
                                r40Var.b(D3.getChangingConfigurations());
                                if (string3 == null) {
                                    list2 = jmk.a;
                                } else {
                                    ArrayList arrayList2 = new ArrayList();
                                    p95Var.b(string3, arrayList2);
                                    list2 = arrayList2;
                                }
                                List list3 = list2;
                                b10 y = r4a.y(D3, xmlPullParser, theme, "fillColor", 1);
                                r40Var.b(D3.getChangingConfigurations());
                                float a9 = r40Var.a(D3, "fillAlpha", 12, 1.0f);
                                if (r4a.z(xmlPullParser, "strokeLineCap")) {
                                    n52Var = null;
                                    i8 = D3.getInt(8, -1);
                                } else {
                                    i8 = -1;
                                    n52Var = null;
                                }
                                r40Var.b(D3.getChangingConfigurations());
                                if (i8 != 0) {
                                    if (i8 == 1) {
                                        i9 = 1;
                                    } else if (i8 == 2) {
                                        i9 = 2;
                                    }
                                    i10 = r4a.z(xmlPullParser, "strokeLineJoin") ? -1 : D3.getInt(9, -1);
                                    r40Var.b(D3.getChangingConfigurations());
                                    if (i10 != 0) {
                                        if (i10 == 1) {
                                            i11 = 1;
                                        } else if (i10 == 2) {
                                            i11 = 2;
                                        }
                                        float a10 = r40Var.a(D3, "strokeMiterLimit", 10, 4.0f);
                                        b10 y2 = r4a.y(D3, xmlPullParser, theme, "strokeColor", 3);
                                        r40Var.b(D3.getChangingConfigurations());
                                        float a11 = r40Var.a(D3, "strokeAlpha", 11, 1.0f);
                                        float a12 = r40Var.a(D3, "strokeWidth", 4, 1.0f);
                                        float a13 = r40Var.a(D3, "trimPathEnd", 6, 1.0f);
                                        float a14 = r40Var.a(D3, "trimPathOffset", 7, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                        float a15 = r40Var.a(D3, "trimPathStart", 5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                        int i17 = !r4a.z(xmlPullParser, "fillType") ? 0 : D3.getInt(13, 0);
                                        r40Var.b(D3.getChangingConfigurations());
                                        D3.recycle();
                                        Shader shader = (Shader) y.c;
                                        n52 o52Var = (shader == null && y.b == 0) ? n52Var : shader != null ? new o52(shader) : new pvh(hkg.b(y.b));
                                        Shader shader2 = (Shader) y2.c;
                                        n52 o52Var2 = (shader2 == null && y2.b == 0) ? n52Var : shader2 == null ? new o52(shader2) : new pvh(hkg.b(y2.b));
                                        int i18 = i17 == 0 ? 0 : 1;
                                        if (fu9Var.k) {
                                            r3a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                        }
                                        ((eu9) mz1.h(arrayList, 1)).j.add(new mmk(str2, list3, i18, o52Var, a9, o52Var2, a11, a12, i9, i11, a10, a15, a13, a14));
                                        i5 = 1;
                                        i7 = 3;
                                        i6 = 2;
                                    }
                                    i11 = 0;
                                    float a102 = r40Var.a(D3, "strokeMiterLimit", 10, 4.0f);
                                    b10 y22 = r4a.y(D3, xmlPullParser, theme, "strokeColor", 3);
                                    r40Var.b(D3.getChangingConfigurations());
                                    float a112 = r40Var.a(D3, "strokeAlpha", 11, 1.0f);
                                    float a122 = r40Var.a(D3, "strokeWidth", 4, 1.0f);
                                    float a132 = r40Var.a(D3, "trimPathEnd", 6, 1.0f);
                                    float a142 = r40Var.a(D3, "trimPathOffset", 7, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                    float a152 = r40Var.a(D3, "trimPathStart", 5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                    if (!r4a.z(xmlPullParser, "fillType")) {
                                    }
                                    r40Var.b(D3.getChangingConfigurations());
                                    D3.recycle();
                                    Shader shader3 = (Shader) y.c;
                                    if (shader3 == null) {
                                        Shader shader22 = (Shader) y22.c;
                                        if (shader22 == null) {
                                            if (i17 == 0) {
                                            }
                                            if (fu9Var.k) {
                                            }
                                            ((eu9) mz1.h(arrayList, 1)).j.add(new mmk(str2, list3, i18, o52Var, a9, o52Var2, a112, a122, i9, i11, a102, a152, a132, a142));
                                            i5 = 1;
                                            i7 = 3;
                                            i6 = 2;
                                        }
                                        if (i17 == 0) {
                                        }
                                        if (fu9Var.k) {
                                        }
                                        ((eu9) mz1.h(arrayList, 1)).j.add(new mmk(str2, list3, i18, o52Var, a9, o52Var2, a112, a122, i9, i11, a102, a152, a132, a142));
                                        i5 = 1;
                                        i7 = 3;
                                        i6 = 2;
                                    }
                                    Shader shader222 = (Shader) y22.c;
                                    if (shader222 == null) {
                                    }
                                    if (i17 == 0) {
                                    }
                                    if (fu9Var.k) {
                                    }
                                    ((eu9) mz1.h(arrayList, 1)).j.add(new mmk(str2, list3, i18, o52Var, a9, o52Var2, a112, a122, i9, i11, a102, a152, a132, a142));
                                    i5 = 1;
                                    i7 = 3;
                                    i6 = 2;
                                }
                                i9 = 0;
                                if (r4a.z(xmlPullParser, "strokeLineJoin")) {
                                }
                                r40Var.b(D3.getChangingConfigurations());
                                if (i10 != 0) {
                                }
                                i11 = 0;
                                float a1022 = r40Var.a(D3, "strokeMiterLimit", 10, 4.0f);
                                b10 y222 = r4a.y(D3, xmlPullParser, theme, "strokeColor", 3);
                                r40Var.b(D3.getChangingConfigurations());
                                float a1122 = r40Var.a(D3, "strokeAlpha", 11, 1.0f);
                                float a1222 = r40Var.a(D3, "strokeWidth", 4, 1.0f);
                                float a1322 = r40Var.a(D3, "trimPathEnd", 6, 1.0f);
                                float a1422 = r40Var.a(D3, "trimPathOffset", 7, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                float a1522 = r40Var.a(D3, "trimPathStart", 5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                if (!r4a.z(xmlPullParser, "fillType")) {
                                }
                                r40Var.b(D3.getChangingConfigurations());
                                D3.recycle();
                                Shader shader32 = (Shader) y.c;
                                if (shader32 == null) {
                                }
                                Shader shader2222 = (Shader) y222.c;
                                if (shader2222 == null) {
                                }
                                if (i17 == 0) {
                                }
                                if (fu9Var.k) {
                                }
                                ((eu9) mz1.h(arrayList, 1)).j.add(new mmk(str2, list3, i18, o52Var, a9, o52Var2, a1122, a1222, i9, i11, a1022, a1522, a1322, a1422));
                                i5 = 1;
                                i7 = 3;
                                i6 = 2;
                            }
                            i5 = 1;
                            i7 = 3;
                            i6 = 2;
                        } else {
                            i7 = 3;
                            i6 = 2;
                            if (name.equals("clip-path")) {
                                TypedArray D4 = r4a.D(resources, theme, asAttributeSet, ok3.d);
                                r40Var.b(D4.getChangingConfigurations());
                                String string4 = D4.getString(0);
                                r40Var.b(D4.getChangingConfigurations());
                                String str3 = string4 == null ? "" : string4;
                                i5 = 1;
                                String string5 = D4.getString(1);
                                r40Var.b(D4.getChangingConfigurations());
                                if (string5 == null) {
                                    list = jmk.a;
                                } else {
                                    ArrayList arrayList3 = new ArrayList();
                                    p95Var.b(string5, arrayList3);
                                    list = arrayList3;
                                }
                                D4.recycle();
                                if (fu9Var.k) {
                                    r3a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                }
                                arrayList.add(new eu9(str3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, list, 512));
                                i14++;
                            } else {
                                i5 = 1;
                            }
                        }
                    }
                    i5 = 1;
                    i7 = 3;
                    i6 = 2;
                }
                xmlResourceParser.next();
                xmlResourceParser2 = xmlResourceParser;
                i4 = i5;
                i12 = i7;
                i3 = i6;
            }
            return new gu9(fu9Var.b(), i | r40Var.b);
        }
        i2 = 5;
        float f5 = dimension / resources.getDisplayMetrics().density;
        float f22 = dimension2 / resources.getDisplayMetrics().density;
        D.recycle();
        i3 = 2;
        i4 = 1;
        fu9Var = new fu9(null, f5, f22, a2, a3, j2, i2, z, 1);
        int i142 = 0;
        while (xmlResourceParser2.getEventType() != i4) {
            XmlPullParser xmlPullParser2 = r40Var.a;
            eventType = xmlPullParser2.getEventType();
            ArrayList arrayList4 = fu9Var.i;
            if (eventType == i3) {
            }
            xmlResourceParser.next();
            xmlResourceParser2 = xmlResourceParser;
            i4 = i5;
            i12 = i7;
            i3 = i6;
        }
        return new gu9(fu9Var.b(), i | r40Var.b);
    }

    public static final tc3 F(xtc xtcVar) {
        return new tc3(-2123382363, new e60(xtcVar, 2), true);
    }

    public static b8d G(Class cls, boolean z) {
        if (Parcelable.class.isAssignableFrom(cls)) {
            return z ? new x7d(cls) : new y7d(cls);
        }
        if (Enum.class.isAssignableFrom(cls) && !z) {
            return new w7d(cls);
        }
        if (Serializable.class.isAssignableFrom(cls)) {
            return z ? new z7d(cls) : new a8d(cls);
        }
        return null;
    }

    public static final long H(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + ((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static final List I(nlg nlgVar) {
        int F = z1a.F(nlgVar, "id");
        int F2 = z1a.F(nlgVar, "seq");
        int F3 = z1a.F(nlgVar, "from");
        int F4 = z1a.F(nlgVar, "to");
        xbb b2 = a.b();
        while (nlgVar.U0()) {
            b2.add(new jm8((int) nlgVar.getLong(F), (int) nlgVar.getLong(F2), nlgVar.F0(F3), nlgVar.F0(F4)));
        }
        return CollectionsKt.G0(a.a(b2));
    }

    public static final rsi J(glg glgVar, String str, boolean z) {
        nlg V0 = glgVar.V0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int F = z1a.F(V0, "seqno");
            int F2 = z1a.F(V0, BidResponsedEx.KEY_CID);
            int F3 = z1a.F(V0, "name");
            int F4 = z1a.F(V0, CampaignEx.JSON_KEY_DESC);
            if (F != -1 && F2 != -1 && F3 != -1 && F4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (V0.U0()) {
                    if (((int) V0.getLong(F2)) >= 0) {
                        int i = (int) V0.getLong(F);
                        String F0 = V0.F0(F3);
                        String str2 = V0.getLong(F4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i), F0);
                        linkedHashMap2.put(Integer.valueOf(i), str2);
                    }
                }
                List H0 = CollectionsKt.H0(linkedHashMap.entrySet(), new laf(14));
                ArrayList arrayList = new ArrayList(k13.r(H0, 10));
                Iterator it = H0.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List S0 = CollectionsKt.S0(arrayList);
                List H02 = CollectionsKt.H0(linkedHashMap2.entrySet(), new laf(15));
                ArrayList arrayList2 = new ArrayList(k13.r(H02, 10));
                Iterator it2 = H02.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                rsi rsiVar = new rsi(str, S0, CollectionsKt.S0(arrayList2), z);
                o1j.t(V0, null);
                return rsiVar;
            }
            o1j.t(V0, null);
            return null;
        } finally {
        }
    }

    public static final d6f K(ale aleVar, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.d0(-1006141136);
        av8Var.d0(2097651363);
        Object O = av8Var.O();
        a99 a99Var = nf3.a;
        if (O == a99Var) {
            O = new d6f();
            av8Var.n0(O);
        }
        d6f d6fVar = (d6f) O;
        av8Var.s(false);
        av8Var.d0(2097653782);
        boolean i2 = av8Var.i(d6fVar) | av8Var.i(aleVar);
        Object O2 = av8Var.O();
        rq3 rq3Var = null;
        if (i2 || O2 == a99Var) {
            O2 = new gje(d6fVar, aleVar, rq3Var, 9);
            av8Var.n0(O2);
        }
        av8Var.s(false);
        hz8.o(av8Var, aleVar, (Function2) O2);
        av8Var.d0(2097656206);
        int i3 = 1;
        boolean i4 = ((((i & 112) ^ 48) > 32 && av8Var.h(false)) || (i & 48) == 32) | av8Var.i(d6fVar);
        Object O3 = av8Var.O();
        if (i4 || O3 == a99Var) {
            O3 = new hje(d6fVar, rq3Var, i3);
            av8Var.n0(O3);
        }
        av8Var.s(false);
        hz8.o(av8Var, false, (Function2) O3);
        av8Var.s(false);
        return d6fVar;
    }

    public static final long L(long j) {
        return (Math.round(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (j >> 32))) << 32);
    }

    public static final void M(m8k m8kVar, String str) {
        str.getClass();
        m8kVar.d(StringsKt.R(str) ? km5.a : str.equals("/") ? n8k.a : CollectionsKt.U0(StringsKt.Y(str, new char[]{'/'})));
    }

    public static final ImageVector N(int i, int i2, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        Context context = (Context) av8Var.k(nz.b);
        Resources resources = (Resources) av8Var.k(nz.c);
        Resources.Theme theme = context.getTheme();
        boolean g = ((((i2 & 112) ^ 48) > 32 && av8Var.e(i)) || (i2 & 48) == 32) | av8Var.g(resources) | av8Var.g(theme) | av8Var.g(resources.getConfiguration());
        Object O = av8Var.O();
        if (g || O == nf3.a) {
            TypedValue typedValue = new TypedValue();
            resources.getValue(i, typedValue, true);
            XmlResourceParser xml = resources.getXml(i);
            int next = xml.next();
            while (next != 2 && next != 1) {
                next = xml.next();
            }
            if (next != 2) {
                pvd.r("No start tag found");
                return null;
            }
            Unit unit = Unit.a;
            O = E(theme, resources, xml, typedValue.changingConfigurations).a;
            av8Var.n0(O);
        }
        return (ImageVector) O;
    }

    public static int O(byte[] bArr, int i, tg0 tg0Var) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        if (b2 < 0) {
            return P(b2, bArr, i2, tg0Var);
        }
        tg0Var.a = b2;
        return i2;
    }

    public static int P(int i, byte[] bArr, int i2, tg0 tg0Var) {
        byte b2 = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
        if (b2 >= 0) {
            tg0Var.a = i4 | (b2 << 7);
            return i3;
        }
        int i5 = i4 | ((b2 & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b3 = bArr[i3];
        if (b3 >= 0) {
            tg0Var.a = i5 | (b3 << 14);
            return i6;
        }
        int i7 = i5 | ((b3 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b4 = bArr[i6];
        if (b4 >= 0) {
            tg0Var.a = i7 | (b4 << 21);
            return i8;
        }
        int i9 = i7 | ((b4 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b5 = bArr[i8];
        if (b5 >= 0) {
            tg0Var.a = i9 | (b5 << 28);
            return i10;
        }
        int i11 = i9 | ((b5 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                tg0Var.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int Q(byte[] bArr, int i, tg0 tg0Var) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            tg0Var.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | ((b2 & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & Byte.MAX_VALUE) << i4;
            b2 = bArr[i3];
            i3 = i5;
        }
        tg0Var.b = j2;
        return i3;
    }

    public static int R(int i, byte[] bArr) {
        int i2 = bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i3 = bArr[i + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i4 = bArr[i + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        return ((bArr[i + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static long S(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public static int T(byte[] bArr, int i, tg0 tg0Var) {
        int O = O(bArr, i, tg0Var);
        int i2 = tg0Var.a;
        if (i2 < 0) {
            hbo.i("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i2 == 0) {
            tg0Var.c = "";
            return O;
        }
        tg0Var.c = tqo.b(O, i2, bArr);
        return O + i2;
    }

    public static int U(byte[] bArr, int i, tg0 tg0Var) {
        int O = O(bArr, i, tg0Var);
        int i2 = tg0Var.a;
        if (i2 < 0) {
            hbo.i("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i2 > bArr.length - O) {
            hbo.i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        if (i2 == 0) {
            tg0Var.c = zziei.b;
            return O;
        }
        tg0Var.c = zziei.B(O, i2, bArr);
        return O + i2;
    }

    public static int V(Object obj, nqo nqoVar, byte[] bArr, int i, int i2, tg0 tg0Var) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = P(i4, bArr, i3, tg0Var);
            i4 = tg0Var.a;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            hbo.i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        int i6 = tg0Var.d + 1;
        tg0Var.d = i6;
        c0(i6);
        int i7 = i5 + i4;
        nqoVar.d(obj, bArr, i5, i7, tg0Var);
        tg0Var.d--;
        tg0Var.c = obj;
        return i7;
    }

    public static int W(Object obj, nqo nqoVar, byte[] bArr, int i, int i2, int i3, tg0 tg0Var) {
        int i4 = tg0Var.d + 1;
        tg0Var.d = i4;
        c0(i4);
        int y = ((v) nqoVar).y(obj, bArr, i, i2, i3, tg0Var);
        tg0Var.d--;
        tg0Var.c = obj;
        return y;
    }

    public static int X(int i, byte[] bArr, int i2, int i3, zzify zzifyVar, tg0 tg0Var) {
        wpo wpoVar = (wpo) zzifyVar;
        int O = O(bArr, i2, tg0Var);
        wpoVar.h(tg0Var.a);
        while (O < i3) {
            int O2 = O(bArr, O, tg0Var);
            if (i != tg0Var.a) {
                break;
            }
            O = O(bArr, O2, tg0Var);
            wpoVar.h(tg0Var.a);
        }
        return O;
    }

    public static int Y(byte[] bArr, int i, zzify zzifyVar, tg0 tg0Var) {
        wpo wpoVar = (wpo) zzifyVar;
        int O = O(bArr, i, tg0Var);
        int i2 = tg0Var.a;
        if (i2 < 0) {
            hbo.i("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i2 > bArr.length - O) {
            hbo.i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        int i3 = i2 + O;
        while (O < i3) {
            O = O(bArr, O, tg0Var);
            wpoVar.h(tg0Var.a);
        }
        if (O == i3) {
            return O;
        }
        hbo.i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    public static int Z(nqo nqoVar, int i, byte[] bArr, int i2, int i3, zzify zzifyVar, tg0 tg0Var) {
        Object zza = nqoVar.zza();
        nqo nqoVar2 = nqoVar;
        byte[] bArr2 = bArr;
        int i4 = i3;
        tg0 tg0Var2 = tg0Var;
        int V = V(zza, nqoVar2, bArr2, i2, i4, tg0Var2);
        nqoVar2.c(zza);
        tg0Var2.c = zza;
        zzifyVar.add(zza);
        while (V < i4) {
            tg0 tg0Var3 = tg0Var2;
            int i5 = i4;
            int O = O(bArr2, V, tg0Var3);
            if (i != tg0Var3.a) {
                break;
            }
            byte[] bArr3 = bArr2;
            nqo nqoVar3 = nqoVar2;
            Object zza2 = nqoVar3.zza();
            V = V(zza2, nqoVar3, bArr3, O, i5, tg0Var3);
            nqoVar2 = nqoVar3;
            bArr2 = bArr3;
            i4 = i5;
            tg0Var2 = tg0Var3;
            nqoVar2.c(zza2);
            tg0Var2.c = zza2;
            zzifyVar.add(zza2);
        }
        return V;
    }

    public static final void a(boolean z, xtc xtcVar, of3 of3Var, int i) {
        boolean z2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1149629689);
        int i2 = (av8Var.h(z) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            z2 = z;
            fz8.e(z2, null, uo5.e(s02.h0(200, 0, null, 6), 2), uo5.f(s02.h0(200, 0, null, 6), 2), null, yqo.H(1320041263, av8Var, new bba(xtcVar, 7)), av8Var, (i2 & 14) | 200064, 18);
        } else {
            z2 = z;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new gs5(z2, xtcVar, i, 3);
        }
    }

    public static int a0(int i, byte[] bArr, int i2, int i3, zziib zziibVar, tg0 tg0Var) {
        if ((i >>> 3) == 0) {
            hbo.i("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int Q = Q(bArr, i2, tg0Var);
            zziibVar.d(i, Long.valueOf(tg0Var.b));
            return Q;
        }
        if (i4 == 1) {
            zziibVar.d(i, Long.valueOf(S(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int O = O(bArr, i2, tg0Var);
            int i5 = tg0Var.a;
            if (i5 < 0) {
                hbo.i("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return 0;
            }
            if (i5 > bArr.length - O) {
                hbo.i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0;
            }
            if (i5 == 0) {
                zziibVar.d(i, zziei.b);
            } else {
                zziibVar.d(i, zziei.B(O, i5, bArr));
            }
            return O + i5;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                zziibVar.d(i, Integer.valueOf(R(i2, bArr)));
                return i2 + 4;
            }
            hbo.i("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i6 = (i & (-8)) | 4;
        zziib a2 = zziib.a();
        int i7 = tg0Var.d + 1;
        tg0Var.d = i7;
        c0(i7);
        int i8 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int O2 = O(bArr, i2, tg0Var);
            int i9 = tg0Var.a;
            if (i9 == i6) {
                i8 = i9;
                i2 = O2;
                break;
            }
            i2 = a0(i9, bArr, O2, i3, a2, tg0Var);
            i8 = i9;
        }
        tg0Var.d--;
        if (i2 > i3 || i8 != i6) {
            hbo.i("Failed to parse the message.");
            return 0;
        }
        zziibVar.d(i, a2);
        return i2;
    }

    public static final void b(int i, int i2, of3 of3Var, String str, String str2) {
        str.getClass();
        str2.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1159254407);
        int i3 = (av8Var.e(i) ? 4 : 2) | i2 | (av8Var.g(str) ? 32 : 16) | (av8Var.g(str2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            utc utcVar = utc.a;
            xtc c0 = l98.c0(bkh.d(utcVar, 1.0f), 16.0f, 8.0f);
            l8g a2 = k8g.a(new ng0(16.0f, true, new a70(6)), uxf.m, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
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
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            td4.y(i, (i3 & 14) | 48, 12, av8Var, bkh.l(utcVar, 40.0f), null, false);
            String w = oea.w(R.string.bullet_separator, new Object[]{str, str2}, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(w, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var, 0, 0, 131066);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new lce(i, str, str2, i2);
        }
    }

    public static int b0(int i, byte[] bArr, int i2, int i3, tg0 tg0Var) {
        if ((i >>> 3) == 0) {
            hbo.i("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return Q(bArr, i2, tg0Var);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return O(bArr, i2, tg0Var) + tg0Var.a;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            hbo.i("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i5 = (i & (-8)) | 4;
        int i6 = tg0Var.d + 1;
        tg0Var.d = i6;
        c0(i6);
        int i7 = 0;
        while (i2 < i3) {
            i2 = O(bArr, i2, tg0Var);
            i7 = tg0Var.a;
            if (i7 == i5) {
                break;
            }
            i2 = b0(i7, bArr, i2, i3, tg0Var);
        }
        tg0Var.d--;
        if (i2 <= i3 && i7 == i5) {
            return i2;
        }
        hbo.i("Failed to parse the message.");
        return 0;
    }

    public static final void c(lxe lxeVar, xtc xtcVar, of3 of3Var, int i) {
        lxe lxeVar2;
        xtc xtcVar2;
        lxeVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(718328321);
        int i2 = 2;
        int i3 = i | (av8Var.g(lxeVar) ? 4 : 2) | 48;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) av8Var.k(nz.b);
            utc utcVar = utc.a;
            xtc d2 = bkh.d(utcVar, 1.0f);
            Integer num = lxeVar.b;
            mxe mxeVar = lxeVar.e;
            boolean z = num != null;
            boolean i4 = av8Var.i(context) | ((i3 & 14) == 4);
            Object O = av8Var.O();
            if (i4 || O == nf3.a) {
                O = new ixa(i2, context, lxeVar);
                av8Var.n0(O);
            }
            xtc c0 = l98.c0(tol.y(d2, z, false, false, 0L, null, (Function0) O, av8Var, 30), 16.0f, 8.0f);
            lv1 lv1Var = uxf.m;
            l8g a2 = k8g.a(new ng0(16.0f, true, new a70(6)), lv1Var, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
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
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            td4.G(lxeVar.a, bkh.l(utcVar, 24.0f), false, 0L, av8Var, 48, 12);
            tz9.r(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 14, 0L, 0L, av8Var, bkh.p(bkh.e(utcVar, 32.0f), 2.0f));
            goa goaVar = new goa(1.0f, true);
            u23 a3 = t23.a(new ng0(2.0f, true, new a70(6)), uxf.o, av8Var, 6);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, goaVar);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            l8g a4 = k8g.a(ww9.b, lv1Var, av8Var, 48);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, utcVar);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a4, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            kq9.b(N(mxeVar.a, 6, av8Var), null, bkh.l(utcVar, 14.0f), lz.D(mxeVar.b, av8Var), av8Var, 432, 0);
            String str = lxeVar.c;
            yf8 yf8Var = xth.a;
            udj.c(str, l98.f0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.f(), av8Var, 48, 24960, 110584);
            av8Var.s(true);
            udj.c(mxeVar.c.a(av8Var), null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.f(), av8Var, 0, 24960, 110586);
            av8Var.s(true);
            lxeVar2 = lxeVar;
            udj.c(lxeVar2.f, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, dfj.a(xth.b(), 0L, 0L, null, null, 0L, null, 0, 1, 0L, null, null, 0, 16711679), av8Var, 0, 24960, 110586);
            av8Var = av8Var;
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            lxeVar2 = lxeVar;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new op9(lxeVar2, xtcVar2, i, 12);
        }
    }

    public static void c0(int i) {
        if (i < 100) {
            return;
        }
        hbo.i("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    public static final void e(Integer num, gv9 gv9Var, boolean z, xtc xtcVar, of3 of3Var, int i) {
        xtc xtcVar2;
        utc utcVar;
        boolean z2;
        gv9Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1833258891);
        int i2 = i | (av8Var.g(num) ? 4 : 2) | (av8Var.g(gv9Var) ? 32 : 16) | (av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | 3072;
        if (av8Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            Context context = (Context) av8Var.k(nz.b);
            utc utcVar2 = utc.a;
            xtc d2 = bkh.d(n9e.q(wnn.A(l98.c0(utcVar2, 8.0f, 4.0f), o7g.a(16.0f)), lz.D(R.color.surface_1, av8Var), o7g.a(16.0f)), 1.0f);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, d2);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            lxe lxeVar = (lxe) CollectionsKt.firstOrNull(gv9Var);
            sha.a(0, 0, av8Var, l98.e0(utcVar2, 16.0f, 2.0f, 16.0f, 6.0f), new n9k(R.string.player_updates, lxeVar != null ? lxeVar.d : null).a(av8Var));
            av8Var.d0(57615765);
            Iterator<E> it = gv9Var.iterator();
            while (it.hasNext()) {
                c((lxe) it.next(), null, av8Var, 0);
            }
            av8Var.s(false);
            if (z) {
                av8Var.d0(1786229054);
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
                    O2 = jxa.e;
                    av8Var.n0(O2);
                }
                xtc f0 = l98.f0(bkh.d(tol.y(utcVar2, true, true, true, D, wzcVar, new e32((boh) o3a.N(objArr, (Function0) O2, av8Var, 48), context, num, gv9Var), av8Var, 0), 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 20.0f, 5);
                l8g a3 = k8g.a(ww9.f, uxf.m, av8Var, 54);
                int hashCode2 = Long.hashCode(av8Var.T);
                aee m2 = av8Var.m();
                xtc C2 = fqj.C(av8Var, f0);
                if3.k7.getClass();
                zg3 zg3Var2 = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var2);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a3, hf3.g);
                waa.K(av8Var, m2, hf3.f);
                waa.K(av8Var, Integer.valueOf(hashCode2), hf3.j);
                waa.J(av8Var, hf3.k);
                waa.K(av8Var, C2, hf3.d);
                String v = oea.v(R.string.see_all, av8Var);
                yf8 yf8Var = xth.a;
                utcVar = utcVar2;
                udj.c(v, null, lz.D(R.color.primary_default, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, 0, 0, 131066);
                av8Var = av8Var;
                kq9.b(N(R.drawable.ic_chevron_right_large_16, 6, av8Var), null, bkh.l(l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 16.0f), lz.D(R.color.primary_default, av8Var), av8Var, 432, 0);
                z2 = true;
                av8Var.s(true);
                av8Var.s(false);
            } else {
                utcVar = utcVar2;
                z2 = true;
                bf3.r(20.0f, 1787316224, av8Var, av8Var, utcVar);
                av8Var.s(false);
            }
            av8Var.s(z2);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new p81(num, gv9Var, z, xtcVar2, i, 12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(float f, float f2, int i, int i2, long j, long j2, of3 of3Var, xtc xtcVar) {
        xtc xtcVar2;
        int i3;
        float f3;
        int i4;
        float f4;
        long j3;
        int i5;
        int i6;
        long j4;
        xtc xtcVar3;
        float f5;
        float f6;
        long j5;
        long j6;
        eqf u;
        float f7;
        long D;
        int i7;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(504269320);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            xtcVar2 = xtcVar;
        } else if ((i & 6) == 0) {
            xtcVar2 = xtcVar;
            i3 = (av8Var.g(xtcVar2) ? 4 : 2) | i;
        } else {
            xtcVar2 = xtcVar;
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            f3 = f;
            i3 |= av8Var.d(f3) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                f4 = f2;
                i3 |= av8Var.d(f4) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
                int i10 = i3 | 3072;
                if ((i2 & 16) == 0) {
                    j3 = j;
                    if (av8Var.f(j3)) {
                        i5 = 16384;
                        i6 = i10 | i5;
                        if ((196608 & i) != 0) {
                            if ((i2 & 32) == 0) {
                                j4 = j2;
                                if (av8Var.f(j4)) {
                                    i7 = 131072;
                                    i6 |= i7;
                                }
                            } else {
                                j4 = j2;
                            }
                            i7 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                            i6 |= i7;
                        } else {
                            j4 = j2;
                        }
                        if (av8Var.T(i6 & 1, (74899 & i6) == 74898)) {
                            av8Var.W();
                            xtcVar3 = xtcVar2;
                            f5 = f3;
                            f6 = f4;
                            j5 = j3;
                            j6 = j4;
                        } else {
                            av8Var.Y();
                            int i11 = i & 1;
                            utc utcVar = utc.a;
                            if (i11 == 0 || av8Var.B()) {
                                if (i8 != 0) {
                                    xtcVar2 = utcVar;
                                }
                                f7 = i9 != 0 ? 64.0f : f3;
                                if (i4 != 0) {
                                    f4 = 8.0f;
                                }
                                if ((i2 & 16) != 0) {
                                    i6 &= -57345;
                                    j3 = lz.D(R.color.primary_default, av8Var);
                                }
                                if ((i2 & 32) != 0) {
                                    D = lz.D(R.color.primary_highlight, av8Var);
                                    i6 &= -458753;
                                    float f8 = f4;
                                    long j7 = j3;
                                    av8Var.t();
                                    mv1 mv1Var = uxf.g;
                                    xtc b0 = l98.b0(bkh.d(xtcVar2, 1.0f), 8.0f);
                                    k1c c2 = e12.c(mv1Var, false);
                                    long j8 = D;
                                    int hashCode = Long.hashCode(av8Var.T);
                                    aee m = av8Var.m();
                                    xtc C = fqj.C(av8Var, b0);
                                    if3.k7.getClass();
                                    zg3 zg3Var = hf3.b;
                                    av8Var.h0();
                                    if (av8Var.S) {
                                        av8Var.q0();
                                    } else {
                                        av8Var.l(zg3Var);
                                    }
                                    waa.K(av8Var, c2, hf3.g);
                                    waa.K(av8Var, m, hf3.f);
                                    waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                                    waa.J(av8Var, hf3.k);
                                    waa.K(av8Var, C, hf3.d);
                                    ncf.a(bkh.l(utcVar, f7), j7, f8, j8, 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, ((i6 >> 9) & 112) | (i6 & 896) | ((i6 >> 6) & 7168), 32);
                                    av8Var.s(true);
                                    xtc xtcVar4 = xtcVar2;
                                    f5 = f7;
                                    xtcVar3 = xtcVar4;
                                    j5 = j7;
                                    f6 = f8;
                                    j6 = j8;
                                }
                            } else {
                                av8Var.W();
                                if ((i2 & 16) != 0) {
                                    i6 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i6 &= -458753;
                                }
                                f7 = f3;
                            }
                            D = j4;
                            float f82 = f4;
                            long j72 = j3;
                            av8Var.t();
                            mv1 mv1Var2 = uxf.g;
                            xtc b02 = l98.b0(bkh.d(xtcVar2, 1.0f), 8.0f);
                            k1c c22 = e12.c(mv1Var2, false);
                            long j82 = D;
                            int hashCode2 = Long.hashCode(av8Var.T);
                            aee m2 = av8Var.m();
                            xtc C2 = fqj.C(av8Var, b02);
                            if3.k7.getClass();
                            zg3 zg3Var2 = hf3.b;
                            av8Var.h0();
                            if (av8Var.S) {
                            }
                            waa.K(av8Var, c22, hf3.g);
                            waa.K(av8Var, m2, hf3.f);
                            waa.K(av8Var, Integer.valueOf(hashCode2), hf3.j);
                            waa.J(av8Var, hf3.k);
                            waa.K(av8Var, C2, hf3.d);
                            ncf.a(bkh.l(utcVar, f7), j72, f82, j82, 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, ((i6 >> 9) & 112) | (i6 & 896) | ((i6 >> 6) & 7168), 32);
                            av8Var.s(true);
                            xtc xtcVar42 = xtcVar2;
                            f5 = f7;
                            xtcVar3 = xtcVar42;
                            j5 = j72;
                            f6 = f82;
                            j6 = j82;
                        }
                        u = av8Var.u();
                        if (u == null) {
                            u.d = new g56(xtcVar3, f5, f6, j5, j6, i, i2);
                            return;
                        }
                        return;
                    }
                } else {
                    j3 = j;
                }
                i5 = 8192;
                i6 = i10 | i5;
                if ((196608 & i) != 0) {
                }
                if (av8Var.T(i6 & 1, (74899 & i6) == 74898)) {
                }
                u = av8Var.u();
                if (u == null) {
                }
            }
            f4 = f2;
            int i102 = i3 | 3072;
            if ((i2 & 16) == 0) {
            }
            i5 = 8192;
            i6 = i102 | i5;
            if ((196608 & i) != 0) {
            }
            if (av8Var.T(i6 & 1, (74899 & i6) == 74898)) {
            }
            u = av8Var.u();
            if (u == null) {
            }
        }
        f3 = f;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        f4 = f2;
        int i1022 = i3 | 3072;
        if ((i2 & 16) == 0) {
        }
        i5 = 8192;
        i6 = i1022 | i5;
        if ((196608 & i) != 0) {
        }
        if (av8Var.T(i6 & 1, (74899 & i6) == 74898)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void g(int i, int i2, of3 of3Var, xtc xtcVar) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1937473982);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (av8Var.g(xtcVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if (av8Var.T(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                xtcVar = utc.a;
            }
            k1c c2 = e12.c(uxf.g, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, xtcVar);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            un0.a(null, o7g.a(16.0f), rd0.t(lz.D(R.color.surface_P, av8Var), av8Var, 0), rd0.u(8.0f, 62), null, rd0.e, av8Var, 196608, 17);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        xtc xtcVar2 = xtcVar;
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new hn1(xtcVar2, i, i2, 8, (byte) 0);
        }
    }

    public static final void h(xtc xtcVar, tc3 tc3Var, k1c k1cVar, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1663319424);
        int i2 = (av8Var.g(xtcVar) ? 4 : 2) | i | (av8Var.g(k1cVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            int hashCode = Integer.hashCode(z8e.G(av8Var));
            xtc C = fqj.C(av8Var, xtcVar);
            aee m = av8Var.m();
            zg3 zg3Var = zg3.y;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            if3.k7.getClass();
            waa.K(av8Var, k1cVar, hf3.g);
            waa.K(av8Var, m, hf3.f);
            if (av8Var.S) {
                av8Var.b(Unit.a, new t6j(21));
            }
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            fc6.v(6, tc3Var, av8Var, true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ah3(xtcVar, tc3Var, k1cVar, i);
        }
    }

    public static final void i(ukf ukfVar, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        av8 av8Var;
        int i3;
        xtc xtcVar2;
        float f;
        r13 r13Var;
        long j;
        RaceFlowModels$RaceEntrant raceFlowModels$RaceEntrant = ukfVar.a;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(148485388);
        if ((i & 6) == 0) {
            i2 = (av8Var2.g(ukfVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if (av8Var2.T(i4 & 1, (i4 & 19) != 18)) {
            StringBuilder sb = new StringBuilder();
            sb.append(raceFlowModels$RaceEntrant.c);
            ykf ykfVar = ukfVar.b;
            String str = ykfVar.d;
            String str2 = ykfVar.e;
            if (str != null && str2 != null) {
                sb.append(": ");
                sb.append(str + ">" + str2);
            }
            String sb2 = sb.toString();
            long D = lz.D(R.color.n_lv_1, av8Var2);
            yf8 yf8Var = xth.a;
            dfj b2 = xth.b();
            long D2 = lz.D(R.color.surface_1, av8Var2);
            n7g a2 = o7g.a(12.0f);
            utc utcVar = utc.a;
            xtc q = n9e.q(utcVar, D2, a2);
            RaceFlowModels$RaceTeam raceFlowModels$RaceTeam = raceFlowModels$RaceEntrant.e;
            if (raceFlowModels$RaceTeam != null) {
                f = 12.0f;
                r13Var = new r13(hkg.b(raceFlowModels$RaceTeam.c));
            } else {
                f = 12.0f;
                r13Var = null;
            }
            if (r13Var == null) {
                j = ljg.f(av8Var2, 960562879, R.color.neutral_default, av8Var2, false);
            } else {
                av8Var2.d0(960561143);
                av8Var2.s(false);
                j = r13Var.a;
            }
            i3 = 1;
            av8Var = av8Var2;
            udj.c(sb2, l98.d0(yso.o(q, 1.0f, j, o7g.a(f)), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), D, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, b2, av8Var, 0, 24960, 110584);
            xtcVar2 = utcVar;
        } else {
            av8Var = av8Var2;
            i3 = 1;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new zkf(ukfVar, xtcVar2, i, i3);
        }
    }

    public static final void j(ukf ukfVar, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        av8 av8Var;
        xtc xtcVar2;
        long j;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1418464958);
        if ((i & 6) == 0) {
            i2 = (av8Var2.g(ukfVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (av8Var2.T(i3 & 1, (i3 & 19) != 18)) {
            ykf ykfVar = ukfVar.b;
            RaceFlowModels$RaceEntrant raceFlowModels$RaceEntrant = ukfVar.a;
            String str = yid.p(ykfVar.b) + " " + raceFlowModels$RaceEntrant.c;
            long D = lz.D(R.color.on_color_primary, av8Var2);
            yf8 yf8Var = xth.a;
            dfj b2 = xth.b();
            RaceFlowModels$RaceTeam raceFlowModels$RaceTeam = raceFlowModels$RaceEntrant.e;
            r13 r13Var = raceFlowModels$RaceTeam != null ? new r13(hkg.b(raceFlowModels$RaceTeam.c)) : null;
            if (r13Var == null) {
                j = ljg.f(av8Var2, 1640210193, R.color.neutral_default, av8Var2, false);
            } else {
                av8Var2.d0(1640208457);
                av8Var2.s(false);
                j = r13Var.a;
            }
            n7g a2 = o7g.a(12.0f);
            utc utcVar = utc.a;
            av8Var = av8Var2;
            udj.c(str, l98.d0(n9e.q(utcVar, j, a2), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), D, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, b2, av8Var, 0, 24960, 110584);
            xtcVar2 = utcVar;
        } else {
            av8Var = av8Var2;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new zkf(ukfVar, xtcVar2, i, 0);
        }
    }

    public static final void k(String str, gv9 gv9Var, tc3 tc3Var, xtc xtcVar, of3 of3Var, int i) {
        gv9Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1659866462);
        int i2 = 4;
        int i3 = (av8Var.g(str) ? 4 : 2) | i | (av8Var.g(gv9Var) ? 32 : 16);
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            s02.n(l98.c0(n9e.q(gz8.x(bkh.d(xtcVar, 1.0f), null, null, 3), lz.D(R.color.surface_2, av8Var), o7g.a(8.0f)), 8.0f, 4.0f), new ng0(4.0f, true, new a70(6)), new ng0(8.0f, false, new a70(7)), null, 0, 0, yqo.H(1015877059, av8Var, new zya(i2, str, gv9Var, tc3Var)), av8Var, 1573296, 56);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new mp9(i, 9, str, gv9Var, tc3Var, xtcVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void l(pv3 pv3Var, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        utc utcVar;
        int i3;
        boolean z;
        av8 av8Var;
        av8 av8Var2;
        int i4;
        pv3 pv3Var2 = pv3Var;
        pv3Var2.getClass();
        av8 av8Var3 = (av8) of3Var;
        av8Var3.f0(1136380704);
        int i5 = 2;
        int i6 = i | (av8Var3.g(pv3Var2) ? 4 : 2) | (av8Var3.g(xtcVar) ? 32 : 16);
        if (av8Var3.T(i6 & 1, (i6 & 19) != 18)) {
            Object obj = (Context) av8Var3.k(nz.b);
            boolean i7 = ((i6 & 14) == 4) | av8Var3.i(obj);
            Object O = av8Var3.O();
            Object obj2 = nf3.a;
            if (i7 || O == obj2) {
                O = new deh(i5, obj, pv3Var2);
                av8Var3.n0(O);
            }
            Function0 function0 = (Function0) O;
            xtc O2 = kda.O(l98.f0(l98.d0(n9e.q(wnn.A(bkh.d(xtcVar, 1.0f), o7g.a(16.0f)), lz.D(R.color.surface_1, av8Var3), o7g.a(16.0f)), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 5), "special_offer_container", av8Var3);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var3, 0);
            int hashCode = Long.hashCode(av8Var3.T);
            aee m = av8Var3.m();
            xtc C = fqj.C(av8Var3, O2);
            if3.k7.getClass();
            Function0 function02 = hf3.b;
            av8Var3.h0();
            if (av8Var3.S) {
                av8Var3.l(function02);
            } else {
                av8Var3.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var3, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var3, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var3, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var3, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var3, C, f50Var3);
            utc utcVar2 = utc.a;
            xtc O3 = kda.O(l98.f0(bkh.d(utcVar2, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 7), "special_offer_title", av8Var3);
            lv1 lv1Var = uxf.m;
            wxf wxfVar = ww9.b;
            l8g a3 = k8g.a(wxfVar, lv1Var, av8Var3, 48);
            int hashCode2 = Long.hashCode(av8Var3.T);
            aee m2 = av8Var3.m();
            xtc C2 = fqj.C(av8Var3, O3);
            av8Var3.h0();
            if (av8Var3.S) {
                av8Var3.l(function02);
            } else {
                av8Var3.q0();
            }
            waa.K(av8Var3, a3, f50Var);
            waa.K(av8Var3, m2, ff3Var);
            bf3.s(hashCode2, av8Var3, f50Var2, av8Var3, ryVar);
            waa.K(av8Var3, C2, f50Var3);
            String v = oea.v(R.string.bet_boost_special_offer, av8Var3);
            yf8 yf8Var = xth.a;
            udj.c(v, null, lz.D(R.color.n_lv_1, av8Var3), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var3, 0, 0, 131066);
            w1l.o(1.0f, true, av8Var3);
            xtc O4 = kda.O(utcVar2, "claim_btn", av8Var3);
            long D = lz.D(R.color.n_lv_4, av8Var3);
            Object O5 = av8Var3.O();
            if (O5 == obj2) {
                O5 = mz1.e(av8Var3);
            }
            wzc wzcVar = (wzc) O5;
            Object[] objArr = new Object[0];
            Object O6 = av8Var3.O();
            if (O6 == obj2) {
                O6 = mce.y;
                av8Var3.n0(O6);
            }
            xtc b0 = l98.b0(tol.y(O4, true, true, true, D, wzcVar, new cyg(function0, (boh) o3a.N(objArr, (Function0) O6, av8Var3, 48), 4), av8Var3, 0), 4.0f);
            l8g a4 = k8g.a(wxfVar, lv1Var, av8Var3, 48);
            int hashCode3 = Long.hashCode(av8Var3.T);
            aee m3 = av8Var3.m();
            xtc C3 = fqj.C(av8Var3, b0);
            av8Var3.h0();
            if (av8Var3.S) {
                av8Var3.l(function02);
            } else {
                av8Var3.q0();
            }
            waa.K(av8Var3, a4, f50Var);
            waa.K(av8Var3, m3, ff3Var);
            bf3.s(hashCode3, av8Var3, f50Var2, av8Var3, ryVar);
            waa.K(av8Var3, C3, f50Var3);
            String str = pv3Var.d;
            if (str == null) {
                str = ljg.k(av8Var3, 1058771475, R.string.claim_reward_button, av8Var3, false);
            } else {
                av8Var3.d0(1058771010);
                av8Var3.s(false);
            }
            pv3Var2 = pv3Var;
            udj.c(str, null, lz.D(R.color.primary_default, av8Var3), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var3, 0, 0, 131066);
            av8 av8Var4 = av8Var3;
            kq9.b(N(R.drawable.ic_chevron_right_large_16, 6, av8Var4), null, bkh.l(l98.f0(utcVar2, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), 16.0f), lz.D(R.color.primary_default, av8Var4), av8Var4, 432, 0);
            av8Var4.s(true);
            av8Var4.s(true);
            if (pv3Var2.c != null) {
                av8Var4.d0(971775480);
                utcVar = utcVar2;
                xtc O7 = kda.O(l98.f0(utcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 5), "special_offer_text", av8Var4);
                String str2 = pv3Var2.c;
                dfj k = xth.k();
                i3 = R.color.n_lv_1;
                udj.c(str2, O7, lz.D(R.color.n_lv_1, av8Var4), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, k, av8Var4, 0, 0, 131064);
                av8 av8Var5 = av8Var4;
                z = false;
                av8Var5.s(false);
                av8Var = av8Var5;
            } else {
                utcVar = utcVar2;
                i3 = R.color.n_lv_1;
                z = false;
                av8Var4.d0(972062168);
                av8Var4.s(false);
                av8Var = av8Var4;
            }
            if (pv3Var2.e != null) {
                av8Var.d0(972122897);
                xtc O8 = kda.O(bkh.d(utcVar, 1.0f), "disclaimer", av8Var);
                boolean z2 = z;
                String str3 = pv3Var2.e;
                dfj g = xth.g();
                long D2 = lz.D(i3, av8Var);
                av8 av8Var6 = av8Var;
                boolean z3 = z2;
                udj.c(str3, O8, D2, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, g, av8Var6, 0, 0, 131064);
                av8 av8Var7 = av8Var6;
                av8Var7.s(z3);
                i4 = z3;
                av8Var2 = av8Var7;
            } else {
                boolean z4 = z;
                av8Var.d0(972385560);
                av8Var.s(z4);
                i4 = z4;
                av8Var2 = av8Var;
            }
            xtc O9 = kda.O(wnn.A(bkh.e(bkh.p(l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 48.0f), 24.0f), o7g.a(4.0f)), "provider_logo", av8Var2);
            long D3 = lz.D(R.color.n_lv_4, av8Var2);
            Object O10 = av8Var2.O();
            if (O10 == obj2) {
                O10 = mz1.e(av8Var2);
            }
            wzc wzcVar2 = (wzc) O10;
            Object[] objArr2 = new Object[i4];
            Object O11 = av8Var2.O();
            if (O11 == obj2) {
                O11 = mce.x;
                av8Var2.n0(O11);
            }
            av8 av8Var8 = av8Var2;
            xtc y = tol.y(O9, true, true, true, D3, wzcVar2, new cyg(function0, (boh) o3a.N(objArr2, (Function0) O11, av8Var2, 48), 3), av8Var8, 0);
            av8Var3 = av8Var8;
            haa.a(vxd.j(pv3Var2.b, (Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/"), "offers/signuplink/", "/logo"), null, y, null, null, av8Var3, 48, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
            i2 = 1;
            av8Var3.s(true);
        } else {
            i2 = 1;
            av8Var3.W();
        }
        eqf u = av8Var3.u();
        if (u != null) {
            u.d = new s5h(pv3Var2, xtcVar, i, i2);
        }
    }

    public static final void m(ydl ydlVar, Function1 function1, xtc xtcVar, of3 of3Var, int i) {
        ydlVar.getClass();
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(618139950);
        int i2 = i | (av8Var.e(ydlVar.ordinal()) ? 4 : 2) | (av8Var.i(function1) ? 32 : 16);
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            xtc A = wnn.A(bkh.d(xtcVar, 1.0f), o7g.a(16.0f));
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
                O2 = wzj.s;
                av8Var.n0(O2);
            }
            xtc y = tol.y(A, true, true, true, D, wzcVar, new eui((boh) o3a.N(objArr, (Function0) O2, av8Var, 48), function1, ydlVar, 17), av8Var, 0);
            k1c c2 = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, y);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, c2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            utc utcVar = utc.a;
            wkn.k(haa.t(R.drawable.fantasy_cta_background, 0, av8Var), null, n12.a.b(bkh.d(utcVar, 1.0f)), null, mp3.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 24632, 104);
            xtc d2 = bkh.d(utcVar, 1.0f);
            lv1 lv1Var = uxf.m;
            wxf wxfVar = ww9.b;
            l8g a2 = k8g.a(wxfVar, lv1Var, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, d2);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            xtc f0 = l98.f0(new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 16.0f, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 4);
            u23 a3 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, f0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            String v = oea.v(ydlVar.a, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, null, lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, 0, 0, 131066);
            udj.c(oea.v(ydlVar.b, av8Var), l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), lz.D(R.color.on_color_secondary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 48, 0, 131064);
            xtc O3 = kda.O(l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), ydlVar.f, av8Var);
            l8g a4 = k8g.a(wxfVar, lv1Var, av8Var, 48);
            int hashCode4 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C4 = fqj.C(av8Var, O3);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a4, f50Var);
            waa.K(av8Var, m4, ff3Var);
            bf3.s(hashCode4, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C4, f50Var3);
            udj.c(oea.v(ydlVar.c, av8Var), null, lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, 0, 0, 131066);
            kq9.b(N(R.drawable.ic_chevron_right_large_16, 6, av8Var), null, bkh.l(l98.f0(utcVar, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), 16.0f), lz.D(R.color.on_color_primary, av8Var), av8Var, 432, 0);
            av8Var = av8Var;
            av8Var.s(true);
            av8Var.s(true);
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            wkn.k(haa.t(ydlVar.d, 0, av8Var), null, bkh.e(new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 120.0f), uxf.k, mp3.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 27704, 96);
            av8Var.s(true);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new dgl(ydlVar, function1, xtcVar, i, 0);
        }
    }

    public static int n(BlazeDp blazeDp, int i) {
        return (blazeDp.hashCode() + i) * 31;
    }

    public static px0 o(upd updVar, u6b u6bVar, Function1 function1) {
        updVar.getClass();
        px0 px0Var = new px0(8, function1, false);
        updVar.a(u6bVar, px0Var);
        return px0Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final void p(m8k m8kVar, StringBuilder sb) {
        List list;
        sb.append(m8kVar.c().a);
        String str = m8kVar.c().a;
        switch (str.hashCode()) {
            case -1081572750:
                if (str.equals("mailto")) {
                    StringBuilder sb2 = new StringBuilder();
                    String str2 = m8kVar.e;
                    String str3 = m8kVar.f;
                    if (str2 != null) {
                        sb2.append(str2);
                        if (str3 != null) {
                            sb2.append(':');
                            sb2.append(str3);
                        }
                        sb2.append("@");
                    }
                    CharSequence sb3 = sb2.toString();
                    CharSequence charSequence = m8kVar.a;
                    sb.append(":");
                    sb.append(sb3);
                    sb.append(charSequence);
                    return;
                }
                break;
            case 114715:
                if (str.equals("tel")) {
                    CharSequence charSequence2 = m8kVar.a;
                    sb.append(":");
                    sb.append(charSequence2);
                    return;
                }
                break;
            case 3076010:
                if (str.equals("data")) {
                    CharSequence charSequence3 = m8kVar.a;
                    sb.append(":");
                    sb.append(charSequence3);
                    return;
                }
                break;
            case 3143036:
                if (str.equals(U3.i.b)) {
                    CharSequence charSequence4 = m8kVar.a;
                    String z = z(m8kVar);
                    sb.append("://");
                    sb.append(charSequence4);
                    if (!StringsKt.c0(z, '/')) {
                        sb.append('/');
                    }
                    sb.append((CharSequence) z);
                    return;
                }
                break;
            case 92611469:
                if (str.equals("about")) {
                    CharSequence charSequence5 = m8kVar.a;
                    sb.append(":");
                    sb.append(charSequence5);
                    return;
                }
                break;
        }
        sb.append("://");
        sb.append(y(m8kVar));
        String z2 = z(m8kVar);
        v8e v8eVar = m8kVar.i;
        boolean z3 = m8kVar.b;
        z2.getClass();
        if (!StringsKt.R(z2) && !c.v(z2, "/", false)) {
            sb.append('/');
        }
        sb.append((CharSequence) z2);
        if (!((Map) v8eVar.b).isEmpty() || z3) {
            sb.append("?");
        }
        Set<Map.Entry> c2 = v8eVar.c();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : c2) {
            String str4 = (String) entry.getKey();
            List list2 = (List) entry.getValue();
            if (list2.isEmpty()) {
                list = a.c(new Pair(str4, null));
            } else {
                ArrayList arrayList2 = new ArrayList(k13.r(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new Pair(str4, (String) it.next()));
                }
                list = arrayList2;
            }
            o13.v(list, arrayList);
        }
        CollectionsKt.e0(arrayList, sb, U3.j.c, null, null, new crj(27), 60);
        if (m8kVar.g.length() > 0) {
            sb.append('#');
            sb.append(m8kVar.g);
        }
    }

    public static final vuf q(Player player) {
        List y;
        List split$default;
        player.getClass();
        Country country = player.getCountry();
        String birthPlace = player.getBirthPlace();
        Object obj = null;
        if (country == null || birthPlace == null) {
            return null;
        }
        ArrayList arrayList = dv3.a;
        com.sofascore.model.Country a2 = dv3.a(country.getAlpha2());
        if (a2 == null || (y = n9e.y(a2)) == null) {
            return null;
        }
        Iterator it = y.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String code = ((vuf) next).getCode();
            split$default = StringsKt__StringsKt.split$default(birthPlace, new String[]{"-"}, false, 0, 6, null);
            if (Intrinsics.c(code, CollectionsKt.a0(1, split$default))) {
                obj = next;
                break;
            }
        }
        return (vuf) obj;
    }

    public static final long r(int i, int i2, jwj jwjVar) {
        hwj hwjVar;
        if (i == -1) {
            return (i2 << 32) | 4294967295L;
        }
        boolean z = i > i2;
        ay4 ay4Var = jwjVar.d;
        e7a e7aVar = (ay4Var == null || (hwjVar = (hwj) ay4Var.getValue()) == null) ? null : hwjVar.b;
        long a2 = e7aVar != null ? e7aVar.a(i, false) : t6a.g(i, i);
        long f = jwjVar.f(a2);
        int ordinal = ((pej.d(a2) && pej.d(f)) ? a1a.a : (pej.d(a2) || pej.d(f)) ? (!pej.d(a2) || pej.d(f)) ? a1a.d : a1a.b : a1a.c).ordinal();
        if (ordinal == 0) {
            return ok3.k(i, z ? l2l.a : l2l.b);
        }
        if (ordinal == 1) {
            return z ? i == ((int) (f >> 32)) ? ok3.k(i, l2l.a) : ok3.k((int) (f & 4294967295L), l2l.b) : i == ((int) (f & 4294967295L)) ? ok3.k(i, l2l.b) : ok3.k((int) (f >> 32), l2l.a);
        }
        if (ordinal == 2) {
            return z ? ok3.k((int) (f & 4294967295L), l2l.a) : ok3.k((int) (f >> 32), l2l.b);
        }
        if (ordinal == 3) {
            return (i << 32) | 4294967295L;
        }
        zzl.b();
        return 0L;
    }

    public static float s(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    public static int t(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    public static final boolean u(String str, String str2) {
        str.getClass();
        if (Intrinsics.c(str, str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i < str.length()) {
                    char charAt = str.charAt(i);
                    int i4 = i3 + 1;
                    if (i3 == 0 && charAt != '(') {
                        break;
                    }
                    if (charAt == '(') {
                        i2++;
                    } else if (charAt == ')' && i2 - 1 == 0 && i3 != str.length() - 1) {
                        break;
                    }
                    i++;
                    i3 = i4;
                } else if (i2 == 0) {
                    return Intrinsics.c(StringsKt.l0(str.substring(1, str.length() - 1)).toString(), str2);
                }
            }
        }
        return false;
    }

    public static final String v(Collection collection) {
        collection.getClass();
        return !collection.isEmpty() ? dii.b(CollectionsKt.f0(collection, ",\n", "\n", "\n", null, 56), "    ").concat("},") : " }";
    }

    public static b8d w(String str, String str2) {
        boolean equals = "integer".equals(str);
        cz1 cz1Var = b8d.o;
        b8d b8dVar = equals ? b8d.b : "integer[]".equals(str) ? b8d.d : "List<Int>".equals(str) ? b8d.e : "long".equals(str) ? b8d.f : "long[]".equals(str) ? b8d.g : "List<Long>".equals(str) ? b8d.h : "boolean".equals(str) ? b8d.l : "boolean[]".equals(str) ? b8d.m : "List<Boolean>".equals(str) ? b8d.n : "string".equals(str) ? cz1Var : "string[]".equals(str) ? b8d.p : "List<String>".equals(str) ? b8d.q : "float".equals(str) ? b8d.i : "float[]".equals(str) ? b8d.j : "List<Float>".equals(str) ? b8d.k : null;
        if (b8dVar != null) {
            return b8dVar;
        }
        if ("reference".equals(str)) {
            return b8d.c;
        }
        if (str.length() == 0) {
            return cz1Var;
        }
        try {
            String concat = (!c.v(str, ".", false) || str2 == null) ? str : str2.concat(str);
            boolean n = c.n(str, "[]", false);
            if (n) {
                concat = concat.substring(0, concat.length() - 2);
            }
            b8d G = G(Class.forName(concat), n);
            if (G != null) {
                return G;
            }
            throw new IllegalArgumentException(concat.concat(" is not Serializable or Parcelable.").toString());
        } catch (ClassNotFoundException e2) {
            is8.h(e2);
            return null;
        }
    }

    public static final n1c x(wqa wqaVar, int i, long j, p5e p5eVar, long j2, ewd ewdVar, fo foVar, lv1 lv1Var, ema emaVar, int i2, uzc uzcVar) {
        List list;
        Object d2 = p5eVar.d(i);
        List list2 = (List) uzcVar.b(i);
        if (list2 != null) {
            list = list2;
        } else {
            List a2 = wqaVar.a(i);
            int size = a2.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.add(((g1c) a2.get(i3)).J(j));
            }
            uzcVar.i(i, arrayList);
            list = arrayList;
        }
        return new n1c(i, i2, list, j2, d2, ewdVar, foVar, lv1Var, emaVar);
    }

    public static final String y(m8k m8kVar) {
        StringBuilder sb = new StringBuilder();
        String str = m8kVar.e;
        String str2 = m8kVar.f;
        if (str != null) {
            sb.append(str);
            if (str2 != null) {
                sb.append(':');
                sb.append(str2);
            }
            sb.append("@");
        }
        StringBuilder sb2 = new StringBuilder(sb.toString());
        sb2.append(m8kVar.a);
        int i = m8kVar.c;
        if (i != 0 && i != m8kVar.c().b) {
            sb2.append(":");
            sb2.append(String.valueOf(m8kVar.c));
        }
        return sb2.toString();
    }

    public static final String z(m8k m8kVar) {
        List list = m8kVar.h;
        return list.isEmpty() ? "" : list.size() == 1 ? ((CharSequence) CollectionsKt.Y(list)).length() == 0 ? "/" : (String) CollectionsKt.Y(list) : CollectionsKt.f0(list, "/", null, null, null, 62);
    }
}
