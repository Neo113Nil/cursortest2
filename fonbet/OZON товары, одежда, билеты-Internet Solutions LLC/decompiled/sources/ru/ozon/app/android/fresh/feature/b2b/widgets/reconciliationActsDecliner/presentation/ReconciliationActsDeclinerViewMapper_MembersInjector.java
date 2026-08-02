package ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.presentation;

import Ib.b;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;

/* loaded from: classes6.dex */
public final class ReconciliationActsDeclinerViewMapper_MembersInjector implements b<ReconciliationActsDeclinerViewMapper> {
    public static void injectJsonDeserializer(ReconciliationActsDeclinerViewMapper reconciliationActsDeclinerViewMapper, JsonParser jsonParser) {
        reconciliationActsDeclinerViewMapper.jsonDeserializer = jsonParser;
    }
}
