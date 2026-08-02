package com.zoho.livechat.android.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.zoho.livechat.android.utils.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3941j {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f44550c = Pattern.compile("number\\(([0-9\\-]+)\\)");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f44551d = Pattern.compile("string\\(([0-9\\-]+)\\)");

    /* renamed from: a, reason: collision with root package name */
    public Pattern f44552a;

    /* renamed from: b, reason: collision with root package name */
    public Matcher f44553b;

    public C3941j(Pattern pattern) {
        this.f44552a = pattern;
    }

    public String a(int i10) {
        return this.f44553b.group(i10);
    }

    public boolean b(String str) {
        Matcher matcher = this.f44552a.matcher(str);
        this.f44553b = matcher;
        return matcher.matches();
    }
}
