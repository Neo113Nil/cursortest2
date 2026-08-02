package ru.ozon.uni.android.ds.compose.modifier;

import D1.InterfaceC2803h;
import D1.r0;
import D1.s0;
import androidx.compose.ui.e;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.G;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u001f\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\bR$\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/uni/android/ds/compose/modifier/DSTrackViewAnalyticsNode;", "Landroidx/compose/ui/e$c;", "LD1/h;", "LD1/r0;", "Landroidx/lifecycle/G;", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "viewAnalyticsInfo", "<init>", "(Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;)V", "", "onAttach", "()V", "onDetach", "onObservedReadsChanged", "Landroidx/lifecycle/J;", "source", "Landroidx/lifecycle/v$a;", "event", "onStateChanged", "(Landroidx/lifecycle/J;Landroidx/lifecycle/v$a;)V", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "getViewAnalyticsInfo", "()Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "setViewAnalyticsInfo", "Lkotlin/Function1;", "callback", "Lkotlin/jvm/functions/Function1;", "lifecycleOwner", "Landroidx/lifecycle/J;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class DSTrackViewAnalyticsNode extends e.c implements InterfaceC2803h, r0, G {
    private Function1<? super TokenizedTrackingInfo, Unit> callback;
    private J lifecycleOwner;

    @NotNull
    private TokenizedTrackingInfo viewAnalyticsInfo;

    public DSTrackViewAnalyticsNode(@NotNull TokenizedTrackingInfo viewAnalyticsInfo) {
        Intrinsics.checkNotNullParameter(viewAnalyticsInfo, "viewAnalyticsInfo");
        this.viewAnalyticsInfo = viewAnalyticsInfo;
    }

    @Override // androidx.compose.ui.e.c
    public void onAttach() {
        onObservedReadsChanged();
    }

    @Override // androidx.compose.ui.e.c
    public void onDetach() {
        AbstractC5434v lifecycle;
        J j11 = this.lifecycleOwner;
        if (j11 != null && (lifecycle = j11.getLifecycle()) != null) {
            lifecycle.e(this);
        }
        this.callback = null;
        this.lifecycleOwner = null;
    }

    @Override // D1.r0
    public void onObservedReadsChanged() {
        J j11;
        AbstractC5434v lifecycle;
        M m11 = new M();
        s0.a(this, new DSTrackViewAnalyticsNode$onObservedReadsChanged$1(m11, this));
        T t2 = m11.f71787a;
        if (t2 == 0 || (j11 = this.lifecycleOwner) == t2) {
            return;
        }
        if (j11 != null && (lifecycle = j11.getLifecycle()) != null) {
            lifecycle.e(this);
        }
        ((J) m11.f71787a).getLifecycle().a(this);
        this.lifecycleOwner = (J) m11.f71787a;
    }

    @Override // androidx.lifecycle.G
    public void onStateChanged(@NotNull J source, @NotNull AbstractC5434v.a event) {
        AbstractC5434v lifecycle;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == AbstractC5434v.a.ON_RESUME) {
            Function1<? super TokenizedTrackingInfo, Unit> function1 = this.callback;
            if (function1 != null) {
                function1.invoke(this.viewAnalyticsInfo);
            }
            J j11 = this.lifecycleOwner;
            if (j11 == null || (lifecycle = j11.getLifecycle()) == null) {
                return;
            }
            lifecycle.e(this);
        }
    }

    public final void setViewAnalyticsInfo(@NotNull TokenizedTrackingInfo tokenizedTrackingInfo) {
        Intrinsics.checkNotNullParameter(tokenizedTrackingInfo, "<set-?>");
        this.viewAnalyticsInfo = tokenizedTrackingInfo;
    }
}
