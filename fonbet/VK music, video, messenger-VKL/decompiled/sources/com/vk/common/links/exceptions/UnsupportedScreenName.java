package com.vk.common.links.exceptions;

/* compiled from: UnsupportedScreenName.kt */
/* loaded from: classes17.dex */
public final class UnsupportedScreenName extends Exception {
    private final Integer appId = null;
    private final String screenName;

    public UnsupportedScreenName(String str) {
        this.screenName = str;
    }
}
