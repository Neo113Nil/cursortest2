package com.squareup.moshi;

import com.squareup.moshi.y;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.squareup.moshi.e, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5973e<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private y.d<K, V> f60398a;

    /* renamed from: b, reason: collision with root package name */
    private int f60399b;

    /* renamed from: c, reason: collision with root package name */
    private int f60400c;

    /* renamed from: d, reason: collision with root package name */
    private int f60401d;

    public final void a(@NotNull y.d<K, V> node) {
        Intrinsics.checkNotNullParameter(node, "node");
        node.f60495c = null;
        node.f60493a = null;
        node.f60494b = null;
        node.f60501i = 1;
        int i11 = this.f60399b;
        if (i11 > 0) {
            int i12 = this.f60401d;
            if ((i12 & 1) == 0) {
                this.f60401d = i12 + 1;
                this.f60399b = i11 - 1;
                this.f60400c++;
            }
        }
        node.f60493a = this.f60398a;
        this.f60398a = node;
        int i13 = this.f60401d;
        int i14 = i13 + 1;
        this.f60401d = i14;
        int i15 = this.f60399b;
        if (i15 > 0 && (i14 & 1) == 0) {
            this.f60401d = i13 + 2;
            this.f60399b = i15 - 1;
            this.f60400c++;
        }
        int i16 = 4;
        while (true) {
            int i17 = i16 - 1;
            if ((this.f60401d & i17) != i17) {
                return;
            }
            int i18 = this.f60400c;
            if (i18 == 0) {
                y.d<K, V> dVar = this.f60398a;
                Intrinsics.f(dVar);
                y.d<K, V> dVar2 = dVar.f60493a;
                Intrinsics.f(dVar2);
                y.d<K, V> dVar3 = dVar2.f60493a;
                Intrinsics.f(dVar3);
                dVar2.f60493a = dVar3.f60493a;
                this.f60398a = dVar2;
                dVar2.f60494b = dVar3;
                dVar2.f60495c = dVar;
                dVar2.f60501i = dVar.f60501i + 1;
                dVar3.f60493a = dVar2;
                dVar.f60493a = dVar2;
            } else if (i18 == 1) {
                y.d<K, V> dVar4 = this.f60398a;
                Intrinsics.f(dVar4);
                y.d<K, V> dVar5 = dVar4.f60493a;
                Intrinsics.f(dVar5);
                this.f60398a = dVar5;
                dVar5.f60495c = dVar4;
                dVar5.f60501i = dVar4.f60501i + 1;
                dVar4.f60493a = dVar5;
                this.f60400c = 0;
            } else if (i18 == 2) {
                this.f60400c = 0;
            }
            i16 *= 2;
        }
    }

    public final void b(int i11) {
        this.f60399b = ((Integer.highestOneBit(i11) * 2) - 1) - i11;
        this.f60401d = 0;
        this.f60400c = 0;
        this.f60398a = null;
    }

    @NotNull
    public final y.d<K, V> c() {
        y.d<K, V> dVar = this.f60398a;
        Intrinsics.f(dVar);
        if (dVar.f60493a == null) {
            return dVar;
        }
        throw new IllegalStateException("Check failed.");
    }
}
