package com.vk.stories;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import com.unity3d.services.UnityAdsConstants;
import com.vk.media.model.CameraVideoEncoderParameters;
import com.vk.media.pipeline.model.effect.VideoEffect;
import com.vk.media.pipeline.model.effect.VideoTransformEffect;
import com.vk.media.pipeline.model.item.AudioItem;
import com.vk.media.pipeline.model.item.VideoEncodedItem;
import com.vk.media.pipeline.model.item.VideoItem;
import com.vk.media.pipeline.model.item.VideoRawItem;
import com.vk.media.pipeline.model.quality.MediaQuality;
import com.vk.media.pipeline.model.source.local.TrackMediaSource;
import com.vk.media.pipeline.model.source.picture.ImageBitmapMediaSource;
import com.vk.media.pipeline.model.source.picture.ImageFileMediaSource;
import com.vk.media.pipeline.model.timeline.Timeline;
import com.vk.stories.StoriesVideoEncoder;
import java.io.File;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import xsna.f100;
import xsna.j5g;
import xsna.lwo0;
import xsna.meg;
import xsna.rl3;
import xsna.sv1;

/* compiled from: StoryEncodeParamsBuilder.kt */
/* loaded from: classes6.dex */
public final class d {
    public final a a;
    public final CameraVideoEncoderParameters b;

    /* compiled from: StoryEncodeParamsBuilder.kt */
    public static abstract class a {

        /* compiled from: StoryEncodeParamsBuilder.kt */
        /* renamed from: com.vk.stories.d$a$a, reason: collision with other inner class name */
        public static final class C1804a extends a {
            public final Bitmap a;

            public C1804a(Bitmap bitmap) {
                this.a = bitmap;
            }
        }

        /* compiled from: StoryEncodeParamsBuilder.kt */
        public static final class b extends a {
            public final File a;

            public b(File file) {
                this.a = file;
            }
        }

        /* compiled from: StoryEncodeParamsBuilder.kt */
        public static final class c extends a {
            public final File a;

            public c(File file) {
                this.a = file;
            }
        }
    }

