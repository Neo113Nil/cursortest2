package ru.ozon.app.android.abtool.presentation.features.recycler;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u0006J\u000e\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/abtool/presentation/features/recycler/EditStateCache;", "", "<init>", "()V", "cache", "", "", "Lru/ozon/app/android/abtool/presentation/features/recycler/EditState;", "save", "", "id", "text", "selection", "", "get", "clear", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class EditStateCache {

    @NotNull
    private final Map<String, EditState> cache = new LinkedHashMap();

    public final void clear(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.cache.remove(id2);
    }

    public final EditState get(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return this.cache.get(id2);
    }

    public final void save(@NotNull String id2, @NotNull String text, int selection) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        this.cache.put(id2, new EditState(text, selection));
    }
}
