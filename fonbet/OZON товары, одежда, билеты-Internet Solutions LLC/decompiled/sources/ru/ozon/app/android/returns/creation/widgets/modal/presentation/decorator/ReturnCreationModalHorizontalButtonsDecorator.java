package ru.ozon.app.android.returns.creation.widgets.modal.presentation.decorator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.HorizontalAtomsDecorator;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/modal/presentation/decorator/ReturnCreationModalHorizontalButtonsDecorator;", "Lru/ozon/uni/atoms/af/HorizontalAtomsDecorator;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "offset", "", "modifyHorizontalLayoutParams", "Landroid/widget/LinearLayout$LayoutParams;", "lp", "data", "Lru/ozon/uni/atoms/data/AtomDTO;", "position", "last", "", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnCreationModalHorizontalButtonsDecorator implements HorizontalAtomsDecorator {
    private final int offset;

    public ReturnCreationModalHorizontalButtonsDecorator(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.offset = ResourceExtKt.toPx(8, context);
    }

    @Override // ru.ozon.uni.atoms.af.CommonAtomDecorator
    public void decorate(@NotNull Canvas canvas, @NotNull Rect rect, int i11, boolean z11) {
        HorizontalAtomsDecorator.DefaultImpls.decorate(this, canvas, rect, i11, z11);
    }

    @Override // ru.ozon.uni.atoms.af.HorizontalAtomsDecorator
    @NotNull
    public LinearLayout.LayoutParams modifyHorizontalLayoutParams(@NotNull LinearLayout.LayoutParams lp, @NotNull AtomDTO data, int position, boolean last) {
        Intrinsics.checkNotNullParameter(lp, "lp");
        Intrinsics.checkNotNullParameter(data, "data");
        lp.weight = 1.0f;
        lp.setMargins(position != 0 ? this.offset : 0, ((ViewGroup.MarginLayoutParams) lp).topMargin, ((ViewGroup.MarginLayoutParams) lp).rightMargin, ((ViewGroup.MarginLayoutParams) lp).bottomMargin);
        return lp;
    }
}
