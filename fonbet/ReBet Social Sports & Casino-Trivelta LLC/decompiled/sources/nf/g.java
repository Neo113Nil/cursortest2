package nf;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractActivityC2168s;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.N;
import com.zoho.livechat.android.modules.common.ui.activities.SalesIQActivity;
import com.zoho.livechat.android.utils.LiveChatUtil;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import od.q;
import od.r;
import og.i;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010#\u001a\u0004\u0018\u00010 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0013\u0010%\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b$\u0010\u001eR\u0011\u0010'\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b&\u0010\u0018R\u0011\u0010+\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lnf/g;", "Lbg/f;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/view/MenuItem;", "menuItem", "", "e0", "(Landroid/view/MenuItem;)Z", "f0", "onBackPressed", "()Z", "Lnf/e;", "l0", "()Lnf/e;", "lastArticlesFragment", "n0", "()Ljava/lang/Boolean;", "isArticlesAndCategoriesEmpty", "Landroidx/fragment/app/Fragment;", "m0", "()Landroidx/fragment/app/Fragment;", "lastFragment", "j0", "canShowSearch", "h0", "canEnablePageSwipe", "", "k0", "()Ljava/lang/String;", "currentArticlesPageTitle", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nKnowledgeBaseBaseFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KnowledgeBaseBaseFragment.kt\ncom/zoho/livechat/android/modules/knowledgebase/ui/fragments/KnowledgeBaseBaseFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,79:1\n1#2:80\n543#3,6:81\n543#3,6:87\n*S KotlinDebug\n*F\n+ 1 KnowledgeBaseBaseFragment.kt\ncom/zoho/livechat/android/modules/knowledgebase/ui/fragments/KnowledgeBaseBaseFragment\n*L\n48#1:81,6\n51#1:87,6\n*E\n"})
/* loaded from: classes4.dex */
public final class g extends bg.f {
    public static final void o0(g this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AbstractActivityC2168s activity = this$0.getActivity();
        SalesIQActivity salesIQActivity = activity instanceof SalesIQActivity ? (SalesIQActivity) activity : null;
        if (salesIQActivity != null) {
            salesIQActivity.g0();
        }
    }

    @Override // bg.f
    public boolean e0(MenuItem menuItem) {
        e l02 = l0();
        return l02 != null ? l02.e0(menuItem) : super.e0(menuItem);
    }

    @Override // bg.f
    public boolean f0(MenuItem menuItem) {
        e l02 = l0();
        return l02 != null ? l02.f0(menuItem) : super.f0(menuItem);
    }

    public final boolean h0() {
        e l02 = l0();
        return i.i(l02 != null ? Boolean.valueOf(l02.getIsFirstArticlesFragment()) : null);
    }

    public final Boolean j0() {
        Object m147constructorimpl;
        Boolean bool;
        try {
            Result.Companion companion = Result.INSTANCE;
            List C02 = getChildFragmentManager().C0();
            Intrinsics.checkNotNullExpressionValue(C02, "getFragments(...)");
            Fragment fragment = (Fragment) CollectionsKt.lastOrNull(C02);
            if (fragment != null) {
                bool = Boolean.valueOf((fragment instanceof e) && ((e) fragment).K0());
            } else {
                bool = null;
            }
            m147constructorimpl = Result.m147constructorimpl(bool);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        return (Boolean) (Result.m153isFailureimpl(m147constructorimpl) ? null : m147constructorimpl);
    }

    public final String k0() {
        String X02;
        e l02 = l0();
        if (l02 != null && (X02 = l02.X0()) != null) {
            return X02;
        }
        String customArticleTitle = LiveChatUtil.getCustomArticleTitle();
        Intrinsics.checkNotNullExpressionValue(customArticleTitle, "getCustomArticleTitle(...)");
        return customArticleTitle;
    }

    public final e l0() {
        Object m147constructorimpl;
        Object obj;
        try {
            Result.Companion companion = Result.INSTANCE;
            List C02 = getChildFragmentManager().C0();
            Intrinsics.checkNotNullExpressionValue(C02, "getFragments(...)");
            ListIterator listIterator = C02.listIterator(C02.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                if (((Fragment) obj) instanceof e) {
                    break;
                }
            }
            m147constructorimpl = Result.m147constructorimpl(obj instanceof e ? (e) obj : null);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        return (e) (Result.m153isFailureimpl(m147constructorimpl) ? null : m147constructorimpl);
    }

    public final Fragment m0() {
        Object m147constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            List C02 = getChildFragmentManager().C0();
            Intrinsics.checkNotNullExpressionValue(C02, "getFragments(...)");
            m147constructorimpl = Result.m147constructorimpl((Fragment) CollectionsKt.lastOrNull(C02));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m153isFailureimpl(m147constructorimpl)) {
            m147constructorimpl = null;
        }
        return (Fragment) m147constructorimpl;
    }

    public final Boolean n0() {
        Object m147constructorimpl;
        Object obj;
        try {
            Result.Companion companion = Result.INSTANCE;
            List C02 = getChildFragmentManager().C0();
            Intrinsics.checkNotNullExpressionValue(C02, "getFragments(...)");
            ListIterator listIterator = C02.listIterator(C02.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                if (((Fragment) obj) instanceof e) {
                    break;
                }
            }
            e eVar = obj instanceof e ? (e) obj : null;
            m147constructorimpl = Result.m147constructorimpl(Boolean.valueOf(i.i(eVar != null ? Boolean.valueOf(eVar.q1()) : null)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        return (Boolean) (Result.m153isFailureimpl(m147constructorimpl) ? null : m147constructorimpl);
    }

    @Override // bg.f
    public boolean onBackPressed() {
        e l02;
        if (getChildFragmentManager().w0() <= 1) {
            return false;
        }
        boolean h12 = getChildFragmentManager().h1();
        if (getChildFragmentManager().w0() == 1 && (l02 = l0()) != null) {
            l02.onResume();
        }
        return h12;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(r.f60818x, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (i.g(savedInstanceState)) {
            N s10 = getChildFragmentManager().s();
            int i10 = q.f60482c0;
            e eVar = new e();
            eVar.setArguments(getArguments());
            Unit unit = Unit.INSTANCE;
            s10.p(i10, eVar, e.class.getName()).g(null).h();
        }
        getChildFragmentManager().n(new FragmentManager.m() { // from class: nf.f
            @Override // androidx.fragment.app.FragmentManager.m
            public final void onBackStackChanged() {
                g.o0(g.this);
            }
        });
    }
}
