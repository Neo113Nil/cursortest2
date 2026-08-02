package ru.ozon.android.messenger.blocks.input.viewmodel;

import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.repository.S;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final S f85604a;

    public e(@NotNull S draftsRepository) {
        Intrinsics.checkNotNullParameter(draftsRepository, "draftsRepository");
        this.f85604a = draftsRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull String str, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        d dVar;
        int i11;
        ru.ozon.android.messenger.blocks.input.b bVar;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i12 = dVar.f85603g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                dVar.f85603g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = dVar.f85601e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = dVar.f85603g;
                if (i11 != 0) {
                    s.b(obj);
                    dVar.f85600d = str;
                    dVar.f85603g = 1;
                    obj = this.f85604a.b(str, dVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = dVar.f85600d;
                    s.b(obj);
                }
                String chatId = str;
                bVar = (ru.ozon.android.messenger.blocks.input.b) ((ru.ozon.android.messenger.utils.i) obj).a();
                if (bVar == null) {
                    return bVar;
                }
                Intrinsics.checkNotNullParameter(chatId, "chatId");
                return new ru.ozon.android.messenger.blocks.input.b(chatId, 0L, "", null, K.f71697a);
            }
        }
        dVar = new d(this, cVar);
        Object obj2 = dVar.f85601e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = dVar.f85603g;
        if (i11 != 0) {
        }
        String chatId2 = str;
        bVar = (ru.ozon.android.messenger.blocks.input.b) ((ru.ozon.android.messenger.utils.i) obj2).a();
        if (bVar == null) {
        }
    }
}
