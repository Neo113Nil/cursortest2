package com.vk.core.compose.component.group.header;

import androidx.compose.runtime.k;
import com.vk.core.compose.component.defaults.ContentBadgeAppearance;
import com.vk.core.compose.component.defaults.ContentBadgeMode;
import com.vk.core.compose.component.defaults.ContentBadgeSize;
import com.vk.core.compose.component.group.header.f;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.jx;
import xsna.mq;
import xsna.q630;
import xsna.rnu0;
import xsna.wh50;
import xsna.zak0;

/* compiled from: GroupHeader.kt */
/* loaded from: classes17.dex */
public final class c {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e = k.b(null);

    /* compiled from: GroupHeader.kt */
    public static final class a {
    }

    public c(String str, ContentBadgeAppearance contentBadgeAppearance, ContentBadgeMode contentBadgeMode, ContentBadgeSize contentBadgeSize) {
        this.a = k.b(str);
        this.b = k.b(contentBadgeMode);
        this.c = k.b(contentBadgeSize);
        this.d = k.b(contentBadgeAppearance);
    }

    public final void a(int i, androidx.compose.runtime.a aVar, b bVar, f.b bVar2) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-448915655);
        if ((i & 384) == 0) {
            i2 = (M.J(null) ? 256 : 128) | i;
        } else {
            i2 = i;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(bVar2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(bVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(this) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (74881 & i2) != 74880)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-448915655, i2, -1, "com.vk.core.compose.component.group.header.GroupHeader.Title.Along.Badge.Content (GroupHeader.kt:327)");
            }
            M.K(bVar2.equals(f.b.a.a) ? 882069614 : -1911207448);
            M.j();
            M.K(882149171);
            M.K(882212070);
            q630.a aVar3 = q630.a.a;
            mq.d(aVar3, 0, M, 6);
            aVar2 = M;
            rnu0.c((ContentBadgeSize) ((zak0) this.c).getValue(), (ContentBadgeMode) ((zak0) this.b).getValue(), (ContentBadgeAppearance) ((zak0) this.d).getValue(), com.vk.core.compose.component.semantics.b.b(aVar3, (SemanticsConfiguration) ((zak0) this.e).getValue()), null, null, (String) ((zak0) this.a).getValue(), null, null, null, false, null, false, null, aVar2, 0, (i2 << 3) & 7168, 8112);
            aVar2.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new jx(this, bVar2, bVar, i);
        }
    }
}
