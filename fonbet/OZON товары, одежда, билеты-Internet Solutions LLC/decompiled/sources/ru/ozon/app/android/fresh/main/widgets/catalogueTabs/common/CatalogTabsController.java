package ru.ozon.app.android.fresh.main.widgets.catalogueTabs.common;

import Ae.C2399j;
import Ae.C2408n0;
import De.C2862e;
import He.b;
import Sc.s;
import Wc.a;
import a00.C4911f;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.common.scroll.ScrollTabAnchor;
import ru.ozon.app.android.fresh.navigation.CatalogTabsEvent;
import ru.ozon.app.android.fresh.navigation.CatalogTabsSharedViewModel;
import xe.C10720e0;
import xe.InterfaceC10756x;
import xe.M;
import xe.N;
import xe.X0;
import ze.C11115c;
import ze.EnumC11113a;
import ze.h;
import ze.k;
import ze.w;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 D2\u00020\u0001:\u0002DEB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001b\u001a\u00020\b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u000fR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R \u0010%\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010'\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b.\u0010/\u0012\u0004\b0\u0010\u000fR\u0014\u00101\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010/R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u0006028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001e\u00106\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0017\u0010;\u001a\u00020:8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0016\u0010@\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u001c\u0010B\u001a\u00020\u000b8B@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bB\u00109\u001a\u0004\bC\u0010\r¨\u0006F"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/common/CatalogTabsController;", "", "Lru/ozon/app/android/fresh/navigation/CatalogTabsSharedViewModel;", "catalogTabsSharedViewModel", "<init>", "(Lru/ozon/app/android/fresh/navigation/CatalogTabsSharedViewModel;)V", "Lru/ozon/app/android/fresh/navigation/CatalogTabsEvent;", "event", "", "updateTabs", "(Lru/ozon/app/android/fresh/navigation/CatalogTabsEvent;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "calculateFocusLine", "()I", "cancel", "()V", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "setComposerRefs", "(Lru/ozon/app/android/composer/ComposerReferences;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "attachRecyclerListener", "(Landroidx/recyclerview/widget/RecyclerView;)V", "", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/common/scroll/ScrollTabAnchor;", "allTabs", "initTabs", "(Ljava/util/List;)V", "onUserClickedTab", "Lze/h;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/common/SelectTabEvent;", "selectedTabState", "Lze/h;", "", "", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/common/CatalogTabsController$VisibleVerticalRect;", "allKeyPosition", "Ljava/util/Map;", "composerRefs", "Lru/ozon/app/android/composer/ComposerReferences;", "Ljava/util/List;", "Lxe/x;", "commonJob", "Lxe/x;", "Lxe/M;", "updateScope", "Lxe/M;", "getUpdateScope$annotations", "selectedTabScope", "Lze/w;", "receiverChannel", "Lze/w;", "Ljava/lang/ref/WeakReference;", "composerRecyclerRef", "Ljava/lang/ref/WeakReference;", "scrollDy", "I", "Landroidx/recyclerview/widget/RecyclerView$t;", "recyclerListener", "Landroidx/recyclerview/widget/RecyclerView$t;", "getRecyclerListener", "()Landroidx/recyclerview/widget/RecyclerView$t;", "", "blockUpdateEvents", "Z", "focusLine", "getFocusLine", "Companion", "VisibleVerticalRect", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CatalogTabsController {

    @NotNull
    private final Map<String, VisibleVerticalRect> allKeyPosition;
    private List<? extends ScrollTabAnchor> allTabs;
    private boolean blockUpdateEvents;

    @NotNull
    private final InterfaceC10756x commonJob;
    private WeakReference<RecyclerView> composerRecyclerRef;
    private ComposerReferences composerRefs;
    private int focusLine;

    @NotNull
    private final w<CatalogTabsEvent> receiverChannel;

    @NotNull
    private final RecyclerView.t recyclerListener;
    private int scrollDy;

    @NotNull
    private final M selectedTabScope;

    @NotNull
    private final h<SelectTabEvent> selectedTabState;

    @NotNull
    private final M updateScope;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/fresh/navigation/CatalogTabsEvent;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.fresh.main.widgets.catalogueTabs.common.CatalogTabsController$1", f = "CatalogTabsController.kt", l = {88}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.fresh.main.widgets.catalogueTabs.common.CatalogTabsController$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<CatalogTabsEvent, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = CatalogTabsController.this.new AnonymousClass1(dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            VisibleVerticalRect visibleVerticalRect;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                CatalogTabsEvent catalogTabsEvent = (CatalogTabsEvent) this.L$0;
                VisibleVerticalRect visibleVerticalRect2 = (VisibleVerticalRect) CatalogTabsController.this.allKeyPosition.get(catalogTabsEvent.getCatalogueTabsConnectionTag());
                if (visibleVerticalRect2 == null || catalogTabsEvent.getViewVisibleRect().top != visibleVerticalRect2.getTop() || (visibleVerticalRect = (VisibleVerticalRect) CatalogTabsController.this.allKeyPosition.get(catalogTabsEvent.getCatalogueTabsConnectionTag())) == null || catalogTabsEvent.getViewVisibleRect().bottom != visibleVerticalRect.getBottom()) {
                    CatalogTabsController catalogTabsController = CatalogTabsController.this;
                    this.label = 1;
                    if (catalogTabsController.updateTabs(catalogTabsEvent, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CatalogTabsEvent catalogTabsEvent, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(catalogTabsEvent, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/common/SelectTabEvent;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.fresh.main.widgets.catalogueTabs.common.CatalogTabsController$2", f = "CatalogTabsController.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.fresh.main.widgets.catalogueTabs.common.CatalogTabsController$2, reason: invalid class name */
    static final class AnonymousClass2 extends j implements Function2<SelectTabEvent, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(d<? super AnonymousClass2> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass2 anonymousClass2 = CatalogTabsController.this.new AnonymousClass2(dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            InterfaceC7851b controller;
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            SelectTabEvent selectTabEvent = (SelectTabEvent) this.L$0;
            ComposerReferences composerReferences = CatalogTabsController.this.composerRefs;
            if (composerReferences != null && (controller = composerReferences.getController()) != null) {
                controller.update(new SelectTabEvent(selectTabEvent.getScrollKey()));
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SelectTabEvent selectTabEvent, d<? super Unit> dVar) {
            return ((AnonymousClass2) create(selectTabEvent, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/common/CatalogTabsController$VisibleVerticalRect;", "", "", "top", "bottom", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTop", "getBottom", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class VisibleVerticalRect {
        private final int bottom;
        private final int top;

        public VisibleVerticalRect(int i11, int i12) {
            this.top = i11;
            this.bottom = i12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VisibleVerticalRect)) {
                return false;
            }
            VisibleVerticalRect visibleVerticalRect = (VisibleVerticalRect) other;
            return this.top == visibleVerticalRect.top && this.bottom == visibleVerticalRect.bottom;
        }

        public final int getBottom() {
            return this.bottom;
        }

        public final int getTop() {
            return this.top;
        }

        public int hashCode() {
            return Integer.hashCode(this.bottom) + (Integer.hashCode(this.top) * 31);
        }

        @NotNull
        public String toString() {
            return Cm.e.c("VisibleVerticalRect(top=", this.top, ", bottom=", ")", this.bottom);
        }
    }

    public CatalogTabsController(@NotNull CatalogTabsSharedViewModel catalogTabsSharedViewModel) {
        Intrinsics.checkNotNullParameter(catalogTabsSharedViewModel, "catalogTabsSharedViewModel");
        C11115c a11 = k.a(0, 5, EnumC11113a.DROP_OLDEST);
        this.selectedTabState = a11;
        this.allKeyPosition = new LinkedHashMap();
        InterfaceC10756x b11 = X0.b();
        this.commonJob = b11;
        C10720e0 c10720e0 = C10720e0.f105451a;
        C2862e a12 = N.a(b.f10879b.w(1).plus(b11));
        this.updateScope = a12;
        C2862e a13 = N.a(De.s.f6650a.plus(b11));
        this.selectedTabScope = a13;
        h<CatalogTabsEvent> channel = catalogTabsSharedViewModel.getChannel();
        this.receiverChannel = channel;
        this.recyclerListener = new RecyclerView.t() { // from class: ru.ozon.app.android.fresh.main.widgets.catalogueTabs.common.CatalogTabsController$recyclerListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                super.onScrollStateChanged(recyclerView, newState);
                if (newState == 0) {
                    CatalogTabsController.this.blockUpdateEvents = false;
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                super.onScrolled(recyclerView, dx, dy);
                CatalogTabsController.this.scrollDy = dy;
            }
        };
        C2399j.C(new C2408n0(C2399j.H(channel), new AnonymousClass1(null)), a12);
        C2399j.C(new C2408n0(C2399j.o(C2399j.k(a11)), new AnonymousClass2(null)), a13);
    }

    private final int calculateFocusLine() {
        C4911f container;
        ComponentCallbacksC5392m c11;
        Context context;
        Resources resources;
        DisplayMetrics displayMetrics;
        ComposerReferences composerReferences = this.composerRefs;
        return (int) (((composerReferences == null || (container = composerReferences.getContainer()) == null || (c11 = container.c()) == null || (context = c11.getContext()) == null || (resources = context.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? 0 : displayMetrics.heightPixels) * 0.3d);
    }

    private final int getFocusLine() {
        if (this.focusLine == 0) {
            this.focusLine = calculateFocusLine();
        }
        return this.focusLine;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01fa, code lost:
    
        if (r10.n(r2, r0) == r1) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0111, code lost:
    
        if (r9.n(r2, r0) == r1) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01fc, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateTabs(CatalogTabsEvent catalogTabsEvent, d<? super Unit> dVar) {
        CatalogTabsController$updateTabs$1 catalogTabsController$updateTabs$1;
        int i11;
        List<? extends ScrollTabAnchor> list;
        List<? extends ScrollTabAnchor> list2;
        ScrollTabAnchor scrollTabAnchor;
        if (dVar instanceof CatalogTabsController$updateTabs$1) {
            catalogTabsController$updateTabs$1 = (CatalogTabsController$updateTabs$1) dVar;
            int i12 = catalogTabsController$updateTabs$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                catalogTabsController$updateTabs$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = catalogTabsController$updateTabs$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = catalogTabsController$updateTabs$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    String catalogueTabsConnectionTag = catalogTabsEvent.getCatalogueTabsConnectionTag();
                    if (catalogueTabsConnectionTag != null) {
                        this.allKeyPosition.put(catalogueTabsConnectionTag, new VisibleVerticalRect(catalogTabsEvent.getViewVisibleRect().top, catalogTabsEvent.getViewVisibleRect().bottom));
                    }
                    if (this.blockUpdateEvents) {
                        return Unit.f71690a;
                    }
                    Object obj2 = null;
                    if (this.scrollDy > 0) {
                        Map<String, VisibleVerticalRect> map = this.allKeyPosition;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry<String, VisibleVerticalRect> entry : map.entrySet()) {
                            if (entry.getValue().getBottom() > 0 && entry.getValue().getTop() <= getFocusLine()) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        Iterator it = linkedHashMap.entrySet().iterator();
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (it.hasNext()) {
                                int focusLine = (getFocusLine() - ((VisibleVerticalRect) ((Map.Entry) obj2).getValue()).getTop()) - this.scrollDy;
                                do {
                                    Object next = it.next();
                                    int focusLine2 = (getFocusLine() - ((VisibleVerticalRect) ((Map.Entry) next).getValue()).getTop()) - this.scrollDy;
                                    if (focusLine > focusLine2) {
                                        obj2 = next;
                                        focusLine = focusLine2;
                                    }
                                } while (it.hasNext());
                            }
                        }
                        Map.Entry entry2 = (Map.Entry) obj2;
                        if (entry2 != null) {
                            h<SelectTabEvent> hVar = this.selectedTabState;
                            SelectTabEvent selectTabEvent = new SelectTabEvent(((String) entry2.getKey()).hashCode());
                            catalogTabsController$updateTabs$1.label = 1;
                        }
                    } else {
                        Map<String, VisibleVerticalRect> map2 = this.allKeyPosition;
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (Map.Entry<String, VisibleVerticalRect> entry3 : map2.entrySet()) {
                            if (entry3.getValue().getBottom() > 0 && entry3.getValue().getTop() > getFocusLine()) {
                                linkedHashMap2.put(entry3.getKey(), entry3.getValue());
                            }
                        }
                        Iterator it2 = linkedHashMap2.entrySet().iterator();
                        if (it2.hasNext()) {
                            obj2 = it2.next();
                            if (it2.hasNext()) {
                                int top = (((VisibleVerticalRect) ((Map.Entry) obj2).getValue()).getTop() + this.scrollDy) - getFocusLine();
                                do {
                                    Object next2 = it2.next();
                                    int top2 = (((VisibleVerticalRect) ((Map.Entry) next2).getValue()).getTop() + this.scrollDy) - getFocusLine();
                                    if (top > top2) {
                                        obj2 = next2;
                                        top = top2;
                                    }
                                } while (it2.hasNext());
                            }
                        }
                        Map.Entry entry4 = (Map.Entry) obj2;
                        if (entry4 != null && (list = this.allTabs) != null) {
                            Iterator<? extends ScrollTabAnchor> it3 = list.iterator();
                            int i13 = 0;
                            while (true) {
                                if (!it3.hasNext()) {
                                    i13 = -1;
                                    break;
                                }
                                if (it3.next().getWidgetScrollKey() == ((String) entry4.getKey()).hashCode()) {
                                    break;
                                }
                                i13++;
                            }
                            if (i13 > 0 && (list2 = this.allTabs) != null && (scrollTabAnchor = (ScrollTabAnchor) C7714v.Q(i13 - 1, list2)) != null) {
                                int widgetScrollKey = scrollTabAnchor.getWidgetScrollKey();
                                h<SelectTabEvent> hVar2 = this.selectedTabState;
                                SelectTabEvent selectTabEvent2 = new SelectTabEvent(widgetScrollKey);
                                catalogTabsController$updateTabs$1.label = 2;
                            }
                        }
                    }
                } else {
                    if (i11 != 1 && i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                return Unit.f71690a;
            }
        }
        catalogTabsController$updateTabs$1 = new CatalogTabsController$updateTabs$1(this, dVar);
        Object obj3 = catalogTabsController$updateTabs$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = catalogTabsController$updateTabs$1.label;
        if (i11 != 0) {
        }
        return Unit.f71690a;
    }

    public final void attachRecyclerListener(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        WeakReference<RecyclerView> weakReference = this.composerRecyclerRef;
        RecyclerView recyclerView2 = weakReference != null ? weakReference.get() : null;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.removeOnScrollListener(this.recyclerListener);
        }
        recyclerView.addOnScrollListener(this.recyclerListener);
        this.composerRecyclerRef = new WeakReference<>(recyclerView);
    }

    public final void cancel() {
        RecyclerView recyclerView;
        WeakReference<RecyclerView> weakReference = this.composerRecyclerRef;
        if (weakReference != null && (recyclerView = weakReference.get()) != null) {
            recyclerView.removeOnScrollListener(this.recyclerListener);
        }
        this.composerRecyclerRef = null;
        N.c(this.selectedTabScope, null);
        N.c(this.updateScope, null);
    }

    @NotNull
    public final RecyclerView.t getRecyclerListener() {
        return this.recyclerListener;
    }

    public final void initTabs(@NotNull List<? extends ScrollTabAnchor> allTabs) {
        Intrinsics.checkNotNullParameter(allTabs, "allTabs");
        this.allTabs = allTabs;
    }

    public final void onUserClickedTab() {
        this.blockUpdateEvents = true;
    }

    public final void setComposerRefs(@NotNull ComposerReferences composerReferences) {
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        this.composerRefs = composerReferences;
    }
}
