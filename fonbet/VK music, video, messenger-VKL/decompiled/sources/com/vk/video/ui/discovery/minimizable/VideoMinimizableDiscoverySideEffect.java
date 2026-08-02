package com.vk.video.ui.discovery.minimizable;

import android.os.Bundle;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.donut.video.model.domain.action.DonutVideoAction;
import com.vk.donut.video.model.domain.analytics.source.DonutVideoClickSource;
import com.vk.donut.video.model.domain.video.DonutVideoModel;
import com.vk.dto.common.VideoFile;
import com.vk.dto.music.Thumb;
import com.vk.libvideo.adfree.api.domain.objects.VideoAdFreeTrapEventTrigger;
import com.vk.libvideo.api.Subscription;
import com.vk.libvideo.api.ad.AdChoice;
import com.vk.libvideo.api.minimizable.VideoMinimizableScreenArgs;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.libvideo.api.ui.VideoTransitionSource;
import com.vk.libvideo.models.comment.ReplyInfo;
import com.vk.libvideo.video.queue.api.model.related.VideoRelatedVideosLoopMode;
import com.vk.video.growth.api.data.VideoGrowthVideoParams;
import com.vk.video.polls.entrypoint.model.UxPollEntryPointLocation;
import com.vk.video.ui.discovery.catalog.VideoDiscoveryCatalogRepository$Section;
import com.vk.video.ui.discovery.minimizable.dialog.VideoDialogType;
import com.vk.video.ui.discovery.minimizable.g;
import defpackage.q0;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.je0;
import xsna.kwc;
import xsna.lq;
import xsna.ms9;
import xsna.qoy;
import xsna.shy;
import xsna.uf3;
import xsna.urd0;
import xsna.vz9;
import xsna.zrp;

/* compiled from: VideoMinimizableDiscoverySideEffect.kt */
/* loaded from: classes7.dex */
public interface VideoMinimizableDiscoverySideEffect {

    /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
    public interface Motion extends VideoMinimizableDiscoverySideEffect {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
        public static final class MinimizeTrigger {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ MinimizeTrigger[] $VALUES;
            public static final MinimizeTrigger ByBackButton;
            public static final MinimizeTrigger ByGesture;
            public static final MinimizeTrigger Other;

            static {
                MinimizeTrigger minimizeTrigger = new MinimizeTrigger("ByGesture", 0);
                ByGesture = minimizeTrigger;
                MinimizeTrigger minimizeTrigger2 = new MinimizeTrigger("ByBackButton", 1);
                ByBackButton = minimizeTrigger2;
                MinimizeTrigger minimizeTrigger3 = new MinimizeTrigger("Other", 2);
                Other = minimizeTrigger3;
                MinimizeTrigger[] minimizeTriggerArr = {minimizeTrigger, minimizeTrigger2, minimizeTrigger3};
                $VALUES = minimizeTriggerArr;
                $ENTRIES = new asp(minimizeTriggerArr);
            }

            public MinimizeTrigger() {
                throw null;
            }

            public static MinimizeTrigger valueOf(String str) {
                return (MinimizeTrigger) Enum.valueOf(MinimizeTrigger.class, str);
            }

            public static MinimizeTrigger[] values() {
                return (MinimizeTrigger[]) $VALUES.clone();
            }
        }

        /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
        public static final class a implements Motion {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 776929826;
            }

            public final String toString() {
                return "Close";
            }
        }

        /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
        public static final class b implements Motion {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1616625744;
            }

