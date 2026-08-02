package ii;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import hi.InterfaceC4510a;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public class h implements InterfaceC4510a {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f49152a = Uri.parse("content://com.android.badge/badge");

    @Override // hi.InterfaceC4510a
    public List a() {
        return Collections.singletonList("com.zui.launcher");
    }

    @Override // hi.InterfaceC4510a
    public void b(Context context, ComponentName componentName, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i10);
        context.getContentResolver().call(this.f49152a, "setAppBadgeCount", (String) null, bundle);
    }
}
