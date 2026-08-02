package com.zoho.livechat.android.modules.common.ui.activities;

import Ph.AbstractC1455i;
import Ph.AbstractC1459k;
import Ph.C1452g0;
import Ph.L;
import Ph.P;
import X9.m;
import a1.C1908a;
import android.R;
import android.app.SearchManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC2082d0;
import androidx.core.view.AbstractC2109r0;
import androidx.core.view.C;
import androidx.core.view.F0;
import androidx.core.view.J;
import androidx.core.view.h1;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.N;
import androidx.lifecycle.AbstractC2194t;
import androidx.lifecycle.U;
import androidx.lifecycle.W;
import androidx.viewpager.widget.ViewPager;
import com.facebook.react.devsupport.StackTraceHelper;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.tabs.TabLayout;
import com.twilio.voice.EventKeys;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.common.domain.entities.Form;
import com.zoho.livechat.android.modules.common.ui.activities.SalesIQActivity;
import com.zoho.livechat.android.modules.common.ui.viewmodels.SalesIQViewModel;
import com.zoho.livechat.android.modules.common.ui.views.MobilistenToggleFAB;
import com.zoho.livechat.android.modules.conversations.ui.fragments.w;
import com.zoho.livechat.android.modules.core.domain.entities.Channel;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import com.zoho.livechat.android.ui.activities.ChatActivity;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.MobilistenUtil;
import com.zoho.livechat.android.utils.Q;
import com.zoho.salesiqembed.ZohoSalesIQ;
import i3.C4527h;
import ie.EnumC4544a;
import java.lang.reflect.Field;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import m.AbstractC5479a;
import od.AbstractC5886l;
import od.o;
import od.q;
import od.r;
import od.s;
import od.t;
import og.AbstractC5892d;
import og.p;
import rd.C6218a;
import we.b;
import xe.C6822a;
import zf.C6966g;

