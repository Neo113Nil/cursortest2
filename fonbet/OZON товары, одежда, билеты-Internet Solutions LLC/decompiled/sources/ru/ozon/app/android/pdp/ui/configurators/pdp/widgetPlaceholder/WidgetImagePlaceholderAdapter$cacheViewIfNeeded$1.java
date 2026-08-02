package ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder;

import Sc.s;
import Wc.a;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetImagePlaceholderAdapter$cacheViewIfNeeded$1", f = "WidgetImagePlaceholderAdapter.kt", l = {166, 169}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class WidgetImagePlaceholderAdapter$cacheViewIfNeeded$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $fullWidgetId;
    final /* synthetic */ View $view;
    int label;
    final /* synthetic */ WidgetImagePlaceholderAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WidgetImagePlaceholderAdapter$cacheViewIfNeeded$1(View view, WidgetImagePlaceholderAdapter widgetImagePlaceholderAdapter, String str, d<? super WidgetImagePlaceholderAdapter$cacheViewIfNeeded$1> dVar) {
        super(2, dVar);
        this.$view = view;
        this.this$0 = widgetImagePlaceholderAdapter;
        this.$fullWidgetId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new WidgetImagePlaceholderAdapter$cacheViewIfNeeded$1(this.$view, this.this$0, this.$fullWidgetId, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
    
        if (r7 == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
    
        if (r7 == r0) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object saveWidget;
        Object saveWidget2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            View view = this.$view;
            if (view instanceof RecyclerView) {
                RecyclerView.o layoutManager = ((RecyclerView) view).getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager != null) {
                    WidgetImagePlaceholderAdapter widgetImagePlaceholderAdapter = this.this$0;
                    String str = this.$fullWidgetId;
                    if (linearLayoutManager.findLastCompletelyVisibleItemPosition() == linearLayoutManager.getItemCount() - 1 && linearLayoutManager.findFirstCompletelyVisibleItemPosition() == 0) {
                        this.label = 1;
                        saveWidget2 = widgetImagePlaceholderAdapter.saveWidget(str, this);
                    }
                }
            } else {
                WidgetImagePlaceholderAdapter widgetImagePlaceholderAdapter2 = this.this$0;
                String str2 = this.$fullWidgetId;
                this.label = 2;
                saveWidget = widgetImagePlaceholderAdapter2.saveWidget(str2, this);
            }
        } else {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((WidgetImagePlaceholderAdapter$cacheViewIfNeeded$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
