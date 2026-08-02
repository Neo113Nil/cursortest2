package ru.ozon.app.android.action;

import Wg.e;
import a00.C4911f;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import v10.C10183a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LWg/e;", "", "invoke", "(LWg/e;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class WidgetActionHandlerKt$WidgetActionHandlerBuilder$actionNavigator$1 extends AbstractC7737t implements Function1<e, Unit> {
    final /* synthetic */ C4911f $container;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WidgetActionHandlerKt$WidgetActionHandlerBuilder$actionNavigator$1(C4911f c4911f) {
        super(1);
        this.$container = c4911f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView invoke$lambda$0(C4911f c4911f) {
        View view;
        ComponentCallbacksC5392m c11 = c4911f.c();
        if (c11 == null || (view = c11.getView()) == null) {
            return null;
        }
        return C10183a.i(view);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(e eVar) {
        invoke2(eVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(e buildScrollPositionConverter) {
        Intrinsics.checkNotNullParameter(buildScrollPositionConverter, "$this$buildScrollPositionConverter");
        final C4911f c4911f = this.$container;
        buildScrollPositionConverter.b(new Wg.a() { // from class: ru.ozon.app.android.action.a
            @Override // Wg.a
            public final RecyclerView get() {
                RecyclerView invoke$lambda$0;
                invoke$lambda$0 = WidgetActionHandlerKt$WidgetActionHandlerBuilder$actionNavigator$1.invoke$lambda$0(C4911f.this);
                return invoke$lambda$0;
            }
        });
    }
}
