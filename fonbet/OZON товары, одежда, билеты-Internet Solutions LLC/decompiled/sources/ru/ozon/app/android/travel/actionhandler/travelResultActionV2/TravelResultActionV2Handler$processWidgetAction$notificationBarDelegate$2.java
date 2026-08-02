package ru.ozon.app.android.travel.actionhandler.travelResultActionV2;

import a00.C4911f;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.travel.actionhandler.utils.NotificationBarDelegate;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/actionhandler/utils/NotificationBarDelegate;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class TravelResultActionV2Handler$processWidgetAction$notificationBarDelegate$2 extends AbstractC7737t implements Function0<NotificationBarDelegate> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ C4911f $container;
    final /* synthetic */ Boolean $isActivityNotification;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TravelResultActionV2Handler$processWidgetAction$notificationBarDelegate$2(Boolean bool, C4911f c4911f, Function1<? super AtomAction, Unit> function1) {
        super(0);
        this.$isActivityNotification = bool;
        this.$container = c4911f;
        this.$actionHandler = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final NotificationBarDelegate invoke() {
        ViewGroup composerContainer;
        ViewGroup composerContainer2;
        if (Intrinsics.d(this.$isActivityNotification, Boolean.TRUE)) {
            r a11 = this.$container.a();
            if (a11 == null) {
                return null;
            }
            Function1<AtomAction, Unit> function1 = this.$actionHandler;
            ViewGroup rootView = ContextExtKt.getRootView(a11);
            if (rootView == null || (composerContainer2 = ComposerViewExtensionKt.composerContainer(rootView)) == null) {
                return null;
            }
            return new NotificationBarDelegate(composerContainer2, a11, function1);
        }
        ComponentCallbacksC5392m c11 = this.$container.c();
        if (c11 == null) {
            return null;
        }
        Function1<AtomAction, Unit> function12 = this.$actionHandler;
        ViewGroup rootView2 = ContextExtKt.getRootView(c11);
        if (rootView2 == null || (composerContainer = ComposerViewExtensionKt.composerContainer(rootView2)) == null) {
            return null;
        }
        return new NotificationBarDelegate(composerContainer, c11, function12);
    }
}
