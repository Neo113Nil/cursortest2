package ru.ozon.app.android.actionHandlers.monetization.shareLinkBlogger;

import Ae.C2399j;
import Ae.C2408n0;
import Pc.a;
import Tg.b;
import Vg.f;
import a00.C4911f;
import androidx.fragment.app.r;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import java.util.concurrent.atomic.AtomicReference;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.actionHandlers.monetization.shareLinkBlogger.ShareLinkBloggerViewModel;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.B0;
import xe.H0;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class ShareLinkBloggerActionHandler$processWidgetAction$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ b $action;
    final /* synthetic */ r $activity;
    final /* synthetic */ C4911f $container;
    final /* synthetic */ J $lifecycleOwner;
    final /* synthetic */ C7475g $widgetComponentStorage;
    final /* synthetic */ f.a $widgetInfo;
    final /* synthetic */ ShareLinkBloggerActionHandler this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.actionHandlers.monetization.shareLinkBlogger.ShareLinkBloggerActionHandler$processWidgetAction$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<Throwable, Unit> {
        final /* synthetic */ B0 $newJob;
        final /* synthetic */ ShareLinkBloggerActionHandler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ShareLinkBloggerActionHandler shareLinkBloggerActionHandler, B0 b02) {
            super(1);
            this.this$0 = shareLinkBloggerActionHandler;
            this.$newJob = b02;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th2) {
            AtomicReference atomicReference;
            atomicReference = this.this$0.currentJob;
            B0 b02 = this.$newJob;
            while (!atomicReference.compareAndSet(b02, null) && atomicReference.get() == b02) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShareLinkBloggerActionHandler$processWidgetAction$1(f.a aVar, ShareLinkBloggerActionHandler shareLinkBloggerActionHandler, J j11, b bVar, r rVar, C4911f c4911f, C7475g c7475g) {
        super(0);
        this.$widgetInfo = aVar;
        this.this$0 = shareLinkBloggerActionHandler;
        this.$lifecycleOwner = j11;
        this.$action = bVar;
        this.$activity = rVar;
        this.$container = c4911f;
        this.$widgetComponentStorage = c7475g;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        final a aVar;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        androidx.lifecycle.B0 a11 = this.$widgetInfo.b().a();
        aVar = this.this$0.pViewModel;
        ShareLinkBloggerViewModel shareLinkBloggerViewModel = (ShareLinkBloggerViewModel) new z0(a11, new z0.c() { // from class: ru.ozon.app.android.actionHandlers.monetization.shareLinkBlogger.ShareLinkBloggerActionHandler$processWidgetAction$1$invoke$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                ShareLinkBloggerViewModel shareLinkBloggerViewModel2 = (ShareLinkBloggerViewModel) a.this.get();
                Intrinsics.g(shareLinkBloggerViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return shareLinkBloggerViewModel2;
            }
        }).a(ShareLinkBloggerViewModel.class);
        atomicReference = this.this$0.currentJob;
        B0 b02 = (B0) atomicReference.get();
        if (b02 != null) {
            b02.j(null);
        }
        B0 C11 = C2399j.C(new C2408n0(C5427n.a(shareLinkBloggerViewModel.getAction(), this.$lifecycleOwner.getLifecycle(), AbstractC5434v.b.STARTED), new ShareLinkBloggerActionHandler$processWidgetAction$1$newJob$1(this.this$0, this.$activity, this.$container, this.$widgetInfo, this.$widgetComponentStorage, null)), K.a(this.$lifecycleOwner));
        atomicReference2 = this.this$0.currentJob;
        atomicReference2.set(C11);
        ((H0) C11).y(new AnonymousClass1(this.this$0, C11));
        shareLinkBloggerViewModel.obtainIntent(new ShareLinkBloggerViewModel.ShareLinkBloggerIntent.HandleClickAction((AtomAction.Click) this.$action));
    }
}
