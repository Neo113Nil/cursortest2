package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class z6 {
    public final Context a;
    public final int b;
    public final int c;
    public PopupWindow d;
    public final mqi e;

    public z6(Context context) {
        context.getClass();
        this.a = context;
        this.b = context.getResources().getDimensionPixelSize(R.dimen.main_list_popup_spacing);
        this.c = context.getResources().getDimensionPixelSize(R.dimen.main_list_popup_elevation);
        this.e = ypa.b(new z0(this, 1));
    }

    public final LayoutInflater a() {
        Object value = this.e.getValue();
        value.getClass();
        return (LayoutInflater) value;
    }

    public final void b(View view, PopupWindow popupWindow) {
        view.getClass();
        popupWindow.getClass();
        popupWindow.setBackgroundDrawable(new BitmapDrawable((Resources) null, ""));
        popupWindow.setOutsideTouchable(true);
        popupWindow.setFocusable(true);
        popupWindow.setAnimationStyle(android.R.style.Animation.Dialog);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        popupWindow.showAtLocation(view, 0, iArr[0], (view.getHeight() + iArr[1]) - this.b);
    }
}
