package ru.ozon.app.android.pdp.widgets.aspectsV4.presentation.rv;

import Sc.InterfaceC4008j;
import WZ.l;
import Xc.a;
import Xc.b;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import com.google.android.flexbox.FlexboxLayoutManager;
import j.C7232a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.base.WidgetViewHolderKt;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.widgets.aspectsV4.presentation.AspectsV4ImageVO;
import ru.ozon.app.android.pdp.widgets.aspectsV4.presentation.rv.AspectsV4ImageConst;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0006,-./01BW\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b\u0012\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\n\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\n\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001f\u0010 J-\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00192\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!H\u0016¢\u0006\u0004\b\u001f\u0010$J\u0017\u0010%\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b%\u0010&R\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010'R\u0018\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(R&\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010)R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010)R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010*R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010+¨\u00062"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/rv/AspectsV4ImageAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/AspectsV4ImageVO$Variant;", "Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/rv/AspectsV4BaseImageVH;", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Ll10/b;", "Lru/ozon/app/android/composer/ComposerController;", "controller", "LSc/j;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Landroid/graphics/drawable/LayerDrawable;", "fgImageDrawable", "", "isFlexbox", "Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/rv/AspectsV4ImageConst;", "imageSizes", "<init>", "(LWZ/l;Ll10/b;LSc/j;LSc/j;ZLru/ozon/app/android/pdp/widgets/aspectsV4/presentation/rv/AspectsV4ImageConst;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/rv/AspectsV4BaseImageVH;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/rv/AspectsV4BaseImageVH;I)V", "", "", "payloads", "(Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/rv/AspectsV4BaseImageVH;ILjava/util/List;)V", "getItemViewType", "(I)I", "LWZ/l;", "Ll10/b;", "LSc/j;", "Z", "Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/rv/AspectsV4ImageConst;", "AspectsV4OnlyImageVH", "AspectsV4OnlyImageWaveVH", "AspectsV4ImageWithBadgeVH", "AspectsV4ImageWithTextVH", "AspectsPayloadType", "AspectV4ImageType", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AspectsV4ImageAdapter extends t<AspectsV4ImageVO.Variant, AspectsV4BaseImageVH> {

    @NotNull
    private final InterfaceC4008j<Function1<AtomAction, Unit>> actionHandler;

    @NotNull
    private final InterfaceC7851b controller;

    @NotNull
    private final InterfaceC4008j<LayerDrawable> fgImageDrawable;

    @NotNull
    private final AspectsV4ImageConst imageSizes;
    private final boolean isFlexbox;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/rv/AspectsV4ImageAdapter$AspectV4ImageType;", "", "<init>", "(Ljava/lang/String;I)V", "ONLY_IMAGE", "ONLY_IMAGE_WITH_WAVE", "IMAGE_WITH_BADGE", "IMAGE_WITH_TEXT", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class AspectV4ImageType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ AspectV4ImageType[] $VALUES;
        public static final AspectV4ImageType ONLY_IMAGE = new AspectV4ImageType("ONLY_IMAGE", 0);
        public static final AspectV4ImageType ONLY_IMAGE_WITH_WAVE = new AspectV4ImageType("ONLY_IMAGE_WITH_WAVE", 1);
        public static final AspectV4ImageType IMAGE_WITH_BADGE = new AspectV4ImageType("IMAGE_WITH_BADGE", 2);
        public static final AspectV4ImageType IMAGE_WITH_TEXT = new AspectV4ImageType("IMAGE_WITH_TEXT", 3);

        private static final /* synthetic */ AspectV4ImageType[] $values() {
            return new AspectV4ImageType[]{ONLY_IMAGE, ONLY_IMAGE_WITH_WAVE, IMAGE_WITH_BADGE, IMAGE_WITH_TEXT};
        }

        static {
            AspectV4ImageType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private AspectV4ImageType(String str, int i11) {
        }

        public static AspectV4ImageType valueOf(String str) {
            return (AspectV4ImageType) Enum.valueOf(AspectV4ImageType.class, str);
        }

        public static AspectV4ImageType[] values() {
            return (AspectV4ImageType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/rv/AspectsV4ImageAdapter$AspectsPayloadType;", "", "<init>", "(Ljava/lang/String;I)V", "IMAGE", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AspectsPayloadType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ AspectsPayloadType[] $VALUES;
        public static final AspectsPayloadType IMAGE = new AspectsPayloadType("IMAGE", 0);

        private static final /* synthetic */ AspectsPayloadType[] $values() {
            return new AspectsPayloadType[]{IMAGE};
        }

        static {
            AspectsPayloadType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private AspectsPayloadType(String str, int i11) {
        }

        public static AspectsPayloadType valueOf(String str) {
            return (AspectsPayloadType) Enum.valueOf(AspectsPayloadType.class, str);
        }

        public static AspectsPayloadType[] values() {
            return (AspectsPayloadType[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/rv/AspectsV4ImageAdapter$AspectsV4ImageWithBadgeVH;", "Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/rv/AspectsV4BaseImageVH;", "view", "Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/rv/ImageAspectV4ViewFl;", "<init>", "(Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/rv/AspectsV4ImageAdapter;Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/rv/ImageAspectV4ViewFl;)V", "badgeView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "bind", "", "item", "Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/AspectsV4ImageVO$Variant;", "payload", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class AspectsV4ImageWithBadgeVH extends AspectsV4BaseImageVH {

        @NotNull
        private final BadgeView badgeView;
        final /* synthetic */ AspectsV4ImageAdapter this$0;

        @NotNull
        private final ImageAspectV4ViewFl view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AspectsV4ImageWithBadgeVH(@NotNull AspectsV4ImageAdapter aspectsV4ImageAdapter, ImageAspectV4ViewFl view) {
            super(view, aspectsV4ImageAdapter.tokenizedAnalytics, aspectsV4ImageAdapter.controller, aspectsV4ImageAdapter.actionHandler);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = aspectsV4ImageAdapter;
            this.view = view;
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            BadgeView badgeView = new BadgeView(context, null, 0, 0, 14, null);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 8388661;
            AspectsV4ImageConst.Companion companion = AspectsV4ImageConst.INSTANCE;
            layoutParams.rightMargin = -companion.getOVER_BOUNDS();
            layoutParams.topMargin = -companion.getOVER_BOUNDS();
            badgeView.setLayoutParams(layoutParams);
            view.setOverlayView(badgeView);
            this.badgeView = badgeView;
        }

        @Override // ru.ozon.app.android.pdp.widgets.aspectsV4.presentation.rv.AspectsV4BaseImageVH
        protected void bind(@NotNull AspectsV4ImageVO.Variant item, Object payload) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.view.bind(item, payload == null || payload == AspectsPayloadType.IMAGE);
            BadgeHolderKt.bindOrGone$default(this.badgeView, item.getBadge(), (Function1) null, 2, (Object) null);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/rv/AspectsV4ImageAdapter$AspectsV4ImageWithTextVH;", "Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/rv/AspectsV4BaseImageVH;", "view", "Landroid/widget/FrameLayout;", "imageView", "Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/rv/ImageAspectV4View;", "<init>", "(Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/rv/AspectsV4ImageAdapter;Landroid/widget/FrameLayout;Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/rv/ImageAspectV4View;)V", "textView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "bind", "", "item", "Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/AspectsV4ImageVO$Variant;", "payload", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class AspectsV4ImageWithTextVH extends AspectsV4BaseImageVH {

        @NotNull
        private final ImageAspectV4View imageView;

        @NotNull
        private final TextAtomV2View textView;
        final /* synthetic */ AspectsV4ImageAdapter this$0;

        @NotNull
        private final FrameLayout view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AspectsV4ImageWithTextVH(@NotNull AspectsV4ImageAdapter aspectsV4ImageAdapter, @NotNull FrameLayout view, ImageAspectV4View imageView) {
            super(view, aspectsV4ImageAdapter.tokenizedAnalytics, aspectsV4ImageAdapter.controller, aspectsV4ImageAdapter.actionHandler);
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(imageView, "imageView");
            this.this$0 = aspectsV4ImageAdapter;
            this.view = view;
            this.imageView = imageView;
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
            textAtomV2View.setId(R$id.aspectTav);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            textAtomV2View.setLayoutParams(layoutParams);
            textAtomV2View.setTextIsSelectable(false);
            this.textView = textAtomV2View;
            imageView.setForeground(C7232a.a(view.getContext(), R$color.graphic_tertiary_on_light));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(aspectsV4ImageAdapter.imageSizes.getImageRadius());
            view.setBackground(gradientDrawable);
            view.setClipToOutline(true);
            view.addView(imageView);
            view.addView(textAtomV2View);
        }

        @Override // ru.ozon.app.android.pdp.widgets.aspectsV4.presentation.rv.AspectsV4BaseImageVH
        protected void bind(@NotNull AspectsV4ImageVO.Variant item, Object payload) {
            Drawable.ConstantState constantState;
            Intrinsics.checkNotNullParameter(item, "item");
            this.view.setForeground((!item.getIsSelected() || (constantState = ((LayerDrawable) this.this$0.fgImageDrawable.getValue()).getConstantState()) == null) ? null : constantState.newDrawable());
            if (payload == null || payload == AspectsPayloadType.IMAGE) {
                ImageHolderKt.bind$default(this.imageView, item.getImage(), null, 2, null);
            }
            TextHolderKt.bindOrGone$default(this.textView, item.getLabel(), null, 2, null);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/rv/AspectsV4ImageAdapter$AspectsV4OnlyImageVH;", "Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/rv/AspectsV4BaseImageVH;", "view", "Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/rv/ImageAspectV4View;", "<init>", "(Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/rv/AspectsV4ImageAdapter;Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/rv/ImageAspectV4View;)V", "bind", "", "item", "Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/AspectsV4ImageVO$Variant;", "payload", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class AspectsV4OnlyImageVH extends AspectsV4BaseImageVH {
        final /* synthetic */ AspectsV4ImageAdapter this$0;

        @NotNull
        private final ImageAspectV4View view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AspectsV4OnlyImageVH(@NotNull AspectsV4ImageAdapter aspectsV4ImageAdapter, ImageAspectV4View view) {
            super(view, aspectsV4ImageAdapter.tokenizedAnalytics, aspectsV4ImageAdapter.controller, aspectsV4ImageAdapter.actionHandler);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = aspectsV4ImageAdapter;
            this.view = view;
        }

        @Override // ru.ozon.app.android.pdp.widgets.aspectsV4.presentation.rv.AspectsV4BaseImageVH
        protected void bind(@NotNull AspectsV4ImageVO.Variant item, Object payload) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.view.bind(item, payload == null || payload == AspectsPayloadType.IMAGE);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/rv/AspectsV4ImageAdapter$AspectsV4OnlyImageWaveVH;", "Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/rv/AspectsV4BaseImageVH;", "view", "Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/rv/ImageAspectV4ViewFl;", "<init>", "(Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/rv/AspectsV4ImageAdapter;Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/rv/ImageAspectV4ViewFl;)V", "bind", "", "item", "Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/AspectsV4ImageVO$Variant;", "payload", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class AspectsV4OnlyImageWaveVH extends AspectsV4BaseImageVH {
        final /* synthetic */ AspectsV4ImageAdapter this$0;

        @NotNull
        private final ImageAspectV4ViewFl view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AspectsV4OnlyImageWaveVH(@NotNull AspectsV4ImageAdapter aspectsV4ImageAdapter, ImageAspectV4ViewFl view) {
            super(view, aspectsV4ImageAdapter.tokenizedAnalytics, aspectsV4ImageAdapter.controller, aspectsV4ImageAdapter.actionHandler);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = aspectsV4ImageAdapter;
            this.view = view;
        }

        @Override // ru.ozon.app.android.pdp.widgets.aspectsV4.presentation.rv.AspectsV4BaseImageVH
        protected void bind(@NotNull AspectsV4ImageVO.Variant item, Object payload) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.view.bind(item, payload == null || payload == AspectsPayloadType.IMAGE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AspectsV4ImageAdapter(@NotNull l tokenizedAnalytics, @NotNull InterfaceC7851b controller, @NotNull InterfaceC4008j<? extends Function1<? super AtomAction, Unit>> actionHandler, @NotNull InterfaceC4008j<? extends LayerDrawable> fgImageDrawable, boolean z11, @NotNull AspectsV4ImageConst imageSizes) {
        super(new i.d<AspectsV4ImageVO.Variant>() { // from class: ru.ozon.app.android.pdp.widgets.aspectsV4.presentation.rv.AspectsV4ImageAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(AspectsV4ImageVO.Variant oldItem, AspectsV4ImageVO.Variant newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(AspectsV4ImageVO.Variant oldItem, AspectsV4ImageVO.Variant newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getId() == newItem.getId();
            }

            @Override // androidx.recyclerview.widget.i.d
            public Object getChangePayload(AspectsV4ImageVO.Variant oldItem, AspectsV4ImageVO.Variant newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                if (!Intrinsics.d(oldItem.getImage(), newItem.getImage())) {
                    return AspectsPayloadType.IMAGE;
                }
                WidgetViewHolderKt.getEMPTY_PAYLOAD();
                return Unit.f71690a;
            }
        });
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(fgImageDrawable, "fgImageDrawable");
        Intrinsics.checkNotNullParameter(imageSizes, "imageSizes");
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.controller = controller;
        this.actionHandler = actionHandler;
        this.fgImageDrawable = fgImageDrawable;
        this.isFlexbox = z11;
        this.imageSizes = imageSizes;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        AspectsV4ImageVO.Variant item = getItem(position);
        return item.getBadge() != null ? AspectV4ImageType.IMAGE_WITH_BADGE.ordinal() : item.getLabel() != null ? AspectV4ImageType.IMAGE_WITH_TEXT.ordinal() : item.getIsWave() ? AspectV4ImageType.ONLY_IMAGE_WITH_WAVE.ordinal() : AspectV4ImageType.ONLY_IMAGE.ordinal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.C c11, int i11, List list) {
        onBindViewHolder((AspectsV4BaseImageVH) c11, i11, (List<Object>) list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public AspectsV4BaseImageVH onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        ViewGroup.LayoutParams layoutParams;
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ImageAspectV4View imageAspectV4View = new ImageAspectV4View(context, this.fgImageDrawable);
        imageAspectV4View.setId(R$id.aspectIv);
        if (this.isFlexbox) {
            FlexboxLayoutManager.b bVar = new FlexboxLayoutManager.b(this.imageSizes.getImageWidth(), -2);
            bVar.e();
            layoutParams = bVar;
        } else {
            layoutParams = new ViewGroup.LayoutParams(this.imageSizes.getImageWidth(), -2);
        }
        imageAspectV4View.setLayoutParams(layoutParams);
        if (viewType == AspectV4ImageType.ONLY_IMAGE.ordinal()) {
            return new AspectsV4OnlyImageVH(this, imageAspectV4View);
        }
        if (viewType == AspectV4ImageType.ONLY_IMAGE_WITH_WAVE.ordinal()) {
            Context context2 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            return new AspectsV4OnlyImageWaveVH(this, new ImageAspectV4ViewFl(context2, imageAspectV4View, this.imageSizes));
        }
        if (viewType == AspectV4ImageType.IMAGE_WITH_BADGE.ordinal()) {
            Context context3 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            return new AspectsV4ImageWithBadgeVH(this, new ImageAspectV4ViewFl(context3, imageAspectV4View, this.imageSizes));
        }
        if (viewType == AspectV4ImageType.IMAGE_WITH_TEXT.ordinal()) {
            FrameLayout frameLayout = new FrameLayout(parent.getContext());
            frameLayout.setId(R$id.aspectVariantRoot);
            return new AspectsV4ImageWithTextVH(this, frameLayout, imageAspectV4View);
        }
        throw new IllegalStateException(("Unknown view type: " + viewType).toString());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull AspectsV4BaseImageVH holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        AspectsV4ImageVO.Variant item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bindElement(item, null);
    }

    public void onBindViewHolder(@NotNull AspectsV4BaseImageVH holder, int position, @NotNull List<Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        AspectsV4ImageVO.Variant item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bindElement(item, C7714v.M(payloads));
    }
}
