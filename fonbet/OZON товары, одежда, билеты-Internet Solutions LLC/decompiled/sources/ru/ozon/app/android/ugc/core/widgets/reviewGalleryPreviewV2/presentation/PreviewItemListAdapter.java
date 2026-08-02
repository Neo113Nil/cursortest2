package ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation;

import Au.c;
import WZ.l;
import WZ.t;
import Xc.b;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import jk0.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.ReviewGalleryPreviewV2VO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.items.CountPreviewItemView;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.items.ItemPreviewViewHolder;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.items.VideoPreviewItemView;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.utils.ReviewGalleryPreviewLayoutParamsProvider;
import ru.ozon.app.android.video.preload.data.PreloadVideoInfo;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003/01B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJE\u0010)\u001a\u00020\u00172\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010 2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00170\"2\u0006\u0010&\u001a\u00020%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010,R$\u0010$\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u0017\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010-R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010.¨\u00062"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/PreviewItemListAdapter;", "Ljk0/i;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/ReviewGalleryPreviewV2VO$ItemVO;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/items/ItemPreviewViewHolder;", "Landroidx/lifecycle/J;", "containerViewLifecycleOwner", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/PreviewItemListAdapter$VideoPreloader;", "videoPreloader", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/utils/ReviewGalleryPreviewLayoutParamsProvider;", "layoutParamsProvider", "<init>", "(Landroidx/lifecycle/J;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/PreviewItemListAdapter$VideoPreloader;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/utils/ReviewGalleryPreviewLayoutParamsProvider;)V", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/uni/android/atom/image/Image;", "createPhotoPreviewView", "(Landroid/view/ViewGroup;)Lru/ozon/uni/android/atom/image/Image;", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/items/ItemPreviewViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/items/ItemPreviewViewHolder;I)V", "getItemViewType", "(I)I", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "onDetachedFromRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "", "list", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "LWZ/l;", "tokenizedAnalytics", "Ljava/lang/Runnable;", "commitRunnable", "submitList", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;LWZ/l;Ljava/lang/Runnable;)V", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/PreviewItemListAdapter$VideoPreloader;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/utils/ReviewGalleryPreviewLayoutParamsProvider;", "Lkotlin/jvm/functions/Function1;", "LWZ/l;", "Type", "VideoPreloader", "Factory", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PreviewItemListAdapter extends i<ReviewGalleryPreviewV2VO.ItemVO, ItemPreviewViewHolder> {
    private Function1<? super AtomAction, Unit> actionHandler;

    @NotNull
    private final ReviewGalleryPreviewLayoutParamsProvider layoutParamsProvider;
    private l tokenizedAnalytics;

    @NotNull
    private final VideoPreloader videoPreloader;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/PreviewItemListAdapter$Factory;", "", "Landroidx/lifecycle/J;", "containerViewLifecycleOwner", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/PreviewItemListAdapter;", "create", "(Landroidx/lifecycle/J;)Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/PreviewItemListAdapter;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        PreviewItemListAdapter create(@NotNull J containerViewLifecycleOwner);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/PreviewItemListAdapter$Type;", "", "<init>", "(Ljava/lang/String;I)V", "PHOTO", "VIDEO", "COUNT", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type PHOTO = new Type("PHOTO", 0);
        public static final Type VIDEO = new Type("VIDEO", 1);
        public static final Type COUNT = new Type("COUNT", 2);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{PHOTO, VIDEO, COUNT};
        }

        static {
            Type[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Type(String str, int i11) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/PreviewItemListAdapter$VideoPreloader;", "", "loadVideo", "", "info", "Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface VideoPreloader {
        void loadVideo(@NotNull PreloadVideoInfo info);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewItemListAdapter(@NotNull J containerViewLifecycleOwner, @NotNull VideoPreloader videoPreloader, @NotNull ReviewGalleryPreviewLayoutParamsProvider layoutParamsProvider) {
        super(MediaPreviewDiffer.INSTANCE, containerViewLifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(containerViewLifecycleOwner, "containerViewLifecycleOwner");
        Intrinsics.checkNotNullParameter(videoPreloader, "videoPreloader");
        Intrinsics.checkNotNullParameter(layoutParamsProvider, "layoutParamsProvider");
        this.videoPreloader = videoPreloader;
        this.layoutParamsProvider = layoutParamsProvider;
    }

    private final Image createPhotoPreviewView(ViewGroup parent) {
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Image image = new Image(context, null, 0, 6, null);
        image.setLayoutParams(this.layoutParamsProvider.getRootLayoutParams(parent));
        return image;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$2(PreviewItemListAdapter previewItemListAdapter, ReviewGalleryPreviewV2VO.ItemVO itemVO, View view) {
        Function1<? super AtomAction, Unit> function1 = previewItemListAdapter.actionHandler;
        if (function1 != null) {
            if ((itemVO.getAction() instanceof AtomAction.Move) && itemVO.getVideoInfo() != null) {
                previewItemListAdapter.videoPreloader.loadVideo(itemVO.getVideoInfo());
            }
            function1.invoke(itemVO.getAction());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        ReviewGalleryPreviewV2VO.ItemVO item = getItem(position);
        return (item.getIcon() == null || item.getText() != null) ? item.getText() != null ? Type.COUNT.ordinal() : Type.PHOTO.ordinal() : Type.VIDEO.ordinal();
    }

    @Override // jk0.i, androidx.recyclerview.widget.RecyclerView.g
    public void onDetachedFromRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        recyclerView.clearOnScrollListeners();
        this.actionHandler = null;
        this.tokenizedAnalytics = null;
    }

    public final void submitList(List<ReviewGalleryPreviewV2VO.ItemVO> list, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull l tokenizedAnalytics, Runnable commitRunnable) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.actionHandler = actionHandler;
        this.tokenizedAnalytics = tokenizedAnalytics;
        super.submitList(list, commitRunnable);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull ItemPreviewViewHolder holder, int position) {
        l lVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        ReviewGalleryPreviewV2VO.ItemVO item = getItem(position);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null && (lVar = this.tokenizedAnalytics) != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(lVar, tokenizedEvent, null, 2, null);
        }
        holder.itemView.setOnClickListener(new c(4, this, item));
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public ItemPreviewViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == Type.COUNT.ordinal()) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            return new ItemPreviewViewHolder.CountPreviewViewHolder(new CountPreviewItemView(context, this.layoutParamsProvider));
        }
        if (viewType != Type.VIDEO.ordinal()) {
            return new ItemPreviewViewHolder.PhotoPreviewViewHolder(createPhotoPreviewView(parent));
        }
        Context context2 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        return new ItemPreviewViewHolder.VideoPreviewViewHolder(new VideoPreviewItemView(context2, this.layoutParamsProvider));
    }
}
