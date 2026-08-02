package com.vk.im.ui.components.attaches_history.attaches.model.simple;

import com.vk.core.serialize.Serializer;
import com.vk.im.ui.components.attaches_history.attaches.pagination.PageLoadingState;
import defpackage.q0;
import java.util.ArrayList;
import java.util.List;
import xsna.epx;
import xsna.qoy;

/* compiled from: SimpleAttachesState.kt */
/* loaded from: classes2.dex */
public final class SimpleAttachesState extends PageLoadingState<SimpleAttachListItem> {
    public static final Serializer.c<SimpleAttachesState> CREATOR = new a();
    public final List<SimpleAttachListItem> f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<SimpleAttachesState> {
        @Override // com.vk.core.serialize.Serializer.c
        public final SimpleAttachesState a(Serializer serializer) {
            return new SimpleAttachesState(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SimpleAttachesState[i];
        }
    }

    public SimpleAttachesState(List<SimpleAttachListItem> list, boolean z, boolean z2, boolean z3) {
        super(list, z, z2, z3);
        this.f = list;
        this.g = z;
        this.h = z2;
        this.i = z3;
    }

    public static SimpleAttachesState Fb(SimpleAttachesState simpleAttachesState, ArrayList arrayList) {
        boolean z = simpleAttachesState.g;
        boolean z2 = simpleAttachesState.h;
        boolean z3 = simpleAttachesState.i;
        simpleAttachesState.getClass();
        return new SimpleAttachesState(arrayList, z, z2, z3);
    }

    @Override // com.vk.im.ui.components.attaches_history.attaches.pagination.PageLoadingState
    public final List<SimpleAttachListItem> Bb() {
        return this.f;
    }

    @Override // com.vk.im.ui.components.attaches_history.attaches.pagination.PageLoadingState
    public final boolean Cb() {
        return this.g;
    }

    @Override // com.vk.im.ui.components.attaches_history.attaches.pagination.PageLoadingState
    public final boolean Db() {
        return this.h;
    }

    @Override // com.vk.im.ui.components.attaches_history.attaches.pagination.PageLoadingState
    public final boolean Eb() {
        return this.i;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.o0(this.f);
        serializer.L(this.g ? (byte) 1 : (byte) 0);
        serializer.L(this.h ? (byte) 1 : (byte) 0);
        serializer.L(this.i ? (byte) 1 : (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimpleAttachesState)) {
            return false;
        }
        SimpleAttachesState simpleAttachesState = (SimpleAttachesState) obj;
        return epx.f(this.f, simpleAttachesState.f) && this.g == simpleAttachesState.g && this.h == simpleAttachesState.h && this.i == simpleAttachesState.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + qoy.b(qoy.b(this.f.hashCode() * 31, 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleAttachesState(list=");
        sb.append(this.f);
        sb.append(", loading=");
        sb.append(this.g);
        sb.append(", pageLoading=");
        sb.append(this.h);
        sb.append(", refreshing=");
        return q0.a(sb, this.i, ')');
    }

    @Override // com.vk.im.ui.components.attaches_history.attaches.pagination.PageLoadingState
    public final PageLoadingState<SimpleAttachListItem> zb(List list, Boolean bool, Boolean bool2, Boolean bool3) {
        if (list == null) {
            list = null;
        }
        if (list == null) {
            list = this.f;
        }
        return new SimpleAttachesState(list, bool != null ? bool.booleanValue() : this.g, bool2 != null ? bool2.booleanValue() : this.h, bool3 != null ? bool3.booleanValue() : this.i);
    }

    public SimpleAttachesState(Serializer serializer) {
        this(serializer.j(SimpleAttachListItem.CREATOR), serializer.m(), serializer.m(), serializer.m());
    }
}
