package com.vk.ecomm.design.view.productattaches.large;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SnippetLiveStatus.kt */
/* loaded from: classes18.dex */
public final class SnippetLiveStatus {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SnippetLiveStatus[] $VALUES;
    public static final a Companion;
    private static final String ICON_LIVE_FINISHED = "live_finished";
    private static final String ICON_LIVE_STARTED = "live_started";
    private static final String ICON_LIVE_UPCOMING = "live_upcoming";
    public static final SnippetLiveStatus LIVE_FINISHED;
    public static final SnippetLiveStatus LIVE_STARTED;
    public static final SnippetLiveStatus LIVE_UPCOMING;

    /* compiled from: SnippetLiveStatus.kt */
    public static final class a {
    }

    static {
        SnippetLiveStatus snippetLiveStatus = new SnippetLiveStatus("LIVE_STARTED", 0);
        LIVE_STARTED = snippetLiveStatus;
        SnippetLiveStatus snippetLiveStatus2 = new SnippetLiveStatus("LIVE_UPCOMING", 1);
        LIVE_UPCOMING = snippetLiveStatus2;
        SnippetLiveStatus snippetLiveStatus3 = new SnippetLiveStatus("LIVE_FINISHED", 2);
        LIVE_FINISHED = snippetLiveStatus3;
        SnippetLiveStatus[] snippetLiveStatusArr = {snippetLiveStatus, snippetLiveStatus2, snippetLiveStatus3};
        $VALUES = snippetLiveStatusArr;
        $ENTRIES = new asp(snippetLiveStatusArr);
        Companion = new a();
    }

    public SnippetLiveStatus() {
        throw null;
    }

    public static SnippetLiveStatus valueOf(String str) {
        return (SnippetLiveStatus) Enum.valueOf(SnippetLiveStatus.class, str);
    }

    public static SnippetLiveStatus[] values() {
        return (SnippetLiveStatus[]) $VALUES.clone();
    }
}
