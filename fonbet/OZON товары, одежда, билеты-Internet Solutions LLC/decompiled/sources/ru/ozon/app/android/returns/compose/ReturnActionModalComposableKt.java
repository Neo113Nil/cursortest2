package ru.ozon.app.android.returns.compose;

import B0.M0;
import B0.N0;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import K00.b;
import K1.C3422b;
import Q1.X;
import S0.A0;
import S0.C3969l;
import S0.D1;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.Q;
import S0.n1;
import Sc.o;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.Q1;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.atoms.data.gallery.Gallery;
import ru.ozon.app.android.mediaupload.attachments.AttachmentVO;
import ru.ozon.app.android.returns.actionModal.presentation.viewObject.ReturnActionModalVO;
import ru.ozon.app.android.returns.ui.data.components.Component;
import ru.ozon.app.android.returns.ui.data.components.RmsInputDto;
import ru.ozon.app.android.returns.ui.data.components.RmsTextAreaDto;
import ru.ozon.app.android.returns.ui.data.components.RmsUploadPhotosDto;
import ru.ozon.app.android.uploadPhotos.model.ViewState;
import ru.ozon.uni.android.ds.compose.component.button.DsButtonAtomKt;
import ru.ozon.uni.android.ds.compose.component.disclaimer.DsDisclaimerKt;
import ru.ozon.uni.android.ds.compose.component.input.DsInputBaseKt;
import ru.ozon.uni.android.ds.compose.component.input.DsInputLabelPosition;
import ru.ozon.uni.android.ds.compose.component.input.DsInputSize;
import ru.ozon.uni.android.ds.compose.component.input.DsInputState;
import ru.ozon.uni.android.ds.compose.component.input.DsInputStatus;
import ru.ozon.uni.android.ds.compose.component.input.DsInputTheme;
import ru.ozon.uni.android.ds.compose.component.input.DsInputType;
import ru.ozon.uni.android.ds.compose.component.tabs.DsTabsAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.android.ds.compose.html.SpannedAnnotateConvertorKt;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.tabs.TabsDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.models.UniIconToken;
import ru.ozon.uni.core.repository.UniTheme;
import t0.q;
import u0.E;
import v0.C10164d;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aÁ\u0001\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\u000b2 \u0010\u0011\u001a\u001c\u0012\u0004\u0012\u00020\f\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00060\u000b2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u008b\u0001\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\u000b2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001ay\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b\"\u0010#¨\u0006%²\u0006\u000e\u0010$\u001a\u00020\r8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010$\u001a\u00020\r8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lru/ozon/app/android/returns/actionModal/presentation/viewObject/ReturnActionModalVO;", "item", "Lru/ozon/app/android/uploadPhotos/model/ViewState;", "photosState", "Lkotlin/Function1;", "", "", "onPhotoPickerClicked", "", "onRemovePhotoClicked", "onPhotoLimitChanged", "Lkotlin/Function2;", "Lru/ozon/app/android/returns/ui/data/components/Component;", "", "onTextEntered", "", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedImageVO;", "onPhotoUrlsChanged", "onRetryLoadPhotoClick", "LTg/b;", "actionHandler", "ReturnActionModalComposable", "(Lru/ozon/app/android/returns/actionModal/presentation/viewObject/ReturnActionModalVO;Lru/ozon/app/android/uploadPhotos/model/ViewState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "ComponentsItem", "(Lru/ozon/app/android/returns/actionModal/presentation/viewObject/ReturnActionModalVO;Lru/ozon/app/android/uploadPhotos/model/ViewState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "Lru/ozon/app/android/returns/actionModal/presentation/viewObject/ReturnActionModalVO$ActionComponent;", "actionComponent", "Lru/ozon/app/android/returns/ui/data/components/RmsUploadPhotosDto;", "component", "UploadPhoto", "(Lru/ozon/app/android/returns/actionModal/presentation/viewObject/ReturnActionModalVO$ActionComponent;Lru/ozon/app/android/returns/ui/data/components/RmsUploadPhotosDto;Lru/ozon/app/android/uploadPhotos/model/ViewState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "Lru/ozon/app/android/returns/ui/data/components/RmsInputDto$InputType;", "inputType", "LB0/N0;", "getKeyboardOptions", "(Lru/ozon/app/android/returns/ui/data/components/RmsInputDto$InputType;)LB0/N0;", "inputText", "details_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnActionModalComposableKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RmsInputDto.InputType.values().length];
            try {
                iArr[RmsInputDto.InputType.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RmsInputDto.InputType.FILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RmsInputDto.InputType.TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ComponentsItem(ReturnActionModalVO returnActionModalVO, ViewState viewState, Function1<? super Integer, Unit> function1, Function1<? super Long, Unit> function12, Function1<? super Integer, Unit> function13, Function2<? super Component, ? super String, Unit> function2, Function1<? super Long, Unit> function14, InterfaceC3967k interfaceC3967k, int i11) {
        ReturnActionModalVO returnActionModalVO2;
        int i12;
        C3969l c3969l;
        C3969l c3969l2;
        C3969l u11 = interfaceC3967k.u(-845411661);
        if ((i11 & 6) == 0) {
            returnActionModalVO2 = returnActionModalVO;
            i12 = (u11.F(returnActionModalVO2) ? 4 : 2) | i11;
        } else {
            returnActionModalVO2 = returnActionModalVO;
            i12 = i11;
        }
        ViewState viewState2 = viewState;
        if ((i11 & 48) == 0) {
            i12 |= u11.F(viewState2) ? 32 : 16;
        }
        Function1<? super Integer, Unit> function15 = function1;
        if ((i11 & 384) == 0) {
            i12 |= u11.F(function15) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        Function1<? super Long, Unit> function16 = function12;
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(function16) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        Function1<? super Integer, Unit> function17 = function13;
        if ((i11 & 24576) == 0) {
            i12 |= u11.F(function17) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= u11.F(function2) ? 131072 : 65536;
        }
        Function1<? super Long, Unit> function18 = function14;
        if ((1572864 & i11) == 0) {
            i12 |= u11.F(function18) ? 1048576 : 524288;
        }
        if ((599187 & i12) == 599186 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            e.a aVar = e.f40358c0;
            C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, aVar);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 g10 = b.g(u11, a11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, g10);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            List<ReturnActionModalVO.ActionComponent> components = returnActionModalVO2.getComponents();
            u11.o(-1360129597);
            if (components == null) {
                c3969l = u11;
            } else {
                for (ReturnActionModalVO.ActionComponent actionComponent : components) {
                    Component component = actionComponent.getComponent();
                    if (component instanceof RmsUploadPhotosDto) {
                        u11.o(-1850472315);
                        E.a(u11, a0.f(e.f40358c0, 12));
                        C3969l c3969l3 = u11;
                        UploadPhoto(actionComponent, (RmsUploadPhotosDto) actionComponent.getComponent(), viewState2, function15, function16, function17, function18, c3969l3, ((i12 << 3) & 524160) | (3670016 & i12));
                        c3969l2 = c3969l3;
                        c3969l2.k();
                    } else {
                        c3969l2 = u11;
                        if (component instanceof RmsTextAreaDto) {
                            c3969l2.o(-1849839419);
                            Object key = actionComponent.getKey();
                            c3969l2.o(355970138);
                            boolean n11 = c3969l2.n(key);
                            Object C11 = c3969l2.C();
                            if (n11 || C11 == InterfaceC3967k.a.a()) {
                                String value = ((RmsTextAreaDto) actionComponent.getComponent()).getValue();
                                C11 = n1.f(value != null ? value : "", D1.f25195a);
                                c3969l2.x(C11);
                            }
                            InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
                            c3969l2.k();
                            String ComponentsItem$lambda$18$lambda$17$lambda$10 = ComponentsItem$lambda$18$lambda$17$lambda$10(interfaceC3978p0);
                            DsInputStatus dsInputStatus = actionComponent.getShowRequireError() ? DsInputStatus.ERROR : DsInputStatus.NEUTRAL;
                            String obj = actionComponent.getShowRequireError() ? actionComponent.getRequireErrorText().getText().toString() : null;
                            long textNegative = UniTheme.INSTANCE.getColors(c3969l2, UniTheme.$stable).getTextNegative();
                            String placeholder = ((RmsTextAreaDto) actionComponent.getComponent()).getPlaceholder();
                            String placeholder2 = ((RmsTextAreaDto) actionComponent.getComponent()).getPlaceholder();
                            c3969l2.o(355978254);
                            boolean n12 = c3969l2.n(interfaceC3978p0) | ((458752 & i12) == 131072) | c3969l2.F(actionComponent);
                            Object C12 = c3969l2.C();
                            if (n12 || C12 == InterfaceC3967k.a.a()) {
                                C12 = new ReturnActionModalComposableKt$ComponentsItem$1$1$1$1(function2, actionComponent, interfaceC3978p0);
                                c3969l2.x(C12);
                            }
                            c3969l2.k();
                            DsInputBaseKt.m1743DsInputBaseawFkL_c(ComponentsItem$lambda$18$lambda$17$lambda$10, (Function1<? super String, Unit>) C12, (e) null, (DsInputSize) null, (DsInputType) null, (DsInputTheme) null, (DsInputState) null, dsInputStatus, false, placeholder2, (DsInputLabelPosition) null, placeholder, obj, C7807Z.m(textNegative), (UniIconToken) null, (UniIconToken) null, false, false, false, (N0) null, (M0) null, (X) null, (q) null, (Function0<Unit>) null, (Function0<Unit>) null, (Function0<Unit>) null, (Function1<? super DsInputStatus, Unit>) null, (Function1<? super Boolean, Unit>) null, (Function1<? super String, Unit>) null, (InterfaceC3967k) c3969l2, 0, 12582912, 0, 536724860);
                            c3969l2.k();
                        } else {
                            if (!(component instanceof RmsInputDto)) {
                                c3969l2.o(355949177);
                                c3969l2.k();
                                throw new o();
                            }
                            c3969l2.o(-1848806654);
                            Object key2 = actionComponent.getKey();
                            c3969l2.o(356003354);
                            boolean n13 = c3969l2.n(key2);
                            Object C13 = c3969l2.C();
                            if (n13 || C13 == InterfaceC3967k.a.a()) {
                                String value2 = ((RmsInputDto) actionComponent.getComponent()).getValue();
                                C13 = n1.f(value2 != null ? value2 : "", D1.f25195a);
                                c3969l2.x(C13);
                            }
                            InterfaceC3978p0 interfaceC3978p02 = (InterfaceC3978p0) C13;
                            c3969l2.k();
                            String ComponentsItem$lambda$18$lambda$17$lambda$14 = ComponentsItem$lambda$18$lambda$17$lambda$14(interfaceC3978p02);
                            N0 keyboardOptions = getKeyboardOptions(((RmsInputDto) actionComponent.getComponent()).getInputType());
                            DsInputStatus dsInputStatus2 = actionComponent.getShowRequireError() ? DsInputStatus.ERROR : DsInputStatus.NEUTRAL;
                            String obj2 = actionComponent.getShowRequireError() ? actionComponent.getRequireErrorText().getText().toString() : null;
                            long textNegative2 = UniTheme.INSTANCE.getColors(c3969l2, UniTheme.$stable).getTextNegative();
                            String placeholder3 = ((RmsInputDto) actionComponent.getComponent()).getPlaceholder();
                            String placeholder4 = ((RmsInputDto) actionComponent.getComponent()).getPlaceholder();
                            c3969l2.o(356011470);
                            boolean n14 = c3969l2.n(interfaceC3978p02) | ((458752 & i12) == 131072) | c3969l2.F(actionComponent);
                            Object C14 = c3969l2.C();
                            if (n14 || C14 == InterfaceC3967k.a.a()) {
                                C14 = new ReturnActionModalComposableKt$ComponentsItem$1$1$2$1(function2, actionComponent, interfaceC3978p02);
                                c3969l2.x(C14);
                            }
                            c3969l2.k();
                            DsInputBaseKt.m1743DsInputBaseawFkL_c(ComponentsItem$lambda$18$lambda$17$lambda$14, (Function1<? super String, Unit>) C14, (e) null, (DsInputSize) null, (DsInputType) null, (DsInputTheme) null, (DsInputState) null, dsInputStatus2, false, placeholder4, (DsInputLabelPosition) null, placeholder3, obj2, C7807Z.m(textNegative2), (UniIconToken) null, (UniIconToken) null, false, false, false, keyboardOptions, (M0) null, (X) null, (q) null, (Function0<Unit>) null, (Function0<Unit>) null, (Function0<Unit>) null, (Function1<? super DsInputStatus, Unit>) null, (Function1<? super Boolean, Unit>) null, (Function1<? super String, Unit>) null, (InterfaceC3967k) c3969l2, 0, 12582912, 0, 536200572);
                            c3969l2.k();
                        }
                    }
                    E.a(c3969l2, a0.f(e.f40358c0, 8));
                    viewState2 = viewState;
                    function15 = function1;
                    function16 = function12;
                    function17 = function13;
                    u11 = c3969l2;
                    function18 = function14;
                }
                c3969l = u11;
                Unit unit = Unit.f71690a;
            }
            c3969l.k();
            c3969l.f();
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new ReturnActionModalComposableKt$ComponentsItem$2(returnActionModalVO2, viewState, function1, function12, function13, function2, function14, i11));
        }
    }

    private static final String ComponentsItem$lambda$18$lambda$17$lambda$10(InterfaceC3978p0<String> interfaceC3978p0) {
        return interfaceC3978p0.getValue();
    }

    private static final String ComponentsItem$lambda$18$lambda$17$lambda$14(InterfaceC3978p0<String> interfaceC3978p0) {
        return interfaceC3978p0.getValue();
    }

    public static final void ReturnActionModalComposable(@NotNull ReturnActionModalVO item, ViewState viewState, @NotNull Function1<? super Integer, Unit> onPhotoPickerClicked, @NotNull Function1<? super Long, Unit> onRemovePhotoClicked, @NotNull Function1<? super Integer, Unit> onPhotoLimitChanged, @NotNull Function2<? super Component, ? super String, Unit> onTextEntered, @NotNull Function2<? super Component, ? super List<AttachmentVO.AttachedImageVO>, Unit> onPhotoUrlsChanged, @NotNull Function1<? super Long, Unit> onRetryLoadPhotoClick, @NotNull Function1<? super Tg.b, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        float f7;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onPhotoPickerClicked, "onPhotoPickerClicked");
        Intrinsics.checkNotNullParameter(onRemovePhotoClicked, "onRemovePhotoClicked");
        Intrinsics.checkNotNullParameter(onPhotoLimitChanged, "onPhotoLimitChanged");
        Intrinsics.checkNotNullParameter(onTextEntered, "onTextEntered");
        Intrinsics.checkNotNullParameter(onPhotoUrlsChanged, "onPhotoUrlsChanged");
        Intrinsics.checkNotNullParameter(onRetryLoadPhotoClick, "onRetryLoadPhotoClick");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(1676522825);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(item) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(viewState) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(onPhotoPickerClicked) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(onRemovePhotoClicked) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.F(onPhotoLimitChanged) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= u11.F(onTextEntered) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= u11.F(onPhotoUrlsChanged) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= u11.F(onRetryLoadPhotoClick) ? 8388608 : 4194304;
        }
        if ((100663296 & i11) == 0) {
            i12 |= u11.F(actionHandler) ? 67108864 : 33554432;
        }
        int i13 = i12;
        if ((i13 & 38347923) == 38347922 && u11.b()) {
            u11.j();
        } else {
            List<AttachmentVO.AttachedImageVO> attachments = viewState != null ? viewState.getAttachments() : null;
            u11.o(416469108);
            boolean F11 = u11.F(item) | ((i13 & 3670016) == 1048576) | u11.F(viewState);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new ReturnActionModalComposableKt$ReturnActionModalComposable$1$1(item, onPhotoUrlsChanged, viewState, null);
                u11.x(C11);
            }
            u11.k();
            Q.e(u11, attachments, (Function2) C11);
            e.a aVar = e.f40358c0;
            float f11 = 16;
            e h11 = T.h(aVar, f11, 0.0f, 2);
            C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f12 = c.f(u11, h11);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 g10 = b.g(u11, a11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, g10);
            }
            F1.b(u11, f12, InterfaceC2801g.a.f());
            TextDTO title = item.getTitle();
            u11.o(-819579257);
            if (title != null) {
                DsTextAtomKt.DsTextAtom(title, Q1.a(T.j(aVar, 0.0f, 14, 48, 0.0f, 9), "returnActionModalTitle"), u11, 48, 0);
                Unit unit = Unit.f71690a;
            }
            u11.k();
            E.a(u11, a0.f(aVar, 20));
            TabsDTO tabs = item.getTabs();
            u11.o(-819570727);
            if (tabs != null) {
                DsTabsAtomKt.DsTabsAtom(tabs, a0.u(a0.e(aVar, 1.0f), 3), actionHandler, null, u11, TabsDTO.$stable | 48 | ((i13 >> 18) & 896), 8);
                u11 = u11;
                E.a(u11, a0.f(aVar, 12));
                Unit unit2 = Unit.f71690a;
            }
            u11.k();
            u11.o(-819560560);
            if (item.getHint() != null) {
                f7 = 1.0f;
                e e11 = a0.e(aVar, 1.0f);
                DisclaimerAtom.Header header = item.getHint().getHeader();
                OzonSpannableString text = header != null ? header.getText() : null;
                u11.o(-819556071);
                C3422b m1836toAnnotateStringiJQMabo = text == null ? null : SpannedAnnotateConvertorKt.m1836toAnnotateStringiJQMabo(text, 0L, u11, OzonSpannableString.$stable, 1);
                u11.k();
                C3969l c3969l = u11;
                DsDisclaimerKt.DsDisclaimer(e11, m1836toAnnotateStringiJQMabo, SpannedAnnotateConvertorKt.m1836toAnnotateStringiJQMabo(item.getHint().getBody().getText(), 0L, u11, OzonSpannableString.$stable, 1), null, null, null, false, false, item.getHint().getIcon().getImage(), null, null, null, null, c3969l, 6, 0, 7928);
                u11 = c3969l;
                E.a(u11, a0.f(aVar, f11));
            } else {
                f7 = 1.0f;
            }
            u11.k();
            Gallery photos = item.getPhotos();
            u11.o(-819548323);
            if (photos != null) {
                u11.o(-2042759923);
                Object C12 = u11.C();
                if (C12 == InterfaceC3967k.a.a()) {
                    C12 = ReturnActionModalComposableKt$ReturnActionModalComposable$2$3$1$1.INSTANCE;
                    u11.x(C12);
                }
                Function1 function1 = (Function1) C12;
                u11.k();
                u11.o(-2042756782);
                boolean F12 = u11.F(item);
                Object C13 = u11.C();
                if (F12 || C13 == InterfaceC3967k.a.a()) {
                    C13 = new ReturnActionModalComposableKt$ReturnActionModalComposable$2$3$2$1(item);
                    u11.x(C13);
                }
                u11.k();
                androidx.compose.ui.viewinterop.a.a(function1, null, (Function1) C13, u11, 6, 2);
                E.a(u11, a0.f(aVar, 8));
                Unit unit3 = Unit.f71690a;
            }
            u11.k();
            TextDTO subtitle = item.getSubtitle();
            u11.o(-819537763);
            if (subtitle != null) {
                float f13 = 8;
                E.a(u11, a0.f(aVar, f13));
                DsTextAtomKt.DsTextAtom(subtitle, null, u11, 0, 2);
                E.a(u11, a0.f(aVar, f13));
                Unit unit4 = Unit.f71690a;
            }
            u11.k();
            float f14 = f7;
            ComponentsItem(item, viewState, onPhotoPickerClicked, onRemovePhotoClicked, onPhotoLimitChanged, onTextEntered, onRetryLoadPhotoClick, u11, (i13 & 524286) | ((i13 >> 3) & 3670016));
            u11.o(-819520846);
            if (item.getComponents() != null && (!r0.isEmpty())) {
                E.a(u11, a0.f(aVar, 8));
            }
            u11.k();
            int i14 = ((i13 >> 15) & 7168) | 48;
            DsButtonAtomKt.DsButtonAtom(item.getSubmitButton(), Q1.a(a0.e(aVar, f14), "submitLargeButtonView"), false, actionHandler, u11, i14, 4);
            float f15 = 12;
            E.a(u11, a0.f(aVar, f15));
            ButtonV3DTO cancelButton = item.getCancelButton();
            u11.o(-819508746);
            if (cancelButton != null) {
                DsButtonAtomKt.DsButtonAtom(cancelButton, a0.e(aVar, f14), false, actionHandler, u11, i14, 4);
                Unit unit5 = Unit.f71690a;
            }
            u11.k();
            E.a(u11, a0.f(aVar, f15));
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new ReturnActionModalComposableKt$ReturnActionModalComposable$3(item, viewState, onPhotoPickerClicked, onRemovePhotoClicked, onPhotoLimitChanged, onTextEntered, onPhotoUrlsChanged, onRetryLoadPhotoClick, actionHandler, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void UploadPhoto(ReturnActionModalVO.ActionComponent actionComponent, RmsUploadPhotosDto rmsUploadPhotosDto, ViewState viewState, Function1<? super Integer, Unit> function1, Function1<? super Long, Unit> function12, Function1<? super Integer, Unit> function13, Function1<? super Long, Unit> function14, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Function1<? super Integer, Unit> function15;
        Function1<? super Long, Unit> function16;
        Function1<? super Long, Unit> function17;
        C3969l c3969l;
        C3969l u11 = interfaceC3967k.u(-1450817951);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(actionComponent) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(rmsUploadPhotosDto) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(viewState) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            function15 = function1;
            i12 |= u11.F(function15) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        } else {
            function15 = function1;
        }
        if ((i11 & 24576) == 0) {
            function16 = function12;
            i12 |= u11.F(function16) ? 16384 : 8192;
        } else {
            function16 = function12;
        }
        if ((196608 & i11) == 0) {
            i12 |= u11.F(function13) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            function17 = function14;
            i12 |= u11.F(function17) ? 1048576 : 524288;
        } else {
            function17 = function14;
        }
        if ((i12 & 599187) == 599186 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            Integer limit = rmsUploadPhotosDto.getLimit();
            u11.o(2132095102);
            boolean F11 = ((458752 & i12) == 131072) | u11.F(rmsUploadPhotosDto);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new ReturnActionModalComposableKt$UploadPhoto$1$1(function13, rmsUploadPhotosDto, null);
                u11.x(C11);
            }
            u11.k();
            Q.e(u11, limit, (Function2) C11);
            DsTextAtomKt.DsTextAtom(TextDTO.copy$default(actionComponent.getTitle(), null, null, null, null, null, null, null, UniTheme.INSTANCE.getTypographyTokens().getHeadlinePromo400Small().getId(), null, null, null, null, null, false, null, null, null, null, null, 524159, null), null, u11, 0, 2);
            u11.o(2132102157);
            if (actionComponent.getShowRequireError()) {
                DsTextAtomKt.DsTextAtom(actionComponent.getRequireErrorText(), null, u11, 0, 2);
            }
            u11.k();
            e.a aVar = e.f40358c0;
            float f7 = 4;
            E.a(u11, a0.f(aVar, f7));
            TextDTO subtitle = actionComponent.getSubtitle();
            u11.o(2132107911);
            if (subtitle != null) {
                DsTextAtomKt.DsTextAtom(subtitle, null, u11, 0, 2);
                Unit unit = Unit.f71690a;
            }
            u11.k();
            E.a(u11, a0.f(aVar, f7));
            u11.o(2132111526);
            String subtext = rmsUploadPhotosDto.getSubtext();
            TextPreset textPreset = TextPreset.PRESET_CUSTOM;
            OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(subtext);
            TextDTO subtitle2 = actionComponent.getSubtitle();
            String typographyToken = subtitle2 != null ? subtitle2.getTypographyToken() : null;
            TextDTO subtitle3 = actionComponent.getSubtitle();
            DsTextAtomKt.DsTextAtom(new TextDTO(ozonSpannableString, null, null, null, null, null, textPreset, typographyToken, subtitle3 != null ? subtitle3.getTextColor() : null, null, null, null, null, false, null, null, null, null, null, 523838, null), null, u11, 0, 2);
            u11.k();
            E.a(u11, a0.f(aVar, 8));
            u11.o(2132128463);
            boolean F12 = u11.F(viewState) | u11.F(rmsUploadPhotosDto) | ((i12 & 7168) == 2048) | ((3670016 & i12) == 1048576) | ((i12 & 57344) == 16384);
            Object C12 = u11.C();
            if (F12 || C12 == InterfaceC3967k.a.a()) {
                ReturnActionModalComposableKt$UploadPhoto$4$1 returnActionModalComposableKt$UploadPhoto$4$1 = new ReturnActionModalComposableKt$UploadPhoto$4$1(viewState, rmsUploadPhotosDto, function15, function17, function16);
                u11.x(returnActionModalComposableKt$UploadPhoto$4$1);
                C12 = returnActionModalComposableKt$UploadPhoto$4$1;
            }
            u11.k();
            c3969l = u11;
            C10164d.b(null, null, null, null, null, null, false, (Function1) C12, c3969l, 0, 255);
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new ReturnActionModalComposableKt$UploadPhoto$5(actionComponent, rmsUploadPhotosDto, viewState, function1, function12, function13, function14, i11));
        }
    }

    private static final N0 getKeyboardOptions(RmsInputDto.InputType inputType) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[inputType.ordinal()];
        if (i11 == 1) {
            return N0.b(3, 123);
        }
        if (i11 == 2) {
            return N0.b(5, 123);
        }
        if (i11 == 3) {
            return N0.b(1, 122);
        }
        throw new o();
    }
}
