package defpackage;

import android.content.Context;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.compose.runtime.e;
import androidx.core.app.NotificationCompat;
import com.appsflyer.internal.i;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.internal.cast.zzxk;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.local_persistance.Brand;
import com.sofascore.local_persistance.BrandColors;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.results.R;
import com.sofascore.results.service.ProfileWorker;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vungle.ads.internal.protos.Sdk;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.annotation.Annotation;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlinx.serialization.KSerializer;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class sha {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;
    public static final /* synthetic */ int d = 0;

    public static final KClass A(Class cls) {
        cls.getClass();
        return duf.a.getOrCreateKotlinClass(cls);
    }

    public static final zy0 B(int i) {
        if (i == 0) {
            return zy0.a;
        }
        if (i == 1) {
            return zy0.b;
        }
        a70.p(lnb.k(i, "Could not convert ", " to BackoffPolicy"));
        return null;
    }

    public static final jbd C(int i) {
        if (i == 0) {
            return jbd.a;
        }
        if (i == 1) {
            return jbd.b;
        }
        if (i == 2) {
            return jbd.c;
        }
        if (i == 3) {
            return jbd.d;
        }
        if (i == 4) {
            return jbd.e;
        }
        if (Build.VERSION.SDK_INT >= 30 && i == 5) {
            return jbd.f;
        }
        a70.p(lnb.k(i, "Could not convert ", " to NetworkType"));
        return null;
    }

    public static final pwd D(int i) {
        if (i == 0) {
            return pwd.a;
        }
        if (i == 1) {
            return pwd.b;
        }
        a70.p(lnb.k(i, "Could not convert ", " to OutOfQuotaPolicy"));
        return null;
    }

    public static final sbl E(int i) {
        if (i == 0) {
            return sbl.a;
        }
        if (i == 1) {
            return sbl.b;
        }
        if (i == 2) {
            return sbl.c;
        }
        if (i == 3) {
            return sbl.d;
        }
        if (i == 4) {
            return sbl.e;
        }
        if (i == 5) {
            return sbl.f;
        }
        a70.p(lnb.k(i, "Could not convert ", " to State"));
        return null;
    }

    public static final boolean F(KeyEvent keyEvent) {
        return keyEvent.getAction() == 0 && !Character.isISOControl(keyEvent.getUnicodeChar());
    }

    public static void G(pgg pggVar, qkg qkgVar, String str) {
        if (pggVar != null) {
            String str2 = qkgVar.c;
            fjg.c().f(1);
            String name = qkgVar.name();
            int i = qkgVar.a;
            int i2 = qkgVar.b;
            qgg qggVar = (qgg) pggVar;
            ngg nggVar = qggVar.b;
            name.getClass();
            meg megVar = new meg(8);
            HashMap l = i.l(PglCryptUtils.KEY_MESSAGE, str2);
            if (str != null) {
                l.put("VASTResponse", str);
            }
            ljg.s(i, i2, "VASTCode", "smartCode", l);
            try {
                JSONObject f0 = hkg.f0(l);
                if (f0.length() > 0) {
                    megVar.b = f0;
                }
            } catch (JSONException unused) {
                fjg.c().f(1);
            }
            ckg a2 = nggVar.a(name, bkg.ERROR, "vast_error", qggVar.d, qggVar.c(megVar));
            if (a2 != null) {
                nggVar.e(a2, qggVar.e, qggVar.f, qggVar.a, qggVar.q, qggVar.p, qggVar.r, qggVar.t, false);
            }
        }
    }

    public static final xjc H(Context context, Event event) {
        String str;
        int id = event.getId();
        int id2 = Event.getHomeTeam$default(event, null, 1, null).getId();
        int id3 = Event.getAwayTeam$default(event, null, 1, null).getId();
        Integer display = Event.getHomeScore$default(event, null, 1, null).getDisplay();
        Integer display2 = Event.getAwayScore$default(event, null, 1, null).getDisplay();
        if (!ok3.z(event)) {
            str = null;
        } else if (hkg.c0(context)) {
            str = yid.m(Event.getAwayScore$default(event, null, 1, null).getPenalties()) + " - " + yid.m(Event.getHomeScore$default(event, null, 1, null).getPenalties()) + " " + context.getString(R.string.penalties_short);
        } else {
            str = context.getString(R.string.penalties_short) + " " + yid.m(Event.getHomeScore$default(event, null, 1, null).getPenalties()) + " - " + yid.m(Event.getAwayScore$default(event, null, 1, null).getPenalties());
        }
        return new xjc(id, id2, id3, display, display2, str, Event.getWinnerCode$default(event, null, 1, null));
    }

    public static final int I(jbd jbdVar) {
        int ordinal = jbdVar.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                i = 3;
                if (ordinal != 3) {
                    i = 4;
                    if (ordinal != 4) {
                        if (Build.VERSION.SDK_INT >= 30 && jbdVar == jbd.f) {
                            return 5;
                        }
                        sw9.o(jbdVar, " to int", "Could not convert ");
                        return 0;
                    }
                }
            }
        }
        return i;
    }

    public static final KSerializer J(KClass kClass, ArrayList arrayList, Function0 function0) {
        KSerializer xg0Var;
        utb utbVar;
        arrayList.getClass();
        fuf fufVar = duf.a;
        if (kClass.equals(fufVar.getOrCreateKotlinClass(Collection.class)) || kClass.equals(fufVar.getOrCreateKotlinClass(List.class)) || kClass.equals(fufVar.getOrCreateKotlinClass(List.class)) || kClass.equals(fufVar.getOrCreateKotlinClass(ArrayList.class))) {
            xg0Var = new xg0((KSerializer) arrayList.get(0), 0);
        } else if (kClass.equals(fufVar.getOrCreateKotlinClass(HashSet.class))) {
            xg0Var = new xg0((KSerializer) arrayList.get(0), 1);
        } else if (kClass.equals(fufVar.getOrCreateKotlinClass(Set.class)) || kClass.equals(fufVar.getOrCreateKotlinClass(Set.class)) || kClass.equals(fufVar.getOrCreateKotlinClass(LinkedHashSet.class))) {
            xg0Var = new xg0((KSerializer) arrayList.get(0), 2);
        } else if (kClass.equals(fufVar.getOrCreateKotlinClass(HashMap.class))) {
            xg0Var = new q79((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1), 0);
        } else if (kClass.equals(fufVar.getOrCreateKotlinClass(Map.class)) || kClass.equals(fufVar.getOrCreateKotlinClass(Map.class)) || kClass.equals(fufVar.getOrCreateKotlinClass(LinkedHashMap.class))) {
            xg0Var = new q79((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1), 1);
        } else {
            if (kClass.equals(fufVar.getOrCreateKotlinClass(Map.Entry.class))) {
                KSerializer kSerializer = (KSerializer) arrayList.get(0);
                KSerializer kSerializer2 = (KSerializer) arrayList.get(1);
                kSerializer.getClass();
                kSerializer2.getClass();
                utbVar = new utb(kSerializer, kSerializer2, 0);
            } else if (kClass.equals(fufVar.getOrCreateKotlinClass(Pair.class))) {
                KSerializer kSerializer3 = (KSerializer) arrayList.get(0);
                KSerializer kSerializer4 = (KSerializer) arrayList.get(1);
                kSerializer3.getClass();
                kSerializer4.getClass();
                utbVar = new utb(kSerializer3, kSerializer4, 1);
            } else if (kClass.equals(fufVar.getOrCreateKotlinClass(n1k.class))) {
                KSerializer kSerializer5 = (KSerializer) arrayList.get(0);
                KSerializer kSerializer6 = (KSerializer) arrayList.get(1);
                KSerializer kSerializer7 = (KSerializer) arrayList.get(2);
                kSerializer5.getClass();
                kSerializer6.getClass();
                kSerializer7.getClass();
                xg0Var = new q1k(kSerializer5, kSerializer6, kSerializer7);
            } else if (x(kClass).isArray()) {
                Object invoke = function0.invoke();
                invoke.getClass();
                xg0Var = l98.c((KClass) invoke, (KSerializer) arrayList.get(0));
            } else {
                xg0Var = null;
            }
            xg0Var = utbVar;
        }
        if (xg0Var != null) {
            return xg0Var;
        }
        KSerializer[] kSerializerArr = (KSerializer[]) arrayList.toArray(new KSerializer[0]);
        KSerializer[] kSerializerArr2 = (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length);
        return b0a.C(x(kClass), (KSerializer[]) Arrays.copyOf(kSerializerArr2, kSerializerArr2.length));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x038a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0392 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:215:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void K(ViewStructure viewStructure, wma wmaVar, AutofillId autofillId, String str, qqf qqfVar) {
        int i;
        long j;
        long j2;
        char c2;
        long j3;
        boolean z;
        vjj vjjVar;
        q80 q80Var;
        r00 r00Var;
        u5g u5gVar;
        uz uzVar;
        boolean z2;
        vp3 vp3Var;
        Boolean bool;
        boolean z3;
        Integer num;
        int i2;
        List list;
        Integer valueOf;
        boolean z4;
        boolean z5;
        String P;
        String[] A;
        String[] A2;
        long[] jArr;
        Object[] objArr;
        int i3;
        long[] jArr2;
        Object[] objArr2;
        vjj vjjVar2;
        q80 q80Var2;
        r00 r00Var2;
        u5g u5gVar2;
        a4h a4hVar = w3h.a;
        a4h a4hVar2 = k3h.a;
        l3h x = wmaVar.x();
        int i4 = 8;
        if (x != null) {
            x0d x0dVar = x.a;
            Object[] objArr3 = x0dVar.b;
            j = 128;
            Object[] objArr4 = x0dVar.c;
            long[] jArr3 = x0dVar.a;
            int length = jArr3.length - 2;
            i = 2;
            if (length >= 0) {
                z = true;
                int i5 = 0;
                uzVar = null;
                j2 = 255;
                z2 = false;
                vjjVar2 = null;
                q80Var2 = null;
                r00Var2 = null;
                vp3Var = null;
                bool = null;
                u5gVar2 = null;
                z3 = false;
                num = null;
                c2 = 7;
                while (true) {
                    long j4 = jArr3[i5];
                    j3 = -9187201950435737472L;
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                        for (int i7 = 0; i7 < i6; i7++) {
                            if ((j4 & 255) < 128) {
                                int i8 = (i5 << 3) + i7;
                                Object obj = objArr3[i8];
                                Object obj2 = objArr4[i8];
                                a4h a4hVar3 = (a4h) obj;
                                if (Intrinsics.c(a4hVar3, w3h.s)) {
                                    obj2.getClass();
                                    uzVar = (uz) obj2;
                                } else if (Intrinsics.c(a4hVar3, w3h.a)) {
                                    obj2.getClass();
                                    CharSequence charSequence = (String) CollectionsKt.firstOrNull((List) obj2);
                                    if (charSequence != null) {
                                        viewStructure.setContentDescription(charSequence);
                                    }
                                } else if (Intrinsics.c(a4hVar3, w3h.r)) {
                                    obj2.getClass();
                                    vp3Var = (vp3) obj2;
                                } else if (Intrinsics.c(a4hVar3, w3h.t)) {
                                    obj2.getClass();
                                    r00Var2 = (r00) obj2;
                                } else if (Intrinsics.c(a4hVar3, w3h.G)) {
                                    obj2.getClass();
                                    q80Var2 = (q80) obj2;
                                } else if (Intrinsics.c(a4hVar3, w3h.l)) {
                                    obj2.getClass();
                                    viewStructure.setFocused(((Boolean) obj2).booleanValue());
                                } else if (Intrinsics.c(a4hVar3, w3h.R)) {
                                    obj2.getClass();
                                    num = (Integer) obj2;
                                } else if (Intrinsics.c(a4hVar3, w3h.N)) {
                                    z3 = true;
                                } else if (Intrinsics.c(a4hVar3, w3h.o)) {
                                    obj2.getClass();
                                    z = ((Boolean) obj2).booleanValue();
                                } else if (Intrinsics.c(a4hVar3, w3h.z)) {
                                    obj2.getClass();
                                    u5gVar2 = (u5g) obj2;
                                } else if (Intrinsics.c(a4hVar3, w3h.K)) {
                                    obj2.getClass();
                                    bool = (Boolean) obj2;
                                } else if (Intrinsics.c(a4hVar3, w3h.L)) {
                                    obj2.getClass();
                                    vjjVar2 = (vjj) obj2;
                                } else if (Intrinsics.c(a4hVar3, k3h.b)) {
                                    viewStructure.setClickable(true);
                                } else if (Intrinsics.c(a4hVar3, k3h.c)) {
                                    viewStructure.setLongClickable(true);
                                } else if (Intrinsics.c(a4hVar3, k3h.w)) {
                                    viewStructure.setFocusable(true);
                                } else if (Intrinsics.c(a4hVar3, k3h.k)) {
                                    z2 = true;
                                }
                            }
                            j4 >>= 8;
                        }
                        if (i6 != 8) {
                            break;
                        }
                    }
                    if (i5 == length) {
                        break;
                    } else {
                        i5++;
                    }
                }
            } else {
                j2 = 255;
                c2 = 7;
                j3 = -9187201950435737472L;
                z = true;
                uzVar = null;
                z2 = false;
                vjjVar2 = null;
                q80Var2 = null;
                r00Var2 = null;
                vp3Var = null;
                bool = null;
                u5gVar2 = null;
                z3 = false;
                num = null;
            }
            vjjVar = vjjVar2;
            q80Var = q80Var2;
            r00Var = r00Var2;
            u5gVar = u5gVar2;
        } else {
            i = 2;
            j = 128;
            j2 = 255;
            c2 = 7;
            j3 = -9187201950435737472L;
            z = true;
            vjjVar = null;
            q80Var = null;
            r00Var = null;
            u5gVar = null;
            uzVar = null;
            z2 = false;
            vp3Var = null;
            bool = null;
            z3 = false;
            num = null;
        }
        l3h x2 = wmaVar.x();
        if (x2 != null && x2.c && !x2.d) {
            x2 = x2.c();
            l0d l0dVar = new l0d(((i1d) ((j0d) wmaVar.o()).b).c);
            l0dVar.c(wmaVar.o());
            while (l0dVar.i()) {
                wma wmaVar2 = (wma) l0dVar.k(l0dVar.b - 1);
                l3h x3 = wmaVar2.x();
                if (x3 != null && !x3.c) {
                    x2.e(x3);
                    if (!x3.d) {
                        l0dVar.c(wmaVar2.o());
                    }
                }
            }
        }
        if (x2 != null) {
            x0d x0dVar2 = x2.a;
            Object[] objArr5 = x0dVar2.b;
            Object[] objArr6 = x0dVar2.c;
            long[] jArr4 = x0dVar2.a;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                i2 = 1;
                int i9 = 0;
                list = null;
                while (true) {
                    long j5 = jArr4[i9];
                    int i10 = i4;
                    int i11 = i9;
                    if ((((~j5) << c2) & j5 & j3) != j3) {
                        int i12 = 8 - ((~(i11 - length2)) >>> 31);
                        int i13 = 0;
                        while (i13 < i12) {
                            if ((j5 & j2) < j) {
                                int i14 = (i11 << 3) + i13;
                                Object obj3 = objArr5[i14];
                                Object obj4 = objArr6[i14];
                                jArr2 = jArr4;
                                a4h a4hVar4 = (a4h) obj3;
                                objArr2 = objArr5;
                                if (Intrinsics.c(a4hVar4, w3h.j)) {
                                    viewStructure.setEnabled(false);
                                } else if (Intrinsics.c(a4hVar4, w3h.C)) {
                                    obj4.getClass();
                                    list = (List) obj4;
                                }
                            } else {
                                jArr2 = jArr4;
                                objArr2 = objArr5;
                            }
                            j5 >>= i10;
                            i13++;
                            objArr5 = objArr2;
                            jArr4 = jArr2;
                        }
                        jArr = jArr4;
                        objArr = objArr5;
                        i3 = i10;
                        if (i12 != i3) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        objArr = objArr5;
                        i3 = i10;
                    }
                    if (i11 == length2) {
                        break;
                    }
                    i9 = i11 + 1;
                    i4 = i3;
                    objArr5 = objArr;
                    jArr4 = jArr;
                }
                Integer valueOf2 = Integer.valueOf(wmaVar.b);
                if (wmaVar.v() == null) {
                    valueOf2 = null;
                }
                int intValue = valueOf2 == null ? valueOf2.intValue() : -1;
                viewStructure.setAutofillId(autofillId, intValue);
                viewStructure.setId(intValue, str, null, null);
                valueOf = uzVar == null ? Integer.valueOf(uzVar.a) : z2 ? Integer.valueOf(i2) : vjjVar != null ? Integer.valueOf(i) : null;
                if (valueOf != null) {
                    viewStructure.setAutofillType(valueOf.intValue());
                }
                if (q80Var != null) {
                    String str2 = q80Var.b;
                    if (str2.length() >= 5000) {
                        str2 = (Character.isHighSurrogate(str2.charAt(4999)) && Character.isLowSurrogate(str2.charAt(5000))) ? iii.H(4999, str2) : iii.H(5000, str2);
                    }
                    viewStructure.setAutofillValue(AutofillValue.forText(str2));
                }
                if (r00Var != null) {
                    viewStructure.setAutofillValue(r00Var.a);
                }
                if (vp3Var != null && (A2 = yso.A(vp3Var)) != null) {
                    viewStructure.setAutofillHints(A2);
                }
                qqfVar.b.G(wmaVar.b, new z1f(viewStructure));
                if (bool != null) {
                    viewStructure.setSelected(bool.booleanValue());
                }
                if (vjjVar == null) {
                    viewStructure.setCheckable(i2);
                    viewStructure.setChecked(vjjVar == vjj.a);
                } else if (bool != null && (u5gVar == null || u5gVar.a != 4)) {
                    viewStructure.setCheckable(true);
                    viewStructure.setChecked(bool.booleanValue());
                }
                vp3.a.getClass();
                String str3 = (String) ph0.z(yso.A(rp3.b));
                if (vp3Var != null || (A = yso.A(vp3Var)) == null) {
                    z4 = true;
                } else {
                    boolean v = ph0.v(A, str3);
                    z4 = true;
                    if (v) {
                        z5 = true;
                        boolean z6 = (!z3 || z5) ? z4 : false;
                        viewStructure.setDataIsSensitive((!z6 || z) ? z4 : false);
                        viewStructure.setVisibility(((wdd) wmaVar.F.e).m1() ? 4 : 0);
                        if (list != null) {
                            int size = list.size();
                            String str4 = "";
                            for (int i15 = 0; i15 < size; i15++) {
                                str4 = lnb.q(new StringBuilder(str4), ((q80) list.get(i15)).b, '\n');
                            }
                            viewStructure.setText(str4);
                            viewStructure.setClassName("android.widget.TextView");
                        }
                        if (((j0d) wmaVar.o()).isEmpty() && u5gVar != null && (P = yfa.P(u5gVar.a)) != null) {
                            viewStructure.setClassName(P);
                        }
                        if (z2) {
                            viewStructure.setClassName("android.widget.EditText");
                            if (Build.VERSION.SDK_INT >= 28 && num != null) {
                                c90.P(viewStructure, num.intValue());
                            }
                            if (z6) {
                                viewStructure.setInputType(129);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                z5 = false;
                if (z3) {
                }
                viewStructure.setDataIsSensitive((!z6 || z) ? z4 : false);
                viewStructure.setVisibility(((wdd) wmaVar.F.e).m1() ? 4 : 0);
                if (list != null) {
                }
                if (((j0d) wmaVar.o()).isEmpty()) {
                    viewStructure.setClassName(P);
                }
                if (z2) {
                }
            }
        }
        i2 = 1;
        list = null;
        Integer valueOf22 = Integer.valueOf(wmaVar.b);
        if (wmaVar.v() == null) {
        }
        if (valueOf22 == null) {
        }
        viewStructure.setAutofillId(autofillId, intValue);
        viewStructure.setId(intValue, str, null, null);
        if (uzVar == null) {
        }
        if (valueOf != null) {
        }
        if (q80Var != null) {
        }
        if (r00Var != null) {
        }
        if (vp3Var != null) {
            viewStructure.setAutofillHints(A2);
        }
        qqfVar.b.G(wmaVar.b, new z1f(viewStructure));
        if (bool != null) {
        }
        if (vjjVar == null) {
        }
        vp3.a.getClass();
        String str32 = (String) ph0.z(yso.A(rp3.b));
        if (vp3Var != null) {
        }
        z4 = true;
        z5 = false;
        if (z3) {
        }
        viewStructure.setDataIsSensitive((!z6 || z) ? z4 : false);
        viewStructure.setVisibility(((wdd) wmaVar.F.e).m1() ? 4 : 0);
        if (list != null) {
        }
        if (((j0d) wmaVar.o()).isEmpty()) {
        }
        if (z2) {
        }
    }

    public static void L(k74 k74Var) {
        k74Var.k = -3.4028235E38f;
        k74Var.j = Integer.MIN_VALUE;
        CharSequence charSequence = k74Var.a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                charSequence = SpannableString.valueOf(charSequence);
                k74Var.a = charSequence;
                k74Var.b = null;
            }
            charSequence.getClass();
            Spannable spannable = (Spannable) charSequence;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    public static final void M(String str) {
        System.err.println("SLF4J: " + str);
    }

    public static final void N(String str, Throwable th) {
        System.err.println(str);
        System.err.println("Reported exception:");
        th.printStackTrace();
    }

    public static l2k O(l2k l2kVar, String[] strArr, Map map) {
        int i = 0;
        if (l2kVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (l2k) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                l2k l2kVar2 = new l2k();
                int length = strArr.length;
                while (i < length) {
                    l2kVar2.a((l2k) map.get(strArr[i]));
                    i++;
                }
                return l2kVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                l2kVar.a((l2k) map.get(strArr[0]));
                return l2kVar;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    l2kVar.a((l2k) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return l2kVar;
    }

    public static float P(int i, float f, int i2, int i3) {
        float f2;
        if (f == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i == 0) {
            f2 = i3;
        } else {
            if (i != 1) {
                if (i != 2) {
                    return -3.4028235E38f;
                }
                return f;
            }
            f2 = i2;
        }
        return f * f2;
    }

    public static final KSerializer Q(p5c p5cVar, KType kType) {
        p5cVar.getClass();
        kType.getClass();
        KSerializer S = S(p5cVar, kType, true);
        if (S != null) {
            return S;
        }
        throw new v5h(s9a.E(s9a.z(kType)));
    }

    public static final KSerializer R(KClass kClass) {
        kClass.getClass();
        KSerializer U = U(kClass);
        if (U != null) {
            return U;
        }
        throw new v5h(s9a.E(kClass));
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0063, code lost:
    
        if (r7 != null) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final KSerializer S(p5c p5cVar, KType kType, boolean z) {
        KSerializer kSerializer;
        KSerializer kSerializer2;
        KSerializer a0fVar;
        KClass z2 = s9a.z(kType);
        boolean isMarkedNullable = kType.isMarkedNullable();
        List<KTypeProjection> arguments = kType.getArguments();
        ArrayList arrayList = new ArrayList(k13.r(arguments, 10));
        for (KTypeProjection kTypeProjection : arguments) {
            kTypeProjection.getClass();
            KType type = kTypeProjection.getType();
            if (type == null) {
                hg6.e(kTypeProjection.getType(), "Star projections in type arguments are not allowed, but had ");
                return null;
            }
            arrayList.add(type);
        }
        if (arrayList.isEmpty()) {
            if (!x(z2).isInterface() || p5cVar.g(z2, km5.a) == null) {
                d6h d6hVar = e6h.a;
                kSerializer = !isMarkedNullable ? e6h.a.j(z2) : e6h.b.j(z2);
                if (kSerializer == null) {
                    return kSerializer;
                }
                if (arrayList.isEmpty()) {
                    kSerializer2 = U(z2);
                    if (kSerializer2 == null && (kSerializer2 = p5cVar.g(z2, km5.a)) == null) {
                        if (x(z2).isInterface()) {
                            a0fVar = new a0f(z2);
                            kSerializer2 = a0fVar;
                        }
                        kSerializer2 = null;
                    }
                    if (kSerializer2 != null) {
                        return isMarkedNullable ? l98.W(kSerializer2) : kSerializer2;
                    }
                } else {
                    ArrayList V = V(p5cVar, arrayList, z);
                    if (V != null) {
                        KSerializer J = J(z2, V, new f6h(arrayList, 0));
                        if (J == null) {
                            kSerializer2 = p5cVar.g(z2, V);
                            if (kSerializer2 == null) {
                                if (x(z2).isInterface()) {
                                    a0fVar = new a0f(z2);
                                    kSerializer2 = a0fVar;
                                }
                                kSerializer2 = null;
                            }
                        } else {
                            kSerializer2 = J;
                        }
                        if (kSerializer2 != null) {
                        }
                    }
                }
                return null;
            }
            kSerializer = null;
            if (kSerializer == null) {
            }
        } else {
            if (!p5cVar.a) {
                d6h d6hVar2 = e6h.a;
                Object d2 = !isMarkedNullable ? e6h.c.d(z2, arrayList) : e6h.d.d(z2, arrayList);
                p2g p2gVar = w2g.b;
                if (d2 instanceof u2g) {
                    d2 = null;
                }
                kSerializer = (KSerializer) d2;
                if (kSerializer == null) {
                }
            }
            kSerializer = null;
            if (kSerializer == null) {
            }
        }
    }

    public static final KSerializer T(p5c p5cVar, KType kType) {
        p5cVar.getClass();
        kType.getClass();
        return S(p5cVar, kType, false);
    }

    public static final KSerializer U(KClass kClass) {
        kClass.getClass();
        KSerializer C = b0a.C(x(kClass), (KSerializer[]) Arrays.copyOf(new KSerializer[0], 0));
        return C == null ? (KSerializer) h7f.a.get(kClass) : C;
    }

    public static final ArrayList V(p5c p5cVar, List list, boolean z) {
        p5cVar.getClass();
        if (z) {
            ArrayList arrayList = new ArrayList(k13.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Q(p5cVar, (KType) it.next()));
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(k13.r(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            KSerializer T = T(p5cVar, (KType) it2.next());
            if (T == null) {
                return null;
            }
            arrayList2.add(T);
        }
        return arrayList2;
    }

    public static final byte[] W(Set set) {
        set.getClass();
        if (set.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ym3 ym3Var = (ym3) it.next();
                    objectOutputStream.writeUTF(ym3Var.a.toString());
                    objectOutputStream.writeBoolean(ym3Var.b);
                }
                Unit unit = Unit.a;
                objectOutputStream.close();
                byteArrayOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArray.getClass();
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    public static final int X(sbl sblVar) {
        sblVar.getClass();
        int ordinal = sblVar.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                i = 3;
                if (ordinal != 3) {
                    i = 4;
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return 5;
                        }
                        zzl.b();
                        return 0;
                    }
                }
            }
        }
        return i;
    }

    public static final nad Y(byte[] bArr) {
        bArr.getClass();
        if (Build.VERSION.SDK_INT < 28 || bArr.length == 0) {
            return new nad(null);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int readInt = objectInputStream.readInt();
                int[] iArr = new int[readInt];
                for (int i = 0; i < readInt; i++) {
                    iArr[i] = objectInputStream.readInt();
                }
                int readInt2 = objectInputStream.readInt();
                int[] iArr2 = new int[readInt2];
                for (int i2 = 0; i2 < readInt2; i2++) {
                    iArr2[i2] = objectInputStream.readInt();
                }
                nad j = c90.j(iArr2, iArr);
                objectInputStream.close();
                byteArrayInputStream.close();
                return j;
            } finally {
            }
        } finally {
        }
    }

    public static String Z(zzxk zzxkVar) {
        StringBuilder sb = new StringBuilder(zzxkVar.m());
        for (int i = 0; i < zzxkVar.m(); i++) {
            byte c2 = zzxkVar.c(i);
            if (c2 == 34) {
                sb.append("\\\"");
            } else if (c2 == 39) {
                sb.append("\\'");
            } else if (c2 != 92) {
                switch (c2) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (c2 < 32 || c2 > 126) {
                            sb.append('\\');
                            sb.append((char) (((c2 >>> 6) & 3) + 48));
                            sb.append((char) (((c2 >>> 3) & 7) + 48));
                            sb.append((char) ((c2 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) c2);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(int i, int i2, of3 of3Var, xtc xtcVar, String str) {
        int i3;
        xtc xtcVar2;
        av8 av8Var;
        eqf u;
        str.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1011348286);
        if ((i & 6) == 0) {
            i3 = (av8Var2.g(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            xtcVar2 = xtcVar;
            i3 |= av8Var2.g(xtcVar2) ? 32 : 16;
            if (av8Var2.T(i3 & 1, (i3 & 19) == 18)) {
                av8Var = av8Var2;
                av8Var.W();
            } else {
                xtc xtcVar3 = i4 != 0 ? utc.a : xtcVar2;
                yf8 yf8Var = xth.a;
                av8Var = av8Var2;
                udj.c(str, l98.f0(bkh.d(xtcVar3, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6.0f, 5), lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, new p7j(5), 0L, 2, false, 1, 0, null, xth.j(), av8Var, i3 & 14, 24960, 109560);
                xtcVar2 = xtcVar3;
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new gcb(str, xtcVar2, i, i2);
                return;
            }
            return;
        }
        xtcVar2 = xtcVar;
        if (av8Var2.T(i3 & 1, (i3 & 19) == 18)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void b(mwb mwbVar, Brand brand, fwb fwbVar, qwb qwbVar, xtc xtcVar, Function1 function1, of3 of3Var, int i) {
        av8 av8Var;
        xtc xtcVar2;
        int i2;
        w3f w3fVar;
        brand.getClass();
        qwbVar.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1046534519);
        int i3 = i | (av8Var2.g(mwbVar) ? 4 : 2) | (av8Var2.i(brand) ? 32 : 16) | (av8Var2.g(fwbVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.g(qwbVar) ? a.o : 1024) | 24576 | (av8Var2.i(function1) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE);
        if (av8Var2.T(i3 & 1, (74899 & i3) != 74898)) {
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = e.f(Boolean.FALSE);
                av8Var2.n0(O);
            }
            e1d e1dVar = (e1d) O;
            boolean z = fwbVar instanceof dwb;
            String str = null;
            ewb ewbVar = fwbVar instanceof ewb ? (ewb) fwbVar : null;
            if (ewbVar != null && (w3fVar = ewbVar.b) != null) {
                str = w3fVar.g;
            }
            boolean z2 = str != null;
            Object O2 = av8Var2.O();
            if (O2 == a99Var) {
                O2 = new wla();
                av8Var2.n0(O2);
            }
            wla wlaVar = (wla) O2;
            utc utcVar = utc.a;
            xtc u0 = hkg.u0(b6a.s(bkh.d(utcVar, 1.0f), wlaVar), hkg.o0(av8Var2), false, 14);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var2, 0);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, u0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a2, hf3.g);
            waa.K(av8Var2, m, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var2, hf3.k);
            waa.K(av8Var2, C, hf3.d);
            int i4 = i3 & 14;
            int i5 = i3 >> 3;
            d(mwbVar, brand, qwbVar, wlaVar, null, av8Var2, (i3 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | (i5 & 896));
            nq8.h(av8Var2, bkh.e(utcVar, 16.0f));
            e(6, av8Var2, l98.d0(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2));
            nq8.h(av8Var2, bkh.e(utcVar, 4.0f));
            int i6 = (i3 >> 6) & 14;
            h(fwbVar, l98.d0(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), av8Var2, i6 | 48);
            nq8.h(av8Var2, bkh.e(utcVar, 16.0f));
            boolean booleanValue = ((Boolean) e1dVar.getValue()).booleanValue();
            int i7 = 458752 & i3;
            boolean z3 = i7 == 131072;
            Object O3 = av8Var2.O();
            if (z3 || O3 == a99Var) {
                i2 = 1;
                O3 = new xz4(function1, e1dVar, i2);
                av8Var2.n0(O3);
            } else {
                i2 = 1;
            }
            Function1 function12 = (Function1) O3;
            int i8 = i7 == 131072 ? i2 : 0;
            Object O4 = av8Var2.O();
            if (i8 != 0 || O4 == a99Var) {
                O4 = new uj8(16, function1);
                av8Var2.n0(O4);
            }
            int i9 = i3 << 3;
            int i10 = i6 | (i9 & 112);
            int i11 = i9 & 896;
            g(fwbVar, mwbVar, brand, wlaVar, booleanValue, function12, (Function1) O4, null, av8Var2, i10 | i11);
            nq8.h(av8Var2, bkh.e(utcVar, 16.0f));
            f(mwbVar, fwbVar, brand, qwbVar, z || z2, function1, l98.d0(bkh.d(utcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), av8Var2, i4 | 1572864 | (i5 & 112) | i11 | (i3 & 7168) | i7);
            String g = bf3.g(8.0f, R.string.maybe_later, av8Var2, av8Var2, utcVar);
            xtc d0 = l98.d0(bkh.d(utcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            boolean z4 = i7 == 131072;
            Object O5 = av8Var2.O();
            if (z4 || O5 == a99Var) {
                O5 = new l77(27, function1);
                av8Var2.n0(O5);
            }
            mha.h(g, (Function0) O5, d0, gqh.a, null, false, false, false, 0L, 0, 0, av8Var2, 3456, 0, 2032);
            av8Var = av8Var2;
            w1l.s(utcVar, 16.0f, av8Var, true);
            xtcVar2 = utcVar;
        } else {
            av8Var = av8Var2;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new e44(mwbVar, brand, fwbVar, qwbVar, xtcVar2, function1, i, 8);
        }
    }

    public static final void c(mnb mnbVar, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1913651405);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(mnbVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        int i4 = 1;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            xtcVar = utc.a;
            xtc d2 = bkh.d(xtcVar, 1.0f);
            u23 a2 = t23.a(ww9.d, uxf.p, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, d2);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            nq8.h(av8Var, bkh.e(xtcVar, 8.0f));
            e12.a(0, av8Var, n9e.q(bkh.m(xtcVar, 48.0f, 4.0f), lz.D(R.color.n_lv_4, av8Var), o7g.a(20.0f)));
            t62.h(l98.c0(bkh.d(xtcVar, 1.0f), 16.0f, 24.0f), mnbVar.a.a(av8Var), mnbVar.b.a(av8Var), s6a.N(R.drawable.check_back_later, 6, av8Var), null, false, 0L, av8Var, 6, 112);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new p8b(mnbVar, xtcVar, i, i4);
        }
    }

    public static final void d(mwb mwbVar, Brand brand, qwb qwbVar, wla wlaVar, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        xtc xtcVar2;
        Context context;
        r13 r13Var;
        long j;
        utc utcVar;
        zg3 zg3Var;
        int i3;
        ry ryVar;
        f50 f50Var;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1965558522);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(mwbVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.i(brand) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? av8Var.g(qwbVar) : av8Var.i(qwbVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? av8Var.g(wlaVar) : av8Var.i(wlaVar) ? a.o : 1024;
        }
        int i4 = i2 | 24576;
        if (av8Var.T(i4 & 1, (i4 & 9363) != 9362)) {
            Context context2 = (Context) av8Var.k(nz.b);
            utc utcVar2 = utc.a;
            xtc d2 = bkh.d(utcVar2, 1.0f);
            BrandColors color = brand.getColor();
            if (color == null) {
                av8Var.d0(-1629852131);
                av8Var.s(false);
                r13Var = null;
                context = context2;
            } else {
                av8Var.d0(-883859868);
                context = context2;
                long D = tz9.D(color, av8Var);
                av8Var.s(false);
                r13Var = new r13(D);
            }
            if (r13Var == null) {
                j = ljg.f(av8Var, -883859420, R.color.error, av8Var, false);
            } else {
                av8Var.d0(-883860257);
                av8Var.s(false);
                j = r13Var.a;
            }
            xtc q = n9e.q(d2, j, oyn.e);
            u23 a2 = t23.a(ww9.d, uxf.p, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, q);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
            } else {
                av8Var.q0();
            }
            f50 f50Var2 = hf3.g;
            waa.K(av8Var, a2, f50Var2);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var3 = hf3.j;
            waa.K(av8Var, valueOf, f50Var3);
            ry ryVar2 = hf3.k;
            waa.J(av8Var, ryVar2);
            f50 f50Var4 = hf3.d;
            waa.K(av8Var, C, f50Var4);
            nq8.h(av8Var, bkh.e(utcVar2, 8.0f));
            e12.a(0, av8Var, n9e.q(bkh.m(utcVar2, 48.0f, 4.0f), lz.D(R.color.on_color_secondary, av8Var), o7g.a(20.0f)));
            nq8.h(av8Var, bkh.e(utcVar2, 24.0f));
            if (qwbVar instanceof pwb) {
                av8Var.d0(346116521);
                String v = oea.v(R.string.sofascore_partner, av8Var);
                yf8 yf8Var = xth.a;
                ryVar = ryVar2;
                zg3Var = zg3Var2;
                f50Var = f50Var3;
                utcVar = utcVar2;
                i3 = 0;
                udj.c(v, null, lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 131066);
                av8Var = av8Var;
                w1l.s(utcVar, 8.0f, av8Var, false);
            } else {
                utcVar = utcVar2;
                zg3Var = zg3Var2;
                i3 = 0;
                ryVar = ryVar2;
                f50Var = f50Var3;
                av8Var.d0(346371186);
                av8Var.s(false);
            }
            int id = brand.getId();
            xtc e = bkh.e(utcVar, 64.0f);
            long D2 = lz.D(R.color.n_lv_4, av8Var);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = mz1.e(av8Var);
            }
            wzc wzcVar = (wzc) O;
            Object[] objArr = new Object[i3];
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = jxa.j;
                av8Var.n0(O2);
            }
            utc utcVar3 = utcVar;
            ry ryVar3 = ryVar;
            zg3 zg3Var3 = zg3Var;
            f50 f50Var5 = f50Var;
            Context context3 = context;
            av8 av8Var2 = av8Var;
            xtc y = tol.y(e, true, true, true, D2, wzcVar, new e32((boh) o3a.N(objArr, (Function0) O2, av8Var, 48), context3, mwbVar, brand, 5), av8Var2, 0);
            int i5 = i4 & 14;
            boolean i6 = av8Var2.i(context3) | (i5 == 4) | av8Var2.i(brand);
            Object O3 = av8Var2.O();
            if (i6 || O3 == a99Var) {
                O3 = new l97(14, context3, mwbVar, brand);
                av8Var2.n0(O3);
            }
            td4.g(id, 0, av8Var2, bea.P(y, wlaVar, (Function0) O3, av8Var2, ((i4 >> 6) & 112) | 384, 4));
            nq8.h(av8Var2, bkh.e(utcVar3, 16.0f));
            tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 12, lz.D(R.color.on_color_secondary, av8Var2), 0L, av8Var2, bkh.p(utcVar3, 104.0f));
            nq8.h(av8Var2, bkh.e(utcVar3, 6.0f));
            lv1 lv1Var = uxf.m;
            xtc d0 = l98.d0(bkh.g(bkh.d(utcVar3, 1.0f), 40.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 32.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            l8g a3 = k8g.a(ww9.b, lv1Var, av8Var2, 48);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, d0);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var3);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a3, f50Var2);
            waa.K(av8Var2, m2, ff3Var);
            bf3.s(hashCode2, av8Var2, f50Var5, av8Var2, ryVar3);
            waa.K(av8Var2, C2, f50Var4);
            td4.y(mwbVar.b, 0, 12, av8Var2, n9e.q(bkh.l(utcVar3, 24.0f), lz.D(R.color.surface_1, av8Var2), o7g.a(4.0f)), null, false);
            nq8.h(av8Var2, bkh.p(utcVar3, 16.0f));
            String str = mwbVar.c;
            yf8 yf8Var2 = xth.a;
            udj.c(str, null, lz.D(R.color.on_color_primary, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var2, 0, 0, 131066);
            av8Var = av8Var2;
            av8Var.s(true);
            i(mwbVar, l98.f0(bkh.d(utcVar3, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 24.0f, 5), av8Var, i5 | 48);
            av8Var.s(true);
            xtcVar2 = utcVar3;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new s52(mwbVar, brand, qwbVar, wlaVar, xtcVar2, i, 11);
        }
    }

    public static final void e(int i, of3 of3Var, xtc xtcVar) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1259248070);
        if (av8Var.T(i & 1, (i & 3) != 2)) {
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, xtcVar);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            d7e t = haa.t(R.drawable.ic_mvp_badge, 0, av8Var);
            utc utcVar = utc.a;
            wkn.k(t, null, bkh.l(utcVar, 16.0f), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 440, 120);
            String upperCase = fc6.f(4.0f, R.string.match_of_the_week, av8Var, av8Var, utcVar).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            yf8 yf8Var = xth.a;
            udj.c(upperCase, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.c(), av8Var, 0, 0, 131066);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new l63(xtcVar, i, 19);
        }
    }

    public static final void f(mwb mwbVar, fwb fwbVar, Brand brand, qwb qwbVar, boolean z, Function1 function1, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        Function1 function12;
        av8 av8Var;
        int i3;
        String v;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-738333165);
        if ((i & 6) == 0) {
            i2 = (av8Var2.g(mwbVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? av8Var2.g(fwbVar) : av8Var2.i(fwbVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var2.i(brand) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? av8Var2.g(qwbVar) : av8Var2.i(qwbVar) ? a.o : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= av8Var2.h(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            function12 = function1;
            i2 |= av8Var2.i(function12) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        } else {
            function12 = function1;
        }
        if ((1572864 & i) == 0) {
            i2 |= av8Var2.g(xtcVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i4 = i2;
        if (av8Var2.T(i4 & 1, (599187 & i4) != 599186)) {
            Context context = (Context) av8Var2.k(nz.b);
            if (fwbVar instanceof dwb) {
                av8Var2.d0(-868554420);
                v = oea.w(R.string.bet_on_provider, new Object[]{brand.getName()}, av8Var2);
                av8Var2.s(false);
            } else {
                if (!(fwbVar instanceof ewb)) {
                    throw dmi.h(av8Var2, -868556514, false);
                }
                av8Var2.d0(-1155250500);
                if (Intrinsics.c(qwbVar, owb.a)) {
                    v = ljg.k(av8Var2, -868547902, R.string.super_odds_unlock, av8Var2, false);
                } else {
                    if (!(qwbVar instanceof pwb)) {
                        throw dmi.h(av8Var2, -868550138, false);
                    }
                    av8Var2.d0(-868544603);
                    int i5 = lwb.a[((pwb) qwbVar).a.ordinal()];
                    if (i5 == 1) {
                        i3 = R.string.partner_watch_live;
                    } else if (i5 == 2) {
                        i3 = R.string.partner_shop_now;
                    } else if (i5 == 3) {
                        i3 = R.string.partner_enter_giveaway;
                    } else {
                        if (i5 != 4) {
                            zzl.b();
                            return;
                        }
                        i3 = R.string.see_more;
                    }
                    v = oea.v(i3, av8Var2);
                    av8Var2.s(false);
                }
                av8Var2.s(false);
            }
            String str = v;
            boolean i6 = ((i4 & 112) == 32 || ((i4 & 64) != 0 && av8Var2.i(fwbVar))) | ((i4 & 7168) == 2048 || ((i4 & 4096) != 0 && av8Var2.i(qwbVar))) | ((i4 & 458752) == 131072) | av8Var2.i(context) | ((i4 & 14) == 4) | av8Var2.i(brand);
            Object O = av8Var2.O();
            if (i6 || O == nf3.a) {
                f05 f05Var = new f05(fwbVar, qwbVar, function12, context, mwbVar, brand);
                av8Var2.n0(f05Var);
                O = f05Var;
            }
            mha.h(str, (Function0) O, xtcVar, kqh.a, null, z, false, false, 0L, 0, 0, av8Var2, ((i4 >> 12) & 896) | 3072 | ((i4 << 3) & 458752), 0, 2000);
            av8Var = av8Var2;
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new et2(mwbVar, fwbVar, brand, qwbVar, z, function1, xtcVar, i);
        }
    }

    public static boolean f0(byte b2) {
        return b2 > -65;
    }

    public static final void g(fwb fwbVar, final mwb mwbVar, final Brand brand, final wla wlaVar, boolean z, Function1 function1, Function1 function12, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        final boolean z2;
        final Function1 function13;
        final Function1 function14;
        av8 av8Var;
        xtc xtcVar2;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(286501264);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? av8Var2.g(fwbVar) : av8Var2.i(fwbVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var2.g(mwbVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var2.i(brand) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? av8Var2.g(wlaVar) : av8Var2.i(wlaVar) ? a.o : 1024;
        }
        if ((i & 24576) == 0) {
            z2 = z;
            i2 |= av8Var2.h(z2) ? 16384 : 8192;
        } else {
            z2 = z;
        }
        if ((196608 & i) == 0) {
            function13 = function1;
            i2 |= av8Var2.i(function13) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        } else {
            function13 = function1;
        }
        if ((1572864 & i) == 0) {
            function14 = function12;
            i2 |= av8Var2.i(function14) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            function14 = function12;
        }
        int i3 = 12582912 | i2;
        if (av8Var2.T(i3 & 1, (4793491 & i3) != 4793490)) {
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = new abb(24);
                av8Var2.n0(O);
            }
            Function1 function15 = (Function1) O;
            Object O2 = av8Var2.O();
            if (O2 == a99Var) {
                O2 = new abb(25);
                av8Var2.n0(O2);
            }
            av8Var = av8Var2;
            utc utcVar = utc.a;
            l98.b(fwbVar, utcVar, function15, null, "matchOfTheWeekReveal", (Function1) O2, yqo.H(1215692935, av8Var2, new et8() { // from class: kwb
                @Override // defpackage.et8
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    fwb fwbVar2 = (fwb) obj2;
                    of3 of3Var2 = (of3) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    ((k60) obj).getClass();
                    fwbVar2.getClass();
                    boolean z3 = fwbVar2 instanceof dwb;
                    mwb mwbVar2 = mwb.this;
                    if (z3) {
                        av8 av8Var3 = (av8) of3Var2;
                        av8Var3.d0(1544094316);
                        sha.j(mwbVar2, brand, (dwb) fwbVar2, wlaVar, null, av8Var3, (intValue << 3) & 896);
                        av8Var3.s(false);
                    } else {
                        if (!(fwbVar2 instanceof ewb)) {
                            throw dmi.h((av8) of3Var2, 49807342, false);
                        }
                        av8 av8Var4 = (av8) of3Var2;
                        av8Var4.d0(1544373254);
                        sha.k(mwbVar2, ((ewb) fwbVar2).b, z2, function13, function14, null, av8Var4, 0);
                        av8Var4.s(false);
                    }
                    return Unit.a;
                }
            }), av8Var, (i3 & 14) | 1794432 | ((i3 >> 18) & 112), 8);
            xtcVar2 = utcVar;
        } else {
            av8Var = av8Var2;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new b87(fwbVar, mwbVar, brand, wlaVar, z, function1, function12, xtcVar2, i);
        }
    }

    public static final void h(fwb fwbVar, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        fwb fwbVar2;
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1539512695);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? av8Var.g(fwbVar) : av8Var.i(fwbVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = new abb(26);
                av8Var.n0(O);
            }
            Function1 function1 = (Function1) O;
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = new abb(23);
                av8Var.n0(O2);
            }
            fwbVar2 = fwbVar;
            xtcVar2 = xtcVar;
            l98.b(fwbVar2, xtcVar2, function1, null, "matchOfTheWeekTitle", (Function1) O2, dy0.i, av8Var, (i2 & 14) | 1794432 | (i2 & 112), 8);
        } else {
            fwbVar2 = fwbVar;
            xtcVar2 = xtcVar;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new p8b(fwbVar2, xtcVar2, i, i3);
        }
    }

    public static final void i(mwb mwbVar, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        swb swbVar;
        ry ryVar;
        ff3 ff3Var;
        f50 f50Var;
        f50 f50Var2;
        zg3 zg3Var;
        utc utcVar;
        swb swbVar2;
        f50 f50Var3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(2141366323);
        if ((i & 6) == 0) {
            i2 = i | (av8Var.g(mwbVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            p4h p4hVar = ww9.d;
            u23 a2 = t23.a(p4hVar, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, xtcVar);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
            } else {
                av8Var.q0();
            }
            f50 f50Var4 = hf3.g;
            waa.K(av8Var, a2, f50Var4);
            ff3 ff3Var2 = hf3.f;
            waa.K(av8Var, m, ff3Var2);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var5 = hf3.j;
            waa.K(av8Var, valueOf, f50Var5);
            ry ryVar2 = hf3.k;
            waa.J(av8Var, ryVar2);
            f50 f50Var6 = hf3.d;
            waa.K(av8Var, C, f50Var6);
            utc utcVar2 = utc.a;
            xtc d0 = l98.d0(bkh.d(utcVar2, 1.0f), 64.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            ng0 ng0Var = new ng0(8.0f, true, new a70(6));
            lv1 lv1Var = uxf.l;
            l8g a3 = k8g.a(ng0Var, lv1Var, av8Var, 54);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, d0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var4);
            waa.K(av8Var, m2, ff3Var2);
            bf3.s(hashCode2, av8Var, f50Var5, av8Var, ryVar2);
            waa.K(av8Var, C2, f50Var6);
            Set set = wyh.a;
            String str = mwbVar.h;
            swb swbVar3 = mwbVar.e;
            swb swbVar4 = mwbVar.d;
            if (wyh.e(str)) {
                av8Var.d0(75018819);
                td4.J(swbVar4.a, 48, av8Var, bkh.l(utcVar2, 48.0f));
                av8Var.s(false);
                ryVar = ryVar2;
                f50Var2 = f50Var5;
                utcVar = utcVar2;
                f50Var = f50Var6;
                swbVar = swbVar3;
                swbVar2 = swbVar4;
                ff3Var = ff3Var2;
                zg3Var = zg3Var2;
                f50Var3 = f50Var4;
            } else {
                av8Var.d0(75189226);
                swbVar = swbVar3;
                ryVar = ryVar2;
                ff3Var = ff3Var2;
                f50Var = f50Var6;
                f50Var2 = f50Var5;
                zg3Var = zg3Var2;
                utcVar = utcVar2;
                swbVar2 = swbVar4;
                f50Var3 = f50Var4;
                td4.G(swbVar4.a, bkh.l(utcVar2, 48.0f), false, 0L, av8Var, 48, 12);
                av8Var.s(false);
            }
            kv1 kv1Var = uxf.p;
            xtc f0 = l98.f0(new goa(1.0f, true), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 5);
            u23 a4 = t23.a(p4hVar, kv1Var, av8Var, 48);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, f0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a4, f50Var3);
            waa.K(av8Var, m3, ff3Var);
            f50 f50Var7 = f50Var2;
            bf3.s(hashCode3, av8Var, f50Var7, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var);
            String str2 = mwbVar.f;
            yf8 yf8Var = xth.a;
            zg3 zg3Var3 = zg3Var;
            f50 f50Var8 = f50Var3;
            ff3 ff3Var3 = ff3Var;
            swb swbVar5 = swbVar2;
            swb swbVar6 = swbVar;
            ry ryVar3 = ryVar;
            f50 f50Var9 = f50Var;
            udj.c(str2, null, lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.i(), av8Var, 0, 0, 131066);
            udj.c(mwbVar.g, null, lz.D(R.color.on_color_secondary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.e(), av8Var, 0, 0, 131066);
            av8Var.s(true);
            utc utcVar3 = utcVar;
            td4.G(swbVar6.a, bkh.l(utcVar3, 48.0f), false, 0L, av8Var, 48, 12);
            av8Var.s(true);
            xtc d02 = l98.d0(bkh.d(utcVar3, 1.0f), 28.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            l8g a5 = k8g.a(ww9.h, lv1Var, av8Var, 6);
            int hashCode4 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C4 = fqj.C(av8Var, d02);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var3);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a5, f50Var8);
            waa.K(av8Var, m4, ff3Var3);
            bf3.s(hashCode4, av8Var, f50Var7, av8Var, ryVar3);
            waa.K(av8Var, C4, f50Var9);
            udj.c(swbVar5.b, bkh.p(utcVar3, 120.0f), lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, xth.k(), av8Var, 48, 24960, 109560);
            udj.c(swbVar6.b, bkh.p(utcVar3, 120.0f), lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, xth.k(), av8Var, 48, 24960, 109560);
            av8Var = av8Var;
            av8Var.s(true);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new p8b(mwbVar, xtcVar, i, 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [int] */
    public static final void j(mwb mwbVar, Brand brand, dwb dwbVar, wla wlaVar, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        xtc xtcVar2;
        Context context;
        float f;
        int i3;
        utc utcVar;
        ?? r9;
        boolean z;
        float f2;
        boolean z2;
        utc utcVar2;
        int i4;
        Unit unit;
        boolean z3;
        boolean z4;
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1210654701);
        if ((i & 6) == 0) {
            i2 = (av8Var2.g(mwbVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var2.i(brand) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var2.g(dwbVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? av8Var2.g(wlaVar) : av8Var2.i(wlaVar) ? a.o : 1024;
        }
        int i5 = i2 | 24576;
        if (av8Var2.T(i5 & 1, (i5 & 9363) != 9362)) {
            Context context2 = (Context) av8Var2.k(nz.b);
            int i6 = ke0.c;
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var2, 0);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            utc utcVar3 = utc.a;
            xtc C = fqj.C(av8Var2, utcVar3);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var2, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var2, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var2, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var2, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var2, C, f50Var3);
            if (zu3.k.hasMcc(Integer.valueOf(i6))) {
                av8Var2.d0(-1519899974);
                xtc d0 = l98.d0(new we9(uxf.q), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                l8g a3 = k8g.a(ww9.b, uxf.l, av8Var2, 0);
                int hashCode2 = Long.hashCode(av8Var2.T);
                aee m2 = av8Var2.m();
                xtc C2 = fqj.C(av8Var2, d0);
                av8Var2.h0();
                i3 = i6;
                if (av8Var2.S) {
                    av8Var2.l(zg3Var);
                } else {
                    av8Var2.q0();
                }
                waa.K(av8Var2, a3, f50Var);
                waa.K(av8Var2, m2, ff3Var);
                bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
                waa.K(av8Var2, C2, f50Var3);
                utcVar = utcVar3;
                f = 16.0f;
                context = context2;
                wkn.k(haa.t(R.drawable.igaming_eng, 0, av8Var2), null, bkh.e(utcVar3, 16.0f), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var2, 440, 120);
                f2 = 8.0f;
                tz9.r(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 14, 0L, 0L, av8Var2, l98.d0(bkh.e(utcVar, 16.0f), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2));
                z = false;
                wkn.k(haa.t(R.drawable.igaming_fra, 0, av8Var2), null, bkh.e(utcVar, 16.0f), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var2, 440, 120);
                r9 = 1;
                av8Var2.s(true);
                av8Var2.s(false);
            } else {
                context = context2;
                f = 16.0f;
                i3 = i6;
                utcVar = utcVar3;
                r9 = 1;
                z = false;
                f2 = 8.0f;
                av8Var2.d0(-1519126369);
                av8Var2.s(false);
            }
            nq8.h(av8Var2, bkh.e(utcVar, f));
            utc utcVar4 = utcVar;
            float f3 = f2;
            int i7 = i3;
            float f4 = f;
            vha.b(dwbVar, mwbVar.a, brand, wlaVar, l98.d0(utcVar, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), av8Var2, ((i5 >> 6) & 14) | 24576 | ((i5 << 3) & 896) | (i5 & 7168));
            nq8.h(av8Var2, bkh.e(utcVar4, f3));
            if (zu3.d.hasMcc(Integer.valueOf(i7))) {
                av8Var2.d0(-1518719277);
                xtc c0 = l98.c0(n9e.q(bkh.d(l98.d0(utcVar4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, r9), 1.0f), r13.d, oyn.e), f4, f3);
                String i8 = rld.i(context);
                yf8 yf8Var = xth.a;
                z2 = r9;
                utcVar2 = utcVar4;
                udj.c(i8, c0, r13.b, null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.g(), av8Var2, 432, 0, 130040);
                av8Var = av8Var2;
                av8Var.s(z);
            } else {
                z2 = r9;
                utcVar2 = utcVar4;
                boolean z5 = z;
                if (zu3.c.hasMcc(Integer.valueOf(i7))) {
                    av8Var2.d0(-1518151078);
                    xtc c02 = l98.c0(bkh.d(utcVar2, 1.0f), f4, f3);
                    String i9 = wv8.i(oea.v(R.string.responsible_gambling_argentina_title, av8Var2), " ", oea.v(R.string.responsible_gambling_argentina_text, av8Var2));
                    yf8 yf8Var2 = xth.a;
                    udj.c(i9, c02, lz.D(R.color.n_lv_3, av8Var2), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.g(), av8Var2, 48, 0, 130040);
                    av8Var = av8Var2;
                    av8Var.s(z5);
                } else {
                    av8Var2.d0(-1517608609);
                    ald h = rld.h(i7, z2);
                    if (h == null) {
                        av8Var2.d0(-1517579935);
                        av8Var2.s(z5);
                        unit = null;
                        i4 = 3;
                    } else {
                        av8Var2.d0(-1517579934);
                        i4 = 3;
                        qx9.a(h, l98.c0(utcVar2, f4, f3), 0L, av8Var2, 48, 4);
                        Unit unit2 = Unit.a;
                        av8Var2.s(z5);
                        unit = Unit.a;
                    }
                    if (unit == null) {
                        av8Var2.d0(-1517349139);
                        xtc c03 = l98.c0(bkh.d(utcVar2, 1.0f), f4, f3);
                        String f5 = rld.f(context, z5);
                        yf8 yf8Var3 = xth.a;
                        z3 = z5;
                        udj.c(f5, c03, lz.D(R.color.n_lv_3, av8Var2), null, 0L, null, 0L, null, new p7j(i4), 0L, 0, false, 0, 0, null, xth.g(), av8Var2, 0, 0, 130040);
                        av8Var2 = av8Var2;
                        Unit unit3 = Unit.a;
                        av8Var2.s(z3);
                    } else {
                        av8Var2 = av8Var2;
                        z3 = z5;
                        av8Var2.d0(-603144445);
                        av8Var2.s(z3);
                    }
                    av8Var2.s(z3);
                    z4 = true;
                    av8Var2.s(z4);
                    xtcVar2 = utcVar2;
                }
            }
            av8Var2 = av8Var;
            z4 = z2;
            av8Var2.s(z4);
            xtcVar2 = utcVar2;
        } else {
            av8Var2.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var2.u();
        if (u != null) {
            u.d = new s52(mwbVar, brand, dwbVar, wlaVar, xtcVar2, i, 12);
        }
    }

    public static final void k(mwb mwbVar, w3f w3fVar, boolean z, Function1 function1, Function1 function12, xtc xtcVar, of3 of3Var, int i) {
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1507689801);
        int i2 = i | (av8Var.g(mwbVar) ? 4 : 2) | (av8Var.i(w3fVar) ? 32 : 16) | (av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(function1) ? a.o : 1024) | (av8Var.i(function12) ? 16384 : 8192) | 196608;
        if (av8Var.T(i2 & 1, (74899 & i2) != 74898)) {
            p4h p4hVar = ww9.d;
            u23 a2 = t23.a(p4hVar, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            utc utcVar = utc.a;
            xtc C = fqj.C(av8Var, utcVar);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            kv1 kv1Var = uxf.p;
            xtc e0 = l98.e0(n9e.q(l98.d0(bkh.d(utcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(R.color.surface_2, av8Var), o7g.a(8.0f)), 16.0f, 14.0f, 16.0f, 16.0f);
            u23 a3 = t23.a(p4hVar, kv1Var, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, e0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            String v = oea.v(R.string.who_will_win, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var, 0, 0, 131066);
            nq8.h(av8Var, bkh.e(utcVar, 14.0f));
            int i3 = mwbVar.d.a;
            int i4 = mwbVar.e.a;
            boolean z2 = (i2 & 57344) == 16384;
            Object O = av8Var.O();
            if (z2 || O == nf3.a) {
                O = new o34(10, function12);
                av8Var.n0(O);
            }
            z5l.a(i3, i4, w3fVar, false, (Function2) O, null, null, null, null, null, av8Var, ((i2 << 3) & 896) | 3072, 992);
            av8Var = av8Var;
            av8Var.s(true);
            av8Var.d0(-457136995);
            StringBuilder sb = new StringBuilder(16);
            new ArrayList();
            ArrayList arrayList = new ArrayList();
            new ArrayList();
            sb.append(oea.v(R.string.mute_for_a_week, av8Var));
            Unit unit = Unit.a;
            String sb2 = sb.toString();
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                arrayList2.add(((n80) arrayList.get(i5)).a(sb.length()));
            }
            q80 q80Var = new q80(sb2, arrayList2);
            av8Var.s(false);
            int i6 = i2 >> 6;
            v9g.e(z, function1, q80Var, l98.c0(utcVar, 16.0f, 12.0f), null, av8Var, (i6 & 14) | 3072 | (i6 & 112), 16);
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new x64(mwbVar, w3fVar, z, function1, function12, xtcVar2, i, 5);
        }
    }

    public static final void l(gv9 gv9Var, gv9 gv9Var2, Function1 function1, xtc xtcVar, boolean z, lrh lrhVar, of3 of3Var, int i) {
        gv9Var.getClass();
        gv9Var2.getClass();
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-2013510203);
        int i2 = i | (av8Var.g(gv9Var) ? 4 : 2) | (av8Var.g(gv9Var2) ? 32 : 16) | (av8Var.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.g(xtcVar) ? a.o : 1024) | 24576;
        boolean z2 = true;
        if (av8Var.T(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = 6;
            s02.n(xtcVar, new ng0(12.0f, true, new a70(i3)), new ng0(12.0f, true, new a70(i3)), null, 0, 0, yqo.H(295709354, av8Var, new nrh(gv9Var, gv9Var2, lrhVar, function1, 1)), av8Var, ((i2 >> 9) & 14) | 1573296, 56);
        } else {
            av8Var.W();
            z2 = z;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new orh(gv9Var, gv9Var2, function1, xtcVar, z2, lrhVar, i, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m(unj unjVar, vmj vmjVar, String str, xtc xtcVar, Integer num, float f, Function2 function2, of3 of3Var, int i, int i2) {
        int i3;
        xtc xtcVar2;
        int i4;
        int i5;
        int i6;
        float f2;
        int i7;
        Integer num2;
        xtc xtcVar3;
        float f3;
        Function2 function22;
        eqf u;
        str.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1946306090);
        if ((i & 6) == 0) {
            i3 = (av8Var.g(unjVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= av8Var.g(vmjVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= av8Var.g(str) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            xtcVar2 = xtcVar;
            i3 |= av8Var.g(xtcVar2) ? a.o : 1024;
            i4 = i3 | 24576;
            i5 = i2 & 32;
            if (i5 == 0) {
                i4 = 221184 | i3;
            } else if ((196608 & i) == 0) {
                i4 |= av8Var.g(num) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
                i6 = i2 & 64;
                if (i6 != 0) {
                    i4 |= 1572864;
                } else if ((1572864 & i) == 0) {
                    f2 = f;
                    i4 |= av8Var.d(f2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                    i7 = i2 & 128;
                    if (i7 == 0) {
                        i4 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i4 |= av8Var.i(function2) ? 8388608 : 4194304;
                    }
                    if (av8Var.T(i4 & 1, (i4 & 4793491) == 4793490)) {
                        av8Var.W();
                        num2 = num;
                        xtcVar3 = xtcVar2;
                        f3 = f2;
                        function22 = function2;
                    } else {
                        xtc xtcVar4 = i8 != 0 ? utc.a : xtcVar2;
                        num2 = i5 != 0 ? null : num;
                        f3 = i6 != 0 ? 8.0f : f2;
                        if (i7 != 0) {
                            Object O = av8Var.O();
                            if (O == nf3.a) {
                                O = new t6j(16);
                                av8Var.n0(O);
                            }
                            function22 = (Function2) O;
                        } else {
                            function22 = function2;
                        }
                        aba.f(unjVar, vmjVar, str, xtcVar4, null, num2, f3, function22, yqo.H(-303381107, av8Var, new bmj(2, vmjVar, unjVar)), av8Var, (i4 & 14) | 100663296 | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (i4 & 29360128), 0);
                        xtcVar3 = xtcVar4;
                    }
                    u = av8Var.u();
                    if (u == null) {
                        u.d = new ks9(unjVar, vmjVar, str, xtcVar3, num2, f3, function22, i, i2);
                        return;
                    }
                    return;
                }
                f2 = f;
                i7 = i2 & 128;
                if (i7 == 0) {
                }
                if (av8Var.T(i4 & 1, (i4 & 4793491) == 4793490)) {
                }
                u = av8Var.u();
                if (u == null) {
                }
            }
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            f2 = f;
            i7 = i2 & 128;
            if (i7 == 0) {
            }
            if (av8Var.T(i4 & 1, (i4 & 4793491) == 4793490)) {
            }
            u = av8Var.u();
            if (u == null) {
            }
        }
        xtcVar2 = xtcVar;
        i4 = i3 | 24576;
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        f2 = f;
        i7 = i2 & 128;
        if (i7 == 0) {
        }
        if (av8Var.T(i4 & 1, (i4 & 4793491) == 4793490)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void n(tlf tlfVar, Function0 function0, boolean z, xtc xtcVar, of3 of3Var, int i) {
        jf9 jf9Var = oyn.e;
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1277017982);
        int i2 = i | (av8Var.g(tlfVar) ? 4 : 2) | (av8Var.i(function0) ? 32 : 16) | (av8Var.g(xtcVar) ? a.o : 1024);
        if (av8Var.T(i2 & 1, (i2 & IronSourceError.ERROR_IS_ALL_SMASHES_SESSION_CAPPED) != 1042)) {
            gmf gmfVar = tlfVar.a;
            int i3 = gmfVar.c;
            int i4 = gmfVar.a;
            if (gmfVar == gmf.FILLING_UP_ZONE) {
                av8Var.d0(1177845094);
                xtc c0 = l98.c0(n9e.q(bkh.d(xtcVar, 1.0f), lz.D(R.color.surface_1, av8Var), jf9Var), 16.0f, 64.0f);
                yf8 yf8Var = xth.a;
                udj.c(oea.v(i4, av8Var), c0, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.e(), av8Var, 0, 0, 130040);
                av8Var = av8Var;
                av8Var.s(false);
            } else {
                av8Var.d0(1178265299);
                utc utcVar = utc.a;
                xtc v = haa.v(bkh.l(utcVar, 24.0f), gmfVar == gmf.DEMOTION_ZONE ? 180.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                long b2 = hkg.b(((Context) av8Var.k(nz.b)).getColor(gmfVar.b));
                xtc d2 = bkh.d(xtcVar, 1.0f);
                long D = lz.D(R.color.n_lv_4, av8Var);
                Object O = av8Var.O();
                a99 a99Var = nf3.a;
                if (O == a99Var) {
                    O = mz1.e(av8Var);
                }
                wzc wzcVar = (wzc) O;
                Object[] objArr = new Object[0];
                Object O2 = av8Var.O();
                if (O2 == a99Var) {
                    O2 = wzj.z;
                    av8Var.n0(O2);
                }
                xtc c02 = l98.c0(n9e.q(tol.y(d2, true, true, true, D, wzcVar, new sol((boh) o3a.N(objArr, (Function0) O2, av8Var, 48), function0), av8Var, 0), lz.D(R.color.surface_1, av8Var), jf9Var), 8.0f, 12.0f);
                l8g a2 = k8g.a(ww9.f, uxf.m, av8Var, 54);
                int hashCode = Long.hashCode(av8Var.T);
                aee m = av8Var.m();
                xtc C = fqj.C(av8Var, c02);
                if3.k7.getClass();
                zg3 zg3Var = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a2, hf3.g);
                waa.K(av8Var, m, hf3.f);
                waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                waa.J(av8Var, hf3.k);
                waa.K(av8Var, C, hf3.d);
                kq9.a(haa.t(i3, 0, av8Var), null, v, b2, av8Var, 56, 0);
                xtc d0 = l98.d0(utcVar, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                String v2 = oea.v(i4, av8Var);
                yf8 yf8Var2 = xth.a;
                udj.c(v2, d0, b2, null, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, (dfj) xth.o.getValue(), av8Var, 48, 24960, 110584);
                av8Var = av8Var;
                kq9.a(haa.t(i3, 0, av8Var), null, v, b2, av8Var, 56, 0);
                av8Var.s(true);
                av8Var.s(false);
            }
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new p81(tlfVar, function0, z, xtcVar, i, 28);
        }
    }

    public static final LinkedHashSet o(byte[] bArr) {
        bArr.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int readInt = objectInputStream.readInt();
                    for (int i = 0; i < readInt; i++) {
                        Uri parse = Uri.parse(objectInputStream.readUTF());
                        boolean readBoolean = objectInputStream.readBoolean();
                        parse.getClass();
                        linkedHashSet.add(new ym3(readBoolean, parse));
                    }
                    Unit unit = Unit.a;
                    objectInputStream.close();
                } finally {
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            Unit unit2 = Unit.a;
            byteArrayInputStream.close();
            return linkedHashSet;
        } finally {
        }
    }

    public static dzc p(String str, String str2, wzf wzfVar) {
        StringBuilder q = fc6.q("form-data; name=");
        zdc zdcVar = ezc.g;
        rha.k(str, q);
        if (str2 != null) {
            q.append("; filename=");
            rha.k(str2, q);
        }
        String sb = q.toString();
        ef0 ef0Var = new ef0(1);
        ef0Var.d("Content-Disposition", sb);
        q89 i = vha.i(ef0Var);
        if (i.a("Content-Type") != null) {
            a70.p("Unexpected header: Content-Type");
            return null;
        }
        if (i.a("Content-Length") == null) {
            return new dzc(i, wzfVar);
        }
        a70.p("Unexpected header: Content-Length");
        return null;
    }

    public static void q(Context context) {
        Pair[] pairArr = {wv8.t(context, "ACTION", "SYNC")};
        hpo hpoVar = new hpo(18);
        Pair pair = pairArr[0];
        hpoVar.B(pair.b, (String) pair.a);
        md4 l = hpoVar.l();
        vxd.h(context).b("ProfileWorker-".concat(mha.o(l)), nf6.a, (ltd) vxd.g(ProfileWorker.class, l).a());
    }

    public static boolean r(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static final byte[] s(nad nadVar) {
        int[] R0;
        int[] R02;
        int i = Build.VERSION.SDK_INT;
        if (i < 28) {
            return new byte[0];
        }
        NetworkRequest networkRequest = (NetworkRequest) nadVar.a;
        if (networkRequest == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                if (i >= 31) {
                    R0 = qz.D(networkRequest);
                } else {
                    int[] iArr = {2, 0, 3, 6, 10, 9, 8, 4, 1, 5};
                    ArrayList arrayList = new ArrayList();
                    for (int i2 = 0; i2 < 10; i2++) {
                        int i3 = iArr[i2];
                        if (c90.G(networkRequest, i3)) {
                            arrayList.add(Integer.valueOf(i3));
                        }
                    }
                    R0 = CollectionsKt.R0(arrayList);
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    R02 = qz.a(networkRequest);
                } else {
                    int[] iArr2 = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 36, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
                    ArrayList arrayList2 = new ArrayList();
                    for (int i4 = 0; i4 < 30; i4++) {
                        int i5 = iArr2[i4];
                        if (c90.F(networkRequest, i5)) {
                            arrayList2.add(Integer.valueOf(i5));
                        }
                    }
                    R02 = CollectionsKt.R0(arrayList2);
                }
                objectOutputStream.writeInt(R0.length);
                for (int i6 : R0) {
                    objectOutputStream.writeInt(i6);
                }
                objectOutputStream.writeInt(R02.length);
                for (int i7 : R02) {
                    objectOutputStream.writeInt(i7);
                }
                Unit unit = Unit.a;
                objectOutputStream.close();
                byteArrayOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArray.getClass();
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    public static JSONObject t(ckg ckgVar, List list) {
        URL url = ckgVar.g;
        HashMap hashMap = new HashMap();
        String str = ckgVar.a;
        String str2 = ckgVar.e;
        hashMap.put("timestamp", str);
        String str3 = ckgVar.b;
        if (str3 != null && !str3.isEmpty()) {
            hashMap.put(PglCryptUtils.KEY_MESSAGE, str3);
        }
        if ((url != null ? url.getHost() : null) != null) {
            if (!(url != null ? url.getHost() : null).isEmpty()) {
                hashMap.put("host", url != null ? url.getHost() : null);
            }
        }
        if ((url != null ? Boolean.valueOf(url.getProtocol().toLowerCase().equals(HttpRequest.DEFAULT_SCHEME)) : null) != null) {
            hashMap.put("secured", url != null ? Boolean.valueOf(url.getProtocol().toLowerCase().equals(HttpRequest.DEFAULT_SCHEME)) : null);
        }
        hashMap.put("samplingRate", Integer.valueOf(ckgVar.d));
        if (!str2.isEmpty()) {
            hashMap.put("type", str2);
        }
        int ordinal = ckgVar.c.ordinal();
        hashMap.put("severity", ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? "" : "error" : "warning" : "info" : "debug");
        List<ijg> list2 = ckgVar.f;
        if (list2 != null) {
            for (ijg ijgVar : list2) {
                hashMap.put(ijgVar.b(), ijgVar.a());
            }
        }
        if (list != null) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ijg ijgVar2 = (ijg) it.next();
                    hashMap.put(ijgVar2.b(), ijgVar2.a());
                }
            } catch (JSONException unused) {
            }
        }
        JSONObject f0 = hkg.f0(hashMap);
        if (f0.length() > 0) {
            return f0;
        }
        return null;
    }

    public static final ttk u(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            ttk ttkVar = tag instanceof ttk ? (ttk) tag : null;
            if (ttkVar != null) {
                return ttkVar;
            }
            Object r = mha.r(view);
            view = r instanceof View ? (View) r : null;
        }
        return null;
    }

    public static final KClass v(Annotation annotation) {
        annotation.getClass();
        Class<? extends Annotation> annotationType = annotation.annotationType();
        annotationType.getClass();
        KClass A = A(annotationType);
        A.getClass();
        return A;
    }

    public static void w(List list) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            throw lnb.i(it);
        }
    }

    public static final Class x(KClass kClass) {
        kClass.getClass();
        Class jClass = ((rv2) kClass).getJClass();
        jClass.getClass();
        return jClass;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class y(KClass kClass) {
        kClass.getClass();
        Class jClass = ((rv2) kClass).getJClass();
        if (!jClass.isPrimitive()) {
            return jClass;
        }
        String name = jClass.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (!name.equals("double")) {
                }
                break;
            case 104431:
                if (!name.equals("int")) {
                }
                break;
            case 3039496:
                if (!name.equals("byte")) {
                }
                break;
            case 3052374:
                if (!name.equals("char")) {
                }
                break;
            case 3327612:
                if (!name.equals("long")) {
                }
                break;
            case 3625364:
                if (!name.equals("void")) {
                }
                break;
            case 64711720:
                if (!name.equals("boolean")) {
                }
                break;
            case 97526364:
                if (!name.equals("float")) {
                }
                break;
            case 109413500:
                if (!name.equals("short")) {
                }
                break;
        }
        return jClass;
    }

    public static final Class z(KClass kClass) {
        kClass.getClass();
        Class jClass = ((rv2) kClass).getJClass();
        if (jClass.isPrimitive()) {
            return jClass;
        }
        String name = jClass.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    public abstract void a0(hap hapVar, Thread thread);

    public abstract void b0(hap hapVar, hap hapVar2);

    public abstract boolean c0(iap iapVar, hap hapVar, hap hapVar2);

    public abstract boolean d0(iap iapVar, dap dapVar, dap dapVar2);

    public abstract hap e0(iap iapVar);

    public abstract dap g0(iap iapVar);

    public abstract boolean h0(iap iapVar, Object obj, Object obj2);
}
