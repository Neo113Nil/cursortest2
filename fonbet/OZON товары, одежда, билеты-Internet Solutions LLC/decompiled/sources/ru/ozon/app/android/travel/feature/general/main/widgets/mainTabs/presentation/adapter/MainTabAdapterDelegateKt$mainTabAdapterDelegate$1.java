package ru.ozon.app.android.travel.feature.general.main.widgets.mainTabs.presentation.adapter;

import Bl.b;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.general.main.widgets.mainTabs.presentation.view.MainTabView;
import ru.ozon.app.android.travel.utils.TypedViewBinding;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/utils/TypedViewBinding;", "Lru/ozon/app/android/travel/feature/general/main/widgets/mainTabs/presentation/view/MainTabView;", "<unused var>", "Landroid/view/LayoutInflater;", "parent", "Landroid/view/ViewGroup;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class MainTabAdapterDelegateKt$mainTabAdapterDelegate$1 extends AbstractC7737t implements Function2<LayoutInflater, ViewGroup, TypedViewBinding<MainTabView>> {
    public static final MainTabAdapterDelegateKt$mainTabAdapterDelegate$1 INSTANCE = new MainTabAdapterDelegateKt$mainTabAdapterDelegate$1();

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/general/main/widgets/mainTabs/presentation/view/MainTabView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.general.main.widgets.mainTabs.presentation.adapter.MainTabAdapterDelegateKt$mainTabAdapterDelegate$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<MainTabView> {
        final /* synthetic */ ViewGroup $parent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ViewGroup viewGroup) {
            super(0);
            this.$parent = viewGroup;
        }

        @Override // kotlin.jvm.functions.Function0
        public final MainTabView invoke() {
            MainTabView mainTabView = (MainTabView) b.a(MainTabView.class, "type", q.f64554a, null);
            if (mainTabView == null) {
                Context context = this.$parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                mainTabView = new MainTabView(context);
            }
            mainTabView.setClipChildren(false);
            return mainTabView;
        }
    }

    MainTabAdapterDelegateKt$mainTabAdapterDelegate$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final TypedViewBinding<MainTabView> invoke(LayoutInflater layoutInflater, ViewGroup parent) {
        Intrinsics.checkNotNullParameter(layoutInflater, "<unused var>");
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new TypedViewBinding<>(new AnonymousClass1(parent));
    }
}
