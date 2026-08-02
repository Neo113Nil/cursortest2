package ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v2.presentation.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v2.view.PassengersDirectoryV2Stub;
import ru.ozon.app.android.travel.utils.TypedViewBinding;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/utils/TypedViewBinding;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v2/view/PassengersDirectoryV2Stub;", "<unused var>", "Landroid/view/LayoutInflater;", "root", "Landroid/view/ViewGroup;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class PassengersDirectoryV2StubAdapterDelegateKt$passengersDirectoryV2AdapterDelegate$1 extends AbstractC7737t implements Function2<LayoutInflater, ViewGroup, TypedViewBinding<PassengersDirectoryV2Stub>> {
    public static final PassengersDirectoryV2StubAdapterDelegateKt$passengersDirectoryV2AdapterDelegate$1 INSTANCE = new PassengersDirectoryV2StubAdapterDelegateKt$passengersDirectoryV2AdapterDelegate$1();

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v2/view/PassengersDirectoryV2Stub;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v2.presentation.adapter.PassengersDirectoryV2StubAdapterDelegateKt$passengersDirectoryV2AdapterDelegate$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<PassengersDirectoryV2Stub> {
        final /* synthetic */ ViewGroup $root;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ViewGroup viewGroup) {
            super(0);
            this.$root = viewGroup;
        }

        @Override // kotlin.jvm.functions.Function0
        public final PassengersDirectoryV2Stub invoke() {
            Context context = this.$root.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            PassengersDirectoryV2Stub passengersDirectoryV2Stub = new PassengersDirectoryV2Stub(context, null, 0, 0, 14, null);
            passengersDirectoryV2Stub.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return passengersDirectoryV2Stub;
        }
    }

    PassengersDirectoryV2StubAdapterDelegateKt$passengersDirectoryV2AdapterDelegate$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final TypedViewBinding<PassengersDirectoryV2Stub> invoke(LayoutInflater layoutInflater, ViewGroup root) {
        Intrinsics.checkNotNullParameter(layoutInflater, "<unused var>");
        Intrinsics.checkNotNullParameter(root, "root");
        return new TypedViewBinding<>(new AnonymousClass1(root));
    }
}
