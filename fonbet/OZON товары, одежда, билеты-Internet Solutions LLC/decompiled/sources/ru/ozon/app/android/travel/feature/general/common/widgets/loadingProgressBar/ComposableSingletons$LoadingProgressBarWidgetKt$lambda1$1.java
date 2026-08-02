package ru.ozon.app.android.travel.feature.general.common.widgets.loadingProgressBar;

import S0.InterfaceC3967k;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.B0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.w0;
import f3.AbstractC6409a;
import fd.InterfaceC6511n;
import g3.C6616a;
import g3.C6617b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import ru.ozon.app.android.travel.feature.general.common.widgets.loadingProgressBar.presentation.LoadingProgressBarContentKt;
import ru.ozon.app.android.travel.feature.general.common.widgets.loadingProgressBar.presentation.LoadingProgressBarVI;
import ru.ozon.app.android.travel.feature.general.common.widgets.loadingProgressBar.presentation.LoadingProgressBarViewModel;
import ru.ozon.composer.compose.widget.i;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/travel/feature/general/common/widgets/loadingProgressBar/presentation/LoadingProgressBarVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/i;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* renamed from: ru.ozon.app.android.travel.feature.general.common.widgets.loadingProgressBar.ComposableSingletons$LoadingProgressBarWidgetKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes4.dex */
final class ComposableSingletons$LoadingProgressBarWidgetKt$lambda1$1 extends AbstractC7737t implements InterfaceC6511n<i<LoadingProgressBarVI>, InterfaceC3967k, Integer, Unit> {
    public static final ComposableSingletons$LoadingProgressBarWidgetKt$lambda1$1 INSTANCE = new ComposableSingletons$LoadingProgressBarWidgetKt$lambda1$1();

    ComposableSingletons$LoadingProgressBarWidgetKt$lambda1$1() {
        super(3);
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(i<LoadingProgressBarVI> iVar, InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(iVar, interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(i<LoadingProgressBarVI> content, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(content, "$this$content");
        if ((i11 & 6) == 0) {
            i11 |= interfaceC3967k.n(content) ? 4 : 2;
        }
        if ((i11 & 19) == 18 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        Object parent = ((View) interfaceC3967k.m(AndroidCompositionLocals_androidKt.h())).getParent();
        Intrinsics.g(parent, "null cannot be cast to non-null type android.view.View");
        View view = (View) parent;
        view.setBackground(null);
        view.setClickable(false);
        interfaceC3967k.B(1729797275);
        B0 a11 = C6616a.a(interfaceC3967k);
        if (a11 == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        w0 a12 = C6617b.a(N.b(LoadingProgressBarViewModel.class), a11, null, null, a11 instanceof InterfaceC5431s ? ((InterfaceC5431s) a11).getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b, interfaceC3967k);
        interfaceC3967k.K();
        LoadingProgressBarContentKt.LoadingProgressBarContent(content.b(), (LoadingProgressBarViewModel) a12, interfaceC3967k, 0);
    }
}
