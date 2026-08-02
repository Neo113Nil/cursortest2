package A5;

import android.widget.AbsSeekBar;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: A5.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1015c extends t {

    /* renamed from: A, reason: collision with root package name */
    public final AbsSeekBar f113A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1015c(AbsSeekBar absSeekBar) {
        super(absSeekBar, 0, 0, 0, 14, null);
        Intrinsics.checkNotNullParameter(absSeekBar, "absSeekBar");
        this.f113A = absSeekBar;
    }

    @Override // A5.t, A5.H
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1015c) && super.equals(obj) && Intrinsics.areEqual(this.f113A, ((C1015c) obj).f113A);
    }

    @Override // A5.t, A5.H
    public int hashCode() {
        return (super.hashCode() * 31) + this.f113A.hashCode();
    }

    @Override // A5.t, A5.H
    public String toString() {
        return "AbsSeekBarMetadata()";
    }
}
