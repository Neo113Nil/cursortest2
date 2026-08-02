package com.vk.clips.download.api.di;

import android.content.Context;
import android.content.ContextWrapper;
import com.vk.clips.download.api.ClipsDownloadLauncher$ClipsDownloadQuality;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;
import xsna.gzs;
import xsna.hrc;
import xsna.izs;
import xsna.rrd;
import xsna.s3q0;

/* compiled from: ClipsDownloadComponent.kt */
/* loaded from: classes16.dex */
public final class ClipsDownloadComponentKt {
    public static final ClipsDownloadComponentKt$COMPONENT_STUB$1 a = new ClipsDownloadComponent() { // from class: com.vk.clips.download.api.di.ClipsDownloadComponentKt$COMPONENT_STUB$1
        public final a a = new a();
        public final b b = new b();

        @Override // com.vk.clips.download.api.di.ClipsDownloadComponent
        public final hrc Gc() {
            return this.b;
        }

        @Override // com.vk.clips.download.api.di.ClipsDownloadComponent
        public final rrd Q5() {
            return this.a;
        }

        /* compiled from: ClipsDownloadComponent.kt */
        public static final class b implements hrc {
            @Override // xsna.hrc
            public final void b(int i) {
            }

            @Override // xsna.hrc
            public final void a(Context context, ClipVideoFile clipVideoFile, boolean z, gzs<s3q0> gzsVar, izs<? super ClipsDownloadLauncher$ClipsDownloadQuality, s3q0> izsVar) {
            }
        }

        /* compiled from: ClipsDownloadComponent.kt */
        public static final class a implements rrd {
            @Override // xsna.rrd
            public final boolean b(VideoFile videoFile) {
                return false;
            }

            @Override // xsna.rrd
            public final boolean c(VideoFile videoFile) {
                return false;
            }

            @Override // xsna.rrd
            public final void a(ContextWrapper contextWrapper, VideoFile videoFile) {
            }
        }
    };
}
