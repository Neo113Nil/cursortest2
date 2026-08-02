package ru.ozon.android.messenger.blocks.input.viewmodel;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.blocks.input.attachments.presentation.b;

/* loaded from: classes10.dex */
public final /* synthetic */ class a implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        ru.ozon.android.messenger.blocks.input.attachments.presentation.b bVar = (ru.ozon.android.messenger.blocks.input.attachments.presentation.b) obj;
        ru.ozon.android.messenger.blocks.input.attachments.presentation.b bVar2 = (ru.ozon.android.messenger.blocks.input.attachments.presentation.b) obj2;
        if (bVar.a() != bVar2.a()) {
            return Intrinsics.i(bVar.a(), bVar2.a());
        }
        if ((bVar.f() instanceof b.c.C1503c) && !Intrinsics.d(bVar.f(), bVar2.f()) && !bVar2.h()) {
            return 1;
        }
        if (!(bVar2.f() instanceof b.c.C1503c) || bVar.h()) {
            return bVar.h() != bVar2.h() ? Boolean.compare(bVar.h(), bVar2.h()) : Intrinsics.i(bVar.e(), bVar2.e());
        }
        return -1;
    }
}
