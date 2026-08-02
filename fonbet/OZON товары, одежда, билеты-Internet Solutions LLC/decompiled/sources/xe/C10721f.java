package xe;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* renamed from: xe.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10721f {
    public static final <T> Object a(@NotNull Collection<? extends U<? extends T>> collection, @NotNull kotlin.coroutines.d<? super List<? extends T>> dVar) {
        return collection.isEmpty() ? kotlin.collections.K.f71697a : new C10715c((U[]) collection.toArray(new U[0])).c(dVar);
    }

    public static final Object b(@NotNull U[] uArr, @NotNull kotlin.coroutines.jvm.internal.j jVar) {
        return uArr.length == 0 ? kotlin.collections.K.f71697a : new C10715c(uArr).c(jVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(@NotNull ArrayList arrayList, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C10719e c10719e;
        int i11;
        Iterator it;
        if (cVar instanceof C10719e) {
            c10719e = (C10719e) cVar;
            int i12 = c10719e.f105450f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c10719e.f105450f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c10719e.f105449e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c10719e.f105450f;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    it = arrayList.iterator();
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = c10719e.f105448d;
                    Sc.s.b(obj);
                }
                while (it.hasNext()) {
                    B0 b02 = (B0) it.next();
                    c10719e.f105448d = it;
                    c10719e.f105450f = 1;
                    if (b02.r0(c10719e) == aVar) {
                        return aVar;
                    }
                }
                return Unit.f71690a;
            }
        }
        c10719e = new C10719e(cVar);
        Object obj2 = c10719e.f105449e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c10719e.f105450f;
        if (i11 != 0) {
        }
        while (it.hasNext()) {
        }
        return Unit.f71690a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0050 -> B:10:0x0053). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(@NotNull B0[] b0Arr, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C10717d c10717d;
        int i11;
        int i12;
        B0[] b0Arr2;
        int length;
        if (cVar instanceof C10717d) {
            c10717d = (C10717d) cVar;
            int i13 = c10717d.f105445h;
            if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c10717d.f105445h = i13 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c10717d.f105444g;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c10717d.f105445h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    i12 = 0;
                    b0Arr2 = b0Arr;
                    length = b0Arr.length;
                    if (i12 < length) {
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    length = c10717d.f105443f;
                    i12 = c10717d.f105442e;
                    B0[] b0Arr3 = (B0[]) c10717d.f105441d;
                    Sc.s.b(obj);
                    b0Arr2 = b0Arr3;
                    i12++;
                    if (i12 < length) {
                        B0 b02 = b0Arr2[i12];
                        c10717d.f105441d = b0Arr2;
                        c10717d.f105442e = i12;
                        c10717d.f105443f = length;
                        c10717d.f105445h = 1;
                        if (b02.r0(c10717d) == aVar) {
                            return aVar;
                        }
                        i12++;
                        if (i12 < length) {
                            return Unit.f71690a;
                        }
                    }
                }
            }
        }
        c10717d = new C10717d(cVar);
        Object obj2 = c10717d.f105444g;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c10717d.f105445h;
        if (i11 != 0) {
        }
    }
}
