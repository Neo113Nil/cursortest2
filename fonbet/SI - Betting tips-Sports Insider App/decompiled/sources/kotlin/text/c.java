package kotlin.text;

import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class c implements Sequence {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f19257a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19258b;

    /* renamed from: c, reason: collision with root package name */
    public final Function2 f19259c;

    public c(CharSequence input, int i5, Function2 getNextMatch) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(getNextMatch, "getNextMatch");
        this.f19257a = input;
        this.f19258b = i5;
        this.f19259c = getNextMatch;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new b(this);
    }
}
