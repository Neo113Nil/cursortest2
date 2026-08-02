package ru.ozon.android.messenger.framework.presentation.common.view.recycler;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ozon/android/messenger/framework/presentation/common/view/recycler/MessengerMetricsRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class MessengerMetricsRecyclerView extends RecyclerView {

    /* renamed from: a, reason: collision with root package name */
    private ru.ozon.android.messenger.framework.analytics.c f91209a;

    /* renamed from: b, reason: collision with root package name */
    private String f91210b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessengerMetricsRecyclerView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f91209a = new ru.ozon.android.messenger.framework.analytics.c();
    }

    /* renamed from: c, reason: from getter */
    public final ru.ozon.android.messenger.framework.analytics.c getF91209a() {
        return this.f91209a;
    }

    public final void d(String str) {
        this.f91210b = str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        Function1 c11;
        try {
            super.onLayout(z11, i11, i12, i13, i14);
            String str = this.f91210b;
            if (str == null) {
                return;
            }
            RecyclerView.g adapter = getAdapter();
            if (adapter == null || adapter.getItemCount() != 0) {
                ru.ozon.android.messenger.framework.analytics.c cVar = this.f91209a;
                if (cVar != null && (c11 = cVar.c()) != null) {
                    c11.invoke(str);
                }
                this.f91210b = null;
            }
        } catch (Exception unused) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    protected final void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
    }
}
