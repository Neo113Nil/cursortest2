package kotlin.reflect.jvm.internal.impl.util.collectionUtils;

import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ScopeUtilsKt {
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final <T> Collection<T> concat(@Nullable Collection<? extends T> collection, @NotNull Collection<? extends T> collection2) {
        collection2.getClass();
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == 0) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    @NotNull
    public static final SmartList<MemberScope> listOfNonEmptyScopes(@NotNull Iterable<? extends MemberScope> iterable) {
        iterable.getClass();
        SmartList<MemberScope> smartList = new SmartList<>();
        for (MemberScope memberScope : iterable) {
            MemberScope memberScope2 = memberScope;
            if (memberScope2 != null && memberScope2 != MemberScope.Empty.INSTANCE) {
                smartList.add(memberScope);
            }
        }
        return smartList;
    }
}
