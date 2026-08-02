package pe;

import Zf.h;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.core.view.AbstractC2109r0;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zoho.livechat.android.modules.core.domain.entities.Channel;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.P;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import od.AbstractC5886l;
import od.r;
import od.u;
import og.AbstractC5892d;
import og.p;
import pe.c;
import ud.k;

/* loaded from: classes4.dex */
public final class c extends com.google.android.material.bottomsheet.b {

    /* renamed from: n, reason: collision with root package name */
    public Function2 f63180n;

    /* renamed from: o, reason: collision with root package name */
    public final Lazy f63181o;

    /* renamed from: p, reason: collision with root package name */
    public k f63182p;

    /* renamed from: q, reason: collision with root package name */
    public List f63183q;

    /* renamed from: r, reason: collision with root package name */
    public Function0 f63184r;

    /* renamed from: s, reason: collision with root package name */
    public Function0 f63185s;

    public static final class a extends Lambda implements Function0 {

        /* renamed from: pe.c$a$a, reason: collision with other inner class name */
        public static final class C0872a extends Lambda implements Function0 {

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ c f63187d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0872a(c cVar) {
                super(0);
                this.f63187d = cVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m1755invoke();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m1755invoke() {
                if (this.f63187d.isAdded()) {
                    this.f63187d.dismiss();
                }
            }
        }

        public a() {
            super(0);
        }

        public static final void c(c this$0, Channel.Department department) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Function2 function2 = this$0.f63180n;
            Intrinsics.checkNotNull(department);
            function2.invoke(department, new C0872a(this$0));
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final h invoke() {
            h hVar = new h();
            final c cVar = c.this;
            hVar.f(new h.b() { // from class: pe.b
                @Override // Zf.h.b
                public final void a(Channel.Department department) {
                    c.a.c(c.this, department);
                }
            });
            return hVar;
        }
    }

    public c(Function2 onSelectItem) {
        Intrinsics.checkNotNullParameter(onSelectItem, "onSelectItem");
        this.f63180n = onSelectItem;
        this.f63181o = LazyKt.lazy(new a());
    }

    public static final void o0(c this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function0 function0 = this$0.f63185s;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m
    public int getTheme() {
        return u.f61158d;
    }

    public final k m0() {
        k kVar = this.f63182p;
        Intrinsics.checkNotNull(kVar);
        return kVar;
    }

    public final h n0() {
        return (h) this.f63181o.getValue();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, u.f61158d);
    }

    @Override // com.google.android.material.bottomsheet.b, m.s, androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        Intrinsics.checkNotNullExpressionValue(onCreateDialog, "onCreateDialog(...)");
        onCreateDialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: pe.a
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                c.o0(c.this, dialogInterface);
            }
        });
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f63182p = k.a(inflater.inflate(r.f60794l, viewGroup, false));
        RecyclerView recyclerView = m0().f66326c;
        recyclerView.setAdapter(n0());
        recyclerView.setLayoutManager(new LinearLayoutManager(m0().b().getContext()));
        View dragger = m0().f66325b;
        Intrinsics.checkNotNullExpressionValue(dragger, "dragger");
        int b10 = og.k.b(4);
        Context context = m0().b().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        p.d(dragger, b10, Integer.valueOf(AbstractC5892d.h(context, Integer.valueOf(AbstractC5886l.f59724H2), 0.0f, 2, null)), 0, null, false, 28, null);
        float b11 = og.k.b(28);
        LinearLayout b12 = m0().b();
        Intrinsics.checkNotNullExpressionValue(b12, "getRoot(...)");
        Context context2 = m0().b().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        p.i(b12, new float[]{b11, b11, b11, b11, 0.0f, 0.0f, 0.0f, 0.0f}, null, Integer.valueOf(AbstractC5892d.h(context2, Integer.valueOf(AbstractC5886l.f59837i), 0.0f, 2, null)), null, null, false, 56, null);
        LinearLayout b13 = m0().b();
        Intrinsics.checkNotNullExpressionValue(b13, "getRoot(...)");
        return b13;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f63182p = null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        Function0 function0 = this.f63184r;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Window window;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Context context = m0().b().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int h10 = AbstractC5892d.h(context, Integer.valueOf(AbstractC5886l.f59837i), 0.0f, 2, null);
        boolean equals = StringsKt.equals(P.j(m0().b().getContext()), "DARK", true);
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setWindowAnimations(u.f61156b);
        window.setNavigationBarColor(h10);
        AbstractC2109r0.a(window, window.getDecorView()).d(!equals);
    }

    public final void p0(List list) {
        this.f63183q = list;
    }

    public final void q0(FragmentManager manager, String str, Function0 function0, Function0 function02) {
        Object m147constructorimpl;
        Intrinsics.checkNotNullParameter(manager, "manager");
        this.f63185s = function0;
        this.f63184r = function02;
        if (isAdded() || this.f63183q == null) {
            return;
        }
        n0().g(this.f63183q);
        try {
            Result.Companion companion = Result.INSTANCE;
            super.show(manager, str);
            m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
            LiveChatUtil.log(m150exceptionOrNullimpl);
        }
    }
}
