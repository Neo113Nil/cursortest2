package com.vk.photos.root.photoflow.presentation;

import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.photos.root.photoflow.presentation.h;
import com.vk.photos.root.photoflow.presentation.l;
import java.util.ArrayList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.c5g;
import xsna.epx;
import xsna.izs;
import xsna.nzo;
import xsna.y7a0;

/* compiled from: PhotoFlowReducer.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class f extends FunctionReferenceImpl implements izs<h, l.c> {
    @Override // xsna.izs
    public final l.c invoke(h hVar) {
        ArrayList arrayList;
        h hVar2 = hVar;
        g gVar = (g) this.receiver;
        UserId userId = gVar.d;
        h.a aVar = hVar2.e;
        VKList<Photo> vKList = aVar.a;
        Integer num = null;
        if (vKList != null) {
            nzo.i(vKList, aVar.c);
        } else {
            vKList = null;
        }
        int size = vKList != null ? vKList.size() : -1;
        if (vKList != null) {
            arrayList = new ArrayList(c5g.u(vKList, 10));
            for (Photo photo : vKList) {
                arrayList.add(new y7a0(photo, hVar2.f ? Boolean.valueOf(hVar2.g.contains(Integer.valueOf(photo.c))) : null, epx.f(photo.O, Boolean.TRUE) && epx.f(photo.e, userId) && gVar.e.a(userId), photo.Ib()));
            }
        } else {
            arrayList = null;
        }
        Integer valueOf = Integer.valueOf(size);
        if (aVar.b && size > 0) {
            num = valueOf;
        }
        return new l.c(arrayList, num, aVar.d);
    }
}
