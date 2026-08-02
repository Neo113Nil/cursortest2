package com.sofascore.model.mvvm.model;

import com.sofascore.model.newNetwork.hockeyplaybyplay.HockeyIncidentKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.b;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u000e\u0010\u000f\u001a\u00020\u0010X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0010X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0010X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0010X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0010X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0010X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0010X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0010X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u0010X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u0010X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"STATUS_NOT_STARTED", "", "STATUS_POSTPONED", "STATUS_SUSPENDED", "STATUS_CANCELED", "STATUS_IN_PROGRESS", "STATUS_INTERRUPTED", "STATUS_WILL_CONTINUE", "STATUS_DELAYED", "STATUS_FINISHED", "STATUS_PRELIMINARY", "ONGOING_STATUS_TYPES", "", "getONGOING_STATUS_TYPES", "()Ljava/util/List;", "HT", "", "AwET", "ETHT", "AwP", "AET", HockeyIncidentKt.PERIOD_SHOOTOUT, "AP", PlayerKt.AMERICAN_FOOTBALL_OFFENSIVE_TACKLE, "ET1", "ET2", "STATUS_DESCRIPTION_STARTED", "STATUS_AWAITING_ANNOUNCEMENT", "STATUS_COVERAGE_CANCELED", "model_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StatusKt {
    public static final int AET = 110;
    public static final int AP = 120;
    public static final int AwET = 32;
    public static final int AwP = 34;
    public static final int ET1 = 41;
    public static final int ET2 = 42;
    public static final int ETHT = 33;
    public static final int HT = 31;
    public static final int OT = 40;
    public static final int PEN = 50;

    @NotNull
    public static final String STATUS_AWAITING_ANNOUNCEMENT = "Awaiting announcement";

    @NotNull
    public static final String STATUS_CANCELED = "canceled";

    @NotNull
    public static final String STATUS_COVERAGE_CANCELED = "Coverage canceled";

    @NotNull
    public static final String STATUS_DELAYED = "delayed";

    @NotNull
    public static final String STATUS_DESCRIPTION_STARTED = "Started";

    @NotNull
    public static final String STATUS_FINISHED = "finished";

    @NotNull
    public static final String STATUS_NOT_STARTED = "notstarted";

    @NotNull
    public static final String STATUS_POSTPONED = "postponed";

    @NotNull
    public static final String STATUS_PRELIMINARY = "preliminary";

    @NotNull
    public static final String STATUS_SUSPENDED = "suspended";

    @NotNull
    public static final String STATUS_IN_PROGRESS = "inprogress";

    @NotNull
    public static final String STATUS_INTERRUPTED = "interrupted";

    @NotNull
    public static final String STATUS_WILL_CONTINUE = "willcontinue";

    @NotNull
    private static final List<String> ONGOING_STATUS_TYPES = b.j(STATUS_IN_PROGRESS, STATUS_INTERRUPTED, STATUS_WILL_CONTINUE);

    @NotNull
    public static final List<String> getONGOING_STATUS_TYPES() {
        return ONGOING_STATUS_TYPES;
    }
}
