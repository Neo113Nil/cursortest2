package ru.ozon.android.ozonLogger.core;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.ozonLogger.android.AndroidLogEntry;
import ru.ozon.android.ozonLogger.core.LogEntry;

/* loaded from: classes6.dex */
public abstract class d<E extends LogEntry> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f92037a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f92038b;

    /* renamed from: c, reason: collision with root package name */
    private final Boolean f92039c;

    /* renamed from: d, reason: collision with root package name */
    private String f92040d;

    protected d(@NotNull String team, @NotNull String group, Boolean bool) {
        Intrinsics.checkNotNullParameter(team, "team");
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(team, "team");
        Intrinsics.checkNotNullParameter(group, "group");
        this.f92037a = team;
        this.f92038b = group;
        this.f92039c = bool;
        this.f92040d = null;
    }

    public void a(@NotNull AndroidLogEntry logEntry) {
        Intrinsics.checkNotNullParameter(logEntry, "logEntry");
        if (logEntry.getIsLocal() == null) {
            logEntry.setLocal(this.f92039c);
        }
        if (logEntry.getTag() == null) {
            logEntry.setTag(this.f92040d);
        }
    }

    @NotNull
    public final String b() {
        return this.f92038b;
    }

    @NotNull
    public final String c() {
        return this.f92037a;
    }

    protected final void d(String str) {
        this.f92040d = str;
    }
}
