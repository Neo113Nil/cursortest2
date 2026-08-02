package com.vk.media.pipeline.metrics;

import android.content.Context;
import android.net.Uri;
import com.vk.media.pipeline.metrics.MetricsCalculationConfig;
import com.vk.media.pipeline.model.item.VideoEncodedItem;
import com.vk.media.pipeline.model.item.VideoItem;
import com.vk.media.pipeline.model.source.local.TrackMediaSource;
import com.vk.media.pipeline.model.timeline.VideoFragment;
import com.vk.media.pipeline.utils.MediaMetadataUtils;
import com.vk.movika.sdk.base.ui.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.a4p;
import xsna.f100;
import xsna.gat0;
import xsna.jq10;
import xsna.ms9;
import xsna.msy;
import xsna.qts0;
import xsna.uy1;
import xsna.xu10;
import xsna.ynk0;

/* compiled from: VideoQualityMetricsHandlerImpl.kt */
/* loaded from: classes3.dex */
public final class a implements gat0 {
    public final xu10 a;
    public final f100 b;
    public final jq10 c;

    public a(xu10 xu10Var, f100 f100Var, jq10 jq10Var) {
        this.a = xu10Var;
        this.b = f100Var;
        this.c = jq10Var;
    }

    @Override // xsna.gat0
    public final void a(qts0 qts0Var, int i, int i2) {
        xu10 xu10Var = this.a;
        if (xu10Var == null) {
            return;
        }
        xu10Var.f(i);
        xu10Var.h(qts0Var, i2);
    }

    @Override // xsna.gat0
    public final qts0 b(Context context, Uri uri, ComparableVideoFragmentInfo comparableVideoFragmentInfo) {
        f100 f100Var = this.b;
        try {
            return ynk0.a.a(context, comparableVideoFragmentInfo, uri, this.c, f100Var);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            if (f100Var == null) {
                return null;
            }
            f100Var.e("VideoQualityMetrics", "Video metrics calculation was interrupted", e);
            return null;
        } catch (Throwable th) {
            if (f100Var == null) {
                return null;
            }
            f100Var.e("VideoQualityMetrics", "Failed to calculate video quality metrics", th);
            return null;
        }
    }

    @Override // xsna.gat0
    public final MetricsCalculationConfig c(Context context, Uri uri, List list) {
        try {
            uy1 a = MediaMetadataUtils.a(context, uri);
            Throwable th = a.j;
            if (th != null) {
                throw th;
            }
            ArrayList d = d(context, list, a);
            return d.isEmpty() ? new MetricsCalculationConfig.CanNotBeCalculated("No fragment is suitable for comparison") : new MetricsCalculationConfig.CanBeCalculated(d, uri);
        } catch (Throwable th2) {
            return new MetricsCalculationConfig.CanNotBeCalculated(ms9.b("Error obtaining config: ", th2));
        }
    }

    public final ArrayList d(Context context, List list, uy1 uy1Var) {
        int i;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            VideoFragment videoFragment = (VideoFragment) it.next();
            VideoItem videoItem = videoFragment.b;
            ComparableVideoFragmentInfo comparableVideoFragmentInfo = null;
            VideoEncodedItem videoEncodedItem = videoItem instanceof VideoEncodedItem ? (VideoEncodedItem) videoItem : null;
            if (videoEncodedItem != null) {
                TrackMediaSource trackMediaSource = videoEncodedItem.b;
                Uri uri = trackMediaSource.b;
                Lazy a = msy.a(LazyThreadSafetyMode.NONE, new l(25, context, uri));
                if (a4p.a(videoEncodedItem)) {
                    e(uri, "hasTransforms");
                } else if (((uy1) a.getValue()).j != null) {
                    e(uri, "failed to analyze file");
                } else {
                    uy1 uy1Var2 = (uy1) a.getValue();
                    int i2 = uy1Var2.a;
                    if (i2 <= 0 || i2 != uy1Var.a || (i = uy1Var2.b) <= 0 || i != uy1Var.b) {
                        e(uri, "input and output video formats are not the same: input=" + ((uy1) a.getValue()) + ", output=" + uy1Var);
                    } else {
                        comparableVideoFragmentInfo = new ComparableVideoFragmentInfo(trackMediaSource.b, new CropRange(videoEncodedItem.c, videoEncodedItem.d), new CropRange(videoFragment.c, videoFragment.d));
                    }
                }
            }
            if (comparableVideoFragmentInfo != null) {
                arrayList.add(comparableVideoFragmentInfo);
            }
        }
        return arrayList;
    }

    public final void e(Uri uri, String str) {
        f100 f100Var = this.b;
        if (f100Var != null) {
            f100Var.i("VideoQualityMetrics", "VideoEncodedItem with uri=" + uri + " is not comparable: " + str);
        }
    }
}
