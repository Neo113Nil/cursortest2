package ru.ozon.app.android.universalwidgets.widgets.uw.sku.utils.debug;

import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.ozonLogger.core.c;
import sj.a;
import sj.d;
import sj.e;
import sj.f;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/utils/debug/HierarchyLogger;", "", "<init>", "()V", "Landroid/view/MotionEvent;", "event", "Landroid/view/ViewGroup;", "rootView", "Ljava/lang/Exception;", "Lkotlin/Exception;", "ex", "", "onDispatchTouchEventFailed", "(Landroid/view/MotionEvent;Landroid/view/ViewGroup;Ljava/lang/Exception;)V", "Lsj/d;", "ozonLogger", "Lsj/d;", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HierarchyLogger {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final d ozonLogger = e.f98817f.q(new a("Storefront", "DispatchTouchEvent", null));

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/utils/debug/HierarchyLogger$Companion;", "", "<init>", "()V", "LOG_TEAM_TAG", "", "LOG_GROUP_TAG", "LOG_CUSTOM_FIELD_HIERARCHY", "LOG_CUSTOM_FIELD_TOUCH_INFO", "LOG_DEFAULT_MESSAGE", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final void onDispatchTouchEventFailed(MotionEvent event, @NotNull ViewGroup rootView, @NotNull Exception ex) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(ex, "ex");
        if (event == null) {
            return;
        }
        Map j11 = U.j(new Pair("hierarchy", ViewNodeKt.toViewNodeHierarchy(rootView, rootView)), new Pair("touchInfo", MotionEvent.actionToString(event.getAction()) + " (" + event.getX() + "," + event.getY() + ")"));
        d dVar = this.ozonLogger;
        c cVar = c.ERROR;
        String message = ex.getMessage();
        if (message == null) {
            message = "onDispatchTouchEventFailed";
        }
        dVar.f(cVar, message, f.a(j11), Boolean.FALSE);
    }
}
