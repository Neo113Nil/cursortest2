package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.google.android.gms.ads.AdError;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class mm3 {
    public static final int[] c = {0, 4, 8};
    public static final SparseIntArray d;
    public static final SparseIntArray e;
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        d = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        e = sparseIntArray2;
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
        sparseIntArray.append(Sdk.SDKError.Reason.TPAT_ERROR_VALUE, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, 67);
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
        sparseIntArray.append(Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(Sdk.SDKError.Reason.GZIP_ENCODE_ERROR_VALUE, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, 84);
        sparseIntArray.append(Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 85);
        sparseIntArray.append(Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, 86);
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

    public static int[] h(Barrier barrier, String str) {
        int i;
        Object designInformation;
        String[] split = str.split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
        Context context = barrier.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = hjf.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) barrier.getParent()).getDesignInformation(0, trim)) != null && (designInformation instanceof Integer)) {
                i = ((Integer) designInformation).intValue();
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static hm3 i(Context context, AttributeSet attributeSet, boolean z) {
        hm3 hm3Var = new hm3();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? vjf.c : vjf.a);
        String[] strArr = gz8.c;
        km3 km3Var = hm3Var.b;
        lm3 lm3Var = hm3Var.e;
        jm3 jm3Var = hm3Var.c;
        im3 im3Var = hm3Var.d;
        int[] iArr = c;
        SparseIntArray sparseIntArray = d;
        int i = 3;
        if (z) {
            int indexCount = obtainStyledAttributes.getIndexCount();
            gm3 gm3Var = new gm3();
            gm3Var.a = new int[10];
            gm3Var.b = new int[10];
            gm3Var.c = 0;
            gm3Var.d = new int[10];
            gm3Var.e = new float[10];
            gm3Var.f = 0;
            gm3Var.g = new int[5];
            gm3Var.h = new String[5];
            gm3Var.i = 0;
            gm3Var.j = new int[4];
            gm3Var.k = new boolean[4];
            gm3Var.l = 0;
            int i2 = 0;
            while (i2 < indexCount) {
                int index = obtainStyledAttributes.getIndex(i2);
                switch (e.get(index)) {
                    case 2:
                        gm3Var.b(2, obtainStyledAttributes.getDimensionPixelSize(index, im3Var.I));
                        continue;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        Integer.toHexString(index);
                        sparseIntArray.get(index);
                        break;
                    case 5:
                        gm3Var.c(5, obtainStyledAttributes.getString(index));
                        continue;
                    case 6:
                        gm3Var.b(6, obtainStyledAttributes.getDimensionPixelOffset(index, im3Var.C));
                        break;
                    case 7:
                        gm3Var.b(7, obtainStyledAttributes.getDimensionPixelOffset(index, im3Var.D));
                        break;
                    case 8:
                        gm3Var.b(8, obtainStyledAttributes.getDimensionPixelSize(index, im3Var.J));
                        break;
                    case 11:
                        gm3Var.b(11, obtainStyledAttributes.getDimensionPixelSize(index, im3Var.P));
                        break;
                    case 12:
                        gm3Var.b(12, obtainStyledAttributes.getDimensionPixelSize(index, im3Var.Q));
                        break;
                    case 13:
                        gm3Var.b(13, obtainStyledAttributes.getDimensionPixelSize(index, im3Var.M));
                        break;
                    case 14:
                        gm3Var.b(14, obtainStyledAttributes.getDimensionPixelSize(index, im3Var.O));
                        break;
                    case 15:
                        gm3Var.b(15, obtainStyledAttributes.getDimensionPixelSize(index, im3Var.R));
                        break;
                    case 16:
                        gm3Var.b(16, obtainStyledAttributes.getDimensionPixelSize(index, im3Var.N));
                        break;
                    case 17:
                        gm3Var.b(17, obtainStyledAttributes.getDimensionPixelOffset(index, im3Var.d));
                        break;
                    case 18:
                        gm3Var.b(18, obtainStyledAttributes.getDimensionPixelOffset(index, im3Var.e));
                        break;
                    case 19:
                        gm3Var.a(obtainStyledAttributes.getFloat(index, im3Var.f), 19);
                        break;
                    case 20:
                        gm3Var.a(obtainStyledAttributes.getFloat(index, im3Var.w), 20);
                        break;
                    case 21:
                        gm3Var.b(21, obtainStyledAttributes.getLayoutDimension(index, im3Var.c));
                        break;
                    case 22:
                        gm3Var.b(22, iArr[obtainStyledAttributes.getInt(index, km3Var.a)]);
                        break;
                    case 23:
                        gm3Var.b(23, obtainStyledAttributes.getLayoutDimension(index, im3Var.b));
                        break;
                    case 24:
                        gm3Var.b(24, obtainStyledAttributes.getDimensionPixelSize(index, im3Var.F));
                        break;
                    case 27:
                        gm3Var.b(27, obtainStyledAttributes.getInt(index, im3Var.E));
                        break;
                    case 28:
                        gm3Var.b(28, obtainStyledAttributes.getDimensionPixelSize(index, im3Var.G));
                        break;
                    case 31:
                        gm3Var.b(31, obtainStyledAttributes.getDimensionPixelSize(index, im3Var.K));
                        break;
                    case 34:
                        gm3Var.b(34, obtainStyledAttributes.getDimensionPixelSize(index, im3Var.H));
                        break;
                    case 37:
                        gm3Var.a(obtainStyledAttributes.getFloat(index, im3Var.x), 37);
                        break;
                    case 38:
                        int resourceId = obtainStyledAttributes.getResourceId(index, hm3Var.a);
                        hm3Var.a = resourceId;
                        gm3Var.b(38, resourceId);
                        break;
                    case 39:
                        gm3Var.a(obtainStyledAttributes.getFloat(index, im3Var.U), 39);
                        break;
                    case 40:
                        gm3Var.a(obtainStyledAttributes.getFloat(index, im3Var.T), 40);
                        break;
                    case 41:
                        gm3Var.b(41, obtainStyledAttributes.getInt(index, im3Var.V));
                        break;
                    case 42:
                        gm3Var.b(42, obtainStyledAttributes.getInt(index, im3Var.W));
                        break;
                    case 43:
                        gm3Var.a(obtainStyledAttributes.getFloat(index, km3Var.c), 43);
                        break;
                    case 44:
                        gm3Var.d(44, true);
                        gm3Var.a(obtainStyledAttributes.getDimension(index, lm3Var.m), 44);
                        break;
                    case 45:
                        gm3Var.a(obtainStyledAttributes.getFloat(index, lm3Var.b), 45);
                        break;
                    case 46:
                        gm3Var.a(obtainStyledAttributes.getFloat(index, lm3Var.c), 46);
                        break;
                    case 47:
                        gm3Var.a(obtainStyledAttributes.getFloat(index, lm3Var.d), 47);
                        break;
                    case 48:
                        gm3Var.a(obtainStyledAttributes.getFloat(index, lm3Var.e), 48);
                        break;
                    case 49:
                        gm3Var.a(obtainStyledAttributes.getDimension(index, lm3Var.f), 49);
                        break;
                    case 50:
                        gm3Var.a(obtainStyledAttributes.getDimension(index, lm3Var.g), 50);
                        break;
                    case 51:
                        gm3Var.a(obtainStyledAttributes.getDimension(index, lm3Var.i), 51);
                        break;
                    case 52:
                        gm3Var.a(obtainStyledAttributes.getDimension(index, lm3Var.j), 52);
                        break;
                    case 53:
                        gm3Var.a(obtainStyledAttributes.getDimension(index, lm3Var.k), 53);
                        break;
                    case 54:
                        gm3Var.b(54, obtainStyledAttributes.getInt(index, im3Var.X));
                        break;
                    case 55:
                        gm3Var.b(55, obtainStyledAttributes.getInt(index, im3Var.Y));
                        break;
                    case 56:
                        gm3Var.b(56, obtainStyledAttributes.getDimensionPixelSize(index, im3Var.Z));
                        break;
                    case 57:
                        gm3Var.b(57, obtainStyledAttributes.getDimensionPixelSize(index, im3Var.a0));
                        break;
                    case 58:
                        gm3Var.b(58, obtainStyledAttributes.getDimensionPixelSize(index, im3Var.b0));
                        break;
                    case 59:
                        gm3Var.b(59, obtainStyledAttributes.getDimensionPixelSize(index, im3Var.c0));
                        break;
                    case 60:
                        gm3Var.a(obtainStyledAttributes.getFloat(index, lm3Var.a), 60);
                        break;
                    case 62:
                        gm3Var.b(62, obtainStyledAttributes.getDimensionPixelSize(index, im3Var.A));
                        break;
                    case 63:
                        gm3Var.a(obtainStyledAttributes.getFloat(index, im3Var.B), 63);
                        break;
                    case 64:
                        gm3Var.b(64, l(obtainStyledAttributes, index, jm3Var.a));
                        break;
                    case 65:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            gm3Var.c(65, obtainStyledAttributes.getString(index));
                            break;
                        } else {
                            gm3Var.c(65, strArr[obtainStyledAttributes.getInteger(index, 0)]);
                            break;
                        }
                    case 66:
                        gm3Var.b(66, obtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        gm3Var.a(obtainStyledAttributes.getFloat(index, jm3Var.e), 67);
                        break;
                    case 68:
                        gm3Var.a(obtainStyledAttributes.getFloat(index, km3Var.d), 68);
                        break;
                    case 69:
                        gm3Var.a(obtainStyledAttributes.getFloat(index, 1.0f), 69);
                        break;
                    case 70:
                        gm3Var.a(obtainStyledAttributes.getFloat(index, 1.0f), 70);
                        break;
                    case 71:
                        break;
                    case 72:
                        gm3Var.b(72, obtainStyledAttributes.getInt(index, im3Var.f0));
                        break;
                    case TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER /* 73 */:
                        gm3Var.b(73, obtainStyledAttributes.getDimensionPixelSize(index, im3Var.g0));
                        break;
                    case TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER /* 74 */:
                        gm3Var.c(74, obtainStyledAttributes.getString(index));
                        break;
                    case TokenParametersOuterClass$TokenParameters.TOPICS_FIELD_NUMBER /* 75 */:
                        gm3Var.d(75, obtainStyledAttributes.getBoolean(index, im3Var.n0));
                        break;
                    case TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER /* 76 */:
                        gm3Var.b(76, obtainStyledAttributes.getInt(index, jm3Var.c));
                        break;
                    case TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER /* 77 */:
                        gm3Var.c(77, obtainStyledAttributes.getString(index));
                        break;
                    case TokenParametersOuterClass$TokenParameters.GPP_FIELD_NUMBER /* 78 */:
                        gm3Var.b(78, obtainStyledAttributes.getInt(index, km3Var.b));
                        break;
                    case 79:
                        gm3Var.a(obtainStyledAttributes.getFloat(index, jm3Var.d), 79);
                        break;
                    case 80:
                        gm3Var.d(80, obtainStyledAttributes.getBoolean(index, im3Var.l0));
                        break;
                    case 81:
                        gm3Var.d(81, obtainStyledAttributes.getBoolean(index, im3Var.m0));
                        break;
                    case 82:
                        gm3Var.b(82, obtainStyledAttributes.getInteger(index, jm3Var.b));
                        break;
                    case 83:
                        gm3Var.b(83, l(obtainStyledAttributes, index, lm3Var.h));
                        break;
                    case 84:
                        gm3Var.b(84, obtainStyledAttributes.getInteger(index, jm3Var.g));
                        break;
                    case 85:
                        gm3Var.a(obtainStyledAttributes.getFloat(index, jm3Var.f), 85);
                        break;
                    case 86:
                        int i3 = obtainStyledAttributes.peekValue(index).type;
                        if (i3 == 1) {
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                            jm3Var.i = resourceId2;
                            gm3Var.b(89, resourceId2);
                            if (jm3Var.i != -1) {
                                gm3Var.b(88, -2);
                                break;
                            }
                        } else if (i3 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            jm3Var.h = string;
                            gm3Var.c(90, string);
                            if (jm3Var.h.indexOf("/") > 0) {
                                int resourceId3 = obtainStyledAttributes.getResourceId(index, -1);
                                jm3Var.i = resourceId3;
                                gm3Var.b(89, resourceId3);
                                gm3Var.b(88, -2);
                                break;
                            } else {
                                gm3Var.b(88, -1);
                                break;
                            }
                        } else {
                            gm3Var.b(88, obtainStyledAttributes.getInteger(index, jm3Var.i));
                            break;
                        }
                        break;
                    case 87:
                        Integer.toHexString(index);
                        sparseIntArray.get(index);
                        break;
                    case 93:
                        gm3Var.b(93, obtainStyledAttributes.getDimensionPixelSize(index, im3Var.L));
                        break;
                    case MBSupportMuteAdType.REWARD_VIDEO /* 94 */:
                        gm3Var.b(94, obtainStyledAttributes.getDimensionPixelSize(index, im3Var.S));
                        break;
                    case 95:
                        m(gm3Var, obtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        m(gm3Var, obtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        gm3Var.b(97, obtainStyledAttributes.getInt(index, im3Var.o0));
                        break;
                    case 98:
                        int i4 = uvc.a;
                        if (obtainStyledAttributes.peekValue(index).type == i) {
                            obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            hm3Var.a = obtainStyledAttributes.getResourceId(index, hm3Var.a);
                            break;
                        }
                    case 99:
                        gm3Var.d(99, obtainStyledAttributes.getBoolean(index, im3Var.g));
                        break;
                }
                i2++;
                i = 3;
            }
        } else {
            int indexCount2 = obtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount2; i5++) {
                int index2 = obtainStyledAttributes.getIndex(i5);
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        im3Var.p = l(obtainStyledAttributes, index2, im3Var.p);
                        break;
                    case 2:
                        im3Var.I = obtainStyledAttributes.getDimensionPixelSize(index2, im3Var.I);
                        break;
                    case 3:
                        im3Var.o = l(obtainStyledAttributes, index2, im3Var.o);
                        break;
                    case 4:
                        im3Var.n = l(obtainStyledAttributes, index2, im3Var.n);
                        break;
                    case 5:
                        im3Var.y = obtainStyledAttributes.getString(index2);
                        break;
                    case 6:
                        im3Var.C = obtainStyledAttributes.getDimensionPixelOffset(index2, im3Var.C);
                        break;
                    case 7:
                        im3Var.D = obtainStyledAttributes.getDimensionPixelOffset(index2, im3Var.D);
                        break;
                    case 8:
                        im3Var.J = obtainStyledAttributes.getDimensionPixelSize(index2, im3Var.J);
                        break;
                    case 9:
                        im3Var.v = l(obtainStyledAttributes, index2, im3Var.v);
                        break;
                    case 10:
                        im3Var.u = l(obtainStyledAttributes, index2, im3Var.u);
                        break;
                    case 11:
                        im3Var.P = obtainStyledAttributes.getDimensionPixelSize(index2, im3Var.P);
                        break;
                    case 12:
                        im3Var.Q = obtainStyledAttributes.getDimensionPixelSize(index2, im3Var.Q);
                        break;
                    case 13:
                        im3Var.M = obtainStyledAttributes.getDimensionPixelSize(index2, im3Var.M);
                        break;
                    case 14:
                        im3Var.O = obtainStyledAttributes.getDimensionPixelSize(index2, im3Var.O);
                        break;
                    case 15:
                        im3Var.R = obtainStyledAttributes.getDimensionPixelSize(index2, im3Var.R);
                        break;
                    case 16:
                        im3Var.N = obtainStyledAttributes.getDimensionPixelSize(index2, im3Var.N);
                        break;
                    case 17:
                        im3Var.d = obtainStyledAttributes.getDimensionPixelOffset(index2, im3Var.d);
                        break;
                    case 18:
                        im3Var.e = obtainStyledAttributes.getDimensionPixelOffset(index2, im3Var.e);
                        break;
                    case 19:
                        im3Var.f = obtainStyledAttributes.getFloat(index2, im3Var.f);
                        break;
                    case 20:
                        im3Var.w = obtainStyledAttributes.getFloat(index2, im3Var.w);
                        break;
                    case 21:
                        im3Var.c = obtainStyledAttributes.getLayoutDimension(index2, im3Var.c);
                        break;
                    case 22:
                        int i6 = obtainStyledAttributes.getInt(index2, km3Var.a);
                        km3Var.a = i6;
                        km3Var.a = iArr[i6];
                        break;
                    case 23:
                        im3Var.b = obtainStyledAttributes.getLayoutDimension(index2, im3Var.b);
                        break;
                    case 24:
                        im3Var.F = obtainStyledAttributes.getDimensionPixelSize(index2, im3Var.F);
                        break;
                    case 25:
                        im3Var.h = l(obtainStyledAttributes, index2, im3Var.h);
                        break;
                    case 26:
                        im3Var.i = l(obtainStyledAttributes, index2, im3Var.i);
                        break;
                    case 27:
                        im3Var.E = obtainStyledAttributes.getInt(index2, im3Var.E);
                        break;
                    case 28:
                        im3Var.G = obtainStyledAttributes.getDimensionPixelSize(index2, im3Var.G);
                        break;
                    case 29:
                        im3Var.j = l(obtainStyledAttributes, index2, im3Var.j);
                        break;
                    case 30:
                        im3Var.k = l(obtainStyledAttributes, index2, im3Var.k);
                        break;
                    case 31:
                        im3Var.K = obtainStyledAttributes.getDimensionPixelSize(index2, im3Var.K);
                        break;
                    case 32:
                        im3Var.s = l(obtainStyledAttributes, index2, im3Var.s);
                        break;
                    case 33:
                        im3Var.t = l(obtainStyledAttributes, index2, im3Var.t);
                        break;
                    case 34:
                        im3Var.H = obtainStyledAttributes.getDimensionPixelSize(index2, im3Var.H);
                        break;
                    case 35:
                        im3Var.m = l(obtainStyledAttributes, index2, im3Var.m);
                        break;
                    case 36:
                        im3Var.l = l(obtainStyledAttributes, index2, im3Var.l);
                        break;
                    case 37:
                        im3Var.x = obtainStyledAttributes.getFloat(index2, im3Var.x);
                        break;
                    case 38:
                        hm3Var.a = obtainStyledAttributes.getResourceId(index2, hm3Var.a);
                        break;
                    case 39:
                        im3Var.U = obtainStyledAttributes.getFloat(index2, im3Var.U);
                        break;
                    case 40:
                        im3Var.T = obtainStyledAttributes.getFloat(index2, im3Var.T);
                        break;
                    case 41:
                        im3Var.V = obtainStyledAttributes.getInt(index2, im3Var.V);
                        break;
                    case 42:
                        im3Var.W = obtainStyledAttributes.getInt(index2, im3Var.W);
                        break;
                    case 43:
                        km3Var.c = obtainStyledAttributes.getFloat(index2, km3Var.c);
                        break;
                    case 44:
                        lm3Var.l = true;
                        lm3Var.m = obtainStyledAttributes.getDimension(index2, lm3Var.m);
                        break;
                    case 45:
                        lm3Var.b = obtainStyledAttributes.getFloat(index2, lm3Var.b);
                        break;
                    case 46:
                        lm3Var.c = obtainStyledAttributes.getFloat(index2, lm3Var.c);
                        break;
                    case 47:
                        lm3Var.d = obtainStyledAttributes.getFloat(index2, lm3Var.d);
                        break;
                    case 48:
                        lm3Var.e = obtainStyledAttributes.getFloat(index2, lm3Var.e);
                        break;
                    case 49:
                        lm3Var.f = obtainStyledAttributes.getDimension(index2, lm3Var.f);
                        break;
                    case 50:
                        lm3Var.g = obtainStyledAttributes.getDimension(index2, lm3Var.g);
                        break;
                    case 51:
                        lm3Var.i = obtainStyledAttributes.getDimension(index2, lm3Var.i);
                        break;
                    case 52:
                        lm3Var.j = obtainStyledAttributes.getDimension(index2, lm3Var.j);
                        break;
                    case 53:
                        lm3Var.k = obtainStyledAttributes.getDimension(index2, lm3Var.k);
                        break;
                    case 54:
                        im3Var.X = obtainStyledAttributes.getInt(index2, im3Var.X);
                        break;
                    case 55:
                        im3Var.Y = obtainStyledAttributes.getInt(index2, im3Var.Y);
                        break;
                    case 56:
                        im3Var.Z = obtainStyledAttributes.getDimensionPixelSize(index2, im3Var.Z);
                        break;
                    case 57:
                        im3Var.a0 = obtainStyledAttributes.getDimensionPixelSize(index2, im3Var.a0);
                        break;
                    case 58:
                        im3Var.b0 = obtainStyledAttributes.getDimensionPixelSize(index2, im3Var.b0);
                        break;
                    case 59:
                        im3Var.c0 = obtainStyledAttributes.getDimensionPixelSize(index2, im3Var.c0);
                        break;
                    case 60:
                        lm3Var.a = obtainStyledAttributes.getFloat(index2, lm3Var.a);
                        break;
                    case 61:
                        im3Var.z = l(obtainStyledAttributes, index2, im3Var.z);
                        break;
                    case 62:
                        im3Var.A = obtainStyledAttributes.getDimensionPixelSize(index2, im3Var.A);
                        break;
                    case 63:
                        im3Var.B = obtainStyledAttributes.getFloat(index2, im3Var.B);
                        break;
                    case 64:
                        jm3Var.a = l(obtainStyledAttributes, index2, jm3Var.a);
                        break;
                    case 65:
                        if (obtainStyledAttributes.peekValue(index2).type == 3) {
                            obtainStyledAttributes.getString(index2);
                            break;
                        } else {
                            String str = strArr[obtainStyledAttributes.getInteger(index2, 0)];
                            break;
                        }
                    case 66:
                        obtainStyledAttributes.getInt(index2, 0);
                        break;
                    case 67:
                        jm3Var.e = obtainStyledAttributes.getFloat(index2, jm3Var.e);
                        break;
                    case 68:
                        km3Var.d = obtainStyledAttributes.getFloat(index2, km3Var.d);
                        break;
                    case 69:
                        im3Var.d0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        im3Var.e0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        break;
                    case 72:
                        im3Var.f0 = obtainStyledAttributes.getInt(index2, im3Var.f0);
                        break;
                    case TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER /* 73 */:
                        im3Var.g0 = obtainStyledAttributes.getDimensionPixelSize(index2, im3Var.g0);
                        break;
                    case TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER /* 74 */:
                        im3Var.j0 = obtainStyledAttributes.getString(index2);
                        break;
                    case TokenParametersOuterClass$TokenParameters.TOPICS_FIELD_NUMBER /* 75 */:
                        im3Var.n0 = obtainStyledAttributes.getBoolean(index2, im3Var.n0);
                        break;
                    case TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER /* 76 */:
                        jm3Var.c = obtainStyledAttributes.getInt(index2, jm3Var.c);
                        break;
                    case TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER /* 77 */:
                        im3Var.k0 = obtainStyledAttributes.getString(index2);
                        break;
                    case TokenParametersOuterClass$TokenParameters.GPP_FIELD_NUMBER /* 78 */:
                        km3Var.b = obtainStyledAttributes.getInt(index2, km3Var.b);
                        break;
                    case 79:
                        jm3Var.d = obtainStyledAttributes.getFloat(index2, jm3Var.d);
                        break;
                    case 80:
                        im3Var.l0 = obtainStyledAttributes.getBoolean(index2, im3Var.l0);
                        break;
                    case 81:
                        im3Var.m0 = obtainStyledAttributes.getBoolean(index2, im3Var.m0);
                        break;
                    case 82:
                        jm3Var.b = obtainStyledAttributes.getInteger(index2, jm3Var.b);
                        break;
                    case 83:
                        lm3Var.h = l(obtainStyledAttributes, index2, lm3Var.h);
                        break;
                    case 84:
                        jm3Var.g = obtainStyledAttributes.getInteger(index2, jm3Var.g);
                        break;
                    case 85:
                        jm3Var.f = obtainStyledAttributes.getFloat(index2, jm3Var.f);
                        break;
                    case 86:
                        int i7 = obtainStyledAttributes.peekValue(index2).type;
                        if (i7 == 1) {
                            jm3Var.i = obtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i7 == 3) {
                            String string2 = obtainStyledAttributes.getString(index2);
                            jm3Var.h = string2;
                            if (string2.indexOf("/") > 0) {
                                jm3Var.i = obtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            obtainStyledAttributes.getInteger(index2, jm3Var.i);
                        }
                        break;
                    case 87:
                        Integer.toHexString(index2);
                        sparseIntArray.get(index2);
                        break;
                    case 88:
                    case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
                    case 90:
                    default:
                        Integer.toHexString(index2);
                        sparseIntArray.get(index2);
                        break;
                    case 91:
                        im3Var.q = l(obtainStyledAttributes, index2, im3Var.q);
                        break;
                    case 92:
                        im3Var.r = l(obtainStyledAttributes, index2, im3Var.r);
                        break;
                    case 93:
                        im3Var.L = obtainStyledAttributes.getDimensionPixelSize(index2, im3Var.L);
                        break;
                    case MBSupportMuteAdType.REWARD_VIDEO /* 94 */:
                        im3Var.S = obtainStyledAttributes.getDimensionPixelSize(index2, im3Var.S);
                        break;
                    case 95:
                        m(im3Var, obtainStyledAttributes, index2, 0);
                        break;
                    case 96:
                        m(im3Var, obtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        im3Var.o0 = obtainStyledAttributes.getInt(index2, im3Var.o0);
                        break;
                }
            }
            if (im3Var.j0 != null) {
                im3Var.i0 = null;
            }
        }
        obtainStyledAttributes.recycle();
        return hm3Var;
    }

    public static int l(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m(Object obj, TypedArray typedArray, int i, int i2) {
        int dimensionPixelSize;
        int i3 = typedArray.peekValue(i).type;
        boolean z = true;
        int i4 = 0;
        if (i3 == 3) {
            String string = typedArray.getString(i);
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
                    if (obj instanceof tl3) {
                        tl3 tl3Var = (tl3) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) tl3Var).width = 0;
                        } else {
                            ((ViewGroup.MarginLayoutParams) tl3Var).height = 0;
                        }
                        n(tl3Var, trim2);
                        return;
                    }
                    if (obj instanceof im3) {
                        ((im3) obj).y = trim2;
                        return;
                    } else {
                        if (obj instanceof gm3) {
                            ((gm3) obj).c(5, trim2);
                            return;
                        }
                        return;
                    }
                }
                try {
                    if ("weight".equalsIgnoreCase(trim)) {
                        float parseFloat = Float.parseFloat(trim2);
                        if (obj instanceof tl3) {
                            tl3 tl3Var2 = (tl3) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) tl3Var2).width = 0;
                                tl3Var2.H = parseFloat;
                                return;
                            } else {
                                ((ViewGroup.MarginLayoutParams) tl3Var2).height = 0;
                                tl3Var2.I = parseFloat;
                                return;
                            }
                        }
                        if (obj instanceof im3) {
                            im3 im3Var = (im3) obj;
                            if (i2 == 0) {
                                im3Var.b = 0;
                                im3Var.U = parseFloat;
                                return;
                            } else {
                                im3Var.c = 0;
                                im3Var.T = parseFloat;
                                return;
                            }
                        }
                        if (obj instanceof gm3) {
                            gm3 gm3Var = (gm3) obj;
                            if (i2 == 0) {
                                gm3Var.b(23, 0);
                                gm3Var.a(parseFloat, 39);
                                return;
                            } else {
                                gm3Var.b(21, 0);
                                gm3Var.a(parseFloat, 40);
                                return;
                            }
                        }
                        return;
                    }
                    if ("parent".equalsIgnoreCase(trim)) {
                        float max = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(1.0f, Float.parseFloat(trim2)));
                        if (obj instanceof tl3) {
                            tl3 tl3Var3 = (tl3) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) tl3Var3).width = 0;
                                tl3Var3.R = max;
                                tl3Var3.L = 2;
                                return;
                            } else {
                                ((ViewGroup.MarginLayoutParams) tl3Var3).height = 0;
                                tl3Var3.S = max;
                                tl3Var3.M = 2;
                                return;
                            }
                        }
                        if (obj instanceof im3) {
                            im3 im3Var2 = (im3) obj;
                            if (i2 == 0) {
                                im3Var2.b = 0;
                                im3Var2.d0 = max;
                                im3Var2.X = 2;
                                return;
                            } else {
                                im3Var2.c = 0;
                                im3Var2.e0 = max;
                                im3Var2.Y = 2;
                                return;
                            }
                        }
                        if (obj instanceof gm3) {
                            gm3 gm3Var2 = (gm3) obj;
                            if (i2 == 0) {
                                gm3Var2.b(23, 0);
                                gm3Var2.b(54, 2);
                                return;
                            } else {
                                gm3Var2.b(21, 0);
                                gm3Var2.b(55, 2);
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
        if (i3 != 5) {
            dimensionPixelSize = typedArray.getInt(i, 0);
            if (dimensionPixelSize == -4) {
                i4 = -2;
            } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                z = false;
            }
            if (!(obj instanceof tl3)) {
                tl3 tl3Var4 = (tl3) obj;
                if (i2 == 0) {
                    ((ViewGroup.MarginLayoutParams) tl3Var4).width = i4;
                    tl3Var4.W = z;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) tl3Var4).height = i4;
                    tl3Var4.X = z;
                    return;
                }
            }
            if (obj instanceof im3) {
                im3 im3Var3 = (im3) obj;
                if (i2 == 0) {
                    im3Var3.b = i4;
                    im3Var3.l0 = z;
                    return;
                } else {
                    im3Var3.c = i4;
                    im3Var3.m0 = z;
                    return;
                }
            }
            if (obj instanceof gm3) {
                gm3 gm3Var3 = (gm3) obj;
                if (i2 == 0) {
                    gm3Var3.b(23, i4);
                    gm3Var3.d(80, z);
                    return;
                } else {
                    gm3Var3.b(21, i4);
                    gm3Var3.d(81, z);
                    return;
                }
            }
            return;
        }
        dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
        z = false;
        i4 = dimensionPixelSize;
        if (!(obj instanceof tl3)) {
        }
    }

    public static void n(tl3 tl3Var, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                i = substring.equalsIgnoreCase("W") ? 0 : substring.equalsIgnoreCase("H") ? 1 : -1;
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
                        if (parseFloat > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && parseFloat2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            if (i == 1) {
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
        tl3Var.G = str;
    }

    public static String t(int i) {
        switch (i) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return PlayerKt.E_SPORTS_TOP;
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return TtmlNode.END;
            default:
                return AdError.UNDEFINED_DOMAIN;
        }
    }

    public final void a(ConstraintLayout constraintLayout) {
        b(constraintLayout);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public final void b(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = this.b;
        HashSet hashSet = new HashSet(hashMap.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                try {
                    childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                }
            } else {
                if (id == -1) {
                    cp4.h("All children of ConstraintLayout must have ids to use ConstraintSet");
                    return;
                }
                if (id != -1 && hashMap.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    hm3 hm3Var = (hm3) hashMap.get(Integer.valueOf(id));
                    if (hm3Var != null) {
                        km3 km3Var = hm3Var.b;
                        im3 im3Var = hm3Var.d;
                        lm3 lm3Var = hm3Var.e;
                        if (childAt instanceof Barrier) {
                            im3Var.h0 = 1;
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            barrier.setType(im3Var.f0);
                            barrier.setMargin(im3Var.g0);
                            barrier.setAllowsGoneWidget(im3Var.n0);
                            int[] iArr = im3Var.i0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = im3Var.j0;
                                if (str != null) {
                                    int[] h = h(barrier, str);
                                    im3Var.i0 = h;
                                    barrier.setReferencedIds(h);
                                }
                            }
                        }
                        tl3 tl3Var = (tl3) childAt.getLayoutParams();
                        tl3Var.a();
                        hm3Var.a(tl3Var);
                        HashMap hashMap2 = hm3Var.f;
                        Class<?> cls = childAt.getClass();
                        for (String str2 : hashMap2.keySet()) {
                            ol3 ol3Var = (ol3) hashMap2.get(str2);
                            if (!ol3Var.a) {
                                str2 = dmi.q("set", str2);
                            }
                            try {
                                int C = wt3.C(ol3Var.b);
                                Class cls2 = Float.TYPE;
                                Class cls3 = Integer.TYPE;
                                switch (C) {
                                    case 0:
                                        cls.getMethod(str2, cls3).invoke(childAt, Integer.valueOf(ol3Var.c));
                                        break;
                                    case 1:
                                        cls.getMethod(str2, cls2).invoke(childAt, Float.valueOf(ol3Var.d));
                                        break;
                                    case 2:
                                        cls.getMethod(str2, cls3).invoke(childAt, Integer.valueOf(ol3Var.g));
                                        break;
                                    case 3:
                                        Method method = cls.getMethod(str2, Drawable.class);
                                        ColorDrawable colorDrawable = new ColorDrawable();
                                        colorDrawable.setColor(ol3Var.g);
                                        method.invoke(childAt, colorDrawable);
                                        break;
                                    case 4:
                                        cls.getMethod(str2, CharSequence.class).invoke(childAt, ol3Var.e);
                                        break;
                                    case 5:
                                        cls.getMethod(str2, Boolean.TYPE).invoke(childAt, Boolean.valueOf(ol3Var.f));
                                        break;
                                    case 6:
                                        cls.getMethod(str2, cls2).invoke(childAt, Float.valueOf(ol3Var.d));
                                        break;
                                    case 7:
                                        cls.getMethod(str2, cls3).invoke(childAt, Integer.valueOf(ol3Var.c));
                                        break;
                                }
                            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                            }
                        }
                        childAt.setLayoutParams(tl3Var);
                        if (km3Var.b == 0) {
                            childAt.setVisibility(km3Var.a);
                        }
                        childAt.setAlpha(km3Var.c);
                        childAt.setRotation(lm3Var.a);
                        childAt.setRotationX(lm3Var.b);
                        childAt.setRotationY(lm3Var.c);
                        childAt.setScaleX(lm3Var.d);
                        childAt.setScaleY(lm3Var.e);
                        if (lm3Var.h != -1) {
                            if (((View) childAt.getParent()).findViewById(lm3Var.h) != null) {
                                float bottom = (r4.getBottom() + r4.getTop()) / 2.0f;
                                float right = (r4.getRight() + r4.getLeft()) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    childAt.setPivotX(right - childAt.getLeft());
                                    childAt.setPivotY(bottom - childAt.getTop());
                                }
                            }
                        } else {
                            if (!Float.isNaN(lm3Var.f)) {
                                childAt.setPivotX(lm3Var.f);
                            }
                            if (!Float.isNaN(lm3Var.g)) {
                                childAt.setPivotY(lm3Var.g);
                            }
                        }
                        childAt.setTranslationX(lm3Var.i);
                        childAt.setTranslationY(lm3Var.j);
                        childAt.setTranslationZ(lm3Var.k);
                        if (lm3Var.l) {
                            childAt.setElevation(lm3Var.m);
                        }
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            hm3 hm3Var2 = (hm3) hashMap.get(num);
            if (hm3Var2 != null) {
                im3 im3Var2 = hm3Var2.d;
                if (im3Var2.h0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = im3Var2.i0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str3 = im3Var2.j0;
                        if (str3 != null) {
                            int[] h2 = h(barrier2, str3);
                            im3Var2.i0 = h2;
                            barrier2.setReferencedIds(h2);
                        }
                    }
                    barrier2.setType(im3Var2.f0);
                    barrier2.setMargin(im3Var2.g0);
                    tl3 generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.k();
                    hm3Var2.a(generateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, generateDefaultLayoutParams);
                }
                if (im3Var2.a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    tl3 generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    hm3Var2.a(generateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, generateDefaultLayoutParams2);
                }
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt2 = constraintLayout.getChildAt(i2);
            if (childAt2 instanceof ql3) {
                ((ql3) childAt2).f(constraintLayout);
            }
        }
    }

    public final void c(int i) {
        this.b.remove(Integer.valueOf(i));
    }

    public final void d(int i, int i2) {
        hm3 hm3Var;
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = this.b;
        if (!hashMap.containsKey(valueOf) || (hm3Var = (hm3) hashMap.get(Integer.valueOf(i))) == null) {
            return;
        }
        im3 im3Var = hm3Var.d;
        switch (i2) {
            case 1:
                im3Var.i = -1;
                im3Var.h = -1;
                im3Var.F = -1;
                im3Var.M = Integer.MIN_VALUE;
                break;
            case 2:
                im3Var.k = -1;
                im3Var.j = -1;
                im3Var.G = -1;
                im3Var.O = Integer.MIN_VALUE;
                break;
            case 3:
                im3Var.m = -1;
                im3Var.l = -1;
                im3Var.H = 0;
                im3Var.N = Integer.MIN_VALUE;
                break;
            case 4:
                im3Var.n = -1;
                im3Var.o = -1;
                im3Var.I = 0;
                im3Var.P = Integer.MIN_VALUE;
                break;
            case 5:
                im3Var.p = -1;
                im3Var.q = -1;
                im3Var.r = -1;
                im3Var.L = 0;
                im3Var.S = Integer.MIN_VALUE;
                break;
            case 6:
                im3Var.s = -1;
                im3Var.t = -1;
                im3Var.K = 0;
                im3Var.R = Integer.MIN_VALUE;
                break;
            case 7:
                im3Var.u = -1;
                im3Var.v = -1;
                im3Var.J = 0;
                im3Var.Q = Integer.MIN_VALUE;
                break;
            case 8:
                im3Var.B = -1.0f;
                im3Var.A = -1;
                im3Var.z = -1;
                break;
            default:
                a70.p("unknown constraint");
                break;
        }
    }

    public final void e(ConstraintLayout constraintLayout) {
        int i;
        HashMap hashMap;
        int i2;
        int i3;
        mm3 mm3Var = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap2 = mm3Var.b;
        hashMap2.clear();
        int i4 = 0;
        while (i4 < childCount) {
            View childAt = constraintLayout.getChildAt(i4);
            tl3 tl3Var = (tl3) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id == -1) {
                cp4.h("All children of ConstraintLayout must have ids to use ConstraintSet");
                return;
            }
            if (!hashMap2.containsKey(Integer.valueOf(id))) {
                hashMap2.put(Integer.valueOf(id), new hm3());
            }
            hm3 hm3Var = (hm3) hashMap2.get(Integer.valueOf(id));
            if (hm3Var == null) {
                i = childCount;
                hashMap = hashMap2;
                i2 = i4;
            } else {
                km3 km3Var = hm3Var.b;
                im3 im3Var = hm3Var.d;
                lm3 lm3Var = hm3Var.e;
                HashMap hashMap3 = new HashMap();
                Class<?> cls = childAt.getClass();
                HashMap hashMap4 = mm3Var.a;
                for (String str : hashMap4.keySet()) {
                    int i5 = childCount;
                    ol3 ol3Var = (ol3) hashMap4.get(str);
                    HashMap hashMap5 = hashMap2;
                    try {
                        if (str.equals("BackgroundColor")) {
                            i3 = i4;
                            try {
                                hashMap3.put(str, new ol3(ol3Var, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                            }
                        } else {
                            i3 = i4;
                            hashMap3.put(str, new ol3(ol3Var, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                        i3 = i4;
                    }
                    hashMap2 = hashMap5;
                    childCount = i5;
                    i4 = i3;
                }
                i = childCount;
                hashMap = hashMap2;
                i2 = i4;
                hm3Var.f = hashMap3;
                hm3Var.a = id;
                im3Var.h = tl3Var.e;
                im3Var.i = tl3Var.f;
                im3Var.j = tl3Var.g;
                im3Var.k = tl3Var.h;
                im3Var.l = tl3Var.i;
                im3Var.m = tl3Var.j;
                im3Var.n = tl3Var.k;
                im3Var.o = tl3Var.l;
                im3Var.p = tl3Var.m;
                im3Var.q = tl3Var.n;
                im3Var.r = tl3Var.o;
                im3Var.s = tl3Var.s;
                im3Var.t = tl3Var.t;
                im3Var.u = tl3Var.u;
                im3Var.v = tl3Var.v;
                im3Var.w = tl3Var.E;
                im3Var.x = tl3Var.F;
                im3Var.y = tl3Var.G;
                im3Var.z = tl3Var.p;
                im3Var.A = tl3Var.q;
                im3Var.B = tl3Var.r;
                im3Var.C = tl3Var.T;
                im3Var.D = tl3Var.U;
                im3Var.E = tl3Var.V;
                im3Var.f = tl3Var.c;
                im3Var.d = tl3Var.a;
                im3Var.e = tl3Var.b;
                im3Var.b = ((ViewGroup.MarginLayoutParams) tl3Var).width;
                im3Var.c = ((ViewGroup.MarginLayoutParams) tl3Var).height;
                im3Var.F = ((ViewGroup.MarginLayoutParams) tl3Var).leftMargin;
                im3Var.G = ((ViewGroup.MarginLayoutParams) tl3Var).rightMargin;
                im3Var.H = ((ViewGroup.MarginLayoutParams) tl3Var).topMargin;
                im3Var.I = ((ViewGroup.MarginLayoutParams) tl3Var).bottomMargin;
                im3Var.L = tl3Var.D;
                im3Var.T = tl3Var.I;
                im3Var.U = tl3Var.H;
                im3Var.W = tl3Var.K;
                im3Var.V = tl3Var.J;
                im3Var.l0 = tl3Var.W;
                im3Var.m0 = tl3Var.X;
                im3Var.X = tl3Var.L;
                im3Var.Y = tl3Var.M;
                im3Var.Z = tl3Var.P;
                im3Var.a0 = tl3Var.Q;
                im3Var.b0 = tl3Var.N;
                im3Var.c0 = tl3Var.O;
                im3Var.d0 = tl3Var.R;
                im3Var.e0 = tl3Var.S;
                im3Var.k0 = tl3Var.Y;
                im3Var.N = tl3Var.x;
                im3Var.P = tl3Var.z;
                im3Var.M = tl3Var.w;
                im3Var.O = tl3Var.y;
                im3Var.R = tl3Var.A;
                im3Var.Q = tl3Var.B;
                im3Var.S = tl3Var.C;
                im3Var.o0 = tl3Var.Z;
                im3Var.J = tl3Var.getMarginEnd();
                im3Var.K = tl3Var.getMarginStart();
                km3Var.a = childAt.getVisibility();
                km3Var.c = childAt.getAlpha();
                lm3Var.a = childAt.getRotation();
                lm3Var.b = childAt.getRotationX();
                lm3Var.c = childAt.getRotationY();
                lm3Var.d = childAt.getScaleX();
                lm3Var.e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    lm3Var.f = pivotX;
                    lm3Var.g = pivotY;
                }
                lm3Var.i = childAt.getTranslationX();
                lm3Var.j = childAt.getTranslationY();
                lm3Var.k = childAt.getTranslationZ();
                if (lm3Var.l) {
                    lm3Var.m = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    im3Var.n0 = barrier.getAllowsGoneWidget();
                    im3Var.i0 = barrier.getReferencedIds();
                    im3Var.f0 = barrier.getType();
                    im3Var.g0 = barrier.getMargin();
                }
            }
            i4 = i2 + 1;
            mm3Var = this;
            hashMap2 = hashMap;
            childCount = i;
        }
    }

    public final void f(int i, int i2, int i3, int i4) {
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = this.b;
        if (!hashMap.containsKey(valueOf)) {
            hashMap.put(Integer.valueOf(i), new hm3());
        }
        hm3 hm3Var = (hm3) hashMap.get(Integer.valueOf(i));
        if (hm3Var == null) {
        }
        im3 im3Var = hm3Var.d;
        switch (i2) {
            case 1:
                if (i4 != 1) {
                    if (i4 != 2) {
                        sw9.t(t(i4), " undefined", "left to ");
                        break;
                    } else {
                        im3Var.i = i3;
                        im3Var.h = -1;
                        break;
                    }
                } else {
                    im3Var.h = i3;
                    im3Var.i = -1;
                    break;
                }
            case 2:
                if (i4 != 1) {
                    if (i4 != 2) {
                        sw9.t(t(i4), " undefined", "right to ");
                        break;
                    } else {
                        im3Var.k = i3;
                        im3Var.j = -1;
                        break;
                    }
                } else {
                    im3Var.j = i3;
                    im3Var.k = -1;
                    break;
                }
            case 3:
                if (i4 != 3) {
                    if (i4 != 4) {
                        sw9.t(t(i4), " undefined", "right to ");
                        break;
                    } else {
                        im3Var.m = i3;
                        im3Var.l = -1;
                        im3Var.p = -1;
                        im3Var.q = -1;
                        im3Var.r = -1;
                        break;
                    }
                } else {
                    im3Var.l = i3;
                    im3Var.m = -1;
                    im3Var.p = -1;
                    im3Var.q = -1;
                    im3Var.r = -1;
                    break;
                }
            case 4:
                if (i4 != 4) {
                    if (i4 != 3) {
                        sw9.t(t(i4), " undefined", "right to ");
                        break;
                    } else {
                        im3Var.n = i3;
                        im3Var.o = -1;
                        im3Var.p = -1;
                        im3Var.q = -1;
                        im3Var.r = -1;
                        break;
                    }
                } else {
                    im3Var.o = i3;
                    im3Var.n = -1;
                    im3Var.p = -1;
                    im3Var.q = -1;
                    im3Var.r = -1;
                    break;
                }
            case 5:
                if (i4 != 5) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            sw9.t(t(i4), " undefined", "right to ");
                            break;
                        } else {
                            im3Var.r = i3;
                            im3Var.o = -1;
                            im3Var.n = -1;
                            im3Var.l = -1;
                            im3Var.m = -1;
                            break;
                        }
                    } else {
                        im3Var.q = i3;
                        im3Var.o = -1;
                        im3Var.n = -1;
                        im3Var.l = -1;
                        im3Var.m = -1;
                        break;
                    }
                } else {
                    im3Var.p = i3;
                    im3Var.o = -1;
                    im3Var.n = -1;
                    im3Var.l = -1;
                    im3Var.m = -1;
                    break;
                }
            case 6:
                if (i4 != 6) {
                    if (i4 != 7) {
                        sw9.t(t(i4), " undefined", "right to ");
                        break;
                    } else {
                        im3Var.s = i3;
                        im3Var.t = -1;
                        break;
                    }
                } else {
                    im3Var.t = i3;
                    im3Var.s = -1;
                    break;
                }
            case 7:
                if (i4 != 7) {
                    if (i4 != 6) {
                        sw9.t(t(i4), " undefined", "right to ");
                        break;
                    } else {
                        im3Var.u = i3;
                        im3Var.v = -1;
                        break;
                    }
                } else {
                    im3Var.v = i3;
                    im3Var.u = -1;
                    break;
                }
            default:
                sw9.q(t(i2), " to ", t(i4), " unknown");
                break;
        }
    }

    public final void g(int i, int i2, int i3, int i4, int i5) {
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = this.b;
        if (!hashMap.containsKey(valueOf)) {
            hashMap.put(Integer.valueOf(i), new hm3());
        }
        hm3 hm3Var = (hm3) hashMap.get(Integer.valueOf(i));
        if (hm3Var == null) {
        }
        im3 im3Var = hm3Var.d;
        switch (i2) {
            case 1:
                if (i4 != 1) {
                    if (i4 != 2) {
                        sw9.t(t(i4), " undefined", "Left to ");
                        break;
                    } else {
                        im3Var.i = i3;
                        im3Var.h = -1;
                    }
                } else {
                    im3Var.h = i3;
                    im3Var.i = -1;
                }
                im3Var.F = i5;
                break;
            case 2:
                if (i4 != 1) {
                    if (i4 != 2) {
                        sw9.t(t(i4), " undefined", "right to ");
                        break;
                    } else {
                        im3Var.k = i3;
                        im3Var.j = -1;
                    }
                } else {
                    im3Var.j = i3;
                    im3Var.k = -1;
                }
                im3Var.G = i5;
                break;
            case 3:
                if (i4 != 3) {
                    if (i4 != 4) {
                        sw9.t(t(i4), " undefined", "right to ");
                        break;
                    } else {
                        im3Var.m = i3;
                        im3Var.l = -1;
                        im3Var.p = -1;
                        im3Var.q = -1;
                        im3Var.r = -1;
                    }
                } else {
                    im3Var.l = i3;
                    im3Var.m = -1;
                    im3Var.p = -1;
                    im3Var.q = -1;
                    im3Var.r = -1;
                }
                im3Var.H = i5;
                break;
            case 4:
                if (i4 != 4) {
                    if (i4 != 3) {
                        sw9.t(t(i4), " undefined", "right to ");
                        break;
                    } else {
                        im3Var.n = i3;
                        im3Var.o = -1;
                        im3Var.p = -1;
                        im3Var.q = -1;
                        im3Var.r = -1;
                    }
                } else {
                    im3Var.o = i3;
                    im3Var.n = -1;
                    im3Var.p = -1;
                    im3Var.q = -1;
                    im3Var.r = -1;
                }
                im3Var.I = i5;
                break;
            case 5:
                if (i4 != 5) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            sw9.t(t(i4), " undefined", "right to ");
                            break;
                        } else {
                            im3Var.r = i3;
                            im3Var.o = -1;
                            im3Var.n = -1;
                            im3Var.l = -1;
                            im3Var.m = -1;
                            break;
                        }
                    } else {
                        im3Var.q = i3;
                        im3Var.o = -1;
                        im3Var.n = -1;
                        im3Var.l = -1;
                        im3Var.m = -1;
                        break;
                    }
                } else {
                    im3Var.p = i3;
                    im3Var.o = -1;
                    im3Var.n = -1;
                    im3Var.l = -1;
                    im3Var.m = -1;
                    break;
                }
            case 6:
                if (i4 != 6) {
                    if (i4 != 7) {
                        sw9.t(t(i4), " undefined", "right to ");
                        break;
                    } else {
                        im3Var.s = i3;
                        im3Var.t = -1;
                    }
                } else {
                    im3Var.t = i3;
                    im3Var.s = -1;
                }
                im3Var.K = i5;
                break;
            case 7:
                if (i4 != 7) {
                    if (i4 != 6) {
                        sw9.t(t(i4), " undefined", "right to ");
                        break;
                    } else {
                        im3Var.u = i3;
                        im3Var.v = -1;
                    }
                } else {
                    im3Var.v = i3;
                    im3Var.u = -1;
                }
                im3Var.J = i5;
                break;
            default:
                sw9.q(t(i2), " to ", t(i4), " unknown");
                break;
        }
    }

    public final hm3 j(int i) {
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = this.b;
        if (!hashMap.containsKey(valueOf)) {
            hashMap.put(Integer.valueOf(i), new hm3());
        }
        return (hm3) hashMap.get(Integer.valueOf(i));
    }

    public final void k(int i, Context context) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    hm3 i2 = i(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        i2.d.a = true;
                    }
                    this.b.put(Integer.valueOf(i2.a), i2);
                }
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    public final void o(int i, String str) {
        j(i).d.y = str;
    }

    public final void p(int i, int i2) {
        hm3 j = j(i);
        switch (i2) {
            case 1:
                j.d.M = 0;
                break;
            case 2:
                j.d.O = 0;
                break;
            case 3:
                j.d.N = 0;
                break;
            case 4:
                j.d.P = 0;
                break;
            case 5:
                j.d.S = 0;
                break;
            case 6:
                j.d.R = 0;
                break;
            case 7:
                j.d.Q = 0;
                break;
            default:
                a70.p("unknown constraint");
                break;
        }
    }

    public final void q(float f, int i) {
        j(i).d.f = f;
        j(i).d.e = -1;
        j(i).d.d = -1;
    }

    public final void r(int i, int i2, int i3) {
        hm3 j = j(i);
        switch (i2) {
            case 1:
                j.d.F = i3;
                break;
            case 2:
                j.d.G = i3;
                break;
            case 3:
                j.d.H = i3;
                break;
            case 4:
                j.d.I = i3;
                break;
            case 5:
                j.d.L = i3;
                break;
            case 6:
                j.d.K = i3;
                break;
            case 7:
                j.d.J = i3;
                break;
            default:
                a70.p("unknown constraint");
                break;
        }
    }

    public final void s(int i) {
        j(i).d.x = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }
}
