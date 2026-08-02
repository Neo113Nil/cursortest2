package com.plaid.internal;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class P6<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final ArrayList f39524a;

    /* renamed from: b, reason: collision with root package name */
    public int f39525b;

    /* renamed from: c, reason: collision with root package name */
    public int f39526c;

    /* renamed from: d, reason: collision with root package name */
    public int f39527d;

    public P6() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 50; i10++) {
            arrayList.add(null);
        }
        this.f39524a = arrayList;
    }

    @NotNull
    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int i10 = this.f39526c;
        int i11 = this.f39525b;
        if (i10 <= i11) {
            int size = this.f39524a.size();
            while (i11 < size) {
                Object obj = this.f39524a.get(i11);
                if (obj != null) {
                    arrayList.add(obj);
                }
                i11++;
            }
            int i12 = this.f39526c;
            for (int i13 = 0; i13 < i12; i13++) {
                Object obj2 = this.f39524a.get(i13);
                if (obj2 != null) {
                    arrayList.add(obj2);
                }
            }
        } else if (i11 <= i10) {
            while (true) {
                Object obj3 = this.f39524a.get(i11);
                if (obj3 != null) {
                    arrayList.add(obj3);
                }
                if (i11 == i10) {
                    break;
                }
                i11++;
            }
        }
        return arrayList;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(CollectionsKt.joinToString$default(a(), ", ", "{", "}", 0, null, null, 56, null));
        sb2.append(" [capacity=" + this.f39527d + ", H=" + this.f39525b + ", T=" + this.f39526c + "]");
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }
}
