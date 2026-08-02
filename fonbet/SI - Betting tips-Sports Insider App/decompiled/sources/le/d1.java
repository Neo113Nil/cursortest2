package le;

import android.os.Bundle;
import com.sports.insider.MyApp;
import com.sports.insider.R;
import io.sentry.d4;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d1 extends f1 {
    public eg.t1 A;
    public eg.t1 B;
    public eg.t1 C;
    public eg.t1 D;
    public final y1.a E;
    public String F;
    public final androidx.lifecycle.p0 G;
    public final androidx.lifecycle.p0 H;
    public eg.t1 I;
    public final androidx.lifecycle.p0 J;
    public final androidx.lifecycle.p0 K;
    public final androidx.lifecycle.p0 L;
    public final androidx.lifecycle.p0 M;
    public eg.t1 N;

    /* renamed from: g, reason: collision with root package name */
    public String f19731g;

    /* renamed from: i, reason: collision with root package name */
    public boolean f19733i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public final androidx.lifecycle.p0 f19734k;

    /* renamed from: l, reason: collision with root package name */
    public final androidx.lifecycle.p0 f19735l;

    /* renamed from: m, reason: collision with root package name */
    public String f19736m;

    /* renamed from: n, reason: collision with root package name */
    public String f19737n;

    /* renamed from: o, reason: collision with root package name */
    public nc.f f19738o;

    /* renamed from: p, reason: collision with root package name */
    public String f19739p;
    public String q;

    /* renamed from: r, reason: collision with root package name */
    public nc.f f19740r;

    /* renamed from: s, reason: collision with root package name */
    public ic.a f19741s;

    /* renamed from: t, reason: collision with root package name */
    public ic.a f19742t;

    /* renamed from: u, reason: collision with root package name */
    public ic.a f19743u;

    /* renamed from: v, reason: collision with root package name */
    public ic.a f19744v;

    /* renamed from: w, reason: collision with root package name */
    public eg.t1 f19745w;

    /* renamed from: x, reason: collision with root package name */
    public final androidx.lifecycle.p0 f19746x;

    /* renamed from: y, reason: collision with root package name */
    public final androidx.lifecycle.p0 f19747y;

    /* renamed from: z, reason: collision with root package name */
    public eg.t1 f19748z;

    /* renamed from: f, reason: collision with root package name */
    public final wc.v f19730f = new wc.v();

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f19732h = new AtomicBoolean(false);

    public d1() {
        androidx.lifecycle.p0 p0Var = new androidx.lifecycle.p0(Boolean.FALSE);
        this.f19734k = p0Var;
        this.f19735l = p0Var;
        androidx.lifecycle.p0 p0Var2 = new androidx.lifecycle.p0(null);
        this.f19746x = p0Var2;
        this.f19747y = p0Var2;
        y1.a b10 = com.google.android.play.core.appupdate.b.b();
        Intrinsics.checkNotNullExpressionValue(b10, "actionGlobalAllPredictionsFragment(...)");
        this.E = b10;
        androidx.lifecycle.p0 p0Var3 = new androidx.lifecycle.p0(null);
        this.G = p0Var3;
        this.H = p0Var3;
        androidx.lifecycle.p0 p0Var4 = new androidx.lifecycle.p0(null);
        this.J = p0Var4;
        this.K = p0Var4;
        this.L = new androidx.lifecycle.p0(null);
        this.M = new androidx.lifecycle.p0(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00f4, code lost:
    
        if (r10.v(r2, r11, r0) != r1) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object o(d1 d1Var, List list, mf.c cVar) {
        s0 s0Var;
        int i5;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        ic.a aVar;
        ic.a aVar2;
        if (cVar instanceof s0) {
            s0Var = (s0) cVar;
            int i10 = s0Var.f19938e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                s0Var.f19938e = i10 - Integer.MIN_VALUE;
                Object obj5 = s0Var.f19936c;
                Object obj6 = lf.a.f20034a;
                i5 = s0Var.f19938e;
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
                        if (Intrinsics.areEqual(aVar3 != null ? aVar3.f11062i : null, d1Var.f19736m)) {
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
                        if (Intrinsics.areEqual(aVar5 != null ? aVar5.f11062i : null, d1Var.f19737n)) {
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
                        if (Intrinsics.areEqual(aVar7 != null ? aVar7.f11062i : null, d1Var.f19739p)) {
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
                        if (Intrinsics.areEqual(aVar9 != null ? aVar9.f11062i : null, d1Var.q)) {
                            break;
                        }
                    }
                    aVar = (ic.a) obj4;
                    s0Var.f19934a = aVar8;
                    s0Var.f19935b = aVar;
                    s0Var.f19938e = 1;
                    if (d1Var.t(aVar4, aVar6, s0Var) != obj6) {
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
                aVar = s0Var.f19935b;
                aVar2 = s0Var.f19934a;
                h8.b.B(obj5);
                s0Var.f19934a = null;
                s0Var.f19935b = null;
                s0Var.f19938e = 2;
            }
        }
        s0Var = new s0(d1Var, cVar);
        Object obj52 = s0Var.f19936c;
        Object obj62 = lf.a.f20034a;
        i5 = s0Var.f19938e;
        if (i5 != 0) {
        }
        s0Var.f19934a = null;
        s0Var.f19935b = null;
        s0Var.f19938e = 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object p(d1 d1Var, mf.c cVar) {
        u0 u0Var;
        Object obj;
        lf.a aVar;
        int i5;
        d1 d1Var2;
        nc.f fVar;
        d1 d1Var3;
        nc.f fVar2;
        wc.v vVar = d1Var.f19730f;
        if (cVar instanceof u0) {
            u0Var = (u0) cVar;
            int i10 = u0Var.f19960d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                u0Var.f19960d = i10 - Integer.MIN_VALUE;
                obj = u0Var.f19958b;
                aVar = lf.a.f20034a;
                i5 = u0Var.f19960d;
                int i11 = 2;
                int i12 = 1;
                nc.f fVar3 = null;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                if (i5 != 0) {
                    h8.b.B(obj);
                    u0Var.f19957a = d1Var;
                    u0Var.f19960d = 1;
                    s7.u uVar = vVar.f25076c;
                    s7.u.g().getClass();
                    y8.d dVar = new y8.d();
                    lg.e eVar = eg.m0.f9201a;
                    obj = eg.c0.A(lg.d.f20063c, new eb.o(dVar, objArr == true ? 1 : 0, i12), u0Var);
                    if (obj != aVar) {
                        d1Var2 = d1Var;
                    }
                    return aVar;
                }
                if (i5 != 1) {
                    if (i5 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d1Var3 = u0Var.f19957a;
                    h8.b.B(obj);
                    fVar2 = (nc.f) obj;
                    if (fVar2 != null) {
                        d1Var.f19739p = fVar2.productId();
                        d1Var.q = fVar2.productIdStrike();
                        fVar3 = fVar2;
                    }
                    d1Var3.f19740r = fVar3;
                    return Unit.f19194a;
                }
                d1Var2 = u0Var.f19957a;
                h8.b.B(obj);
                fVar = (nc.f) obj;
                if (fVar == null) {
                    d1Var.f19736m = fVar.productId();
                    d1Var.f19737n = fVar.productIdStrike();
                } else {
                    fVar = null;
                }
                d1Var2.f19738o = fVar;
                u0Var.f19957a = d1Var;
                u0Var.f19960d = 2;
                s7.u uVar2 = vVar.f25076c;
                s7.u.g().getClass();
                y8.d dVar2 = new y8.d();
                lg.e eVar2 = eg.m0.f9201a;
                obj = eg.c0.A(lg.d.f20063c, new eb.o(dVar2, objArr2 == true ? 1 : 0, i11), u0Var);
                if (obj != aVar) {
                    d1Var3 = d1Var;
                    fVar2 = (nc.f) obj;
                    if (fVar2 != null) {
                    }
                    d1Var3.f19740r = fVar3;
                    return Unit.f19194a;
                }
                return aVar;
            }
        }
        u0Var = new u0(d1Var, cVar);
        obj = u0Var.f19958b;
        aVar = lf.a.f20034a;
        i5 = u0Var.f19960d;
        int i112 = 2;
        int i122 = 1;
        nc.f fVar32 = null;
        Object[] objArr3 = 0;
        Object[] objArr22 = 0;
        if (i5 != 0) {
        }
        fVar = (nc.f) obj;
        if (fVar == null) {
        }
        d1Var2.f19738o = fVar;
        u0Var.f19957a = d1Var;
        u0Var.f19960d = 2;
        s7.u uVar22 = vVar.f25076c;
        s7.u.g().getClass();
        y8.d dVar22 = new y8.d();
        lg.e eVar22 = eg.m0.f9201a;
        obj = eg.c0.A(lg.d.f20063c, new eb.o(dVar22, objArr22 == true ? 1 : 0, i112), u0Var);
        if (obj != aVar) {
        }
        return aVar;
    }

    public static final void q(d1 d1Var, String str) {
        if (str == null) {
            return;
        }
        eg.c0.t(androidx.lifecycle.d1.i(d1Var), null, null, new kd.e(d1Var, str, (Continuation) null, 15), 3);
    }

    public static final ic.a r(d1 d1Var, String str) {
        ic.a aVar = Intrinsics.areEqual(str, d1Var.f19736m) ? d1Var.f19741s : Intrinsics.areEqual(str, d1Var.f19737n) ? d1Var.f19742t : Intrinsics.areEqual(str, d1Var.f19739p) ? d1Var.f19743u : Intrinsics.areEqual(str, d1Var.q) ? d1Var.f19744v : null;
        if (aVar == null && str != null) {
            d1Var.f19730f.f(0L);
        }
        return aVar;
    }

    public static final void s(d1 d1Var, int i5) {
        if (i5 <= 0) {
            d1Var.n();
        }
        u1.a i10 = androidx.lifecycle.d1.i(d1Var);
        lg.e eVar = eg.m0.f9201a;
        eg.c0.t(i10, jg.q.f18523a, null, new v0(i5, d1Var, (Continuation) null), 2);
    }

    public static final String u(Long l6) {
        return l6 != null ? io.sentry.config.a.B((l6.longValue() * 1000) - System.currentTimeMillis()) : "";
    }

    @Override // le.f1, androidx.lifecycle.k1
    public final void d() {
        eg.t1 t1Var = this.N;
        if (t1Var != null) {
            t1Var.k(null);
        }
        this.N = null;
        eg.t1 t1Var2 = this.I;
        if (t1Var2 != null) {
            t1Var2.k(null);
        }
        this.I = null;
        eg.t1 t1Var3 = this.C;
        if (t1Var3 != null) {
            t1Var3.k(null);
        }
        eg.t1 t1Var4 = this.D;
        if (t1Var4 != null) {
            t1Var4.k(null);
        }
        this.C = null;
        this.D = null;
        eg.t1 t1Var5 = this.A;
        if (t1Var5 != null) {
            t1Var5.k(null);
        }
        this.A = null;
        eg.t1 t1Var6 = this.B;
        if (t1Var6 != null) {
            t1Var6.k(null);
        }
        this.B = null;
        eg.t1 t1Var7 = this.f19748z;
        if (t1Var7 != null) {
            t1Var7.k(null);
        }
        this.f19748z = null;
        eg.t1 t1Var8 = this.f19745w;
        if (t1Var8 != null) {
            t1Var8.k(null);
        }
        this.f19745w = null;
        this.f19736m = null;
        this.f19737n = null;
        this.f19739p = null;
        this.q = null;
        l();
    }

    @Override // le.f1
    public final Bundle g() {
        String n9;
        ic.a aVar = this.f19743u;
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
                n9 = d9.e.n(r4.k.q("• Das Abonnement wird nach der Bestätigung dieses Abonnements wirksam.\n• Die Kosten des Abonnements betragen ", str, ".\n• Nach der Bestätigung erhält der Benutzer Zugriff auf alle Express-Vorhersagen, die nach der Bestätigung veröffentlicht werden.\n• Alle neuen Benutzer der App erhalten 3 kostenlose Tage des Abonnements. Nach Ablauf des kostenlosen Zeitraums, wenn der Benutzer das Abonnement nicht gekündigt hat (", j, "), wird ein Betrag in Höhe der Abonnementkosten in Ihrer Region berechnet.\n• Das Abonnement kann jederzeit und auch vor Ablauf des kostenlosen Zeitraums gekündigt werden. Der Benutzer kann seine Abonnements in seinem Google Play-Konto im Abschnitt „Abonnements“ verwalten ("), j, ").\n• Die Abonnementgebühr wird alle 7 Tage automatisch vom Konto des Benutzers abgebucht, sofern der Benutzer nicht kündigt (", j, ").");
            }
            StringBuilder q = r4.k.q("• Subscription is effective upon confirmation of this subscription\n• The cost of a subscription is ", str, "\n• Once the subscription is confirmed, the user will have access to all expresses-forecasts that will be published after the subscription is confirmed\n• All new users of the application are given 3 free days of subscription. After the end of the free period, if the user has not marked the subscription (", j, "), an amount equal to the subscription price in your region will be charged.\n• Subscription can be cancelled at any time and before the free period expires. You can manage your subscriptions in your personal Google Play account in the \"Subscriptions\" section (");
            q.append(j);
            q.append(").\n• Subscription fees will be automatically deducted from the user's account every 7 days unless the user cancels (");
            q.append(j);
            q.append(')');
            n9 = q.toString();
        } else if (hashCode == 3246) {
            if (c2.equals("es")) {
                n9 = d9.e.n(r4.k.q("• La suscripción entra en vigor tras la confirmación de esta suscripción.\n• El costo de la suscripción es de ", str, ".\n• Una vez confirmada, el usuario tendrá acceso a todas las predicciones express que se publiquen después de la confirmación.\n• Todos los nuevos usuarios de la aplicación reciben 3 días gratis de suscripción. Después del período gratuito, si el usuario no ha cancelado la suscripción (", j, "), se cobrará un monto igual al precio de la suscripción en su región.\n• La suscripción puede cancelarse en cualquier momento, incluso antes de que finalice el período gratuito. El usuario puede gestionar sus suscripciones en su cuenta personal de Google Play, en la sección \"Suscripciones\" ("), j, ").\n• El pago de la suscripción se cargará automáticamente a la cuenta del usuario cada 7 días, a menos que el usuario la cancele (", j, ").");
            }
            StringBuilder q3 = r4.k.q("• Subscription is effective upon confirmation of this subscription\n• The cost of a subscription is ", str, "\n• Once the subscription is confirmed, the user will have access to all expresses-forecasts that will be published after the subscription is confirmed\n• All new users of the application are given 3 free days of subscription. After the end of the free period, if the user has not marked the subscription (", j, "), an amount equal to the subscription price in your region will be charged.\n• Subscription can be cancelled at any time and before the free period expires. You can manage your subscriptions in your personal Google Play account in the \"Subscriptions\" section (");
            q3.append(j);
            q3.append(").\n• Subscription fees will be automatically deducted from the user's account every 7 days unless the user cancels (");
            q3.append(j);
            q3.append(')');
            n9 = q3.toString();
        } else if (hashCode == 3276) {
            if (c2.equals("fr")) {
                n9 = d9.e.n(r4.k.q("• L’abonnement prend effet après la confirmation de celui-ci.\n• Le coût de l’abonnement est de ", str, ".\n• Une fois confirmé, l’utilisateur aura accès à toutes les prévisions express publiées après la confirmation.\n• Tous les nouveaux utilisateurs bénéficient de 3 jours gratuits d’abonnement. Après la fin de la période gratuite, si l’utilisateur n’a pas annulé l’abonnement (", j, "), un montant égal au prix de l’abonnement dans votre région sera facturé.\n• L’abonnement peut être annulé à tout moment, y compris avant la fin de la période gratuite. L’utilisateur peut gérer ses abonnements dans son compte Google Play, section « Abonnements » ("), j, ").\n• Les paiements d’abonnement seront automatiquement débités du compte de l’utilisateur tous les 7 jours, sauf en cas d’annulation (", j, ").");
            }
            StringBuilder q32 = r4.k.q("• Subscription is effective upon confirmation of this subscription\n• The cost of a subscription is ", str, "\n• Once the subscription is confirmed, the user will have access to all expresses-forecasts that will be published after the subscription is confirmed\n• All new users of the application are given 3 free days of subscription. After the end of the free period, if the user has not marked the subscription (", j, "), an amount equal to the subscription price in your region will be charged.\n• Subscription can be cancelled at any time and before the free period expires. You can manage your subscriptions in your personal Google Play account in the \"Subscriptions\" section (");
            q32.append(j);
            q32.append(").\n• Subscription fees will be automatically deducted from the user's account every 7 days unless the user cancels (");
            q32.append(j);
            q32.append(')');
            n9 = q32.toString();
        } else if (hashCode == 3588) {
            if (c2.equals("pt")) {
                n9 = d9.e.n(r4.k.q("• A subscrição entra em vigor após a confirmação desta subscrição.\n• O custo da subscrição é de ", str, ".\n• Após a confirmação, o utilizador terá acesso a todas as previsões express que forem publicadas depois da confirmação.\n• Todos os novos utilizadores da aplicação recebem 3 dias gratuitos de subscrição. Após o término do período gratuito, se o utilizador não tiver cancelado a subscrição (", j, "), será cobrado um valor igual ao preço da subscrição na sua região.\n• A subscrição pode ser cancelada a qualquer momento, mesmo antes do final do período gratuito. O utilizador pode gerir as suas subscrições na sua conta pessoal do Google Play, na secção \"Subscrições\" ("), j, ").\n• O pagamento da subscrição será automaticamente debitado da conta do utilizador a cada 7 dias, a menos que o utilizador a cancele (", j, ").");
            }
            StringBuilder q322 = r4.k.q("• Subscription is effective upon confirmation of this subscription\n• The cost of a subscription is ", str, "\n• Once the subscription is confirmed, the user will have access to all expresses-forecasts that will be published after the subscription is confirmed\n• All new users of the application are given 3 free days of subscription. After the end of the free period, if the user has not marked the subscription (", j, "), an amount equal to the subscription price in your region will be charged.\n• Subscription can be cancelled at any time and before the free period expires. You can manage your subscriptions in your personal Google Play account in the \"Subscriptions\" section (");
            q322.append(j);
            q322.append(").\n• Subscription fees will be automatically deducted from the user's account every 7 days unless the user cancels (");
            q322.append(j);
            q322.append(')');
            n9 = q322.toString();
        } else if (hashCode != 3651) {
            if (hashCode == 3710 && c2.equals("tr")) {
                n9 = d9.e.n(r4.k.q("• Abonelik, bu aboneliğin onaylanmasından sonra yürürlüğe girer.\n• Abonelik ücreti ", str, "'dir.\n• Abonelik onaylandıktan sonra, kullanıcı onaydan sonra yayınlanacak tüm express tahminlere erişebilecektir.\n• Uygulamanın tüm yeni kullanıcılarına 3 günlük ücretsiz deneme süresi verilir. Ücretsiz dönem sona erdikten sonra, kullanıcı aboneliği iptal etmezse (", j, "), bölgenizdeki abonelik fiyatına eşit bir tutar tahsil edilir.\n• Abonelik, ücretsiz dönem bitmeden önce veya herhangi bir zamanda iptal edilebilir. Kullanıcı, Google Play hesabındaki \"Abonelikler\" bölümünden aboneliklerini yönetebilir ("), j, ").\n• Abonelik ücreti, kullanıcı iptal etmediği sürece her 7 günde bir otomatik olarak hesaptan tahsil edilir (", j, ").");
            }
            StringBuilder q3222 = r4.k.q("• Subscription is effective upon confirmation of this subscription\n• The cost of a subscription is ", str, "\n• Once the subscription is confirmed, the user will have access to all expresses-forecasts that will be published after the subscription is confirmed\n• All new users of the application are given 3 free days of subscription. After the end of the free period, if the user has not marked the subscription (", j, "), an amount equal to the subscription price in your region will be charged.\n• Subscription can be cancelled at any time and before the free period expires. You can manage your subscriptions in your personal Google Play account in the \"Subscriptions\" section (");
            q3222.append(j);
            q3222.append(").\n• Subscription fees will be automatically deducted from the user's account every 7 days unless the user cancels (");
            q3222.append(j);
            q3222.append(')');
            n9 = q3222.toString();
        } else {
            if (c2.equals("ru")) {
                StringBuilder q10 = r4.k.q("• Подписка вступает в силу после подтверждения оформления данной подписки\n• Стоимость подписки составляет ", str, "\n• После подтверждения подписки пользователю будут доступны все экспресс-прогнозы, которые будут опубликованы после ее подтверждения\n• Всем новым пользователям приложения предоставляется 3 бесплатных дня пользования подпиской. После окончания бесплатного периода, если пользователь не отметил подписку(", j, "), будет списана сумма равная стоимости подписки в вашем регионе\n• Подписку можно отменить в любое время, а также до истечения бесплатного периода. Управлять подписками пользователь может в личном аккаунте Google Play в разделе “Подписки” (");
                q10.append(j);
                q10.append(")\n• Оплата по подписке будет автоматически списываться со счета пользователя в каждые 7 дней, если пользователь ее не отменит (");
                q10.append(j);
                q10.append(')');
                n9 = q10.toString();
            }
            StringBuilder q32222 = r4.k.q("• Subscription is effective upon confirmation of this subscription\n• The cost of a subscription is ", str, "\n• Once the subscription is confirmed, the user will have access to all expresses-forecasts that will be published after the subscription is confirmed\n• All new users of the application are given 3 free days of subscription. After the end of the free period, if the user has not marked the subscription (", j, "), an amount equal to the subscription price in your region will be charged.\n• Subscription can be cancelled at any time and before the free period expires. You can manage your subscriptions in your personal Google Play account in the \"Subscriptions\" section (");
            q32222.append(j);
            q32222.append(").\n• Subscription fees will be automatically deducted from the user's account every 7 days unless the user cancels (");
            q32222.append(j);
            q32222.append(')');
            n9 = q32222.toString();
        }
        bundle.putString("Text", n9);
        bundle.putString("cancelSubs", j);
        return bundle;
    }

    @Override // le.f1
    public final y1.a h() {
        return this.E;
    }

    @Override // le.f1
    public final wc.d0 i() {
        return this.f19730f;
    }

    @Override // le.f1
    public final void k() {
        super.k();
        u1.a i5 = androidx.lifecycle.d1.i(this);
        lg.e eVar = eg.m0.f9201a;
        Continuation continuation = null;
        int i10 = 2;
        eg.c0.t(i5, jg.q.f18523a, null, new c4.u(this, continuation, 5), 2);
        eg.t1 t1Var = this.N;
        if (t1Var != null) {
            t1Var.k(null);
        }
        this.N = null;
        eg.t1 t1Var2 = this.I;
        if (t1Var2 != null) {
            t1Var2.k(null);
        }
        this.I = null;
        u1.a i11 = androidx.lifecycle.d1.i(this);
        lg.d dVar = lg.d.f20063c;
        eg.c0.t(i11, dVar, null, new x0(this, continuation, i10), 2);
        eg.c0.t(androidx.lifecycle.d1.i(this), dVar, null, new x0(this, continuation, 3), 2);
        jg.d dVar2 = MyApp.f6830c;
        this.f19745w = eg.c0.t(dVar2, dVar, null, new v0(this, continuation, 6), 2);
        this.C = eg.c0.t(dVar2, dVar, null, new v0(this, continuation, 7), 2);
        this.D = eg.c0.t(dVar2, dVar, null, new v0(this, continuation, 8), 2);
        eg.c0.t(androidx.lifecycle.d1.i(this), dVar, null, new x0(this, continuation, 1), 2);
        eg.c0.t(androidx.lifecycle.d1.i(this), dVar, null, new x0(this, continuation, 0), 2);
        wc.d0.i(this.f19730f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0082, code lost:
    
        if (eg.c0.A(r11, r0, r8) != r9) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(ic.a aVar, ic.a aVar2, mf.c cVar) {
        q0 q0Var;
        int i5;
        ic.a aVar3;
        ic.a aVar4;
        ic.a aVar5;
        if (cVar instanceof q0) {
            q0Var = (q0) cVar;
            int i10 = q0Var.f19915e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                q0Var.f19915e = i10 - Integer.MIN_VALUE;
                q0 q0Var2 = q0Var;
                Object obj = q0Var2.f19913c;
                lf.a aVar6 = lf.a.f20034a;
                i5 = q0Var2.f19915e;
                Continuation continuation = null;
                if (i5 != 0) {
                    h8.b.B(obj);
                    if (aVar == null) {
                        return Unit.f19194a;
                    }
                    q0Var2.f19911a = aVar;
                    q0Var2.f19912b = aVar2;
                    q0Var2.f19915e = 1;
                    wc.v vVar = this.f19730f;
                    vVar.getClass();
                    aVar3 = null;
                    obj = eg.c0.A(eg.m0.f9201a, new ge.f(vVar, aVar, aVar2, continuation, 17), q0Var2);
                    if (obj != aVar6) {
                        aVar4 = aVar;
                        aVar5 = aVar2;
                    }
                    return aVar6;
                }
                if (i5 != 1) {
                    if (i5 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return Unit.f19194a;
                }
                ic.a aVar7 = q0Var2.f19912b;
                ic.a aVar8 = q0Var2.f19911a;
                h8.b.B(obj);
                aVar5 = aVar7;
                aVar4 = aVar8;
                aVar3 = null;
                Pair pair = (Pair) obj;
                lg.e eVar = eg.m0.f9201a;
                fg.e eVar2 = jg.q.f18523a;
                r0 r0Var = new r0(this, aVar4, aVar5, pair, null, 0);
                q0Var2.f19911a = aVar3;
                q0Var2.f19912b = aVar3;
                q0Var2.f19915e = 2;
            }
        }
        q0Var = new q0(this, cVar);
        q0 q0Var22 = q0Var;
        Object obj2 = q0Var22.f19913c;
        lf.a aVar62 = lf.a.f20034a;
        i5 = q0Var22.f19915e;
        Continuation continuation2 = null;
        if (i5 != 0) {
        }
        Pair pair2 = (Pair) obj2;
        lg.e eVar3 = eg.m0.f9201a;
        fg.e eVar22 = jg.q.f18523a;
        r0 r0Var2 = new r0(this, aVar4, aVar5, pair2, null, 0);
        q0Var22.f19911a = aVar3;
        q0Var22.f19912b = aVar3;
        q0Var22.f19915e = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0082, code lost:
    
        if (eg.c0.A(r11, r0, r8) != r9) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(ic.a aVar, ic.a aVar2, mf.c cVar) {
        t0 t0Var;
        int i5;
        ic.a aVar3;
        ic.a aVar4;
        ic.a aVar5;
        if (cVar instanceof t0) {
            t0Var = (t0) cVar;
            int i10 = t0Var.f19948e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                t0Var.f19948e = i10 - Integer.MIN_VALUE;
                t0 t0Var2 = t0Var;
                Object obj = t0Var2.f19946c;
                lf.a aVar6 = lf.a.f20034a;
                i5 = t0Var2.f19948e;
                Continuation continuation = null;
                if (i5 != 0) {
                    h8.b.B(obj);
                    if (aVar == null) {
                        return Unit.f19194a;
                    }
                    t0Var2.f19944a = aVar;
                    t0Var2.f19945b = aVar2;
                    t0Var2.f19948e = 1;
                    wc.v vVar = this.f19730f;
                    vVar.getClass();
                    aVar3 = null;
                    obj = eg.c0.A(eg.m0.f9201a, new ge.f(vVar, aVar, aVar2, continuation, 17), t0Var2);
                    if (obj != aVar6) {
                        aVar4 = aVar;
                        aVar5 = aVar2;
                    }
                    return aVar6;
                }
                if (i5 != 1) {
                    if (i5 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return Unit.f19194a;
                }
                ic.a aVar7 = t0Var2.f19945b;
                ic.a aVar8 = t0Var2.f19944a;
                h8.b.B(obj);
                aVar5 = aVar7;
                aVar4 = aVar8;
                aVar3 = null;
                Pair pair = (Pair) obj;
                lg.e eVar = eg.m0.f9201a;
                fg.e eVar2 = jg.q.f18523a;
                r0 r0Var = new r0(this, aVar4, aVar5, pair, null, 1);
                t0Var2.f19944a = aVar3;
                t0Var2.f19945b = aVar3;
                t0Var2.f19948e = 2;
            }
        }
        t0Var = new t0(this, cVar);
        t0 t0Var22 = t0Var;
        Object obj2 = t0Var22.f19946c;
        lf.a aVar62 = lf.a.f20034a;
        i5 = t0Var22.f19948e;
        Continuation continuation2 = null;
        if (i5 != 0) {
        }
        Pair pair2 = (Pair) obj2;
        lg.e eVar3 = eg.m0.f9201a;
        fg.e eVar22 = jg.q.f18523a;
        r0 r0Var2 = new r0(this, aVar4, aVar5, pair2, null, 1);
        t0Var22.f19944a = aVar3;
        t0Var22.f19945b = aVar3;
        t0Var22.f19948e = 2;
    }

    public final void w(androidx.fragment.app.p0 p0Var) {
        String str;
        this.f19730f.getClass();
        if (da.r.c() || da.r.d() || this.j <= 0 || (str = this.f19736m) == null) {
            return;
        }
        eg.c0.t(androidx.lifecycle.d1.i(this), null, null, new c4.u(this, str, p0Var, null, 4), 3);
    }

    public final void x(androidx.fragment.app.p0 p0Var) {
        wc.v vVar = this.f19730f;
        vVar.getClass();
        if (da.r.c() || da.r.d()) {
            return;
        }
        i().getClass();
        Continuation continuation = null;
        if (((Boolean) wc.d0.b().f21708h.getValue()).booleanValue()) {
            jg.d dVar = MyApp.f6830c;
            lg.e eVar = eg.m0.f9201a;
            eg.c0.t(dVar, lg.d.f20063c, null, new wc.w(vVar, continuation, 4), 2);
        }
        if (((Boolean) wc.d0.b().j.getValue()).booleanValue()) {
            jg.d dVar2 = MyApp.f6830c;
            lg.e eVar2 = eg.m0.f9201a;
            eg.c0.t(dVar2, lg.d.f20063c, null, new wc.w(vVar, continuation, 5), 2);
        } else {
            String str = this.f19739p;
            if (str != null) {
                eg.c0.t(androidx.lifecycle.d1.i(this), null, null, new androidx.lifecycle.u0(this, str, p0Var, continuation, 6), 3);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object y(mf.c cVar) {
        c1 c1Var;
        int i5;
        Object[] formatArgs;
        int i10;
        try {
            if (cVar instanceof c1) {
                c1Var = (c1) cVar;
                int i11 = c1Var.f19720c;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    c1Var.f19720c = i11 - Integer.MIN_VALUE;
                    Object obj = c1Var.f19718a;
                    lf.a aVar = lf.a.f20034a;
                    i5 = c1Var.f19720c;
                    wc.v vVar = this.f19730f;
                    if (i5 != 0) {
                        h8.b.B(obj);
                        c1Var.f19720c = 1;
                        obj = vVar.r(c1Var);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                    int intValue = ((Number) obj).intValue();
                    ((zc.k) vVar.f25206h.getValue()).getClass();
                    formatArgs = new Object[]{String.valueOf(intValue), ((za.i) zc.k.e()).d(R.plurals.express_plurals, intValue)};
                    Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                    zc.k kVar = (zc.k) vVar.f25206h.getValue();
                    Object[] copyOf = Arrays.copyOf(formatArgs, 2);
                    kVar.getClass();
                    return zc.k.i(R.string.get_count_express_args, copyOf);
                }
            }
            zc.k kVar2 = (zc.k) vVar.f25206h.getValue();
            Object[] copyOf2 = Arrays.copyOf(formatArgs, 2);
            kVar2.getClass();
            return zc.k.i(R.string.get_count_express_args, copyOf2);
        } catch (Exception e7) {
            String str = "";
            for (i10 = 0; i10 < 2; i10++) {
                str = str + formatArgs[i10];
            }
            StringBuilder b10 = v.f.b(str);
            b10.append(e7.getMessage());
            d4.d().z(b10.toString());
            return "error";
        }
        c1Var = new c1(this, cVar);
        Object obj2 = c1Var.f19718a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = c1Var.f19720c;
        wc.v vVar2 = this.f19730f;
        if (i5 != 0) {
        }
        int intValue2 = ((Number) obj2).intValue();
        ((zc.k) vVar2.f25206h.getValue()).getClass();
        formatArgs = new Object[]{String.valueOf(intValue2), ((za.i) zc.k.e()).d(R.plurals.express_plurals, intValue2)};
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
    }
}
