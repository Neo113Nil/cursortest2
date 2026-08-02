package ru.ozon.app.android.storefront.stories.setOfPreviews.presentation;

import Lc0.e;
import WZ.l;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.stories.setOfPreviews.data.PreviewItemVO;
import ru.ozon.app.android.uikit.view.recycler.adapter.lifecycle.LifecycleAdapter;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019R\u0018\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR6\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%¨\u0006'"}, d2 = {"Lru/ozon/app/android/storefront/stories/setOfPreviews/presentation/PreviewsAdapter;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleAdapter;", "Lru/ozon/app/android/storefront/stories/setOfPreviews/presentation/PreviewViewHolder;", "Lru/ozon/app/android/storefront/stories/setOfPreviews/presentation/StoriesPreviewCallback;", "storiesPreviewCallback", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Landroidx/lifecycle/J;", "lifecycleOwner", "<init>", "(Lru/ozon/app/android/storefront/stories/setOfPreviews/presentation/StoriesPreviewCallback;LWZ/l;Landroidx/lifecycle/J;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/storefront/stories/setOfPreviews/presentation/PreviewViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/storefront/stories/setOfPreviews/presentation/PreviewViewHolder;I)V", "getItemCount", "()I", "Lru/ozon/app/android/storefront/stories/setOfPreviews/presentation/StoriesPreviewCallback;", "LWZ/l;", "", "Lru/ozon/app/android/storefront/stories/setOfPreviews/data/PreviewItemVO;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "items", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "previewWidth", "I", "previewHeight", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PreviewsAdapter extends LifecycleAdapter<PreviewViewHolder> {

    @NotNull
    private List<PreviewItemVO> items;
    private final int previewHeight;
    private final int previewWidth;

    @NotNull
    private final StoriesPreviewCallback storiesPreviewCallback;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewsAdapter(@NotNull StoriesPreviewCallback storiesPreviewCallback, @NotNull l tokenizedAnalytics, @NotNull J lifecycleOwner) {
        super(lifecycleOwner, null, 2, null);
        Intrinsics.checkNotNullParameter(storiesPreviewCallback, "storiesPreviewCallback");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.storiesPreviewCallback = storiesPreviewCallback;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.items = K.f71697a;
        this.previewWidth = ResourceExtKt.toPx(96);
        this.previewHeight = ResourceExtKt.toPx(UserVerificationMethods.USER_VERIFY_PATTERN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateViewHolder$lambda$2$lambda$1(PreviewViewHolder previewViewHolder, PreviewsAdapter previewsAdapter, View view) {
        if (previewViewHolder.getAdapterPosition() != -1) {
            StoriesPreviewCallback storiesPreviewCallback = previewsAdapter.storiesPreviewCallback;
            PreviewItemVO previewItemVO = previewsAdapter.items.get(previewViewHolder.getAdapterPosition());
            int adapterPosition = previewViewHolder.getAdapterPosition();
            Intrinsics.f(view);
            storiesPreviewCallback.click(previewItemVO, adapterPosition, view);
            previewsAdapter.items.get(previewViewHolder.getAdapterPosition()).setHideFrame(true);
            previewsAdapter.notifyItemChanged(previewViewHolder.getAdapterPosition());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemCount() {
        return this.items.size();
    }

    public final void setItems(@NotNull List<PreviewItemVO> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.items = value;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull PreviewViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bindItem(this.items.get(position), position);
        this.storiesPreviewCallback.bind(this.items.get(position), position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public PreviewViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        PreviewView previewView = new PreviewView(context, null, 0, 6, null);
        previewView.setLayoutParams(new ViewGroup.LayoutParams(this.previewWidth, this.previewHeight));
        PreviewViewHolder previewViewHolder = new PreviewViewHolder(previewView, new PreviewsAdapter$onCreateViewHolder$2(this), this.tokenizedAnalytics);
        previewViewHolder.itemView.setOnClickListener(new e(8, previewViewHolder, this));
        return previewViewHolder;
    }
}
