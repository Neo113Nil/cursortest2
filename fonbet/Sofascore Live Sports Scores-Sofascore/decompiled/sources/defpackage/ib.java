package defpackage;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ib extends View {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ib(Context context, int i) {
        super(context);
        this.a = i;
    }

    @Override // android.view.View
    public int getWindowSystemUiVisibility() {
        switch (this.a) {
            case 0:
                return 0;
            default:
                return super.getWindowSystemUiVisibility();
        }
    }
}
