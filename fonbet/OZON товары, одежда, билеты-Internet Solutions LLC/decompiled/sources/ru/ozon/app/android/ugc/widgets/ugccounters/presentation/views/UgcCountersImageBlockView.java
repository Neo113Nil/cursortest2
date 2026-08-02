package ru.ozon.app.android.ugc.widgets.ugccounters.presentation.views;

import aX.ViewOnClickListenerC4980a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.R$id;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersImagesPreCreationConfig;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersVO;
import ru.ozon.app.android.video.preload.data.PreloadVideoInfo;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 '2\u00020\u0001:\u0001'BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0018J@\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020!2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0018H\u0002J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002J\b\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020&H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/views/UgcCountersImageBlockView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "imageBlockClickAction", "Lkotlin/Function2;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "", "imagesPreCreationConfig", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersImagesPreCreationConfig;", "preCreationBgImageDrawable", "Landroid/graphics/drawable/ShapeDrawable;", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function2;Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersImagesPreCreationConfig;Landroid/graphics/drawable/ShapeDrawable;)V", "preCreationElements", "", "Landroid/view/View;", "bind", "block", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO$Block$Images;", "widgetBackgroundColor", "", "onImageLoadSuccessful", "Lkotlin/Function0;", "createElementView", "outlineColor", "label", "Lru/ozon/uni/atoms/data/text/TextDTO;", "isFirstItem", "", "imageUrl", "cornerRadius", "", "preCreateElements", "createImageBlockView", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/views/UgcCountersImageView;", "createImageBlockLabelView", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/views/UgcCountersImageLabelView;", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class UgcCountersImageBlockView extends LinearLayout {

    @NotNull
    private final Context context;

    @NotNull
    private final Function2<AtomAction, PreloadVideoInfo, Unit> imageBlockClickAction;
    private final UgcCountersImagesPreCreationConfig imagesPreCreationConfig;
    private final ShapeDrawable preCreationBgImageDrawable;

    @NotNull
    private final List<View> preCreationElements;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/views/UgcCountersImageBlockView$Companion;", "", "<init>", "()V", "createPreCreationBgImageDrawable", "Landroid/graphics/drawable/ShapeDrawable;", "imagesPreCreationConfig", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersImagesPreCreationConfig;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ShapeDrawable createPreCreationBgImageDrawable(@NotNull UgcCountersImagesPreCreationConfig imagesPreCreationConfig) {
            Intrinsics.checkNotNullParameter(imagesPreCreationConfig, "imagesPreCreationConfig");
            float[] fArr = new float[8];
            for (int i11 = 0; i11 < 8; i11++) {
                fArr[i11] = imagesPreCreationConfig.getCornerRadius();
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
            if (imagesPreCreationConfig.getImagesCount() > 0 || imagesPreCreationConfig.getImagesWithLabelCount() > 0) {
                return shapeDrawable;
            }
            return null;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UgcCountersImageBlockView(@NotNull Context context, @NotNull Function2<? super AtomAction, ? super PreloadVideoInfo, Unit> imageBlockClickAction, UgcCountersImagesPreCreationConfig ugcCountersImagesPreCreationConfig, ShapeDrawable shapeDrawable) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageBlockClickAction, "imageBlockClickAction");
        this.context = context;
        this.imageBlockClickAction = imageBlockClickAction;
        this.imagesPreCreationConfig = ugcCountersImagesPreCreationConfig;
        this.preCreationBgImageDrawable = shapeDrawable;
        this.preCreationElements = preCreateElements();
        setId(R$id.ugcImageBlockRoot);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        setGravity(17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$3$lambda$2(UgcCountersImageBlockView ugcCountersImageBlockView, AtomAction atomAction, UgcCountersVO.Block.Images images, View view) {
        ugcCountersImageBlockView.imageBlockClickAction.invoke(atomAction, images.getVideoInfo());
    }

    private final View createElementView(String outlineColor, TextDTO label, boolean isFirstItem, String imageUrl, int cornerRadius, Function0<Unit> onImageLoadSuccessful) {
        UgcCountersImageLabelView ugcCountersImageLabelView;
        Object obj = null;
        if (label == null) {
            Iterator<T> it = this.preCreationElements.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (next instanceof UgcCountersImageView) {
                    obj = next;
                    break;
                }
            }
            UgcCountersImageView ugcCountersImageView = (UgcCountersImageView) obj;
            UgcCountersImageView ugcCountersImageView2 = ugcCountersImageView;
            if (ugcCountersImageView == null) {
                ugcCountersImageView2 = createImageBlockView();
            }
            this.preCreationElements.remove(ugcCountersImageView2);
            ugcCountersImageView2.bind(outlineColor, !isFirstItem, isFirstItem);
            ugcCountersImageView2.loadBlockImage(imageUrl, K.f71697a, cornerRadius, onImageLoadSuccessful);
            ugcCountersImageLabelView = ugcCountersImageView2;
        } else {
            Iterator<T> it2 = this.preCreationElements.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (next2 instanceof UgcCountersImageLabelView) {
                    obj = next2;
                    break;
                }
            }
            UgcCountersImageLabelView ugcCountersImageLabelView2 = (UgcCountersImageLabelView) obj;
            UgcCountersImageLabelView ugcCountersImageLabelView3 = ugcCountersImageLabelView2;
            if (ugcCountersImageLabelView2 == null) {
                ugcCountersImageLabelView3 = createImageBlockLabelView();
            }
            this.preCreationElements.remove(ugcCountersImageLabelView3);
            ugcCountersImageLabelView3.bind(outlineColor, label, isFirstItem);
            ugcCountersImageLabelView3.loadLabelImage(imageUrl, cornerRadius, onImageLoadSuccessful);
            ugcCountersImageLabelView = ugcCountersImageLabelView3;
        }
        ugcCountersImageLabelView.setId(View.generateViewId());
        return ugcCountersImageLabelView;
    }

    private final UgcCountersImageLabelView createImageBlockLabelView() {
        return new UgcCountersImageLabelView(this.context, this.preCreationBgImageDrawable);
    }

    private final UgcCountersImageView createImageBlockView() {
        return new UgcCountersImageView(this.context, this.preCreationBgImageDrawable);
    }

    private final List<View> preCreateElements() {
        UgcCountersImagesPreCreationConfig ugcCountersImagesPreCreationConfig = this.imagesPreCreationConfig;
        if (ugcCountersImagesPreCreationConfig == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        int imagesCount = ugcCountersImagesPreCreationConfig.getImagesCount();
        for (int i11 = 0; i11 < imagesCount; i11++) {
            arrayList.add(createImageBlockView());
        }
        int imagesWithLabelCount = ugcCountersImagesPreCreationConfig.getImagesWithLabelCount();
        for (int i12 = 0; i12 < imagesWithLabelCount; i12++) {
            arrayList.add(createImageBlockLabelView());
        }
        return arrayList;
    }

    public final void bind(@NotNull UgcCountersVO.Block.Images block, @NotNull String widgetBackgroundColor, @NotNull Function0<Unit> onImageLoadSuccessful) {
        Intrinsics.checkNotNullParameter(block, "block");
        String str = widgetBackgroundColor;
        Intrinsics.checkNotNullParameter(widgetBackgroundColor, "widgetBackgroundColor");
        Intrinsics.checkNotNullParameter(onImageLoadSuccessful, "onImageLoadSuccessful");
        ArrayList arrayList = new ArrayList();
        kotlin.jvm.internal.K k11 = new kotlin.jvm.internal.K();
        Iterator<T> it = block.getImages().iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                removeAllViews();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    addView((View) it2.next());
                }
                AtomAction action = block.getAction();
                setOnClickListener(action != null ? new ViewOnClickListenerC4980a(this, action, block, 0) : null);
                return;
            }
            Object next = it.next();
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            UgcCountersVO.Block.Images.Image image = (UgcCountersVO.Block.Images.Image) next;
            arrayList.add(createElementView(str, image.getLabel(), i11 == 0, image.getUrl(), ResourceExtKt.toPx(block.getCornerRadius().getPx()), new UgcCountersImageBlockView$bind$1$elementView$1(k11, block, onImageLoadSuccessful)));
            str = widgetBackgroundColor;
            i11 = i12;
        }
    }
}
