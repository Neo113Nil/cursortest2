package zendesk.talk.android.internal.call.setup;

import Dj.k;
import Dj.l;
import Dj.n;
import Ej.s;
import Mj.o;
import Oj.i;
import Ph.P;
import Qj.g;
import Xj.j;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractActivityC2168s;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC2194t;
import androidx.lifecycle.U;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.InterfaceC5321f;
import kotlinx.coroutines.flow.InterfaceC5322g;
import zendesk.talk.android.internal.call.setup.TalkCallSetupViewModel;
import zendesk.talk.android.internal.call.setup.c;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 H2\u00020\u0001:\u0001IB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u0003J+\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00122\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\u00182\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0006H\u0002¢\u0006\u0004\b'\u0010\u0003J\u000f\u0010(\u001a\u00020\u0006H\u0002¢\u0006\u0004\b(\u0010\u0003J\u000f\u0010)\u001a\u00020\u0006H\u0002¢\u0006\u0004\b)\u0010\u0003J\u001d\u0010-\u001a\u00020\u00062\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*H\u0002¢\u0006\u0004\b-\u0010.J%\u00103\u001a\u00020\u00062\f\u00101\u001a\b\u0012\u0004\u0012\u0002000/2\u0006\u00102\u001a\u000200H\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0006H\u0002¢\u0006\u0004\b5\u0010\u0003R\"\u0010=\u001a\u0002068\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0016\u0010A\u001a\u00020>8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b?\u0010@R\u001b\u0010G\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F¨\u0006J"}, d2 = {"Lzendesk/talk/android/internal/call/setup/a;", "Lcom/google/android/material/bottomsheet/b;", "<init>", "()V", "Lzendesk/talk/android/internal/call/setup/c;", "state", "", "x0", "(Lzendesk/talk/android/internal/call/setup/c;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/content/DialogInterface;", "dialog", "onCancel", "(Landroid/content/DialogInterface;)V", "Lzendesk/talk/android/internal/call/setup/c$b;", "loaded", "w0", "(Lzendesk/talk/android/internal/call/setup/c$b;)V", "LDj/o;", "recordingConsent", "E0", "(LDj/o;)V", "G0", "I0", "C0", "Lkotlin/Function0;", "Landroidx/fragment/app/Fragment;", "fragment", "A0", "(Lkotlin/jvm/functions/Function0;)V", "", "Lzendesk/talk/android/internal/call/setup/c$b$c;", "steps", "currentStep", "B0", "(Ljava/util/List;Lzendesk/talk/android/internal/call/setup/c$b$c;)V", "t0", "LMj/o;", "n", "LMj/o;", "v0", "()LMj/o;", "setViewModelFactory$talk_android_release", "(LMj/o;)V", "viewModelFactory", "Lcom/google/android/material/tabs/TabLayout;", "o", "Lcom/google/android/material/tabs/TabLayout;", "tabLayout", "Lzendesk/talk/android/internal/call/setup/TalkCallSetupViewModel;", "p", "Lkotlin/Lazy;", "u0", "()Lzendesk/talk/android/internal/call/setup/TalkCallSetupViewModel;", "viewModel", "q", "a", "talk-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTalkCallSetupBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TalkCallSetupBottomSheet.kt\nzendesk/talk/android/internal/call/setup/TalkCallSetupBottomSheet\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,162:1\n1557#2:163\n1628#2,3:164\n1863#2,2:167\n1#3:169\n*S KotlinDebug\n*F\n+ 1 TalkCallSetupBottomSheet.kt\nzendesk/talk/android/internal/call/setup/TalkCallSetupBottomSheet\n*L\n151#1:163\n151#1:164,3\n152#1:167,2\n*E\n"})
/* loaded from: classes5.dex */
public final class a extends com.google.android.material.bottomsheet.b {

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public o viewModelFactory;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public TabLayout tabLayout;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final Lazy viewModel = LazyKt.lazy(new Function0() { // from class: Mj.h
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            TalkCallSetupViewModel K02;
            K02 = zendesk.talk.android.internal.call.setup.a.K0(zendesk.talk.android.internal.call.setup.a.this);
            return K02;
        }
    });

    /* renamed from: zendesk.talk.android.internal.call.setup.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a() {
            return new a();
        }

        public Companion() {
        }
    }

    public static final class b extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f68899n;

        /* renamed from: zendesk.talk.android.internal.call.setup.a$b$a, reason: collision with other inner class name */
        public static final class C1002a implements InterfaceC5322g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a f68901a;

            public C1002a(a aVar) {
                this.f68901a = aVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC5322g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(c cVar, Continuation continuation) {
                this.f68901a.x0(cVar);
                return Unit.INSTANCE;
            }
        }

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return a.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((b) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f68899n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC5321f state = a.this.u0().getState();
                C1002a c1002a = new C1002a(a.this);
                this.f68899n = 1;
                if (state.collect(c1002a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final Fragment D0() {
        return Oj.d.INSTANCE.a();
    }

    public static final Fragment F0(Dj.o oVar) {
        return Nj.e.INSTANCE.d(oVar);
    }

    public static final Fragment H0() {
        return g.INSTANCE.a();
    }

    public static final Fragment J0() {
        return i.INSTANCE.a();
    }

    public static final TalkCallSetupViewModel K0(a aVar) {
        AbstractActivityC2168s requireActivity = aVar.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        return (TalkCallSetupViewModel) new U(requireActivity, aVar.v0()).a(TalkCallSetupViewModel.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TalkCallSetupViewModel u0() {
        return (TalkCallSetupViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x0(c state) {
        if (Intrinsics.areEqual(state, c.C1006c.f68907a)) {
            t0();
            A0(new Function0() { // from class: Mj.g
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Fragment y02;
                    y02 = zendesk.talk.android.internal.call.setup.a.y0();
                    return y02;
                }
            });
        } else if (Intrinsics.areEqual(state, c.d.f68908a)) {
            I0();
        } else if (state instanceof c.b) {
            w0((c.b) state);
        }
    }

    public static final Fragment y0() {
        return Pj.a.INSTANCE.a();
    }

    public static final void z0(a aVar, View view) {
        aVar.u0().e();
    }

    public final void A0(Function0 fragment) {
        getChildFragmentManager().s().x(4099).o(k.f2854f, (Fragment) fragment.invoke()).h();
    }

    public final void B0(List steps, c.b.AbstractC1004c currentStep) {
        TabLayout tabLayout;
        Object obj;
        t0();
        if (steps.size() > 1) {
            List list = steps;
            ArrayList<TabLayout.g> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (true) {
                tabLayout = null;
                if (!it.hasNext()) {
                    break;
                }
                c.b.AbstractC1004c abstractC1004c = (c.b.AbstractC1004c) it.next();
                TabLayout tabLayout2 = this.tabLayout;
                if (tabLayout2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tabLayout");
                } else {
                    tabLayout = tabLayout2;
                }
                arrayList.add(tabLayout.C().q(abstractC1004c));
            }
            for (TabLayout.g gVar : arrayList) {
                TabLayout tabLayout3 = this.tabLayout;
                if (tabLayout3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tabLayout");
                    tabLayout3 = null;
                }
                tabLayout3.h(gVar);
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj = it2.next();
                    if (Intrinsics.areEqual(((TabLayout.g) obj).i(), currentStep)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            TabLayout.g gVar2 = (TabLayout.g) obj;
            if (gVar2 != null) {
                TabLayout tabLayout4 = this.tabLayout;
                if (tabLayout4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tabLayout");
                    tabLayout4 = null;
                }
                tabLayout4.I(gVar2);
            }
            TabLayout tabLayout5 = this.tabLayout;
            if (tabLayout5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tabLayout");
            } else {
                tabLayout = tabLayout5;
            }
            j.e(tabLayout);
        }
    }

    public final void C0() {
        A0(new Function0() { // from class: Mj.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Fragment D02;
                D02 = zendesk.talk.android.internal.call.setup.a.D0();
                return D02;
            }
        });
    }

    public final void E0(final Dj.o recordingConsent) {
        A0(new Function0() { // from class: Mj.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Fragment F02;
                F02 = zendesk.talk.android.internal.call.setup.a.F0(Dj.o.this);
                return F02;
            }
        });
    }

    public final void G0() {
        A0(new Function0() { // from class: Mj.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Fragment H02;
                H02 = zendesk.talk.android.internal.call.setup.a.H0();
                return H02;
            }
        });
    }

    public final void I0() {
        A0(new Function0() { // from class: Mj.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Fragment J02;
                J02 = zendesk.talk.android.internal.call.setup.a.J0();
                return J02;
            }
        });
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onCancel(dialog);
        u0().e();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        s.f3210e.b().b().create().b(this);
        super.onCreate(savedInstanceState);
        setStyle(0, n.f2891a);
        AbstractC2194t.a(this).e(new b(null));
    }

    @Override // com.google.android.material.bottomsheet.b, m.s, androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog onCreateDialog = super.onCreateDialog(savedInstanceState);
        Intrinsics.checkNotNull(onCreateDialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        return j.f((com.google.android.material.bottomsheet.a) onCreateDialog, Dj.i.f2836b);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(l.f2869c, container, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        u0().m();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.tabLayout = (TabLayout) view.findViewById(k.f2865q);
        view.findViewById(k.f2859k).setOnClickListener(new View.OnClickListener() { // from class: Mj.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                zendesk.talk.android.internal.call.setup.a.z0(zendesk.talk.android.internal.call.setup.a.this, view2);
            }
        });
    }

    public final void t0() {
        TabLayout tabLayout = this.tabLayout;
        if (tabLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tabLayout");
            tabLayout = null;
        }
        tabLayout.F();
    }

    public final o v0() {
        o oVar = this.viewModelFactory;
        if (oVar != null) {
            return oVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelFactory");
        return null;
    }

    public final void w0(c.b loaded) {
        if (Intrinsics.areEqual(loaded, c.b.C1003b.f68905a)) {
            C0();
            return;
        }
        if (!(loaded instanceof c.b.a)) {
            throw new NoWhenBranchMatchedException();
        }
        c.b.a aVar = (c.b.a) loaded;
        c.b.AbstractC1004c d10 = aVar.d();
        if (Intrinsics.areEqual(d10, c.b.AbstractC1004c.C1005b.f68906a)) {
            G0();
        } else {
            if (!(d10 instanceof c.b.AbstractC1004c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            E0(((c.b.AbstractC1004c.a) aVar.d()).a());
        }
        B0(aVar.c(), aVar.d());
    }
}
