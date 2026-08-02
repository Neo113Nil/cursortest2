package com.vk.clips.sdk.shared.item.clip.events;

import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import xsna.asp;
import xsna.cq;
import xsna.epx;
import xsna.qzb0;
import xsna.zrp;

/* compiled from: ClipItemTooltipEvent.kt */
/* loaded from: classes17.dex */
public interface ClipItemTooltipEvent {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipItemTooltipEvent.kt */
    public static final class HideTooltip implements ClipItemTooltipEvent {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ HideTooltip[] $VALUES;
        public static final HideTooltip ANIMATED;
        public static final HideTooltip IMMEDIATE;

        static {
            HideTooltip hideTooltip = new HideTooltip("IMMEDIATE", 0);
            IMMEDIATE = hideTooltip;
            HideTooltip hideTooltip2 = new HideTooltip("ANIMATED", 1);
            ANIMATED = hideTooltip2;
            HideTooltip[] hideTooltipArr = {hideTooltip, hideTooltip2};
            $VALUES = hideTooltipArr;
            $ENTRIES = new asp(hideTooltipArr);
        }

        public HideTooltip() {
            throw null;
        }

        public static HideTooltip valueOf(String str) {
            return (HideTooltip) Enum.valueOf(HideTooltip.class, str);
        }

        public static HideTooltip[] values() {
            return (HideTooltip[]) $VALUES.clone();
        }
    }

    /* compiled from: ClipItemTooltipEvent.kt */
    public static final class a implements ClipItemTooltipEvent {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -2130229673;
        }

        public final String toString() {
            return "OnDisabledTrackClicked";
        }
    }

    /* compiled from: ClipItemTooltipEvent.kt */
    public static final class b implements ClipItemTooltipEvent {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1660870097;
        }

        public final String toString() {
            return "ShowAudioRestrictedTooltip";
        }
    }

    /* compiled from: ClipItemTooltipEvent.kt */
    public static final class c implements ClipItemTooltipEvent {
        public final SdkClipVideoFile b;

        public c(SdkClipVideoFile sdkClipVideoFile) {
            this.b = sdkClipVideoFile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return cq.d(new StringBuilder("UpdateByBind(clip="), this.b, ')');
        }
    }

    /* compiled from: ClipItemTooltipEvent.kt */
    public static final class d implements ClipItemTooltipEvent {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 615347807;
        }

        public final String toString() {
            return "UpdateByComment";
        }
    }

    /* compiled from: ClipItemTooltipEvent.kt */
    public static final class e implements ClipItemTooltipEvent {
        public final qzb0.e b;

        public e(qzb0.e eVar) {
            this.b = eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "UpdateByPosition(tooltipPointsState=" + this.b + ')';
        }
    }

    /* compiled from: ClipItemTooltipEvent.kt */
    public static final class f implements ClipItemTooltipEvent {
        public static final f b = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -556869665;
        }

        public final String toString() {
            return "UpdateByShare";
        }
    }
}
