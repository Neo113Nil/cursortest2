package tvo.webrtc;

import android.content.Context;

/* loaded from: classes5.dex */
public class ApplicationContextProvider {
    @CalledByNative
    public static Context getApplicationContext() {
        return ContextUtils.getApplicationContext();
    }
}
