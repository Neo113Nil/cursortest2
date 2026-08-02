package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormHeaderV2;

import D1.InterfaceC2801g;
import J0.P;
import S0.A0;
import S0.F1;
import S0.InterfaceC3967k;
import android.view.View;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m3.C8060b;
import ru.ozon.app.android.ugc.view.text.clickable.ClickableTextComposableKt;
import ru.ozon.app.android.ugc.view.text.clickable.ClickableTextVO;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormRating.ReviewFormRatingComposableKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.atoms.data.rating.RatingDTO;
import ru.ozon.uni.components.productMedia.UniProductMediaAtomKt;
import u0.E;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class ReviewFormHeaderV2ComposableKt$ReviewFormHeaderV2Composable$2$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $onAction;
    final /* synthetic */ Function1<Float, Unit> $onRatingClick;
    final /* synthetic */ ReviewFormHeaderV2VO $state;
    final /* synthetic */ View $view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ReviewFormHeaderV2ComposableKt$ReviewFormHeaderV2Composable$2$1(ReviewFormHeaderV2VO reviewFormHeaderV2VO, Function1<? super AtomAction, Unit> function1, View view, Function1<? super Float, Unit> function12) {
        super(2);
        this.$state = reviewFormHeaderV2VO;
        this.$onAction = function1;
        this.$view = view;
        this.$onRatingClick = function12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        if ((i11 & 3) == 2 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        ProductMediaDTO productImage = this.$state.getProductImage();
        e.a aVar = e.f40358c0;
        UniProductMediaAtomKt.UniProductMediaAtom(productImage, androidx.compose.ui.layout.a.b(aVar, "ImageId"), this.$onAction, interfaceC3967k, ProductMediaDTO.$stable | 48, 0);
        e b11 = androidx.compose.ui.layout.a.b(aVar, "ContainerId");
        ReviewFormHeaderV2VO reviewFormHeaderV2VO = this.$state;
        Function1<AtomAction, Unit> function1 = this.$onAction;
        View view = this.$view;
        Function1<Float, Unit> function12 = this.$onRatingClick;
        C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), interfaceC3967k, 0);
        int I11 = interfaceC3967k.I();
        A0 d11 = interfaceC3967k.d();
        e f7 = c.f(interfaceC3967k, b11);
        InterfaceC2801g.f5440U.getClass();
        Function0 a12 = InterfaceC2801g.a.a();
        if (interfaceC3967k.v() == null) {
            C8060b.c();
            throw null;
        }
        interfaceC3967k.i();
        if (interfaceC3967k.t()) {
            interfaceC3967k.H(a12);
        } else {
            interfaceC3967k.e();
        }
        Function2 c11 = P.c(interfaceC3967k, a11, interfaceC3967k, d11);
        if (interfaceC3967k.t() || !Intrinsics.d(interfaceC3967k.C(), Integer.valueOf(I11))) {
            Nk.a.d(c11, I11, interfaceC3967k, I11);
        }
        F1.b(interfaceC3967k, f7, InterfaceC2801g.a.f());
        ClickableTextVO title = reviewFormHeaderV2VO.getTitle();
        int i12 = AtomAction.$stable;
        ClickableTextComposableKt.ClickableTextComposable(title, function1, interfaceC3967k, i12);
        ClickableTextVO subtitle = reviewFormHeaderV2VO.getSubtitle();
        interfaceC3967k.o(1216164276);
        if (subtitle != null) {
            ClickableTextComposableKt.ClickableTextComposable(subtitle, function1, interfaceC3967k, i12);
        }
        interfaceC3967k.k();
        E.a(interfaceC3967k, a0.f(aVar, 6));
        RatingDTO rating = reviewFormHeaderV2VO.getRating().getRating();
        interfaceC3967k.o(1216173437);
        boolean F11 = interfaceC3967k.F(view) | interfaceC3967k.n(function12);
        Object C11 = interfaceC3967k.C();
        if (F11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new ReviewFormHeaderV2ComposableKt$ReviewFormHeaderV2Composable$2$1$1$2$1(view, function12);
            interfaceC3967k.x(C11);
        }
        interfaceC3967k.k();
        ReviewFormRatingComposableKt.SafeRatingWrapper(null, rating, (Function1) C11, interfaceC3967k, RatingDTO.$stable << 3, 1);
        interfaceC3967k.f();
    }
}
