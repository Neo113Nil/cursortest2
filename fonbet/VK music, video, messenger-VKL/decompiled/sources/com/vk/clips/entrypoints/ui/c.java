package com.vk.clips.entrypoints.ui;

import com.vk.clips.entrypoints.feature.ClipsEntryPointsState;

/* compiled from: ClipsEntryPointsMapper.kt */
/* loaded from: classes16.dex */
public final class c {

    /* compiled from: ClipsEntryPointsMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipsEntryPointsState.ScreenMode.values().length];
            try {
                iArr[ClipsEntryPointsState.ScreenMode.PHOTO_PICKER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipsEntryPointsState.ScreenMode.DRAFTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClipsEntryPointsState.ScreenMode.TEMPLATES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ClipsEntryPointsState.ScreenMode.TRENDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
