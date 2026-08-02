package ic;

import androidx.appcompat.widget.c1;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import sg.s0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@og.e
@SourceDebugExtension({"SMAP\nProductDetailsImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductDetailsImpl.kt\ncom/sports/insider/domain/entity/common/ProductDetailsImpl$DetailsSubsImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,179:1\n230#2,2:180\n230#2,2:182\n230#2,2:184\n*S KotlinDebug\n*F\n+ 1 ProductDetailsImpl.kt\ncom/sports/insider/domain/entity/common/ProductDetailsImpl$DetailsSubsImpl\n*L\n48#1:180,2\n59#1:182,2\n72#1:184,2\n*E\n"})
/* loaded from: classes.dex */
public final class a0 implements n {

    @NotNull
    public static final z Companion = new z();

    /* renamed from: f, reason: collision with root package name */
    public static final gf.i[] f11069f;

    /* renamed from: a, reason: collision with root package name */
    public final String f11070a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11071b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11072c;

    /* renamed from: d, reason: collision with root package name */
    public final List f11073d;

    /* renamed from: e, reason: collision with root package name */
    public final List f11074e;

    static {
        gf.l lVar = gf.l.f10027a;
        f11069f = new gf.i[]{null, null, null, gf.k.a(lVar, new b2.b(28)), gf.k.a(lVar, new b2.b(29))};
    }

    public /* synthetic */ a0(int i5, String str, String str2, String str3, List list, List list2) {
        if (31 != (i5 & 31)) {
            s0.f(i5, 31, y.f11139a.d());
            throw null;
        }
        this.f11070a = str;
        this.f11071b = str2;
        this.f11072c = str3;
        this.f11073d = list;
        this.f11074e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return Intrinsics.areEqual(this.f11070a, a0Var.f11070a) && Intrinsics.areEqual(this.f11071b, a0Var.f11071b) && Intrinsics.areEqual(this.f11072c, a0Var.f11072c) && Intrinsics.areEqual(this.f11073d, a0Var.f11073d) && Intrinsics.areEqual(this.f11074e, a0Var.f11074e);
    }

    public final int hashCode() {
        int hashCode = this.f11070a.hashCode() * 31;
        String str = this.f11071b;
        return this.f11074e.hashCode() + ((this.f11073d.hashCode() + r4.k.j((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f11072c)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DetailsSubsImpl(planId=");
        sb2.append(this.f11070a);
        sb2.append(", offerId=");
        sb2.append(this.f11071b);
        sb2.append(", offerToken=");
        sb2.append(this.f11072c);
        sb2.append(", offerTags=");
        sb2.append(this.f11073d);
        sb2.append(", pricingPhases=");
        return c1.p(sb2, this.f11074e, ')');
    }

    public a0(String planId, String str, String offerToken, List offerTags, List pricingPhases) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        Intrinsics.checkNotNullParameter(offerToken, "offerToken");
        Intrinsics.checkNotNullParameter(offerTags, "offerTags");
        Intrinsics.checkNotNullParameter(pricingPhases, "pricingPhases");
        this.f11070a = planId;
        this.f11071b = str;
        this.f11072c = offerToken;
        this.f11073d = offerTags;
        this.f11074e = pricingPhases;
    }
}
