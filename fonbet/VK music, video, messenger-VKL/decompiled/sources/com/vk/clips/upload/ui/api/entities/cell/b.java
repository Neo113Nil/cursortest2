package com.vk.clips.upload.ui.api.entities.cell;

import com.vk.clips.upload.ui.api.entities.cell.ClipUploadItem;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.epx;
import xsna.fna;
import xsna.fw3;
import xsna.i5s;
import xsna.pdf;
import xsna.qoy;
import xsna.rkp;
import xsna.tlo0;

/* compiled from: ClipUploadItem.kt */
/* loaded from: classes17.dex */
public final class b implements ClipUploadItem.Cell.a {
    public final int a;
    public final fna b;
    public final tlo0 c;
    public final tlo0 d;
    public final rkp e;
    public final boolean f;
    public final List<pdf> g;
    public final String h;

    public b() {
        throw null;
    }

    public b(int i, fna fnaVar, tlo0 tlo0Var, tlo0 tlo0Var2, rkp rkpVar, boolean z, List list, String str, int i2) {
        tlo0Var2 = (i2 & 8) != 0 ? null : tlo0Var2;
        list = (i2 & 64) != 0 ? EmptyList.b : list;
        this.a = i;
        this.b = fnaVar;
        this.c = tlo0Var;
        this.d = tlo0Var2;
        this.e = rkpVar;
        this.f = z;
        this.g = list;
        this.h = str;
    }

    @Override // com.vk.clips.upload.ui.api.entities.cell.ClipUploadItem.Cell.a
    public final tlo0 a() {
        return this.d;
    }

    @Override // com.vk.clips.upload.ui.api.entities.cell.ClipUploadItem.Cell.a
    public final String b() {
        return this.h;
    }

    @Override // com.vk.clips.upload.ui.api.entities.cell.ClipUploadItem.Cell.a
    public final int c() {
        return this.a;
    }

    @Override // com.vk.clips.upload.ui.api.entities.cell.ClipUploadItem.Cell.a
    public final rkp d() {
        return this.e;
    }

    @Override // com.vk.clips.upload.ui.api.entities.cell.ClipUploadItem.Cell.a
    public final List<pdf> e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && this.f == bVar.f && epx.f(this.g, bVar.g) && epx.f(this.h, bVar.h);
    }

    @Override // com.vk.clips.upload.ui.api.entities.cell.ClipUploadItem.Cell.a
    public final fna getIcon() {
        return this.b;
    }

    @Override // com.vk.clips.upload.ui.api.entities.cell.ClipUploadItem.Cell.a
    public final tlo0 getTitle() {
        return this.c;
    }

    @Override // com.vk.clips.upload.ui.api.entities.cell.ClipUploadItem.Cell.a
    public final tlo0 getTooltipText() {
        return null;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        fna fnaVar = this.b;
        int a = com.vk.movika.sdk.base.model.history.b.a((hashCode + (fnaVar == null ? 0 : fnaVar.hashCode())) * 31, 31, this.c);
        tlo0 tlo0Var = this.d;
        int a2 = fw3.a(qoy.b((this.e.hashCode() + ((a + (tlo0Var == null ? 0 : tlo0Var.hashCode())) * 31)) * 31, 31, this.f), 961, this.g);
        String str = this.h;
        return (a2 + (str != null ? str.hashCode() : 0)) * 31;
    }

    @Override // com.vk.clips.upload.ui.api.entities.cell.ClipUploadItem.Cell.a
    public final boolean isEnabled() {
        return this.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipUploadCellItemBase(id=");
        sb.append((Object) ("CellId(value=" + this.a + ')'));
        sb.append(", icon=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", subtitle=");
        sb.append(this.d);
        sb.append(", endIconState=");
        sb.append(this.e);
        sb.append(", isEnabled=");
        sb.append(this.f);
        sb.append(", suggestedItems=");
        sb.append(this.g);
        sb.append(", detailsItem=null, testTag=");
        return i5s.a(sb, this.h, ", tooltipText=null)");
    }
}
