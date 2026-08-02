package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cc6 implements yff {
    public final /* synthetic */ int a;
    public final yff b;

    public /* synthetic */ cc6(yff yffVar, int i) {
        this.a = i;
        this.b = yffVar;
    }

    @Override // defpackage.yff
    public final Object get() {
        int i = this.a;
        yff yffVar = this.b;
        switch (i) {
            case 0:
                String packageName = ((Context) yffVar.get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                yhk.s("Cannot return null from a non-@Nullable @Provides method");
                return null;
            default:
                return new ysg((Context) yffVar.get(), "com.google.android.datatransport.events", Integer.valueOf(ysg.d).intValue());
        }
    }
}
