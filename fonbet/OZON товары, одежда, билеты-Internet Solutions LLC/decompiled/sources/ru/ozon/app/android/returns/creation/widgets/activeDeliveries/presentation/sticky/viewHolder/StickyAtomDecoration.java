package ru.ozon.app.android.returns.creation.widgets.activeDeliveries.presentation.sticky.viewHolder;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.VerticalAtomsDecorator;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0001\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/activeDeliveries/presentation/sticky/viewHolder/StickyAtomDecoration;", "Lru/ozon/uni/atoms/af/VerticalAtomsDecorator;", "<init>", "()V", "modifyVerticalLayoutParams", "Landroid/widget/LinearLayout$LayoutParams;", "lp", "data", "Lru/ozon/uni/atoms/data/AtomDTO;", "position", "", "last", "", "Companion", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class StickyAtomDecoration implements VerticalAtomsDecorator {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int TOP_OFFSET = UiExtKt.toPx(24);
    private static final int MARGINS = UiExtKt.toPx(16);
    private static final int BOTTOM_MARGINS = UiExtKt.toPx(8);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/activeDeliveries/presentation/sticky/viewHolder/StickyAtomDecoration$Companion;", "", "<init>", "()V", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // ru.ozon.uni.atoms.af.CommonAtomDecorator
    public void decorate(@NotNull Canvas canvas, @NotNull Rect rect, int i11, boolean z11) {
        VerticalAtomsDecorator.DefaultImpls.decorate(this, canvas, rect, i11, z11);
    }

    @Override // ru.ozon.uni.atoms.af.VerticalAtomsDecorator
    @NotNull
    public LinearLayout.LayoutParams modifyVerticalLayoutParams(@NotNull LinearLayout.LayoutParams lp, @NotNull AtomDTO data, int position, boolean last) {
        Intrinsics.checkNotNullParameter(lp, "lp");
        Intrinsics.checkNotNullParameter(data, "data");
        int i11 = position == 0 ? TOP_OFFSET + MARGINS : 0;
        int i12 = MARGINS;
        lp.setMargins(i12, i11, i12, BOTTOM_MARGINS);
        return lp;
    }
}
