package com.vk.clips.sdk.common.provider;

import androidx.compose.runtime.a;
import kotlin.Pair;
import xsna.asp;
import xsna.lg90;
import xsna.zrp;

/* compiled from: ClipsComposeImageLoader.kt */
/* loaded from: classes17.dex */
public interface ClipsComposeImageLoader {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipsComposeImageLoader.kt */
    public static final class LoadingState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ LoadingState[] $VALUES;
        public static final LoadingState Loaded;
        public static final LoadingState Placeholder;

        static {
            LoadingState loadingState = new LoadingState("Loaded", 0);
            Loaded = loadingState;
            LoadingState loadingState2 = new LoadingState("Placeholder", 1);
            Placeholder = loadingState2;
            LoadingState[] loadingStateArr = {loadingState, loadingState2};
            $VALUES = loadingStateArr;
            $ENTRIES = new asp(loadingStateArr);
        }

        public LoadingState() {
            throw null;
        }

        public static LoadingState valueOf(String str) {
            return (LoadingState) Enum.valueOf(LoadingState.class, str);
        }

        public static LoadingState[] values() {
            return (LoadingState[]) $VALUES.clone();
        }
    }

    Pair<LoadingState, lg90> a(String str, a aVar, int i);
}
