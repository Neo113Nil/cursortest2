package com.appsflyer.internal;

import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
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
public final class AFi1lSDKE20415$AFa1uSDK implements OnCompleteListener<IntegrityTokenResponse> {
    private /* synthetic */ AFi1kSDK getMediationNetwork;
    private final long getMonetizationNetwork;

    public AFi1lSDKE20415$AFa1uSDK(AFi1kSDK aFi1kSDK, long j) {
        this.getMediationNetwork = aFi1kSDK;
        this.getMonetizationNetwork = j;
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
                Object[] objArr = {this.getMediationNetwork, task.getException()};
                Object obj = AFi1mSDK.d.get(733517678);
                if (obj == null) {
                    obj = ((Class) AFi1mSDK.getRevenue((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1, 37 - TextUtils.getCapsMode("", 0, 0))).getMethod("getRevenue", (Class) AFi1mSDK.getRevenue((char) (Process.getGidForName("") + 1), KeyEvent.getDeadChar(0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 36), Exception.class);
                    AFi1mSDK.d.put(733517678, obj);
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
        Object[] objArr2 = {this.getMediationNetwork, Long.valueOf(this.getMonetizationNetwork), str, invoke};
        Object obj2 = AFi1mSDK.d.get(693433496);
        if (obj2 == null) {
            obj2 = ((Class) AFi1mSDK.getRevenue((char) TextUtils.getOffsetBefore("", 0), (-1) - TextUtils.lastIndexOf("", '0', 0, 0), 38 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))).getMethod("AFAdRevenueData", (Class) AFi1mSDK.getRevenue((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 37 - View.resolveSizeAndState(0, 0, 0)), Long.TYPE, String.class, String.class);
            AFi1mSDK.d.put(693433496, obj2);
        }
        ((Method) obj2).invoke(null, objArr2);
        Object[] objArr3 = {this.getMediationNetwork};
        Object obj3 = AFi1mSDK.d.get(-1721868629);
        if (obj3 == null) {
            obj3 = ((Class) AFi1mSDK.getRevenue((char) (ViewConfiguration.getTapTimeout() >> 16), ViewConfiguration.getScrollBarSize() >> 8, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 37)).getMethod("getCurrencyIso4217Code", (Class) AFi1mSDK.getRevenue((char) View.getDefaultSize(0, 0), ExpandableListView.getPackedPositionGroup(0L), TextUtils.getOffsetBefore("", 0) + 37));
            AFi1mSDK.d.put(-1721868629, obj3);
        }
        ((CountDownLatch) ((Method) obj3).invoke(null, objArr3)).countDown();
    }
}
