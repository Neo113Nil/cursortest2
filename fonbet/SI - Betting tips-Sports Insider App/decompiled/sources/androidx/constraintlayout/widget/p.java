package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.c1;
import com.appsflyer.attribution.RequestError;
import com.google.android.material.navigation.NavigationBarView;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.C0122e9;
import io.sentry.android.core.w0;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f1209d = {0, 4, 8};

    /* renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f1210e;

    /* renamed from: f, reason: collision with root package name */
    public static final SparseIntArray f1211f;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1212a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1213b = true;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f1214c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1210e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f1211f = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(BuildConfig.API_LEVEL, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static int[] c(Barrier barrier, String str) {
        int i5;
        Object designInformation;
        String[] split = str.split(StringUtils.COMMA);
        Context context = barrier.getContext();
        int[] iArr = new int[split.length];
        int i10 = 0;
        int i11 = 0;
        while (i10 < split.length) {
            String trim = split[i10].trim();
            try {
                i5 = r.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i5 = 0;
            }
            if (i5 == 0) {
                i5 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i5 == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) barrier.getParent()).getDesignInformation(0, trim)) != null && (designInformation instanceof Integer)) {
                i5 = ((Integer) designInformation).intValue();
            }
            iArr[i11] = i5;
            i10++;
            i11++;
        }
        return i11 != split.length ? Arrays.copyOf(iArr, i11) : iArr;
    }

    public static k d(Context context, AttributeSet attributeSet, boolean z5) {
        int i5;
        int i10;
        k kVar = new k();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z5 ? s.f1217c : s.f1215a);
        n nVar = kVar.f1141b;
        o oVar = kVar.f1144e;
        m mVar = kVar.f1142c;
        l lVar = kVar.f1143d;
        int[] iArr = f1209d;
        String[] strArr = w.a.f24945a;
        SparseIntArray sparseIntArray = f1210e;
        if (z5) {
            j jVar = new j();
            jVar.f1129a = new int[10];
            jVar.f1130b = new int[10];
            jVar.f1131c = 0;
            jVar.f1132d = new int[10];
            jVar.f1133e = new float[10];
            jVar.f1134f = 0;
            jVar.f1135g = new int[5];
            jVar.f1136h = new String[5];
            jVar.f1137i = 0;
            jVar.j = new int[4];
            jVar.f1138k = new boolean[4];
            jVar.f1139l = 0;
            mVar.getClass();
            lVar.getClass();
            oVar.getClass();
            int i11 = 0;
            for (int indexCount = obtainStyledAttributes.getIndexCount(); i11 < indexCount; indexCount = i10) {
                int index = obtainStyledAttributes.getIndex(i11);
                int i12 = i11;
                switch (f1211f.get(index)) {
                    case 2:
                        i10 = indexCount;
                        jVar.b(2, obtainStyledAttributes.getDimensionPixelSize(index, lVar.I));
                        continue;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case C0122e9.F /* 25 */:
                    case C0122e9.G /* 26 */:
                    case C0122e9.I /* 29 */:
                    case 30:
                    case 32:
                    case 33:
                    case C0122e9.J /* 35 */:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    case 91:
                    case 92:
                    default:
                        StringBuilder sb2 = new StringBuilder("Unknown attribute 0x");
                        i10 = indexCount;
                        sb2.append(Integer.toHexString(index));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index));
                        w0.m("ConstraintSet", sb2.toString());
                        break;
                    case 5:
                        i10 = indexCount;
                        jVar.c(5, obtainStyledAttributes.getString(index));
                        continue;
                    case 6:
                        i10 = indexCount;
                        jVar.b(6, obtainStyledAttributes.getDimensionPixelOffset(index, lVar.C));
                        break;
                    case 7:
                        i10 = indexCount;
                        jVar.b(7, obtainStyledAttributes.getDimensionPixelOffset(index, lVar.D));
                        break;
                    case 8:
                        i10 = indexCount;
                        jVar.b(8, obtainStyledAttributes.getDimensionPixelSize(index, lVar.J));
                        break;
                    case 11:
                        i10 = indexCount;
                        jVar.b(11, obtainStyledAttributes.getDimensionPixelSize(index, lVar.P));
                        break;
                    case 12:
                        i10 = indexCount;
                        jVar.b(12, obtainStyledAttributes.getDimensionPixelSize(index, lVar.Q));
                        break;
                    case 13:
                        i10 = indexCount;
                        jVar.b(13, obtainStyledAttributes.getDimensionPixelSize(index, lVar.M));
                        break;
                    case 14:
                        i10 = indexCount;
                        jVar.b(14, obtainStyledAttributes.getDimensionPixelSize(index, lVar.O));
                        break;
                    case 15:
                        i10 = indexCount;
                        jVar.b(15, obtainStyledAttributes.getDimensionPixelSize(index, lVar.R));
                        break;
                    case 16:
                        i10 = indexCount;
                        jVar.b(16, obtainStyledAttributes.getDimensionPixelSize(index, lVar.N));
                        break;
                    case 17:
                        i10 = indexCount;
                        jVar.b(17, obtainStyledAttributes.getDimensionPixelOffset(index, lVar.f1153d));
                        break;
                    case 18:
                        i10 = indexCount;
                        jVar.b(18, obtainStyledAttributes.getDimensionPixelOffset(index, lVar.f1155e));
                        break;
                    case 19:
                        i10 = indexCount;
                        jVar.a(obtainStyledAttributes.getFloat(index, lVar.f1156f), 19);
                        break;
                    case 20:
                        i10 = indexCount;
                        jVar.a(obtainStyledAttributes.getFloat(index, lVar.f1179w), 20);
                        break;
                    case 21:
                        i10 = indexCount;
                        jVar.b(21, obtainStyledAttributes.getLayoutDimension(index, lVar.f1151c));
                        break;
                    case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                        i10 = indexCount;
                        jVar.b(22, iArr[obtainStyledAttributes.getInt(index, nVar.f1192a)]);
                        break;
                    case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                        i10 = indexCount;
                        jVar.b(23, obtainStyledAttributes.getLayoutDimension(index, lVar.f1149b));
                        break;
                    case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                        i10 = indexCount;
                        jVar.b(24, obtainStyledAttributes.getDimensionPixelSize(index, lVar.F));
                        break;
                    case C0122e9.H /* 27 */:
                        i10 = indexCount;
                        jVar.b(27, obtainStyledAttributes.getInt(index, lVar.E));
                        break;
                    case 28:
                        i10 = indexCount;
                        jVar.b(28, obtainStyledAttributes.getDimensionPixelSize(index, lVar.G));
                        break;
                    case 31:
                        i10 = indexCount;
                        jVar.b(31, obtainStyledAttributes.getDimensionPixelSize(index, lVar.K));
                        break;
                    case 34:
                        i10 = indexCount;
                        jVar.b(34, obtainStyledAttributes.getDimensionPixelSize(index, lVar.H));
                        break;
                    case 37:
                        i10 = indexCount;
                        jVar.a(obtainStyledAttributes.getFloat(index, lVar.f1180x), 37);
                        break;
                    case C0122e9.K /* 38 */:
                        i10 = indexCount;
                        int resourceId = obtainStyledAttributes.getResourceId(index, kVar.f1140a);
                        kVar.f1140a = resourceId;
                        jVar.b(38, resourceId);
                        break;
                    case 39:
                        i10 = indexCount;
                        jVar.a(obtainStyledAttributes.getFloat(index, lVar.U), 39);
                        break;
                    case 40:
                        i10 = indexCount;
                        jVar.a(obtainStyledAttributes.getFloat(index, lVar.T), 40);
                        break;
                    case RequestError.NO_DEV_KEY /* 41 */:
                        i10 = indexCount;
                        jVar.b(41, obtainStyledAttributes.getInt(index, lVar.V));
                        break;
                    case C0122e9.M /* 42 */:
                        i10 = indexCount;
                        jVar.b(42, obtainStyledAttributes.getInt(index, lVar.W));
                        break;
                    case 43:
                        i10 = indexCount;
                        jVar.a(obtainStyledAttributes.getFloat(index, nVar.f1194c), 43);
                        break;
                    case 44:
                        i10 = indexCount;
                        jVar.d(44, true);
                        jVar.a(obtainStyledAttributes.getDimension(index, oVar.f1208m), 44);
                        break;
                    case 45:
                        i10 = indexCount;
                        jVar.a(obtainStyledAttributes.getFloat(index, oVar.f1198b), 45);
                        break;
                    case 46:
                        i10 = indexCount;
                        jVar.a(obtainStyledAttributes.getFloat(index, oVar.f1199c), 46);
                        break;
                    case 47:
                        i10 = indexCount;
                        jVar.a(obtainStyledAttributes.getFloat(index, oVar.f1200d), 47);
                        break;
                    case 48:
                        i10 = indexCount;
                        jVar.a(obtainStyledAttributes.getFloat(index, oVar.f1201e), 48);
                        break;
                    case NavigationBarView.ITEM_GRAVITY_TOP_CENTER /* 49 */:
                        i10 = indexCount;
                        jVar.a(obtainStyledAttributes.getDimension(index, oVar.f1202f), 49);
                        break;
                    case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                        i10 = indexCount;
                        jVar.a(obtainStyledAttributes.getDimension(index, oVar.f1203g), 50);
                        break;
                    case 51:
                        i10 = indexCount;
                        jVar.a(obtainStyledAttributes.getDimension(index, oVar.f1205i), 51);
                        break;
                    case 52:
                        i10 = indexCount;
                        jVar.a(obtainStyledAttributes.getDimension(index, oVar.j), 52);
                        break;
                    case 53:
                        i10 = indexCount;
                        jVar.a(obtainStyledAttributes.getDimension(index, oVar.f1206k), 53);
                        break;
                    case 54:
                        i10 = indexCount;
                        jVar.b(54, obtainStyledAttributes.getInt(index, lVar.X));
                        break;
                    case 55:
                        i10 = indexCount;
                        jVar.b(55, obtainStyledAttributes.getInt(index, lVar.Y));
                        break;
                    case 56:
                        i10 = indexCount;
                        jVar.b(56, obtainStyledAttributes.getDimensionPixelSize(index, lVar.Z));
                        break;
                    case 57:
                        i10 = indexCount;
                        jVar.b(57, obtainStyledAttributes.getDimensionPixelSize(index, lVar.f1148a0));
                        break;
                    case 58:
                        i10 = indexCount;
                        jVar.b(58, obtainStyledAttributes.getDimensionPixelSize(index, lVar.f1150b0));
                        break;
                    case 59:
                        i10 = indexCount;
                        jVar.b(59, obtainStyledAttributes.getDimensionPixelSize(index, lVar.f1152c0));
                        break;
                    case 60:
                        i10 = indexCount;
                        jVar.a(obtainStyledAttributes.getFloat(index, oVar.f1197a), 60);
                        break;
                    case 62:
                        i10 = indexCount;
                        jVar.b(62, obtainStyledAttributes.getDimensionPixelSize(index, lVar.A));
                        break;
                    case 63:
                        i10 = indexCount;
                        jVar.a(obtainStyledAttributes.getFloat(index, lVar.B), 63);
                        break;
                    case 64:
                        i10 = indexCount;
                        jVar.b(64, f(obtainStyledAttributes, index, mVar.f1183a));
                        break;
                    case 65:
                        i10 = indexCount;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            jVar.c(65, obtainStyledAttributes.getString(index));
                            break;
                        } else {
                            jVar.c(65, strArr[obtainStyledAttributes.getInteger(index, 0)]);
                            break;
                        }
                    case 66:
                        i10 = indexCount;
                        jVar.b(66, obtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        i10 = indexCount;
                        jVar.a(obtainStyledAttributes.getFloat(index, mVar.f1187e), 67);
                        break;
                    case 68:
                        i10 = indexCount;
                        jVar.a(obtainStyledAttributes.getFloat(index, nVar.f1195d), 68);
                        break;
                    case 69:
                        i10 = indexCount;
                        jVar.a(obtainStyledAttributes.getFloat(index, 1.0f), 69);
                        break;
                    case 70:
                        i10 = indexCount;
                        jVar.a(obtainStyledAttributes.getFloat(index, 1.0f), 70);
                        break;
                    case 71:
                        i10 = indexCount;
                        w0.d("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i10 = indexCount;
                        jVar.b(72, obtainStyledAttributes.getInt(index, lVar.f1157f0));
                        break;
                    case 73:
                        i10 = indexCount;
                        jVar.b(73, obtainStyledAttributes.getDimensionPixelSize(index, lVar.f1159g0));
                        break;
                    case 74:
                        i10 = indexCount;
                        jVar.c(74, obtainStyledAttributes.getString(index));
                        break;
                    case 75:
                        i10 = indexCount;
                        jVar.d(75, obtainStyledAttributes.getBoolean(index, lVar.f1170n0));
                        break;
                    case 76:
                        i10 = indexCount;
                        jVar.b(76, obtainStyledAttributes.getInt(index, mVar.f1185c));
                        break;
                    case 77:
                        i10 = indexCount;
                        jVar.c(77, obtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        i10 = indexCount;
                        jVar.b(78, obtainStyledAttributes.getInt(index, nVar.f1193b));
                        break;
                    case 79:
                        i10 = indexCount;
                        jVar.a(obtainStyledAttributes.getFloat(index, mVar.f1186d), 79);
                        break;
                    case 80:
                        i10 = indexCount;
                        jVar.d(80, obtainStyledAttributes.getBoolean(index, lVar.f1166l0));
                        break;
                    case 81:
                        i10 = indexCount;
                        jVar.d(81, obtainStyledAttributes.getBoolean(index, lVar.f1168m0));
                        break;
                    case 82:
                        i10 = indexCount;
                        jVar.b(82, obtainStyledAttributes.getInteger(index, mVar.f1184b));
                        break;
                    case 83:
                        i10 = indexCount;
                        jVar.b(83, f(obtainStyledAttributes, index, oVar.f1204h));
                        break;
                    case 84:
                        i10 = indexCount;
                        jVar.b(84, obtainStyledAttributes.getInteger(index, mVar.f1189g));
                        break;
                    case 85:
                        i10 = indexCount;
                        jVar.a(obtainStyledAttributes.getFloat(index, mVar.f1188f), 85);
                        break;
                    case 86:
                        i10 = indexCount;
                        int i13 = obtainStyledAttributes.peekValue(index).type;
                        if (i13 == 1) {
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                            mVar.f1191i = resourceId2;
                            jVar.b(89, resourceId2);
                            if (mVar.f1191i != -1) {
                                jVar.b(88, -2);
                                break;
                            }
                        } else if (i13 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            mVar.f1190h = string;
                            jVar.c(90, string);
                            if (mVar.f1190h.indexOf("/") > 0) {
                                int resourceId3 = obtainStyledAttributes.getResourceId(index, -1);
                                mVar.f1191i = resourceId3;
                                jVar.b(89, resourceId3);
                                jVar.b(88, -2);
                                break;
                            } else {
                                jVar.b(88, -1);
                                break;
                            }
                        } else {
                            jVar.b(88, obtainStyledAttributes.getInteger(index, mVar.f1191i));
                            break;
                        }
                        break;
                    case 87:
                        i10 = indexCount;
                        w0.m("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        i10 = indexCount;
                        jVar.b(93, obtainStyledAttributes.getDimensionPixelSize(index, lVar.L));
                        break;
                    case 94:
                        i10 = indexCount;
                        jVar.b(94, obtainStyledAttributes.getDimensionPixelSize(index, lVar.S));
                        break;
                    case 95:
                        i10 = indexCount;
                        g(jVar, obtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        i10 = indexCount;
                        g(jVar, obtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i10 = indexCount;
                        jVar.b(97, obtainStyledAttributes.getInt(index, lVar.f1172o0));
                        break;
                    case 98:
                        i10 = indexCount;
                        int i14 = z.a.f25877a;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            kVar.f1140a = obtainStyledAttributes.getResourceId(index, kVar.f1140a);
                            break;
                        }
                    case 99:
                        i10 = indexCount;
                        jVar.d(99, obtainStyledAttributes.getBoolean(index, lVar.f1158g));
                        break;
                }
                i11 = i12 + 1;
            }
        } else {
            int i15 = 0;
            for (int indexCount2 = obtainStyledAttributes.getIndexCount(); i15 < indexCount2; indexCount2 = i5) {
                int index2 = obtainStyledAttributes.getIndex(i15);
                if (index2 != 1 && 23 != index2) {
                    if (24 != index2) {
                        mVar.getClass();
                        lVar.getClass();
                        oVar.getClass();
                    }
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i5 = indexCount2;
                        lVar.f1173p = f(obtainStyledAttributes, index2, lVar.f1173p);
                        continue;
                    case 2:
                        i5 = indexCount2;
                        lVar.I = obtainStyledAttributes.getDimensionPixelSize(index2, lVar.I);
                        continue;
                    case 3:
                        i5 = indexCount2;
                        lVar.f1171o = f(obtainStyledAttributes, index2, lVar.f1171o);
                        continue;
                    case 4:
                        i5 = indexCount2;
                        lVar.f1169n = f(obtainStyledAttributes, index2, lVar.f1169n);
                        continue;
                    case 5:
                        i5 = indexCount2;
                        lVar.f1181y = obtainStyledAttributes.getString(index2);
                        continue;
                    case 6:
                        i5 = indexCount2;
                        lVar.C = obtainStyledAttributes.getDimensionPixelOffset(index2, lVar.C);
                        continue;
                    case 7:
                        i5 = indexCount2;
                        lVar.D = obtainStyledAttributes.getDimensionPixelOffset(index2, lVar.D);
                        continue;
                    case 8:
                        i5 = indexCount2;
                        lVar.J = obtainStyledAttributes.getDimensionPixelSize(index2, lVar.J);
                        continue;
                    case 9:
                        i5 = indexCount2;
                        lVar.f1178v = f(obtainStyledAttributes, index2, lVar.f1178v);
                        continue;
                    case 10:
                        i5 = indexCount2;
                        lVar.f1177u = f(obtainStyledAttributes, index2, lVar.f1177u);
                        continue;
                    case 11:
                        i5 = indexCount2;
                        lVar.P = obtainStyledAttributes.getDimensionPixelSize(index2, lVar.P);
                        continue;
                    case 12:
                        i5 = indexCount2;
                        lVar.Q = obtainStyledAttributes.getDimensionPixelSize(index2, lVar.Q);
                        continue;
                    case 13:
                        i5 = indexCount2;
                        lVar.M = obtainStyledAttributes.getDimensionPixelSize(index2, lVar.M);
                        continue;
                    case 14:
                        i5 = indexCount2;
                        lVar.O = obtainStyledAttributes.getDimensionPixelSize(index2, lVar.O);
                        continue;
                    case 15:
                        i5 = indexCount2;
                        lVar.R = obtainStyledAttributes.getDimensionPixelSize(index2, lVar.R);
                        continue;
                    case 16:
                        i5 = indexCount2;
                        lVar.N = obtainStyledAttributes.getDimensionPixelSize(index2, lVar.N);
                        continue;
                    case 17:
                        i5 = indexCount2;
                        lVar.f1153d = obtainStyledAttributes.getDimensionPixelOffset(index2, lVar.f1153d);
                        continue;
                    case 18:
                        i5 = indexCount2;
                        lVar.f1155e = obtainStyledAttributes.getDimensionPixelOffset(index2, lVar.f1155e);
                        continue;
                    case 19:
                        i5 = indexCount2;
                        lVar.f1156f = obtainStyledAttributes.getFloat(index2, lVar.f1156f);
                        continue;
                    case 20:
                        i5 = indexCount2;
                        lVar.f1179w = obtainStyledAttributes.getFloat(index2, lVar.f1179w);
                        continue;
                    case 21:
                        i5 = indexCount2;
                        lVar.f1151c = obtainStyledAttributes.getLayoutDimension(index2, lVar.f1151c);
                        continue;
                    case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                        i5 = indexCount2;
                        int i16 = obtainStyledAttributes.getInt(index2, nVar.f1192a);
                        nVar.f1192a = i16;
                        nVar.f1192a = iArr[i16];
                        continue;
                    case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                        i5 = indexCount2;
                        lVar.f1149b = obtainStyledAttributes.getLayoutDimension(index2, lVar.f1149b);
                        continue;
                    case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                        i5 = indexCount2;
                        lVar.F = obtainStyledAttributes.getDimensionPixelSize(index2, lVar.F);
                        continue;
                    case C0122e9.F /* 25 */:
                        i5 = indexCount2;
                        lVar.f1160h = f(obtainStyledAttributes, index2, lVar.f1160h);
                        continue;
                    case C0122e9.G /* 26 */:
                        i5 = indexCount2;
                        lVar.f1162i = f(obtainStyledAttributes, index2, lVar.f1162i);
                        continue;
                    case C0122e9.H /* 27 */:
                        i5 = indexCount2;
                        lVar.E = obtainStyledAttributes.getInt(index2, lVar.E);
                        continue;
                    case 28:
                        i5 = indexCount2;
                        lVar.G = obtainStyledAttributes.getDimensionPixelSize(index2, lVar.G);
                        continue;
                    case C0122e9.I /* 29 */:
                        i5 = indexCount2;
                        lVar.j = f(obtainStyledAttributes, index2, lVar.j);
                        continue;
                    case 30:
                        i5 = indexCount2;
                        lVar.f1164k = f(obtainStyledAttributes, index2, lVar.f1164k);
                        continue;
                    case 31:
                        i5 = indexCount2;
                        lVar.K = obtainStyledAttributes.getDimensionPixelSize(index2, lVar.K);
                        continue;
                    case 32:
                        i5 = indexCount2;
                        lVar.f1175s = f(obtainStyledAttributes, index2, lVar.f1175s);
                        continue;
                    case 33:
                        i5 = indexCount2;
                        lVar.f1176t = f(obtainStyledAttributes, index2, lVar.f1176t);
                        continue;
                    case 34:
                        i5 = indexCount2;
                        lVar.H = obtainStyledAttributes.getDimensionPixelSize(index2, lVar.H);
                        continue;
                    case C0122e9.J /* 35 */:
                        i5 = indexCount2;
                        lVar.f1167m = f(obtainStyledAttributes, index2, lVar.f1167m);
                        continue;
                    case 36:
                        i5 = indexCount2;
                        lVar.f1165l = f(obtainStyledAttributes, index2, lVar.f1165l);
                        continue;
                    case 37:
                        i5 = indexCount2;
                        lVar.f1180x = obtainStyledAttributes.getFloat(index2, lVar.f1180x);
                        continue;
                    case C0122e9.K /* 38 */:
                        i5 = indexCount2;
                        kVar.f1140a = obtainStyledAttributes.getResourceId(index2, kVar.f1140a);
                        continue;
                    case 39:
                        i5 = indexCount2;
                        lVar.U = obtainStyledAttributes.getFloat(index2, lVar.U);
                        continue;
                    case 40:
                        i5 = indexCount2;
                        lVar.T = obtainStyledAttributes.getFloat(index2, lVar.T);
                        continue;
                    case RequestError.NO_DEV_KEY /* 41 */:
                        i5 = indexCount2;
                        lVar.V = obtainStyledAttributes.getInt(index2, lVar.V);
                        continue;
                    case C0122e9.M /* 42 */:
                        i5 = indexCount2;
                        lVar.W = obtainStyledAttributes.getInt(index2, lVar.W);
                        continue;
                    case 43:
                        i5 = indexCount2;
                        nVar.f1194c = obtainStyledAttributes.getFloat(index2, nVar.f1194c);
                        continue;
                    case 44:
                        i5 = indexCount2;
                        oVar.f1207l = true;
                        oVar.f1208m = obtainStyledAttributes.getDimension(index2, oVar.f1208m);
                        continue;
                    case 45:
                        i5 = indexCount2;
                        oVar.f1198b = obtainStyledAttributes.getFloat(index2, oVar.f1198b);
                        continue;
                    case 46:
                        i5 = indexCount2;
                        oVar.f1199c = obtainStyledAttributes.getFloat(index2, oVar.f1199c);
                        continue;
                    case 47:
                        i5 = indexCount2;
                        oVar.f1200d = obtainStyledAttributes.getFloat(index2, oVar.f1200d);
                        continue;
                    case 48:
                        i5 = indexCount2;
                        oVar.f1201e = obtainStyledAttributes.getFloat(index2, oVar.f1201e);
                        continue;
                    case NavigationBarView.ITEM_GRAVITY_TOP_CENTER /* 49 */:
                        i5 = indexCount2;
                        oVar.f1202f = obtainStyledAttributes.getDimension(index2, oVar.f1202f);
                        continue;
                    case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                        i5 = indexCount2;
                        oVar.f1203g = obtainStyledAttributes.getDimension(index2, oVar.f1203g);
                        continue;
                    case 51:
                        i5 = indexCount2;
                        oVar.f1205i = obtainStyledAttributes.getDimension(index2, oVar.f1205i);
                        continue;
                    case 52:
                        i5 = indexCount2;
                        oVar.j = obtainStyledAttributes.getDimension(index2, oVar.j);
                        continue;
                    case 53:
                        i5 = indexCount2;
                        oVar.f1206k = obtainStyledAttributes.getDimension(index2, oVar.f1206k);
                        continue;
                    case 54:
                        i5 = indexCount2;
                        lVar.X = obtainStyledAttributes.getInt(index2, lVar.X);
                        continue;
                    case 55:
                        i5 = indexCount2;
                        lVar.Y = obtainStyledAttributes.getInt(index2, lVar.Y);
                        continue;
                    case 56:
                        i5 = indexCount2;
                        lVar.Z = obtainStyledAttributes.getDimensionPixelSize(index2, lVar.Z);
                        continue;
                    case 57:
                        i5 = indexCount2;
                        lVar.f1148a0 = obtainStyledAttributes.getDimensionPixelSize(index2, lVar.f1148a0);
                        continue;
                    case 58:
                        i5 = indexCount2;
                        lVar.f1150b0 = obtainStyledAttributes.getDimensionPixelSize(index2, lVar.f1150b0);
                        continue;
                    case 59:
                        i5 = indexCount2;
                        lVar.f1152c0 = obtainStyledAttributes.getDimensionPixelSize(index2, lVar.f1152c0);
                        continue;
                    case 60:
                        i5 = indexCount2;
                        oVar.f1197a = obtainStyledAttributes.getFloat(index2, oVar.f1197a);
                        continue;
                    case 61:
                        i5 = indexCount2;
                        lVar.f1182z = f(obtainStyledAttributes, index2, lVar.f1182z);
                        continue;
                    case 62:
                        i5 = indexCount2;
                        lVar.A = obtainStyledAttributes.getDimensionPixelSize(index2, lVar.A);
                        continue;
                    case 63:
                        i5 = indexCount2;
                        lVar.B = obtainStyledAttributes.getFloat(index2, lVar.B);
                        continue;
                    case 64:
                        i5 = indexCount2;
                        mVar.f1183a = f(obtainStyledAttributes, index2, mVar.f1183a);
                        continue;
                    case 65:
                        i5 = indexCount2;
                        if (obtainStyledAttributes.peekValue(index2).type == 3) {
                            obtainStyledAttributes.getString(index2);
                            mVar.getClass();
                            break;
                        } else {
                            String str = strArr[obtainStyledAttributes.getInteger(index2, 0)];
                            mVar.getClass();
                            break;
                        }
                    case 66:
                        i5 = indexCount2;
                        obtainStyledAttributes.getInt(index2, 0);
                        mVar.getClass();
                        continue;
                    case 67:
                        i5 = indexCount2;
                        mVar.f1187e = obtainStyledAttributes.getFloat(index2, mVar.f1187e);
                        break;
                    case 68:
                        i5 = indexCount2;
                        nVar.f1195d = obtainStyledAttributes.getFloat(index2, nVar.f1195d);
                        break;
                    case 69:
                        i5 = indexCount2;
                        lVar.f1154d0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        i5 = indexCount2;
                        lVar.e0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        i5 = indexCount2;
                        w0.d("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i5 = indexCount2;
                        lVar.f1157f0 = obtainStyledAttributes.getInt(index2, lVar.f1157f0);
                        break;
                    case 73:
                        i5 = indexCount2;
                        lVar.f1159g0 = obtainStyledAttributes.getDimensionPixelSize(index2, lVar.f1159g0);
                        break;
                    case 74:
                        i5 = indexCount2;
                        lVar.j0 = obtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        i5 = indexCount2;
                        lVar.f1170n0 = obtainStyledAttributes.getBoolean(index2, lVar.f1170n0);
                        break;
                    case 76:
                        i5 = indexCount2;
                        mVar.f1185c = obtainStyledAttributes.getInt(index2, mVar.f1185c);
                        break;
                    case 77:
                        i5 = indexCount2;
                        lVar.k0 = obtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        i5 = indexCount2;
                        nVar.f1193b = obtainStyledAttributes.getInt(index2, nVar.f1193b);
                        break;
                    case 79:
                        i5 = indexCount2;
                        mVar.f1186d = obtainStyledAttributes.getFloat(index2, mVar.f1186d);
                        break;
                    case 80:
                        i5 = indexCount2;
                        lVar.f1166l0 = obtainStyledAttributes.getBoolean(index2, lVar.f1166l0);
                        break;
                    case 81:
                        i5 = indexCount2;
                        lVar.f1168m0 = obtainStyledAttributes.getBoolean(index2, lVar.f1168m0);
                        break;
                    case 82:
                        i5 = indexCount2;
                        mVar.f1184b = obtainStyledAttributes.getInteger(index2, mVar.f1184b);
                        break;
                    case 83:
                        i5 = indexCount2;
                        oVar.f1204h = f(obtainStyledAttributes, index2, oVar.f1204h);
                        break;
                    case 84:
                        i5 = indexCount2;
                        mVar.f1189g = obtainStyledAttributes.getInteger(index2, mVar.f1189g);
                        break;
                    case 85:
                        i5 = indexCount2;
                        mVar.f1188f = obtainStyledAttributes.getFloat(index2, mVar.f1188f);
                        break;
                    case 86:
                        i5 = indexCount2;
                        int i17 = obtainStyledAttributes.peekValue(index2).type;
                        if (i17 == 1) {
                            mVar.f1191i = obtainStyledAttributes.getResourceId(index2, -1);
                            break;
                        } else if (i17 == 3) {
                            String string2 = obtainStyledAttributes.getString(index2);
                            mVar.f1190h = string2;
                            if (string2.indexOf("/") > 0) {
                                mVar.f1191i = obtainStyledAttributes.getResourceId(index2, -1);
                                break;
                            }
                        } else {
                            obtainStyledAttributes.getInteger(index2, mVar.f1191i);
                            break;
                        }
                        break;
                    case 87:
                        i5 = indexCount2;
                        w0.m("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 88:
                    case 89:
                    case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    default:
                        StringBuilder sb3 = new StringBuilder("Unknown attribute 0x");
                        i5 = indexCount2;
                        sb3.append(Integer.toHexString(index2));
                        sb3.append("   ");
                        sb3.append(sparseIntArray.get(index2));
                        w0.m("ConstraintSet", sb3.toString());
                        break;
                    case 91:
                        i5 = indexCount2;
                        lVar.q = f(obtainStyledAttributes, index2, lVar.q);
                        break;
                    case 92:
                        i5 = indexCount2;
                        lVar.f1174r = f(obtainStyledAttributes, index2, lVar.f1174r);
                        break;
                    case 93:
                        i5 = indexCount2;
                        lVar.L = obtainStyledAttributes.getDimensionPixelSize(index2, lVar.L);
                        break;
                    case 94:
                        i5 = indexCount2;
                        lVar.S = obtainStyledAttributes.getDimensionPixelSize(index2, lVar.S);
                        break;
                    case 95:
                        i5 = indexCount2;
                        g(lVar, obtainStyledAttributes, index2, 0);
                        continue;
                    case 96:
                        i5 = indexCount2;
                        g(lVar, obtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        i5 = indexCount2;
                        lVar.f1172o0 = obtainStyledAttributes.getInt(index2, lVar.f1172o0);
                        break;
                }
                i15++;
            }
            if (lVar.j0 != null) {
                lVar.f1163i0 = null;
            }
        }
        obtainStyledAttributes.recycle();
        return kVar;
    }

    public static int f(TypedArray typedArray, int i5, int i10) {
        int resourceId = typedArray.getResourceId(i5, i10);
        return resourceId == -1 ? typedArray.getInt(i5, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void g(Object obj, TypedArray typedArray, int i5, int i10) {
        int dimensionPixelSize;
        if (obj == null) {
            return;
        }
        int i11 = typedArray.peekValue(i5).type;
        boolean z5 = true;
        int i12 = 0;
        if (i11 == 3) {
            String string = typedArray.getString(i5);
            if (string == null) {
                return;
            }
            int indexOf = string.indexOf(61);
            int length = string.length();
            if (indexOf <= 0 || indexOf >= length - 1) {
                return;
            }
            String substring = string.substring(0, indexOf);
            String substring2 = string.substring(indexOf + 1);
            if (substring2.length() > 0) {
                String trim = substring.trim();
                String trim2 = substring2.trim();
                if ("ratio".equalsIgnoreCase(trim)) {
                    if (obj instanceof d) {
                        d dVar = (d) obj;
                        if (i10 == 0) {
                            ((ViewGroup.MarginLayoutParams) dVar).width = 0;
                        } else {
                            ((ViewGroup.MarginLayoutParams) dVar).height = 0;
                        }
                        h(dVar, trim2);
                        return;
                    }
                    if (obj instanceof l) {
                        ((l) obj).f1181y = trim2;
                        return;
                    } else {
                        if (obj instanceof j) {
                            ((j) obj).c(5, trim2);
                            return;
                        }
                        return;
                    }
                }
                try {
                    if ("weight".equalsIgnoreCase(trim)) {
                        float parseFloat = Float.parseFloat(trim2);
                        if (obj instanceof d) {
                            d dVar2 = (d) obj;
                            if (i10 == 0) {
                                ((ViewGroup.MarginLayoutParams) dVar2).width = 0;
                                dVar2.H = parseFloat;
                                return;
                            } else {
                                ((ViewGroup.MarginLayoutParams) dVar2).height = 0;
                                dVar2.I = parseFloat;
                                return;
                            }
                        }
                        if (obj instanceof l) {
                            l lVar = (l) obj;
                            if (i10 == 0) {
                                lVar.f1149b = 0;
                                lVar.U = parseFloat;
                                return;
                            } else {
                                lVar.f1151c = 0;
                                lVar.T = parseFloat;
                                return;
                            }
                        }
                        if (obj instanceof j) {
                            j jVar = (j) obj;
                            if (i10 == 0) {
                                jVar.b(23, 0);
                                jVar.a(parseFloat, 39);
                                return;
                            } else {
                                jVar.b(21, 0);
                                jVar.a(parseFloat, 40);
                                return;
                            }
                        }
                        return;
                    }
                    if ("parent".equalsIgnoreCase(trim)) {
                        float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                        if (obj instanceof d) {
                            d dVar3 = (d) obj;
                            if (i10 == 0) {
                                ((ViewGroup.MarginLayoutParams) dVar3).width = 0;
                                dVar3.R = max;
                                dVar3.L = 2;
                                return;
                            } else {
                                ((ViewGroup.MarginLayoutParams) dVar3).height = 0;
                                dVar3.S = max;
                                dVar3.M = 2;
                                return;
                            }
                        }
                        if (obj instanceof l) {
                            l lVar2 = (l) obj;
                            if (i10 == 0) {
                                lVar2.f1149b = 0;
                                lVar2.f1154d0 = max;
                                lVar2.X = 2;
                                return;
                            } else {
                                lVar2.f1151c = 0;
                                lVar2.e0 = max;
                                lVar2.Y = 2;
                                return;
                            }
                        }
                        if (obj instanceof j) {
                            j jVar2 = (j) obj;
                            if (i10 == 0) {
                                jVar2.b(23, 0);
                                jVar2.b(54, 2);
                                return;
                            } else {
                                jVar2.b(21, 0);
                                jVar2.b(55, 2);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                } catch (NumberFormatException unused) {
                    return;
                }
            }
            return;
        }
        if (i11 != 5) {
            dimensionPixelSize = typedArray.getInt(i5, 0);
            if (dimensionPixelSize == -4) {
                i12 = -2;
            } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                z5 = false;
            }
            if (!(obj instanceof d)) {
                d dVar4 = (d) obj;
                if (i10 == 0) {
                    ((ViewGroup.MarginLayoutParams) dVar4).width = i12;
                    dVar4.W = z5;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) dVar4).height = i12;
                    dVar4.X = z5;
                    return;
                }
            }
            if (obj instanceof l) {
                l lVar3 = (l) obj;
                if (i10 == 0) {
                    lVar3.f1149b = i12;
                    lVar3.f1166l0 = z5;
                    return;
                } else {
                    lVar3.f1151c = i12;
                    lVar3.f1168m0 = z5;
                    return;
                }
            }
            if (obj instanceof j) {
                j jVar3 = (j) obj;
                if (i10 == 0) {
                    jVar3.b(23, i12);
                    jVar3.d(80, z5);
                    return;
                } else {
                    jVar3.b(21, i12);
                    jVar3.d(81, z5);
                    return;
                }
            }
            return;
        }
        dimensionPixelSize = typedArray.getDimensionPixelSize(i5, 0);
        z5 = false;
        i12 = dimensionPixelSize;
        if (!(obj instanceof d)) {
        }
    }

    public static void h(d dVar, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i5 = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                i5 = substring.equalsIgnoreCase("W") ? 0 : substring.equalsIgnoreCase("H") ? 1 : -1;
                r2 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 < 0 || indexOf2 >= length - 1) {
                    String substring2 = str.substring(r2);
                    if (substring2.length() > 0) {
                        Float.parseFloat(substring2);
                    }
                } else {
                    String substring3 = str.substring(r2, indexOf2);
                    String substring4 = str.substring(indexOf2 + 1);
                    if (substring3.length() > 0 && substring4.length() > 0) {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (i5 == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        dVar.G = str;
    }

    public final void a(ConstraintLayout constraintLayout) {
        HashSet hashSet;
        int i5;
        HashMap hashMap;
        String str;
        p pVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap2 = pVar.f1214c;
        HashSet hashSet2 = new HashSet(hashMap2.keySet());
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = constraintLayout.getChildAt(i10);
            int id2 = childAt.getId();
            if (!hashMap2.containsKey(Integer.valueOf(id2))) {
                StringBuilder sb2 = new StringBuilder("id unknown ");
                try {
                    str = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    str = "UNKNOWN";
                }
                sb2.append(str);
                w0.m("ConstraintSet", sb2.toString());
            } else {
                if (pVar.f1213b && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id2 != -1) {
                    if (hashMap2.containsKey(Integer.valueOf(id2))) {
                        hashSet2.remove(Integer.valueOf(id2));
                        k kVar = (k) hashMap2.get(Integer.valueOf(id2));
                        if (kVar != null) {
                            n nVar = kVar.f1141b;
                            l lVar = kVar.f1143d;
                            o oVar = kVar.f1144e;
                            if (childAt instanceof Barrier) {
                                lVar.f1161h0 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id2);
                                barrier.setType(lVar.f1157f0);
                                barrier.setMargin(lVar.f1159g0);
                                barrier.setAllowsGoneWidget(lVar.f1170n0);
                                int[] iArr = lVar.f1163i0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str2 = lVar.j0;
                                    if (str2 != null) {
                                        int[] c2 = c(barrier, str2);
                                        lVar.f1163i0 = c2;
                                        barrier.setReferencedIds(c2);
                                    }
                                }
                            }
                            d dVar = (d) childAt.getLayoutParams();
                            dVar.a();
                            kVar.a(dVar);
                            HashMap hashMap3 = kVar.f1145f;
                            Class<?> cls = childAt.getClass();
                            for (String str3 : hashMap3.keySet()) {
                                a aVar = (a) hashMap3.get(str3);
                                HashSet hashSet3 = hashSet2;
                                String m6 = !aVar.f1054a ? c1.m("set", str3) : str3;
                                int i11 = i10;
                                try {
                                    int d10 = v.f.d(aVar.f1055b);
                                    Class<?> cls2 = Float.TYPE;
                                    Class<?> cls3 = Integer.TYPE;
                                    switch (d10) {
                                        case 0:
                                            hashMap = hashMap3;
                                            cls.getMethod(m6, cls3).invoke(childAt, Integer.valueOf(aVar.f1056c));
                                            break;
                                        case 1:
                                            hashMap = hashMap3;
                                            cls.getMethod(m6, cls2).invoke(childAt, Float.valueOf(aVar.f1057d));
                                            break;
                                        case 2:
                                            hashMap = hashMap3;
                                            cls.getMethod(m6, cls3).invoke(childAt, Integer.valueOf(aVar.f1060g));
                                            break;
                                        case 3:
                                            hashMap = hashMap3;
                                            Method method = cls.getMethod(m6, Drawable.class);
                                            ColorDrawable colorDrawable = new ColorDrawable();
                                            colorDrawable.setColor(aVar.f1060g);
                                            method.invoke(childAt, colorDrawable);
                                            break;
                                        case 4:
                                            hashMap = hashMap3;
                                            cls.getMethod(m6, CharSequence.class).invoke(childAt, aVar.f1058e);
                                            break;
                                        case 5:
                                            hashMap = hashMap3;
                                            cls.getMethod(m6, Boolean.TYPE).invoke(childAt, Boolean.valueOf(aVar.f1059f));
                                            break;
                                        case 6:
                                            hashMap = hashMap3;
                                            cls.getMethod(m6, cls2).invoke(childAt, Float.valueOf(aVar.f1057d));
                                            break;
                                        case 7:
                                            hashMap = hashMap3;
                                            try {
                                                cls.getMethod(m6, cls3).invoke(childAt, Integer.valueOf(aVar.f1056c));
                                            } catch (IllegalAccessException e7) {
                                                e = e7;
                                                StringBuilder p10 = d9.e.p(" Custom Attribute \"", str3, "\" not found on ");
                                                p10.append(cls.getName());
                                                w0.e("TransitionLayout", p10.toString(), e);
                                                hashSet2 = hashSet3;
                                                i10 = i11;
                                                hashMap3 = hashMap;
                                            } catch (NoSuchMethodException e9) {
                                                e = e9;
                                                w0.e("TransitionLayout", cls.getName() + " must have a method " + m6, e);
                                                hashSet2 = hashSet3;
                                                i10 = i11;
                                                hashMap3 = hashMap;
                                            } catch (InvocationTargetException e10) {
                                                e = e10;
                                                StringBuilder p11 = d9.e.p(" Custom Attribute \"", str3, "\" not found on ");
                                                p11.append(cls.getName());
                                                w0.e("TransitionLayout", p11.toString(), e);
                                                hashSet2 = hashSet3;
                                                i10 = i11;
                                                hashMap3 = hashMap;
                                            }
                                        default:
                                            hashMap = hashMap3;
                                            break;
                                    }
                                } catch (IllegalAccessException e11) {
                                    e = e11;
                                    hashMap = hashMap3;
                                } catch (NoSuchMethodException e12) {
                                    e = e12;
                                    hashMap = hashMap3;
                                } catch (InvocationTargetException e13) {
                                    e = e13;
                                    hashMap = hashMap3;
                                }
                                hashSet2 = hashSet3;
                                i10 = i11;
                                hashMap3 = hashMap;
                            }
                            hashSet = hashSet2;
                            i5 = i10;
                            childAt.setLayoutParams(dVar);
                            if (nVar.f1193b == 0) {
                                childAt.setVisibility(nVar.f1192a);
                            }
                            childAt.setAlpha(nVar.f1194c);
                            childAt.setRotation(oVar.f1197a);
                            childAt.setRotationX(oVar.f1198b);
                            childAt.setRotationY(oVar.f1199c);
                            childAt.setScaleX(oVar.f1200d);
                            childAt.setScaleY(oVar.f1201e);
                            if (oVar.f1204h != -1) {
                                if (((View) childAt.getParent()).findViewById(oVar.f1204h) != null) {
                                    float bottom = (r0.getBottom() + r0.getTop()) / 2.0f;
                                    float right = (r0.getRight() + r0.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(oVar.f1202f)) {
                                    childAt.setPivotX(oVar.f1202f);
                                }
                                if (!Float.isNaN(oVar.f1203g)) {
                                    childAt.setPivotY(oVar.f1203g);
                                }
                            }
                            childAt.setTranslationX(oVar.f1205i);
                            childAt.setTranslationY(oVar.j);
                            childAt.setTranslationZ(oVar.f1206k);
                            if (oVar.f1207l) {
                                childAt.setElevation(oVar.f1208m);
                            }
                        }
                    } else {
                        hashSet = hashSet2;
                        i5 = i10;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                    }
                    i10 = i5 + 1;
                    pVar = this;
                    hashSet2 = hashSet;
                }
            }
            hashSet = hashSet2;
            i5 = i10;
            i10 = i5 + 1;
            pVar = this;
            hashSet2 = hashSet;
        }
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            k kVar2 = (k) hashMap2.get(num);
            if (kVar2 != null) {
                l lVar2 = kVar2.f1143d;
                if (lVar2.f1161h0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = lVar2.f1163i0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str4 = lVar2.j0;
                        if (str4 != null) {
                            int[] c8 = c(barrier2, str4);
                            lVar2.f1163i0 = c8;
                            barrier2.setReferencedIds(c8);
                        }
                    }
                    barrier2.setType(lVar2.f1157f0);
                    barrier2.setMargin(lVar2.f1159g0);
                    d generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.i();
                    kVar2.a(generateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, generateDefaultLayoutParams);
                }
                if (lVar2.f1147a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    d generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    kVar2.a(generateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, generateDefaultLayoutParams2);
                }
            }
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = constraintLayout.getChildAt(i12);
            if (childAt2 instanceof b) {
                ((b) childAt2).e(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        int i5;
        HashMap hashMap;
        int i10;
        p pVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap2 = pVar.f1214c;
        hashMap2.clear();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = constraintLayout.getChildAt(i11);
            d dVar = (d) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (pVar.f1213b && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap2.containsKey(Integer.valueOf(id2))) {
                hashMap2.put(Integer.valueOf(id2), new k());
            }
            k kVar = (k) hashMap2.get(Integer.valueOf(id2));
            if (kVar == null) {
                i5 = childCount;
                hashMap = hashMap2;
                i10 = i11;
            } else {
                n nVar = kVar.f1141b;
                l lVar = kVar.f1143d;
                o oVar = kVar.f1144e;
                i5 = childCount;
                HashMap hashMap3 = new HashMap();
                hashMap = hashMap2;
                Class<?> cls = childAt.getClass();
                i10 = i11;
                HashMap hashMap4 = pVar.f1212a;
                for (String str : hashMap4.keySet()) {
                    a aVar = (a) hashMap4.get(str);
                    HashMap hashMap5 = hashMap4;
                    try {
                        if (str.equals("BackgroundColor")) {
                            hashMap3.put(str, new a(aVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            hashMap3.put(str, new a(aVar, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e7) {
                        StringBuilder p10 = d9.e.p(" Custom Attribute \"", str, "\" not found on ");
                        p10.append(cls.getName());
                        w0.e("TransitionLayout", p10.toString(), e7);
                    } catch (NoSuchMethodException e9) {
                        w0.e("TransitionLayout", cls.getName() + " must have a method " + str, e9);
                    } catch (InvocationTargetException e10) {
                        StringBuilder p11 = d9.e.p(" Custom Attribute \"", str, "\" not found on ");
                        p11.append(cls.getName());
                        w0.e("TransitionLayout", p11.toString(), e10);
                    }
                    hashMap4 = hashMap5;
                }
                kVar.f1145f = hashMap3;
                kVar.f1140a = id2;
                lVar.f1160h = dVar.f1077e;
                lVar.f1162i = dVar.f1078f;
                lVar.j = dVar.f1080g;
                lVar.f1164k = dVar.f1082h;
                lVar.f1165l = dVar.f1084i;
                lVar.f1167m = dVar.j;
                lVar.f1169n = dVar.f1086k;
                lVar.f1171o = dVar.f1087l;
                lVar.f1173p = dVar.f1089m;
                lVar.q = dVar.f1091n;
                lVar.f1174r = dVar.f1093o;
                lVar.f1175s = dVar.f1098s;
                lVar.f1176t = dVar.f1099t;
                lVar.f1177u = dVar.f1100u;
                lVar.f1178v = dVar.f1101v;
                lVar.f1179w = dVar.E;
                lVar.f1180x = dVar.F;
                lVar.f1181y = dVar.G;
                lVar.f1182z = dVar.f1095p;
                lVar.A = dVar.q;
                lVar.B = dVar.f1097r;
                lVar.C = dVar.T;
                lVar.D = dVar.U;
                lVar.E = dVar.V;
                lVar.f1156f = dVar.f1073c;
                lVar.f1153d = dVar.f1069a;
                lVar.f1155e = dVar.f1071b;
                lVar.f1149b = ((ViewGroup.MarginLayoutParams) dVar).width;
                lVar.f1151c = ((ViewGroup.MarginLayoutParams) dVar).height;
                lVar.F = ((ViewGroup.MarginLayoutParams) dVar).leftMargin;
                lVar.G = ((ViewGroup.MarginLayoutParams) dVar).rightMargin;
                lVar.H = ((ViewGroup.MarginLayoutParams) dVar).topMargin;
                lVar.I = ((ViewGroup.MarginLayoutParams) dVar).bottomMargin;
                lVar.L = dVar.D;
                lVar.T = dVar.I;
                lVar.U = dVar.H;
                lVar.W = dVar.K;
                lVar.V = dVar.J;
                lVar.f1166l0 = dVar.W;
                lVar.f1168m0 = dVar.X;
                lVar.X = dVar.L;
                lVar.Y = dVar.M;
                lVar.Z = dVar.P;
                lVar.f1148a0 = dVar.Q;
                lVar.f1150b0 = dVar.N;
                lVar.f1152c0 = dVar.O;
                lVar.f1154d0 = dVar.R;
                lVar.e0 = dVar.S;
                lVar.k0 = dVar.Y;
                lVar.N = dVar.f1103x;
                lVar.P = dVar.f1105z;
                lVar.M = dVar.f1102w;
                lVar.O = dVar.f1104y;
                lVar.R = dVar.A;
                lVar.Q = dVar.B;
                lVar.S = dVar.C;
                lVar.f1172o0 = dVar.Z;
                lVar.J = dVar.getMarginEnd();
                lVar.K = dVar.getMarginStart();
                nVar.f1192a = childAt.getVisibility();
                nVar.f1194c = childAt.getAlpha();
                oVar.f1197a = childAt.getRotation();
                oVar.f1198b = childAt.getRotationX();
                oVar.f1199c = childAt.getRotationY();
                oVar.f1200d = childAt.getScaleX();
                oVar.f1201e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    oVar.f1202f = pivotX;
                    oVar.f1203g = pivotY;
                }
                oVar.f1205i = childAt.getTranslationX();
                oVar.j = childAt.getTranslationY();
                oVar.f1206k = childAt.getTranslationZ();
                if (oVar.f1207l) {
                    oVar.f1208m = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    lVar.f1170n0 = barrier.getAllowsGoneWidget();
                    lVar.f1163i0 = barrier.getReferencedIds();
                    lVar.f1157f0 = barrier.getType();
                    lVar.f1159g0 = barrier.getMargin();
                }
            }
            i11 = i10 + 1;
            pVar = this;
            childCount = i5;
            hashMap2 = hashMap;
        }
    }

    public final void e(Context context, int i5) {
        XmlResourceParser xml = context.getResources().getXml(i5);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    k d10 = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        d10.f1143d.f1147a = true;
                    }
                    this.f1214c.put(Integer.valueOf(d10.f1140a), d10);
                }
            }
        } catch (IOException e7) {
            w0.e("ConstraintSet", "Error parsing resource: " + i5, e7);
        } catch (XmlPullParserException e9) {
            w0.e("ConstraintSet", "Error parsing resource: " + i5, e9);
        }
    }
}
