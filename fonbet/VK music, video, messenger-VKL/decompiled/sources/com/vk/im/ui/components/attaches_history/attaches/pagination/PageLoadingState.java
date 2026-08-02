package com.vk.im.ui.components.attaches_history.attaches.pagination;

import com.vk.core.serialize.Serializer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PageLoadingState.kt */
/* loaded from: classes2.dex */
public abstract class PageLoadingState<T> extends Serializer.StreamParcelableAdapter {
    public final List<T> b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    /* JADX WARN: Multi-variable type inference failed */
    public PageLoadingState(List<? extends T> list, boolean z, boolean z2, boolean z3) {
        this.b = list;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public static /* synthetic */ PageLoadingState Ab(PageLoadingState pageLoadingState, ArrayList arrayList, Boolean bool, Boolean bool2, Boolean bool3, int i) {
        if ((i & 1) != 0) {
            arrayList = null;
        }
        if ((i & 2) != 0) {
            bool = null;
        }
        if ((i & 4) != 0) {
            bool2 = null;
        }
        if ((i & 8) != 0) {
            bool3 = null;
        }
        return pageLoadingState.zb(arrayList, bool, bool2, bool3);
    }

    public List<T> Bb() {
        return this.b;
    }

    public boolean Cb() {
        return this.c;
    }

    public boolean Db() {
        return this.d;
    }

    public boolean Eb() {
        return this.e;
    }

    public abstract PageLoadingState<T> zb(List<?> list, Boolean bool, Boolean bool2, Boolean bool3);
}
