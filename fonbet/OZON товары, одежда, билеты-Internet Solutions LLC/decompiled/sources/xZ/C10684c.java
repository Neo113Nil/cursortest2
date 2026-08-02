package xZ;

import androidx.fragment.app.G;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: xZ.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C10684c extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C10683b f105192b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f105193c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f105194d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10684c(String str, C10683b c10683b, boolean z11) {
        super(0);
        this.f105192b = c10683b;
        this.f105193c = z11;
        this.f105194d = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C10683b c10683b = this.f105192b;
        c10683b.c().clear();
        c10683b.c().addLast(c10683b.getHostName$compass_release());
        if (this.f105193c) {
            G fragmentManager = c10683b.getFragmentManager();
            String hostName$compass_release = c10683b.getHostName$compass_release();
            String str = this.f105194d;
            if (!str.equals(hostName$compass_release)) {
                c10683b.d().add(str);
                fragmentManager.h1(str);
            }
            c10683b.getFragmentManager().c0();
        } else {
            c10683b.getFragmentManager().U0(0, c10683b.getHostName$compass_release());
        }
        return Unit.f71690a;
    }
}
