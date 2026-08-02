package ru.ozon.app.android.favorites.domain.favoritesv2.selectedstate;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.O0;
import Ae.x0;
import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.common.SelectedProductsManager;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\t\u001a\u00020\b2\u001e\u0010\u0007\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0003J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0015R \u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/favorites/domain/favoritesv2/selectedstate/SelectedProductsManagerImpl;", "Lru/ozon/app/android/favorites/common/SelectedProductsManager;", "<init>", "()V", "Lkotlin/Function1;", "", "", "transform", "", "updateIds", "(Lkotlin/jvm/functions/Function1;)V", "LAe/h;", "", "observeCount", "()LAe/h;", "id", "", "isProductAdded", "(J)Z", "clear", "addProduct", "(J)V", "removeProduct", "LAe/x0;", "_idsFlow", "LAe/x0;", "getSelectedIds", "()Ljava/util/List;", "selectedIds", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SelectedProductsManagerImpl implements SelectedProductsManager {

    @NotNull
    private final x0<List<Long>> _idsFlow = O0.a(K.f71697a);

    private final void updateIds(Function1<? super List<Long>, ? extends List<Long>> transform) {
        this._idsFlow.setValue(transform.invoke(this._idsFlow.getValue()));
    }

    @Override // ru.ozon.app.android.favorites.common.SelectedProductsManager
    public synchronized void addProduct(long id2) {
        updateIds(new SelectedProductsManagerImpl$addProduct$1(id2));
    }

    @Override // ru.ozon.app.android.favorites.common.SelectedProductsManager
    public synchronized void clear() {
        updateIds(SelectedProductsManagerImpl$clear$1.INSTANCE);
    }

    @Override // ru.ozon.app.android.favorites.common.SelectedProductsManager
    @NotNull
    public List<Long> getSelectedIds() {
        return this._idsFlow.getValue();
    }

    @Override // ru.ozon.app.android.favorites.common.SelectedProductsManager
    public boolean isProductAdded(long id2) {
        return this._idsFlow.getValue().contains(Long.valueOf(id2));
    }

    @Override // ru.ozon.app.android.favorites.common.SelectedProductsManager
    @NotNull
    public InterfaceC2395h<Integer> observeCount() {
        final x0<List<Long>> x0Var = this._idsFlow;
        return new InterfaceC2395h<Integer>() { // from class: ru.ozon.app.android.favorites.domain.favoritesv2.selectedstate.SelectedProductsManagerImpl$observeCount$$inlined$map$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.favorites.domain.favoritesv2.selectedstate.SelectedProductsManagerImpl$observeCount$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.favorites.domain.favoritesv2.selectedstate.SelectedProductsManagerImpl$observeCount$$inlined$map$1$2", f = "SelectedProductsManagerImpl.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.favorites.domain.favoritesv2.selectedstate.SelectedProductsManagerImpl$observeCount$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends c {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= LinearLayoutManager.INVALID_OFFSET;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2397i interfaceC2397i) {
                    this.$this_unsafeFlow = interfaceC2397i;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, d dVar) {
                    AnonymousClass1 anonymousClass1;
                    int i11;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = anonymousClass1.result;
                            a aVar = a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                Integer num = new Integer(((List) obj).size());
                                anonymousClass1.label = 1;
                                if (interfaceC2397i.emit(num, anonymousClass1) == aVar) {
                                    return aVar;
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                s.b(obj2);
                            }
                            return Unit.f71690a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(dVar);
                    Object obj22 = anonymousClass1.result;
                    a aVar2 = a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super Integer> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        };
    }

    @Override // ru.ozon.app.android.favorites.common.SelectedProductsManager
    public synchronized void removeProduct(long id2) {
        updateIds(new SelectedProductsManagerImpl$removeProduct$1(id2));
    }
}
