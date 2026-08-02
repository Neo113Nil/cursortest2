package ru.ozon.app.android.permission;

import android.app.Activity;
import androidx.core.app.b;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002¨\u0006\t"}, d2 = {"shouldShowRequestPermissionRationale", "", "activity", "Landroid/app/Activity;", "permissions", "", "", "showRequestPermissionRationale", "", "permission_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PermissionRequestKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldShowRequestPermissionRationale(Activity activity, Set<String> set, Object obj) {
        if (obj == null) {
            return false;
        }
        Set<String> set2 = set;
        if ((set2 instanceof Collection) && set2.isEmpty()) {
            return false;
        }
        Iterator<T> it = set2.iterator();
        while (it.hasNext()) {
            if (b.h(activity, (String) it.next())) {
                return true;
            }
        }
        return false;
    }
}
