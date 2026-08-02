package ru.ozon.app.android.storefront.stories.setContainer.presentation;

import Am.C2438a;
import Lm0.a;
import Sc.o;
import WZ.t;
import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import androidx.core.app.u;
import androidx.fragment.app.r;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewHolderKt;
import ru.ozon.app.android.logger.LoggerExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.storefront.databinding.WidgetSetContainerBinding;
import ru.ozon.app.android.storefront.stories.playstories.presentation.widget.StoriesPreviewItemDecoration;
import ru.ozon.app.android.storefront.stories.setContainer.data.CommonItemVO;
import ru.ozon.app.android.storefront.stories.setContainer.data.CommonVoSet;
import ru.ozon.app.android.storefront.stories.setContainer.data.SetContainerVO;
import ru.ozon.app.android.storefront.stories.setContainer.presentation.SetContainerVH;
import ru.ozon.app.android.storefront.stories.setContainer.presentation.p003switch.SetSwitchButtonsAdapter;
import ru.ozon.app.android.storefront.stories.setContainer.presentation.p003switch.SetSwitchDecoration;
import ru.ozon.app.android.storefront.stories.setContainer.presentation.preloader.PreloadScrollListener;
import ru.ozon.app.android.storefront.stories.setContainer.presentation.preloader.PreviewImagePreloader;
import ru.ozon.app.android.storefront.stories.setContainer.presentation.preloader.StoryImagePreloader;
import ru.ozon.app.android.storefront.stories.setOfPreviews.data.PreviewItemVO;
import ru.ozon.app.android.storefront.stories.story.data.Alignment;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000\u009f\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001>\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001MB)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u00172\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u0017H\u0002¢\u0006\u0004\b%\u0010\u001aJ#\u0010&\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0014¢\u0006\u0004\b&\u0010\u0016J+\u0010&\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u00132\u0006\u0010(\u001a\u00020'H\u0014¢\u0006\u0004\b&\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010+R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010,R(\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0016\u00105\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00107\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00106R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010L¨\u0006N"}, d2 = {"Lru/ozon/app/android/storefront/stories/setContainer/presentation/SetContainerVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/storefront/stories/setContainer/data/SetContainerVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Landroidx/fragment/app/r;", "activity", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "Lru/ozon/app/android/storefront/stories/setContainer/presentation/preloader/StoryImagePreloader;", "imagePreloader", "<init>", "(Landroid/view/View;Landroidx/fragment/app/r;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/storefront/stories/setContainer/presentation/preloader/StoryImagePreloader;)V", "", "saveScrollState", "()V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bindSets", "(Lru/ozon/app/android/storefront/stories/setContainer/data/SetContainerVO;Ll20/d;)V", "", "showSetIndex", "changeSelection", "(I)V", "mShowSetIndex", "switchSets", "(ILl20/d;)V", "", "imageUrl", "Lru/ozon/app/android/storefront/stories/story/data/Alignment;", "align", "preloadImage", "(Ljava/lang/String;Lru/ozon/app/android/storefront/stories/story/data/Alignment;)V", "currentIndex", "preloadPreviews", "bind", "", "payload", "(Lru/ozon/app/android/storefront/stories/setContainer/data/SetContainerVO;Ll20/d;Ljava/lang/Object;)V", "Landroidx/fragment/app/r;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/storefront/stories/setContainer/presentation/preloader/StoryImagePreloader;", "", "Lru/ozon/app/android/storefront/stories/setContainer/presentation/SetSwitch;", "setsSwitchList", "Ljava/util/List;", "getSetsSwitchList", "()Ljava/util/List;", "setSetsSwitchList", "(Ljava/util/List;)V", "storyPosition", "I", "currentSelectedList", "Lru/ozon/app/android/storefront/databinding/WidgetSetContainerBinding;", "binding", "Lru/ozon/app/android/storefront/databinding/WidgetSetContainerBinding;", "Lru/ozon/app/android/pikazon/image/ImageSize;", "imageSize", "Lru/ozon/app/android/pikazon/image/ImageSize;", "ru/ozon/app/android/storefront/stories/setContainer/presentation/SetContainerVH$setPreviewsCallback$1", "setPreviewsCallback", "Lru/ozon/app/android/storefront/stories/setContainer/presentation/SetContainerVH$setPreviewsCallback$1;", "Lru/ozon/app/android/storefront/stories/setContainer/presentation/SetsAdapter;", "setsAdapter", "Lru/ozon/app/android/storefront/stories/setContainer/presentation/SetsAdapter;", "Lru/ozon/app/android/storefront/stories/setContainer/presentation/switch/SetSwitchButtonsAdapter;", "switchButtonsAdapter", "Lru/ozon/app/android/storefront/stories/setContainer/presentation/switch/SetSwitchButtonsAdapter;", "Lru/ozon/app/android/storefront/stories/setContainer/presentation/preloader/PreviewImagePreloader;", "previewImagePreloader", "Lru/ozon/app/android/storefront/stories/setContainer/presentation/preloader/PreviewImagePreloader;", "Lru/ozon/app/android/storefront/stories/setContainer/presentation/preloader/PreloadScrollListener;", "preloadScrollListener", "Lru/ozon/app/android/storefront/stories/setContainer/presentation/preloader/PreloadScrollListener;", "SetPreviewsCallback", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SetContainerVH extends k<SetContainerVO> {

    @NotNull
    private final r activity;

    @NotNull
    private final WidgetSetContainerBinding binding;
    private int currentSelectedList;

    @NotNull
    private final StoryImagePreloader imagePreloader;
    private ImageSize imageSize;

    @NotNull
    private final PreloadScrollListener preloadScrollListener;

    @NotNull
    private final PreviewImagePreloader previewImagePreloader;

    @NotNull
    private final ComposerReferences ref;

    @NotNull
    private final SetContainerVH$setPreviewsCallback$1 setPreviewsCallback;

    @NotNull
    private final SetsAdapter setsAdapter;
    public List<SetSwitch> setsSwitchList;
    private int storyPosition;

    @NotNull
    private final SetSwitchButtonsAdapter switchButtonsAdapter;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0007H&¨\u0006\f"}, d2 = {"Lru/ozon/app/android/storefront/stories/setContainer/presentation/SetContainerVH$SetPreviewsCallback;", "", "click", "", "itemVO", "Lru/ozon/app/android/storefront/stories/setContainer/data/CommonItemVO;", "selectedIndex", "", "preview", "Landroid/view/View;", "preloadImage", "position", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface SetPreviewsCallback {
        void click(@NotNull CommonItemVO itemVO, int selectedIndex, @NotNull View preview);

        void preloadImage(@NotNull CommonItemVO itemVO, int position);
    }

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

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ SetContainerVH(View view, r rVar, ComposerReferences composerReferences, StoryImagePreloader storyImagePreloader, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, rVar, composerReferences, storyImagePreloader);
        if ((i11 & 8) != 0) {
            Context applicationContext = view.getContext().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            storyImagePreloader = new StoryImagePreloader(applicationContext);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [kotlin.collections.K] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0, types: [ru.ozon.app.android.storefront.stories.setContainer.data.SetContainerVO] */
    private final void bindSets(SetContainerVO item, d info) {
        List<SetSwitch> extractSet;
        ?? r12;
        List<l> list;
        if (item.getSetsList().isEmpty()) {
            Map<String, List<l>> nestedWidgets = getNestedWidgets();
            if (nestedWidgets == null || (list = nestedWidgets.get("default")) == null) {
                r12 = K.f71697a;
            } else {
                r12 = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    c d11 = ((l) it.next()).d();
                    CommonVoSet commonVoSet = d11 instanceof CommonVoSet ? (CommonVoSet) d11 : null;
                    if (commonVoSet != null) {
                        r12.add(commonVoSet);
                    }
                }
            }
            item.setSetsList(r12);
        }
        if (item.getSetsList().isEmpty()) {
            this.ref.getController().p(info.d());
            return;
        }
        extractSet = SetContainerVHKt.extractSet(item.getSetsList(), item.getSelectedSetIndex());
        setSetsSwitchList(extractSet);
        SetContainerView setContainerView = this.binding.root;
        if (getSetsSwitchList().size() >= 2) {
            setContainerView.getTitle().setVisibility(8);
            setContainerView.getSelector().setVisibility(0);
            changeSelection(item.getSelectedSetIndex());
            switchSets(item.getSelectedSetIndex(), info);
            return;
        }
        setContainerView.getSelector().setVisibility(8);
        setContainerView.getTitle().setVisibility(0);
        setContainerView.getTitle().setText(getSetsSwitchList().get(0).getVo().getTitle());
        switchSets(0, info);
    }

    private final void changeSelection(int showSetIndex) {
        int i11 = 0;
        for (Object obj : getSetsSwitchList()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            ((SetSwitch) obj).setSelected(showSetIndex == i11);
            i11 = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void preloadImage(String imageUrl, Alignment align) {
        ImageTransformation.FitWidthCropHeight.CropType cropType;
        if (this.imagePreloader.needPreloadImage(imageUrl)) {
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
        this.imagePreloader.putPreloadUrl(imageUrl, this.imageSize, cropType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void preloadPreviews(int currentIndex) {
        int i11 = 0;
        for (Object obj : getSetsSwitchList()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            SetSwitch setSwitch = (SetSwitch) obj;
            if (i11 != currentIndex) {
                this.previewImagePreloader.preloadFrom(setSwitch.getVo().getPreviews(), 0, 100L);
            }
            i11 = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveScrollState() {
        SetContainerVO boundedData = getBoundedData();
        if (boundedData != null) {
            if (boundedData.getSelectedSetIndex() <= C7714v.P(boundedData.getSetsList())) {
                CommonVoSet commonVoSet = boundedData.getSetsList().get(boundedData.getSelectedSetIndex());
                RecyclerView.o layoutManager = this.binding.root.getSets().getLayoutManager();
                commonVoSet.setScrollState(layoutManager != null ? layoutManager.onSaveInstanceState() : null);
            } else {
                int selectedSetIndex = boundedData.getSelectedSetIndex();
                int size = boundedData.getSetsList().size();
                List<CommonVoSet> setsList = boundedData.getSetsList();
                StringBuilder a11 = C2438a.a("incorrect selectedSetIndex ", selectedSetIndex, " setsList.size ", "  setsList = ", size);
                a11.append(setsList);
                LoggerExtKt.sendNonFatal$default(null, a11.toString(), "SET_CONTAINER_VH_INDEX_ERROR", null, 9, null);
            }
        }
    }

    private final void switchSets(final int mShowSetIndex, d info) {
        if (mShowSetIndex > C7714v.P(getSetsSwitchList())) {
            int size = getSetsSwitchList().size();
            int i11 = this.currentSelectedList;
            StringBuilder a11 = C2438a.a("incorrectIndex passed position ", mShowSetIndex, " setSize ", "  currentSelectedList = ", size);
            a11.append(i11);
            LoggerExtKt.sendNonFatal$default(null, a11.toString(), "SET_CONTAINER_VH_INDEX_ERROR", null, 9, null);
            mShowSetIndex = C7714v.P(getSetsSwitchList());
        } else if (getSetsSwitchList().isEmpty()) {
            this.ref.getController().p(info.d());
            int size2 = getSetsSwitchList().size();
            int i12 = this.currentSelectedList;
            StringBuilder a12 = C2438a.a("incorrectIndex passed position ", mShowSetIndex, " setSize ", "  currentSelectedList = ", size2);
            a12.append(i12);
            LoggerExtKt.sendNonFatal$default(null, a12.toString(), "SET_CONTAINER_VH_INDEX_ERROR", null, 9, null);
            return;
        }
        final SetSwitch setSwitch = getSetsSwitchList().get(mShowSetIndex);
        this.preloadScrollListener.setItems(setSwitch.getVo().getPreviews());
        this.setsAdapter.submitList(setSwitch.getVo().getPreviews(), new Runnable() { // from class: kK.a
            @Override // java.lang.Runnable
            public final void run() {
                SetContainerVH.switchSets$lambda$10(SetContainerVH.this, setSwitch, mShowSetIndex);
            }
        });
        if (!getSetsSwitchList().isEmpty()) {
            this.switchButtonsAdapter.submitList(getSetsSwitchList());
        }
        this.currentSelectedList = mShowSetIndex;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void switchSets$lambda$10(final SetContainerVH setContainerVH, SetSwitch setSwitch, final int i11) {
        RecyclerView.o layoutManager;
        SetContainerView setContainerView = setContainerVH.binding.root;
        Parcelable scrollState = setSwitch.getVo().getScrollState();
        if (scrollState != null && (layoutManager = setContainerView.getSets().getLayoutManager()) != null) {
            layoutManager.onRestoreInstanceState(scrollState);
        }
        setContainerView.getSets().addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.storefront.stories.setContainer.presentation.SetContainerVH$switchSets$lambda$10$lambda$9$$inlined$doOnNextLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                Intrinsics.checkNotNullParameter(view, "view");
                view.removeOnLayoutChangeListener(this);
                SetContainerVH.this.preloadPreviews(i11);
            }
        });
    }

    @NotNull
    public final List<SetSwitch> getSetsSwitchList() {
        List<SetSwitch> list = this.setsSwitchList;
        if (list != null) {
            return list;
        }
        Intrinsics.n("setsSwitchList");
        throw null;
    }

    public final void setSetsSwitchList(@NotNull List<SetSwitch> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.setsSwitchList = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v5, types: [ru.ozon.app.android.storefront.stories.setContainer.presentation.SetContainerVH$SetPreviewsCallback, ru.ozon.app.android.storefront.stories.setContainer.presentation.SetContainerVH$setPreviewsCallback$1] */
    public SetContainerVH(@NotNull View containerView, @NotNull r activity, @NotNull ComposerReferences ref, @NotNull StoryImagePreloader imagePreloader) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(imagePreloader, "imagePreloader");
        this.activity = activity;
        this.ref = ref;
        this.imagePreloader = imagePreloader;
        this.storyPosition = -1;
        this.currentSelectedList = -1;
        WidgetSetContainerBinding bind = WidgetSetContainerBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        ?? r02 = new SetPreviewsCallback() { // from class: ru.ozon.app.android.storefront.stories.setContainer.presentation.SetContainerVH$setPreviewsCallback$1
            @Override // ru.ozon.app.android.storefront.stories.setContainer.presentation.SetContainerVH.SetPreviewsCallback
            public void click(CommonItemVO itemVO, int selectedIndex, View preview) {
                ComposerReferences composerReferences;
                ComposerReferences composerReferences2;
                Intrinsics.checkNotNullParameter(itemVO, "itemVO");
                Intrinsics.checkNotNullParameter(preview, "preview");
                if (itemVO instanceof PreviewItemVO) {
                    SetContainerVH.this.storyPosition = selectedIndex;
                    PreviewItemVO previewItemVO = (PreviewItemVO) itemVO;
                    String link = previewItemVO.getLink();
                    if (link != null) {
                        SetContainerVH setContainerVH = SetContainerVH.this;
                        composerReferences = setContainerVH.ref;
                        composerReferences.getNavigator().openDeeplink(link, U.j(new Pair("transition_view", preview), new Pair("selected_story_index", Integer.valueOf(selectedIndex)), new Pair("first_image_url", previewItemVO.getFirstFullImage()), new Pair("first_image_align", Integer.valueOf(previewItemVO.getFirstFullImageAlign().ordinal()))));
                        t tokenizedEvent = previewItemVO.getTokenizedEvent();
                        if (tokenizedEvent != null) {
                            composerReferences2 = setContainerVH.ref;
                            TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(composerReferences2.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
                        }
                    }
                }
            }

            @Override // ru.ozon.app.android.storefront.stories.setContainer.presentation.SetContainerVH.SetPreviewsCallback
            public void preloadImage(CommonItemVO itemVO, int position) {
                Intrinsics.checkNotNullParameter(itemVO, "itemVO");
                if (itemVO instanceof PreviewItemVO) {
                    PreviewItemVO previewItemVO = (PreviewItemVO) itemVO;
                    if (previewItemVO.getFirstFullImage().length() > 0) {
                        SetContainerVH.this.preloadImage(previewItemVO.getFirstFullImage(), previewItemVO.getFirstFullImageAlign());
                    }
                }
            }
        };
        this.setPreviewsCallback = r02;
        SetsAdapter setsAdapter = new SetsAdapter(r02, ref.getTokenizedAnalytics(), this);
        this.setsAdapter = setsAdapter;
        SetSwitchButtonsAdapter setSwitchButtonsAdapter = new SetSwitchButtonsAdapter(new SetContainerVH$switchButtonsAdapter$1(this));
        this.switchButtonsAdapter = setSwitchButtonsAdapter;
        Context applicationContext = getContext().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        PreviewImagePreloader previewImagePreloader = new PreviewImagePreloader(applicationContext);
        this.previewImagePreloader = previewImagePreloader;
        PreloadScrollListener preloadScrollListener = new PreloadScrollListener(previewImagePreloader);
        this.preloadScrollListener = preloadScrollListener;
        activity.setExitSharedElementCallback(new u() { // from class: ru.ozon.app.android.storefront.stories.setContainer.presentation.SetContainerVH.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.core.app.u
            public void onMapSharedElements(List<String> names, Map<String, View> sharedElements) {
                if (SetContainerVH.this.storyPosition == -1) {
                    return;
                }
                RecyclerView.C findViewHolderForAdapterPosition = SetContainerVH.this.binding.root.getSets().findViewHolderForAdapterPosition(SetContainerVH.this.storyPosition);
                View view = findViewHolderForAdapterPosition != null ? findViewHolderForAdapterPosition.itemView : null;
                List<String> list = names;
                if (list == null || list.isEmpty() || sharedElements == 0 || view == null) {
                    return;
                }
                sharedElements.put(C7714v.K(names), view);
            }
        });
        RecyclerView sets = bind.root.getSets();
        sets.setAdapter(setsAdapter);
        sets.setItemAnimator(null);
        Context context = sets.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        sets.addItemDecoration(new StoriesPreviewItemDecoration(ResourceExtKt.toPx(context, 4.0f)));
        sets.addOnScrollListener(new RecyclerView.t() { // from class: ru.ozon.app.android.storefront.stories.setContainer.presentation.SetContainerVH$2$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (newState == 0) {
                    SetContainerVH.this.saveScrollState();
                }
            }
        });
        sets.addOnScrollListener(preloadScrollListener);
        sets.setHasFixedSize(true);
        RecyclerView selector = bind.root.getSelector();
        selector.setAdapter(setSwitchButtonsAdapter);
        Context context2 = selector.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        selector.addItemDecoration(new SetSwitchDecoration(context2));
        selector.setHasFixedSize(true);
        int i11 = containerView.getContext().getResources().getDisplayMetrics().widthPixels;
        int i12 = containerView.getContext().getResources().getDisplayMetrics().heightPixels;
        Context context3 = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.imageSize = new ImageSize(i11, i12 - ResourceExtKt.getStatusBarHeight(context3));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SetContainerVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetViewHolderKt.getEMPTY_PAYLOAD();
        bind(item, info, (Object) Unit.f71690a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SetContainerVO item, @NotNull d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (item.getCloseScreenStoryPosition() == -1) {
            bindSets(item, info);
            return;
        }
        this.storyPosition = item.getCloseScreenStoryPosition();
        RecyclerView.o layoutManager = this.binding.root.getSets().getLayoutManager();
        if (layoutManager != null) {
            layoutManager.scrollToPosition(this.storyPosition);
        }
        View itemView = this.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        itemView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.storefront.stories.setContainer.presentation.SetContainerVH$bind$$inlined$doOnNextLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                r rVar;
                Intrinsics.checkNotNullParameter(view, "view");
                view.removeOnLayoutChangeListener(this);
                SetContainerVH.this.saveScrollState();
                try {
                    rVar = SetContainerVH.this.activity;
                    rVar.startPostponedEnterTransition();
                } catch (Exception e11) {
                    a.f17149a.e(e11);
                }
            }
        });
        item.setCloseScreenStoryPosition(-1);
        bindSets(item, info);
    }
}
