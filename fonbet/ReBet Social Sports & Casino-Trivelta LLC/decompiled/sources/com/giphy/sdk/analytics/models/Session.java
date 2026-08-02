package com.giphy.sdk.analytics.models;

import Gb.c;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0011HÖ\u0001R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/giphy/sdk/analytics/models/Session;", "Landroid/os/Parcelable;", "sessionId", "", "events", "", "Lcom/giphy/sdk/analytics/models/AnalyticsEvent;", "(Ljava/lang/String;Ljava/util/List;)V", "getEvents", "()Ljava/util/List;", "setEvents", "(Ljava/util/List;)V", "getSessionId", "()Ljava/lang/String;", "setSessionId", "(Ljava/lang/String;)V", "describeContents", "", "getUserId", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "giphy-ui-2.3.17_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Session.kt\ncom/giphy/sdk/analytics/models/Session\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,27:1\n295#2,2:28\n*S KotlinDebug\n*F\n+ 1 Session.kt\ncom/giphy/sdk/analytics/models/Session\n*L\n24#1:28,2\n*E\n"})
/* loaded from: classes2.dex */
public final class Session implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Session> CREATOR = new Creator();

    @NotNull
    private List<AnalyticsEvent> events;

    @c("session_id")
    @Nullable
    private String sessionId;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Session> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Session createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i10 = 0; i10 != readInt; i10++) {
                arrayList.add(AnalyticsEvent.CREATOR.createFromParcel(parcel));
            }
            return new Session(readString, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Session[] newArray(int i10) {
            return new Session[i10];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Session() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NotNull
    public final List<AnalyticsEvent> getEvents() {
        return this.events;
    }

    @Nullable
    public final String getSessionId() {
        return this.sessionId;
    }

    @Nullable
    public final String getUserId() {
        Object obj;
        Iterator<T> it = this.events.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            String userId = ((AnalyticsEvent) obj).getUserId();
            if (!(userId == null || userId.length() == 0)) {
                break;
            }
        }
        AnalyticsEvent analyticsEvent = (AnalyticsEvent) obj;
        if (analyticsEvent != null) {
            return analyticsEvent.getUserId();
        }
        return null;
    }

    public final void setEvents(@NotNull List<AnalyticsEvent> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.events = list;
    }

    public final void setSessionId(@Nullable String str) {
        this.sessionId = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.sessionId);
        List<AnalyticsEvent> list = this.events;
        parcel.writeInt(list.size());
        Iterator<AnalyticsEvent> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
    }

    public Session(@Nullable String str, @NotNull List<AnalyticsEvent> events) {
        Intrinsics.checkNotNullParameter(events, "events");
        this.sessionId = str;
        this.events = events;
    }

    public /* synthetic */ Session(String str, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? new ArrayList() : list);
    }
}
