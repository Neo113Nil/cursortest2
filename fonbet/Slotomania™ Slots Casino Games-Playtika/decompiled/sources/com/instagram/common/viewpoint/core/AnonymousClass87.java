package com.instagram.common.viewpoint.core;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.io.encoding.Base64;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.87, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class AnonymousClass87 extends AbstractC1899kH {
    public static byte[] A04;
    public static String[] A05 = {"b4EbQiKGBOPn48tIsiPL5n4N5SxNZ1EN", "C4qAvqPXqcx1", "av0PnThHX1ufh2ncI3f6iPLWfGZcgSDj", "l1hdtvJdt41N", "aFghpyqA523JYmrsO", "P4eeegJbz09MXnMZrJhy5IVHeFKKR7Ef", "fwPno9KqPJ0g1dx57vycq8IipA21WGGJ", "Ava7qu9S1KN"};
    public static final String A06;
    public XS A00;
    public final Uri A01;
    public final C0959Ng A02;
    public final Map<String, String> A03;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 41);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final List<Intent> A06() {
        List<C0952My> A052 = A05();
        ArrayList arrayList = new ArrayList();
        if (A052 != null) {
            Iterator<C0952My> it = A052.iterator();
            while (it.hasNext()) {
                Intent A00 = A00(it.next());
                if (A00 != null) {
                    arrayList.add(A00);
                }
            }
        }
        return arrayList;
    }

    public static void A07() {
        A04 = new byte[]{88, 111, 111, 114, 111, Base64.padSymbol, 109, 124, 111, 110, 116, 115, 122, Base64.padSymbol, 124, 109, 109, 110, 116, 105, 120, 66, 121, 124, 105, 124, 51, Ascii.DC4, Ascii.FS, Ascii.EM, Ascii.DLE, 17, 85, 1, Ascii.SUB, 85, Ascii.SUB, 5, Ascii.DLE, Ascii.ESC, 85, Ascii.CAN, Ascii.DC4, 7, Ascii.RS, Ascii.DLE, 1, 85, 0, 7, Ascii.EM, 79, 85, 51, 53, 8, 7, Ascii.CR, Ascii.ESC, 6, 0, Ascii.CR, 63, 48, 58, 44, 49, 55, 58, 112, 55, 48, 42, 59, 48, 42, 112, 63, Base64.padSymbol, 42, 55, 49, 48, 112, Ascii.SUB, Ascii.ETB, Ascii.US, Ascii.DC2, 5, 10, 0, Ascii.SYN, Ascii.VT, Ascii.CR, 0, 74, Ascii.CR, 10, Ascii.DLE, 1, 10, Ascii.DLE, 74, 5, 7, Ascii.DLE, Ascii.CR, Ascii.VT, 10, 74, 50, 45, 33, 51, 34, 51, 51, 48, 42, 55, 38, Ascii.FS, 39, 34, 55, 34, 65, 77, 94, 71, 73, 88, Ascii.SYN, 3, 3, 72, 73, 88, 77, 69, SignedBytes.MAX_POWER_OF_TWO, 95, 19, 69, 72, 17, 9, 95, Ascii.ESC, 4, 17, Ascii.SUB, 17, Ascii.DLE, 43, Ascii.DLE, 17, 17, 4, Ascii.CAN, Ascii.GS, Ascii.SUB, Ascii.US, 125, 98, 119, 124, 119, 118, 77, 97, 102, 125, 96, 119, 77, 116, 115, 126, 126, 112, 115, 113, 121, 77, 103, 96, 126, 123, 100, 113, 122, 113, 112, 75, 103, 96, 123, 102, 113, 75, 97, 102, 120, 100, 117, 102, 103, 125, 122, 115, 81, 86, 77, 80, 71, 125, 75, 70, 56, 63, 36, 57, 46, Ascii.DC4, 62, 57, 39, 81, 86, 77, 80, 71, 125, 87, 80, 78, 125, 85, 71, SignedBytes.MAX_POWER_OF_TWO, 125, 68, 67, 78, 78, SignedBytes.MAX_POWER_OF_TWO, 67, 65, 73, 59, 42, 35, 117, Ascii.ETB, 6, Ascii.SI, 19, 17, Ascii.FF, Ascii.SO, 19, Ascii.ETB, 89};
    }

    static {
        A07();
        A06 = AnonymousClass87.class.getSimpleName();
    }

    public AnonymousClass87(C1695gi c1695gi, VA va, String str, Uri uri, Map<String, String> extraData, N0 n0, boolean z, C0959Ng c0959Ng) {
        super(c1695gi, va, str, n0, z);
        this.A01 = uri;
        this.A03 = extraData;
        this.A02 = c0959Ng;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        if (r3.startsWith(r0) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Intent A00(C0952My c0952My) {
        if (TextUtils.isEmpty(c0952My.A05())) {
            return null;
        }
        String A03 = c0952My.A03();
        C1695gi c1695gi = ((AbstractC0947Mt) this).A01;
        String appLinkUri = c0952My.A05();
        if (!AbstractC1211Xi.A04(c1695gi, appLinkUri)) {
            C1695gi c1695gi2 = ((AbstractC0947Mt) this).A01;
            if (A05[6].charAt(8) != 'P') {
                throw new RuntimeException();
            }
            A05[5] = "ldjYBpnAKJ5YKanQesg35Gt0OkPWSzAG";
            if (!A09(c1695gi2, A03)) {
                return null;
            }
        }
        if (!TextUtils.isEmpty(A03)) {
            String appLinkUri2 = A04(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 4, 102);
            if (!A03.startsWith(appLinkUri2)) {
                String appLinkUri3 = A04(254, 10, 74);
            }
            return new Intent(A04(62, 26, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE), XB.A00(A03));
        }
        PackageManager packageManager = ((AbstractC0947Mt) this).A01.getPackageManager();
        if (packageManager == null) {
            return null;
        }
        String appLinkUri4 = c0952My.A04();
        if (TextUtils.isEmpty(appLinkUri4)) {
            boolean isEmpty = TextUtils.isEmpty(A03);
            String[] strArr = A05;
            String str = strArr[7];
            String appLinkUri5 = strArr[1];
            if (str.length() == appLinkUri5.length()) {
                throw new RuntimeException();
            }
            A05[2] = "P0UyeT8Oj9P4H3GWuZ6UwWdLOtPXQiGU";
            if (isEmpty) {
                String appLinkUri6 = c0952My.A05();
                return packageManager.getLaunchIntentForPackage(appLinkUri6);
            }
        }
        Intent A01 = A01(c0952My);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(A01, 65536);
        if (A01.getComponent() == null) {
            Iterator<ResolveInfo> it = queryIntentActivities.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ResolveInfo next = it.next();
                String str2 = next.activityInfo.packageName;
                String A052 = c0952My.A05();
                if (A05[0].charAt(20) != '5') {
                    throw new RuntimeException();
                }
                A05[5] = "zQ3PtZjh8GquAUsdZUz15LBCi8uwCZq5";
                if (str2.equals(A052)) {
                    A01.setComponent(new ComponentName(next.activityInfo.packageName, next.activityInfo.name));
                    break;
                }
            }
        }
        if (queryIntentActivities.isEmpty() || A01.getComponent() == null) {
            if (!A09(((AbstractC0947Mt) this).A01, A03)) {
                return null;
            }
            String appLinkUri7 = c0952My.A05();
            A01.setPackage(appLinkUri7);
        }
        return A01;
    }

    private Intent A01(C0952My c0952My) {
        Intent intent = new Intent(A04(88, 26, 77));
        intent.addFlags(268435456);
        if (!TextUtils.isEmpty(c0952My.A05()) && !TextUtils.isEmpty(c0952My.A04())) {
            intent.setComponent(new ComponentName(c0952My.A05(), c0952My.A04()));
        }
        if (!TextUtils.isEmpty(c0952My.A03())) {
            intent.setData(XB.A00(c0952My.A03()));
        }
        return intent;
    }

    private final Uri A02() {
        String queryParameter = this.A01.getQueryParameter(A04(Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, 9, 98));
        if (!TextUtils.isEmpty(queryParameter)) {
            return XB.A00(queryParameter);
        }
        Uri uri = this.A01;
        String storeUrl = A04(211, 8, 11);
        String storeId = uri.getQueryParameter(storeUrl);
        Locale locale = Locale.US;
        Object[] objArr = {storeId};
        String storeUrl2 = A04(126, 22, 5);
        return XB.A00(String.format(locale, storeUrl2, objArr));
    }

    private EnumC0944Mq A03() throws C1197Ws {
        X6 x6 = new X6();
        try {
            return X6.A06(x6, ((AbstractC0947Mt) this).A01, A02(), ((AbstractC0947Mt) this).A03, this.A03);
        } catch (C1197Ws unused) {
            String str = A04(26, 27, 92) + this.A01.toString();
            String queryParameter = this.A01.getQueryParameter(A04(228, 22, 11));
            if (queryParameter != null && queryParameter.length() > 0) {
                X6.A0E(x6, ((AbstractC0947Mt) this).A01, XB.A00(queryParameter), ((AbstractC0947Mt) this).A03);
            }
            return EnumC0944Mq.A09;
        }
    }

    private List<C0952My> A05() {
        String queryParameter = this.A01.getQueryParameter(A04(114, 12, 106));
        if (TextUtils.isEmpty(queryParameter)) {
            return null;
        }
        String appsiteDataString = A04(53, 2, 65);
        if (appsiteDataString.equals(queryParameter)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(queryParameter);
            String appsiteDataString2 = A04(55, 7, 64);
            JSONArray optJSONArray = jSONObject.optJSONArray(appsiteDataString2);
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    C0952My A00 = C0952My.A00(optJSONArray.optJSONObject(i));
                    if (A00 != null) {
                        arrayList.add(A00);
                    }
                }
            }
        } catch (JSONException e) {
            InterfaceC1106Tc A08 = ((AbstractC0947Mt) this).A01.A08();
            int i2 = AbstractC1107Td.A24;
            C1108Te c1108Te = new C1108Te(e);
            String appsiteDataString3 = A04(204, 7, 61);
            A08.ABC(appsiteDataString3, i2, c1108Te);
            String str = A06;
            String appsiteDataString4 = A04(0, 26, 52);
            Log.w(str, appsiteDataString4, e);
        }
        return arrayList;
    }

    private boolean A08() {
        List<Intent> appLaunchIntents = A06();
        if (appLaunchIntents == null) {
            return false;
        }
        Iterator<Intent> it = appLaunchIntents.iterator();
        while (it.hasNext()) {
            if (C1199Wu.A0D(((AbstractC0947Mt) this).A01, it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean A09(C1695gi c1695gi, String str) {
        return Build.VERSION.SDK_INT >= 30 && str != null && C1145Up.A29(c1695gi);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1899kH
    public final EnumC0944Mq A0H() {
        EnumC0944Mq enumC0944Mq = EnumC0944Mq.A09;
        if (((AbstractC1899kH) this).A03) {
            enumC0944Mq = A0M();
        } else {
            this.A03.put(A04(TsExtractor.TS_PACKET_SIZE, 16, 61), String.valueOf(true));
        }
        Map<String, String> map = this.A03;
        if (A05[2].charAt(5) != 'T') {
            throw new RuntimeException();
        }
        A05[4] = "kOq5WVrOOgnK8qBpA";
        A0J(map, enumC0944Mq);
        C0959Ng.A06(this.A02, ((AbstractC0947Mt) this).A01);
        return enumC0944Mq;
    }

    public final EnumC0944Mq A0M() {
        EnumC0944Mq enumC0944Mq = EnumC0944Mq.A09;
        String A042 = A04(148, 15, 93);
        boolean A0K = A0K(this.A01);
        if (!A0K) {
            A0K = A08();
        }
        if (!A0K) {
            try {
                enumC0944Mq = A03();
                if (enumC0944Mq != EnumC0944Mq.A09) {
                    A042 = A04(TsExtractor.TS_PACKET_SIZE, 16, 61);
                } else {
                    A042 = A04(163, 25, 59);
                }
            } catch (Exception unused) {
                enumC0944Mq = EnumC0944Mq.A04;
            }
        }
        Map<String, String> map = this.A03;
        String redirectionAction = String.valueOf(true);
        map.put(A042, redirectionAction);
        return enumC0944Mq;
    }

    public final void A0N(XS xs) {
        this.A00 = xs;
    }
}
