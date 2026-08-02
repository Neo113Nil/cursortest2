package androidx.legacy.content;

import android.content.BroadcastReceiver;
import android.os.PowerManager;
import android.util.SparseArray;

@Deprecated
/* loaded from: classes12.dex */
public abstract class WakefulBroadcastReceiver extends BroadcastReceiver {
    public static final SparseArray<PowerManager.WakeLock> a = new SparseArray<>();
    public static int b = 1;
}
