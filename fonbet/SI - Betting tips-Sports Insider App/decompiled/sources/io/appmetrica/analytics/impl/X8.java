package io.appmetrica.analytics.impl;

import java.util.HashMap;
import java.util.LinkedList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class X8 extends Ff {

    /* renamed from: a, reason: collision with root package name */
    public final C0460ri f13177a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f13178b;

    /* renamed from: c, reason: collision with root package name */
    public final C0422q4 f13179c;

    public X8(X4 x42) {
        C0460ri c0460ri = new C0460ri(x42);
        this.f13177a = c0460ri;
        this.f13179c = new C0422q4(c0460ri);
        this.f13178b = a();
    }

    public final HashMap a() {
        HashMap hashMap = new HashMap();
        hashMap.put(EnumC0047bb.EVENT_TYPE_ACTIVATION, new C0190h(this.f13177a));
        hashMap.put(EnumC0047bb.EVENT_TYPE_START, new El(this.f13177a));
        hashMap.put(EnumC0047bb.EVENT_TYPE_REGULAR, new Gg(this.f13177a));
        C0228ib c0228ib = new C0228ib(this.f13177a);
        hashMap.put(EnumC0047bb.EVENT_TYPE_EXCEPTION_USER_PROTOBUF, c0228ib);
        hashMap.put(EnumC0047bb.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF, c0228ib);
        hashMap.put(EnumC0047bb.EVENT_TYPE_SEND_REFERRER, c0228ib);
        hashMap.put(EnumC0047bb.EVENT_TYPE_CUSTOM_EVENT, c0228ib);
        EnumC0047bb enumC0047bb = EnumC0047bb.EVENT_TYPE_SET_SESSION_EXTRA;
        C0460ri c0460ri = this.f13177a;
        hashMap.put(enumC0047bb, new C0663zl(c0460ri, c0460ri.f14576t));
        hashMap.put(EnumC0047bb.EVENT_TYPE_APP_OPEN, new Ng(this.f13177a));
        hashMap.put(EnumC0047bb.EVENT_TYPE_PURGE_BUFFER, new Rf(this.f13177a));
        hashMap.put(EnumC0047bb.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, new C0473s6(this.f13177a));
        hashMap.put(EnumC0047bb.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF, new C0557vf(this.f13177a));
        hashMap.put(EnumC0047bb.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE, new Vn(this.f13177a));
        hashMap.put(EnumC0047bb.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE, new C0582wf(this.f13177a));
        hashMap.put(EnumC0047bb.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF, new Un(this.f13177a));
        hashMap.put(EnumC0047bb.EVENT_TYPE_ANR, c0228ib);
        EnumC0047bb enumC0047bb2 = EnumC0047bb.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        C0460ri c0460ri2 = this.f13177a;
        hashMap.put(enumC0047bb2, new C0663zl(c0460ri2, c0460ri2.f14563e));
        EnumC0047bb enumC0047bb3 = EnumC0047bb.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        C0460ri c0460ri3 = this.f13177a;
        hashMap.put(enumC0047bb3, new C0663zl(c0460ri3, c0460ri3.f14564f));
        hashMap.put(EnumC0047bb.EVENT_TYPE_SEND_USER_PROFILE, c0228ib);
        EnumC0047bb enumC0047bb4 = EnumC0047bb.EVENT_TYPE_SET_USER_PROFILE_ID;
        C0460ri c0460ri4 = this.f13177a;
        hashMap.put(enumC0047bb4, new C0663zl(c0460ri4, c0460ri4.f14568k));
        hashMap.put(EnumC0047bb.EVENT_TYPE_SEND_REVENUE_EVENT, c0228ib);
        hashMap.put(EnumC0047bb.EVENT_TYPE_SEND_AD_REVENUE_EVENT, c0228ib);
        hashMap.put(EnumC0047bb.EVENT_TYPE_CLEANUP, c0228ib);
        hashMap.put(EnumC0047bb.EVENT_TYPE_SEND_ECOMMERCE_EVENT, c0228ib);
        hashMap.put(EnumC0047bb.EVENT_TYPE_WEBVIEW_SYNC, c0228ib);
        hashMap.put(EnumC0047bb.EVENT_CLIENT_EXTERNAL_ATTRIBUTION, new E9(this.f13177a));
        return hashMap;
    }

    public final C0460ri b() {
        return this.f13177a;
    }

    public final void a(EnumC0047bb enumC0047bb, AbstractC0378oa abstractC0378oa) {
        this.f13178b.put(enumC0047bb, abstractC0378oa);
    }

    @Override // io.appmetrica.analytics.impl.Ff
    public final W8 a(int i5) {
        LinkedList linkedList = new LinkedList();
        EnumC0047bb a7 = EnumC0047bb.a(i5);
        C0422q4 c0422q4 = this.f13179c;
        if (c0422q4 != null) {
            c0422q4.a(a7, linkedList);
        }
        AbstractC0378oa abstractC0378oa = (AbstractC0378oa) this.f13178b.get(a7);
        if (abstractC0378oa != null) {
            abstractC0378oa.a(linkedList);
        }
        return new V8(linkedList);
    }

    public final AbstractC0378oa a(EnumC0047bb enumC0047bb) {
        return (AbstractC0378oa) this.f13178b.get(enumC0047bb);
    }
}
