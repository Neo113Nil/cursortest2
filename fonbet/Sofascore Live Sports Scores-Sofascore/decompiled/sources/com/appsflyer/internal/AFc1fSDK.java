package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.PointF;
import android.hardware.SensorManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.LogTag;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFc1fSDK extends HashMap<String, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] AFKeystoreWrapper = null;
    private static int d = 0;
    private static int registerClient = 0;
    private static int w = 1;
    private final Map<String, Object> AFLogger;
    private final Context unregisterClient;

    static {
        unregisterClient();
        ExpandableListView.getPackedPositionForChild(0, 0);
        ViewConfiguration.getScrollBarSize();
        ViewConfiguration.getScrollBarFadeDuration();
        Process.getGidForName("");
        Gravity.getAbsoluteGravity(0, 0);
        KeyEvent.keyCodeFromString("");
        View.MeasureSpec.getMode(0);
        Process.myTid();
        ViewConfiguration.getScrollDefaultDelay();
        TextUtils.getTrimmedLength("");
        AudioTrack.getMinVolume();
        KeyEvent.keyCodeFromString("");
        w = (registerClient + 113) % 128;
    }

    public AFc1fSDK(Map<String, Object> map, Context context) {
        this.AFLogger = map;
        this.unregisterClient = context;
        put(registerClient(), AFKeystoreWrapper());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(23:0|1|2|3|4|(2:5|6)|7|8|9|10|11|(6:12|13|14|(2:62|63)|16|17)|(11:19|(2:21|(2:23|24))(1:55)|25|(4:28|(2:30|31)(3:33|34|35)|32|26)|36|37|(3:39|(3:41|42|43)(1:45)|44)|46|47|48|(1:50)(1:52))(1:57)|54|25|(1:26)|36|37|(0)|46|47|48|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0224, code lost:
    
        if (r0.contains(((java.lang.String) r8[0]).intern()) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x034c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0318 A[Catch: Exception -> 0x020a, TRY_LEAVE, TryCatch #2 {Exception -> 0x020a, blocks: (B:21:0x01f2, B:25:0x022d, B:26:0x02e0, B:30:0x02ee, B:33:0x02fc, B:37:0x030f, B:39:0x0318, B:42:0x032c, B:44:0x0332, B:47:0x0338, B:55:0x020f), top: B:17:0x01db }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x03e1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r18v6, types: [int] */
    /* JADX WARN: Type inference failed for: r18v8, types: [int] */
    /* JADX WARN: Type inference failed for: r19v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r19v7, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String AFKeystoreWrapper() {
        long j;
        String obj;
        String str;
        Throwable th;
        int i;
        Exception exc;
        int i2;
        Throwable th2;
        String obj2;
        Throwable th3;
        int i3;
        Intent registerReceiver;
        int i4;
        String str2;
        Throwable th4;
        int i5;
        int i6;
        byte[] bytes;
        int i7;
        Map<String, Object> map;
        try {
            map = this.AFLogger;
            j = 0;
        } catch (Exception e) {
            e = e;
            j = 0;
        }
        try {
            Object[] objArr = new Object[1];
            a(new int[]{0, 12, 0, 0}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001", false, objArr);
            String obj3 = map.get(((String) objArr[0]).intern()).toString();
            Map<String, Object> map2 = this.AFLogger;
            Object[] objArr2 = new Object[1];
            b((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 14, "\u000e￦\ufffb\u000f\b�\u0002\uffde\ufffb\u000e\uffff\u0000\u0003\f\r", false, TextUtils.lastIndexOf("", '0') + 12, 243 - (ViewConfiguration.getTapTimeout() >> 16), objArr2);
            String obj4 = map2.get(((String) objArr2[0]).intern()).toString();
            Object[] objArr3 = new Object[1];
            b(5 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "\u0000\ufffe\u0007\u0000\ufffe", true, TextUtils.getOffsetBefore("", 0) + 3, 190 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr3);
            String intern = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            a(new int[]{57, 5, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, 0}, "\u0000\u0000\u0001\u0001\u0001", true, objArr4);
            String replaceAll = intern.replaceAll(((String) objArr4[0]).intern(), "");
            StringBuilder sb = new StringBuilder();
            sb.append(obj3);
            sb.append(obj4);
            sb.append(replaceAll);
            obj = AFj1xSDK.AFLogger(sb.toString()).substring(0, 16);
        } catch (Exception e2) {
            e = e2;
            Exception exc2 = e;
            AFLogger aFLogger = AFLogger.INSTANCE;
            LogTag logTag = LogTag.SECURITY;
            Object[] objArr5 = new Object[1];
            a(new int[]{62, 43, 0, 24}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001", true, objArr5);
            aFLogger.e(logTag, ((String) objArr5[0]).intern(), exc2, false, false);
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr6 = new Object[1];
            b((ViewConfiguration.getTouchSlop() >> 8) + 49, "\t\f\u0005\u0004\uffc0\u0007\u0005\u000e\u0005\u0012\u0001\u0014\t\u000e\u0007\uffc0\u0003\b\u0005\u0003\u000b\u0013\u0015\r\uffc0\u0016\u0001\f\u0015\u0005\uffc0\u0017\t\u0014\b\uffc0\u0005\u0018\u0003\u0005\u0010\u0014\t\u000f\u000eￚ\uffc0\u0006\u0001", false, MotionEvent.axisFromString("") + 48, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 237, objArr6);
            sb2.append(((String) objArr6[0]).intern());
            sb2.append(exc2);
            aFLogger.v(logTag, sb2.toString());
            StringBuilder sb3 = new StringBuilder("");
            Object[] objArr7 = new Object[1];
            a(new int[]{105, 18, 0, 7}, "\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000", false, objArr7);
            sb3.append(((String) objArr7[0]).intern());
            obj = sb3.toString();
            str = obj;
            Context context = this.unregisterClient;
            ?? keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 37;
            ?? r19 = "￬\ufff9\u0000\u0006￪\uffef￨\ufff5￮￬￫\b\u0015\u000b\u0019\u0016\u0010\u000bￕ\u0010\u0015\u001b\f\u0015\u001bￕ\b\n\u001b\u0010\u0016\u0015ￕ￩￨\ufffb\ufffb";
            Object[] objArr8 = new Object[1];
            b(keyRepeatDelay, "￬\ufff9\u0000\u0006￪\uffef￨\ufff5￮￬￫\b\u0015\u000b\u0019\u0016\u0010\u000bￕ\u0010\u0015\u001b\f\u0015\u001bￕ\b\n\u001b\u0010\u0016\u0015ￕ￩￨\ufffb\ufffb", false, 11 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 230 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr8);
            registerReceiver = context.registerReceiver(null, new IntentFilter(((String) objArr8[0]).intern()));
            i4 = -2700;
            th = keyRepeatDelay;
            i = r19;
            if (registerReceiver != null) {
            }
            str2 = this.unregisterClient.getApplicationInfo().nativeLibraryDir;
            try {
                if (str2 == null) {
                }
                i6 = 0;
                th = th4;
                i = i5;
                Context context2 = this.unregisterClient;
                Object[] objArr9 = new Object[1];
                a(new int[]{Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, 6, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, 0}, "\u0001\u0000\u0001\u0001\u0000\u0001", false, objArr9);
                int size = ((SensorManager) context2.getSystemService(((String) objArr9[0]).intern())).getSensorList(-1).size();
                StringBuilder sb4 = new StringBuilder();
                Object[] objArr10 = new Object[1];
                a(new int[]{Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 1, 82, 1}, "\u0000", false, objArr10);
                sb4.append(((String) objArr10[0]).intern());
                sb4.append(i4);
                Object[] objArr11 = new Object[1];
                a(new int[]{Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 2, 0, 0}, "\u0000\u0000", false, objArr11);
                sb4.append(((String) objArr11[0]).intern());
                sb4.append(i6);
                Object[] objArr12 = new Object[1];
                a(new int[]{135, 2, 0, 0}, "\u0000\u0001", false, objArr12);
                sb4.append(((String) objArr12[0]).intern());
                sb4.append(size);
                Object[] objArr13 = new Object[1];
                a(new int[]{Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 2, 0, 0}, "\u0000\u0000", false, objArr13);
                sb4.append(((String) objArr13[0]).intern());
                sb4.append(this.AFLogger.size());
                String obj5 = sb4.toString();
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                bytes = obj5.getBytes(Charset.defaultCharset());
                i7 = 0;
                while (i7 < bytes.length) {
                }
                StringBuilder sb6 = new StringBuilder();
                while (r7 < r6) {
                }
                sb5.append(sb6.toString());
                obj2 = sb5.toString();
                th3 = th;
            } catch (Exception e3) {
                e = e3;
                exc = e;
                th2 = th;
                i2 = i;
                AFLogger aFLogger2 = AFLogger.INSTANCE;
                LogTag logTag2 = LogTag.SECURITY;
                Object[] objArr14 = new Object[1];
                b(48 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), "\u0014\u000b\u0000\ufff5\uffd1\ufff5\u0013\u0004\u0006\u0012\u0006\u0000\u000b\u0005\uffbf\u0011\u000e\u0013\u0000\u000b\u0014\f\u0004\uffbf\u0006\r\b\u0013\u0000\u0011\u0004\r\u0004\u0006\uffbf\u0004\u000b\b\u0007\u0016\uffbf\u0011\u000e\u0011\u0011\u0004\uffbf\u0004", true, 9 - (ViewConfiguration.getFadingEdgeLength() >> 16), 238 - (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)), objArr14);
                aFLogger2.e(logTag2, ((String) objArr14[0]).intern(), exc, false, false);
                StringBuilder sb7 = new StringBuilder();
                Object[] objArr15 = new Object[1];
                a(new int[]{139, 49, 0, 8}, "\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001", false, objArr15);
                sb7.append(((String) objArr15[0]).intern());
                sb7.append(exc);
                aFLogger2.v(logTag2, sb7.toString());
                StringBuilder sb8 = new StringBuilder(str);
                Object[] objArr16 = new Object[1];
                a(new int[]{188, 16, 0, i2}, "\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000", true, objArr16);
                sb8.append(((String) objArr16[0]).intern());
                obj2 = sb8.toString();
                th3 = th2;
                i3 = w + 13;
                registerClient = i3 % 128;
                if (i3 % 2 != 0) {
                }
            }
            i3 = w + 13;
            registerClient = i3 % 128;
            if (i3 % 2 != 0) {
            }
        }
        str = obj;
        Context context3 = this.unregisterClient;
        ?? keyRepeatDelay2 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 37;
        ?? r192 = "￬\ufff9\u0000\u0006￪\uffef￨\ufff5￮￬￫\b\u0015\u000b\u0019\u0016\u0010\u000bￕ\u0010\u0015\u001b\f\u0015\u001bￕ\b\n\u001b\u0010\u0016\u0015ￕ￩￨\ufffb\ufffb";
        try {
            Object[] objArr82 = new Object[1];
            b(keyRepeatDelay2, "￬\ufff9\u0000\u0006￪\uffef￨\ufff5￮￬￫\b\u0015\u000b\u0019\u0016\u0010\u000bￕ\u0010\u0015\u001b\f\u0015\u001bￕ\b\n\u001b\u0010\u0016\u0015ￕ￩￨\ufffb\ufffb", false, 11 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 230 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr82);
            registerReceiver = context3.registerReceiver(null, new IntentFilter(((String) objArr82[0]).intern()));
            i4 = -2700;
            th = keyRepeatDelay2;
            i = r192;
            if (registerReceiver != null) {
                try {
                    ?? packedPositionChild = 10 - ExpandableListView.getPackedPositionChild(j);
                    Object[] objArr17 = new Object[1];
                    b(packedPositionChild, "\u0001\u0004\ufff9\u0006\ufff5\b\t\u0006\ufff9\b\ufff9", false, (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)) + 9, 249 - Color.argb(0, 0, 0, 0), objArr17);
                    i4 = registerReceiver.getIntExtra(((String) objArr17[0]).intern(), -2700);
                    th = packedPositionChild;
                    i = "\u0001\u0004\ufff9\u0006\ufff5\b\t\u0006\ufff9\b\ufff9";
                } catch (Exception e4) {
                    exc = e4;
                    th2 = null;
                    i2 = 9;
                    AFLogger aFLogger22 = AFLogger.INSTANCE;
                    LogTag logTag22 = LogTag.SECURITY;
                    Object[] objArr142 = new Object[1];
                    b(48 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), "\u0014\u000b\u0000\ufff5\uffd1\ufff5\u0013\u0004\u0006\u0012\u0006\u0000\u000b\u0005\uffbf\u0011\u000e\u0013\u0000\u000b\u0014\f\u0004\uffbf\u0006\r\b\u0013\u0000\u0011\u0004\r\u0004\u0006\uffbf\u0004\u000b\b\u0007\u0016\uffbf\u0011\u000e\u0011\u0011\u0004\uffbf\u0004", true, 9 - (ViewConfiguration.getFadingEdgeLength() >> 16), 238 - (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)), objArr142);
                    aFLogger22.e(logTag22, ((String) objArr142[0]).intern(), exc, false, false);
                    StringBuilder sb72 = new StringBuilder();
                    Object[] objArr152 = new Object[1];
                    a(new int[]{139, 49, 0, 8}, "\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001", false, objArr152);
                    sb72.append(((String) objArr152[0]).intern());
                    sb72.append(exc);
                    aFLogger22.v(logTag22, sb72.toString());
                    StringBuilder sb82 = new StringBuilder(str);
                    Object[] objArr162 = new Object[1];
                    a(new int[]{188, 16, 0, i2}, "\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000", true, objArr162);
                    sb82.append(((String) objArr162[0]).intern());
                    obj2 = sb82.toString();
                    th3 = th2;
                    i3 = w + 13;
                    registerClient = i3 % 128;
                    if (i3 % 2 != 0) {
                    }
                }
            }
            str2 = this.unregisterClient.getApplicationInfo().nativeLibraryDir;
        } catch (Exception e5) {
            e = e5;
            th = null;
            i = 9;
            exc = e;
            th2 = th;
            i2 = i;
            AFLogger aFLogger222 = AFLogger.INSTANCE;
            LogTag logTag222 = LogTag.SECURITY;
            Object[] objArr1422 = new Object[1];
            b(48 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), "\u0014\u000b\u0000\ufff5\uffd1\ufff5\u0013\u0004\u0006\u0012\u0006\u0000\u000b\u0005\uffbf\u0011\u000e\u0013\u0000\u000b\u0014\f\u0004\uffbf\u0006\r\b\u0013\u0000\u0011\u0004\r\u0004\u0006\uffbf\u0004\u000b\b\u0007\u0016\uffbf\u0011\u000e\u0011\u0011\u0004\uffbf\u0004", true, 9 - (ViewConfiguration.getFadingEdgeLength() >> 16), 238 - (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)), objArr1422);
            aFLogger222.e(logTag222, ((String) objArr1422[0]).intern(), exc, false, false);
            StringBuilder sb722 = new StringBuilder();
            Object[] objArr1522 = new Object[1];
            a(new int[]{139, 49, 0, 8}, "\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001", false, objArr1522);
            sb722.append(((String) objArr1522[0]).intern());
            sb722.append(exc);
            aFLogger222.v(logTag222, sb722.toString());
            StringBuilder sb822 = new StringBuilder(str);
            Object[] objArr1622 = new Object[1];
            a(new int[]{188, 16, 0, i2}, "\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000", true, objArr1622);
            sb822.append(((String) objArr1622[0]).intern());
            obj2 = sb822.toString();
            th3 = th2;
            i3 = w + 13;
            registerClient = i3 % 128;
            if (i3 % 2 != 0) {
            }
        }
        if (str2 == null) {
            int i8 = registerClient + 71;
            w = i8 % 128;
            Throwable th5 = null;
            int i9 = 9;
            if (i8 % 2 == 0) {
                Object[] objArr18 = new Object[1];
                a(new int[]{Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, 3, 176, 0}, "\u0000\u0000\u0000", false, objArr18);
                th4 = th5;
                i5 = i9;
                if (str2.contains(((String) objArr18[0]).intern())) {
                    i6 = 1;
                    th = th5;
                    i = i9;
                }
            } else {
                Object[] objArr19 = new Object[1];
                a(new int[]{Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, 3, 176, 0}, "\u0000\u0000\u0000", true, objArr19);
                th4 = th5;
                i5 = i9;
            }
            Context context22 = this.unregisterClient;
            Object[] objArr92 = new Object[1];
            a(new int[]{Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, 6, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, 0}, "\u0001\u0000\u0001\u0001\u0000\u0001", false, objArr92);
            int size2 = ((SensorManager) context22.getSystemService(((String) objArr92[0]).intern())).getSensorList(-1).size();
            StringBuilder sb42 = new StringBuilder();
            Object[] objArr102 = new Object[1];
            a(new int[]{Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 1, 82, 1}, "\u0000", false, objArr102);
            sb42.append(((String) objArr102[0]).intern());
            sb42.append(i4);
            Object[] objArr112 = new Object[1];
            a(new int[]{Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 2, 0, 0}, "\u0000\u0000", false, objArr112);
            sb42.append(((String) objArr112[0]).intern());
            sb42.append(i6);
            Object[] objArr122 = new Object[1];
            a(new int[]{135, 2, 0, 0}, "\u0000\u0001", false, objArr122);
            sb42.append(((String) objArr122[0]).intern());
            sb42.append(size2);
            Object[] objArr132 = new Object[1];
            a(new int[]{Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 2, 0, 0}, "\u0000\u0000", false, objArr132);
            sb42.append(((String) objArr132[0]).intern());
            sb42.append(this.AFLogger.size());
            String obj52 = sb42.toString();
            StringBuilder sb52 = new StringBuilder();
            sb52.append(str);
            bytes = obj52.getBytes(Charset.defaultCharset());
            i7 = 0;
            while (i7 < bytes.length) {
                int i10 = w;
                int i11 = i10 + 75;
                registerClient = i11 % 128;
                if (i11 % 2 != 0) {
                    bytes[i7] = (byte) (bytes[i7] ^ (103 / (i7 / 2)));
                    i7 += Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
                } else {
                    bytes[i7] = (byte) (bytes[i7] ^ ((i7 % 2) + 42));
                    i7++;
                }
                registerClient = (i10 + 45) % 128;
            }
            StringBuilder sb62 = new StringBuilder();
            for (byte b : bytes) {
                String hexString = Integer.toHexString(b);
                if (hexString.length() == 1) {
                    w = (registerClient + 47) % 128;
                    hexString = "0".concat(hexString);
                }
                sb62.append(hexString);
            }
            sb52.append(sb62.toString());
            obj2 = sb52.toString();
            th3 = th;
            i3 = w + 13;
            registerClient = i3 % 128;
            if (i3 % 2 != 0) {
                return obj2;
            }
            throw th3;
        }
        th4 = null;
        i5 = 9;
        i6 = 0;
        th = th4;
        i = i5;
        Context context222 = this.unregisterClient;
        Object[] objArr922 = new Object[1];
        a(new int[]{Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, 6, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, 0}, "\u0001\u0000\u0001\u0001\u0000\u0001", false, objArr922);
        int size22 = ((SensorManager) context222.getSystemService(((String) objArr922[0]).intern())).getSensorList(-1).size();
        StringBuilder sb422 = new StringBuilder();
        Object[] objArr1022 = new Object[1];
        a(new int[]{Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 1, 82, 1}, "\u0000", false, objArr1022);
        sb422.append(((String) objArr1022[0]).intern());
        sb422.append(i4);
        Object[] objArr1122 = new Object[1];
        a(new int[]{Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 2, 0, 0}, "\u0000\u0000", false, objArr1122);
        sb422.append(((String) objArr1122[0]).intern());
        sb422.append(i6);
        Object[] objArr1222 = new Object[1];
        a(new int[]{135, 2, 0, 0}, "\u0000\u0001", false, objArr1222);
        sb422.append(((String) objArr1222[0]).intern());
        sb422.append(size22);
        Object[] objArr1322 = new Object[1];
        a(new int[]{Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 2, 0, 0}, "\u0000\u0000", false, objArr1322);
        sb422.append(((String) objArr1322[0]).intern());
        sb422.append(this.AFLogger.size());
        String obj522 = sb422.toString();
        StringBuilder sb522 = new StringBuilder();
        sb522.append(str);
        bytes = obj522.getBytes(Charset.defaultCharset());
        i7 = 0;
        while (i7 < bytes.length) {
        }
        StringBuilder sb622 = new StringBuilder();
        while (r7 < r6) {
        }
        sb522.append(sb622.toString());
        obj2 = sb522.toString();
        th3 = th;
        i3 = w + 13;
        registerClient = i3 % 128;
        if (i3 % 2 != 0) {
        }
    }

    private static void a(int[] iArr, String str, boolean z, Object[] objArr) {
        int i;
        String str2 = str;
        byte[] bArr = str2;
        if (str2 != null) {
            $11 = ($10 + 63) % 128;
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        AFj1aSDK aFj1aSDK = new AFj1aSDK();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = AFKeystoreWrapper;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                $10 = ($11 + 65) % 128;
                cArr2[i6] = (char) (cArr[i6] ^ 1342658960629464732L);
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr2 != null) {
            char[] cArr4 = new char[i3];
            aFj1aSDK.d = 0;
            char c = 0;
            while (true) {
                int i7 = aFj1aSDK.d;
                if (i7 >= i3) {
                    break;
                }
                if (bArr2[i7] == 1) {
                    int i8 = $11 + 39;
                    $10 = i8 % 128;
                    if (i8 % 2 != 0) {
                        cArr4[i7] = (char) ((cArr3[i7] >> 3) << c);
                    } else {
                        cArr4[i7] = (char) (((cArr3[i7] * 2) + 1) - c);
                    }
                } else {
                    cArr4[i7] = (char) ((cArr3[i7] * 2) - c);
                }
                c = cArr4[i7];
                aFj1aSDK.d = i7 + 1;
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            $11 = ($10 + 81) % 128;
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i9 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i9, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i9);
        }
        if (z) {
            int i10 = $10 + 103;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            char[] cArr6 = new char[i3];
            aFj1aSDK.d = 0;
            while (true) {
                int i12 = aFj1aSDK.d;
                if (i12 >= i3) {
                    break;
                }
                cArr6[i12] = cArr3[(i3 - i12) - 1];
                aFj1aSDK.d = i12 + 1;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            aFj1aSDK.d = 0;
            while (true) {
                int i13 = aFj1aSDK.d;
                if (i13 >= i3) {
                    break;
                }
                int i14 = $10 + 103;
                $11 = i14 % 128;
                if (i14 % 2 == 0) {
                    cArr3[i13] = (char) (cArr3[i13] / iArr[5]);
                    i = i13 >> 1;
                } else {
                    cArr3[i13] = (char) (cArr3[i13] - iArr[2]);
                    i = i13 + 1;
                }
                aFj1aSDK.d = i;
            }
        }
        objArr[0] = new String(cArr3);
    }

    private static void b(int i, String str, boolean z, int i2, int i3, Object[] objArr) {
        $10 = ($11 + 75) % 128;
        char[] cArr = str;
        if (str != null) {
            char[] charArray = str.toCharArray();
            $11 = ($10 + 19) % 128;
            cArr = charArray;
        }
        char[] cArr2 = cArr;
        AFk1xSDK aFk1xSDK = new AFk1xSDK();
        char[] cArr3 = new char[i];
        aFk1xSDK.registerClient = 0;
        while (true) {
            int i4 = aFk1xSDK.registerClient;
            if (i4 >= i) {
                break;
            }
            char c = cArr2[i4];
            aFk1xSDK.AFLogger = c;
            char c2 = (char) (c + i3);
            cArr3[i4] = c2;
            cArr3[i4] = (char) (c2 - ((int) (d ^ 4325568288017157785L)));
            aFk1xSDK.registerClient = i4 + 1;
            $10 = ($11 + 17) % 128;
        }
        if (i2 > 0) {
            aFk1xSDK.d = i2;
            char[] cArr4 = new char[i];
            System.arraycopy(cArr3, 0, cArr4, 0, i);
            int i5 = aFk1xSDK.d;
            System.arraycopy(cArr4, 0, cArr3, i - i5, i5);
            int i6 = aFk1xSDK.d;
            System.arraycopy(cArr4, i6, cArr3, 0, i - i6);
        }
        if (z) {
            $10 = ($11 + 103) % 128;
            char[] cArr5 = new char[i];
            aFk1xSDK.registerClient = 0;
            while (true) {
                int i7 = aFk1xSDK.registerClient;
                if (i7 >= i) {
                    break;
                }
                $11 = ($10 + 75) % 128;
                cArr5[i7] = cArr3[(i - i7) - 1];
                aFk1xSDK.registerClient = i7 + 1;
            }
            cArr3 = cArr5;
        }
        objArr[0] = new String(cArr3);
    }

    @NonNull
    private String registerClient() {
        w = (registerClient + 29) % 128;
        try {
            String num = Integer.toString(Build.VERSION.SDK_INT);
            Map<String, Object> map = this.AFLogger;
            Object[] objArr = new Object[1];
            a(new int[]{0, 12, 0, 0}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001", false, objArr);
            String obj = map.get(((String) objArr[0]).intern()).toString();
            Map<String, Object> map2 = this.AFLogger;
            Object[] objArr2 = new Object[1];
            b((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 4, "\u0007\ufffa\u000b\ufffb�", true, 3 - ((byte) KeyEvent.getModifierMetaStateMask()), View.MeasureSpec.makeMeasureSpec(0, 0) + 244, objArr2);
            String obj2 = map2.get(((String) objArr2[0]).intern()).toString();
            if (obj2 == null) {
                Object[] objArr3 = new Object[1];
                b(8 - TextUtils.getTrimmedLength(""), "\ufff6\u0006\ufff5\u0002\ufff8\u0002\u0003\u0013", false, Color.alpha(0) + 5, View.resolveSize(0, 0) + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, objArr3);
                obj2 = ((String) objArr3[0]).intern();
            }
            StringBuilder sb = new StringBuilder(obj);
            sb.reverse();
            StringBuilder registerClient2 = registerClient(num, obj2, sb.toString());
            int length = registerClient2.length();
            if (length > 4) {
                registerClient2.delete(4, length);
            } else {
                while (length < 4) {
                    registerClient = (w + 77) % 128;
                    length++;
                    registerClient2.append('1');
                    w = (registerClient + 35) % 128;
                }
            }
            Object[] objArr4 = new Object[1];
            b((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2, "\uffff\ufffe\u0004", true, (-16777213) - Color.rgb(0, 0, 0), (-16776972) - Color.rgb(0, 0, 0), objArr4);
            registerClient2.insert(0, ((String) objArr4[0]).intern());
            return registerClient2.toString();
        } catch (Exception e) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            LogTag logTag = LogTag.SECURITY;
            Object[] objArr5 = new Object[1];
            b(30 - (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), "\u0006\u000f\u0006\b\uffc1\u0005\u0006\r\n\u0002\u0007\uffc1\u001a\u0006￬ￓ\ufff7\u0015\u0006\b\u001a\u0006\f\uffc1\b\u000f\n\u0015\u0002\u0013", true, Color.blue(0) + 20, (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 235, objArr5);
            aFLogger.e(logTag, ((String) objArr5[0]).intern(), e, false, false);
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr6 = new Object[1];
            a(new int[]{12, 38, 0, 35}, "\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000", true, objArr6);
            sb2.append(((String) objArr6[0]).intern());
            sb2.append(e);
            aFLogger.v(logTag, sb2.toString());
            Object[] objArr7 = new Object[1];
            a(new int[]{50, 7, 0, 3}, "\u0000\u0001\u0000\u0000\u0000\u0000\u0000", true, objArr7);
            return ((String) objArr7[0]).intern();
        }
    }

    public static void unregisterClient() {
        AFKeystoreWrapper = new char[]{32428, 32511, 32510, 32501, 32498, 32503, 32501, 32496, 32495, 32502, 32507, 32498, 32427, 32496, 32498, 32494, 32502, 32504, 32497, 32498, 32478, 32472, 32498, 32498, 32492, 32471, 32464, 32499, 32500, 32473, 32479, 32502, 32503, 32498, 32502, 32501, 32503, 32501, 32501, 32506, 32479, 32478, 32504, 32500, 32502, 32505, 32511, 32479, 32433, 32456, 32431, 32505, 32500, 32462, 32421, 32421, 32421, 32462, 32314, 32350, 32376, 32341, 32428, 32501, 32503, 32501, 32501, 32506, 32479, 32478, 32504, 32500, 32502, 32505, 32511, 32479, 32478, 32497, 32492, 32506, 32455, 32472, 32472, 32505, 32496, 32506, 32506, 32497, 32492, 32506, 32503, 32471, 32474, 32493, 32488, 32499, 32507, 32504, 32506, 32505, 32477, 32479, 32502, 32503, 32498, 32384, 32425, 32471, 32464, 32429, 32428, 32424, 32465, 32509, 32509, 32511, 32511, 32511, 32470, 32430, 32424, 32430, 32470, 32495, 32379, 32660, 32491, 32372, 32377, 32368, 32369, 32368, 32454, 32399, 32467, 32399, 32464, 32399, 32471, 32430, 32502, 32494, 32498, 32496, 32498, 32456, 32433, 32479, 32511, 32505, 32502, 32500, 32504, 32478, 32479, 32506, 32501, 32501, 32503, 32501, 32502, 32498, 32503, 32502, 32479, 32478, 32501, 32493, 32492, 32506, 32502, 32493, 32492, 32469, 32479, 32501, 32506, 32504, 32497, 32469, 32471, 32492, 32498, 32498, 32472, 32478, 32498, 32497, 32420, 32460, 32460, 32460, 32461, 32460, 32460, 32460, 32471, 32501, 32507, 32502, 32498, 32505, 32470, 32430};
        d = -1426780652;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:
    
        if (r5 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006d, code lost:
    
        r7 = r7 ^ r5.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0064, code lost:
    
        com.appsflyer.internal.AFc1fSDK.w = (com.appsflyer.internal.AFc1fSDK.registerClient + 113) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if (r5 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static StringBuilder registerClient(@NonNull String... strArr) throws Exception {
        int charAt;
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i = 0;
        while (i < 3) {
            arrayList.add(Integer.valueOf(strArr[i].length()));
            i++;
            registerClient = (w + 1) % 128;
        }
        Collections.sort(arrayList);
        int intValue = ((Integer) arrayList.get(0)).intValue();
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (i2 < intValue) {
            registerClient = (w + 23) % 128;
            Integer num = null;
            for (int i3 = 0; i3 < 3; i3++) {
                int i4 = registerClient + 27;
                w = i4 % 128;
                if (i4 % 2 == 0) {
                    charAt = strArr[i3].charAt(i2);
                    int i5 = 44 / 0;
                } else {
                    charAt = strArr[i3].charAt(i2);
                }
                num = Integer.valueOf(charAt);
            }
            sb.append(Integer.toHexString(num.intValue()));
            i2++;
            registerClient = (w + 67) % 128;
        }
        return sb;
    }
}
