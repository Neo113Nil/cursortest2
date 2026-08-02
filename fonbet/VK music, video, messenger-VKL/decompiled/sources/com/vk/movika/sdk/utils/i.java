package com.vk.movika.sdk.utils;

import java.util.ArrayList;
import java.util.HashMap;
import xsna.e43;

/* loaded from: classes3.dex */
public final class i<K, E> {
    public final HashMap<K, E> a = new HashMap<>();
    public final ArrayList b = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(K k) {
        int indexOf;
        ArrayList arrayList = this.b;
        if (!arrayList.contains(k) || (indexOf = arrayList.indexOf(k)) < 0 || indexOf > e43.h(arrayList) || e43.h(arrayList) < 0) {
            return;
        }
        arrayList.add(0, arrayList.remove(indexOf));
    }
}
