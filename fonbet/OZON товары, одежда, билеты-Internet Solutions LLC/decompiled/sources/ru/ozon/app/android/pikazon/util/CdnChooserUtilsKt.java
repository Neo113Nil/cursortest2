package ru.ozon.app.android.pikazon.util;

import Tc.j;
import Ud0.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\u001a\u001f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\u0007\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0006\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a!\u0010\u000b\u001a\u00020\n*\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a!\u0010\u000e\u001a\u00020\n*\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\f\u001a\u0013\u0010\u000f\u001a\u00020\n*\u00020\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0012\u001a\u00020\n*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"", "LUd0/a$a;", "", "", "imageWhitelist", "(Ljava/util/List;)Ljava/util/Set;", "host", "findRuleForHostOrNull", "(Ljava/util/List;Ljava/lang/String;)LUd0/a$a;", "whitelist", "", "isHostContainsInWhitelist", "(Ljava/lang/String;Ljava/util/Set;)Z", "wildcards", "isHostMatchWithWildcards", "isWildcard", "(Ljava/lang/String;)Z", "wildcard", "isHostMatchWithWildcard", "(Ljava/lang/String;Ljava/lang/String;)Z", "lib_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CdnChooserUtilsKt {
    public static final a.AbstractC0559a findRuleForHostOrNull(@NotNull List<? extends a.AbstractC0559a> list, @NotNull String host) {
        Object obj;
        Object obj2;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(host, "host");
        List<? extends a.AbstractC0559a> list2 = list;
        Iterator<T> it = list2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            a.AbstractC0559a abstractC0559a = (a.AbstractC0559a) obj2;
            if (!isWildcard(abstractC0559a.b()) && Intrinsics.d(abstractC0559a.b(), host)) {
                break;
            }
        }
        a.AbstractC0559a abstractC0559a2 = (a.AbstractC0559a) obj2;
        if (abstractC0559a2 != null) {
            return abstractC0559a2;
        }
        Iterator<T> it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            a.AbstractC0559a abstractC0559a3 = (a.AbstractC0559a) next;
            if (isWildcard(abstractC0559a3.b()) && isHostMatchWithWildcard(host, abstractC0559a3.b())) {
                obj = next;
                break;
            }
        }
        return (a.AbstractC0559a) obj;
    }

    @NotNull
    public static final Set<String> imageWhitelist(@NotNull List<? extends a.AbstractC0559a> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        j builder = new j();
        for (a.AbstractC0559a abstractC0559a : list) {
            builder.add(abstractC0559a.b());
            String c11 = abstractC0559a.c();
            if (c11 != null) {
                builder.add(c11);
            }
            String d11 = abstractC0559a.d();
            if (d11 != null) {
                builder.add(d11);
            }
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.b();
    }

    public static final boolean isHostContainsInWhitelist(@NotNull String str, @NotNull Set<String> whitelist) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(whitelist, "whitelist");
        if (whitelist.contains(str)) {
            return true;
        }
        return isHostMatchWithWildcards(str, whitelist);
    }

    private static final boolean isHostMatchWithWildcard(String str, String str2) {
        return h.A(str, h.X(str2, "*", "", false), false);
    }

    private static final boolean isHostMatchWithWildcards(String str, Set<String> set) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (isWildcard((String) obj)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (isHostMatchWithWildcard(str, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private static final boolean isWildcard(String str) {
        return h.t(str, "*", false);
    }
}
