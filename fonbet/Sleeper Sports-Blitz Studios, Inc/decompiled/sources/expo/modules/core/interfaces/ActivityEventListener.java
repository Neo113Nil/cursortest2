package expo.modules.core.interfaces;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes8.dex */
public interface ActivityEventListener {
    void onActivityResult(Activity activity, int i, int i2, Intent intent);

    void onNewIntent(Intent intent);
}
