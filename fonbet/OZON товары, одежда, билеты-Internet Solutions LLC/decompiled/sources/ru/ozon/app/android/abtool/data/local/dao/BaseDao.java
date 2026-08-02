package ru.ozon.app.android.abtool.data.local.dao;

import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b!\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H§@¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\tH§@¢\u0006\u0004\b\u0007\u0010\nJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00028\u0000H§@¢\u0006\u0004\b\f\u0010\bJ\u001e\u0010\f\u001a\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\tH§@¢\u0006\u0004\b\f\u0010\nJ\u0018\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00028\u0000H\u0097@¢\u0006\u0004\b\r\u0010\bJ\u001e\u0010\r\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0097@¢\u0006\u0004\b\r\u0010\n¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/abtool/data/local/dao/BaseDao;", "T", "", "<init>", "()V", "obj", "", "insert", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "(Ljava/util/List;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "update", "upsert", "objList", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class BaseDao<T> {
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        if (r8.update((ru.ozon.app.android.abtool.data.local.dao.BaseDao<T>) r9, (kotlin.coroutines.d<? super kotlin.Unit>) r0) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0049, code lost:
    
        if (r10 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static <T> Object upsert$suspendImpl(BaseDao<T> baseDao, T t2, d<? super Unit> dVar) {
        BaseDao$upsert$1 baseDao$upsert$1;
        Object obj;
        int i11;
        if (dVar instanceof BaseDao$upsert$1) {
            baseDao$upsert$1 = (BaseDao$upsert$1) dVar;
            int i12 = baseDao$upsert$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                baseDao$upsert$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                obj = baseDao$upsert$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = baseDao$upsert$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    baseDao$upsert$1.L$0 = baseDao;
                    baseDao$upsert$1.L$1 = t2;
                    baseDao$upsert$1.label = 1;
                    obj = baseDao.insert((BaseDao<T>) t2, (d<? super Long>) baseDao$upsert$1);
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                        return Unit.f71690a;
                    }
                    t2 = (T) baseDao$upsert$1.L$1;
                    baseDao = (BaseDao) baseDao$upsert$1.L$0;
                    s.b(obj);
                }
                if (((Number) obj).longValue() == -1) {
                    return Unit.f71690a;
                }
                baseDao$upsert$1.L$0 = null;
                baseDao$upsert$1.L$1 = null;
                baseDao$upsert$1.label = 2;
            }
        }
        baseDao$upsert$1 = new BaseDao$upsert$1(baseDao, dVar);
        obj = baseDao$upsert$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = baseDao$upsert$1.label;
        if (i11 != 0) {
        }
        if (((Number) obj).longValue() == -1) {
        }
    }

    public abstract Object insert(T t2, @NotNull d<? super Long> dVar);

    public abstract Object insert(@NotNull List<? extends T> list, @NotNull d<? super List<Long>> dVar);

    public abstract Object update(T t2, @NotNull d<? super Unit> dVar);

    public abstract Object update(@NotNull List<? extends T> list, @NotNull d<? super Unit> dVar);

    public Object upsert(T t2, @NotNull d<? super Unit> dVar) {
        return upsert$suspendImpl(this, t2, dVar);
    }

    public Object upsert(@NotNull List<? extends T> list, @NotNull d<? super Unit> dVar) {
        return upsert$suspendImpl((BaseDao) this, (List) list, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0095, code lost:
    
        if (r10.update((java.util.List) r2, (kotlin.coroutines.d<? super kotlin.Unit>) r0) == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0097, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x004c, code lost:
    
        if (r12 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static <T> Object upsert$suspendImpl(BaseDao<T> baseDao, List<? extends T> list, d<? super Unit> dVar) {
        BaseDao$upsert$2 baseDao$upsert$2;
        int i11;
        ArrayList arrayList;
        if (dVar instanceof BaseDao$upsert$2) {
            baseDao$upsert$2 = (BaseDao$upsert$2) dVar;
            int i12 = baseDao$upsert$2.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                baseDao$upsert$2.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = baseDao$upsert$2.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = baseDao$upsert$2.label;
                if (i11 != 0) {
                    s.b(obj);
                    baseDao$upsert$2.L$0 = baseDao;
                    baseDao$upsert$2.L$1 = list;
                    baseDao$upsert$2.label = 1;
                    obj = baseDao.insert(list, (d<? super List<Long>>) baseDao$upsert$2);
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                        return Unit.f71690a;
                    }
                    list = (List) baseDao$upsert$2.L$1;
                    baseDao = (BaseDao) baseDao$upsert$2.L$0;
                    s.b(obj);
                }
                arrayList = new ArrayList();
                int i13 = 0;
                for (T t2 : (List) obj) {
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        C7714v.O0();
                        throw null;
                    }
                    if (((Number) t2).longValue() == -1) {
                        arrayList.add(list.get(i13));
                    }
                    i13 = i14;
                }
                if (!arrayList.isEmpty()) {
                    return Unit.f71690a;
                }
                baseDao$upsert$2.L$0 = null;
                baseDao$upsert$2.L$1 = null;
                baseDao$upsert$2.label = 2;
            }
        }
        baseDao$upsert$2 = new BaseDao$upsert$2(baseDao, dVar);
        Object obj2 = baseDao$upsert$2.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = baseDao$upsert$2.label;
        if (i11 != 0) {
        }
        arrayList = new ArrayList();
        int i132 = 0;
        while (r12.hasNext()) {
        }
        if (!arrayList.isEmpty()) {
        }
    }
}
