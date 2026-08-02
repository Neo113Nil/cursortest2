package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.Window;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ds8 extends Dialog {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ds8(Context context) {
        super(context);
        context.getClass();
        Window window = getWindow();
        if (window != null) {
            window.requestFeature(1);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawable(new ColorDrawable(0));
        }
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        setContentView(LayoutInflater.from(context).inflate(R.layout.fantasy_loading_dialog, (ViewGroup) null, false));
    }
}
