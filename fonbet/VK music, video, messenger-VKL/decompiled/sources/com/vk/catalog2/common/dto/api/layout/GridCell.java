package com.vk.catalog2.common.dto.api.layout;

import com.vk.core.serialize.Serializer;
import org.json.JSONException;
import xsna.go9;
import xsna.vu5;

/* compiled from: CatalogGridLayout.kt */
/* loaded from: classes16.dex */
public final class GridCell extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<GridCell> CREATOR = new b();
    public final int b;
    public final int c;

    /* compiled from: CatalogGridLayout.kt */
    public static final class a {
        public static void a(String str) {
            throw new JSONException(go9.b("Illegal cell dimension format ", str));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<GridCell> {
        @Override // com.vk.core.serialize.Serializer.c
        public final GridCell a(Serializer serializer) {
            return new GridCell(serializer.u(), serializer.u());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GridCell[i];
        }
    }

    public GridCell(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.S(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GridCell)) {
            return false;
        }
        GridCell gridCell = (GridCell) obj;
        return this.b == gridCell.b && this.c == gridCell.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GridCell(width=");
        sb.append(this.b);
        sb.append(", height=");
        return vu5.b(sb, this.c, ')');
    }
}
