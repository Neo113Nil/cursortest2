package io.sentry;

import io.sentry.protocol.profiling.SentryProfile;
import java.io.IOException;

/* loaded from: classes9.dex */
public final class NoOpProfileConverter implements IProfileConverter {
    private static final NoOpProfileConverter instance = new NoOpProfileConverter();

    private NoOpProfileConverter() {
    }

    public static NoOpProfileConverter getInstance() {
        return instance;
    }

    @Override // io.sentry.IProfileConverter
    public SentryProfile convertFromFile(String str) throws IOException {
        return new SentryProfile();
    }
}
