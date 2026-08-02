package ru.ozon.android.messenger.blocks.input.viewmodel;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.blocks.input.attachments.presentation.b;

/* loaded from: classes10.dex */
public final /* synthetic */ class b implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        ru.ozon.android.messenger.blocks.input.attachments.presentation.b bVar = (ru.ozon.android.messenger.blocks.input.attachments.presentation.b) obj;
        ru.ozon.android.messenger.blocks.input.attachments.presentation.b bVar2 = (ru.ozon.android.messenger.blocks.input.attachments.presentation.b) obj2;
        if ((bVar instanceof b.C1500b) && (bVar2 instanceof b.a)) {
            return -1;
        }
        if ((bVar2 instanceof b.C1500b) && (bVar instanceof b.a)) {
            return 1;
        }
        return Intrinsics.i(bVar.e(), bVar2.e());
    }
}
