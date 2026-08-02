package ru.ozon.android.messenger.framework.data.local.database.draft;

import androidx.annotation.NonNull;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* loaded from: classes10.dex */
final class h implements Callable<Unit> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.data.local.database.draft.entity.c f87518a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ i f87519b;

    h(i iVar, ru.ozon.android.messenger.framework.data.local.database.draft.entity.c cVar) {
        this.f87519b = iVar;
        this.f87518a = cVar;
    }

    @Override // java.util.concurrent.Callable
    @NonNull
    public final Unit call() throws Exception {
        J4.l lVar;
        i iVar = this.f87519b;
        iVar.f87520a.beginTransaction();
        try {
            lVar = iVar.f87521b;
            lVar.insert((J4.l) this.f87518a);
            iVar.f87520a.setTransactionSuccessful();
            return Unit.f71690a;
        } finally {
            iVar.f87520a.endTransaction();
        }
    }
}
