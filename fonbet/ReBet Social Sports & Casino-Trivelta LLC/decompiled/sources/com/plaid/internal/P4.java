package com.plaid.internal;

import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nPiiStripper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PiiStripper.kt\ncom/plaid/internal/url/PiiStripper$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,49:1\n1855#2,2:50\n*S KotlinDebug\n*F\n+ 1 PiiStripper.kt\ncom/plaid/internal/url/PiiStripper$Companion\n*L\n20#1:50,2\n*E\n"})
/* loaded from: classes3.dex */
public final class P4 {
    @NotNull
    public static String a(@NotNull String input) {
        String hVar;
        String hVar2;
        Intrinsics.checkNotNullParameter(input, "input");
        com.google.gson.h d10 = com.google.gson.m.d(input);
        if (d10.i()) {
            com.google.gson.e c10 = d10.c();
            Intrinsics.checkNotNullExpressionValue(c10, "getAsJsonArray(...)");
            Iterator it = c10.iterator();
            while (it.hasNext()) {
                com.google.gson.h hVar3 = (com.google.gson.h) it.next();
                if (hVar3.k()) {
                    com.google.gson.k e10 = hVar3.e();
                    Intrinsics.checkNotNull(e10);
                    if (e10.t("meta")) {
                        com.google.gson.h v10 = e10.v("meta");
                        if (v10.k()) {
                            Set u10 = v10.e().u();
                            Intrinsics.checkNotNullExpressionValue(u10, "keySet(...)");
                            hVar2 = CollectionsKt.joinToString$default(u10, null, null, null, 0, null, null, 63, null);
                        } else {
                            hVar2 = v10.toString();
                            Intrinsics.checkNotNullExpressionValue(hVar2, "toString(...)");
                        }
                        e10.p("meta", hVar2);
                    }
                    if (e10.t("balance")) {
                        com.google.gson.h v11 = e10.v("balance");
                        if (v11.k()) {
                            Set u11 = v11.e().u();
                            Intrinsics.checkNotNullExpressionValue(u11, "keySet(...)");
                            hVar = CollectionsKt.joinToString$default(u11, null, null, null, 0, null, null, 63, null);
                        } else {
                            hVar = v11.toString();
                            Intrinsics.checkNotNullExpressionValue(hVar, "toString(...)");
                        }
                        e10.p("balance", hVar);
                    }
                }
            }
        } else if (d10.k()) {
            com.google.gson.k e11 = d10.e();
            Intrinsics.checkNotNullExpressionValue(e11, "getAsJsonObject(...)");
            a(e11, "meta");
            a(e11, "balance");
        }
        String hVar4 = d10.toString();
        Intrinsics.checkNotNullExpressionValue(hVar4, "toString(...)");
        return hVar4;
    }

    public static void a(com.google.gson.k kVar, String str) {
        String hVar;
        if (kVar.t(str)) {
            com.google.gson.h v10 = kVar.v(str);
            if (v10.k()) {
                Set u10 = v10.e().u();
                Intrinsics.checkNotNullExpressionValue(u10, "keySet(...)");
                hVar = CollectionsKt.joinToString$default(u10, null, null, null, 0, null, null, 63, null);
            } else {
                hVar = v10.toString();
                Intrinsics.checkNotNullExpressionValue(hVar, "toString(...)");
            }
            kVar.p(str, hVar);
        }
    }
}
