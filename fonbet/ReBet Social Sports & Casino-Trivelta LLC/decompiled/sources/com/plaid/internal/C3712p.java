package com.plaid.internal;

import java.util.LinkedList;

/* renamed from: com.plaid.internal.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3712p {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f40924a;

    /* renamed from: b, reason: collision with root package name */
    public volatile EnumC3684l7 f40925b;

    /* renamed from: d, reason: collision with root package name */
    public volatile String f40927d;

    /* renamed from: e, reason: collision with root package name */
    public String f40928e;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedList f40926c = new LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public C3615e1 f40929f = C3615e1.f40575c;

    /* renamed from: com.plaid.internal.p$a */
    public static class a implements InterfaceC3738s {

        /* renamed from: a, reason: collision with root package name */
        public final String f40930a;

        /* renamed from: b, reason: collision with root package name */
        public int f40931b;

        public a(String str) {
            this.f40930a = str;
        }

        @Override // com.plaid.internal.InterfaceC3738s
        public final int a() {
            return this.f40931b;
        }

        @Override // com.plaid.internal.InterfaceC3738s
        public final String b() {
            return this.f40930a;
        }
    }
}
