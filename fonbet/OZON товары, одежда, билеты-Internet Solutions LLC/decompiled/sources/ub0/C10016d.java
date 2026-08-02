package ub0;

import Sc.InterfaceC4008j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ob0.B;
import ob0.s;
import ub0.C10014b;

/* renamed from: ub0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C10016d extends AbstractC7737t implements Function0<String> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C10014b f100532b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C10014b.a f100533c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ s.e f100534d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10016d(C10014b c10014b, C10014b.a aVar, s.e eVar) {
        super(0);
        this.f100532b = c10014b;
        this.f100533c = aVar;
        this.f100534d = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        InterfaceC4008j interfaceC4008j;
        interfaceC4008j = this.f100532b.f100514c;
        return ((B) interfaceC4008j.getValue()).p(this.f100533c, this.f100534d);
    }
}
