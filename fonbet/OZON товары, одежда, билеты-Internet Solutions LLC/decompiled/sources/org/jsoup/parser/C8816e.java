package org.jsoup.parser;

import org.jsoup.parser.C8817f;

/* renamed from: org.jsoup.parser.e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class C8816e implements C8817f.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f79477a;

    public /* synthetic */ C8816e(boolean z11) {
        this.f79477a = z11;
    }

    @Override // org.jsoup.parser.C8817f.a
    public final boolean a(char c11) {
        if (c11 == 0 || c11 == '&') {
            return false;
        }
        return this.f79477a ? c11 != '\'' : c11 != '\"';
    }
}
