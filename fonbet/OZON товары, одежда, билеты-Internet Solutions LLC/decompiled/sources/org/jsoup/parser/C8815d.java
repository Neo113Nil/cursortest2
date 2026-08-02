package org.jsoup.parser;

import org.jsoup.parser.C8817f;

/* renamed from: org.jsoup.parser.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class C8815d implements C8817f.a {
    @Override // org.jsoup.parser.C8817f.a
    public final boolean a(char c11) {
        return (c11 == '\t' || c11 == '\n' || c11 == '\f' || c11 == '\r' || c11 == ' ' || c11 == '/' || c11 == '>') ? false : true;
    }
}
