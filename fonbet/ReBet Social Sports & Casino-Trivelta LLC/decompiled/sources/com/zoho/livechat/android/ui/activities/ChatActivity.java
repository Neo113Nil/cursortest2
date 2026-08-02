package com.zoho.livechat.android.ui.activities;

import Cf.f0;
import Ph.AbstractC1455i;
import Ph.AbstractC1459k;
import Ph.C1452g0;
import Ph.L;
import Ph.M0;
import Ph.P;
import X9.m;
import Ye.d;
import Yf.c;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.e;
import androidx.core.view.AbstractC2082d0;
import androidx.core.view.AbstractC2109r0;
import androidx.core.view.F0;
import androidx.core.view.h1;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.N;
import androidx.lifecycle.AbstractC2194t;
import androidx.lifecycle.U;
import bg.f;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.shape.i;
import com.google.gson.k;
import com.zoho.livechat.android.ZohoLiveChat;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.brand.ui.helpers.a;
import com.zoho.livechat.android.modules.common.domain.entities.Form;
import com.zoho.livechat.android.modules.conversations.ui.fragments.w;
import com.zoho.livechat.android.modules.core.domain.entities.Channel;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import com.zoho.livechat.android.ui.activities.ChatActivity;
import com.zoho.livechat.android.ui.activities.viewmodels.ChatActivityViewModel;
import com.zoho.livechat.android.utils.LiveChatUtil;
import i3.C4527h;
import ie.EnumC4544a;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import m.AbstractC5479a;
import od.AbstractC5886l;
import od.o;
import od.t;
import og.AbstractC5892d;
import og.AbstractC5895g;
import og.p;
import og.q;
import rd.C6218a;
import ud.h;
import xd.C6821a;
import xe.C6822a;
import zf.C6966g;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 _2\u00020\u0001:\u0001`B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u001a\u0010\bJ\u000f\u0010\u001b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u0003J\r\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u0003J\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u001e\u0010\u0019J\u001f\u0010\"\u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u00162\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00107\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R(\u0010\n\u001a\u0004\u0018\u00010\t2\b\u00108\u001a\u0004\u0018\u00010\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R(\u0010B\u001a\u0004\u0018\u00010=2\b\u00108\u001a\u0004\u0018\u00010=8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR$\u0010H\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u00102\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR$\u0010L\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u00102\u001a\u0004\bJ\u0010E\"\u0004\bK\u0010GR$\u0010O\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u00102\u001a\u0004\bN\u0010E\"\u0004\b6\u0010GR$\u0010S\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u00102\u001a\u0004\bQ\u0010E\"\u0004\bR\u0010GR$\u0010[\u001a\u0004\u0018\u00010T8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u0014\u0010^\u001a\u00020$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]¨\u0006a"}, d2 = {"Lcom/zoho/livechat/android/ui/activities/ChatActivity;", "LYf/c;", "<init>", "()V", "Landroid/content/Intent;", "intent", "", "S", "(Landroid/content/Intent;)V", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "", "titleTextColor", "c0", "(Landroidx/appcompat/widget/Toolbar;I)V", "Landroid/view/ViewGroup;", "D", "()Landroid/view/ViewGroup;", "Landroidx/core/view/F0;", "insetsCompat", "E", "(Landroidx/core/view/F0;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onNewIntent", "onBackPressed", "T", "outState", "onSaveInstanceState", "bundle", "Landroidx/fragment/app/Fragment;", "fragment", "V", "(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;)V", "Lud/h;", "g", "Lud/h;", "_binding", "Lcom/zoho/livechat/android/ui/activities/viewmodels/ChatActivityViewModel;", C4527h.f48087o, "Lcom/zoho/livechat/android/ui/activities/viewmodels/ChatActivityViewModel;", "chatActivityViewModel", "Landroid/widget/ProgressBar;", i.f35755A, "Landroid/widget/ProgressBar;", "progressBar", "", "j", "Ljava/lang/String;", "singletask", "", "k", "Z", "isRecreated", "<set-?>", "l", "Landroidx/appcompat/widget/Toolbar;", "getToolbar", "()Landroidx/appcompat/widget/Toolbar;", "Lcom/google/android/material/appbar/AppBarLayout;", m.f13664a, "Lcom/google/android/material/appbar/AppBarLayout;", "getAppBarLayout", "()Lcom/google/android/material/appbar/AppBarLayout;", "appBarLayout", "n", "O", "()Ljava/lang/String;", "Y", "(Ljava/lang/String;)V", "chatId", "o", "L", "X", "acknowledgementKey", "p", "P", "departmentId", "q", "Q", "a0", "question", "Lcom/zoho/livechat/android/models/SalesIQChat;", "r", "Lcom/zoho/livechat/android/models/SalesIQChat;", "R", "()Lcom/zoho/livechat/android/models/SalesIQChat;", "b0", "(Lcom/zoho/livechat/android/models/SalesIQChat;)V", "salesIQChat", "M", "()Lud/h;", "binding", "s", "a", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nChatActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatActivity.kt\ncom/zoho/livechat/android/ui/activities/ChatActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,682:1\n326#2,4:683\n326#2,4:687\n326#2,4:691\n326#2,4:696\n326#2,4:700\n1#3:695\n*S KotlinDebug\n*F\n+ 1 ChatActivity.kt\ncom/zoho/livechat/android/ui/activities/ChatActivity\n*L\n117#1:683,4\n121#1:687,4\n128#1:691,4\n228#1:696,4\n233#1:700,4\n*E\n"})
/* loaded from: classes4.dex */
public final class ChatActivity extends c {

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public h _binding;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public ChatActivityViewModel chatActivityViewModel;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public ProgressBar progressBar;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public String singletask;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public boolean isRecreated;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public Toolbar toolbar;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public AppBarLayout appBarLayout;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public String chatId;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public String acknowledgementKey;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public String departmentId;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public String question;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public SalesIQChat salesIQChat;

    /* renamed from: com.zoho.livechat.android.ui.activities.ChatActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(SalesIQChat salesIQChat, Message.f fVar) {
            Intrinsics.checkNotNullParameter(salesIQChat, "salesIQChat");
            long f10 = rd.b.f();
            String question = salesIQChat.getQuestion();
            Long valueOf = Long.valueOf(f10);
            String annonID = LiveChatUtil.getAnnonID();
            String visitorName = LiveChatUtil.getVisitorName();
            Message.g gVar = Message.g.Question;
            if (fVar == null) {
                fVar = Message.f.Sending;
            }
            Message Q10 = C6966g.Q(salesIQChat, question, valueOf, annonID, visitorName, null, gVar, fVar, null, 256, null);
            if (Q10 != null) {
                C6966g.w0(Q10, false, 2, null);
            }
        }

        public Companion() {
        }
    }

    public static final class b extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f44294n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Bundle f44295o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ ChatActivity f44296p;

        public static final class a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public Object f44297n;

            /* renamed from: o, reason: collision with root package name */
            public Object f44298o;

            /* renamed from: p, reason: collision with root package name */
            public long f44299p;

            /* renamed from: q, reason: collision with root package name */
            public int f44300q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ boolean f44301r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ ChatActivity f44302s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ Bundle f44303t;

            /* renamed from: com.zoho.livechat.android.ui.activities.ChatActivity$b$a$a, reason: collision with other inner class name */
            public static final class C0640a extends SuspendLambda implements Function2 {

                /* renamed from: n, reason: collision with root package name */
                public int f44304n;

                /* renamed from: o, reason: collision with root package name */
                public final /* synthetic */ ChatActivity f44305o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0640a(ChatActivity chatActivity, Continuation continuation) {
                    super(2, continuation);
                    this.f44305o = chatActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C0640a(this.f44305o, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(P p10, Continuation continuation) {
                    return ((C0640a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    String acknowledgementKey;
                    String departmentId;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i10 = this.f44304n;
                    if (i10 == 0) {
                        ResultKt.throwOnFailure(obj);
                        ChatActivityViewModel chatActivityViewModel = this.f44305o.chatActivityViewModel;
                        if (chatActivityViewModel == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("chatActivityViewModel");
                            chatActivityViewModel = null;
                        }
                        SalesIQChat salesIQChat = this.f44305o.getSalesIQChat();
                        if (salesIQChat == null || (acknowledgementKey = salesIQChat.getConvID()) == null) {
                            acknowledgementKey = this.f44305o.getAcknowledgementKey();
                        }
                        SalesIQChat salesIQChat2 = this.f44305o.getSalesIQChat();
                        if (salesIQChat2 == null || (departmentId = salesIQChat2.getDeptid()) == null) {
                            departmentId = this.f44305o.getDepartmentId();
                        }
                        SalesIQChat salesIQChat3 = this.f44305o.getSalesIQChat();
                        EnumC4544a w10 = com.zoho.livechat.android.modules.brand.ui.helpers.a.w(acknowledgementKey, departmentId, og.i.i(salesIQChat3 != null ? Boxing.boxBoolean(salesIQChat3.isTriggeredChat()) : null));
                        this.f44304n = 1;
                        if (chatActivityViewModel.g(w10, this) == coroutine_suspended) {
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

            /* renamed from: com.zoho.livechat.android.ui.activities.ChatActivity$b$a$b, reason: collision with other inner class name */
            public static final class C0641b extends SuspendLambda implements Function2 {

                /* renamed from: n, reason: collision with root package name */
                public int f44306n;

                /* renamed from: o, reason: collision with root package name */
                public final /* synthetic */ ChatActivity f44307o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0641b(ChatActivity chatActivity, Continuation continuation) {
                    super(2, continuation);
                    this.f44307o = chatActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C0641b(this.f44307o, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(P p10, Continuation continuation) {
                    return ((C0641b) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f44306n != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    com.zoho.livechat.android.provider.a.INSTANCE.syncConversation(this.f44307o.getSalesIQChat());
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(boolean z10, ChatActivity chatActivity, Bundle bundle, Continuation continuation) {
                super(2, continuation);
                this.f44301r = z10;
                this.f44302s = chatActivity;
                this.f44303t = bundle;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f44301r, this.f44302s, this.f44303t, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:164:0x0807, code lost:
            
                if (r3.subSequence(r12, r4 + 1).toString().length() == 0) goto L373;
             */
            /* JADX WARN: Code restructure failed: missing block: B:182:0x084c, code lost:
            
                if (r3.subSequence(r12, r4 + 1).toString().length() == 0) goto L395;
             */
            /* JADX WARN: Code restructure failed: missing block: B:192:0x08a8, code lost:
            
                if (r4 == null) goto L409;
             */
            /* JADX WARN: Code restructure failed: missing block: B:374:0x01ad, code lost:
            
                if (Ph.AbstractC1455i.g(r2, r3, r95) == r1) goto L242;
             */
            /* JADX WARN: Code restructure failed: missing block: B:49:0x05f0, code lost:
            
                if (r1.subSequence(r5, r2 + 1).toString().length() == 0) goto L294;
             */
            /* JADX WARN: Code restructure failed: missing block: B:66:0x0633, code lost:
            
                if (r1.subSequence(r5, r2 + 1).toString().length() == 0) goto L316;
             */
            /* JADX WARN: Removed duplicated region for block: B:124:0x0742  */
            /* JADX WARN: Removed duplicated region for block: B:12:0x052e  */
            /* JADX WARN: Removed duplicated region for block: B:148:0x07cc  */
            /* JADX WARN: Removed duplicated region for block: B:166:0x080f  */
            /* JADX WARN: Removed duplicated region for block: B:191:0x089a  */
            /* JADX WARN: Removed duplicated region for block: B:196:0x08c9  */
            /* JADX WARN: Removed duplicated region for block: B:203:0x09c0  */
            /* JADX WARN: Removed duplicated region for block: B:206:0x09c9  */
            /* JADX WARN: Removed duplicated region for block: B:253:0x03c0  */
            /* JADX WARN: Removed duplicated region for block: B:266:0x0432  */
            /* JADX WARN: Removed duplicated region for block: B:269:0x045e  */
            /* JADX WARN: Removed duplicated region for block: B:272:0x0477  */
            /* JADX WARN: Removed duplicated region for block: B:279:0x049b  */
            /* JADX WARN: Removed duplicated region for block: B:282:0x04a9  */
            /* JADX WARN: Removed duplicated region for block: B:292:0x04ef  */
            /* JADX WARN: Removed duplicated region for block: B:294:0x04b2  */
            /* JADX WARN: Removed duplicated region for block: B:295:0x04a0  */
            /* JADX WARN: Removed duplicated region for block: B:297:0x047a  */
            /* JADX WARN: Removed duplicated region for block: B:301:0x09da  */
            /* JADX WARN: Removed duplicated region for block: B:348:0x0130  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x05b5  */
            /* JADX WARN: Removed duplicated region for block: B:365:0x0178  */
            /* JADX WARN: Removed duplicated region for block: B:368:0x018c  */
            /* JADX WARN: Removed duplicated region for block: B:376:0x0181  */
            /* JADX WARN: Removed duplicated region for block: B:385:0x0397  */
            /* JADX WARN: Removed duplicated region for block: B:395:0x01cc  */
            /* JADX WARN: Removed duplicated region for block: B:398:0x01d6  */
            /* JADX WARN: Removed duplicated region for block: B:425:0x025f  */
            /* JADX WARN: Removed duplicated region for block: B:429:0x0292  */
            /* JADX WARN: Removed duplicated region for block: B:435:0x02bb  */
            /* JADX WARN: Removed duplicated region for block: B:436:0x0267  */
            /* JADX WARN: Removed duplicated region for block: B:439:0x02f0  */
            /* JADX WARN: Removed duplicated region for block: B:456:0x035a  */
            /* JADX WARN: Removed duplicated region for block: B:463:0x02f4  */
            /* JADX WARN: Removed duplicated region for block: B:474:0x01d1  */
            /* JADX WARN: Removed duplicated region for block: B:51:0x05f8  */
            /* JADX WARN: Removed duplicated region for block: B:70:0x0664  */
            /* JADX WARN: Removed duplicated region for block: B:72:0x067b  */
            /* JADX WARN: Removed duplicated region for block: B:79:0x09ed  */
            /* JADX WARN: Removed duplicated region for block: B:85:0x09f3  */
            /* JADX WARN: Removed duplicated region for block: B:86:0x0678  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0525  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                String acknowledgementKey;
                String departmentId;
                Form.Message currentFormMessage;
                boolean z10;
                boolean z11;
                Channel m10;
                String acknowledgementKey2;
                String departmentId2;
                boolean z12;
                ProgressBar progressBar;
                SalesIQChat salesIQChat;
                boolean k10;
                Form form;
                Object a10;
                ChatActivityViewModel chatActivityViewModel;
                SalesIQChat salesIQChat2;
                String acknowledgementKey3;
                SalesIQChat salesIQChat3;
                String departmentId3;
                SalesIQChat salesIQChat4;
                Form.Message message;
                boolean z13;
                Bundle bundle;
                ChatActivityViewModel chatActivityViewModel2;
                boolean e10;
                SalesIQChat salesIQChat5;
                String acknowledgementKey4;
                String deptid;
                SalesIQChat salesIQChat6;
                L b10;
                C0641b c0641b;
                long j10;
                Form form2;
                SalesIQChat.Extras extras;
                ProgressBar progressBar2;
                Message Q10;
                String str;
                String str2;
                boolean z14;
                String str3;
                Message.Meta meta;
                Integer num;
                String title;
                Message P10;
                ArrayList arrayList;
                Message P11;
                Message message2;
                String str4;
                String str5;
                boolean z15;
                String str6;
                Message P12;
                Form.Message.Meta meta2;
                Message.Meta meta3;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f44300q;
                ProgressBar progressBar3 = null;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.f44301r) {
                        SalesIQChat salesIQChat7 = this.f44302s.getSalesIQChat();
                        if (salesIQChat7 == null || (acknowledgementKey = salesIQChat7.getConvID()) == null) {
                            acknowledgementKey = this.f44302s.getAcknowledgementKey();
                        }
                        SalesIQChat salesIQChat8 = this.f44302s.getSalesIQChat();
                        if (salesIQChat8 == null || (departmentId = salesIQChat8.getDeptid()) == null) {
                            departmentId = this.f44302s.getDepartmentId();
                        }
                        SalesIQChat salesIQChat9 = this.f44302s.getSalesIQChat();
                        EnumC4544a w10 = com.zoho.livechat.android.modules.brand.ui.helpers.a.w(acknowledgementKey, departmentId, og.i.i(salesIQChat9 != null ? Boxing.boxBoolean(salesIQChat9.isTriggeredChat()) : null));
                        ChatActivityViewModel chatActivityViewModel3 = this.f44302s.chatActivityViewModel;
                        if (chatActivityViewModel3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("chatActivityViewModel");
                            chatActivityViewModel3 = null;
                        }
                        Form b11 = chatActivityViewModel3.b(w10);
                        ChatActivityViewModel chatActivityViewModel4 = this.f44302s.chatActivityViewModel;
                        if (chatActivityViewModel4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("chatActivityViewModel");
                            chatActivityViewModel4 = null;
                        }
                        currentFormMessage = chatActivityViewModel4.getCurrentFormMessage();
                        boolean isConversationEnabled = LiveChatUtil.isConversationEnabled();
                        if (this.f44302s.getSalesIQChat() != null) {
                            SalesIQChat salesIQChat10 = this.f44302s.getSalesIQChat();
                            Intrinsics.checkNotNull(salesIQChat10);
                            z10 = salesIQChat10.getStatus() == 4;
                            SalesIQChat salesIQChat11 = this.f44302s.getSalesIQChat();
                            Intrinsics.checkNotNull(salesIQChat11);
                            if (salesIQChat11.getStatus() == 2) {
                                z11 = true;
                                if (!z11 && (!z10 || !isConversationEnabled)) {
                                    chatActivityViewModel = this.f44302s.chatActivityViewModel;
                                    if (chatActivityViewModel == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("chatActivityViewModel");
                                        chatActivityViewModel = null;
                                    }
                                    if (!chatActivityViewModel.f(w10) && d.m(De.a.OngoingConversationContextAppStatus, null, 2, null) == null && b11 == null && currentFormMessage == null) {
                                        salesIQChat2 = this.f44302s.getSalesIQChat();
                                        if (salesIQChat2 != null || (acknowledgementKey3 = salesIQChat2.getConvID()) == null) {
                                            acknowledgementKey3 = this.f44302s.getAcknowledgementKey();
                                        }
                                        salesIQChat3 = this.f44302s.getSalesIQChat();
                                        if (salesIQChat3 != null || (departmentId3 = salesIQChat3.getDeptid()) == null) {
                                            departmentId3 = this.f44302s.getDepartmentId();
                                        }
                                        salesIQChat4 = this.f44302s.getSalesIQChat();
                                        if (!com.zoho.livechat.android.modules.brand.ui.helpers.a.J(acknowledgementKey3, departmentId3, og.i.i(salesIQChat4 == null ? Boxing.boxBoolean(salesIQChat4.isTriggeredChat()) : null))) {
                                            Channel m11 = C6822a.m();
                                            if ((m11 != null ? m11.getFormType() : null) != Form.Type.Conversation) {
                                                L b12 = C1452g0.b();
                                                C0640a c0640a = new C0640a(this.f44302s, null);
                                                this.f44300q = 1;
                                            }
                                        }
                                    }
                                }
                                if (this.f44302s.getSalesIQChat() != null || LiveChatUtil.isStartChatEnabled()) {
                                    m10 = C6822a.m();
                                    if ((m10 == null ? m10.getFormType() : null) == Form.Type.Traditional) {
                                        SalesIQChat salesIQChat12 = this.f44302s.getSalesIQChat();
                                        if (salesIQChat12 == null || (acknowledgementKey2 = salesIQChat12.getConvID()) == null) {
                                            acknowledgementKey2 = this.f44302s.getAcknowledgementKey();
                                        }
                                        SalesIQChat salesIQChat13 = this.f44302s.getSalesIQChat();
                                        if (salesIQChat13 == null || (departmentId2 = salesIQChat13.getDeptid()) == null) {
                                            departmentId2 = this.f44302s.getDepartmentId();
                                        }
                                        SalesIQChat salesIQChat14 = this.f44302s.getSalesIQChat();
                                        if (!com.zoho.livechat.android.modules.brand.ui.helpers.a.J(acknowledgementKey2, departmentId2, og.i.i(salesIQChat14 != null ? Boxing.boxBoolean(salesIQChat14.isTriggeredChat()) : null))) {
                                            Form.Companion companion = Form.INSTANCE;
                                            if (!companion.a(b11) || this.f44302s.getDepartmentId() == null) {
                                                SalesIQChat salesIQChat15 = this.f44302s.getSalesIQChat();
                                                if (!companion.b(b11, salesIQChat15 != null ? salesIQChat15.getConvID() : null)) {
                                                    z12 = false;
                                                    if (this.f44302s.getSalesIQChat() == null && z12 && !LiveChatUtil.requireChatGDPRConsent() && LiveChatUtil.isStartChatEnabled()) {
                                                        String acknowledgementKey5 = this.f44302s.getAcknowledgementKey() == null ? this.f44302s.getAcknowledgementKey() : UUID.randomUUID().toString();
                                                        Pe.b I10 = Te.a.I(acknowledgementKey5);
                                                        this.f44302s.b0(new SalesIQChat(acknowledgementKey5, "temp_chid", null, rd.b.f(), 1, SalesIQChat.c.Chat));
                                                        salesIQChat = this.f44302s.getSalesIQChat();
                                                        if (salesIQChat != null) {
                                                            salesIQChat.setExtras(I10 != null ? new SalesIQChat.Extras(new SalesIQChat.Extras.a(I10.i(), I10.c(), I10.g(), I10.d())) : null);
                                                        }
                                                        if (this.f44302s.getQuestion() != null) {
                                                            SalesIQChat salesIQChat16 = this.f44302s.getSalesIQChat();
                                                            Intrinsics.checkNotNull(salesIQChat16);
                                                            salesIQChat16.setQuestion(this.f44302s.getQuestion());
                                                            com.zoho.livechat.android.provider.a.INSTANCE.syncConversation(this.f44302s.getSalesIQChat());
                                                            Companion companion2 = ChatActivity.INSTANCE;
                                                            SalesIQChat salesIQChat17 = this.f44302s.getSalesIQChat();
                                                            Intrinsics.checkNotNull(salesIQChat17);
                                                            companion2.a(salesIQChat17, Message.f.Sending);
                                                        }
                                                    }
                                                    progressBar = this.f44302s.progressBar;
                                                    if (progressBar != null) {
                                                        Intrinsics.throwUninitializedPropertyAccessException("progressBar");
                                                    } else {
                                                        progressBar3 = progressBar;
                                                    }
                                                    progressBar3.setVisibility(8);
                                                    if (!z12 || this.f44302s.getIntent().hasExtra("is_triggered_chat") || this.f44302s.getIntent().hasExtra("is_intelligent_trigger") || this.f44302s.getIntent().hasExtra("can_skip_pre_chat_form")) {
                                                        if (z12 && !this.f44302s.getIntent().hasExtra("is_intelligent_trigger") && this.f44302s.getSalesIQChat() != null) {
                                                            LiveChatUtil.applyDepartmentToChat(this.f44302s.getSalesIQChat());
                                                            if (this.f44302s.getQuestion() != null) {
                                                                com.zoho.livechat.android.provider.a.INSTANCE.syncConversation(this.f44302s.getSalesIQChat());
                                                            }
                                                        }
                                                        if (this.f44303t != null && this.f44302s.getSalesIQChat() != null) {
                                                            Bundle bundle2 = this.f44303t;
                                                            SalesIQChat salesIQChat18 = this.f44302s.getSalesIQChat();
                                                            Intrinsics.checkNotNull(salesIQChat18);
                                                            bundle2.putString("chid", salesIQChat18.getChid());
                                                        }
                                                        this.f44302s.V(this.f44303t, new f0());
                                                    } else {
                                                        this.f44302s.V(this.f44303t, new w());
                                                    }
                                                }
                                            }
                                            z12 = true;
                                            if (this.f44302s.getSalesIQChat() == null) {
                                                String acknowledgementKey52 = this.f44302s.getAcknowledgementKey() == null ? this.f44302s.getAcknowledgementKey() : UUID.randomUUID().toString();
                                                Pe.b I102 = Te.a.I(acknowledgementKey52);
                                                this.f44302s.b0(new SalesIQChat(acknowledgementKey52, "temp_chid", null, rd.b.f(), 1, SalesIQChat.c.Chat));
                                                salesIQChat = this.f44302s.getSalesIQChat();
                                                if (salesIQChat != null) {
                                                }
                                                if (this.f44302s.getQuestion() != null) {
                                                }
                                            }
                                            progressBar = this.f44302s.progressBar;
                                            if (progressBar != null) {
                                            }
                                            progressBar3.setVisibility(8);
                                            if (z12) {
                                            }
                                            if (z12) {
                                                LiveChatUtil.applyDepartmentToChat(this.f44302s.getSalesIQChat());
                                                if (this.f44302s.getQuestion() != null) {
                                                }
                                            }
                                            if (this.f44303t != null) {
                                                Bundle bundle22 = this.f44303t;
                                                SalesIQChat salesIQChat182 = this.f44302s.getSalesIQChat();
                                                Intrinsics.checkNotNull(salesIQChat182);
                                                bundle22.putString("chid", salesIQChat182.getChid());
                                            }
                                            this.f44302s.V(this.f44303t, new f0());
                                        }
                                    }
                                }
                                if (LiveChatUtil.isStartChatEnabled()) {
                                    k10 = qd.c.k();
                                    if (!k10 && !qd.c.k()) {
                                        C6821a c6821a = C6821a.f68119a;
                                        this.f44297n = b11;
                                        this.f44298o = currentFormMessage;
                                        this.f44300q = 2;
                                        a10 = c6821a.a(this);
                                        if (a10 != coroutine_suspended) {
                                            form = b11;
                                            k10 = ((Boolean) a10).booleanValue();
                                            message = currentFormMessage;
                                            if (k10) {
                                            }
                                        }
                                        return coroutine_suspended;
                                    }
                                    form = b11;
                                    message = currentFormMessage;
                                    if (k10) {
                                    }
                                }
                                progressBar2 = this.f44302s.progressBar;
                                if (progressBar2 != null) {
                                }
                                progressBar3.setVisibility(8);
                                this.f44302s.V(this.f44303t, new f0());
                            }
                        } else {
                            z10 = false;
                        }
                        z11 = false;
                        if (!z11) {
                            chatActivityViewModel = this.f44302s.chatActivityViewModel;
                            if (chatActivityViewModel == null) {
                            }
                            if (!chatActivityViewModel.f(w10)) {
                                salesIQChat2 = this.f44302s.getSalesIQChat();
                                if (salesIQChat2 != null) {
                                }
                                acknowledgementKey3 = this.f44302s.getAcknowledgementKey();
                                salesIQChat3 = this.f44302s.getSalesIQChat();
                                if (salesIQChat3 != null) {
                                }
                                departmentId3 = this.f44302s.getDepartmentId();
                                salesIQChat4 = this.f44302s.getSalesIQChat();
                                if (!com.zoho.livechat.android.modules.brand.ui.helpers.a.J(acknowledgementKey3, departmentId3, og.i.i(salesIQChat4 == null ? Boxing.boxBoolean(salesIQChat4.isTriggeredChat()) : null))) {
                                }
                            }
                        }
                        if (this.f44302s.getSalesIQChat() != null) {
                        }
                        m10 = C6822a.m();
                        if ((m10 == null ? m10.getFormType() : null) == Form.Type.Traditional) {
                        }
                        if (LiveChatUtil.isStartChatEnabled()) {
                        }
                        progressBar2 = this.f44302s.progressBar;
                        if (progressBar2 != null) {
                        }
                        progressBar3.setVisibility(8);
                        this.f44302s.V(this.f44303t, new f0());
                    } else {
                        ProgressBar progressBar4 = this.f44302s.progressBar;
                        if (progressBar4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("progressBar");
                        } else {
                            progressBar3 = progressBar4;
                        }
                        progressBar3.setVisibility(8);
                        if (this.f44303t != null && this.f44302s.getSalesIQChat() != null) {
                            Bundle bundle3 = this.f44303t;
                            SalesIQChat salesIQChat19 = this.f44302s.getSalesIQChat();
                            Intrinsics.checkNotNull(salesIQChat19);
                            bundle3.putString("chid", salesIQChat19.getChid());
                        }
                        this.f44302s.V(this.f44303t, new f0());
                    }
                } else if (i10 == 1) {
                    ResultKt.throwOnFailure(obj);
                    this.f44302s.T();
                } else if (i10 == 2) {
                    Form.Message message3 = (Form.Message) this.f44298o;
                    form = (Form) this.f44297n;
                    ResultKt.throwOnFailure(obj);
                    currentFormMessage = message3;
                    a10 = obj;
                    k10 = ((Boolean) a10).booleanValue();
                    message = currentFormMessage;
                    if (k10) {
                        if (this.f44302s.getSalesIQChat() == null) {
                            String acknowledgementKey6 = this.f44302s.getAcknowledgementKey() != null ? this.f44302s.getAcknowledgementKey() : UUID.randomUUID().toString();
                            Pe.b I11 = Te.a.I(acknowledgementKey6);
                            this.f44302s.b0(new SalesIQChat(acknowledgementKey6, "temp_chid", null, rd.b.f(), 1, SalesIQChat.c.Chat));
                            SalesIQChat salesIQChat20 = this.f44302s.getSalesIQChat();
                            if (salesIQChat20 != null) {
                                if (I11 != null) {
                                    z13 = true;
                                    extras = new SalesIQChat.Extras(new SalesIQChat.Extras.a(I11.i(), I11.c(), I11.g(), I11.d()));
                                } else {
                                    z13 = true;
                                    extras = null;
                                }
                                salesIQChat20.setExtras(extras);
                                bundle = this.f44303t;
                                if (bundle != null) {
                                    SalesIQChat salesIQChat21 = this.f44302s.getSalesIQChat();
                                    Intrinsics.checkNotNull(salesIQChat21);
                                    bundle.putString("chid", salesIQChat21.getChid());
                                    Unit unit = Unit.INSTANCE;
                                }
                                SalesIQChat salesIQChat22 = this.f44302s.getSalesIQChat();
                                Intrinsics.checkNotNull(salesIQChat22);
                                salesIQChat22.setQuestion(this.f44302s.getQuestion());
                                chatActivityViewModel2 = this.f44302s.chatActivityViewModel;
                                if (chatActivityViewModel2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("chatActivityViewModel");
                                    chatActivityViewModel2 = null;
                                }
                                String acknowledgementKey7 = this.f44302s.getAcknowledgementKey();
                                SalesIQChat salesIQChat23 = this.f44302s.getSalesIQChat();
                                Intrinsics.checkNotNull(salesIQChat23);
                                e10 = chatActivityViewModel2.e(form, acknowledgementKey7, salesIQChat23.getStatus() != 5 ? z13 : false);
                                salesIQChat5 = this.f44302s.getSalesIQChat();
                                if (salesIQChat5 != null || (acknowledgementKey4 = salesIQChat5.getConvID()) == null) {
                                    acknowledgementKey4 = this.f44302s.getAcknowledgementKey();
                                }
                                SalesIQChat salesIQChat24 = this.f44302s.getSalesIQChat();
                                deptid = salesIQChat24 == null ? salesIQChat24.getDeptid() : null;
                                salesIQChat6 = this.f44302s.getSalesIQChat();
                                if (!com.zoho.livechat.android.modules.brand.ui.helpers.a.J(acknowledgementKey4, deptid, og.i.i(salesIQChat6 == null ? Boxing.boxBoolean(salesIQChat6.isTriggeredChat()) : null)) || e10) {
                                    LiveChatUtil.applyDepartmentToChat(this.f44302s.getSalesIQChat());
                                }
                                boolean requireChatGDPRConsent = LiveChatUtil.requireChatGDPRConsent();
                                if (!e10 && !requireChatGDPRConsent) {
                                    long f10 = rd.b.f();
                                    b10 = C1452g0.b();
                                    c0641b = new C0641b(this.f44302s, null);
                                    this.f44297n = form;
                                    this.f44298o = message;
                                    this.f44299p = f10;
                                    this.f44300q = 3;
                                    if (AbstractC1455i.g(b10, c0641b, this) != coroutine_suspended) {
                                        j10 = f10;
                                        form2 = form;
                                        SalesIQChat salesIQChat25 = this.f44302s.getSalesIQChat();
                                        SalesIQChat salesIQChat26 = this.f44302s.getSalesIQChat();
                                        Intrinsics.checkNotNull(salesIQChat26);
                                        Q10 = C6966g.Q(salesIQChat25, salesIQChat26.getQuestion(), Boxing.boxLong(j10), LiveChatUtil.getAnnonID(), LiveChatUtil.getVisitorName(), null, Message.g.Question, Message.f.Sent, null, 256, null);
                                        long j11 = 1 + j10;
                                        if (Q10 != null) {
                                        }
                                        if (message == null) {
                                        }
                                    }
                                    return coroutine_suspended;
                                }
                                LiveChatUtil.setStartChatDisabled();
                                progressBar2 = this.f44302s.progressBar;
                                if (progressBar2 != null) {
                                }
                                progressBar3.setVisibility(8);
                                this.f44302s.V(this.f44303t, new f0());
                            }
                        }
                        z13 = true;
                        bundle = this.f44303t;
                        if (bundle != null) {
                        }
                        SalesIQChat salesIQChat222 = this.f44302s.getSalesIQChat();
                        Intrinsics.checkNotNull(salesIQChat222);
                        salesIQChat222.setQuestion(this.f44302s.getQuestion());
                        chatActivityViewModel2 = this.f44302s.chatActivityViewModel;
                        if (chatActivityViewModel2 == null) {
                        }
                        String acknowledgementKey72 = this.f44302s.getAcknowledgementKey();
                        SalesIQChat salesIQChat232 = this.f44302s.getSalesIQChat();
                        Intrinsics.checkNotNull(salesIQChat232);
                        e10 = chatActivityViewModel2.e(form, acknowledgementKey72, salesIQChat232.getStatus() != 5 ? z13 : false);
                        salesIQChat5 = this.f44302s.getSalesIQChat();
                        if (salesIQChat5 != null) {
                        }
                        acknowledgementKey4 = this.f44302s.getAcknowledgementKey();
                        SalesIQChat salesIQChat242 = this.f44302s.getSalesIQChat();
                        if (salesIQChat242 == null) {
                        }
                        salesIQChat6 = this.f44302s.getSalesIQChat();
                        if (!com.zoho.livechat.android.modules.brand.ui.helpers.a.J(acknowledgementKey4, deptid, og.i.i(salesIQChat6 == null ? Boxing.boxBoolean(salesIQChat6.isTriggeredChat()) : null))) {
                        }
                        LiveChatUtil.applyDepartmentToChat(this.f44302s.getSalesIQChat());
                        boolean requireChatGDPRConsent2 = LiveChatUtil.requireChatGDPRConsent();
                        if (!e10) {
                            long f102 = rd.b.f();
                            b10 = C1452g0.b();
                            c0641b = new C0641b(this.f44302s, null);
                            this.f44297n = form;
                            this.f44298o = message;
                            this.f44299p = f102;
                            this.f44300q = 3;
                            if (AbstractC1455i.g(b10, c0641b, this) != coroutine_suspended) {
                            }
                            return coroutine_suspended;
                        }
                        LiveChatUtil.setStartChatDisabled();
                        progressBar2 = this.f44302s.progressBar;
                        if (progressBar2 != null) {
                        }
                        progressBar3.setVisibility(8);
                        this.f44302s.V(this.f44303t, new f0());
                    } else {
                        Bundle bundle4 = this.f44303t;
                        if (bundle4 != null) {
                            bundle4.remove("question");
                            Unit unit2 = Unit.INSTANCE;
                        }
                        progressBar2 = this.f44302s.progressBar;
                        if (progressBar2 != null) {
                        }
                        progressBar3.setVisibility(8);
                        this.f44302s.V(this.f44303t, new f0());
                    }
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j10 = this.f44299p;
                    message = (Form.Message) this.f44298o;
                    form2 = (Form) this.f44297n;
                    ResultKt.throwOnFailure(obj);
                    z13 = true;
                    SalesIQChat salesIQChat252 = this.f44302s.getSalesIQChat();
                    SalesIQChat salesIQChat262 = this.f44302s.getSalesIQChat();
                    Intrinsics.checkNotNull(salesIQChat262);
                    Q10 = C6966g.Q(salesIQChat252, salesIQChat262.getQuestion(), Boxing.boxLong(j10), LiveChatUtil.getAnnonID(), LiveChatUtil.getVisitorName(), null, Message.g.Question, Message.f.Sent, null, 256, null);
                    long j112 = 1 + j10;
                    if (Q10 != null) {
                        C6966g.u0(Q10);
                    }
                    if (message == null) {
                        LiveChatUtil.setFormContextStarted();
                        SalesIQChat salesIQChat27 = this.f44302s.getSalesIQChat();
                        Intrinsics.checkNotNull(salesIQChat27);
                        if (salesIQChat27.getStatus() == 5) {
                            SalesIQChat salesIQChat28 = this.f44302s.getSalesIQChat();
                            Intrinsics.checkNotNull(salesIQChat28);
                            str4 = salesIQChat28.getAttenderName();
                            SalesIQChat salesIQChat29 = this.f44302s.getSalesIQChat();
                            Intrinsics.checkNotNull(salesIQChat29);
                            boolean isBotAttender = salesIQChat29.isBotAttender();
                            SalesIQChat salesIQChat30 = this.f44302s.getSalesIQChat();
                            Intrinsics.checkNotNull(salesIQChat30);
                            str5 = salesIQChat30.getAttenderid();
                            z15 = isBotAttender;
                        } else {
                            str4 = null;
                            str5 = null;
                            z15 = false;
                        }
                        if (str5 != null) {
                            int length = str5.length() - 1;
                            boolean z16 = false;
                            int i11 = 0;
                            while (i11 <= length) {
                                boolean z17 = Intrinsics.compare((int) str5.charAt(!z16 ? i11 : length), 32) <= 0 ? z13 : false;
                                if (z16) {
                                    if (!z17) {
                                        break;
                                    }
                                    length--;
                                } else if (z17) {
                                    i11++;
                                } else {
                                    z16 = z13;
                                }
                            }
                            if (str5.subSequence(i11, length + 1).toString().length() != 0) {
                                str6 = str5;
                                if (str4 != null) {
                                    int length2 = str4.length() - 1;
                                    boolean z18 = false;
                                    int i12 = 0;
                                    while (i12 <= length2) {
                                        boolean z19 = Intrinsics.compare((int) str4.charAt(!z18 ? i12 : length2), 32) <= 0 ? z13 : false;
                                        if (z18) {
                                            if (!z19) {
                                                break;
                                            }
                                            length2--;
                                        } else if (z19) {
                                            i12++;
                                        } else {
                                            z18 = z13;
                                        }
                                    }
                                }
                                str4 = message.getDisplayName();
                                if (str4 != null) {
                                    int length3 = str4.length() - 1;
                                    boolean z20 = false;
                                    int i13 = 0;
                                    while (i13 <= length3) {
                                        boolean z21 = Intrinsics.compare((int) str4.charAt(!z20 ? i13 : length3), 32) <= 0 ? z13 : false;
                                        if (z20) {
                                            if (!z21) {
                                                break;
                                            }
                                            length3--;
                                        } else if (z21) {
                                            i13++;
                                        } else {
                                            z20 = z13;
                                        }
                                    }
                                }
                                str4 = this.f44302s.getString(t.f61034h1);
                                P12 = C6966g.P(this.f44302s.getSalesIQChat(), message.getText(), Boxing.boxLong(j112), str6, str4, null, Message.g.Text, Message.f.Sent, message.getStringResourceId());
                                meta2 = message.getMeta();
                                if (meta2 == null) {
                                    Form.Message.Companion companion3 = Form.Message.INSTANCE;
                                    ChatActivity chatActivity = this.f44302s;
                                    SalesIQChat salesIQChat31 = chatActivity.getSalesIQChat();
                                    Intrinsics.checkNotNull(salesIQChat31);
                                    meta3 = companion3.a(meta2, chatActivity, salesIQChat31.getConvID());
                                } else {
                                    meta3 = null;
                                }
                                if (P12 != null) {
                                    Message copy$default = Message.copy$default(P12, null, null, null, null, null, null, null, null, null, null, 0L, 0L, null, null, null, null, null, null, null, null, z15, null, null, null, null, null, null, null, 0L, 0L, 0L, null, null, null, null, null, false, false, false, false, false, null, -1048577, 1023, null);
                                    if (meta3 != null) {
                                        copy$default = Message.copy$default(copy$default, null, null, null, null, null, null, null, null, null, null, 0L, 0L, null, null, null, null, null, null, meta3, null, false, null, null, null, null, null, null, null, 0L, 0L, 0L, null, null, null, null, null, false, false, false, false, false, null, -262145, 1023, null);
                                    }
                                    C6966g.v0(copy$default, z13);
                                }
                            }
                        }
                        str6 = "form_sender";
                        if (str4 != null) {
                        }
                        str4 = message.getDisplayName();
                        if (str4 != null) {
                        }
                        str4 = this.f44302s.getString(t.f61034h1);
                        P12 = C6966g.P(this.f44302s.getSalesIQChat(), message.getText(), Boxing.boxLong(j112), str6, str4, null, Message.g.Text, Message.f.Sent, message.getStringResourceId());
                        meta2 = message.getMeta();
                        if (meta2 == null) {
                        }
                        if (P12 != null) {
                        }
                    } else if (form2 != null) {
                        SalesIQChat salesIQChat32 = this.f44302s.getSalesIQChat();
                        Intrinsics.checkNotNull(salesIQChat32);
                        if (salesIQChat32.getStatus() == 5) {
                            SalesIQChat salesIQChat33 = this.f44302s.getSalesIQChat();
                            Intrinsics.checkNotNull(salesIQChat33);
                            str = salesIQChat33.getAttenderName();
                            SalesIQChat salesIQChat34 = this.f44302s.getSalesIQChat();
                            Intrinsics.checkNotNull(salesIQChat34);
                            boolean isBotAttender2 = salesIQChat34.isBotAttender();
                            SalesIQChat salesIQChat35 = this.f44302s.getSalesIQChat();
                            Intrinsics.checkNotNull(salesIQChat35);
                            str2 = salesIQChat35.getAttenderid();
                            z14 = isBotAttender2;
                        } else {
                            str = null;
                            str2 = null;
                            z14 = false;
                        }
                        if (str2 != null) {
                            int length4 = str2.length() - 1;
                            boolean z22 = false;
                            int i14 = 0;
                            while (i14 <= length4) {
                                boolean z23 = Intrinsics.compare((int) str2.charAt(!z22 ? i14 : length4), 32) <= 0;
                                if (z22) {
                                    if (!z23) {
                                        break;
                                    }
                                    length4--;
                                } else if (z23) {
                                    i14++;
                                } else {
                                    z22 = true;
                                }
                            }
                            if (str2.subSequence(i14, length4 + 1).toString().length() != 0) {
                                str3 = str2;
                                if (str != null) {
                                    int length5 = str.length() - 1;
                                    boolean z24 = false;
                                    int i15 = 0;
                                    while (i15 <= length5) {
                                        boolean z25 = Intrinsics.compare((int) str.charAt(!z24 ? i15 : length5), 32) <= 0;
                                        if (z24) {
                                            if (!z25) {
                                                break;
                                            }
                                            length5--;
                                        } else if (z25) {
                                            i15++;
                                        } else {
                                            z24 = true;
                                        }
                                    }
                                }
                                str = form2.getDisplayName();
                                if (str != null) {
                                    int length6 = str.length() - 1;
                                    boolean z26 = false;
                                    int i16 = 0;
                                    while (i16 <= length6) {
                                        boolean z27 = Intrinsics.compare((int) str.charAt(!z26 ? i16 : length6), 32) <= 0;
                                        if (z26) {
                                            if (!z27) {
                                                break;
                                            }
                                            length6--;
                                        } else if (z27) {
                                            i16++;
                                        } else {
                                            z26 = true;
                                        }
                                    }
                                }
                                str = this.f44302s.getString(t.f61034h1);
                                String str7 = str;
                                k kVar = new k();
                                kVar.n("hide_input", Boxing.boxBoolean(true));
                                meta = (Message.Meta) AbstractC5895g.a(Yd.a.j(), kVar, Message.Meta.class);
                                Integer boxInt = Boxing.boxInt(t.f61027g1);
                                boxInt.intValue();
                                String title2 = form2.getTitle();
                                num = (title2 != null || title2.length() == 0) ? boxInt : null;
                                SalesIQChat salesIQChat36 = this.f44302s.getSalesIQChat();
                                if (num != null) {
                                    title = this.f44302s.getApplication().getString(num.intValue());
                                }
                                title = form2.getTitle();
                                String str8 = title;
                                Long boxLong = Boxing.boxLong(j112);
                                Message.g gVar = Message.g.Text;
                                Message.f fVar = Message.f.Sent;
                                P10 = C6966g.P(salesIQChat36, str8, boxLong, str3, str7, null, gVar, fVar, num);
                                String str9 = str3;
                                if (P10 != null) {
                                    P10 = Message.copy$default(P10, null, null, null, null, null, null, null, null, null, null, 0L, 0L, null, null, null, null, null, null, null, null, z14, null, null, null, null, null, null, null, 0L, 0L, 0L, null, null, null, null, null, false, false, false, false, false, null, -1048577, 1023, null);
                                }
                                arrayList = new ArrayList();
                                arrayList.add(P10);
                                P11 = C6966g.P(this.f44302s.getSalesIQChat(), this.f44302s.getString(t.f61020f1), Boxing.boxLong(j10 + 2), str9, str7, null, Message.g.InlineForm, fVar, Boxing.boxInt(t.f61020f1));
                                if (P11 != null && meta != null) {
                                    P11 = Message.copy$default(P11, null, null, null, null, null, null, null, null, null, null, 0L, 0L, null, null, null, null, null, null, meta, null, false, null, null, null, null, null, null, null, 0L, 0L, 0L, null, null, null, null, null, false, false, false, false, false, null, -262145, 1023, null);
                                }
                                message2 = P11;
                                if (message2 != null) {
                                    arrayList.add(message2);
                                }
                                if (!arrayList.isEmpty()) {
                                    C6966g.A0(CollectionsKt.filterNotNull(arrayList), Boxing.boxLong(3L));
                                }
                            }
                        }
                        str3 = "form_sender";
                        if (str != null) {
                        }
                        str = form2.getDisplayName();
                        if (str != null) {
                        }
                        str = this.f44302s.getString(t.f61034h1);
                        String str72 = str;
                        k kVar2 = new k();
                        kVar2.n("hide_input", Boxing.boxBoolean(true));
                        meta = (Message.Meta) AbstractC5895g.a(Yd.a.j(), kVar2, Message.Meta.class);
                        Integer boxInt2 = Boxing.boxInt(t.f61027g1);
                        boxInt2.intValue();
                        String title22 = form2.getTitle();
                        if (title22 != null) {
                        }
                        SalesIQChat salesIQChat362 = this.f44302s.getSalesIQChat();
                        if (num != null) {
                        }
                        title = form2.getTitle();
                        String str82 = title;
                        Long boxLong2 = Boxing.boxLong(j112);
                        Message.g gVar2 = Message.g.Text;
                        Message.f fVar2 = Message.f.Sent;
                        P10 = C6966g.P(salesIQChat362, str82, boxLong2, str3, str72, null, gVar2, fVar2, num);
                        String str92 = str3;
                        if (P10 != null) {
                        }
                        arrayList = new ArrayList();
                        arrayList.add(P10);
                        P11 = C6966g.P(this.f44302s.getSalesIQChat(), this.f44302s.getString(t.f61020f1), Boxing.boxLong(j10 + 2), str92, str72, null, Message.g.InlineForm, fVar2, Boxing.boxInt(t.f61020f1));
                        if (P11 != null) {
                            P11 = Message.copy$default(P11, null, null, null, null, null, null, null, null, null, null, 0L, 0L, null, null, null, null, null, null, meta, null, false, null, null, null, null, null, null, null, 0L, 0L, 0L, null, null, null, null, null, false, false, false, false, false, null, -262145, 1023, null);
                        }
                        message2 = P11;
                        if (message2 != null) {
                        }
                        if (!arrayList.isEmpty()) {
                        }
                    }
                    LiveChatUtil.setStartChatDisabled();
                    progressBar2 = this.f44302s.progressBar;
                    if (progressBar2 != null) {
                        Intrinsics.throwUninitializedPropertyAccessException("progressBar");
                    } else {
                        progressBar3 = progressBar2;
                    }
                    progressBar3.setVisibility(8);
                    this.f44302s.V(this.f44303t, new f0());
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Bundle bundle, ChatActivity chatActivity, Continuation continuation) {
            super(2, continuation);
            this.f44295o = bundle;
            this.f44296p = chatActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.f44295o, this.f44296p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((b) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f44294n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Bundle bundle = this.f44295o;
                if (bundle != null) {
                    this.f44296p.Y(bundle.getString("chid", "temp_chid"));
                    this.f44296p.X(this.f44295o.getString("acknowledgement_key", null));
                    ChatActivity chatActivity = this.f44296p;
                    String string = this.f44295o.getString("department_id", null);
                    if (!og.i.f(string)) {
                        string = null;
                    }
                    chatActivity.Z(string);
                    this.f44296p.a0(this.f44295o.getString("question", null));
                    ChatActivity chatActivity2 = this.f44296p;
                    chatActivity2.a0(chatActivity2.getQuestion() != null ? this.f44296p.getQuestion() : ZohoLiveChat.e.f());
                    this.f44296p.singletask = this.f44295o.getString("mode", null);
                    if (this.f44296p.singletask != null && StringsKt.equals(this.f44296p.singletask, "SINGLETASK", true) && Intrinsics.areEqual(rd.b.i().getValue(), Boxing.boxBoolean(false)) && !this.f44295o.getBoolean("ignore_updating_sdk_open", false)) {
                        LiveChatUtil.triggerSalesIQListener("SUPPORT_OPEN", null, null);
                        rd.b.p(true);
                    }
                }
                ChatActivity chatActivity3 = this.f44296p;
                chatActivity3.b0(LiveChatUtil.getChat(chatActivity3.getChatId()));
                if (this.f44296p.getSalesIQChat() == null && this.f44296p.getAcknowledgementKey() != null) {
                    ChatActivity chatActivity4 = this.f44296p;
                    chatActivity4.b0(LiveChatUtil.getChatFromConvID(chatActivity4.getAcknowledgementKey()));
                }
                boolean N10 = com.zoho.livechat.android.modules.brand.ui.helpers.a.N(Md.a.Chat);
                if (!this.f44296p.isFinishing()) {
                    M0 c10 = C1452g0.c();
                    a aVar = new a(N10, this.f44296p, this.f44295o, null);
                    this.f44294n = 1;
                    if (AbstractC1455i.g(c10, aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    public static final void U(ChatActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        List C02 = this$0.getSupportFragmentManager().C0();
        Intrinsics.checkNotNullExpressionValue(C02, "getFragments(...)");
        AbstractC2082d0.i0(this$0.M().b());
        if (C02.isEmpty()) {
            return;
        }
        Fragment fragment = (Fragment) C02.get(C02.size() - 1);
        if (!(fragment instanceof f0)) {
            C6218a.h0(false);
            Toolbar toolbar = this$0.toolbar;
            if (toolbar != null) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.height = fragment instanceof DialogInterfaceOnCancelListenerC2163m ? 0 : -2;
                toolbar.setLayoutParams(marginLayoutParams);
                return;
            }
            return;
        }
        C6218a.h0(true);
        String y10 = C6218a.y();
        Intrinsics.checkNotNullExpressionValue(y10, "getLiveChatID(...)");
        C6966g.i0(y10);
        Toolbar toolbar2 = this$0.toolbar;
        if (toolbar2 != null) {
            p.w(toolbar2);
        }
        Toolbar toolbar3 = this$0.toolbar;
        if (toolbar3 != null) {
            ViewGroup.LayoutParams layoutParams2 = toolbar3.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.height = -2;
            toolbar3.setLayoutParams(marginLayoutParams2);
        }
    }

    public static final void W(Bundle bundle) {
        String string;
        SalesIQChat salesIQChat = null;
        if (bundle != null && (string = bundle.getString("chid", null)) != null) {
            salesIQChat = LiveChatUtil.getChat(string);
        }
        LiveChatUtil.triggerChatListener("CHATVIEW_OPEN", salesIQChat);
    }

    @Override // Yf.c
    public ViewGroup D() {
        ConstraintLayout b10 = M().b();
        Intrinsics.checkNotNullExpressionValue(b10, "getRoot(...)");
        return b10;
    }

    @Override // Yf.c
    public void E(F0 insetsCompat) {
        Intrinsics.checkNotNullParameter(insetsCompat, "insetsCompat");
        e c10 = q.c(insetsCompat);
        e b10 = q.b(insetsCompat);
        e a10 = q.a(insetsCompat);
        int i10 = c10.f19098a + a10.f19098a;
        int i11 = c10.f19100c + a10.f19100c;
        int i12 = c10.f19099b;
        M().b().setPadding(i10, 0, i11, RangesKt.coerceAtLeast(b10.f19101d, c10.f19101d));
        MaterialToolbar siqArticlesToolbar = M().f66298d;
        Intrinsics.checkNotNullExpressionValue(siqArticlesToolbar, "siqArticlesToolbar");
        ViewGroup.LayoutParams layoutParams = siqArticlesToolbar.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = i12;
        siqArticlesToolbar.setLayoutParams(marginLayoutParams);
        List C02 = getSupportFragmentManager().C0();
        Intrinsics.checkNotNullExpressionValue(C02, "getFragments(...)");
        Fragment fragment = (Fragment) CollectionsKt.lastOrNull(C02);
        View siqToolbarSeparator = M().f66301g;
        Intrinsics.checkNotNullExpressionValue(siqToolbarSeparator, "siqToolbarSeparator");
        ViewGroup.LayoutParams layoutParams2 = siqToolbarSeparator.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        boolean z10 = fragment instanceof DialogInterfaceOnCancelListenerC2163m;
        marginLayoutParams2.topMargin = z10 ? i12 : og.i.m(Float.valueOf(getResources().getDimension(o.f59942i))) + i12;
        siqToolbarSeparator.setLayoutParams(marginLayoutParams2);
        FrameLayout siqArticlesFramelayout = M().f66297c;
        Intrinsics.checkNotNullExpressionValue(siqArticlesFramelayout, "siqArticlesFramelayout");
        ViewGroup.LayoutParams layoutParams3 = siqArticlesFramelayout.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
        if (!z10 || (fragment instanceof Bf.b) || (fragment instanceof pe.c)) {
            i12 = i12 + og.i.m(Float.valueOf(getResources().getDimension(o.f59942i))) + og.k.a(1.2f);
        }
        marginLayoutParams3.topMargin = i12;
        siqArticlesFramelayout.setLayoutParams(marginLayoutParams3);
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

    /* renamed from: L, reason: from getter */
    public final String getAcknowledgementKey() {
        return this.acknowledgementKey;
    }

    public final h M() {
        h hVar = this._binding;
        Intrinsics.checkNotNull(hVar);
        return hVar;
    }

    /* renamed from: O, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    /* renamed from: P, reason: from getter */
    public final String getDepartmentId() {
        return this.departmentId;
    }

    /* renamed from: Q, reason: from getter */
    public final String getQuestion() {
        return this.question;
    }

    /* renamed from: R, reason: from getter */
    public final SalesIQChat getSalesIQChat() {
        return this.salesIQChat;
    }

    public final void S(Intent intent) {
        ProgressBar progressBar = this.progressBar;
        if (progressBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressBar");
            progressBar = null;
        }
        progressBar.setVisibility(0);
        findViewById(od.q.f60627q0).setVisibility(8);
        AbstractC1459k.d(AbstractC2194t.a(this), C1452g0.b(), null, new b(intent.getExtras(), this, null), 2, null);
    }

    public final void T() {
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        S(intent);
    }

    public final void V(final Bundle bundle, Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        findViewById(od.q.f60627q0).setVisibility(0);
        fragment.setArguments(bundle);
        N s10 = getSupportFragmentManager().s();
        Intrinsics.checkNotNullExpressionValue(s10, "beginTransaction(...)");
        s10.p(od.q.f60627q0, fragment, fragment.getClass().getName()).i();
        if ((fragment instanceof f0) && !this.isRecreated) {
            LiveChatUtil.submitTaskToExecutorServiceSafely(new Runnable() { // from class: Yf.a
                @Override // java.lang.Runnable
                public final void run() {
                    ChatActivity.W(bundle);
                }
            });
            c0(this.toolbar, AbstractC5886l.f59861m3);
        } else if (fragment instanceof w) {
            c0(this.toolbar, AbstractC5886l.f59840i2);
        }
    }

    public final void X(String str) {
        this.acknowledgementKey = str;
    }

    public final void Y(String str) {
        this.chatId = str;
    }

    public final void Z(String str) {
        this.departmentId = str;
    }

    public final void a0(String str) {
        this.question = str;
    }

    public final void b0(SalesIQChat salesIQChat) {
        this.salesIQChat = salesIQChat;
    }

    public final void c0(Toolbar toolbar, int titleTextColor) {
        if (toolbar != null) {
            toolbar.setTitleTextColor(com.zoho.livechat.android.utils.P.e(toolbar.getContext(), titleTextColor));
        }
    }

    public final Toolbar getToolbar() {
        return this.toolbar;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        boolean z10;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        Fragment o02 = supportFragmentManager.o0(od.q.f60627q0);
        if (o02 != null) {
            z10 = (o02 instanceof f ? (f) o02 : null) != null ? !r4.onBackPressed() : o02 instanceof DialogInterfaceOnCancelListenerC2163m;
        } else {
            z10 = false;
        }
        String str = this.singletask;
        if (str != null && StringsKt.equals(str, "SINGLETASK", true)) {
            LiveChatUtil.triggerSalesIQListener("SUPPORT_CLOSE", null, null);
            rd.b.p(false);
        }
        if (z10) {
            super.onBackPressed();
        }
    }

    @Override // Yf.c, androidx.fragment.app.AbstractActivityC2168s, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        ChatActivity chatActivity;
        String str;
        String str2;
        super.onCreate(savedInstanceState);
        h c10 = h.c(getLayoutInflater());
        this._binding = c10;
        setContentView(c10.b());
        this.chatActivityViewModel = (ChatActivityViewModel) new U(this).a(ChatActivityViewModel.class);
        this.isRecreated = savedInstanceState != null;
        this.appBarLayout = (AppBarLayout) findViewById(od.q.f60261G1);
        this.toolbar = (Toolbar) findViewById(od.q.f60687w0);
        View findViewById = findViewById(od.q.f60627q0);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        FrameLayout frameLayout = (FrameLayout) findViewById;
        AppBarLayout appBarLayout = this.appBarLayout;
        if (appBarLayout != null) {
            Td.e eVar = Td.e.f11456a;
            ConstraintLayout b10 = M().b();
            Intrinsics.checkNotNullExpressionValue(b10, "getRoot(...)");
            chatActivity = this;
            eVar.o(b10, chatActivity, StringsKt.equals(com.zoho.livechat.android.utils.P.j(this), "DARK", true), appBarLayout.getId(), frameLayout.getId());
        } else {
            chatActivity = this;
        }
        A();
        setSupportActionBar(chatActivity.toolbar);
        AbstractC5479a supportActionBar = getSupportActionBar();
        ProgressBar progressBar = null;
        if (supportActionBar != null) {
            supportActionBar.u(true);
            supportActionBar.y(true);
            supportActionBar.t(true);
            SalesIQChat salesIQChat = chatActivity.salesIQChat;
            if (salesIQChat == null || (str = salesIQChat.getConvID()) == null) {
                str = chatActivity.acknowledgementKey;
            }
            SalesIQChat salesIQChat2 = chatActivity.salesIQChat;
            if (salesIQChat2 == null || (str2 = salesIQChat2.getDeptid()) == null) {
                str2 = chatActivity.departmentId;
            }
            SalesIQChat salesIQChat3 = chatActivity.salesIQChat;
            if (a.w(str, str2, og.i.i(salesIQChat3 != null ? Boolean.valueOf(salesIQChat3.isTriggeredChat()) : null)) == EnumC4544a.Online) {
                String e02 = Te.a.e0();
                if (e02 == null || e02.length() == 0) {
                    supportActionBar.C(t.f61148y4);
                } else {
                    supportActionBar.D(Te.a.e0());
                }
            } else {
                String d02 = Te.a.d0();
                if (d02 == null || d02.length() == 0) {
                    supportActionBar.C(t.f61142x4);
                } else {
                    supportActionBar.D(Te.a.d0());
                }
            }
        }
        LiveChatUtil.applyFontForToolbarTitle(chatActivity.toolbar);
        c0(chatActivity.toolbar, AbstractC5886l.f59861m3);
        View findViewById2 = findViewById(od.q.f60293J3);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        ProgressBar progressBar2 = (ProgressBar) findViewById2;
        chatActivity.progressBar = progressBar2;
        if (progressBar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressBar");
        } else {
            progressBar = progressBar2;
        }
        progressBar.getIndeterminateDrawable().setColorFilter(com.zoho.livechat.android.utils.P.a(this), PorterDuff.Mode.SRC_ATOP);
        getSupportFragmentManager().n(new FragmentManager.m() { // from class: Yf.b
            @Override // androidx.fragment.app.FragmentManager.m
            public final void onBackStackChanged() {
                ChatActivity.U(ChatActivity.this);
            }
        });
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        S(intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        S(intent);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        outState.putBoolean("is_recreated", true);
        super.onSaveInstanceState(outState);
    }
}
