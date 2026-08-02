package org.jsoup.parser;

import Pf.f;
import org.jsoup.parser.C;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
abstract class I {
    private static final /* synthetic */ I[] $VALUES;
    public static final I AfterAttributeName;
    public static final I AfterAttributeValue_quoted;
    public static final I AfterDoctypeName;
    public static final I AfterDoctypePublicIdentifier;
    public static final I AfterDoctypePublicKeyword;
    public static final I AfterDoctypeSystemIdentifier;
    public static final I AfterDoctypeSystemKeyword;
    public static final I AttributeName;
    public static final I AttributeValue_doubleQuoted;
    public static final I AttributeValue_singleQuoted;
    public static final I AttributeValue_unquoted;
    public static final I BeforeAttributeName;
    public static final I BeforeAttributeValue;
    public static final I BeforeDoctypeName;
    public static final I BeforeDoctypePublicIdentifier;
    public static final I BeforeDoctypeSystemIdentifier;
    public static final I BetweenDoctypePublicAndSystemIdentifiers;
    public static final I BogusComment;
    public static final I BogusDoctype;
    public static final I CdataSection;
    public static final I CharacterReferenceInData;
    public static final I CharacterReferenceInRcdata;
    public static final I Comment;
    public static final I CommentEnd;
    public static final I CommentEndBang;
    public static final I CommentEndDash;
    public static final I CommentStart;
    public static final I CommentStartDash;
    public static final I Data;
    public static final I Doctype;
    public static final I DoctypeName;
    public static final I DoctypePublicIdentifier_doubleQuoted;
    public static final I DoctypePublicIdentifier_singleQuoted;
    public static final I DoctypeSystemIdentifier_doubleQuoted;
    public static final I DoctypeSystemIdentifier_singleQuoted;
    public static final I EndTagOpen;
    public static final I MarkupDeclarationOpen;
    public static final I MarkupProcessingOpen;
    public static final I PLAINTEXT;
    public static final I RCDATAEndTagName;
    public static final I RCDATAEndTagOpen;
    public static final I Rawtext;
    public static final I RawtextEndTagName;
    public static final I RawtextEndTagOpen;
    public static final I RawtextLessthanSign;
    public static final I Rcdata;
    public static final I RcdataLessthanSign;
    public static final I ScriptData;
    public static final I ScriptDataDoubleEscapeEnd;
    public static final I ScriptDataDoubleEscapeStart;
    public static final I ScriptDataDoubleEscaped;
    public static final I ScriptDataDoubleEscapedDash;
    public static final I ScriptDataDoubleEscapedDashDash;
    public static final I ScriptDataDoubleEscapedLessthanSign;
    public static final I ScriptDataEndTagName;
    public static final I ScriptDataEndTagOpen;
    public static final I ScriptDataEscapeStart;
    public static final I ScriptDataEscapeStartDash;
    public static final I ScriptDataEscaped;
    public static final I ScriptDataEscapedDash;
    public static final I ScriptDataEscapedDashDash;
    public static final I ScriptDataEscapedEndTagName;
    public static final I ScriptDataEscapedEndTagOpen;
    public static final I ScriptDataEscapedLessthanSign;
    public static final I ScriptDataLessthanSign;
    public static final I SelfClosingStartTag;
    public static final I TagName;
    public static final I TagOpen;
    static final char[] attributeNameCharsSorted;
    static final char[] attributeValueUnquoted;
    private static final char eof = 65535;
    static final char nullChar = 0;
    private static final char replacementChar = 65533;
    private static final String replacementStr;

