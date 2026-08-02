package com.vk.im.ui.utils;

import com.google.android.material.appbar.AppBarLayout;
import com.unity3d.services.UnityAdsConstants;
import xsna.asp;
import xsna.zrp;

/* compiled from: AppBarLayoutStateListener.kt */
/* loaded from: classes2.dex */
public final class AppBarLayoutStateListener implements AppBarLayout.f {
    public final Object b;
    public AppBarState c = AppBarState.TRANSFORMING;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AppBarLayoutStateListener.kt */
    public static final class AppBarState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AppBarState[] $VALUES;
        public static final AppBarState COLLAPSED;
        public static final AppBarState EXPANDED;
        public static final AppBarState TRANSFORMING;

        static {
            AppBarState appBarState = new AppBarState("EXPANDED", 0);
            EXPANDED = appBarState;
            AppBarState appBarState2 = new AppBarState("COLLAPSED", 1);
            COLLAPSED = appBarState2;
            AppBarState appBarState3 = new AppBarState("TRANSFORMING", 2);
            TRANSFORMING = appBarState3;
            AppBarState[] appBarStateArr = {appBarState, appBarState2, appBarState3};
            $VALUES = appBarStateArr;
            $ENTRIES = new asp(appBarStateArr);
        }

        public AppBarState() {
            throw null;
        }

        public static AppBarState valueOf(String str) {
            return (AppBarState) Enum.valueOf(AppBarState.class, str);
        }

        public static AppBarState[] values() {
            return (AppBarState[]) $VALUES.clone();
        }
    }

    public AppBarLayoutStateListener(a aVar) {
        this.b = aVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.vk.im.ui.utils.AppBarLayoutStateListener$a, java.lang.Object] */
    @Override // com.google.android.material.appbar.AppBarLayout.a
    public final void a(AppBarLayout appBarLayout, int i) {
        float totalScrollRange = (-i) / appBarLayout.getTotalScrollRange();
        AppBarState appBarState = this.c;
        AppBarState appBarState2 = totalScrollRange == 1.0f ? AppBarState.COLLAPSED : totalScrollRange == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? AppBarState.EXPANDED : AppBarState.TRANSFORMING;
        ?? r1 = this.b;
        if (appBarState != appBarState2) {
            this.c = appBarState2;
            r1.i(appBarState2);
        }
        r1.q(totalScrollRange);
    }

    /* compiled from: AppBarLayoutStateListener.kt */
    public interface a {
        void i(AppBarState appBarState);

        default void q(float f) {
        }
    }
}
