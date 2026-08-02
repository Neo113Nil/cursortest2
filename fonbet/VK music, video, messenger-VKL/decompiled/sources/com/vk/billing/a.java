package com.vk.billing;

import com.android.billingclient.api.Purchase;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import kotlin.Pair;
import xsna.pn00;

/* compiled from: BaseBillingManager.kt */
/* loaded from: classes.dex */
public abstract class a {
    public WeakReference<InterfaceC0423a> b = null;
    public final LinkedHashMap c = pn00.m(new Pair("inapp", null), new Pair("subs", null));

    /* compiled from: BaseBillingManager.kt */
    /* renamed from: com.vk.billing.a$a, reason: collision with other inner class name */
    /* loaded from: classes15.dex */
    public interface InterfaceC0423a {
        void b();

        void c(int i);

        void d(Purchase purchase);

        void e(Purchase purchase);

        void f();
    }
}
