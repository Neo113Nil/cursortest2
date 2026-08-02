package ru.ozon.app.android.travel.feature.general.booking.widgets.passengersMatcher.v2.presentation.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.utils.TypedViewBinding;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitleDefaultView;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/utils/TypedViewBinding;", "Lru/ozon/app/android/uikit/view/atoms/cells/subtitled/CellWithSubtitleDefaultView;", "<unused var>", "Landroid/view/LayoutInflater;", "root", "Landroid/view/ViewGroup;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class PassengerCellAdapterDelegateKt$passengerCellAdapterDelegate$1 extends AbstractC7737t implements Function2<LayoutInflater, ViewGroup, TypedViewBinding<CellWithSubtitleDefaultView>> {
    public static final PassengerCellAdapterDelegateKt$passengerCellAdapterDelegate$1 INSTANCE = new PassengerCellAdapterDelegateKt$passengerCellAdapterDelegate$1();

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/uikit/view/atoms/cells/subtitled/CellWithSubtitleDefaultView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.general.booking.widgets.passengersMatcher.v2.presentation.adapter.PassengerCellAdapterDelegateKt$passengerCellAdapterDelegate$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<CellWithSubtitleDefaultView> {
        final /* synthetic */ ViewGroup $root;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ViewGroup viewGroup) {
            super(0);
            this.$root = viewGroup;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CellWithSubtitleDefaultView invoke() {
            Context context = this.$root.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            CellWithSubtitleDefaultView cellWithSubtitleDefaultView = new CellWithSubtitleDefaultView(context, null, 0, 6, null);
            cellWithSubtitleDefaultView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return cellWithSubtitleDefaultView;
        }
    }

    PassengerCellAdapterDelegateKt$passengerCellAdapterDelegate$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final TypedViewBinding<CellWithSubtitleDefaultView> invoke(LayoutInflater layoutInflater, ViewGroup root) {
        Intrinsics.checkNotNullParameter(layoutInflater, "<unused var>");
        Intrinsics.checkNotNullParameter(root, "root");
        return new TypedViewBinding<>(new AnonymousClass1(root));
    }
}
