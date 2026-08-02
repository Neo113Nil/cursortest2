package ru.ozon.app.android.logger.tree;

import Lm0.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "isDebug", "LLm0/a$c;", "logTree", "(Z)LLm0/a$c;", "logger_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LoggerTreeKt {
    @NotNull
    public static final a.c logTree(boolean z11) {
        return z11 ? new a.C0333a() : new LoggerTree();
    }
}
