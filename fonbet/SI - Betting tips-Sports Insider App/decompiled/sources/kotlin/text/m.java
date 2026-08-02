package kotlin.text;

import androidx.core.view.g0;
import java.util.Iterator;
import java.util.regex.Matcher;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class m extends kotlin.collections.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f19279a;

    public m(n nVar) {
        this.f19279a = nVar;
    }

    public final MatchGroup a(int i5) {
        Matcher matcher = this.f19279a.f19280a;
        IntRange d10 = zf.j.d(matcher.start(i5), matcher.end(i5));
        if (d10.f19234a < 0) {
            return null;
        }
        String group = matcher.group(i5);
        Intrinsics.checkNotNullExpressionValue(group, "group(...)");
        return new MatchGroup(group, d10);
    }

    @Override // kotlin.collections.a, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof MatchGroup) {
            return super.contains((MatchGroup) obj);
        }
        return false;
    }

    @Override // kotlin.collections.a
    public final int getSize() {
        return this.f19279a.f19280a.groupCount() + 1;
    }

    @Override // kotlin.collections.a, java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new g0(bg.q.f(CollectionsKt.z(kotlin.collections.u.d(this)), new Function1() { // from class: kotlin.text.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m.this.a(((Integer) obj).intValue());
            }
        }));
    }
}
