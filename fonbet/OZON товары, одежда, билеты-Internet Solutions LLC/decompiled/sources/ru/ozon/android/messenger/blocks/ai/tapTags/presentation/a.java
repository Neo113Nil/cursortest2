package ru.ozon.android.messenger.blocks.ai.tapTags.presentation;

import B0.C2454a;
import Kk.C3532b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.ai.tapTags.presentation.b;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final b.a f84311a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f84312b;

    /* renamed from: c, reason: collision with root package name */
    private final int f84313c;

    /* renamed from: d, reason: collision with root package name */
    private final int f84314d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C1464a f84315e;

    /* renamed from: f, reason: collision with root package name */
    private final String f84316f;

    /* renamed from: g, reason: collision with root package name */
    private final Float f84317g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f84318h;

    /* renamed from: ru.ozon.android.messenger.blocks.ai.tapTags.presentation.a$a, reason: collision with other inner class name */
    public static final class C1464a {

        /* renamed from: a, reason: collision with root package name */
        private final int f84319a;

        /* renamed from: b, reason: collision with root package name */
        private final int f84320b;

        /* renamed from: c, reason: collision with root package name */
        private final int f84321c;

        /* renamed from: d, reason: collision with root package name */
        private final int f84322d;

        /* renamed from: e, reason: collision with root package name */
        private final int f84323e;

        /* renamed from: f, reason: collision with root package name */
        private final int f84324f;

        public C1464a(int i11, int i12, int i13, int i14, int i15, int i16) {
            this.f84319a = i11;
            this.f84320b = i12;
            this.f84321c = i13;
            this.f84322d = i14;
            this.f84323e = i15;
            this.f84324f = i16;
        }

        public final int a() {
            return this.f84324f;
        }

        public final int b() {
            return this.f84321c;
        }

        public final int c() {
            return this.f84322d;
        }

        public final int d() {
            return this.f84320b;
        }

        public final int e() {
            return this.f84319a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1464a)) {
                return false;
            }
            C1464a c1464a = (C1464a) obj;
            return this.f84319a == c1464a.f84319a && this.f84320b == c1464a.f84320b && this.f84321c == c1464a.f84321c && this.f84322d == c1464a.f84322d && this.f84323e == c1464a.f84323e && this.f84324f == c1464a.f84324f;
        }

        public final int f() {
            return this.f84323e;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f84324f) + C2454a.a(this.f84323e, C2454a.a(this.f84322d, C2454a.a(this.f84321c, C2454a.a(this.f84320b, Integer.hashCode(this.f84319a) * 31, 31), 31), 31), 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TagsPaddings(paddingTop=");
            sb2.append(this.f84319a);
            sb2.append(", paddingRight=");
            sb2.append(this.f84320b);
            sb2.append(", paddingBottom=");
            sb2.append(this.f84321c);
            sb2.append(", paddingLeft=");
            sb2.append(this.f84322d);
            sb2.append(", rowGap=");
            sb2.append(this.f84323e);
            sb2.append(", columnGap=");
            return K00.b.e(this.f84324f, ")", sb2);
        }
    }

    public a(b.a aVar, boolean z11, int i11, int i12, @NotNull C1464a tagsPaddings, String str, Float f7, boolean z12) {
        Intrinsics.checkNotNullParameter(tagsPaddings, "tagsPaddings");
        this.f84311a = aVar;
        this.f84312b = z11;
        this.f84313c = i11;
        this.f84314d = i12;
        this.f84315e = tagsPaddings;
        this.f84316f = str;
        this.f84317g = f7;
        this.f84318h = z12;
    }

    public final int a() {
        return this.f84313c;
    }

    public final boolean b() {
        return this.f84312b;
    }

    public final Float c() {
        return this.f84317g;
    }

    public final int d() {
        return this.f84314d;
    }

    public final boolean e() {
        return this.f84318h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f84311a, aVar.f84311a) && this.f84312b == aVar.f84312b && this.f84313c == aVar.f84313c && this.f84314d == aVar.f84314d && Intrinsics.d(this.f84315e, aVar.f84315e) && Intrinsics.d(this.f84316f, aVar.f84316f) && Intrinsics.d(this.f84317g, aVar.f84317g) && this.f84318h == aVar.f84318h;
    }

    public final b.a f() {
        return this.f84311a;
    }

    @NotNull
    public final C1464a g() {
        return this.f84315e;
    }

    public final int hashCode() {
        b.a aVar = this.f84311a;
        int hashCode = (this.f84315e.hashCode() + C2454a.a(this.f84314d, C2454a.a(this.f84313c, C3532b.a((aVar == null ? 0 : aVar.hashCode()) * 31, 31, this.f84312b), 31), 31)) * 31;
        String str = this.f84316f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Float f7 = this.f84317g;
        return Boolean.hashCode(this.f84318h) + ((hashCode2 + (f7 != null ? f7.hashCode() : 0)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PresentationSettingsVO(showMoreButton=");
        sb2.append(this.f84311a);
        sb2.append(", hasMoreItems=");
        sb2.append(this.f84312b);
        sb2.append(", collapsedMaxRows=");
        sb2.append(this.f84313c);
        sb2.append(", lastItemMinWidth=");
        sb2.append(this.f84314d);
        sb2.append(", tagsPaddings=");
        sb2.append(this.f84315e);
        sb2.append(", backgroundColor=");
        sb2.append(this.f84316f);
        sb2.append(", itemsMaxPercentWidth=");
        sb2.append(this.f84317g);
        sb2.append(", pinToBottom=");
        return Pk0.a.a(")", sb2, this.f84318h);
    }
}
