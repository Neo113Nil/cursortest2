package com.evervault.sdk;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0006B\u000f\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005\u0082\u0001\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/evervault/sdk/EvervaultException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "message", "", "(Ljava/lang/String;)V", "InitializationError", "Lcom/evervault/sdk/EvervaultException$InitializationError;", "evervault-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class EvervaultException extends RuntimeException {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/evervault/sdk/EvervaultException$InitializationError;", "Lcom/evervault/sdk/EvervaultException;", "()V", "evervault-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class InitializationError extends EvervaultException {

        @NotNull
        public static final InitializationError INSTANCE = new InitializationError();

        private InitializationError() {
            super("Evervault not initialized. Please use Evervault.shared.configure() to configure Evervault.", null);
        }
    }

    public /* synthetic */ EvervaultException(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private EvervaultException(String str) {
        super(str);
    }
}
