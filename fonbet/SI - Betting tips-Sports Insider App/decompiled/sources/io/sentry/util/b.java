package io.sentry.util;

import io.sentry.l0;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final List f17154a = Arrays.asList("X-FORWARDED-FOR", "AUTHORIZATION", "COOKIE", "SET-COOKIE", "X-API-KEY", "X-REAL-IP", "REMOTE-ADDR", "FORWARDED", "PROXY-AUTHORIZATION", "X-CSRF-TOKEN", "X-CSRFTOKEN", "X-XSRF-TOKEN");

    /* renamed from: b, reason: collision with root package name */
    public static final l0 f17155b;

    /* renamed from: c, reason: collision with root package name */
    public static final l0 f17156c;

    static {
        Arrays.asList("JSESSIONID", "JSESSIONIDSSO", "JSSOSESSIONID", "SESSIONID", "SID", "CSRFTOKEN", "XSRF-TOKEN");
        f17155b = new l0(400, 499);
        f17156c = new l0(500, 599);
    }
}
