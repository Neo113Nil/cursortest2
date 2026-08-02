package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.adapter.v3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.view.v3.LuggageTabV3View;
import ru.ozon.app.android.travel.utils.TypedViewBinding;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/utils/TypedViewBinding;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/view/v3/LuggageTabV3View;", "<unused var>", "Landroid/view/LayoutInflater;", "root", "Landroid/view/ViewGroup;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class AviaSearchResultV3LuggageAdapterDelegateKt$aviaSearchResultV3BonusAdapterDelegate$1 extends AbstractC7737t implements Function2<LayoutInflater, ViewGroup, TypedViewBinding<LuggageTabV3View>> {
    public static final AviaSearchResultV3LuggageAdapterDelegateKt$aviaSearchResultV3BonusAdapterDelegate$1 INSTANCE = new AviaSearchResultV3LuggageAdapterDelegateKt$aviaSearchResultV3BonusAdapterDelegate$1();

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/view/v3/LuggageTabV3View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.adapter.v3.AviaSearchResultV3LuggageAdapterDelegateKt$aviaSearchResultV3BonusAdapterDelegate$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<LuggageTabV3View> {
        final /* synthetic */ ViewGroup $root;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ViewGroup viewGroup) {
            super(0);
            this.$root = viewGroup;
        }

        @Override // kotlin.jvm.functions.Function0
        public final LuggageTabV3View invoke() {
            Context context = this.$root.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            LuggageTabV3View luggageTabV3View = new LuggageTabV3View(context, null, 0, 0, 14, null);
            Context context2 = this.$root.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            luggageTabV3View.setLayoutParams(new ViewGroup.LayoutParams(-2, ResourceExtKt.toPx(40, context2)));
            return luggageTabV3View;
        }
    }

    AviaSearchResultV3LuggageAdapterDelegateKt$aviaSearchResultV3BonusAdapterDelegate$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final TypedViewBinding<LuggageTabV3View> invoke(LayoutInflater layoutInflater, ViewGroup root) {
        Intrinsics.checkNotNullParameter(layoutInflater, "<unused var>");
        Intrinsics.checkNotNullParameter(root, "root");
        return new TypedViewBinding<>(new AnonymousClass1(root));
    }
}
