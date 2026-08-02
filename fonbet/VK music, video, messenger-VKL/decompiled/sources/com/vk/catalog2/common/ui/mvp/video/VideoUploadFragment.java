package com.vk.catalog2.common.ui.mvp.video;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.vk.catalog2.common.ui.mvp.video.VideoUploadFragment;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.libvideo.api.UploadVideoAction;
import com.vk.libvideo.upload.api.VideoPublicationContext;
import com.vk.media.MediaUtils;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoUploadClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.internal.operators.single.v;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.aeg0;
import xsna.asu0;
import xsna.avj0;
import xsna.bjc;
import xsna.bpn0;
import xsna.cqr0;
import xsna.fxc0;
import xsna.hg1;
import xsna.ksq0;
import xsna.nc90;
import xsna.oz50;
import xsna.tb0;
import xsna.uho0;
import xsna.w8i;

/* compiled from: VideoUploadFragment.kt */
/* loaded from: classes16.dex */
public final class VideoUploadFragment extends FragmentImpl implements tb0, w8i {
    public static final /* synthetic */ int S = 0;
    public c N;
    public final bpn0 O = new bpn0(new cqr0(this, 10));
    public final bpn0 P = new bpn0(new uho0(this, 16));
    public final bpn0 Q = new bpn0(new avj0(this, 23));
    public final bpn0 R = new bpn0(new ksq0(this, 10));

    /* compiled from: VideoUploadFragment.kt */
    public static final class a extends oz50 {
        public a() {
            super(VideoUploadFragment.class, null, null);
        }

        public final void y(UploadVideoAction uploadVideoAction, VideoPublicationContext videoPublicationContext, int i) {
            Bundle bundle = this.j;
            bundle.putSerializable("upload_video_action", uploadVideoAction);
            bundle.putParcelable("video_publication_context", videoPublicationContext);
            bundle.putInt("album_id", i);
        }
    }

    /* compiled from: VideoUploadFragment.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UploadVideoAction.values().length];
            try {
                iArr[UploadVideoAction.SELECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UploadVideoAction.RECORD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        final Uri data;
        super.onActivityResult(i, i2, intent);
        if (i2 != -1) {
            finish();
            return;
        }
        if (i == 13) {
            finish();
            return;
        }
        if (i == 701 || i == 702) {
            final Context mo2getContext = mo2getContext();
            final Bundle arguments = getArguments();
            if (mo2getContext == null || arguments == null) {
                return;
            }
            VideoPublicationContext videoPublicationContext = (VideoPublicationContext) arguments.getParcelable("video_publication_context");
            MobileOfficialAppsVideoStat$TypeVideoUploadClick.EventSubtype eventSubtype = null;
            Object[] objArr = 0;
            if (videoPublicationContext == null) {
                videoPublicationContext = new VideoPublicationContext(null, null, 3, null);
            }
            final VideoPublicationContext videoPublicationContext2 = videoPublicationContext;
            if (intent == null || (data = intent.getData()) == null) {
                return;
            }
            UiTracker uiTracker = UiTracker.a;
            new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, null, null, null, null, null, 62, null), new MobileOfficialAppsVideoStat$TypeVideoUploadClick(MobileOfficialAppsVideoStat$TypeVideoUploadClick.EventType.READY_FOR_UPLOAD, eventSubtype, 2, objArr == true ? 1 : 0), 2)).q();
            c cVar = this.N;
            if (cVar != null) {
                cVar.dispose();
            }
            final UserId userId = videoPublicationContext2.c;
            v vVar = new v(new Callable() { // from class: xsna.hot0
                /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
                
                    if (r5.C() == false) goto L18;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:30:0x0069, code lost:
                
                    r5 = true;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:41:0x0075, code lost:
                
                    if (xsna.o25.a().d() == false) goto L18;
                 */
                @Override // java.util.concurrent.Callable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object call() {
                    boolean z;
                    Pair pair;
                    String path;
                    int i3 = VideoUploadFragment.S;
                    Uri uri = data;
                    File u = up2.u(uri);
                    VideoUploadFragment videoUploadFragment = VideoUploadFragment.this;
                    UserId userId2 = userId;
                    if (u == null) {
                        pair = new Pair(Boolean.FALSE, -1);
                    } else {
                        boolean z2 = false;
                        MediaUtils.f e = MediaUtils.a.e(u.getAbsolutePath(), false);
                        if (e == null) {
                            pair = new Pair(Boolean.FALSE, -1);
                        } else {
                            int i4 = e.f;
                            boolean z3 = e.a <= e.b;
                            if (fkq0.b(userId2)) {
                                t6g0 t6g0Var = t6g0.b;
                                Group a2 = t6g0.b().N0(new UserId(Math.abs(userId2.b))).a();
                                if (!a2.n()) {
                                }
                                z = false;
                            }
                            if (z3 && z && ((mhd) videoUploadFragment.P.getValue()).c() && i4 <= TimeUnit.SECONDS.toMillis(180L)) {
                                z2 = true;
                            }
                            pair = new Pair(Boolean.valueOf(z2), Integer.valueOf(i4));
                        }
                    }
                    boolean booleanValue = ((Boolean) pair.d()).booleanValue();
                    int intValue = ((Number) pair.g()).intValue();
                    if (oeq0.e(uri)) {
                        Context context = e43.a;
                        if (context == null) {
                            context = null;
                        }
                        path = com.vk.core.files.a.h(context, uri, System.currentTimeMillis() + "." + com.vk.core.files.a.E(uri)).getAbsolutePath();
                    } else {
                        path = uri.getPath();
                    }
                    if (!booleanValue || path == null) {
                        return new okm0(arguments, mo2getContext, uri, videoPublicationContext2, videoUploadFragment, 1);
                    }
                    return new ov20(videoUploadFragment, path, intValue, userId2);
                }
            });
            asu0.a.getClass();
            this.N = hg1.i(hg1.n(vVar.q(asu0.k()).m(io.reactivex.rxjava3.android.schedulers.a.b()), mo2getContext, false, null, 62), new nc90(29));
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle arguments;
        super.onCreate(bundle);
        Bn(2, 0);
        setRetainInstance(true);
        LayoutInflater.Factory activity = getActivity();
        aeg0 aeg0Var = activity instanceof aeg0 ? (aeg0) activity : null;
        if (aeg0Var != null) {
            aeg0Var.Li(this);
        }
        if (bundle != null || (arguments = getArguments()) == null) {
            return;
        }
        int i = b.$EnumSwitchMapping$0[((UploadVideoAction) arguments.getSerializable("upload_video_action")).ordinal()];
        if (i == 1) {
            fxc0.B().t(this);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            fxc0.B().v(this);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        LayoutInflater.Factory activity = getActivity();
        aeg0 aeg0Var = activity instanceof aeg0 ? (aeg0) activity : null;
        if (aeg0Var != null) {
            aeg0Var.yk(this);
        }
    }
}
