package com.inmobi.media;

import android.view.View;
import android.view.WindowInsets;
import com.inmobi.media.So;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class So {
    public final ArrayList a;
    public final WeakReference b;

    public So(View view) {
        view.getClass();
        this.a = new ArrayList();
        this.b = new WeakReference(view);
        F5.a.getClass();
        if (F5.w()) {
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: noh
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                    return So.a(So.this, view2, windowInsets);
                }
            });
        }
    }

    public static final WindowInsets a(So so, View view, WindowInsets windowInsets) {
        view.getClass();
        windowInsets.getClass();
        if (!so.a.isEmpty()) {
            Iterator it = so.a.iterator();
            while (it.hasNext()) {
                Wo wo = (Wo) ((Ro) it.next());
                wo.getClass();
                windowInsets.getClass();
                wo.a.a(windowInsets);
                wo.a(windowInsets);
            }
        }
        return windowInsets;
    }

    public final void a() {
        View view;
        this.a.clear();
        F5.a.getClass();
        if (!F5.w() || (view = (View) this.b.get()) == null) {
            return;
        }
        view.setOnApplyWindowInsetsListener(null);
    }
}
