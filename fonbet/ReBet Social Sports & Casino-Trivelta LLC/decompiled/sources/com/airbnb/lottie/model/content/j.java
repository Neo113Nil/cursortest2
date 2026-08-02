package com.airbnb.lottie.model.content;

import com.airbnb.lottie.C2940j;
import com.airbnb.lottie.K;
import com.airbnb.lottie.L;

/* loaded from: classes.dex */
public class j implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f28777a;

    /* renamed from: b, reason: collision with root package name */
    public final a f28778b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f28779c;

    public enum a {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static a b(int i10) {
            return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? MERGE : EXCLUDE_INTERSECTIONS : INTERSECT : SUBTRACT : ADD : MERGE;
        }
    }

    public j(String str, a aVar, boolean z10) {
        this.f28777a = str;
        this.f28778b = aVar;
        this.f28779c = z10;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(K k10, C2940j c2940j, com.airbnb.lottie.model.layer.b bVar) {
        if (k10.h0(L.MergePathsApi19)) {
            return new com.airbnb.lottie.animation.content.l(this);
        }
        com.airbnb.lottie.utils.g.c("Animation contains merge paths but they are disabled.");
        return null;
    }

    public a b() {
        return this.f28778b;
    }

    public String c() {
        return this.f28777a;
    }

    public boolean d() {
        return this.f28779c;
    }

    public String toString() {
        return "MergePaths{mode=" + this.f28778b + '}';
    }
}
