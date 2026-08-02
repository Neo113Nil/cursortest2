package A5;

import android.graphics.RectF;
import android.widget.CompoundButton;
import kotlin.jvm.internal.Intrinsics;
import y5.C6855b;

/* loaded from: classes2.dex */
public class k extends C1020h {

    /* renamed from: z, reason: collision with root package name */
    public final CompoundButton f134z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(CompoundButton compoundButton, C6855b crawlerConfigurations) {
        super(compoundButton, crawlerConfigurations);
        Intrinsics.checkNotNullParameter(compoundButton, "compoundButton");
        Intrinsics.checkNotNullParameter(crawlerConfigurations, "crawlerConfigurations");
        this.f134z = compoundButton;
    }

    @Override // A5.C1020h, A5.A, A5.H
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && super.equals(obj) && Intrinsics.areEqual(this.f134z, ((k) obj).f134z);
    }

    @Override // A5.C1020h, A5.A, A5.H
    public int hashCode() {
        return (super.hashCode() * 31) + this.f134z.hashCode();
    }

    @Override // A5.H
    public RectF i() {
        RectF i10 = super.i();
        return new RectF(i10.left + this.f134z.getCompoundPaddingLeft(), i10.top, i10.right - this.f134z.getCompoundPaddingRight(), i10.bottom);
    }

    @Override // A5.C1020h, A5.A, A5.H
    public String toString() {
        return "CompoundButtonMetadata()";
    }
}
