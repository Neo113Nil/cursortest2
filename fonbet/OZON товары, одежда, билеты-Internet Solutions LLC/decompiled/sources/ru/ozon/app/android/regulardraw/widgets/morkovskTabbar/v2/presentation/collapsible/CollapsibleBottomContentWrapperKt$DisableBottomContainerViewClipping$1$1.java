package ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.presentation.collapsible;

import Sc.s;
import Wc.a;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.presentation.collapsible.CollapsibleBottomContentWrapperKt$DisableBottomContainerViewClipping$1$1", f = "CollapsibleBottomContentWrapper.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class CollapsibleBottomContentWrapperKt$DisableBottomContainerViewClipping$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ LinearLayout $composerBottomContainer;
    int label;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/ViewGroup;", "invoke", "(Landroid/view/ViewGroup;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.presentation.collapsible.CollapsibleBottomContentWrapperKt$DisableBottomContainerViewClipping$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<ViewGroup, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(ViewGroup it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CollapsibleBottomContentWrapperKt$DisableBottomContainerViewClipping$1$1(LinearLayout linearLayout, d<? super CollapsibleBottomContentWrapperKt$DisableBottomContainerViewClipping$1$1> dVar) {
        super(2, dVar);
        this.$composerBottomContainer = linearLayout;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CollapsibleBottomContentWrapperKt$DisableBottomContainerViewClipping$1$1(this.$composerBottomContainer, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ViewGroup findParent;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        LinearLayout linearLayout = this.$composerBottomContainer;
        if (linearLayout != null) {
            linearLayout.setClipChildren(false);
        }
        LinearLayout linearLayout2 = this.$composerBottomContainer;
        if (linearLayout2 != null && (findParent = ViewExtKt.findParent(linearLayout2, AnonymousClass1.INSTANCE)) != null) {
            findParent.setClipChildren(false);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CollapsibleBottomContentWrapperKt$DisableBottomContainerViewClipping$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
