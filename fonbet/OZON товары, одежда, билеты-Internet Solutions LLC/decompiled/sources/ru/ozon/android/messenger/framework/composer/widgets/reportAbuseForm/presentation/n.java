package ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.presentation;

import C.o0;
import Kk.C3532b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

/* loaded from: classes10.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<CellDTO> f87106a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f87107b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f87108c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f87109d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f87110e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f87111f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f87112g;

    /* renamed from: h, reason: collision with root package name */
    private final String f87113h;

    /* renamed from: i, reason: collision with root package name */
    private final String f87114i;

    /* renamed from: j, reason: collision with root package name */
    private final Integer f87115j;

    /* renamed from: k, reason: collision with root package name */
    private final String f87116k;

    static {
        int i11 = CellDTO.$stable;
    }

    public n() {
        this(0);
    }

    public static n a(n nVar, List list, Integer num, String str, String str2, boolean z11, boolean z12, boolean z13, String str3, String str4, Integer num2, String str5, int i11) {
        if ((i11 & 1) != 0) {
            list = nVar.f87106a;
        }
        List cells = list;
        if ((i11 & 2) != 0) {
            num = nVar.f87107b;
        }
        Integer num3 = num;
        if ((i11 & 4) != 0) {
            str = nVar.f87108c;
        }
        String selectedReason = str;
        String reasonDescription = (i11 & 8) != 0 ? nVar.f87109d : str2;
        boolean z14 = (i11 & 16) != 0 ? nVar.f87110e : z11;
        boolean z15 = (i11 & 32) != 0 ? nVar.f87111f : z12;
        boolean z16 = (i11 & 64) != 0 ? nVar.f87112g : z13;
        String str6 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? nVar.f87113h : str3;
        String str7 = (i11 & 256) != 0 ? nVar.f87114i : str4;
        Integer num4 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? nVar.f87115j : num2;
        String str8 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? nVar.f87116k : str5;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(cells, "cells");
        Intrinsics.checkNotNullParameter(selectedReason, "selectedReason");
        Intrinsics.checkNotNullParameter(reasonDescription, "reasonDescription");
        return new n(cells, num3, selectedReason, reasonDescription, z14, z15, z16, str6, str7, num4, str8);
    }

    @NotNull
    public final List<CellDTO> b() {
        return this.f87106a;
    }

    @NotNull
    public final String c() {
        return this.f87109d;
    }

    public final Integer d() {
        return this.f87107b;
    }

    @NotNull
    public final String e() {
        return this.f87108c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.d(this.f87106a, nVar.f87106a) && Intrinsics.d(this.f87107b, nVar.f87107b) && Intrinsics.d(this.f87108c, nVar.f87108c) && Intrinsics.d(this.f87109d, nVar.f87109d) && this.f87110e == nVar.f87110e && this.f87111f == nVar.f87111f && this.f87112g == nVar.f87112g && Intrinsics.d(this.f87113h, nVar.f87113h) && Intrinsics.d(this.f87114i, nVar.f87114i) && Intrinsics.d(this.f87115j, nVar.f87115j) && Intrinsics.d(this.f87116k, nVar.f87116k);
    }

    public final boolean f() {
        return this.f87112g;
    }

    public final Integer g() {
        return this.f87115j;
    }

    public final String h() {
        return this.f87114i;
    }

    public final int hashCode() {
        int hashCode = this.f87106a.hashCode() * 31;
        Integer num = this.f87107b;
        int a11 = C3532b.a(C3532b.a(C3532b.a(G.g.a(G.g.a((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.f87108c), 31, this.f87109d), 31, this.f87110e), 31, this.f87111f), 31, this.f87112g);
        String str = this.f87113h;
        int hashCode2 = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f87114i;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.f87115j;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.f87116k;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String i() {
        return this.f87113h;
    }

    public final boolean j() {
        return this.f87111f;
    }

    public final boolean k() {
        return this.f87110e;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReportAbuseFormState(cells=");
        sb2.append(this.f87106a);
        sb2.append(", selectedCellIndex=");
        sb2.append(this.f87107b);
        sb2.append(", selectedReason=");
        sb2.append(this.f87108c);
        sb2.append(", reasonDescription=");
        sb2.append(this.f87109d);
        sb2.append(", isInProgress=");
        sb2.append(this.f87110e);
        sb2.append(", isDescriptionRequired=");
        sb2.append(this.f87111f);
        sb2.append(", showDescriptionError=");
        sb2.append(this.f87112g);
        sb2.append(", textAreaPlaceholder=");
        sb2.append(this.f87113h);
        sb2.append(", textAreaNotEmptyCaption=");
        sb2.append(this.f87114i);
        sb2.append(", textAreaMaxLength=");
        sb2.append(this.f87115j);
        sb2.append(", backgroundColor=");
        return o0.c(sb2, this.f87116k, ")");
    }

    public n(@NotNull List<CellDTO> cells, Integer num, @NotNull String selectedReason, @NotNull String reasonDescription, boolean z11, boolean z12, boolean z13, String str, String str2, Integer num2, String str3) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        Intrinsics.checkNotNullParameter(selectedReason, "selectedReason");
        Intrinsics.checkNotNullParameter(reasonDescription, "reasonDescription");
        this.f87106a = cells;
        this.f87107b = num;
        this.f87108c = selectedReason;
        this.f87109d = reasonDescription;
        this.f87110e = z11;
        this.f87111f = z12;
        this.f87112g = z13;
        this.f87113h = str;
        this.f87114i = str2;
        this.f87115j = num2;
        this.f87116k = str3;
    }

    public n(int i11) {
        this(K.f71697a, null, "", "", false, false, false, null, null, null, null);
    }
}
