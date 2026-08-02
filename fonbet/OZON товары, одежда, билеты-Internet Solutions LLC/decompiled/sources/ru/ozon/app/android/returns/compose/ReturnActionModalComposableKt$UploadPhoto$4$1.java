package ru.ozon.app.android.returns.compose;

import A0.h;
import B0.C2454a;
import B1.V;
import D1.InterfaceC2801g;
import Nk.a;
import S0.A0;
import S0.F1;
import S0.InterfaceC3967k;
import a1.C4912a;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import fd.InterfaceC6511n;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.C7809a0;
import m3.C8060b;
import n0.C8366G;
import ru.ozon.app.android.mediaupload.attachments.AttachmentVO;
import ru.ozon.app.android.returns.ui.data.components.RmsUploadPhotosDto;
import ru.ozon.app.android.uploadPhotos.model.ViewState;
import ru.ozon.pikazon.compose.painter.f;
import ru.ozon.uni.core.R$drawable;
import ru.ozon.uni.core.repository.UniTheme;
import t0.p;
import t0.q;
import v0.G;
import v0.InterfaceC10165e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv0/G;", "", "invoke", "(Lv0/G;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class ReturnActionModalComposableKt$UploadPhoto$4$1 extends AbstractC7737t implements Function1<G, Unit> {
    final /* synthetic */ RmsUploadPhotosDto $component;
    final /* synthetic */ Function1<Integer, Unit> $onPhotoPickerClicked;
    final /* synthetic */ Function1<Long, Unit> $onRemovePhotoClicked;
    final /* synthetic */ Function1<Long, Unit> $onRetryLoadPhotoClick;
    final /* synthetic */ ViewState $photosState;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv0/e;", "", "invoke", "(Lv0/e;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.returns.compose.ReturnActionModalComposableKt$UploadPhoto$4$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6511n<InterfaceC10165e, InterfaceC3967k, Integer, Unit> {
        final /* synthetic */ RmsUploadPhotosDto $component;
        final /* synthetic */ float $itemRoundCorners;
        final /* synthetic */ float $itemSize;
        final /* synthetic */ Function1<Integer, Unit> $onPhotoPickerClicked;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(float f7, float f11, RmsUploadPhotosDto rmsUploadPhotosDto, Function1<? super Integer, Unit> function1) {
            super(3);
            this.$itemSize = f7;
            this.$itemRoundCorners = f11;
            this.$component = rmsUploadPhotosDto;
            this.$onPhotoPickerClicked = function1;
        }

        @Override // fd.InterfaceC6511n
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC10165e interfaceC10165e, InterfaceC3967k interfaceC3967k, Integer num) {
            invoke(interfaceC10165e, interfaceC3967k, num.intValue());
            return Unit.f71690a;
        }

        public final void invoke(InterfaceC10165e item, InterfaceC3967k interfaceC3967k, int i11) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i11 & 17) == 16 && interfaceC3967k.b()) {
                interfaceC3967k.j();
                return;
            }
            e.a aVar = e.f40358c0;
            e n11 = a0.n(aVar, this.$itemSize);
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            e b11 = androidx.compose.foundation.e.b(n11, uniTheme.getColors(interfaceC3967k, i12).getBgSecondary(), h.b(this.$itemRoundCorners));
            interfaceC3967k.o(1253426697);
            Object C11 = interfaceC3967k.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = p.a();
                interfaceC3967k.x(C11);
            }
            q qVar = (q) C11;
            interfaceC3967k.k();
            interfaceC3967k.o(1253430471);
            boolean F11 = interfaceC3967k.F(this.$component) | interfaceC3967k.n(this.$onPhotoPickerClicked);
            RmsUploadPhotosDto rmsUploadPhotosDto = this.$component;
            Function1<Integer, Unit> function1 = this.$onPhotoPickerClicked;
            Object C12 = interfaceC3967k.C();
            if (F11 || C12 == InterfaceC3967k.a.a()) {
                C12 = new ReturnActionModalComposableKt$UploadPhoto$4$1$1$2$1(rmsUploadPhotosDto, function1);
                interfaceC3967k.x(C12);
            }
            interfaceC3967k.k();
            e b12 = i.b(b11, qVar, null, false, null, null, (Function0) C12, 28);
            V f7 = C5185h.f(InterfaceC6250b.a.e(), false);
            int I11 = interfaceC3967k.I();
            A0 d11 = interfaceC3967k.d();
            e f11 = c.f(interfaceC3967k, b12);
            InterfaceC2801g.f5440U.getClass();
            Function0 a11 = InterfaceC2801g.a.a();
            if (interfaceC3967k.v() == null) {
                C8060b.c();
                throw null;
            }
            interfaceC3967k.i();
            if (interfaceC3967k.t()) {
                interfaceC3967k.H(a11);
            } else {
                interfaceC3967k.e();
            }
            Function2 d12 = C2454a.d(interfaceC3967k, f7, interfaceC3967k, d11);
            if (interfaceC3967k.t() || !Intrinsics.d(interfaceC3967k.C(), Integer.valueOf(I11))) {
                a.d(d12, I11, interfaceC3967k, I11);
            }
            F1.b(interfaceC3967k, f11, InterfaceC2801g.a.f());
            C8366G.a(f.a(Integer.valueOf(R$drawable.ic_m_photo_add_filled), null, null, null, interfaceC3967k, 0, 14), "delivery_review_form_upload_photo_btn", a0.n(aVar, 24), null, null, 0.0f, C7809a0.a.a(5, uniTheme.getColors(interfaceC3967k, i12).getGraphicActionPrimary()), interfaceC3967k, 432, 56);
            interfaceC3967k.f();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedImageVO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.returns.compose.ReturnActionModalComposableKt$UploadPhoto$4$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<AttachmentVO.AttachedImageVO, Object> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(AttachmentVO.AttachedImageVO it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Long.valueOf(it.getId());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ReturnActionModalComposableKt$UploadPhoto$4$1(ViewState viewState, RmsUploadPhotosDto rmsUploadPhotosDto, Function1<? super Integer, Unit> function1, Function1<? super Long, Unit> function12, Function1<? super Long, Unit> function13) {
        super(1);
        this.$photosState = viewState;
        this.$component = rmsUploadPhotosDto;
        this.$onPhotoPickerClicked = function1;
        this.$onRetryLoadPhotoClick = function12;
        this.$onRemovePhotoClicked = function13;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(G g10) {
        invoke2(g10);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(G LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        float f7 = 56;
        float f11 = 8;
        ViewState viewState = this.$photosState;
        if (viewState != null && viewState.getIsShowAttachImagesButton()) {
            G.e(LazyRow, null, new C4912a(true, 2072131844, new AnonymousClass1(f7, f11, this.$component, this.$onPhotoPickerClicked)), 3);
        }
        ViewState viewState2 = this.$photosState;
        List<AttachmentVO.AttachedImageVO> attachments = viewState2 != null ? viewState2.getAttachments() : null;
        if (attachments == null) {
            attachments = K.f71697a;
        }
        List<AttachmentVO.AttachedImageVO> list = attachments;
        AnonymousClass2 anonymousClass2 = AnonymousClass2.INSTANCE;
        LazyRow.a(list.size(), anonymousClass2 != null ? new ReturnActionModalComposableKt$UploadPhoto$4$1$invoke$$inlined$items$default$2(anonymousClass2, list) : null, new ReturnActionModalComposableKt$UploadPhoto$4$1$invoke$$inlined$items$default$3(ReturnActionModalComposableKt$UploadPhoto$4$1$invoke$$inlined$items$default$1.INSTANCE, list), new C4912a(true, -632812321, new ReturnActionModalComposableKt$UploadPhoto$4$1$invoke$$inlined$items$default$4(list, f7, f11, this.$onRetryLoadPhotoClick, this.$onRemovePhotoClicked)));
    }
}
