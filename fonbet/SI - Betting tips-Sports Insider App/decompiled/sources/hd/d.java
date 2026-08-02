package hd;

import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import c0.x;
import com.google.android.gms.internal.measurement.y3;
import com.sports.insider.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.e0;
import kotlin.coroutines.Continuation;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d extends x {

    /* renamed from: b, reason: collision with root package name */
    public final int f10515b = R.string.live_advantages_1_args;

    /* renamed from: c, reason: collision with root package name */
    public final String f10516c = "Live";

    /* renamed from: d, reason: collision with root package name */
    public final char f10517d = '%';

    /* renamed from: e, reason: collision with root package name */
    public final int f10518e = R.string.live_advantages_2;

    /* renamed from: f, reason: collision with root package name */
    public final int f10519f = R.string.live_advantages_3;

    /* renamed from: g, reason: collision with root package name */
    public final int f10520g = R.string.live_advantages_4;

    /* renamed from: h, reason: collision with root package name */
    public final int f10521h = R.string.live_advantages_5;

    /* renamed from: i, reason: collision with root package name */
    public final int f10522i = R.string.subs_auto_renewed_cancel_it;
    public final int j = R.string.PurchasesTerms;

    /* renamed from: k, reason: collision with root package name */
    public final int f10523k = R.string.lk_store_desc;

    /* JADX WARN: Removed duplicated region for block: B:15:0x00d5 A[Catch: Exception -> 0x00e8, TRY_LEAVE, TryCatch #0 {Exception -> 0x00e8, blocks: (B:13:0x00ce, B:15:0x00d5), top: B:12:0x00ce }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Continuation continuation) {
        c cVar;
        lf.a aVar;
        int i5;
        StringBuilder sb2;
        List list;
        String sb3;
        Object a7;
        StringBuilder sb4;
        List list2;
        SpannableString spannableString;
        int G;
        String str = this.f10516c;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i10 = cVar.f10514f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f10514f = i10 - Integer.MIN_VALUE;
                Object obj = cVar.f10512d;
                aVar = lf.a.f20034a;
                i5 = cVar.f10514f;
                char c2 = this.f10517d;
                if (i5 != 0) {
                    h8.b.B(obj);
                    ArrayList arrayList = new ArrayList();
                    sb2 = new StringBuilder();
                    cVar.f10509a = arrayList;
                    cVar.f10510b = sb2;
                    cVar.f10514f = 1;
                    ((za.h) y3.m(za.h.class, null, 6)).getClass();
                    Object a10 = za.h.a("rc_roi_live", cVar);
                    if (a10 != aVar) {
                        list = arrayList;
                        obj = a10;
                    }
                    return aVar;
                }
                if (i5 != 1) {
                    if (i5 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sb4 = cVar.f10511c;
                    sb3 = (String) cVar.f10510b;
                    list2 = cVar.f10509a;
                    h8.b.B(obj);
                    sb4.append(((Number) obj).longValue());
                    sb4.append(c2);
                    String sb5 = sb4.toString();
                    i().getClass();
                    spannableString = new SpannableString(zc.k.h(this.f10519f));
                    try {
                        G = StringsKt.G(spannableString, str, 0, false, 6);
                        if (G > -1) {
                            i().getClass();
                            spannableString.setSpan(zc.k.b(), G, str.length() + G, 18);
                        }
                    } catch (Exception unused) {
                    }
                    i().getClass();
                    String h10 = zc.k.h(this.j);
                    SpannableString spannableString2 = new SpannableString(h10);
                    try {
                        spannableString2.setSpan(new UnderlineSpan(), 0, h10.length(), 18);
                    } catch (Exception unused2) {
                    }
                    i().getClass();
                    String h11 = zc.k.h(this.f10523k);
                    SpannableString spannableString3 = new SpannableString(h11);
                    try {
                        spannableString3.setSpan(new UnderlineSpan(), 0, h11.length(), 18);
                    } catch (Exception unused3) {
                    }
                    i().getClass();
                    list2.add(zc.k.i(this.f10515b, sb3, sb5));
                    i().getClass();
                    list2.add(zc.k.h(this.f10518e));
                    list2.add(spannableString);
                    i().getClass();
                    list2.add(zc.k.h(this.f10520g));
                    i().getClass();
                    list2.add(zc.k.h(this.f10521h));
                    i().getClass();
                    list2.add(zc.k.h(this.f10522i));
                    list2.add(spannableString2);
                    list2.add(spannableString3);
                    return new Pair(list2, e0.f19204a);
                }
                sb2 = (StringBuilder) cVar.f10510b;
                list = cVar.f10509a;
                h8.b.B(obj);
                sb2.append(((Number) obj).longValue());
                sb2.append(c2);
                sb3 = sb2.toString();
                StringBuilder sb6 = new StringBuilder();
                cVar.f10509a = list;
                cVar.f10510b = sb3;
                cVar.f10511c = sb6;
                cVar.f10514f = 2;
                ((za.h) y3.m(za.h.class, null, 6)).getClass();
                a7 = za.h.a("rc_live_passage", cVar);
                if (a7 != aVar) {
                    sb4 = sb6;
                    obj = a7;
                    list2 = list;
                    sb4.append(((Number) obj).longValue());
                    sb4.append(c2);
                    String sb52 = sb4.toString();
                    i().getClass();
                    spannableString = new SpannableString(zc.k.h(this.f10519f));
                    G = StringsKt.G(spannableString, str, 0, false, 6);
                    if (G > -1) {
                    }
                    i().getClass();
                    String h102 = zc.k.h(this.j);
                    SpannableString spannableString22 = new SpannableString(h102);
                    spannableString22.setSpan(new UnderlineSpan(), 0, h102.length(), 18);
                    i().getClass();
                    String h112 = zc.k.h(this.f10523k);
                    SpannableString spannableString32 = new SpannableString(h112);
                    spannableString32.setSpan(new UnderlineSpan(), 0, h112.length(), 18);
                    i().getClass();
                    list2.add(zc.k.i(this.f10515b, sb3, sb52));
                    i().getClass();
                    list2.add(zc.k.h(this.f10518e));
                    list2.add(spannableString);
                    i().getClass();
                    list2.add(zc.k.h(this.f10520g));
                    i().getClass();
                    list2.add(zc.k.h(this.f10521h));
                    i().getClass();
                    list2.add(zc.k.h(this.f10522i));
                    list2.add(spannableString22);
                    list2.add(spannableString32);
                    return new Pair(list2, e0.f19204a);
                }
                return aVar;
            }
        }
        cVar = new c(this, (mf.c) continuation);
        Object obj2 = cVar.f10512d;
        aVar = lf.a.f20034a;
        i5 = cVar.f10514f;
        char c22 = this.f10517d;
        if (i5 != 0) {
        }
        sb2.append(((Number) obj2).longValue());
        sb2.append(c22);
        sb3 = sb2.toString();
        StringBuilder sb62 = new StringBuilder();
        cVar.f10509a = list;
        cVar.f10510b = sb3;
        cVar.f10511c = sb62;
        cVar.f10514f = 2;
        ((za.h) y3.m(za.h.class, null, 6)).getClass();
        a7 = za.h.a("rc_live_passage", cVar);
        if (a7 != aVar) {
        }
        return aVar;
    }
}
