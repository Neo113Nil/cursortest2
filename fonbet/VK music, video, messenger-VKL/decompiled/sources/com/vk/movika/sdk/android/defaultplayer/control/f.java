package com.vk.movika.sdk.android.defaultplayer.control;

import android.content.Context;
import android.view.View;
import com.vk.movika.sdk.base.model.props.AreaProps;
import java.util.Iterator;
import xsna.brm0;
import xsna.drm0;
import xsna.j8y;
import xsna.xn8;

/* loaded from: classes3.dex */
public final class f implements a {
    public final boolean a;
    public final h b;
    public final g c;
    public com.vk.movika.sdk.android.defaultplayer.container.a d;
    public com.vk.movika.sdk.android.defaultplayer.interactive.c e;
    public final boolean f;

    public f(j8y j8yVar, Context context, com.vk.movika.sdk.base.model.g gVar, boolean z) {
        this.a = z;
        h hVar = new h(context);
        this.b = hVar;
        g gVar2 = new g(context);
        this.c = gVar2;
        this.f = true;
        String str = gVar.g;
        Object obj = null;
        AreaProps areaProps = str != null ? (AreaProps) j8yVar.a(xn8.a(AreaProps.Companion.serializer()), str) : null;
        gVar2.setVisibility(8);
        hVar.setAreaProps(areaProps);
        hVar.setControlLayoutParams(gVar.e);
        hVar.setContentDescription(gVar.d);
        hVar.setFocusable(z);
        hVar.setFocusableInTouchMode(z);
        Iterator<T> it = gVar.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (brm0.w(drm0.p0(((com.vk.movika.sdk.base.model.j) next).a).toString(), "OnClick", true)) {
                obj = next;
                break;
            }
        }
        com.vk.movika.sdk.base.model.j jVar = (com.vk.movika.sdk.base.model.j) obj;
        if (jVar != null) {
            this.b.setOnClickListener(new d(0, this, jVar));
        }
        if (this.a) {
            this.b.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.vk.movika.sdk.android.defaultplayer.control.e
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z2) {
                    com.vk.movika.sdk.android.defaultplayer.interactive.c cVar;
                    if (!z2 || (cVar = f.this.e) == null) {
                        return;
                    }
                    cVar.d();
                }
            });
        }
    }

    @Override // com.vk.movika.sdk.android.defaultplayer.control.a
    public final void A0(com.vk.movika.sdk.android.defaultplayer.container.a aVar) {
        this.d = aVar;
    }

    @Override // com.vk.movika.sdk.android.defaultplayer.control.a
    public final View getView() {
        return this.b;
    }

    @Override // com.vk.movika.sdk.android.defaultplayer.control.a
    public final void q0() {
        this.b.requestFocus();
    }

    @Override // com.vk.movika.sdk.android.defaultplayer.control.a
    public final boolean r0() {
        return this.f;
    }

    @Override // com.vk.movika.sdk.android.defaultplayer.control.a
    public final boolean s0() {
        return this.a && this.b.hasFocus();
    }

    @Override // com.vk.movika.sdk.android.defaultplayer.control.a
    public final void t0(q qVar) {
        this.b.setOnTapListener(qVar);
    }

    @Override // com.vk.movika.sdk.android.defaultplayer.control.a
    public final View u0() {
        return this.c;
    }

    @Override // com.vk.movika.sdk.android.defaultplayer.control.a
    public final void w0(com.vk.movika.sdk.android.defaultplayer.interactive.c cVar) {
        this.e = cVar;
    }

    @Override // com.vk.movika.sdk.android.defaultplayer.control.a
    public final void x0(boolean z) {
        this.b.setInteractionEnabled(!z);
    }

    @Override // com.vk.movika.sdk.android.defaultplayer.control.a
    public final void y0() {
        this.b.setDrawFakeFocus(true);
    }

    @Override // com.vk.movika.sdk.android.defaultplayer.control.a
    public final void v0(long j) {
    }

    @Override // com.vk.movika.sdk.android.defaultplayer.control.a
    public final void z0(long j) {
    }
}