    public d(a aVar, CameraVideoEncoderParameters cameraVideoEncoderParameters) {
        this.a = aVar;
        this.b = cameraVideoEncoderParameters;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0277 A[LOOP:1: B:37:0x0271->B:39:0x0277, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final StoriesVideoEncoder.StoriesEncoderParameters a() {
        char c;
        float f;
        List singletonList;
        long j;
        float[] fArr;
        f100 f100Var;
        VideoItem videoEncodedItem;
        VideoItem videoRawItem;
        Iterator it;
        int[] iArr;
        Matrix matrix;
        CameraVideoEncoderParameters cameraVideoEncoderParameters = this.b;
        long j2 = cameraVideoEncoderParameters.l;
        if (j2 == 0) {
            j2 = cameraVideoEncoderParameters.w;
        }
        a aVar = this.a;
        boolean z = aVar instanceof a.c;
        if (z) {
            ListBuilder listBuilder = new ListBuilder(2);
            if (cameraVideoEncoderParameters.f) {
                c = 2;
                f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            } else {
                TrackMediaSource trackMediaSource = new TrackMediaSource(Uri.fromFile(((a.c) aVar).a), -1);
                c = 2;
                f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                listBuilder.add(new AudioItem(trackMediaSource, cameraVideoEncoderParameters.k * 1000, j2 * 1000, 1.0d, cameraVideoEncoderParameters.o, null, 32, null));
            }
            File file = cameraVideoEncoderParameters.r;
            if (file != null && cameraVideoEncoderParameters.x && cameraVideoEncoderParameters.v > f) {
                listBuilder.add(new AudioItem(new TrackMediaSource(Uri.fromFile(file), -1), cameraVideoEncoderParameters.s * 1000, cameraVideoEncoderParameters.t * 1000, 1.0d, cameraVideoEncoderParameters.v, null, 32, null));
            }
            singletonList = listBuilder.g();
        } else {
            c = 2;
            f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            File file2 = cameraVideoEncoderParameters.r;
            singletonList = file2 == null ? EmptyList.b : Collections.singletonList(new AudioItem(new TrackMediaSource(Uri.fromFile(file2), -1), cameraVideoEncoderParameters.s * 1000, cameraVideoEncoderParameters.t * 1000, 1.0d, cameraVideoEncoderParameters.o, null, 32, null));
        }
        AudioItem audioItem = (AudioItem) j5g.a0(singletonList);
        float[] fArr2 = cameraVideoEncoderParameters.j;
        if (fArr2 != null) {
            j = 1000;
            float[] fArr3 = new float[9];
            for (int i = 0; i < 9; i++) {
                fArr3[i] = fArr2[i];
            }
            fArr3[6] = f;
            Matrix matrix2 = new Matrix();
            matrix2.setValues(fArr3);
            float[] fArr4 = sv1.d;
            matrix2.getValues(fArr4);
            float f2 = fArr4[0];
            float f3 = fArr4[4];
            float f4 = fArr4[8];
            float f5 = fArr4[6];
            float f6 = fArr4[1];
            float f7 = fArr4[5];
            float f8 = fArr4[3];
            float f9 = fArr4[7];
            float f10 = f8 * f9;
            float f11 = fArr4[c];
            float f12 = f5 * f3;
            float f13 = ((((f10 * f11) + (((f5 * f6) * f7) + ((f2 * f3) * f4))) - (f11 * f12)) - ((f2 * f9) * f7)) - ((f6 * f8) * f4);
            if (-1.0E-6f >= f13 || f13 >= 1.0E-6f) {
                float[] fArr5 = new float[9];
                fArr5[0] = (f3 * f4) - (f9 * f7);
                float f14 = (f8 * f4) - (f7 * f5);
                fArr5[1] = f14;
                float f15 = f10 - f12;
                fArr5[c] = f15;
                float f16 = fArr4[1];
                float f17 = fArr4[c];
                float f18 = (f16 * f4) - (f17 * f9);
                fArr5[3] = f18;
                float f19 = fArr4[0];
                fArr5[4] = (f4 * f19) - (f17 * f5);
                float f20 = (f9 * f19) - (f5 * f16);
                fArr5[5] = f20;
                float f21 = fArr4[5];
                float f22 = fArr4[4];
                float f23 = (f16 * f21) - (f17 * f22);
                fArr5[6] = f23;
                float f24 = fArr4[3];
                float f25 = (f21 * f19) - (f17 * f24);
                fArr5[7] = f25;
                fArr5[8] = (f19 * f22) - (f16 * f24);
                float f26 = -f14;
                fArr5[1] = f26;
                float f27 = -f18;
                fArr5[3] = f27;
                float f28 = -f20;
                fArr5[5] = f28;
                float f29 = -f25;
                fArr5[7] = f29;
                fArr5[1] = f27;
                fArr5[3] = f26;
                fArr5[c] = f23;
                fArr5[6] = f15;
                fArr5[5] = f29;
                fArr5[7] = f28;
                for (int i2 = 0; i2 != 9; i2++) {
                    fArr5[i2] = fArr5[i2] / f13;
                }
                matrix = new Matrix();
                matrix.setValues(fArr5);
            } else {
                matrix = new Matrix();
            }
            fArr = new float[9];
            matrix.getValues(fArr);
        } else {
            j = 1000;
            fArr = null;
        }
        if (aVar instanceof a.C1804a) {
            videoRawItem = new VideoRawItem(new ImageBitmapMediaSource(((a.C1804a) aVar).a), cameraVideoEncoderParameters.k * j, audioItem == null ? j2 * j : audioItem.d - audioItem.c, 1.0d, null, 16, null);
        } else {
            if (!(aVar instanceof a.b)) {
                if (!z) {
                    throw new NoWhenBranchMatchedException();
                }
                f100Var = null;
                videoEncodedItem = new VideoEncodedItem(new TrackMediaSource(Uri.fromFile(((a.c) aVar).a), -1), cameraVideoEncoderParameters.k * j, j2 * j, 1.0d, new VideoEffect(fArr != null ? new VideoTransformEffect(fArr, cameraVideoEncoderParameters.h, cameraVideoEncoderParameters.g, cameraVideoEncoderParameters.m) : null, null));
                meg megVar = new meg(new lwo0(f100Var));
                megVar.c(videoEncodedItem);
                it = singletonList.iterator();
                while (it.hasNext()) {
                    megVar.a((AudioItem) it.next());
                }
                Timeline b = megVar.b().b();
                StoriesVideoEncoder.StoriesEncoderParameters.VideoOutputSettings videoOutputSettings = new StoriesVideoEncoder.StoriesEncoderParameters.VideoOutputSettings(cameraVideoEncoderParameters.h, cameraVideoEncoderParameters.g);
                MediaQuality mediaQuality = MediaQuality.HIGH;
                iArr = cameraVideoEncoderParameters.i;
                if (iArr != null || (r2 = rl3.s0(iArr)) == null) {
                    List list = EmptyList.b;
                }
                return new StoriesVideoEncoder.StoriesEncoderParameters(b, videoOutputSettings, mediaQuality, list, cameraVideoEncoderParameters.d, cameraVideoEncoderParameters.r);
            }
            videoRawItem = new VideoRawItem(new ImageFileMediaSource(Uri.fromFile(((a.b) aVar).a), 0), cameraVideoEncoderParameters.k * j, audioItem == null ? j2 * j : audioItem.d - audioItem.c, 1.0d, null, 16, null);
        }
        videoEncodedItem = videoRawItem;
        f100Var = null;
        meg megVar2 = new meg(new lwo0(f100Var));
        megVar2.c(videoEncodedItem);
        it = singletonList.iterator();
        while (it.hasNext()) {
        }
        Timeline b2 = megVar2.b().b();
        StoriesVideoEncoder.StoriesEncoderParameters.VideoOutputSettings videoOutputSettings2 = new StoriesVideoEncoder.StoriesEncoderParameters.VideoOutputSettings(cameraVideoEncoderParameters.h, cameraVideoEncoderParameters.g);
        MediaQuality mediaQuality2 = MediaQuality.HIGH;
        iArr = cameraVideoEncoderParameters.i;
        if (iArr != null) {
        }
        List list2 = EmptyList.b;
        return new StoriesVideoEncoder.StoriesEncoderParameters(b2, videoOutputSettings2, mediaQuality2, list2, cameraVideoEncoderParameters.d, cameraVideoEncoderParameters.r);
    }
}
