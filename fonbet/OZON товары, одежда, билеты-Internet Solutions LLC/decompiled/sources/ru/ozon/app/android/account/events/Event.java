package ru.ozon.app.android.account.events;

import C.o0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/account/events/Event;", "", "", "key", "Lkotlin/Function0;", "", "action", "widgetId", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getKey", "Lkotlin/jvm/functions/Function0;", "getAction", "()Lkotlin/jvm/functions/Function0;", "getWidgetId", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* data */ class Event {

    @NotNull
    private final Function0<Unit> action;

    @NotNull
    private final String key;

    @NotNull
    private final String widgetId;

    public Event(@NotNull String key, @NotNull Function0<Unit> action, @NotNull String widgetId) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        this.key = key;
        this.action = action;
        this.widgetId = widgetId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Event)) {
            return false;
        }
        Event event = (Event) other;
        return Intrinsics.d(this.key, event.key) && Intrinsics.d(this.action, event.action) && Intrinsics.d(this.widgetId, event.widgetId);
    }

    @NotNull
    public final Function0<Unit> getAction() {
        return this.action;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @NotNull
    public final String getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        return this.widgetId.hashCode() + ((this.action.hashCode() + (this.key.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.key;
        Function0<Unit> function0 = this.action;
        String str2 = this.widgetId;
        StringBuilder sb2 = new StringBuilder("Event(key=");
        sb2.append(str);
        sb2.append(", action=");
        sb2.append(function0);
        sb2.append(", widgetId=");
        return o0.c(sb2, str2, ")");
    }
}
