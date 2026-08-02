package ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.presentation;

import B0.C2454a;
import Q1.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f86934a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f86935b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f86936c;

    /* renamed from: d, reason: collision with root package name */
    private final String f86937d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final K f86938e;

    /* renamed from: f, reason: collision with root package name */
    private final int f86939f;

    /* renamed from: g, reason: collision with root package name */
    private final int f86940g;

    public y(boolean z11, @NotNull String label, @NotNull String placeholder, String str, @NotNull K value, int i11, int i12) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f86934a = z11;
        this.f86935b = label;
        this.f86936c = placeholder;
        this.f86937d = str;
        this.f86938e = value;
        this.f86939f = i11;
        this.f86940g = i12;
    }

    public static y a(y yVar, K value) {
        String label = yVar.f86935b;
        Intrinsics.checkNotNullParameter(label, "label");
        String placeholder = yVar.f86936c;
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(value, "value");
        return new y(yVar.f86934a, label, placeholder, yVar.f86937d, value, yVar.f86939f, yVar.f86940g);
    }

    public final String b() {
        return this.f86937d;
    }

    @NotNull
    public final String c() {
        return this.f86935b;
    }

    public final int d() {
        return this.f86939f;
    }

    public final int e() {
        return this.f86940g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f86934a == yVar.f86934a && Intrinsics.d(this.f86935b, yVar.f86935b) && Intrinsics.d(this.f86936c, yVar.f86936c) && Intrinsics.d(this.f86937d, yVar.f86937d) && Intrinsics.d(this.f86938e, yVar.f86938e) && this.f86939f == yVar.f86939f && this.f86940g == yVar.f86940g;
    }

    @NotNull
    public final K f() {
        return this.f86938e;
    }

    public final int hashCode() {
        int a11 = G.g.a(G.g.a(Boolean.hashCode(this.f86934a) * 31, 31, this.f86935b), 31, this.f86936c);
        String str = this.f86937d;
        return Integer.hashCode(this.f86940g) + C2454a.a(this.f86939f, (this.f86938e.hashCode() + ((a11 + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InputVO(isEditable=");
        sb2.append(this.f86934a);
        sb2.append(", label=");
        sb2.append(this.f86935b);
        sb2.append(", placeholder=");
        sb2.append(this.f86936c);
        sb2.append(", caption=");
        sb2.append(this.f86937d);
        sb2.append(", value=");
        sb2.append(this.f86938e);
        sb2.append(", maxLength=");
        sb2.append(this.f86939f);
        sb2.append(", minLines=");
        return K00.b.e(this.f86940g, ")", sb2);
    }
}
