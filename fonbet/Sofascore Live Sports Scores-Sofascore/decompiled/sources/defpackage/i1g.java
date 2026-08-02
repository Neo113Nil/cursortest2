package defpackage;

import android.content.ContextWrapper;
import android.content.res.Resources;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class i1g extends ContextWrapper {
    public static final /* synthetic */ int b = 0;
    public Resources a;

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        Resources resources = this.a;
        if (resources != null) {
            return resources;
        }
        Resources resources2 = getBaseContext().getResources();
        resources2.getClass();
        return resources2;
    }
}
