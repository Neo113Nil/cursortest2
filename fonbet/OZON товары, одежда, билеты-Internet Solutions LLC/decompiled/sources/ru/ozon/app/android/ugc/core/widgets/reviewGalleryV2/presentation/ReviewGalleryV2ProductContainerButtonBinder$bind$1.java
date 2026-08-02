package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Be.AbstractC2635g;
import Ge.n;
import Sc.s;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.domain.CartState;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.ReviewGalleryV2ProductContainerButtonBinder$bind$1;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import xe.C10720e0;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.ReviewGalleryV2ProductContainerButtonBinder$bind$1", f = "ReviewGalleryV2ProductContainerButtonBinder.kt", l = {68}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ReviewGalleryV2ProductContainerButtonBinder$bind$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ IconButtonV3DTO $atom;
    final /* synthetic */ long $productId;
    final /* synthetic */ IconButtonV3DTO $selectedAtom;
    final /* synthetic */ IconButtonV3View $view;
    final /* synthetic */ Long $widgetId;
    int label;
    final /* synthetic */ ReviewGalleryV2ProductContainerButtonBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewGalleryV2ProductContainerButtonBinder$bind$1(ReviewGalleryV2ProductContainerButtonBinder reviewGalleryV2ProductContainerButtonBinder, long j11, IconButtonV3DTO iconButtonV3DTO, IconButtonV3DTO iconButtonV3DTO2, IconButtonV3View iconButtonV3View, Long l11, d<? super ReviewGalleryV2ProductContainerButtonBinder$bind$1> dVar) {
        super(2, dVar);
        this.this$0 = reviewGalleryV2ProductContainerButtonBinder;
        this.$productId = j11;
        this.$selectedAtom = iconButtonV3DTO;
        this.$atom = iconButtonV3DTO2;
        this.$view = iconButtonV3View;
        this.$widgetId = l11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ReviewGalleryV2ProductContainerButtonBinder$bind$1(this.this$0, this.$productId, this.$selectedAtom, this.$atom, this.$view, this.$widgetId, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CartService cartService;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            cartService = this.this$0.cartService;
            InterfaceC2395h a11 = n.a(CartService.DefaultImpls.observeCartState$default(cartService, false, 1, null));
            final long j11 = this.$productId;
            final IconButtonV3DTO iconButtonV3DTO = this.$selectedAtom;
            final IconButtonV3DTO iconButtonV3DTO2 = this.$atom;
            final IconButtonV3View iconButtonV3View = this.$view;
            final ReviewGalleryV2ProductContainerButtonBinder reviewGalleryV2ProductContainerButtonBinder = this.this$0;
            final Long l11 = this.$widgetId;
            InterfaceC2397i interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.ReviewGalleryV2ProductContainerButtonBinder$bind$1.1

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
                @e(c = "ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.ReviewGalleryV2ProductContainerButtonBinder$bind$1$1$1", f = "ReviewGalleryV2ProductContainerButtonBinder.kt", l = {}, m = "invokeSuspend")
                /* renamed from: ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.ReviewGalleryV2ProductContainerButtonBinder$bind$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C19471 extends j implements Function2<M, d<? super Unit>, Object> {
                    final /* synthetic */ IconButtonV3DTO $actualAtom;
                    final /* synthetic */ IconButtonV3DTO $atom;
                    final /* synthetic */ boolean $inCartForView;
                    final /* synthetic */ IconButtonV3View $view;
                    final /* synthetic */ Long $widgetId;
                    int label;
                    final /* synthetic */ ReviewGalleryV2ProductContainerButtonBinder this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C19471(IconButtonV3View iconButtonV3View, IconButtonV3DTO iconButtonV3DTO, ReviewGalleryV2ProductContainerButtonBinder reviewGalleryV2ProductContainerButtonBinder, IconButtonV3DTO iconButtonV3DTO2, boolean z11, Long l11, d<? super C19471> dVar) {
                        super(2, dVar);
                        this.$view = iconButtonV3View;
                        this.$actualAtom = iconButtonV3DTO;
                        this.this$0 = reviewGalleryV2ProductContainerButtonBinder;
                        this.$atom = iconButtonV3DTO2;
                        this.$inCartForView = z11;
                        this.$widgetId = l11;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void invokeSuspend$lambda$1$lambda$0(IconButtonV3DTO iconButtonV3DTO, ReviewGalleryV2ProductContainerButtonBinder reviewGalleryV2ProductContainerButtonBinder, IconButtonV3DTO iconButtonV3DTO2, boolean z11, Long l11, View view) {
                        AtomActionDTO action;
                        M m11;
                        CommonControlSettings common = iconButtonV3DTO.getCommon();
                        if (common == null || (action = common.getAction()) == null) {
                            return;
                        }
                        m11 = reviewGalleryV2ProductContainerButtonBinder.scope;
                        C10727i.c(m11, null, null, new ReviewGalleryV2ProductContainerButtonBinder$bind$1$1$1$1$1$1(reviewGalleryV2ProductContainerButtonBinder, iconButtonV3DTO2, action, z11, l11, null), 3);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final d<Unit> create(Object obj, d<?> dVar) {
                        return new C19471(this.$view, this.$actualAtom, this.this$0, this.$atom, this.$inCartForView, this.$widgetId, dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                        IconButtonV3View iconButtonV3View = this.$view;
                        final IconButtonV3DTO iconButtonV3DTO = this.$actualAtom;
                        final ReviewGalleryV2ProductContainerButtonBinder reviewGalleryV2ProductContainerButtonBinder = this.this$0;
                        final IconButtonV3DTO iconButtonV3DTO2 = this.$atom;
                        final boolean z11 = this.$inCartForView;
                        final Long l11 = this.$widgetId;
                        IconButtonV3HolderKt.bindOrGone$default(iconButtonV3View, iconButtonV3DTO, null, 2, null);
                        iconButtonV3View.setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.a
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                ReviewGalleryV2ProductContainerButtonBinder$bind$1.AnonymousClass1.C19471.invokeSuspend$lambda$1$lambda$0(IconButtonV3DTO.this, reviewGalleryV2ProductContainerButtonBinder, iconButtonV3DTO2, z11, l11, view);
                            }
                        });
                        return Unit.f71690a;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(M m11, d<? super Unit> dVar) {
                        return ((C19471) create(m11, dVar)).invokeSuspend(Unit.f71690a);
                    }
                }

                @Override // Ae.InterfaceC2397i
                public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                    return emit((CartState) obj2, (d<? super Unit>) dVar);
                }

                /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
                
                    if (r11 == null) goto L10;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(CartState cartState, d<? super Unit> dVar) {
                    boolean hasProduct = cartState.hasProduct(j11);
                    IconButtonV3DTO iconButtonV3DTO3 = iconButtonV3DTO;
                    if (iconButtonV3DTO3 != null) {
                        if (!hasProduct) {
                            iconButtonV3DTO3 = null;
                        }
                    }
                    iconButtonV3DTO3 = iconButtonV3DTO2;
                    IconButtonV3DTO iconButtonV3DTO4 = iconButtonV3DTO3;
                    C10720e0 c10720e0 = C10720e0.f105451a;
                    Object f7 = C10727i.f(De.s.f6650a, new C19471(iconButtonV3View, iconButtonV3DTO4, reviewGalleryV2ProductContainerButtonBinder, iconButtonV3DTO2, hasProduct, l11, null), dVar);
                    return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
                }
            };
            this.label = 1;
            if (((AbstractC2635g) a11).collect(interfaceC2397i, this) == aVar) {
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

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ReviewGalleryV2ProductContainerButtonBinder$bind$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
