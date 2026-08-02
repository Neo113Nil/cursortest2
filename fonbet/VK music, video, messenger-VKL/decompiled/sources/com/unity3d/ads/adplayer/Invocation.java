package com.unity3d.ads.adplayer;

/* compiled from: Invocation.kt */
/* loaded from: classes14.dex */
public final class Invocation {
    private final String location;
    private final Object[] parameters;

    public Invocation(String str, Object[] objArr) {
        this.location = str;
        this.parameters = objArr;
    }

    public final String getLocation() {
        return this.location;
    }

    public final Object[] getParameters() {
        return this.parameters;
    }
}
