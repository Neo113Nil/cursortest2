package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class eo4 implements oe4 {
    public final Context a;
    public final up4 b;

    public eo4(Context context, up4 up4Var) {
        this.a = context.getApplicationContext();
        this.b = up4Var;
    }

    @Override // defpackage.oe4
    public final re4 createDataSource() {
        return new go4(this.a, this.b.createDataSource());
    }

    public eo4(Context context) {
        this(context, new up4());
    }
}
