package ru.ozon.app.android.travel.feature.general.booking.widgets.passengersMatcher.v2.presentation.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import ru.ozon.app.android.travel.utils.TypedViewBinding;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/utils/TypedViewBinding;", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "<unused var>", "Landroid/view/LayoutInflater;", "root", "Landroid/view/ViewGroup;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class CategoryAdapterDelegateKt$categoryAdapterDelegate$1 extends AbstractC7737t implements Function2<LayoutInflater, ViewGroup, TypedViewBinding<TextAtomView>> {
    public static final CategoryAdapterDelegateKt$categoryAdapterDelegate$1 INSTANCE = new CategoryAdapterDelegateKt$categoryAdapterDelegate$1();

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.general.booking.widgets.passengersMatcher.v2.presentation.adapter.CategoryAdapterDelegateKt$categoryAdapterDelegate$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<TextAtomView> {
        final /* synthetic */ ViewGroup $root;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ViewGroup viewGroup) {
            super(0);
            this.$root = viewGroup;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TextAtomView invoke() {
            q qVar = q.f64554a;
            d b11 = N.b(TextAtomView.class);
            Context context = this.$root.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            TextAtomView textAtomView = (TextAtomView) qVar.g(b11, context);
            textAtomView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            Context context2 = textAtomView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            int px = ResourceExtKt.toPx(16, context2);
            Context context3 = textAtomView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            textAtomView.setPadding(0, px, 0, ResourceExtKt.toPx(4, context3));
            return textAtomView;
        }
    }

    CategoryAdapterDelegateKt$categoryAdapterDelegate$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final TypedViewBinding<TextAtomView> invoke(LayoutInflater layoutInflater, ViewGroup root) {
        Intrinsics.checkNotNullParameter(layoutInflater, "<unused var>");
        Intrinsics.checkNotNullParameter(root, "root");
        return new TypedViewBinding<>(new AnonymousClass1(root));
    }
}
