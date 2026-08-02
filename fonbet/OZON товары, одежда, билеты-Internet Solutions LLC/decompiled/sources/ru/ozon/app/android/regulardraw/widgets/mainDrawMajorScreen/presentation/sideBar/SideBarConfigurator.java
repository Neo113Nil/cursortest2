package ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.presentation.sideBar;

import ED.a;
import Hj.C3143a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.regulardraw.R$color;
import ru.ozon.app.android.regulardraw.databinding.ItemMainDrawMajorScreenSideBarBinding;
import ru.ozon.app.android.regulardraw.databinding.ItemMainDrawMajorScreenTaskBinding;
import ru.ozon.app.android.regulardraw.databinding.WidgetMainDrawMajorScreenBinding;
import ru.ozon.app.android.regulardraw.ui.currencyBadge.MorkovskCurrencyBadge;
import ru.ozon.app.android.regulardraw.utils.UtilKt;
import ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.data.MainDrawMajorScreenVO;
import ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.presentation.sideBar.SideBarConfigurator;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import y7.C10850a;
import y7.C10856g;
import y7.k;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u001e\u0010\u000f\u001a\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\r\u001a\u00020\u0013H\u0002J\u001e\u0010\u0014\u001a\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\r\u001a\u00020\u0013H\u0002J\u001e\u0010\u0015\u001a\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\r\u001a\u00020\u0013H\u0002J\u0018\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0012H\u0002J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/presentation/sideBar/SideBarConfigurator;", "", "context", "Landroid/content/Context;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "bindSideBars", "item", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenVO;", "binding", "Lru/ozon/app/android/regulardraw/databinding/WidgetMainDrawMajorScreenBinding;", "bindRightSideBar", "list", "", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenVO$Lootbox;", "Lru/ozon/app/android/regulardraw/databinding/ItemMainDrawMajorScreenSideBarBinding;", "bindLeftSideBar", "bindSingleSideBar", "bindTask", "taskBinding", "Lru/ozon/app/android/regulardraw/databinding/ItemMainDrawMajorScreenTaskBinding;", "task", "configSingleImage", "configMultipleImage", "Companion", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SideBarConfigurator {
    private static final float viewBorder;
    private static final int viewHeight;

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final Context context;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int sideBarMargin = ResourceExtKt.toPx(10);
    private static final int imageTopMargin = ResourceExtKt.toPx(8);
    private static final int taskRadius = ResourceExtKt.toPx(12);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/presentation/sideBar/SideBarConfigurator$Companion;", "", "<init>", "()V", "", "taskRadius", "I", "getTaskRadius", "()I", "", "TASK_IMAGE_ROTATION", "F", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getTaskRadius() {
            return SideBarConfigurator.taskRadius;
        }

        private Companion() {
        }
    }

    static {
        float pxF = ResourceExtKt.toPxF(2);
        viewBorder = pxF;
        viewHeight = (((int) pxF) * 2) + ResourceExtKt.toPx(48);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SideBarConfigurator(@NotNull Context context, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.context = context;
        this.actionHandler = actionHandler;
    }

    private final void bindLeftSideBar(List<MainDrawMajorScreenVO.Lootbox> list, ItemMainDrawMajorScreenSideBarBinding binding) {
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = sideBarMargin;
        constraintLayout.setLayoutParams(marginLayoutParams);
        bindSingleSideBar(list, binding);
    }

    private final void bindRightSideBar(List<MainDrawMajorScreenVO.Lootbox> list, ItemMainDrawMajorScreenSideBarBinding binding) {
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.rightMargin = sideBarMargin;
        constraintLayout.setLayoutParams(marginLayoutParams);
        bindSingleSideBar(list, binding);
    }

    private final void bindSingleSideBar(List<MainDrawMajorScreenVO.Lootbox> list, ItemMainDrawMajorScreenSideBarBinding binding) {
        int i11 = 0;
        for (Object obj : C7714v.b0(binding.firstTask, binding.secondTask, binding.thirdTask)) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            ItemMainDrawMajorScreenTaskBinding itemMainDrawMajorScreenTaskBinding = (ItemMainDrawMajorScreenTaskBinding) obj;
            MainDrawMajorScreenVO.Lootbox lootbox = (MainDrawMajorScreenVO.Lootbox) C7714v.Q(i11, list);
            ConstraintLayout constraintLayout = itemMainDrawMajorScreenTaskBinding.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            constraintLayout.setVisibility(lootbox != null ? 0 : 8);
            if (lootbox != null) {
                bindTask(itemMainDrawMajorScreenTaskBinding, lootbox);
            }
            i11 = i12;
        }
    }

    private final void bindTask(ItemMainDrawMajorScreenTaskBinding taskBinding, MainDrawMajorScreenVO.Lootbox task) {
        MorkovskCurrencyBadge.bindOrInvisible$default(taskBinding.currencyBadge, task.getBadgeCounter(), null, 2, null);
        AppCompatImageView bottomImage = taskBinding.bottomImage;
        Intrinsics.checkNotNullExpressionValue(bottomImage, "bottomImage");
        ImageViewExtKt.load$default(bottomImage, task.getBottomImage(), null, null, null, null, false, null, 126, null);
        taskBinding.indicator.bindOrGone(task.getIndicator());
        if (task.getIsSingleImage()) {
            configSingleImage(taskBinding);
        } else {
            configMultipleImage(taskBinding);
        }
        AppCompatImageView appCompatImageView = taskBinding.mainImage;
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        appCompatImageView.setClipToOutline(true);
        ImageViewExtKt.load$default(appCompatImageView, task.getImage(), null, null, Integer.valueOf(R$drawable.ozon_image_placeholder), null, false, null, 118, null);
        taskBinding.getConstraintLayout().setOnClickListener(new a(3, task, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindTask$lambda$7(MainDrawMajorScreenVO.Lootbox lootbox, SideBarConfigurator sideBarConfigurator, View view) {
        AtomAction action = lootbox.getAction();
        if (action != null) {
            sideBarConfigurator.actionHandler.invoke(action);
        }
    }

    private final void configMultipleImage(ItemMainDrawMajorScreenTaskBinding taskBinding) {
        k.a aVar = new k.a(new k());
        aVar.d(new C10850a(taskRadius));
        k a11 = aVar.a();
        Intrinsics.checkNotNullExpressionValue(a11, "build(...)");
        C10856g c10856g = new C10856g(a11);
        c10856g.B(ColorStateList.valueOf(0));
        c10856g.I(viewBorder, UtilKt.parseColor(R$color.prize_progress_border_color, this.context));
        AppCompatImageView appCompatImageView = taskBinding.mainImage;
        Intrinsics.f(appCompatImageView);
        ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        int i11 = viewHeight;
        ((ViewGroup.MarginLayoutParams) bVar).width = i11;
        ((ViewGroup.MarginLayoutParams) bVar).height = i11;
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = imageTopMargin;
        appCompatImageView.setLayoutParams(bVar);
        appCompatImageView.setForeground(c10856g);
        appCompatImageView.setBackgroundColor(-1);
        appCompatImageView.setRotation(12.0f);
        appCompatImageView.setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.presentation.sideBar.SideBarConfigurator$configMultipleImage$1$1$2
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                SideBarConfigurator.Companion companion;
                int f7 = C3143a.f(view, "view", outline, "outline");
                int height = view.getHeight();
                companion = SideBarConfigurator.Companion;
                outline.setRoundRect(0, 0, f7, height, companion.getTaskRadius());
            }
        });
        appCompatImageView.setClipToOutline(true);
        AppCompatImageView bottomImage = taskBinding.bottomImage;
        Intrinsics.checkNotNullExpressionValue(bottomImage, "bottomImage");
        bottomImage.setVisibility(0);
    }

    private final void configSingleImage(ItemMainDrawMajorScreenTaskBinding taskBinding) {
        AppCompatImageView appCompatImageView = taskBinding.mainImage;
        Intrinsics.f(appCompatImageView);
        ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        ((ViewGroup.MarginLayoutParams) bVar).width = 0;
        ((ViewGroup.MarginLayoutParams) bVar).height = -2;
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = 0;
        appCompatImageView.setLayoutParams(bVar);
        appCompatImageView.setBackground(null);
        appCompatImageView.setForeground(null);
        appCompatImageView.setRotation(0.0f);
        AppCompatImageView bottomImage = taskBinding.bottomImage;
        Intrinsics.checkNotNullExpressionValue(bottomImage, "bottomImage");
        bottomImage.setVisibility(8);
    }

    public final void bindSideBars(@NotNull MainDrawMajorScreenVO item, @NotNull WidgetMainDrawMajorScreenBinding binding) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(binding, "binding");
        List<MainDrawMajorScreenVO.Lootbox> leftItems = item.getLeftItems();
        ItemMainDrawMajorScreenSideBarBinding leftSideBar = binding.leftSideBar;
        Intrinsics.checkNotNullExpressionValue(leftSideBar, "leftSideBar");
        bindLeftSideBar(leftItems, leftSideBar);
        List<MainDrawMajorScreenVO.Lootbox> rightItems = item.getRightItems();
        ItemMainDrawMajorScreenSideBarBinding rightSideBar = binding.rightSideBar;
        Intrinsics.checkNotNullExpressionValue(rightSideBar, "rightSideBar");
        bindRightSideBar(rightItems, rightSideBar);
    }
}
