package com.vk.catalog2.common.dto.api.layout;

import com.vk.catalog2.common.dto.api.layout.GridCell;
import com.vk.catalog2.common.dto.api.layout.GridItemType;
import com.vk.core.serialize.Serializer;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.arm0;
import xsna.drm0;
import xsna.epx;
import xsna.fw3;
import xsna.kvf;

/* compiled from: CatalogGridLayout.kt */
/* loaded from: classes16.dex */
public final class CatalogGridLayout extends CatalogLayout {
    public static final Serializer.c<CatalogGridLayout> CREATOR = new a();
    public final GridLayout m;
    public final GridItemType n;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CatalogGridLayout> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogGridLayout a(Serializer serializer) {
            return new CatalogGridLayout(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogGridLayout[i];
        }
    }

    public CatalogGridLayout(JSONObject jSONObject) {
        super(jSONObject);
        Serializer.c<GridLayout> cVar = GridLayout.CREATOR;
        JSONArray jSONArray = jSONObject.getJSONArray("grid_layout");
        Serializer.c<GridColumn> cVar2 = GridColumn.CREATOR;
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i);
            Serializer.c<GridCell> cVar3 = GridCell.CREATOR;
            ArrayList arrayList2 = new ArrayList(jSONArray2.length());
            int length2 = jSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                String string = jSONArray2.getString(i2);
                List b0 = drm0.b0(string, new char[]{'x'}, 0, 6);
                if (b0.size() != 2) {
                    GridCell.a.a(string);
                    throw null;
                }
                Integer m = arm0.m(10, (String) b0.get(0));
                if (m == null) {
                    GridCell.a.a(string);
                    throw null;
                }
                int intValue = m.intValue();
                Integer m2 = arm0.m(10, (String) b0.get(1));
                if (m2 == null) {
                    GridCell.a.a(string);
                    throw null;
                }
                arrayList2.add(new GridCell(intValue, m2.intValue()));
            }
            arrayList.add(new GridColumn(arrayList2));
        }
        this.m = new GridLayout(arrayList);
        GridItemType.a aVar = GridItemType.Companion;
        String optString = jSONObject.optString("type");
        aVar.getClass();
        this.n = GridItemType.a.a(optString);
    }

    @Override // com.vk.catalog2.common.dto.api.layout.CatalogLayout, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.i0(this.m);
        serializer.j0(this.n.getId());
    }

    @Override // com.vk.catalog2.common.dto.api.layout.CatalogLayout, xsna.bxx
    public final JSONObject e5() {
        JSONObject e5 = super.e5();
        e5.put("grid_layout", kvf.a(this.m.b));
        e5.put("type", this.n.getId());
        return e5;
    }

    @Override // com.vk.catalog2.common.dto.api.layout.CatalogLayout
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!CatalogGridLayout.class.equals(obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        CatalogGridLayout catalogGridLayout = (CatalogGridLayout) obj;
        return epx.f(this.m, catalogGridLayout.m) && this.n == catalogGridLayout.n;
    }

    @Override // com.vk.catalog2.common.dto.api.layout.CatalogLayout
    public final int hashCode() {
        return this.n.hashCode() + fw3.a(super.hashCode() * 31, 31, this.m.b);
    }

    public CatalogGridLayout(Serializer serializer) {
        super(serializer);
        this.m = (GridLayout) serializer.G(GridLayout.class.getClassLoader());
        GridItemType.a aVar = GridItemType.Companion;
        String H = serializer.H();
        aVar.getClass();
        this.n = GridItemType.a.a(H);
    }
}
