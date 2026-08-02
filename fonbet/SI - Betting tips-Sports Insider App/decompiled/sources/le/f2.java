package le;

import android.os.Bundle;
import com.sports.insider.MyApp;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f2 extends f1 {
    public eg.t1 A;
    public eg.t1 B;
    public eg.t1 C;
    public eg.t1 D;
    public eg.t1 E;
    public final y1.a F;
    public String G;
    public final androidx.lifecycle.p0 H;
    public final androidx.lifecycle.p0 I;
    public eg.t1 J;
    public final androidx.lifecycle.p0 K;
    public final androidx.lifecycle.p0 L;
    public final androidx.lifecycle.p0 M;
    public final androidx.lifecycle.p0 N;
    public eg.t1 O;

    /* renamed from: g, reason: collision with root package name */
    public String f19770g;

    /* renamed from: i, reason: collision with root package name */
    public boolean f19772i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public final androidx.lifecycle.p0 f19773k;

    /* renamed from: l, reason: collision with root package name */
    public final androidx.lifecycle.p0 f19774l;

    /* renamed from: m, reason: collision with root package name */
    public final androidx.lifecycle.p0 f19775m;

    /* renamed from: n, reason: collision with root package name */
    public String f19776n;

    /* renamed from: o, reason: collision with root package name */
    public String f19777o;

    /* renamed from: p, reason: collision with root package name */
    public nc.f f19778p;
    public String q;

    /* renamed from: r, reason: collision with root package name */
    public String f19779r;

    /* renamed from: s, reason: collision with root package name */
    public nc.f f19780s;

    /* renamed from: t, reason: collision with root package name */
    public ic.a f19781t;

    /* renamed from: u, reason: collision with root package name */
    public ic.a f19782u;

    /* renamed from: v, reason: collision with root package name */
    public ic.a f19783v;

    /* renamed from: w, reason: collision with root package name */
    public ic.a f19784w;

    /* renamed from: x, reason: collision with root package name */
    public eg.t1 f19785x;

    /* renamed from: y, reason: collision with root package name */
    public final androidx.lifecycle.p0 f19786y;

    /* renamed from: z, reason: collision with root package name */
    public final androidx.lifecycle.p0 f19787z;

    /* renamed from: f, reason: collision with root package name */
    public final wc.j0 f19769f = new wc.j0();

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f19771h = new AtomicBoolean(false);

    public f2() {
        androidx.lifecycle.p0 p0Var = new androidx.lifecycle.p0(Boolean.FALSE);
        this.f19773k = p0Var;
        this.f19774l = p0Var;
        this.f19775m = new androidx.lifecycle.p0(null);
        androidx.lifecycle.p0 p0Var2 = new androidx.lifecycle.p0(null);
        this.f19786y = p0Var2;
        this.f19787z = p0Var2;
        y1.a b10 = com.google.android.play.core.appupdate.b.b();
        Intrinsics.checkNotNullExpressionValue(b10, "actionGlobalAllPredictionsFragment(...)");
        this.F = b10;
        androidx.lifecycle.p0 p0Var3 = new androidx.lifecycle.p0(null);
        this.H = p0Var3;
        this.I = p0Var3;
        androidx.lifecycle.p0 p0Var4 = new androidx.lifecycle.p0(null);
        this.K = p0Var4;
        this.L = p0Var4;
        this.M = new androidx.lifecycle.p0(null);
        this.N = new androidx.lifecycle.p0(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00f4, code lost:
    
        if (r10.v(r2, r11, r0) != r1) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object o(f2 f2Var, List list, mf.c cVar) {
        v1 v1Var;
        int i5;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        ic.a aVar;
        ic.a aVar2;
        if (cVar instanceof v1) {
            v1Var = (v1) cVar;
            int i10 = v1Var.f19977e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                v1Var.f19977e = i10 - Integer.MIN_VALUE;
                Object obj5 = v1Var.f19975c;
                Object obj6 = lf.a.f20034a;
                i5 = v1Var.f19977e;
                if (i5 != 0) {
                    h8.b.B(obj5);
                    if (list == null) {
                        return Unit.f19194a;
                    }
                    if (list.isEmpty()) {
                        return Unit.f19194a;
                    }
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        ic.a aVar3 = (ic.a) obj;
                        if (Intrinsics.areEqual(aVar3 != null ? aVar3.f11062i : null, f2Var.f19776n)) {
                            break;
                        }
                    }
                    ic.a aVar4 = (ic.a) obj;
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it2.next();
                        ic.a aVar5 = (ic.a) obj2;
                        if (Intrinsics.areEqual(aVar5 != null ? aVar5.f11062i : null, f2Var.f19777o)) {
                            break;
                        }
                    }
                    ic.a aVar6 = (ic.a) obj2;
                    Iterator it3 = list.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            obj3 = null;
                            break;
                        }
                        obj3 = it3.next();
                        ic.a aVar7 = (ic.a) obj3;
                        if (Intrinsics.areEqual(aVar7 != null ? aVar7.f11062i : null, f2Var.q)) {
                            break;
                        }
                    }
                    ic.a aVar8 = (ic.a) obj3;
                    Iterator it4 = list.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            obj4 = null;
                            break;
                        }
                        obj4 = it4.next();
                        ic.a aVar9 = (ic.a) obj4;
                        if (Intrinsics.areEqual(aVar9 != null ? aVar9.f11062i : null, f2Var.f19779r)) {
                            break;
                        }
                    }
                    aVar = (ic.a) obj4;
                    v1Var.f19973a = aVar8;
                    v1Var.f19974b = aVar;
                    v1Var.f19977e = 1;
                    if (f2Var.t(aVar4, aVar6, v1Var) != obj6) {
                        aVar2 = aVar8;
                    }
                    return obj6;
                }
                if (i5 != 1) {
                    if (i5 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj5);
                    return Unit.f19194a;
                }
                aVar = v1Var.f19974b;
                aVar2 = v1Var.f19973a;
                h8.b.B(obj5);
                v1Var.f19973a = null;
                v1Var.f19974b = null;
                v1Var.f19977e = 2;
            }
        }
        v1Var = new v1(f2Var, cVar);
        Object obj52 = v1Var.f19975c;
        Object obj62 = lf.a.f20034a;
        i5 = v1Var.f19977e;
        if (i5 != 0) {
        }
        v1Var.f19973a = null;
        v1Var.f19974b = null;
        v1Var.f19977e = 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object p(f2 f2Var, mf.c cVar) {
        x1 x1Var;
        Object obj;
        lf.a aVar;
        int i5;
        f2 f2Var2;
        nc.f fVar;
        f2 f2Var3;
        nc.f fVar2;
        wc.j0 j0Var = f2Var.f19769f;
        if (cVar instanceof x1) {
            x1Var = (x1) cVar;
            int i10 = x1Var.f19997d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                x1Var.f19997d = i10 - Integer.MIN_VALUE;
                obj = x1Var.f19995b;
                aVar = lf.a.f20034a;
                i5 = x1Var.f19997d;
                nc.f fVar3 = null;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                if (i5 != 0) {
                    h8.b.B(obj);
                    x1Var.f19994a = f2Var;
                    x1Var.f19997d = 1;
                    s7.u uVar = j0Var.f25076c;
                    s7.u.g().getClass();
                    y8.d dVar = new y8.d();
                    lg.e eVar = eg.m0.f9201a;
                    obj = eg.c0.A(lg.d.f20063c, new eb.o(dVar, objArr == true ? 1 : 0, 5), x1Var);
                    if (obj != aVar) {
                        f2Var2 = f2Var;
                    }
                    return aVar;
                }
                if (i5 != 1) {
                    if (i5 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f2Var3 = x1Var.f19994a;
                    h8.b.B(obj);
                    fVar2 = (nc.f) obj;
                    if (fVar2 != null) {
                        f2Var.q = fVar2.productId();
                        f2Var.f19779r = fVar2.productIdStrike();
                        fVar3 = fVar2;
                    }
                    f2Var3.f19780s = fVar3;
                    return Unit.f19194a;
                }
                f2Var2 = x1Var.f19994a;
                h8.b.B(obj);
                fVar = (nc.f) obj;
                if (fVar == null) {
                    f2Var.f19776n = fVar.productId();
                    f2Var.f19777o = fVar.productIdStrike();
                } else {
                    fVar = null;
                }
                f2Var2.f19778p = fVar;
                x1Var.f19994a = f2Var;
                x1Var.f19997d = 2;
                s7.u uVar2 = j0Var.f25076c;
                s7.u.g().getClass();
                y8.d dVar2 = new y8.d();
                lg.e eVar2 = eg.m0.f9201a;
                obj = eg.c0.A(lg.d.f20063c, new eb.o(dVar2, objArr2 == true ? 1 : 0, 6), x1Var);
                if (obj != aVar) {
                    f2Var3 = f2Var;
                    fVar2 = (nc.f) obj;
                    if (fVar2 != null) {
                    }
                    f2Var3.f19780s = fVar3;
                    return Unit.f19194a;
                }
                return aVar;
            }
        }
        x1Var = new x1(f2Var, cVar);
        obj = x1Var.f19995b;
        aVar = lf.a.f20034a;
        i5 = x1Var.f19997d;
        nc.f fVar32 = null;
        Object[] objArr3 = 0;
        Object[] objArr22 = 0;
        if (i5 != 0) {
        }
        fVar = (nc.f) obj;
        if (fVar == null) {
        }
        f2Var2.f19778p = fVar;
        x1Var.f19994a = f2Var;
        x1Var.f19997d = 2;
        s7.u uVar22 = j0Var.f25076c;
        s7.u.g().getClass();
        y8.d dVar22 = new y8.d();
        lg.e eVar22 = eg.m0.f9201a;
        obj = eg.c0.A(lg.d.f20063c, new eb.o(dVar22, objArr22 == true ? 1 : 0, 6), x1Var);
        if (obj != aVar) {
        }
        return aVar;
    }

    public static final void q(f2 f2Var, String str) {
        if (str == null) {
            return;
        }
        u1.a i5 = androidx.lifecycle.d1.i(f2Var);
        lg.e eVar = eg.m0.f9201a;
        eg.c0.t(i5, jg.q.f18523a, null, new kd.e(f2Var, str, (Continuation) null, 19), 2);
    }

    public static final ic.a r(f2 f2Var, String str) {
        ic.a aVar = Intrinsics.areEqual(str, f2Var.f19776n) ? f2Var.f19781t : Intrinsics.areEqual(str, f2Var.f19777o) ? f2Var.f19782u : Intrinsics.areEqual(str, f2Var.q) ? f2Var.f19783v : Intrinsics.areEqual(str, f2Var.f19779r) ? f2Var.f19784w : null;
        if (aVar == null && str != null) {
            f2Var.f19769f.f(0L);
        }
        return aVar;
    }

    public static final void s(f2 f2Var, int i5) {
        if (i5 <= 0) {
            f2Var.n();
        }
        u1.a i10 = androidx.lifecycle.d1.i(f2Var);
        lg.e eVar = eg.m0.f9201a;
        eg.c0.t(i10, jg.q.f18523a, null, new y1(i5, f2Var, (Continuation) null), 2);
    }

    public static final String u(Long l6) {
        return l6 != null ? io.sentry.config.a.B((l6.longValue() * 1000) - System.currentTimeMillis()) : "";
    }

    @Override // le.f1, androidx.lifecycle.k1
    public final void d() {
        eg.t1 t1Var = this.O;
        if (t1Var != null) {
            t1Var.k(null);
        }
        this.O = null;
        eg.t1 t1Var2 = this.J;
        if (t1Var2 != null) {
            t1Var2.k(null);
        }
        this.J = null;
        eg.t1 t1Var3 = this.E;
        if (t1Var3 != null) {
            t1Var3.k(null);
        }
        eg.t1 t1Var4 = this.D;
        if (t1Var4 != null) {
            t1Var4.k(null);
        }
        this.E = null;
        this.D = null;
        eg.t1 t1Var5 = this.B;
        if (t1Var5 != null) {
            t1Var5.k(null);
        }
        this.B = null;
        eg.t1 t1Var6 = this.C;
        if (t1Var6 != null) {
            t1Var6.k(null);
        }
        this.C = null;
        eg.t1 t1Var7 = this.A;
        if (t1Var7 != null) {
            t1Var7.k(null);
        }
        this.A = null;
        eg.t1 t1Var8 = this.f19785x;
        if (t1Var8 != null) {
            t1Var8.k(null);
        }
        this.f19785x = null;
        this.f19776n = null;
        this.f19777o = null;
        this.q = null;
        this.f19779r = null;
        l();
    }

    @Override // le.f1
    public final Bundle g() {
        String l6;
        ic.a aVar = this.f19783v;
        String str = aVar != null ? aVar.f11064l : null;
        Intrinsics.checkNotNullParameter("Text", "txtKey");
        Intrinsics.checkNotNullParameter("cancelSubs", "cancelKey");
        Bundle bundle = new Bundle();
        String str2 = gc.d.f9945a;
        String c2 = d2.i.c();
        String j = com.google.android.play.core.appupdate.b.j(c2);
        if (str == null) {
            str = "$";
        }
        int hashCode = c2.hashCode();
        if (hashCode == 3201) {
            if (c2.equals("de")) {
                l6 = d9.e.l(r4.k.q("• Das Abonnement wird nach der Bestätigung dieses Abonnements wirksam.\n• Die Kosten des Abonnements betragen ", str, ".\n• Nach der Bestätigung erhält der Benutzer Zugriff auf alle Premium-Vorhersagen, die nach der Bestätigung veröffentlicht werden.\n• Das Abonnement kann jederzeit und auch vor Ablauf des kostenlosen Zeitraums gekündigt werden. Der Benutzer kann seine Abonnements in seinem Google Play-Konto im Abschnitt „Abonnements“ verwalten (", j, ").\n• Die Abonnementgebühr wird alle 7 Tage automatisch vom Konto des Benutzers abgebucht, sofern der Benutzer nicht kündigt ("), j, ").");
            }
            l6 = d9.e.k(r4.k.q("• Subscription is effective upon confirmation of this subscription\n• The cost of a subscription is ", str, "\n• Once the subscription is confirmed, the user will have access to all premium-forecasts that will be published after the subscription is confirmed\n• Subscription can be cancelled at any time and before the free period expires. You can manage your subscriptions in your personal Google Play account in the \"Subscriptions\" section (", j, ").\n• Subscription fees will be automatically deducted from the user's account every 7 days unless the user cancels ("), j, ')');
        } else if (hashCode == 3246) {
            if (c2.equals("es")) {
                l6 = d9.e.l(r4.k.q("• La suscripción entra en vigor tras la confirmación de esta suscripción.\n• El costo de la suscripción es de ", str, ".\n• Una vez confirmada, el usuario tendrá acceso a todas las predicciones premium que se publiquen después de la confirmación.\n• La suscripción puede cancelarse en cualquier momento, incluso antes de que finalice el período gratuito. El usuario puede gestionar sus suscripciones en su cuenta personal de Google Play, en la sección \"Suscripciones\" (", j, ").\n• El pago de la suscripción se cargará automáticamente a la cuenta del usuario cada 7 días, a menos que el usuario la cancele ("), j, ").");
            }
            l6 = d9.e.k(r4.k.q("• Subscription is effective upon confirmation of this subscription\n• The cost of a subscription is ", str, "\n• Once the subscription is confirmed, the user will have access to all premium-forecasts that will be published after the subscription is confirmed\n• Subscription can be cancelled at any time and before the free period expires. You can manage your subscriptions in your personal Google Play account in the \"Subscriptions\" section (", j, ").\n• Subscription fees will be automatically deducted from the user's account every 7 days unless the user cancels ("), j, ')');
        } else if (hashCode == 3276) {
            if (c2.equals("fr")) {
                l6 = d9.e.l(r4.k.q("• L’abonnement prend effet après la confirmation de celui-ci.\n• Le coût de l’abonnement est de ", str, ".\n• Une fois l’abonnement confirmé, l’utilisateur aura accès à toutes les prévisions premium publiées après sa confirmation.\n• L’abonnement peut être annulé à tout moment, y compris avant la fin de la période d’essai gratuite. L’utilisateur peut gérer ses abonnements dans son compte personnel Google Play, section « Abonnements » (", j, ").\n• Les frais d’abonnement seront automatiquement prélevés sur le compte de l’utilisateur tous les 7 jours, sauf s’il annule l’abonnement ("), j, ").");
            }
            l6 = d9.e.k(r4.k.q("• Subscription is effective upon confirmation of this subscription\n• The cost of a subscription is ", str, "\n• Once the subscription is confirmed, the user will have access to all premium-forecasts that will be published after the subscription is confirmed\n• Subscription can be cancelled at any time and before the free period expires. You can manage your subscriptions in your personal Google Play account in the \"Subscriptions\" section (", j, ").\n• Subscription fees will be automatically deducted from the user's account every 7 days unless the user cancels ("), j, ')');
        } else if (hashCode == 3588) {
            if (c2.equals("pt")) {
                l6 = d9.e.l(r4.k.q("• A subscrição entra em vigor após a confirmação desta subscrição.\n• O custo da subscrição é de ", str, ".\n• Após a confirmação, o utilizador terá acesso a todas as previsões premium que forem publicadas depois da confirmação.\n• A subscrição pode ser cancelada a qualquer momento, mesmo antes do final do período gratuito. O utilizador pode gerir as suas subscrições na sua conta pessoal do Google Play, na secção \"Subscrições\" (", j, ").\n• O pagamento da subscrição será automaticamente debitado da conta do utilizador a cada 7 dias, a menos que o utilizador a cancele ("), j, ").");
            }
            l6 = d9.e.k(r4.k.q("• Subscription is effective upon confirmation of this subscription\n• The cost of a subscription is ", str, "\n• Once the subscription is confirmed, the user will have access to all premium-forecasts that will be published after the subscription is confirmed\n• Subscription can be cancelled at any time and before the free period expires. You can manage your subscriptions in your personal Google Play account in the \"Subscriptions\" section (", j, ").\n• Subscription fees will be automatically deducted from the user's account every 7 days unless the user cancels ("), j, ')');
        } else if (hashCode != 3651) {
            if (hashCode == 3710 && c2.equals("tr")) {
                l6 = d9.e.l(r4.k.q("• Abonelik, bu aboneliğin onaylanmasından sonra yürürlüğe girer.\n• Abonelik ücreti ", str, "'dir.\n• Abonelik onaylandıktan sonra, kullanıcı onaydan sonra yayınlanacak tüm premium tahminlere erişebilecektir.\n• Abonelik, ücretsiz dönem bitmeden önce veya herhangi bir zamanda iptal edilebilir. Kullanıcı, Google Play hesabındaki \"Abonelikler\" bölümünden aboneliklerini yönetebilir (", j, ").\n• Abonelik ücreti, kullanıcı iptal etmediği sürece her 7 günde bir otomatik olarak hesaptan tahsil edilir ("), j, ").");
            }
            l6 = d9.e.k(r4.k.q("• Subscription is effective upon confirmation of this subscription\n• The cost of a subscription is ", str, "\n• Once the subscription is confirmed, the user will have access to all premium-forecasts that will be published after the subscription is confirmed\n• Subscription can be cancelled at any time and before the free period expires. You can manage your subscriptions in your personal Google Play account in the \"Subscriptions\" section (", j, ").\n• Subscription fees will be automatically deducted from the user's account every 7 days unless the user cancels ("), j, ')');
        } else {
            if (c2.equals("ru")) {
                l6 = d9.e.k(r4.k.q("• Подписка вступает в силу после подтверждения оформления данной подписки\n• Стоимость подписки составляет ", str, "\n• После подтверждения подписки пользователю будут доступны все премиум-прогнозы, которые будут опубликованы после ее подтверждения\n• Подписку можно отменить в любое время, а также до истечения бесплатного периода. Управлять подписками пользователь может в личном аккаунте Google Play в разделе “Подписки” (", j, ")\n• Оплата по подписке будет автоматически списываться со счета пользователя в каждые 7 дней, если пользователь ее не отменит ("), j, ')');
            }
            l6 = d9.e.k(r4.k.q("• Subscription is effective upon confirmation of this subscription\n• The cost of a subscription is ", str, "\n• Once the subscription is confirmed, the user will have access to all premium-forecasts that will be published after the subscription is confirmed\n• Subscription can be cancelled at any time and before the free period expires. You can manage your subscriptions in your personal Google Play account in the \"Subscriptions\" section (", j, ").\n• Subscription fees will be automatically deducted from the user's account every 7 days unless the user cancels ("), j, ')');
        }
        bundle.putString("Text", l6);
        bundle.putString("cancelSubs", j);
        return bundle;
    }

    @Override // le.f1
    public final y1.a h() {
        return this.F;
    }

    @Override // le.f1
    public final wc.d0 i() {
        return this.f19769f;
    }

    @Override // le.f1
    public final void k() {
        super.k();
        u1.a i5 = androidx.lifecycle.d1.i(this);
        lg.e eVar = eg.m0.f9201a;
        Continuation continuation = null;
        int i10 = 7;
        int i11 = 2;
        eg.c0.t(i5, jg.q.f18523a, null, new c4.u(this, continuation, i10), 2);
        eg.t1 t1Var = this.O;
        if (t1Var != null) {
            t1Var.k(null);
        }
        this.O = null;
        eg.t1 t1Var2 = this.J;
        if (t1Var2 != null) {
            t1Var2.k(null);
        }
        this.J = null;
        u1.a i12 = androidx.lifecycle.d1.i(this);
        lg.d dVar = lg.d.f20063c;
        eg.c0.t(i12, dVar, null, new a2(this, continuation, i11), 2);
        eg.c0.t(androidx.lifecycle.d1.i(this), dVar, null, new a2(this, continuation, 3), 2);
        jg.d dVar2 = MyApp.f6830c;
        this.f19785x = eg.c0.t(dVar2, dVar, null, new y1(this, continuation, 6), 2);
        this.E = eg.c0.t(dVar2, dVar, null, new y1(this, continuation, i10), 2);
        this.D = eg.c0.t(dVar2, dVar, null, new y1(this, continuation, 8), 2);
        eg.c0.t(androidx.lifecycle.d1.i(this), dVar, null, new a2(this, continuation, 1), 2);
        eg.c0.t(androidx.lifecycle.d1.i(this), dVar, null, new a2(this, continuation, 0), 2);
        wc.d0.i(this.f19769f);
        eg.c0.t(androidx.lifecycle.d1.i(this), null, null, new y1(this, continuation, 10), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007d, code lost:
    
        if (eg.c0.A(r12, r4, r0) != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(ic.a aVar, ic.a aVar2, mf.c cVar) {
        t1 t1Var;
        int i5;
        ic.a aVar3;
        ic.a aVar4;
        if (cVar instanceof t1) {
            t1Var = (t1) cVar;
            int i10 = t1Var.f19953e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                t1Var.f19953e = i10 - Integer.MIN_VALUE;
                Object obj = t1Var.f19951c;
                lf.a aVar5 = lf.a.f20034a;
                i5 = t1Var.f19953e;
                if (i5 != 0) {
                    h8.b.B(obj);
                    if (aVar == null) {
                        return Unit.f19194a;
                    }
                    t1Var.f19949a = aVar;
                    t1Var.f19950b = aVar2;
                    t1Var.f19953e = 1;
                    wc.j0 j0Var = this.f19769f;
                    j0Var.getClass();
                    aVar3 = aVar;
                    obj = eg.c0.A(eg.m0.f9201a, new hd.e(j0Var, aVar3, false, aVar2, null, 2), t1Var);
                    if (obj != aVar5) {
                        aVar4 = aVar2;
                    }
                    return aVar5;
                }
                if (i5 != 1) {
                    if (i5 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return Unit.f19194a;
                }
                ic.a aVar6 = t1Var.f19950b;
                ic.a aVar7 = t1Var.f19949a;
                h8.b.B(obj);
                aVar3 = aVar7;
                aVar4 = aVar6;
                lg.e eVar = eg.m0.f9201a;
                fg.e eVar2 = jg.q.f18523a;
                u1 u1Var = new u1(this, aVar3, aVar4, (Pair) obj, null, 0);
                t1Var.f19949a = null;
                t1Var.f19950b = null;
                t1Var.f19953e = 2;
            }
        }
        t1Var = new t1(this, cVar);
        Object obj2 = t1Var.f19951c;
        lf.a aVar52 = lf.a.f20034a;
        i5 = t1Var.f19953e;
        if (i5 != 0) {
        }
        lg.e eVar3 = eg.m0.f9201a;
        fg.e eVar22 = jg.q.f18523a;
        u1 u1Var2 = new u1(this, aVar3, aVar4, (Pair) obj2, null, 0);
        t1Var.f19949a = null;
        t1Var.f19950b = null;
        t1Var.f19953e = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007c, code lost:
    
        if (eg.c0.A(r12, r4, r0) != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(ic.a aVar, ic.a aVar2, mf.c cVar) {
        w1 w1Var;
        int i5;
        ic.a aVar3;
        ic.a aVar4;
        if (cVar instanceof w1) {
            w1Var = (w1) cVar;
            int i10 = w1Var.f19989e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                w1Var.f19989e = i10 - Integer.MIN_VALUE;
                Object obj = w1Var.f19987c;
                lf.a aVar5 = lf.a.f20034a;
                i5 = w1Var.f19989e;
                boolean z5 = true;
                if (i5 != 0) {
                    h8.b.B(obj);
                    if (aVar == null) {
                        return Unit.f19194a;
                    }
                    w1Var.f19985a = aVar;
                    w1Var.f19986b = aVar2;
                    w1Var.f19989e = 1;
                    wc.j0 j0Var = this.f19769f;
                    j0Var.getClass();
                    aVar3 = aVar;
                    obj = eg.c0.A(eg.m0.f9201a, new hd.e(j0Var, aVar3, z5, aVar2, null, 2), w1Var);
                    if (obj != aVar5) {
                        aVar4 = aVar2;
                    }
                    return aVar5;
                }
                if (i5 != 1) {
                    if (i5 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return Unit.f19194a;
                }
                ic.a aVar6 = w1Var.f19986b;
                ic.a aVar7 = w1Var.f19985a;
                h8.b.B(obj);
                aVar3 = aVar7;
                aVar4 = aVar6;
                lg.e eVar = eg.m0.f9201a;
                fg.e eVar2 = jg.q.f18523a;
                u1 u1Var = new u1(this, aVar3, aVar4, (Pair) obj, null, 1);
                w1Var.f19985a = null;
                w1Var.f19986b = null;
                w1Var.f19989e = 2;
            }
        }
        w1Var = new w1(this, cVar);
        Object obj2 = w1Var.f19987c;
        lf.a aVar52 = lf.a.f20034a;
        i5 = w1Var.f19989e;
        boolean z52 = true;
        if (i5 != 0) {
        }
        lg.e eVar3 = eg.m0.f9201a;
        fg.e eVar22 = jg.q.f18523a;
        u1 u1Var2 = new u1(this, aVar3, aVar4, (Pair) obj2, null, 1);
        w1Var.f19985a = null;
        w1Var.f19986b = null;
        w1Var.f19989e = 2;
    }

    public final void w(androidx.fragment.app.p0 p0Var) {
        String str;
        this.f19769f.getClass();
        if (da.r.c() || da.r.f() || this.j <= 0 || (str = this.f19776n) == null) {
            return;
        }
        eg.c0.t(androidx.lifecycle.d1.i(this), null, null, new c4.u(this, str, p0Var, null, 6), 3);
    }

    public final void x(androidx.fragment.app.p0 p0Var) {
        wc.j0 j0Var = this.f19769f;
        j0Var.getClass();
        if (da.r.c() || da.r.f()) {
            return;
        }
        i().getClass();
        Continuation continuation = null;
        if (((Boolean) wc.d0.b().f21708h.getValue()).booleanValue()) {
            jg.d dVar = MyApp.f6830c;
            lg.e eVar = eg.m0.f9201a;
            eg.c0.t(dVar, lg.d.f20063c, null, new wc.w(j0Var, continuation, 4), 2);
        }
        if (((Boolean) wc.d0.b().f21709i.getValue()).booleanValue()) {
            jg.d dVar2 = MyApp.f6830c;
            lg.e eVar2 = eg.m0.f9201a;
            eg.c0.t(dVar2, lg.d.f20063c, null, new wc.w(j0Var, continuation, 6), 2);
        } else {
            String str = this.q;
            if (str != null) {
                eg.c0.t(androidx.lifecycle.d1.i(this), null, null, new androidx.lifecycle.u0(this, str, p0Var, continuation, 7), 3);
            }
        }
    }
}
