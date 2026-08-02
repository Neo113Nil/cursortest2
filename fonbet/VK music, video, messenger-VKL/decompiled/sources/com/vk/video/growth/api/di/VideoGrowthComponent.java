package com.vk.video.growth.api.di;

import android.content.Context;
import com.vk.di.component.DiScopedComponent;
import com.vk.video.growth.api.data.VideoGrowthAppStore;
import com.vk.video.growth.api.data.VideoGrowthCommunitySource;
import com.vk.video.growth.api.data.VideoGrowthType;
import com.vk.video.growth.api.data.VideoGrowthVideoParams;
import java.util.EnumMap;
import java.util.Map;
import xsna.dos0;
import xsna.f0s0;
import xsna.gzs;
import xsna.hit0;
import xsna.hos0;
import xsna.jgp;
import xsna.mos0;
import xsna.pwj0;
import xsna.s3q0;
import xsna.sos0;
import xsna.wos0;
import xsna.x1e0;
import xsna.zos0;

/* compiled from: VideoGrowthComponent.kt */
/* loaded from: classes6.dex */
public interface VideoGrowthComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: VideoGrowthComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final VideoGrowthComponent STUB = new VideoGrowthComponent() { // from class: com.vk.video.growth.api.di.VideoGrowthComponent$Companion$STUB$1

            /* compiled from: VideoGrowthComponent.kt */
            public static final class b implements hos0 {
                @Override // xsna.hos0
                public final zos0 a(VideoGrowthType videoGrowthType) {
                    zos0 zos0Var = zos0.j;
                    return zos0.j;
                }

                @Override // xsna.hos0
                public final Map<String, zos0> b() {
                    return jgp.b;
                }

                @Override // xsna.hos0
                public final zos0 c(EnumMap<VideoGrowthAppStore, String> enumMap) {
                    zos0 zos0Var = zos0.j;
                    return zos0.j;
                }
            }

            @Override // com.vk.video.growth.api.di.VideoGrowthComponent
            public final hos0 Af() {
                return new b();
            }

            @Override // com.vk.video.growth.api.di.VideoGrowthComponent
            public final mos0 B3() {
                return mos0.a.a.getSTUB();
            }

            @Override // com.vk.video.growth.api.di.VideoGrowthComponent
            public final wos0 B6() {
                return new c();
            }

            @Override // com.vk.video.growth.api.di.VideoGrowthComponent
            public final hit0 N8() {
                return new d();
            }

            @Override // com.vk.video.growth.api.di.VideoGrowthComponent
            public final sos0 Z7() {
                return sos0.a.a.getSTUB();
            }

            @Override // com.vk.video.growth.api.di.VideoGrowthComponent
            public final f0s0 Z9() {
                return f0s0.a.a.getSTUB();
            }

            @Override // com.vk.video.growth.api.di.VideoGrowthComponent
            public final dos0 z6() {
                return new a();
            }

            /* compiled from: VideoGrowthComponent.kt */
            public static final class a implements dos0 {
                @Override // xsna.dos0
                public final boolean a() {
                    return false;
                }

                @Override // xsna.dos0
                public final void b() {
                }

                @Override // xsna.dos0
                public final void d() {
                }

                @Override // xsna.dos0
                public final void c(Context context, VideoGrowthVideoParams videoGrowthVideoParams) {
                }
            }

            /* compiled from: VideoGrowthComponent.kt */
            public static final class d implements hit0 {
                @Override // xsna.hit0
                public final void a(Context context, VideoGrowthVideoParams videoGrowthVideoParams, Map<String, String> map) {
                }

                @Override // xsna.hit0
                public final void b(Context context, String str, VideoGrowthAppStore videoGrowthAppStore, VideoGrowthVideoParams videoGrowthVideoParams, String str2) {
                }
            }

            /* compiled from: VideoGrowthComponent.kt */
            public static final class c implements wos0 {
                @Override // xsna.wos0
                public final void a(Context context, VideoGrowthVideoParams videoGrowthVideoParams, boolean z, x1e0 x1e0Var) {
                }

                @Override // xsna.wos0
                public final void b(Context context, VideoGrowthVideoParams videoGrowthVideoParams, long j, VideoGrowthCommunitySource videoGrowthCommunitySource, gzs<s3q0> gzsVar) {
                }
            }
        };

        public final VideoGrowthComponent getSTUB() {
            return STUB;
        }
    }

    hos0 Af();

    mos0 B3();

    wos0 B6();

    hit0 N8();

    sos0 Z7();

    f0s0 Z9();

    dos0 z6();
}