    static {
        I i11 = new I() { // from class: org.jsoup.parser.I.k
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                char L11 = c8817f.L();
                if (L11 == 0) {
                    h11.p(this);
                    h11.h(c8817f.m());
                } else {
                    if (L11 == '&') {
                        h11.a(I.CharacterReferenceInData);
                        return;
                    }
                    if (L11 == '<') {
                        h11.a(I.TagOpen);
                    } else if (L11 != 65535) {
                        h11.i(c8817f.o());
                    } else {
                        h11.j(new C.e());
                    }
                }
            }
        };
        Data = i11;
        I i12 = new I() { // from class: org.jsoup.parser.I.v
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                I i13 = I.Data;
                int[] e11 = h11.e(null, false);
                if (e11 == null) {
                    h11.h('&');
                } else {
                    h11.i(new String(e11, 0, e11.length));
                }
                h11.s(i13);
            }
        };
        CharacterReferenceInData = i12;
        I i13 = new I() { // from class: org.jsoup.parser.I.G
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                char L11 = c8817f.L();
                if (L11 == 0) {
                    h11.p(this);
                    c8817f.c();
                    h11.h(I.replacementChar);
                } else {
                    if (L11 == '&') {
                        h11.a(I.CharacterReferenceInRcdata);
                        return;
                    }
                    if (L11 == '<') {
                        h11.a(I.RcdataLessthanSign);
                    } else if (L11 != 65535) {
                        h11.i(c8817f.o());
                    } else {
                        h11.j(new C.e());
                    }
                }
            }
        };
        Rcdata = i13;
        I i14 = new I() { // from class: org.jsoup.parser.I.R
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                I i15 = I.Rcdata;
                int[] e11 = h11.e(null, false);
                if (e11 == null) {
                    h11.h('&');
                } else {
                    h11.i(new String(e11, 0, e11.length));
                }
                h11.s(i15);
            }
        };
        CharacterReferenceInRcdata = i14;
        I i15 = new I() { // from class: org.jsoup.parser.I.c0
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                I.a(h11, c8817f, this, I.RawtextLessthanSign);
            }
        };
        Rawtext = i15;
        I i16 = new I() { // from class: org.jsoup.parser.I.m0
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                I.a(h11, c8817f, this, I.ScriptDataLessthanSign);
            }
        };
        ScriptData = i16;
        I i17 = new I() { // from class: org.jsoup.parser.I.n0
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                char L11 = c8817f.L();
                if (L11 == 0) {
                    h11.p(this);
                    c8817f.c();
                    h11.h(I.replacementChar);
                } else if (L11 != 65535) {
                    h11.i(c8817f.x(I.nullChar));
                } else {
                    h11.j(new C.e());
                }
            }
        };
        PLAINTEXT = i17;
        I i18 = new I() { // from class: org.jsoup.parser.I.o0
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                char L11 = c8817f.L();
                if (L11 == '!') {
                    h11.a(I.MarkupDeclarationOpen);
                    return;
                }
                if (L11 == '/') {
                    h11.a(I.EndTagOpen);
                    return;
                }
                if (L11 == '?') {
                    if (h11.f79450g == f.a.EnumC0445a.xml) {
                        h11.a(I.MarkupProcessingOpen);
                        return;
                    } else {
                        h11.f79456m.f();
                        h11.s(I.BogusComment);
                        return;
                    }
                }
                if (c8817f.o0()) {
                    h11.f(true);
                    h11.s(I.TagName);
                } else {
                    h11.p(this);
                    h11.h('<');
                    h11.s(I.Data);
                }
            }
        };
        TagOpen = i18;
        I i19 = new I() { // from class: org.jsoup.parser.I.p0
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                if (c8817f.O()) {
                    h11.n(this);
                    h11.i("</");
                    h11.s(I.Data);
                } else if (c8817f.o0()) {
                    h11.f(false);
                    h11.s(I.TagName);
                } else {
                    if (c8817f.b0('>')) {
                        h11.p(this);
                        h11.a(I.Data);
                        return;
                    }
                    h11.p(this);
                    C.c cVar = h11.f79456m;
                    cVar.f();
                    cVar.g('/');
                    h11.s(I.BogusComment);
                }
            }
        };
        EndTagOpen = i19;
        I i21 = new I() { // from class: org.jsoup.parser.I.a
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                h11.f79453j.l(c8817f.t(new C8815d(), -1));
                char m11 = c8817f.m();
                if (m11 == 0) {
                    h11.f79453j.l(I.replacementStr);
                    return;
                }
                if (m11 != ' ') {
                    if (m11 == '/') {
                        h11.s(I.SelfClosingStartTag);
                        return;
                    }
                    if (m11 == '>') {
                        h11.m();
                        h11.s(I.Data);
                        return;
                    }
                    if (m11 == 65535) {
                        h11.n(this);
                        h11.s(I.Data);
                        return;
                    } else if (m11 != '\t' && m11 != '\n' && m11 != '\f' && m11 != '\r') {
                        C.h hVar = h11.f79453j;
                        hVar.getClass();
                        hVar.l(String.valueOf(m11));
                        return;
                    }
                }
                h11.s(I.BeforeAttributeName);
            }
        };
        TagName = i21;
        I i22 = new I() { // from class: org.jsoup.parser.I.b
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                if (c8817f.b0('/')) {
                    h11.g();
                    h11.a(I.RCDATAEndTagOpen);
                    return;
                }
                if (!c8817f.H0() || !c8817f.o0() || h11.b() == null || c8817f.I(h11.c())) {
                    h11.h('<');
                    h11.s(I.Rcdata);
                    return;
                }
                C.h f7 = h11.f(false);
                f7.o(h11.b());
                h11.f79453j = f7;
                h11.m();
                h11.s(I.TagOpen);
            }
        };
        RcdataLessthanSign = i22;
        I i23 = new I() { // from class: org.jsoup.parser.I.c
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                if (!c8817f.o0()) {
                    h11.i("</");
                    h11.s(I.Rcdata);
                    return;
                }
                h11.f(false);
                C.h hVar = h11.f79453j;
                char L11 = c8817f.L();
                hVar.getClass();
                hVar.l(String.valueOf(L11));
                h11.f79449f.a(c8817f.L());
                h11.a(I.RCDATAEndTagName);
            }
        };
        RCDATAEndTagOpen = i23;
        I i24 = new I() { // from class: org.jsoup.parser.I.d
            private static void g(org.jsoup.parser.H h11, C8817f c8817f) {
                h11.i("</");
                h11.i(h11.f79449f.g());
                c8817f.T0();
                h11.s(I.Rcdata);
            }

            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                if (c8817f.o0()) {
                    String t2 = c8817f.t(new C8815d(), -1);
                    h11.f79453j.l(t2);
                    h11.f79449f.b(t2);
                    return;
                }
                char m11 = c8817f.m();
                if (m11 == '\t' || m11 == '\n' || m11 == '\f' || m11 == '\r' || m11 == ' ') {
                    if (h11.q()) {
                        h11.s(I.BeforeAttributeName);
                        return;
                    } else {
                        g(h11, c8817f);
                        return;
                    }
                }
                if (m11 == '/') {
                    if (h11.q()) {
                        h11.s(I.SelfClosingStartTag);
                        return;
                    } else {
                        g(h11, c8817f);
                        return;
                    }
                }
                if (m11 != '>') {
                    g(h11, c8817f);
                } else if (!h11.q()) {
                    g(h11, c8817f);
                } else {
                    h11.m();
                    h11.s(I.Data);
                }
            }
        };
        RCDATAEndTagName = i24;
        I i25 = new I() { // from class: org.jsoup.parser.I.e
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                if (c8817f.b0('/')) {
                    h11.g();
                    h11.a(I.RawtextEndTagOpen);
                } else {
                    h11.h('<');
                    h11.s(I.Rawtext);
                }
            }
        };
        RawtextLessthanSign = i25;
        I i26 = new I() { // from class: org.jsoup.parser.I.f
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                I i27 = I.RawtextEndTagName;
                I i28 = I.Rawtext;
                if (c8817f.o0()) {
                    h11.f(false);
                    h11.s(i27);
                } else {
                    h11.i("</");
                    h11.s(i28);
                }
            }
        };
        RawtextEndTagOpen = i26;
        I i27 = new I() { // from class: org.jsoup.parser.I.g
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                I.d(h11, c8817f, I.Rawtext);
            }
        };
        RawtextEndTagName = i27;
        I i28 = new I() { // from class: org.jsoup.parser.I.h
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                char m11 = c8817f.m();
                if (m11 == '!') {
                    h11.i("<!");
                    h11.s(I.ScriptDataEscapeStart);
                    return;
                }
                if (m11 == '/') {
                    h11.g();
                    h11.s(I.ScriptDataEndTagOpen);
                } else if (m11 != 65535) {
                    h11.h('<');
                    c8817f.T0();
                    h11.s(I.ScriptData);
                } else {
                    h11.h('<');
                    h11.n(this);
                    h11.s(I.Data);
                }
            }
        };
        ScriptDataLessthanSign = i28;
        I i29 = new I() { // from class: org.jsoup.parser.I.i
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                I i31 = I.ScriptDataEndTagName;
                I i32 = I.ScriptData;
                if (c8817f.o0()) {
                    h11.f(false);
                    h11.s(i31);
                } else {
                    h11.i("</");
                    h11.s(i32);
                }
            }
        };
        ScriptDataEndTagOpen = i29;
        I i31 = new I() { // from class: org.jsoup.parser.I.j
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                I.d(h11, c8817f, I.ScriptData);
            }
        };
        ScriptDataEndTagName = i31;
        I i32 = new I() { // from class: org.jsoup.parser.I.l
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                if (!c8817f.b0('-')) {
                    h11.s(I.ScriptData);
                } else {
                    h11.h('-');
                    h11.a(I.ScriptDataEscapeStartDash);
                }
            }
        };
        ScriptDataEscapeStart = i32;
        I i33 = new I() { // from class: org.jsoup.parser.I.m
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                if (!c8817f.b0('-')) {
                    h11.s(I.ScriptData);
                } else {
                    h11.h('-');
                    h11.a(I.ScriptDataEscapedDashDash);
                }
            }
        };
        ScriptDataEscapeStartDash = i33;
        I i34 = new I() { // from class: org.jsoup.parser.I.n
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                if (c8817f.O()) {
                    h11.n(this);
                    h11.s(I.Data);
                    return;
                }
                char L11 = c8817f.L();
                if (L11 == 0) {
                    h11.p(this);
                    c8817f.c();
                    h11.h(I.replacementChar);
                } else if (L11 == '-') {
                    h11.h('-');
                    h11.a(I.ScriptDataEscapedDash);
                } else if (L11 != '<') {
                    h11.i(c8817f.y('-', '<', I.nullChar));
                } else {
                    h11.a(I.ScriptDataEscapedLessthanSign);
                }
            }
        };
        ScriptDataEscaped = i34;
        I i35 = new I() { // from class: org.jsoup.parser.I.o
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                if (c8817f.O()) {
                    h11.n(this);
                    h11.s(I.Data);
                    return;
                }
                char m11 = c8817f.m();
                if (m11 == 0) {
                    h11.p(this);
                    h11.h(I.replacementChar);
                    h11.s(I.ScriptDataEscaped);
                } else if (m11 == '-') {
                    h11.h(m11);
                    h11.s(I.ScriptDataEscapedDashDash);
                } else if (m11 == '<') {
                    h11.s(I.ScriptDataEscapedLessthanSign);
                } else {
                    h11.h(m11);
                    h11.s(I.ScriptDataEscaped);
                }
            }
        };
        ScriptDataEscapedDash = i35;
        I i36 = new I() { // from class: org.jsoup.parser.I.p
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                if (c8817f.O()) {
                    h11.n(this);
                    h11.s(I.Data);
                    return;
                }
                char m11 = c8817f.m();
                if (m11 == 0) {
                    h11.p(this);
                    h11.h(I.replacementChar);
                    h11.s(I.ScriptDataEscaped);
                } else {
                    if (m11 == '-') {
                        h11.h(m11);
                        return;
                    }
                    if (m11 == '<') {
                        h11.s(I.ScriptDataEscapedLessthanSign);
                    } else if (m11 != '>') {
                        h11.h(m11);
                        h11.s(I.ScriptDataEscaped);
                    } else {
                        h11.h(m11);
                        h11.s(I.ScriptData);
                    }
                }
            }
        };
        ScriptDataEscapedDashDash = i36;
        I i37 = new I() { // from class: org.jsoup.parser.I.q
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                if (c8817f.o0()) {
                    h11.g();
                    h11.f79449f.a(c8817f.L());
                    h11.h('<');
                    h11.h(c8817f.L());
                    h11.a(I.ScriptDataDoubleEscapeStart);
                    return;
                }
                if (c8817f.b0('/')) {
                    h11.g();
                    h11.a(I.ScriptDataEscapedEndTagOpen);
                } else {
                    h11.h('<');
                    h11.s(I.ScriptDataEscaped);
                }
            }
        };
        ScriptDataEscapedLessthanSign = i37;
        I i38 = new I() { // from class: org.jsoup.parser.I.r
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                if (!c8817f.o0()) {
                    h11.i("</");
                    h11.s(I.ScriptDataEscaped);
                    return;
                }
                h11.f(false);
                C.h hVar = h11.f79453j;
                char L11 = c8817f.L();
                hVar.getClass();
                hVar.l(String.valueOf(L11));
                h11.f79449f.a(c8817f.L());
                h11.a(I.ScriptDataEscapedEndTagName);
            }
        };
        ScriptDataEscapedEndTagOpen = i38;
        I i39 = new I() { // from class: org.jsoup.parser.I.s
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                I.d(h11, c8817f, I.ScriptDataEscaped);
            }
        };
        ScriptDataEscapedEndTagName = i39;
        I i41 = new I() { // from class: org.jsoup.parser.I.t
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                I.e(h11, c8817f, I.ScriptDataDoubleEscaped, I.ScriptDataEscaped);
            }
        };
        ScriptDataDoubleEscapeStart = i41;
        I i42 = new I() { // from class: org.jsoup.parser.I.u
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                char L11 = c8817f.L();
                if (L11 == 0) {
                    h11.p(this);
                    c8817f.c();
                    h11.h(I.replacementChar);
                } else if (L11 == '-') {
                    h11.h(L11);
                    h11.a(I.ScriptDataDoubleEscapedDash);
                } else if (L11 == '<') {
                    h11.h(L11);
                    h11.a(I.ScriptDataDoubleEscapedLessthanSign);
                } else if (L11 != 65535) {
                    h11.i(c8817f.y('-', '<', I.nullChar));
                } else {
                    h11.n(this);
                    h11.s(I.Data);
                }
            }
        };
        ScriptDataDoubleEscaped = i42;
        I i43 = new I() { // from class: org.jsoup.parser.I.w
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                char m11 = c8817f.m();
                if (m11 == 0) {
                    h11.p(this);
                    h11.h(I.replacementChar);
                    h11.s(I.ScriptDataDoubleEscaped);
                } else if (m11 == '-') {
                    h11.h(m11);
                    h11.s(I.ScriptDataDoubleEscapedDashDash);
                } else if (m11 == '<') {
                    h11.h(m11);
                    h11.s(I.ScriptDataDoubleEscapedLessthanSign);
                } else if (m11 != 65535) {
                    h11.h(m11);
                    h11.s(I.ScriptDataDoubleEscaped);
                } else {
                    h11.n(this);
                    h11.s(I.Data);
                }
            }
        };
        ScriptDataDoubleEscapedDash = i43;
        I i44 = new I() { // from class: org.jsoup.parser.I.x
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                char m11 = c8817f.m();
                if (m11 == 0) {
                    h11.p(this);
                    h11.h(I.replacementChar);
                    h11.s(I.ScriptDataDoubleEscaped);
                    return;
                }
                if (m11 == '-') {
                    h11.h(m11);
                    return;
                }
                if (m11 == '<') {
                    h11.h(m11);
                    h11.s(I.ScriptDataDoubleEscapedLessthanSign);
                } else if (m11 == '>') {
                    h11.h(m11);
                    h11.s(I.ScriptData);
                } else if (m11 != 65535) {
                    h11.h(m11);
                    h11.s(I.ScriptDataDoubleEscaped);
                } else {
                    h11.n(this);
                    h11.s(I.Data);
                }
            }
        };
        ScriptDataDoubleEscapedDashDash = i44;
        I i45 = new I() { // from class: org.jsoup.parser.I.y
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                if (!c8817f.b0('/')) {
                    h11.s(I.ScriptDataDoubleEscaped);
                    return;
                }
                h11.h('/');
                h11.g();
                h11.a(I.ScriptDataDoubleEscapeEnd);
            }
        };
        ScriptDataDoubleEscapedLessthanSign = i45;
        I i46 = new I() { // from class: org.jsoup.parser.I.z
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                I.e(h11, c8817f, I.ScriptDataEscaped, I.ScriptDataDoubleEscaped);
            }
        };
        ScriptDataDoubleEscapeEnd = i46;
        I i47 = new I() { // from class: org.jsoup.parser.I.A
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                char m11 = c8817f.m();
                if (m11 == 0) {
                    c8817f.T0();
                    h11.p(this);
                    h11.f79453j.p();
                    h11.s(I.AttributeName);
                    return;
                }
                if (m11 != ' ') {
                    if (m11 != '\"' && m11 != '\'') {
                        if (m11 == '/') {
                            h11.s(I.SelfClosingStartTag);
                            return;
                        }
                        if (m11 == 65535) {
                            h11.n(this);
                            h11.s(I.Data);
                            return;
                        }
                        if (m11 == '\t' || m11 == '\n' || m11 == '\f' || m11 == '\r') {
                            return;
                        }
                        switch (m11) {
                            case '>':
                                h11.m();
                                h11.s(I.Data);
                                return;
                            case '?':
                                if (h11.f79453j instanceof C.j) {
                                    return;
                                }
                                break;
                        }
                        h11.f79453j.p();
                        c8817f.T0();
                        h11.s(I.AttributeName);
                        return;
                    }
                    h11.p(this);
                    h11.f79453j.p();
                    h11.f79453j.g(c8817f.D0() - 1, m11, c8817f.D0());
                    h11.s(I.AttributeName);
                }
            }
        };
        BeforeAttributeName = i47;
        I i48 = new I() { // from class: org.jsoup.parser.I.B
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                h11.f79453j.h(c8817f.D0(), c8817f.D0(), c8817f.z(I.attributeNameCharsSorted));
                int D02 = c8817f.D0();
                char m11 = c8817f.m();
                if (m11 == '\t' || m11 == '\n' || m11 == '\f' || m11 == '\r' || m11 == ' ') {
                    h11.s(I.AfterAttributeName);
                    return;
                }
                if (m11 != '\"' && m11 != '\'') {
                    if (m11 == '/') {
                        h11.s(I.SelfClosingStartTag);
                        return;
                    }
                    if (m11 == 65535) {
                        h11.n(this);
                        h11.s(I.Data);
                        return;
                    }
                    switch (m11) {
                        case '=':
                            h11.s(I.BeforeAttributeValue);
                            return;
                        case '>':
                            h11.m();
                            h11.s(I.Data);
                            return;
                        case '?':
                            if (h11.f79450g == f.a.EnumC0445a.xml && (h11.f79453j instanceof C.j)) {
                                h11.s(I.AfterAttributeName);
                                return;
                            }
                            break;
                    }
                    h11.f79453j.g(D02, m11, c8817f.D0());
                    return;
                }
                h11.p(this);
                h11.f79453j.g(D02, m11, c8817f.D0());
            }
        };
        AttributeName = i48;
        I i49 = new I() { // from class: org.jsoup.parser.I.C
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                char m11 = c8817f.m();
                if (m11 == 0) {
                    h11.p(this);
                    h11.f79453j.g(c8817f.D0() - 1, I.replacementChar, c8817f.D0());
                    h11.s(I.AttributeName);
                    return;
                }
                if (m11 != ' ') {
                    if (m11 != '\"' && m11 != '\'') {
                        if (m11 == '/') {
                            h11.s(I.SelfClosingStartTag);
                            return;
                        }
                        if (m11 == 65535) {
                            h11.n(this);
                            h11.s(I.Data);
                            return;
                        }
                        if (m11 == '\t' || m11 == '\n' || m11 == '\f' || m11 == '\r') {
                            return;
                        }
                        switch (m11) {
                            case '<':
                                break;
                            case '=':
                                h11.s(I.BeforeAttributeValue);
                                break;
                            case '>':
                                h11.m();
                                h11.s(I.Data);
                                break;
                            default:
                                h11.f79453j.p();
                                c8817f.T0();
                                h11.s(I.AttributeName);
                                break;
                        }
                        return;
                    }
                    h11.p(this);
                    h11.f79453j.p();
                    h11.f79453j.g(c8817f.D0() - 1, m11, c8817f.D0());
                    h11.s(I.AttributeName);
                }
            }
        };
        AfterAttributeName = i49;
        I i51 = new I() { // from class: org.jsoup.parser.I.D
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                char m11 = c8817f.m();
                if (m11 == 0) {
                    h11.p(this);
                    h11.f79453j.i(c8817f.D0() - 1, I.replacementChar, c8817f.D0());
                    h11.s(I.AttributeValue_unquoted);
                    return;
                }
                if (m11 != ' ') {
                    if (m11 == '\"') {
                        h11.s(I.AttributeValue_doubleQuoted);
                        return;
                    }
                    if (m11 != '`') {
                        if (m11 == 65535) {
                            h11.n(this);
                            h11.m();
                            h11.s(I.Data);
                            return;
                        }
                        if (m11 == '\t' || m11 == '\n' || m11 == '\f' || m11 == '\r') {
                            return;
                        }
                        if (m11 == '&') {
                            c8817f.T0();
                            h11.s(I.AttributeValue_unquoted);
                            return;
                        }
                        if (m11 == '\'') {
                            h11.s(I.AttributeValue_singleQuoted);
                            return;
                        }
                        switch (m11) {
                            case '<':
                            case '=':
                                break;
                            case '>':
                                h11.p(this);
                                h11.m();
                                h11.s(I.Data);
                                break;
                            default:
                                c8817f.T0();
                                h11.s(I.AttributeValue_unquoted);
                                break;
                        }
                        return;
                    }
                    h11.p(this);
                    h11.f79453j.i(c8817f.D0() - 1, m11, c8817f.D0());
                    h11.s(I.AttributeValue_unquoted);
                }
            }
        };
        BeforeAttributeValue = i51;
        I i52 = new I() { // from class: org.jsoup.parser.I.E
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                int D02 = c8817f.D0();
                String t2 = c8817f.t(new C8816e(false), -1);
                if (t2.length() > 0) {
                    h11.f79453j.j(D02, c8817f.D0(), t2);
                } else {
                    h11.f79453j.s();
                }
                int D03 = c8817f.D0();
                char m11 = c8817f.m();
                if (m11 == 0) {
                    h11.p(this);
                    h11.f79453j.i(D03, I.replacementChar, c8817f.D0());
                    return;
                }
                if (m11 == '\"') {
                    h11.s(I.AfterAttributeValue_quoted);
                    return;
                }
                if (m11 != '&') {
                    if (m11 != 65535) {
                        h11.f79453j.i(D03, m11, c8817f.D0());
                        return;
                    } else {
                        h11.n(this);
                        h11.s(I.Data);
                        return;
                    }
                }
                int[] e11 = h11.e('\"', true);
                if (e11 != null) {
                    h11.f79453j.k(D03, c8817f.D0(), e11);
                } else {
                    h11.f79453j.i(D03, '&', c8817f.D0());
                }
            }
        };
        AttributeValue_doubleQuoted = i52;
        I i53 = new I() { // from class: org.jsoup.parser.I.F
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                int D02 = c8817f.D0();
                String t2 = c8817f.t(new C8816e(true), -1);
                if (t2.length() > 0) {
                    h11.f79453j.j(D02, c8817f.D0(), t2);
                } else {
                    h11.f79453j.s();
                }
                int D03 = c8817f.D0();
                char m11 = c8817f.m();
                if (m11 == 0) {
                    h11.p(this);
                    h11.f79453j.i(D03, I.replacementChar, c8817f.D0());
                    return;
                }
                if (m11 == 65535) {
                    h11.n(this);
                    h11.s(I.Data);
                    return;
                }
                if (m11 != '&') {
                    if (m11 != '\'') {
                        h11.f79453j.i(D03, m11, c8817f.D0());
                        return;
                    } else {
                        h11.s(I.AfterAttributeValue_quoted);
                        return;
                    }
                }
                int[] e11 = h11.e('\'', true);
                if (e11 != null) {
                    h11.f79453j.k(D03, c8817f.D0(), e11);
                } else {
                    h11.f79453j.i(D03, '&', c8817f.D0());
                }
            }
        };
        AttributeValue_singleQuoted = i53;
        I i54 = new I() { // from class: org.jsoup.parser.I.H
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                int D02 = c8817f.D0();
                String z11 = c8817f.z(I.attributeValueUnquoted);
                if (z11.length() > 0) {
                    h11.f79453j.j(D02, c8817f.D0(), z11);
                }
                int D03 = c8817f.D0();
                char m11 = c8817f.m();
                if (m11 == 0) {
                    h11.p(this);
                    h11.f79453j.i(D03, I.replacementChar, c8817f.D0());
                    return;
                }
                if (m11 != ' ') {
                    if (m11 != '\"' && m11 != '`') {
                        if (m11 == 65535) {
                            h11.n(this);
                            h11.s(I.Data);
                            return;
                        }
                        if (m11 != '\t' && m11 != '\n' && m11 != '\f' && m11 != '\r') {
                            if (m11 == '&') {
                                int[] e11 = h11.e('>', true);
                                if (e11 != null) {
                                    h11.f79453j.k(D03, c8817f.D0(), e11);
                                    return;
                                } else {
                                    h11.f79453j.i(D03, '&', c8817f.D0());
                                    return;
                                }
                            }
                            if (m11 != '\'') {
                                switch (m11) {
                                    case '<':
                                    case '=':
                                        break;
                                    case '>':
                                        h11.m();
                                        h11.s(I.Data);
                                        break;
                                    default:
                                        h11.f79453j.i(D03, m11, c8817f.D0());
                                        break;
                                }
                                return;
                            }
                        }
                    }
                    h11.p(this);
                    h11.f79453j.i(D03, m11, c8817f.D0());
                    return;
                }
                h11.s(I.BeforeAttributeName);
            }
        };
        AttributeValue_unquoted = i54;
        I i55 = new I() { // from class: org.jsoup.parser.I.I
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                char m11 = c8817f.m();
                if (m11 == '\t' || m11 == '\n' || m11 == '\f' || m11 == '\r' || m11 == ' ') {
                    h11.s(I.BeforeAttributeName);
                    return;
                }
                if (m11 == '/') {
                    h11.s(I.SelfClosingStartTag);
                    return;
                }
                if (m11 == 65535) {
                    h11.n(this);
                    h11.s(I.Data);
                } else if (m11 == '>') {
                    h11.m();
                    h11.s(I.Data);
                } else {
                    if (m11 == '?' && (h11.f79453j instanceof C.j)) {
                        return;
                    }
                    c8817f.T0();
                    h11.p(this);
                    h11.s(I.BeforeAttributeName);
                }
            }
        };
        AfterAttributeValue_quoted = i55;
        I i56 = new I() { // from class: org.jsoup.parser.I.J
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                char m11 = c8817f.m();
                if (m11 == '>') {
                    h11.f79453j.f79426f = true;
                    h11.m();
                    h11.s(I.Data);
                } else if (m11 == 65535) {
                    h11.n(this);
                    h11.s(I.Data);
                } else {
                    c8817f.T0();
                    h11.p(this);
                    h11.s(I.BeforeAttributeName);
                }
            }
        };
        SelfClosingStartTag = i56;
        I i57 = new I() { // from class: org.jsoup.parser.I.K
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                h11.f79456m.h(c8817f.x('>'));
                char L11 = c8817f.L();
                if (L11 == '>' || L11 == 65535) {
                    c8817f.m();
                    h11.k();
                    h11.s(I.Data);
                }
            }
        };
        BogusComment = i57;
        I i58 = new I() { // from class: org.jsoup.parser.I.L
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                if (c8817f.X("--")) {
                    h11.f79456m.f();
                    h11.s(I.CommentStart);
                    return;
                }
                if (c8817f.Z("DOCTYPE")) {
                    h11.s(I.Doctype);
                    return;
                }
                if (c8817f.X("[CDATA[")) {
                    h11.g();
                    h11.s(I.CdataSection);
                    return;
                }
                if (h11.f79450g != f.a.EnumC0445a.xml || !c8817f.o0()) {
                    h11.p(this);
                    h11.f79456m.f();
                    h11.s(I.BogusComment);
                } else {
                    C.j jVar = h11.f79457n;
                    jVar.f();
                    jVar.f79437q = true;
                    h11.f79453j = jVar;
                    h11.s(I.TagName);
                }
            }
        };
        MarkupDeclarationOpen = i58;
        I i59 = new I() { // from class: org.jsoup.parser.I.M
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                if (c8817f.o0()) {
                    C.j jVar = h11.f79457n;
                    jVar.f();
                    jVar.f79437q = false;
                    h11.f79453j = jVar;
                    h11.s(I.TagName);
                    return;
                }
                h11.p(this);
                C.c cVar = h11.f79456m;
                cVar.f();
                cVar.g('?');
                h11.s(I.BogusComment);
            }
        };
        MarkupProcessingOpen = i59;
        I i61 = new I() { // from class: org.jsoup.parser.I.N
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                char m11 = c8817f.m();
                if (m11 == 0) {
                    h11.p(this);
                    h11.f79456m.g(I.replacementChar);
                    h11.s(I.Comment);
                    return;
                }
                if (m11 == '-') {
                    h11.s(I.CommentStartDash);
                    return;
                }
                if (m11 == '>') {
                    h11.p(this);
                    h11.k();
                    h11.s(I.Data);
                } else if (m11 != 65535) {
                    c8817f.T0();
                    h11.s(I.Comment);
                } else {
                    h11.n(this);
                    h11.k();
                    h11.s(I.Data);
                }
            }
        };
        CommentStart = i61;
        I i62 = new I() { // from class: org.jsoup.parser.I.O
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                char m11 = c8817f.m();
                if (m11 == 0) {
                    h11.p(this);
                    h11.f79456m.g(I.replacementChar);
                    h11.s(I.Comment);
                    return;
                }
                if (m11 == '-') {
                    h11.s(I.CommentEnd);
                    return;
                }
                if (m11 == '>') {
                    h11.p(this);
                    h11.k();
                    h11.s(I.Data);
                } else if (m11 != 65535) {
                    h11.f79456m.g(m11);
                    h11.s(I.Comment);
                } else {
                    h11.n(this);
                    h11.k();
                    h11.s(I.Data);
                }
            }
        };
        CommentStartDash = i62;
        I i63 = new I() { // from class: org.jsoup.parser.I.P
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                char L11 = c8817f.L();
                if (L11 == 0) {
                    h11.p(this);
                    c8817f.c();
                    h11.f79456m.g(I.replacementChar);
                } else if (L11 == '-') {
                    h11.a(I.CommentEndDash);
                } else {
                    if (L11 != 65535) {
                        h11.f79456m.h(c8817f.y('-', I.nullChar));
                        return;
                    }
                    h11.n(this);
                    h11.k();
                    h11.s(I.Data);
                }
            }
        };
        Comment = i63;
        I i64 = new I() { // from class: org.jsoup.parser.I.Q
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                char m11 = c8817f.m();
                if (m11 == 0) {
                    h11.p(this);
                    C.c cVar = h11.f79456m;
                    cVar.g('-');
                    cVar.g(I.replacementChar);
                    h11.s(I.Comment);
                    return;
                }
                if (m11 == '-') {
                    h11.s(I.CommentEnd);
                    return;
                }
                if (m11 == 65535) {
                    h11.n(this);
                    h11.k();
                    h11.s(I.Data);
                } else {
                    C.c cVar2 = h11.f79456m;
                    cVar2.g('-');
                    cVar2.g(m11);
                    h11.s(I.Comment);
                }
            }
        };
        CommentEndDash = i64;
        I i65 = new I() { // from class: org.jsoup.parser.I.S
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                char m11 = c8817f.m();
                if (m11 == 0) {
                    h11.p(this);
                    C.c cVar = h11.f79456m;
                    cVar.h("--");
                    cVar.g(I.replacementChar);
                    h11.s(I.Comment);
                    return;
                }
                if (m11 == '!') {
                    h11.s(I.CommentEndBang);
                    return;
                }
                if (m11 == '-') {
                    h11.f79456m.g('-');
                    return;
                }
                if (m11 == '>') {
                    h11.k();
                    h11.s(I.Data);
                } else if (m11 == 65535) {
                    h11.n(this);
                    h11.k();
                    h11.s(I.Data);
                } else {
                    C.c cVar2 = h11.f79456m;
                    cVar2.h("--");
                    cVar2.g(m11);
                    h11.s(I.Comment);
                }
            }
        };
        CommentEnd = i65;
        I i66 = new I() { // from class: org.jsoup.parser.I.T
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                char m11 = c8817f.m();
                if (m11 == 0) {
                    h11.p(this);
                    C.c cVar = h11.f79456m;
                    cVar.h("--!");
                    cVar.g(I.replacementChar);
                    h11.s(I.Comment);
                    return;
                }
                if (m11 == '-') {
                    h11.f79456m.h("--!");
                    h11.s(I.CommentEndDash);
                    return;
                }
                if (m11 == '>') {
                    h11.k();
                    h11.s(I.Data);
                } else if (m11 == 65535) {
                    h11.n(this);
                    h11.k();
                    h11.s(I.Data);
                } else {
                    C.c cVar2 = h11.f79456m;
                    cVar2.h("--!");
                    cVar2.g(m11);
                    h11.s(I.Comment);
                }
            }
        };
        CommentEndBang = i66;
        I i67 = new I() { // from class: org.jsoup.parser.I.U
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                char m11 = c8817f.m();
                if (m11 == '\t' || m11 == '\n' || m11 == '\f' || m11 == '\r' || m11 == ' ') {
                    h11.s(I.BeforeDoctypeName);
                    return;
                }
                if (m11 != '>') {
                    if (m11 != 65535) {
                        h11.p(this);
                        h11.s(I.BeforeDoctypeName);
                        return;
                    }
                    h11.n(this);
                }
                h11.p(this);
                C.d dVar = h11.f79455l;
                dVar.f();
                dVar.f79423h = true;
                h11.l();
                h11.s(I.Data);
            }
        };
        Doctype = i67;
        I i68 = new I() { // from class: org.jsoup.parser.I.V
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                if (c8817f.o0()) {
                    h11.f79455l.f();
                    h11.s(I.DoctypeName);
                    return;
                }
                char m11 = c8817f.m();
                if (m11 == 0) {
                    h11.p(this);
                    C.d dVar = h11.f79455l;
                    dVar.f();
                    dVar.f79419d.a(I.replacementChar);
                    h11.s(I.DoctypeName);
                    return;
                }
                if (m11 != ' ') {
                    if (m11 == 65535) {
                        h11.n(this);
                        C.d dVar2 = h11.f79455l;
                        dVar2.f();
                        dVar2.f79423h = true;
                        h11.l();
                        h11.s(I.Data);
                        return;
                    }
                    if (m11 == '\t' || m11 == '\n' || m11 == '\f' || m11 == '\r') {
                        return;
                    }
                    h11.f79455l.f();
                    h11.f79455l.f79419d.a(m11);
                    h11.s(I.DoctypeName);
                }
            }
        };
        BeforeDoctypeName = i68;
        I i69 = new I() { // from class: org.jsoup.parser.I.W
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                if (c8817f.o0()) {
                    h11.f79455l.f79419d.b(c8817f.r());
                    return;
                }
                char m11 = c8817f.m();
                if (m11 == 0) {
                    h11.p(this);
                    h11.f79455l.f79419d.a(I.replacementChar);
                    return;
                }
                if (m11 != ' ') {
                    if (m11 == '>') {
                        h11.l();
                        h11.s(I.Data);
                        return;
                    }
                    if (m11 == 65535) {
                        h11.n(this);
                        h11.f79455l.f79423h = true;
                        h11.l();
                        h11.s(I.Data);
                        return;
                    }
                    if (m11 != '\t' && m11 != '\n' && m11 != '\f' && m11 != '\r') {
                        h11.f79455l.f79419d.a(m11);
                        return;
                    }
                }
                h11.s(I.AfterDoctypeName);
            }
        };
        DoctypeName = i69;
        I i71 = new I() { // from class: org.jsoup.parser.I.X
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                if (c8817f.O()) {
                    h11.n(this);
                    h11.f79455l.f79423h = true;
                    h11.l();
                    h11.s(I.Data);
                    return;
                }
                if (c8817f.d0('\t', '\n', '\r', '\f', ' ')) {
                    c8817f.c();
                    return;
                }
                if (c8817f.b0('>')) {
                    h11.l();
                    h11.a(I.Data);
                    return;
                }
                if (c8817f.Z("PUBLIC")) {
                    h11.f79455l.f79420e = "PUBLIC";
                    h11.s(I.AfterDoctypePublicKeyword);
                } else if (c8817f.Z("SYSTEM")) {
                    h11.f79455l.f79420e = "SYSTEM";
                    h11.s(I.AfterDoctypeSystemKeyword);
                } else {
                    h11.p(this);
                    h11.f79455l.f79423h = true;
                    h11.a(I.BogusDoctype);
                }
            }
        };
        AfterDoctypeName = i71;
        I i72 = new I() { // from class: org.jsoup.parser.I.Y
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                char m11 = c8817f.m();
                if (m11 == '\t' || m11 == '\n' || m11 == '\f' || m11 == '\r' || m11 == ' ') {
                    h11.s(I.BeforeDoctypePublicIdentifier);
                    return;
                }
                if (m11 == '\"') {
                    h11.p(this);
                    h11.s(I.DoctypePublicIdentifier_doubleQuoted);
                    return;
                }
                if (m11 == '\'') {
                    h11.p(this);
                    h11.s(I.DoctypePublicIdentifier_singleQuoted);
                    return;
                }
                if (m11 == '>') {
                    h11.p(this);
                    h11.f79455l.f79423h = true;
                    h11.l();
                    h11.s(I.Data);
                    return;
                }
                if (m11 != 65535) {
                    h11.p(this);
                    h11.f79455l.f79423h = true;
                    h11.s(I.BogusDoctype);
                } else {
                    h11.n(this);
                    h11.f79455l.f79423h = true;
                    h11.l();
                    h11.s(I.Data);
                }
            }
        };
        AfterDoctypePublicKeyword = i72;
        I i73 = new I() { // from class: org.jsoup.parser.I.Z
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                char m11 = c8817f.m();
                if (m11 == '\t' || m11 == '\n' || m11 == '\f' || m11 == '\r' || m11 == ' ') {
                    return;
                }
                if (m11 == '\"') {
                    h11.s(I.DoctypePublicIdentifier_doubleQuoted);
                    return;
                }
                if (m11 == '\'') {
                    h11.s(I.DoctypePublicIdentifier_singleQuoted);
                    return;
                }
                if (m11 == '>') {
                    h11.p(this);
                    h11.f79455l.f79423h = true;
                    h11.l();
                    h11.s(I.Data);
                    return;
                }
                if (m11 != 65535) {
                    h11.p(this);
                    h11.f79455l.f79423h = true;
                    h11.s(I.BogusDoctype);
                } else {
                    h11.n(this);
                    h11.f79455l.f79423h = true;
                    h11.l();
                    h11.s(I.Data);
                }
            }
        };
        BeforeDoctypePublicIdentifier = i73;
        I i74 = new I() { // from class: org.jsoup.parser.I.a0
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                char m11 = c8817f.m();
                if (m11 == 0) {
                    h11.p(this);
                    h11.f79455l.f79421f.a(I.replacementChar);
                    return;
                }
                if (m11 == '\"') {
                    h11.s(I.AfterDoctypePublicIdentifier);
                    return;
                }
                if (m11 == '>') {
                    h11.p(this);
                    h11.f79455l.f79423h = true;
                    h11.l();
                    h11.s(I.Data);
                    return;
                }
                if (m11 != 65535) {
                    h11.f79455l.f79421f.a(m11);
                    return;
                }
                h11.n(this);
                h11.f79455l.f79423h = true;
                h11.l();
                h11.s(I.Data);
            }
        };
        DoctypePublicIdentifier_doubleQuoted = i74;
        I i75 = new I() { // from class: org.jsoup.parser.I.b0
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                char m11 = c8817f.m();
                if (m11 == 0) {
                    h11.p(this);
                    h11.f79455l.f79421f.a(I.replacementChar);
                    return;
                }
                if (m11 == '\'') {
                    h11.s(I.AfterDoctypePublicIdentifier);
                    return;
                }
                if (m11 == '>') {
                    h11.p(this);
                    h11.f79455l.f79423h = true;
                    h11.l();
                    h11.s(I.Data);
                    return;
                }
                if (m11 != 65535) {
                    h11.f79455l.f79421f.a(m11);
                    return;
                }
                h11.n(this);
                h11.f79455l.f79423h = true;
                h11.l();
                h11.s(I.Data);
            }
        };
        DoctypePublicIdentifier_singleQuoted = i75;
        I i76 = new I() { // from class: org.jsoup.parser.I.d0
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                char m11 = c8817f.m();
                if (m11 == '\t' || m11 == '\n' || m11 == '\f' || m11 == '\r' || m11 == ' ') {
                    h11.s(I.BetweenDoctypePublicAndSystemIdentifiers);
                    return;
                }
                if (m11 == '\"') {
                    h11.p(this);
                    h11.s(I.DoctypeSystemIdentifier_doubleQuoted);
                    return;
                }
                if (m11 == '\'') {
                    h11.p(this);
                    h11.s(I.DoctypeSystemIdentifier_singleQuoted);
                    return;
                }
                if (m11 == '>') {
                    h11.l();
                    h11.s(I.Data);
                } else if (m11 != 65535) {
                    h11.p(this);
                    h11.f79455l.f79423h = true;
                    h11.s(I.BogusDoctype);
                } else {
                    h11.n(this);
                    h11.f79455l.f79423h = true;
                    h11.l();
                    h11.s(I.Data);
                }
            }
        };
        AfterDoctypePublicIdentifier = i76;
        I i77 = new I() { // from class: org.jsoup.parser.I.e0
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                char m11 = c8817f.m();
                if (m11 == '\t' || m11 == '\n' || m11 == '\f' || m11 == '\r' || m11 == ' ') {
                    return;
                }
                if (m11 == '\"') {
                    h11.p(this);
                    h11.s(I.DoctypeSystemIdentifier_doubleQuoted);
                    return;
                }
                if (m11 == '\'') {
                    h11.p(this);
                    h11.s(I.DoctypeSystemIdentifier_singleQuoted);
                    return;
                }
                if (m11 == '>') {
                    h11.l();
                    h11.s(I.Data);
                } else if (m11 != 65535) {
                    h11.p(this);
                    h11.f79455l.f79423h = true;
                    h11.s(I.BogusDoctype);
                } else {
                    h11.n(this);
                    h11.f79455l.f79423h = true;
                    h11.l();
                    h11.s(I.Data);
                }
            }
        };
        BetweenDoctypePublicAndSystemIdentifiers = i77;
        I i78 = new I() { // from class: org.jsoup.parser.I.f0
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                char m11 = c8817f.m();
                if (m11 == '\t' || m11 == '\n' || m11 == '\f' || m11 == '\r' || m11 == ' ') {
                    h11.s(I.BeforeDoctypeSystemIdentifier);
                    return;
                }
                if (m11 == '\"') {
                    h11.p(this);
                    h11.s(I.DoctypeSystemIdentifier_doubleQuoted);
                    return;
                }
                if (m11 == '\'') {
                    h11.p(this);
                    h11.s(I.DoctypeSystemIdentifier_singleQuoted);
                    return;
                }
                if (m11 == '>') {
                    h11.p(this);
                    h11.f79455l.f79423h = true;
                    h11.l();
                    h11.s(I.Data);
                    return;
                }
                if (m11 != 65535) {
                    h11.p(this);
                    h11.f79455l.f79423h = true;
                    h11.l();
                } else {
                    h11.n(this);
                    h11.f79455l.f79423h = true;
                    h11.l();
                    h11.s(I.Data);
                }
            }
        };
        AfterDoctypeSystemKeyword = i78;
        I i79 = new I() { // from class: org.jsoup.parser.I.g0
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                char m11 = c8817f.m();
                if (m11 == '\t' || m11 == '\n' || m11 == '\f' || m11 == '\r' || m11 == ' ') {
                    return;
                }
                if (m11 == '\"') {
                    h11.s(I.DoctypeSystemIdentifier_doubleQuoted);
                    return;
                }
                if (m11 == '\'') {
                    h11.s(I.DoctypeSystemIdentifier_singleQuoted);
                    return;
                }
                if (m11 == '>') {
                    h11.p(this);
                    h11.f79455l.f79423h = true;
                    h11.l();
                    h11.s(I.Data);
                    return;
                }
                if (m11 != 65535) {
                    h11.p(this);
                    h11.f79455l.f79423h = true;
                    h11.s(I.BogusDoctype);
                } else {
                    h11.n(this);
                    h11.f79455l.f79423h = true;
                    h11.l();
                    h11.s(I.Data);
                }
            }
        };
        BeforeDoctypeSystemIdentifier = i79;
        I i81 = new I() { // from class: org.jsoup.parser.I.h0
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                char m11 = c8817f.m();
                if (m11 == 0) {
                    h11.p(this);
                    h11.f79455l.f79422g.a(I.replacementChar);
                    return;
                }
                if (m11 == '\"') {
                    h11.s(I.AfterDoctypeSystemIdentifier);
                    return;
                }
                if (m11 == '>') {
                    h11.p(this);
                    h11.f79455l.f79423h = true;
                    h11.l();
                    h11.s(I.Data);
                    return;
                }
                if (m11 != 65535) {
                    h11.f79455l.f79422g.a(m11);
                    return;
                }
                h11.n(this);
                h11.f79455l.f79423h = true;
                h11.l();
                h11.s(I.Data);
            }
        };
        DoctypeSystemIdentifier_doubleQuoted = i81;
        I i82 = new I() { // from class: org.jsoup.parser.I.i0
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                char m11 = c8817f.m();
                if (m11 == 0) {
                    h11.p(this);
                    h11.f79455l.f79422g.a(I.replacementChar);
                    return;
                }
                if (m11 == '\'') {
                    h11.s(I.AfterDoctypeSystemIdentifier);
                    return;
                }
                if (m11 == '>') {
                    h11.p(this);
                    h11.f79455l.f79423h = true;
                    h11.l();
                    h11.s(I.Data);
                    return;
                }
                if (m11 != 65535) {
                    h11.f79455l.f79422g.a(m11);
                    return;
                }
                h11.n(this);
                h11.f79455l.f79423h = true;
                h11.l();
                h11.s(I.Data);
            }
        };
        DoctypeSystemIdentifier_singleQuoted = i82;
        I i83 = new I() { // from class: org.jsoup.parser.I.j0
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                char m11 = c8817f.m();
                if (m11 == '\t' || m11 == '\n' || m11 == '\f' || m11 == '\r' || m11 == ' ') {
                    return;
                }
                if (m11 == '>') {
                    h11.l();
                    h11.s(I.Data);
                } else if (m11 != 65535) {
                    h11.p(this);
                    h11.s(I.BogusDoctype);
                } else {
                    h11.n(this);
                    h11.f79455l.f79423h = true;
                    h11.l();
                    h11.s(I.Data);
                }
            }
        };
        AfterDoctypeSystemIdentifier = i83;
        I i84 = new I() { // from class: org.jsoup.parser.I.k0
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                char m11 = c8817f.m();
                if (m11 == '>') {
                    h11.l();
                    h11.s(I.Data);
                } else {
                    if (m11 != 65535) {
                        return;
                    }
                    h11.l();
                    h11.s(I.Data);
                }
            }
        };
        BogusDoctype = i84;
        I i85 = new I() { // from class: org.jsoup.parser.I.l0
            @Override // org.jsoup.parser.I
            final void f(org.jsoup.parser.H h11, C8817f c8817f) {
                h11.f79449f.b(c8817f.w());
                if (c8817f.X("]]>") || c8817f.O()) {
                    String g10 = h11.f79449f.g();
                    C.a aVar = new C.a();
                    aVar.f79417d.f(g10);
                    h11.j(aVar);
                    h11.s(I.Data);
                }
            }
        };
        CdataSection = i85;
        $VALUES = new I[]{i11, i12, i13, i14, i15, i16, i17, i18, i19, i21, i22, i23, i24, i25, i26, i27, i28, i29, i31, i32, i33, i34, i35, i36, i37, i38, i39, i41, i42, i43, i44, i45, i46, i47, i48, i49, i51, i52, i53, i54, i55, i56, i57, i58, i59, i61, i62, i63, i64, i65, i66, i67, i68, i69, i71, i72, i73, i74, i75, i76, i77, i78, i79, i81, i82, i83, i84, i85};
        attributeNameCharsSorted = new char[]{'\t', '\n', '\f', '\r', ' ', '\"', '\'', '/', '<', '=', '>', '?'};
        attributeValueUnquoted = new char[]{nullChar, '\t', '\n', '\f', '\r', ' ', '\"', '&', '\'', '<', '=', '>', '`'};
        replacementStr = String.valueOf(replacementChar);
    }

    private I() {
        throw null;
    }

    static void a(org.jsoup.parser.H h11, C8817f c8817f, I i11, I i12) {
        char L11 = c8817f.L();
        if (L11 == 0) {
            h11.p(i11);
            c8817f.c();
            h11.h(replacementChar);
        } else if (L11 == '<') {
            h11.a(i12);
        } else if (L11 != 65535) {
            h11.i(c8817f.v());
        } else {
            h11.j(new C.e());
        }
    }

    static void d(org.jsoup.parser.H h11, C8817f c8817f, I i11) {
        if (c8817f.o0()) {
            String t2 = c8817f.t(new C8815d(), -1);
            h11.f79453j.l(t2);
            h11.f79449f.b(t2);
            return;
        }
        boolean q11 = h11.q();
        org.jsoup.parser.D d11 = h11.f79449f;
        if (q11 && !c8817f.O()) {
            char m11 = c8817f.m();
            if (m11 == '\t' || m11 == '\n' || m11 == '\f' || m11 == '\r' || m11 == ' ') {
                h11.s(BeforeAttributeName);
                return;
            }
            if (m11 == '/') {
                h11.s(SelfClosingStartTag);
                return;
            } else {
                if (m11 == '>') {
                    h11.m();
                    h11.s(Data);
                    return;
                }
                d11.a(m11);
            }
        }
        h11.i("</");
        h11.i(d11.g());
        h11.s(i11);
    }

    static void e(org.jsoup.parser.H h11, C8817f c8817f, I i11, I i12) {
        if (c8817f.o0()) {
            String r11 = c8817f.r();
            h11.f79449f.b(r11);
            h11.i(r11);
            return;
        }
        char m11 = c8817f.m();
        if (m11 != '\t' && m11 != '\n' && m11 != '\f' && m11 != '\r' && m11 != ' ' && m11 != '/' && m11 != '>') {
            c8817f.T0();
            h11.s(i12);
        } else {
            if (h11.f79449f.g().equals("script")) {
                h11.s(i11);
            } else {
                h11.s(i12);
            }
            h11.h(m11);
        }
    }

    public static I valueOf(String str) {
        return (I) Enum.valueOf(I.class, str);
    }

    public static I[] values() {
        return (I[]) $VALUES.clone();
    }

    abstract void f(org.jsoup.parser.H h11, C8817f c8817f);
}
