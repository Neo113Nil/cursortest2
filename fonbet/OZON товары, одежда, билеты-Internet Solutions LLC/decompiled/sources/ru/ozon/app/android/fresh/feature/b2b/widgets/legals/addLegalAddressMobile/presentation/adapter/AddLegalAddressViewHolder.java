package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalAddressMobile.presentation.adapter;

import FM.a;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.databinding.WidgetAddLegalAddressMobileItemBinding;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitleDefaultView;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\nR0\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalAddressMobile/presentation/adapter/AddLegalAddressViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroid/view/View;", "containerView", "<init>", "(Landroid/view/View;)V", "", FormPageDTO.Field.FIELD_TYPE_ADDRESS, "", "bind", "(Ljava/lang/CharSequence;)V", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetAddLegalAddressMobileItemBinding;", "binding", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetAddLegalAddressMobileItemBinding;", "Ljava/lang/CharSequence;", "getAddress", "()Ljava/lang/CharSequence;", "setAddress", "Lkotlin/Function1;", "", "addressCallback", "Lkotlin/jvm/functions/Function1;", "getAddressCallback", "()Lkotlin/jvm/functions/Function1;", "setAddressCallback", "(Lkotlin/jvm/functions/Function1;)V", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddLegalAddressViewHolder extends RecyclerView.C {
    private CharSequence address;
    private Function1<? super String, Unit> addressCallback;

    @NotNull
    private final WidgetAddLegalAddressMobileItemBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddLegalAddressViewHolder(@NotNull View containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        WidgetAddLegalAddressMobileItemBinding bind = WidgetAddLegalAddressMobileItemBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        CellWithSubtitleDefaultView cellWithSubtitleDefaultView = bind.legalsAddressCell;
        cellWithSubtitleDefaultView.setSubtitle(null);
        cellWithSubtitleDefaultView.hideSeparator(false);
        cellWithSubtitleDefaultView.hideDisclosure(false);
        cellWithSubtitleDefaultView.setTitleMaxLines(1);
        cellWithSubtitleDefaultView.setOnClickListener(new a(this, 9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$2$lambda$1(AddLegalAddressViewHolder addLegalAddressViewHolder, View view) {
        Function1<? super String, Unit> function1;
        CharSequence charSequence = addLegalAddressViewHolder.address;
        if (charSequence == null || (function1 = addLegalAddressViewHolder.addressCallback) == null) {
            return;
        }
        function1.invoke(charSequence.toString());
    }

    public final void bind(@NotNull CharSequence address) {
        Intrinsics.checkNotNullParameter(address, "address");
        this.address = address;
        this.binding.legalsAddressCell.setTitle(address);
    }

    public final void setAddressCallback(Function1<? super String, Unit> function1) {
        this.addressCallback = function1;
    }
}
