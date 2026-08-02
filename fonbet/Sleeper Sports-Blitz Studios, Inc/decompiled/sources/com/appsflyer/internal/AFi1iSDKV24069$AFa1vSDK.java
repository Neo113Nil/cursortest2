package com.appsflyer.internal;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AFi1iSDKV24069$AFa1vSDK implements OnCompleteListener<IntegrityTokenResponse> {
    private final long getCurrencyIso4217Code;
    private /* synthetic */ AFi1jSDK getMonetizationNetwork;

    public AFi1iSDKV24069$AFa1vSDK(AFi1jSDK aFi1jSDK, long j) {
        this.getMonetizationNetwork = aFi1jSDK;
        this.getCurrencyIso4217Code = j;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task<IntegrityTokenResponse> task) {
        Object invoke;
        String str;
        Intrinsics.checkNotNullParameter(task, "");
        if (task.isSuccessful()) {
            str = task.getResult().token();
            invoke = null;
        } else {
            try {
                Object[] objArr = {this.getMonetizationNetwork, task.getException()};
                Object obj = AFi1fSDK.registerClient.get(1922014885);
                if (obj == null) {
                    obj = ((Class) AFi1fSDK.AFAdRevenueData(TextUtils.getOffsetBefore("", 0) + 37, TextUtils.getTrimmedLength(""), (char) KeyEvent.normalizeMetaState(0))).getMethod("getCurrencyIso4217Code", (Class) AFi1fSDK.AFAdRevenueData(TextUtils.getOffsetBefore("", 0) + 37, Color.red(0), (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))), Exception.class);
                    AFi1fSDK.registerClient.put(1922014885, obj);
                }
                invoke = ((Method) obj).invoke(null, objArr);
                str = null;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        Object[] objArr2 = {this.getMonetizationNetwork, Long.valueOf(this.getCurrencyIso4217Code), str, invoke};
        Object obj2 = AFi1fSDK.registerClient.get(-2144609941);
        if (obj2 == null) {
            obj2 = ((Class) AFi1fSDK.AFAdRevenueData(37 - (ViewConfiguration.getEdgeSlop() >> 16), ExpandableListView.getPackedPositionType(0L), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1))).getMethod("getMonetizationNetwork", (Class) AFi1fSDK.AFAdRevenueData(37 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.indexOf("", ""), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1)), Long.TYPE, String.class, String.class);
            AFi1fSDK.registerClient.put(-2144609941, obj2);
        }
        ((Method) obj2).invoke(null, objArr2);
        Object[] objArr3 = {this.getMonetizationNetwork};
        Object obj3 = AFi1fSDK.registerClient.get(770083426);
        if (obj3 == null) {
            obj3 = ((Class) AFi1fSDK.AFAdRevenueData(37 - TextUtils.indexOf("", "", 0, 0), Process.getGidForName("") + 1, (char) View.getDefaultSize(0, 0))).getMethod("getMediationNetwork", (Class) AFi1fSDK.AFAdRevenueData(37 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), Gravity.getAbsoluteGravity(0, 0), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16)));
            AFi1fSDK.registerClient.put(770083426, obj3);
        }
        ((CountDownLatch) ((Method) obj3).invoke(null, objArr3)).countDown();
    }
}
