package com.vk.profile.community.suggestions.impl.ui.suggestions;

import java.util.List;
import xsna.ao50;
import xsna.asp;
import xsna.fi50;
import xsna.fm50;
import xsna.h0u0;
import xsna.i3i;
import xsna.yzt0;
import xsna.zrp;
import xsna.ztg;

/* compiled from: CommunitySuggestionsViewState.kt */
/* loaded from: classes5.dex */
public final class CommunitySuggestionsViewState implements ao50 {
    public final fi50 a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommunitySuggestionsViewState.kt */
    public static final class LoadingState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ LoadingState[] $VALUES;
        public static final LoadingState FOOTER_LOADING;
        public static final LoadingState LOADING;

        static {
            LoadingState loadingState = new LoadingState("LOADING", 0);
            LOADING = loadingState;
            LoadingState loadingState2 = new LoadingState("FOOTER_LOADING", 1);
            FOOTER_LOADING = loadingState2;
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

    /* compiled from: CommunitySuggestionsViewState.kt */
    public static final class a implements fm50<ztg> {
        public final yzt0<List<i3i>> a;
        public final yzt0<String> b;
        public final yzt0<LoadingState> c;
        public final yzt0<b> d;
        public final yzt0<Boolean> e;

        public a(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4, h0u0 h0u0Var5) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
            this.d = h0u0Var4;
            this.e = h0u0Var5;
        }
    }

    /* compiled from: CommunitySuggestionsViewState.kt */
    public static final class b {
        public final Throwable a;
        public final boolean b;

        public b(Throwable th, boolean z) {
            this.a = th;
            this.b = z;
        }
    }

    public CommunitySuggestionsViewState(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
