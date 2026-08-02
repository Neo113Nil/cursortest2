package ru.ozon.app.android.cml.delivery.molecules.boxCard.presentation;

import Bi.b;
import Hj.C3143a;
import android.content.Context;
import android.graphics.Outline;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.internal.mlkit_common.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.R$drawable;
import ru.ozon.app.android.cml.delivery.R$id;
import ru.ozon.app.android.cml.delivery.common.ext.Dimens;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 >2\u00020\u0001:\u0001>B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0017\u001a\u00020\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 R.\u0010#\u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010!8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R*\u0010\r\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00100¨\u0006?"}, d2 = {"Lru/ozon/app/android/cml/delivery/molecules/boxCard/presentation/BoxCardView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/app/android/cml/delivery/molecules/boxCard/presentation/BoxCardVO;", "item", "", "hasBorder", "", "bind", "(Lru/ozon/app/android/cml/delivery/molecules/boxCard/presentation/BoxCardVO;Z)V", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "setTitle", "(Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "descriptions", "setDescription", "(Ljava/util/List;)V", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "setImage", "(Lru/ozon/uni/atoms/data/image/ImageDTO;)V", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "price", "setPrice", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "Landroid/view/View$OnClickListener;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "onClick", "Landroid/view/View$OnClickListener;", "getOnClick", "()Landroid/view/View$OnClickListener;", "setOnClick", "(Landroid/view/View$OnClickListener;)V", "Z", "getHasBorder", "()Z", "setHasBorder", "(Z)V", "Landroid/view/View;", "cardBorderView", "Landroid/view/View;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleTv", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "descriptionsLayout", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "Lru/ozon/uni/android/atom/image/Image;", "boxImageIv", "Lru/ozon/uni/android/atom/image/Image;", "Lru/ozon/uni/android/atom/badge/BadgeView;", "priceBadge", "Lru/ozon/uni/android/atom/badge/BadgeView;", "clickView", "Companion", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BoxCardView extends ConstraintLayout {

    @NotNull
    private final Image boxImageIv;

    @NotNull
    private final View cardBorderView;

    @NotNull
    private final View clickView;

    @NotNull
    private final VerticalAtomsLayout descriptionsLayout;
    private boolean hasBorder;
    private View.OnClickListener onClick;

    @NotNull
    private final BadgeView priceBadge;

    @NotNull
    private final TextAtomV2View titleTv;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int boxCardHeight = ResourceExtKt.toPx(208);
    private static final int boxCardWidth = ResourceExtKt.toPx(148);
    private static final int imageMaxHeight = ResourceExtKt.toPx(144);
    private static final float cardRadius = ResourceExtKt.toPxF(16);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/cml/delivery/molecules/boxCard/presentation/BoxCardView$Companion;", "", "<init>", "()V", "", "boxCardHeight", "I", "getBoxCardHeight", "()I", "boxCardWidth", "getBoxCardWidth", "", "cardRadius", "F", "getCardRadius", "()F", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getBoxCardHeight() {
            return BoxCardView.boxCardHeight;
        }

        public final int getBoxCardWidth() {
            return BoxCardView.boxCardWidth;
        }

        public final float getCardRadius() {
            return BoxCardView.cardRadius;
        }

        private Companion() {
        }
    }

    public /* synthetic */ BoxCardView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public final void bind(@NotNull BoxCardVO item, boolean hasBorder) {
        Intrinsics.checkNotNullParameter(item, "item");
        setHasBorder(hasBorder);
        ImageHolderKt.bind$default(this.boxImageIv, item.getImage(), null, 2, null);
        TextHolderKt.bind$default(this.titleTv, item.getTitle(), null, 2, null);
        setDescription(item.getDescriptions());
        BadgeHolderKt.bind$default(this.priceBadge, item.getPrice(), (Function1) null, 2, (Object) null);
    }

    public final void setDescription(@NotNull List<TextDTO> descriptions) {
        Intrinsics.checkNotNullParameter(descriptions, "descriptions");
        AtomsAdapter adapter = this.descriptionsLayout.getAdapter();
        if (adapter != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            adapter.bind(context, descriptions);
        }
    }

    public final void setHasBorder(boolean z11) {
        this.hasBorder = z11;
        this.cardBorderView.setBackgroundResource(z11 ? R$drawable.box_bg_border : R$drawable.box_bg_not_selected);
    }

    public final void setImage(@NotNull ImageDTO image) {
        Intrinsics.checkNotNullParameter(image, "image");
        ImageHolderKt.bind$default(this.boxImageIv, image, null, 2, null);
    }

    public final void setOnClick(View.OnClickListener onClickListener) {
        this.onClick = onClickListener;
        this.clickView.setOnClickListener(onClickListener);
    }

    public final void setPrice(@NotNull BadgeDTO price) {
        Intrinsics.checkNotNullParameter(price, "price");
        BadgeHolderKt.bind$default(this.priceBadge, price, (Function1) null, 2, (Object) null);
    }

    public final void setTitle(@NotNull TextDTO title) {
        Intrinsics.checkNotNullParameter(title, "title");
        TextHolderKt.bind$default(this.titleTv, title, null, 2, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoxCardView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        View view = new View(context);
        view.setId(R$id.boxCard_selectionBorder);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, 0);
        bVar.f41636i = 0;
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        bVar.f41642l = 0;
        view.setLayoutParams(bVar);
        view.setTranslationZ(1.0f);
        view.setBackgroundResource(R$drawable.box_bg_border);
        addView(view);
        this.cardBorderView = view;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b d11 = b.d(textAtomV2View, R$id.boxCard_titleTv, 0, -2);
        d11.f41636i = 0;
        d11.f41656t = 0;
        d11.f41658v = 0;
        Dimens dimens = Dimens.INSTANCE;
        ((ViewGroup.MarginLayoutParams) d11).topMargin = dimens.getDp8();
        d11.setMarginStart(dimens.getDp12());
        d11.setMarginEnd(dimens.getDp8());
        textAtomV2View.setLayoutParams(d11);
        textAtomV2View.setTextIsSelectable(false);
        addView(textAtomV2View);
        this.titleTv = textAtomV2View;
        VerticalAtomsLayout verticalAtomsLayout = new VerticalAtomsLayout(context, null, 0, 6, null);
        verticalAtomsLayout.setId(R$id.boxCard_descriptionsLayout);
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(0, -2);
        bVar2.f41638j = R$id.boxCard_titleTv;
        bVar2.f41656t = 0;
        bVar2.f41658v = 0;
        bVar2.setMarginStart(dimens.getDp12());
        bVar2.setMarginEnd(dimens.getDp8());
        verticalAtomsLayout.setLayoutParams(bVar2);
        verticalAtomsLayout.setAdapter(new AtomsAdapter(null, null, null, null, 15, null));
        addView(verticalAtomsLayout);
        this.descriptionsLayout = verticalAtomsLayout;
        Image image = new Image(context, null, 0, 6, null);
        image.setId(R$id.boxCard_image);
        int i12 = boxCardWidth;
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(i12, 0);
        bVar3.f41638j = R$id.boxCard_descriptionsLayout;
        bVar3.f41656t = 0;
        bVar3.f41658v = 0;
        bVar3.f41642l = 0;
        bVar3.f41617X = true;
        bVar3.f41610Q = imageMaxHeight;
        bVar3.f41598E = 1.0f;
        image.setLayoutParams(bVar3);
        addView(image);
        this.boxImageIv = image;
        BadgeView badgeView = new BadgeView(context, null, 0, 0, 14, null);
        ConstraintLayout.b a11 = a.a(badgeView, R$id.boxCard_priceBadge, -2, -2);
        a11.f41656t = 0;
        a11.f41642l = 0;
        a11.setMarginStart(dimens.getDp12());
        ((ViewGroup.MarginLayoutParams) a11).bottomMargin = dimens.getDp12();
        badgeView.setLayoutParams(a11);
        addView(badgeView);
        this.priceBadge = badgeView;
        View view2 = new View(context);
        view2.setLayoutParams(new ConstraintLayout.b(-1, -1));
        addView(view2);
        this.clickView = view2;
        setLayoutParams(new ViewGroup.LayoutParams(i12, boxCardHeight));
        setBackgroundColor(ResourceExtKt.color(context, R$color.layer_floor_1));
        setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.app.android.cml.delivery.molecules.boxCard.presentation.BoxCardView.1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view3, Outline outline) {
                outline.setRoundRect(0, 0, C3143a.f(view3, "view", outline, "outline"), view3.getHeight(), BoxCardView.INSTANCE.getCardRadius());
            }
        });
        setClipToOutline(true);
    }
}
