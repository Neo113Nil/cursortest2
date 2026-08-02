package io.sentry;

import io.sentry.protocol.profiling.SentryProfile;
import java.io.IOException;

/* loaded from: classes9.dex */
public interface IProfileConverter {
    SentryProfile convertFromFile(String str) throws IOException;
}
