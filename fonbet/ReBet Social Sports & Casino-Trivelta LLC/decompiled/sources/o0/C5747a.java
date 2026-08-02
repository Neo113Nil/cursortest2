package o0;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import com.facebook.react.uimanager.ViewProps;

/* renamed from: o0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5747a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f58589a;

    public C5747a(Context context) {
        this.f58589a = context;
    }

    public static C5747a b(Context context) {
        return new C5747a(context);
    }

    public Display[] a() {
        return ((DisplayManager) this.f58589a.getSystemService(ViewProps.DISPLAY)).getDisplays();
    }
}
