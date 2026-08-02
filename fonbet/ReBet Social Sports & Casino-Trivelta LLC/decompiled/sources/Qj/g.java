package Qj;

import Dj.k;
import Dj.l;
import Ej.s;
import Mj.o;
import X9.m;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractActivityC2168s;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.U;
import com.google.android.material.button.MaterialButton;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import zendesk.talk.android.internal.call.setup.TalkCallSetupViewModel;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u001a\u001a\u00020\u00138\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"LQj/g;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "LMj/o;", m.f13664a, "LMj/o;", "h0", "()LMj/o;", "setViewModelFactory$talk_android_release", "(LMj/o;)V", "viewModelFactory", "Lzendesk/talk/android/internal/call/setup/TalkCallSetupViewModel;", "n", "Lkotlin/Lazy;", "g0", "()Lzendesk/talk/android/internal/call/setup/TalkCallSetupViewModel;", "viewModel", "o", "a", "talk-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g extends Fragment {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public o viewModelFactory;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final Lazy viewModel = LazyKt.lazy(new Function0() { // from class: Qj.d
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            TalkCallSetupViewModel l02;
            l02 = g.l0(g.this);
            return l02;
        }
    });

    /* renamed from: Qj.g$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g a() {
            return new g();
        }

        public Companion() {
        }
    }

    private final TalkCallSetupViewModel g0() {
        return (TalkCallSetupViewModel) this.viewModel.getValue();
    }

    public static final void j0(g gVar, View view) {
        gVar.g0().e();
    }

    public static final void k0(g gVar, View view) {
        gVar.g0().o();
    }

    public static final TalkCallSetupViewModel l0(g gVar) {
        AbstractActivityC2168s requireActivity = gVar.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        return (TalkCallSetupViewModel) new U(requireActivity, gVar.h0()).a(TalkCallSetupViewModel.class);
    }

    public final o h0() {
        o oVar = this.viewModelFactory;
        if (oVar != null) {
            return oVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelFactory");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        s.f3210e.b().b().create().c(this);
        super.onCreate(savedInstanceState);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(l.f2873g, container, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        view.findViewById(k.f2858j).setOnClickListener(new View.OnClickListener() { // from class: Qj.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                g.j0(g.this, view2);
            }
        });
        ((MaterialButton) view.findViewById(k.f2851c)).setOnClickListener(new View.OnClickListener() { // from class: Qj.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                g.k0(g.this, view2);
            }
        });
    }
}
