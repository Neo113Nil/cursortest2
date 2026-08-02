package ru.ozon.fintech.features.offline.presentation.pay;

import Ae.x0;
import C.D;
import H30.z;
import L30.k;
import Sc.InterfaceC4008j;
import Sc.n;
import Sc.o;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C;
import androidx.activity.J;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.b0;
import androidx.fragment.app.r;
import androidx.lifecycle.A0;
import androidx.lifecycle.B0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.K;
import androidx.lifecycle.y0;
import b70.C5578f;
import c70.InterfaceC5760b;
import f3.AbstractC6409a;
import i70.C7018a;
import i70.l;
import j70.C7301a;
import j70.C7302b;
import j70.C7303c;
import j70.C7304d;
import j70.InterfaceC7305e;
import j70.g;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.text.h;
import l70.C7892a;
import n70.EnumC8449a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.features.offline.presentation.pay.OfflinePayFragment;
import ru.ozon.fintech.ui.input.InputView;
import ru.ozon.uni.android.input.textinput.ui.OzonTextInput;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import xe.C10727i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/fintech/features/offline/presentation/pay/OfflinePayFragment;", "LE30/c;", "<init>", "()V", "offline_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OfflinePayFragment extends E30.c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final y0 f95672a;

    /* renamed from: b, reason: collision with root package name */
    private C5578f f95673b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private a f95674c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final b f95675d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f95676e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final g f95677f;

    public static final class a extends C {
        a() {
            super(true);
        }

        @Override // androidx.activity.C
        public final void handleOnBackPressed() {
            OfflinePayFragment.this.C().onBackPressed();
        }
    }

    public static final class b implements k.a {
        b() {
        }

        @Override // L30.k.a
        public final void a() {
            OfflinePayFragment offlinePayFragment = OfflinePayFragment.this;
            H30.k.a(new d70.f(offlinePayFragment, 1));
            C5578f c5578f = offlinePayFragment.f95673b;
            if (c5578f != null) {
                c5578f.f55609B.setVisibility(8);
            }
        }

        @Override // L30.k.a
        public final void b() {
            C5578f c5578f = OfflinePayFragment.this.f95673b;
            if (c5578f != null) {
                c5578f.f55609B.setVisibility(0);
            }
        }
    }

    public static final class c extends AbstractC7737t implements Function0<ComponentCallbacksC5392m> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ComponentCallbacksC5392m invoke() {
            return OfflinePayFragment.this;
        }
    }

    public static final class d extends AbstractC7737t implements Function0<B0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f95681b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c cVar) {
            super(0);
            this.f95681b = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            return (B0) this.f95681b.invoke();
        }
    }

    public static final class e extends AbstractC7737t implements Function0<A0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f95682b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f95682b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return ((B0) this.f95682b.getValue()).getViewModelStore();
        }
    }

    public static final class f extends AbstractC7737t implements Function0<AbstractC6409a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f95683b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f95683b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            B0 b02 = (B0) this.f95683b.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return interfaceC5431s != null ? interfaceC5431s.getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b;
        }
    }

    public static final class g implements TextWatcher {

        /* renamed from: a, reason: collision with root package name */
        private boolean f95684a;

        /* renamed from: b, reason: collision with root package name */
        private String f95685b = "";

        g() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            String G02;
            String d11;
            Long y02;
            if (this.f95684a || editable == null) {
                return;
            }
            String obj = editable.toString();
            int i11 = d70.c.f61218c;
            Intrinsics.checkNotNullParameter(obj, "<this>");
            StringBuilder sb2 = new StringBuilder();
            int length = obj.length();
            for (int i12 = 0; i12 < length; i12++) {
                char charAt = obj.charAt(i12);
                if (Character.isDigit(charAt)) {
                    sb2.append(charAt);
                }
            }
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
            if (sb3.length() == 0) {
                G02 = "";
            } else {
                G02 = h.G0(sb3, '0');
                if (G02.length() == 0) {
                    G02 = "0";
                }
            }
            Intrinsics.checkNotNullParameter(G02, "<this>");
            int length2 = G02.length();
            OfflinePayFragment offlinePayFragment = OfflinePayFragment.this;
            if (length2 != 0 && ((y02 = h.y0(G02)) == null || y02.longValue() > 1000000000)) {
                d11 = this.f95685b;
            } else {
                offlinePayFragment.C().y0(G02);
                d11 = d70.c.d(G02);
                this.f95685b = d11;
            }
            if (Intrinsics.d(d11, editable.toString())) {
                return;
            }
            this.f95684a = true;
            C5578f c5578f = offlinePayFragment.f95673b;
            if (c5578f != null) {
                c5578f.f55625l.setInputText(d11);
            }
            this.f95684a = false;
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }
    }

    public OfflinePayFragment() {
        C7018a c7018a = new C7018a(this, 0);
        InterfaceC4008j a11 = Sc.k.a(n.NONE, new d(new c()));
        this.f95672a = b0.b(this, N.b(l.class), new e(a11), new f(a11), c7018a);
        this.f95674c = new a();
        this.f95675d = new b();
        this.f95676e = "OfflinePayFragment";
        this.f95677f = new g();
    }

    public static final void B(OfflinePayFragment offlinePayFragment, j70.g gVar) {
        if (gVar instanceof g.b) {
            g.b bVar = (g.b) gVar;
            C5578f c5578f = offlinePayFragment.f95673b;
            if (c5578f != null) {
                c5578f.f55611D.bindState(bVar.c());
            }
            C5578f c5578f2 = offlinePayFragment.f95673b;
            if (c5578f2 != null) {
                c5578f2.f55626m.bindState(bVar.a());
            }
            C5578f c5578f3 = offlinePayFragment.f95673b;
            if (c5578f3 != null) {
                c5578f3.f55632s.bindState(bVar.b());
            }
            C5578f c5578f4 = offlinePayFragment.f95673b;
            if (c5578f4 != null) {
                c5578f4.f55615b.setText(d70.c.h(bVar.e().a()));
            }
            C5578f c5578f5 = offlinePayFragment.f95673b;
            if (c5578f5 != null) {
                c5578f5.f55616c.setText(bVar.e().b());
            }
            C5578f c5578f6 = offlinePayFragment.f95673b;
            if (c5578f6 != null) {
                c5578f6.f55627n.setText(bVar.e().f());
            }
            C5578f c5578f7 = offlinePayFragment.f95673b;
            if (c5578f7 != null) {
                com.bumptech.glide.c.m(offlinePayFragment).load(bVar.e().c() != null ? new File(bVar.e().c()) : Integer.valueOf(R.drawable.ic_m_bank)).into(c5578f7.f55619f);
            }
            String h11 = d70.c.h(bVar.e().e());
            String h12 = d70.c.h(bVar.e().d());
            String b11 = bVar.e().b();
            String string = offlinePayFragment.getString(R.string.transfer_amount_range, h11, h12, "₽");
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            C5578f c5578f8 = offlinePayFragment.f95673b;
            if (c5578f8 != null) {
                c5578f8.f55625l.setLabel(string);
            }
            InterfaceC7305e d11 = bVar.d();
            if ((d11 instanceof InterfaceC7305e.a) || Intrinsics.d(d11, InterfaceC7305e.b.f69487a)) {
                C5578f c5578f9 = offlinePayFragment.f95673b;
                if (c5578f9 != null) {
                    c5578f9.f55625l.setStatus(InputView.Status.NEUTRAL);
                }
                C5578f c5578f10 = offlinePayFragment.f95673b;
                if (c5578f10 != null) {
                    c5578f10.f55625l.setCaption(offlinePayFragment.getString(R.string.no_commission));
                }
                C5578f c5578f11 = offlinePayFragment.f95673b;
                if (c5578f11 != null) {
                    c5578f11.f55625l.setCaptionColor(Integer.valueOf(androidx.core.content.a.getColor(offlinePayFragment.requireActivity(), R.color.text_secondary)));
                }
            } else if (d11 instanceof C7301a) {
                C5578f c5578f12 = offlinePayFragment.f95673b;
                if (c5578f12 != null) {
                    c5578f12.f55625l.setStatus(InputView.Status.ERROR);
                }
                C5578f c5578f13 = offlinePayFragment.f95673b;
                if (c5578f13 != null) {
                    c5578f13.f55625l.setCaption(offlinePayFragment.getString(R.string.transfer_amount_exceeds_balance_error, b11));
                }
                C5578f c5578f14 = offlinePayFragment.f95673b;
                if (c5578f14 != null) {
                    c5578f14.f55625l.setCaptionColor(Integer.valueOf(androidx.core.content.a.getColor(offlinePayFragment.requireActivity(), R.color.text_negative)));
                }
            } else if (d11 instanceof C7302b) {
                C5578f c5578f15 = offlinePayFragment.f95673b;
                if (c5578f15 != null) {
                    c5578f15.f55625l.setStatus(InputView.Status.ERROR);
                }
                C5578f c5578f16 = offlinePayFragment.f95673b;
                if (c5578f16 != null) {
                    c5578f16.f55625l.setCaption(offlinePayFragment.getString(R.string.transfer_amount_exceeds_max_amount_error, h12, "₽"));
                }
                C5578f c5578f17 = offlinePayFragment.f95673b;
                if (c5578f17 != null) {
                    c5578f17.f55625l.setCaptionColor(Integer.valueOf(androidx.core.content.a.getColor(offlinePayFragment.requireActivity(), R.color.text_negative)));
                }
            } else if (d11 instanceof C7303c) {
                C5578f c5578f18 = offlinePayFragment.f95673b;
                if (c5578f18 != null) {
                    c5578f18.f55625l.setStatus(InputView.Status.ERROR);
                }
                C5578f c5578f19 = offlinePayFragment.f95673b;
                if (c5578f19 != null) {
                    c5578f19.f55625l.setCaption(offlinePayFragment.getString(R.string.transfer_amount_less_than_min_amount_error, h11, "₽"));
                }
                C5578f c5578f20 = offlinePayFragment.f95673b;
                if (c5578f20 != null) {
                    c5578f20.f55625l.setCaptionColor(Integer.valueOf(androidx.core.content.a.getColor(offlinePayFragment.requireActivity(), R.color.text_negative)));
                }
            } else {
                if (!(d11 instanceof C7304d)) {
                    throw new o();
                }
                C5578f c5578f21 = offlinePayFragment.f95673b;
                if (c5578f21 != null) {
                    c5578f21.f55625l.setStatus(InputView.Status.ERROR);
                }
                C5578f c5578f22 = offlinePayFragment.f95673b;
                if (c5578f22 != null) {
                    c5578f22.f55625l.setCaption(offlinePayFragment.getString(R.string.empty_transfer_amount_error));
                }
                C5578f c5578f23 = offlinePayFragment.f95673b;
                if (c5578f23 != null) {
                    c5578f23.f55625l.setCaptionColor(Integer.valueOf(androidx.core.content.a.getColor(offlinePayFragment.requireActivity(), R.color.text_negative)));
                }
            }
            C5578f c5578f24 = offlinePayFragment.f95673b;
            if (c5578f24 != null) {
                c5578f24.f55634u.setText(d70.c.h(bVar.e().h()));
            }
            C5578f c5578f25 = offlinePayFragment.f95673b;
            if (c5578f25 != null) {
                c5578f25.f55629p.setText(d70.c.h(bVar.e().g()));
            }
            C5578f c5578f26 = offlinePayFragment.f95673b;
            if (c5578f26 != null) {
                c5578f26.f55630q.bindState(bVar.f());
            }
            C5578f c5578f27 = offlinePayFragment.f95673b;
            if (c5578f27 != null) {
                c5578f27.f55635v.bindState(bVar.g());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l C() {
        return (l) this.f95672a.getValue();
    }

    public static Unit t(OfflinePayFragment offlinePayFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        offlinePayFragment.C().E0(EnumC8449a.CONNECTED_SMS_STATUS, null);
        return Unit.f71690a;
    }

    public static Unit u(OfflinePayFragment offlinePayFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        offlinePayFragment.C().onBackPressed();
        return Unit.f71690a;
    }

    public static Unit v(OfflinePayFragment offlinePayFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        offlinePayFragment.C().E0(EnumC8449a.STATUS_TRANSFER_PREMIUM, null);
        return Unit.f71690a;
    }

    public static Unit w(OfflinePayFragment offlinePayFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        offlinePayFragment.C().E0(EnumC8449a.TARIFF_AND_LIMITS, null);
        return Unit.f71690a;
    }

    public static Unit x(OfflinePayFragment offlinePayFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        offlinePayFragment.C().v0();
        return Unit.f71690a;
    }

    public static void y(OfflinePayFragment offlinePayFragment) {
        C5578f c5578f = offlinePayFragment.f95673b;
        AppCompatTextView appCompatTextView = c5578f != null ? c5578f.f55615b : null;
        View view = c5578f != null ? c5578f.f55612E : null;
        if (appCompatTextView == null || view == null) {
            return;
        }
        int[] iArr = new int[2];
        appCompatTextView.getLocationOnScreen(iArr);
        int i11 = iArr[1];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        offlinePayFragment.C().D0(((appCompatTextView.getHeight() + i11) - D.d(10)) - (view.getHeight() + iArr2[1]) > 0);
    }

    @Override // E30.c
    @NotNull
    /* renamed from: getFragmentName, reason: from getter */
    public final String getF61282c() {
        return this.f95676e;
    }

    @Override // E30.c
    /* renamed from: isNeedSendOnCreateAnalytic */
    public final boolean getIsNeedSendOnCreateAnalytic() {
        return false;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ((InterfaceC5760b) O30.a.a(O30.c.a(requireActivity)).a(U60.a.class)).t1(this);
        super.onAttach(context);
    }

    @Override // E30.c, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            C().x0(getUniqueUuid(), arguments.getString("BANK_ID_ARG"), (C7892a) arguments.getParcelable("CONTACT_ARG"));
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        C5578f b11 = C5578f.b(inflater, viewGroup);
        this.f95673b = b11;
        ConstraintLayout a11 = b11.a();
        Intrinsics.checkNotNullExpressionValue(a11, "getRoot(...)");
        return a11;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroy() {
        super.onDestroy();
        C().onDestroy();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroyView() {
        super.onDestroyView();
        this.f95674c.remove();
        int i11 = k.f16511d;
        k.d(this.f95675d);
        this.f95673b = null;
    }

    @Override // E30.c, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        OzonTextInput inputTextView;
        int i11 = 0;
        int i12 = 1;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        J onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        androidx.lifecycle.J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.h(viewLifecycleOwner, this.f95674c);
        x0<j70.g> w02 = C().w0();
        androidx.lifecycle.J viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner2), null, null, new i70.f(this, w02, null, this), 3);
        C5578f c5578f = this.f95673b;
        if (c5578f != null) {
            c5578f.f55625l.setInputMode(InputView.InputMode.NUMERIC);
        }
        C5578f c5578f2 = this.f95673b;
        if (c5578f2 != null) {
            c5578f2.f55625l.setLabelPosition(InputView.LabelPosition.INSIDE);
        }
        C5578f c5578f3 = this.f95673b;
        if (c5578f3 != null && (inputTextView = c5578f3.f55625l.getInputTextView()) != null) {
            inputTextView.addTextChangedListener(this.f95677f);
        }
        C5578f c5578f4 = this.f95673b;
        if (c5578f4 != null) {
            ViewExtKt.setOnClickListenerThrottle$default(c5578f4.f55628o, 0L, new i70.c(this, i11), 1, null);
        }
        C5578f c5578f5 = this.f95673b;
        if (c5578f5 != null) {
            ViewExtKt.setOnClickListenerThrottle$default(c5578f5.f55608A, 0L, new I90.d(this, i12), 1, null);
        }
        C5578f c5578f6 = this.f95673b;
        if (c5578f6 != null) {
            ViewExtKt.setOnClickListenerThrottle$default(c5578f6.f55631r, 0L, new I90.e(this, i12), 1, null);
        }
        C5578f c5578f7 = this.f95673b;
        if (c5578f7 != null) {
            ViewExtKt.setOnClickListenerThrottle$default(c5578f7.f55624k, 0L, new ha.d(this, i12), 1, null);
        }
        C5578f c5578f8 = this.f95673b;
        if (c5578f8 != null) {
            ViewExtKt.setOnClickListenerThrottle$default(c5578f8.f55622i, 0L, new i70.d(this, i11), 1, null);
        }
        C5578f c5578f9 = this.f95673b;
        if (c5578f9 != null) {
            z.d(c5578f9.f55624k, R.color.layer_floor_1, Float.valueOf(24.0f), 60);
        }
        C5578f c5578f10 = this.f95673b;
        if (c5578f10 != null) {
            z.d(c5578f10.f55608A, R.color.layer_floor_1, null, 124);
        }
        C5578f c5578f11 = this.f95673b;
        if (c5578f11 != null) {
            z.d(c5578f11.f55631r, R.color.bg_primary, Float.valueOf(16.0f), 60);
        }
        C5578f c5578f12 = this.f95673b;
        if (c5578f12 != null) {
            z.d(c5578f12.f55628o, R.color.bg_secondary, Float.valueOf(6.0f), 60);
        }
        C5578f c5578f13 = this.f95673b;
        if (c5578f13 != null) {
            c5578f13.f55633t.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: i70.b
                @Override // android.view.View.OnScrollChangeListener
                public final void onScrollChange(View view2, int i13, int i14, int i15, int i16) {
                    OfflinePayFragment.y(OfflinePayFragment.this);
                }
            });
        }
        int i13 = k.f16511d;
        k.a(this.f95675d);
        C().z0();
    }
}
