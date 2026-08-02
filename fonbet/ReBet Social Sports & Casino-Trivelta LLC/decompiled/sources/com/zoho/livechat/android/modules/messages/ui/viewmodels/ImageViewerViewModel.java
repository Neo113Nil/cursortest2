package com.zoho.livechat.android.modules.messages.ui.viewmodels;

import Ph.AbstractC1459k;
import Ph.C0;
import Ph.C1452g0;
import Ph.P;
import android.app.Application;
import androidx.lifecycle.Q;
import androidx.lifecycle.S;
import com.bumptech.glide.gifdecoder.e;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.AbstractC5323h;
import kotlinx.coroutines.flow.InterfaceC5321f;
import kotlinx.coroutines.flow.InterfaceC5322g;
import kotlinx.coroutines.flow.L;
import kotlinx.coroutines.flow.N;
import kotlinx.coroutines.flow.y;
import me.C5582a;
import od.t;
import og.i;
import uf.C6550a;
import yf.k;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R'\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u001a8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u000b\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/zoho/livechat/android/modules/messages/ui/viewmodels/ImageViewerViewModel;", "Landroidx/lifecycle/Q;", "<init>", "()V", "", "chatId", "", e.f29601m, "(Ljava/lang/String;)V", "Luf/a;", "s", "Lkotlin/Lazy;", "getMessagesRepository", "()Luf/a;", "messagesRepository", "Lyf/k;", "t", "getGetMessagesUseCase", "()Lyf/k;", "getMessagesUseCase", "Lkotlinx/coroutines/flow/y;", "", "Lcom/zoho/livechat/android/models/a;", "u", "Lkotlinx/coroutines/flow/y;", "messagesMutableStateFlow", "Lkotlinx/coroutines/flow/L;", "v", W9.d.f13160a, "()Lkotlinx/coroutines/flow/L;", "messagesFlow", "LPh/C0;", "w", "LPh/C0;", "messagesJob", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ImageViewerViewModel extends Q {

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public final Lazy messagesRepository = LazyKt.lazy(d.f44138d);

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final Lazy getMessagesUseCase = LazyKt.lazy(new a());

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public final y messagesMutableStateFlow = N.a(CollectionsKt.emptyList());

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public final Lazy messagesFlow = LazyKt.lazy(new c());

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public C0 messagesJob;

    public static final class a extends Lambda implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final k invoke() {
            return new k(ImageViewerViewModel.this.getMessagesRepository());
        }
    }

    public static final class b extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f44125n;

        /* renamed from: o, reason: collision with root package name */
        public int f44126o;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ String f44128q;

        public static final class a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f44129n;

            /* renamed from: o, reason: collision with root package name */
            public /* synthetic */ Object f44130o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ ImageViewerViewModel f44131p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ImageViewerViewModel imageViewerViewModel, Continuation continuation) {
                super(2, continuation);
                this.f44131p = imageViewerViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                a aVar = new a(this.f44131p, continuation);
                aVar.f44130o = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(List list, Continuation continuation) {
                return ((a) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f44129n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.f44131p.messagesMutableStateFlow.setValue((List) this.f44130o);
                return Unit.INSTANCE;
            }
        }

        /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ImageViewerViewModel$b$b, reason: collision with other inner class name */
        public static final class C0633b implements InterfaceC5321f {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC5321f f44132a;

            /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ImageViewerViewModel$b$b$a */
            public static final class a implements InterfaceC5322g {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ InterfaceC5322g f44133a;

                /* renamed from: com.zoho.livechat.android.modules.messages.ui.viewmodels.ImageViewerViewModel$b$b$a$a, reason: collision with other inner class name */
                public static final class C0634a extends ContinuationImpl {

                    /* renamed from: n, reason: collision with root package name */
                    public /* synthetic */ Object f44134n;

                    /* renamed from: o, reason: collision with root package name */
                    public int f44135o;

                    public C0634a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f44134n = obj;
                        this.f44135o |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC5322g interfaceC5322g) {
                    this.f44133a = interfaceC5322g;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
                @Override // kotlinx.coroutines.flow.InterfaceC5322g
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C0634a c0634a;
                    int i10;
                    CharSequence a10;
                    String localFilePath;
                    if (continuation instanceof C0634a) {
                        c0634a = (C0634a) continuation;
                        int i11 = c0634a.f44135o;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            c0634a.f44135o = i11 - Integer.MIN_VALUE;
                            Object obj2 = c0634a.f44134n;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i10 = c0634a.f44135o;
                            if (i10 != 0) {
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC5322g interfaceC5322g = this.f44133a;
                                List list = (List) obj;
                                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                                Iterator it = list.iterator();
                                while (true) {
                                    String str = null;
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    Message message = (Message) it.next();
                                    Message.Extras extras = message.getExtras();
                                    File file = (extras == null || (localFilePath = extras.getLocalFilePath()) == null) ? null : new File(localFilePath);
                                    String id2 = message.getId();
                                    String sender = message.getSender();
                                    if (sender == null || !StringsKt.startsWith$default(sender, "$", false, 2, (Object) null)) {
                                        a10 = Vf.b.i().a(message.getDisplayName());
                                    } else {
                                        Application e10 = MobilistenInitProvider.INSTANCE.e();
                                        if (e10 == null || (a10 = e10.getString(t.f61127v1)) == null) {
                                            a10 = Vf.b.i().a(message.getDisplayName());
                                        }
                                    }
                                    CharSequence charSequence = a10;
                                    Long boxLong = Boxing.boxLong(message.getServerTime());
                                    if (boxLong.longValue() <= 0) {
                                        boxLong = null;
                                    }
                                    long longValue = boxLong != null ? boxLong.longValue() : message.getClientTime();
                                    Message.Attachment attachment = message.getAttachment();
                                    long size = attachment != null ? attachment.getSize() : 0L;
                                    Message.Attachment attachment2 = message.getAttachment();
                                    if (attachment2 != null) {
                                        str = attachment2.getFileName();
                                    }
                                    arrayList.add(new com.zoho.livechat.android.models.a(id2, charSequence, longValue, size, str, file));
                                }
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj3 : arrayList) {
                                    com.zoho.livechat.android.models.a aVar = (com.zoho.livechat.android.models.a) obj3;
                                    if (aVar.e() != 0) {
                                        File a11 = aVar.a();
                                        if (i.r(a11 != null ? Boxing.boxLong(a11.length()) : null) > 0) {
                                            arrayList2.add(obj3);
                                        }
                                    }
                                }
                                c0634a.f44135o = 1;
                                if (interfaceC5322g.emit(arrayList2, c0634a) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i10 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c0634a = new C0634a(continuation);
                    Object obj22 = c0634a.f44134n;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = c0634a.f44135o;
                    if (i10 != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            public C0633b(InterfaceC5321f interfaceC5321f) {
                this.f44132a = interfaceC5321f;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC5321f
            public Object collect(InterfaceC5322g interfaceC5322g, Continuation continuation) {
                Object collect = this.f44132a.collect(new a(interfaceC5322g), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Continuation continuation) {
            super(2, continuation);
            this.f44128q = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ImageViewerViewModel.this.new b(this.f44128q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((b) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
        
            if (kotlinx.coroutines.flow.AbstractC5323h.h(r4, r5, r6) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0065, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
        
            if (r7 == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f44126o;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                k getMessagesUseCase = ImageViewerViewModel.this.getGetMessagesUseCase();
                String str = this.f44128q;
                Message.g gVar = Message.g.Image;
                this.f44126o = 1;
                obj = getMessagesUseCase.a(null, str, gVar, this);
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            C5582a c5582a = (C5582a) obj;
            ImageViewerViewModel imageViewerViewModel = ImageViewerViewModel.this;
            if (c5582a.d()) {
                InterfaceC5321f B10 = AbstractC5323h.B(new C0633b((InterfaceC5321f) c5582a.b()), C1452g0.b());
                a aVar = new a(imageViewerViewModel, null);
                this.f44125n = c5582a;
                this.f44126o = 2;
            }
            return Unit.INSTANCE;
        }
    }

    public static final class c extends Lambda implements Function0 {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final y invoke() {
            return ImageViewerViewModel.this.messagesMutableStateFlow;
        }
    }

    public static final class d extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final d f44138d = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C6550a invoke() {
            C6550a.C0924a c0924a = C6550a.f66357j;
            Application e10 = MobilistenInitProvider.INSTANCE.e();
            Intrinsics.checkNotNull(e10);
            return c0924a.a(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k getGetMessagesUseCase() {
        return (k) this.getMessagesUseCase.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C6550a getMessagesRepository() {
        return (C6550a) this.messagesRepository.getValue();
    }

    public final L d() {
        return (L) this.messagesFlow.getValue();
    }

    public final void e(String chatId) {
        C0 d10;
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        C0 c02 = this.messagesJob;
        if (c02 != null) {
            C0.a.b(c02, null, 1, null);
        }
        d10 = AbstractC1459k.d(S.a(this), null, null, new b(chatId, null), 3, null);
        this.messagesJob = d10;
    }
}
