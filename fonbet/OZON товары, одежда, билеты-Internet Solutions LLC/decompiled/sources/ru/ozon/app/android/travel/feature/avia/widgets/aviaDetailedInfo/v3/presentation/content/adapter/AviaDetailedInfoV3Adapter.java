package ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.presentation.content.adapter;

import Ej.b;
import F3.G;
import Sc.o;
import WZ.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import gk0.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.R$id;
import ru.ozon.app.android.travel.feature.avia.shared.flightDetails.FlightDetailsView;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.presentation.content.AviaDetailedInfoV3ListItemVO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.presentation.content.AviaDetailedInfoV3VO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.presentation.content.adapter.luggage.AviaDetailedInfoV3LuggageDecoration;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.view.AviaDetailedInfoV3NoticeView;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.app.android.uikit.view.recycler.adapter.BaseViewHolder;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

@Metadata(d1 = {"\u0000\u0085\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002*\u00015\b\u0001\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020 2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020 H\u0016¢\u0006\u0004\b$\u0010%J%\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020 H\u0016¢\u0006\u0004\b)\u0010*J%\u0010,\u001a\u00020\b2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b,\u0010-J\u001d\u00100\u001a\u00020\b2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00030.H\u0007¢\u0006\u0004\b0\u00101R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00102R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00103R\u0018\u0010\f\u001a\u00060\nj\u0002`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u0003088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00109¨\u0006:"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/adapter/AviaDetailedInfoV3Adapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Lru/ozon/app/android/uikit/view/recycler/adapter/BaseViewHolder;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/AviaDetailedInfoV3ListItemVO;", "Landroidx/recyclerview/widget/RecyclerView$u;", "sharedPool", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Landroidx/recyclerview/widget/RecyclerView$u;Lkotlin/jvm/functions/Function1;LWZ/l;)V", "Landroid/content/Context;", "context", "Landroid/widget/LinearLayout;", "getLuggageView", "(Landroid/content/Context;)Landroid/widget/LinearLayout;", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/FlightDetailsView;", "getContentView", "(Landroid/content/Context;)Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/FlightDetailsView;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/view/AviaDetailedInfoV3NoticeView;", "createNoteView", "(Landroid/content/Context;)Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/view/AviaDetailedInfoV3NoticeView;", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "getReturnPolicyDisclaimerView", "(Landroid/content/Context;)Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getReturnPolicyRouteBlockView", "(Landroid/content/Context;)Landroidx/constraintlayout/widget/ConstraintLayout;", "", "position", "getItemViewType", "(I)I", "getItemCount", "()I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/uikit/view/recycler/adapter/BaseViewHolder;", "holder", "onBindViewHolder", "(Lru/ozon/app/android/uikit/view/recycler/adapter/BaseViewHolder;I)V", "", "items", "submitList", "(Ljava/util/List;)V", "Landroidx/recyclerview/widget/RecyclerView$u;", "Lkotlin/jvm/functions/Function1;", "LWZ/l;", "ru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/adapter/AviaDetailedInfoV3Adapter$onItemTouchListenerForHorizontalRv$1", "onItemTouchListenerForHorizontalRv", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/adapter/AviaDetailedInfoV3Adapter$onItemTouchListenerForHorizontalRv$1;", "", "Ljava/util/List;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaDetailedInfoV3Adapter extends RecyclerView.g<BaseViewHolder<? super AviaDetailedInfoV3ListItemVO>> {

    @NotNull
    private final List<AviaDetailedInfoV3ListItemVO> items;

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    @NotNull
    private final AviaDetailedInfoV3Adapter$onItemTouchListenerForHorizontalRv$1 onItemTouchListenerForHorizontalRv;

    @NotNull
    private final RecyclerView.u sharedPool;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.presentation.content.adapter.AviaDetailedInfoV3Adapter$onItemTouchListenerForHorizontalRv$1] */
    public AviaDetailedInfoV3Adapter(@NotNull RecyclerView.u sharedPool, @NotNull Function1<? super AtomAction, Unit> onAction, @NotNull l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(sharedPool, "sharedPool");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.sharedPool = sharedPool;
        this.onAction = onAction;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.onItemTouchListenerForHorizontalRv = new RecyclerView.y() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.presentation.content.adapter.AviaDetailedInfoV3Adapter$onItemTouchListenerForHorizontalRv$1
            private float yTouchDiff;

            @Override // androidx.recyclerview.widget.RecyclerView.s
            public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e11) {
                Intrinsics.checkNotNullParameter(rv, "rv");
                Intrinsics.checkNotNullParameter(e11, "e");
                int action = e11.getAction();
                if (action != 0) {
                    if (action == 1 || action == 2) {
                        rv.getParent().requestDisallowInterceptTouchEvent(Math.abs(this.yTouchDiff - e11.getY()) < 80.0f);
                    }
                } else {
                    this.yTouchDiff = e11.getY();
                }
                return false;
            }
        };
        this.items = new ArrayList();
    }

    private final AviaDetailedInfoV3NoticeView createNoteView(Context context) {
        AviaDetailedInfoV3NoticeView aviaDetailedInfoV3NoticeView = new AviaDetailedInfoV3NoticeView(context);
        aviaDetailedInfoV3NoticeView.setLayoutParams(new RecyclerView.p(-1, -2));
        return aviaDetailedInfoV3NoticeView;
    }

    private final FlightDetailsView getContentView(Context context) {
        FlightDetailsView flightDetailsView = new FlightDetailsView(context);
        flightDetailsView.setLayoutParams(new RecyclerView.p(-1, -2));
        flightDetailsView.setRecycledViewPool(this.sharedPool);
        flightDetailsView.setNestedScrollingEnabled(false);
        return flightDetailsView;
    }

    private final LinearLayout getLuggageView(Context context) {
        int px = UiExtKt.toPx(8, context);
        int px2 = UiExtKt.toPx(16, context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new RecyclerView.p(-1, -2));
        linearLayout.setOrientation(1);
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.addOnItemTouchListener(this.onItemTouchListenerForHorizontalRv);
        recyclerView.setRecycledViewPool(this.sharedPool);
        recyclerView.addItemDecoration(new AviaDetailedInfoV3LuggageDecoration(context));
        View view = (TextAtomV2View) q.f64554a.g(N.b(TextAtomV2View.class), context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(px2, px, px2, 0);
        view.setLayoutParams(layoutParams);
        linearLayout.addView(recyclerView);
        linearLayout.addView(view);
        return linearLayout;
    }

    private final VerticalAtomsLayout getReturnPolicyDisclaimerView(Context context) {
        VerticalAtomsLayout verticalAtomsLayout = new VerticalAtomsLayout(context, null, 0, 6, null);
        int px = UiExtKt.toPx(16, context);
        verticalAtomsLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        verticalAtomsLayout.setPadding(px, px, px, px);
        return verticalAtomsLayout;
    }

    private final ConstraintLayout getReturnPolicyRouteBlockView(Context context) {
        int px = UiExtKt.toPx(10, context);
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        IconView iconView = new IconView(context, null, 0, 6, null);
        iconView.setId(R$id.aviaDetailedInfoV3ReturnPolicyLogoIV);
        iconView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        q qVar = q.f64554a;
        TextAtomV2View textAtomV2View = (TextAtomV2View) qVar.i(N.b(TextAtomV2View.class), context);
        if (textAtomV2View == null) {
            textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        }
        TextAtomV2View textAtomV2View2 = textAtomV2View;
        textAtomV2View2.setId(R$id.aviaDetailedInfoV3ReturnPolicyRouteTAV);
        textAtomV2View2.setLayoutParams(new ConstraintLayout.b(0, -2));
        TextAtomV2View textAtomV2View3 = (TextAtomV2View) qVar.i(N.b(TextAtomV2View.class), context);
        if (textAtomV2View3 == null) {
            textAtomV2View3 = new TextAtomV2View(context, null, 0, 6, null);
        }
        G.g(textAtomV2View3, R$id.aviaDetailedInfoV3ReturnPolicyTextTAV, 0, -2);
        constraintLayout.addView(iconView);
        constraintLayout.addView(textAtomV2View2);
        constraintLayout.addView(textAtomV2View3);
        ConstraintLayoutExtensionsKt.applyConstraint(constraintLayout, new AviaDetailedInfoV3Adapter$getReturnPolicyRouteBlockView$1(iconView, textAtomV2View2, px, textAtomV2View3));
        return constraintLayout;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getShimmersCount() {
        return this.items.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        AviaDetailedInfoV3ListItemVO aviaDetailedInfoV3ListItemVO = this.items.get(position);
        if (aviaDetailedInfoV3ListItemVO instanceof AviaDetailedInfoV3VO.AviaDetailsContentVO.AviaDetails) {
            return R$id.aviaDetailedInfoV3ContentViewType;
        }
        if (aviaDetailedInfoV3ListItemVO instanceof AviaDetailedInfoV3VO.AviaDetailsContentVO.NoticeVO) {
            return R$id.aviaDetailedInfoV3NoticeViewType;
        }
        if (aviaDetailedInfoV3ListItemVO instanceof AviaDetailedInfoV3VO.LuggageContentItemsVO) {
            return R$id.aviaDetailedInfoV3LuggageViewType;
        }
        if (aviaDetailedInfoV3ListItemVO instanceof AviaDetailedInfoV3VO.ReturnPolicyContentVO.DisclaimerVO) {
            return R$id.aviaDetailedInfoV3ReturnPolicyDisclaimerViewType;
        }
        if (aviaDetailedInfoV3ListItemVO instanceof AviaDetailedInfoV3VO.ReturnPolicyContentVO.RouteBlockVO) {
            return R$id.aviaDetailedInfoV3ReturnPolicyRouteBlockViewType;
        }
        throw new o();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void submitList(@NotNull List<? extends AviaDetailedInfoV3ListItemVO> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items.clear();
        this.items.addAll(items);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull BaseViewHolder<? super AviaDetailedInfoV3ListItemVO> holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.items.get(position), K.f71697a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public BaseViewHolder<? super AviaDetailedInfoV3ListItemVO> onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        if (viewType == R$id.aviaDetailedInfoV3ContentViewType) {
            Intrinsics.f(context);
            return new AviaDetailedInfoV3DetailsViewHolder(this.onAction, getContentView(context));
        }
        if (viewType == R$id.aviaDetailedInfoV3NoticeViewType) {
            Intrinsics.f(context);
            return new AviaDetailedInfoV3NoticeViewHolder(createNoteView(context));
        }
        if (viewType == R$id.aviaDetailedInfoV3LuggageViewType) {
            Intrinsics.f(context);
            return new AviaDetailedInfoV3LuggageViewHolder(getLuggageView(context), this.tokenizedAnalytics);
        }
        if (viewType == R$id.aviaDetailedInfoV3ReturnPolicyDisclaimerViewType) {
            Intrinsics.f(context);
            return new AviaDetailedInfoV3ReturnPolicyDisclaimerViewHolder(getReturnPolicyDisclaimerView(context));
        }
        if (viewType != R$id.aviaDetailedInfoV3ReturnPolicyRouteBlockViewType) {
            throw new IllegalArgumentException(b.a(viewType, "Unknown viewType: "));
        }
        Intrinsics.f(context);
        return new AviaDetailedInfoV3ReturnPolicyRouteBlockViewHolder(getReturnPolicyRouteBlockView(context));
    }
}
