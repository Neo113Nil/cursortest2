package ru.ozon.app.android.fresh.common.widgets.horizontalListWidget;

import A00.a;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.s;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import hi.InterfaceC6958a;
import j10.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.composer.ui.widget.l;
import xe.B0;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000*\f\b\u0000\u0010\u0003*\u00060\u0001j\u0002`\u0002*\b\b\u0001\u0010\u0005*\u00020\u0004*\f\b\u0002\u0010\b*\u00060\u0006j\u0002`\u00072\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\tB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ5\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u0015H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001a\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010!\u001a\u0004\u0018\u00018\u00022\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00028\u0002H\u0017¢\u0006\u0004\b!\u0010\"J!\u0010#\u001a\u0004\u0018\u00018\u00022\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00028\u0002H\u0016¢\u0006\u0004\b#\u0010\"J\u0013\u0010%\u001a\u00020$*\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00028\u00022\u0006\u0010 \u001a\u00028\u0002H$¢\u0006\u0004\b'\u0010(J\u001f\u0010+\u001a\u00028\u00022\u0006\u0010 \u001a\u00028\u00022\u0006\u0010*\u001a\u00020)H$¢\u0006\u0004\b+\u0010,R(\u0010/\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001e0.0-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R)\u00106\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001e0.0-8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00102¨\u00067"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/horizontalListWidget/AbstractHorizontalListViewMapper;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "C", "", "State", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "VO", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "<init>", "()V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lxe/B0;", "observePageRefresh", "(Lru/ozon/app/android/composer/ComposerReferences;)Lxe/B0;", "Landroid/view/ViewGroup;", "composerRootView", "Lru/ozon/composer/ui/widget/l;", "viewObject", "references", "Lj10/h;", "viewItemHelper", "", "constructLayout", "(Landroid/view/ViewGroup;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;)V", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Ll20/c;)Ll20/c;", "handleCustomUpdates", "Landroidx/recyclerview/widget/RecyclerView;", "customize", "(Landroidx/recyclerview/widget/RecyclerView;)Landroidx/recyclerview/widget/RecyclerView;", "onRefresh", "(Ll20/c;)Ll20/c;", "Landroid/os/Parcelable;", "newScrollState", "onScrollStateSave", "(Ll20/c;Landroid/os/Parcelable;)Ll20/c;", "", "Ljava/lang/Class;", "customSupportedUpdates", "Ljava/util/List;", "getCustomSupportedUpdates", "()Ljava/util/List;", "supportedUpdates$delegate", "LSc/j;", "getSupportedUpdates", "supportedUpdates", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class AbstractHorizontalListViewMapper<C extends InterfaceC6958a, State, VO extends c> extends WidgetViewMapper2<C, State, VO> {

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> customSupportedUpdates = K.f71697a;

    /* renamed from: supportedUpdates$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j supportedUpdates = k.b(new AbstractHorizontalListViewMapper$supportedUpdates$2(this));

    private final B0 observePageRefresh(ComposerReferences composerReferences) {
        final InterfaceC2395h<a> eventsFlow = composerReferences.getController().getEventsFlow();
        return C2399j.C(new C2408n0(new InterfaceC2395h<a>() { // from class: ru.ozon.app.android.fresh.common.widgets.horizontalListWidget.AbstractHorizontalListViewMapper$observePageRefresh$$inlined$filter$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.fresh.common.widgets.horizontalListWidget.AbstractHorizontalListViewMapper$observePageRefresh$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.fresh.common.widgets.horizontalListWidget.AbstractHorizontalListViewMapper$observePageRefresh$$inlined$filter$1$2", f = "AbstractHorizontalListViewMapper.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.fresh.common.widgets.horizontalListWidget.AbstractHorizontalListViewMapper$observePageRefresh$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.c {
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
                                a aVar2 = (a) obj;
                                if ((aVar2 instanceof a.u.b) || (aVar2 instanceof a.u.c)) {
                                    anonymousClass1.label = 1;
                                    if (interfaceC2397i.emit(obj, anonymousClass1) == aVar) {
                                        return aVar;
                                    }
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
                    Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super a> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, new AbstractHorizontalListViewMapper$observePageRefresh$2(composerReferences, null)), androidx.lifecycle.K.a(composerReferences.getContainer().g()));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    public void constructLayout(@NotNull ViewGroup composerRootView, @NotNull l viewObject, @NotNull ComposerReferences references, @NotNull h<l> viewItemHelper) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewItemHelper, "viewItemHelper");
        observePageRefresh(references);
        super.constructLayout(composerRootView, viewObject, references, viewItemHelper);
    }

    @Override // ru.ozon.composer.ui.widget.g
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        RecyclerView recyclerView = new RecyclerView(parent.getContext());
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.setNestedScrollingEnabled(false);
        return customize(recyclerView);
    }

    @NotNull
    public RecyclerView customize(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        return recyclerView;
    }

    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getCustomSupportedUpdates() {
        return this.customSupportedUpdates;
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public final List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return (List) this.supportedUpdates.getValue();
    }

    public VO handleCustomUpdates(@NotNull a.J.InterfaceC0007a update, @NotNull VO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        return null;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public VO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull VO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof ScrollStateUpdate) {
            ScrollStateUpdate scrollStateUpdate = (ScrollStateUpdate) update;
            if (scrollStateUpdate.getWidgetId() == oldItem.getId()) {
                return onScrollStateSave(oldItem, scrollStateUpdate.getScrollState());
            }
        }
        return update instanceof PageRefreshUpdate ? onRefresh(oldItem) : handleCustomUpdates(update, oldItem);
    }

    @NotNull
    protected abstract VO onRefresh(@NotNull VO oldItem);

    @NotNull
    protected abstract VO onScrollStateSave(@NotNull VO oldItem, @NotNull Parcelable newScrollState);
}
