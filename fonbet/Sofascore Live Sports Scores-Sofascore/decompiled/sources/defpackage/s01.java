package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import com.sofascore.results.R;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class s01 extends xm {
    public static final /* synthetic */ int i = 0;
    public final KClass h;

    public s01(Context context, KClass kClass) {
        super(context, R.style.RedesignDialog);
        this.h = kClass;
    }

    @Override // android.app.Dialog
    public final void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        super.setOnDismissListener(new vn(1, onDismissListener, this));
    }
}
