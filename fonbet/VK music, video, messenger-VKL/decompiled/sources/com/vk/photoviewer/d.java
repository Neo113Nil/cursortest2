package com.vk.photoviewer;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.ggs;
import xsna.j5g;

/* compiled from: PhotoViewer.kt */
/* loaded from: classes3.dex */
public final class d {
    public final /* synthetic */ PhotoViewer a;

    public d(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    public final ArrayList a() {
        List<View> list;
        PhotoViewer photoViewer = this.a;
        ArrayList arrayList = photoViewer.J;
        ggs ggsVar = photoViewer.q.k.get(photoViewer.r);
        if (ggsVar == null || (list = ggsVar.getViewsForFade()) == null) {
            list = EmptyList.b;
        }
        return j5g.u0(list, arrayList);
    }

    public final ArrayList b() {
        PhotoViewer photoViewer = this.a;
        return j5g.v0(photoViewer.I, photoViewer.q.b(photoViewer.r));
    }
}
