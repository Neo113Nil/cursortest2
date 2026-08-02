package defpackage;

import android.view.View;
import android.webkit.WebView;
import com.sofascore.model.mvvm.model.Event;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class eeb implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ geb b;
    public final /* synthetic */ WebView c;
    public final /* synthetic */ Event d;

    public eeb(View view, geb gebVar, WebView webView, Event event) {
        this.a = view;
        this.b = gebVar;
        this.c = webView;
        this.d = event;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getClass();
        this.a.removeOnAttachStateChangeListener(this);
        g6b t = qea.t(this.c);
        Event event = this.d;
        int id = event.getId();
        String b = ceb.b(event);
        geb gebVar = this.b;
        zsk zskVar = gebVar.i;
        if (zskVar == null && t != null) {
            zskVar = new zsk(t, 30);
            gebVar.i = zskVar;
        }
        if (zskVar != null) {
            zskVar.b(gebVar, new hp5(gebVar, id, b), null);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getClass();
    }
}
