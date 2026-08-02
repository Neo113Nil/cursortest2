package com.vk.im.ui.components.attaches_history.attaches.model.simple;

import com.vk.core.serialize.Serializer;
import com.vk.im.engine.models.attaches.HistoryAttach;
import xsna.epx;
import xsna.hfz;
import xsna.htx0;
import xsna.zcl;

/* compiled from: SimpleAttachListItem.kt */
/* loaded from: classes2.dex */
public final class SimpleAttachListItem extends Serializer.StreamParcelableAdapter implements hfz, htx0 {
    public static final Serializer.c<SimpleAttachListItem> CREATOR = new a();
    public final HistoryAttach b;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<SimpleAttachListItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final SimpleAttachListItem a(Serializer serializer) {
            return new SimpleAttachListItem(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SimpleAttachListItem[i];
        }
    }

    public SimpleAttachListItem(HistoryAttach historyAttach) {
        this.b = historyAttach;
    }

    @Override // xsna.htx0, xsna.ddq0
    public final boolean M() {
        return this.b.M();
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SimpleAttachListItem) && epx.f(this.b, ((SimpleAttachListItem) obj).b);
    }

    @Override // xsna.htx0
    public final long getId() {
        return this.b.i;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf((int) this.b.i);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "SimpleAttachListItem(historyAttach=" + this.b + ')';
    }

    public SimpleAttachListItem(Serializer serializer, zcl zclVar) {
        this((HistoryAttach) serializer.G(HistoryAttach.class.getClassLoader()));
    }
}
