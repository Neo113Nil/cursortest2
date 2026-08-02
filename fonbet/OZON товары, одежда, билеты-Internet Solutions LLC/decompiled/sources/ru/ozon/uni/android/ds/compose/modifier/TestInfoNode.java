package ru.ozon.uni.android.ds.compose.modifier;

import C1.c;
import C1.h;
import C1.i;
import C1.n;
import D1.E0;
import I1.A;
import I1.D;
import I1.z;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0007R\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/uni/android/ds/compose/modifier/TestInfoNode;", "LD1/E0;", "Landroidx/compose/ui/e$c;", "LC1/i;", "Lru/ozon/uni/android/ds/compose/modifier/Locator;", "tag", "<init>", "(Lru/ozon/uni/android/ds/compose/modifier/Locator;)V", "LI1/D;", "", "applySemantics", "(LI1/D;)V", "Lru/ozon/uni/android/ds/compose/modifier/Locator;", "getTag", "()Lru/ozon/uni/android/ds/compose/modifier/Locator;", "setTag", "LC1/h;", "providedValues", "LC1/h;", "getProvidedValues", "()LC1/h;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
final class TestInfoNode extends e.c implements E0, i {

    @NotNull
    private final h providedValues;

    @NotNull
    private Locator tag;

    public TestInfoNode(@NotNull Locator tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.tag = tag;
        Pair pair = new Pair(AtomLocatorKt.getLocalDsTestTag(), this.tag.getLocatorTag());
        n nVar = new n((c) pair.e());
        nVar.c((c) pair.e(), pair.f());
        this.providedValues = nVar;
    }

    @Override // D1.E0
    public void applySemantics(@NotNull D d11) {
        Intrinsics.checkNotNullParameter(d11, "<this>");
        A.a(d11, true);
        z.t(d11, this.tag.getLocatorTag());
    }

    @Override // C1.i
    @NotNull
    public h getProvidedValues() {
        return this.providedValues;
    }

    public final void setTag(@NotNull Locator locator) {
        Intrinsics.checkNotNullParameter(locator, "<set-?>");
        this.tag = locator;
    }
}
