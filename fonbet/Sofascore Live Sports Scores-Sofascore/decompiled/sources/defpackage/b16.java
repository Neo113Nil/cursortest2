package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.sofascore.results.view.EventListScoreTextView;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class b16 {
    public final List a;
    public final jtg b;
    public final View c;
    public final Handler d;

    public b16(View view, List list) {
        view.getClass();
        list.getClass();
        this.a = km5.a;
        this.d = new Handler(Looper.getMainLooper());
        Context context = view.getContext();
        context.getClass();
        jtg jtgVar = new jtg(context);
        this.b = jtgVar;
        view.setBackground(jtgVar);
        this.a = list;
        this.c = view;
        if (view.isAttachedToWindow()) {
            view.addOnAttachStateChangeListener(new a16(view, 0, this));
        } else {
            a();
        }
    }

    public final void a() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((EventListScoreTextView) it.next()).b();
        }
        jtg jtgVar = this.b;
        if (jtgVar != null) {
            jtgVar.stop();
        }
        this.d.removeCallbacksAndMessages(null);
    }
}
