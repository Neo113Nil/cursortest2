package com.applovin.impl;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class p3 extends Activity implements AppLovinCommunicatorSubscriber {
    protected List<String> communicatorTopics = new ArrayList();

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.h.a, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return getClass().getSimpleName();
    }

    protected abstract com.applovin.impl.sdk.l getSdk();

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getSdk() != null && !q7.c(getSdk())) {
            setTheme(R.style.com_applovin_mediation_MaxDebuggerActivity_Theme_Live);
        }
        g8.a(findViewById(android.R.id.content), getSdk());
        List<String> list = this.communicatorTopics;
        if (list == null || list.size() <= 0) {
            return;
        }
        AppLovinCommunicator.getInstance(this).subscribe(this, this.communicatorTopics);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        List<String> list = this.communicatorTopics;
        if (list == null || list.size() <= 0) {
            return;
        }
        AppLovinCommunicator.getInstance(this).unsubscribe(this, this.communicatorTopics);
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
    }
}
