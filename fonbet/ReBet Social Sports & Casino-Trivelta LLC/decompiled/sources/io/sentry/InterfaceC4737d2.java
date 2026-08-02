package io.sentry;

import java.io.File;

/* renamed from: io.sentry.d2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC4737d2 {
    static /* synthetic */ void b(ILogger iLogger, String str, AbstractC4838u abstractC4838u, File file) {
        EnumC4788n3 enumC4788n3 = EnumC4788n3.DEBUG;
        iLogger.c(enumC4788n3, "Started processing cached files from %s", str);
        abstractC4838u.d(file);
        iLogger.c(enumC4788n3, "Finished processing cached files from %s", str);
    }

    default InterfaceC4664a2 a(final AbstractC4838u abstractC4838u, final String str, final ILogger iLogger) {
        final File file = new File(str);
        return new InterfaceC4664a2() { // from class: io.sentry.c2
            @Override // io.sentry.InterfaceC4664a2
            public final void a() {
                InterfaceC4737d2.b(ILogger.this, str, abstractC4838u, file);
            }
        };
    }

    InterfaceC4664a2 c(InterfaceC4740e0 interfaceC4740e0, F3 f32);

    default boolean d(String str, ILogger iLogger) {
        if (str != null && !str.isEmpty()) {
            return true;
        }
        iLogger.c(EnumC4788n3.INFO, "No cached dir path is defined in options.", new Object[0]);
        return false;
    }
}
