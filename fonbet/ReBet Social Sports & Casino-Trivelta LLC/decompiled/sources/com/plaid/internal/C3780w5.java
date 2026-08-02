package com.plaid.internal;

import com.google.gson.Gson;
import com.plaid.internal.classic.networking.adapter.AccountSubtypeAdapter;
import com.plaid.internal.classic.networking.adapter.AccountTypeAdapter;
import com.plaid.internal.classic.networking.adapter.LinkAccountVerificationStatusAdapter;
import com.plaid.internal.classic.networking.adapter.LinkEventNameAdapter;
import com.plaid.internal.classic.networking.adapter.LinkEventViewNameAdapter;
import com.plaid.internal.classic.networking.adapter.LinkExitMetadataStatusAdapter;
import com.plaid.internal.classic.networking.adapter.PlaidErrorCodeAdapter;
import com.plaid.internal.classic.networking.adapter.PlaidErrorTypeAdapter;
import com.plaid.link.event.LinkEventName;
import com.plaid.link.event.LinkEventViewName;
import com.plaid.link.result.LinkAccountSubtype;
import com.plaid.link.result.LinkAccountType;
import com.plaid.link.result.LinkAccountVerificationStatus;
import com.plaid.link.result.LinkErrorCode;
import com.plaid.link.result.LinkErrorType;
import com.plaid.link.result.LinkExitMetadataStatus;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.w5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3780w5 implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final C3727q5 f41170a;

    public C3780w5(C3727q5 c3727q5) {
        this.f41170a = c3727q5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f41170a.getClass();
        com.google.gson.d dVar = new com.google.gson.d();
        dVar.f(LinkEventViewName.class, new LinkEventViewNameAdapter());
        dVar.f(LinkEventName.class, new LinkEventNameAdapter());
        dVar.f(LinkAccountType.class, new AccountTypeAdapter());
        dVar.f(LinkAccountSubtype.class, new AccountSubtypeAdapter());
        dVar.f(LinkErrorCode.class, new PlaidErrorCodeAdapter());
        dVar.f(LinkErrorType.class, new PlaidErrorTypeAdapter());
        dVar.f(LinkAccountVerificationStatus.class, new LinkAccountVerificationStatusAdapter());
        dVar.f(LinkExitMetadataStatus.class, new LinkExitMetadataStatusAdapter());
        Gson b10 = dVar.b();
        Intrinsics.checkNotNullExpressionValue(b10, "create(...)");
        return (Gson) Gg.d.d(b10);
    }
}
