package ru.ozon.app.android.pikazon;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pikazon.placeholdertracker.PlaceholderAreaVisibilityChecker;
import ru.ozon.app.android.pikazon.placeholdertracker.PlaceholderInfoPool;
import ru.ozon.app.android.pikazon.placeholdertracker.PlaceholderTrackerImpl;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pikazon/placeholdertracker/PlaceholderTrackerImpl;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class Pikazon$placeholderTracker$2 extends AbstractC7737t implements Function0<PlaceholderTrackerImpl> {
    final /* synthetic */ Pikazon this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Pikazon$placeholderTracker$2(Pikazon pikazon) {
        super(0);
        this.this$0 = pikazon;
    }

    @Override // kotlin.jvm.functions.Function0
    public final PlaceholderTrackerImpl invoke() {
        return new PlaceholderTrackerImpl(new PlaceholderAreaVisibilityChecker(this.this$0.getUseNewVisibilityChecker$lib_release(), new Pikazon$placeholderTracker$2$visibilityChecker$1(this.this$0)), new PlaceholderInfoPool(null, 0, 3, null));
    }
}
