package com.vk.clips.viewer.api.routing;

import android.app.Activity;
import android.content.Context;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedOpenAction;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.dto.shortvideo.ClipGridParams;
import java.util.List;
import xsna.asp;
import xsna.bq50;
import xsna.dcy;
import xsna.io2;
import xsna.kwc;
import xsna.rfc;
import xsna.uc;
import xsna.wp50;
import xsna.zrp;

/* compiled from: ClipsRouter.kt */
/* loaded from: classes17.dex */
public interface ClipsRouter {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipsRouter.kt */
    public static final class GridForcedTab {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ GridForcedTab[] $VALUES;
        public static final GridForcedTab LIKED;
        public static final GridForcedTab LIVES;
        public static final GridForcedTab NONE;

        static {
            GridForcedTab gridForcedTab = new GridForcedTab("NONE", 0);
            NONE = gridForcedTab;
            GridForcedTab gridForcedTab2 = new GridForcedTab("LIKED", 1);
            LIKED = gridForcedTab2;
            GridForcedTab gridForcedTab3 = new GridForcedTab("LIVES", 2);
            LIVES = gridForcedTab3;
            GridForcedTab[] gridForcedTabArr = {gridForcedTab, gridForcedTab2, gridForcedTab3};
            $VALUES = gridForcedTabArr;
            $ENTRIES = new asp(gridForcedTabArr);
        }

        public GridForcedTab() {
            throw null;
        }

        public static GridForcedTab valueOf(String str) {
            return (GridForcedTab) Enum.valueOf(GridForcedTab.class, str);
        }

        public static GridForcedTab[] values() {
            return (GridForcedTab[]) $VALUES.clone();
        }
    }

    static /* synthetic */ void b(ClipsRouter clipsRouter, Context context, ClipFeedTab clipFeedTab, io2 io2Var, kwc kwcVar, rfc rfcVar, ClipFeedOpenAction clipFeedOpenAction, boolean z, int i) {
        if ((i & 4) != 0) {
            io2Var = null;
        }
        if ((i & 8) != 0) {
            kwcVar = null;
        }
        if ((i & 16) != 0) {
            rfcVar = null;
        }
        if ((i & 64) != 0) {
            clipFeedOpenAction = null;
        }
        if ((i & 128) != 0) {
            z = false;
        }
        clipsRouter.a(context, clipFeedTab, io2Var, kwcVar, rfcVar, clipFeedOpenAction, z);
    }

    static /* synthetic */ void c(ClipsRouter clipsRouter, Context context, List list, io2 io2Var, kwc kwcVar, dcy dcyVar, SearchStatsLoggingInfo searchStatsLoggingInfo, ClipFeedOpenAction clipFeedOpenAction, boolean z, bq50 bq50Var, int i) {
        if ((i & 4) != 0) {
            io2Var = null;
        }
        if ((i & 8) != 0) {
            kwcVar = null;
        }
        if ((i & 16) != 0) {
            dcyVar = null;
        }
        if ((i & 32) != 0) {
            searchStatsLoggingInfo = null;
        }
        if ((i & 64) != 0) {
            clipFeedOpenAction = null;
        }
        if ((i & 128) != 0) {
            z = false;
        }
        if ((i & 512) != 0) {
            bq50Var = null;
        }
        clipsRouter.g(context, list, io2Var, kwcVar, dcyVar, searchStatsLoggingInfo, clipFeedOpenAction, z, bq50Var);
    }

    static /* synthetic */ void j(ClipsRouter clipsRouter, Context context, ClipGridParams clipGridParams, boolean z, SearchStatsLoggingInfo searchStatsLoggingInfo, String str, int i) {
        String str2;
        ClipsRouter clipsRouter2;
        Context context2;
        ClipGridParams clipGridParams2;
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        GridForcedTab gridForcedTab = GridForcedTab.NONE;
        SearchStatsLoggingInfo searchStatsLoggingInfo2 = (i & 16) != 0 ? null : searchStatsLoggingInfo;
        if ((i & 32) != 0) {
            str2 = null;
            context2 = context;
            clipGridParams2 = clipGridParams;
            clipsRouter2 = clipsRouter;
        } else {
            str2 = str;
            clipsRouter2 = clipsRouter;
            context2 = context;
            clipGridParams2 = clipGridParams;
        }
        clipsRouter2.d(context2, clipGridParams2, z2, gridForcedTab, searchStatsLoggingInfo2, str2);
    }

    static /* synthetic */ void l(ClipsRouter clipsRouter, Context context, UserId userId, List list, uc ucVar, int i) {
        if ((i & 8) != 0) {
            ucVar = null;
        }
        clipsRouter.f(context, userId, list, ucVar);
    }

    void a(Context context, ClipFeedTab clipFeedTab, io2 io2Var, kwc kwcVar, dcy dcyVar, ClipFeedOpenAction clipFeedOpenAction, boolean z);

    void d(Context context, ClipGridParams clipGridParams, boolean z, GridForcedTab gridForcedTab, SearchStatsLoggingInfo searchStatsLoggingInfo, String str);

    void e(Context context, ClipVideoFile clipVideoFile);

    void f(Context context, UserId userId, List list, io2 io2Var);

    void g(Context context, List list, io2 io2Var, kwc kwcVar, dcy dcyVar, SearchStatsLoggingInfo searchStatsLoggingInfo, ClipFeedOpenAction clipFeedOpenAction, boolean z, wp50 wp50Var);

    void h(Activity activity, VideoFile videoFile);

    void i(Context context, rfc rfcVar, ClipFeedOpenAction clipFeedOpenAction);

    void k(Context context, String str);
}
