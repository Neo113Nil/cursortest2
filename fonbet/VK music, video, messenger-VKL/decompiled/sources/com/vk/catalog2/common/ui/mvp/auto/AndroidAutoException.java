package com.vk.catalog2.common.ui.mvp.auto;

import android.content.Context;
import com.ironsource.C4217a2;
import com.vkontakte.android.R;

/* compiled from: AndroidAutoException.kt */
/* loaded from: classes16.dex */
public final class AndroidAutoException extends Exception {
    public static final /* synthetic */ int b = 0;
    private final String codeName;
    private final String msg;

    /* compiled from: AndroidAutoException.kt */
    public static final class a {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
         */
        public static AndroidAutoException a(Context context, String str) {
            switch (str.hashCode()) {
                case 270940796:
                    if (str.equals(C4217a2.e)) {
                        return new AndroidAutoException(str, context.getString(R.string.android_auto_is_disabled));
                    }
                    break;
                case 620910836:
                    if (str.equals("unauthorized")) {
                        return new AndroidAutoException(str, context.getString(R.string.access_error));
                    }
                    break;
                case 1040171844:
                    if (str.equals("background_exceeded")) {
                        return new AndroidAutoException(str, context.getString(R.string.music_new_pause_alert_text));
                    }
                    break;
                case 1366455526:
                    if (str.equals("net_error")) {
                        return new AndroidAutoException(str, context.getString(R.string.android_auto_network_error));
                    }
                    break;
            }
            return new AndroidAutoException(str, context.getString(R.string.error));
        }
    }

    public AndroidAutoException(String str, String str2) {
        super(str2, null);
        this.codeName = str;
        this.msg = str2;
    }

    public final String d() {
        return this.codeName;
    }
}
