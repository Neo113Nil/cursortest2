package ii;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import hi.InterfaceC4510a;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public class d implements InterfaceC4510a {

    /* renamed from: a, reason: collision with root package name */
    public int f49151a = -1;

    @Override // hi.InterfaceC4510a
    public List a() {
        return Collections.singletonList("com.oppo.launcher");
    }

    @Override // hi.InterfaceC4510a
    public void b(Context context, ComponentName componentName, int i10) {
        if (this.f49151a == i10) {
            return;
        }
        this.f49151a = i10;
        c(context, i10);
    }

    public final void c(Context context, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i10);
        context.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String) null, bundle);
    }
}
