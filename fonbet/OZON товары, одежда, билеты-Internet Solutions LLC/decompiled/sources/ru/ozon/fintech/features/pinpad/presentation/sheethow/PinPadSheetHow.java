package ru.ozon.fintech.features.pinpad.presentation.sheethow;

import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.b0;
import androidx.fragment.app.r;
import androidx.lifecycle.A0;
import androidx.lifecycle.B0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import f3.AbstractC6409a;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import q50.C8989a;
import ru.ozon.fintech.features.cbottomsheet.presentation.CbottomBottomSheet;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/fintech/features/pinpad/presentation/sheethow/PinPadSheetHow;", "Lru/ozon/fintech/features/cbottomsheet/presentation/CbottomBottomSheet;", "<init>", "()V", "pinpad_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PinPadSheetHow extends CbottomBottomSheet {

    /* renamed from: f, reason: collision with root package name */
    public z0.b f96131f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final y0 f96132g;

    public static final class a extends AbstractC7737t implements Function0<ComponentCallbacksC5392m> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ComponentCallbacksC5392m invoke() {
            return PinPadSheetHow.this;
        }
    }

    public static final class b extends AbstractC7737t implements Function0<B0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f96134b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a aVar) {
            super(0);
            this.f96134b = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            return (B0) this.f96134b.invoke();
        }
    }

    public static final class c extends AbstractC7737t implements Function0<A0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f96135b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f96135b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return ((B0) this.f96135b.getValue()).getViewModelStore();
        }
    }

    public static final class d extends AbstractC7737t implements Function0<AbstractC6409a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f96136b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f96136b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            B0 b02 = (B0) this.f96136b.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return interfaceC5431s != null ? interfaceC5431s.getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b;
        }
    }

    public PinPadSheetHow() {
        R70.a aVar = new R70.a(this, 0);
        InterfaceC4008j a11 = k.a(n.NONE, new b(new a()));
        this.f96132g = b0.b(this, N.b(R70.b.class), new c(a11), new d(a11), aVar);
    }

    @Override // ru.ozon.fintech.features.cbottomsheet.presentation.CbottomBottomSheet
    public final C8989a C() {
        return (R70.b) this.f96132g.getValue();
    }

    @Override // ru.ozon.fintech.base.bottom.m
    @NotNull
    public final z0.b getFactory() {
        z0.b bVar = this.f96131f;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.n("factory");
        throw null;
    }

    @Override // ru.ozon.fintech.features.cbottomsheet.presentation.CbottomBottomSheet, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onAttach(@NotNull Context context) {
        String string;
        Intrinsics.checkNotNullParameter(context, "context");
        r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ((N70.b) O30.a.a(O30.c.a(requireActivity)).a(N70.b.class)).x(this);
        super.onAttach(context);
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("PARAMETER_PLACEHOLDERS_VALUE") : null;
        Map<String, String> map = serializable instanceof Map ? (Map) serializable : null;
        Bundle arguments2 = getArguments();
        String str = "SHEET_1";
        if (arguments2 != null && (string = arguments2.getString("PARAMETER_CBOTTOM_TYPE", "SHEET_1")) != null) {
            str = string;
        }
        ((R70.b) this.f96132g.getValue()).w0(S70.a.valueOf(str), map);
    }

    @Override // ru.ozon.fintech.base.bottom.m
    public final void setFactory(@NotNull z0.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.f96131f = bVar;
    }
}
