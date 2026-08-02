package ru.ozon.app.android.pdpoldwidgets.widgets.namedValueList.presentation.header;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdpoldwidgets.databinding.WidgetNamedValueListHeaderBinding;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.VerticalAtomsDecorator;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000b\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/namedValueList/presentation/header/NamedValueListHeaderViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/pdpoldwidgets/widgets/namedValueList/presentation/header/NamedValueListHeaderVO;", "Lru/ozon/app/android/pdpoldwidgets/databinding/WidgetNamedValueListHeaderBinding;", "binding", "<init>", "(Lru/ozon/app/android/pdpoldwidgets/databinding/WidgetNamedValueListHeaderBinding;)V", "item", "", "bindTitle", "(Lru/ozon/app/android/pdpoldwidgets/databinding/WidgetNamedValueListHeaderBinding;Lru/ozon/app/android/pdpoldwidgets/widgets/namedValueList/presentation/header/NamedValueListHeaderVO;)V", "bindSubtitles", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/pdpoldwidgets/widgets/namedValueList/presentation/header/NamedValueListHeaderVO;Ll20/d;)V", "Lru/ozon/app/android/pdpoldwidgets/databinding/WidgetNamedValueListHeaderBinding;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "atomsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NamedValueListHeaderViewHolder extends k<NamedValueListHeaderVO> {

    @NotNull
    private final AtomsAdapter atomsAdapter;

    @NotNull
    private final WidgetNamedValueListHeaderBinding binding;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public NamedValueListHeaderViewHolder(@NotNull WidgetNamedValueListHeaderBinding binding) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.atomsAdapter = atomsAdapter;
        VerticalAtomsLayout verticalAtomsLayout = binding.subtitlesVal;
        verticalAtomsLayout.setAdapter(atomsAdapter);
        verticalAtomsLayout.setDecorator(new VerticalAtomsDecorator() { // from class: ru.ozon.app.android.pdpoldwidgets.widgets.namedValueList.presentation.header.NamedValueListHeaderViewHolder$1$1
            private final int dp16 = ResourceExtKt.toPx(16);
            private final int dp8 = ResourceExtKt.toPx(8);

            @Override // ru.ozon.uni.atoms.af.CommonAtomDecorator
            public void decorate(Canvas canvas, Rect rect, int i11, boolean z11) {
                VerticalAtomsDecorator.DefaultImpls.decorate(this, canvas, rect, i11, z11);
            }

            @Override // ru.ozon.uni.atoms.af.VerticalAtomsDecorator
            public LinearLayout.LayoutParams modifyVerticalLayoutParams(LinearLayout.LayoutParams lp, AtomDTO data, int position, boolean last) {
                Intrinsics.checkNotNullParameter(lp, "lp");
                Intrinsics.checkNotNullParameter(data, "data");
                lp.setMarginStart(this.dp16);
                lp.setMarginEnd(this.dp16);
                lp.topMargin = position == 0 ? 0 : this.dp8;
                return lp;
            }
        });
    }

    private final void bindSubtitles(WidgetNamedValueListHeaderBinding widgetNamedValueListHeaderBinding, NamedValueListHeaderVO namedValueListHeaderVO) {
        List<TextDTO> subtitles = namedValueListHeaderVO.getSubtitles();
        if (subtitles == null) {
            VerticalAtomsLayout subtitlesVal = widgetNamedValueListHeaderBinding.subtitlesVal;
            Intrinsics.checkNotNullExpressionValue(subtitlesVal, "subtitlesVal");
            ViewExtKt.gone(subtitlesVal);
        } else {
            this.atomsAdapter.bind(getContext(), subtitles);
            VerticalAtomsLayout subtitlesVal2 = widgetNamedValueListHeaderBinding.subtitlesVal;
            Intrinsics.checkNotNullExpressionValue(subtitlesVal2, "subtitlesVal");
            ViewExtKt.show(subtitlesVal2);
        }
    }

    private final void bindTitle(WidgetNamedValueListHeaderBinding widgetNamedValueListHeaderBinding, NamedValueListHeaderVO namedValueListHeaderVO) {
        TextAtomV2View titleTav = widgetNamedValueListHeaderBinding.titleTav;
        Intrinsics.checkNotNullExpressionValue(titleTav, "titleTav");
        TextHolderKt.bindOrGone$default(titleTav, namedValueListHeaderVO.getTitle(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull NamedValueListHeaderVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetNamedValueListHeaderBinding widgetNamedValueListHeaderBinding = this.binding;
        bindTitle(widgetNamedValueListHeaderBinding, item);
        bindSubtitles(widgetNamedValueListHeaderBinding, item);
    }
}
