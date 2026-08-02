package com.henninghall.date_picker;

/* loaded from: classes3.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final n f38487a;

    public g(n nVar) {
        this.f38487a = nVar;
    }

    public final String a(String str) {
        return " " + str + " ";
    }

    public String b(String str) {
        return !c(str) ? str : a(str);
    }

    public final boolean c(String str) {
        return str.length() == 1;
    }
}
