package androidx.compose.ui.platform;

import B.AbstractC1030e;
import B.AbstractC1034i;
import B.InterfaceC1028c;
import B.InterfaceC1031f;
import B.w;
import Ph.P;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.lifecycle.AbstractC2185j;
import androidx.lifecycle.InterfaceC2191p;
import androidx.lifecycle.InterfaceC2193s;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002J\u001d\u0010\u0006\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0014\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0019\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Landroidx/compose/ui/platform/WrappedComposition;", "LB/f;", "Landroidx/lifecycle/p;", "Lkotlin/Function0;", "", "content", "a", "(Lkotlin/jvm/functions/Function2;)V", "dispose", "()V", "Landroidx/lifecycle/s;", "source", "Landroidx/lifecycle/j$a;", "event", "k", "(Landroidx/lifecycle/s;Landroidx/lifecycle/j$a;)V", "Landroidx/compose/ui/platform/AndroidComposeView;", "Landroidx/compose/ui/platform/AndroidComposeView;", "g", "()Landroidx/compose/ui/platform/AndroidComposeView;", "owner", com.google.crypto.tink.integration.android.b.f37029b, "LB/f;", "f", "()LB/f;", "original", "", "c", "Z", "disposed", "Landroidx/lifecycle/j;", W9.d.f13160a, "Landroidx/lifecycle/j;", "addedToLifecycle", com.bumptech.glide.gifdecoder.e.f29601m, "Lkotlin/jvm/functions/Function2;", "lastContent", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class WrappedComposition implements InterfaceC1031f, InterfaceC2191p {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final AndroidComposeView owner;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final InterfaceC1031f original;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean disposed;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public AbstractC2185j addedToLifecycle;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public Function2 lastContent;

    public static final class a extends Lambda implements Function1 {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Function2 f17681e;

        /* renamed from: androidx.compose.ui.platform.WrappedComposition$a$a, reason: collision with other inner class name */
        public static final class C0349a extends Lambda implements Function2 {

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ WrappedComposition f17682d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Function2 f17683e;

            /* renamed from: androidx.compose.ui.platform.WrappedComposition$a$a$a, reason: collision with other inner class name */
            public static final class C0350a extends SuspendLambda implements Function2 {

                /* renamed from: n, reason: collision with root package name */
                public int f17684n;

                /* renamed from: o, reason: collision with root package name */
                public final /* synthetic */ WrappedComposition f17685o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0350a(WrappedComposition wrappedComposition, Continuation continuation) {
                    super(2, continuation);
                    this.f17685o = wrappedComposition;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C0350a(this.f17685o, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(P p10, Continuation continuation) {
                    return ((C0350a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i10 = this.f17684n;
                    if (i10 == 0) {
                        ResultKt.throwOnFailure(obj);
                        AndroidComposeView owner = this.f17685o.getOwner();
                        this.f17684n = 1;
                        if (owner.o(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* renamed from: androidx.compose.ui.platform.WrappedComposition$a$a$b */
            public static final class b extends Lambda implements Function2 {

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ WrappedComposition f17686d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ Function2 f17687e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(WrappedComposition wrappedComposition, Function2 function2) {
                    super(2);
                    this.f17686d = wrappedComposition;
                    this.f17687e = function2;
                }

                public final void a(InterfaceC1028c interfaceC1028c, int i10) {
                    if ((i10 & 11) == 2 && interfaceC1028c.b()) {
                        interfaceC1028c.j();
                        return;
                    }
                    if (AbstractC1030e.c()) {
                        AbstractC1030e.e(-1193460702, i10, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous>.<anonymous> (Wrapper.android.kt:156)");
                    }
                    f.a(this.f17686d.getOwner(), this.f17687e, interfaceC1028c, 8);
                    if (AbstractC1030e.c()) {
                        AbstractC1030e.d();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    android.support.v4.media.session.b.a(obj);
                    a(null, ((Number) obj2).intValue());
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0349a(WrappedComposition wrappedComposition, Function2 function2) {
                super(2);
                this.f17682d = wrappedComposition;
                this.f17683e = function2;
            }

            public final void a(InterfaceC1028c interfaceC1028c, int i10) {
                if ((i10 & 11) == 2 && interfaceC1028c.b()) {
                    interfaceC1028c.j();
                    return;
                }
                if (AbstractC1030e.c()) {
                    AbstractC1030e.e(-2000640158, i10, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous> (Wrapper.android.kt:141)");
                }
                Object tag = this.f17682d.getOwner().getTag(J.b.f5874a);
                Set set = TypeIntrinsics.isMutableSet(tag) ? (Set) tag : null;
                if (set == null) {
                    Object parent = this.f17682d.getOwner().getParent();
                    View view = parent instanceof View ? (View) parent : null;
                    Object tag2 = view != null ? view.getTag(J.b.f5874a) : null;
                    set = TypeIntrinsics.isMutableSet(tag2) ? (Set) tag2 : null;
                }
                if (set != null) {
                    interfaceC1028c.h();
                    set.add(null);
                    interfaceC1028c.e();
                }
                B.n.a(this.f17682d.getOwner(), new C0350a(this.f17682d, null), interfaceC1028c, 72);
                AbstractC1034i.a(new w[]{I.b.a().b(set)}, G.c.a(interfaceC1028c, -1193460702, true, new b(this.f17682d, this.f17683e)), interfaceC1028c, 56);
                if (AbstractC1030e.c()) {
                    AbstractC1030e.d();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                android.support.v4.media.session.b.a(obj);
                a(null, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function2 function2) {
            super(1);
            this.f17681e = function2;
        }

        public final void a(AndroidComposeView.b it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (WrappedComposition.this.disposed) {
                return;
            }
            AbstractC2185j lifecycle = it.a().getLifecycle();
            WrappedComposition.this.lastContent = this.f17681e;
            if (WrappedComposition.this.addedToLifecycle == null) {
                WrappedComposition.this.addedToLifecycle = lifecycle;
                lifecycle.a(WrappedComposition.this);
            } else if (lifecycle.b().b(AbstractC2185j.b.f20392c)) {
                WrappedComposition.this.getOriginal().a(G.c.b(-2000640158, true, new C0349a(WrappedComposition.this, this.f17681e)));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((AndroidComposeView.b) obj);
            return Unit.INSTANCE;
        }
    }

    @Override // B.InterfaceC1031f
    public void a(Function2 content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.owner.setOnViewTreeOwnersAvailable(new a(content));
    }

    @Override // B.InterfaceC1031f
    public void dispose() {
        if (!this.disposed) {
            this.disposed = true;
            this.owner.getView().setTag(J.b.f5875b, null);
            AbstractC2185j abstractC2185j = this.addedToLifecycle;
            if (abstractC2185j != null) {
                abstractC2185j.d(this);
            }
        }
        this.original.dispose();
    }

    /* renamed from: f, reason: from getter */
    public final InterfaceC1031f getOriginal() {
        return this.original;
    }

    /* renamed from: g, reason: from getter */
    public final AndroidComposeView getOwner() {
        return this.owner;
    }

    @Override // androidx.lifecycle.InterfaceC2191p
    public void k(InterfaceC2193s source, AbstractC2185j.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == AbstractC2185j.a.ON_DESTROY) {
            dispose();
        } else {
            if (event != AbstractC2185j.a.ON_CREATE || this.disposed) {
                return;
            }
            a(this.lastContent);
        }
    }
}
