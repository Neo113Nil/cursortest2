package com.fyber.inneractive.sdk.mraid;

/* loaded from: classes12.dex */
public abstract class y {
    public abstract String a();

    public final String toString() {
        String a = a();
        return a != null ? a.replaceAll("[^a-zA-Z0-9_,:\\s\\{\\}\\'\\\"]", "") : "";
    }
}
