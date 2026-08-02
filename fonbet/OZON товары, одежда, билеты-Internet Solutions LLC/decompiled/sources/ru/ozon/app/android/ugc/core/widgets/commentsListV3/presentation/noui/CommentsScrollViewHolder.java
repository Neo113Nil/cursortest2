package ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.noui;

import Ae.C2399j;
import Ae.C2408n0;
import Sc.s;
import Wc.a;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.core.view.C5353y0;
import androidx.core.view.Y;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.K;
import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentsListVO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentsViewModel;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/noui/CommentsScrollViewHolder;", "Ld20/b;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/CommentsListVO;", "Ll10/i;", "container", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/CommentsViewModel;", "viewModel", "<init>", "(Ll10/i;Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/CommentsViewModel;)V", "item", "", "bind", "(Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/CommentsListVO;)V", "onWidgetDestroyed", "()V", "Ll10/i;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/CommentsViewModel;", "", "metricView", "Ljava/lang/Void;", "getMetricView", "()Ljava/lang/Void;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "", "insets", "I", "", "isKeyboardVisible", "Ljava/lang/Boolean;", "isScrollRequired", "Z", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CommentsScrollViewHolder extends AbstractC6065b<CommentsListVO> {

    @NotNull
    private final i container;

    @NotNull
    private final Handler handler;
    private int insets;
    private Boolean isKeyboardVisible;
    private final boolean isScrollRequired;
    private final Void metricView;

    @NotNull
    private final CommentsViewModel viewModel;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.noui.CommentsScrollViewHolder$1", f = "CommentsScrollViewHolder.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.noui.CommentsScrollViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<Boolean, d<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = CommentsScrollViewHolder.this.new AnonymousClass1(dVar);
            anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, d<? super Unit> dVar) {
            return invoke(bool.booleanValue(), dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            boolean z11 = this.Z$0;
            CommentsScrollViewHolder.this.isKeyboardVisible = Boolean.valueOf(z11);
            return Unit.f71690a;
        }

        public final Object invoke(boolean z11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(Boolean.valueOf(z11), dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    public CommentsScrollViewHolder(@NotNull i container, @NotNull CommentsViewModel viewModel) {
        androidx.core.graphics.d f7;
        androidx.core.graphics.d f11;
        Bundle arguments;
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.container = container;
        this.viewModel = viewModel;
        this.handler = new Handler(Looper.getMainLooper());
        this.isKeyboardVisible = Boolean.FALSE;
        ComponentCallbacksC5392m c11 = container.Q().c();
        int i11 = 0;
        this.isScrollRequired = (c11 == null || (arguments = c11.getArguments()) == null) ? false : arguments.getBoolean("withScrollToComment");
        C5353y0 n11 = Y.n(container.Y());
        int i12 = (n11 == null || (f11 = n11.f(2)) == null) ? 0 : f11.f42129d;
        if (n11 != null && (f7 = n11.f(1)) != null) {
            i11 = f7.f42127b;
        }
        this.insets = i12 + i11;
        C2399j.C(new C2408n0(viewModel.getKeyboardVisibility(), new AnonymousClass1(null)), K.a(container.K().f()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$0(CommentsScrollViewHolder commentsScrollViewHolder) {
        if (!Intrinsics.d(commentsScrollViewHolder.isKeyboardVisible, Boolean.FALSE) || commentsScrollViewHolder.viewModel.getIsCommentsVisible()) {
            return;
        }
        InterfaceC7851b.a.c(commentsScrollViewHolder.container.M(), "commentsList", Integer.valueOf(commentsScrollViewHolder.insets), 4);
    }

    @Override // d20.AbstractC6065b
    public /* bridge */ /* synthetic */ View getMetricView() {
        return (View) getMetricView();
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        super.onWidgetDestroyed();
        this.handler.removeCallbacksAndMessages(null);
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull CommentsListVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (!this.isScrollRequired || item.getTotalCount() <= 0) {
            return;
        }
        this.handler.postDelayed(new H.a(this, 1), 300L);
    }

    public Void getMetricView() {
        return this.metricView;
    }
}
