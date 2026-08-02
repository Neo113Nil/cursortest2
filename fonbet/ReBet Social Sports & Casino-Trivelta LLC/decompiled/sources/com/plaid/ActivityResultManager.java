package com.plaid;

import android.content.Intent;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class ActivityResultManager extends HashMap<Integer, ActivityResultHandler> {
    public void dispatch(int i10, int i11, Intent intent) {
        ActivityResultHandler activityResultHandler = get(Integer.valueOf(i10));
        if (activityResultHandler != null) {
            activityResultHandler.handleActivityResult(i10, i11, intent);
        }
    }
}
