package zf;

import Cf.f0;
import Ph.AbstractC1440a0;
import Ph.AbstractC1455i;
import Ph.AbstractC1457j;
import Ph.AbstractC1459k;
import Ph.C0;
import Ph.C1452g0;
import Ph.M0;
import Uf.j;
import a1.C1908a;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.os.Handler;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.util.Log;
import android.view.View;
import android.webkit.MimeTypeMap;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.plaid.internal.EnumC3631g;
import com.reactnativecommunity.clipboard.ClipboardModule;
import com.zoho.livechat.android.ZohoLiveChat;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.ui.activities.ChatActivity;
import com.zoho.livechat.android.utils.LiveChatUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
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
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.AbstractC5323h;
import kotlinx.coroutines.flow.InterfaceC5321f;
import l.AbstractC5335a;
import me.C5582a;
import od.t;
import og.i;
import rd.C6218a;
import td.C6461a;
import uf.C6550a;
import wf.EnumC6745a;
import yf.C6881A;
import yf.C6882B;
import yf.C6883C;
import yf.C6885b;
import yf.C6888e;
import yf.C6889f;
import yf.k;
import yf.m;
import yf.n;
import yf.o;
import yf.q;
import yf.s;
import yf.w;
import yf.x;
import yf.y;
import zf.C6966g;

