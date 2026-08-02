package com.vk.push.core.network.http;

import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import xsna.pn00;
import xsna.zcl;

/* compiled from: BaseHttpHeadersHolder.kt */
/* loaded from: classes.dex */
public final class BaseHttpHeadersHolder {
    public static final String CONTENT_TYPE_JSON = "application/json; charset=utf-8";
    public static final String CONTENT_TYPE_URLENCODED = "application/x-www-form-urlencoded; charset=utf-8";
    public static final Companion Companion = new Companion(null);
    public static final String DEFAULT_DEBUG_HEADER = "x-vkpns-request-id";
    public final String a;
    public final String b;
    public final String c;

    /* compiled from: BaseHttpHeadersHolder.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public Companion() {
        }
    }

    public BaseHttpHeadersHolder(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final Map<String, String> get() {
        return pn00.k(new Pair(DEFAULT_DEBUG_HEADER, UUID.randomUUID().toString()), new Pair("User-Agent", this.a), new Pair("X-Vkpns-Package-Name", this.b), new Pair("content-type", this.c));
    }

    public final String getContentType() {
        return this.c;
    }

    public final String getPackageName() {
        return this.b;
    }

    public final String getVersionName() {
        return this.a;
    }

    public /* synthetic */ BaseHttpHeadersHolder(String str, String str2, String str3, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? CONTENT_TYPE_JSON : str3);
    }
}
