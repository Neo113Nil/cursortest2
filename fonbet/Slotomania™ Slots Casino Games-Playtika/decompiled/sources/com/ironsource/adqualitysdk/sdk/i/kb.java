package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.io.encoding.Base64;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class kb {

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f2966 = 0;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f2967 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2968 = -1285892779;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2969 = -592502075;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static short[] f2970 = null;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static byte[] f2971 = {87, -20, -22, -16, -119, 72, 79, -2, Base64.padSymbol, -11, 77, -31, 67, -23, 71, 80, Ascii.CR, 56, 71, -31, 47, -12, 57, -17, Ascii.DC4, 59, 69, -13, 69, -30, Ascii.SUB, -29, Ascii.GS, 17, Ascii.SO, -101, 92, 83, Ascii.CR, 118, 77, 10, -90, Ascii.ETB, 118, 77, 19, -75, Ascii.SI, Ascii.SYN, Ascii.CR, 119, 62, -93, -76, Ascii.ETB, -49, -27, -94, -99, -1, -93, -89, -89, 91, 62, -93, -93, -101, -91, 104, 75, Ascii.VT, -89, -89, -94, -91, 99, SignedBytes.MAX_POWER_OF_TWO, -91, Ascii.SI, -94, -65, 0, 0, 0, 0, 0};

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2972 = 62;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static JSONObject m8333(String str, av avVar, boolean z, as asVar) {
        int i = 2 % 2;
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        if (z) {
            try {
                jsonObjectInit.put(m8334((short) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 40), 1285892881 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) - 60, (ViewConfiguration.getPressedStateDuration() >> 16) + 592502075, (byte) (61 - (ViewConfiguration.getScrollBarSize() >> 8))).intern(), true);
            } catch (JSONException e) {
                m.m8535(m8334((short) ((-25) - ((byte) KeyEvent.getModifierMetaStateMask())), 1285892844 - ExpandableListView.getPackedPositionGroup(0L), (-36) - View.MeasureSpec.makeMeasureSpec(0, 0), 56691 - AndroidCharacter.getMirror('0'), (byte) (ExpandableListView.getPackedPositionChild(0L) + 39)).intern(), m8334((short) ((ViewConfiguration.getScrollBarSize() >> 8) + 38), 1285892848 - (ViewConfiguration.getJumpTapTimeout() >> 16), Color.argb(0, 0, 0, 0) - 11, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 592502108, (byte) ((-57) - ExpandableListView.getPackedPositionChild(0L))).intern(), e);
            }
        }
        if (asVar.m6112()) {
            int i2 = f2966 + 39;
            f2967 = i2 % 128;
            int i3 = i2 % 2;
            jsonObjectInit.put(m8334((short) (TextUtils.indexOf("", "") + 61), (ViewConfiguration.getWindowTouchSlop() >> 8) + 1285892876, (-57) - View.MeasureSpec.getMode(0), 592502075 - TextUtils.lastIndexOf("", '0', 0, 0), (byte) (Color.blue(0) - 46)).intern(), true);
        }
        jsonObjectInit.put(m8334((short) ((-36) - KeyEvent.keyCodeFromString("")), 1285892891 - TextUtils.getTrimmedLength(""), TextUtils.indexOf("", "") - 58, 592502080 - ExpandableListView.getPackedPositionType(0L), (byte) (ExpandableListView.getPackedPositionChild(0L) - 32)).intern(), str);
        int i4 = f2967 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f2966 = i4 % 128;
        int i5 = i4 % 2;
        kj.m8425(jsonObjectInit, avVar.m6205());
        kj.m8425(jsonObjectInit, avVar.m6207());
        int i6 = f2967 + 3;
        f2966 = i6 % 128;
        if (i6 % 2 == 0) {
            return jsonObjectInit;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m8334(short s, int i, int i2, int i3, byte b) {
        String obj;
        synchronized (n.f3088) {
            StringBuilder sb = new StringBuilder();
            int i4 = f2972;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f2971;
                if (bArr != null) {
                    i5 = (byte) (bArr[f2969 + i3] + i4);
                } else {
                    i5 = (short) (f2970[f2969 + i3] + i4);
                }
            }
            if (i5 > 0) {
                n.f3090 = ((i3 + i5) - 2) + f2969 + i6;
                n.f3091 = b;
                n.f3092 = (char) (i + f2968);
                sb.append(n.f3092);
                n.f3093 = n.f3092;
                n.f3089 = 1;
                while (n.f3089 < i5) {
                    byte[] bArr2 = f2971;
                    if (bArr2 != null) {
                        int i7 = n.f3090;
                        n.f3090 = i7 - 1;
                        n.f3092 = (char) (n.f3093 + (((byte) (bArr2[i7] + s)) ^ n.f3091));
                    } else {
                        short[] sArr = f2970;
                        int i8 = n.f3090;
                        n.f3090 = i8 - 1;
                        n.f3092 = (char) (n.f3093 + (((short) (sArr[i8] + s)) ^ n.f3091));
                    }
                    sb.append(n.f3092);
                    n.f3093 = n.f3092;
                    n.f3089++;
                }
            }
            obj = sb.toString();
        }
        return obj;
    }
}
