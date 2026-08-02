package com.vk.clips.sdk.shared.feed.controller.mvi.state.spinner;

import xsna.asp;
import xsna.zrp;

/* compiled from: ScreenSpinnerViewState.kt */
/* loaded from: classes17.dex */
public interface ScreenSpinnerViewState {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ScreenSpinnerViewState.kt */
    public static final class Visible implements ScreenSpinnerViewState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Visible[] $VALUES;
        public static final Visible Error;
        public static final Visible Loading;
        public static final Visible Success;

        static {
            Visible visible = new Visible("Loading", 0);
            Loading = visible;
            Visible visible2 = new Visible("Success", 1);
            Success = visible2;
            Visible visible3 = new Visible("Error", 2);
            Error = visible3;
            Visible[] visibleArr = {visible, visible2, visible3};
            $VALUES = visibleArr;
            $ENTRIES = new asp(visibleArr);
        }

        public Visible() {
            throw null;
        }

        public static Visible valueOf(String str) {
            return (Visible) Enum.valueOf(Visible.class, str);
        }

        public static Visible[] values() {
            return (Visible[]) $VALUES.clone();
        }
    }

    /* compiled from: ScreenSpinnerViewState.kt */
    public static final class a implements ScreenSpinnerViewState {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 712748505;
        }

        public final String toString() {
            return "Hidden";
        }
    }
}
