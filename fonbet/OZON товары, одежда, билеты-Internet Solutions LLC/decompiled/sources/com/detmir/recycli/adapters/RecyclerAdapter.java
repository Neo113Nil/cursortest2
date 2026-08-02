package com.detmir.recycli.adapters;

import Bl0.g0;
import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.Keep;
import androidx.recyclerview.widget.C5470d;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.detmir.recycli.adapters.InfinityState;
import com.detmir.recycli.adapters.RecyclerAction;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006\u0084\u0001\u0085\u0001\u0086\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rJ\u0017\u0010\u0010\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\u00020\b2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001a¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001aH\u0016¢\u0006\u0004\b#\u0010$J-\u0010(\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001a2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00140&H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010(\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001aH\u0016¢\u0006\u0004\b(\u0010*J\u0017\u0010+\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u0002H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u0002H\u0016¢\u0006\u0004\b-\u0010,J\u0017\u00100\u001a\u00020\b2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J\u001d\u00102\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b2\u0010\nJ\u0015\u00103\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b3\u00104J\u0019\u00105\u001a\u0004\u0018\u00010\u00132\u0006\u0010%\u001a\u00020\u0002H\u0002¢\u0006\u0004\b5\u00106J\u0017\u00109\u001a\u0002082\u0006\u00107\u001a\u00020\u001aH\u0002¢\u0006\u0004\b9\u0010:J!\u0010=\u001a\u00020\b2\u0006\u00107\u001a\u00020\u001a2\b\b\u0002\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\b=\u0010>J\u001f\u0010?\u001a\u00020\b2\u0006\u00107\u001a\u00020\u001a2\u0006\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\b?\u0010>J\u000f\u0010@\u001a\u00020\bH\u0002¢\u0006\u0004\b@\u0010\u0004J\u000f\u0010A\u001a\u00020\bH\u0002¢\u0006\u0004\bA\u0010\u0004J\u000f\u0010B\u001a\u00020\bH\u0002¢\u0006\u0004\bB\u0010\u0004J\u000f\u0010C\u001a\u00020\bH\u0002¢\u0006\u0004\bC\u0010\u0004J\u000f\u0010D\u001a\u00020\u001aH\u0002¢\u0006\u0004\bD\u0010$J\u000f\u0010E\u001a\u00020;H\u0002¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020;H\u0002¢\u0006\u0004\bG\u0010FJ\u000f\u0010H\u001a\u00020;H\u0002¢\u0006\u0004\bH\u0010FJ\u000f\u0010I\u001a\u00020;H\u0002¢\u0006\u0004\bI\u0010FJ\u000f\u0010J\u001a\u00020;H\u0002¢\u0006\u0004\bJ\u0010FJ\u000f\u0010K\u001a\u00020;H\u0002¢\u0006\u0004\bK\u0010FR$\u0010M\u001a\u0004\u0018\u00010L8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR$\u0010T\u001a\u0004\u0018\u00010S8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\"\u0010[\u001a\u00020Z8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R$\u0010/\u001a\u0004\u0018\u00010.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u00101R0\u0010f\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020e\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010\u0017R0\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010g\u001a\u0004\bk\u0010i\"\u0004\bl\u0010\u0017R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010mR\u001a\u0010n\u001a\b\u0012\u0004\u0012\u00020\u00060&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010mR\u001a\u0010o\u001a\b\u0012\u0004\u0012\u00020\u00060&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010mR\u0016\u0010q\u001a\u00020p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010sR\u0017\u0010u\u001a\u00020t8\u0006¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010xR\u0014\u0010z\u001a\u00020y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R\u0014\u0010}\u001a\u00020|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R&\u0010\u0081\u0001\u001a\u0011\u0012\r\u0012\u000b \u0080\u0001*\u0004\u0018\u00010\u00060\u00060\u007f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001c\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020\u00060&8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010m¨\u0006\u0087\u0001"}, d2 = {"Lcom/detmir/recycli/adapters/RecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Landroidx/recyclerview/widget/RecyclerView$C;", "<init>", "()V", "", "Lcom/detmir/recycli/adapters/RecyclerItem;", "items", "", "bindState", "(Ljava/util/List;)V", "Lcom/detmir/recycli/adapters/InfinityState;", "infinityState", "(Lcom/detmir/recycli/adapters/InfinityState;)V", "Lcom/detmir/recycli/adapters/RecyclerAction;", "action", "bindAction", "(Lcom/detmir/recycli/adapters/RecyclerAction;)V", "", "", "", "firstAppearanceListeners", "addFirstAppearanceListeners", "(Ljava/util/Map;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$C;", "position", "getItemViewType", "(I)I", "getItem", "(I)Lcom/detmir/recycli/adapters/RecyclerItem;", "getItemCount", "()I", "holder", "", "payloads", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$C;ILjava/util/List;)V", "(Landroidx/recyclerview/widget/RecyclerView$C;I)V", "onViewDetachedFromWindow", "(Landroidx/recyclerview/widget/RecyclerView$C;)V", "onViewAttachedToWindow", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "onAttachedToRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "bindRecyclerItems", "getCurrentList", "()Ljava/util/List;", "getId", "(Landroidx/recyclerview/widget/RecyclerView$C;)Ljava/lang/String;", "pos", "Landroidx/recyclerview/widget/RecyclerView$z;", "getScroller", "(I)Landroidx/recyclerview/widget/RecyclerView$z;", "", "smooth", "scrollToPos", "(IZ)V", "actuallyDoScroll", "postProcess", "tryInfinity", "checkNeedLoad", "rangeLoading", "getCurrentPage", "isLoading", "()Z", "isEndReached", "isLoadingError", "isInfiniteByButton", "isInfiniteByScroll", "isInfinity", "Lcom/detmir/recycli/adapters/RecyclerAdapter$c;", "infinityCallbacks", "Lcom/detmir/recycli/adapters/RecyclerAdapter$c;", "getInfinityCallbacks", "()Lcom/detmir/recycli/adapters/RecyclerAdapter$c;", "setInfinityCallbacks", "(Lcom/detmir/recycli/adapters/RecyclerAdapter$c;)V", "Lcom/detmir/recycli/adapters/RecyclerBottomLoading;", "bottomLoading", "Lcom/detmir/recycli/adapters/RecyclerBottomLoading;", "getBottomLoading", "()Lcom/detmir/recycli/adapters/RecyclerBottomLoading;", "setBottomLoading", "(Lcom/detmir/recycli/adapters/RecyclerBottomLoading;)V", "Lcom/detmir/recycli/adapters/RecyclerAdapter$d;", "infinityType", "Lcom/detmir/recycli/adapters/RecyclerAdapter$d;", "getInfinityType", "()Lcom/detmir/recycli/adapters/RecyclerAdapter$d;", "setInfinityType", "(Lcom/detmir/recycli/adapters/RecyclerAdapter$d;)V", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerView", "Lcom/detmir/recycli/adapters/RecyclerAdapter$b;", "attachListeners", "Ljava/util/Map;", "getAttachListeners", "()Ljava/util/Map;", "setAttachListeners", "getFirstAppearanceListeners", "setFirstAppearanceListeners", "Ljava/util/List;", "itemsAtTop", "itemsAtBottom", "Ljava/lang/Runnable;", "scrollChecker", "Ljava/lang/Runnable;", "Lcom/detmir/recycli/adapters/InfinityState;", "Lcom/detmir/recycli/adapters/RecyclerBaseAdapter;", "recyclerBaseAdapter", "Lcom/detmir/recycli/adapters/RecyclerBaseAdapter;", "getRecyclerBaseAdapter", "()Lcom/detmir/recycli/adapters/RecyclerBaseAdapter;", "Lcom/detmir/recycli/adapters/RecyclerDiffCallback;", "recyclerDiffCallback", "Lcom/detmir/recycli/adapters/RecyclerDiffCallback;", "Lcom/detmir/recycli/adapters/RecyclerDiffItemCallback;", "recyclerDiffItemCallback", "Lcom/detmir/recycli/adapters/RecyclerDiffItemCallback;", "Landroidx/recyclerview/widget/d;", "kotlin.jvm.PlatformType", "differ", "Landroidx/recyclerview/widget/d;", "combinedItems", "b", "c", "d", "recycli_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public class RecyclerAdapter extends RecyclerView.g<RecyclerView.C> {
    private Map<String, ? extends b> attachListeners;
    private RecyclerBottomLoading bottomLoading;

    @NotNull
    private final List<RecyclerItem> combinedItems;

    @NotNull
    private final C5470d<RecyclerItem> differ;
    private Map<String, Object> firstAppearanceListeners;
    private c infinityCallbacks;
    private InfinityState infinityState;

    @NotNull
    private final RecyclerDiffItemCallback recyclerDiffItemCallback;
    private RecyclerView recyclerView;

    @NotNull
    private d infinityType = d.SCROLL;

    @NotNull
    private final List<RecyclerItem> items = new ArrayList();

    @NotNull
    private final List<RecyclerItem> itemsAtTop = new ArrayList();

    @NotNull
    private final List<RecyclerItem> itemsAtBottom = new ArrayList();

    @NotNull
    private Runnable scrollChecker = new g0(this, 3);

    @NotNull
    private final RecyclerBaseAdapter recyclerBaseAdapter = new RecyclerBaseAdapter(new a());

    @NotNull
    private final RecyclerDiffCallback recyclerDiffCallback = new RecyclerDiffCallback();

    static final class a extends AbstractC7737t implements Function1<Integer, RecyclerItem> {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final RecyclerItem invoke(Integer num) {
            return (RecyclerItem) RecyclerAdapter.this.getCurrentList().get(num.intValue());
        }
    }

    public interface b {
        void onViewAttachedToWindow();

        void onViewDetachedFromWindow();
    }

    public interface c {
        void loadRange(int i11);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {
        private static final /* synthetic */ d[] $VALUES;
        public static final d BUTTON;
        public static final d SCROLL;

        static {
            d dVar = new d("SCROLL", 0);
            SCROLL = dVar;
            d dVar2 = new d("BUTTON", 1);
            BUTTON = dVar2;
            $VALUES = new d[]{dVar, dVar2};
        }

        private d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }
    }

    public /* synthetic */ class e {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f57702a;

        static {
            int[] iArr = new int[InfinityState.a.values().length];
            try {
                iArr[InfinityState.a.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InfinityState.a.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InfinityState.a.IDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f57702a = iArr;
        }
    }

    public static final class f extends r {
        @Override // androidx.recyclerview.widget.r
        protected final int getVerticalSnapPreference() {
            return -1;
        }
    }

    public static final class g extends RecyclerView.t {
        g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i11) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            RecyclerAdapter recyclerAdapter = RecyclerAdapter.this;
            if (recyclerAdapter.isLoadingError() || recyclerAdapter.isLoading()) {
                return;
            }
            recyclerAdapter.tryInfinity();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrolled(@NotNull RecyclerView recyclerView, int i11, int i12) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            RecyclerAdapter recyclerAdapter = RecyclerAdapter.this;
            if (recyclerAdapter.isLoadingError() || recyclerAdapter.isLoading()) {
                return;
            }
            recyclerAdapter.tryInfinity();
        }
    }

    static final class h extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InfinityState f57705c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(InfinityState infinityState) {
            super(0);
            this.f57705c = infinityState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            c infinityCallbacks = RecyclerAdapter.this.getInfinityCallbacks();
            if (infinityCallbacks != null) {
                infinityCallbacks.loadRange(this.f57705c.getPage());
            }
            return Unit.f71690a;
        }
    }

    static final class i extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InfinityState f57707c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(InfinityState infinityState) {
            super(0);
            this.f57707c = infinityState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            c infinityCallbacks = RecyclerAdapter.this.getInfinityCallbacks();
            if (infinityCallbacks != null) {
                infinityCallbacks.loadRange(this.f57707c.getPage() + 1);
            }
            return Unit.f71690a;
        }
    }

    public RecyclerAdapter() {
        RecyclerDiffItemCallback recyclerDiffItemCallback = new RecyclerDiffItemCallback();
        this.recyclerDiffItemCallback = recyclerDiffItemCallback;
        this.differ = new C5470d<>(this, recyclerDiffItemCallback);
        this.combinedItems = new ArrayList();
    }

    private final void actuallyDoScroll(int pos, boolean smooth) {
        RecyclerView.o layoutManager;
        RecyclerView.g adapter;
        RecyclerView recyclerView = this.recyclerView;
        int itemCount = (recyclerView == null || (adapter = recyclerView.getAdapter()) == null) ? 0 : adapter.getItemCount();
        if (pos < 0 || pos >= itemCount) {
            return;
        }
        try {
            RecyclerView recyclerView2 = this.recyclerView;
            if (recyclerView2 == null || (layoutManager = recyclerView2.getLayoutManager()) == null) {
                return;
            }
            if (smooth) {
                layoutManager.startSmoothScroll(getScroller(pos));
            } else {
                layoutManager.scrollToPosition(pos);
            }
        } catch (Exception unused) {
        }
    }

    private final void bindRecyclerItems(List<? extends RecyclerItem> items) {
        RecyclerView recyclerView;
        new ArrayList().addAll(this.combinedItems);
        this.itemsAtBottom.clear();
        this.itemsAtTop.clear();
        this.items.clear();
        this.items.addAll(items);
        postProcess();
        this.differ.e(C7714v.p0(this.itemsAtBottom, C7714v.p0(items, this.itemsAtTop)), null);
        RecyclerView recyclerView2 = this.recyclerView;
        if ((recyclerView2 != null ? recyclerView2.getAdapter() : null) != null || (recyclerView = this.recyclerView) == null) {
            return;
        }
        recyclerView.setAdapter(this);
    }

    private final void checkNeedLoad() {
        if (isLoading() || isEndReached()) {
            return;
        }
        RecyclerView recyclerView = this.recyclerView;
        RecyclerView.o layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        Intrinsics.g(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int childCount = linearLayoutManager.getChildCount();
        int itemCount = linearLayoutManager.getItemCount();
        if (linearLayoutManager.getStackFromEnd()) {
            if (linearLayoutManager.findFirstVisibleItemPosition() < 5) {
                rangeLoading();
            }
        } else if (linearLayoutManager.findFirstVisibleItemPosition() + childCount >= itemCount - 5) {
            rangeLoading();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<RecyclerItem> getCurrentList() {
        List<RecyclerItem> b11 = this.differ.b();
        Intrinsics.checkNotNullExpressionValue(b11, "{\n            differ.currentList\n        }");
        return b11;
    }

    private final int getCurrentPage() {
        InfinityState infinityState = this.infinityState;
        if (infinityState != null) {
            return infinityState.getPage();
        }
        return 0;
    }

    private final String getId(RecyclerView.C holder) {
        RecyclerView recyclerView = this.recyclerView;
        int childAdapterPosition = recyclerView != null ? recyclerView.getChildAdapterPosition(holder.itemView) : 0;
        if (childAdapterPosition < 0 || childAdapterPosition >= getCurrentList().size()) {
            return null;
        }
        return getCurrentList().get(childAdapterPosition).provideId();
    }

    private final RecyclerView.z getScroller(int pos) {
        RecyclerView recyclerView = this.recyclerView;
        f fVar = new f(recyclerView != null ? recyclerView.getContext() : null);
        fVar.setTargetPosition(pos);
        return fVar;
    }

    private final boolean isEndReached() {
        InfinityState infinityState = this.infinityState;
        return infinityState != null && infinityState.getEndReached();
    }

    private final boolean isInfiniteByButton() {
        return isInfinity() && this.infinityType == d.BUTTON;
    }

    private final boolean isInfiniteByScroll() {
        return isInfinity() && this.infinityType == d.SCROLL;
    }

    private final boolean isInfinity() {
        return this.infinityCallbacks != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isLoading() {
        InfinityState infinityState = this.infinityState;
        return (infinityState != null ? infinityState.getRequestState() : null) == InfinityState.a.LOADING;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isLoadingError() {
        InfinityState infinityState = this.infinityState;
        return (infinityState != null ? infinityState.getRequestState() : null) == InfinityState.a.ERROR;
    }

    private final void postProcess() {
        RecyclerBottomLoading recyclerBottomLoading;
        RecyclerItem provideProgress;
        RecyclerBottomLoading recyclerBottomLoading2;
        RecyclerItem provideError;
        RecyclerBottomLoading recyclerBottomLoading3;
        RecyclerItem provideDummy;
        RecyclerItem provideButton;
        InfinityState infinityState = this.infinityState;
        if (infinityState != null) {
            int i11 = e.f57702a[infinityState.getRequestState().ordinal()];
            if (i11 == 1) {
                if (infinityState.getPage() <= 0 || infinityState.getItems().isEmpty() || (recyclerBottomLoading = this.bottomLoading) == null || (provideProgress = recyclerBottomLoading.provideProgress()) == null) {
                    return;
                }
                this.itemsAtBottom.add(provideProgress);
                return;
            }
            if (i11 == 2) {
                if (infinityState.getPage() <= 0 || infinityState.getItems().isEmpty() || (recyclerBottomLoading2 = this.bottomLoading) == null || (provideError = recyclerBottomLoading2.provideError(new h(infinityState))) == null) {
                    return;
                }
                this.itemsAtBottom.add(provideError);
                return;
            }
            if (i11 != 3) {
                return;
            }
            if (isInfiniteByButton() && !infinityState.getItems().isEmpty() && !infinityState.getEndReached()) {
                RecyclerBottomLoading recyclerBottomLoading4 = this.bottomLoading;
                if (recyclerBottomLoading4 == null || (provideButton = recyclerBottomLoading4.provideButton(new i(infinityState))) == null) {
                    return;
                }
                this.itemsAtBottom.add(provideButton);
                return;
            }
            if (!isInfiniteByScroll() || infinityState.getItems().isEmpty() || infinityState.getEndReached() || (recyclerBottomLoading3 = this.bottomLoading) == null || (provideDummy = recyclerBottomLoading3.provideDummy()) == null) {
                return;
            }
            this.itemsAtBottom.add(provideDummy);
        }
    }

    private final void rangeLoading() {
        int currentPage = getCurrentPage();
        if (isLoading()) {
            return;
        }
        if (!isLoadingError()) {
            currentPage++;
        }
        c cVar = this.infinityCallbacks;
        if (cVar != null) {
            cVar.loadRange(currentPage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scrollChecker$lambda$0(RecyclerAdapter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.checkNeedLoad();
    }

    private final void scrollToPos(final int pos, final boolean smooth) {
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView != null) {
            recyclerView.post(new Runnable() { // from class: com.detmir.recycli.adapters.a
                @Override // java.lang.Runnable
                public final void run() {
                    RecyclerAdapter.scrollToPos$lambda$4(RecyclerAdapter.this, pos, smooth);
                }
            });
        }
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 != null) {
            recyclerView2.postDelayed(new Runnable() { // from class: com.detmir.recycli.adapters.b
                @Override // java.lang.Runnable
                public final void run() {
                    RecyclerAdapter.scrollToPos$lambda$5(RecyclerAdapter.this, pos, smooth);
                }
            }, 300L);
        }
    }

    static /* synthetic */ void scrollToPos$default(RecyclerAdapter recyclerAdapter, int i11, boolean z11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scrollToPos");
        }
        if ((i12 & 2) != 0) {
            z11 = true;
        }
        recyclerAdapter.scrollToPos(i11, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scrollToPos$lambda$4(RecyclerAdapter this$0, int i11, boolean z11) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        RecyclerView recyclerView = this$0.recyclerView;
        if (recyclerView == null || !recyclerView.isAttachedToWindow()) {
            return;
        }
        this$0.actuallyDoScroll(i11, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scrollToPos$lambda$5(RecyclerAdapter this$0, int i11, boolean z11) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        RecyclerView recyclerView = this$0.recyclerView;
        if (recyclerView == null || !recyclerView.isAttachedToWindow()) {
            return;
        }
        this$0.actuallyDoScroll(i11, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tryInfinity() {
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView != null) {
            recyclerView.removeCallbacks(new YJ.e(this, 2));
        }
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 != null) {
            recyclerView2.post(this.scrollChecker);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tryInfinity$lambda$11(RecyclerAdapter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Runnable runnable = this$0.scrollChecker;
    }

    public final void addFirstAppearanceListeners(@NotNull Map<String, Object> firstAppearanceListeners) {
        Intrinsics.checkNotNullParameter(firstAppearanceListeners, "firstAppearanceListeners");
        this.firstAppearanceListeners = U.t(firstAppearanceListeners);
    }

    public final void bindAction(RecyclerAction action) {
        if (action instanceof RecyclerAction.a) {
            List<RecyclerItem> currentList = getCurrentList();
            ((RecyclerAction.a) action).getClass();
            scrollToPos$default(this, currentList.indexOf(null), false, 2, null);
        } else if (action instanceof RecyclerAction.b) {
            scrollToPos(0, ((RecyclerAction.b) action).a());
        }
    }

    public final void bindState(@NotNull List<? extends RecyclerItem> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        if (this.infinityCallbacks != null) {
            throw new Exception("You are trying to bind non infinity state on infinity adapter");
        }
        bindRecyclerItems(items);
    }

    public final Map<String, b> getAttachListeners() {
        return this.attachListeners;
    }

    public final RecyclerBottomLoading getBottomLoading() {
        return this.bottomLoading;
    }

    public final Map<String, Object> getFirstAppearanceListeners() {
        return this.firstAppearanceListeners;
    }

    public final c getInfinityCallbacks() {
        return this.infinityCallbacks;
    }

    @NotNull
    public final d getInfinityType() {
        return this.infinityType;
    }

    @NotNull
    public final RecyclerItem getItem(int position) {
        return getCurrentList().get(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemCount() {
        return getCurrentList().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        return this.recyclerBaseAdapter.getItemViewType(position);
    }

    @NotNull
    public final RecyclerBaseAdapter getRecyclerBaseAdapter() {
        return this.recyclerBaseAdapter;
    }

    public final RecyclerView getRecyclerView() {
        return this.recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.recyclerView = recyclerView;
        RecyclerBaseAdapter recyclerBaseAdapter = this.recyclerBaseAdapter;
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "recyclerView.context");
        recyclerBaseAdapter.warmUpBinders(context);
        if (isInfinity()) {
            recyclerView.addOnScrollListener(new g());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull RecyclerView.C holder, int position, @NotNull List<Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        this.recyclerBaseAdapter.onBindViewHolder(holder, position, payloads);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public RecyclerView.C onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return this.recyclerBaseAdapter.onCreateViewHolder(parent, viewType);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onViewAttachedToWindow(@NotNull RecyclerView.C holder) {
        String id2;
        b bVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Map<String, ? extends b> map = this.attachListeners;
        if (map != null && (id2 = getId(holder)) != null && (bVar = map.get(id2)) != null) {
            bVar.onViewAttachedToWindow();
        }
        super.onViewAttachedToWindow(holder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onViewDetachedFromWindow(@NotNull RecyclerView.C holder) {
        String id2;
        b bVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Map<String, ? extends b> map = this.attachListeners;
        if (map != null && (id2 = getId(holder)) != null && (bVar = map.get(id2)) != null) {
            bVar.onViewDetachedFromWindow();
        }
        super.onViewDetachedFromWindow(holder);
    }

    public final void setAttachListeners(Map<String, ? extends b> map) {
        this.attachListeners = map;
    }

    public final void setBottomLoading(RecyclerBottomLoading recyclerBottomLoading) {
        this.bottomLoading = recyclerBottomLoading;
    }

    public final void setFirstAppearanceListeners(Map<String, Object> map) {
        this.firstAppearanceListeners = map;
    }

    public final void setInfinityCallbacks(c cVar) {
        this.infinityCallbacks = cVar;
    }

    public final void setInfinityType(@NotNull d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        this.infinityType = dVar;
    }

    public final void setRecyclerView(RecyclerView recyclerView) {
        this.recyclerView = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull RecyclerView.C holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        this.recyclerBaseAdapter.onBindViewHolder(holder, position);
    }

    public final void bindState(@NotNull InfinityState infinityState) {
        Intrinsics.checkNotNullParameter(infinityState, "infinityState");
        if (this.infinityCallbacks != null) {
            this.infinityState = infinityState;
            bindRecyclerItems(infinityState.getItems());
            return;
        }
        throw new Exception("You are trying to bind infinity state on non infinity adapter");
    }
}
