package ru.ozon.app.android.scanit.scanit;

import GZ.g;
import Sc.o;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.scanit.scanit.ScanItViewModel;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.app.android.uikit.utils.DelayedVisibilityHandler;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/scanit/scanit/ScanItViewModel$Action;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/scanit/scanit/ScanItViewModel$Action;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ScanItFragment$onViewCreated$3 extends AbstractC7737t implements Function1<ScanItViewModel.Action, Unit> {
    final /* synthetic */ ScanItFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScanItFragment$onViewCreated$3(ScanItFragment scanItFragment) {
        super(1);
        this.this$0 = scanItFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ScanItViewModel.Action action) {
        invoke2(action);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ScanItViewModel.Action action) {
        DelayedVisibilityHandler delayedVisibilityHandler;
        ScanItCaptureFragment scanItCaptureFragment;
        DelayedVisibilityHandler delayedVisibilityHandler2;
        ScanItViewModel scanItViewModel;
        DelayedVisibilityHandler delayedVisibilityHandler3;
        ScanItCaptureFragment scanItCaptureFragment2;
        if (action instanceof ScanItViewModel.Action.Success) {
            g.a.a(this.this$0.getScreenRouter(), ((ScanItViewModel.Action.Success) action).getDeeplink(), null, null, 6);
            delayedVisibilityHandler3 = this.this$0.delayedVisibilityHandler;
            if (delayedVisibilityHandler3 == null) {
                Intrinsics.n("delayedVisibilityHandler");
                throw null;
            }
            delayedVisibilityHandler3.hide();
            scanItCaptureFragment2 = this.this$0.scanItCaptureFragment;
            scanItCaptureFragment2.resumeScanning();
            return;
        }
        if (action instanceof ScanItViewModel.Action.ShowTutorial) {
            if (!((ScanItViewModel.Action.ShowTutorial) action).getShow()) {
                g screenRouter = this.this$0.getScreenRouter();
                String uri = LinkGenerator.INSTANCE.scanItIntro().toString();
                Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
                screenRouter.b(uri, 1373, U.c());
                return;
            }
            scanItViewModel = this.this$0.viewModel;
            if (scanItViewModel != null) {
                scanItViewModel.checkPermissions();
                return;
            } else {
                Intrinsics.n("viewModel");
                throw null;
            }
        }
        if (action instanceof ScanItViewModel.Action.PermissionsGranted) {
            this.this$0.replaceFragment(((ScanItViewModel.Action.PermissionsGranted) action).getPermissionsGranted() ? this.this$0.scanItCaptureFragment : new ScanItPermissionFragment());
            return;
        }
        if (Intrinsics.d(action, ScanItViewModel.Action.Progress.INSTANCE)) {
            delayedVisibilityHandler2 = this.this$0.delayedVisibilityHandler;
            if (delayedVisibilityHandler2 != null) {
                delayedVisibilityHandler2.show();
                return;
            } else {
                Intrinsics.n("delayedVisibilityHandler");
                throw null;
            }
        }
        if (!(action instanceof ScanItViewModel.Action.Error)) {
            throw new o();
        }
        ViewGroup rootView = ContextExtKt.getRootView(this.this$0);
        if (rootView != null) {
            ScanItFragment scanItFragment = this.this$0;
            FlashbarFactory flashbarFactory = FlashbarFactory.INSTANCE;
            int i11 = R$drawable.ic_warning;
            String string = scanItFragment.getString(((ScanItViewModel.Action.Error) action).getMessage());
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            FlashbarFactory.create$default(flashbarFactory, rootView, null, OzonSpannableStringKt.toOzonSpannableString(string), null, null, Integer.valueOf(i11), null, null, null, null, null, null, null, 3000L, null, null, scanItFragment, 57306, null).show();
        }
        delayedVisibilityHandler = this.this$0.delayedVisibilityHandler;
        if (delayedVisibilityHandler == null) {
            Intrinsics.n("delayedVisibilityHandler");
            throw null;
        }
        delayedVisibilityHandler.hide();
        scanItCaptureFragment = this.this$0.scanItCaptureFragment;
        scanItCaptureFragment.resumeScanning();
    }
}
