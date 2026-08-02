package com.vk.im.design.view.pagination.pin;

import android.widget.ImageView;
import com.vk.im.design.view.pagination.pin.ImPinItem;
import xsna.bcr0;
import xsna.c2u;
import xsna.t9w;
import xsna.wx3;
import xsna.x2y;

/* compiled from: MultiPinAdapter.kt */
/* loaded from: classes2.dex */
public final class e extends wx3 {
    public final t9w j;
    public bcr0<? extends ImageView> k;

    public e(t9w t9wVar) {
        this.j = t9wVar;
        x0(ImPinItem.a.class, new c2u(this, 18));
        x0(ImPinItem.WithAttach.class, new x2y(this, 12));
        setHasStableIds(true);
    }
}
