package ru.ozon.app.android.storefront.stories.setOfPreviews.presentation;

import Sc.o;
import WZ.t;
import android.content.Context;
import android.view.View;
import androidx.core.app.u;
import androidx.fragment.app.r;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pikazon.extensions.ContextExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.storefront.databinding.WidgetSetOfStoriesBinding;
import ru.ozon.app.android.storefront.stories.playstories.presentation.widget.StoriesPreviewItemDecoration;
import ru.ozon.app.android.storefront.stories.setOfPreviews.data.PreviewItemVO;
import ru.ozon.app.android.storefront.stories.setOfPreviews.data.SetOfPreviewsVO;
import ru.ozon.app.android.storefront.stories.story.data.Alignment;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/storefront/stories/setOfPreviews/presentation/SetOfPreviewsVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/storefront/stories/setOfPreviews/data/SetOfPreviewsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "Landroidx/fragment/app/r;", "activity", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Landroidx/fragment/app/r;)V", "", "imageUrl", "Lru/ozon/app/android/storefront/stories/story/data/Alignment;", "align", "", "preloadImage", "(Ljava/lang/String;Lru/ozon/app/android/storefront/stories/story/data/Alignment;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/storefront/stories/setOfPreviews/data/SetOfPreviewsVO;Ll20/d;)V", "(Lru/ozon/app/android/storefront/stories/setOfPreviews/data/SetOfPreviewsVO;)V", "Landroidx/fragment/app/r;", "", "storyPosition", "I", "", "wasTransitionPostponed", "Z", "Lru/ozon/app/android/pikazon/image/ImageSize;", "imageSize", "Lru/ozon/app/android/pikazon/image/ImageSize;", "", "preloadedImages", "Ljava/util/Set;", "Lru/ozon/app/android/storefront/databinding/WidgetSetOfStoriesBinding;", "binding", "Lru/ozon/app/android/storefront/databinding/WidgetSetOfStoriesBinding;", "Lru/ozon/app/android/storefront/stories/setOfPreviews/presentation/PreviewsAdapter;", "storiesPreviewAdapter", "Lru/ozon/app/android/storefront/stories/setOfPreviews/presentation/PreviewsAdapter;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SetOfPreviewsVH extends k<SetOfPreviewsVO> {

    @NotNull
    private final r activity;

    @NotNull
    private final WidgetSetOfStoriesBinding binding;
    private ImageSize imageSize;

    @NotNull
    private final Set<String> preloadedImages;

    @NotNull
    private final PreviewsAdapter storiesPreviewAdapter;
    private int storyPosition;
    private boolean wasTransitionPostponed;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Alignment.values().length];
            try {
                iArr[Alignment.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Alignment.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Alignment.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetOfPreviewsVH(@NotNull View containerView, @NotNull final ComposerReferences ref, @NotNull r activity) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.activity = activity;
        this.storyPosition = -1;
        this.preloadedImages = new LinkedHashSet();
        WidgetSetOfStoriesBinding bind = WidgetSetOfStoriesBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        PreviewsAdapter previewsAdapter = new PreviewsAdapter(new StoriesPreviewCallback() { // from class: ru.ozon.app.android.storefront.stories.setOfPreviews.presentation.SetOfPreviewsVH$storiesPreviewAdapter$1
            @Override // ru.ozon.app.android.storefront.stories.setOfPreviews.presentation.StoriesPreviewCallback
            public void bind(PreviewItemVO story, int position) {
                Intrinsics.checkNotNullParameter(story, "story");
                if (story.getFirstFullImage().length() > 0) {
                    SetOfPreviewsVH.this.preloadImage(story.getFirstFullImage(), story.getFirstFullImageAlign());
                }
            }

            @Override // ru.ozon.app.android.storefront.stories.setOfPreviews.presentation.StoriesPreviewCallback
            public void click(PreviewItemVO story, int selectedStoryIndex, View preview) {
                Intrinsics.checkNotNullParameter(story, "story");
                Intrinsics.checkNotNullParameter(preview, "preview");
                SetOfPreviewsVH.this.storyPosition = selectedStoryIndex;
                String link = story.getLink();
                if (link != null) {
                    ComposerReferences composerReferences = ref;
                    composerReferences.getNavigator().openDeeplink(link, U.j(new Pair("transition_view", preview), new Pair("selected_story_index", Integer.valueOf(selectedStoryIndex))));
                    t tokenizedEvent = story.getTokenizedEvent();
                    if (tokenizedEvent != null) {
                        TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(composerReferences.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
                    }
                }
            }

            @Override // ru.ozon.app.android.storefront.stories.setOfPreviews.presentation.StoriesPreviewCallback
            public void preloadImage(PreviewItemVO story, int position) {
                Intrinsics.checkNotNullParameter(story, "story");
                SetOfPreviewsVH.this.preloadImage(story.getFirstFullImage(), Alignment.CENTER);
            }
        }, ref.getTokenizedAnalytics(), this);
        this.storiesPreviewAdapter = previewsAdapter;
        final RecyclerView recyclerView = bind.previewsRv;
        recyclerView.setAdapter(previewsAdapter);
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.addItemDecoration(new StoriesPreviewItemDecoration(ResourceExtKt.toPx(context, 4.0f)));
        activity.setExitSharedElementCallback(new u() { // from class: ru.ozon.app.android.storefront.stories.setOfPreviews.presentation.SetOfPreviewsVH$1$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.core.app.u
            public void onMapSharedElements(List<String> names, Map<String, View> sharedElements) {
                int i11;
                int i12;
                i11 = SetOfPreviewsVH.this.storyPosition;
                if (i11 == -1) {
                    return;
                }
                RecyclerView recyclerView2 = recyclerView;
                i12 = SetOfPreviewsVH.this.storyPosition;
                RecyclerView.C findViewHolderForAdapterPosition = recyclerView2.findViewHolderForAdapterPosition(i12);
                if (findViewHolderForAdapterPosition == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                View itemView = findViewHolderForAdapterPosition.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                List<String> list = names;
                if (list == null || list.isEmpty() || sharedElements == 0) {
                    return;
                }
                sharedElements.put(C7714v.K(names), itemView);
            }
        });
        recyclerView.addOnScrollListener(new RecyclerView.t() { // from class: ru.ozon.app.android.storefront.stories.setOfPreviews.presentation.SetOfPreviewsVH$1$2
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrollStateChanged(RecyclerView recyclerView2, int newState) {
                boolean z11;
                r rVar;
                Intrinsics.checkNotNullParameter(recyclerView2, "recyclerView");
                if (newState == 0) {
                    z11 = SetOfPreviewsVH.this.wasTransitionPostponed;
                    if (z11) {
                        SetOfPreviewsVH.this.wasTransitionPostponed = false;
                        rVar = SetOfPreviewsVH.this.activity;
                        rVar.startPostponedEnterTransition();
                    }
                }
            }
        });
        int i11 = containerView.getContext().getResources().getDisplayMetrics().widthPixels;
        int i12 = containerView.getContext().getResources().getDisplayMetrics().heightPixels;
        Context context2 = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.imageSize = new ImageSize(i11, i12 - ResourceExtKt.getStatusBarHeight(context2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void preloadImage(String imageUrl, Alignment align) {
        ImageTransformation.FitWidthCropHeight.CropType cropType;
        if (this.preloadedImages.contains(imageUrl)) {
            return;
        }
        int i11 = WhenMappings.$EnumSwitchMapping$0[align.ordinal()];
        if (i11 == 1) {
            cropType = ImageTransformation.FitWidthCropHeight.CropType.TOP;
        } else if (i11 == 2) {
            cropType = ImageTransformation.FitWidthCropHeight.CropType.BOTTOM;
        } else {
            if (i11 != 3) {
                throw new o();
            }
            cropType = ImageTransformation.FitWidthCropHeight.CropType.CENTER;
        }
        Context context = this.binding.getConstraintLayout().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ContextExtKt.loadOriginalBitmap$default(context, imageUrl, C7714v.a0(new ImageTransformation.FitWidthCropHeight(cropType)), this.imageSize, null, new SetOfPreviewsVH$preloadImage$1(this, imageUrl), 8, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SetOfPreviewsVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        bind(item);
    }

    public final void bind(@NotNull SetOfPreviewsVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.storiesPreviewAdapter.setItems(item.getPreviews());
    }
}
