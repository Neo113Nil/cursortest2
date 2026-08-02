package com.vk.stat.scheme;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.b9y;
import xsna.hay;
import xsna.tay;
import xsna.u9y;
import xsna.uay;
import xsna.vjr0;

/* compiled from: GsonCreator.kt */
/* loaded from: classes11.dex */
public final class FilteredString {
    public final List<vjr0<String>> a;
    public String b;

    /* compiled from: GsonCreator.kt */
    public static final class Serializer implements uay<FilteredString> {
        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            String str = ((FilteredString) obj).b;
            return str != null ? new hay(str) : u9y.b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FilteredString(List<? extends vjr0<String>> list) {
        this.a = list;
    }

    public final void a(String str) {
        if (str == null) {
            this.b = str;
            return;
        }
        List<vjr0<String>> list = this.a;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!((vjr0) it.next()).a(str)) {
                    return;
                }
            }
        }
        this.b = str;
    }

    public FilteredString() {
        this(EmptyList.b);
    }
}
