package Bf;

import Bf.b;
import Ph.AbstractC1455i;
import Ph.AbstractC1459k;
import Ph.C1452g0;
import Ph.M0;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.AbstractC2109r0;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.P;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import od.AbstractC5886l;
import od.r;
import od.t;
import od.u;
import og.AbstractC5892d;
import og.AbstractC5893e;
import og.i;
import og.k;
import og.p;
import td.C6461a;
import ud.e;
import ud.g;
import wf.EnumC6745a;

/* loaded from: classes4.dex */
public final class b extends com.google.android.material.bottomsheet.b {

    /* renamed from: n, reason: collision with root package name */
    public Function1 f871n;

    /* renamed from: o, reason: collision with root package name */
    public final Lazy f872o;

    /* renamed from: p, reason: collision with root package name */
    public g f873p;

    /* renamed from: q, reason: collision with root package name */
    public SalesIQChat f874q;

    /* renamed from: r, reason: collision with root package name */
    public Message f875r;

    /* renamed from: Bf.b$b, reason: collision with other inner class name */
    public final class C0023b extends RecyclerView.h {

        /* renamed from: a, reason: collision with root package name */
        public ArrayList f891a = new ArrayList();

        /* renamed from: Bf.b$b$a */
        public final class a extends RecyclerView.F {

            /* renamed from: a, reason: collision with root package name */
            public final e f893a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0023b f894b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(final C0023b c0023b, e binding) {
                super(binding.b());
                Intrinsics.checkNotNullParameter(binding, "binding");
                this.f894b = c0023b;
                this.f893a = binding;
                ConstraintLayout b10 = binding.b();
                final b bVar = b.this;
                b10.setOnClickListener(new View.OnClickListener() { // from class: Bf.c
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        b.C0023b.a.c(b.this, c0023b, this, view);
                    }
                });
            }

            public static final void c(b this$0, C0023b this$1, a this$2, View view) {
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(this$1, "this$1");
                Intrinsics.checkNotNullParameter(this$2, "this$2");
                Function1 q02 = this$0.q0();
                Object obj = this$1.d().get(this$2.getBindingAdapterPosition());
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                q02.invoke(a.g((a) obj, null, 0, 0, this$0.o0(), 7, null));
                if (this$0.isAdded()) {
                    this$0.dismissNow();
                }
            }

            public final e d() {
                return this.f893a;
            }
        }

        public C0023b() {
        }

        public final void c(ArrayList messageOperationsListData) {
            Intrinsics.checkNotNullParameter(messageOperationsListData, "messageOperationsListData");
            this.f891a = messageOperationsListData;
            notifyDataSetChanged();
        }

