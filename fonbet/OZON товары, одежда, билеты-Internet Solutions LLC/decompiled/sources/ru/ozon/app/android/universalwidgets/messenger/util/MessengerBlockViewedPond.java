package ru.ozon.app.android.universalwidgets.messenger.util;

import java.util.HashMap;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.models.c;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u0003R&\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/universalwidgets/messenger/util/MessengerBlockViewedPond;", "", "<init>", "()V", "Lru/ozon/android/messenger/framework/presentation/models/c;", "blockId", "", "id", "", "itemViewed", "(Lru/ozon/android/messenger/framework/presentation/models/c;Ljava/lang/Long;)V", "", "containsItem", "(Lru/ozon/android/messenger/framework/presentation/models/c;J)Z", "clear", "Ljava/util/HashMap;", "Ljava/util/HashSet;", "itemsInBlocks", "Ljava/util/HashMap;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MessengerBlockViewedPond {

    @NotNull
    private final HashMap<c, HashSet<Long>> itemsInBlocks = new HashMap<>();

    public final void clear() {
        this.itemsInBlocks.clear();
    }

    public final boolean containsItem(@NotNull c blockId, long id2) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        HashSet<Long> hashSet = this.itemsInBlocks.get(blockId);
        if (hashSet != null) {
            return hashSet.contains(Long.valueOf(id2));
        }
        return false;
    }

    public final void itemViewed(@NotNull c blockId, Long id2) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        HashSet<Long> hashSet = this.itemsInBlocks.get(blockId);
        if (hashSet == null) {
            hashSet = new HashSet<>();
            this.itemsInBlocks.put(blockId, hashSet);
        }
        if (id2 != null) {
            hashSet.add(id2);
        }
    }
}
