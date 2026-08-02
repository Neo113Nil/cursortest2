package com.evervault.sdk.core.datahandlers;

import com.twilio.voice.EventKeys;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/evervault/sdk/core/datahandlers/DictionaryHandler;", "Lcom/evervault/sdk/core/datahandlers/DataHandler;", "()V", "canEncrypt", "", EventKeys.DATA, "", "encrypt", "context", "Lcom/evervault/sdk/core/datahandlers/DataHandlerContext;", "evervault-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDictionaryHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DictionaryHandler.kt\ncom/evervault/sdk/core/datahandlers/DictionaryHandler\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,15:1\n442#2:16\n392#2:17\n1238#3,2:18\n1241#3:21\n1#4:20\n*S KotlinDebug\n*F\n+ 1 DictionaryHandler.kt\ncom/evervault/sdk/core/datahandlers/DictionaryHandler\n*L\n10#1:16\n10#1:17\n10#1:18,2\n10#1:21\n*E\n"})
/* loaded from: classes2.dex */
public final class DictionaryHandler implements DataHandler {
    @Override // com.evervault.sdk.core.datahandlers.DataHandler
    public boolean canEncrypt(@NotNull Object data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return data instanceof Map;
    }

    @Override // com.evervault.sdk.core.datahandlers.DataHandler
    @NotNull
    public Object encrypt(@NotNull Object data, @NotNull DataHandlerContext context) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(context, "context");
        Map map = (Map) data;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            linkedHashMap.put(key, value != null ? context.encrypt(value) : null);
        }
        return linkedHashMap;
    }
}
