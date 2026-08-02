package bg;

import java.io.BufferedReader;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class k implements Sequence {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3219a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3220b;

    public /* synthetic */ k(int i5, Object obj) {
        this.f3219a = i5;
        this.f3220b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.jvm.functions.Function2, mf.h] */
    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        switch (this.f3219a) {
            case 0:
                ?? block = (mf.h) this.f3220b;
                Intrinsics.checkNotNullParameter(block, "block");
                i iVar = new i();
                iVar.f3218d = lf.d.a(block, iVar, iVar);
                return iVar;
            case 1:
                return (Iterator) this.f3220b;
            case 2:
                return ArrayIteratorKt.iterator((Object[]) this.f3220b);
            case 3:
                return ((Iterable) this.f3220b).iterator();
            case 4:
                return new kotlin.text.k((CharSequence) this.f3220b);
            default:
                return new rf.o(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(Function2 function2) {
        this.f3219a = 0;
        this.f3220b = (mf.h) function2;
    }

    public k(BufferedReader reader) {
        this.f3219a = 5;
        Intrinsics.checkNotNullParameter(reader, "reader");
        this.f3220b = reader;
    }
}
