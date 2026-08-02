package com.zoho.livechat.android.modules.conversations.ui.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.N;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u0017J\r\u0010\u001d\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u0003J\u0019\u0010 \u001a\u00020\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0019\u0010\"\u001a\u00020\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b\"\u0010!R$\u0010*\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0016\u0010.\u001a\u0004\u0018\u00010+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lcom/zoho/livechat/android/modules/conversations/ui/fragments/a;", "Lbg/f;", "<init>", "()V", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "onBackPressed", "()Z", "", "query", "k0", "(Ljava/lang/String;)V", "g0", "j0", "Landroid/view/MenuItem;", "menuItem", "f0", "(Landroid/view/MenuItem;)Z", "e0", "Landroidx/fragment/app/FragmentManager$m;", X9.m.f13664a, "Landroidx/fragment/app/FragmentManager$m;", "getBaseFragmentBackStackChangeListener", "()Landroidx/fragment/app/FragmentManager$m;", "l0", "(Landroidx/fragment/app/FragmentManager$m;)V", "baseFragmentBackStackChangeListener", "Landroidx/fragment/app/Fragment;", "h0", "()Landroidx/fragment/app/Fragment;", "lastFragment", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConversationsBaseFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationsBaseFragment.kt\ncom/zoho/livechat/android/modules/conversations/ui/fragments/ConversationsBaseFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,88:1\n1#2:89\n*E\n"})
/* loaded from: classes4.dex */
public final class a extends bg.f {

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public FragmentManager.m baseFragmentBackStackChangeListener;

    private final Fragment h0() {
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

    @Override // bg.f
    public boolean e0(MenuItem menuItem) {
        if (h0() instanceof bg.k) {
            Fragment h02 = h0();
            Intrinsics.checkNotNull(h02, "null cannot be cast to non-null type com.zoho.livechat.android.ui.fragments.ConversationFragment");
            ((bg.k) h02).e0(menuItem);
        }
        return super.e0(menuItem);
    }

    @Override // bg.f
    public boolean f0(MenuItem menuItem) {
        if (h0() instanceof bg.k) {
            Fragment h02 = h0();
            Intrinsics.checkNotNull(h02, "null cannot be cast to non-null type com.zoho.livechat.android.ui.fragments.ConversationFragment");
            ((bg.k) h02).f0(menuItem);
        }
        return super.f0(menuItem);
    }

    public final boolean g0() {
        if (!(h0() instanceof bg.k)) {
            return false;
        }
        Fragment h02 = h0();
        Intrinsics.checkNotNull(h02, "null cannot be cast to non-null type com.zoho.livechat.android.ui.fragments.ConversationFragment");
        return ((bg.k) h02).n0();
    }

    public final void j0() {
        if (h0() instanceof bg.k) {
            Fragment h02 = h0();
            Intrinsics.checkNotNull(h02, "null cannot be cast to non-null type com.zoho.livechat.android.ui.fragments.ConversationFragment");
            ((bg.k) h02).q0();
        }
    }

    public final void k0(String query) {
        if (h0() instanceof bg.k) {
            Fragment h02 = h0();
            Intrinsics.checkNotNull(h02, "null cannot be cast to non-null type com.zoho.livechat.android.ui.fragments.ConversationFragment");
            ((bg.k) h02).r0(query);
        }
    }

    public final void l0(FragmentManager.m mVar) {
        this.baseFragmentBackStackChangeListener = mVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        FragmentManager.m mVar = this.baseFragmentBackStackChangeListener;
        if (mVar != null) {
            getChildFragmentManager().n(mVar);
        }
    }

    @Override // bg.f
    public boolean onBackPressed() {
        if (getChildFragmentManager().w0() > 1) {
            return getChildFragmentManager().h1();
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(od.r.f60730C, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (og.i.g(savedInstanceState)) {
            N s10 = getChildFragmentManager().s();
            int i10 = od.q.f60383S3;
            bg.k kVar = new bg.k();
            kVar.setArguments(kVar.getArguments());
            Unit unit = Unit.INSTANCE;
            s10.p(i10, kVar, bg.k.class.getName()).g(null).h();
        }
    }
}
