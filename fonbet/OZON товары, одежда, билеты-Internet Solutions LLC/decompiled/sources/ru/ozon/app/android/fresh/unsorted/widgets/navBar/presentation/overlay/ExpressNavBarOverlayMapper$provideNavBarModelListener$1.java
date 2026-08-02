package ru.ozon.app.android.fresh.unsorted.widgets.navBar.presentation.overlay;

import Sc.s;
import Wc.a;
import android.graphics.Bitmap;
import android.widget.LinearLayout;
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
import l10.t;
import ru.ozon.app.android.fresh.unsorted.databinding.WidgetExpressNavBarBinding;
import ru.ozon.app.android.fresh.unsorted.widgets.navBar.presentation.ExpressNavBarColors;
import ru.ozon.app.android.fresh.unsorted.widgets.navBar.presentation.ExpressNavBarColorsHelper;
import ru.ozon.app.android.storefront.navBar.NavBarColors;
import ru.ozon.app.android.storefront.navBar.NavBarModelProvider;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lru/ozon/app/android/storefront/navBar/NavBarModelProvider$NavBarModel;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.unsorted.widgets.navBar.presentation.overlay.ExpressNavBarOverlayMapper$provideNavBarModelListener$1", f = "ExpressNavBarOverlayMapper.kt", l = {94}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class ExpressNavBarOverlayMapper$provideNavBarModelListener$1 extends j implements Function1<d<? super NavBarModelProvider.NavBarModel>, Object> {
    final /* synthetic */ WidgetExpressNavBarBinding $binding;
    final /* synthetic */ t $container;
    final /* synthetic */ ExpressNavBarColorsHelper $navBarColorsHelper;
    int label;
    final /* synthetic */ ExpressNavBarOverlayMapper this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lru/ozon/app/android/storefront/navBar/NavBarModelProvider$NavBarModel;", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/storefront/navBar/NavBarModelProvider$NavBarModel;"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.fresh.unsorted.widgets.navBar.presentation.overlay.ExpressNavBarOverlayMapper$provideNavBarModelListener$1$1", f = "ExpressNavBarOverlayMapper.kt", l = {105, 106}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.fresh.unsorted.widgets.navBar.presentation.overlay.ExpressNavBarOverlayMapper$provideNavBarModelListener$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super NavBarModelProvider.NavBarModel>, Object> {
        final /* synthetic */ WidgetExpressNavBarBinding $binding;
        final /* synthetic */ t $container;
        final /* synthetic */ ExpressNavBarColorsHelper $navBarColorsHelper;
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ ExpressNavBarOverlayMapper this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ExpressNavBarColorsHelper expressNavBarColorsHelper, ExpressNavBarOverlayMapper expressNavBarOverlayMapper, t tVar, WidgetExpressNavBarBinding widgetExpressNavBarBinding, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$navBarColorsHelper = expressNavBarColorsHelper;
            this.this$0 = expressNavBarOverlayMapper;
            this.$container = tVar;
            this.$binding = widgetExpressNavBarBinding;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$navBarColorsHelper, this.this$0, this.$container, this.$binding, dVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:8:0x00a3  */
        /* JADX WARN: Type inference failed for: r12v13 */
        /* JADX WARN: Type inference failed for: r12v3 */
        /* JADX WARN: Type inference failed for: r12v4, types: [int] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            NavBarColors navBarColors;
            Object provideSnapshot;
            int i11;
            Object provideSnapshot2;
            int i12;
            Bitmap bitmap;
            NavBarColors navBarColors2;
            a aVar = a.COROUTINE_SUSPENDED;
            int i13 = this.label;
            if (i13 == 0) {
                s.b(obj);
                ExpressNavBarColors navBarColors3 = this.$navBarColorsHelper.getNavBarColors();
                ?? shouldShowBackButton = navBarColors3 != null ? navBarColors3.getShouldShowBackButton() : 0;
                ExpressNavBarColors navBarColors4 = this.$navBarColorsHelper.getNavBarColors();
                navBarColors = navBarColors4 != null ? new NavBarColors.Default(navBarColors4.getBackgroundColor(), navBarColors4.getStatusBarColor(), navBarColors4.getIconColor(), navBarColors4.getIsBgColorDark()) : null;
                ExpressNavBarOverlayMapper expressNavBarOverlayMapper = this.this$0;
                t tVar = this.$container;
                LinearLayout leftContainer = this.$binding.leftContainer;
                Intrinsics.checkNotNullExpressionValue(leftContainer, "leftContainer");
                this.L$0 = navBarColors;
                this.I$0 = shouldShowBackButton;
                this.label = 1;
                provideSnapshot = expressNavBarOverlayMapper.provideSnapshot(tVar, leftContainer, this);
                if (provideSnapshot != aVar) {
                    i11 = shouldShowBackButton;
                    obj = provideSnapshot;
                }
                return aVar;
            }
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i12 = this.I$0;
                bitmap = (Bitmap) this.L$1;
                navBarColors2 = (NavBarColors) this.L$0;
                s.b(obj);
                return new NavBarModelProvider.NavBarModel(i12 != 0, navBarColors2, bitmap, (Bitmap) obj);
            }
            i11 = this.I$0;
            navBarColors = (NavBarColors) this.L$0;
            s.b(obj);
            Bitmap bitmap2 = (Bitmap) obj;
            ExpressNavBarOverlayMapper expressNavBarOverlayMapper2 = this.this$0;
            t tVar2 = this.$container;
            LinearLayout rightContainer = this.$binding.rightContainer;
            Intrinsics.checkNotNullExpressionValue(rightContainer, "rightContainer");
            this.L$0 = navBarColors;
            this.L$1 = bitmap2;
            this.I$0 = i11;
            this.label = 2;
            provideSnapshot2 = expressNavBarOverlayMapper2.provideSnapshot(tVar2, rightContainer, this);
            if (provideSnapshot2 != aVar) {
                i12 = i11;
                bitmap = bitmap2;
                obj = provideSnapshot2;
                navBarColors2 = navBarColors;
                return new NavBarModelProvider.NavBarModel(i12 != 0, navBarColors2, bitmap, (Bitmap) obj);
            }
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super NavBarModelProvider.NavBarModel> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExpressNavBarOverlayMapper$provideNavBarModelListener$1(t tVar, ExpressNavBarColorsHelper expressNavBarColorsHelper, ExpressNavBarOverlayMapper expressNavBarOverlayMapper, WidgetExpressNavBarBinding widgetExpressNavBarBinding, d<? super ExpressNavBarOverlayMapper$provideNavBarModelListener$1> dVar) {
        super(1, dVar);
        this.$container = tVar;
        this.$navBarColorsHelper = expressNavBarColorsHelper;
        this.this$0 = expressNavBarOverlayMapper;
        this.$binding = widgetExpressNavBarBinding;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(d<?> dVar) {
        return new ExpressNavBarOverlayMapper$provideNavBarModelListener$1(this.$container, this.$navBarColorsHelper, this.this$0, this.$binding, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
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
        CoroutineContext coroutineContext = K.a(this.$container.f()).getCoroutineContext();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$navBarColorsHelper, this.this$0, this.$container, this.$binding, null);
        this.label = 1;
        Object f7 = C10727i.f(coroutineContext, anonymousClass1, this);
        return f7 == aVar ? aVar : f7;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(d<? super NavBarModelProvider.NavBarModel> dVar) {
        return ((ExpressNavBarOverlayMapper$provideNavBarModelListener$1) create(dVar)).invokeSuspend(Unit.f71690a);
    }
}
