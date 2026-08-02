package le;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import com.sports.insider.MyApp;
import com.sports.insider.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h extends f1 {

    /* renamed from: f, reason: collision with root package name */
    public final wc.e f19797f = new wc.e();

    /* renamed from: g, reason: collision with root package name */
    public String f19798g;

    /* renamed from: h, reason: collision with root package name */
    public int f19799h;

    /* renamed from: i, reason: collision with root package name */
    public eg.t1 f19800i;
    public eg.t1 j;

    /* renamed from: k, reason: collision with root package name */
    public eg.t1 f19801k;

    /* renamed from: l, reason: collision with root package name */
    public eg.t1 f19802l;

    /* renamed from: m, reason: collision with root package name */
    public final y1.a f19803m;

    /* renamed from: n, reason: collision with root package name */
    public final androidx.lifecycle.p0 f19804n;

    /* renamed from: o, reason: collision with root package name */
    public final androidx.lifecycle.p0 f19805o;

    /* renamed from: p, reason: collision with root package name */
    public String f19806p;
    public String q;

    /* renamed from: r, reason: collision with root package name */
    public String f19807r;

    /* renamed from: s, reason: collision with root package name */
    public String f19808s;

    /* renamed from: t, reason: collision with root package name */
    public String f19809t;

    /* renamed from: u, reason: collision with root package name */
    public String f19810u;

    /* renamed from: v, reason: collision with root package name */
    public ic.n f19811v;

    /* renamed from: w, reason: collision with root package name */
    public ic.n f19812w;

    public h() {
        y1.a b10 = com.google.android.play.core.appupdate.b.b();
        Intrinsics.checkNotNullExpressionValue(b10, "actionGlobalAllPredictionsFragment(...)");
        this.f19803m = b10;
        androidx.lifecycle.p0 p0Var = new androidx.lifecycle.p0(null);
        this.f19804n = p0Var;
        this.f19805o = p0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
    
        if (eg.c0.A(r5, r6, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0075, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (r9 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object o(h hVar, mf.c cVar) {
        c cVar2;
        int i5;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i10 = cVar2.f19714d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar2.f19714d = i10 - Integer.MIN_VALUE;
                Object obj = cVar2.f19712b;
                lf.a aVar = lf.a.f20034a;
                i5 = cVar2.f19714d;
                Continuation continuation = null;
                if (i5 != 0) {
                    h8.b.B(obj);
                    wc.e eVar = hVar.f19797f;
                    cVar2.f19714d = 1;
                    s7.u uVar = eVar.f25076c;
                    s7.u.g().getClass();
                    y8.d dVar = new y8.d();
                    lg.e eVar2 = eg.m0.f9201a;
                    obj = eg.c0.A(lg.d.f20063c, new eb.o(dVar, continuation, 0), cVar2);
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                }
                lg.e eVar3 = eg.m0.f9201a;
                fg.e eVar4 = jg.q.f18523a;
                ab.b bVar = new ab.b(hVar, (nc.f) obj, continuation, 18);
                cVar2.f19711a = obj;
                cVar2.f19714d = 2;
            }
        }
        cVar2 = new c(hVar, cVar);
        Object obj2 = cVar2.f19712b;
        lf.a aVar2 = lf.a.f20034a;
        i5 = cVar2.f19714d;
        Continuation continuation2 = null;
        if (i5 != 0) {
        }
        lg.e eVar32 = eg.m0.f9201a;
        fg.e eVar42 = jg.q.f18523a;
        ab.b bVar2 = new ab.b(hVar, (nc.f) obj2, continuation2, 18);
        cVar2.f19711a = obj2;
        cVar2.f19714d = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object p(h hVar, mf.c cVar) {
        d dVar;
        Object obj;
        int i5;
        String str;
        wc.e eVar = hVar.f19797f;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i10 = dVar.f19726d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f19726d = i10 - Integer.MIN_VALUE;
                obj = dVar.f19724b;
                lf.a aVar = lf.a.f20034a;
                i5 = dVar.f19726d;
                if (i5 != 0) {
                    h8.b.B(obj);
                    String str2 = hVar.f19806p;
                    if (str2 == null) {
                        return null;
                    }
                    dVar.f19723a = str2;
                    dVar.f19726d = 1;
                    Object c2 = eVar.c(dVar);
                    if (c2 == aVar) {
                        return aVar;
                    }
                    str = str2;
                    obj = c2;
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = dVar.f19723a;
                    h8.b.B(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    return null;
                }
                da.o oVar = new da.o(str);
                ic.n q = hVar.q(str);
                int i11 = hVar.f19765b;
                if (i11 > 0 && q != null) {
                    oVar.j(i11);
                    eVar.getClass();
                    List list = ((ic.a0) q).f11074e;
                    oVar.l(((ic.d0) ((ic.m) CollectionsKt.F(list))).f11100d);
                    oVar.k(((ic.d0) ((ic.m) CollectionsKt.F(list))).f11098b);
                }
                oVar.m("diamond");
                return oVar;
            }
        }
        dVar = new d(hVar, cVar);
        obj = dVar.f19724b;
        lf.a aVar2 = lf.a.f20034a;
        i5 = dVar.f19726d;
        if (i5 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    @Override // le.f1, androidx.lifecycle.k1
    public final void d() {
        eg.t1 t1Var = this.j;
        if (t1Var != null) {
            t1Var.k(null);
        }
        this.j = null;
        eg.t1 t1Var2 = this.f19801k;
        if (t1Var2 != null) {
            t1Var2.k(null);
        }
        this.f19801k = null;
        eg.t1 t1Var3 = this.f19800i;
        if (t1Var3 != null) {
            t1Var3.k(null);
        }
        this.f19800i = null;
        eg.t1 t1Var4 = this.f19802l;
        if (t1Var4 != null) {
            t1Var4.k(null);
        }
        this.f19802l = null;
        l();
    }

    @Override // le.f1
    public final void e() {
        u1.a i5 = androidx.lifecycle.d1.i(this);
        lg.e eVar = eg.m0.f9201a;
        eg.c0.t(i5, jg.q.f18523a, null, new a(this, null, 0), 2);
    }

    @Override // le.f1
    public final Bundle g() {
        String l6;
        String n9 = this.f19797f.n(this.f19811v);
        Intrinsics.checkNotNullParameter("Text", "txtKey");
        Intrinsics.checkNotNullParameter("cancelSubs", "cancelKey");
        Bundle bundle = new Bundle();
        String str = gc.d.f9945a;
        String c2 = d2.i.c();
        String j = com.google.android.play.core.appupdate.b.j(c2);
        if (n9 == null) {
            n9 = "$";
        }
        int hashCode = c2.hashCode();
        if (hashCode == 3201) {
            if (c2.equals("de")) {
                l6 = d9.e.l(r4.k.q("• Das Abonnement wird nach der Bestätigung dieses Abonnements wirksam.\n• Die Kosten des Abonnements betragen ", n9, ".\n• Nach der Bestätigung erhält der Benutzer Zugriff auf alle Premium- und Express-Vorhersagen, die nach der Bestätigung veröffentlicht werden.\n• Das Abonnement kann jederzeit und auch vor Ablauf des kostenlosen Zeitraums gekündigt werden. Der Benutzer kann seine Abonnements in seinem Google Play-Konto im Abschnitt „Abonnements“ verwalten (", j, ").\n• Die Abonnementgebühr wird alle 30 Tage automatisch vom Konto des Benutzers abgebucht, sofern der Benutzer nicht kündigt ("), j, ").");
            }
            l6 = d9.e.k(r4.k.q("• Subscription is effective upon confirmation of this subscription\n• The cost of a subscription is ", n9, "\n• Once the subscription is confirmed, the user will have access to all premium-forecasts and expresses-forecasts that will be published after the subscription is confirmed\n• Subscription can be cancelled at any time and before the free period expires. You can manage your subscriptions in your personal Google Play account in the \"Subscriptions\" section (", j, ").\n• Subscription fees will be automatically deducted from the user's account every 30 days unless the user cancels ("), j, ')');
        } else if (hashCode == 3246) {
            if (c2.equals("es")) {
                l6 = d9.e.l(r4.k.q("• La suscripción entra en vigor tras la confirmación de esta suscripción.\n• El costo de la suscripción es de ", n9, ".\n• Una vez confirmada, el usuario tendrá acceso a todas las predicciones premium y express que se publiquen después de la confirmación.\n• La suscripción puede cancelarse en cualquier momento, incluso antes de que finalice el período gratuito. El usuario puede gestionar sus suscripciones en su cuenta personal de Google Play, en la sección \"Suscripciones\" (", j, ").\n• El pago de la suscripción se cargará automáticamente a la cuenta del usuario cada 30 días, a menos que el usuario la cancele ("), j, ").");
            }
            l6 = d9.e.k(r4.k.q("• Subscription is effective upon confirmation of this subscription\n• The cost of a subscription is ", n9, "\n• Once the subscription is confirmed, the user will have access to all premium-forecasts and expresses-forecasts that will be published after the subscription is confirmed\n• Subscription can be cancelled at any time and before the free period expires. You can manage your subscriptions in your personal Google Play account in the \"Subscriptions\" section (", j, ").\n• Subscription fees will be automatically deducted from the user's account every 30 days unless the user cancels ("), j, ')');
        } else if (hashCode == 3276) {
            if (c2.equals("fr")) {
                l6 = d9.e.l(r4.k.q("• L’abonnement prend effet après la confirmation de celui-ci.\n• Le coût de l’abonnement est de ", n9, ".\n• Une fois l’abonnement confirmé, l’utilisateur aura accès à toutes les prévisions premium et express publiées après la confirmation.\n• L’abonnement peut être annulé à tout moment, y compris avant la fin de la période d’essai gratuite. L’utilisateur peut gérer ses abonnements dans son compte Google Play, section « Abonnements » (", j, ").\n• Les frais d’abonnement seront automatiquement prélevés sur le compte de l’utilisateur tous les 30 jours, sauf s’il annule l’abonnement ("), j, ").");
            }
            l6 = d9.e.k(r4.k.q("• Subscription is effective upon confirmation of this subscription\n• The cost of a subscription is ", n9, "\n• Once the subscription is confirmed, the user will have access to all premium-forecasts and expresses-forecasts that will be published after the subscription is confirmed\n• Subscription can be cancelled at any time and before the free period expires. You can manage your subscriptions in your personal Google Play account in the \"Subscriptions\" section (", j, ").\n• Subscription fees will be automatically deducted from the user's account every 30 days unless the user cancels ("), j, ')');
        } else if (hashCode == 3588) {
            if (c2.equals("pt")) {
                l6 = d9.e.l(r4.k.q("• A subscrição entra em vigor após a confirmação desta subscrição.\n• O custo da subscrição é de ", n9, ".\n• Após a confirmação, o utilizador terá acesso a todas as previsões premium e express que forem publicadas depois da confirmação.\n• A subscrição pode ser cancelada a qualquer momento, mesmo antes do final do período gratuito. O utilizador pode gerir as suas subscrições na sua conta pessoal do Google Play, na secção \"Subscrições\" (", j, ").\n• O pagamento da subscrição será automaticamente debitado da conta do utilizador a cada 30 dias, a menos que o utilizador a cancele ("), j, ").");
            }
            l6 = d9.e.k(r4.k.q("• Subscription is effective upon confirmation of this subscription\n• The cost of a subscription is ", n9, "\n• Once the subscription is confirmed, the user will have access to all premium-forecasts and expresses-forecasts that will be published after the subscription is confirmed\n• Subscription can be cancelled at any time and before the free period expires. You can manage your subscriptions in your personal Google Play account in the \"Subscriptions\" section (", j, ").\n• Subscription fees will be automatically deducted from the user's account every 30 days unless the user cancels ("), j, ')');
        } else if (hashCode != 3651) {
            if (hashCode == 3710 && c2.equals("tr")) {
                l6 = d9.e.l(r4.k.q("• Abonelik, bu aboneliğin onaylanmasından sonra yürürlüğe girer.\n• Abonelik ücreti ", n9, "'dir.\n• Abonelik onaylandıktan sonra, kullanıcı onaydan sonra yayınlanacak tüm premium ve express tahminlere erişebilecektir.\n• Abonelik, ücretsiz dönem bitmeden önce veya herhangi bir zamanda iptal edilebilir. Kullanıcı, Google Play hesabındaki \"Abonelikler\" bölümünden aboneliklerini yönetebilir (", j, ").\n• Abonelik ücreti, kullanıcı iptal etmediği sürece her 30 günde bir otomatik olarak hesaptan tahsil edilir ("), j, ").");
            }
            l6 = d9.e.k(r4.k.q("• Subscription is effective upon confirmation of this subscription\n• The cost of a subscription is ", n9, "\n• Once the subscription is confirmed, the user will have access to all premium-forecasts and expresses-forecasts that will be published after the subscription is confirmed\n• Subscription can be cancelled at any time and before the free period expires. You can manage your subscriptions in your personal Google Play account in the \"Subscriptions\" section (", j, ").\n• Subscription fees will be automatically deducted from the user's account every 30 days unless the user cancels ("), j, ')');
        } else {
            if (c2.equals("ru")) {
                l6 = d9.e.k(r4.k.q("• Подписка вступает в силу после подтверждения оформления данной подписки\n• Стоимость подписки составляет ", n9, "\n• После подтверждения подписки пользователю будут доступны все премиум-прогнозы и экспресс-прогнозы, которые будут опубликованы после ее подтверждения\n• Подписку можно отменить в любое время, а также до истечения бесплатного периода. Управлять подписками пользователь может в личном аккаунте Google Play в разделе “Подписки” (", j, ")\n• Оплата по подписке будет автоматически списываться со счета пользователя в каждые 30 дней, если пользователь ее не отменит ("), j, ')');
            }
            l6 = d9.e.k(r4.k.q("• Subscription is effective upon confirmation of this subscription\n• The cost of a subscription is ", n9, "\n• Once the subscription is confirmed, the user will have access to all premium-forecasts and expresses-forecasts that will be published after the subscription is confirmed\n• Subscription can be cancelled at any time and before the free period expires. You can manage your subscriptions in your personal Google Play account in the \"Subscriptions\" section (", j, ").\n• Subscription fees will be automatically deducted from the user's account every 30 days unless the user cancels ("), j, ')');
        }
        bundle.putString("Text", l6);
        bundle.putString("cancelSubs", j);
        return bundle;
    }

    @Override // le.f1
    public final y1.a h() {
        return this.f19803m;
    }

    @Override // le.f1
    public final wc.d0 i() {
        return this.f19797f;
    }

    @Override // le.f1
    public final void k() {
        super.k();
        u1.a i5 = androidx.lifecycle.d1.i(this);
        lg.e eVar = eg.m0.f9201a;
        lg.d dVar = lg.d.f20063c;
        Continuation continuation = null;
        int i10 = 2;
        eg.c0.t(i5, dVar, null, new kd.e(this, continuation, 7), 2);
        eg.t1 t1Var = this.f19800i;
        if (t1Var != null) {
            t1Var.k(null);
        }
        this.f19800i = null;
        eg.c0.t(androidx.lifecycle.d1.i(this), dVar, null, new a(this, continuation, i10), 2);
        eg.c0.t(androidx.lifecycle.d1.i(this), dVar, null, new a(this, continuation, 1), 2);
        this.f19802l = eg.c0.t(MyApp.f6830c, dVar, null, new b(this, continuation, 3), 2);
        wc.d0.i(this.f19797f);
    }

    public final ic.n q(String str) {
        ic.n nVar = Intrinsics.areEqual(str, this.f19806p) ? this.f19811v : Intrinsics.areEqual(str, this.q) ? this.f19812w : null;
        if (nVar == null && str != null) {
            this.f19797f.f(0L);
        }
        return nVar;
    }

    public final Object r() {
        this.f19797f.getClass();
        gf.t b10 = gf.k.b(new b2.b(25));
        ArrayList arrayList = new ArrayList();
        ((zc.k) b10.getValue()).getClass();
        arrayList.add(zc.k.h(R.string.vip_plus_2));
        ((zc.k) b10.getValue()).getClass();
        arrayList.add(zc.k.h(R.string.vip_plus_3));
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        ((zc.k) b10.getValue()).getClass();
        String format = String.format(zc.k.h(R.string.vip_plus_4), Arrays.copyOf(new Object[]{"Diamond"}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        SpannableString spannableString = new SpannableString(format);
        try {
            int G = StringsKt.G(spannableString, "Diamond", 0, false, 6);
            if (G > -1) {
                ((zc.k) b10.getValue()).getClass();
                spannableString.setSpan(zc.k.b(), G, G + 7, 18);
            }
        } catch (Exception unused) {
        }
        arrayList.add(spannableString);
        ((zc.k) b10.getValue()).getClass();
        String h10 = zc.k.h(R.string.lk_store_desc);
        SpannableString spannableString2 = new SpannableString(h10);
        try {
            spannableString2.setSpan(new UnderlineSpan(), 0, h10.length(), 18);
        } catch (Exception unused2) {
        }
        ((zc.k) b10.getValue()).getClass();
        arrayList.add(zc.k.h(R.string.vip_plus_5));
        ((zc.k) b10.getValue()).getClass();
        arrayList.add(zc.k.h(R.string.subs_auto_renewed_cancel_it));
        arrayList.add(spannableString2);
        return new Pair(arrayList, kotlin.collections.e0.f19204a);
    }
}
