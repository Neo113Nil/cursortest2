package Bh;

import rh.InterfaceC6300r;
import rh.InterfaceC6301s;
import zh.C7004l;

/* loaded from: classes3.dex */
public class q implements InterfaceC6301s {

    /* renamed from: a, reason: collision with root package name */
    public final C7004l f985a;

    /* renamed from: b, reason: collision with root package name */
    public final String f986b;

    /* renamed from: c, reason: collision with root package name */
    public String f987c;

    /* renamed from: d, reason: collision with root package name */
    public String f988d;

    public q(C7004l c7004l, String str) {
        this.f985a = c7004l;
        this.f986b = str;
    }

    @Override // rh.InterfaceC6301s
    public InterfaceC6300r build() {
        return (InterfaceC6300r) this.f985a.j(this.f986b, this.f987c, this.f988d, oh.g.empty());
    }
}
