package Tb;

import android.view.View;
import android.widget.LinearLayout;
import com.henninghall.date_picker.k;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final LinearLayout f11397a;

    public b(View view) {
        LinearLayout linearLayout = (LinearLayout) view.findViewById(k.f38579h);
        this.f11397a = linearLayout;
        linearLayout.setWillNotDraw(false);
    }

    public void a(View view) {
        this.f11397a.addView(view);
    }

    public void b() {
        this.f11397a.removeAllViews();
    }
}
