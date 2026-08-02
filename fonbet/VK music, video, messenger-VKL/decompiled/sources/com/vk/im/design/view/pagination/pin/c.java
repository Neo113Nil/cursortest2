package com.vk.im.design.view.pagination.pin;

import android.widget.ImageView;
import com.vk.im.design.view.pagination.pin.ImPinItem;
import xsna.bcr0;
import xsna.cqf;
import xsna.m9b;
import xsna.wx3;
import xsna.x2e;

/* compiled from: ImPinAdapter.kt */
/* loaded from: classes2.dex */
public final class c extends wx3 {
    public final m9b j;
    public bcr0<? extends ImageView> k;

    public c(m9b m9bVar) {
        this.j = m9bVar;
        x0(ImPinItem.a.class, new x2e(this, 23));
        x0(ImPinItem.WithAttach.class, new cqf(this, 25));
        setHasStableIds(true);
    }
}
