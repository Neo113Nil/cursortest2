package ru.ozon.app.android.travel.molecules.view.textInfoCells;

import Ef0.c;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import com.google.android.gms.internal.mlkit_common.a;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.molecules.dto.textInfoCells.TextInfoCellDTO;
import ru.ozon.app.android.travel.ui.molecules.R$id;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ&\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0016\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00140\u0018j\u0002`\u001aJ*\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u001dH\u0002R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/molecules/view/textInfoCells/TextInfoCellView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "dp4", "dp8", "badgeView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "iconView", "Landroidx/appcompat/widget/AppCompatImageView;", "textAtomView", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "bind", "", "item", "Lru/ozon/app/android/travel/molecules/view/textInfoCells/TextInfoCellVO;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/BuildedActionHandler;", "placeViews", "isCenteredText", "", "markerAlignment", "Lru/ozon/app/android/travel/molecules/dto/textInfoCells/TextInfoCellDTO$MarkerAlignment;", "offsetBetween", "isIconNull", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TextInfoCellView extends ConstraintLayout {

    @NotNull
    private final BadgeView badgeView;
    private final int dp4;
    private final int dp8;

    @NotNull
    private final AppCompatImageView iconView;

    @NotNull
    private final TextAtomView textAtomView;

    public /* synthetic */ TextInfoCellView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    private final void placeViews(boolean isCenteredText, TextInfoCellDTO.MarkerAlignment markerAlignment, int offsetBetween, boolean isIconNull) {
        this.iconView.setVisibility(!isIconNull ? 0 : 8);
        d dVar = new d();
        dVar.p(this);
        if (!isIconNull) {
            dVar.f0(markerAlignment == TextInfoCellDTO.MarkerAlignment.ALIGN_TYPE_CENTER ? 0.5f : 0.0f, this.iconView.getId());
            dVar.e0(this.textAtomView.getId(), 6, offsetBetween);
        }
        this.textAtomView.setGravity(isCenteredText ? 17 : 8388611);
        dVar.c0(isCenteredText ? 0.5f : 0.0f, this.badgeView.getId());
        dVar.f(this);
    }

    public final void bind(@NotNull TextInfoCellVO item, @NotNull Function1<? super AtomAction, Unit> onAction) {
        int i11;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        BadgeHolderKt.bindOrGone$default(this.badgeView, item.getServiceBadge(), (Function1) null, 2, (Object) null);
        TextAtomHolderKt.bind(this.textAtomView, item.getText(), onAction);
        AppCompatImageView appCompatImageView = this.iconView;
        Icon marker = item.getMarker();
        ImageViewExtKt.load$default(appCompatImageView, marker != null ? marker.getImage() : null, null, null, null, null, false, null, 126, null);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = appCompatImageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Icon marker2 = item.getMarker();
        ThemeExtKt.tint(appCompatImageView, styleParser.parseColor(context, marker2 != null ? marker2.getTintColor() : null));
        boolean isCenteredText = item.getIsCenteredText();
        TextInfoCellDTO.MarkerAlignment markerAlignment = item.getMarkerAlignment();
        Integer offsetBetween = item.getOffsetBetween();
        if (offsetBetween != null) {
            int intValue = offsetBetween.intValue();
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            i11 = ResourceExtKt.toPx(intValue, context2);
        } else {
            i11 = this.dp8;
        }
        placeViews(isCenteredText, markerAlignment, i11, item.getMarker() == null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextInfoCellView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(4, context);
        this.dp4 = px;
        this.dp8 = ResourceExtKt.toPx(8, context);
        q qVar = q.f64554a;
        BadgeView badgeView = (BadgeView) qVar.g(N.b(BadgeView.class), context);
        ConstraintLayout.b a11 = a.a(badgeView, R$id.text_info_cell_view_badge, -2, -2);
        a11.f41598E = 0.0f;
        badgeView.setLayoutParams(a11);
        this.badgeView = badgeView;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R$id.text_info_cell_view_icon);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.f41660x = 0;
        bVar.f41603J = 2;
        appCompatImageView.setLayoutParams(bVar);
        this.iconView = appCompatImageView;
        TextAtomView textAtomView = (TextAtomView) qVar.g(N.b(TextAtomView.class), context);
        ConstraintLayout.b b11 = c.b(textAtomView, R$id.text_info_cell_view_text, 0, -2);
        b11.f41594A = 0;
        b11.f41660x = 0;
        textAtomView.setLayoutParams(b11);
        this.textAtomView = textAtomView;
        addView(badgeView);
        addView(appCompatImageView);
        addView(textAtomView);
        d dVar = new d();
        dVar.p(this);
        ConstraintLayoutExtensionsKt.topToParent(dVar, badgeView);
        ConstraintLayoutExtensionsKt.startToParent(dVar, badgeView);
        ConstraintLayoutExtensionsKt.endToParent(dVar, badgeView);
        ConstraintLayoutExtensionsKt.topToBottom(dVar, appCompatImageView, badgeView, px);
        ConstraintLayoutExtensionsKt.startToParent(dVar, appCompatImageView);
        ConstraintLayoutExtensionsKt.endToStart(dVar, appCompatImageView, textAtomView);
        ConstraintLayoutExtensionsKt.startToEnd(dVar, textAtomView, appCompatImageView);
        ConstraintLayoutExtensionsKt.topToBottom(dVar, textAtomView, badgeView, px);
        ConstraintLayoutExtensionsKt.endToParent(dVar, textAtomView);
        dVar.f(this);
    }
}
