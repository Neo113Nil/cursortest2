package ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.scroll;

import Ae.C2380A;
import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import i10.C6997c;
import i10.k;
import j10.InterfaceC7238a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.common.SelectTabEvent;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.scroll.CatalogTabsV2ScrollHelper;
import ru.ozon.composer.ui.widget.l;
import xe.f1;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001)B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ2\u0010\u0010\u001a\u00020\u000f*\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0016\u001a\u00020\u000f*\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001a\u001a\u00020\u000f*\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001c\u0010\u001d\u001a\u00020\u000f*\u00020\t2\u0006\u0010\u001c\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010 \u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u001f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b \u0010!J\"\u0010$\u001a\u00020\u000f*\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010#\u001a\u00020\"H\u0082@¢\u0006\u0004\b$\u0010%J>\u0010'\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0086@¢\u0006\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/scroll/CatalogTabsV2ScrollHelper;", "", "<init>", "()V", "", "position", "", "targetWidgetLoaded", "(I)Z", "Landroidx/recyclerview/widget/RecyclerView;", "Lj10/a;", "Lru/ozon/composer/ui/widget/l;", "composerStore", "targetIndex", "topOffsetPx", "", "scrollToWidgetPosition", "(Landroidx/recyclerview/widget/RecyclerView;Lj10/a;IILkotlin/coroutines/d;)Ljava/lang/Object;", "targetPosition", "offset", "Lkotlin/Function0;", "onScrollComplete", "fastScrollToPosition", "(Landroidx/recyclerview/widget/RecyclerView;IILkotlin/jvm/functions/Function0;)V", "Landroidx/recyclerview/widget/LinearLayoutManager;", "layoutManager", "smoothScrollToPositionWithTopOffset", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/LinearLayoutManager;II)V", "minCount", "waitForLoadedItems", "(Landroidx/recyclerview/widget/RecyclerView;ILkotlin/coroutines/d;)Ljava/lang/Object;", "widgetScrollKey", "targetWidgetPosition", "(Lj10/a;I)I", "Ll10/b;", "composerController", "waitForLoadingPage", "(Lj10/a;Ll10/b;Lkotlin/coroutines/d;)Ljava/lang/Object;", "recyclerView", "scrollToWidgetWithPagination", "(ILandroidx/recyclerview/widget/RecyclerView;ILl10/b;Lj10/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "TopOffsetSmoothScroller", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CatalogTabsV2ScrollHelper {

    @NotNull
    public static final CatalogTabsV2ScrollHelper INSTANCE = new CatalogTabsV2ScrollHelper();

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/scroll/CatalogTabsV2ScrollHelper$TopOffsetSmoothScroller;", "Landroidx/recyclerview/widget/r;", "Landroid/content/Context;", "context", "", "topOffsetPx", "<init>", "(Landroid/content/Context;I)V", "getVerticalSnapPreference", "()I", "viewStart", "viewEnd", "boxStart", "boxEnd", "snapPreference", "calculateDtToFit", "(IIIII)I", "Landroid/util/DisplayMetrics;", "displayMetrics", "", "calculateSpeedPerPixel", "(Landroid/util/DisplayMetrics;)F", "I", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class TopOffsetSmoothScroller extends r {
        private final int topOffsetPx;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TopOffsetSmoothScroller(@NotNull Context context, int i11) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "context");
            this.topOffsetPx = i11;
        }

        @Override // androidx.recyclerview.widget.r
        public int calculateDtToFit(int viewStart, int viewEnd, int boxStart, int boxEnd, int snapPreference) {
            int calculateDtToFit = super.calculateDtToFit(viewStart, viewEnd, boxStart, boxEnd, snapPreference);
            return snapPreference == -1 ? calculateDtToFit + this.topOffsetPx : calculateDtToFit;
        }

        @Override // androidx.recyclerview.widget.r
        protected float calculateSpeedPerPixel(@NotNull DisplayMetrics displayMetrics) {
            Intrinsics.checkNotNullParameter(displayMetrics, "displayMetrics");
            return 30.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.r
        protected int getVerticalSnapPreference() {
            return -1;
        }
    }

    private CatalogTabsV2ScrollHelper() {
    }

    private final void fastScrollToPosition(final RecyclerView recyclerView, final int i11, final int i12, final Function0<Unit> function0) {
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        final LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            function0.invoke();
        } else {
            linearLayoutManager.scrollToPositionWithOffset(i11, i12);
            recyclerView.post(new Runnable() { // from class: aw.a
                @Override // java.lang.Runnable
                public final void run() {
                    CatalogTabsV2ScrollHelper.fastScrollToPosition$lambda$1(LinearLayoutManager.this, i11, recyclerView, i12, function0);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fastScrollToPosition$lambda$1(LinearLayoutManager linearLayoutManager, int i11, RecyclerView recyclerView, int i12, Function0 function0) {
        if (Math.abs(linearLayoutManager.findFirstVisibleItemPosition() - i11) <= 16) {
            function0.invoke();
        } else {
            INSTANCE.fastScrollToPosition(recyclerView, i11, i12, function0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object scrollToWidgetPosition(RecyclerView recyclerView, InterfaceC7238a<l> interfaceC7238a, int i11, int i12, d<? super Unit> dVar) {
        CatalogTabsV2ScrollHelper$scrollToWidgetPosition$1 catalogTabsV2ScrollHelper$scrollToWidgetPosition$1;
        int i13;
        Integer num;
        List<l> list;
        CatalogTabsV2ScrollHelper catalogTabsV2ScrollHelper;
        LinearLayoutManager linearLayoutManager;
        if (dVar instanceof CatalogTabsV2ScrollHelper$scrollToWidgetPosition$1) {
            catalogTabsV2ScrollHelper$scrollToWidgetPosition$1 = (CatalogTabsV2ScrollHelper$scrollToWidgetPosition$1) dVar;
            int i14 = catalogTabsV2ScrollHelper$scrollToWidgetPosition$1.label;
            if ((i14 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                catalogTabsV2ScrollHelper$scrollToWidgetPosition$1.label = i14 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = catalogTabsV2ScrollHelper$scrollToWidgetPosition$1.result;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i13 = catalogTabsV2ScrollHelper$scrollToWidgetPosition$1.label;
                if (i13 != 0) {
                    s.b(obj);
                    RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                    num = null;
                    LinearLayoutManager linearLayoutManager2 = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                    if (linearLayoutManager2 == null) {
                        return Unit.f71690a;
                    }
                    k.a<l> e11 = interfaceC7238a.b().e();
                    if (e11 == null || (list = e11.a()) == null) {
                        list = K.f71697a;
                    }
                    Integer num2 = new Integer(linearLayoutManager2.findFirstVisibleItemPosition());
                    if (num2.intValue() == -1) {
                        num2 = null;
                    }
                    int intValue = i11 - (num2 != null ? num2.intValue() : i11);
                    if (Math.abs(intValue) > 16) {
                        if (intValue < -16) {
                            int i15 = i11 + 16;
                            int P11 = C7714v.P(list);
                            if (i15 > P11) {
                                i15 = P11;
                            }
                            num = new Integer(i15);
                        } else if (intValue > 16) {
                            int i16 = i11 - 16;
                            if (i16 < 0) {
                                i16 = 0;
                            }
                            num = new Integer(i16);
                        }
                    }
                    if (num == null) {
                        smoothScrollToPositionWithTopOffset(recyclerView, linearLayoutManager2, i11 + 1, i12);
                        return Unit.f71690a;
                    }
                    int intValue2 = num.intValue();
                    catalogTabsV2ScrollHelper$scrollToWidgetPosition$1.L$0 = this;
                    catalogTabsV2ScrollHelper$scrollToWidgetPosition$1.L$1 = recyclerView;
                    catalogTabsV2ScrollHelper$scrollToWidgetPosition$1.L$2 = linearLayoutManager2;
                    catalogTabsV2ScrollHelper$scrollToWidgetPosition$1.L$3 = num;
                    catalogTabsV2ScrollHelper$scrollToWidgetPosition$1.I$0 = i11;
                    catalogTabsV2ScrollHelper$scrollToWidgetPosition$1.I$1 = i12;
                    catalogTabsV2ScrollHelper$scrollToWidgetPosition$1.label = 1;
                    if (waitForLoadedItems(recyclerView, intValue2, catalogTabsV2ScrollHelper$scrollToWidgetPosition$1) == aVar) {
                        return aVar;
                    }
                    catalogTabsV2ScrollHelper = this;
                    linearLayoutManager = linearLayoutManager2;
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i12 = catalogTabsV2ScrollHelper$scrollToWidgetPosition$1.I$1;
                    i11 = catalogTabsV2ScrollHelper$scrollToWidgetPosition$1.I$0;
                    Integer num3 = (Integer) catalogTabsV2ScrollHelper$scrollToWidgetPosition$1.L$3;
                    linearLayoutManager = (LinearLayoutManager) catalogTabsV2ScrollHelper$scrollToWidgetPosition$1.L$2;
                    RecyclerView recyclerView2 = (RecyclerView) catalogTabsV2ScrollHelper$scrollToWidgetPosition$1.L$1;
                    catalogTabsV2ScrollHelper = (CatalogTabsV2ScrollHelper) catalogTabsV2ScrollHelper$scrollToWidgetPosition$1.L$0;
                    s.b(obj);
                    num = num3;
                    recyclerView = recyclerView2;
                }
                catalogTabsV2ScrollHelper.fastScrollToPosition(recyclerView, num.intValue(), i12, new CatalogTabsV2ScrollHelper$scrollToWidgetPosition$2(recyclerView, linearLayoutManager, i11, i12));
                return Unit.f71690a;
            }
        }
        catalogTabsV2ScrollHelper$scrollToWidgetPosition$1 = new CatalogTabsV2ScrollHelper$scrollToWidgetPosition$1(this, dVar);
        Object obj2 = catalogTabsV2ScrollHelper$scrollToWidgetPosition$1.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i13 = catalogTabsV2ScrollHelper$scrollToWidgetPosition$1.label;
        if (i13 != 0) {
        }
        catalogTabsV2ScrollHelper.fastScrollToPosition(recyclerView, num.intValue(), i12, new CatalogTabsV2ScrollHelper$scrollToWidgetPosition$2(recyclerView, linearLayoutManager, i11, i12));
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void smoothScrollToPositionWithTopOffset(RecyclerView recyclerView, final LinearLayoutManager linearLayoutManager, int i11, int i12) {
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        final TopOffsetSmoothScroller topOffsetSmoothScroller = new TopOffsetSmoothScroller(context, i12);
        topOffsetSmoothScroller.setTargetPosition(i11);
        recyclerView.post(new Runnable() { // from class: ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.scroll.a
            @Override // java.lang.Runnable
            public final void run() {
                LinearLayoutManager.this.startSmoothScroll(topOffsetSmoothScroller);
            }
        });
    }

    private final boolean targetWidgetLoaded(int position) {
        return position != -1;
    }

    private final int targetWidgetPosition(InterfaceC7238a<l> interfaceC7238a, int i11) {
        List<l> a11;
        k.a<l> e11 = interfaceC7238a.b().e();
        if (e11 == null || (a11 = e11.a()) == null) {
            return -1;
        }
        int i12 = 0;
        for (Object obj : a11) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C7714v.O0();
                throw null;
            }
            Integer scrollWidgetKey = ((l) obj).d().getScrollWidgetKey();
            if (scrollWidgetKey != null && scrollWidgetKey.intValue() == i11) {
                return i12;
            }
            i12 = i13;
        }
        return -1;
    }

    private final Object waitForLoadedItems(RecyclerView recyclerView, int i11, d<? super Unit> dVar) {
        RecyclerView.g adapter = recyclerView.getAdapter();
        if (adapter != null && adapter.getCardsCount() < i11) {
            return f1.c(1000L, new CatalogTabsV2ScrollHelper$waitForLoadedItems$2(adapter, i11, null), dVar);
        }
        return Unit.f71690a;
    }

    private final Object waitForLoadingPage(InterfaceC7238a<l> interfaceC7238a, InterfaceC7851b interfaceC7851b, d<? super Unit> dVar) {
        final Ae.K k11 = new Ae.K(new C2380A(interfaceC7238a.getState(), new CatalogTabsV2ScrollHelper$waitForLoadingPage$2(interfaceC7851b, null)), new CatalogTabsV2ScrollHelper$waitForLoadingPage$3(null));
        Object g10 = C2399j.g(C2399j.O(C2399j.o(new InterfaceC2395h<Boolean>() { // from class: ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.scroll.CatalogTabsV2ScrollHelper$waitForLoadingPage$$inlined$map$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.scroll.CatalogTabsV2ScrollHelper$waitForLoadingPage$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.scroll.CatalogTabsV2ScrollHelper$waitForLoadingPage$$inlined$map$1$2", f = "CatalogTabsV2ScrollHelper.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.scroll.CatalogTabsV2ScrollHelper$waitForLoadingPage$$inlined$map$1$2$1, reason: invalid class name */
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
                            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                Boolean valueOf = Boolean.valueOf(((C6997c) obj).r());
                                anonymousClass1.label = 1;
                                if (interfaceC2397i.emit(valueOf, anonymousClass1) == aVar) {
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
                    Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super Boolean> interfaceC2397i, d dVar2) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar2);
                return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }), 2), dVar);
        return g10 == Wc.a.COROUTINE_SUSPENDED ? g10 : Unit.f71690a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00dd, code lost:
    
        if (r13.scrollToWidgetPosition(r2, r8, r11, r3, r9) == r4) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x009d -> B:17:0x00a2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object scrollToWidgetWithPagination(int i11, @NotNull RecyclerView recyclerView, int i12, @NotNull InterfaceC7851b interfaceC7851b, @NotNull InterfaceC7238a<l> interfaceC7238a, @NotNull d<? super Unit> dVar) {
        CatalogTabsV2ScrollHelper$scrollToWidgetWithPagination$1 catalogTabsV2ScrollHelper$scrollToWidgetWithPagination$1;
        int i13;
        InterfaceC7851b interfaceC7851b2;
        int i14;
        CatalogTabsV2ScrollHelper catalogTabsV2ScrollHelper;
        int targetWidgetPosition;
        boolean b11;
        InterfaceC7238a<l> interfaceC7238a2;
        CatalogTabsV2ScrollHelper$scrollToWidgetWithPagination$1 catalogTabsV2ScrollHelper$scrollToWidgetWithPagination$12;
        RecyclerView recyclerView2;
        int i15;
        int i16 = i11;
        if (dVar instanceof CatalogTabsV2ScrollHelper$scrollToWidgetWithPagination$1) {
            catalogTabsV2ScrollHelper$scrollToWidgetWithPagination$1 = (CatalogTabsV2ScrollHelper$scrollToWidgetWithPagination$1) dVar;
            int i17 = catalogTabsV2ScrollHelper$scrollToWidgetWithPagination$1.label;
            if ((i17 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                catalogTabsV2ScrollHelper$scrollToWidgetWithPagination$1.label = i17 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = catalogTabsV2ScrollHelper$scrollToWidgetWithPagination$1.result;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i13 = catalogTabsV2ScrollHelper$scrollToWidgetWithPagination$1.label;
                if (i13 != 0) {
                    s.b(obj);
                    interfaceC7851b2 = interfaceC7851b;
                    interfaceC7851b2.update(new SelectTabEvent(i16));
                    i14 = 0;
                    catalogTabsV2ScrollHelper = this;
                    targetWidgetPosition = targetWidgetPosition(interfaceC7238a, i16);
                    b11 = interfaceC7238a.b().b(true);
                    interfaceC7238a2 = interfaceC7238a;
                    catalogTabsV2ScrollHelper$scrollToWidgetWithPagination$12 = catalogTabsV2ScrollHelper$scrollToWidgetWithPagination$1;
                    recyclerView2 = recyclerView;
                    i15 = i12;
                    if (!catalogTabsV2ScrollHelper.targetWidgetLoaded(targetWidgetPosition)) {
                        catalogTabsV2ScrollHelper$scrollToWidgetWithPagination$12.L$0 = catalogTabsV2ScrollHelper;
                        catalogTabsV2ScrollHelper$scrollToWidgetWithPagination$12.L$1 = recyclerView2;
                        catalogTabsV2ScrollHelper$scrollToWidgetWithPagination$12.L$2 = interfaceC7851b2;
                        catalogTabsV2ScrollHelper$scrollToWidgetWithPagination$12.L$3 = interfaceC7238a2;
                        catalogTabsV2ScrollHelper$scrollToWidgetWithPagination$12.I$0 = i16;
                        catalogTabsV2ScrollHelper$scrollToWidgetWithPagination$12.I$1 = i15;
                        catalogTabsV2ScrollHelper$scrollToWidgetWithPagination$12.I$2 = i14;
                        catalogTabsV2ScrollHelper$scrollToWidgetWithPagination$12.label = 1;
                        if (catalogTabsV2ScrollHelper.waitForLoadingPage(interfaceC7238a2, interfaceC7851b2, catalogTabsV2ScrollHelper$scrollToWidgetWithPagination$12) != aVar) {
                        }
                        return aVar;
                    }
                    if (!catalogTabsV2ScrollHelper.targetWidgetLoaded(targetWidgetPosition)) {
                    }
                } else {
                    if (i13 != 1) {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                        return Unit.f71690a;
                    }
                    int i18 = catalogTabsV2ScrollHelper$scrollToWidgetWithPagination$1.I$2;
                    int i19 = catalogTabsV2ScrollHelper$scrollToWidgetWithPagination$1.I$1;
                    int i21 = catalogTabsV2ScrollHelper$scrollToWidgetWithPagination$1.I$0;
                    InterfaceC7238a<l> interfaceC7238a3 = (InterfaceC7238a) catalogTabsV2ScrollHelper$scrollToWidgetWithPagination$1.L$3;
                    InterfaceC7851b interfaceC7851b3 = (InterfaceC7851b) catalogTabsV2ScrollHelper$scrollToWidgetWithPagination$1.L$2;
                    RecyclerView recyclerView3 = (RecyclerView) catalogTabsV2ScrollHelper$scrollToWidgetWithPagination$1.L$1;
                    CatalogTabsV2ScrollHelper catalogTabsV2ScrollHelper2 = (CatalogTabsV2ScrollHelper) catalogTabsV2ScrollHelper$scrollToWidgetWithPagination$1.L$0;
                    s.b(obj);
                    CatalogTabsV2ScrollHelper$scrollToWidgetWithPagination$1 catalogTabsV2ScrollHelper$scrollToWidgetWithPagination$13 = catalogTabsV2ScrollHelper$scrollToWidgetWithPagination$1;
                    i15 = i19;
                    interfaceC7851b2 = interfaceC7851b3;
                    recyclerView2 = recyclerView3;
                    catalogTabsV2ScrollHelper = catalogTabsV2ScrollHelper2;
                    int i22 = i18 + 1;
                    targetWidgetPosition = catalogTabsV2ScrollHelper.targetWidgetPosition(interfaceC7238a3, i21);
                    b11 = interfaceC7238a3.b().b(true);
                    if (i22 < 20) {
                        interfaceC7238a2 = interfaceC7238a3;
                        catalogTabsV2ScrollHelper$scrollToWidgetWithPagination$12 = catalogTabsV2ScrollHelper$scrollToWidgetWithPagination$13;
                        if (!catalogTabsV2ScrollHelper.targetWidgetLoaded(targetWidgetPosition)) {
                            return Unit.f71690a;
                        }
                        catalogTabsV2ScrollHelper$scrollToWidgetWithPagination$12.L$0 = null;
                        catalogTabsV2ScrollHelper$scrollToWidgetWithPagination$12.L$1 = null;
                        catalogTabsV2ScrollHelper$scrollToWidgetWithPagination$12.L$2 = null;
                        catalogTabsV2ScrollHelper$scrollToWidgetWithPagination$12.L$3 = null;
                        catalogTabsV2ScrollHelper$scrollToWidgetWithPagination$12.label = 2;
                    } else {
                        CatalogTabsV2ScrollHelper$scrollToWidgetWithPagination$1 catalogTabsV2ScrollHelper$scrollToWidgetWithPagination$14 = catalogTabsV2ScrollHelper$scrollToWidgetWithPagination$13;
                        i14 = i22;
                        i16 = i21;
                        interfaceC7238a2 = interfaceC7238a3;
                        catalogTabsV2ScrollHelper$scrollToWidgetWithPagination$12 = catalogTabsV2ScrollHelper$scrollToWidgetWithPagination$14;
                        if (!catalogTabsV2ScrollHelper.targetWidgetLoaded(targetWidgetPosition) && b11) {
                            catalogTabsV2ScrollHelper$scrollToWidgetWithPagination$12.L$0 = catalogTabsV2ScrollHelper;
                            catalogTabsV2ScrollHelper$scrollToWidgetWithPagination$12.L$1 = recyclerView2;
                            catalogTabsV2ScrollHelper$scrollToWidgetWithPagination$12.L$2 = interfaceC7851b2;
                            catalogTabsV2ScrollHelper$scrollToWidgetWithPagination$12.L$3 = interfaceC7238a2;
                            catalogTabsV2ScrollHelper$scrollToWidgetWithPagination$12.I$0 = i16;
                            catalogTabsV2ScrollHelper$scrollToWidgetWithPagination$12.I$1 = i15;
                            catalogTabsV2ScrollHelper$scrollToWidgetWithPagination$12.I$2 = i14;
                            catalogTabsV2ScrollHelper$scrollToWidgetWithPagination$12.label = 1;
                            if (catalogTabsV2ScrollHelper.waitForLoadingPage(interfaceC7238a2, interfaceC7851b2, catalogTabsV2ScrollHelper$scrollToWidgetWithPagination$12) != aVar) {
                                InterfaceC7238a<l> interfaceC7238a4 = interfaceC7238a2;
                                i21 = i16;
                                i18 = i14;
                                catalogTabsV2ScrollHelper$scrollToWidgetWithPagination$13 = catalogTabsV2ScrollHelper$scrollToWidgetWithPagination$12;
                                interfaceC7238a3 = interfaceC7238a4;
                                int i222 = i18 + 1;
                                targetWidgetPosition = catalogTabsV2ScrollHelper.targetWidgetPosition(interfaceC7238a3, i21);
                                b11 = interfaceC7238a3.b().b(true);
                                if (i222 < 20) {
                                }
                            }
                            return aVar;
                        }
                        if (!catalogTabsV2ScrollHelper.targetWidgetLoaded(targetWidgetPosition)) {
                        }
                    }
                }
            }
        }
        catalogTabsV2ScrollHelper$scrollToWidgetWithPagination$1 = new CatalogTabsV2ScrollHelper$scrollToWidgetWithPagination$1(this, dVar);
        Object obj2 = catalogTabsV2ScrollHelper$scrollToWidgetWithPagination$1.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i13 = catalogTabsV2ScrollHelper$scrollToWidgetWithPagination$1.label;
        if (i13 != 0) {
        }
    }
}
