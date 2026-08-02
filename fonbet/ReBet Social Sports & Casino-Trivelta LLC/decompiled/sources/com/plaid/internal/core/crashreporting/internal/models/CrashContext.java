package com.plaid.internal.core.crashreporting.internal.models;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dBQ\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0002\u0010\u000eJ\u0006\u0010\u001b\u001a\u00020\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/plaid/internal/core/crashreporting/internal/models/CrashContext;", "", "breadcrumbLimit", "", "lastEventId", "Ljava/util/UUID;", "breadcrumbs", "", "Lcom/plaid/internal/core/crashreporting/internal/models/Breadcrumb;", "user", "Lcom/plaid/internal/core/crashreporting/internal/models/User;", "tags", "", "", "(ILjava/util/UUID;Ljava/util/List;Lcom/plaid/internal/core/crashreporting/internal/models/User;Ljava/util/Map;)V", "getLastEventId", "()Ljava/util/UUID;", "setLastEventId", "(Ljava/util/UUID;)V", "getTags$crash_reporting_release", "()Ljava/util/Map;", "setTags$crash_reporting_release", "(Ljava/util/Map;)V", "getUser", "()Lcom/plaid/internal/core/crashreporting/internal/models/User;", "setUser", "(Lcom/plaid/internal/core/crashreporting/internal/models/User;)V", "clear", "", "Companion", "crash-reporting_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CrashContext {
    public static final int DEFAULT_BREADCRUMB_LIMIT = 50;
    private final int breadcrumbLimit;

    @Nullable
    private volatile List<Breadcrumb> breadcrumbs;

    @Nullable
    private volatile UUID lastEventId;

    @Nullable
    private volatile Map<String, String> tags;

    @Nullable
    private volatile User user;

    public CrashContext() {
        this(0, null, null, null, null, 31, null);
    }

    public final synchronized void clear() {
        try {
            this.lastEventId = null;
            List<Breadcrumb> list = this.breadcrumbs;
            if (list != null) {
                list.clear();
            }
            this.user = null;
            Map<String, String> map = this.tags;
            if (map != null) {
                map.clear();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Nullable
    public final UUID getLastEventId() {
        return this.lastEventId;
    }

    @Nullable
    public final Map<String, String> getTags$crash_reporting_release() {
        return this.tags;
    }

    @Nullable
    public final User getUser() {
        return this.user;
    }

    public final void setLastEventId(@Nullable UUID uuid) {
        this.lastEventId = uuid;
    }

    public final void setTags$crash_reporting_release(@Nullable Map<String, String> map) {
        this.tags = map;
    }

    public final void setUser(@Nullable User user) {
        this.user = user;
    }

    public CrashContext(int i10, @Nullable UUID uuid, @Nullable List<Breadcrumb> list, @Nullable User user, @Nullable Map<String, String> map) {
        this.breadcrumbLimit = i10;
        this.lastEventId = uuid;
        this.breadcrumbs = list;
        this.user = user;
        this.tags = map;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ CrashContext(int r2, java.util.UUID r3, java.util.List r4, com.plaid.internal.core.crashreporting.internal.models.User r5, java.util.Map r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto L6
            r2 = 50
        L6:
            r8 = r7 & 2
            r0 = 0
            if (r8 == 0) goto Lc
            r3 = r0
        Lc:
            r8 = r7 & 4
            if (r8 == 0) goto L11
            r4 = r0
        L11:
            r8 = r7 & 8
            if (r8 == 0) goto L16
            r5 = r0
        L16:
            r7 = r7 & 16
            if (r7 == 0) goto L21
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L27
        L21:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L27:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.core.crashreporting.internal.models.CrashContext.<init>(int, java.util.UUID, java.util.List, com.plaid.internal.core.crashreporting.internal.models.User, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
