package com.vk.clips.upload.ui.api.entities.cell;

import com.vk.clips.upload.ui.api.entities.cell.ClipUploadItem;
import xsna.epx;
import xsna.f26;
import xsna.ho8;
import xsna.shy;
import xsna.tlo0;

/* compiled from: ClipUploadItem.kt */
/* loaded from: classes17.dex */
public final class a implements ClipUploadItem.a.InterfaceC0698a {
    public final int a;
    public final f26.a b;
    public final tlo0.f c;
    public final tlo0.f d;
    public final String e;

    public a(int i, f26.a aVar, tlo0.f fVar, tlo0.f fVar2, String str) {
        this.a = i;
        this.b = aVar;
        this.c = fVar;
        this.d = fVar2;
        this.e = str;
    }

    @Override // com.vk.clips.upload.ui.api.entities.cell.ClipUploadItem.a.InterfaceC0698a
    public final tlo0 a() {
        return this.c;
    }

    @Override // com.vk.clips.upload.ui.api.entities.cell.ClipUploadItem.a.InterfaceC0698a
    public final String b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b.equals(aVar.b) && this.c.equals(aVar.c) && this.d.equals(aVar.d) && epx.f(this.e, aVar.e);
    }

    @Override // com.vk.clips.upload.ui.api.entities.cell.ClipUploadItem.a.InterfaceC0698a
    public final int f() {
        return this.a;
    }

    @Override // com.vk.clips.upload.ui.api.entities.cell.ClipUploadItem.a.InterfaceC0698a
    public final tlo0 g() {
        return this.d;
    }

    @Override // com.vk.clips.upload.ui.api.entities.cell.ClipUploadItem.a.InterfaceC0698a
    public final f26 getIcon() {
        return this.b;
    }

    @Override // com.vk.clips.upload.ui.api.entities.cell.ClipUploadItem.a.InterfaceC0698a
    public final tlo0 getTitle() {
        return null;
    }

    public final int hashCode() {
        int a = shy.a(this.d.a, shy.a(this.c.a, (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 961, 31), 31);
        String str = this.e;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipUploadBannerItemBase(id=");
        sb.append((Object) ("BannerId(value=" + this.a + ')'));
        sb.append(", icon=");
        sb.append(this.b);
        sb.append(", title=null, subtitle=");
        sb.append(this.c);
        sb.append(", buttonText=");
        sb.append(this.d);
        sb.append(", testTag=");
        return ho8.a(sb, this.e, ')');
    }
}
