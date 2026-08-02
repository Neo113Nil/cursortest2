package fd0;

import Ae.C2406m0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Jb0.u;
import Sc.InterfaceC4003e;
import Sc.InterfaceC4008j;
import Sc.o;
import Sc.s;
import android.content.Context;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.b0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import g.AbstractC6592d;
import g.InterfaceC6590b;
import h.C6762h;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.InterfaceC7732n;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.id.nativeauth.requestPhoneAccess.data.RequestPhoneAccessDTO;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.icon.IconTitleSubtitleCellView;
import ru.ozon.uni.android.cell.icon.data.IconTitleSubtitleWrapperPresets;
import ru.ozon.uni.android.controls.button.ButtonView;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.cell.IconTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonDTO;
import ru.ozon.uni.atoms.data.controls.button.Style;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.html.spans.OzonUrlSpan;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.cell.iconCell.IconTitleSubtitleCellHolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.button.ButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfd0/b;", "Landroidx/fragment/app/m;", "<init>", "()V", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: fd0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6514b extends ComponentCallbacksC5392m {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final y0 f63076a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final AbstractC6592d<String[]> f63077b;

    /* renamed from: fd0.b$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f63078a;

        static {
            int[] iArr = new int[RequestPhoneAccessDTO.a.values().length];
            try {
                iArr[RequestPhoneAccessDTO.a.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RequestPhoneAccessDTO.a.Center.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RequestPhoneAccessDTO.a.Right.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f63078a = iArr;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.requestPhoneAccess.presentation.RequestPhoneAccessFragment$onViewCreated$lambda$4$$inlined$repeatOnStarted$1", f = "RequestPhoneAccessFragment.kt", l = {69}, m = "invokeSuspend")
    /* renamed from: fd0.b$b, reason: collision with other inner class name */
    public static final class C1009b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f63079d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ J f63080e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C6514b f63081f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ u f63082g;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.requestPhoneAccess.presentation.RequestPhoneAccessFragment$onViewCreated$lambda$4$$inlined$repeatOnStarted$1$1", f = "RequestPhoneAccessFragment.kt", l = {}, m = "invokeSuspend")
        /* renamed from: fd0.b$b$a */
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            private /* synthetic */ Object f63083d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C6514b f63084e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ u f63085f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kotlin.coroutines.d dVar, C6514b c6514b, u uVar) {
                super(2, dVar);
                this.f63084e = c6514b;
                this.f63085f = uVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                a aVar = new a(dVar, this.f63084e, this.f63085f);
                aVar.f63083d = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                s.b(obj);
                M m11 = (M) this.f63083d;
                C6514b c6514b = this.f63084e;
                C10727i.c(m11, null, null, new c((C2406m0) C6514b.u(c6514b).r0(), null, c6514b, this.f63085f), 3);
                C10727i.c(m11, null, null, new d(C6514b.u(c6514b).q0(), null, c6514b), 3);
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1009b(J j11, kotlin.coroutines.d dVar, C6514b c6514b, u uVar) {
            super(2, dVar);
            this.f63080e = j11;
            this.f63081f = c6514b;
            this.f63082g = uVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new C1009b(this.f63080e, dVar, this.f63081f, this.f63082g);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C1009b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f63079d;
            if (i11 == 0) {
                s.b(obj);
                AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                a aVar2 = new a(null, this.f63081f, this.f63082g);
                this.f63079d = 1;
                if (C5412d0.b(this.f63080e, bVar, aVar2, this) == aVar) {
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.requestPhoneAccess.presentation.RequestPhoneAccessFragment$onViewCreated$lambda$4$lambda$3$$inlined$collectFlow$1", f = "RequestPhoneAccessFragment.kt", l = {80}, m = "invokeSuspend")
    /* renamed from: fd0.b$c */
    public static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f63086d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C2406m0 f63087e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C6514b f63088f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ u f63089g;

        /* renamed from: fd0.b$c$a */
        public static final class a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C6514b f63090a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ u f63091b;

            public a(C6514b c6514b, u uVar) {
                this.f63090a = c6514b;
                this.f63091b = uVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // Ae.InterfaceC2397i
            public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                u uVar = this.f63091b;
                C6514b.w(this.f63090a, uVar, (RequestPhoneAccessDTO) t2);
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C2406m0 c2406m0, kotlin.coroutines.d dVar, C6514b c6514b, u uVar) {
            super(2, dVar);
            this.f63087e = c2406m0;
            this.f63088f = c6514b;
            this.f63089g = uVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new c(this.f63087e, dVar, this.f63088f, this.f63089g);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f63086d;
            if (i11 == 0) {
                s.b(obj);
                a aVar2 = new a(this.f63088f, this.f63089g);
                this.f63086d = 1;
                if (this.f63087e.collect(aVar2, this) == aVar) {
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.requestPhoneAccess.presentation.RequestPhoneAccessFragment$onViewCreated$lambda$4$lambda$3$$inlined$collectFlow$2", f = "RequestPhoneAccessFragment.kt", l = {80}, m = "invokeSuspend")
    /* renamed from: fd0.b$d */
    public static final class d extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f63092d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f63093e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C6514b f63094f;

        /* renamed from: fd0.b$d$a */
        public static final class a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C6514b f63095a;

            public a(C6514b c6514b) {
                this.f63095a = c6514b;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // Ae.InterfaceC2397i
            public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                this.f63095a.f63077b.a(new String[]{"android.permission.READ_CALL_LOG", "android.permission.READ_PHONE_STATE"});
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, C6514b c6514b) {
            super(2, dVar);
            this.f63093e = interfaceC2395h;
            this.f63094f = c6514b;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new d(this.f63093e, dVar, this.f63094f);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f63092d;
            if (i11 == 0) {
                s.b(obj);
                a aVar2 = new a(this.f63094f);
                this.f63092d = 1;
                if (this.f63093e.collect(aVar2, this) == aVar) {
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

    /* renamed from: fd0.b$e */
    /* synthetic */ class e implements InterfaceC6590b, InterfaceC7732n {
        e() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC6590b) && (obj instanceof InterfaceC7732n)) {
                return Intrinsics.d(getFunctionDelegate(), ((InterfaceC7732n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC7732n
        public final InterfaceC4003e<?> getFunctionDelegate() {
            return new C7735q(1, C6514b.this, C6514b.class, "onRequestPermissionsResult", "onRequestPermissionsResult(Ljava/util/Map;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC6590b
        public final void onActivityResult(Object obj) {
            Map p02 = (Map) obj;
            Intrinsics.checkNotNullParameter(p02, "p0");
            C6514b.v(C6514b.this, p02);
        }
    }

    /* renamed from: fd0.b$f */
    public static final class f extends AbstractC7737t implements Function0<z0.b> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C6514b f63098c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C6514b c6514b) {
            super(0);
            this.f63098c = c6514b;
        }

        @Override // kotlin.jvm.functions.Function0
        public final z0.b invoke() {
            return new fd0.f(C6514b.this, this.f63098c);
        }
    }

    public C6514b() {
        super(R.layout.fragment_request_phone_access);
        f fVar = new f(this);
        InterfaceC4008j a11 = Sc.k.a(Sc.n.NONE, new Bc0.l(new Bc0.k(this)));
        this.f63076a = b0.b(this, N.b(n.class), new Bc0.m(a11), new Bc0.n(a11), fVar);
        AbstractC6592d<String[]> registerForActivityResult = registerForActivityResult(new C6762h(), new e());
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResult(...)");
        this.f63077b = registerForActivityResult;
    }

    public static final n u(C6514b c6514b) {
        return (n) c6514b.f63076a.getValue();
    }

    public static final void v(C6514b c6514b, Map map) {
        n nVar = (n) c6514b.f63076a.getValue();
        Boolean bool = Boolean.FALSE;
        C6513a readCallLog = new C6513a(((Boolean) map.getOrDefault("android.permission.READ_CALL_LOG", bool)).booleanValue(), c6514b.shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG"));
        C6513a readPhoneState = new C6513a(((Boolean) map.getOrDefault("android.permission.READ_PHONE_STATE", bool)).booleanValue(), c6514b.shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE"));
        nVar.getClass();
        Intrinsics.checkNotNullParameter(readCallLog, "readCallLog");
        Intrinsics.checkNotNullParameter(readPhoneState, "readPhoneState");
        td0.f.b(nVar, null, new l(readCallLog, readPhoneState, nVar, null));
    }

    public static final void w(C6514b c6514b, u uVar, RequestPhoneAccessDTO requestPhoneAccessDTO) {
        TextDTO.TextAlignment textAlignment;
        TextAtomV2View titleTextAtomView = uVar.f14556g;
        Intrinsics.checkNotNullExpressionValue(titleTextAtomView, "titleTextAtomView");
        RequestPhoneAccessDTO.TitleDTO title = requestPhoneAccessDTO.getTitle();
        OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(title.getText().getText());
        int i11 = a.f63078a[title.getAlignment().ordinal()];
        if (i11 == 1) {
            textAlignment = TextDTO.TextAlignment.LEADING;
        } else if (i11 == 2) {
            textAlignment = TextDTO.TextAlignment.CENTER;
        } else {
            if (i11 != 3) {
                throw new o();
            }
            textAlignment = TextDTO.TextAlignment.TRAILING;
        }
        TextDTO.TextAlignment textAlignment2 = textAlignment;
        CommonCellSettings.LayoutPadding layoutPadding = CommonCellSettings.LayoutPadding.PADDING_500;
        TextHolderKt.bind$default(titleTextAtomView, new TextDTO(ozonSpannableString, textAlignment2, layoutPadding, layoutPadding, null, null, TextPreset.UI_H1, null, null, Integer.MAX_VALUE, null, null, null, false, null, null, null, null, null, 523696, null), null, 2, null);
        LinearLayout permissionsContainer = uVar.f14552c;
        Intrinsics.checkNotNullExpressionValue(permissionsContainer, "permissionsContainer");
        List<RequestPhoneAccessDTO.PermissionDTO> permissions = requestPhoneAccessDTO.getPermissions();
        List<RequestPhoneAccessDTO.PermissionDTO> list = permissions;
        if (list == null || list.isEmpty()) {
            permissionsContainer.setVisibility(8);
        } else {
            if (permissionsContainer.getChildCount() > 0) {
                permissionsContainer.removeAllViews();
            }
            for (RequestPhoneAccessDTO.PermissionDTO permissionDTO : permissions) {
                CommonCellSettings.LayoutPadding layoutPadding2 = CommonCellSettings.LayoutPadding.PADDING_500;
                IconTitleSubtitleCellDTO iconTitleSubtitleCellDTO = new IconTitleSubtitleCellDTO(null, new CommonCellSettings(layoutPadding2, layoutPadding2, null, null, null, null, null, 12, null), new CommonAtomLabelDTO(OzonSpannableStringKt.toOzonSpannableString(permissionDTO.getText().getText()), null, null, null, null, null, null, false, null, 510, null), null, new IconDTO(null, Boolean.FALSE, null, null, new CommonAtomIconDTO("ic_m_check", UniColors.GRAPHIC_POSITIVE_PRIMARY.getToken()), null, null, null, null, null, null, null, null, null, null, null, 65517, null));
                Context context = permissionsContainer.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                IconTitleSubtitleCellView iconTitleSubtitleCellView = new IconTitleSubtitleCellView(context, null, 0, 0, IconTitleSubtitleWrapperPresets.INSTANCE.getNoShape500TopStart500Default500(), false, 46, null);
                IconTitleSubtitleCellHolderKt.bind$default(iconTitleSubtitleCellView, iconTitleSubtitleCellDTO, null, 2, null);
                permissionsContainer.addView(iconTitleSubtitleCellView);
            }
            permissionsContainer.setVisibility(0);
        }
        ButtonView requestButton = uVar.f14553d;
        Intrinsics.checkNotNullExpressionValue(requestButton, "requestButton");
        RequestPhoneAccessDTO.OzonIdButtonDTO allowButton = requestPhoneAccessDTO.getAllowButton();
        Style style = Style.ACTION_PRIMARY;
        y0 y0Var = c6514b.f63076a;
        x(requestButton, allowButton, style, new fd0.d(0, (n) y0Var.getValue(), n.class, "onRequestButtonClicked", "onRequestButtonClicked()V", 0));
        ButtonView skipButton = uVar.f14555f;
        Intrinsics.checkNotNullExpressionValue(skipButton, "skipButton");
        x(skipButton, requestPhoneAccessDTO.getDisallowButton(), Style.ACTION_SECONDARY, new fd0.e(0, (n) y0Var.getValue(), n.class, "onSkipButtonClicked", "onSkipButtonClicked()V", 0));
        TextAtomV2View helpTextAtomView = uVar.f14551b;
        Intrinsics.checkNotNullExpressionValue(helpTextAtomView, "helpTextAtomView");
        OzonSpannableString configUrlSpans$default = OzonUrlSpan.Companion.configUrlSpans$default(OzonUrlSpan.INSTANCE, requestPhoneAccessDTO.getHelp().getText(), null, Integer.valueOf(helpTextAtomView.getContext().getColor(R.color.text_action)), null, new Pair(helpTextAtomView, new C6515c(c6514b)), 5, null);
        TextDTO.TextAlignment textAlignment3 = TextDTO.TextAlignment.LEADING;
        CommonCellSettings.LayoutPadding layoutPadding3 = CommonCellSettings.LayoutPadding.PADDING_500;
        TextHolderKt.bind$default(helpTextAtomView, new TextDTO(configUrlSpans$default, textAlignment3, layoutPadding3, layoutPadding3, null, null, TextPreset.PARAGRAPH, null, UniColors.TEXT_SECONDARY.getToken(), Integer.MAX_VALUE, null, null, null, true, null, null, null, null, null, 515248, null), null, 2, null);
        LinearLayout requestPhoneAccessContainer = uVar.f14554e;
        Intrinsics.checkNotNullExpressionValue(requestPhoneAccessContainer, "requestPhoneAccessContainer");
        requestPhoneAccessContainer.setVisibility(0);
    }

    private static void x(ButtonView buttonView, RequestPhoneAccessDTO.OzonIdButtonDTO ozonIdButtonDTO, Style style, Function0 function0) {
        ButtonHolderKt.bind$default(buttonView, new ButtonDTO(ButtonDTO.Preset.SIZE_600, style, null, new CommonAtomLabelDTO(ozonIdButtonDTO.getText(), null, null, null, null, null, null, false, null, 510, null), null, null, 20, null), null, 2, null);
        buttonView.setOnClickListener(new Ar.d(function0));
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        u a11 = u.a(view);
        LinearLayout requestPhoneAccessContainer = a11.f14554e;
        Intrinsics.checkNotNullExpressionValue(requestPhoneAccessContainer, "requestPhoneAccessContainer");
        requestPhoneAccessContainer.setVisibility(8);
        a11.f14551b.setMovementMethod(LinkMovementMethod.getInstance());
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner), null, null, new C1009b(viewLifecycleOwner, null, this, a11), 3);
    }
}
