package com.vk.libvideo.tracker;

import com.vk.dto.common.VideoFile;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.libvideo.autoplay.b;
import io.reactivex.rxjava3.subjects.d;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.bpn0;
import xsna.xh5;
import xsna.yg5;
import xsna.zrp;

/* compiled from: ScreenModeVideoStatMapper.kt */
/* loaded from: classes3.dex */
public final class ScreenModeVideoStatMapper {
    public final d<VideoMinimizableState> a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ScreenModeVideoStatMapper.kt */
    public static final class UnifiedStatScreenMode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ UnifiedStatScreenMode[] $VALUES;
        public static final UnifiedStatScreenMode DISCOVERY;
        public static final UnifiedStatScreenMode FULLSCREEN_LANDSCAPE;
        public static final UnifiedStatScreenMode FULLSCREEN_PORTRAIT;
        public static final UnifiedStatScreenMode PREVIEW;

        static {
            UnifiedStatScreenMode unifiedStatScreenMode = new UnifiedStatScreenMode("DISCOVERY", 0);
            DISCOVERY = unifiedStatScreenMode;
            UnifiedStatScreenMode unifiedStatScreenMode2 = new UnifiedStatScreenMode("FULLSCREEN_LANDSCAPE", 1);
            FULLSCREEN_LANDSCAPE = unifiedStatScreenMode2;
            UnifiedStatScreenMode unifiedStatScreenMode3 = new UnifiedStatScreenMode("FULLSCREEN_PORTRAIT", 2);
            FULLSCREEN_PORTRAIT = unifiedStatScreenMode3;
            UnifiedStatScreenMode unifiedStatScreenMode4 = new UnifiedStatScreenMode("PREVIEW", 3);
            PREVIEW = unifiedStatScreenMode4;
            UnifiedStatScreenMode[] unifiedStatScreenModeArr = {unifiedStatScreenMode, unifiedStatScreenMode2, unifiedStatScreenMode3, unifiedStatScreenMode4};
            $VALUES = unifiedStatScreenModeArr;
            $ENTRIES = new asp(unifiedStatScreenModeArr);
        }

        public UnifiedStatScreenMode() {
            throw null;
        }

        public static UnifiedStatScreenMode valueOf(String str) {
            return (UnifiedStatScreenMode) Enum.valueOf(UnifiedStatScreenMode.class, str);
        }

        public static UnifiedStatScreenMode[] values() {
            return (UnifiedStatScreenMode[]) $VALUES.clone();
        }
    }

    /* compiled from: ScreenModeVideoStatMapper.kt */
    public interface a<T> {
        T d(UnifiedStatScreenMode unifiedStatScreenMode);
    }

    public ScreenModeVideoStatMapper(d<VideoMinimizableState> dVar) {
        this.a = dVar;
    }

    public final <T> T a(int i, long j, a<T> aVar) {
        UnifiedStatScreenMode unifiedStatScreenMode;
        d<VideoMinimizableState> dVar = this.a;
        VideoMinimizableState P0 = dVar != null ? dVar.P0() : null;
        if ((P0 instanceof VideoMinimizableState.Expanded.Compact) || (P0 instanceof VideoMinimizableState.Expanded.MatchRatio)) {
            bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
            xh5 xh5Var = b.C1208b.a().c;
            yg5 yg5Var = xh5Var != null ? xh5Var.a : null;
            if (yg5Var != null) {
                int o0 = yg5Var.A().o0();
                long j2 = yg5Var.A().I0().b;
                if (o0 == i && j2 == j) {
                    unifiedStatScreenMode = UnifiedStatScreenMode.DISCOVERY;
                }
            }
            unifiedStatScreenMode = UnifiedStatScreenMode.PREVIEW;
        } else if (P0 instanceof VideoMinimizableState.FullscreenHorizontal) {
            unifiedStatScreenMode = UnifiedStatScreenMode.FULLSCREEN_LANDSCAPE;
        } else if (P0 instanceof VideoMinimizableState.FullscreenVertical) {
            unifiedStatScreenMode = UnifiedStatScreenMode.FULLSCREEN_PORTRAIT;
        } else if ((P0 instanceof VideoMinimizableState.Collapsed) || (P0 instanceof VideoMinimizableState.Hidden) || (P0 instanceof VideoMinimizableState.Pip) || (P0 instanceof VideoMinimizableState.PreparedToPip)) {
            unifiedStatScreenMode = UnifiedStatScreenMode.PREVIEW;
        } else {
            if (P0 != null && !(P0 instanceof VideoMinimizableState.Animating)) {
                throw new NoWhenBranchMatchedException();
            }
            unifiedStatScreenMode = null;
        }
        if (unifiedStatScreenMode != null) {
            return aVar.d(unifiedStatScreenMode);
        }
        return null;
    }

    public final <T> T b(VideoFile videoFile, a<T> aVar) {
        return (T) a(videoFile.o0(), videoFile.I0().b, aVar);
    }
}
