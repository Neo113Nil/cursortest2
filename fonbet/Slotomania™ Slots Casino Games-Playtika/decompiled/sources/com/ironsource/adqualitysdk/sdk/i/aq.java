package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.i.ar;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aq extends ar.AnonymousClass5 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f365 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f367 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private final String f369;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char[] f366 = {'c', 33003, 358, 33250, 629, 33527, 876, 33779, 1106, 34007, GMTDateParser.SECONDS, 43442, 53284, 20643, 53544, 15909, 48813, 16160, 49060, 15411, 48305, 15658, 48565, 14868, 47796, 15115, 48024, 14341, 47259, 14609, 47508};

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f368 = -5238656317957373820L;

    public aq(aw awVar) {
        m6036((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (ViewConfiguration.getTouchSlop() >> 8) + 10).intern();
        this.f369 = new StringBuilder().append(m6036((char) Gravity.getAbsoluteGravity(0, 0), TextUtils.getOffsetAfter("", 0) + 10, -ExpandableListView.getPackedPositionChild(0L)).intern()).append(UUID.randomUUID().toString().replace(m6036((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 43423), View.MeasureSpec.makeMeasureSpec(0, 0) + 11, 1 - KeyEvent.getDeadChar(0, 0)).intern(), "")).toString();
        m6077(awVar);
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String m6038() {
        JSONObject m6075;
        String m6036;
        int i = 2 % 2;
        int i2 = f367 + 11;
        f365 = i2 % 128;
        if (i2 % 2 != 0) {
            m6075 = m6075();
            m6036 = m6036((char) (53326 % (ViewConfiguration.getMinimumFlingVelocity() + 6)), 4 >>> (TypedValue.complexToFloat(1) > 1.0f ? 1 : (TypedValue.complexToFloat(1) == 1.0f ? 0 : -1)), 5 % View.MeasureSpec.makeMeasureSpec(1, 1));
        } else {
            m6075 = m6075();
            m6036 = m6036((char) (53326 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 12 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), View.MeasureSpec.makeMeasureSpec(0, 0) + 3);
        }
        return m6075.optString(m6036.intern(), this.f369);
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final String m6039(String str) {
        int i = 2 % 2;
        int i2 = f365 + 37;
        f367 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            JSONObject optJSONObject = m6037().optJSONObject(str);
            if (optJSONObject == null) {
                return null;
            }
            int i3 = f367 + 35;
            f365 = i3 % 128;
            int i4 = i3 % 2;
            return optJSONObject.optString(m6036((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 15943), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15, (ViewConfiguration.getLongPressTimeout() >> 16) + 16).intern());
        }
        m6037().optJSONObject(str);
        super.hashCode();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final boolean m6040() {
        JSONObject m6075;
        char capsMode;
        int i;
        int myTid;
        int i2 = 2 % 2;
        int i3 = f365 + 77;
        f367 = i3 % 128;
        if (i3 % 2 == 0) {
            m6075 = m6075();
            capsMode = (char) TextUtils.getCapsMode("", 1, 1);
            i = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1;
            myTid = (Process.myTid() / 53) * 68;
        } else {
            m6075 = m6075();
            capsMode = (char) TextUtils.getCapsMode("", 0, 0);
            i = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1;
            myTid = 10 - (Process.myTid() >> 22);
        }
        boolean has = m6075.has(m6036(capsMode, i, myTid).intern());
        int i4 = f365 + 39;
        f367 = i4 % 128;
        int i5 = i4 % 2;
        return has;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private JSONObject m6037() {
        int i = 2 % 2;
        int i2 = f365 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f367 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject optJSONObject = m6075().optJSONObject(m6036((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), AndroidCharacter.getMirror('0') - '0', Color.red(0) + 10).intern());
        if (optJSONObject != null) {
            return optJSONObject;
        }
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        int i4 = f365 + 29;
        f367 = i4 % 128;
        int i5 = i4 % 2;
        return jsonObjectInit;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m6036(char c, int i, int i2) {
        String str;
        synchronized (c.f1197) {
            char[] cArr = new char[i2];
            c.f1198 = 0;
            while (c.f1198 < i2) {
                cArr[c.f1198] = (char) ((f366[c.f1198 + i] ^ (c.f1198 * f368)) ^ c);
                c.f1198++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
