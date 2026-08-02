package pd;

import androidx.lifecycle.k1;
import androidx.lifecycle.p0;
import eg.m0;
import eg.t1;
import hg.d1;
import hg.u0;
import kotlin.coroutines.Continuation;
import okio.Segment;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c extends k1 {

    /* renamed from: b, reason: collision with root package name */
    public t1 f21731b;

    /* renamed from: c, reason: collision with root package name */
    public final d1 f21732c;

    /* renamed from: d, reason: collision with root package name */
    public final d1 f21733d;

    /* renamed from: e, reason: collision with root package name */
    public final d1 f21734e;

    /* renamed from: f, reason: collision with root package name */
    public final b f21735f;

    /* renamed from: g, reason: collision with root package name */
    public final b f21736g;

    /* renamed from: h, reason: collision with root package name */
    public final String f21737h;

    /* renamed from: i, reason: collision with root package name */
    public final String f21738i;
    public final String j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f21739k;

    /* renamed from: l, reason: collision with root package name */
    public int f21740l;

    /* renamed from: m, reason: collision with root package name */
    public final int f21741m;

    /* renamed from: n, reason: collision with root package name */
    public final p0 f21742n;

    public c() {
        kotlin.collections.e0 e0Var = kotlin.collections.e0.f19204a;
        this.f21732c = u0.b(e0Var);
        this.f21733d = u0.b(e0Var);
        this.f21734e = u0.b(e0Var);
        int maxMemory = ((int) (Runtime.getRuntime().maxMemory() / Segment.SHARE_MINIMUM)) / 8;
        this.f21735f = new b(maxMemory, 1);
        this.f21736g = new b(maxMemory, 0);
        this.f21737h = "SI - Academy";
        this.f21738i = "FAQ";
        this.j = "Live";
        this.f21741m = 9;
        this.f21742n = new p0(0);
    }

    public static String e() {
        String str = gc.d.f9945a;
        String c2 = d2.i.c();
        int hashCode = c2.hashCode();
        return hashCode != 3201 ? hashCode != 3246 ? hashCode != 3276 ? hashCode != 3588 ? hashCode != 3651 ? (hashCode == 3710 && c2.equals("tr")) ? "Tüm sporlar" : "All sports" : !c2.equals("ru") ? "All sports" : "Все" : !c2.equals("pt") ? "All sports" : "Todos os esportes" : !c2.equals("fr") ? "All sports" : "Tous les sports" : !c2.equals("es") ? "All sports" : "Todos los deportes" : !c2.equals("de") ? "All sports" : "Alle Sportarten";
    }

    public static String f() {
        String str = gc.d.f9945a;
        String c2 = d2.i.c();
        int hashCode = c2.hashCode();
        return hashCode != 3201 ? hashCode != 3246 ? hashCode != 3276 ? hashCode != 3588 ? hashCode != 3651 ? (hashCode == 3710 && c2.equals("tr")) ? "Favoriler" : "Favorite" : !c2.equals("ru") ? "Favorite" : "Избранное" : !c2.equals("pt") ? "Favorite" : "Favoritos" : !c2.equals("fr") ? "Favorite" : "Favoris" : !c2.equals("es") ? "Favorite" : "Favoritos" : !c2.equals("de") ? "Favorite" : "Favoriten";
    }

    public static String g() {
        String str = gc.d.f9945a;
        String c2 = d2.i.c();
        int hashCode = c2.hashCode();
        return hashCode != 3201 ? hashCode != 3246 ? hashCode != 3276 ? hashCode != 3588 ? hashCode != 3651 ? (hashCode == 3710 && c2.equals("tr")) ? "Spor türü" : "Kind of sport" : !c2.equals("ru") ? "Kind of sport" : "Вид спорта" : !c2.equals("pt") ? "Kind of sport" : "Tipo de esporte" : !c2.equals("fr") ? "Kind of sport" : "Type de sport" : !c2.equals("es") ? "Kind of sport" : "Tipo de deporte" : !c2.equals("de") ? "Kind of sport" : "Sportart";
    }

    public static String h() {
        String str = gc.d.f9945a;
        String c2 = d2.i.c();
        int hashCode = c2.hashCode();
        return hashCode != 3201 ? hashCode != 3246 ? hashCode != 3276 ? hashCode != 3588 ? hashCode != 3651 ? (hashCode == 3710 && c2.equals("tr")) ? "Canlı tahminler" : "Live - predictions" : !c2.equals("ru") ? "Live - predictions" : "Live - прогнозы" : !c2.equals("pt") ? "Live - predictions" : "Previsões ao vivo" : !c2.equals("fr") ? "Live - predictions" : "Pronostics en direct" : !c2.equals("es") ? "Live - predictions" : "Pronósticos en vivo" : !c2.equals("de") ? "Live - predictions" : "Live - Vorhersagen";
    }

    public static String i() {
        String str = gc.d.f9945a;
        String c2 = d2.i.c();
        int hashCode = c2.hashCode();
        return hashCode != 3201 ? hashCode != 3246 ? hashCode != 3276 ? hashCode != 3588 ? hashCode != 3651 ? (hashCode == 3710 && c2.equals("tr")) ? "Bonuslarım" : "My bonuses" : !c2.equals("ru") ? "My bonuses" : "Мои бонусы" : !c2.equals("pt") ? "My bonuses" : "Meus bônus" : !c2.equals("fr") ? "My bonuses" : "Mes bonus" : !c2.equals("es") ? "My bonuses" : "Mis bonos" : !c2.equals("de") ? "My bonuses" : "Meine Boni";
    }

    public static String j() {
        String str = gc.d.f9945a;
        String c2 = d2.i.c();
        int hashCode = c2.hashCode();
        return hashCode != 3201 ? hashCode != 3246 ? hashCode != 3276 ? hashCode != 3588 ? hashCode != 3651 ? (hashCode == 3710 && c2.equals("tr")) ? "Tarifeler" : "Rates" : !c2.equals("ru") ? "Rates" : "Тарифы" : !c2.equals("pt") ? "Rates" : "Planos" : !c2.equals("fr") ? "Rates" : "Tarifs" : !c2.equals("es") ? "Rates" : "Tarifas" : !c2.equals("de") ? "Rates" : "Tarife";
    }

    public static String k() {
        String str = gc.d.f9945a;
        String c2 = d2.i.c();
        int hashCode = c2.hashCode();
        return hashCode != 3201 ? hashCode != 3246 ? hashCode != 3276 ? hashCode != 3588 ? hashCode != 3651 ? (hashCode == 3710 && c2.equals("tr")) ? "Ayarlar" : "Settings" : !c2.equals("ru") ? "Settings" : "Настройки" : !c2.equals("pt") ? "Settings" : "Configurações" : !c2.equals("fr") ? "Settings" : "Paramètres" : !c2.equals("es") ? "Settings" : "Configuración" : !c2.equals("de") ? "Settings" : "Einstellungen";
    }

    public static String l() {
        String str = gc.d.f9945a;
        String c2 = d2.i.c();
        int hashCode = c2.hashCode();
        if (hashCode != 3201) {
            return hashCode != 3246 ? hashCode != 3276 ? hashCode != 3588 ? hashCode != 3651 ? (hashCode == 3710 && c2.equals("tr")) ? "Destek" : "Support" : !c2.equals("ru") ? "Support" : "Поддержка" : !c2.equals("pt") ? "Support" : "Suporte" : !c2.equals("fr") ? "Support" : "Assistance" : !c2.equals("es") ? "Support" : "Soporte";
        }
        c2.equals("de");
        return "Support";
    }

    @Override // androidx.lifecycle.k1
    public final void d() {
        this.f21735f.evictAll();
        this.f21736g.evictAll();
        t1 t1Var = this.f21731b;
        if (t1Var != null) {
            t1Var.k(null);
        }
        this.f21731b = null;
        this.f21732c.j(null);
    }

    public final void m(int i5) {
        if (this.f21735f.get(Integer.valueOf(i5)) != null) {
            return;
        }
        u1.a i10 = androidx.lifecycle.d1.i(this);
        lg.e eVar = m0.f9201a;
        eg.c0.t(i10, lg.d.f20063c, null, new cd.k(i5, this, (Continuation) null, 11), 2);
    }

    public final void n(int i5) {
        if (i5 < 0 || i5 >= 5) {
            i5 = -1;
        }
        this.f21742n.h(Integer.valueOf(i5));
    }
}
