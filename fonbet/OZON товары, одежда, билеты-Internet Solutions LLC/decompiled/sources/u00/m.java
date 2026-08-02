package u00;

import Ae.B0;
import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import Ae.InterfaceC2397i;
import Ae.O0;
import Ae.x0;
import Sc.s;
import androidx.lifecycle.w0;
import com.google.protobuf.DescriptorProtos$FileOptions;
import j00.C7234a;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p00.C8829e;
import t00.AbstractC9719a;
import t00.AbstractC9720b;
import t00.C9721c;
import xe.C10727i;
import xe.M;

/* loaded from: classes3.dex */
public final class m extends w0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C7234a f99720a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C0 f99721b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final B0<AbstractC9719a> f99722c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final x0<C9721c> f99723d;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.debug.menu.ui.screens.list.ComposerDebugMenuItemsListViewModel$1", f = "ComposerDebugMenuItemsListViewModel.kt", l = {DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f99724d;

        /* renamed from: u00.m$a$a, reason: collision with other inner class name */
        static final class C2195a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ m f99726a;

            C2195a(m mVar) {
                this.f99726a = mVar;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                this.f99726a.getState().setValue((C9721c) obj);
                return Unit.f71690a;
            }
        }

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return m.this.new a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f99724d;
            if (i11 == 0) {
                s.b(obj);
                m mVar = m.this;
                n00.e S11 = mVar.f99720a.S();
                C2195a c2195a = new C2195a(mVar);
                this.f99724d = 1;
                Object collect = S11.collect(new n(c2195a), this);
                if (collect != aVar) {
                    collect = Unit.f71690a;
                }
                if (collect == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.debug.menu.ui.screens.list.ComposerDebugMenuItemsListViewModel$processStringItemAction$1", f = "ComposerDebugMenuItemsListViewModel.kt", l = {60}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f99727d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AbstractC9720b.d f99729f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f99730g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(AbstractC9720b.d dVar, String str, kotlin.coroutines.d<? super b> dVar2) {
            super(2, dVar2);
            this.f99729f = dVar;
            this.f99730g = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return m.this.new b(this.f99729f, this.f99730g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f99727d;
            if (i11 == 0) {
                s.b(obj);
                C0 c02 = m.this.f99721b;
                AbstractC9719a.c cVar = new AbstractC9719a.c(this.f99729f, this.f99730g);
                this.f99727d = 1;
                if (c02.emit(cVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    public m(@NotNull C7234a composerDebugMenuSDK) {
        Intrinsics.checkNotNullParameter(composerDebugMenuSDK, "composerDebugMenuSDK");
        this.f99720a = composerDebugMenuSDK;
        C0 b11 = E0.b(0, 0, null, 6);
        this.f99721b = b11;
        this.f99722c = C2399j.a(b11);
        this.f99723d = O0.a(new C9721c(K.f71697a, false));
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new a(null), 3);
    }

    @NotNull
    public final B0<AbstractC9719a> f0() {
        return this.f99722c;
    }

    public final void g0(@NotNull AbstractC9720b.C2174b item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f99720a.Q(item.c(), !item.d());
    }

    @NotNull
    public final x0<C9721c> getState() {
        return this.f99723d;
    }

    public final void h0(@NotNull AbstractC9720b.d stringItem, @NotNull String valueToSubmit) {
        Intrinsics.checkNotNullParameter(stringItem, "stringItem");
        Intrinsics.checkNotNullParameter(valueToSubmit, "valueToSubmit");
        if (stringItem.b() instanceof C8829e) {
            C10727i.c(androidx.lifecycle.x0.a(this), null, null, new b(stringItem, valueToSubmit, null), 3);
        }
    }

    public final void i0(@NotNull String newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        this.f99720a.P(newValue);
    }
}
