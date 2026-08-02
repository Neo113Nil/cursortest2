package com.bykv.vk.openvk.preload.geckox.net;

import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class Response {
    public final String body;
    public final int code;
    public final Map<String, String> headers;
    public final String msg;

    public Response(Map<String, String> map, String str, int i, String str2) {
        this.headers = map;
        this.body = str;
        this.code = i;
        this.msg = str2;
    }
}
