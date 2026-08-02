package com.vk.im.popup;

import android.graphics.drawable.Drawable;
import com.vk.core.ui.utils.ItemType;
import com.vk.im.popup.a;
import com.vk.im.popup.b;
import java.util.ArrayList;
import java.util.List;
import xsna.brj0;
import xsna.c5g;
import xsna.cpj0;
import xsna.e43;
import xsna.lwb0;

/* compiled from: PopupVcImpl.kt */
/* loaded from: classes2.dex */
public final class c implements a.b<Object> {
    public final /* synthetic */ b.c a;

    public c(b.c cVar) {
        this.a = cVar;
    }

    @Override // com.vk.im.popup.a.b
    public final void setItems(List<lwb0<Object>> list) {
        List<lwb0<Object>> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            lwb0 lwb0Var = (lwb0) obj;
            int i3 = lwb0Var.e;
            Drawable drawable = lwb0Var.c;
            int i4 = lwb0Var.b;
            CharSequence charSequence = lwb0Var.a;
            boolean z = lwb0Var.g;
            Integer num = lwb0Var.d;
            cpj0 cpj0Var = lwb0Var.h;
            arrayList.add(new brj0(i, i3, drawable, i4, charSequence, z, false, cpj0Var != null ? ItemType.CUSTOM : lwb0Var.k ? ItemType.TITLE : lwb0Var.j ? ItemType.DEFAULT_WITH_CHECK : ItemType.DEFAULT, 0, num, null, cpj0Var, null, lwb0Var, 55968));
            i = i2;
        }
        b.c cVar = this.a;
        cVar.c = arrayList;
        cVar.notifyDataSetChanged();
    }
}
