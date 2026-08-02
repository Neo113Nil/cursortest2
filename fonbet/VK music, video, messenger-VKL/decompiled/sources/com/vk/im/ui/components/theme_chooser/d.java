package com.vk.im.ui.components.theme_chooser;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x;
import com.google.android.material.tabs.TabLayout;
import com.vk.im.ui.components.theme_chooser.c;
import com.vk.im.ui.components.theme_chooser.e;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.t1c;

/* compiled from: ThemeChooserVc.kt */
/* loaded from: classes2.dex */
public final class d implements TabLayout.d {
    public final /* synthetic */ c b;

    /* compiled from: ThemeChooserVc.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[c.b.values().length];
            try {
                iArr[c.b.BACKGROUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.b.COLOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.b.THEME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public d(c cVar) {
        this.b = cVar;
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void Wd(TabLayout.g gVar) {
        e eVar;
        c.b bVar;
        c.b[] values = c.b.values();
        int length = values.length;
        int i = 0;
        while (true) {
            eVar = null;
            if (i >= length) {
                bVar = null;
                break;
            }
            bVar = values[i];
            if (bVar.h() == gVar.i) {
                break;
            } else {
                i++;
            }
        }
        if (bVar == null) {
            bVar = c.b.THEME;
        }
        int i2 = a.$EnumSwitchMapping$0[bVar.ordinal()];
        if (i2 == 1) {
            eVar = e.b.a;
        } else if (i2 == 2) {
            eVar = e.d.a;
        } else if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (eVar != null) {
            this.b.b.onNext(eVar);
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void hl(TabLayout.g gVar) {
        List currentList;
        RecyclerView recyclerView = this.b.j;
        if (recyclerView.computeHorizontalScrollOffset() != 0) {
            recyclerView.smoothScrollToPosition(0);
            return;
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        x xVar = adapter instanceof x ? (x) adapter : null;
        int i = -1;
        if (xVar != null && (currentList = xVar.getCurrentList()) != null) {
            Iterator it = currentList.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                t1c t1cVar = next instanceof t1c ? (t1c) next : null;
                if (t1cVar != null ? t1cVar.isChecked() : false) {
                    i = i2;
                    break;
                }
                i2++;
            }
        }
        if (i >= 0) {
            recyclerView.smoothScrollToPosition(i);
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void za(TabLayout.g gVar) {
    }
}
