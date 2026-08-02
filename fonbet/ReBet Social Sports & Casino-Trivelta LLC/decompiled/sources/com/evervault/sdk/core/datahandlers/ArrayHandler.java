package com.evervault.sdk.core.datahandlers;

import com.twilio.voice.EventKeys;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/evervault/sdk/core/datahandlers/ArrayHandler;", "Lcom/evervault/sdk/core/datahandlers/DataHandler;", "()V", "canEncrypt", "", EventKeys.DATA, "", "encrypt", "context", "Lcom/evervault/sdk/core/datahandlers/DataHandlerContext;", "evervault-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nArrayHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrayHandler.kt\ncom/evervault/sdk/core/datahandlers/ArrayHandler\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,15:1\n1603#2,9:16\n1855#2:25\n1856#2:28\n1612#2:29\n1#3:26\n1#3:27\n*S KotlinDebug\n*F\n+ 1 ArrayHandler.kt\ncom/evervault/sdk/core/datahandlers/ArrayHandler\n*L\n10#1:16,9\n10#1:25\n10#1:28\n10#1:29\n10#1:27\n*E\n"})
/* loaded from: classes2.dex */
public final class ArrayHandler implements DataHandler {
    @Override // com.evervault.sdk.core.datahandlers.DataHandler
    public boolean canEncrypt(@NotNull Object data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return data instanceof Iterable;
    }

    @Override // com.evervault.sdk.core.datahandlers.DataHandler
    @NotNull
    public Object encrypt(@NotNull Object data, @NotNull DataHandlerContext context) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(context, "context");
        ArrayList arrayList = new ArrayList();
        Iterator it = ((Iterable) data).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Object encrypt = next != null ? context.encrypt(next) : null;
            if (encrypt != null) {
                arrayList.add(encrypt);
            }
        }
        return arrayList;
    }
}
