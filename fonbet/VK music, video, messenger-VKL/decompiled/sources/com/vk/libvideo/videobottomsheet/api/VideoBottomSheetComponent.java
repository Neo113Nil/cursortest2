package com.vk.libvideo.videobottomsheet.api;

import com.vk.di.component.DiScopedComponent;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.videobottomsheet.api.a;
import java.util.List;
import xsna.izs;
import xsna.k88;
import xsna.pwj0;
import xsna.s60;
import xsna.s6s0;
import xsna.y6s0;

/* compiled from: VideoBottomSheetComponent.kt */
/* loaded from: classes.dex */
public interface VideoBottomSheetComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: VideoBottomSheetComponent.kt */
    /* loaded from: classes3.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final VideoBottomSheetComponent STUB = new VideoBottomSheetComponent() { // from class: com.vk.libvideo.videobottomsheet.api.VideoBottomSheetComponent$Companion$STUB$1

            /* compiled from: VideoBottomSheetComponent.kt */
            public static final class a implements a.InterfaceC1255a {
                @Override // com.vk.libvideo.videobottomsheet.api.a.InterfaceC1255a
                public final s6s0 a(a.InterfaceC1255a.C1256a c1256a, s60 s60Var, izs<? super UserId, Boolean> izsVar) {
                    return new s6s0(new VideoFileOld(), null, null, null, false, null, false, false, false, null, null, null, null, false, null, false, null, false, null, null, null, false, 536870910);
                }
            }

            @Override // com.vk.libvideo.videobottomsheet.api.VideoBottomSheetComponent
            public final a.InterfaceC1255a Mc(List<? extends k88> list) {
                return new a();
            }

            @Override // com.vk.libvideo.videobottomsheet.api.VideoBottomSheetComponent
            public final a.b hd(List<? extends k88> list) {
                return new b();
            }

            /* compiled from: VideoBottomSheetComponent.kt */
            public static final class b implements a.b {
                @Override // com.vk.libvideo.videobottomsheet.api.a.b
                public final y6s0 a(UserId userId, Integer num) {
                    return new a();
                }

                /* compiled from: VideoBottomSheetComponent.kt */
                public static final class a implements y6s0 {
                    @Override // xsna.y6s0
                    public final int c2() {
                        return -1;
                    }

                    @Override // xsna.y6s0
                    public final void a(VideoBottomSheetSideEffectOptions videoBottomSheetSideEffectOptions, VideoFile videoFile) {
                    }

                    @Override // xsna.y6s0
                    public final void b(VideoBottomSheetSideEffectOptions videoBottomSheetSideEffectOptions, VideoFile videoFile) {
                    }
                }
            }
        };

        public final VideoBottomSheetComponent getSTUB() {
            return STUB;
        }
    }

    a.InterfaceC1255a Mc(List<? extends k88> list);

    a.b hd(List<? extends k88> list);
}