/* renamed from: zf.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6966g {

    /* renamed from: a, reason: collision with root package name */
    public static final C6966g f68951a = new C6966g();

    /* renamed from: b, reason: collision with root package name */
    public static final Lazy f68952b = LazyKt.lazy(C6983r.f69100d);

    /* renamed from: c, reason: collision with root package name */
    public static final Lazy f68953c = LazyKt.lazy(E.f69019d);

    /* renamed from: d, reason: collision with root package name */
    public static final Lazy f68954d = LazyKt.lazy(J.f69040d);

    /* renamed from: e, reason: collision with root package name */
    public static final Lazy f68955e = LazyKt.lazy(C6989x.f69109d);

    /* renamed from: f, reason: collision with root package name */
    public static final Lazy f68956f = LazyKt.lazy(C6968b.f69075d);

    /* renamed from: g, reason: collision with root package name */
    public static final Lazy f68957g = LazyKt.lazy(Q.f69052d);

    /* renamed from: h, reason: collision with root package name */
    public static final Lazy f68958h = LazyKt.lazy(T.f69061d);

    /* renamed from: i, reason: collision with root package name */
    public static final Lazy f68959i = LazyKt.lazy(P.f69051d);

    /* renamed from: j, reason: collision with root package name */
    public static final Lazy f68960j = LazyKt.lazy(V.f69066d);

    /* renamed from: k, reason: collision with root package name */
    public static final Lazy f68961k = LazyKt.lazy(W.f69067d);

    /* renamed from: l, reason: collision with root package name */
    public static final Lazy f68962l = LazyKt.lazy(N.f69046d);

    /* renamed from: m, reason: collision with root package name */
    public static final Lazy f68963m = LazyKt.lazy(C6987v.f69107d);

    /* renamed from: n, reason: collision with root package name */
    public static final Lazy f68964n = LazyKt.lazy(C6971e.f69082d);

    /* renamed from: o, reason: collision with root package name */
    public static final Lazy f68965o = LazyKt.lazy(y.f69110d);

    /* renamed from: p, reason: collision with root package name */
    public static final Lazy f68966p = LazyKt.lazy(M.f69045d);

    /* renamed from: q, reason: collision with root package name */
    public static final Lazy f68967q = LazyKt.lazy(C6985t.f69104d);

    /* renamed from: r, reason: collision with root package name */
    public static final Lazy f68968r = LazyKt.lazy(C6975j.f69089d);

    /* renamed from: s, reason: collision with root package name */
    public static final Lazy f68969s = LazyKt.lazy(C6976k.f69090d);

    /* renamed from: t, reason: collision with root package name */
    public static final Lazy f68970t = LazyKt.lazy(C6978m.f69093d);

    /* renamed from: u, reason: collision with root package name */
    public static final Lazy f68971u = LazyKt.lazy(C6973h.f69086d);

    /* renamed from: v, reason: collision with root package name */
    public static final Lazy f68972v = LazyKt.lazy(C6972f.f69083d);

    /* renamed from: w, reason: collision with root package name */
    public static final Lazy f68973w = LazyKt.lazy(C6982q.f69099d);

    /* renamed from: x, reason: collision with root package name */
    public static final Lazy f68974x = LazyKt.lazy(L.f69044d);

    /* renamed from: y, reason: collision with root package name */
    public static final Lazy f68975y = LazyKt.lazy(C6981p.f69098d);

    /* renamed from: z, reason: collision with root package name */
    public static String f68976z;

    /* renamed from: zf.g$A */
    public static final class A extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f68977n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ boolean f68978o;

        /* renamed from: zf.g$A$a */
        public static final class a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public Object f68979n;

            /* renamed from: o, reason: collision with root package name */
            public Object f68980o;

            /* renamed from: p, reason: collision with root package name */
            public int f68981p;

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ Ref.ObjectRef f68982q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ File f68983r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ Long f68984s;

            /* renamed from: zf.g$A$a$a, reason: collision with other inner class name */
            public static final class C1010a extends SuspendLambda implements Function2 {

                /* renamed from: n, reason: collision with root package name */
                public int f68985n;

                /* renamed from: o, reason: collision with root package name */
                public final /* synthetic */ File f68986o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1010a(File file, Continuation continuation) {
                    super(2, continuation);
                    this.f68986o = file;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C1010a(this.f68986o, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Ph.P p10, Continuation continuation) {
                    return ((C1010a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f68985n != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Boxing.boxLong(this.f68986o.length());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Ref.ObjectRef objectRef, File file, Long l10, Continuation continuation) {
                super(2, continuation);
                this.f68982q = objectRef;
                this.f68983r = file;
                this.f68984s = l10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f68982q, this.f68983r, this.f68984s, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Ph.P p10, Continuation continuation) {
                return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                f0 f0Var;
                String str;
                FragmentManager supportFragmentManager;
                List C02;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f68981p;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Activity n10 = j.n();
                    ChatActivity chatActivity = n10 instanceof ChatActivity ? (ChatActivity) n10 : null;
                    Fragment fragment = (chatActivity == null || (supportFragmentManager = chatActivity.getSupportFragmentManager()) == null || (C02 = supportFragmentManager.C0()) == null) ? null : (Fragment) CollectionsKt.firstOrNull(C02);
                    f0Var = fragment instanceof f0 ? (f0) fragment : null;
                    if (f0Var != null) {
                        String str2 = (String) this.f68982q.element;
                        Ph.L b10 = C1452g0.b();
                        C1010a c1010a = new C1010a(this.f68983r, null);
                        this.f68979n = f0Var;
                        this.f68980o = str2;
                        this.f68981p = 1;
                        Object g10 = AbstractC1455i.g(b10, c1010a, this);
                        if (g10 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str = str2;
                        obj = g10;
                    }
                    return Unit.INSTANCE;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str3 = (String) this.f68980o;
                f0Var = (f0) this.f68979n;
                ResultKt.throwOnFailure(obj);
                str = str3;
                f0.M6(f0Var, null, this.f68983r, ClipboardModule.MIMETYPE_JPEG, ((Number) obj).longValue(), str, this.f68984s, false, 65, null);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public A(boolean z10, Continuation continuation) {
            super(2, continuation);
            this.f68978o = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new A(this.f68978o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((A) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r4v3, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f68977n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            boolean z10 = this.f68978o;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ?? name = sd.c.f64855b.getName();
            objectRef.element = name;
            File putImageInSdcard = com.zoho.livechat.android.utils.y.INSTANCE.putImageInSdcard(sd.c.f64855b, name);
            sd.c.f64854a = false;
            sd.c.f64855b = null;
            T element = objectRef.element;
            Intrinsics.checkNotNullExpressionValue(element, "element");
            Long longOrNull = StringsKt.toLongOrNull((String) StringsKt.split$default((CharSequence) element, new String[]{"_"}, false, 0, 6, (Object) null).get(1));
            C6966g c6966g = C6966g.f68951a;
            SalesIQChat chat = LiveChatUtil.getChat(c6966g.U());
            if (!z10 && (j.n() instanceof ChatActivity)) {
                z10 = !Intrinsics.areEqual(C6218a.y(), c6966g.U());
            }
            objectRef.element = "screenshot_" + longOrNull + ".jpg";
            if (z10) {
                if (chat != null) {
                    Intrinsics.checkNotNull(putImageInSdcard);
                    C6966g.p0(chat, putImageInSdcard, (String) objectRef.element, longOrNull);
                }
                Application C10 = c6966g.C();
                if (C10 != null) {
                    Intent intent = new Intent(c6966g.C(), (Class<?>) ChatActivity.class);
                    intent.setFlags(268435456);
                    intent.putExtra("chid", c6966g.U());
                    C10.startActivity(intent);
                }
            } else {
                AbstractC1459k.d(C6461a.f65810a.d(), null, null, new a(objectRef, putImageInSdcard, longOrNull, null), 3, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: zf.g$B */
    public static final class B extends SuspendLambda implements Function2 {

        /* renamed from: A, reason: collision with root package name */
        public final /* synthetic */ SalesIQChat f68987A;

        /* renamed from: B, reason: collision with root package name */
        public final /* synthetic */ String f68988B;

        /* renamed from: n, reason: collision with root package name */
        public Object f68989n;

        /* renamed from: o, reason: collision with root package name */
        public Object f68990o;

        /* renamed from: p, reason: collision with root package name */
        public Object f68991p;

        /* renamed from: q, reason: collision with root package name */
        public Object f68992q;

        /* renamed from: r, reason: collision with root package name */
        public Object f68993r;

        /* renamed from: s, reason: collision with root package name */
        public Object f68994s;

        /* renamed from: t, reason: collision with root package name */
        public Object f68995t;

        /* renamed from: u, reason: collision with root package name */
        public Object f68996u;

        /* renamed from: v, reason: collision with root package name */
        public boolean f68997v;

        /* renamed from: w, reason: collision with root package name */
        public int f68998w;

        /* renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f68999x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Long f69000y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ File f69001z;

        /* renamed from: zf.g$B$a */
        public static final class a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f69002n;

            public a(Continuation continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Ph.P p10, Continuation continuation) {
                return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f69002n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Activity n10 = j.n();
                if (n10 != null) {
                    return qe.d.i(n10, null, n10.getString(t.f60956V2), n10.getString(t.f61140x2), null, null, null, null, null, null, null, false, false, null, 16370, null);
                }
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public B(Long l10, File file, SalesIQChat salesIQChat, String str, Continuation continuation) {
            super(2, continuation);
            this.f69000y = l10;
            this.f69001z = file;
            this.f68987A = salesIQChat;
            this.f68988B = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            B b10 = new B(this.f69000y, this.f69001z, this.f68987A, this.f68988B, continuation);
            b10.f68999x = obj;
            return b10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((B) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v14, types: [T, com.zoho.livechat.android.modules.messages.domain.entities.Message$Attachment$Dimension] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            String str2;
            Message.g gVar;
            File file;
            String str3;
            C6966g c6966g;
            String str4;
            Message.Attachment attachment;
            Message.Extras extras;
            boolean z10;
            String str5;
            boolean z11;
            File file2;
            String str6;
            Message.g gVar2;
            Message.Extras extras2;
            C6966g c6966g2;
            String str7;
            Message.Attachment attachment2;
            String str8;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f68998w;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Ph.P p10 = (Ph.P) this.f68999x;
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                Long l10 = this.f69000y;
                long longValue = l10 != null ? l10.longValue() : rd.b.f();
                long length = this.f69001z.length();
                String str9 = ClipboardModule.MIMETYPE_JPG;
                if (length < 51200000 && StringsKt.contains$default((CharSequence) ClipboardModule.MIMETYPE_JPG, (CharSequence) "image", false, 2, (Object) null)) {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    options.inInputShareable = false;
                    options.inPurgeable = true;
                    options.inPreferredConfig = Bitmap.Config.ALPHA_8;
                    options.inDither = true;
                    BitmapFactory.decodeFile(this.f69001z.getAbsolutePath(), options);
                    objectRef.element = com.zoho.livechat.android.utils.y.INSTANCE.getDimensions(options.outWidth, options.outHeight);
                }
                SalesIQChat salesIQChat = this.f68987A;
                if (!i.e(salesIQChat.getChid()) || !i.e(salesIQChat.getVisitorid()) || !i.e(salesIQChat.getRchatid())) {
                    p10 = null;
                }
                if (p10 != null) {
                    SalesIQChat salesIQChat2 = this.f68987A;
                    File file3 = this.f69001z;
                    String str10 = this.f68988B;
                    C6966g c6966g3 = C6966g.f68951a;
                    String convID = salesIQChat2.getConvID();
                    String chid = salesIQChat2.getChid();
                    Intrinsics.checkNotNull(chid);
                    String visitorid = salesIQChat2.getVisitorid();
                    Intrinsics.checkNotNull(visitorid);
                    Message.g gVar3 = Message.g.Image;
                    String valueOf = String.valueOf(longValue);
                    Message.Attachment attachment3 = new Message.Attachment(null, null, null, null, null, null, str9, null, length, str10, file3.getAbsolutePath(), (Message.Attachment.Dimension) objectRef.element, null, null, null, null, null, null, null, null, null, str9, null, null, null, 31453375, null);
                    String name = file3.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    Message.Extras L10 = C6966g.L(name);
                    boolean z12 = length >= 51200000;
                    if (z12) {
                        M0 c10 = C1452g0.c();
                        a aVar = new a(null);
                        this.f68999x = file3;
                        this.f68989n = c6966g3;
                        this.f68990o = convID;
                        this.f68991p = chid;
                        this.f68992q = visitorid;
                        this.f68993r = gVar3;
                        this.f68994s = valueOf;
                        this.f68995t = L10;
                        this.f68996u = attachment3;
                        this.f68997v = z12;
                        this.f68998w = 1;
                        if (AbstractC1455i.g(c10, aVar, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str5 = chid;
                        z11 = z12;
                        file2 = file3;
                        str6 = valueOf;
                        gVar2 = gVar3;
                        extras2 = L10;
                        c6966g2 = c6966g3;
                        str7 = visitorid;
                        attachment2 = attachment3;
                        str8 = convID;
                    } else {
                        str = chid;
                        str2 = visitorid;
                        gVar = gVar3;
                        file = file3;
                        str3 = valueOf;
                        c6966g = c6966g3;
                        str4 = convID;
                        attachment = attachment3;
                        extras = L10;
                        z10 = z12;
                        c6966g.l0(str4, str, str2, null, gVar, str3, attachment, extras, file, z10);
                    }
                }
                return Unit.INSTANCE;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z11 = this.f68997v;
            attachment2 = (Message.Attachment) this.f68996u;
            extras2 = (Message.Extras) this.f68995t;
            str6 = (String) this.f68994s;
            gVar2 = (Message.g) this.f68993r;
            str7 = (String) this.f68992q;
            str5 = (String) this.f68991p;
            str8 = (String) this.f68990o;
            c6966g2 = (C6966g) this.f68989n;
            file2 = (File) this.f68999x;
            ResultKt.throwOnFailure(obj);
            z10 = z11;
            attachment = attachment2;
            extras = extras2;
            str3 = str6;
            gVar = gVar2;
            str2 = str7;
            str = str5;
            str4 = str8;
            c6966g = c6966g2;
            file = file2;
            c6966g.l0(str4, str, str2, null, gVar, str3, attachment, extras, file, z10);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: zf.g$C */
    public static final class C extends SuspendLambda implements Function2 {

        /* renamed from: A, reason: collision with root package name */
        public final /* synthetic */ long f69003A;

        /* renamed from: n, reason: collision with root package name */
        public Object f69004n;

        /* renamed from: o, reason: collision with root package name */
        public Object f69005o;

        /* renamed from: p, reason: collision with root package name */
        public Object f69006p;

        /* renamed from: q, reason: collision with root package name */
        public Object f69007q;

        /* renamed from: r, reason: collision with root package name */
        public Object f69008r;

        /* renamed from: s, reason: collision with root package name */
        public long f69009s;

        /* renamed from: t, reason: collision with root package name */
        public long f69010t;

        /* renamed from: u, reason: collision with root package name */
        public int f69011u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ long f69012v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Context f69013w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ SalesIQChat f69014x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Integer f69015y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ String f69016z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C(long j10, Context context, SalesIQChat salesIQChat, Integer num, String str, long j11, Continuation continuation) {
            super(2, continuation);
            this.f69012v = j10;
            this.f69013w = context;
            this.f69014x = salesIQChat;
            this.f69015y = num;
            this.f69016z = str;
            this.f69003A = j11;
        }

        public static final void j(SalesIQChat salesIQChat) {
            LiveChatUtil.showFeedbackDialog(j.n(), salesIQChat);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C(this.f69012v, this.f69013w, this.f69014x, this.f69015y, this.f69016z, this.f69003A, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((C) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:53:0x013c, code lost:
        
            if (com.zoho.livechat.android.utils.LiveChatUtil.canShowRating() != false) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x0150, code lost:
        
            if (r10.intValue() == 1) goto L55;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x0152, code lost:
        
            r5 = r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0157, code lost:
        
            if (r12.getStatus() != 4) goto L92;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x0159, code lost:
        
            r4 = (java.lang.Boolean) Ye.d.h().b(De.a.ShowFeedbackAfterSkip, true).b();
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x0172, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r4, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true)) != false) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x0174, code lost:
        
            r5 = r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x017c, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r4, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true)) != false) goto L92;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x017e, code lost:
        
            r4 = zf.C6966g.f68951a.N().y0();
            r6 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
            r7 = r12.getChid();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r11);
            r5 = r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x019d, code lost:
        
            if (((java.lang.Boolean) r4.invoke(r6, r7)).booleanValue() != false) goto L92;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x019f, code lost:
        
            com.zoho.livechat.android.utils.LiveChatUtil.log("showFeedbackDialog MessagesUtil: " + r9);
            r4 = zf.C6966g.f68951a.F();
            r6 = r12.getConvID();
            r7 = r12.getChid();
            r29.f69004n = r5;
            r29.f69005o = r12;
            r29.f69006p = null;
            r29.f69007q = null;
            r29.f69009s = r2;
            r29.f69011u = 4;
            r4 = r4.b(r6, r7, true, r29);
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x01d3, code lost:
        
            if (r4 != r0) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x01d6, code lost:
        
            r16 = r12;
            r5 = r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x0145, code lost:
        
            if (r10.intValue() != 2) goto L51;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0221 A[Catch: all -> 0x002d, TryCatch #2 {all -> 0x002d, blocks: (B:9:0x0023, B:11:0x01d8, B:13:0x01e2, B:16:0x01f8, B:20:0x0207, B:22:0x0221, B:23:0x0225, B:25:0x022b, B:27:0x0239, B:29:0x023d, B:31:0x0243, B:33:0x0249, B:34:0x0255, B:35:0x0261, B:40:0x0202, B:41:0x01ed, B:48:0x0121, B:50:0x0132, B:52:0x0138, B:58:0x014b, B:60:0x0152, B:62:0x0159, B:64:0x0174, B:66:0x017e, B:68:0x019f, B:72:0x0141, B:86:0x00f9, B:94:0x00da), top: B:2:0x000f }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x022b A[Catch: all -> 0x002d, TryCatch #2 {all -> 0x002d, blocks: (B:9:0x0023, B:11:0x01d8, B:13:0x01e2, B:16:0x01f8, B:20:0x0207, B:22:0x0221, B:23:0x0225, B:25:0x022b, B:27:0x0239, B:29:0x023d, B:31:0x0243, B:33:0x0249, B:34:0x0255, B:35:0x0261, B:40:0x0202, B:41:0x01ed, B:48:0x0121, B:50:0x0132, B:52:0x0138, B:58:0x014b, B:60:0x0152, B:62:0x0159, B:64:0x0174, B:66:0x017e, B:68:0x019f, B:72:0x0141, B:86:0x00f9, B:94:0x00da), top: B:2:0x000f }] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0132 A[Catch: all -> 0x002d, TryCatch #2 {all -> 0x002d, blocks: (B:9:0x0023, B:11:0x01d8, B:13:0x01e2, B:16:0x01f8, B:20:0x0207, B:22:0x0221, B:23:0x0225, B:25:0x022b, B:27:0x0239, B:29:0x023d, B:31:0x0243, B:33:0x0249, B:34:0x0255, B:35:0x0261, B:40:0x0202, B:41:0x01ed, B:48:0x0121, B:50:0x0132, B:52:0x0138, B:58:0x014b, B:60:0x0152, B:62:0x0159, B:64:0x0174, B:66:0x017e, B:68:0x019f, B:72:0x0141, B:86:0x00f9, B:94:0x00da), top: B:2:0x000f }] */
        /* JADX WARN: Removed duplicated region for block: B:88:0x011f  */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v13 */
        /* JADX WARN: Type inference failed for: r5v15 */
        /* JADX WARN: Type inference failed for: r5v2, types: [Wh.a] */
        /* JADX WARN: Type inference failed for: r5v33 */
        /* JADX WARN: Type inference failed for: r5v34 */
        /* JADX WARN: Type inference failed for: r5v35 */
        /* JADX WARN: Type inference failed for: r5v36 */
        /* JADX WARN: Type inference failed for: r5v8, types: [Wh.a] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            long j10;
            Integer num;
            Context context;
            Wh.a aVar;
            String str;
            SalesIQChat salesIQChat;
            long j11;
            String str2;
            long j12;
            Integer num2;
            final SalesIQChat salesIQChat2;
            Wh.a aVar2;
            String str3;
            long j13;
            String str4;
            Object b10;
            Wh.a aVar3;
            Wh.a aVar4;
            String attenderid;
            String attenderName;
            Message Q10;
            Activity n10;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f69011u;
            ?? r52 = 4;
            try {
            } catch (Throwable th2) {
                th = th2;
            }
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Wh.a a10 = C6461a.C0913a.f65814a.a();
                j10 = this.f69012v;
                Context context2 = this.f69013w;
                SalesIQChat salesIQChat3 = this.f69014x;
                Integer num3 = this.f69015y;
                String str5 = this.f69016z;
                long j14 = this.f69003A;
                this.f69004n = a10;
                this.f69005o = context2;
                this.f69006p = salesIQChat3;
                this.f69007q = num3;
                this.f69008r = str5;
                this.f69009s = j10;
                this.f69010t = j14;
                this.f69011u = 1;
                if (a10.f(null, this) != coroutine_suspended) {
                    num = num3;
                    context = context2;
                    aVar = a10;
                    str = str5;
                    salesIQChat = salesIQChat3;
                    j11 = j14;
                }
                return coroutine_suspended;
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    long j15 = this.f69009s;
                    str = (String) this.f69008r;
                    Integer num4 = (Integer) this.f69007q;
                    salesIQChat2 = (SalesIQChat) this.f69006p;
                    context = (Context) this.f69005o;
                    Wh.a aVar5 = (Wh.a) this.f69004n;
                    try {
                        ResultKt.throwOnFailure(obj);
                        j12 = j15;
                        str2 = "getChid(...)";
                        num2 = num4;
                        aVar2 = aVar5;
                        str3 = str;
                        j13 = j12;
                        r52 = aVar2;
                        r52 = aVar2;
                        if (context != null && salesIQChat2 != null) {
                            n K10 = C6966g.f68951a.K();
                            String chid = salesIQChat2.getChid();
                            str4 = str2;
                            Intrinsics.checkNotNullExpressionValue(chid, str4);
                            Message.g gVar = Message.g.Feedback;
                            this.f69004n = aVar2;
                            this.f69005o = salesIQChat2;
                            this.f69006p = num2;
                            this.f69007q = str3;
                            this.f69008r = null;
                            this.f69009s = j13;
                            this.f69011u = 3;
                            b10 = K10.b(chid, gVar, this);
                            aVar3 = aVar2;
                            if (b10 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            r52 = aVar3;
                            if (Intrinsics.areEqual(((C5582a) b10).b(), Boxing.boxBoolean(false))) {
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                        r52.g(null);
                        return Unit.INSTANCE;
                    } catch (Throwable th3) {
                        th = th3;
                        r52 = aVar5;
                    }
                } else {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j13 = this.f69009s;
                        SalesIQChat salesIQChat4 = (SalesIQChat) this.f69005o;
                        Wh.a aVar6 = (Wh.a) this.f69004n;
                        ResultKt.throwOnFailure(obj);
                        SalesIQChat salesIQChat5 = salesIQChat4;
                        str4 = "getChid(...)";
                        Object b11 = obj;
                        Wh.a aVar7 = aVar6;
                        Message message = (Message) ((C5582a) b11).b();
                        if (message != null) {
                            attenderid = message.getSender();
                            attenderName = message.getSenderName();
                        } else {
                            attenderid = salesIQChat5.getAttenderid();
                            attenderName = salesIQChat5.getAttenderName();
                        }
                        String str6 = attenderid;
                        if (attenderName != null) {
                            if (attenderName.length() == 0) {
                            }
                            Q10 = C6966g.Q(salesIQChat5, null, Boxing.boxLong(j13), str6, attenderName, null, Message.g.Feedback, Message.f.Sent, null, 256, null);
                            salesIQChat2 = salesIQChat5;
                            if (Q10 != null) {
                                C6966g.v0(Q10, true);
                            }
                            n10 = j.n();
                            aVar4 = aVar7;
                            if (n10 != null) {
                                aVar4 = aVar7;
                                if (Intrinsics.areEqual(C6218a.y(), salesIQChat2.getChid())) {
                                    aVar4 = aVar7;
                                    if (n10 instanceof ChatActivity) {
                                        j applicationManager = ZohoLiveChat.getApplicationManager();
                                        aVar4 = aVar7;
                                        if (applicationManager != null) {
                                            Handler p10 = applicationManager.p();
                                            aVar4 = aVar7;
                                            if (p10 != null) {
                                                Boxing.boxBoolean(p10.post(new Runnable() { // from class: zf.h
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        C6966g.C.j(SalesIQChat.this);
                                                    }
                                                }));
                                                aVar4 = aVar7;
                                            }
                                        }
                                    }
                                }
                            }
                            C6966g c6966g = C6966g.f68951a;
                            String chid2 = salesIQChat2.getChid();
                            Intrinsics.checkNotNullExpressionValue(chid2, str4);
                            c6966g.m0(chid2);
                            r52 = aVar4;
                            Unit unit2 = Unit.INSTANCE;
                            r52.g(null);
                            return Unit.INSTANCE;
                        }
                        attenderName = salesIQChat5.getAttenderName();
                        Q10 = C6966g.Q(salesIQChat5, null, Boxing.boxLong(j13), str6, attenderName, null, Message.g.Feedback, Message.f.Sent, null, 256, null);
                        salesIQChat2 = salesIQChat5;
                        if (Q10 != null) {
                        }
                        n10 = j.n();
                        aVar4 = aVar7;
                        if (n10 != null) {
                        }
                        C6966g c6966g2 = C6966g.f68951a;
                        String chid22 = salesIQChat2.getChid();
                        Intrinsics.checkNotNullExpressionValue(chid22, str4);
                        c6966g2.m0(chid22);
                        r52 = aVar4;
                        Unit unit22 = Unit.INSTANCE;
                        r52.g(null);
                        return Unit.INSTANCE;
                    }
                    j13 = this.f69009s;
                    str3 = (String) this.f69007q;
                    num2 = (Integer) this.f69006p;
                    SalesIQChat salesIQChat6 = (SalesIQChat) this.f69005o;
                    Wh.a aVar8 = (Wh.a) this.f69004n;
                    try {
                        ResultKt.throwOnFailure(obj);
                        aVar3 = aVar8;
                        salesIQChat2 = salesIQChat6;
                        str4 = "getChid(...)";
                        b10 = obj;
                        r52 = aVar3;
                        if (Intrinsics.areEqual(((C5582a) b10).b(), Boxing.boxBoolean(false))) {
                            if (!LiveChatUtil.canShowFeedback()) {
                                aVar4 = aVar3;
                            }
                            if (num2 != null) {
                            }
                            aVar4 = num2 == null ? aVar3 : aVar3;
                            C6966g c6966g22 = C6966g.f68951a;
                            String chid222 = salesIQChat2.getChid();
                            Intrinsics.checkNotNullExpressionValue(chid222, str4);
                            c6966g22.m0(chid222);
                            r52 = aVar4;
                        }
                        Unit unit222 = Unit.INSTANCE;
                        r52.g(null);
                        return Unit.INSTANCE;
                    } catch (Throwable th4) {
                        th = th4;
                        r52 = aVar8;
                    }
                }
                r52.g(null);
                throw th;
            }
            j11 = this.f69010t;
            j10 = this.f69009s;
            str = (String) this.f69008r;
            Integer num5 = (Integer) this.f69007q;
            salesIQChat = (SalesIQChat) this.f69006p;
            Context context3 = (Context) this.f69005o;
            Wh.a aVar9 = (Wh.a) this.f69004n;
            ResultKt.throwOnFailure(obj);
            num = num5;
            context = context3;
            aVar = aVar9;
            str2 = "getChid(...)";
            long j16 = j10 * 1000;
            this.f69004n = aVar;
            this.f69005o = context;
            this.f69006p = salesIQChat;
            this.f69007q = num;
            this.f69008r = str;
            this.f69009s = j11;
            this.f69011u = 2;
            if (AbstractC1440a0.a(j16, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            j12 = j11;
            num2 = num;
            salesIQChat2 = salesIQChat;
            aVar2 = aVar;
            str3 = str;
            j13 = j12;
            r52 = aVar2;
            r52 = aVar2;
            if (context != null) {
                n K102 = C6966g.f68951a.K();
                String chid3 = salesIQChat2.getChid();
                str4 = str2;
                Intrinsics.checkNotNullExpressionValue(chid3, str4);
                Message.g gVar2 = Message.g.Feedback;
                this.f69004n = aVar2;
                this.f69005o = salesIQChat2;
                this.f69006p = num2;
                this.f69007q = str3;
                this.f69008r = null;
                this.f69009s = j13;
                this.f69011u = 3;
                b10 = K102.b(chid3, gVar2, this);
                aVar3 = aVar2;
                if (b10 == coroutine_suspended) {
                }
                r52 = aVar3;
                if (Intrinsics.areEqual(((C5582a) b10).b(), Boxing.boxBoolean(false))) {
                }
            }
            Unit unit2222 = Unit.INSTANCE;
            r52.g(null);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: zf.g$D */
    public static final class D extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f69017n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Message f69018o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public D(Message message, Continuation continuation) {
            super(2, continuation);
            this.f69018o = message;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new D(this.f69018o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((D) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f69017n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                yf.z Z10 = C6966g.f68951a.Z();
                Message message = this.f69018o;
                this.f69017n = 1;
                if (Z10.a(message, this) == coroutine_suspended) {
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

    /* renamed from: zf.g$E */
    public static final class E extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final E f69019d = new E();

        public E() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final x invoke() {
            return new x(C6966g.f68951a.N());
        }
    }

    /* renamed from: zf.g$F */
    public static final class F extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f69020n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Message f69021o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F(Message message, Continuation continuation) {
            super(2, continuation);
            this.f69021o = message;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new F(this.f69021o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((F) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f69020n;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            x W10 = C6966g.f68951a.W();
            Message message = this.f69021o;
            this.f69020n = 1;
            Object b10 = x.b(W10, message, false, this, 2, null);
            return b10 == coroutine_suspended ? coroutine_suspended : b10;
        }
    }

    /* renamed from: zf.g$G */
    public static final class G extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f69022n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Message f69023o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ boolean f69024p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public G(Message message, boolean z10, Continuation continuation) {
            super(2, continuation);
            this.f69023o = message;
            this.f69024p = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new G(this.f69023o, this.f69024p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((G) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f69022n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                x W10 = C6966g.f68951a.W();
                Message message = this.f69023o;
                boolean z10 = this.f69024p;
                this.f69022n = 1;
                if (W10.a(message, z10, this) == coroutine_suspended) {
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

    /* renamed from: zf.g$H */
    public static final class H extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f69025n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f69026o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f69027p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ String f69028q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f69029r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f69030s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Long f69031t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ boolean f69032u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public H(String str, String str2, String str3, String str4, String str5, Long l10, boolean z10, Continuation continuation) {
            super(2, continuation);
            this.f69026o = str;
            this.f69027p = str2;
            this.f69028q = str3;
            this.f69029r = str4;
            this.f69030s = str5;
            this.f69031t = l10;
            this.f69032u = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new H(this.f69026o, this.f69027p, this.f69028q, this.f69029r, this.f69030s, this.f69031t, this.f69032u, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((H) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f69025n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                yf.y X10 = C6966g.f68951a.X();
                String str = this.f69026o;
                String str2 = this.f69027p;
                String str3 = this.f69028q;
                String str4 = this.f69029r;
                String str5 = this.f69030s;
                Long l10 = this.f69031t;
                boolean z10 = this.f69032u;
                y.a aVar = y.a.Bottom;
                this.f69025n = 1;
                if (yf.y.b(X10, str, str2, str3, str4, str5, l10, null, z10, aVar, this, 64, null) == coroutine_suspended) {
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

    /* renamed from: zf.g$I */
    public static final class I extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f69033n;

        /* renamed from: o, reason: collision with root package name */
        public Object f69034o;

        /* renamed from: p, reason: collision with root package name */
        public Object f69035p;

        /* renamed from: q, reason: collision with root package name */
        public int f69036q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f69037r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Long f69038s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ List f69039t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public I(Long l10, List list, Continuation continuation) {
            super(2, continuation);
            this.f69038s = l10;
            this.f69039t = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            I i10 = new I(this.f69038s, this.f69039t, continuation);
            i10.f69037r = obj;
            return i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((I) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x016b, code lost:
        
            if (yf.x.b(r0, r1, false, r3, 2, null) == r7) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00d8, code lost:
        
            if (r5.a(r6, r14, r15, r3) == r7) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0103, code lost:
        
            if (Ph.AbstractC1440a0.a(r5 * 1000, r3) == r7) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00a0, code lost:
        
            if (r4.a(r1, r5, r3) == r7) goto L49;
         */
        /* JADX WARN: Removed duplicated region for block: B:12:0x014f  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00b2  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x013a  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0140  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x016b -> B:9:0x016e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0134 -> B:21:0x00ac). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Ph.P p10;
            Long l10;
            Unit unit;
            List list;
            Iterator it;
            Ph.P p11;
            Long l11;
            Iterator it2;
            Message message;
            Long typingDelay;
            I i10 = this;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = i10.f69036q;
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                p10 = (Ph.P) i10.f69037r;
                l10 = i10.f69038s;
                if (l10 == null) {
                    unit = null;
                    if (unit == null) {
                    }
                    return Unit.INSTANCE;
                }
                list = i10.f69039t;
                C6885b A10 = C6966g.f68951a.A();
                Boolean boxBoolean = Boxing.boxBoolean(true);
                i10.f69037r = p10;
                i10.f69033n = list;
                i10.f69034o = l10;
                i10.f69036q = 1;
            } else if (i11 == 1) {
                l10 = (Long) i10.f69034o;
                list = (List) i10.f69033n;
                p10 = (Ph.P) i10.f69037r;
                ResultKt.throwOnFailure(obj);
            } else if (i11 == 2) {
                message = (Message) i10.f69035p;
                it = (Iterator) i10.f69034o;
                l11 = (Long) i10.f69033n;
                p11 = (Ph.P) i10.f69037r;
                ResultKt.throwOnFailure(obj);
                Message.Meta meta = message.getMeta();
                long longValue = (meta == null || (typingDelay = meta.getTypingDelay()) == null) ? l11.longValue() : typingDelay.longValue();
                i10.f69037r = p11;
                i10.f69033n = l11;
                i10.f69034o = it;
                i10.f69035p = message;
                i10.f69036q = 3;
            } else {
                if (i11 == 3) {
                    message = (Message) i10.f69035p;
                    it = (Iterator) i10.f69034o;
                    l11 = (Long) i10.f69033n;
                    p11 = (Ph.P) i10.f69037r;
                    ResultKt.throwOnFailure(obj);
                    Iterator it3 = it;
                    Long l12 = l11;
                    Ph.P p12 = p11;
                    yf.F f02 = C6966g.f68951a.f0();
                    String chatId = message.getChatId();
                    String id2 = message.getId();
                    i10.f69037r = p12;
                    i10.f69033n = l12;
                    i10.f69034o = it3;
                    i10.f69035p = null;
                    i10.f69036q = 4;
                    i10 = this;
                    if (yf.F.b(f02, chatId, id2, null, this, 4, null) != coroutine_suspended) {
                        it = it3;
                        l11 = l12;
                        p11 = p12;
                        if (!it.hasNext()) {
                        }
                    }
                    return coroutine_suspended;
                }
                if (i11 != 4) {
                    if (i11 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Iterator it4 = (Iterator) i10.f69037r;
                    ResultKt.throwOnFailure(obj);
                    it2 = it4;
                    i10 = this;
                    if (it2.hasNext()) {
                        Message message2 = (Message) it2.next();
                        x W10 = C6966g.f68951a.W();
                        i10.f69037r = it2;
                        i10.f69033n = null;
                        i10.f69034o = null;
                        i10.f69036q = 5;
                    }
                    return Unit.INSTANCE;
                }
                Iterator it5 = (Iterator) i10.f69034o;
                Long l13 = (Long) i10.f69033n;
                Ph.P p13 = (Ph.P) i10.f69037r;
                ResultKt.throwOnFailure(obj);
                p11 = p13;
                l11 = l13;
                it = it5;
                if (!it.hasNext()) {
                    unit = Unit.INSTANCE;
                    if (unit == null) {
                        it2 = i10.f69039t.iterator();
                        if (it2.hasNext()) {
                        }
                    }
                    return Unit.INSTANCE;
                }
                message = (Message) it.next();
                yf.F f03 = C6966g.f68951a.f0();
                String chatId2 = message.getChatId();
                String id3 = message.getId();
                Boolean boxBoolean2 = Boxing.boxBoolean(true);
                i10.f69037r = p11;
                i10.f69033n = l11;
                i10.f69034o = it;
                i10.f69035p = message;
                i10.f69036q = 2;
            }
            it = list.iterator();
            p11 = p10;
            l11 = l10;
            if (!it.hasNext()) {
            }
        }
    }

    /* renamed from: zf.g$J */
    public static final class J extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final J f69040d = new J();

        public J() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final yf.y invoke() {
            return new yf.y(C6966g.f68951a.N());
        }
    }

    /* renamed from: zf.g$K */
    public static final class K extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f69041n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f69042o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f69043p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public K(String str, String str2, Continuation continuation) {
            super(2, continuation);
            this.f69042o = str;
            this.f69043p = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new K(this.f69042o, this.f69043p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((K) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f69041n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                C6881A a02 = C6966g.f68951a.a0();
                String str = this.f69042o;
                String str2 = this.f69043p;
                this.f69041n = 1;
                if (C6881A.b(a02, str, str2, null, this, 4, null) == coroutine_suspended) {
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

    /* renamed from: zf.g$L */
    public static final class L extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final L f69044d = new L();

        public L() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final yf.z invoke() {
            return new yf.z(C6966g.f68951a.N());
        }
    }

    /* renamed from: zf.g$M */
    public static final class M extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final M f69045d = new M();

        public M() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C6881A invoke() {
            return new C6881A(C6966g.f68951a.N());
        }
    }

    /* renamed from: zf.g$N */
    public static final class N extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final N f69046d = new N();

        public N() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C6882B invoke() {
            return new C6882B(C6966g.f68951a.N());
        }
    }

    /* renamed from: zf.g$O */
    public static final class O extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f69047n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f69048o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f69049p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Message.Extras f69050q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public O(String str, String str2, Message.Extras extras, Continuation continuation) {
            super(2, continuation);
            this.f69048o = str;
            this.f69049p = str2;
            this.f69050q = extras;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new O(this.f69048o, this.f69049p, this.f69050q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((O) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f69047n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                C6882B b02 = C6966g.f68951a.b0();
                String str = this.f69048o;
                String str2 = this.f69049p;
                Message.Extras extras = this.f69050q;
                this.f69047n = 1;
                if (b02.a(str, str2, extras, this) == coroutine_suspended) {
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

    /* renamed from: zf.g$P */
    public static final class P extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final P f69051d = new P();

        public P() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C6883C invoke() {
            return new C6883C(C6966g.f68951a.N());
        }
    }

    /* renamed from: zf.g$Q */
    public static final class Q extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final Q f69052d = new Q();

        public Q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final yf.D invoke() {
            return new yf.D(C6966g.f68951a.N());
        }
    }

    /* renamed from: zf.g$R */
    public static final class R extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f69053n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f69054o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f69055p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Message.f f69056q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public R(String str, String str2, Message.f fVar, Continuation continuation) {
            super(2, continuation);
            this.f69054o = str;
            this.f69055p = str2;
            this.f69056q = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new R(this.f69054o, this.f69055p, this.f69056q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((R) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f69053n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                yf.D d02 = C6966g.f68951a.d0();
                String str = this.f69054o;
                String str2 = this.f69055p;
                Message.f fVar = this.f69056q;
                this.f69053n = 1;
                if (d02.b(str, str2, fVar, this) == coroutine_suspended) {
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

    /* renamed from: zf.g$S */
    public static final class S extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f69057n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f69058o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Message.g f69059p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Message.f f69060q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public S(String str, Message.g gVar, Message.f fVar, Continuation continuation) {
            super(2, continuation);
            this.f69058o = str;
            this.f69059p = gVar;
            this.f69060q = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new S(this.f69058o, this.f69059p, this.f69060q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((S) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f69057n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                yf.D d02 = C6966g.f68951a.d0();
                String str = this.f69058o;
                Message.g gVar = this.f69059p;
                Message.f fVar = this.f69060q;
                this.f69057n = 1;
                if (d02.a(str, gVar, fVar, this) == coroutine_suspended) {
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

    /* renamed from: zf.g$T */
    public static final class T extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final T f69061d = new T();

        public T() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final yf.E invoke() {
            return new yf.E(C6966g.f68951a.N());
        }
    }

    /* renamed from: zf.g$U */
    public static final class U extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f69062n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f69063o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f69064p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Message.g f69065q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public U(String str, String str2, Message.g gVar, Continuation continuation) {
            super(2, continuation);
            this.f69063o = str;
            this.f69064p = str2;
            this.f69065q = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new U(this.f69063o, this.f69064p, this.f69065q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((U) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f69062n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                yf.E e02 = C6966g.f68951a.e0();
                String str = this.f69063o;
                String str2 = this.f69064p;
                Message.g gVar = this.f69065q;
                this.f69062n = 1;
                if (e02.a(str, str2, gVar, this) == coroutine_suspended) {
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

    /* renamed from: zf.g$V */
    public static final class V extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final V f69066d = new V();

        public V() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final yf.F invoke() {
            return new yf.F(C6966g.f68951a.N());
        }
    }

    /* renamed from: zf.g$W */
    public static final class W extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final W f69067d = new W();

        public W() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final yf.G invoke() {
            return new yf.G(C6966g.f68951a.N());
        }
    }

    /* renamed from: zf.g$X */
    public static final class X extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f69068n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f69069o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f69070p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Message.RespondedMessage f69071q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public X(String str, String str2, Message.RespondedMessage respondedMessage, Continuation continuation) {
            super(2, continuation);
            this.f69069o = str;
            this.f69070p = str2;
            this.f69071q = respondedMessage;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new X(this.f69069o, this.f69070p, this.f69071q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((X) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f69068n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                yf.G g02 = C6966g.f68951a.g0();
                String str = this.f69069o;
                String str2 = this.f69070p;
                Message.RespondedMessage respondedMessage = this.f69071q;
                this.f69068n = 1;
                if (g02.a(str, str2, respondedMessage, this) == coroutine_suspended) {
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

    /* renamed from: zf.g$a, reason: case insensitive filesystem */
    public static final class C6967a {

        /* renamed from: a, reason: collision with root package name */
        public static final C6967a f69072a = new C6967a();

        /* renamed from: zf.g$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C1011a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;
            public static final /* synthetic */ int[] $EnumSwitchMapping$2;

            static {
                int[] iArr = new int[Message.InfoMessage.Operation.values().length];
                try {
                    iArr[Message.InfoMessage.Operation.ScreenShareRequest.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Message.InfoMessage.Operation.ScreenShareJoinRequest.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Message.InfoMessage.Operation.CallMissed.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Message.InfoMessage.Operation.CallCancel.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Message.InfoMessage.Operation.CallEnd.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[Message.InfoMessage.Operation.CallReject.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[Message.InfoMessage.Operation.ConvertChat.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[Message.InfoMessage.Operation.MonitorEnd.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[Message.InfoMessage.Operation.MonitorJoin.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[Message.InfoMessage.Operation.MonitorConversationJoin.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[Message.InfoMessage.Media.a.values().length];
                try {
                    iArr2[Message.InfoMessage.Media.a.Audio.ordinal()] = 1;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr2[Message.InfoMessage.Media.a.ScreenShare.ordinal()] = 2;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr2[Message.InfoMessage.Media.a.ScreenShareRequest.ordinal()] = 3;
                } catch (NoSuchFieldError unused13) {
                }
                $EnumSwitchMapping$1 = iArr2;
                int[] iArr3 = new int[Message.InfoMessage.Mode.values().length];
                try {
                    iArr3[Message.InfoMessage.Mode.AddSupportRepresentative.ordinal()] = 1;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr3[Message.InfoMessage.Mode.AcceptTransfer.ordinal()] = 2;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr3[Message.InfoMessage.Mode.AcceptForward.ordinal()] = 3;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr3[Message.InfoMessage.Mode.ForwardSupport.ordinal()] = 4;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr3[Message.InfoMessage.Mode.JoinSupport.ordinal()] = 5;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr3[Message.InfoMessage.Mode.ReOpen.ordinal()] = 6;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr3[Message.InfoMessage.Mode.EndChat.ordinal()] = 7;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr3[Message.InfoMessage.Mode.ChatClosed.ordinal()] = 8;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr3[Message.InfoMessage.Mode.MissedChat.ordinal()] = 9;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr3[Message.InfoMessage.Mode.ChatMissed.ordinal()] = 10;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr3[Message.InfoMessage.Mode.BotTransferMissed.ordinal()] = 11;
                } catch (NoSuchFieldError unused24) {
                }
                try {
                    iArr3[Message.InfoMessage.Mode.ChatMonitorJoin.ordinal()] = 12;
                } catch (NoSuchFieldError unused25) {
                }
                try {
                    iArr3[Message.InfoMessage.Mode.Transfer.ordinal()] = 13;
                } catch (NoSuchFieldError unused26) {
                }
                try {
                    iArr3[Message.InfoMessage.Mode.Invite.ordinal()] = 14;
                } catch (NoSuchFieldError unused27) {
                }
                try {
                    iArr3[Message.InfoMessage.Mode.Media.ordinal()] = 15;
                } catch (NoSuchFieldError unused28) {
                }
                $EnumSwitchMapping$2 = iArr3;
            }
        }

        /* renamed from: zf.g$a$b */
        public static final class b extends ClickableSpan {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Ref.ObjectRef f69073a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Context f69074b;

            public b(Ref.ObjectRef objectRef, Context context) {
                this.f69073a = objectRef;
                this.f69074b = context;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.text.style.ClickableSpan
            public void onClick(View widget) {
                Intrinsics.checkNotNullParameter(widget, "widget");
                LiveChatUtil.openUrl((String) this.f69073a.element);
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint ds) {
                Intrinsics.checkNotNullParameter(ds, "ds");
                super.updateDrawState(ds);
                ds.setColor(com.zoho.livechat.android.utils.P.e(this.f69074b, AbstractC5335a.f55002q));
                ds.setUnderlineText(true);
            }
        }

        public static final Spannable a(Context context, Integer num, Message message) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(message, "message");
            return d(context, num, message, false, false, 24, null);
        }

        public static final Spannable b(Context context, Integer num, Message message, boolean z10) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(message, "message");
            return d(context, num, message, z10, false, 16, null);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:164:0x0430  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0576  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0584  */
        /* JADX WARN: Type inference failed for: r1v23, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r1v26, types: [T, java.lang.String] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final Spannable c(Context context, Integer num, Message message, boolean z10, boolean z11) {
            String replace$default;
            Object obj;
            String string;
            String name;
            String str;
            Spannable a10;
            SpannableString valueOf;
            Spannable a11;
            int i10;
            Message.InfoMessage.Media media;
            Message.User operationUser;
            String id2;
            Message.User operationUser2;
            String name2;
            String name3;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(message, "message");
            Message.InfoMessage infoMessage = message.getInfoMessage();
            if (infoMessage == null) {
                return null;
            }
            Message.User userList = infoMessage.getUserList();
            String obj2 = (userList == null || (name3 = userList.getName()) == null) ? null : StringsKt.trim((CharSequence) name3).toString();
            Message.User operationUser3 = infoMessage.getOperationUser();
            String obj3 = (operationUser3 == null || (name2 = operationUser3.getName()) == null) ? null : StringsKt.trim((CharSequence) name2).toString();
            ArrayList<String> arrayList = new ArrayList();
            String mode = infoMessage.getMode();
            if (mode != null && (replace$default = StringsKt.replace$default(mode, "_", "", false, 4, (Object) null)) != null) {
                Iterator<E> it = Message.InfoMessage.Mode.getEntries().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (f69072a.e(((Message.InfoMessage.Mode) obj).getValue(), replace$default)) {
                        break;
                    }
                }
                Message.InfoMessage.Mode mode2 = (Message.InfoMessage.Mode) obj;
                if (mode2 != null) {
                    switch (C1011a.$EnumSwitchMapping$2[mode2.ordinal()]) {
                        case 1:
                            arrayList.add(obj2);
                            string = context.getString(t.f60900M0, obj2, og.j.c(message.getServerTime(), null, null, 3, null));
                            if (string != null && (a11 = Message.b.f43717a.a(string).a()) != null) {
                                if (z11) {
                                    for (String str2 : arrayList) {
                                        String str3 = str2 == null ? "" : str2;
                                        a11.setSpan(new StyleSpan(1), StringsKt.indexOf$default((CharSequence) a11, str3, 0, false, 6, (Object) null), StringsKt.indexOf$default((CharSequence) a11, str3, 0, false, 6, (Object) null) + str3.length(), 33);
                                    }
                                }
                                return a11;
                            }
                            break;
                        case 2:
                            String transferMessageIfConfEnabled = infoMessage.getTransferMessageIfConfEnabled();
                            if (transferMessageIfConfEnabled == null || transferMessageIfConfEnabled.length() == 0) {
                                arrayList.add(obj3);
                                string = context.getString(t.f60930R0, obj3);
                            } else {
                                string = infoMessage.getTransferMessage();
                            }
                            if (string != null) {
                                if (z11) {
                                }
                                return a11;
                            }
                            break;
                        case 3:
                            arrayList.add(obj3);
                            string = context.getString(t.f60876I0, obj3);
                            if (string != null) {
                            }
                            break;
                        case 4:
                            arrayList.add(obj3);
                            string = context.getString(t.f60888K0, obj3);
                            if (string != null) {
                            }
                            break;
                        case 5:
                            arrayList.add(obj3);
                            string = context.getString(t.f60900M0, obj3, og.j.c(message.getServerTime(), null, null, 3, null));
                            if (string != null) {
                            }
                            break;
                        case 6:
                            string = context.getString(t.f60924Q0);
                            if (string != null) {
                            }
                            break;
                        case 7:
                        case 8:
                            arrayList.add(obj3);
                            string = context.getString(t.f61037h4, obj3, og.j.c(message.getServerTime(), null, null, 3, null));
                            if (string != null) {
                            }
                            break;
                        case 9:
                        case 10:
                        case 11:
                            string = context.getString(t.f60894L0);
                            if (string != null) {
                            }
                            break;
                        case 12:
                            arrayList.add(obj3);
                            string = context.getString(t.f60900M0, obj3, og.j.c(message.getServerTime(), null, null, 3, null));
                            if (string != null) {
                            }
                            break;
                        case 13:
                            Message.User transferTo = infoMessage.getTransferTo();
                            if (transferTo != null && (name = transferTo.getName()) != null) {
                                Spannable c10 = Vf.b.i().c(obj3 != null ? i.u(obj3) : null);
                                Spannable c11 = Vf.b.i().c(i.u(name));
                                arrayList.add(obj3);
                                arrayList.add(c11.toString());
                                string = context.getString(t.f60882J0, c10, c11);
                                if (string != null) {
                                }
                            }
                            string = null;
                            if (string != null) {
                            }
                            break;
                        case 14:
                            Ref.ObjectRef objectRef = new Ref.ObjectRef();
                            C6967a c6967a = f69072a;
                            if (infoMessage.getOperation() != null && num != null && num.intValue() == 2) {
                                r10 = true;
                            }
                            if (!r10) {
                                c6967a = null;
                            }
                            if (c6967a != null) {
                                Message.InfoMessage.Operation operation = infoMessage.getOperation();
                                Intrinsics.checkNotNull(operation);
                                int i11 = C1011a.$EnumSwitchMapping$0[operation.ordinal()];
                                if (i11 == 1) {
                                    objectRef.element = infoMessage.getStartUrl();
                                    str = context.getString(t.f60918P0);
                                } else if (i11 == 2) {
                                    objectRef.element = infoMessage.getJoinUrl();
                                    str = context.getString(t.f60912O0);
                                }
                                String str4 = str != null ? str : "";
                                arrayList.add(obj3);
                                Message.b.a aVar = Message.b.f43717a;
                                String string2 = context.getString(t.f60906N0, obj3, str4);
                                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                                a10 = aVar.a(string2).a();
                                if (a10 != null || (valueOf = SpannableString.valueOf(a10)) == null) {
                                    return null;
                                }
                                if (z10 && objectRef.element != 0) {
                                    valueOf.setSpan(new b(objectRef, context), (valueOf.length() - str4.length()) + 2, valueOf.length(), 33);
                                }
                                return valueOf;
                            }
                            str = null;
                            if (str != null) {
                            }
                            arrayList.add(obj3);
                            Message.b.a aVar2 = Message.b.f43717a;
                            String string22 = context.getString(t.f60906N0, obj3, str4);
                            Intrinsics.checkNotNullExpressionValue(string22, "getString(...)");
                            a10 = aVar2.a(string22).a();
                            if (a10 != null) {
                            }
                            return null;
                        case 15:
                            Message.InfoMessage.Media media2 = infoMessage.getMedia();
                            boolean i12 = i.i(media2 != null ? media2.getVisitorAccess() : null);
                            Message.InfoMessage.Media media3 = infoMessage.getMedia();
                            String name4 = (media3 == null || (operationUser2 = media3.getOperationUser()) == null) ? null : operationUser2.getName();
                            Message.InfoMessage.Operation operation2 = infoMessage.getOperation();
                            switch (operation2 == null ? -1 : C1011a.$EnumSwitchMapping$0[operation2.ordinal()]) {
                                case 3:
                                case 4:
                                    if (infoMessage.getOperation() != Message.InfoMessage.Operation.CallMissed) {
                                        r10 = i12;
                                    } else if (!i12 && (media = infoMessage.getMedia()) != null && (operationUser = media.getOperationUser()) != null && (id2 = operationUser.getId()) != null && !StringsKt.contains$default((CharSequence) id2, (CharSequence) "$", false, 2, (Object) null)) {
                                        r10 = true;
                                    }
                                    if (r10) {
                                        name4 = context.getString(t.f61127v1);
                                    } else if (TextUtils.isEmpty(name4)) {
                                        name4 = "User";
                                    }
                                    Message.InfoMessage.Operation operation3 = infoMessage.getOperation();
                                    int i13 = operation3 == null ? -1 : C1011a.$EnumSwitchMapping$0[operation3.ordinal()];
                                    if (i13 != 3) {
                                        if (i13 == 4) {
                                            arrayList.add(name4);
                                            Message.InfoMessage.Media media4 = infoMessage.getMedia();
                                            Message.InfoMessage.Media.a type = media4 != null ? media4.getType() : null;
                                            i10 = type != null ? C1011a.$EnumSwitchMapping$1[type.ordinal()] : -1;
                                            if (i10 != 1) {
                                                if (i10 != 2) {
                                                    if (i10 == 3) {
                                                        string = context.getResources().getString(t.f61044i4, name4, og.j.c(message.getServerTime(), null, null, 3, null));
                                                        break;
                                                    }
                                                } else {
                                                    string = context.getResources().getString(t.f61079n4, name4, og.j.c(message.getServerTime(), null, null, 3, null));
                                                    break;
                                                }
                                            } else {
                                                string = context.getResources().getString(t.f60975Y3, name4, og.j.c(message.getServerTime(), null, null, 3, null));
                                                break;
                                            }
                                        }
                                        string = null;
                                        break;
                                    } else {
                                        Message.InfoMessage.Media media5 = infoMessage.getMedia();
                                        Message.InfoMessage.Media.a type2 = media5 != null ? media5.getType() : null;
                                        i10 = type2 != null ? C1011a.$EnumSwitchMapping$1[type2.ordinal()] : -1;
                                        if (i10 == 1) {
                                            arrayList.add(name4);
                                            string = context.getResources().getString(t.f61009d4, name4, og.j.c(message.getServerTime(), null, null, 3, null));
                                            break;
                                        } else if (i10 == 2) {
                                            string = context.getResources().getString(t.f61093p4, og.j.c(message.getServerTime(), null, null, 3, null));
                                            break;
                                        } else {
                                            if (i10 == 3) {
                                                string = context.getResources().getString(t.f61058k4, og.j.c(message.getServerTime(), null, null, 3, null));
                                                break;
                                            }
                                            string = null;
                                        }
                                    }
                                    break;
                                case 5:
                                    String string3 = context.getString(t.f61127v1);
                                    Message.InfoMessage.Media media6 = infoMessage.getMedia();
                                    Message.InfoMessage.Media.a type3 = media6 != null ? media6.getType() : null;
                                    i10 = type3 != null ? C1011a.$EnumSwitchMapping$1[type3.ordinal()] : -1;
                                    if (i10 != 1) {
                                        if (i10 != 2) {
                                            if (i10 == 3) {
                                                arrayList.add(string3);
                                                string = context.getResources().getString(t.f61051j4, string3, infoMessage.getMedia().getDuration());
                                                break;
                                            }
                                            string = null;
                                            break;
                                        } else {
                                            arrayList.add(string3);
                                            string = context.getResources().getString(t.f61086o4, string3, infoMessage.getMedia().getDuration());
                                            break;
                                        }
                                    } else {
                                        string = context.getResources().getString(t.f60988a4, og.j.c(message.getServerTime(), null, null, 3, null), infoMessage.getMedia().getDuration());
                                        break;
                                    }
                                case 6:
                                    if (i12) {
                                        name4 = context.getString(t.f61127v1);
                                        arrayList.add(name4);
                                    }
                                    Message.InfoMessage.Media media7 = infoMessage.getMedia();
                                    Message.InfoMessage.Media.a type4 = media7 != null ? media7.getType() : null;
                                    i10 = type4 != null ? C1011a.$EnumSwitchMapping$1[type4.ordinal()] : -1;
                                    if (i10 != 1) {
                                        if (i10 != 2) {
                                            if (i10 == 3) {
                                                if (i12) {
                                                    string = context.getResources().getString(t.f61065l4, og.j.c(message.getServerTime(), null, null, 3, null));
                                                    break;
                                                } else {
                                                    arrayList.add(name4);
                                                    string = context.getResources().getString(t.f61072m4, name4);
                                                    break;
                                                }
                                            }
                                            string = null;
                                            break;
                                        } else if (i12) {
                                            string = context.getResources().getString(t.f61100q4, og.j.c(message.getServerTime(), null, null, 3, null));
                                            break;
                                        } else {
                                            arrayList.add(name4);
                                            string = context.getResources().getString(t.f61106r4, name4);
                                            break;
                                        }
                                    } else {
                                        arrayList.add(name4);
                                        if (i12) {
                                            string = context.getResources().getString(t.f61023f4, name4, og.j.c(message.getServerTime(), null, null, 3, null));
                                            break;
                                        } else {
                                            string = context.getResources().getString(t.f61030g4, name4);
                                            break;
                                        }
                                    }
                                case 7:
                                    arrayList.add(name4);
                                    string = context.getResources().getString(t.f60981Z3, name4);
                                    break;
                                case 8:
                                    arrayList.add(name4);
                                    string = context.getResources().getString(t.f61002c4, name4, og.j.c(message.getServerTime(), null, null, 3, null));
                                    break;
                                case 9:
                                    arrayList.add(name4);
                                    string = context.getResources().getString(t.f60995b4, name4, og.j.c(message.getServerTime(), null, null, 3, null));
                                    break;
                                case 10:
                                    arrayList.add(name4);
                                    string = context.getResources().getString(t.f61016e4, name4, og.j.c(message.getServerTime(), null, null, 3, null));
                                    break;
                                default:
                                    string = null;
                                    break;
                            }
                            if (string != null) {
                            }
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
            }
            return null;
        }

        public static /* synthetic */ Spannable d(Context context, Integer num, Message message, boolean z10, boolean z11, int i10, Object obj) {
            if ((i10 & 8) != 0) {
                z10 = false;
            }
            if ((i10 & 16) != 0) {
                z11 = true;
            }
            return c(context, num, message, z10, z11);
        }

        public final boolean e(String str, String moduleName) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Intrinsics.checkNotNullParameter(moduleName, "moduleName");
            return StringsKt.equals(str, moduleName, true) || StringsKt.equals(StringsKt.replace$default(str, "_", "", false, 4, (Object) null), StringsKt.replace$default(moduleName, "_", "", false, 4, (Object) null), true);
        }
    }

    /* renamed from: zf.g$b, reason: case insensitive filesystem */
    public static final class C6968b extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final C6968b f69075d = new C6968b();

        public C6968b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C6885b invoke() {
            return new C6885b(C6966g.f68951a.N());
        }
    }

    /* renamed from: zf.g$c, reason: case insensitive filesystem */
    public static final class C6969c extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f69076n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f69077o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Message.g f69078p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6969c(String str, Message.g gVar, Continuation continuation) {
            super(2, continuation);
            this.f69077o = str;
            this.f69078p = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C6969c(this.f69077o, this.f69078p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((C6969c) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f69076n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                C6888e D10 = C6966g.f68951a.D();
                String str = this.f69077o;
                Message.g gVar = this.f69078p;
                this.f69076n = 1;
                if (D10.c(str, gVar, this) == coroutine_suspended) {
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

    /* renamed from: zf.g$d, reason: case insensitive filesystem */
    public static final class C6970d extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f69079n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f69080o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f69081p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6970d(String str, String str2, Continuation continuation) {
            super(2, continuation);
            this.f69080o = str;
            this.f69081p = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C6970d(this.f69080o, this.f69081p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((C6970d) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f69079n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                C6888e D10 = C6966g.f68951a.D();
                String str = this.f69080o;
                String str2 = this.f69081p;
                this.f69079n = 1;
                if (D10.d(str, str2, this) == coroutine_suspended) {
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

    /* renamed from: zf.g$e, reason: case insensitive filesystem */
    public static final class C6971e extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final C6971e f69082d = new C6971e();

        public C6971e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C6888e invoke() {
            return new C6888e(C6966g.f68951a.N());
        }
    }

    /* renamed from: zf.g$f, reason: case insensitive filesystem */
    public static final class C6972f extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final C6972f f69083d = new C6972f();

        public C6972f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C6889f invoke() {
            return new C6889f(C6966g.f68951a.N());
        }
    }

    /* renamed from: zf.g$g, reason: collision with other inner class name */
    public static final class C1012g extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f69084n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f69085o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1012g(String str, Continuation continuation) {
            super(2, continuation);
            this.f69085o = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C1012g(this.f69085o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((C1012g) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f69084n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                C6889f E10 = C6966g.f68951a.E();
                String str = this.f69085o;
                this.f69084n = 1;
                if (E10.a(str, this) == coroutine_suspended) {
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

    /* renamed from: zf.g$h, reason: case insensitive filesystem */
    public static final class C6973h extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final C6973h f69086d = new C6973h();

        public C6973h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final yf.h invoke() {
            return new yf.h(C6966g.f68951a.N());
        }
    }

    /* renamed from: zf.g$i, reason: case insensitive filesystem */
    public static final class C6974i extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f69087n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f69088o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6974i(String str, Continuation continuation) {
            super(2, continuation);
            this.f69088o = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C6974i(this.f69088o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((C6974i) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f69087n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                yf.h F10 = C6966g.f68951a.F();
                String str = this.f69088o;
                this.f69087n = 1;
                obj = F10.b(null, str, true, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return ((C5582a) obj).b();
        }
    }

    /* renamed from: zf.g$j, reason: case insensitive filesystem */
    public static final class C6975j extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final C6975j f69089d = new C6975j();

        public C6975j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final yf.j invoke() {
            return new yf.j(C6966g.f68951a.N());
        }
    }

    /* renamed from: zf.g$k, reason: case insensitive filesystem */
    public static final class C6976k extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final C6976k f69090d = new C6976k();

        public C6976k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final k invoke() {
            return new k(C6966g.f68951a.N());
        }
    }

    /* renamed from: zf.g$l, reason: case insensitive filesystem */
    public static final class C6977l extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f69091n;

        /* renamed from: o, reason: collision with root package name */
        public int f69092o;

        public C6977l(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f69091n = obj;
            this.f69092o |= Integer.MIN_VALUE;
            return C6966g.M(null, this);
        }
    }

    /* renamed from: zf.g$m, reason: case insensitive filesystem */
    public static final class C6978m extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final C6978m f69093d = new C6978m();

        public C6978m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final k invoke() {
            return new k(C6966g.f68951a.N());
        }
    }

    /* renamed from: zf.g$n, reason: case insensitive filesystem */
    public static final class C6979n extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f69094n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f69095o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6979n(String str, Continuation continuation) {
            super(2, continuation);
            this.f69095o = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C6979n(this.f69095o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((C6979n) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
        
            if (r7 == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0032, code lost:
        
            if (r7 == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f69094n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                k H10 = C6966g.f68951a.H();
                String str = this.f69095o;
                Message.g gVar = Message.g.Question;
                this.f69094n = 1;
                obj = H10.a(str, null, gVar, this);
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    List list = (List) obj;
                    if (list != null) {
                        if (list.isEmpty()) {
                            list = null;
                        }
                        if (list != null) {
                            return (Message) CollectionsKt.first(list);
                        }
                    }
                    return null;
                }
                ResultKt.throwOnFailure(obj);
            }
            InterfaceC5321f interfaceC5321f = (InterfaceC5321f) ((C5582a) obj).b();
            if (interfaceC5321f != null) {
                this.f69094n = 2;
                obj = AbstractC5323h.r(interfaceC5321f, this);
            }
            return null;
        }
    }

    /* renamed from: zf.g$o, reason: case insensitive filesystem */
    public static final class C6980o extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f69096n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f69097o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6980o(String str, Continuation continuation) {
            super(2, continuation);
            this.f69097o = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C6980o(this.f69097o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((C6980o) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f69096n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                n K10 = C6966g.f68951a.K();
                String str = this.f69097o;
                this.f69096n = 1;
                obj = K10.a(str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return ((C5582a) obj).b();
        }
    }

    /* renamed from: zf.g$p, reason: case insensitive filesystem */
    public static final class C6981p extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final C6981p f69098d = new C6981p();

        public C6981p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final m invoke() {
            return new m(C6966g.f68951a.N());
        }
    }

    /* renamed from: zf.g$q, reason: case insensitive filesystem */
    public static final class C6982q extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final C6982q f69099d = new C6982q();

        public C6982q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final n invoke() {
            return new n(C6966g.f68951a.N());
        }
    }

    /* renamed from: zf.g$r, reason: case insensitive filesystem */
    public static final class C6983r extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final C6983r f69100d = new C6983r();

        public C6983r() {
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

    /* renamed from: zf.g$s, reason: case insensitive filesystem */
    public static final class C6984s extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f69101n;

        /* renamed from: o, reason: collision with root package name */
        public int f69102o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f69103p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6984s(String str, Continuation continuation) {
            super(2, continuation);
            this.f69103p = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C6984s(this.f69103p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((C6984s) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:42:0x00cc, code lost:
        
            if (r3.e(r1, r12, r11) == r0) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00ce, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0043, code lost:
        
            if (r12 == r0) goto L49;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            SalesIQChat chat;
            C6984s c6984s;
            String sender;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f69102o;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                chat = LiveChatUtil.getChat(this.f69103p);
                yf.h F10 = C6966g.f68951a.F();
                String str = this.f69103p;
                this.f69101n = chat;
                this.f69102o = 1;
                c6984s = this;
                obj = yf.h.d(F10, null, str, false, c6984s, 4, null);
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                chat = (SalesIQChat) this.f69101n;
                ResultKt.throwOnFailure(obj);
                c6984s = this;
            }
            Message message = (Message) ((C5582a) obj).b();
            if (i.e(chat != null ? chat.getVisitorid() : null) && message != null && (sender = message.getSender()) != null && !StringsKt.startsWith$default(sender, "$", false, 2, (Object) null) && !message.isBot() && !Intrinsics.areEqual(message.isRead(), Boxing.boxBoolean(true)) && C6218a.k()) {
                if (Intrinsics.areEqual(chat != null ? chat.getChid() : null, C6218a.y()) && ((chat == null || chat.getStatus() != 4) && (chat == null || chat.getStatus() != 3))) {
                    C6550a N10 = C6966g.f68951a.N();
                    String visitorid = chat != null ? chat.getVisitorid() : null;
                    Intrinsics.checkNotNull(visitorid);
                    String uniqueID = message.getUniqueID();
                    c6984s.f69101n = null;
                    c6984s.f69102o = 2;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: zf.g$t, reason: case insensitive filesystem */
    public static final class C6985t extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final C6985t f69104d = new C6985t();

        public C6985t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return new o(C6966g.f68951a.N());
        }
    }

    /* renamed from: zf.g$u, reason: case insensitive filesystem */
    public static final class C6986u extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f69105n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f69106o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6986u(String str, Continuation continuation) {
            super(2, continuation);
            this.f69106o = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C6986u(this.f69106o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((C6986u) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f69105n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                q S10 = C6966g.f68951a.S();
                String str = this.f69106o;
                this.f69105n = 1;
                if (S10.a(str, this) == coroutine_suspended) {
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

    /* renamed from: zf.g$v, reason: case insensitive filesystem */
    public static final class C6987v extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final C6987v f69107d = new C6987v();

        public C6987v() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final q invoke() {
            return new q(C6966g.f68951a.N());
        }
    }

    /* renamed from: zf.g$w, reason: case insensitive filesystem */
    public static final class C6988w extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f69108n;

        public C6988w(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C6988w(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((C6988w) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f69108n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                s T10 = C6966g.f68951a.T();
                this.f69108n = 1;
                if (T10.a(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (!LiveChatUtil.isFormContextStarted()) {
                Ye.d.s(De.a.OngoingConversationContextRequestedMessages, null).b(true);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: zf.g$x, reason: case insensitive filesystem */
    public static final class C6989x extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final C6989x f69109d = new C6989x();

        public C6989x() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final s invoke() {
            return new s(C6966g.f68951a.N());
        }
    }

    /* renamed from: zf.g$y */
    public static final class y extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final y f69110d = new y();

        public y() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final w invoke() {
            return new w(C6966g.f68951a.N());
        }
    }

    /* renamed from: zf.g$z */
    public static final class z extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f69111n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f69112o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f69113p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ String f69114q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f69115r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f69116s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Message.g f69117t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Message.Attachment f69118u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Message.Extras f69119v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ File f69120w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(String str, String str2, String str3, String str4, String str5, Message.g gVar, Message.Attachment attachment, Message.Extras extras, File file, Continuation continuation) {
            super(2, continuation);
            this.f69112o = str;
            this.f69113p = str2;
            this.f69114q = str3;
            this.f69115r = str4;
            this.f69116s = str5;
            this.f69117t = gVar;
            this.f69118u = attachment;
            this.f69119v = extras;
            this.f69120w = file;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new z(this.f69112o, this.f69113p, this.f69114q, this.f69115r, this.f69116s, this.f69117t, this.f69118u, this.f69119v, this.f69120w, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((z) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a10;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f69111n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                w V10 = C6966g.f68951a.V();
                String str = this.f69112o;
                String str2 = this.f69113p;
                String str3 = this.f69114q;
                String str4 = this.f69115r;
                String str5 = this.f69116s;
                Message.g gVar = this.f69117t;
                Message.Attachment attachment = this.f69118u;
                Message.Extras extras = this.f69119v;
                File file = this.f69120w;
                List listOf = file != null ? CollectionsKt.listOf(file) : null;
                this.f69111n = 1;
                a10 = V10.a(str, str2, str3, str4, null, (r33 & 32) != 0 ? null : str5, (r33 & 64) != 0 ? Message.g.Text : gVar, (r33 & 128) != 0 ? null : attachment, (r33 & 256) != 0 ? null : extras, (r33 & 512) != 0 ? null : null, (r33 & 1024) != 0 ? null : listOf, (r33 & 2048) != 0 ? false : false, (r33 & 4096) != 0 ? false : false, this);
                if (a10 == coroutine_suspended) {
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

    public static final void A0(List messages, Long l10) {
        Intrinsics.checkNotNullParameter(messages, "messages");
        AbstractC1459k.d(f68951a.B(), null, null, new I(l10, messages, null), 3, null);
    }

    public static final void B0(String previousChatId, String chatId) {
        Intrinsics.checkNotNullParameter(previousChatId, "previousChatId");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        AbstractC1459k.d(f68951a.B(), null, null, new K(previousChatId, chatId, null), 3, null);
    }

    public static final void C0(String chatId, String messageId, Message.Extras extras) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        AbstractC1459k.d(f68951a.B(), null, null, new O(chatId, messageId, extras, null), 3, null);
    }

    public static final void D0(String chatId, String messageId, Integer num) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        f68951a.c0().a(chatId, messageId, num);
    }

    public static final void E0(String conversationId, Message.g messageType, Message.f status) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        Intrinsics.checkNotNullParameter(status, "status");
        AbstractC1459k.d(f68951a.B(), null, null, new S(conversationId, messageType, status, null), 3, null);
    }

    public static final void F0(String chatId, String messageId, Message.f status) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(status, "status");
        AbstractC1459k.d(f68951a.B(), null, null, new R(chatId, messageId, status, null), 3, null);
    }

    public static final void G0(String chatId, String messageId, Message.g type) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(type, "type");
        AbstractC1459k.d(f68951a.B(), null, null, new U(chatId, messageId, type, null), 3, null);
    }

    public static final void H0(String chatId, String messageId, Message.RespondedMessage respondedMessage) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(respondedMessage, "respondedMessage");
        AbstractC1459k.d(f68951a.B(), null, null, new X(chatId, messageId, respondedMessage, null), 3, null);
    }

    public static final Message I(String chatId) {
        Object b10;
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        b10 = AbstractC1457j.b(null, new C6974i(chatId, null), 1, null);
        return (Message) b10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r14, (java.lang.CharSequence) "video", false, 2, (java.lang.Object) null) == true) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
    
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r14, (java.lang.CharSequence) "audio", false, 2, (java.lang.Object) null) == true) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0061, code lost:
    
        r13.setDataSource(r8, android.net.Uri.fromFile(r0));
        r0 = r13.extractMetadata(9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006e, code lost:
    
        if (r0 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0070, code lost:
    
        r0 = kotlin.text.StringsKt.toLongOrNull(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0074, code lost:
    
        if (r0 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0076, code lost:
    
        r4 = r0.longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007f, code lost:
    
        if (r4 == r16) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0081, code lost:
    
        r10 = 1000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0086, code lost:
    
        r1 = 60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008a, code lost:
    
        r13 = (r4 / r10) / r1;
        r10 = (r4 / r10) % r1;
        r0 = new java.lang.StringBuilder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009b, code lost:
    
        if (r13 >= 10) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009d, code lost:
    
        r15 = "0";
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a2, code lost:
    
        r0.append(r15);
        r0.append(r13);
        r0 = r0.toString();
        r13 = new java.lang.StringBuilder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b3, code lost:
    
        if (r10 >= 10) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b5, code lost:
    
        r1 = "0";
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ba, code lost:
    
        r13.append(r1);
        r13.append(r10);
        r1 = r0 + ':' + r13.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d8, code lost:
    
        r10 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b8, code lost:
    
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a0, code lost:
    
        r15 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00da, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00db, code lost:
    
        r10 = r4;
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00de, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00df, code lost:
    
        r10 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x007b, code lost:
    
        r4 = r16;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Message.Extras L(String localFileName) {
        Object m147constructorimpl;
        Throwable m150exceptionOrNullimpl;
        long j10;
        Intrinsics.checkNotNullParameter(localFileName, "localFileName");
        File fileFromDisk = com.zoho.livechat.android.utils.y.INSTANCE.getFileFromDisk(localFileName);
        String str = null;
        String absolutePath = fileFromDisk != null ? fileFromDisk.getAbsolutePath() : null;
        long length = fileFromDisk != null ? fileFromDisk.length() : -1L;
        if (fileFromDisk == null) {
            return null;
        }
        Application C10 = f68951a.C();
        boolean z10 = false;
        long j11 = 0;
        if (C10 != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(fileFromDisk.getName()));
                if (mimeTypeFromExtension != null) {
                    j10 = -1;
                    try {
                    } catch (Throwable th2) {
                        th = th2;
                        Result.Companion companion2 = Result.INSTANCE;
                        m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th));
                        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                        if (m150exceptionOrNullimpl != null) {
                        }
                        Result.m146boximpl(m147constructorimpl);
                        return new Message.Extras(absolutePath, localFileName, length, j11, str, null, null, null, z10, EnumC3631g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
                    }
                } else {
                    j10 = -1;
                }
                if (mimeTypeFromExtension != null) {
                }
                str = null;
                m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
            } catch (Throwable th3) {
                th = th3;
            }
            m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
            if (m150exceptionOrNullimpl != null) {
                LiveChatUtil.log(m150exceptionOrNullimpl);
                z10 = true;
            }
            Result.m146boximpl(m147constructorimpl);
        }
        return new Message.Extras(absolutePath, localFileName, length, j11, str, null, null, null, z10, EnumC3631g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object M(String str, Continuation continuation) {
        C6977l c6977l;
        int i10;
        List list;
        if (continuation instanceof C6977l) {
            c6977l = (C6977l) continuation;
            int i11 = c6977l.f69092o;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c6977l.f69092o = i11 - Integer.MIN_VALUE;
                Object obj = c6977l.f69091n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c6977l.f69092o;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    list = null;
                    InterfaceC5321f interfaceC5321f = (InterfaceC5321f) f68951a.G().b(null, str).b();
                    if (interfaceC5321f != null) {
                        c6977l.f69092o = 1;
                        obj = AbstractC5323h.t(interfaceC5321f, c6977l);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return list == null ? CollectionsKt.emptyList() : list;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                list = (List) obj;
                if (list == null) {
                }
            }
        }
        c6977l = new C6977l(continuation);
        Object obj2 = c6977l.f69091n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c6977l.f69092o;
        if (i10 != 0) {
        }
        list = (List) obj2;
        if (list == null) {
        }
    }

    public static final Message O(SalesIQChat salesIQChat, String str, Long l10, String str2, String str3, String str4, Message.g messageType, Message.f status) {
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        Intrinsics.checkNotNullParameter(status, "status");
        return Q(salesIQChat, str, l10, str2, str3, str4, messageType, status, null, 256, null);
    }

    public static final Message P(SalesIQChat salesIQChat, String str, Long l10, String str2, String str3, String str4, Message.g messageType, Message.f status, Integer num) {
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        Intrinsics.checkNotNullParameter(status, "status");
        long longValue = l10 != null ? l10.longValue() : rd.b.f();
        String annonID = str2 == null ? LiveChatUtil.getAnnonID() : str2;
        if (salesIQChat == null) {
            return null;
        }
        String convID = salesIQChat.getConvID();
        String visitorid = salesIQChat.getVisitorid();
        String chid = salesIQChat.getChid();
        Intrinsics.checkNotNullExpressionValue(chid, "getChid(...)");
        String valueOf = String.valueOf(longValue);
        String visitorName = str3 == null ? LiveChatUtil.getVisitorName() : str3;
        return new Message(convID, visitorid, chid, messageType, status, valueOf, "", num, str, str4, longValue, longValue, annonID, str3, visitorName != null ? new Message.b(visitorName, og.m.b(visitorName)) : null, null, salesIQChat.getRchatid(), null, null, null, LiveChatUtil.isBotSender(annonID), null, null, null, null, null, null, null, 0L, 0L, 0L, null, null, null, null, null, false, false, false, false, false, null, -1146880, 1023, null);
    }

    public static /* synthetic */ Message Q(SalesIQChat salesIQChat, String str, Long l10, String str2, String str3, String str4, Message.g gVar, Message.f fVar, Integer num, int i10, Object obj) {
        if ((i10 & 32) != 0) {
            str4 = null;
        }
        if ((i10 & 64) != 0) {
            gVar = Message.g.Text;
        }
        if ((i10 & 128) != 0) {
            fVar = Message.f.Sending;
        }
        if ((i10 & 256) != 0) {
            num = null;
        }
        return P(salesIQChat, str, l10, str2, str3, str4, gVar, fVar, num);
    }

    public static final Message R(String conversationId) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        return (Message) AbstractC1455i.e(C1452g0.b(), new C6979n(conversationId, null));
    }

    public static final String Y(String acknowledgementKey) {
        Object b10;
        Intrinsics.checkNotNullParameter(acknowledgementKey, "acknowledgementKey");
        b10 = AbstractC1457j.b(null, new C6980o(acknowledgementKey, null), 1, null);
        return (String) b10;
    }

    public static final boolean h0(EnumC6745a messageAction) {
        Intrinsics.checkNotNullParameter(messageAction, "messageAction");
        return i.i((Boolean) f68951a.J().a(messageAction).b());
    }

    public static final void i0(String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        AbstractC1459k.d(f68951a.B(), null, null, new C6984s(chatId, null), 3, null);
    }

    public static final void j0(String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        AbstractC1459k.d(f68951a.B(), null, null, new C6986u(chatId, null), 3, null);
    }

    public static final void k0() {
        AbstractC1459k.d(f68951a.B(), null, null, new C6988w(null), 3, null);
    }

    public static final void n0(boolean z10) {
        AbstractC1459k.d(f68951a.B(), null, null, new A(z10, null), 3, null);
    }

    public static final void p0(SalesIQChat salesIQChat, File file, String str, Long l10) {
        Intrinsics.checkNotNullParameter(salesIQChat, "salesIQChat");
        Intrinsics.checkNotNullParameter(file, "file");
        AbstractC1459k.d(f68951a.B(), null, null, new B(l10, file, salesIQChat, str, null), 3, null);
    }

    public static final void q0(Context context, SalesIQChat salesIQChat, long j10, long j11) {
        s0(context, salesIQChat, j10, j11, null, 16, null);
    }

    public static final void r0(Context context, SalesIQChat salesIQChat, long j10, long j11, Integer num) {
        String stackTraceString = Log.getStackTraceString(new Throwable());
        Intrinsics.checkNotNullExpressionValue(stackTraceString, "getStackTraceString(...)");
        AbstractC1459k.d(f68951a.B(), null, null, new C(j11, context, salesIQChat, num, stackTraceString, j10, null), 3, null);
    }

    public static /* synthetic */ void s0(Context context, SalesIQChat salesIQChat, long j10, long j11, Integer num, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            num = 2;
        }
        r0(context, salesIQChat, j10, j11, num);
    }

    public static final void t0(Message message) {
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC1459k.d(f68951a.B(), null, null, new D(message, null), 3, null);
    }

    public static final void u0(Message message) {
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC1455i.e(C1452g0.b(), new F(message, null));
    }

    public static final void v(String chatId, Message.g type) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(type, "type");
        AbstractC1459k.d(f68951a.B(), null, null, new C6969c(chatId, type, null), 3, null);
    }

    public static final void v0(Message message, boolean z10) {
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC1459k.d(f68951a.B(), null, null, new G(message, z10, null), 3, null);
    }

    public static final void w(String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        y(chatId, null, 2, null);
    }

    public static /* synthetic */ void w0(Message message, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        v0(message, z10);
    }

    public static final void x(String chatId, String str) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        AbstractC1459k.d(f68951a.B(), null, null, new C6970d(chatId, str, null), 3, null);
    }

    public static final void x0(String str, String str2, String chatId, String str3, boolean z10, Long l10) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        z0(str, str2, chatId, str3, z10, l10, null, 64, null);
    }

    public static /* synthetic */ void y(String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        x(str, str2);
    }

    public static final void y0(String str, String str2, String chatId, String str3, boolean z10, Long l10, String str4) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        AbstractC1459k.d(f68951a.B(), null, null, new H(str, str2, chatId, str3, str4, l10, z10, null), 3, null);
    }

    public static final void z(String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        AbstractC1459k.d(f68951a.B(), null, null, new C1012g(chatId, null), 3, null);
    }

    public static /* synthetic */ void z0(String str, String str2, String str3, String str4, boolean z10, Long l10, String str5, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        y0(str, str2, str3, str4, z10, (i10 & 32) != 0 ? null : l10, (i10 & 64) != 0 ? null : str5);
    }

    public final C6885b A() {
        return (C6885b) f68956f.getValue();
    }

    public final Ph.P B() {
        return C6461a.f65810a.e();
    }

    public final Application C() {
        return MobilistenInitProvider.INSTANCE.e();
    }

    public final C6888e D() {
        return (C6888e) f68964n.getValue();
    }

    public final C6889f E() {
        return (C6889f) f68972v.getValue();
    }

    public final yf.h F() {
        return (yf.h) f68971u.getValue();
    }

    public final k G() {
        return (k) f68969s.getValue();
    }

    public final k H() {
        return (k) f68970t.getValue();
    }

    public final m J() {
        return (m) f68975y.getValue();
    }

    public final n K() {
        return (n) f68973w.getValue();
    }

    public final C6550a N() {
        return (C6550a) f68952b.getValue();
    }

    public final q S() {
        return (q) f68963m.getValue();
    }

    public final s T() {
        return (s) f68955e.getValue();
    }

    public final String U() {
        return f68976z;
    }

    public final w V() {
        return (w) f68965o.getValue();
    }

    public final x W() {
        return (x) f68953c.getValue();
    }

    public final yf.y X() {
        return (yf.y) f68954d.getValue();
    }

    public final yf.z Z() {
        return (yf.z) f68974x.getValue();
    }

    public final C6881A a0() {
        return (C6881A) f68966p.getValue();
    }

    public final C6882B b0() {
        return (C6882B) f68962l.getValue();
    }

    public final C6883C c0() {
        return (C6883C) f68959i.getValue();
    }

    public final yf.D d0() {
        return (yf.D) f68957g.getValue();
    }

    public final yf.E e0() {
        return (yf.E) f68958h.getValue();
    }

    public final yf.F f0() {
        return (yf.F) f68960j.getValue();
    }

    public final yf.G g0() {
        return (yf.G) f68961k.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l0(String str, String chatId, String visitorId, String str2, Message.g messageType, String clientMessageId, Message.Attachment attachment, Message.Extras extras, File file, boolean z10) {
        C0 d10;
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(visitorId, "visitorId");
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        Intrinsics.checkNotNullParameter(clientMessageId, "clientMessageId");
        if (z10) {
            return;
        }
        d10 = AbstractC1459k.d(B(), null, null, new z(str, chatId, visitorId, clientMessageId, str2, messageType, attachment, extras, file, null), 3, null);
        if ((file == 0 ? attachment : file) != null) {
        }
    }

    public final void m0(String str) {
        Application C10 = C();
        if (C10 != null) {
            C1908a b10 = C1908a.b(C10);
            Intent intent = new Intent("receivelivechat");
            intent.putExtra("message", "refreshchat");
            intent.putExtra("chid", str);
            b10.d(intent);
        }
    }

    public final void o0(String str) {
        f68976z = str;
    }
}