@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\bJ\u0019\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0013\u0010\u0003J\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0017\u0010\u0003J\u001f\u0010\u001c\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001e\u0010\u001fJ+\u0010&\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010%\u001a\u0004\u0018\u00010$H\u0007¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0006H\u0014¢\u0006\u0004\b(\u0010\u0003J\u0015\u0010+\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u0015\u0010.\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u001a¢\u0006\u0004\b.\u0010/J\u0019\u00102\u001a\u00020\u00062\b\u00101\u001a\u0004\u0018\u000100H\u0002¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u00062\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b4\u00103J\u000f\u00105\u001a\u00020\u0006H\u0002¢\u0006\u0004\b5\u0010\u0003J\u001b\u00108\u001a\u0004\u0018\u0001072\b\u00106\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u0006H\u0002¢\u0006\u0004\b:\u0010\u0003J\u000f\u0010;\u001a\u00020\u0006H\u0002¢\u0006\u0004\b;\u0010\u0003J\u000f\u0010<\u001a\u00020\u0006H\u0002¢\u0006\u0004\b<\u0010\u0003J\u0017\u0010?\u001a\u00020\u00062\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u0006H\u0002¢\u0006\u0004\bA\u0010\u0003J\u000f\u0010B\u001a\u00020\u001aH\u0002¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\u0006H\u0002¢\u0006\u0004\bD\u0010\u0003J1\u0010J\u001a\u00020\u00062\u0006\u0010E\u001a\u00020)2\b\u0010G\u001a\u0004\u0018\u00010F2\u0006\u0010H\u001a\u00020)2\u0006\u0010I\u001a\u00020\u0018H\u0002¢\u0006\u0004\bJ\u0010KR\u0016\u0010O\u001a\u00020L8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010S\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010W\u001a\u00020T8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bU\u0010VR\"\u0010_\u001a\u00020X8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010e\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010\u001fR\u0016\u0010i\u001a\u00020f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bg\u0010hR\u0017\u0010n\u001a\u00020$8\u0006¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010mR\u0016\u0010q\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\u0017\u0010v\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\bt\u0010uR\u0014\u0010z\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u001a\u0010~\u001a\b\u0012\u0004\u0012\u00020\u00060{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}R\u001f\u0010\u0083\u0001\u001a\u00020\u007f8@X\u0080\u0084\u0002¢\u0006\u000f\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0005\bp\u0010\u0082\u0001R\u0018\u0010\u0085\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010pR\u001a\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010aR\u0017\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010pR\u0018\u0010\u008c\u0001\u001a\u00030\u0089\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0015\u0010\u0090\u0001\u001a\u00030\u008d\u00018F¢\u0006\b\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0016\u0010>\u001a\u0005\u0018\u00010\u0091\u00018F¢\u0006\b\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0014\u0010\u0096\u0001\u001a\u00020)8F¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0013\u0010\u0098\u0001\u001a\u00020\u001a8F¢\u0006\u0007\u001a\u0005\b\u0097\u0001\u0010CR\u0016\u0010\u009a\u0001\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0099\u0001\u0010C¨\u0006\u009b\u0001"}, d2 = {"Lcom/zoho/livechat/android/modules/common/ui/activities/SalesIQActivity;", "LYf/c;", "<init>", "()V", "Landroidx/core/view/F0;", "insets", "", "E0", "(Landroidx/core/view/F0;)V", "Landroid/view/ViewGroup;", "D", "()Landroid/view/ViewGroup;", "insetsCompat", "E", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "g0", "l0", "D0", "onBackPressed", "onResume", "onPause", "", "text", "", "shouldRestoreSearchUi", "y0", "(Ljava/lang/String;Z)V", "x0", "(Ljava/lang/String;)V", "Landroid/view/Menu;", "menu", "Landroid/view/MenuItem$OnActionExpandListener;", "onActionExpandListener", "Landroidx/appcompat/widget/SearchView$m;", "onQueryTextListener", "W", "(Landroid/view/Menu;Landroid/view/MenuItem$OnActionExpandListener;Landroidx/appcompat/widget/SearchView$m;)V", "onDestroy", "", "visibility", "A0", "(I)V", EventKeys.VALUE_KEY, "C0", "(Z)V", "Landroid/view/MenuItem;", "item", "h0", "(Landroid/view/MenuItem;)V", "j0", "m0", "bundle", "Lcom/zoho/salesiqembed/ZohoSalesIQ$l;", "e0", "(Landroid/os/Bundle;)Lcom/zoho/salesiqembed/ZohoSalesIQ$l;", "o0", "n0", "q0", "Lcom/zoho/livechat/android/modules/conversations/ui/fragments/a;", "currentFragment", "r0", "(Lcom/zoho/livechat/android/modules/conversations/ui/fragments/a;)V", "B0", "V", "()Z", "p0", "index", "Lcom/google/android/material/tabs/TabLayout$g;", "tab", "tabIconId", "tabTitleText", "z0", "(ILcom/google/android/material/tabs/TabLayout$g;ILjava/lang/String;)V", "Lud/i;", "g", "Lud/i;", "binding", "Lm/a;", C4527h.f48087o, "Lm/a;", "actionBar", "Lcom/zoho/livechat/android/modules/common/ui/viewmodels/SalesIQViewModel;", com.google.android.material.shape.i.f35755A, "Lcom/zoho/livechat/android/modules/common/ui/viewmodels/SalesIQViewModel;", "viewModel", "LZf/m;", "j", "LZf/m;", "a0", "()LZf/m;", "v0", "(LZf/m;)V", "pagerAdapter", "k", "Ljava/lang/String;", "c0", "()Ljava/lang/String;", "w0", "searchQuery", "Landroid/widget/TextView;", "l", "Landroid/widget/TextView;", "offlineMessageTextView", m.f13664a, "Landroidx/appcompat/widget/SearchView$m;", "b0", "()Landroidx/appcompat/widget/SearchView$m;", "queryTextListener", "n", "Z", "isMenuCollapsed", "o", "Landroid/view/MenuItem$OnActionExpandListener;", "X", "()Landroid/view/MenuItem$OnActionExpandListener;", "actionExpandListener", "Landroidx/core/view/C;", "p", "Landroidx/core/view/C;", "menuProvider", "Lkotlin/Function0;", "q", "Lkotlin/jvm/functions/Function0;", "baseFragmentBackStackChangeListener", "Landroidx/constraintlayout/widget/ConstraintLayout;", "r", "Lkotlin/Lazy;", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "loadingDialogView", "s", "isInLoadingState", "t", "articlesSearchQuery", "u", "Landroid/content/BroadcastReceiver;", "v", "Landroid/content/BroadcastReceiver;", "mobilistenChatBroadcastReceiver", "Landroidx/appcompat/widget/Toolbar;", "getToolbar", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "Lbg/f;", "Y", "()Lbg/f;", "f0", "()I", "viewPagerPosition", "s0", "isConversationsAndKnowledgeBaseEnabled", "d0", "shouldNavigateToCallsForm", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSalesIQActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SalesIQActivity.kt\ncom/zoho/livechat/android/modules/common/ui/activities/SalesIQActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,1152:1\n1#2:1153\n326#3,4:1154\n326#3,4:1158\n37#4,2:1162\n*S KotlinDebug\n*F\n+ 1 SalesIQActivity.kt\ncom/zoho/livechat/android/modules/common/ui/activities/SalesIQActivity\n*L\n279#1:1154,4\n284#1:1158,4\n564#1:1162,2\n*E\n"})
/* loaded from: classes4.dex */
public final class SalesIQActivity extends Yf.c {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public ud.i binding;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public AbstractC5479a actionBar;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public SalesIQViewModel viewModel;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public Zf.m pagerAdapter;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public TextView offlineMessageTextView;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public boolean isInLoadingState;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public String articlesSearchQuery;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public boolean shouldRestoreSearchUi;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public String searchQuery = "";

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final SearchView.m queryTextListener = new k();

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public boolean isMenuCollapsed = true;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final MenuItem.OnActionExpandListener actionExpandListener = new b();

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final C menuProvider = new h();

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final Function0 baseFragmentBackStackChangeListener = new c();

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final Lazy loadingDialogView = LazyKt.lazy(new g());

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public final BroadcastReceiver mobilistenChatBroadcastReceiver = new i();

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f42624a = EnumEntriesKt.enumEntries(ZohoSalesIQ.l.values());
    }

    public static final class b implements MenuItem.OnActionExpandListener {
        public b() {
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            SalesIQActivity.this.h0(item);
            return true;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            SalesIQActivity.this.j0(item);
            return true;
        }
    }

    public static final class c extends Lambda implements Function0 {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m115invoke();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m115invoke() {
            SalesIQActivity.this.B0();
            SalesIQActivity.this.l0();
            SalesIQActivity.this.n0();
        }
    }

    public static final class d extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f42628n;

        /* renamed from: o, reason: collision with root package name */
        public Object f42629o;

        /* renamed from: p, reason: collision with root package name */
        public Object f42630p;

        /* renamed from: q, reason: collision with root package name */
        public Object f42631q;

        /* renamed from: r, reason: collision with root package name */
        public Object f42632r;

        /* renamed from: s, reason: collision with root package name */
        public boolean f42633s;

        /* renamed from: t, reason: collision with root package name */
        public boolean f42634t;

        /* renamed from: u, reason: collision with root package name */
        public boolean f42635u;

        /* renamed from: v, reason: collision with root package name */
        public boolean f42636v;

        /* renamed from: w, reason: collision with root package name */
        public int f42637w;

        /* renamed from: x, reason: collision with root package name */
        public int f42638x;

        /* renamed from: y, reason: collision with root package name */
        public int f42639y;

        /* renamed from: z, reason: collision with root package name */
        public int f42640z;

        public static final class a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f42641n;

            public a(Continuation continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f42641n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(LiveChatUtil.getAllOpenChatIds().isEmpty());
            }
        }

        public static final class b extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f42642n;

            public b(Continuation continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new b(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((b) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f42642n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(LiveChatUtil.getAllOpenChatIds(SalesIQChat.c.Chat).size() > 0);
            }
        }

        public static final class c extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f42643n;

            public c(Continuation continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new c(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((c) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f42643n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Intrinsics.checkNotNullExpressionValue(LiveChatUtil.getAllOpenChatIds(SalesIQChat.c.Chat), "getAllOpenChatIds(...)");
                return Boxing.boxBoolean(!r2.isEmpty());
            }
        }

        public d(Continuation continuation) {
            super(2, continuation);
        }

        public static final void m(SalesIQActivity salesIQActivity, View view) {
            bg.f Y10 = salesIQActivity.Y();
            if (Y10 instanceof com.zoho.livechat.android.modules.conversations.ui.fragments.a) {
                if (LiveChatUtil.isFormContextStarted()) {
                    ((com.zoho.livechat.android.modules.conversations.ui.fragments.a) Y10).j0();
                    return;
                } else {
                    salesIQActivity.r0((com.zoho.livechat.android.modules.conversations.ui.fragments.a) Y10);
                    return;
                }
            }
            ud.i iVar = salesIQActivity.binding;
            if (iVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                iVar = null;
            }
            p.n(iVar.f66309h);
            SalesIQChat recentChat = LiveChatUtil.getRecentChat();
            if (!LiveChatUtil.canAllowOpenChatActivityInOfflineState(recentChat) && !C6218a.c0()) {
                MobilistenUtil.z(t.f61107s, 0, 2, null);
                return;
            }
            Intent intent = new Intent(salesIQActivity, (Class<?>) ChatActivity.class);
            if (recentChat == null || recentChat.getChid() == null || recentChat.getStatus() == 4 || recentChat.getStatus() == 3) {
                intent.putExtra("chid", "temp_chid");
            } else {
                intent.putExtra("chid", recentChat.getChid());
            }
            salesIQActivity.startActivity(intent);
        }

        public static final void o(SalesIQActivity salesIQActivity, View view) {
            salesIQActivity.q0();
        }

        public static final void p(SalesIQActivity salesIQActivity, View view) {
            if (salesIQActivity.isInLoadingState) {
                return;
            }
            ud.i iVar = salesIQActivity.binding;
            if (iVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                iVar = null;
            }
            p.n(iVar.f66309h);
            ud.i iVar2 = salesIQActivity.binding;
            if (iVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                iVar2 = null;
            }
            MobilistenToggleFAB siqFabContainer = iVar2.f66310i;
            Intrinsics.checkNotNullExpressionValue(siqFabContainer, "siqFabContainer");
            MobilistenToggleFAB.H0(siqFabContainer, true, null, 2, null);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return SalesIQActivity.this.new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((d) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:133:0x00c4, code lost:
        
            if (r5 == r1) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0294, code lost:
        
            r1 = r16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x021d, code lost:
        
            if (((java.lang.Boolean) r6).booleanValue() == false) goto L101;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0193, code lost:
        
            if (((java.lang.Boolean) r8).booleanValue() != false) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0109, code lost:
        
            r11 = r2;
            r10 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:91:0x0189, code lost:
        
            if (r8 != r1) goto L65;
         */
        /* JADX WARN: Code restructure failed: missing block: B:95:0x0106, code lost:
        
            if (r2 != false) goto L35;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x027a  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x02a8  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x02af  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x02d0  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x02e1  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x02f9  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0311  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0315  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x02b2  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x02ab  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0266  */
        /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:60:0x01a6  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x01b6  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x01c2  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x01dd  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x01e7  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x022d  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x0106  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            bg.f Y10;
            Object p10;
            boolean z10;
            int i10;
            bg.f fVar;
            Object m10;
            boolean z11;
            Object m11;
            Object g10;
            boolean L10;
            SalesIQViewModel salesIQViewModel;
            boolean n10;
            SalesIQViewModel salesIQViewModel2;
            boolean o10;
            int i11;
            ud.i iVar;
            MobilistenToggleFAB mobilistenToggleFAB;
            SalesIQActivity salesIQActivity;
            int i12;
            MobilistenToggleFAB mobilistenToggleFAB2;
            MobilistenToggleFAB mobilistenToggleFAB3;
            int i13;
            int i14;
            Object g11;
            MobilistenToggleFAB mobilistenToggleFAB4;
            bg.f fVar2;
            boolean z12;
            int i15;
            int i16;
            int i17;
            String str;
            Object g12;
            boolean z13;
            boolean z14;
            boolean z15;
            ud.i iVar2;
            ud.i iVar3;
            ud.i iVar4;
            ud.i iVar5;
            boolean z16;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ud.i iVar6 = null;
            switch (this.f42640z) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    Y10 = SalesIQActivity.this.Y();
                    SalesIQViewModel salesIQViewModel3 = SalesIQActivity.this.viewModel;
                    if (salesIQViewModel3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        salesIQViewModel3 = null;
                    }
                    this.f42628n = Y10;
                    this.f42640z = 1;
                    p10 = salesIQViewModel3.p(this);
                    break;
                case 1:
                    Y10 = (bg.f) this.f42628n;
                    ResultKt.throwOnFailure(obj);
                    p10 = obj;
                    boolean booleanValue = ((Boolean) p10).booleanValue();
                    if (SalesIQActivity.this.V()) {
                        if (Y10 instanceof com.zoho.livechat.android.modules.conversations.ui.fragments.a) {
                            SalesIQViewModel salesIQViewModel4 = SalesIQActivity.this.viewModel;
                            if (salesIQViewModel4 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                salesIQViewModel4 = null;
                            }
                            this.f42628n = Y10;
                            this.f42633s = booleanValue;
                            this.f42640z = 2;
                            m11 = salesIQViewModel4.m(this);
                            if (m11 != coroutine_suspended) {
                                fVar = Y10;
                                z11 = booleanValue;
                                if (!((Boolean) m11).booleanValue()) {
                                }
                                z10 = z11;
                                i10 = 1;
                                L10 = com.zoho.livechat.android.modules.brand.ui.helpers.a.L();
                                salesIQViewModel = SalesIQActivity.this.viewModel;
                                if (salesIQViewModel == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                    salesIQViewModel = null;
                                }
                                n10 = salesIQViewModel.n();
                                salesIQViewModel2 = SalesIQActivity.this.viewModel;
                                if (salesIQViewModel2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                    salesIQViewModel2 = null;
                                }
                                o10 = salesIQViewModel2.o();
                                i11 = (!(fVar instanceof com.zoho.livechat.android.modules.conversations.ui.fragments.a) || ((fVar instanceof nf.g) && (((nf.g) fVar).m0() instanceof nf.e))) ? 1 : 0;
                                iVar = SalesIQActivity.this.binding;
                                if (iVar == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                                    iVar = null;
                                }
                                mobilistenToggleFAB = iVar.f66310i;
                                salesIQActivity = SalesIQActivity.this;
                                if (L10) {
                                    i12 = 1;
                                    mobilistenToggleFAB2 = mobilistenToggleFAB;
                                    mobilistenToggleFAB3 = mobilistenToggleFAB2;
                                    mobilistenToggleFAB4 = mobilistenToggleFAB3;
                                    fVar2 = fVar;
                                    z12 = o10;
                                    i15 = i11;
                                    i16 = 0;
                                    i17 = i12;
                                    str = "binding";
                                    L b10 = C1452g0.b();
                                    b bVar = new b(null);
                                    this.f42628n = fVar2;
                                    this.f42629o = mobilistenToggleFAB4;
                                    this.f42630p = salesIQActivity;
                                    this.f42631q = mobilistenToggleFAB2;
                                    this.f42632r = mobilistenToggleFAB;
                                    this.f42633s = z10;
                                    this.f42637w = i10;
                                    this.f42634t = L10;
                                    this.f42635u = n10;
                                    this.f42636v = z12;
                                    this.f42638x = i15;
                                    this.f42639y = i16;
                                    this.f42640z = 6;
                                    g12 = AbstractC1455i.g(b10, bVar, this);
                                    if (g12 != coroutine_suspended) {
                                    }
                                } else {
                                    if (!z10) {
                                        i13 = 1;
                                        mobilistenToggleFAB2 = mobilistenToggleFAB;
                                        mobilistenToggleFAB3 = mobilistenToggleFAB2;
                                        mobilistenToggleFAB4 = mobilistenToggleFAB3;
                                        fVar2 = fVar;
                                        z12 = o10;
                                        i15 = i11;
                                        i16 = i13;
                                        i17 = i13;
                                        str = "binding";
                                        L b102 = C1452g0.b();
                                        b bVar2 = new b(null);
                                        this.f42628n = fVar2;
                                        this.f42629o = mobilistenToggleFAB4;
                                        this.f42630p = salesIQActivity;
                                        this.f42631q = mobilistenToggleFAB2;
                                        this.f42632r = mobilistenToggleFAB;
                                        this.f42633s = z10;
                                        this.f42637w = i10;
                                        this.f42634t = L10;
                                        this.f42635u = n10;
                                        this.f42636v = z12;
                                        this.f42638x = i15;
                                        this.f42639y = i16;
                                        this.f42640z = 6;
                                        g12 = AbstractC1455i.g(b102, bVar2, this);
                                        if (g12 != coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        z13 = z12;
                                        z14 = i17;
                                        boolean z17 = n10;
                                        boolean z18 = L10;
                                        boolean booleanValue2 = ((Boolean) g12).booleanValue();
                                        boolean z19 = !z10;
                                        nd.c T10 = ne.j.T();
                                        if (!(fVar2 instanceof w)) {
                                            if (salesIQActivity.s0()) {
                                                z16 = false;
                                                break;
                                            } else {
                                                z16 = false;
                                            }
                                            if (!z16) {
                                                z15 = false;
                                                mobilistenToggleFAB.setFabsVisibility(new MobilistenToggleFAB.a(false, z18, i16 != 0 ? z14 : false, false, z17, i10 != 0 ? z14 : false, booleanValue2, z13, z19, z15, T10, null, null, false, 14336, null));
                                                iVar2 = salesIQActivity.binding;
                                                if (iVar2 == null) {
                                                    Intrinsics.throwUninitializedPropertyAccessException(str);
                                                    iVar2 = null;
                                                }
                                                mobilistenToggleFAB2.setScrimView(iVar2.f66309h);
                                                iVar3 = SalesIQActivity.this.binding;
                                                if (iVar3 == null) {
                                                    Intrinsics.throwUninitializedPropertyAccessException(str);
                                                    iVar3 = null;
                                                }
                                                MobilistenToggleFAB mobilistenToggleFAB5 = iVar3.f66310i;
                                                final SalesIQActivity salesIQActivity2 = SalesIQActivity.this;
                                                mobilistenToggleFAB5.setOnChatClickListener(new View.OnClickListener() { // from class: oe.g
                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        SalesIQActivity.d.m(SalesIQActivity.this, view);
                                                    }
                                                });
                                                iVar4 = SalesIQActivity.this.binding;
                                                if (iVar4 == null) {
                                                    Intrinsics.throwUninitializedPropertyAccessException(str);
                                                    iVar4 = null;
                                                }
                                                MobilistenToggleFAB mobilistenToggleFAB6 = iVar4.f66310i;
                                                final SalesIQActivity salesIQActivity3 = SalesIQActivity.this;
                                                mobilistenToggleFAB6.setOnCallClickListener(new View.OnClickListener() { // from class: oe.h
                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        SalesIQActivity.d.o(SalesIQActivity.this, view);
                                                    }
                                                });
                                                iVar5 = SalesIQActivity.this.binding;
                                                if (iVar5 == null) {
                                                    Intrinsics.throwUninitializedPropertyAccessException(str);
                                                } else {
                                                    iVar6 = iVar5;
                                                }
                                                View view = iVar6.f66309h;
                                                final SalesIQActivity salesIQActivity4 = SalesIQActivity.this;
                                                view.setOnClickListener(new View.OnClickListener() { // from class: oe.i
                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view2) {
                                                        SalesIQActivity.d.p(SalesIQActivity.this, view2);
                                                    }
                                                });
                                                return Unit.INSTANCE;
                                            }
                                        }
                                        z15 = z14;
                                        mobilistenToggleFAB.setFabsVisibility(new MobilistenToggleFAB.a(false, z18, i16 != 0 ? z14 : false, false, z17, i10 != 0 ? z14 : false, booleanValue2, z13, z19, z15, T10, null, null, false, 14336, null));
                                        iVar2 = salesIQActivity.binding;
                                        if (iVar2 == null) {
                                        }
                                        mobilistenToggleFAB2.setScrimView(iVar2.f66309h);
                                        iVar3 = SalesIQActivity.this.binding;
                                        if (iVar3 == null) {
                                        }
                                        MobilistenToggleFAB mobilistenToggleFAB52 = iVar3.f66310i;
                                        final SalesIQActivity salesIQActivity22 = SalesIQActivity.this;
                                        mobilistenToggleFAB52.setOnChatClickListener(new View.OnClickListener() { // from class: oe.g
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view2) {
                                                SalesIQActivity.d.m(SalesIQActivity.this, view2);
                                            }
                                        });
                                        iVar4 = SalesIQActivity.this.binding;
                                        if (iVar4 == null) {
                                        }
                                        MobilistenToggleFAB mobilistenToggleFAB62 = iVar4.f66310i;
                                        final SalesIQActivity salesIQActivity32 = SalesIQActivity.this;
                                        mobilistenToggleFAB62.setOnCallClickListener(new View.OnClickListener() { // from class: oe.h
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view2) {
                                                SalesIQActivity.d.o(SalesIQActivity.this, view2);
                                            }
                                        });
                                        iVar5 = SalesIQActivity.this.binding;
                                        if (iVar5 == null) {
                                        }
                                        View view2 = iVar6.f66309h;
                                        final SalesIQActivity salesIQActivity42 = SalesIQActivity.this;
                                        view2.setOnClickListener(new View.OnClickListener() { // from class: oe.i
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view22) {
                                                SalesIQActivity.d.p(SalesIQActivity.this, view22);
                                            }
                                        });
                                        return Unit.INSTANCE;
                                    }
                                    L b11 = C1452g0.b();
                                    a aVar = new a(null);
                                    this.f42628n = fVar;
                                    this.f42629o = mobilistenToggleFAB;
                                    this.f42630p = salesIQActivity;
                                    this.f42631q = mobilistenToggleFAB;
                                    this.f42632r = mobilistenToggleFAB;
                                    this.f42633s = z10;
                                    this.f42637w = i10;
                                    this.f42634t = L10;
                                    this.f42635u = n10;
                                    this.f42636v = o10;
                                    this.f42638x = i11;
                                    i14 = 1;
                                    this.f42640z = 5;
                                    g11 = AbstractC1455i.g(b11, aVar, this);
                                    if (g11 != coroutine_suspended) {
                                        mobilistenToggleFAB2 = mobilistenToggleFAB;
                                        mobilistenToggleFAB3 = mobilistenToggleFAB2;
                                        i12 = i14;
                                        i13 = i14;
                                        break;
                                    }
                                }
                            }
                        } else {
                            nf.g gVar = Y10 instanceof nf.g ? (nf.g) Y10 : null;
                            if (((gVar != null ? gVar.m0() : null) instanceof nf.e) && SalesIQActivity.this.isMenuCollapsed) {
                                if (SalesIQActivity.this.s0()) {
                                    Intrinsics.checkNotNull(Y10, "null cannot be cast to non-null type com.zoho.livechat.android.modules.knowledgebase.ui.fragments.KnowledgeBaseBaseFragment");
                                    z10 = booleanValue;
                                    i10 = Intrinsics.areEqual(((nf.g) Y10).n0(), Boxing.boxBoolean(true)) ? 1 : 0;
                                    fVar = Y10;
                                    L10 = com.zoho.livechat.android.modules.brand.ui.helpers.a.L();
                                    salesIQViewModel = SalesIQActivity.this.viewModel;
                                    if (salesIQViewModel == null) {
                                    }
                                    n10 = salesIQViewModel.n();
                                    salesIQViewModel2 = SalesIQActivity.this.viewModel;
                                    if (salesIQViewModel2 == null) {
                                    }
                                    o10 = salesIQViewModel2.o();
                                    if (fVar instanceof com.zoho.livechat.android.modules.conversations.ui.fragments.a) {
                                    }
                                    iVar = SalesIQActivity.this.binding;
                                    if (iVar == null) {
                                    }
                                    mobilistenToggleFAB = iVar.f66310i;
                                    salesIQActivity = SalesIQActivity.this;
                                    if (L10) {
                                    }
                                } else {
                                    SalesIQViewModel salesIQViewModel5 = SalesIQActivity.this.viewModel;
                                    if (salesIQViewModel5 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                        salesIQViewModel5 = null;
                                    }
                                    this.f42628n = Y10;
                                    this.f42633s = booleanValue;
                                    this.f42640z = 3;
                                    m10 = salesIQViewModel5.m(this);
                                    if (m10 != coroutine_suspended) {
                                        fVar = Y10;
                                        z11 = booleanValue;
                                        if (!((Boolean) m10).booleanValue() && z11) {
                                            L b12 = C1452g0.b();
                                            c cVar = new c(null);
                                            this.f42628n = fVar;
                                            this.f42633s = z11;
                                            this.f42640z = 4;
                                            g10 = AbstractC1455i.g(b12, cVar, this);
                                            break;
                                        }
                                        z10 = z11;
                                        i10 = 1;
                                        L10 = com.zoho.livechat.android.modules.brand.ui.helpers.a.L();
                                        salesIQViewModel = SalesIQActivity.this.viewModel;
                                        if (salesIQViewModel == null) {
                                        }
                                        n10 = salesIQViewModel.n();
                                        salesIQViewModel2 = SalesIQActivity.this.viewModel;
                                        if (salesIQViewModel2 == null) {
                                        }
                                        o10 = salesIQViewModel2.o();
                                        if (fVar instanceof com.zoho.livechat.android.modules.conversations.ui.fragments.a) {
                                        }
                                        iVar = SalesIQActivity.this.binding;
                                        if (iVar == null) {
                                        }
                                        mobilistenToggleFAB = iVar.f66310i;
                                        salesIQActivity = SalesIQActivity.this;
                                        if (L10) {
                                        }
                                    }
                                }
                            }
                        }
                        return coroutine_suspended;
                    }
                    z10 = booleanValue;
                    i10 = 0;
                    fVar = Y10;
                    L10 = com.zoho.livechat.android.modules.brand.ui.helpers.a.L();
                    salesIQViewModel = SalesIQActivity.this.viewModel;
                    if (salesIQViewModel == null) {
                    }
                    n10 = salesIQViewModel.n();
                    salesIQViewModel2 = SalesIQActivity.this.viewModel;
                    if (salesIQViewModel2 == null) {
                    }
                    o10 = salesIQViewModel2.o();
                    if (fVar instanceof com.zoho.livechat.android.modules.conversations.ui.fragments.a) {
                    }
                    iVar = SalesIQActivity.this.binding;
                    if (iVar == null) {
                    }
                    mobilistenToggleFAB = iVar.f66310i;
                    salesIQActivity = SalesIQActivity.this;
                    if (L10) {
                    }
                    break;
                case 2:
                    z11 = this.f42633s;
                    fVar = (bg.f) this.f42628n;
                    ResultKt.throwOnFailure(obj);
                    m11 = obj;
                    if (!((Boolean) m11).booleanValue()) {
                    }
                    z10 = z11;
                    i10 = 1;
                    L10 = com.zoho.livechat.android.modules.brand.ui.helpers.a.L();
                    salesIQViewModel = SalesIQActivity.this.viewModel;
                    if (salesIQViewModel == null) {
                    }
                    n10 = salesIQViewModel.n();
                    salesIQViewModel2 = SalesIQActivity.this.viewModel;
                    if (salesIQViewModel2 == null) {
                    }
                    o10 = salesIQViewModel2.o();
                    if (fVar instanceof com.zoho.livechat.android.modules.conversations.ui.fragments.a) {
                    }
                    iVar = SalesIQActivity.this.binding;
                    if (iVar == null) {
                    }
                    mobilistenToggleFAB = iVar.f66310i;
                    salesIQActivity = SalesIQActivity.this;
                    if (L10) {
                    }
                    break;
                case 3:
                    z11 = this.f42633s;
                    fVar = (bg.f) this.f42628n;
                    ResultKt.throwOnFailure(obj);
                    m10 = obj;
                    if (!((Boolean) m10).booleanValue()) {
                        L b122 = C1452g0.b();
                        c cVar2 = new c(null);
                        this.f42628n = fVar;
                        this.f42633s = z11;
                        this.f42640z = 4;
                        g10 = AbstractC1455i.g(b122, cVar2, this);
                        break;
                    }
                    z10 = z11;
                    i10 = 1;
                    L10 = com.zoho.livechat.android.modules.brand.ui.helpers.a.L();
                    salesIQViewModel = SalesIQActivity.this.viewModel;
                    if (salesIQViewModel == null) {
                    }
                    n10 = salesIQViewModel.n();
                    salesIQViewModel2 = SalesIQActivity.this.viewModel;
                    if (salesIQViewModel2 == null) {
                    }
                    o10 = salesIQViewModel2.o();
                    if (fVar instanceof com.zoho.livechat.android.modules.conversations.ui.fragments.a) {
                    }
                    iVar = SalesIQActivity.this.binding;
                    if (iVar == null) {
                    }
                    mobilistenToggleFAB = iVar.f66310i;
                    salesIQActivity = SalesIQActivity.this;
                    if (L10) {
                    }
                    break;
                case 4:
                    z11 = this.f42633s;
                    fVar = (bg.f) this.f42628n;
                    ResultKt.throwOnFailure(obj);
                    g10 = obj;
                    break;
                case 5:
                    i11 = this.f42638x;
                    o10 = this.f42636v;
                    n10 = this.f42635u;
                    L10 = this.f42634t;
                    i10 = this.f42637w;
                    z10 = this.f42633s;
                    mobilistenToggleFAB = (MobilistenToggleFAB) this.f42632r;
                    mobilistenToggleFAB2 = (MobilistenToggleFAB) this.f42631q;
                    salesIQActivity = (SalesIQActivity) this.f42630p;
                    mobilistenToggleFAB3 = (MobilistenToggleFAB) this.f42629o;
                    fVar = (bg.f) this.f42628n;
                    ResultKt.throwOnFailure(obj);
                    i14 = 1;
                    g11 = obj;
                    i12 = i14;
                    i13 = i14;
                    break;
                case 6:
                    int i18 = this.f42639y;
                    int i19 = this.f42638x;
                    boolean z20 = this.f42636v;
                    n10 = this.f42635u;
                    L10 = this.f42634t;
                    i10 = this.f42637w;
                    z10 = this.f42633s;
                    mobilistenToggleFAB = (MobilistenToggleFAB) this.f42632r;
                    mobilistenToggleFAB2 = (MobilistenToggleFAB) this.f42631q;
                    salesIQActivity = (SalesIQActivity) this.f42630p;
                    fVar2 = (bg.f) this.f42628n;
                    ResultKt.throwOnFailure(obj);
                    str = "binding";
                    z13 = z20;
                    z14 = 1;
                    i15 = i19;
                    i16 = i18;
                    g12 = obj;
                    boolean z172 = n10;
                    boolean z182 = L10;
                    boolean booleanValue22 = ((Boolean) g12).booleanValue();
                    boolean z192 = !z10;
                    nd.c T102 = ne.j.T();
                    if (!(fVar2 instanceof w)) {
                    }
                    z15 = z14;
                    mobilistenToggleFAB.setFabsVisibility(new MobilistenToggleFAB.a(false, z182, i16 != 0 ? z14 : false, false, z172, i10 != 0 ? z14 : false, booleanValue22, z13, z192, z15, T102, null, null, false, 14336, null));
                    iVar2 = salesIQActivity.binding;
                    if (iVar2 == null) {
                    }
                    mobilistenToggleFAB2.setScrimView(iVar2.f66309h);
                    iVar3 = SalesIQActivity.this.binding;
                    if (iVar3 == null) {
                    }
                    MobilistenToggleFAB mobilistenToggleFAB522 = iVar3.f66310i;
                    final SalesIQActivity salesIQActivity222 = SalesIQActivity.this;
                    mobilistenToggleFAB522.setOnChatClickListener(new View.OnClickListener() { // from class: oe.g
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view22) {
                            SalesIQActivity.d.m(SalesIQActivity.this, view22);
                        }
                    });
                    iVar4 = SalesIQActivity.this.binding;
                    if (iVar4 == null) {
                    }
                    MobilistenToggleFAB mobilistenToggleFAB622 = iVar4.f66310i;
                    final SalesIQActivity salesIQActivity322 = SalesIQActivity.this;
                    mobilistenToggleFAB622.setOnCallClickListener(new View.OnClickListener() { // from class: oe.h
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view22) {
                            SalesIQActivity.d.o(SalesIQActivity.this, view22);
                        }
                    });
                    iVar5 = SalesIQActivity.this.binding;
                    if (iVar5 == null) {
                    }
                    View view22 = iVar6.f66309h;
                    final SalesIQActivity salesIQActivity422 = SalesIQActivity.this;
                    view22.setOnClickListener(new View.OnClickListener() { // from class: oe.i
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view222) {
                            SalesIQActivity.d.p(SalesIQActivity.this, view222);
                        }
                    });
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public static final class e extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f42644n;

        /* renamed from: o, reason: collision with root package name */
        public Object f42645o;

        /* renamed from: p, reason: collision with root package name */
        public int f42646p;

        public static final class a extends Lambda implements Function0 {

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Continuation f42648d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Continuation continuation) {
                super(0);
                this.f42648d = continuation;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m116invoke();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m116invoke() {
                Continuation continuation = this.f42648d;
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m147constructorimpl(Unit.INSTANCE));
            }
        }

        public static final class b extends Lambda implements Function1 {

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ SalesIQActivity f42649d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(SalesIQActivity salesIQActivity) {
                super(1);
                this.f42649d = salesIQActivity;
            }

            public final void a(boolean z10) {
                this.f42649d.isInLoadingState = z10;
                ud.i iVar = null;
                if (z10) {
                    ud.i iVar2 = this.f42649d.binding;
                    if (iVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        iVar2 = null;
                    }
                    p.n(iVar2.f66310i);
                    p.w(this.f42649d.Z());
                    ud.i iVar3 = this.f42649d.binding;
                    if (iVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        iVar = iVar3;
                    }
                    p.w(iVar.f66309h);
                    return;
                }
                ud.i iVar4 = this.f42649d.binding;
                if (iVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    iVar4 = null;
                }
                p.w(iVar4.f66310i);
                p.n(this.f42649d.Z());
                ud.i iVar5 = this.f42649d.binding;
                if (iVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    iVar = iVar5;
                }
                p.n(iVar.f66309h);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            }
        }

        public e(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return SalesIQActivity.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((e) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:69:0x00c2, code lost:
        
            if (r0 == r8) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x0072, code lost:
        
            if (r0 == r8) goto L63;
         */
        /* JADX WARN: Removed duplicated region for block: B:9:0x018d  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object k02;
            Message message;
            Object j02;
            SalesIQChat salesIQChat;
            we.e eVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f42646p;
            ud.i iVar = null;
            SalesIQViewModel salesIQViewModel = null;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                SalesIQActivity salesIQActivity = SalesIQActivity.this;
                this.f42644n = salesIQActivity;
                this.f42646p = 1;
                SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(this));
                ud.i iVar2 = salesIQActivity.binding;
                if (iVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    iVar2 = null;
                }
                iVar2.f66310i.G0(true, new a(safeContinuation));
                Object orThrow = safeContinuation.getOrThrow();
                if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(this);
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Message message2 = (Message) this.f42645o;
                        salesIQChat = (SalesIQChat) this.f42644n;
                        ResultKt.throwOnFailure(obj);
                        message = message2;
                        j02 = obj;
                        eVar = (we.e) j02;
                        if (eVar.d()) {
                            SalesIQViewModel salesIQViewModel2 = SalesIQActivity.this.viewModel;
                            if (salesIQViewModel2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                salesIQViewModel2 = null;
                            }
                            android.support.v4.media.session.b.a(eVar.b());
                            salesIQViewModel2.l(salesIQChat, message, null);
                        }
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                    k02 = obj;
                    we.e eVar2 = (we.e) k02;
                    if (eVar2.d()) {
                        Pair pair = (Pair) eVar2.b();
                        if (pair == null || ((Boolean) pair.getSecond()).booleanValue()) {
                            Td.e eVar3 = Td.e.f11456a;
                            Pair r10 = Td.e.r(eVar3, null, null, null, 7, null);
                            SalesIQChat salesIQChat2 = (SalesIQChat) r10.component1();
                            message = (Message) r10.component2();
                            if (salesIQChat2 != null) {
                                if (message != null) {
                                    C6966g.u0(message);
                                }
                                Pair pair2 = (Pair) eVar2.b();
                                if ((pair2 != null ? (EnumC4544a) pair2.getFirst() : null) == EnumC4544a.CallOnline) {
                                    SalesIQActivity salesIQActivity2 = SalesIQActivity.this;
                                    this.f42644n = salesIQChat2;
                                    this.f42645o = message;
                                    this.f42646p = 3;
                                    j02 = Td.e.j0(eVar3, salesIQActivity2, salesIQChat2, true, false, this, 8, null);
                                    if (j02 != coroutine_suspended) {
                                        salesIQChat = salesIQChat2;
                                        eVar = (we.e) j02;
                                        if (eVar.d()) {
                                        }
                                    }
                                    return coroutine_suspended;
                                }
                                SalesIQViewModel salesIQViewModel3 = SalesIQActivity.this.viewModel;
                                if (salesIQViewModel3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                } else {
                                    salesIQViewModel = salesIQViewModel3;
                                }
                                salesIQViewModel.q(salesIQChat2, message);
                            } else {
                                LiveChatUtil.log("Chat creation failed");
                            }
                        } else {
                            SalesIQActivity salesIQActivity3 = SalesIQActivity.this;
                            Intent intent = new Intent(SalesIQActivity.this, (Class<?>) PreChatFormActivity.class);
                            SalesIQActivity salesIQActivity4 = SalesIQActivity.this;
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("requested_for_call_type_chat", true);
                            Bundle extras = salesIQActivity4.getIntent().getExtras();
                            bundle.putBoolean("can_finish_activity_on_call", Intrinsics.areEqual(extras != null ? extras.getString("navigate_to") : null, "calls_form"));
                            String string = bundle.getString("acknowledgement_key", null);
                            if (string != null) {
                                String str = og.i.f(string) ? string : null;
                                if (str != null) {
                                    bundle.putString("acknowledgement_key", str);
                                }
                            }
                            bundle.putString("chid", "temp_call_chid");
                            intent.putExtras(bundle);
                            salesIQActivity3.startActivity(intent);
                        }
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            if (Td.e.m0()) {
                ud.i iVar3 = SalesIQActivity.this.binding;
                if (iVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    iVar3 = null;
                }
                CoordinatorLayout b10 = iVar3.b();
                Intrinsics.checkNotNullExpressionValue(b10, "getRoot(...)");
                ud.i iVar4 = SalesIQActivity.this.binding;
                if (iVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    iVar = iVar4;
                }
                MobilistenUtil.r(b10, iVar.f66310i.getBaseFab(), t.f60855E3, 0, null, 24, null);
                return Unit.INSTANCE;
            }
            Td.e eVar4 = Td.e.f11456a;
            SalesIQActivity salesIQActivity5 = SalesIQActivity.this;
            Function1 bVar = new b(salesIQActivity5);
            this.f42644n = null;
            this.f42646p = 2;
            k02 = eVar4.k0(salesIQActivity5, null, bVar, this);
        }
    }

    public static final class f extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f42650n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ com.zoho.livechat.android.modules.conversations.ui.fragments.a f42652p;

        public static final class a extends Lambda implements Function0 {

            /* renamed from: d, reason: collision with root package name */
            public static final a f42653d = new a();

            public a() {
                super(0);
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m117invoke() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m117invoke();
                return Unit.INSTANCE;
            }
        }

        public static final class b extends Lambda implements Function1 {

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ SalesIQActivity f42654d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(SalesIQActivity salesIQActivity) {
                super(1);
                this.f42654d = salesIQActivity;
            }

            public final void a(boolean z10) {
                this.f42654d.isInLoadingState = z10;
                ud.i iVar = null;
                if (z10) {
                    ud.i iVar2 = this.f42654d.binding;
                    if (iVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        iVar2 = null;
                    }
                    p.n(iVar2.f66310i);
                    p.w(this.f42654d.Z());
                    ud.i iVar3 = this.f42654d.binding;
                    if (iVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        iVar = iVar3;
                    }
                    p.w(iVar.f66309h);
                    return;
                }
                ud.i iVar4 = this.f42654d.binding;
                if (iVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    iVar4 = null;
                }
                p.w(iVar4.f66310i);
                p.n(this.f42654d.Z());
                ud.i iVar5 = this.f42654d.binding;
                if (iVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    iVar = iVar5;
                }
                p.n(iVar.f66309h);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.zoho.livechat.android.modules.conversations.ui.fragments.a aVar, Continuation continuation) {
            super(2, continuation);
            this.f42652p = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return SalesIQActivity.this.new f(this.f42652p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((f) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            f fVar;
            Object k10;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f42650n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                ud.i iVar = SalesIQActivity.this.binding;
                if (iVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    iVar = null;
                }
                iVar.f66310i.G0(false, a.f42653d);
                Channel m10 = C6822a.m();
                if ((m10 != null ? m10.getFormType() : null) == Form.Type.Conversation) {
                    this.f42652p.j0();
                    return Unit.INSTANCE;
                }
                com.zoho.livechat.android.modules.brand.ui.helpers.a aVar = com.zoho.livechat.android.modules.brand.ui.helpers.a.f42522a;
                Pe.a aVar2 = Pe.a.Chat;
                b bVar = new b(SalesIQActivity.this);
                this.f42650n = 1;
                fVar = this;
                k10 = com.zoho.livechat.android.modules.brand.ui.helpers.a.k(aVar, aVar2, null, false, bVar, fVar, 4, null);
                if (k10 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                k10 = ((Result) obj).getValue();
                fVar = this;
            }
            if (Result.m154isSuccessimpl(k10)) {
                if (Result.m153isFailureimpl(k10)) {
                    k10 = null;
                }
                Pair pair = (Pair) k10;
                if (pair == null || !((Boolean) pair.getSecond()).booleanValue()) {
                    fVar.f42652p.j0();
                } else {
                    Channel m11 = C6822a.m();
                    if ((m11 != null ? m11.getFormType() : null) == Form.Type.Traditional && com.zoho.livechat.android.modules.brand.ui.helpers.a.N(Md.a.Chat)) {
                        SalesIQActivity salesIQActivity = SalesIQActivity.this;
                        Intent intent = new Intent(SalesIQActivity.this, (Class<?>) PreChatFormActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putString("chid", "temp_chid");
                        String string = bundle.getString("acknowledgement_key", null);
                        if (string != null) {
                            String str = og.i.f(string) ? string : null;
                            if (str != null) {
                                bundle.putString("acknowledgement_key", str);
                            }
                        }
                        intent.putExtras(bundle);
                        salesIQActivity.startActivity(intent);
                    } else {
                        fVar.f42652p.j0();
                    }
                }
            } else {
                LiveChatUtil.triggerChatListener("CHAT_ERROR", null, b.C0961b.f67610j0);
                MobilistenUtil.z(t.f60968X2, 0, 2, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class g extends Lambda implements Function0 {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ConstraintLayout invoke() {
            LayoutInflater layoutInflater = SalesIQActivity.this.getLayoutInflater();
            ud.i iVar = SalesIQActivity.this.binding;
            if (iVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                iVar = null;
            }
            CoordinatorLayout b10 = iVar.b();
            if (b10 == null) {
                b10 = null;
            }
            ud.d c10 = ud.d.c(layoutInflater, b10, false);
            SalesIQActivity salesIQActivity = SalesIQActivity.this;
            Drawable background = c10.f66284e.getBackground();
            Intrinsics.checkNotNull(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            GradientDrawable gradientDrawable = (GradientDrawable) background;
            gradientDrawable.setColor(AbstractC5892d.h(salesIQActivity, Integer.valueOf(AbstractC5886l.f59743M1), 0.0f, 2, null));
            c10.f66285f.setText(salesIQActivity.getString(t.f61101r));
            c10.f66284e.setBackground(gradientDrawable);
            ConstraintLayout b11 = c10.b();
            ud.i iVar2 = SalesIQActivity.this.binding;
            if (iVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                iVar2 = null;
            }
            CoordinatorLayout b12 = iVar2.b();
            CoordinatorLayout coordinatorLayout = b12 != null ? b12 : null;
            if (coordinatorLayout != null) {
                coordinatorLayout.addView(b11);
            }
            return b11;
        }
    }

    public static final class h implements C {
        public h() {
        }

        @Override // androidx.core.view.C
        public boolean c(MenuItem menuItem) {
            Intrinsics.checkNotNullParameter(menuItem, "menuItem");
            if (menuItem.getItemId() == 16908332) {
                SalesIQActivity.this.onBackPressed();
                return true;
            }
            menuItem.getItemId();
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0069, code lost:
        
            if (r2.f66317p.getCurrentItem() == r0) goto L21;
         */
        @Override // androidx.core.view.C
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void d(Menu menu, MenuInflater menuInflater) {
            Intrinsics.checkNotNullParameter(menu, "menu");
            Intrinsics.checkNotNullParameter(menuInflater, "menuInflater");
            menu.clear();
            bg.f Y10 = SalesIQActivity.this.Y();
            int v10 = SalesIQActivity.this.s0() ? SalesIQActivity.this.a0().v(com.zoho.livechat.android.modules.conversations.ui.fragments.a.class) : Y10 instanceof com.zoho.livechat.android.modules.conversations.ui.fragments.a ? 0 : -1;
            if (v10 != -1) {
                Fragment s10 = SalesIQActivity.this.s0() ? SalesIQActivity.this.a0().s(v10) : Y10;
                Intrinsics.checkNotNull(s10, "null cannot be cast to non-null type com.zoho.livechat.android.modules.conversations.ui.fragments.ConversationsBaseFragment");
                com.zoho.livechat.android.modules.conversations.ui.fragments.a aVar = (com.zoho.livechat.android.modules.conversations.ui.fragments.a) s10;
                if (SalesIQActivity.this.s0()) {
                    ud.i iVar = SalesIQActivity.this.binding;
                    if (iVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        iVar = null;
                    }
                }
                if ((Y10 instanceof com.zoho.livechat.android.modules.conversations.ui.fragments.a) && !aVar.g0()) {
                    return;
                }
            }
            if ((Y10 instanceof com.zoho.livechat.android.modules.conversations.ui.fragments.a) || ((Y10 instanceof nf.g) && Intrinsics.areEqual(((nf.g) Y10).j0(), Boolean.TRUE))) {
                SalesIQActivity salesIQActivity = SalesIQActivity.this;
                salesIQActivity.W(menu, salesIQActivity.getActionExpandListener(), SalesIQActivity.this.getQueryTextListener());
            }
        }
    }

    public static final class i extends BroadcastReceiver {
        public i() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String stringExtra = intent != null ? intent.getStringExtra("message") : null;
            if (stringExtra != null) {
                if (StringsKt.equals(stringExtra, "appstatus", true)) {
                    SalesIQActivity.this.l0();
                } else if (StringsKt.equals(stringExtra, "refreshchat", true)) {
                    SalesIQActivity.this.g0();
                }
            }
        }
    }

    public static final class j implements ViewPager.j {
        public j() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void a(int i10, float f10, int i11) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void b(int i10) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void c(int i10) {
            AbstractC5479a supportActionBar;
            AbstractC5479a supportActionBar2;
            View e10;
            View e11;
            SalesIQActivity.this.g0();
            SalesIQActivity.this.l0();
            SalesIQActivity.this.supportInvalidateOptionsMenu();
            ud.i iVar = SalesIQActivity.this.binding;
            if (iVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                iVar = null;
            }
            TabLayout.g z10 = iVar.f66314m.z(i10);
            ImageView imageView = (z10 == null || (e11 = z10.e()) == null) ? null : (ImageView) e11.findViewById(q.f60555i8);
            TextView textView = (z10 == null || (e10 = z10.e()) == null) ? null : (TextView) e10.findViewById(q.f60565j8);
            if (textView != null) {
                textView.setTypeface(C6218a.P());
            }
            if (imageView != null) {
                imageView.setColorFilter(AbstractC5892d.h(SalesIQActivity.this, Integer.valueOf(AbstractC5886l.f59806b3), 0.0f, 2, null), PorterDuff.Mode.SRC_ATOP);
            }
            if (textView != null) {
                textView.setTextColor(AbstractC5892d.h(SalesIQActivity.this, Integer.valueOf(AbstractC5886l.f59811c3), 0.0f, 2, null));
            }
            if (SalesIQActivity.this.a0().s(i10) instanceof com.zoho.livechat.android.modules.conversations.ui.fragments.a) {
                ud.i iVar2 = SalesIQActivity.this.binding;
                if (iVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    iVar2 = null;
                }
                iVar2.f66317p.setPagingEnabled(true);
                if (LiveChatUtil.getConversationTitle() != null && SalesIQActivity.this.getSupportActionBar() != null) {
                    AbstractC5479a supportActionBar3 = SalesIQActivity.this.getSupportActionBar();
                    if (supportActionBar3 != null) {
                        supportActionBar3.D(LiveChatUtil.getConversationTitle());
                    }
                } else if (SalesIQActivity.this.getSupportActionBar() != null && (supportActionBar2 = SalesIQActivity.this.getSupportActionBar()) != null) {
                    supportActionBar2.D(SalesIQActivity.this.getString(t.f60863G));
                }
                ud.i iVar3 = SalesIQActivity.this.binding;
                if (iVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    iVar3 = null;
                }
                TabLayout.g z11 = iVar3.f66314m.z(SalesIQActivity.this.a0().v(nf.g.class));
                if (z11 != null && z11.e() != null) {
                    View e12 = z11.e();
                    ImageView imageView2 = e12 != null ? (ImageView) e12.findViewById(q.f60555i8) : null;
                    if (imageView2 != null) {
                        imageView2.setColorFilter(AbstractC5892d.h(SalesIQActivity.this, Integer.valueOf(AbstractC5886l.f59821e3), 0.0f, 2, null), PorterDuff.Mode.SRC_ATOP);
                    }
                    View e13 = z11.e();
                    TextView textView2 = e13 != null ? (TextView) e13.findViewById(q.f60565j8) : null;
                    if (textView2 != null) {
                        textView2.setTypeface(C6218a.P());
                    }
                    if (textView2 != null) {
                        textView2.setTextColor(AbstractC5892d.h(SalesIQActivity.this, Integer.valueOf(AbstractC5886l.f59826f3), 0.0f, 2, null));
                    }
                }
            } else if (SalesIQActivity.this.a0().s(i10) instanceof nf.g) {
                bg.f Y10 = SalesIQActivity.this.Y();
                if (Y10 instanceof nf.g) {
                    if (SalesIQActivity.this.getSupportActionBar() != null && (supportActionBar = SalesIQActivity.this.getSupportActionBar()) != null) {
                        supportActionBar.D(((nf.g) Y10).k0());
                    }
                    ud.i iVar4 = SalesIQActivity.this.binding;
                    if (iVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        iVar4 = null;
                    }
                    iVar4.f66317p.setPagingEnabled(((nf.g) Y10).h0());
                } else {
                    ud.i iVar5 = SalesIQActivity.this.binding;
                    if (iVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        iVar5 = null;
                    }
                    iVar5.f66317p.setPagingEnabled(false);
                }
                ud.i iVar6 = SalesIQActivity.this.binding;
                if (iVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    iVar6 = null;
                }
                TabLayout.g z12 = iVar6.f66314m.z(SalesIQActivity.this.a0().v(com.zoho.livechat.android.modules.conversations.ui.fragments.a.class));
                if (z12 != null && z12.e() != null) {
                    View e14 = z12.e();
                    ImageView imageView3 = e14 != null ? (ImageView) e14.findViewById(q.f60555i8) : null;
                    if (imageView3 != null) {
                        imageView3.setColorFilter(AbstractC5892d.h(SalesIQActivity.this, Integer.valueOf(AbstractC5886l.f59821e3), 0.0f, 2, null), PorterDuff.Mode.SRC_ATOP);
                    }
                    View e15 = z12.e();
                    TextView textView3 = e15 != null ? (TextView) e15.findViewById(q.f60565j8) : null;
                    if (textView3 != null) {
                        textView3.setTypeface(C6218a.P());
                    }
                    if (textView3 != null) {
                        textView3.setTextColor(AbstractC5892d.h(SalesIQActivity.this, Integer.valueOf(AbstractC5886l.f59826f3), 0.0f, 2, null));
                    }
                }
            }
            SalesIQActivity.this.invalidateOptionsMenu();
            SalesIQActivity.this.D0();
        }
    }

    public static final class k implements SearchView.m {
        public k() {
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean p(String newText) {
            boolean z10;
            nf.e l02;
            Intrinsics.checkNotNullParameter(newText, "newText");
            if (SalesIQActivity.this.s0()) {
                if (SalesIQActivity.this.a0().w(com.zoho.livechat.android.modules.conversations.ui.fragments.a.class)) {
                    Zf.m a02 = SalesIQActivity.this.a0();
                    ud.i iVar = SalesIQActivity.this.binding;
                    if (iVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        iVar = null;
                    }
                    if (a02.s(iVar.f66317p.getCurrentItem()) instanceof com.zoho.livechat.android.modules.conversations.ui.fragments.a) {
                        z10 = true;
                    }
                }
                z10 = false;
            } else {
                z10 = SalesIQActivity.this.Y() instanceof com.zoho.livechat.android.modules.conversations.ui.fragments.a;
            }
            if (z10) {
                bg.f Y10 = SalesIQActivity.this.Y();
                com.zoho.livechat.android.modules.conversations.ui.fragments.a aVar = Y10 instanceof com.zoho.livechat.android.modules.conversations.ui.fragments.a ? (com.zoho.livechat.android.modules.conversations.ui.fragments.a) Y10 : null;
                if (!Intrinsics.areEqual(SalesIQActivity.this.getSearchQuery(), StringsKt.trim((CharSequence) newText).toString()) && aVar != null) {
                    aVar.k0(newText);
                }
            } else {
                bg.f Y11 = SalesIQActivity.this.Y();
                if ((Y11 instanceof nf.g) && (l02 = ((nf.g) Y11).l0()) != null) {
                    l02.y1(newText);
                }
            }
            SalesIQActivity.this.w0(StringsKt.trim((CharSequence) newText).toString());
            return true;
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean t(String query) {
            Intrinsics.checkNotNullParameter(query, "query");
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B0() {
        AbstractC5479a abstractC5479a;
        bg.f Y10 = Y();
        if (Y10 instanceof com.zoho.livechat.android.modules.conversations.ui.fragments.a) {
            if (LiveChatUtil.getConversationTitle() != null) {
                AbstractC5479a abstractC5479a2 = this.actionBar;
                if (abstractC5479a2 != null) {
                    abstractC5479a2.D(LiveChatUtil.getConversationTitle());
                }
            } else {
                AbstractC5479a abstractC5479a3 = this.actionBar;
                if (abstractC5479a3 != null) {
                    abstractC5479a3.D(getString(t.f60863G));
                }
                ud.i iVar = this.binding;
                if (iVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    iVar = null;
                }
                iVar.f66312k.setTitle(getString(t.f60863G));
            }
        } else if ((Y10 instanceof nf.g) && (abstractC5479a = this.actionBar) != null) {
            abstractC5479a.D(LiveChatUtil.getCustomArticleTitle() != null ? LiveChatUtil.getCustomArticleTitle() : getString(t.f61045i5));
        }
        LiveChatUtil.applyFontForToolbarTitle(getToolbar());
        AbstractC5479a abstractC5479a4 = this.actionBar;
        if (abstractC5479a4 == null) {
            return;
        }
        abstractC5479a4.B(null);
    }

    public static final F0 i0(SalesIQActivity this$0, View v10, F0 insets) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(v10, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        this$0.E0(insets);
        if (!LiveChatUtil.isConversationEnabled()) {
            ud.i iVar = this$0.binding;
            if (iVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                iVar = null;
            }
            iVar.f66310i.x0();
        }
        return AbstractC2082d0.X(v10, insets);
    }

    public static final void t0(SalesIQActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.g0();
        this$0.n0();
        this$0.l0();
        this$0.B0();
        this$0.m0();
    }

    public static final void u0(Function0 tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke();
    }

    public final void A0(int visibility) {
        ud.i iVar = null;
        if (!(Y() instanceof w)) {
            ud.i iVar2 = this.binding;
            if (iVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                iVar2 = null;
            }
            if (iVar2.f66317p.getChildCount() <= 1) {
                if (visibility != 0) {
                    ud.i iVar3 = this.binding;
                    if (iVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        iVar = iVar3;
                    }
                    iVar.f66314m.setVisibility(8);
                    return;
                }
                return;
            }
        }
        ud.i iVar4 = this.binding;
        if (iVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            iVar = iVar4;
        }
        iVar.f66314m.setVisibility(visibility);
    }

    public final void C0(boolean value) {
        ud.i iVar = this.binding;
        if (iVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            iVar = null;
        }
        iVar.f66317p.setPagingEnabled(value);
    }

    @Override // Yf.c
    public ViewGroup D() {
        ud.i iVar = this.binding;
        if (iVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            iVar = null;
        }
        ConstraintLayout childLayout = iVar.f66303b;
        Intrinsics.checkNotNullExpressionValue(childLayout, "childLayout");
        return childLayout;
    }

    public final void D0() {
        nf.e l02;
        if (a0().w(nf.g.class)) {
            ud.i iVar = this.binding;
            if (iVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                iVar = null;
            }
            if (iVar.f66317p.getCurrentItem() == a0().v(nf.g.class)) {
                bg.f Y10 = Y();
                if (!(Y10 instanceof nf.g) || (l02 = ((nf.g) Y10).l0()) == null) {
                    return;
                }
                l02.E1(false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0071  */
    @Override // Yf.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void E(F0 insetsCompat) {
        Boolean bool;
        Integer valueOf;
        Display display;
        Intrinsics.checkNotNullParameter(insetsCompat, "insetsCompat");
        androidx.core.graphics.e c10 = og.q.c(insetsCompat);
        androidx.core.graphics.e b10 = og.q.b(insetsCompat);
        androidx.core.graphics.e a10 = og.q.a(insetsCompat);
        boolean q10 = insetsCompat.q(F0.p.b());
        boolean z10 = getResources().getConfiguration().orientation == 2;
        int i10 = c10.f19098a + a10.f19098a;
        int i11 = c10.f19100c + a10.f19100c;
        if (!z10) {
            bool = null;
        } else if (Build.VERSION.SDK_INT >= 30) {
            display = getDisplay();
            if (display != null) {
                valueOf = Integer.valueOf(display.getRotation());
                bool = Boolean.valueOf(valueOf != null && valueOf.intValue() == 1);
            }
            valueOf = null;
            if (valueOf != null) {
                bool = Boolean.valueOf(valueOf != null && valueOf.intValue() == 1);
            }
            bool = Boolean.valueOf(valueOf != null && valueOf.intValue() == 1);
        } else {
            Object systemService = getSystemService("window");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            if (defaultDisplay != null) {
                valueOf = Integer.valueOf(defaultDisplay.getRotation());
                bool = Boolean.valueOf(valueOf != null && valueOf.intValue() == 1);
            }
            valueOf = null;
            bool = Boolean.valueOf(valueOf != null && valueOf.intValue() == 1);
        }
        Integer valueOf2 = Integer.valueOf(i10);
        if (!Intrinsics.areEqual(bool, Boolean.FALSE)) {
            valueOf2 = null;
        }
        int k10 = og.i.k(valueOf2);
        Integer valueOf3 = Integer.valueOf(i11);
        if (!Intrinsics.areEqual(bool, Boolean.TRUE)) {
            valueOf3 = null;
        }
        int k11 = og.i.k(valueOf3);
        ud.i iVar = this.binding;
        if (iVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            iVar = null;
        }
        iVar.f66304c.setPadding(k10, 0, k11, b10.f19101d);
        ud.i iVar2 = this.binding;
        if (iVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            iVar2 = null;
        }
        ConstraintLayout childLayout = iVar2.f66303b;
        Intrinsics.checkNotNullExpressionValue(childLayout, "childLayout");
        ViewGroup.LayoutParams layoutParams = childLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = c10.f19099b + og.i.m(Float.valueOf(getResources().getDimension(o.f59942i)));
        Integer valueOf4 = Integer.valueOf(c10.f19101d);
        if (q10) {
            valueOf4 = null;
        }
        marginLayoutParams.bottomMargin = og.i.k(valueOf4);
        childLayout.setLayoutParams(marginLayoutParams);
        ud.i iVar3 = this.binding;
        if (iVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            iVar3 = null;
        }
        MaterialToolbar siqLiveChatToolbar = iVar3.f66312k;
        Intrinsics.checkNotNullExpressionValue(siqLiveChatToolbar, "siqLiveChatToolbar");
        ViewGroup.LayoutParams layoutParams2 = siqLiveChatToolbar.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.topMargin = c10.f19099b;
        marginLayoutParams2.setMarginStart(k11);
        marginLayoutParams2.setMarginEnd(k10);
        siqLiveChatToolbar.setLayoutParams(marginLayoutParams2);
        ud.i iVar4 = this.binding;
        if (iVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            iVar4 = null;
        }
        ConstraintLayout constraintLayout = iVar4.f66303b;
        ud.i iVar5 = this.binding;
        if (iVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            iVar5 = null;
        }
        int paddingTop = iVar5.f66303b.getPaddingTop();
        ud.i iVar6 = this.binding;
        if (iVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            iVar6 = null;
        }
        constraintLayout.setPadding(k11, paddingTop, k10, iVar6.f66303b.getPaddingBottom());
        ud.i iVar7 = this.binding;
        if (iVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            iVar7 = null;
        }
        MobilistenToggleFAB mobilistenToggleFAB = iVar7.f66310i;
        Float valueOf5 = Float.valueOf(AbstractC5892d.k(this, R.attr.actionBarSize));
        if (!s0()) {
            valueOf5 = null;
        }
        int m10 = og.i.m(valueOf5) + c10.f19101d;
        int i12 = bool != null ? k10 : 0;
        Intrinsics.checkNotNull(mobilistenToggleFAB);
        p.B(mobilistenToggleFAB, 0, 0, i12, m10, 3, null);
        Window window = getWindow();
        if (window != null) {
            int h10 = AbstractC5892d.h(this, Integer.valueOf(AbstractC5886l.f59832h), 0.0f, 2, null);
            boolean l10 = com.zoho.livechat.android.utils.P.l(this);
            String j10 = com.zoho.livechat.android.utils.P.j(this);
            h1 a11 = AbstractC2109r0.a(getWindow(), getWindow().getDecorView());
            Intrinsics.checkNotNullExpressionValue(a11, "getInsetsController(...)");
            a11.e(StringsKt.equals("LIGHT", j10, true));
            a11.d(!l10);
            if (getResources().getConfiguration().orientation == 2) {
                window.setNavigationBarColor(h10);
            } else {
                window.setNavigationBarColor(0);
            }
            if (Build.VERSION.SDK_INT >= 29) {
                window.setNavigationBarContrastEnforced(getResources().getConfiguration().orientation == 2);
                window.setStatusBarContrastEnforced(false);
            }
        }
    }

    public final void E0(F0 insets) {
        if (insets != null) {
            boolean q10 = insets.q(F0.p.b());
            if (!this.isMenuCollapsed || q10) {
                return;
            }
            A0(0);
            AbstractC2082d0.x0(getWindow().getDecorView().getRootView(), null);
        }
    }

    public final boolean V() {
        return !LiveChatUtil.isHideWhenOffline() && LiveChatUtil.isChatEnabled() && LiveChatUtil.enableChatInOfflineMode() && com.zoho.livechat.android.modules.brand.ui.helpers.a.M();
    }

    public final void W(Menu menu, MenuItem.OnActionExpandListener onActionExpandListener, SearchView.m onQueryTextListener) {
        Drawable drawable;
        Object m147constructorimpl;
        Intrinsics.checkNotNullParameter(menu, "menu");
        getMenuInflater().inflate(s.f60826c, menu);
        MenuItem findItem = menu.findItem(q.f60470b);
        ud.i iVar = this.binding;
        if (iVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            iVar = null;
        }
        if (StringsKt.equals(com.zoho.livechat.android.utils.P.j(iVar.f66317p.getContext()), "DARKACTIONBAR", true)) {
            Object systemService = getSystemService("search");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.SearchManager");
            SearchManager searchManager = (SearchManager) systemService;
            SearchView searchView = (SearchView) menu.findItem(q.f60470b).getActionView();
            if (searchView != null) {
                searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
            }
            AutoCompleteTextView autoCompleteTextView = searchView != null ? (AutoCompleteTextView) searchView.findViewById(l.f.f55083E) : null;
            try {
                Result.Companion companion = Result.INSTANCE;
                Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
                declaredField.setAccessible(true);
                declaredField.set(autoCompleteTextView, Integer.valueOf(od.p.f60052V3));
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
        Drawable icon = findItem.getIcon();
        if (icon != null) {
            icon.setColorFilter(new PorterDuffColorFilter(AbstractC5892d.h(this, Integer.valueOf(AbstractC5886l.f59856l3), 0.0f, 2, null), PorterDuff.Mode.SRC_ATOP));
        }
        SearchView searchView2 = (SearchView) findItem.getActionView();
        if (searchView2 != null) {
            searchView2.setOnQueryTextListener(onQueryTextListener);
        }
        if (searchView2 != null) {
            searchView2.setIconifiedByDefault(false);
        }
        if (this.shouldRestoreSearchUi) {
            this.shouldRestoreSearchUi = false;
            findItem.expandActionView();
            if (searchView2 != null) {
                searchView2.b0(this.articlesSearchQuery, false);
            }
        }
        if (searchView2 != null) {
            searchView2.setQueryHint(getString(t.f61089p0) + "...");
        }
        if (searchView2 != null) {
            searchView2.setMaxWidth(Integer.MAX_VALUE);
        }
        EditText editText = searchView2 != null ? (EditText) searchView2.findViewById(l.f.f55083E) : null;
        ViewGroup.LayoutParams layoutParams = editText != null ? editText.getLayoutParams() : null;
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (editText != null) {
            editText.setTypeface(C6218a.P());
        }
        if (marginLayoutParams != null) {
            marginLayoutParams.setMarginStart(0);
        }
        if (editText != null) {
            editText.setLayoutParams(marginLayoutParams);
        }
        if (editText != null) {
            editText.setPadding(0, editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
        }
        if (editText != null) {
            editText.setCompoundDrawablePadding(0);
        }
        if (Build.VERSION.SDK_INT >= 29 && editText != null) {
            Resources resources = editText.getResources();
            if (resources != null) {
                int i10 = od.p.f60052V3;
                Context context = editText.getContext();
                drawable = androidx.core.content.res.k.f(resources, i10, context != null ? context.getTheme() : null);
            } else {
                drawable = null;
            }
            editText.setTextCursorDrawable(drawable);
        }
        ImageView imageView = searchView2 != null ? (ImageView) searchView2.findViewById(l.f.f55081C) : null;
        if (imageView != null) {
            imageView.setLayoutParams(new LinearLayout.LayoutParams(0, 0));
        }
        findItem.setOnActionExpandListener(onActionExpandListener);
    }

    /* renamed from: X, reason: from getter */
    public final MenuItem.OnActionExpandListener getActionExpandListener() {
        return this.actionExpandListener;
    }

    public final bg.f Y() {
        W w10;
        if (!s0()) {
            List C02 = getSupportFragmentManager().C0();
            Intrinsics.checkNotNullExpressionValue(C02, "getFragments(...)");
            w10 = (Fragment) CollectionsKt.firstOrNull(C02);
        } else if (getSupportFragmentManager().C0().size() == 2) {
            Zf.m a02 = a0();
            ud.i iVar = this.binding;
            if (iVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                iVar = null;
            }
            W s10 = a02.s(iVar.f66317p.getCurrentItem());
            Intrinsics.checkNotNull(s10, "null cannot be cast to non-null type com.zoho.livechat.android.ui.fragments.BaseFragment");
            w10 = (bg.f) s10;
        } else {
            List C03 = getSupportFragmentManager().C0();
            Intrinsics.checkNotNullExpressionValue(C03, "getFragments(...)");
            w10 = (Fragment) CollectionsKt.lastOrNull(C03);
        }
        if (w10 instanceof bg.f) {
            return (bg.f) w10;
        }
        return null;
    }

    public final ConstraintLayout Z() {
        return (ConstraintLayout) this.loadingDialogView.getValue();
    }

    public final Zf.m a0() {
        Zf.m mVar = this.pagerAdapter;
        if (mVar != null) {
            return mVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pagerAdapter");
        return null;
    }

    /* renamed from: b0, reason: from getter */
    public final SearchView.m getQueryTextListener() {
        return this.queryTextListener;
    }

    /* renamed from: c0, reason: from getter */
    public final String getSearchQuery() {
        return this.searchQuery;
    }

    public final boolean d0() {
        Bundle extras;
        Intent intent = getIntent();
        return Intrinsics.areEqual((intent == null || (extras = intent.getExtras()) == null) ? null : extras.getString("navigate_to"), "calls_form");
    }

    public final ZohoSalesIQ.l e0(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        for (ZohoSalesIQ.l lVar : (ZohoSalesIQ.l[]) a.f42624a.toArray(new ZohoSalesIQ.l[0])) {
            if (Intrinsics.areEqual(lVar.name(), bundle.getString("tab"))) {
                return lVar;
            }
        }
        return null;
    }

    public final int f0() {
        ud.i iVar = this.binding;
        if (iVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            iVar = null;
        }
        return iVar.f66317p.getCurrentItem();
    }

    public final void g0() {
        AbstractC1459k.d(AbstractC2194t.a(this), null, null, new d(null), 3, null);
    }

    public final Toolbar getToolbar() {
        ud.i iVar = this.binding;
        if (iVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            iVar = null;
        }
        MaterialToolbar siqLiveChatToolbar = iVar.f66312k;
        Intrinsics.checkNotNullExpressionValue(siqLiveChatToolbar, "siqLiveChatToolbar");
        return siqLiveChatToolbar;
    }

    public final void h0(MenuItem item) {
        this.isMenuCollapsed = true;
        A0(0);
        ud.i iVar = this.binding;
        ud.i iVar2 = null;
        if (iVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            iVar = null;
        }
        p.w(iVar.f66310i);
        ud.i iVar3 = this.binding;
        if (iVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            iVar2 = iVar3;
        }
        iVar2.f66317p.setPagingEnabled(true);
        View rootView = getWindow().getDecorView().getRootView();
        AbstractC2082d0.x0(rootView, new J() { // from class: oe.f
            @Override // androidx.core.view.J
            public final F0 f(View view, F0 f02) {
                F0 i02;
                i02 = SalesIQActivity.i0(SalesIQActivity.this, view, f02);
                return i02;
            }
        });
        E0(AbstractC2082d0.G(rootView));
        bg.f Y10 = Y();
        if (Y10 != null) {
            Y10.e0(item);
        }
    }

    public final void j0(MenuItem item) {
        this.isMenuCollapsed = false;
        ud.i iVar = this.binding;
        ud.i iVar2 = null;
        if (iVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            iVar = null;
        }
        p.n(iVar.f66314m);
        ud.i iVar3 = this.binding;
        if (iVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            iVar3 = null;
        }
        p.n(iVar3.f66310i);
        ud.i iVar4 = this.binding;
        if (iVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            iVar4 = null;
        }
        iVar4.f66317p.setPagingEnabled(false);
        bg.f Y10 = Y();
        if (Y10 != null) {
            Y10.f0(item);
        }
        if (LiveChatUtil.isConversationEnabled()) {
            return;
        }
        ud.i iVar5 = this.binding;
        if (iVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            iVar2 = iVar5;
        }
        iVar2.f66310i.x0();
    }

    public final void l0() {
        TextView textView = null;
        if (!(Y() instanceof com.zoho.livechat.android.modules.conversations.ui.fragments.a)) {
            TextView textView2 = this.offlineMessageTextView;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("offlineMessageTextView");
            } else {
                textView = textView2;
            }
            textView.setVisibility(8);
            return;
        }
        if ((LiveChatUtil.getEmbedStatus() && !LiveChatUtil.isSDKDisabledWithOutsideBusinessHoursAndOffline()) || !Q.i()) {
            TextView textView3 = this.offlineMessageTextView;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("offlineMessageTextView");
            } else {
                textView = textView3;
            }
            textView.setVisibility(8);
            return;
        }
        TextView textView4 = this.offlineMessageTextView;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("offlineMessageTextView");
            textView4 = null;
        }
        textView4.setVisibility(0);
        TextView textView5 = this.offlineMessageTextView;
        if (textView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("offlineMessageTextView");
        } else {
            textView = textView5;
        }
        textView.setText(LiveChatUtil.getOfflineMessage(getBaseContext()));
    }

    public final void m0() {
        if (s0() && ((Y() instanceof com.zoho.livechat.android.modules.conversations.ui.fragments.a) || (Y() instanceof nf.g))) {
            A0(0);
        } else {
            A0(8);
        }
    }

    public final void n0() {
        if (s0()) {
            boolean z10 = getSupportFragmentManager().C0().size() == 2;
            C0(z10);
            ud.i iVar = this.binding;
            if (iVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                iVar = null;
            }
            iVar.f66306e.setBackgroundColor(AbstractC5892d.h(this, Integer.valueOf(z10 ? AbstractC5886l.f59816d3 : AbstractC5886l.f59767S1), 0.0f, 2, null));
        }
    }

    public final void o0() {
        ud.i iVar = this.binding;
        ud.i iVar2 = null;
        if (iVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            iVar = null;
        }
        p.n(iVar.f66314m);
        ud.i iVar3 = this.binding;
        if (iVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            iVar3 = null;
        }
        p.w(iVar3.f66311j);
        ud.i iVar4 = this.binding;
        if (iVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            iVar2 = iVar4;
        }
        p.n(iVar2.f66317p);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (s0()) {
            bg.f Y10 = Y();
            if (Y10 instanceof nf.g) {
                bg.f Y11 = Y();
                if (Y11 == null || Y11.onBackPressed()) {
                    return;
                }
                super.onBackPressed();
                return;
            }
            if (!(Y10 instanceof w)) {
                super.onBackPressed();
                return;
            }
            bg.f Y12 = Y();
            Intrinsics.checkNotNull(Y12, "null cannot be cast to non-null type com.zoho.livechat.android.modules.conversations.ui.fragments.PrechatFormFragment");
            ((w) Y12).onBackPressed();
            return;
        }
        if (getSupportFragmentManager().w0() > 1) {
            super.onBackPressed();
            return;
        }
        if (getSupportFragmentManager().w0() != 1) {
            finish();
            return;
        }
        if (!(Y() instanceof nf.g)) {
            finish();
            return;
        }
        bg.f Y13 = Y();
        if (Y13 == null || Y13.onBackPressed()) {
            return;
        }
        finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007c  */
    @Override // Yf.c, androidx.fragment.app.AbstractActivityC2168s, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(Bundle savedInstanceState) {
        String string;
        String string2;
        String str;
        super.onCreate(savedInstanceState);
        ud.i c10 = ud.i.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(c10, "inflate(...)");
        this.binding = c10;
        if (c10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c10 = null;
        }
        setContentView(c10.b());
        A();
        this.viewModel = (SalesIQViewModel) new U(this).a(SalesIQViewModel.class);
        addMenuProvider(this.menuProvider);
        boolean booleanExtra = getIntent().getBooleanExtra("open_chat_window", false);
        Bundle extras = getIntent().getExtras();
        if (booleanExtra) {
            if (extras != null) {
                if (extras.getString("chid") != null) {
                    str = extras.getString("chid");
                } else if (extras.getString("chat_id") != null) {
                    str = extras.getString("chat_id");
                }
                String str2 = str != null ? str : "temp_chid";
                Intent intent = new Intent(this, (Class<?>) ChatActivity.class);
                if (extras == null) {
                    extras = new Bundle();
                }
                extras.putString("chid", str2);
                intent.putExtras(extras);
                startActivity(intent);
                Intent intent2 = getIntent();
                intent2.removeExtra("open_chat_window");
                setIntent(intent2);
            }
            str = "temp_chid";
            if (str != null) {
            }
            Intent intent3 = new Intent(this, (Class<?>) ChatActivity.class);
            if (extras == null) {
            }
            extras.putString("chid", str2);
            intent3.putExtras(extras);
            startActivity(intent3);
            Intent intent22 = getIntent();
            intent22.removeExtra("open_chat_window");
            setIntent(intent22);
        }
        Bundle bundle = extras;
        LiveChatUtil.triggerSalesIQListener("SUPPORT_OPEN", null, null);
        rd.b.p(true);
        ud.i iVar = this.binding;
        if (iVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            iVar = null;
        }
        setSupportActionBar(iVar.f66312k);
        AbstractC5479a supportActionBar = getSupportActionBar();
        this.actionBar = supportActionBar;
        if (supportActionBar != null) {
            supportActionBar.u(true);
        }
        AbstractC5479a abstractC5479a = this.actionBar;
        if (abstractC5479a != null) {
            abstractC5479a.y(true);
        }
        AbstractC5479a abstractC5479a2 = this.actionBar;
        if (abstractC5479a2 != null) {
            abstractC5479a2.t(true);
        }
        if (s0()) {
            ud.i iVar2 = this.binding;
            if (iVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                iVar2 = null;
            }
            iVar2.f66317p.setRotationY(MobilistenUtil.m() ? 180.0f : 0.0f);
        } else {
            ud.i iVar3 = this.binding;
            if (iVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                iVar3 = null;
            }
            iVar3.f66311j.setRotationY(MobilistenUtil.m() ? 180.0f : 0.0f);
        }
        View findViewById = findViewById(q.f60723z6);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        TextView textView = (TextView) findViewById;
        this.offlineMessageTextView = textView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("offlineMessageTextView");
            textView = null;
        }
        textView.setTypeface(C6218a.P());
        getSupportFragmentManager().n(new FragmentManager.m() { // from class: oe.d
            @Override // androidx.fragment.app.FragmentManager.m
            public final void onBackStackChanged() {
                SalesIQActivity.t0(SalesIQActivity.this);
            }
        });
        Td.e eVar = Td.e.f11456a;
        ud.i iVar4 = this.binding;
        if (iVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            iVar4 = null;
        }
        ConstraintLayout childLayout = iVar4.f66303b;
        Intrinsics.checkNotNullExpressionValue(childLayout, "childLayout");
        boolean equals = StringsKt.equals(com.zoho.livechat.android.utils.P.j(this), "DARK", true);
        ud.i iVar5 = this.binding;
        if (iVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            iVar5 = null;
        }
        int id2 = iVar5.f66305d.getId();
        ud.i iVar6 = this.binding;
        if (iVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            iVar6 = null;
        }
        eVar.o(childLayout, this, equals, id2, iVar6.f66313l.getId());
        ZohoSalesIQ.l e02 = e0(bundle);
        if (s0()) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            boolean isConversationEnabled = LiveChatUtil.isConversationEnabled();
            boolean isArticlesEnabled = LiveChatUtil.isArticlesEnabled();
            String string3 = bundle != null ? bundle.getString(StackTraceHelper.ID_KEY) : null;
            final Function0 function0 = this.baseFragmentBackStackChangeListener;
            v0(new Zf.m(supportFragmentManager, isConversationEnabled, isArticlesEnabled, e02, string3, new FragmentManager.m() { // from class: oe.e
                @Override // androidx.fragment.app.FragmentManager.m
                public final void onBackStackChanged() {
                    SalesIQActivity.u0(Function0.this);
                }
            }));
            n0();
            ud.i iVar7 = this.binding;
            if (iVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                iVar7 = null;
            }
            p.w(iVar7.f66317p);
            ud.i iVar8 = this.binding;
            if (iVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                iVar8 = null;
            }
            p.n(iVar8.f66311j);
            ud.i iVar9 = this.binding;
            if (iVar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                iVar9 = null;
            }
            iVar9.f66317p.setAdapter(a0());
            if (e02 != null) {
                ud.i iVar10 = this.binding;
                if (iVar10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    iVar10 = null;
                }
                iVar10.f66314m.setVisibility(8);
            }
            ud.i iVar11 = this.binding;
            if (iVar11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                iVar11 = null;
            }
            iVar11.f66314m.setSelectedTabIndicatorHeight(C6218a.b(3.0f));
            ud.i iVar12 = this.binding;
            if (iVar12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                iVar12 = null;
            }
            iVar12.f66314m.setSelectedTabIndicatorColor(AbstractC5892d.h(this, Integer.valueOf(AbstractC5886l.f59806b3), 0.0f, 2, null));
            ud.i iVar13 = this.binding;
            if (iVar13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                iVar13 = null;
            }
            iVar13.f66314m.bringToFront();
            if (a0().u().size() > 1) {
                p0();
            } else {
                ud.i iVar14 = this.binding;
                if (iVar14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    iVar14 = null;
                }
                iVar14.f66314m.setVisibility(8);
            }
            ud.i iVar15 = this.binding;
            if (iVar15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                iVar15 = null;
            }
            iVar15.f66317p.c(new j());
            g0();
            if (Intrinsics.areEqual(bundle != null ? bundle.getString("navigate_to") : null, "calls_form")) {
                q0();
            }
            if (Y() instanceof w) {
                A0(8);
            } else {
                A0(0);
            }
        } else if (d0()) {
            o0();
            q0();
            o0();
        } else if (LiveChatUtil.isConversationEnabled() && (e02 == null || e02 == ZohoSalesIQ.l.Conversations)) {
            N s10 = getSupportFragmentManager().s();
            ud.i iVar16 = this.binding;
            if (iVar16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                iVar16 = null;
            }
            int id3 = iVar16.f66311j.getId();
            com.zoho.livechat.android.modules.conversations.ui.fragments.a aVar = new com.zoho.livechat.android.modules.conversations.ui.fragments.a();
            if (bundle != null && (string2 = bundle.getString(StackTraceHelper.ID_KEY)) != null) {
                Bundle arguments = aVar.getArguments();
                if (arguments == null) {
                    arguments = new Bundle();
                }
                arguments.putString("chat_id", string2);
                aVar.setArguments(arguments);
            }
            Unit unit = Unit.INSTANCE;
            s10.o(id3, aVar).g(null).i();
            o0();
        } else if (LiveChatUtil.isArticlesEnabled() && (e02 == null || e02 == ZohoSalesIQ.l.KnowledgeBase)) {
            N s11 = getSupportFragmentManager().s();
            ud.i iVar17 = this.binding;
            if (iVar17 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                iVar17 = null;
            }
            int id4 = iVar17.f66311j.getId();
            nf.g gVar = new nf.g();
            Bundle arguments2 = gVar.getArguments();
            if (arguments2 == null) {
                arguments2 = new Bundle();
            }
            if (bundle != null && (string = bundle.getString(StackTraceHelper.ID_KEY)) != null) {
                arguments2.putString("resource_id", string);
            }
            arguments2.putBoolean("invoked_from_present_api", true);
            arguments2.putBoolean("is_first_page", true);
            gVar.setArguments(arguments2);
            Unit unit2 = Unit.INSTANCE;
            s11.o(id4, gVar).g(null).i();
            g0();
        } else {
            startActivity(new Intent(this, (Class<?>) ChatActivity.class));
            finish();
        }
        l0();
    }

    @Override // m.AbstractActivityC5481c, androidx.fragment.app.AbstractActivityC2168s, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        LiveChatUtil.triggerSalesIQListener("SUPPORT_CLOSE", null, null);
        rd.b.p(false);
    }

    @Override // Yf.c, androidx.fragment.app.AbstractActivityC2168s, android.app.Activity
    public void onPause() {
        super.onPause();
        C1908a.b(this).e(this.mobilistenChatBroadcastReceiver);
    }

    @Override // Yf.c, androidx.fragment.app.AbstractActivityC2168s, android.app.Activity
    public void onResume() {
        super.onResume();
        C1908a.b(this).c(this.mobilistenChatBroadcastReceiver, new IntentFilter("receivelivechat"));
        if (!LiveChatUtil.isEmbedAllowed() || !LiveChatUtil.isAppEnabled()) {
            finish();
        }
        l0();
        B0();
        supportInvalidateOptionsMenu();
        if (getIntent().getBooleanExtra("open_call_screen", false)) {
            Td.e.r0(this);
            getIntent().removeExtra("open_call_screen");
        }
    }

    public final void p0() {
        ud.i iVar = this.binding;
        if (iVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            iVar = null;
        }
        iVar.f66314m.setTabGravity(0);
        ud.i iVar2 = this.binding;
        if (iVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            iVar2 = null;
        }
        iVar2.f66314m.setTabMode(1);
        ud.i iVar3 = this.binding;
        if (iVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            iVar3 = null;
        }
        TabLayout tabLayout = iVar3.f66314m;
        ud.i iVar4 = this.binding;
        if (iVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            iVar4 = null;
        }
        tabLayout.setupWithViewPager(iVar4.f66317p);
        ud.i iVar5 = this.binding;
        if (iVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            iVar5 = null;
        }
        iVar5.f66314m.setSelectedTabIndicatorColor(AbstractC5892d.h(this, Integer.valueOf(AbstractC5886l.f59806b3), 0.0f, 2, null));
        int d10 = a0().d();
        for (int i10 = 0; i10 < d10; i10++) {
            if (a0().s(i10) instanceof com.zoho.livechat.android.modules.conversations.ui.fragments.a) {
                ud.i iVar6 = this.binding;
                if (iVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    iVar6 = null;
                }
                TabLayout.g z10 = iVar6.f66314m.z(i10);
                int i11 = od.p.f60114j;
                String string = getString(t.f60863G);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                z0(i10, z10, i11, string);
            } else if (a0().s(i10) instanceof nf.g) {
                ud.i iVar7 = this.binding;
                if (iVar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    iVar7 = null;
                }
                TabLayout.g z11 = iVar7.f66314m.z(i10);
                String customArticleTitle = LiveChatUtil.getCustomArticleTitle();
                if (customArticleTitle == null || customArticleTitle.length() == 0) {
                    customArticleTitle = getString(t.f61046j);
                }
                int i12 = od.p.f59958D;
                Intrinsics.checkNotNull(customArticleTitle);
                z0(i10, z11, i12, customArticleTitle);
            }
        }
    }

    public final void q0() {
        AbstractC1459k.d(AbstractC2194t.a(this), null, null, new e(null), 3, null);
    }

    public final void r0(com.zoho.livechat.android.modules.conversations.ui.fragments.a currentFragment) {
        AbstractC1459k.d(AbstractC2194t.a(this), null, null, new f(currentFragment, null), 3, null);
    }

    public final boolean s0() {
        if (!LiveChatUtil.isConversationEnabled() || !LiveChatUtil.isArticlesEnabled() || d0()) {
            return false;
        }
        Intent intent = getIntent();
        return e0(intent != null ? intent.getExtras() : null) == null;
    }

    public final void v0(Zf.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<set-?>");
        this.pagerAdapter = mVar;
    }

    public final void w0(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.searchQuery = str;
    }

    public final void x0(String text) {
        y0(text, false);
    }

    public final void y0(String text, boolean shouldRestoreSearchUi) {
        this.articlesSearchQuery = text;
        this.shouldRestoreSearchUi = shouldRestoreSearchUi;
    }

    public final void z0(int index, TabLayout.g tab, int tabIconId, String tabTitleText) {
        if (tab != null) {
            tab.n(r.f60735E0);
            if (tab.e() != null) {
                View e10 = tab.e();
                ImageView imageView = e10 != null ? (ImageView) e10.findViewById(q.f60555i8) : null;
                if (imageView != null) {
                    imageView.setImageResource(tabIconId);
                }
                View e11 = tab.e();
                TextView textView = e11 != null ? (TextView) e11.findViewById(q.f60565j8) : null;
                if (textView != null) {
                    textView.setTypeface(C6218a.P());
                }
                if (textView != null) {
                    textView.setText(tabTitleText);
                }
                ud.i iVar = this.binding;
                if (iVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    iVar = null;
                }
                if (iVar.f66317p.getCurrentItem() == index) {
                    if (imageView != null) {
                        imageView.setColorFilter(AbstractC5892d.h(this, Integer.valueOf(AbstractC5886l.f59806b3), 0.0f, 2, null), PorterDuff.Mode.SRC_ATOP);
                    }
                    if (textView != null) {
                        textView.setTextColor(AbstractC5892d.h(this, Integer.valueOf(AbstractC5886l.f59811c3), 0.0f, 2, null));
                    }
                }
            }
        }
    }
}
