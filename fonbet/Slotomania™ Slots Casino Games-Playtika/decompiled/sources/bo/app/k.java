package bo.app;

import com.braze.Constants;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u0015\u0010\u0016J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lbo/app/k;", "Lbo/app/g2;", "", Constants.BRAZE_PUSH_CONTENT_KEY, "", "toString", "", "hashCode", "", "other", "equals", "", "Lbo/app/x1;", "eventsList", "Ljava/util/Set;", "b", "()Ljava/util/Set;", "isEmpty", "Z", "e", "()Z", "<init>", "(Ljava/util/Set;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes8.dex */
public final /* data */ class k implements g2 {
    private final Set<x1> b;
    private final boolean c;

    /* JADX WARN: Multi-variable type inference failed */
    public k(Set<? extends x1> eventsList) {
        Intrinsics.checkNotNullParameter(eventsList, "eventsList");
        this.b = eventsList;
        this.c = eventsList.isEmpty();
    }

    public final boolean a() {
        Set<x1> set = this.b;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            if (((x1) it.next()).j() == e1.SESSION_START) {
                return true;
            }
        }
        return false;
    }

    public final Set<x1> b() {
        return this.b;
    }

    @Override // bo.app.g2
    /* renamed from: e, reason: from getter */
    public boolean getC() {
        return this.c;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof k) && Intrinsics.areEqual(this.b, ((k) other).b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        return "BrazeEventContainer(eventsList=" + this.b + ')';
    }
}
