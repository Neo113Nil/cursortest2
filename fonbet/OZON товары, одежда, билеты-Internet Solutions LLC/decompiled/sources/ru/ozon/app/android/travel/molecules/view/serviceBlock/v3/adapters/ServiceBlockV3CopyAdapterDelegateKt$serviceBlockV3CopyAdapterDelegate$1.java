package ru.ozon.app.android.travel.molecules.view.serviceBlock.v3.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.ui.molecules.databinding.ItemServiceBlockCopyBinding;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/ui/molecules/databinding/ItemServiceBlockCopyBinding;", "layoutInflater", "Landroid/view/LayoutInflater;", "root", "Landroid/view/ViewGroup;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ServiceBlockV3CopyAdapterDelegateKt$serviceBlockV3CopyAdapterDelegate$1 extends AbstractC7737t implements Function2<LayoutInflater, ViewGroup, ItemServiceBlockCopyBinding> {
    public static final ServiceBlockV3CopyAdapterDelegateKt$serviceBlockV3CopyAdapterDelegate$1 INSTANCE = new ServiceBlockV3CopyAdapterDelegateKt$serviceBlockV3CopyAdapterDelegate$1();

    ServiceBlockV3CopyAdapterDelegateKt$serviceBlockV3CopyAdapterDelegate$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final ItemServiceBlockCopyBinding invoke(LayoutInflater layoutInflater, ViewGroup root) {
        Intrinsics.checkNotNullParameter(layoutInflater, "layoutInflater");
        Intrinsics.checkNotNullParameter(root, "root");
        ItemServiceBlockCopyBinding inflate = ItemServiceBlockCopyBinding.inflate(layoutInflater, root, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }
}