            public final String toString() {
                return "Expand";
            }
        }

        /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
        public static final class c implements Motion {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 1964870616;
            }

            public final String toString() {
                return "Hide";
            }
        }

        /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
        public static final class d implements Motion {
            public final boolean a;
            public final MinimizeTrigger b;

            public d() {
                this(null, 3);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return this.a == dVar.a && this.b == dVar.b;
            }

            public final int hashCode() {
                return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
            }

            public final String toString() {
                return "Minimize(animated=" + this.a + ", minimizeTrigger=" + this.b + ')';
            }

            public d(MinimizeTrigger minimizeTrigger, int i) {
                boolean z = (i & 1) != 0;
                minimizeTrigger = (i & 2) != 0 ? MinimizeTrigger.Other : minimizeTrigger;
                this.a = z;
                this.b = minimizeTrigger;
            }
        }

        /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
        public static final class e implements Motion {
            public final com.vk.video.ui.discovery.minimizable.b a;

            public e(com.vk.video.ui.discovery.minimizable.b bVar) {
                this.a = bVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "MoveDialogToState(dialogContainerState=" + this.a + ')';
            }
        }
    }

    /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
    public static final class a implements VideoMinimizableDiscoverySideEffect {
        public final AdChoice a;

        public a(AdChoice adChoice) {
            this.a = adChoice;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "AdChoiceClick(adChoice=" + this.a + ')';
        }
    }

    /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
    public static final class a0 implements VideoMinimizableDiscoverySideEffect {
        public final VideoGrowthVideoParams a;
        public final g.e b;

        public a0(VideoGrowthVideoParams videoGrowthVideoParams, g.e eVar) {
            this.a = videoGrowthVideoParams;
            this.b = eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a0)) {
                return false;
            }
            a0 a0Var = (a0) obj;
            return this.a.equals(a0Var.a) && this.b.equals(a0Var.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + qoy.b(this.a.hashCode() * 31, 31, true);
        }

        public final String toString() {
            return "ShowOpenVkVideoListingPopupIfNecessary(videoParams=" + this.a + ", forceShowOpenSAAPopup=true, callback=" + this.b + ')';
        }
    }

    /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
    public static final class b implements VideoMinimizableDiscoverySideEffect {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1848508631;
        }

        public final String toString() {
            return "ApiCallErrorSnackBar";
        }
    }

    /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
    public static final class b0 implements VideoMinimizableDiscoverySideEffect {
        public final VideoGrowthVideoParams a;
        public final boolean b;

        public b0(VideoGrowthVideoParams videoGrowthVideoParams, boolean z) {
            this.a = videoGrowthVideoParams;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b0)) {
                return false;
            }
            b0 b0Var = (b0) obj;
            return epx.f(this.a, b0Var.a) && this.b == b0Var.b;
        }

        public final int hashCode() {
            VideoGrowthVideoParams videoGrowthVideoParams = this.a;
            return Boolean.hashCode(this.b) + ((videoGrowthVideoParams == null ? 0 : videoGrowthVideoParams.hashCode()) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShowOpenVkVideoPopupIfNecessary(videoParams=");
            sb.append(this.a);
            sb.append(", videoIsRestrictedInVkApp=");
            return q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
    public interface c extends VideoMinimizableDiscoverySideEffect {

        /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
        public static final class a implements c {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1981706297;
            }

            public final String toString() {
                return "Close";
            }
        }

        /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
        public static final class b implements c {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1310490981;
            }

            public final String toString() {
                return "Open";
            }
        }
    }

    /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
    public static final class c0 implements VideoMinimizableDiscoverySideEffect {
        public final VideoRelatedVideosLoopMode a;

        public c0(VideoRelatedVideosLoopMode videoRelatedVideosLoopMode) {
            this.a = videoRelatedVideosLoopMode;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c0) && this.a == ((c0) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ShowRelatedVideosLoopSnackBar(mode=" + this.a + ')';
        }
    }

    /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
    public static final class d implements VideoMinimizableDiscoverySideEffect {
        public final boolean a;
        public final VideoTransitionSource b;

        public d(boolean z, VideoTransitionSource videoTransitionSource) {
            this.a = z;
            this.b = videoTransitionSource;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && epx.f(this.b, dVar.b);
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.a) * 31;
            VideoTransitionSource videoTransitionSource = this.b;
            return hashCode + (videoTransitionSource == null ? 0 : videoTransitionSource.hashCode());
        }

        public final String toString() {
            return "ExpandOnNewScreenArgs(forceCloseDialog=" + this.a + ", expandFromPosition=" + this.b + ')';
        }
    }

    /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
    public static final class d0 implements VideoMinimizableDiscoverySideEffect {
        public static final d0 a = new d0();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d0);
        }

        public final int hashCode() {
            return -861358534;
        }

        public final String toString() {
            return "ShowRelatedVideosShuffleSnackBar";
        }
    }

    /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
    public interface e extends VideoMinimizableDiscoverySideEffect {

        /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
        public static final class a implements e {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1093093515;
            }

            public final String toString() {
                return "ShowScreenLockedButton";
            }
        }

        /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
        public static final class b implements e {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1973183737;
            }

            public final String toString() {
                return "ShowUnlockButton";
            }
        }
    }

    /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
    public static final class e0 implements VideoMinimizableDiscoverySideEffect {
        public final boolean a;

        public e0(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e0) && this.a == ((e0) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return q0.a(new StringBuilder("ShowRelatedVideosSortSnackBar(isOrderReversed="), this.a, ')');
        }
    }

    /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
    public static final class f implements VideoMinimizableDiscoverySideEffect {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -180290333;
        }

        public final String toString() {
            return "GoToSubscriptionPurchase";
        }
    }

    /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
    public static final class f0 implements VideoMinimizableDiscoverySideEffect {
        public static final f0 a = new f0();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f0);
        }

        public final int hashCode() {
            return -1365209538;
        }

        public final String toString() {
            return "ShowRestoredNetworkSnackBar";
        }
    }

    /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
    public interface g extends VideoMinimizableDiscoverySideEffect {

        /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
        public static final class a implements g {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1015319779;
            }

            public final String toString() {
                return "Hide";
            }
        }

        /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
        public static final class b implements g {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1639418164;
            }

            public final String toString() {
                return "ShowIfNecessary";
            }
        }
    }

    /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
    public static final class g0 implements VideoMinimizableDiscoverySideEffect {
        public static final g0 a = new g0();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g0);
        }

        public final int hashCode() {
            return -960460557;
        }

        public final String toString() {
            return "ShowSlowNetworkSnackBar";
        }
    }

    /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
    public interface h extends VideoMinimizableDiscoverySideEffect {

        /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
        public static final class a implements h {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1025156195;
            }

            public final String toString() {
                return "HideExpandPlayerSnack";
            }
        }

        /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
        public static final class b implements h {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -2002815992;
            }

            public final String toString() {
                return "ShowExpandPlayerSnack";
            }
        }

        /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
        public static final class c implements h {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 2133283380;
            }

            public final String toString() {
                return "ShowPipInfoSnack";
            }
        }
    }

    /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
    public static final class h0 implements VideoMinimizableDiscoverySideEffect {
        public static final h0 a = new h0();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h0);
        }

        public final int hashCode() {
            return -494011882;
        }

        public final String toString() {
            return "ShowVerticalSimilar";
        }
    }

    /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
    public static final class i implements VideoMinimizableDiscoverySideEffect {
        public final VideoDiscoveryCatalogRepository$Section a;
        public final boolean b;

        public i(VideoDiscoveryCatalogRepository$Section videoDiscoveryCatalogRepository$Section, boolean z) {
            this.a = videoDiscoveryCatalogRepository$Section;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return epx.f(this.a, iVar.a) && this.b == iVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LoadCatalogSection(section=");
            sb.append(this.a);
            sb.append(", alreadyLoading=");
            return q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
    public static final class i0 implements VideoMinimizableDiscoverySideEffect {
        public final Subscription a;

        public i0(Subscription subscription) {
            this.a = subscription;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i0) && epx.f(this.a, ((i0) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "SyncSubscription(subscription=" + this.a + ')';
        }
    }

    /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
    public interface j extends VideoMinimizableDiscoverySideEffect {

        /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
        public static final class a implements j {
            public final List<VideoDialogType> a;

            public a() {
                this(0);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ms9.a(')', new StringBuilder("CloseAllDialogs(except="), this.a);
            }

            public a(int i) {
                this(EmptyList.b);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a(List<? extends VideoDialogType> list) {
                this.a = list;
            }
        }

        /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
        public static final class b implements j {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1648375229;
            }

            public final String toString() {
                return "CloseRelatedVideos";
            }
        }

        /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
        public static final class c implements j {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -1353766704;
            }

            public final String toString() {
                return "OpenAboutVideo";
            }
        }

        /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
        public static final class d implements j {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                ((d) obj).getClass();
                return true;
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "OpenCommentReplies(arguments=null)";
            }
        }

        /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
        public static final class e implements j {
            public final ReplyInfo a;

            public e() {
                this(null);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
            }

            public final int hashCode() {
                ReplyInfo replyInfo = this.a;
                if (replyInfo == null) {
                    return 0;
                }
                return replyInfo.hashCode();
            }

            public final String toString() {
                return "OpenComments(replyInfo=" + this.a + ')';
            }

            public e(ReplyInfo replyInfo) {
                this.a = replyInfo;
            }
        }

        /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
        public static final class f implements j {
            public final Bundle a;

            public f(Bundle bundle) {
                this.a = bundle;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && epx.f(this.a, ((f) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return uf3.c(new StringBuilder("OpenCommentsThread(args="), this.a, ')');
            }
        }

        /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
        public static final class g implements j {
            public static final g a = new g();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            public final int hashCode() {
                return -28014022;
            }

            public final String toString() {
                return "OpenEpisodes";
            }
        }

        /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
        public static final class h implements j {
            public final UxPollEntryPointLocation a;

            public h(UxPollEntryPointLocation uxPollEntryPointLocation) {
                this.a = uxPollEntryPointLocation;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && this.a == ((h) obj).a;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "OpenFeedbackPoll(location=" + this.a + ')';
            }
        }

        /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
        public static final class i implements j {
            public final VideoFile a;

            public i(VideoFile videoFile) {
                this.a = videoFile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof i) && epx.f(this.a, ((i) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return lq.a(new StringBuilder("OpenProfile(videoFile="), this.a, ')');
            }
        }

        /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
        /* renamed from: com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoverySideEffect$j$j, reason: collision with other inner class name */
        public static final class C1970j implements j {
            public static final C1970j a = new C1970j();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1970j);
            }

            public final int hashCode() {
                return -62956479;
            }

            public final String toString() {
                return "OpenRelatedVideos";
            }
        }
    }

    /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
    public static final class j0 implements VideoMinimizableDiscoverySideEffect {
        public static final j0 a = new j0();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j0);
        }

        public final int hashCode() {
            return 689378298;
        }

        public final String toString() {
            return "SyncVideoFile";
        }
    }

    /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
    public static final class k implements VideoMinimizableDiscoverySideEffect {
        public final DonutVideoModel a;

        public k(DonutVideoModel donutVideoModel) {
            this.a = donutVideoModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && epx.f(this.a, ((k) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OnDonutActionBarClick(donutVideo=" + this.a + ')';
        }
    }

    /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
    public static final class k0 implements VideoMinimizableDiscoverySideEffect {
        public final boolean a;

        public k0(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k0) && this.a == ((k0) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return q0.a(new StringBuilder("ToggleFullscreen(isVerticalVideo="), this.a, ')');
        }
    }

    /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
    public static final class l implements VideoMinimizableDiscoverySideEffect {
        public final VideoFile a;

        public l(VideoFile videoFile) {
            this.a = videoFile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && epx.f(this.a, ((l) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return lq.a(new StringBuilder("OnFullscreenOrExpanded(videoFile="), this.a, ')');
        }
    }

    /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
    public static final class l0 implements VideoMinimizableDiscoverySideEffect {
        public final VideoAdFreeTrapEventTrigger a;

        public l0(VideoAdFreeTrapEventTrigger videoAdFreeTrapEventTrigger) {
            this.a = videoAdFreeTrapEventTrigger;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l0) && this.a == ((l0) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "TriggerAdFreeTrap(trigger=" + this.a + ')';
        }
    }

    /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
    public static final class m implements VideoMinimizableDiscoverySideEffect {
        public final List<ClipFeedTab> a;
        public final kwc b;

        public m(ListBuilder listBuilder, kwc kwcVar) {
            this.a = listBuilder;
            this.b = kwcVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return epx.f(this.a, mVar.a) && epx.f(this.b, mVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            kwc kwcVar = this.b;
            return hashCode + (kwcVar == null ? 0 : kwcVar.hashCode());
        }

        public final String toString() {
            return "OpenClipScreen(tabs=" + this.a + ", initialData=" + this.b + ')';
        }
    }

    /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
    public static final class m0 implements VideoMinimizableDiscoverySideEffect {
        public static final m0 a = new m0();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m0);
        }

        public final int hashCode() {
            return 1086955400;
        }

        public final String toString() {
            return "UpdateSubscription";
        }
    }

    /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
    public static final class n implements VideoMinimizableDiscoverySideEffect {
        public final String a;

        public n(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && epx.f(this.a, ((n) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("OpenLink(link="), this.a, ')');
        }
    }

    /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
    public interface n0 extends VideoMinimizableDiscoverySideEffect {

        /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
        public static final class a implements n0 {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 449514424;
            }

            public final String toString() {
                return "Hide";
            }
        }

        /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
        public static final class b implements n0 {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 449841523;
            }

            public final String toString() {
                return "Show";
            }
        }
    }

    /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
    public static final class o implements VideoMinimizableDiscoverySideEffect {
        public final String a;

        public o(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && epx.f(this.a, ((o) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("OpenTrapBannerMiniApp(activationUrl="), this.a, ')');
        }
    }

    /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
    public interface o0 extends VideoMinimizableDiscoverySideEffect {

        /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
        public static final class a implements o0 {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 467782805;
            }

            public final String toString() {
                return "Close";
            }
        }

        /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
        public static final class b implements o0 {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -677285875;
            }

            public final String toString() {
                return "Open";
            }
        }
    }

    /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
    public interface p extends VideoMinimizableDiscoverySideEffect {

        /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
        public static final class a implements p {
            public final boolean a;

            public a() {
                this(true);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.a == ((a) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return q0.a(new StringBuilder("HidePlayerUi(animated="), this.a, ')');
            }

            public /* synthetic */ a(int i) {
                this(true);
            }

            public a(boolean z) {
                this.a = z;
            }
        }

        /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
        public static final class b implements p {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                ((b) obj).getClass();
                return true;
            }

            public final int hashCode() {
                return Boolean.hashCode(true);
            }

            public final String toString() {
                return "Pause(ignorePauseStrategy=true)";
            }
        }

        /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
        public static final class c implements p {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -292030035;
            }

            public final String toString() {
                return "PauseByUser";
            }
        }

        /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
        public static final class d implements p {
            public static final d a = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -1245364412;
            }

            public final String toString() {
                return "PausePlayNowVideo";
            }
        }

        /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
        public static final class e implements p {
            public static final e a = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 1580374817;
            }

            public final String toString() {
                return "PlayByUser";
            }
        }

        /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
        public static final class f implements p {
            public static final f a = new f();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return -1503396163;
            }

            public final String toString() {
                return "ShowPlayerUi";
            }
        }

        /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
        public static final class g implements p {
            public final je0 a;
            public final boolean b;

            public g(je0 je0Var, boolean z) {
                this.a = je0Var;
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return epx.f(this.a, gVar.a) && this.b == gVar.b;
            }

            public final int hashCode() {
                je0 je0Var = this.a;
                return Boolean.hashCode(this.b) + ((je0Var == null ? 0 : je0Var.hashCode()) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("SkipPostViewOrPauseAd(adController=");
                sb.append(this.a);
                sb.append(", isPostViewState=");
                return q0.a(sb, this.b, ')');
            }
        }
    }

    /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
    public static final class q implements VideoMinimizableDiscoverySideEffect {
        public final VideoDiscoveryCatalogRepository$Section a;

        public q(VideoDiscoveryCatalogRepository$Section videoDiscoveryCatalogRepository$Section) {
            this.a = videoDiscoveryCatalogRepository$Section;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && epx.f(this.a, ((q) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "PrimeCatalogSection(section=" + this.a + ')';
        }
    }

    /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
    public static final class r implements VideoMinimizableDiscoverySideEffect {
        public final VideoMinimizableScreenArgs a;

        public r(VideoMinimizableScreenArgs videoMinimizableScreenArgs) {
            this.a = videoMinimizableScreenArgs;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && epx.f(this.a, ((r) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ReOpenDiscovery(args=" + this.a + ')';
        }
    }

    /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
    public interface s extends VideoMinimizableDiscoverySideEffect {

        /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
        public static final class a implements s {
            public final long a;
            public final int b;
            public final String c;
            public final Thumb d;

            public a(long j, int i, String str, Thumb thumb) {
                this.a = j;
                this.b = i;
                this.c = str;
                this.d = thumb;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.a == aVar.a && this.b == aVar.b && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + urd0.a(shy.a(this.b, Long.hashCode(this.a) * 31, 31), 31, this.c);
            }

            public final String toString() {
                return "OpenPlaylistOnboarding(ownerId=" + this.a + ", playlistId=" + this.b + ", title=" + this.c + ", thumb=" + this.d + ')';
            }
        }

        /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
        public static final class b implements s {
            public final String a;
            public final String b;
            public final Thumb c;
            public final boolean d;
            public final boolean e;

            public b(Thumb thumb, String str, String str2, boolean z, boolean z2) {
                this.a = str;
                this.b = str2;
                this.c = thumb;
                this.d = z;
                this.e = z2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && this.d == bVar.d && this.e == bVar.e;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.e) + qoy.b((this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OpenTrackDetails(title=");
                sb.append(this.a);
                sb.append(", artist=");
                sb.append(this.b);
                sb.append(", thumb=");
                sb.append(this.c);
                sb.append(", isAdded=");
                sb.append(this.d);
                sb.append(", isRestricted=");
                return q0.a(sb, this.e, ')');
            }
        }

        /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
        public static final class c implements s {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 1388564650;
            }

            public final String toString() {
                return "ScrollToSimilarTracks";
            }
        }

        /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
        public static final class d implements s {
            public final boolean a;

            public d(boolean z) {
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && this.a == ((d) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return q0.a(new StringBuilder("ShowAddOrRemoveSnackbar(isAdded="), this.a, ')');
            }
        }
    }

    /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
    public static final class t implements VideoMinimizableDiscoverySideEffect {
        public static final t a = new t();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof t);
        }

        public final int hashCode() {
            return 1773645822;
        }

        public final String toString() {
            return "ReloadCatalog";
        }
    }

    /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
    public static final class u implements VideoMinimizableDiscoverySideEffect {
        public static final u a = new u();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof u);
        }

        public final int hashCode() {
            return -2090315073;
        }

        public final String toString() {
            return "ReloadRecommendations";
        }
    }

    /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
    public static final class v implements VideoMinimizableDiscoverySideEffect {
        public final VideoMinimizableState a;

        public v(VideoMinimizableState videoMinimizableState) {
            this.a = videoMinimizableState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof v) && epx.f(this.a, ((v) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "RestoreState(minimizableState=" + this.a + ')';
        }
    }

    /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
    public static abstract class w implements VideoMinimizableDiscoverySideEffect {

        /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
        public static final class a extends w {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -315071968;
            }

            public final String toString() {
                return "CloseRetranslationSuggestionPopup";
            }
        }

        /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
        public static final class b extends w {
            public final vz9 a;
            public final List<vz9> b;

            public b(vz9 vz9Var, List<vz9> list) {
                this.a = vz9Var;
                this.b = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
            }

            public final int hashCode() {
                vz9 vz9Var = this.a;
                return this.b.hashCode() + ((vz9Var == null ? 0 : vz9Var.hashCode()) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ShowRetranslationSuggestionPopup(lastDevice=");
                sb.append(this.a);
                sb.append(", foundDevices=");
                return ms9.a(')', sb, this.b);
            }
        }
    }

    /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
    public static final class x implements VideoMinimizableDiscoverySideEffect {
        public final DonutVideoAction a;
        public final DonutVideoClickSource b;

        public x(DonutVideoAction donutVideoAction, DonutVideoClickSource donutVideoClickSource) {
            this.a = donutVideoAction;
            this.b = donutVideoClickSource;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof x)) {
                return false;
            }
            x xVar = (x) obj;
            return epx.f(this.a, xVar.a) && this.b == xVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "SendDonutVideoAction(action=" + this.a + ", clickSource=" + this.b + ')';
        }
    }

    /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
    public static final class y implements VideoMinimizableDiscoverySideEffect {
        public static final y a = new y();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof y);
        }

        public final int hashCode() {
            return 744112770;
        }

        public final String toString() {
            return "ShowCastDisconnectDialog";
        }
    }

    /* compiled from: VideoMinimizableDiscoverySideEffect.kt */
    public static final class z implements VideoMinimizableDiscoverySideEffect {
        public static final z a = new z();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof z);
        }

        public final int hashCode() {
            return -2116437656;
        }

        public final String toString() {
            return "ShowHorizontalSimilar";
        }
    }
}
