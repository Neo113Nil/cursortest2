package cd;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.lifecycle.k1;
import com.google.android.gms.internal.measurement.y3;
import com.google.firebase.messaging.x;
import com.sports.insider.MyApp;
import com.sports.insider.R;
import com.sports.insider.ui.onboarding.NoEthernetFragment;
import com.sports.insider.ui.pays.PayExpressFragment;
import com.sports.insider.ui.pays.PayPremiumFragment;
import com.sports.insider.ui.pays.VipAccessFragment;
import eg.c0;
import eg.m0;
import gh.a0;
import gh.b0;
import gh.j0;
import ic.i0;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import la.d1;
import la.e1;
import la.j1;
import le.f1;
import le.h0;
import le.k2;
import le.n1;
import le.z;
import org.json.JSONObject;
import wc.d0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3773b;

    /* renamed from: c, reason: collision with root package name */
    public int f3774c;

    /* renamed from: d, reason: collision with root package name */
    public Object f3775d;

    /* renamed from: e, reason: collision with root package name */
    public int f3776e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3777f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f3778g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(k1 k1Var, int i5, Activity activity, String str, Continuation continuation, int i10) {
        super(2, continuation);
        this.f3773b = i10;
        this.f3777f = k1Var;
        this.f3776e = i5;
        this.f3778g = activity;
        this.f3775d = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x012c, code lost:
    
        if (r12 == r1) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0116 A[Catch: Exception -> 0x0132, TryCatch #0 {Exception -> 0x0132, blocks: (B:8:0x0023, B:9:0x012f, B:13:0x002e, B:14:0x0112, B:16:0x0116, B:21:0x003d, B:22:0x00f3, B:23:0x00fa, B:27:0x004c, B:28:0x00d5, B:30:0x00d9, B:36:0x005b, B:37:0x00b5, B:38:0x00ba, B:43:0x0069, B:45:0x0095, B:47:0x0099, B:53:0x007a), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d9 A[Catch: Exception -> 0x0132, TryCatch #0 {Exception -> 0x0132, blocks: (B:8:0x0023, B:9:0x012f, B:13:0x002e, B:14:0x0112, B:16:0x0116, B:21:0x003d, B:22:0x00f3, B:23:0x00fa, B:27:0x004c, B:28:0x00d5, B:30:0x00d9, B:36:0x005b, B:37:0x00b5, B:38:0x00ba, B:43:0x0069, B:45:0x0095, B:47:0x0099, B:53:0x007a), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0099 A[Catch: Exception -> 0x0132, TryCatch #0 {Exception -> 0x0132, blocks: (B:8:0x0023, B:9:0x012f, B:13:0x002e, B:14:0x0112, B:16:0x0116, B:21:0x003d, B:22:0x00f3, B:23:0x00fa, B:27:0x004c, B:28:0x00d5, B:30:0x00d9, B:36:0x005b, B:37:0x00b5, B:38:0x00ba, B:43:0x0069, B:45:0x0095, B:47:0x0099, B:53:0x007a), top: B:2:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object c(Object obj) {
        Context context;
        int i5;
        Drawable drawable;
        PayPremiumFragment payPremiumFragment;
        int i10;
        Context context2;
        PayPremiumFragment payPremiumFragment2;
        int i11;
        Context context3;
        Drawable drawable2;
        Context context4;
        PayPremiumFragment payPremiumFragment3;
        PayPremiumFragment payPremiumFragment4;
        Drawable drawable3;
        PayPremiumFragment payPremiumFragment5 = (PayPremiumFragment) this.f3778g;
        lf.a aVar = lf.a.f20034a;
        int i12 = 2;
        int i13 = 1;
        int i14 = 0;
        Continuation continuation = null;
        try {
            switch (this.f3776e) {
                case 0:
                    h8.b.B(obj);
                    Context context5 = payPremiumFragment5.getContext();
                    if (context5 != null) {
                        Integer num = new Integer(R.drawable.ic_close_white_24dp);
                        this.f3775d = payPremiumFragment5;
                        this.f3777f = context5;
                        this.f3774c = 0;
                        this.f3776e = 1;
                        Object G = PayPremiumFragment.G(payPremiumFragment5, context5, num, this);
                        if (G == aVar) {
                            return aVar;
                        }
                        context = context5;
                        obj = G;
                        i5 = 0;
                        drawable = (Drawable) obj;
                        if (drawable != null) {
                            lg.e eVar = m0.f9201a;
                            fg.e eVar2 = jg.q.f18523a;
                            n1 n1Var = new n1(payPremiumFragment5, drawable, continuation, i14);
                            this.f3775d = payPremiumFragment5;
                            this.f3777f = context;
                            this.f3774c = i5;
                            this.f3776e = 2;
                            obj = c0.A(eVar2, n1Var, this);
                            if (obj == aVar) {
                                return aVar;
                            }
                            payPremiumFragment = payPremiumFragment5;
                            i10 = i5;
                            context2 = context;
                            context = context2;
                            i5 = i10;
                            payPremiumFragment5 = payPremiumFragment;
                        }
                        Integer num2 = new Integer(R.drawable.head_premium_image);
                        this.f3775d = payPremiumFragment5;
                        this.f3777f = context;
                        this.f3774c = i5;
                        this.f3776e = 3;
                        obj = PayPremiumFragment.G(payPremiumFragment5, context, num2, this);
                        if (obj == aVar) {
                            return aVar;
                        }
                        payPremiumFragment2 = payPremiumFragment5;
                        i11 = i5;
                        context3 = context;
                        drawable2 = (Drawable) obj;
                        if (drawable2 == null) {
                            lg.e eVar3 = m0.f9201a;
                            fg.e eVar4 = jg.q.f18523a;
                            n1 n1Var2 = new n1(payPremiumFragment2, drawable2, continuation, i13);
                            this.f3775d = payPremiumFragment2;
                            this.f3777f = context3;
                            this.f3774c = i11;
                            this.f3776e = 4;
                            obj = c0.A(eVar4, n1Var2, this);
                            if (obj != aVar) {
                                payPremiumFragment4 = payPremiumFragment2;
                                context4 = context3;
                                payPremiumFragment3 = payPremiumFragment4;
                                Integer num3 = new Integer(R.drawable.rectangle_89);
                                this.f3775d = payPremiumFragment3;
                                this.f3777f = null;
                                this.f3774c = i11;
                                this.f3776e = 5;
                                obj = PayPremiumFragment.G(payPremiumFragment3, context4, num3, this);
                                if (obj == aVar) {
                                    return aVar;
                                }
                                drawable3 = (Drawable) obj;
                                if (drawable3 != null) {
                                    lg.e eVar5 = m0.f9201a;
                                    fg.e eVar6 = jg.q.f18523a;
                                    n1 n1Var3 = new n1(payPremiumFragment3, drawable3, continuation, i12);
                                    this.f3775d = null;
                                    this.f3777f = null;
                                    this.f3774c = i11;
                                    this.f3776e = 6;
                                    obj = c0.A(eVar6, n1Var3, this);
                                    break;
                                }
                            } else {
                                return aVar;
                            }
                        } else {
                            context4 = context3;
                            payPremiumFragment3 = payPremiumFragment2;
                            Integer num32 = new Integer(R.drawable.rectangle_89);
                            this.f3775d = payPremiumFragment3;
                            this.f3777f = null;
                            this.f3774c = i11;
                            this.f3776e = 5;
                            obj = PayPremiumFragment.G(payPremiumFragment3, context4, num32, this);
                            if (obj == aVar) {
                            }
                            drawable3 = (Drawable) obj;
                            if (drawable3 != null) {
                            }
                        }
                    }
                    return null;
                case 1:
                    int i15 = this.f3774c;
                    Context context6 = (Context) this.f3777f;
                    PayPremiumFragment payPremiumFragment6 = (PayPremiumFragment) this.f3775d;
                    h8.b.B(obj);
                    i5 = i15;
                    payPremiumFragment5 = payPremiumFragment6;
                    context = context6;
                    drawable = (Drawable) obj;
                    if (drawable != null) {
                    }
                    Integer num22 = new Integer(R.drawable.head_premium_image);
                    this.f3775d = payPremiumFragment5;
                    this.f3777f = context;
                    this.f3774c = i5;
                    this.f3776e = 3;
                    obj = PayPremiumFragment.G(payPremiumFragment5, context, num22, this);
                    if (obj == aVar) {
                    }
                    break;
                case 2:
                    i10 = this.f3774c;
                    context2 = (Context) this.f3777f;
                    payPremiumFragment = (PayPremiumFragment) this.f3775d;
                    h8.b.B(obj);
                    context = context2;
                    i5 = i10;
                    payPremiumFragment5 = payPremiumFragment;
                    Integer num222 = new Integer(R.drawable.head_premium_image);
                    this.f3775d = payPremiumFragment5;
                    this.f3777f = context;
                    this.f3774c = i5;
                    this.f3776e = 3;
                    obj = PayPremiumFragment.G(payPremiumFragment5, context, num222, this);
                    if (obj == aVar) {
                    }
                    break;
                case 3:
                    i11 = this.f3774c;
                    context3 = (Context) this.f3777f;
                    payPremiumFragment2 = (PayPremiumFragment) this.f3775d;
                    h8.b.B(obj);
                    drawable2 = (Drawable) obj;
                    if (drawable2 == null) {
                    }
                    break;
                case 4:
                    i11 = this.f3774c;
                    context3 = (Context) this.f3777f;
                    payPremiumFragment4 = (PayPremiumFragment) this.f3775d;
                    h8.b.B(obj);
                    context4 = context3;
                    payPremiumFragment3 = payPremiumFragment4;
                    Integer num322 = new Integer(R.drawable.rectangle_89);
                    this.f3775d = payPremiumFragment3;
                    this.f3777f = null;
                    this.f3774c = i11;
                    this.f3776e = 5;
                    obj = PayPremiumFragment.G(payPremiumFragment3, context4, num322, this);
                    if (obj == aVar) {
                    }
                    drawable3 = (Drawable) obj;
                    if (drawable3 != null) {
                    }
                    return null;
                case 5:
                    i11 = this.f3774c;
                    payPremiumFragment3 = (PayPremiumFragment) this.f3775d;
                    h8.b.B(obj);
                    drawable3 = (Drawable) obj;
                    if (drawable3 != null) {
                    }
                    return null;
                case 6:
                    h8.b.B(obj);
                    return (Unit) obj;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Exception unused) {
            return Unit.f19194a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x019c, code lost:
    
        if (r13 == r1) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0185 A[Catch: Exception -> 0x01a2, TryCatch #0 {Exception -> 0x01a2, blocks: (B:8:0x0024, B:9:0x019f, B:13:0x002f, B:14:0x0181, B:16:0x0185, B:21:0x003e, B:22:0x015b, B:23:0x0162, B:27:0x004d, B:28:0x013d, B:30:0x0141, B:36:0x005c, B:37:0x011a, B:38:0x011d, B:43:0x006b, B:44:0x00fb, B:46:0x00ff, B:51:0x007a, B:52:0x00d4, B:53:0x00d9, B:58:0x0088, B:60:0x00b4, B:62:0x00b8, B:68:0x0099), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0141 A[Catch: Exception -> 0x01a2, TryCatch #0 {Exception -> 0x01a2, blocks: (B:8:0x0024, B:9:0x019f, B:13:0x002f, B:14:0x0181, B:16:0x0185, B:21:0x003e, B:22:0x015b, B:23:0x0162, B:27:0x004d, B:28:0x013d, B:30:0x0141, B:36:0x005c, B:37:0x011a, B:38:0x011d, B:43:0x006b, B:44:0x00fb, B:46:0x00ff, B:51:0x007a, B:52:0x00d4, B:53:0x00d9, B:58:0x0088, B:60:0x00b4, B:62:0x00b8, B:68:0x0099), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ff A[Catch: Exception -> 0x01a2, TryCatch #0 {Exception -> 0x01a2, blocks: (B:8:0x0024, B:9:0x019f, B:13:0x002f, B:14:0x0181, B:16:0x0185, B:21:0x003e, B:22:0x015b, B:23:0x0162, B:27:0x004d, B:28:0x013d, B:30:0x0141, B:36:0x005c, B:37:0x011a, B:38:0x011d, B:43:0x006b, B:44:0x00fb, B:46:0x00ff, B:51:0x007a, B:52:0x00d4, B:53:0x00d9, B:58:0x0088, B:60:0x00b4, B:62:0x00b8, B:68:0x0099), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b8 A[Catch: Exception -> 0x01a2, TryCatch #0 {Exception -> 0x01a2, blocks: (B:8:0x0024, B:9:0x019f, B:13:0x002f, B:14:0x0181, B:16:0x0185, B:21:0x003e, B:22:0x015b, B:23:0x0162, B:27:0x004d, B:28:0x013d, B:30:0x0141, B:36:0x005c, B:37:0x011a, B:38:0x011d, B:43:0x006b, B:44:0x00fb, B:46:0x00ff, B:51:0x007a, B:52:0x00d4, B:53:0x00d9, B:58:0x0088, B:60:0x00b4, B:62:0x00b8, B:68:0x0099), top: B:2:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object e(Object obj) {
        Context context;
        int i5;
        Drawable drawable;
        VipAccessFragment vipAccessFragment;
        int i10;
        Context context2;
        VipAccessFragment vipAccessFragment2;
        int i11;
        Context context3;
        Drawable drawable2;
        VipAccessFragment vipAccessFragment3;
        VipAccessFragment vipAccessFragment4;
        Drawable drawable3;
        Context context4;
        VipAccessFragment vipAccessFragment5;
        VipAccessFragment vipAccessFragment6;
        Drawable drawable4;
        VipAccessFragment vipAccessFragment7 = (VipAccessFragment) this.f3778g;
        lf.a aVar = lf.a.f20034a;
        try {
            switch (this.f3776e) {
                case 0:
                    h8.b.B(obj);
                    Context context5 = vipAccessFragment7.getContext();
                    if (context5 != null) {
                        Integer num = new Integer(R.drawable.ic_close_white_24dp);
                        this.f3775d = vipAccessFragment7;
                        this.f3777f = context5;
                        this.f3774c = 0;
                        this.f3776e = 1;
                        Object G = VipAccessFragment.G(vipAccessFragment7, context5, num, this);
                        if (G == aVar) {
                            return aVar;
                        }
                        context = context5;
                        obj = G;
                        i5 = 0;
                        drawable = (Drawable) obj;
                        if (drawable != null) {
                            lg.e eVar = m0.f9201a;
                            fg.e eVar2 = jg.q.f18523a;
                            k2 k2Var = new k2(vipAccessFragment7, drawable, null, 0);
                            this.f3775d = vipAccessFragment7;
                            this.f3777f = context;
                            this.f3774c = i5;
                            this.f3776e = 2;
                            obj = c0.A(eVar2, k2Var, this);
                            if (obj == aVar) {
                                return aVar;
                            }
                            vipAccessFragment = vipAccessFragment7;
                            i10 = i5;
                            context2 = context;
                            context = context2;
                            i5 = i10;
                            vipAccessFragment7 = vipAccessFragment;
                        }
                        vipAccessFragment7.H().getClass();
                        Integer num2 = new Integer(R.drawable.image_vip_top);
                        this.f3775d = vipAccessFragment7;
                        this.f3777f = context;
                        this.f3774c = i5;
                        this.f3776e = 3;
                        obj = VipAccessFragment.G(vipAccessFragment7, context, num2, this);
                        if (obj == aVar) {
                            return aVar;
                        }
                        vipAccessFragment2 = vipAccessFragment7;
                        i11 = i5;
                        context3 = context;
                        drawable2 = (Drawable) obj;
                        if (drawable2 != null) {
                            lg.e eVar3 = m0.f9201a;
                            fg.e eVar4 = jg.q.f18523a;
                            k2 k2Var2 = new k2(vipAccessFragment2, drawable2, null, 1);
                            this.f3775d = vipAccessFragment2;
                            this.f3777f = context3;
                            this.f3774c = i11;
                            this.f3776e = 4;
                            obj = c0.A(eVar4, k2Var2, this);
                            if (obj == aVar) {
                                return aVar;
                            }
                            vipAccessFragment3 = vipAccessFragment2;
                            vipAccessFragment2 = vipAccessFragment3;
                        }
                        vipAccessFragment2.H().getClass();
                        Integer num3 = new Integer(R.drawable.vip_image_background);
                        this.f3775d = vipAccessFragment2;
                        this.f3777f = context3;
                        this.f3774c = i11;
                        this.f3776e = 5;
                        obj = VipAccessFragment.G(vipAccessFragment2, context3, num3, this);
                        if (obj == aVar) {
                            return aVar;
                        }
                        vipAccessFragment4 = vipAccessFragment2;
                        drawable3 = (Drawable) obj;
                        if (drawable3 == null) {
                            lg.e eVar5 = m0.f9201a;
                            fg.e eVar6 = jg.q.f18523a;
                            k2 k2Var3 = new k2(vipAccessFragment4, drawable3, null, 2);
                            this.f3775d = vipAccessFragment4;
                            this.f3777f = context3;
                            this.f3774c = i11;
                            this.f3776e = 6;
                            obj = c0.A(eVar6, k2Var3, this);
                            if (obj != aVar) {
                                vipAccessFragment6 = vipAccessFragment4;
                                context4 = context3;
                                vipAccessFragment5 = vipAccessFragment6;
                                vipAccessFragment5.H().getClass();
                                Integer num4 = new Integer(R.drawable.rectangle_89);
                                this.f3775d = vipAccessFragment5;
                                this.f3777f = null;
                                this.f3774c = i11;
                                this.f3776e = 7;
                                obj = VipAccessFragment.G(vipAccessFragment5, context4, num4, this);
                                if (obj == aVar) {
                                    return aVar;
                                }
                                drawable4 = (Drawable) obj;
                                if (drawable4 != null) {
                                    lg.e eVar7 = m0.f9201a;
                                    fg.e eVar8 = jg.q.f18523a;
                                    k2 k2Var4 = new k2(vipAccessFragment5, drawable4, null, 3);
                                    this.f3775d = null;
                                    this.f3777f = null;
                                    this.f3774c = i11;
                                    this.f3776e = 8;
                                    obj = c0.A(eVar8, k2Var4, this);
                                    break;
                                }
                            } else {
                                return aVar;
                            }
                        } else {
                            context4 = context3;
                            vipAccessFragment5 = vipAccessFragment4;
                            vipAccessFragment5.H().getClass();
                            Integer num42 = new Integer(R.drawable.rectangle_89);
                            this.f3775d = vipAccessFragment5;
                            this.f3777f = null;
                            this.f3774c = i11;
                            this.f3776e = 7;
                            obj = VipAccessFragment.G(vipAccessFragment5, context4, num42, this);
                            if (obj == aVar) {
                            }
                            drawable4 = (Drawable) obj;
                            if (drawable4 != null) {
                            }
                        }
                    }
                    return null;
                case 1:
                    int i12 = this.f3774c;
                    Context context6 = (Context) this.f3777f;
                    VipAccessFragment vipAccessFragment8 = (VipAccessFragment) this.f3775d;
                    h8.b.B(obj);
                    i5 = i12;
                    vipAccessFragment7 = vipAccessFragment8;
                    context = context6;
                    drawable = (Drawable) obj;
                    if (drawable != null) {
                    }
                    vipAccessFragment7.H().getClass();
                    Integer num22 = new Integer(R.drawable.image_vip_top);
                    this.f3775d = vipAccessFragment7;
                    this.f3777f = context;
                    this.f3774c = i5;
                    this.f3776e = 3;
                    obj = VipAccessFragment.G(vipAccessFragment7, context, num22, this);
                    if (obj == aVar) {
                    }
                    break;
                case 2:
                    i10 = this.f3774c;
                    context2 = (Context) this.f3777f;
                    vipAccessFragment = (VipAccessFragment) this.f3775d;
                    h8.b.B(obj);
                    context = context2;
                    i5 = i10;
                    vipAccessFragment7 = vipAccessFragment;
                    vipAccessFragment7.H().getClass();
                    Integer num222 = new Integer(R.drawable.image_vip_top);
                    this.f3775d = vipAccessFragment7;
                    this.f3777f = context;
                    this.f3774c = i5;
                    this.f3776e = 3;
                    obj = VipAccessFragment.G(vipAccessFragment7, context, num222, this);
                    if (obj == aVar) {
                    }
                    break;
                case 3:
                    i11 = this.f3774c;
                    context3 = (Context) this.f3777f;
                    vipAccessFragment2 = (VipAccessFragment) this.f3775d;
                    h8.b.B(obj);
                    drawable2 = (Drawable) obj;
                    if (drawable2 != null) {
                    }
                    vipAccessFragment2.H().getClass();
                    Integer num32 = new Integer(R.drawable.vip_image_background);
                    this.f3775d = vipAccessFragment2;
                    this.f3777f = context3;
                    this.f3774c = i11;
                    this.f3776e = 5;
                    obj = VipAccessFragment.G(vipAccessFragment2, context3, num32, this);
                    if (obj == aVar) {
                    }
                    break;
                case 4:
                    i11 = this.f3774c;
                    context3 = (Context) this.f3777f;
                    vipAccessFragment3 = (VipAccessFragment) this.f3775d;
                    h8.b.B(obj);
                    vipAccessFragment2 = vipAccessFragment3;
                    vipAccessFragment2.H().getClass();
                    Integer num322 = new Integer(R.drawable.vip_image_background);
                    this.f3775d = vipAccessFragment2;
                    this.f3777f = context3;
                    this.f3774c = i11;
                    this.f3776e = 5;
                    obj = VipAccessFragment.G(vipAccessFragment2, context3, num322, this);
                    if (obj == aVar) {
                    }
                    break;
                case 5:
                    i11 = this.f3774c;
                    context3 = (Context) this.f3777f;
                    vipAccessFragment4 = (VipAccessFragment) this.f3775d;
                    h8.b.B(obj);
                    drawable3 = (Drawable) obj;
                    if (drawable3 == null) {
                    }
                    break;
                case 6:
                    i11 = this.f3774c;
                    context3 = (Context) this.f3777f;
                    vipAccessFragment6 = (VipAccessFragment) this.f3775d;
                    h8.b.B(obj);
                    context4 = context3;
                    vipAccessFragment5 = vipAccessFragment6;
                    vipAccessFragment5.H().getClass();
                    Integer num422 = new Integer(R.drawable.rectangle_89);
                    this.f3775d = vipAccessFragment5;
                    this.f3777f = null;
                    this.f3774c = i11;
                    this.f3776e = 7;
                    obj = VipAccessFragment.G(vipAccessFragment5, context4, num422, this);
                    if (obj == aVar) {
                    }
                    drawable4 = (Drawable) obj;
                    if (drawable4 != null) {
                    }
                    return null;
                case 7:
                    i11 = this.f3774c;
                    vipAccessFragment5 = (VipAccessFragment) this.f3775d;
                    h8.b.B(obj);
                    drawable4 = (Drawable) obj;
                    if (drawable4 != null) {
                    }
                    return null;
                case 8:
                    h8.b.B(obj);
                    return (Unit) obj;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Exception unused) {
            return Unit.f19194a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bc, code lost:
    
        if (r1.b((ka.c) r0, r8, r9, r17) == r11) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d3, code lost:
    
        if (la.j1.f(r8, -1, r17) != r11) goto L44;
     */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v3, types: [eg.a0, kotlin.coroutines.Continuation] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object g(Object obj) {
        gi.a aVar;
        ?? r14;
        j0 j0Var;
        Object e7;
        int i5 = this.f3776e;
        String str = (String) this.f3775d;
        i2.d dVar = (i2.d) this.f3778g;
        lf.a aVar2 = lf.a.f20034a;
        int i10 = this.f3774c;
        try {
        } catch (Exception e9) {
            ex = e9;
            aVar = null;
        }
        if (i10 == 0) {
            h8.b.B(obj);
            i2.d.u(dVar).getClass();
            File file = str != null ? new File(StringsKt.M(str, "file:/")) : null;
            j1 j1Var = (j1) y3.m(j1.class, null, 6);
            String name = file != null ? file.getName() : null;
            if (file != null) {
                int i11 = gh.m0.f10243a;
                Regex regex = b0.f10117d;
                b0 b10 = a0.b("application/json");
                Intrinsics.checkNotNullParameter(file, "<this>");
                j0Var = new j0(b10, file);
            } else {
                j0Var = null;
            }
            Boolean valueOf = Boolean.valueOf(Intrinsics.areEqual("application/json", "application/json"));
            this.f3777f = null;
            this.f3774c = 1;
            j0 j0Var2 = j0Var;
            aVar = null;
            try {
                e7 = j1Var.e(null, name, j0Var2, valueOf, "1.2.44.123", 123, this);
                aVar = aVar;
            } catch (Exception e10) {
                ex = e10;
                j1 j1Var2 = (j1) y3.m(j1.class, aVar, 6);
                this.f3777f = ex;
                this.f3774c = 3;
                j1Var2.getClass();
                r14 = aVar;
            }
            if (e7 == aVar2) {
                return aVar2;
            }
        } else {
            if (i10 != 1) {
                if (i10 == 2) {
                    h8.b.B(obj);
                    return Unit.f19194a;
                }
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ex = (Exception) this.f3777f;
                h8.b.B(obj);
                r14 = 0;
                Intrinsics.checkNotNullParameter(ex, "ex");
                jg.d dVar2 = MyApp.f6830c;
                lg.e eVar = m0.f9201a;
                c0.t(dVar2, lg.d.f20063c, r14, new q4.r(ex, r14, 18), 2);
                return Unit.f19194a;
            }
            h8.b.B(obj);
            e7 = obj;
            aVar = null;
        }
        md.d u10 = i2.d.u(dVar);
        this.f3777f = aVar;
        this.f3774c = 2;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f3773b) {
            case 0:
                return new j((String) this.f3775d, (d) this.f3777f, (Boolean) this.f3778g, this.f3776e, continuation, 0);
            case 1:
                return new j((String) this.f3775d, (n) this.f3777f, (String) this.f3778g, this.f3776e, continuation, 1);
            case 2:
                return new j((hg.g[]) this.f3775d, this.f3776e, (AtomicInteger) this.f3777f, (gg.h) this.f3778g, continuation);
            case 3:
                return new j((kd.d) this.f3777f, (JSONObject) this.f3778g, continuation);
            case 4:
                return new j((NoEthernetFragment) this.f3778g, continuation, 4);
            case 5:
                return new j((z) this.f3777f, this.f3776e, (Activity) this.f3778g, (String) this.f3775d, continuation, 5);
            case 6:
                return new j((PayExpressFragment) this.f3778g, continuation, 6);
            case 7:
                return new j((f1) this.f3777f, this.f3776e, (Activity) this.f3778g, (String) this.f3775d, continuation, 7);
            case 8:
                return new j((PayPremiumFragment) this.f3778g, continuation, 8);
            case 9:
                return new j((VipAccessFragment) this.f3778g, continuation, 9);
            case 10:
                return new j((i2.d) this.f3778g, (String) this.f3775d, this.f3776e, continuation);
            default:
                return new j((se.p) this.f3777f, this.f3776e, (Activity) this.f3778g, (String) this.f3775d, continuation, 11);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f3773b) {
        }
        return ((j) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:313|(2:314|315)|(15:317|318|319|320|(11:322|(1:324)|(9:355|356|(10:332|333|(1:335)(1:352)|(1:337)(1:351)|338|(1:340)(1:350)|341|(1:343)(1:349)|344|(1:347)(1:346))|292|293|(1:295)|297|298|299)|326|(12:328|330|332|333|(0)(0)|(0)(0)|338|(0)(0)|341|(0)(0)|344|(0)(0))|292|293|(0)|297|298|299)|358|(0)|326|(0)|292|293|(0)|297|298|299)|363|319|320|(0)|358|(0)|326|(0)|292|293|(0)|297|298|299) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:284|(2:286|(3:288|289|290)(2:311|312))(18:313|314|315|(15:317|318|319|320|(11:322|(1:324)|(9:355|356|(10:332|333|(1:335)(1:352)|(1:337)(1:351)|338|(1:340)(1:350)|341|(1:343)(1:349)|344|(1:347)(1:346))|292|293|(1:295)|297|298|299)|326|(12:328|330|332|333|(0)(0)|(0)(0)|338|(0)(0)|341|(0)(0)|344|(0)(0))|292|293|(0)|297|298|299)|358|(0)|326|(0)|292|293|(0)|297|298|299)|363|319|320|(0)|358|(0)|326|(0)|292|293|(0)|297|298|299)|291|292|293|(0)|297|298|299) */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x034c, code lost:
    
        if (r2 == r0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0643, code lost:
    
        if (eg.c0.A(r5, r6, r27) == r0) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x0748, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x074a, code lost:
    
        zc.d.b(4, "pay", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x06a8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x06c9, code lost:
    
        zc.d.b(4, "pay", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0334 A[Catch: Exception -> 0x0354, TryCatch #10 {Exception -> 0x0354, blocks: (B:98:0x022d, B:100:0x0350, B:104:0x023a, B:106:0x0330, B:108:0x0334, B:114:0x024b, B:116:0x0314, B:117:0x0316, B:121:0x025d, B:123:0x02f5, B:125:0x02f9, B:129:0x026f, B:131:0x02d1, B:132:0x02d8, B:137:0x0280, B:139:0x02ad, B:141:0x02b1, B:147:0x0292), top: B:93:0x0218 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02f9 A[Catch: Exception -> 0x0354, TryCatch #10 {Exception -> 0x0354, blocks: (B:98:0x022d, B:100:0x0350, B:104:0x023a, B:106:0x0330, B:108:0x0334, B:114:0x024b, B:116:0x0314, B:117:0x0316, B:121:0x025d, B:123:0x02f5, B:125:0x02f9, B:129:0x026f, B:131:0x02d1, B:132:0x02d8, B:137:0x0280, B:139:0x02ad, B:141:0x02b1, B:147:0x0292), top: B:93:0x0218 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02b1 A[Catch: Exception -> 0x0354, TryCatch #10 {Exception -> 0x0354, blocks: (B:98:0x022d, B:100:0x0350, B:104:0x023a, B:106:0x0330, B:108:0x0334, B:114:0x024b, B:116:0x0314, B:117:0x0316, B:121:0x025d, B:123:0x02f5, B:125:0x02f9, B:129:0x026f, B:131:0x02d1, B:132:0x02d8, B:137:0x0280, B:139:0x02ad, B:141:0x02b1, B:147:0x0292), top: B:93:0x0218 }] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x062a A[Catch: Exception -> 0x064a, TryCatch #5 {Exception -> 0x064a, blocks: (B:200:0x0466, B:201:0x0647, B:205:0x0471, B:207:0x0626, B:209:0x062a, B:215:0x0482, B:217:0x060a, B:221:0x0491, B:223:0x05e8, B:225:0x05ec, B:230:0x04a3, B:232:0x05cf, B:236:0x04b2, B:238:0x05ad, B:240:0x05b1, B:245:0x04c4, B:247:0x0593, B:251:0x04d3, B:253:0x0571, B:255:0x0575, B:260:0x04e5, B:262:0x054b, B:263:0x0552, B:268:0x04f6, B:270:0x0527, B:272:0x052b, B:278:0x0508), top: B:195:0x0451 }] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x05ec A[Catch: Exception -> 0x064a, TryCatch #5 {Exception -> 0x064a, blocks: (B:200:0x0466, B:201:0x0647, B:205:0x0471, B:207:0x0626, B:209:0x062a, B:215:0x0482, B:217:0x060a, B:221:0x0491, B:223:0x05e8, B:225:0x05ec, B:230:0x04a3, B:232:0x05cf, B:236:0x04b2, B:238:0x05ad, B:240:0x05b1, B:245:0x04c4, B:247:0x0593, B:251:0x04d3, B:253:0x0571, B:255:0x0575, B:260:0x04e5, B:262:0x054b, B:263:0x0552, B:268:0x04f6, B:270:0x0527, B:272:0x052b, B:278:0x0508), top: B:195:0x0451 }] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x05b1 A[Catch: Exception -> 0x064a, TryCatch #5 {Exception -> 0x064a, blocks: (B:200:0x0466, B:201:0x0647, B:205:0x0471, B:207:0x0626, B:209:0x062a, B:215:0x0482, B:217:0x060a, B:221:0x0491, B:223:0x05e8, B:225:0x05ec, B:230:0x04a3, B:232:0x05cf, B:236:0x04b2, B:238:0x05ad, B:240:0x05b1, B:245:0x04c4, B:247:0x0593, B:251:0x04d3, B:253:0x0571, B:255:0x0575, B:260:0x04e5, B:262:0x054b, B:263:0x0552, B:268:0x04f6, B:270:0x0527, B:272:0x052b, B:278:0x0508), top: B:195:0x0451 }] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0575 A[Catch: Exception -> 0x064a, TryCatch #5 {Exception -> 0x064a, blocks: (B:200:0x0466, B:201:0x0647, B:205:0x0471, B:207:0x0626, B:209:0x062a, B:215:0x0482, B:217:0x060a, B:221:0x0491, B:223:0x05e8, B:225:0x05ec, B:230:0x04a3, B:232:0x05cf, B:236:0x04b2, B:238:0x05ad, B:240:0x05b1, B:245:0x04c4, B:247:0x0593, B:251:0x04d3, B:253:0x0571, B:255:0x0575, B:260:0x04e5, B:262:0x054b, B:263:0x0552, B:268:0x04f6, B:270:0x0527, B:272:0x052b, B:278:0x0508), top: B:195:0x0451 }] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x052b A[Catch: Exception -> 0x064a, TryCatch #5 {Exception -> 0x064a, blocks: (B:200:0x0466, B:201:0x0647, B:205:0x0471, B:207:0x0626, B:209:0x062a, B:215:0x0482, B:217:0x060a, B:221:0x0491, B:223:0x05e8, B:225:0x05ec, B:230:0x04a3, B:232:0x05cf, B:236:0x04b2, B:238:0x05ad, B:240:0x05b1, B:245:0x04c4, B:247:0x0593, B:251:0x04d3, B:253:0x0571, B:255:0x0575, B:260:0x04e5, B:262:0x054b, B:263:0x0552, B:268:0x04f6, B:270:0x0527, B:272:0x052b, B:278:0x0508), top: B:195:0x0451 }] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0743 A[Catch: Exception -> 0x0748, TRY_LEAVE, TryCatch #8 {Exception -> 0x0748, blocks: (B:293:0x0734, B:295:0x0743), top: B:292:0x0734, outer: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:322:0x06a1 A[Catch: Exception -> 0x06a8, TryCatch #7 {Exception -> 0x06a8, blocks: (B:320:0x0699, B:322:0x06a1, B:355:0x06b0), top: B:319:0x0699, outer: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:328:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x06ea  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x06f3  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0722  */
    /* JADX WARN: Removed duplicated region for block: B:347:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:349:0x06ff  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x06ee  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x06b0 A[Catch: Exception -> 0x06a8, TRY_LEAVE, TryCatch #7 {Exception -> 0x06a8, blocks: (B:320:0x0699, B:322:0x06a1, B:355:0x06b0), top: B:319:0x0699, outer: #11 }] */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i5;
        Integer num;
        int i10;
        Integer num2;
        e1 e1Var;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        String optString;
        Integer intOrNull;
        Integer intOrNull2;
        Object i11;
        Context context;
        int i12;
        Drawable drawable;
        Object A;
        NoEthernetFragment noEthernetFragment;
        int i13;
        Object i14;
        NoEthernetFragment noEthernetFragment2;
        int i15;
        Drawable drawable2;
        Context context2;
        Object i16;
        Drawable drawable3;
        Context context3;
        Object i17;
        Drawable drawable4;
        Context context4;
        NoEthernetFragment noEthernetFragment3;
        Object i18;
        Drawable drawable5;
        String str;
        Object d10;
        Object G;
        Context context5;
        int i19;
        Drawable drawable6;
        Object A2;
        PayExpressFragment payExpressFragment;
        int i20;
        Object G2;
        PayExpressFragment payExpressFragment2;
        int i21;
        Drawable drawable7;
        Object A3;
        PayExpressFragment payExpressFragment3;
        Object G3;
        Drawable drawable8;
        Object A4;
        String str2;
        Object d11;
        String str3;
        Object d12;
        int i22 = this.f3773b;
        int i23 = 0;
        Object obj2 = this.f3778g;
        switch (i22) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i24 = this.f3774c;
                if (i24 == 0) {
                    h8.b.B(obj);
                    String str4 = (String) this.f3775d;
                    d dVar = (d) this.f3777f;
                    JSONObject put = new JSONObject().put("AvailableMS", new JSONObject().put("MS", (Boolean) obj2).put("stateMS", this.f3776e).put("descriptionMS", str4));
                    Intrinsics.checkNotNullExpressionValue(put, "put(...)");
                    this.f3774c = 1;
                    if (dVar.d(put, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                int i25 = this.f3774c;
                if (i25 == 0) {
                    h8.b.B(obj);
                    JSONObject jSONObject = new JSONObject();
                    String str5 = (String) this.f3775d;
                    JSONObject jSONObject2 = new JSONObject();
                    int i26 = this.f3776e;
                    jSONObject2.put("PRODUCT_ID", (String) obj2);
                    jSONObject2.put("FORECAST_ID", i26);
                    Unit unit = Unit.f19194a;
                    JSONObject put2 = jSONObject.put(str5, jSONObject2);
                    n nVar = (n) this.f3777f;
                    this.f3774c = 1;
                    if (nVar.e("SUCCESS_AFTER_PURCHASE", put2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 2:
                AtomicInteger atomicInteger = (AtomicInteger) this.f3777f;
                gg.h hVar = (gg.h) obj2;
                lf.a aVar3 = lf.a.f20034a;
                int i27 = this.f3774c;
                try {
                    if (i27 == 0) {
                        h8.b.B(obj);
                        hg.g[] gVarArr = (hg.g[]) this.f3775d;
                        int i28 = this.f3776e;
                        hg.g gVar = gVarArr[i28];
                        ig.n nVar2 = new ig.n(hVar, i28);
                        this.f3774c = 1;
                        if (gVar.a(nVar2, this) == aVar3) {
                            return aVar3;
                        }
                    } else {
                        if (i27 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        hVar.j(null);
                    }
                    return Unit.f19194a;
                } finally {
                    if (atomicInteger.decrementAndGet() == 0) {
                        hVar.j(null);
                    }
                }
            case 3:
                JSONObject jSONObject3 = (JSONObject) obj2;
                lf.a aVar4 = lf.a.f20034a;
                int i29 = this.f3776e;
                if (i29 == 0) {
                    h8.b.B(obj);
                    try {
                        try {
                            String optString2 = jSONObject3.optString("typeContent", CommonUrlParts.Values.FALSE_INTEGER);
                            Intrinsics.checkNotNullExpressionValue(optString2, "optString(...)");
                            intOrNull = StringsKt.toIntOrNull(optString2);
                        } catch (Exception e7) {
                            zc.d.b(4, "pay", e7);
                        }
                    } catch (Exception e9) {
                        zc.d.b(4, "pay", e9);
                    }
                    if (intOrNull != null) {
                        i5 = intOrNull.intValue();
                        optString = jSONObject3.optString("endDate");
                        if (optString != null) {
                            if (optString.length() != 0) {
                            }
                            if (optString != null) {
                                num = Integer.valueOf((int) ZonedDateTime.parse(optString, DateTimeFormatter.ISO_DATE_TIME).withZoneSameInstant(ZoneId.systemDefault()).toEpochSecond());
                                if (num != null && 2 <= i5 && i5 < 6) {
                                    try {
                                        e1Var = (e1) y3.m(e1.class, null, 6);
                                        num3 = i5 != 4 ? num : null;
                                        num4 = i5 != 2 ? num : null;
                                        num5 = i5 != 3 ? num : null;
                                        num6 = i5 != 5 ? num : null;
                                        this.f3775d = num;
                                        this.f3774c = i5;
                                        this.f3776e = 1;
                                        e1Var.getClass();
                                        lg.e eVar = m0.f9201a;
                                        if (c0.A(lg.d.f20063c, new d1(num3, num4, num5, num6, e1Var, null, 0), this) != aVar4) {
                                            return aVar4;
                                        }
                                        i10 = i5;
                                        num2 = num;
                                    } catch (Exception e10) {
                                        e = e10;
                                        i10 = i5;
                                        num2 = num;
                                        zc.d.b(4, "pay", e);
                                        num = num2;
                                        i5 = i10;
                                        String optString3 = jSONObject3.optString("forecastId", CommonUrlParts.Values.FALSE_INTEGER);
                                        Intrinsics.checkNotNullExpressionValue(optString3, "optString(...)");
                                        intOrNull2 = StringsKt.toIntOrNull(optString3);
                                        if (intOrNull2 != null) {
                                        }
                                        hg.d1 d1Var = da.r.f8343a;
                                        Pair state = new Pair(new Integer(i5), new Integer(i23));
                                        Intrinsics.checkNotNullParameter(state, "state");
                                        hg.d1 d1Var2 = da.r.f8350h;
                                        d1Var2.getClass();
                                        d1Var2.k(null, state);
                                        String message = "OnPayPushUseCase\ntypeContent:" + i5 + "\nforecastId:" + i23 + "\nendDate:" + num + "\njson:" + jSONObject3 + '\"';
                                        Intrinsics.checkNotNullParameter(message, "message");
                                        return Unit.f19194a;
                                    }
                                }
                                String optString32 = jSONObject3.optString("forecastId", CommonUrlParts.Values.FALSE_INTEGER);
                                Intrinsics.checkNotNullExpressionValue(optString32, "optString(...)");
                                intOrNull2 = StringsKt.toIntOrNull(optString32);
                                if (intOrNull2 != null) {
                                    i23 = intOrNull2.intValue();
                                }
                                hg.d1 d1Var3 = da.r.f8343a;
                                Pair state2 = new Pair(new Integer(i5), new Integer(i23));
                                Intrinsics.checkNotNullParameter(state2, "state");
                                hg.d1 d1Var22 = da.r.f8350h;
                                d1Var22.getClass();
                                d1Var22.k(null, state2);
                                String message2 = "OnPayPushUseCase\ntypeContent:" + i5 + "\nforecastId:" + i23 + "\nendDate:" + num + "\njson:" + jSONObject3 + '\"';
                                Intrinsics.checkNotNullParameter(message2, "message");
                                return Unit.f19194a;
                            }
                            num = null;
                            if (num != null) {
                                e1Var = (e1) y3.m(e1.class, null, 6);
                                if (i5 != 4) {
                                }
                                if (i5 != 2) {
                                }
                                if (i5 != 3) {
                                }
                                if (i5 != 5) {
                                }
                                this.f3775d = num;
                                this.f3774c = i5;
                                this.f3776e = 1;
                                e1Var.getClass();
                                lg.e eVar2 = m0.f9201a;
                                if (c0.A(lg.d.f20063c, new d1(num3, num4, num5, num6, e1Var, null, 0), this) != aVar4) {
                                }
                            }
                            String optString322 = jSONObject3.optString("forecastId", CommonUrlParts.Values.FALSE_INTEGER);
                            Intrinsics.checkNotNullExpressionValue(optString322, "optString(...)");
                            intOrNull2 = StringsKt.toIntOrNull(optString322);
                            if (intOrNull2 != null) {
                            }
                            hg.d1 d1Var32 = da.r.f8343a;
                            Pair state22 = new Pair(new Integer(i5), new Integer(i23));
                            Intrinsics.checkNotNullParameter(state22, "state");
                            hg.d1 d1Var222 = da.r.f8350h;
                            d1Var222.getClass();
                            d1Var222.k(null, state22);
                            String message22 = "OnPayPushUseCase\ntypeContent:" + i5 + "\nforecastId:" + i23 + "\nendDate:" + num + "\njson:" + jSONObject3 + '\"';
                            Intrinsics.checkNotNullParameter(message22, "message");
                            return Unit.f19194a;
                        }
                        optString = null;
                        if (optString != null) {
                        }
                        num = null;
                        if (num != null) {
                        }
                        String optString3222 = jSONObject3.optString("forecastId", CommonUrlParts.Values.FALSE_INTEGER);
                        Intrinsics.checkNotNullExpressionValue(optString3222, "optString(...)");
                        intOrNull2 = StringsKt.toIntOrNull(optString3222);
                        if (intOrNull2 != null) {
                        }
                        hg.d1 d1Var322 = da.r.f8343a;
                        Pair state222 = new Pair(new Integer(i5), new Integer(i23));
                        Intrinsics.checkNotNullParameter(state222, "state");
                        hg.d1 d1Var2222 = da.r.f8350h;
                        d1Var2222.getClass();
                        d1Var2222.k(null, state222);
                        String message222 = "OnPayPushUseCase\ntypeContent:" + i5 + "\nforecastId:" + i23 + "\nendDate:" + num + "\njson:" + jSONObject3 + '\"';
                        Intrinsics.checkNotNullParameter(message222, "message");
                        return Unit.f19194a;
                    }
                    i5 = 0;
                    optString = jSONObject3.optString("endDate");
                    if (optString != null) {
                    }
                    optString = null;
                    if (optString != null) {
                    }
                    num = null;
                    if (num != null) {
                    }
                    String optString32222 = jSONObject3.optString("forecastId", CommonUrlParts.Values.FALSE_INTEGER);
                    Intrinsics.checkNotNullExpressionValue(optString32222, "optString(...)");
                    intOrNull2 = StringsKt.toIntOrNull(optString32222);
                    if (intOrNull2 != null) {
                    }
                    hg.d1 d1Var3222 = da.r.f8343a;
                    Pair state2222 = new Pair(new Integer(i5), new Integer(i23));
                    Intrinsics.checkNotNullParameter(state2222, "state");
                    hg.d1 d1Var22222 = da.r.f8350h;
                    d1Var22222.getClass();
                    d1Var22222.k(null, state2222);
                    String message2222 = "OnPayPushUseCase\ntypeContent:" + i5 + "\nforecastId:" + i23 + "\nendDate:" + num + "\njson:" + jSONObject3 + '\"';
                    Intrinsics.checkNotNullParameter(message2222, "message");
                    return Unit.f19194a;
                }
                if (i29 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i10 = this.f3774c;
                num2 = (Integer) this.f3775d;
                try {
                    h8.b.B(obj);
                } catch (Exception e11) {
                    e = e11;
                    zc.d.b(4, "pay", e);
                    num = num2;
                    i5 = i10;
                    String optString322222 = jSONObject3.optString("forecastId", CommonUrlParts.Values.FALSE_INTEGER);
                    Intrinsics.checkNotNullExpressionValue(optString322222, "optString(...)");
                    intOrNull2 = StringsKt.toIntOrNull(optString322222);
                    if (intOrNull2 != null) {
                    }
                    hg.d1 d1Var32222 = da.r.f8343a;
                    Pair state22222 = new Pair(new Integer(i5), new Integer(i23));
                    Intrinsics.checkNotNullParameter(state22222, "state");
                    hg.d1 d1Var222222 = da.r.f8350h;
                    d1Var222222.getClass();
                    d1Var222222.k(null, state22222);
                    String message22222 = "OnPayPushUseCase\ntypeContent:" + i5 + "\nforecastId:" + i23 + "\nendDate:" + num + "\njson:" + jSONObject3 + '\"';
                    Intrinsics.checkNotNullParameter(message22222, "message");
                    return Unit.f19194a;
                }
                num = num2;
                i5 = i10;
                String optString3222222 = jSONObject3.optString("forecastId", CommonUrlParts.Values.FALSE_INTEGER);
                Intrinsics.checkNotNullExpressionValue(optString3222222, "optString(...)");
                intOrNull2 = StringsKt.toIntOrNull(optString3222222);
                if (intOrNull2 != null) {
                }
                hg.d1 d1Var322222 = da.r.f8343a;
                Pair state222222 = new Pair(new Integer(i5), new Integer(i23));
                Intrinsics.checkNotNullParameter(state222222, "state");
                hg.d1 d1Var2222222 = da.r.f8350h;
                d1Var2222222.getClass();
                d1Var2222222.k(null, state222222);
                String message222222 = "OnPayPushUseCase\ntypeContent:" + i5 + "\nforecastId:" + i23 + "\nendDate:" + num + "\njson:" + jSONObject3 + '\"';
                Intrinsics.checkNotNullParameter(message222222, "message");
                return Unit.f19194a;
            case 4:
                NoEthernetFragment noEthernetFragment4 = (NoEthernetFragment) obj2;
                lf.a aVar5 = lf.a.f20034a;
                try {
                    switch (this.f3776e) {
                        case 0:
                            h8.b.B(obj);
                            Context context6 = noEthernetFragment4.getContext();
                            if (context6 != null) {
                                oe.g G4 = noEthernetFragment4.G();
                                Integer num7 = new Integer(R.drawable.ic_app);
                                this.f3775d = noEthernetFragment4;
                                this.f3777f = context6;
                                this.f3774c = 0;
                                this.f3776e = 1;
                                i11 = G4.i(context6, num7, this);
                                if (i11 != aVar5) {
                                    context = context6;
                                    i12 = 0;
                                    drawable = (Drawable) i11;
                                    if (drawable != null) {
                                        lg.e eVar3 = m0.f9201a;
                                        fg.e eVar4 = jg.q.f18523a;
                                        ke.r rVar = new ke.r(noEthernetFragment4, drawable, null, i23);
                                        this.f3775d = noEthernetFragment4;
                                        this.f3777f = context;
                                        this.f3774c = i12;
                                        this.f3776e = 2;
                                        A = c0.A(eVar4, rVar, this);
                                        if (A == aVar5) {
                                            return aVar5;
                                        }
                                        int i30 = i12;
                                        noEthernetFragment = noEthernetFragment4;
                                        i13 = i30;
                                        NoEthernetFragment noEthernetFragment5 = noEthernetFragment;
                                        i12 = i13;
                                        noEthernetFragment4 = noEthernetFragment5;
                                    }
                                    oe.g G5 = noEthernetFragment4.G();
                                    Integer num8 = new Integer(R.drawable.blue_btn);
                                    this.f3775d = noEthernetFragment4;
                                    this.f3777f = context;
                                    this.f3774c = i12;
                                    this.f3776e = 3;
                                    i14 = G5.i(context, num8, this);
                                    if (i14 != aVar5) {
                                        int i31 = i12;
                                        noEthernetFragment2 = noEthernetFragment4;
                                        i15 = i31;
                                        drawable2 = (Drawable) i14;
                                        if (drawable2 != null) {
                                            lg.e eVar5 = m0.f9201a;
                                            fg.e eVar6 = jg.q.f18523a;
                                            ke.r rVar2 = new ke.r(noEthernetFragment2, drawable2, null, 1);
                                            this.f3775d = noEthernetFragment2;
                                            this.f3777f = context;
                                            this.f3774c = i15;
                                            this.f3776e = 4;
                                            if (c0.A(eVar6, rVar2, this) == aVar5) {
                                                return aVar5;
                                            }
                                            context2 = context;
                                            context = context2;
                                        }
                                        oe.g G6 = noEthernetFragment2.G();
                                        Integer num9 = new Integer(R.drawable.blue_btn);
                                        this.f3775d = noEthernetFragment2;
                                        this.f3777f = context;
                                        this.f3774c = i15;
                                        this.f3776e = 5;
                                        i16 = G6.i(context, num9, this);
                                        if (i16 == aVar5) {
                                            return aVar5;
                                        }
                                        drawable3 = (Drawable) i16;
                                        if (drawable3 != null) {
                                            lg.e eVar7 = m0.f9201a;
                                            fg.e eVar8 = jg.q.f18523a;
                                            ke.r rVar3 = new ke.r(noEthernetFragment2, drawable3, null, 2);
                                            this.f3775d = noEthernetFragment2;
                                            this.f3777f = context;
                                            this.f3774c = i15;
                                            this.f3776e = 6;
                                            if (c0.A(eVar8, rVar3, this) == aVar5) {
                                                return aVar5;
                                            }
                                            context3 = context;
                                            context = context3;
                                        }
                                        oe.g G7 = noEthernetFragment2.G();
                                        Integer num10 = new Integer(R.drawable.blue_btn);
                                        this.f3775d = noEthernetFragment2;
                                        this.f3777f = context;
                                        this.f3774c = i15;
                                        this.f3776e = 7;
                                        i17 = G7.i(context, num10, this);
                                        if (i17 == aVar5) {
                                            return aVar5;
                                        }
                                        drawable4 = (Drawable) i17;
                                        if (drawable4 != null) {
                                            lg.e eVar9 = m0.f9201a;
                                            fg.e eVar10 = jg.q.f18523a;
                                            ke.r rVar4 = new ke.r(noEthernetFragment2, drawable4, null, 3);
                                            this.f3775d = noEthernetFragment2;
                                            this.f3777f = context;
                                            this.f3774c = i15;
                                            this.f3776e = 8;
                                            if (c0.A(eVar10, rVar4, this) == aVar5) {
                                                return aVar5;
                                            }
                                            context4 = context;
                                            context = context4;
                                        }
                                        noEthernetFragment3 = noEthernetFragment2;
                                        oe.g G8 = noEthernetFragment3.G();
                                        Integer num11 = new Integer(R.drawable.blue_btn);
                                        this.f3775d = noEthernetFragment3;
                                        this.f3777f = null;
                                        this.f3774c = i15;
                                        this.f3776e = 9;
                                        i18 = G8.i(context, num11, this);
                                        if (i18 == aVar5) {
                                            return aVar5;
                                        }
                                        drawable5 = (Drawable) i18;
                                        if (drawable5 != null) {
                                            lg.e eVar11 = m0.f9201a;
                                            fg.e eVar12 = jg.q.f18523a;
                                            ke.r rVar5 = new ke.r(noEthernetFragment3, drawable5, null, 4);
                                            this.f3775d = null;
                                            this.f3777f = null;
                                            this.f3774c = i15;
                                            this.f3776e = 10;
                                            break;
                                        }
                                    } else {
                                        return aVar5;
                                    }
                                } else {
                                    return aVar5;
                                }
                            }
                            return null;
                        case 1:
                            int i32 = this.f3774c;
                            Context context7 = (Context) this.f3777f;
                            NoEthernetFragment noEthernetFragment6 = (NoEthernetFragment) this.f3775d;
                            h8.b.B(obj);
                            context = context7;
                            i12 = i32;
                            noEthernetFragment4 = noEthernetFragment6;
                            i11 = obj;
                            drawable = (Drawable) i11;
                            if (drawable != null) {
                            }
                            oe.g G52 = noEthernetFragment4.G();
                            Integer num82 = new Integer(R.drawable.blue_btn);
                            this.f3775d = noEthernetFragment4;
                            this.f3777f = context;
                            this.f3774c = i12;
                            this.f3776e = 3;
                            i14 = G52.i(context, num82, this);
                            if (i14 != aVar5) {
                            }
                            break;
                        case 2:
                            i13 = this.f3774c;
                            Context context8 = (Context) this.f3777f;
                            noEthernetFragment = (NoEthernetFragment) this.f3775d;
                            h8.b.B(obj);
                            context = context8;
                            A = obj;
                            NoEthernetFragment noEthernetFragment52 = noEthernetFragment;
                            i12 = i13;
                            noEthernetFragment4 = noEthernetFragment52;
                            oe.g G522 = noEthernetFragment4.G();
                            Integer num822 = new Integer(R.drawable.blue_btn);
                            this.f3775d = noEthernetFragment4;
                            this.f3777f = context;
                            this.f3774c = i12;
                            this.f3776e = 3;
                            i14 = G522.i(context, num822, this);
                            if (i14 != aVar5) {
                            }
                            break;
                        case 3:
                            i15 = this.f3774c;
                            Context context9 = (Context) this.f3777f;
                            noEthernetFragment2 = (NoEthernetFragment) this.f3775d;
                            h8.b.B(obj);
                            context = context9;
                            i14 = obj;
                            drawable2 = (Drawable) i14;
                            if (drawable2 != null) {
                            }
                            oe.g G62 = noEthernetFragment2.G();
                            Integer num92 = new Integer(R.drawable.blue_btn);
                            this.f3775d = noEthernetFragment2;
                            this.f3777f = context;
                            this.f3774c = i15;
                            this.f3776e = 5;
                            i16 = G62.i(context, num92, this);
                            if (i16 == aVar5) {
                            }
                            drawable3 = (Drawable) i16;
                            if (drawable3 != null) {
                            }
                            oe.g G72 = noEthernetFragment2.G();
                            Integer num102 = new Integer(R.drawable.blue_btn);
                            this.f3775d = noEthernetFragment2;
                            this.f3777f = context;
                            this.f3774c = i15;
                            this.f3776e = 7;
                            i17 = G72.i(context, num102, this);
                            if (i17 == aVar5) {
                            }
                            drawable4 = (Drawable) i17;
                            if (drawable4 != null) {
                            }
                            noEthernetFragment3 = noEthernetFragment2;
                            oe.g G82 = noEthernetFragment3.G();
                            Integer num112 = new Integer(R.drawable.blue_btn);
                            this.f3775d = noEthernetFragment3;
                            this.f3777f = null;
                            this.f3774c = i15;
                            this.f3776e = 9;
                            i18 = G82.i(context, num112, this);
                            if (i18 == aVar5) {
                            }
                            drawable5 = (Drawable) i18;
                            if (drawable5 != null) {
                            }
                            return null;
                        case 4:
                            i15 = this.f3774c;
                            context2 = (Context) this.f3777f;
                            noEthernetFragment2 = (NoEthernetFragment) this.f3775d;
                            h8.b.B(obj);
                            context = context2;
                            oe.g G622 = noEthernetFragment2.G();
                            Integer num922 = new Integer(R.drawable.blue_btn);
                            this.f3775d = noEthernetFragment2;
                            this.f3777f = context;
                            this.f3774c = i15;
                            this.f3776e = 5;
                            i16 = G622.i(context, num922, this);
                            if (i16 == aVar5) {
                            }
                            drawable3 = (Drawable) i16;
                            if (drawable3 != null) {
                            }
                            oe.g G722 = noEthernetFragment2.G();
                            Integer num1022 = new Integer(R.drawable.blue_btn);
                            this.f3775d = noEthernetFragment2;
                            this.f3777f = context;
                            this.f3774c = i15;
                            this.f3776e = 7;
                            i17 = G722.i(context, num1022, this);
                            if (i17 == aVar5) {
                            }
                            drawable4 = (Drawable) i17;
                            if (drawable4 != null) {
                            }
                            noEthernetFragment3 = noEthernetFragment2;
                            oe.g G822 = noEthernetFragment3.G();
                            Integer num1122 = new Integer(R.drawable.blue_btn);
                            this.f3775d = noEthernetFragment3;
                            this.f3777f = null;
                            this.f3774c = i15;
                            this.f3776e = 9;
                            i18 = G822.i(context, num1122, this);
                            if (i18 == aVar5) {
                            }
                            drawable5 = (Drawable) i18;
                            if (drawable5 != null) {
                            }
                            return null;
                        case 5:
                            i15 = this.f3774c;
                            Context context10 = (Context) this.f3777f;
                            noEthernetFragment2 = (NoEthernetFragment) this.f3775d;
                            h8.b.B(obj);
                            context = context10;
                            i16 = obj;
                            drawable3 = (Drawable) i16;
                            if (drawable3 != null) {
                            }
                            oe.g G7222 = noEthernetFragment2.G();
                            Integer num10222 = new Integer(R.drawable.blue_btn);
                            this.f3775d = noEthernetFragment2;
                            this.f3777f = context;
                            this.f3774c = i15;
                            this.f3776e = 7;
                            i17 = G7222.i(context, num10222, this);
                            if (i17 == aVar5) {
                            }
                            drawable4 = (Drawable) i17;
                            if (drawable4 != null) {
                            }
                            noEthernetFragment3 = noEthernetFragment2;
                            oe.g G8222 = noEthernetFragment3.G();
                            Integer num11222 = new Integer(R.drawable.blue_btn);
                            this.f3775d = noEthernetFragment3;
                            this.f3777f = null;
                            this.f3774c = i15;
                            this.f3776e = 9;
                            i18 = G8222.i(context, num11222, this);
                            if (i18 == aVar5) {
                            }
                            drawable5 = (Drawable) i18;
                            if (drawable5 != null) {
                            }
                            return null;
                        case 6:
                            i15 = this.f3774c;
                            context3 = (Context) this.f3777f;
                            noEthernetFragment2 = (NoEthernetFragment) this.f3775d;
                            h8.b.B(obj);
                            context = context3;
                            oe.g G72222 = noEthernetFragment2.G();
                            Integer num102222 = new Integer(R.drawable.blue_btn);
                            this.f3775d = noEthernetFragment2;
                            this.f3777f = context;
                            this.f3774c = i15;
                            this.f3776e = 7;
                            i17 = G72222.i(context, num102222, this);
                            if (i17 == aVar5) {
                            }
                            drawable4 = (Drawable) i17;
                            if (drawable4 != null) {
                            }
                            noEthernetFragment3 = noEthernetFragment2;
                            oe.g G82222 = noEthernetFragment3.G();
                            Integer num112222 = new Integer(R.drawable.blue_btn);
                            this.f3775d = noEthernetFragment3;
                            this.f3777f = null;
                            this.f3774c = i15;
                            this.f3776e = 9;
                            i18 = G82222.i(context, num112222, this);
                            if (i18 == aVar5) {
                            }
                            drawable5 = (Drawable) i18;
                            if (drawable5 != null) {
                            }
                            return null;
                        case 7:
                            i15 = this.f3774c;
                            Context context11 = (Context) this.f3777f;
                            noEthernetFragment2 = (NoEthernetFragment) this.f3775d;
                            h8.b.B(obj);
                            context = context11;
                            i17 = obj;
                            drawable4 = (Drawable) i17;
                            if (drawable4 != null) {
                            }
                            noEthernetFragment3 = noEthernetFragment2;
                            oe.g G822222 = noEthernetFragment3.G();
                            Integer num1122222 = new Integer(R.drawable.blue_btn);
                            this.f3775d = noEthernetFragment3;
                            this.f3777f = null;
                            this.f3774c = i15;
                            this.f3776e = 9;
                            i18 = G822222.i(context, num1122222, this);
                            if (i18 == aVar5) {
                            }
                            drawable5 = (Drawable) i18;
                            if (drawable5 != null) {
                            }
                            return null;
                        case 8:
                            i15 = this.f3774c;
                            context4 = (Context) this.f3777f;
                            noEthernetFragment2 = (NoEthernetFragment) this.f3775d;
                            h8.b.B(obj);
                            context = context4;
                            noEthernetFragment3 = noEthernetFragment2;
                            oe.g G8222222 = noEthernetFragment3.G();
                            Integer num11222222 = new Integer(R.drawable.blue_btn);
                            this.f3775d = noEthernetFragment3;
                            this.f3777f = null;
                            this.f3774c = i15;
                            this.f3776e = 9;
                            i18 = G8222222.i(context, num11222222, this);
                            if (i18 == aVar5) {
                            }
                            drawable5 = (Drawable) i18;
                            if (drawable5 != null) {
                            }
                            return null;
                        case 9:
                            i15 = this.f3774c;
                            noEthernetFragment3 = (NoEthernetFragment) this.f3775d;
                            h8.b.B(obj);
                            i18 = obj;
                            drawable5 = (Drawable) i18;
                            if (drawable5 != null) {
                            }
                            return null;
                        case 10:
                            h8.b.B(obj);
                            return Unit.f19194a;
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } catch (Exception unused) {
                    return Unit.f19194a;
                }
            case 5:
                Activity activity = (Activity) obj2;
                int i33 = this.f3776e;
                z zVar = (z) this.f3777f;
                x xVar = zVar.f20027y;
                lf.a aVar6 = lf.a.f20034a;
                int i34 = this.f3774c;
                if (i34 == 0) {
                    h8.b.B(obj);
                    xVar.getClass();
                    String l6 = x.v().l(i33);
                    xVar.getClass();
                    String m6 = x.v().m(i33);
                    Bundle bundle = new Bundle();
                    str = "setErrorCode(...)";
                    bundle.putString("Title", "Google billing error " + m6);
                    StringBuilder sb2 = new StringBuilder();
                    String str6 = (String) this.f3775d;
                    if (str6 != null && str6.length() != 0) {
                        sb2.append(str6);
                        sb2.append("\n");
                    }
                    sb2.append(l6);
                    sb2.append("\n\nTry again or contact tech support");
                    String sb3 = sb2.toString();
                    Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
                    bundle.putString("Text", sb3);
                    sd.b bVar = new sd.b(activity, 1);
                    this.f3774c = 1;
                    d10 = bVar.d(bundle, this);
                    if (d10 == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i34 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    str = "setErrorCode(...)";
                    d10 = obj;
                }
                Pair pair = (Pair) d10;
                if (pair == null) {
                    return Unit.f19194a;
                }
                if (!((Boolean) pair.f19192a).booleanValue()) {
                    return Unit.f19194a;
                }
                Bundle bundle2 = (Bundle) pair.f19193b;
                String string = (bundle2 == null || !bundle2.containsKey("click")) ? null : bundle2.getString("click");
                if (bundle2 != null) {
                    if (!Intrinsics.areEqual(string, "support")) {
                        Context baseContext = activity.getBaseContext();
                        xVar.getClass();
                        new l1.a(22).y(baseContext, true);
                        return Unit.f19194a;
                    }
                }
                da.n nVar3 = new da.n();
                nVar3.c(i33);
                Intrinsics.checkNotNullExpressionValue(nVar3, str);
                zVar.f20011g.h(new i0(new ic.f(nVar3)));
                return Unit.f19194a;
            case 6:
                PayExpressFragment payExpressFragment4 = (PayExpressFragment) obj2;
                lf.a aVar7 = lf.a.f20034a;
                try {
                    switch (this.f3776e) {
                        case 0:
                            h8.b.B(obj);
                            Context context12 = payExpressFragment4.getContext();
                            if (context12 != null) {
                                Integer num12 = new Integer(R.drawable.ic_close_white_24dp);
                                this.f3775d = payExpressFragment4;
                                this.f3777f = context12;
                                this.f3774c = 0;
                                this.f3776e = 1;
                                G = PayExpressFragment.G(payExpressFragment4, context12, num12, this);
                                if (G != aVar7) {
                                    context5 = context12;
                                    i19 = 0;
                                    drawable6 = (Drawable) G;
                                    if (drawable6 != null) {
                                        lg.e eVar13 = m0.f9201a;
                                        fg.e eVar14 = jg.q.f18523a;
                                        h0 h0Var = new h0(payExpressFragment4, drawable6, null, i23);
                                        this.f3775d = payExpressFragment4;
                                        this.f3777f = context5;
                                        this.f3774c = i19;
                                        this.f3776e = 2;
                                        A2 = c0.A(eVar14, h0Var, this);
                                        if (A2 == aVar7) {
                                            return aVar7;
                                        }
                                        int i35 = i19;
                                        payExpressFragment = payExpressFragment4;
                                        i20 = i35;
                                        PayExpressFragment payExpressFragment5 = payExpressFragment;
                                        i19 = i20;
                                        payExpressFragment4 = payExpressFragment5;
                                    }
                                    Integer num13 = new Integer(R.drawable.head_express_image);
                                    this.f3775d = payExpressFragment4;
                                    this.f3777f = context5;
                                    this.f3774c = i19;
                                    this.f3776e = 3;
                                    G2 = PayExpressFragment.G(payExpressFragment4, context5, num13, this);
                                    if (G2 != aVar7) {
                                        int i36 = i19;
                                        payExpressFragment2 = payExpressFragment4;
                                        i21 = i36;
                                        drawable7 = (Drawable) G2;
                                        if (drawable7 != null) {
                                            lg.e eVar15 = m0.f9201a;
                                            fg.e eVar16 = jg.q.f18523a;
                                            h0 h0Var2 = new h0(payExpressFragment2, drawable7, null, 1);
                                            this.f3775d = payExpressFragment2;
                                            this.f3777f = context5;
                                            this.f3774c = i21;
                                            this.f3776e = 4;
                                            A3 = c0.A(eVar16, h0Var2, this);
                                            if (A3 == aVar7) {
                                                return aVar7;
                                            }
                                        }
                                        payExpressFragment3 = payExpressFragment2;
                                        Integer num14 = new Integer(R.drawable.rectangle_89);
                                        this.f3775d = payExpressFragment3;
                                        this.f3777f = null;
                                        this.f3774c = i21;
                                        this.f3776e = 5;
                                        G3 = PayExpressFragment.G(payExpressFragment3, context5, num14, this);
                                        if (G3 == aVar7) {
                                            return aVar7;
                                        }
                                        drawable8 = (Drawable) G3;
                                        if (drawable8 != null) {
                                            lg.e eVar17 = m0.f9201a;
                                            fg.e eVar18 = jg.q.f18523a;
                                            h0 h0Var3 = new h0(payExpressFragment3, drawable8, null, 2);
                                            this.f3775d = null;
                                            this.f3777f = null;
                                            this.f3774c = i21;
                                            this.f3776e = 6;
                                            A4 = c0.A(eVar18, h0Var3, this);
                                            break;
                                        }
                                    } else {
                                        return aVar7;
                                    }
                                } else {
                                    return aVar7;
                                }
                            }
                            return null;
                        case 1:
                            int i37 = this.f3774c;
                            Context context13 = (Context) this.f3777f;
                            PayExpressFragment payExpressFragment6 = (PayExpressFragment) this.f3775d;
                            h8.b.B(obj);
                            context5 = context13;
                            i19 = i37;
                            payExpressFragment4 = payExpressFragment6;
                            G = obj;
                            drawable6 = (Drawable) G;
                            if (drawable6 != null) {
                            }
                            Integer num132 = new Integer(R.drawable.head_express_image);
                            this.f3775d = payExpressFragment4;
                            this.f3777f = context5;
                            this.f3774c = i19;
                            this.f3776e = 3;
                            G2 = PayExpressFragment.G(payExpressFragment4, context5, num132, this);
                            if (G2 != aVar7) {
                            }
                            break;
                        case 2:
                            i20 = this.f3774c;
                            Context context14 = (Context) this.f3777f;
                            payExpressFragment = (PayExpressFragment) this.f3775d;
                            h8.b.B(obj);
                            context5 = context14;
                            A2 = obj;
                            PayExpressFragment payExpressFragment52 = payExpressFragment;
                            i19 = i20;
                            payExpressFragment4 = payExpressFragment52;
                            Integer num1322 = new Integer(R.drawable.head_express_image);
                            this.f3775d = payExpressFragment4;
                            this.f3777f = context5;
                            this.f3774c = i19;
                            this.f3776e = 3;
                            G2 = PayExpressFragment.G(payExpressFragment4, context5, num1322, this);
                            if (G2 != aVar7) {
                            }
                            break;
                        case 3:
                            i21 = this.f3774c;
                            Context context15 = (Context) this.f3777f;
                            payExpressFragment2 = (PayExpressFragment) this.f3775d;
                            h8.b.B(obj);
                            context5 = context15;
                            G2 = obj;
                            drawable7 = (Drawable) G2;
                            if (drawable7 != null) {
                            }
                            payExpressFragment3 = payExpressFragment2;
                            Integer num142 = new Integer(R.drawable.rectangle_89);
                            this.f3775d = payExpressFragment3;
                            this.f3777f = null;
                            this.f3774c = i21;
                            this.f3776e = 5;
                            G3 = PayExpressFragment.G(payExpressFragment3, context5, num142, this);
                            if (G3 == aVar7) {
                            }
                            drawable8 = (Drawable) G3;
                            if (drawable8 != null) {
                            }
                            return null;
                        case 4:
                            i21 = this.f3774c;
                            Context context16 = (Context) this.f3777f;
                            payExpressFragment2 = (PayExpressFragment) this.f3775d;
                            h8.b.B(obj);
                            context5 = context16;
                            A3 = obj;
                            payExpressFragment3 = payExpressFragment2;
                            Integer num1422 = new Integer(R.drawable.rectangle_89);
                            this.f3775d = payExpressFragment3;
                            this.f3777f = null;
                            this.f3774c = i21;
                            this.f3776e = 5;
                            G3 = PayExpressFragment.G(payExpressFragment3, context5, num1422, this);
                            if (G3 == aVar7) {
                            }
                            drawable8 = (Drawable) G3;
                            if (drawable8 != null) {
                            }
                            return null;
                        case 5:
                            i21 = this.f3774c;
                            payExpressFragment3 = (PayExpressFragment) this.f3775d;
                            h8.b.B(obj);
                            G3 = obj;
                            drawable8 = (Drawable) G3;
                            if (drawable8 != null) {
                            }
                            return null;
                        case 6:
                            h8.b.B(obj);
                            A4 = obj;
                            return (Unit) A4;
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } catch (Exception unused2) {
                    return Unit.f19194a;
                }
            case 7:
                Activity activity2 = (Activity) obj2;
                int i38 = this.f3776e;
                f1 f1Var = (f1) this.f3777f;
                lf.a aVar8 = lf.a.f20034a;
                int i39 = this.f3774c;
                if (i39 == 0) {
                    h8.b.B(obj);
                    f1Var.i().getClass();
                    String l10 = d0.b().l(i38);
                    f1Var.i().getClass();
                    String m10 = d0.b().m(i38);
                    Bundle bundle3 = new Bundle();
                    str2 = "setErrorCode(...)";
                    bundle3.putString("Title", "Google billing error " + m10);
                    StringBuilder sb4 = new StringBuilder();
                    String str7 = (String) this.f3775d;
                    if (str7 != null && str7.length() != 0) {
                        sb4.append(str7);
                        sb4.append("\n");
                    }
                    sb4.append(l10);
                    sb4.append("\n\nTry again or contact tech support");
                    String sb5 = sb4.toString();
                    Intrinsics.checkNotNullExpressionValue(sb5, "toString(...)");
                    bundle3.putString("Text", sb5);
                    sd.b bVar2 = new sd.b(activity2, 1);
                    this.f3774c = 1;
                    d11 = bVar2.d(bundle3, this);
                    if (d11 == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i39 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    str2 = "setErrorCode(...)";
                    d11 = obj;
                }
                Pair pair2 = (Pair) d11;
                if (pair2 == null) {
                    return Unit.f19194a;
                }
                if (!((Boolean) pair2.f19192a).booleanValue()) {
                    return Unit.f19194a;
                }
                Bundle bundle4 = (Bundle) pair2.f19193b;
                String string2 = (bundle4 == null || !bundle4.containsKey("click")) ? null : bundle4.getString("click");
                if (bundle4 != null) {
                    if (!Intrinsics.areEqual(string2, "support")) {
                        Context baseContext2 = activity2.getBaseContext();
                        f1Var.i().getClass();
                        new l1.a(22).y(baseContext2, true);
                        return Unit.f19194a;
                    }
                }
                da.n nVar4 = new da.n();
                nVar4.c(i38);
                Intrinsics.checkNotNullExpressionValue(nVar4, str2);
                f1Var.f19767d.h(new i0(new ic.f(nVar4)));
                return Unit.f19194a;
            case 8:
                return c(obj);
            case 9:
                return e(obj);
            case 10:
                return g(obj);
            default:
                Activity activity3 = (Activity) obj2;
                int i40 = this.f3776e;
                se.p pVar = (se.p) this.f3777f;
                wc.i iVar = pVar.A;
                lf.a aVar9 = lf.a.f20034a;
                int i41 = this.f3774c;
                if (i41 == 0) {
                    h8.b.B(obj);
                    iVar.getClass();
                    String l11 = wc.i.a().l(i40);
                    iVar.getClass();
                    String m11 = wc.i.a().m(i40);
                    Bundle bundle5 = new Bundle();
                    str3 = "setErrorCode(...)";
                    bundle5.putString("Title", "Google billing error " + m11);
                    StringBuilder sb6 = new StringBuilder();
                    String str8 = (String) this.f3775d;
                    if (str8 != null && str8.length() != 0) {
                        sb6.append(str8);
                        sb6.append("\n");
                    }
                    sb6.append(l11);
                    sb6.append("\n\nTry again or contact tech support");
                    String sb7 = sb6.toString();
                    Intrinsics.checkNotNullExpressionValue(sb7, "toString(...)");
                    bundle5.putString("Text", sb7);
                    sd.b bVar3 = new sd.b(activity3, 1);
                    this.f3774c = 1;
                    d12 = bVar3.d(bundle5, this);
                    if (d12 == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i41 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    d12 = obj;
                    str3 = "setErrorCode(...)";
                }
                Pair pair3 = (Pair) d12;
                if (pair3 == null) {
                    return Unit.f19194a;
                }
                if (!((Boolean) pair3.f19192a).booleanValue()) {
                    return Unit.f19194a;
                }
                Bundle bundle6 = (Bundle) pair3.f19193b;
                String string3 = (bundle6 == null || !bundle6.containsKey("click")) ? null : bundle6.getString("click");
                if (bundle6 != null) {
                    if (!Intrinsics.areEqual(string3, "support")) {
                        Context baseContext3 = activity3.getBaseContext();
                        iVar.getClass();
                        new l1.a(22).y(baseContext3, true);
                        return Unit.f19194a;
                    }
                }
                da.n nVar5 = new da.n();
                nVar5.c(i40);
                Intrinsics.checkNotNullExpressionValue(nVar5, str3);
                pVar.B.h(new i0(new ic.f(nVar5)));
                return Unit.f19194a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i2.d dVar, String str, int i5, Continuation continuation) {
        super(2, continuation);
        this.f3773b = 10;
        this.f3778g = dVar;
        this.f3775d = str;
        this.f3776e = i5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(String str, rc.b0 b0Var, Object obj, int i5, Continuation continuation, int i10) {
        super(2, continuation);
        this.f3773b = i10;
        this.f3775d = str;
        this.f3777f = b0Var;
        this.f3778g = obj;
        this.f3776e = i5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(kd.d dVar, JSONObject jSONObject, Continuation continuation) {
        super(2, continuation);
        this.f3773b = 3;
        this.f3777f = dVar;
        this.f3778g = jSONObject;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(rd.a aVar, Continuation continuation, int i5) {
        super(2, continuation);
        this.f3773b = i5;
        this.f3778g = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(hg.g[] gVarArr, int i5, AtomicInteger atomicInteger, gg.h hVar, Continuation continuation) {
        super(2, continuation);
        this.f3773b = 2;
        this.f3775d = gVarArr;
        this.f3776e = i5;
        this.f3777f = atomicInteger;
        this.f3778g = hVar;
    }
}
