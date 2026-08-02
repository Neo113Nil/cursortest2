package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.appcompat.widget.SearchView;
import com.sofascore.model.Country;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.newNetwork.newRankings.RankingRow;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import kotlin.collections.b;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class zk2 extends Filter {
    public final /* synthetic */ int a;
    public Filterable b;

    public /* synthetic */ zk2(Filterable filterable, int i) {
        this.a = i;
        this.b = filterable;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof vk2)) {
                    return "";
                }
                String string = ((al2) this.b).getContext().getString(((vk2) obj).b);
                string.getClass();
                return string;
            case 1:
                return ((r84) this.b).c((Cursor) obj);
            case 2:
                if (!(obj instanceof j08)) {
                    return "";
                }
                String string2 = ((eh5) this.b).getContext().getString(((j08) obj).b);
                string2.getClass();
                return string2;
            case 3:
                if (!(obj instanceof Country)) {
                    return "";
                }
                Context context = ((eh5) this.b).getContext();
                context.getClass();
                return tv3.c(context, ((Country) obj).getName());
            case 4:
                if (!(obj instanceof qvj)) {
                    return "";
                }
                wg5 wg5Var = (wg5) this.b;
                int ordinal = ((qvj) obj).ordinal();
                Context context2 = wg5Var.getContext();
                context2.getClass();
                return v8a.C(ordinal, context2);
            case 5:
                twa twaVar = (twa) this.b;
                Team team = obj instanceof Team ? (Team) obj : null;
                if (team == null) {
                    return String.valueOf(obj);
                }
                Context context3 = twaVar.getContext();
                context3.getClass();
                return tba.p(context3, team);
            case 6:
                if (!(obj instanceof Country)) {
                    return "";
                }
                Context context4 = ((eh5) this.b).getContext();
                context4.getClass();
                return tv3.c(context4, ((Country) obj).getName());
            default:
                return super.convertResultToString(obj);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e9, code lost:
    
        if (r7 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00eb, code lost:
    
        r7 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fc, code lost:
    
        r9 = defpackage.qhi.a;
        r7 = defpackage.qhi.d(r7);
        r9 = java.util.Locale.getDefault();
        r9.getClass();
        r7 = r7.toLowerCase(r9);
        r7.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0118, code lost:
    
        if (r11.matcher(r7).find() != false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0122, code lost:
    
        if (r11.matcher(r8).find() == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0124, code lost:
    
        r3.add(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f9, code lost:
    
        if (r7 == null) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d9 A[SYNTHETIC] */
    @Override // android.widget.Filter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor cursor;
        String valueOf;
        Pattern pattern;
        String alpha2;
        com.sofascore.model.mvvm.model.Country country;
        String str;
        String str2;
        switch (this.a) {
            case 0:
                return null;
            case 1:
                kmi kmiVar = (kmi) ((r84) this.b);
                SearchView searchView = kmiVar.l;
                String charSequence2 = charSequence != null ? charSequence.toString() : "";
                if (searchView.getVisibility() == 0 && searchView.getWindowVisibility() == 0) {
                    try {
                        cursor = kmiVar.g(kmiVar.m, charSequence2);
                    } catch (RuntimeException unused) {
                    }
                    if (cursor != null) {
                        cursor.getCount();
                        Filter.FilterResults filterResults = new Filter.FilterResults();
                        if (cursor == null) {
                            filterResults.count = cursor.getCount();
                            filterResults.values = cursor;
                        } else {
                            filterResults.count = 0;
                            filterResults.values = null;
                        }
                        return filterResults;
                    }
                }
                cursor = null;
                Filter.FilterResults filterResults2 = new Filter.FilterResults();
                if (cursor == null) {
                }
                return filterResults2;
            case 2:
            case 3:
            case 4:
                return null;
            case 5:
                twa twaVar = (twa) this.b;
                ArrayList arrayList = twaVar.a;
                ArrayList arrayList2 = new ArrayList();
                if (charSequence == null || StringsKt.R(charSequence)) {
                    arrayList2.addAll(arrayList);
                } else {
                    String lowerCase = charSequence.toString().toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    String obj = StringsKt.l0(lowerCase).toString();
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i2 = i + 1;
                        if (i < 0) {
                            b.q();
                            throw null;
                        }
                        Team team = next instanceof Team ? (Team) next : null;
                        if (team != null) {
                            Context context = twaVar.getContext();
                            context.getClass();
                            valueOf = tba.p(context, team);
                        } else {
                            valueOf = String.valueOf(next);
                        }
                        String lowerCase2 = valueOf.toLowerCase(Locale.ROOT);
                        lowerCase2.getClass();
                        if (StringsKt.J(StringsKt.l0(lowerCase2).toString(), obj, false)) {
                            arrayList3.add(next);
                        }
                        i = i2;
                    }
                    arrayList2.addAll(arrayList3);
                }
                Filter.FilterResults filterResults3 = new Filter.FilterResults();
                filterResults3.values = arrayList2;
                filterResults3.count = arrayList2.size();
                return filterResults3;
            case 6:
                eh5 eh5Var = (eh5) this.b;
                Filter.FilterResults filterResults4 = new Filter.FilterResults();
                ArrayList arrayList4 = new ArrayList();
                StringBuilder sb = new StringBuilder();
                if (charSequence == null || charSequence.length() == 0) {
                    sb.append(".*");
                } else {
                    for (int i3 = 0; i3 < charSequence.length(); i3++) {
                        sb.append(charSequence.charAt(i3));
                        sb.append(".*");
                    }
                }
                String h = wv8.h(2, 0, sb.toString());
                Locale locale = Locale.getDefault();
                locale.getClass();
                String lowerCase3 = h.toLowerCase(locale);
                lowerCase3.getClass();
                try {
                    Pattern compile = Pattern.compile(lowerCase3);
                    ArrayList arrayList5 = (ArrayList) eh5Var.b;
                    if (arrayList5.isEmpty()) {
                        arrayList5.addAll(dv3.a);
                        List list = tv3.a;
                        Context context2 = eh5Var.getContext();
                        context2.getClass();
                        Collections.sort(arrayList5, tv3.b(context2));
                    }
                    Iterator it2 = arrayList5.iterator();
                    it2.getClass();
                    while (it2.hasNext()) {
                        Object next2 = it2.next();
                        next2.getClass();
                        Country country2 = (Country) next2;
                        Context context3 = eh5Var.getContext();
                        context3.getClass();
                        String c = tv3.c(context3, country2.getName());
                        Locale locale2 = Locale.getDefault();
                        locale2.getClass();
                        String lowerCase4 = c.toLowerCase(locale2);
                        lowerCase4.getClass();
                        if (compile.matcher(lowerCase4).find()) {
                            arrayList4.add(country2);
                        }
                    }
                } catch (PatternSyntaxException unused2) {
                }
                filterResults4.values = arrayList4;
                filterResults4.count = arrayList4.size();
                return filterResults4;
            default:
                cmf cmfVar = (cmf) this.b;
                Filter.FilterResults filterResults5 = new Filter.FilterResults();
                if (cmfVar.o.isEmpty()) {
                    cmfVar.o = new ArrayList(cmfVar.i);
                }
                String obj2 = StringsKt.l0(String.valueOf(charSequence)).toString();
                if (obj2.length() == 0) {
                    filterResults5.values = cmfVar.o;
                } else {
                    ArrayList arrayList6 = new ArrayList();
                    char[] charArray = obj2.toCharArray();
                    charArray.getClass();
                    String J = ph0.J(charArray, ".*", null, 56);
                    mqi mqiVar = qhi.a;
                    String d = qhi.d(J);
                    Locale locale3 = Locale.getDefault();
                    locale3.getClass();
                    String lowerCase5 = d.toLowerCase(locale3);
                    lowerCase5.getClass();
                    try {
                        pattern = Pattern.compile(lowerCase5);
                    } catch (PatternSyntaxException unused3) {
                        pattern = null;
                    }
                    if (pattern != null) {
                        ArrayList arrayList7 = cmfVar.o;
                        Context context4 = cmfVar.b;
                        Iterator it3 = arrayList7.iterator();
                        while (it3.hasNext()) {
                            wlf wlfVar = (wlf) it3.next();
                            if (wlfVar instanceof xlf) {
                                RankingRow rankingRow = ((xlf) wlfVar).a;
                                com.sofascore.model.mvvm.model.Country country3 = rankingRow.getCountry();
                                if (country3 == null || (alpha2 = country3.getAlpha2()) == null) {
                                    Team team2 = rankingRow.getTeam();
                                    alpha2 = (team2 == null || (country = team2.getCountry()) == null) ? null : country.getAlpha2();
                                }
                                Country a = dv3.a(alpha2);
                                if (a != null) {
                                    String c2 = tv3.c(context4, a.getName());
                                    mqi mqiVar2 = qhi.a;
                                    String d2 = qhi.d(c2);
                                    if (d2 != null) {
                                        Locale locale4 = Locale.getDefault();
                                        locale4.getClass();
                                        str = d2.toLowerCase(locale4);
                                        str.getClass();
                                        if (str == null) {
                                            str = "";
                                        }
                                        switch (cmfVar.l.ordinal()) {
                                            case 0:
                                                UniqueTournament uniqueTournament = rankingRow.getUniqueTournament();
                                                if (uniqueTournament != null) {
                                                    str2 = tba.x(uniqueTournament);
                                                    break;
                                                } else {
                                                    str2 = null;
                                                    break;
                                                }
                                            case 1:
                                            case 2:
                                            case 3:
                                            case 4:
                                            case 5:
                                            case 6:
                                            case 7:
                                            case 8:
                                            case 9:
                                                Team team3 = rankingRow.getTeam();
                                                if (team3 != null) {
                                                    str2 = tba.p(context4, team3);
                                                    break;
                                                } else {
                                                    str2 = null;
                                                    break;
                                                }
                                            default:
                                                zzl.b();
                                                return null;
                                        }
                                    }
                                }
                                str = null;
                                if (str == null) {
                                }
                                switch (cmfVar.l.ordinal()) {
                                }
                            } else {
                                arrayList6.add(wlfVar);
                            }
                        }
                    }
                    filterResults5.values = arrayList6;
                }
                return filterResults5;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004e, code lost:
    
        if (r4 == 0) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [km5] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v6, types: [km5] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.ArrayList] */
    @Override // android.widget.Filter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        List list;
        ?? r4;
        switch (this.a) {
            case 0:
                break;
            case 1:
                r84 r84Var = (r84) this.b;
                Cursor cursor = r84Var.c;
                Object obj = filterResults.values;
                if (obj != null && obj != cursor) {
                    r84Var.b((Cursor) obj);
                    break;
                }
                break;
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                twa twaVar = (twa) this.b;
                List list2 = filterResults != null ? filterResults.values : null;
                list = list2 instanceof List ? list2 : null;
                if (list == null) {
                    list = km5.a;
                }
                ArrayList arrayList = twaVar.b;
                if (list != null) {
                    arrayList.clear();
                    arrayList.addAll(list);
                }
                twaVar.notifyDataSetChanged();
                break;
            case 6:
                eh5 eh5Var = (eh5) this.b;
                eh5Var.clear();
                if (filterResults != null) {
                    if (filterResults.count > 0) {
                        Object obj2 = filterResults.values;
                        obj2.getClass();
                        r4 = new ArrayList();
                        for (Object obj3 : (ArrayList) obj2) {
                            if (obj3 instanceof Country) {
                                r4.add(obj3);
                            }
                        }
                        break;
                    } else {
                        r4 = km5.a;
                        break;
                    }
                }
                r4 = km5.a;
                eh5Var.addAll((Collection) r4);
                eh5Var.notifyDataSetChanged();
                break;
            default:
                List list3 = filterResults != null ? filterResults.values : null;
                list = list3 instanceof List ? list3 : null;
                if (list != null) {
                    ((cmf) this.b).F(list);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ zk2() {
        this.a = 1;
    }

    private final void a(CharSequence charSequence, Filter.FilterResults filterResults) {
    }

    private final void b(CharSequence charSequence, Filter.FilterResults filterResults) {
    }

    private final void c(CharSequence charSequence, Filter.FilterResults filterResults) {
    }

    private final void d(CharSequence charSequence, Filter.FilterResults filterResults) {
    }
}
