package ru.ozon.app.android.travel.molecules.view.errorState;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.ui.molecules.databinding.ViewErrorStateBinding;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ&\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0014J.\u0010\u0016\u001a\u00020\u00102\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0014H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/errorState/ErrorStateView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "binding", "Lru/ozon/app/android/travel/ui/molecules/databinding/ViewErrorStateBinding;", "itemsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "bind", "", "item", "Lru/ozon/app/android/travel/molecules/view/errorState/ErrorStateVO;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "setActionButtons", "buttons", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ErrorStateView extends ConstraintLayout {

    @NotNull
    private final ViewErrorStateBinding binding;

    @NotNull
    private final AtomsAdapter itemsAdapter;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ErrorStateView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setActionButtons(List<? extends AtomDTO> buttons, Function1<? super AtomAction, Unit> onAction) {
        if (buttons == null) {
            VerticalAtomsLayout errorStateActionButtonsContainerVAL = this.binding.errorStateActionButtonsContainerVAL;
            Intrinsics.checkNotNullExpressionValue(errorStateActionButtonsContainerVAL, "errorStateActionButtonsContainerVAL");
            ViewExtKt.gone(errorStateActionButtonsContainerVAL);
            return;
        }
        VerticalAtomsLayout errorStateActionButtonsContainerVAL2 = this.binding.errorStateActionButtonsContainerVAL;
        Intrinsics.checkNotNullExpressionValue(errorStateActionButtonsContainerVAL2, "errorStateActionButtonsContainerVAL");
        ViewExtKt.show(errorStateActionButtonsContainerVAL2);
        this.itemsAdapter.setOnAction(onAction);
        AtomsAdapter atomsAdapter = this.itemsAdapter;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        atomsAdapter.bind(context, buttons);
    }

    public final void bind(@NotNull ErrorStateVO item, Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(item, "item");
        ImageView errorStateIV = this.binding.errorStateIV;
        Intrinsics.checkNotNullExpressionValue(errorStateIV, "errorStateIV");
        ImageViewExtKt.loadImageOrGone(errorStateIV, item.getImage());
        this.binding.errorStateTitleTV.setText(item.getTitle());
        TextView errorStateMessageTV = this.binding.errorStateMessageTV;
        Intrinsics.checkNotNullExpressionValue(errorStateMessageTV, "errorStateMessageTV");
        TextViewExtKt.setTextOrGone(errorStateMessageTV, item.getMessage());
        setActionButtons(item.getButtons(), onAction);
    }

    public /* synthetic */ ErrorStateView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorStateView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewErrorStateBinding inflate = ViewErrorStateBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.itemsAdapter = atomsAdapter;
        inflate.errorStateActionButtonsContainerVAL.setAdapter(atomsAdapter);
    }
}
