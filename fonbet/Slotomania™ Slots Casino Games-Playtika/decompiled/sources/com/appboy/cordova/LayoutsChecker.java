package com.appboy.cordova;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import com.google.android.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes7.dex */
public class LayoutsChecker {
    private static final String TAG = "LayoutsChecker";

    static void check(Context context) {
        String[] strArr = {"collapsed_push_notification", "expanded_push_notification"};
        Resources resources = context.getResources();
        String packageName = context.getPackageName();
        for (int i = 0; i < 2; i++) {
            String str = strArr[i];
            if (resources.getIdentifier(str, TtmlNode.TAG_LAYOUT, packageName) == 0) {
                Log.e(TAG, "Custom layout not found: " + str);
            }
        }
    }
}
