package androidx.core.app;

import android.os.Bundle;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import xsna.kvf0;

/* compiled from: NotificationCompatJellybean.java */
/* loaded from: classes11.dex */
public final class b {
    public static kvf0[] a(Bundle[] bundleArr) {
        if (bundleArr == null) {
            return null;
        }
        kvf0[] kvf0VarArr = new kvf0[bundleArr.length];
        for (int i = 0; i < bundleArr.length; i++) {
            Bundle bundle = bundleArr[i];
            ArrayList<String> stringArrayList = bundle.getStringArrayList("allowedDataTypes");
            HashSet hashSet = new HashSet();
            if (stringArrayList != null) {
                Iterator<String> it = stringArrayList.iterator();
                while (it.hasNext()) {
                    hashSet.add(it.next());
                }
            }
            kvf0VarArr[i] = new kvf0(bundle.getString("resultKey"), bundle.getCharSequence("label"), bundle.getCharSequenceArray("choices"), bundle.getBoolean("allowFreeFormInput"), 0, bundle.getBundle(HandleInvocationsFromAdViewer.KEY_EXTRAS), hashSet);
        }
        return kvf0VarArr;
    }
}
