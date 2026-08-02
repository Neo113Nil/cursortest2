package ii;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import hi.InterfaceC4510a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class g implements InterfaceC4510a {
    @Override // hi.InterfaceC4510a
    public List a() {
        return new ArrayList(0);
    }

    @Override // hi.InterfaceC4510a
    public void b(Context context, ComponentName componentName, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i10);
        bundle.putString("app_badge_component_name", componentName.flattenToString());
        context.getContentResolver().call(Uri.parse("content://com.android.launcher3.cornermark.unreadbadge"), "setAppUnreadCount", (String) null, bundle);
    }
}
