package wc;

import com.sports.insider.R;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e extends d0 {

    /* renamed from: e, reason: collision with root package name */
    public final gf.t f25077e = gf.k.b(new pd.v(22));

    /* renamed from: f, reason: collision with root package name */
    public final zc.d f25078f = new zc.d();

    /* renamed from: g, reason: collision with root package name */
    public final sc.b f25079g = new sc.b();

    /* renamed from: h, reason: collision with root package name */
    public final zc.c f25080h = new zc.c();

    /* JADX WARN: Removed duplicated region for block: B:13:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String n(ic.n nVar) {
        String str;
        Pair pair;
        String g10;
        String str2 = null;
        if (nVar == null) {
            return null;
        }
        List list = ((ic.a0) nVar).f11074e;
        if (((ic.d0) ((ic.m) CollectionsKt.F(list))).f11100d == 0) {
            String str3 = ((ic.d0) ((ic.m) CollectionsKt.F(list))).f11099c;
            if (str3 != null) {
                String upperCase = str3.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                char[] charArray = upperCase.toCharArray();
                Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
                if (charArray.length == 3 && charArray[0] == 'P') {
                    pair = new Pair(Character.valueOf(charArray[2]), Integer.valueOf(kotlin.text.a.b(charArray[1])));
                    if (pair != null) {
                        int intValue = ((Number) pair.f19193b).intValue();
                        char charValue = ((Character) pair.f19192a).charValue();
                        if (charValue == 'D') {
                            zc.k o3 = o();
                            Object[] objArr = {Integer.valueOf(intValue)};
                            o3.getClass();
                            g10 = zc.k.g(R.plurals.dayQuantity, intValue, objArr);
                        } else if (charValue == 'M') {
                            zc.k o4 = o();
                            Object[] objArr2 = {Integer.valueOf(intValue)};
                            o4.getClass();
                            g10 = zc.k.g(R.plurals.monthQuantity, intValue, objArr2);
                        } else if (charValue == 'W') {
                            zc.k o7 = o();
                            Object[] objArr3 = {Integer.valueOf(intValue)};
                            o7.getClass();
                            g10 = zc.k.g(R.plurals.weekQuantity, intValue, objArr3);
                        } else if (charValue == 'Y') {
                            zc.k o10 = o();
                            Object[] objArr4 = {Integer.valueOf(intValue)};
                            o10.getClass();
                            g10 = zc.k.g(R.plurals.yearQuantity, intValue, objArr4);
                        }
                        if (g10 == null) {
                            str = ((ic.d0) ((ic.m) CollectionsKt.F(list))).f11097a;
                        } else {
                            o().getClass();
                            String i5 = zc.k.i(R.string.periodFree, g10);
                            if (!list.isEmpty() && list.size() != 1) {
                                str2 = ((ic.d0) ((ic.m) list.get(0))).f11102f > 1 ? ((ic.d0) ((ic.m) list.get(0))).f11097a : ((ic.d0) ((ic.m) list.get(1))).f11097a;
                            }
                            if (str2 != null) {
                                String str4 = str2 + '(' + i5 + ')';
                                if (str4 != null) {
                                    str = str4;
                                }
                            }
                            str = ((ic.d0) ((ic.m) CollectionsKt.F(list))).f11097a;
                        }
                    }
                    g10 = null;
                    if (g10 == null) {
                    }
                }
            }
            pair = null;
            if (pair != null) {
            }
            g10 = null;
            if (g10 == null) {
            }
        } else {
            str = ((ic.d0) ((ic.m) CollectionsKt.F(list))).f11097a;
        }
        this.f25080h.getClass();
        return zc.c.a(str);
    }

    public final zc.k o() {
        return (zc.k) this.f25077e.getValue();
    }
}
