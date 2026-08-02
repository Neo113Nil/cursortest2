package ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v1.presentation.adapter;

import WZ.l;
import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.regulardraw.databinding.MorkovskTabItemLayoutBinding;
import ru.ozon.app.android.regulardraw.onboarding.MorkovskOnboardingDelegate;
import ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v1.presentation.MorkovskTabbarVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0007¢\u0006\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010!R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001b0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\"\u0010&\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v1/presentation/adapter/MorkovskTabbarAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v1/presentation/adapter/MorkovskTabItemViewHolder;", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "Lru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingDelegate;", "onboardingDelegate", "<init>", "(LWZ/l;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingDelegate;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v1/presentation/adapter/MorkovskTabItemViewHolder;", "getItemCount", "()I", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v1/presentation/adapter/MorkovskTabItemViewHolder;I)V", "", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v1/presentation/MorkovskTabbarVO$MorkovskTabItemVO;", "newItems", "setItems", "(Ljava/util/List;)V", "LWZ/l;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingDelegate;", "", "items", "Ljava/util/List;", "", "shouldAnimate", "Z", "getShouldAnimate", "()Z", "setShouldAnimate", "(Z)V", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MorkovskTabbarAdapter extends RecyclerView.g<MorkovskTabItemViewHolder> {

    @NotNull
    private final List<MorkovskTabbarVO.MorkovskTabItemVO> items;

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    @NotNull
    private final MorkovskOnboardingDelegate onboardingDelegate;
    private boolean shouldAnimate;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: Multi-variable type inference failed */
    public MorkovskTabbarAdapter(@NotNull l tokenizedAnalytics, @NotNull Function1<? super AtomAction, Unit> onAction, @NotNull MorkovskOnboardingDelegate onboardingDelegate) {
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Intrinsics.checkNotNullParameter(onboardingDelegate, "onboardingDelegate");
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.onAction = onAction;
        this.onboardingDelegate = onboardingDelegate;
        this.items = new ArrayList();
        this.shouldAnimate = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getCardsCount() {
        return this.items.size();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setItems(@NotNull List<MorkovskTabbarVO.MorkovskTabItemVO> newItems) {
        Intrinsics.checkNotNullParameter(newItems, "newItems");
        List<MorkovskTabbarVO.MorkovskTabItemVO> list = this.items;
        list.clear();
        list.addAll(newItems);
        notifyDataSetChanged();
    }

    public final void setShouldAnimate(boolean z11) {
        this.shouldAnimate = z11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull MorkovskTabItemViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.items.get(position), this.shouldAnimate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public MorkovskTabItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        MorkovskTabItemLayoutBinding inflate = MorkovskTabItemLayoutBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new MorkovskTabItemViewHolder(inflate, this.tokenizedAnalytics, this.onboardingDelegate, this.onAction);
    }
}
