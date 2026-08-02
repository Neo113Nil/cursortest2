package org.spongycastle.jce.provider;

import hj.C4512b;
import hj.InterfaceC4511a;
import java.security.Permission;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* loaded from: classes5.dex */
public class b implements InterfaceC4511a {

    /* renamed from: e, reason: collision with root package name */
    public static Permission f62714e = new C4512b("SC", ConfigurableProvider.THREAD_LOCAL_EC_IMPLICITLY_CA);

    /* renamed from: f, reason: collision with root package name */
    public static Permission f62715f = new C4512b("SC", ConfigurableProvider.EC_IMPLICITLY_CA);

    /* renamed from: g, reason: collision with root package name */
    public static Permission f62716g = new C4512b("SC", ConfigurableProvider.THREAD_LOCAL_DH_DEFAULT_PARAMS);

    /* renamed from: h, reason: collision with root package name */
    public static Permission f62717h = new C4512b("SC", ConfigurableProvider.DH_DEFAULT_PARAMS);

    /* renamed from: i, reason: collision with root package name */
    public static Permission f62718i = new C4512b("SC", ConfigurableProvider.ACCEPTABLE_EC_CURVES);

    /* renamed from: j, reason: collision with root package name */
    public static Permission f62719j = new C4512b("SC", ConfigurableProvider.ADDITIONAL_EC_PARAMETERS);

    /* renamed from: a, reason: collision with root package name */
    public ThreadLocal f62720a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public ThreadLocal f62721b = new ThreadLocal();

    /* renamed from: c, reason: collision with root package name */
    public volatile Set f62722c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    public volatile Map f62723d = new HashMap();
}
