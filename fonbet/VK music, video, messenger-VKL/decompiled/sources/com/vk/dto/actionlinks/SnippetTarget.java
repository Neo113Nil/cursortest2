package com.vk.dto.actionlinks;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SnippetTarget.kt */
/* loaded from: classes18.dex */
public final class SnippetTarget {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SnippetTarget[] $VALUES;
    public static final a Companion;
    public static final SnippetTarget DISCOVERY;
    public static final SnippetTarget UNKNOWN;
    public static final SnippetTarget VIDEO;
    private final String value;

    /* compiled from: SnippetTarget.kt */
    public static final class a {
        public static SnippetTarget a(String str) {
            SnippetTarget snippetTarget;
            SnippetTarget[] values = SnippetTarget.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    snippetTarget = null;
                    break;
                }
                snippetTarget = values[i];
                if (epx.f(snippetTarget.h(), str)) {
                    break;
                }
                i++;
            }
            return snippetTarget == null ? SnippetTarget.UNKNOWN : snippetTarget;
        }
    }

    static {
        SnippetTarget snippetTarget = new SnippetTarget("DISCOVERY", 0, "discovery");
        DISCOVERY = snippetTarget;
        SnippetTarget snippetTarget2 = new SnippetTarget(SignalingProtocol.MEDIA_OPTION_VIDEO, 1, "video");
        VIDEO = snippetTarget2;
        SnippetTarget snippetTarget3 = new SnippetTarget(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2, "");
        UNKNOWN = snippetTarget3;
        SnippetTarget[] snippetTargetArr = {snippetTarget, snippetTarget2, snippetTarget3};
        $VALUES = snippetTargetArr;
        $ENTRIES = new asp(snippetTargetArr);
        Companion = new a();
    }

    public SnippetTarget(String str, int i, String str2) {
        this.value = str2;
    }

    public static SnippetTarget valueOf(String str) {
        return (SnippetTarget) Enum.valueOf(SnippetTarget.class, str);
    }

    public static SnippetTarget[] values() {
        return (SnippetTarget[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
