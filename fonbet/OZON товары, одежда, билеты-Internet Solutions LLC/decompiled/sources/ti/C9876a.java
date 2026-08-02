package ti;

import Hi.h;
import Hi.j;
import Sc.InterfaceC4003e;
import Sc.InterfaceC4008j;
import Sc.k;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.W;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.InterfaceC7732n;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import s10.f;
import si.C9699b;
import ui.C10060a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lti/a;", "Lcom/google/android/material/bottomsheet/b;", "<init>", "()V", "ozon-gallery_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: ti.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9876a extends com.google.android.material.bottomsheet.b {

    /* renamed from: a, reason: collision with root package name */
    public f f99546a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f99547b = k.b(new d());

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f99548c = k.b(new b());

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C10060a f99549d = new C10060a(new C2191a(1, this, C9876a.class, "onAlbumSelected", "onAlbumSelected(Lru/ozon/android/gallery/data/OzAlbum;)V", 0));

    /* renamed from: ti.a$a, reason: collision with other inner class name */
    /* synthetic */ class C2191a extends C7735q implements Function1<j, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(j jVar) {
            j p02 = jVar;
            Intrinsics.checkNotNullParameter(p02, "p0");
            C9876a c9876a = (C9876a) this.receiver;
            c9876a.getClass();
            c9876a.getParentFragmentManager().m1(androidx.core.os.d.b(new Pair("album_arg", p02)), "album_request_key");
            c9876a.dismiss();
            return Unit.f71690a;
        }
    }

    /* renamed from: ti.a$b */
    static final class b extends AbstractC7737t implements Function0<Ii.b> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Ii.b invoke() {
            Ii.b a11 = Ii.b.a(C9876a.this.requireView());
            Intrinsics.checkNotNullExpressionValue(a11, "bind(...)");
            return a11;
        }
    }

    /* renamed from: ti.a$c */
    static final class c implements W, InterfaceC7732n {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f99551a;

        c(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f99551a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof W) && (obj instanceof InterfaceC7732n)) {
                return Intrinsics.d(getFunctionDelegate(), ((InterfaceC7732n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC7732n
        @NotNull
        public final InterfaceC4003e<?> getFunctionDelegate() {
            return this.f99551a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.W
        public final /* synthetic */ void onChanged(Object obj) {
            this.f99551a.invoke(obj);
        }
    }

    /* renamed from: ti.a$d */
    static final class d extends AbstractC7737t implements Function0<C9699b> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C9699b invoke() {
            f fVar = C9876a.this.f99546a;
            if (fVar != null) {
                return (C9699b) fVar.get();
            }
            Intrinsics.n("provider");
            throw null;
        }
    }

    public static final C9699b u(C9876a c9876a) {
        Object value = c9876a.f99547b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (C9699b) value;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    public final int getTheme() {
        return R.style.RoundedBottomSheetTheme;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        h hVar;
        super.onCreate(bundle);
        Pi.b.a().a(this);
        Bundle arguments = getArguments();
        if (arguments == null || (hVar = (h) Ei.b.a(arguments, "MEDIA_FILTER_ARG", h.class)) == null) {
            return;
        }
        Object value = this.f99547b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((C9699b) value).h0(hVar);
    }

    @Override // com.google.android.material.bottomsheet.b, androidx.appcompat.app.x, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    @NotNull
    public final Dialog onCreateDialog(Bundle bundle) {
        com.google.android.material.bottomsheet.a aVar = new com.google.android.material.bottomsheet.a(requireContext(), R.style.RoundedBottomSheetTheme);
        aVar.getBehavior().setSkipCollapsed(true);
        aVar.getBehavior().setHideable(true);
        aVar.getBehavior().setState(3);
        return aVar;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final View onCreateView(@NotNull LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R.layout.album_bottom_sheet, viewGroup, false);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        InterfaceC4008j interfaceC4008j = this.f99548c;
        RecyclerView recyclerView = ((Ii.b) interfaceC4008j.getValue()).f12554b;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        recyclerView.setAdapter(this.f99549d);
        IconButtonV3View iconButtonV3View = ((Ii.b) interfaceC4008j.getValue()).f12555c;
        IconButtonV3HolderKt.bind$default(iconButtonV3View, Ti.j.b(false), null, 2, null);
        iconButtonV3View.setOnClickListener(new EX.c(this, 13));
        Object value = this.f99547b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((C9699b) value).getViewState().observe(getViewLifecycleOwner(), new c(new C9877b(this)));
    }
}
