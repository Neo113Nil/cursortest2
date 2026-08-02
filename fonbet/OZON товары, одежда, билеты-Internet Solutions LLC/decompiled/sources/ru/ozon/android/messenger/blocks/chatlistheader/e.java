package ru.ozon.android.messenger.blocks.chatlistheader;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.chatlistheader.f;
import ru.ozon.android.messenger.framework.presentation.common.screen.j;
import ru.ozon.android.messenger.framework.presentation.models.k;
import ru.ozon.uni.atoms.data.cell.IconTitleSubtitleCellDTO;

/* loaded from: classes10.dex */
public final class e {
    public static final void a(@NotNull ru.ozon.android.messenger.framework.core.d refs, @NotNull f.d item) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(item, "menuItem");
        Intrinsics.checkNotNullParameter(item, "item");
        List<IconTitleSubtitleCellDTO> a11 = item.a();
        if (a11 != null) {
            List<IconTitleSubtitleCellDTO> list = a11;
            arrayList = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new k.a((IconTitleSubtitleCellDTO) it.next(), item.b()));
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            int i11 = j.f91127e;
            j.a.a(arrayList).show(refs.d().getParentFragmentManager(), N.b(j.class).B());
        }
    }
}
