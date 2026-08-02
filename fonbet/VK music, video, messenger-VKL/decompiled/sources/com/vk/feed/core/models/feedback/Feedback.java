package com.vk.feed.core.models.feedback;

import com.vk.core.serialize.Serializer;

/* compiled from: Feedback.kt */
/* loaded from: classes18.dex */
public abstract class Feedback extends Serializer.StreamParcelableAdapter {
    public final String b;
    public final String c;
    public final String d;
    public transient boolean e;

    public Feedback(String str, String str2, String str3) {
        this.b = str;
        this.c = str2;
        this.d = str3;
    }
}
