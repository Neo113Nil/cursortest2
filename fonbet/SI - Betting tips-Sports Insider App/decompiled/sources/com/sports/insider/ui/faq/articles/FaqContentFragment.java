package com.sports.insider.ui.faq.articles;

import ag.c;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p0;
import androidx.lifecycle.e0;
import be.a;
import com.google.android.material.textview.MaterialTextView;
import com.sports.insider.R;
import com.sports.insider.ui.views.ToolbarView;
import e.d0;
import ge.d;
import i3.i;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import s.e;
import u6.h;
import vd.b;
import y1.j;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sports/insider/ui/faq/articles/FaqContentFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Lvd/b;", "navArgs", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFaqContentFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaqContentFragment.kt\ncom/sports/insider/ui/faq/articles/FaqContentFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n*L\n1#1,97:1\n42#2,3:98\n*S KotlinDebug\n*F\n+ 1 FaqContentFragment.kt\ncom/sports/insider/ui/faq/articles/FaqContentFragment\n*L\n44#1:98,3\n*E\n"})
/* loaded from: classes.dex */
public final class FaqContentFragment extends Fragment {

    /* renamed from: a, reason: collision with root package name */
    public final d f6909a = new d(this, 14);

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R.layout.screen_text_article, (ViewGroup) null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        d0 onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        e0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.a(viewLifecycleOwner, this.f6909a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f6909a.e();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ToolbarView toolbarView;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        c navArgsClass = Reflection.getOrCreateKotlinClass(b.class);
        i argumentProducer = new i(18, this);
        Intrinsics.checkNotNullParameter(navArgsClass, "navArgsClass");
        Intrinsics.checkNotNullParameter(argumentProducer, "argumentProducer");
        p0 activity = getActivity();
        a aVar = null;
        if (activity != null && (toolbarView = (ToolbarView) activity.findViewById(R.id.toolbarView)) != null) {
            toolbarView.f(getString(R.string.recommendation), null);
        }
        MaterialTextView materialTextView = (MaterialTextView) view.findViewById(R.id.titleText);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.rootArticleContent);
        if (linearLayout != null) {
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
            String a7 = ((b) ((y1.i) invoke)).a();
            if (Intrinsics.areEqual(a7, "vip_access")) {
                aVar = new a(0);
            } else if (Intrinsics.areEqual(a7, "express_prediction")) {
                aVar = new a(1);
            } else if (Intrinsics.areEqual(a7, "premium_prediction")) {
                aVar = new a(8);
            } else if (Intrinsics.areEqual(a7, "how_to_get_a_bonus")) {
                aVar = new a(3);
            } else if (Intrinsics.areEqual(a7, "Responsible")) {
                aVar = new a(9);
            } else if (Intrinsics.areEqual(a7, "how_register_bk")) {
                aVar = new a(6);
            } else if (Intrinsics.areEqual(a7, "how_place_bet")) {
                aVar = new a(5);
            } else if (Intrinsics.areEqual(a7, "subs_live_prediction")) {
                aVar = new a(7);
            } else if (Intrinsics.areEqual(a7, "how_to_pay")) {
                aVar = new a(4);
            } else if (Intrinsics.areEqual(a7, "how_logout_oauth")) {
                aVar = new a(2);
            }
            if (aVar != null) {
                if (materialTextView != null) {
                    materialTextView.setText(aVar.c());
                }
                String str = gc.d.f9945a;
                String c2 = d2.i.c();
                Intrinsics.checkNotNullParameter(c2, "<set-?>");
                aVar.f25251a = c2;
                aVar.a(linearLayout);
            }
        }
    }
}
