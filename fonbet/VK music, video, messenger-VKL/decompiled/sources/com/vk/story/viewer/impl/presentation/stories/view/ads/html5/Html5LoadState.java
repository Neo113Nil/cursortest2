package com.vk.story.viewer.impl.presentation.stories.view.ads.html5;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Html5LoadState.kt */
/* loaded from: classes6.dex */
public final class Html5LoadState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Html5LoadState[] $VALUES;
    public static final Html5LoadState ERROR;
    public static final Html5LoadState FINISHED;
    public static final Html5LoadState LOADING;

    static {
        Html5LoadState html5LoadState = new Html5LoadState("LOADING", 0);
        LOADING = html5LoadState;
        Html5LoadState html5LoadState2 = new Html5LoadState("FINISHED", 1);
        FINISHED = html5LoadState2;
        Html5LoadState html5LoadState3 = new Html5LoadState("ERROR", 2);
        ERROR = html5LoadState3;
        Html5LoadState[] html5LoadStateArr = {html5LoadState, html5LoadState2, html5LoadState3};
        $VALUES = html5LoadStateArr;
        $ENTRIES = new asp(html5LoadStateArr);
    }

    public Html5LoadState() {
        throw null;
    }

    public static Html5LoadState valueOf(String str) {
        return (Html5LoadState) Enum.valueOf(Html5LoadState.class, str);
    }

    public static Html5LoadState[] values() {
        return (Html5LoadState[]) $VALUES.clone();
    }
}
