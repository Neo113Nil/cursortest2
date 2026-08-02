package ru.ozon.app.android.abtool.presentation.features.recycler;

import Sc.InterfaceC4008j;
import Sc.k;
import Ve.C4636t5;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.R$layout;
import ru.ozon.app.android.abtool.databinding.ServiceHeaderHolderBinding;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/abtool/presentation/features/recycler/HeaderViewHolder;", "Lru/ozon/app/android/abtool/presentation/features/recycler/BaseHolder;", "Lru/ozon/app/android/abtool/presentation/features/recycler/ServiceHeader;", "Landroid/view/ViewGroup;", "parent", "<init>", "(Landroid/view/ViewGroup;)V", "item", "", "bind", "(Lru/ozon/app/android/abtool/presentation/features/recycler/ServiceHeader;)V", "Lru/ozon/app/android/abtool/databinding/ServiceHeaderHolderBinding;", "binding$delegate", "LSc/j;", "getBinding", "()Lru/ozon/app/android/abtool/databinding/ServiceHeaderHolderBinding;", "binding", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class HeaderViewHolder extends BaseHolder<ServiceHeader> {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j binding;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HeaderViewHolder(@NotNull ViewGroup viewGroup) {
        super(r4);
        View inflate = C4636t5.a(viewGroup, "parent").inflate(R$layout.service_header_holder, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = k.b(new HeaderViewHolder$binding$2(this));
    }

    private final ServiceHeaderHolderBinding getBinding() {
        return (ServiceHeaderHolderBinding) this.binding.getValue();
    }

    @Override // ru.ozon.app.android.abtool.presentation.features.recycler.BaseHolder
    public void bind(@NotNull ServiceHeader item) {
        Intrinsics.checkNotNullParameter(item, "item");
        getBinding().getConstraintLayout().setText(item.getTitle());
    }
}
