package ru.ozon.android.messenger.blocks.input.viewmodel;

import java.util.Comparator;

/* loaded from: classes10.dex */
public final class i<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t2, T t11) {
        return Vc.a.b(Integer.valueOf(((ru.ozon.android.messenger.blocks.input.attachments.presentation.b) t11).e()), Integer.valueOf(((ru.ozon.android.messenger.blocks.input.attachments.presentation.b) t2).e()));
    }
}
