package com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt;

import java.util.regex.Pattern;

/* loaded from: classes12.dex */
public abstract class a {
    public static final Pattern a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    static {
        Pattern.compile("(\\S+?):(\\S+)");
    }
}
