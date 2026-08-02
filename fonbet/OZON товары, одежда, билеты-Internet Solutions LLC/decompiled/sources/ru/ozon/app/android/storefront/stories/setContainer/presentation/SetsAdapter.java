package ru.ozon.app.android.storefront.stories.setContainer.presentation;

import EE.a;
import WZ.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.i;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.stories.setContainer.data.CommonItemVO;
import ru.ozon.app.android.storefront.stories.setContainer.data.SetType;
import ru.ozon.app.android.storefront.stories.setContainer.presentation.SetContainerVH;
import ru.ozon.app.android.storefront.stories.setOfPreviews.presentation.PreviewView;
import ru.ozon.app.android.storefront.stories.setOfPreviews.presentation.PreviewViewHolder;
import ru.ozon.app.android.uikit.view.recycler.adapter.lifecycle.LifecycleListAdapter;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R\u0014\u0010!\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"¨\u0006$"}, d2 = {"Lru/ozon/app/android/storefront/stories/setContainer/presentation/SetsAdapter;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleListAdapter;", "Lru/ozon/app/android/storefront/stories/setContainer/data/CommonItemVO;", "Lru/ozon/app/android/storefront/stories/setContainer/presentation/ItemVH;", "Lru/ozon/app/android/storefront/stories/setContainer/presentation/SetContainerVH$SetPreviewsCallback;", "setPreviewsCallback", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Landroidx/lifecycle/J;", "lifecycleOwner", "<init>", "(Lru/ozon/app/android/storefront/stories/setContainer/presentation/SetContainerVH$SetPreviewsCallback;LWZ/l;Landroidx/lifecycle/J;)V", "Landroid/view/View;", "view", "", "adapterPosition", "", "handleClick", "(Landroid/view/View;I)V", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/storefront/stories/setContainer/presentation/ItemVH;", "holder", "onBindViewHolder", "(Lru/ozon/app/android/storefront/stories/setContainer/presentation/ItemVH;I)V", "Lru/ozon/app/android/storefront/stories/setContainer/presentation/SetContainerVH$SetPreviewsCallback;", "LWZ/l;", "previewWidth", "I", "previewHeight", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SetsAdapter extends LifecycleListAdapter<CommonItemVO, ItemVH> {
    private final int previewHeight;
    private final int previewWidth;

    @NotNull
    private final SetContainerVH.SetPreviewsCallback setPreviewsCallback;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetsAdapter(@NotNull SetContainerVH.SetPreviewsCallback setPreviewsCallback, @NotNull l tokenizedAnalytics, @NotNull J lifecycleOwner) {
        super(new i.d<CommonItemVO>() { // from class: ru.ozon.app.android.storefront.stories.setContainer.presentation.SetsAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            @SuppressLint({"DiffUtilEquals"})
            public boolean areContentsTheSame(CommonItemVO oldItem, CommonItemVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(CommonItemVO oldItem, CommonItemVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }
        }, lifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(setPreviewsCallback, "setPreviewsCallback");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.setPreviewsCallback = setPreviewsCallback;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.previewWidth = ResourceExtKt.toPx(96);
        this.previewHeight = ResourceExtKt.toPx(UserVerificationMethods.USER_VERIFY_PATTERN);
    }

    private final void handleClick(View view, int adapterPosition) {
        if (adapterPosition != -1) {
            CommonItemVO item = getItem(adapterPosition);
            SetContainerVH.SetPreviewsCallback setPreviewsCallback = this.setPreviewsCallback;
            Intrinsics.f(item);
            setPreviewsCallback.click(item, adapterPosition, view);
            item.setHideFrame(true);
            notifyItemChanged(adapterPosition);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateViewHolder$lambda$1(SetsAdapter setsAdapter, PreviewViewHolder previewViewHolder, View view) {
        Intrinsics.f(view);
        setsAdapter.handleClick(view, previewViewHolder.getAdapterPosition());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        return getItem(position).getItemType().ordinal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull ItemVH holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        CommonItemVO item = getItem(position);
        Intrinsics.f(item);
        holder.bindItem(item, position);
        holder.itemView.setContentDescription("storyPreview" + position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public ItemVH onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType != SetType.SET_OF_PREVIEWS.ordinal()) {
            throw new Exception("Unknown ViewHolder!");
        }
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        PreviewView previewView = new PreviewView(context, null, 0, 6, null);
        previewView.setLayoutParams(new ViewGroup.LayoutParams(this.previewWidth, this.previewHeight));
        PreviewViewHolder previewViewHolder = new PreviewViewHolder(previewView, new SetsAdapter$onCreateViewHolder$viewHolder$holder$2(this), this.tokenizedAnalytics);
        previewViewHolder.itemView.setOnClickListener(new a(10, this, previewViewHolder));
        return previewViewHolder;
    }
}
