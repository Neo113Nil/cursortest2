package com.ironsource;

import defpackage.km5;
import defpackage.wv8;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.CollectionsKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.db, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4039db {

    @Nullable
    private final String a;
    private final int b;

    public C4039db(@Nullable String str, int i) {
        this.a = str;
        this.b = i;
    }

    private final String a(StackTraceElement[] stackTraceElementArr, int i) {
        Collection collection;
        Collection collection2;
        if (stackTraceElementArr.length <= i) {
            return "";
        }
        String className = stackTraceElementArr[i].getClassName();
        className.getClass();
        List h = new Regex("\\.").h(className);
        if (!h.isEmpty()) {
            ListIterator listIterator = h.listIterator(h.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    collection = CollectionsKt.L0(h, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        collection = km5.a;
        String str = ((String[]) collection.toArray(new String[0]))[r1.length - 1];
        if (!StringsKt.J(str, "$", false)) {
            return str;
        }
        List h2 = new Regex("\\$").h(str);
        if (!h2.isEmpty()) {
            ListIterator listIterator2 = h2.listIterator(h2.size());
            while (listIterator2.hasPrevious()) {
                if (((String) listIterator2.previous()).length() != 0) {
                    collection2 = CollectionsKt.L0(h2, listIterator2.nextIndex() + 1);
                    break;
                }
            }
        }
        collection2 = km5.a;
        return ((String[]) collection2.toArray(new String[0]))[0];
    }

    private final String b(StackTraceElement[] stackTraceElementArr, int i) {
        Collection collection;
        int i2;
        Collection collection2;
        Collection collection3;
        if (stackTraceElementArr.length <= i) {
            return "";
        }
        String className = stackTraceElementArr[i].getClassName();
        className.getClass();
        List h = new Regex("\\.").h(className);
        if (!h.isEmpty()) {
            ListIterator listIterator = h.listIterator(h.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    collection = CollectionsKt.L0(h, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        collection = km5.a;
        String[] strArr = (String[]) collection.toArray(new String[0]);
        String str = strArr[strArr.length - 1];
        if (StringsKt.J(str, "$", false)) {
            List h2 = new Regex("\\$").h(str);
            if (!h2.isEmpty()) {
                ListIterator listIterator2 = h2.listIterator(h2.size());
                while (listIterator2.hasPrevious()) {
                    if (((String) listIterator2.previous()).length() != 0) {
                        collection3 = CollectionsKt.L0(h2, listIterator2.nextIndex() + 1);
                        break;
                    }
                }
            }
            collection3 = km5.a;
            return wv8.i(((String[]) collection3.toArray(new String[0]))[1], ".", stackTraceElementArr[i].getMethodName());
        }
        String methodName = stackTraceElementArr[i].getMethodName();
        methodName.getClass();
        if (!StringsKt.J(methodName, "$", false) || stackTraceElementArr.length <= (i2 = i + 1)) {
            String methodName2 = stackTraceElementArr[i].getMethodName();
            methodName2.getClass();
            return methodName2;
        }
        String className2 = stackTraceElementArr[i2].getClassName();
        className2.getClass();
        List h3 = new Regex("\\$").h(className2);
        if (!h3.isEmpty()) {
            ListIterator listIterator3 = h3.listIterator(h3.size());
            while (listIterator3.hasPrevious()) {
                if (((String) listIterator3.previous()).length() != 0) {
                    collection2 = CollectionsKt.L0(h3, listIterator3.nextIndex() + 1);
                    break;
                }
            }
        }
        collection2 = km5.a;
        String[] strArr2 = (String[]) collection2.toArray(new String[0]);
        if (strArr2.length > 1) {
            return wv8.i(strArr2[1], ".", stackTraceElementArr[i2].getMethodName());
        }
        String methodName3 = stackTraceElementArr[i2].getMethodName();
        methodName3.getClass();
        return methodName3;
    }

    @NotNull
    public final String c() {
        String str = this.a;
        return (str == null || str.length() == 0) ? b() : wv8.i(b(), " - ", this.a);
    }

    public final int a() {
        return this.b;
    }

    private final String b() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        stackTrace.getClass();
        return String.format("%s %s", Arrays.copyOf(new Object[]{a(stackTrace, 4), b(stackTrace, 4)}, 2));
    }
}
