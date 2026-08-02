package ru.ozon.app.android.storage.railwaymock;

import android.content.SharedPreferences;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/util/concurrent/atomic/AtomicBoolean;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class RailwayMockStorageImpl$isEnabled$2 extends AbstractC7737t implements Function0<AtomicBoolean> {
    final /* synthetic */ RailwayMockStorageImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RailwayMockStorageImpl$isEnabled$2(RailwayMockStorageImpl railwayMockStorageImpl) {
        super(0);
        this.this$0 = railwayMockStorageImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AtomicBoolean invoke() {
        SharedPreferences sharedPrefs;
        sharedPrefs = this.this$0.getSharedPrefs();
        return new AtomicBoolean(sharedPrefs.getBoolean("is_enabled", false));
    }
}
