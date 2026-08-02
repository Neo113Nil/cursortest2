package ru.ozon.app.android.geo.addresseditcarousel.presentation.options;

import Au.e;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.af.layout.HorizontalAtomsLayout;
import ru.ozon.app.android.geo.addresseditcarousel.presentation.AddressEditCarouselVO;
import ru.ozon.app.android.geo.addresseditcarousel.presentation.options.CellWithBadgeView;
import ru.ozon.app.android.geo.databinding.ItemOptionCellBinding;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ&\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0013H\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/geo/addresseditcarousel/presentation/options/CellWithBadgeView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lru/ozon/app/android/geo/databinding/ItemOptionCellBinding;", "badgesAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "bind", "", "item", "Lru/ozon/app/android/geo/addresseditcarousel/presentation/AddressEditCarouselVO$CellVO;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CellWithBadgeView extends ConstraintLayout {

    @NotNull
    private final AtomsAdapter badgesAdapter;

    @NotNull
    private final ItemOptionCellBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CellWithBadgeView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$8$lambda$2(AddressEditCarouselVO.CellVO cellVO, Function1 function1, View view) {
        AtomAction action = cellVO.getAction();
        if (action == null || function1 == null) {
            return;
        }
        function1.invoke(action);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bind$lambda$8$lambda$7(AddressEditCarouselVO.CellVO cellVO, Function1 function1, View view, MotionEvent motionEvent) {
        AddressEditCarouselVO.CellVO.NumberPVZ numberPVZ;
        AtomAction action;
        if (motionEvent.getAction() == 1 && (numberPVZ = cellVO.getNumberPVZ()) != null && (action = numberPVZ.getAction()) != null && function1 != null) {
            function1.invoke(action);
        }
        return true;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void bind(@NotNull final AddressEditCarouselVO.CellVO item, final Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(item, "item");
        ItemOptionCellBinding itemOptionCellBinding = this.binding;
        itemOptionCellBinding.getConstraintLayout().setOnClickListener(new e(4, (Function1) onAction, (Object) item));
        TextView textView = itemOptionCellBinding.titleTv;
        textView.setText(item.getTitle());
        textView.setEnabled(item.getAction() != null);
        TextView textView2 = itemOptionCellBinding.subtitleTv;
        textView2.setText(item.getSubtitle());
        ViewExtKt.showOrGone(textView2, Boolean.valueOf(item.getSubtitle().length() > 0));
        ImageView imageView = itemOptionCellBinding.imageIv;
        Intrinsics.f(imageView);
        ViewExtKt.showOrGone(imageView, Boolean.valueOf(item.getImage() != null));
        ImageViewExtKt.load$default(imageView, item.getImage(), null, null, null, null, false, null, 126, null);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ThemeExtKt.tint(imageView, styleParser.parseColor(context, item.getImageTintColor()));
        AtomsAdapter atomsAdapter = this.badgesAdapter;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        List<BadgeDTO> badges = item.getBadges();
        if (badges == null) {
            badges = K.f71697a;
        }
        atomsAdapter.bind(context2, badges);
        HorizontalAtomsLayout badgesHAL = itemOptionCellBinding.badgesHAL;
        Intrinsics.checkNotNullExpressionValue(badgesHAL, "badgesHAL");
        List<BadgeDTO> badges2 = item.getBadges();
        badgesHAL.setVisibility((badges2 == null || !(badges2.isEmpty() ^ true)) ? 8 : 0);
        TextAtomV2View numberPVZ = itemOptionCellBinding.numberPVZ;
        Intrinsics.checkNotNullExpressionValue(numberPVZ, "numberPVZ");
        AddressEditCarouselVO.CellVO.NumberPVZ numberPVZ2 = item.getNumberPVZ();
        TextHolderKt.bindOrGone$default(numberPVZ, numberPVZ2 != null ? numberPVZ2.getNumber() : null, null, 2, null);
        itemOptionCellBinding.numberPVZ.setOnTouchListener(new View.OnTouchListener() { // from class: sy.a
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean bind$lambda$8$lambda$7;
                bind$lambda$8$lambda$7 = CellWithBadgeView.bind$lambda$8$lambda$7(AddressEditCarouselVO.CellVO.this, onAction, view, motionEvent);
                return bind$lambda$8$lambda$7;
            }
        });
    }

    public /* synthetic */ CellWithBadgeView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CellWithBadgeView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        ItemOptionCellBinding inflate = ItemOptionCellBinding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.badgesAdapter = atomsAdapter;
        HorizontalAtomsLayout horizontalAtomsLayout = inflate.badgesHAL;
        horizontalAtomsLayout.setAdapter(atomsAdapter);
        horizontalAtomsLayout.setDecorator(new AddressEditCarouselBadgeDecorator(context));
    }
}
