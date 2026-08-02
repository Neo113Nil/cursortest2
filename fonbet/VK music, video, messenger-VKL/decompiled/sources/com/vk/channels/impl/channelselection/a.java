package com.vk.channels.impl.channelselection;

import com.vk.im.engine.models.groups.Group;
import java.util.ArrayList;
import java.util.Comparator;
import xsna.jw5;

/* compiled from: Comparisons.kt */
/* loaded from: classes16.dex */
public final class a<T> implements Comparator {
    public final /* synthetic */ ArrayList b;

    public a(ArrayList arrayList) {
        this.b = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        Long valueOf = Long.valueOf(((Group) t2).G3());
        ArrayList arrayList = this.b;
        return jw5.b(Boolean.valueOf(arrayList.contains(valueOf)), Boolean.valueOf(arrayList.contains(Long.valueOf(((Group) t).G3()))));
    }
}
