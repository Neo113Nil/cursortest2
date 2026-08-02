package com.vk.attachpicker.screen;

import android.app.Activity;
import android.view.Window;
import com.vk.attachpicker.screen.i;
import com.vk.log.L;
import com.vk.photo.editor.PhotoEditorView;
import com.vkontakte.android.R;
import xsna.cvk;
import xsna.d3t;
import xsna.ea0;
import xsna.epx;
import xsna.hqu0;
import xsna.krv0;
import xsna.lht;
import xsna.m4p;
import xsna.myc0;
import xsna.p90;
import xsna.qv20;
import xsna.r4p;
import xsna.s3q0;
import xsna.t4p;
import xsna.y1q0;
import xsna.zlw;

/* compiled from: CollageEditorScreen.kt */
/* loaded from: classes15.dex */
public final class d implements m4p {
    public final /* synthetic */ com.vk.attachpicker.screen.filters.b a;
    public final /* synthetic */ f b;
    public final /* synthetic */ PhotoEditorView c;

    public d(com.vk.attachpicker.screen.filters.b bVar, f fVar, PhotoEditorView photoEditorView) {
        this.a = bVar;
        this.b = fVar;
        this.c = photoEditorView;
    }

    @Override // xsna.m4p
    public final void a(r4p r4pVar) {
        com.vk.core.view.components.spinner.c cVar;
        f fVar = this.b;
        if (fVar.q instanceof i.c) {
            L.e("CollageEditorLog", "EditorListener:onEditComplete: return cause it's rendering");
            return;
        }
        PhotoEditorView photoEditorView = this.c;
        if (!photoEditorView.o()) {
            L.e("CollageEditorLog", "EditorListener::onEditComplete: cannot render result image");
            return;
        }
        L.e("CollageEditorLog", "EditorListener::onEditComplete: start render");
        zlw zlwVar = fVar.g;
        Activity d = fVar.d();
        if (d == null || p90.e(d)) {
            return;
        }
        com.vk.core.view.components.spinner.c e = qv20.e(d, Integer.valueOf(R.string.picker_saving));
        e.setCanceledOnTouchOutside(false);
        fVar.u = e;
        ea0.a(d, new com.vk.movika.sdk.base.logic.processor.actions.i(myc0.h(fVar.n, hqu0.a(), null, new CollageEditorScreen$renderAndFinish$2(fVar, r4pVar, null), 2), 21));
        boolean a = fVar.q.a();
        fVar.q = new i.c(a, false);
        boolean z = (a && !epx.f(fVar.h, r4pVar)) || zlwVar.b == null;
        if (z && (cVar = fVar.u) != null) {
            cVar.show();
        }
        if (z) {
            photoEditorView.H();
        }
        this.a.h();
        s3q0 s3q0Var = s3q0.a;
        if (z) {
            return;
        }
        fVar.m(null, r4pVar, zlwVar.b, null);
    }

    @Override // xsna.m4p
    public final void b(boolean z) {
        f fVar = this.b;
        PhotoEditorView photoEditorView = fVar.p;
        if (photoEditorView != null) {
            photoEditorView.setVisibility(8);
        }
        if (!z) {
            c();
            return;
        }
        PhotoEditorView photoEditorView2 = fVar.p;
        if (photoEditorView2 != null) {
            photoEditorView2.q();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.m4p
    public final void c() {
        Window window;
        this.a.h();
        f fVar = this.b;
        d3t d3tVar = fVar.j;
        Integer num = fVar.r;
        if (num != null) {
            int intValue = num.intValue();
            com.vk.core.simplescreen.a c = d3tVar.c();
            if (c == null || (window = c.getWindow()) == null) {
                Activity d = fVar.d();
                window = d != null ? d.getWindow() : null;
            }
            krv0.s(window, intValue);
        }
        d3tVar.a(t4p.a.c.a);
        ((y1q0) fVar.k.getValue()).a();
        s3q0 s3q0Var = s3q0.a;
        fVar.c();
    }

    @Override // xsna.m4p
    public final void onLowMemory() {
        i.b bVar = i.b.a;
        f fVar = this.b;
        fVar.q = bVar;
        cvk.u(R.string.photo_editor_finish_due_to_low_memory_error, false);
        fVar.c();
        lht.a.a();
    }
}
