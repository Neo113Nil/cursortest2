package ru.ozon.tracker.db.entities;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b%\b\u0001\u0018\u0000 ,2\u00020\u0001:\u0001,B¯\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001bR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001bR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001bR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001b¨\u0006-"}, d2 = {"Lru/ozon/tracker/db/entities/PerfEventEntity;", "", "id", "", "uuid", "", "requestId", "timestamp", "Lorg/joda/time/DateTime;", "testingToolName", "attributes", "user", "page", "obj", "props", "widget", "metrics", "map", "customMetrics", "videoMetrics", "serverTimings", "pclpage", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()J", "getUuid", "()Ljava/lang/String;", "getRequestId", "getTimestamp", "()Lorg/joda/time/DateTime;", "getTestingToolName", "getAttributes", "getUser", "getPage", "getObj", "getProps", "getWidget", "getMetrics", "getMap", "getCustomMetrics", "getVideoMetrics", "getServerTimings", "getPclpage", "Companion", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PerfEventEntity {

    @NotNull
    public static final String TABLE_NAME = "performance_event";
    private final String attributes;
    private final String customMetrics;
    private final long id;
    private final String map;
    private final String metrics;
    private final String obj;
    private final String page;
    private final String pclpage;
    private final String props;
    private final String requestId;
    private final String serverTimings;
    private final String testingToolName;

    @NotNull
    private final DateTime timestamp;
    private final String user;
    private final String uuid;
    private final String videoMetrics;
    private final String widget;

    public PerfEventEntity(long j11, String str, String str2, @NotNull DateTime timestamp, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        this.id = j11;
        this.uuid = str;
        this.requestId = str2;
        this.timestamp = timestamp;
        this.testingToolName = str3;
        this.attributes = str4;
        this.user = str5;
        this.page = str6;
        this.obj = str7;
        this.props = str8;
        this.widget = str9;
        this.metrics = str10;
        this.map = str11;
        this.customMetrics = str12;
        this.videoMetrics = str13;
        this.serverTimings = str14;
        this.pclpage = str15;
    }

    public final String getAttributes() {
        return this.attributes;
    }

    public final String getCustomMetrics() {
        return this.customMetrics;
    }

    public final long getId() {
        return this.id;
    }

    public final String getMap() {
        return this.map;
    }

    public final String getMetrics() {
        return this.metrics;
    }

    public final String getObj() {
        return this.obj;
    }

    public final String getPage() {
        return this.page;
    }

    public final String getPclpage() {
        return this.pclpage;
    }

    public final String getProps() {
        return this.props;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final String getServerTimings() {
        return this.serverTimings;
    }

    public final String getTestingToolName() {
        return this.testingToolName;
    }

    @NotNull
    public final DateTime getTimestamp() {
        return this.timestamp;
    }

    public final String getUser() {
        return this.user;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final String getVideoMetrics() {
        return this.videoMetrics;
    }

    public final String getWidget() {
        return this.widget;
    }

    public /* synthetic */ PerfEventEntity(long j11, String str, String str2, DateTime dateTime, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0L : j11, str, str2, dateTime, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15);
    }
}
