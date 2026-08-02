package ru.ozon.app.android.tileselector.domain.selectedstate;

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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u000b\u001a\u00020\u00032\u001e\u0010\n\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u0018R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lru/ozon/app/android/tileselector/domain/selectedstate/UgcSelectedProductsManagerImpl;", "Lru/ozon/app/android/tileselector/domain/selectedstate/UgcSelectedProductsManager;", "Lkotlin/Function0;", "", "onDestroyCallback", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Lkotlin/Function1;", "", "", "transform", "updateIds", "(Lkotlin/jvm/functions/Function1;)V", "LAe/h;", "", "observeCount", "()LAe/h;", "id", "", "isProductAdded", "(J)Z", "clear", "()V", "addProduct", "(J)V", "removeProduct", "Lkotlin/jvm/functions/Function0;", "getOnDestroyCallback", "()Lkotlin/jvm/functions/Function0;", "LAe/x0;", "_idsFlow", "LAe/x0;", "getSelectedIds", "()Ljava/util/List;", "selectedIds", "tileselector_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UgcSelectedProductsManagerImpl implements UgcSelectedProductsManager {

    @NotNull
    private final x0<List<Long>> _idsFlow;

    @NotNull
    private final Function0<Unit> onDestroyCallback;

    public UgcSelectedProductsManagerImpl(@NotNull Function0<Unit> onDestroyCallback) {
        Intrinsics.checkNotNullParameter(onDestroyCallback, "onDestroyCallback");
        this.onDestroyCallback = onDestroyCallback;
        this._idsFlow = O0.a(K.f71697a);
    }

    private final void updateIds(Function1<? super List<Long>, ? extends List<Long>> transform) {
        this._idsFlow.setValue(transform.invoke(this._idsFlow.getValue()));
    }

    @Override // ru.ozon.app.android.favorites.common.SelectedProductsManager
    public synchronized void addProduct(long id2) {
        updateIds(new UgcSelectedProductsManagerImpl$addProduct$1(id2));
    }

    @Override // ru.ozon.app.android.favorites.common.SelectedProductsManager
    public synchronized void clear() {
        updateIds(UgcSelectedProductsManagerImpl$clear$1.INSTANCE);
    }

    @Override // ru.ozon.app.android.tileselector.domain.selectedstate.UgcSelectedProductsManager
    @NotNull
    public Function0<Unit> getOnDestroyCallback() {
        return this.onDestroyCallback;
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
        return new InterfaceC2395h<Integer>() { // from class: ru.ozon.app.android.tileselector.domain.selectedstate.UgcSelectedProductsManagerImpl$observeCount$$inlined$map$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.tileselector.domain.selectedstate.UgcSelectedProductsManagerImpl$observeCount$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.tileselector.domain.selectedstate.UgcSelectedProductsManagerImpl$observeCount$$inlined$map$1$2", f = "UgcSelectedProductsManagerImpl.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.tileselector.domain.selectedstate.UgcSelectedProductsManagerImpl$observeCount$$inlined$map$1$2$1, reason: invalid class name */
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
        updateIds(new UgcSelectedProductsManagerImpl$removeProduct$1(id2));
    }
}
