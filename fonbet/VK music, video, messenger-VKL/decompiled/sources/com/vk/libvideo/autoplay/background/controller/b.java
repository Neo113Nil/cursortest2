package com.vk.libvideo.autoplay.background.controller;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.api.seek.tracker.VideoSeekEventScreenMode;
import com.vk.libvideo.api.seek.tracker.VideoSeekEventSource;
import com.vk.libvideo.autoplay.background.controller.a;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeVideoBackgroundListeningItem;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import xsna.bjc;
import xsna.s3q0;
import xsna.uzp0;
import xsna.yet0;
import xsna.yg5;
import xsna.zet0;

/* compiled from: VideoBackgroundAnalyticsController.kt */
/* loaded from: classes2.dex */
public final class b implements io.reactivex.rxjava3.functions.f<a.AbstractC1209a> {
    public final /* synthetic */ a b;

    public b(a aVar) {
        this.b = aVar;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(a.AbstractC1209a abstractC1209a) {
        a.AbstractC1209a abstractC1209a2 = abstractC1209a;
        yg5 a = abstractC1209a2.a();
        if (!a.M0() || a.R0().h()) {
            return;
        }
        if (abstractC1209a2 instanceof a.AbstractC1209a.C1210a) {
            SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, Long.valueOf(a.A().o0()), Long.valueOf(a.A().I0().b), null, a.A().r(), null, 40, null), new SchemeStat$TypeVideoBackgroundListeningItem(((a.AbstractC1209a.C1210a) abstractC1209a2).b, Integer.valueOf((int) (a.getPosition() / 1000))), 2);
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
            uzp0 uzp0Var = UiTracker.h;
            uzp0Var.getClass();
            new bjc(c, b, uzp0Var.a).q();
        } else {
            if (!(abstractC1209a2 instanceof a.AbstractC1209a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            a.AbstractC1209a.b bVar = (a.AbstractC1209a.b) abstractC1209a2;
            boolean z = bVar.b;
            long j = bVar.c;
            zet0 zet0Var = this.b.e;
            VideoFile A = a.A();
            zet0Var.a(new yet0(Long.valueOf(A.o0()), A.I0(), A.r()), z ? VideoSeekEventSource.FastSeek : VideoSeekEventSource.Slider, VideoSeekEventScreenMode.Invisible, TimeUnit.MILLISECONDS.toSeconds(j));
        }
        s3q0 s3q0Var = s3q0.a;
    }
}
