package com.vk.network.eventhub.api;

import defpackage.q0;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.shy;
import xsna.urd0;
import xsna.zrp;

/* compiled from: EventHubServiceUrlBuilder.kt */
/* loaded from: classes3.dex */
public final class EventHubServiceUrlBuilder {
    public final String a;
    public final String b;
    public final Format c;
    public final long d;
    public final int e;
    public final String f;
    public final boolean g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EventHubServiceUrlBuilder.kt */
    public static final class Format {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Format[] $VALUES;
        public static final Format JSON;
        public static final Format MSGPACK;
        private final String stringValue;

        static {
            Format format = new Format("JSON", 0, "json");
            JSON = format;
            Format format2 = new Format("MSGPACK", 1, "msgpack");
            MSGPACK = format2;
            Format[] formatArr = {format, format2};
            $VALUES = formatArr;
            $ENTRIES = new asp(formatArr);
        }

        public Format(String str, int i, String str2) {
            this.stringValue = str2;
        }

        public static Format valueOf(String str) {
            return (Format) Enum.valueOf(Format.class, str);
        }

        public static Format[] values() {
            return (Format[]) $VALUES.clone();
        }

        public final String h() {
            return this.stringValue;
        }
    }

    public EventHubServiceUrlBuilder(String str, String str2, Format format, long j, int i, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = format;
        this.d = j;
        this.e = i;
        this.f = str3;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        Object valueOf = Double.valueOf(1.002d);
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventHubServiceUrlBuilder)) {
            return false;
        }
        EventHubServiceUrlBuilder eventHubServiceUrlBuilder = (EventHubServiceUrlBuilder) obj;
        return epx.f(this.a, eventHubServiceUrlBuilder.a) && valueOf.equals(valueOf) && epx.f(this.b, eventHubServiceUrlBuilder.b) && this.c == eventHubServiceUrlBuilder.c && this.d == eventHubServiceUrlBuilder.d && this.e == eventHubServiceUrlBuilder.e && epx.f(this.f, eventHubServiceUrlBuilder.f) && this.g == eventHubServiceUrlBuilder.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + urd0.a(shy.a(this.e, bh10.a((this.c.hashCode() + urd0.a((Double.valueOf(1.002d).hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.b)) * 31, 31, this.d), 31), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventHubServiceUrlBuilder(host=");
        sb.append(this.a);
        sb.append(", version=");
        sb.append(Double.valueOf(1.002d));
        sb.append(", userAgent=");
        sb.append(this.b);
        sb.append(", format=");
        sb.append(this.c);
        sb.append(", pingIntervalMs=");
        sb.append(this.d);
        sb.append(", appId=");
        sb.append(this.e);
        sb.append(", apiVersion=");
        sb.append(this.f);
        sb.append(", userAgentInQuery=");
        return q0.a(sb, this.g, ')');
    }
}
