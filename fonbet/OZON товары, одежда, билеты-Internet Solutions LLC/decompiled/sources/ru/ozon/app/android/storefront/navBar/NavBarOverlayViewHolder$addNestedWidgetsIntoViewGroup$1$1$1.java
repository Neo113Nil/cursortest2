package ru.ozon.app.android.storefront.navBar;

import Sc.s;
import Wc.a;
import android.graphics.Bitmap;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.K;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import ru.ozon.app.android.storefront.navBar.NavBarModelProvider;
import ru.ozon.app.android.storefront.navBar.databinding.WidgetNavbarBinding;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lru/ozon/app/android/storefront/navBar/NavBarModelProvider$NavBarModel;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.storefront.navBar.NavBarOverlayViewHolder$addNestedWidgetsIntoViewGroup$1$1$1", f = "NavBarOverlayViewHolder.kt", l = {668}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class NavBarOverlayViewHolder$addNestedWidgetsIntoViewGroup$1$1$1 extends j implements Function1<d<? super NavBarModelProvider.NavBarModel>, Object> {
    int label;
    final /* synthetic */ NavBarOverlayViewHolder this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lru/ozon/app/android/storefront/navBar/NavBarModelProvider$NavBarModel;", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/storefront/navBar/NavBarModelProvider$NavBarModel;"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.storefront.navBar.NavBarOverlayViewHolder$addNestedWidgetsIntoViewGroup$1$1$1$1", f = "NavBarOverlayViewHolder.kt", l = {672, 673}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.storefront.navBar.NavBarOverlayViewHolder$addNestedWidgetsIntoViewGroup$1$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super NavBarModelProvider.NavBarModel>, Object> {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ NavBarOverlayViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(NavBarOverlayViewHolder navBarOverlayViewHolder, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = navBarOverlayViewHolder;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x009c  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            boolean hasLeftPlaceholder;
            int i11;
            NavBarColorHelper navBarColorHelper;
            WidgetNavbarBinding widgetNavbarBinding;
            Object provideSnapshot;
            int i12;
            NavBarColors navBarColors;
            Toolbar toolbar;
            WidgetNavbarBinding widgetNavbarBinding2;
            Object provideSnapshot2;
            int i13;
            Bitmap bitmap;
            NavBarColors navBarColors2;
            a aVar = a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                s.b(obj);
                hasLeftPlaceholder = this.this$0.getHasLeftPlaceholder();
                if (!hasLeftPlaceholder) {
                    toolbar = this.this$0.toolbar;
                    if ((toolbar != null ? toolbar.getNavigationIcon() : null) != null) {
                        i11 = 1;
                        navBarColorHelper = this.this$0.navBarColorHelper;
                        NavBarColors defaultColors = navBarColorHelper.defaultColors();
                        NavBarOverlayViewHolder navBarOverlayViewHolder = this.this$0;
                        widgetNavbarBinding = navBarOverlayViewHolder.binding;
                        LinearLayout actionPointsLeftLL = widgetNavbarBinding.actionPointsLeftLL;
                        Intrinsics.checkNotNullExpressionValue(actionPointsLeftLL, "actionPointsLeftLL");
                        this.L$0 = defaultColors;
                        this.I$0 = i11;
                        this.label = 1;
                        provideSnapshot = navBarOverlayViewHolder.provideSnapshot(actionPointsLeftLL, this);
                        if (provideSnapshot != aVar) {
                            i12 = i11;
                            obj = provideSnapshot;
                            navBarColors = defaultColors;
                        }
                        return aVar;
                    }
                }
                i11 = 0;
                navBarColorHelper = this.this$0.navBarColorHelper;
                NavBarColors defaultColors2 = navBarColorHelper.defaultColors();
                NavBarOverlayViewHolder navBarOverlayViewHolder2 = this.this$0;
                widgetNavbarBinding = navBarOverlayViewHolder2.binding;
                LinearLayout actionPointsLeftLL2 = widgetNavbarBinding.actionPointsLeftLL;
                Intrinsics.checkNotNullExpressionValue(actionPointsLeftLL2, "actionPointsLeftLL");
                this.L$0 = defaultColors2;
                this.I$0 = i11;
                this.label = 1;
                provideSnapshot = navBarOverlayViewHolder2.provideSnapshot(actionPointsLeftLL2, this);
                if (provideSnapshot != aVar) {
                }
                return aVar;
            }
            if (i14 != 1) {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i13 = this.I$0;
                bitmap = (Bitmap) this.L$1;
                navBarColors2 = (NavBarColors) this.L$0;
                s.b(obj);
                return new NavBarModelProvider.NavBarModel(i13 != 0, navBarColors2, bitmap, (Bitmap) obj);
            }
            i12 = this.I$0;
            navBarColors = (NavBarColors) this.L$0;
            s.b(obj);
            Bitmap bitmap2 = (Bitmap) obj;
            NavBarOverlayViewHolder navBarOverlayViewHolder3 = this.this$0;
            widgetNavbarBinding2 = navBarOverlayViewHolder3.binding;
            LinearLayout actionPointsRightLL = widgetNavbarBinding2.actionPointsRightLL;
            Intrinsics.checkNotNullExpressionValue(actionPointsRightLL, "actionPointsRightLL");
            this.L$0 = navBarColors;
            this.L$1 = bitmap2;
            this.I$0 = i12;
            this.label = 2;
            provideSnapshot2 = navBarOverlayViewHolder3.provideSnapshot(actionPointsRightLL, this);
            if (provideSnapshot2 != aVar) {
                i13 = i12;
                bitmap = bitmap2;
                obj = provideSnapshot2;
                navBarColors2 = navBarColors;
                return new NavBarModelProvider.NavBarModel(i13 != 0, navBarColors2, bitmap, (Bitmap) obj);
            }
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super NavBarModelProvider.NavBarModel> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavBarOverlayViewHolder$addNestedWidgetsIntoViewGroup$1$1$1(NavBarOverlayViewHolder navBarOverlayViewHolder, d<? super NavBarOverlayViewHolder$addNestedWidgetsIntoViewGroup$1$1$1> dVar) {
        super(1, dVar);
        this.this$0 = navBarOverlayViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(d<?> dVar) {
        return new NavBarOverlayViewHolder$addNestedWidgetsIntoViewGroup$1$1$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        i iVar;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return obj;
        }
        s.b(obj);
        iVar = this.this$0.uiContainer;
        CoroutineContext coroutineContext = K.a(iVar.K().f()).getCoroutineContext();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
        this.label = 1;
        Object f7 = C10727i.f(coroutineContext, anonymousClass1, this);
        return f7 == aVar ? aVar : f7;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(d<? super NavBarModelProvider.NavBarModel> dVar) {
        return ((NavBarOverlayViewHolder$addNestedWidgetsIntoViewGroup$1$1$1) create(dVar)).invokeSuspend(Unit.f71690a);
    }
}
