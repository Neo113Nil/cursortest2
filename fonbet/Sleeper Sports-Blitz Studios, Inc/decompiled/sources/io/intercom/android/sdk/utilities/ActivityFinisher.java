package io.intercom.android.sdk.utilities;

import android.app.Activity;
import androidx.collection.ArraySet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes9.dex */
public class ActivityFinisher {
    private final Set<Activity> activities = new ArraySet();

    public void register(Activity activity) {
        this.activities.add(activity);
    }

    public void unregister(Activity activity) {
        this.activities.remove(activity);
    }

    public void finishActivities() {
        Iterator<Activity> it = this.activities.iterator();
        while (it.hasNext()) {
            it.next().finish();
        }
        this.activities.clear();
    }
}
