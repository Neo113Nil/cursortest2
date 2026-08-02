package com.vk.clips.viewer.impl.feed.view.subs.selector;

import android.app.Activity;
import com.vk.clips.viewer.api.domain.subs.ClipsSubsSetting;
import com.vk.clips.viewer.impl.feed.view.subs.selector.ClipsAutoSubtitlesBottomSheet;
import kotlin.LazyThreadSafetyMode;
import xsna.f5;
import xsna.msy;
import xsna.w8i;

/* compiled from: ClipsAutoSubtitlesSelector.kt */
/* loaded from: classes17.dex */
public final class b implements w8i {
    public final Object b = msy.a(LazyThreadSafetyMode.NONE, new f5(this, 21));

    /* compiled from: ClipsAutoSubtitlesSelector.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ClipsSubsSetting.values().length];
            try {
                iArr[ClipsSubsSetting.NEVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipsSubsSetting.ALWAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClipsSubsSetting.SOUND_OFF.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ClipsAutoSubtitlesBottomSheet.ClipsAutoSubsSetting.values().length];
            try {
                iArr2[ClipsAutoSubtitlesBottomSheet.ClipsAutoSubsSetting.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ClipsAutoSubtitlesBottomSheet.ClipsAutoSubsSetting.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ClipsAutoSubtitlesBottomSheet.ClipsAutoSubsSetting.MUTE_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public b(Activity activity) {
    }
}
