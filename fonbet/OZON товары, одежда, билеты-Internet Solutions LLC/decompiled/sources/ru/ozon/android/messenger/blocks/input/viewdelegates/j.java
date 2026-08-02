package ru.ozon.android.messenger.blocks.input.viewdelegates;

import Ae.InterfaceC2397i;
import Ae.x0;
import Sc.C4005g;
import Sc.s;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.Window;
import android.widget.ImageView;
import androidx.core.view.Q0;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.input.viewmodel.o;
import ru.ozon.android.messenger.blocks.input.views.PastePlainTextEditText;
import ru.ozon.app.android.messenger.R$attr;
import ru.ozon.app.android.messenger.R$dimen;
import ru.ozon.app.android.messenger.databinding.MViewChatInputBinding;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.core.R$color;
import xe.B0;
import xe.C10727i;
import xe.H0;
import xe.M;

/* loaded from: classes10.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.blocks.input.viewmodel.h f85582a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.core.d f85583b;

    /* renamed from: c, reason: collision with root package name */
    private B0 f85584c;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.blocks.input.viewdelegates.InputControlsViewDelegate$onBind$1", f = "InputControlsViewDelegate.kt", l = {UserVerificationMethods.USER_VERIFY_EYEPRINT}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f85585d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ MViewChatInputBinding f85587f;

        /* renamed from: ru.ozon.android.messenger.blocks.input.viewdelegates.j$a$a, reason: collision with other inner class name */
        static final class C1506a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ j f85588a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ MViewChatInputBinding f85589b;

            C1506a(j jVar, MViewChatInputBinding mViewChatInputBinding) {
                this.f85588a = jVar;
                this.f85589b = mViewChatInputBinding;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                MViewChatInputBinding mViewChatInputBinding = this.f85589b;
                j.c(this.f85588a, mViewChatInputBinding, (o) obj);
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(MViewChatInputBinding mViewChatInputBinding, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f85587f = mViewChatInputBinding;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return j.this.new a(this.f85587f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f85585d;
            if (i11 == 0) {
                s.b(obj);
                j jVar = j.this;
                x0 f91308a = jVar.f85582a.getF91308a();
                C1506a c1506a = new C1506a(jVar, this.f85587f);
                this.f85585d = 1;
                if (f91308a.collect(c1506a, this) == aVar) {
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

    public j(@NotNull ru.ozon.android.messenger.blocks.input.viewmodel.h chatInputViewModel, @NotNull ru.ozon.android.messenger.framework.core.d references) {
        Intrinsics.checkNotNullParameter(chatInputViewModel, "chatInputViewModel");
        Intrinsics.checkNotNullParameter(references, "references");
        this.f85582a = chatInputViewModel;
        this.f85583b = references;
    }

    public static void a(j jVar) {
        jVar.f85582a.B0();
    }

    public static void b(o oVar, j jVar) {
        IconButtonV3DTO e11 = oVar.e();
        if (e11 != null) {
            ru.ozon.android.messenger.framework.navigation.controller.a c11 = jVar.f85583b.c();
            CommonControlSettings common = e11.getCommon();
            c11.m(ru.ozon.android.messenger.framework.analytics.h.a(common != null ? common.getTrackingInfo() : null));
            jVar.f85582a.E0(e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(j jVar, MViewChatInputBinding mViewChatInputBinding, o oVar) {
        int color;
        jVar.getClass();
        if (oVar == null) {
            return;
        }
        boolean m11 = oVar.m();
        mViewChatInputBinding.attachIv.setEnabled(m11);
        mViewChatInputBinding.inputEt.setEnabled(m11);
        Context context = mViewChatInputBinding.getConstraintLayout().getContext();
        int color2 = m11 ? androidx.core.content.a.getColor(context, R$color.text_primary) : androidx.core.content.a.getColor(context, R$color.text_secondary);
        int color3 = m11 ? androidx.core.content.a.getColor(context, R$color.text_secondary) : androidx.core.content.a.getColor(context, R$color.text_tertiary);
        int color4 = m11 ? androidx.core.content.a.getColor(context, R$color.graphic_action_primary) : androidx.core.content.a.getColor(context, R$color.graphic_quaternary);
        ImageView attachIv = mViewChatInputBinding.attachIv;
        Intrinsics.checkNotNullExpressionValue(attachIv, "attachIv");
        ThemeExtKt.tint(attachIv, Integer.valueOf(color4));
        mViewChatInputBinding.sendButtonView.setEnabled(m11);
        mViewChatInputBinding.inputEt.setTextColor(color2);
        mViewChatInputBinding.inputEt.setHintTextColor(color3);
        mViewChatInputBinding.inputEt.a(new g(jVar));
        if (oVar.l().a() || !Intrinsics.d(mViewChatInputBinding.inputEt.getText().toString(), oVar.l().b())) {
            mViewChatInputBinding.inputEt.setText(oVar.l().b());
            PastePlainTextEditText pastePlainTextEditText = mViewChatInputBinding.inputEt;
            pastePlainTextEditText.setSelection(pastePlainTextEditText.getText().length());
            mViewChatInputBinding.inputEt.setHint(oVar.k());
        }
        if (oVar.i()) {
            PastePlainTextEditText inputEt = mViewChatInputBinding.inputEt;
            Intrinsics.checkNotNullExpressionValue(inputEt, "inputEt");
            if (inputEt.isAttachedToWindow()) {
                try {
                    if (mViewChatInputBinding.inputEt.requestFocus()) {
                        Context context2 = mViewChatInputBinding.inputEt.getContext();
                        androidx.appcompat.app.g gVar = context2 instanceof androidx.appcompat.app.g ? (androidx.appcompat.app.g) context2 : null;
                        Window window = gVar != null ? gVar.getWindow() : null;
                        if (window != null) {
                            new Q0(mViewChatInputBinding.inputEt, window).g(8);
                        } else {
                            PastePlainTextEditText inputEt2 = mViewChatInputBinding.inputEt;
                            Intrinsics.checkNotNullExpressionValue(inputEt2, "inputEt");
                            ViewExtKt.showKeyboard(inputEt2);
                        }
                    }
                } catch (Exception unused) {
                }
            } else {
                inputEt.addOnAttachStateChangeListener(new h(inputEt, mViewChatInputBinding));
            }
            jVar.f85582a.w0();
        }
        IconButtonV3DTO e11 = oVar.e();
        if (e11 != null) {
            if (!oVar.o()) {
                e11 = IconButtonV3DTO.copy$default(e11, null, null, null, null, null, "graphicQuaternary", null, null, null, null, null, null, null, null, 16351, null);
            }
            IconButtonV3View sendButtonView = mViewChatInputBinding.sendButtonView;
            Intrinsics.checkNotNullExpressionValue(sendButtonView, "sendButtonView");
            IconButtonV3HolderKt.bind$default(sendButtonView, e11, null, 2, null);
        }
        if (oVar.o()) {
            mViewChatInputBinding.sendButtonView.setOnClickListener(new FV.a(5, oVar, jVar));
        } else {
            mViewChatInputBinding.sendButtonView.setOnClickListener(null);
        }
        ImageView attachIv2 = mViewChatInputBinding.attachIv;
        Intrinsics.checkNotNullExpressionValue(attachIv2, "attachIv");
        boolean n11 = oVar.n();
        if (n11) {
            Context context3 = attachIv2.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            if (ru.ozon.android.messenger.utils.h.b(context3)) {
                color = androidx.core.content.a.getColor(attachIv2.getContext(), R$color.graphic_primary_select);
                ThemeExtKt.tint(attachIv2, Integer.valueOf(color));
                attachIv2.setEnabled(n11);
                Context context4 = mViewChatInputBinding.getConstraintLayout().getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                int themeColor = ThemeExtKt.themeColor(context4, R$attr.layerSurface);
                Context context5 = mViewChatInputBinding.getConstraintLayout().getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                int i11 = !ru.ozon.android.messenger.utils.h.b(context5) ? R$dimen.dimen_32 : R$dimen.dimen_6;
                PastePlainTextEditText pastePlainTextEditText2 = mViewChatInputBinding.inputEt;
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(themeColor);
                Context context6 = mViewChatInputBinding.getConstraintLayout().getContext();
                Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
                Intrinsics.checkNotNullParameter(context6, "<this>");
                gradientDrawable.setCornerRadius(context6.getResources().getDimension(i11));
                pastePlainTextEditText2.setBackground(gradientDrawable);
            }
        }
        if (n11) {
            color = androidx.core.content.a.getColor(attachIv2.getContext(), R$color.graphic_action_primary);
        } else {
            if (!n11) {
                Context context7 = attachIv2.getContext();
                Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
                if (ru.ozon.android.messenger.utils.h.b(context7)) {
                    color = androidx.core.content.a.getColor(attachIv2.getContext(), R$color.graphic_secondary);
                }
            }
            color = androidx.core.content.a.getColor(attachIv2.getContext(), R$color.graphic_quaternary);
        }
        ThemeExtKt.tint(attachIv2, Integer.valueOf(color));
        attachIv2.setEnabled(n11);
        Context context42 = mViewChatInputBinding.getConstraintLayout().getContext();
        Intrinsics.checkNotNullExpressionValue(context42, "getContext(...)");
        int themeColor2 = ThemeExtKt.themeColor(context42, R$attr.layerSurface);
        Context context52 = mViewChatInputBinding.getConstraintLayout().getContext();
        Intrinsics.checkNotNullExpressionValue(context52, "getContext(...)");
        if (!ru.ozon.android.messenger.utils.h.b(context52)) {
        }
        PastePlainTextEditText pastePlainTextEditText22 = mViewChatInputBinding.inputEt;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(themeColor2);
        Context context62 = mViewChatInputBinding.getConstraintLayout().getContext();
        Intrinsics.checkNotNullExpressionValue(context62, "getContext(...)");
        Intrinsics.checkNotNullParameter(context62, "<this>");
        gradientDrawable2.setCornerRadius(context62.getResources().getDimension(i11));
        pastePlainTextEditText22.setBackground(gradientDrawable2);
    }

    public final void e(@NotNull MViewChatInputBinding binding, @NotNull J lifecycleOwner) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        B0 b02 = this.f85584c;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        this.f85584c = C10727i.c(K.a(lifecycleOwner), null, null, new a(binding, null), 3);
    }

    public final void f() {
        B0 b02 = this.f85584c;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        this.f85584c = null;
    }
}
