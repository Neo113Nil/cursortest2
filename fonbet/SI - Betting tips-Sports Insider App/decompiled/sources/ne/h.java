package ne;

import android.content.Intent;
import android.content.SharedPreferences;
import androidx.core.view.h0;
import androidx.fragment.app.p0;
import com.google.android.gms.internal.measurement.y3;
import com.sports.insider.ui.activities.SplashActivity;
import com.sports.insider.ui.settings.SettingFragment;
import eg.c0;
import eg.m0;
import eg.z;
import gf.k;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pd.v;
import rc.o;
import rc.r;
import rc.s;
import sd.l;
import sd.n;
import zc.j;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20885b;

    /* renamed from: c, reason: collision with root package name */
    public int f20886c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SettingFragment f20887d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(SettingFragment settingFragment, Continuation continuation, int i5) {
        super(2, continuation);
        this.f20885b = i5;
        this.f20887d = settingFragment;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f20885b) {
            case 0:
                return new h(this.f20887d, continuation, 0);
            case 1:
                return new h(this.f20887d, continuation, 1);
            case 2:
                return new h(this.f20887d, continuation, 2);
            case 3:
                return new h(this.f20887d, continuation, 3);
            default:
                return new h(this.f20887d, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f20885b) {
        }
        return ((h) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bb  */
    /* JADX WARN: Type inference failed for: r15v8, types: [gf.i, java.lang.Object] */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Locale locale;
        ec.z zVar;
        boolean z5 = false;
        Object[] objArr = 0;
        int i5 = 2;
        String lang = null;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        int i10 = 1;
        switch (this.f20885b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i11 = this.f20886c;
                if (i11 == 0) {
                    h8.b.B(obj);
                    ArrayList arrayList = new ArrayList();
                    n nVar = n.q;
                    arrayList.add(nVar);
                    n nVar2 = n.f23510s;
                    arrayList.add(nVar2);
                    n nVar3 = n.f23506n;
                    arrayList.add(nVar3);
                    n nVar4 = n.f23508p;
                    arrayList.add(nVar4);
                    n nVar5 = n.f23509r;
                    arrayList.add(nVar5);
                    n nVar6 = n.f23507o;
                    arrayList.add(nVar6);
                    sd.d dVar = new sd.d(arrayList, 2);
                    this.f20887d.M().getClass();
                    k.b(new v(9));
                    String str = gc.d.f9945a;
                    String c2 = d2.i.c();
                    if (!Intrinsics.areEqual(c2, zc.f.f25913d.getLanguage())) {
                        if (Intrinsics.areEqual(c2, zc.f.f25914e.getLanguage())) {
                            nVar = nVar2;
                        } else {
                            if (!Intrinsics.areEqual(c2, zc.f.f25910a.getLanguage())) {
                                if (Intrinsics.areEqual(c2, zc.f.f25912c.getLanguage())) {
                                    nVar = nVar4;
                                } else if (Intrinsics.areEqual(c2, zc.f.f25911b.getLanguage())) {
                                    nVar = nVar5;
                                } else if (Intrinsics.areEqual(c2, zc.f.f25915f.getLanguage())) {
                                    nVar = nVar6;
                                }
                            }
                            nVar = nVar3;
                        }
                    }
                    l lVar = (l) this.f20887d.q.getValue();
                    this.f20886c = 1;
                    ve.h hVar = lVar.f23492c;
                    lVar.f23491b = dVar;
                    switch (nVar.ordinal()) {
                        case 18:
                            hVar.f24721v.f24690b = 2;
                            hVar.requestLayout();
                            break;
                        case 19:
                            hVar.f24721v.f24690b = 5;
                            hVar.requestLayout();
                            break;
                        case 20:
                            hVar.f24721v.f24690b = 3;
                            hVar.requestLayout();
                            break;
                        case 21:
                            hVar.f24721v.f24690b = 0;
                            hVar.requestLayout();
                            break;
                        case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                            hVar.f24721v.f24690b = 4;
                            hVar.requestLayout();
                            break;
                        case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                            hVar.f24721v.f24690b = 1;
                            hVar.requestLayout();
                            break;
                        default:
                            hVar.f24721v.f24690b = 2;
                            hVar.requestLayout();
                            break;
                    }
                    lVar.show();
                    kf.f fVar = new kf.f(lf.d.b(this));
                    lVar.f23490a = fVar;
                    obj = fVar.b();
                    if (obj == aVar) {
                        Intrinsics.checkNotNullParameter(this, "frame");
                    }
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                sd.d dVar2 = (sd.d) obj;
                if (dVar2 != null) {
                    SettingFragment settingFragment = this.f20887d;
                    switch (dVar2.f23478b.ordinal()) {
                        case 18:
                            locale = zc.f.f25910a;
                            break;
                        case 19:
                            locale = zc.f.f25915f;
                            break;
                        case 20:
                            locale = zc.f.f25912c;
                            break;
                        case 21:
                            locale = zc.f.f25913d;
                            break;
                        case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                            locale = zc.f.f25911b;
                            break;
                        case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                            locale = zc.f.f25914e;
                            break;
                    }
                    oe.k M = settingFragment.M();
                    p0 activity = settingFragment.getActivity();
                    M.getClass();
                    Intrinsics.checkNotNullParameter(locale, "locale");
                    if (activity != null) {
                        k.b(new v(9));
                        String str2 = gc.d.f9945a;
                        if (!Intrinsics.areEqual(d2.i.c(), locale.getLanguage())) {
                            k.b(new v(9));
                            Intrinsics.checkNotNullParameter(locale, "locale");
                            Intrinsics.checkNotNullParameter(locale, "locale");
                            String defValue = locale.getLanguage();
                            Intrinsics.checkNotNullExpressionValue(defValue, "getLanguage(...)");
                            Intrinsics.checkNotNullParameter(defValue, "lang");
                            try {
                                fa.a aVar2 = (fa.a) y3.m(fa.a.class, null, 6);
                                aVar2.getClass();
                                Intrinsics.checkNotNullParameter("language", "key");
                                Intrinsics.checkNotNullParameter(defValue, "defValue");
                                SharedPreferences sharedPref = aVar2.f9542b;
                                Intrinsics.checkNotNullParameter("language", "key");
                                Intrinsics.checkNotNullParameter(sharedPref, "sharedPref");
                                SharedPreferences.Editor edit = sharedPref.edit();
                                edit.putString("language", defValue);
                                edit.apply();
                                lang = defValue;
                            } catch (Exception unused) {
                            }
                            if (lang != null) {
                                String str3 = gc.d.f9945a;
                                gc.d.f9947c = lang;
                                Locale locale2 = zc.f.f25915f;
                                if (!Intrinsics.areEqual(lang, locale2.getLanguage())) {
                                    locale2 = zc.f.f25911b;
                                    if (!Intrinsics.areEqual(lang, locale2.getLanguage())) {
                                        locale2 = zc.f.f25914e;
                                        if (!Intrinsics.areEqual(lang, locale2.getLanguage())) {
                                            locale2 = zc.f.f25913d;
                                            if (!Intrinsics.areEqual(lang, locale2.getLanguage())) {
                                                locale2 = zc.f.f25912c;
                                                if (!Intrinsics.areEqual(lang, locale2.getLanguage())) {
                                                    locale2 = zc.f.f25910a;
                                                }
                                            }
                                        }
                                    }
                                }
                                Intrinsics.checkNotNullParameter(locale2, "locale");
                                gc.d.f9946b = locale2;
                                Intrinsics.checkNotNullParameter(lang, "lang");
                                gc.d.f9945a = lang;
                                activity.startActivity(new Intent(activity, (Class<?>) SplashActivity.class).addFlags(872448000));
                                activity.finish();
                                h0.k(activity);
                            }
                        }
                    }
                }
                return Unit.f19194a;
            case 1:
                SettingFragment settingFragment2 = this.f20887d;
                lf.a aVar3 = lf.a.f20034a;
                int i12 = this.f20886c;
                if (i12 == 0) {
                    h8.b.B(obj);
                    oe.k M2 = settingFragment2.M();
                    this.f20886c = 1;
                    M2.getClass();
                    m7.b bVar = new m7.b();
                    lg.e eVar = m0.f9201a;
                    obj = c0.A(lg.d.f20063c, new s(bVar, objArr2 == true ? 1 : 0, i10), this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ec.z zVar2 = (ec.z) settingFragment2.f22459a;
                if (zVar2 != null) {
                    zVar2.f9075d.setChecked(booleanValue);
                }
                return Unit.f19194a;
            case 2:
                SettingFragment settingFragment3 = this.f20887d;
                lf.a aVar4 = lf.a.f20034a;
                int i13 = this.f20886c;
                if (i13 == 0) {
                    h8.b.B(obj);
                    oe.k M3 = settingFragment3.M();
                    this.f20886c = 1;
                    M3.getClass();
                    m7.b bVar2 = new m7.b();
                    lg.e eVar2 = m0.f9201a;
                    obj = c0.A(lg.d.f20063c, new s(bVar2, objArr3 == true ? 1 : 0, i5), this);
                    if (obj == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                ec.z zVar3 = (ec.z) settingFragment3.f22459a;
                if (zVar3 != null) {
                    zVar3.f9084n.setChecked(booleanValue2);
                }
                return Unit.f19194a;
            case 3:
                SettingFragment settingFragment4 = this.f20887d;
                lf.a aVar5 = lf.a.f20034a;
                int i14 = this.f20886c;
                if (i14 == 0) {
                    h8.b.B(obj);
                    oe.k M4 = settingFragment4.M();
                    this.f20886c = 1;
                    M4.getClass();
                    k.b(new v(9));
                    obj = new j().b(this);
                    if (obj == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i14 != 1) {
                        if (i14 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        z5 = ((Boolean) obj).booleanValue();
                        zVar = (ec.z) settingFragment4.f22459a;
                        if (zVar != null) {
                            zVar.f9080i.setChecked(z5);
                        }
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                }
                if (!Intrinsics.areEqual((Boolean) obj, Boolean.FALSE)) {
                    oe.k M5 = settingFragment4.M();
                    this.f20886c = 2;
                    M5.getClass();
                    k.b(new v(9));
                    r rVar = new r();
                    lg.e eVar3 = m0.f9201a;
                    obj = c0.A(lg.d.f20063c, new o(rVar, objArr4 == true ? 1 : 0, i10), this);
                    if (obj == aVar5) {
                        return aVar5;
                    }
                    z5 = ((Boolean) obj).booleanValue();
                }
                zVar = (ec.z) settingFragment4.f22459a;
                if (zVar != null) {
                }
                return Unit.f19194a;
            default:
                SettingFragment settingFragment5 = this.f20887d;
                lf.a aVar6 = lf.a.f20034a;
                int i15 = this.f20886c;
                if (i15 == 0) {
                    h8.b.B(obj);
                    this.f20886c = 1;
                    if (c0.i(new f(settingFragment5, objArr5 == true ? 1 : 0, objArr == true ? 1 : 0), this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i15 != 1) {
                        if (i15 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                }
                this.f20886c = 2;
                if (SettingFragment.J(settingFragment5, this) == aVar6) {
                    return aVar6;
                }
                return Unit.f19194a;
        }
    }
}
