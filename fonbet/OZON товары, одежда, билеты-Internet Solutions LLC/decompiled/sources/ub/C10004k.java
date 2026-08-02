package ub;

import android.os.IInterface;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: ub.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C10004k extends AbstractC7737t implements Function0<Za.d> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Za.d f100472b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC9996c<IInterface> f100473c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10004k(Za.d dVar, AbstractC9996c<IInterface> abstractC9996c) {
        super(0);
        this.f100472b = dVar;
        this.f100473c = abstractC9996c;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Za.d invoke() {
        return this.f100472b.c(this.f100473c.r());
    }
}
