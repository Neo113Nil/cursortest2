package com.evervault.sdk.core.datahandlers;

import com.evervault.sdk.core.EncryptionService;
import com.evervault.sdk.core.exceptions.NotPossibleToHandleDataTypeException;
import com.twilio.voice.EventKeys;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/evervault/sdk/core/datahandlers/DataHandlers;", "", "encryptionService", "Lcom/evervault/sdk/core/EncryptionService;", "(Lcom/evervault/sdk/core/EncryptionService;)V", "handlers", "", "Lcom/evervault/sdk/core/datahandlers/DataHandler;", "encrypt", EventKeys.DATA, "Context", "evervault-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDataHandlers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataHandlers.kt\ncom/evervault/sdk/core/datahandlers/DataHandlers\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,30:1\n288#2,2:31\n*S KotlinDebug\n*F\n+ 1 DataHandlers.kt\ncom/evervault/sdk/core/datahandlers/DataHandlers\n*L\n23#1:31,2\n*E\n"})
/* loaded from: classes2.dex */
public final class DataHandlers {

    @NotNull
    private final EncryptionService encryptionService;

    @NotNull
    private final List<DataHandler> handlers;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/evervault/sdk/core/datahandlers/DataHandlers$Context;", "Lcom/evervault/sdk/core/datahandlers/DataHandlerContext;", "dataHandlers", "Lcom/evervault/sdk/core/datahandlers/DataHandlers;", "(Lcom/evervault/sdk/core/datahandlers/DataHandlers;Lcom/evervault/sdk/core/datahandlers/DataHandlers;)V", "encrypt", "", EventKeys.DATA, "evervault-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class Context implements DataHandlerContext {

        @NotNull
        private final DataHandlers dataHandlers;
        final /* synthetic */ DataHandlers this$0;

        public Context(@NotNull DataHandlers dataHandlers, DataHandlers dataHandlers2) {
            Intrinsics.checkNotNullParameter(dataHandlers2, "dataHandlers");
            this.this$0 = dataHandlers;
            this.dataHandlers = dataHandlers2;
        }

        @Override // com.evervault.sdk.core.datahandlers.DataHandlerContext
        @NotNull
        public Object encrypt(@NotNull Object data) {
            Intrinsics.checkNotNullParameter(data, "data");
            return this.dataHandlers.encrypt(data);
        }
    }

    public DataHandlers(@NotNull EncryptionService encryptionService) {
        Intrinsics.checkNotNullParameter(encryptionService, "encryptionService");
        this.encryptionService = encryptionService;
        this.handlers = CollectionsKt.listOf((Object[]) new DataHandler[]{new StringHandler(encryptionService), new BooleanHandler(encryptionService), new NumberHandler(encryptionService), new BytesHandler(encryptionService), new DictionaryHandler(), new ArrayHandler()});
    }

    @NotNull
    public final Object encrypt(@NotNull Object data) {
        Object obj;
        Intrinsics.checkNotNullParameter(data, "data");
        Iterator<T> it = this.handlers.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((DataHandler) obj).canEncrypt(data)) {
                break;
            }
        }
        DataHandler dataHandler = (DataHandler) obj;
        if (dataHandler != null) {
            return dataHandler.encrypt(data, new Context(this, this));
        }
        throw NotPossibleToHandleDataTypeException.INSTANCE;
    }
}
