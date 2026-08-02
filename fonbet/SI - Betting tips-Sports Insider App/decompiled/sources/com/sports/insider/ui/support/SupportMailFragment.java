package com.sports.insider.ui.support;

import ag.c;
import android.os.Build;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.Scroller;
import androidx.fragment.app.Fragment;
import cd.d;
import com.sports.insider.R;
import gf.k;
import gf.t;
import i3.i;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import md.a;
import pd.v;
import s.e;
import te.d0;
import te.e0;
import u6.h;
import y1.j;
import y1.r;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sports/insider/ui/support/SupportMailFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "Lte/e0;", "safeArgs", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSupportMailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupportMailFragment.kt\ncom/sports/insider/ui/support/SupportMailFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n*L\n1#1,101:1\n42#2,3:102\n*S KotlinDebug\n*F\n+ 1 SupportMailFragment.kt\ncom/sports/insider/ui/support/SupportMailFragment\n*L\n42#1:102,3\n*E\n"})
/* loaded from: classes.dex */
public final class SupportMailFragment extends Fragment implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public int f7060a;

    /* renamed from: b, reason: collision with root package name */
    public r f7061b;

    /* renamed from: c, reason: collision with root package name */
    public final t f7062c;

    public SupportMailFragment() {
        super(R.layout.support_mail_fragment);
        this.f7060a = -1;
        this.f7062c = k.b(new v(12));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v5) {
        View view;
        EditText editText;
        r rVar;
        EditText editText2;
        Intrinsics.checkNotNullParameter(v5, "v");
        int id2 = v5.getId();
        if (id2 != R.id.supportOkButton) {
            if (id2 != R.id.fast_ask_tittle || (view = getView()) == null || (editText = (EditText) view.findViewById(R.id.supportInputField)) == null) {
                return;
            }
            editText.clearFocus();
            return;
        }
        new d().f(null, null, null);
        a aVar = (a) this.f7062c.getValue();
        WeakReference weakReference = new WeakReference(requireContext());
        View view2 = getView();
        String valueOf = String.valueOf((view2 == null || (editText2 = (EditText) view2.findViewById(R.id.supportInputField)) == null) ? null : editText2.getText());
        Integer valueOf2 = Integer.valueOf(this.f7060a);
        aVar.getClass();
        boolean a7 = a.a(weakReference, valueOf, valueOf2, null);
        if (a7) {
            new d().h();
        }
        if (!a7 || (rVar = this.f7061b) == null) {
            return;
        }
        rVar.e();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requireActivity().getWindow().setSoftInputMode(Build.VERSION.SDK_INT <= 29 ? 18 : 2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        EditText editText;
        FrameLayout frameLayout;
        Button button;
        super.onStart();
        View view = getView();
        if (view != null && (button = (Button) view.findViewById(R.id.supportOkButton)) != null) {
            button.setOnClickListener(this);
        }
        View view2 = getView();
        if (view2 != null && (frameLayout = (FrameLayout) view2.findViewById(R.id.fast_ask_tittle)) != null) {
            frameLayout.setOnClickListener(this);
        }
        View view3 = getView();
        if (view3 == null || (editText = (EditText) view3.findViewById(R.id.supportInputField)) == null) {
            return;
        }
        editText.setOnTouchListener(new d0());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        EditText editText;
        FrameLayout frameLayout;
        Button button;
        super.onStop();
        View view = getView();
        if (view != null && (button = (Button) view.findViewById(R.id.supportOkButton)) != null) {
            button.setOnClickListener(null);
        }
        View view2 = getView();
        if (view2 != null && (frameLayout = (FrameLayout) view2.findViewById(R.id.fast_ask_tittle)) != null) {
            frameLayout.setOnClickListener(null);
        }
        View view3 = getView();
        if (view3 == null || (editText = (EditText) view3.findViewById(R.id.supportInputField)) == null) {
            return;
        }
        editText.setOnTouchListener(null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f7061b = a.a.r(this);
        c navArgsClass = Reflection.getOrCreateKotlinClass(e0.class);
        i argumentProducer = new i(15, this);
        Intrinsics.checkNotNullParameter(navArgsClass, "navArgsClass");
        Intrinsics.checkNotNullParameter(argumentProducer, "argumentProducer");
        Bundle bundle2 = (Bundle) argumentProducer.invoke();
        e eVar = j.f25572b;
        Method method = (Method) eVar.get(navArgsClass);
        if (method == null) {
            method = h.k(navArgsClass).getMethod("fromBundle", (Class[]) Arrays.copyOf(j.f25571a, 1));
            eVar.put(navArgsClass, method);
            Intrinsics.checkNotNullExpressionValue(method, "also(...)");
        }
        Object invoke = method.invoke(null, bundle2);
        Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type Args of androidx.navigation.NavArgsLazy");
        this.f7060a = ((e0) ((y1.i) invoke)).a();
        EditText editText = (EditText) view.findViewById(R.id.supportInputField);
        if (editText != null) {
            editText.setScroller(new Scroller(view.getContext()));
            editText.setMovementMethod(new ScrollingMovementMethod());
        }
    }
}
