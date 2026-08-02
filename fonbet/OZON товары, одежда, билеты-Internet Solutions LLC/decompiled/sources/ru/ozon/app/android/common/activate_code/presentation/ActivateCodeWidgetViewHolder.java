package ru.ozon.app.android.common.activate_code.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import WZ.t;
import Wc.a;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.textfield.TextInputEditText;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.common.activate_code.ActivateCodeActivated;
import ru.ozon.app.android.common.activate_code.data.ActivateCodeDTO;
import ru.ozon.app.android.common.ui.activate_code.databinding.WidgetActivateCodeBinding;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.marketing.coupon.ActivateCouponActionHandler;
import ru.ozon.app.android.marketing.coupon.utils.CouponUtilsKt;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedBorderlessButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001a\u0010\u000eJ#\u0010\u001e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00022\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\f0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lru/ozon/app/android/common/activate_code/presentation/ActivateCodeWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/common/activate_code/presentation/ActivateCodeVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/marketing/coupon/ActivateCouponActionHandler;", "couponActionHandler", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "<init>", "(Landroid/view/View;Lru/ozon/app/android/marketing/coupon/ActivateCouponActionHandler;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "onCouponApplied", "()V", "item", "bindActivated", "(Lru/ozon/app/android/common/activate_code/presentation/ActivateCodeVO;)V", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "button", "bindLargeButton", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;)V", "Lru/ozon/app/android/common/activate_code/data/ActivateCodeDTO$ActivatedState;", "state", "bindActivatedState", "(Lru/ozon/app/android/common/activate_code/data/ActivateCodeDTO$ActivatedState;)V", "onAttach", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/common/activate_code/presentation/ActivateCodeVO;Ll20/d;)V", "Lru/ozon/app/android/marketing/coupon/ActivateCouponActionHandler;", "Lru/ozon/app/android/composer/ComposerReferences;", "", "couponCode", "Ljava/lang/String;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/common/ui/activate_code/databinding/WidgetActivateCodeBinding;", "binding", "Lru/ozon/app/android/common/ui/activate_code/databinding/WidgetActivateCodeBinding;", "activate-code_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ActivateCodeWidgetViewHolder extends k<ActivateCodeVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetActivateCodeBinding binding;

    @NotNull
    private final ActivateCouponActionHandler couponActionHandler;
    private String couponCode;

    @NotNull
    private final ComposerReferences ref;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivateCodeWidgetViewHolder(@NotNull View containerView, @NotNull ActivateCouponActionHandler couponActionHandler, @NotNull ComposerReferences ref) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(couponActionHandler, "couponActionHandler");
        Intrinsics.checkNotNullParameter(ref, "ref");
        this.couponActionHandler = couponActionHandler;
        this.ref = ref;
        this.actionHandler = new ActionHandler.Builder(ref, this).onComposerAction(new ActivateCodeWidgetViewHolder$actionHandler$1(this)).buildHandler();
        WidgetActivateCodeBinding bind = WidgetActivateCodeBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
    }

    private final void bindActivated(ActivateCodeVO item) {
        Object activatedData = item.getActivatedData();
        if (activatedData instanceof ButtonV3Atom.LargeButton) {
            bindLargeButton((ButtonV3Atom.LargeButton) activatedData);
        } else if (activatedData instanceof ActivateCodeDTO.ActivatedState) {
            bindActivatedState((ActivateCodeDTO.ActivatedState) activatedData);
        }
    }

    private final void bindActivatedState(ActivateCodeDTO.ActivatedState state) {
        WidgetActivateCodeBinding widgetActivateCodeBinding = this.binding;
        ImageView imageView = widgetActivateCodeBinding.iconIv;
        Intrinsics.f(imageView);
        ImageViewExtKt.load$default(imageView, state.getIcon().getImage(), null, null, null, null, false, null, 126, null);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ThemeExtKt.tint(imageView, styleParser.parseColor(context, state.getIcon().getTintColor()));
        ViewExtKt.show(imageView);
        TextAtomView titleTav = widgetActivateCodeBinding.titleTav;
        Intrinsics.checkNotNullExpressionValue(titleTav, "titleTav");
        TextAtomHolderKt.bindOrGone$default(titleTav, state.getTitle(), null, 2, null);
        LargeButtonView activateButton = widgetActivateCodeBinding.activateButton;
        Intrinsics.checkNotNullExpressionValue(activateButton, "activateButton");
        ViewExtKt.gone(activateButton);
        TextInputEditText input = widgetActivateCodeBinding.input;
        Intrinsics.checkNotNullExpressionValue(input, "input");
        ViewExtKt.gone(input);
    }

    private final void bindLargeButton(ButtonV3Atom.LargeButton button) {
        LargeButtonView activateButton = this.binding.activateButton;
        Intrinsics.checkNotNullExpressionValue(activateButton, "activateButton");
        LargeButtonHolderKt.bind(activateButton, button, this.actionHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCouponApplied() {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        InterfaceC7851b controller = this.ref.getController();
        ActivateCodeVO boundedData = getBoundedData();
        controller.update(new ActivateCodeActivated(boundedData != null ? boundedData.getId() : 0L));
        ActivateCodeVO boundedData2 = getBoundedData();
        Object activatedData = boundedData2 != null ? boundedData2.getActivatedData() : null;
        ButtonV3Atom.LargeButton largeButton = activatedData instanceof ButtonV3Atom.LargeButton ? (ButtonV3Atom.LargeButton) activatedData : null;
        if (largeButton == null || (trackingInfo = largeButton.getTrackingInfo()) == null) {
            return;
        }
        ActivateCodeVO boundedData3 = getBoundedData();
        t mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(boundedData3 != null ? boundedData3.getId() : 0L), null, 2, null);
        if (mapToTokenizedEvent$default != null) {
            TokenizedAnalyticsExtensionsKt.processComposerEvents$default(this.ref.getTokenizedAnalytics(), mapToTokenizedEvent$default, null, 2, null);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        final InterfaceC2395h<Set<String>> observeCouponStorage = this.couponActionHandler.observeCouponStorage();
        C2399j.C(new C2408n0(C2399j.o(new InterfaceC2395h<Set<? extends String>>() { // from class: ru.ozon.app.android.common.activate_code.presentation.ActivateCodeWidgetViewHolder$onAttach$$inlined$filter$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.common.activate_code.presentation.ActivateCodeWidgetViewHolder$onAttach$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;
                final /* synthetic */ ActivateCodeWidgetViewHolder this$0;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.common.activate_code.presentation.ActivateCodeWidgetViewHolder$onAttach$$inlined$filter$1$2", f = "ActivateCodeWidgetViewHolder.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.common.activate_code.presentation.ActivateCodeWidgetViewHolder$onAttach$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends c {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= LinearLayoutManager.INVALID_OFFSET;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2397i interfaceC2397i, ActivateCodeWidgetViewHolder activateCodeWidgetViewHolder) {
                    this.$this_unsafeFlow = interfaceC2397i;
                    this.this$0 = activateCodeWidgetViewHolder;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, d dVar) {
                    AnonymousClass1 anonymousClass1;
                    int i11;
                    String str;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = anonymousClass1.result;
                            a aVar = a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                Set set = (Set) obj;
                                Intrinsics.f(set);
                                str = this.this$0.couponCode;
                                if (C7714v.A(set, str)) {
                                    anonymousClass1.label = 1;
                                    if (interfaceC2397i.emit(obj, anonymousClass1) == aVar) {
                                        return aVar;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                s.b(obj2);
                            }
                            return Unit.f71690a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(dVar);
                    Object obj22 = anonymousClass1.result;
                    a aVar2 = a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super Set<? extends String>> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, this), dVar);
                return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }), new ActivateCodeWidgetViewHolder$onAttach$2(this, null)), K.a(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ActivateCodeVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetActivateCodeBinding widgetActivateCodeBinding = this.binding;
        widgetActivateCodeBinding.containerLl.setBackgroundColor(StyleParser.INSTANCE.parseColor(getContext(), item.getBackgroundColor(), StyleParser.OzColor.OZ_SEMANTIC_COLOR_BG_SECONDARY));
        ImageView iconIv = widgetActivateCodeBinding.iconIv;
        Intrinsics.checkNotNullExpressionValue(iconIv, "iconIv");
        ViewExtKt.gone(iconIv);
        TextAtomView titleTav = widgetActivateCodeBinding.titleTav;
        Intrinsics.checkNotNullExpressionValue(titleTav, "titleTav");
        TextAtomHolderKt.bindOrGone$default(titleTav, item.getTitle(), null, 2, null);
        TextInputEditText textInputEditText = widgetActivateCodeBinding.input;
        ActivateCodeDTO.Input input = item.getInput();
        textInputEditText.setText(input != null ? input.getValue() : null);
        ViewExtKt.show(textInputEditText);
        LargeButtonView activateButton = widgetActivateCodeBinding.activateButton;
        Intrinsics.checkNotNullExpressionValue(activateButton, "activateButton");
        LargeButtonHolderKt.bindOrGone(activateButton, item.getActivateButton(), this.actionHandler);
        this.couponCode = CouponUtilsKt.findCouponCode(item.getActivateButton().getAction());
        SmallBorderlessButtonView termsButton = widgetActivateCodeBinding.termsButton;
        Intrinsics.checkNotNullExpressionValue(termsButton, "termsButton");
        WrappedBorderlessButtonHolderKt.bindOrGone(termsButton, item.getTermsButton(), this.actionHandler);
        if (item.getActivated()) {
            bindActivated(item);
        }
    }
}
