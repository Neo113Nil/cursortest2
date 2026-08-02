package bo.app;

import com.braze.storage.ContentCardsDataStoreProvider$Companion;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes.dex */
public final /* synthetic */ class t3 extends AdaptedFunctionReference implements Function3, SuspendFunction {
    public t3(Object obj) {
        super(3, obj, ContentCardsDataStoreProvider$Companion.class, "migrateContentCardsMetadataToJson", "migrateContentCardsMetadataToJson(Landroidx/datastore/migrations/SharedPreferencesView;Landroidx/datastore/preferences/core/Preferences;)Landroidx/datastore/preferences/core/Preferences;", 4);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return ((ContentCardsDataStoreProvider$Companion) this.receiver).migrateContentCardsMetadataToJson((K0.c) obj, (L0.f) obj2);
    }
}
