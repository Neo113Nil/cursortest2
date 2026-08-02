package com.vk.catalog2.common.dto.api.layout;

import com.vk.core.serialize.Serializer;
import java.util.List;
import xsna.epx;
import xsna.ms9;

/* compiled from: CatalogGridLayout.kt */
/* loaded from: classes16.dex */
public final class GridLayout extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<GridLayout> CREATOR = new a();
    public final List<GridColumn> b;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<GridLayout> {
        @Override // com.vk.core.serialize.Serializer.c
        public final GridLayout a(Serializer serializer) {
            return new GridLayout(serializer.j(GridColumn.CREATOR));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GridLayout[i];
        }
    }

    public GridLayout(List<GridColumn> list) {
        this.b = list;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.o0(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GridLayout) && epx.f(this.b, ((GridLayout) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("GridLayout(columns="), this.b);
    }
}