        public final ArrayList d() {
            return this.f891a;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(a holder, int i10) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            Object obj = this.f891a.get(i10);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            a aVar = (a) obj;
            e d10 = holder.d();
            b bVar = b.this;
            d10.f66289d.setText(bVar.getString(aVar.k()));
            d10.f66287b.setImageDrawable(AbstractC5892d.d(d10.b().getContext(), aVar.h(), AbstractC5886l.f59836h3));
            if (aVar.j() != EnumC6745a.Delete) {
                d10.f66289d.setTextColor(P.e(d10.b().getContext(), AbstractC5886l.f59831g3));
                return;
            }
            int e10 = P.e(bVar.getContext(), AbstractC5886l.f59900w1);
            d10.f66289d.setTextColor(e10);
            AbstractC5893e.a(d10.f66287b.getDrawable(), e10);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a onCreateViewHolder(ViewGroup parent, int i10) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            View inflate = LayoutInflater.from(parent.getContext()).inflate(r.f60780e, parent, false);
            inflate.setClipToOutline(true);
            e a10 = e.a(inflate);
            Intrinsics.checkNotNullExpressionValue(a10, "bind(...)");
            return new a(this, a10);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            return this.f891a.size();
        }
    }

    public static final class c extends Lambda implements Function0 {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C0023b invoke() {
            return b.this.new C0023b();
        }
    }

    public static final class d extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f896n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ boolean f898p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ boolean f899q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ boolean f900r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ FragmentManager f901s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f902t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ View f903u;

        public static final class a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f904n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ b f905o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ ArrayList f906p;

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ FragmentManager f907q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ String f908r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ View f909s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, ArrayList arrayList, FragmentManager fragmentManager, String str, View view, Continuation continuation) {
                super(2, continuation);
                this.f905o = bVar;
                this.f906p = arrayList;
                this.f907q = fragmentManager;
                this.f908r = str;
                this.f909s = view;
            }

            public static final void j(View view) {
                LiveChatUtil.hideKeyboard(view);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f905o, this.f906p, this.f907q, this.f908r, this.f909s, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Ph.P p10, Continuation continuation) {
                return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                String comment;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f904n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.f905o.p0().c(this.f906p);
                if (!this.f906p.isEmpty()) {
                    if (this.f906p.size() == 1 && ((a) CollectionsKt.first((List) this.f906p)).j() == EnumC6745a.Copy) {
                        Message o02 = this.f905o.o0();
                        if (o02 == null || (comment = o02.getContent()) == null) {
                            Message o03 = this.f905o.o0();
                            comment = o03 != null ? o03.getComment() : null;
                        }
                        if (comment != null) {
                            LiveChatUtil.copyText(comment);
                        }
                    } else {
                        this.f905o.show(this.f907q, this.f908r);
                    }
                    final View view = this.f909s;
                    if (view != null) {
                        Boxing.boxBoolean(view.post(new Runnable() { // from class: Bf.d
                            @Override // java.lang.Runnable
                            public final void run() {
                                b.d.a.j(view);
                            }
                        }));
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* renamed from: Bf.b$d$b, reason: collision with other inner class name */
        public /* synthetic */ class C0024b {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC6745a.values().length];
                try {
                    iArr[EnumC6745a.Reply.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC6745a.Edit.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC6745a.Copy.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC6745a.Delete.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC6745a.Retry.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z10, boolean z11, boolean z12, FragmentManager fragmentManager, String str, View view, Continuation continuation) {
            super(2, continuation);
            this.f898p = z10;
            this.f899q = z11;
            this.f900r = z12;
            this.f901s = fragmentManager;
            this.f902t = str;
            this.f903u = view;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return b.this.new d(this.f898p, this.f899q, this.f900r, this.f901s, this.f902t, this.f903u, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((d) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:116:0x01e5  */
        /* JADX WARN: Removed duplicated region for block: B:179:0x02ca A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00d9  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            boolean z10;
            SalesIQChat n02;
            Iterator<E> it;
            M0 c10;
            a aVar;
            Message o02;
            Message.f status;
            SalesIQChat n03;
            int i10;
            Message.Extras extras;
            List<String> chainedMessageIds;
            Message o03;
            int i11;
            Message o04;
            Message.Extras extras2;
            List<String> chainedMessageIds2;
            Message o05;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f896n;
            if (i12 == 0) {
                ResultKt.throwOnFailure(obj);
                if (!b.this.isAdded() && b.this.n0() != null && b.this.o0() != null) {
                    ArrayList arrayList = new ArrayList();
                    boolean i13 = i.i(b.this.n0() != null ? Boxing.boxBoolean(!r2.isBotAttender()) : null);
                    SalesIQChat n04 = b.this.n0();
                    long r10 = i.r(n04 != null ? n04.getChatLastInitiatedTime() : null);
                    Message o06 = b.this.o0();
                    Intrinsics.checkNotNull(o06);
                    boolean z11 = false;
                    if (r10 < o06.getServerTime()) {
                        Message o07 = b.this.o0();
                        Intrinsics.checkNotNull(o07);
                        if (o07.getSender() != null) {
                            Message o08 = b.this.o0();
                            Intrinsics.checkNotNull(o08);
                            if (Intrinsics.areEqual(o08.getSender(), LiveChatUtil.getAnnonID())) {
                                z10 = true;
                                n02 = b.this.n0();
                                if (n02 != null && n02.getStatus() == 2) {
                                    o05 = b.this.o0();
                                    Intrinsics.checkNotNull(o05);
                                    if (i.f(o05.getUniqueID()) && i13) {
                                        z11 = true;
                                    }
                                }
                                EnumEntries<EnumC6745a> entries = EnumC6745a.getEntries();
                                boolean z12 = this.f898p;
                                b bVar = b.this;
                                boolean z13 = this.f899q;
                                boolean z14 = this.f900r;
                                it = entries.iterator();
                                while (it.hasNext()) {
                                    int i14 = C0024b.$EnumSwitchMapping$0[((EnumC6745a) it.next()).ordinal()];
                                    if (i14 != 1) {
                                        if (i14 != 2) {
                                            if (i14 == 3) {
                                                Message o09 = bVar.o0();
                                                Intrinsics.checkNotNull(o09);
                                                if (!i.f(o09.getContent())) {
                                                    Message o010 = bVar.o0();
                                                    Intrinsics.checkNotNull(o010);
                                                    if (o010.getHasComment()) {
                                                    }
                                                }
                                                arrayList.add(a.g(a.f876e.a(), null, 0, 0, bVar.o0(), 7, null));
                                            } else if (i14 == 4) {
                                                if (z11 && z14 && z10) {
                                                    Message o011 = bVar.o0();
                                                    Intrinsics.checkNotNull(o011);
                                                    if (o011.getMessageType().isDeletable()) {
                                                        Message o012 = bVar.o0();
                                                        Intrinsics.checkNotNull(o012);
                                                        if (!Intrinsics.areEqual(o012.isDeleted(), Boxing.boxBoolean(true))) {
                                                            a b10 = a.f876e.b();
                                                            Message o013 = bVar.o0();
                                                            o03 = bVar.o0();
                                                            if (o03 != null && o03.isChainedMessage()) {
                                                                o04 = bVar.o0();
                                                                if (i.k((o04 != null || (extras2 = o04.getExtras()) == null || (chainedMessageIds2 = extras2.getChainedMessageIds()) == null) ? null : Boxing.boxInt(chainedMessageIds2.size())) > 1) {
                                                                    i11 = t.f60987a3;
                                                                    arrayList.add(a.g(b10, null, 0, i11, o013, 3, null));
                                                                }
                                                            }
                                                            i11 = t.f61102r0;
                                                            arrayList.add(a.g(b10, null, 0, i11, o013, 3, null));
                                                        }
                                                    }
                                                }
                                                Message o014 = bVar.o0();
                                                Intrinsics.checkNotNull(o014);
                                                if (o014.getStatus() == Message.f.Failure) {
                                                    a b102 = a.f876e.b();
                                                    Message o0132 = bVar.o0();
                                                    o03 = bVar.o0();
                                                    if (o03 != null) {
                                                        o04 = bVar.o0();
                                                        if (i.k((o04 != null || (extras2 = o04.getExtras()) == null || (chainedMessageIds2 = extras2.getChainedMessageIds()) == null) ? null : Boxing.boxInt(chainedMessageIds2.size())) > 1) {
                                                        }
                                                    }
                                                    i11 = t.f61102r0;
                                                    arrayList.add(a.g(b102, null, 0, i11, o0132, 3, null));
                                                }
                                            } else if (i14 == 5 && (o02 = bVar.o0()) != null && (status = o02.getStatus()) != null && Message.f.Companion.b(status) && ((n03 = bVar.n0()) == null || n03.getStatus() != 4)) {
                                                SalesIQChat n05 = bVar.n0();
                                                if (n05 == null || n05.getStatus() != 3) {
                                                    a e10 = a.f876e.e();
                                                    Message o015 = bVar.o0();
                                                    Message o016 = bVar.o0();
                                                    if (o016 != null && o016.isChainedMessage()) {
                                                        Message o017 = bVar.o0();
                                                        if (i.k((o017 == null || (extras = o017.getExtras()) == null || (chainedMessageIds = extras.getChainedMessageIds()) == null) ? null : Boxing.boxInt(chainedMessageIds.size())) > 1) {
                                                            i10 = t.f61001c3;
                                                            arrayList.add(a.g(e10, null, 0, i10, o015, 3, null));
                                                        }
                                                    }
                                                    i10 = t.f61108s0;
                                                    arrayList.add(a.g(e10, null, 0, i10, o015, 3, null));
                                                }
                                            }
                                        } else if (z11 && z13 && z10) {
                                            Message o018 = bVar.o0();
                                            Intrinsics.checkNotNull(o018);
                                            if (o018.getMessageType().isEditable()) {
                                                Message o019 = bVar.o0();
                                                Intrinsics.checkNotNull(o019);
                                                if (!Intrinsics.areEqual(o019.isDeleted(), Boxing.boxBoolean(true))) {
                                                    arrayList.add(a.g(a.f876e.c(), null, 0, 0, bVar.o0(), 7, null));
                                                }
                                            }
                                        }
                                    } else if (z11 && z12) {
                                        Message o020 = bVar.o0();
                                        Intrinsics.checkNotNull(o020);
                                        if (!Intrinsics.areEqual(o020.isDeleted(), Boxing.boxBoolean(true))) {
                                            arrayList.add(a.g(a.f876e.d(), null, 0, 0, bVar.o0(), 7, null));
                                        }
                                    }
                                }
                                c10 = C1452g0.c();
                                aVar = new a(b.this, arrayList, this.f901s, this.f902t, this.f903u, null);
                                this.f896n = 1;
                                if (AbstractC1455i.g(c10, aVar, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        }
                    }
                    z10 = false;
                    n02 = b.this.n0();
                    if (n02 != null) {
                        o05 = b.this.o0();
                        Intrinsics.checkNotNull(o05);
                        if (i.f(o05.getUniqueID())) {
                            z11 = true;
                        }
                    }
                    EnumEntries<EnumC6745a> entries2 = EnumC6745a.getEntries();
                    boolean z122 = this.f898p;
                    b bVar2 = b.this;
                    boolean z132 = this.f899q;
                    boolean z142 = this.f900r;
                    it = entries2.iterator();
                    while (it.hasNext()) {
                    }
                    c10 = C1452g0.c();
                    aVar = new a(b.this, arrayList, this.f901s, this.f902t, this.f903u, null);
                    this.f896n = 1;
                    if (AbstractC1455i.g(c10, aVar, this) == coroutine_suspended) {
                    }
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public b(Function1 onSelectItem) {
        Intrinsics.checkNotNullParameter(onSelectItem, "onSelectItem");
        this.f871n = onSelectItem;
        this.f872o = LazyKt.lazy(new c());
    }

    public static final void r0(DialogInterface dialogInterface) {
        com.google.android.material.bottomsheet.a aVar = dialogInterface instanceof com.google.android.material.bottomsheet.a ? (com.google.android.material.bottomsheet.a) dialogInterface : null;
        View findViewById = aVar != null ? aVar.findViewById(ia.g.f48429f) : null;
        if (findViewById != null) {
            BottomSheetBehavior.q0(findViewById).c1(3);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m
    public int getTheme() {
        return u.f61158d;
    }

    public final g m0() {
        g gVar = this.f873p;
        Intrinsics.checkNotNull(gVar);
        return gVar;
    }

    public final SalesIQChat n0() {
        return this.f874q;
    }

    public final Message o0() {
        return this.f875r;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, u.f61158d);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f873p = g.a(inflater.inflate(r.f60784g, viewGroup, false));
        RecyclerView recyclerView = m0().f66294c;
        recyclerView.setAdapter(p0());
        recyclerView.setLayoutManager(new LinearLayoutManager(m0().b().getContext()));
        View dragger = m0().f66293b;
        Intrinsics.checkNotNullExpressionValue(dragger, "dragger");
        int b10 = k.b(4);
        Context context = m0().b().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        p.d(dragger, b10, Integer.valueOf(AbstractC5892d.h(context, Integer.valueOf(AbstractC5886l.f59724H2), 0.0f, 2, null)), 0, null, false, 28, null);
        float b11 = k.b(28);
        ConstraintLayout b12 = m0().b();
        Intrinsics.checkNotNullExpressionValue(b12, "getRoot(...)");
        Context context2 = m0().b().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        p.i(b12, new float[]{b11, b11, b11, b11, 0.0f, 0.0f, 0.0f, 0.0f}, null, Integer.valueOf(AbstractC5892d.h(context2, Integer.valueOf(AbstractC5886l.f59837i), 0.0f, 2, null)), null, null, false, 56, null);
        ConstraintLayout b13 = m0().b();
        Intrinsics.checkNotNullExpressionValue(b13, "getRoot(...)");
        return b13;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f873p = null;
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
        window.setWindowAnimations(u.f61157c);
        window.setNavigationBarColor(h10);
        AbstractC2109r0.a(window, window.getDecorView()).d(!equals);
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setOnShowListener(new DialogInterface.OnShowListener() { // from class: Bf.a
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    b.r0(dialogInterface);
                }
            });
        }
    }

    public final C0023b p0() {
        return (C0023b) this.f872o.getValue();
    }

    public final Function1 q0() {
        return this.f871n;
    }

    public final void s0(SalesIQChat salesIQChat) {
        this.f874q = salesIQChat;
    }

    public final void t0(Message message) {
        this.f875r = message;
    }

    public final void u0(FragmentManager manager, String str, boolean z10, boolean z11, boolean z12, View view) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        AbstractC1459k.d(C6461a.f65810a.e(), null, null, new d(z12, z10, z11, manager, str, view, null), 3, null);
    }

    public static final class a {

        /* renamed from: e, reason: collision with root package name */
        public static final f f876e = new f(null);

        /* renamed from: f, reason: collision with root package name */
        public static final Lazy f877f = LazyKt.lazy(C0021a.f886d);

        /* renamed from: g, reason: collision with root package name */
        public static final Lazy f878g = LazyKt.lazy(c.f888d);

        /* renamed from: h, reason: collision with root package name */
        public static final Lazy f879h = LazyKt.lazy(d.f889d);

        /* renamed from: i, reason: collision with root package name */
        public static final Lazy f880i = LazyKt.lazy(C0022b.f887d);

        /* renamed from: j, reason: collision with root package name */
        public static final Lazy f881j = LazyKt.lazy(e.f890d);

        /* renamed from: a, reason: collision with root package name */
        public final EnumC6745a f882a;

        /* renamed from: b, reason: collision with root package name */
        public final int f883b;

        /* renamed from: c, reason: collision with root package name */
        public final int f884c;

        /* renamed from: d, reason: collision with root package name */
        public final Message f885d;

        /* renamed from: Bf.b$a$a, reason: collision with other inner class name */
        public static final class C0021a extends Lambda implements Function0 {

            /* renamed from: d, reason: collision with root package name */
            public static final C0021a f886d = new C0021a();

            public C0021a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a invoke() {
                return new a(EnumC6745a.Copy, od.p.f60174v, t.f61096q0, null, 8, null);
            }
        }

        /* renamed from: Bf.b$a$b, reason: collision with other inner class name */
        public static final class C0022b extends Lambda implements Function0 {

            /* renamed from: d, reason: collision with root package name */
            public static final C0022b f887d = new C0022b();

            public C0022b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a invoke() {
                return new a(EnumC6745a.Delete, od.p.f60179w, t.f61102r0, null, 8, null);
            }
        }

        public static final class c extends Lambda implements Function0 {

            /* renamed from: d, reason: collision with root package name */
            public static final c f888d = new c();

            public c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a invoke() {
                return new a(EnumC6745a.Edit, od.p.f60194z, t.f61043i3, null, 8, null);
            }
        }

        public static final class d extends Lambda implements Function0 {

            /* renamed from: d, reason: collision with root package name */
            public static final d f889d = new d();

            public d() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a invoke() {
                return new a(EnumC6745a.Reply, od.p.f60008N, t.f61050j3, null, 8, null);
            }
        }

        public static final class e extends Lambda implements Function0 {

            /* renamed from: d, reason: collision with root package name */
            public static final e f890d = new e();

            public e() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a invoke() {
                return new a(EnumC6745a.Retry, od.p.f59980H1, t.f61108s0, null, 8, null);
            }
        }

        public static final class f {
            public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a() {
                return (a) a.f877f.getValue();
            }

            public final a b() {
                return (a) a.f880i.getValue();
            }

            public final a c() {
                return (a) a.f878g.getValue();
            }

            public final a d() {
                return (a) a.f879h.getValue();
            }

            public final a e() {
                return (a) a.f881j.getValue();
            }

            public f() {
            }
        }

        public a(EnumC6745a messageAction, int i10, int i11, Message message) {
            Intrinsics.checkNotNullParameter(messageAction, "messageAction");
            this.f882a = messageAction;
            this.f883b = i10;
            this.f884c = i11;
            this.f885d = message;
        }

        public static /* synthetic */ a g(a aVar, EnumC6745a enumC6745a, int i10, int i11, Message message, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                enumC6745a = aVar.f882a;
            }
            if ((i12 & 2) != 0) {
                i10 = aVar.f883b;
            }
            if ((i12 & 4) != 0) {
                i11 = aVar.f884c;
            }
            if ((i12 & 8) != 0) {
                message = aVar.f885d;
            }
            return aVar.f(enumC6745a, i10, i11, message);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f882a == aVar.f882a && this.f883b == aVar.f883b && this.f884c == aVar.f884c && Intrinsics.areEqual(this.f885d, aVar.f885d);
        }

        public final a f(EnumC6745a messageAction, int i10, int i11, Message message) {
            Intrinsics.checkNotNullParameter(messageAction, "messageAction");
            return new a(messageAction, i10, i11, message);
        }

        public final int h() {
            return this.f883b;
        }

        public int hashCode() {
            int hashCode = ((((this.f882a.hashCode() * 31) + Integer.hashCode(this.f883b)) * 31) + Integer.hashCode(this.f884c)) * 31;
            Message message = this.f885d;
            return hashCode + (message == null ? 0 : message.hashCode());
        }

        public final Message i() {
            return this.f885d;
        }

        public final EnumC6745a j() {
            return this.f882a;
        }

        public final int k() {
            return this.f884c;
        }

        public String toString() {
            return "MessageOperationData(messageAction=" + this.f882a + ", imageResourceId=" + this.f883b + ", messageOperationStringResourceId=" + this.f884c + ", message=" + this.f885d + ')';
        }

        public /* synthetic */ a(EnumC6745a enumC6745a, int i10, int i11, Message message, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(enumC6745a, i10, i11, (i12 & 8) != 0 ? null : message);
        }
    }
}
