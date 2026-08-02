package ru.ozon.android.messenger.blocks.ai.tapTags.presentation.view;

import Ae.InterfaceC2397i;
import Ae.M0;
import Sc.C4005g;
import Sc.o;
import Sc.s;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.ai.tapTags.presentation.b;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.analytics.h;
import ru.ozon.android.messenger.framework.presentation.ai.J0;
import ru.ozon.android.messenger.framework.presentation.ai.K0;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.q;
import ru.ozon.android.messenger.framework.presentation.models.p;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.messenger.databinding.MBlockAiTapTagsBinding;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import xe.C10727i;
import xe.M;

/* loaded from: classes10.dex */
public final class a extends q<ru.ozon.android.messenger.blocks.ai.tapTags.presentation.c, MBlockAiTapTagsBinding> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.core.d f84344a;

    /* renamed from: b, reason: collision with root package name */
    private final K0 f84345b;

    /* renamed from: c, reason: collision with root package name */
    private ru.ozon.android.messenger.blocks.ai.tapTags.presentation.c f84346c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f84347d;

    @e(c = "ru.ozon.android.messenger.blocks.ai.tapTags.presentation.view.TapTagsBlockView$1", f = "TapTagsBlockView.kt", l = {DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER}, m = "invokeSuspend")
    /* renamed from: ru.ozon.android.messenger.blocks.ai.tapTags.presentation.view.a$a, reason: collision with other inner class name */
    static final class C1466a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f84348d;

        @e(c = "ru.ozon.android.messenger.blocks.ai.tapTags.presentation.view.TapTagsBlockView$1$1", f = "TapTagsBlockView.kt", l = {38}, m = "invokeSuspend")
        /* renamed from: ru.ozon.android.messenger.blocks.ai.tapTags.presentation.view.a$a$a, reason: collision with other inner class name */
        static final class C1467a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f84350d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ a f84351e;

            /* renamed from: ru.ozon.android.messenger.blocks.ai.tapTags.presentation.view.a$a$a$a, reason: collision with other inner class name */
            static final class C1468a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ a f84352a;

                C1468a(a aVar) {
                    this.f84352a = aVar;
                }

                @Override // Ae.InterfaceC2397i
                public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    a aVar = this.f84352a;
                    aVar.f84347d = booleanValue;
                    ru.ozon.android.messenger.blocks.ai.tapTags.presentation.c cVar = aVar.f84346c;
                    if (cVar != null) {
                        aVar.k(cVar);
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1467a(a aVar, kotlin.coroutines.d<? super C1467a> dVar) {
                super(2, dVar);
                this.f84351e = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C1467a(this.f84351e, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C1467a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                M0<Boolean> b11;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f84350d;
                if (i11 == 0) {
                    s.b(obj);
                    a aVar2 = this.f84351e;
                    K0 k02 = aVar2.f84345b;
                    if (k02 == null || (b11 = k02.b()) == null) {
                        return Unit.f71690a;
                    }
                    C1468a c1468a = new C1468a(aVar2);
                    this.f84350d = 1;
                    if (b11.collect(c1468a, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                throw new C4005g();
            }
        }

        C1466a(kotlin.coroutines.d<? super C1466a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return a.this.new C1466a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C1466a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f84348d;
            if (i11 == 0) {
                s.b(obj);
                a aVar2 = a.this;
                J f7 = aVar2.f84344a.f();
                AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                C1467a c1467a = new C1467a(aVar2, null);
                this.f84348d = 1;
                if (C5412d0.b(f7, bVar, c1467a, this) == aVar) {
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

    /* synthetic */ class b extends C7735q implements Function1<AtomAction, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(AtomAction atomAction) {
            AtomAction p02 = atomAction;
            Intrinsics.checkNotNullParameter(p02, "p0");
            a.e((a) this.receiver, p02);
            return Unit.f71690a;
        }
    }

    /* synthetic */ class c extends C7735q implements Function1<AtomAction, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(AtomAction atomAction) {
            AtomAction p02 = atomAction;
            Intrinsics.checkNotNullParameter(p02, "p0");
            a.e((a) this.receiver, p02);
            return Unit.f71690a;
        }
    }

    /* synthetic */ class d extends C7735q implements Function1<AtomAction, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(AtomAction atomAction) {
            AtomAction p02 = atomAction;
            Intrinsics.checkNotNullParameter(p02, "p0");
            a.f((a) this.receiver, p02);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull MBlockAiTapTagsBinding binding, @NotNull ru.ozon.android.messenger.framework.core.d references) {
        super(binding, references);
        M0<Boolean> b11;
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        this.f84344a = references;
        InterfaceC5431s d11 = references.d();
        J0 j02 = d11 instanceof J0 ? (J0) d11 : null;
        K0 f89424h = j02 != null ? j02.getF89424h() : null;
        this.f84345b = f89424h;
        this.f84347d = (f89424h == null || (b11 = f89424h.b()) == null) ? true : b11.getValue().booleanValue();
        C10727i.c(K.a(references.f()), null, null, new C1466a(null), 3);
    }

    public static final void e(a aVar, AtomAction atomAction) {
        if (aVar.j(atomAction)) {
            return;
        }
        aVar.i(atomAction);
        aVar.f84344a.c().q(ru.ozon.android.messenger.framework.navigation.action.b.e(atomAction, null, 3));
    }

    public static final void f(a aVar, AtomAction atomAction) {
        if (aVar.j(atomAction)) {
            return;
        }
        String id2 = atomAction.getId();
        K0 k02 = aVar.f84345b;
        if (k02 != null ? k02.c(id2) : true) {
            aVar.i(atomAction);
            aVar.f84344a.c().q(ru.ozon.android.messenger.framework.navigation.action.b.e(atomAction, null, 3));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void i(AtomAction atomAction) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        AtomAction.SendAnalytics sendAnalytics = atomAction instanceof AtomAction.SendAnalytics ? (AtomAction.SendAnalytics) atomAction : null;
        if (sendAnalytics == null || (trackingInfo = sendAnalytics.getTrackingInfo()) == null) {
            return;
        }
        Map<String, MessengerTrackingInfo> a11 = h.a(trackingInfo);
        Map<String, MessengerTrackingInfo> map = a11.isEmpty() ? null : a11;
        if (map != null) {
            this.f84344a.c().m(map);
        }
    }

    private final boolean j(AtomAction atomAction) {
        Map<String, TokenizedTrackingInfo> trackingInfo = atomAction instanceof AtomAction.IgnoreViewPoolViewAction ? ((AtomAction.IgnoreViewPoolViewAction) atomAction).getTrackingInfo() : atomAction instanceof AtomAction.ViewAction ? ((AtomAction.ViewAction) atomAction).getTrackingInfo() : null;
        if (trackingInfo == null) {
            return false;
        }
        Map<String, MessengerTrackingInfo> a11 = h.a(trackingInfo);
        Map<String, MessengerTrackingInfo> map = a11.isEmpty() ? null : a11;
        if (map == null) {
            return false;
        }
        this.f84344a.c().s(map);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(ru.ozon.android.messenger.blocks.ai.tapTags.presentation.c cVar) {
        ru.ozon.android.messenger.blocks.ai.tapTags.presentation.c cVar2;
        ru.ozon.android.messenger.blocks.ai.tapTags.presentation.c a11;
        TagButtonDTO copy;
        Object a12;
        TapTagsView constraintLayout = getBinding().getConstraintLayout();
        if (this.f84347d) {
            cVar2 = cVar;
            a11 = cVar2;
        } else {
            List<ru.ozon.android.messenger.blocks.ai.tapTags.presentation.b> c11 = cVar.c();
            ArrayList arrayList = new ArrayList(C7714v.z(c11, 10));
            for (ru.ozon.android.messenger.blocks.ai.tapTags.presentation.b bVar : c11) {
                if (bVar instanceof b.a) {
                    b.a aVar = (b.a) bVar;
                    a12 = b.a.a(aVar, ButtonV3DTO.copy$default(aVar.b(), null, null, null, null, null, null, Boolean.TRUE, null, null, null, null, null, null, null, null, null, null, 131007, null));
                } else {
                    if (!(bVar instanceof b.C1465b)) {
                        throw new o();
                    }
                    b.C1465b c1465b = (b.C1465b) bVar;
                    copy = r5.copy((r34 & 1) != 0 ? r5.styleType : null, (r34 & 2) != 0 ? r5.size : null, (r34 & 4) != 0 ? r5.isSelected : null, (r34 & 8) != 0 ? r5.isDisabled : Boolean.TRUE, (r34 & 16) != 0 ? r5.isClosable : null, (r34 & 32) != 0 ? r5.icon : null, (r34 & 64) != 0 ? r5.text : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r5.indicator : null, (r34 & 256) != 0 ? r5.customDefaultStyle : null, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? r5.customSelectedStyle : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? r5.common : null, (r34 & 2048) != 0 ? r5.closeControlSettings : null, (r34 & 4096) != 0 ? r5.context : null, (r34 & 8192) != 0 ? r5.isStateChangeDisabled : null, (r34 & 16384) != 0 ? r5.image : null, (r34 & 32768) != 0 ? c1465b.b().round : null);
                    a12 = b.C1465b.a(c1465b, copy);
                }
                arrayList.add(a12);
            }
            cVar2 = cVar;
            a11 = ru.ozon.android.messenger.blocks.ai.tapTags.presentation.c.a(cVar2, arrayList);
        }
        cVar2.getClass();
        constraintLayout.c(a11, false, new b(1, this, a.class, "handleRegularAction", "handleRegularAction(Lru/ozon/uni/atoms/af/AtomAction;)V", 0), new c(1, this, a.class, "handleRegularAction", "handleRegularAction(Lru/ozon/uni/atoms/af/AtomAction;)V", 0), new d(1, this, a.class, "handleTagItemAction", "handleTagItemAction(Lru/ozon/uni/atoms/af/AtomAction;)V", 0));
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.q
    public final void bind(ru.ozon.android.messenger.blocks.ai.tapTags.presentation.c cVar, p itemInfo, ru.ozon.android.messenger.framework.presentation.models.d blockInfo, Object obj) {
        ru.ozon.android.messenger.blocks.ai.tapTags.presentation.c block = cVar;
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(itemInfo, "itemInfo");
        Intrinsics.checkNotNullParameter(blockInfo, "blockInfo");
        super.bind(block, itemInfo, blockInfo, obj);
        this.f84346c = block;
        k(block);
    }
}
