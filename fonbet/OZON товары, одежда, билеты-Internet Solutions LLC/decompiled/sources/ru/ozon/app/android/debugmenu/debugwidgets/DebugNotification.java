package ru.ozon.app.android.debugmenu.debugwidgets;

import B0.C2454a;
import C.o0;
import android.app.Notification;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/debugmenu/debugwidgets/DebugNotification;", "", "Landroid/app/Notification;", "notification", "", "id", "", "tag", "<init>", "(Landroid/app/Notification;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/app/Notification;", "getNotification", "()Landroid/app/Notification;", "I", "getId", "Ljava/lang/String;", "getTag", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DebugNotification {
    private final int id;

    @NotNull
    private final Notification notification;
    private final String tag;

    public DebugNotification(@NotNull Notification notification, int i11, String str) {
        Intrinsics.checkNotNullParameter(notification, "notification");
        this.notification = notification;
        this.id = i11;
        this.tag = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DebugNotification)) {
            return false;
        }
        DebugNotification debugNotification = (DebugNotification) other;
        return Intrinsics.d(this.notification, debugNotification.notification) && this.id == debugNotification.id && Intrinsics.d(this.tag, debugNotification.tag);
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final Notification getNotification() {
        return this.notification;
    }

    public final String getTag() {
        return this.tag;
    }

    public int hashCode() {
        int a11 = C2454a.a(this.id, this.notification.hashCode() * 31, 31);
        String str = this.tag;
        return a11 + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        Notification notification = this.notification;
        int i11 = this.id;
        String str = this.tag;
        StringBuilder sb2 = new StringBuilder("DebugNotification(notification=");
        sb2.append(notification);
        sb2.append(", id=");
        sb2.append(i11);
        sb2.append(", tag=");
        return o0.c(sb2, str, ")");
    }
}
