package dc0;

import java.util.Comparator;
import ru.ozon.id.nativeauth.account.CrossAppCredentials;

/* renamed from: dc0.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6158d<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t2, T t11) {
        return Vc.a.b(Long.valueOf(((CrossAppCredentials) t11).getCreatedAt()), Long.valueOf(((CrossAppCredentials) t2).getCreatedAt()));
    }
}
