package xZ;

import androidx.fragment.app.G;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: xZ.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C10685d extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C10683b f105195b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f105196c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f105197d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10685d(String str, C10683b c10683b, boolean z11) {
        super(0);
        this.f105195b = c10683b;
        this.f105196c = str;
        this.f105197d = z11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C10683b c10683b = this.f105195b;
        String str = (String) C7714v.Y(c10683b.c());
        String hostName$compass_release = c10683b.getHostName$compass_release();
        String str2 = this.f105196c;
        if (str2.equals(hostName$compass_release)) {
            c10683b.c().addFirst(c10683b.getHostName$compass_release());
        } else if (this.f105197d) {
            G fragmentManager = c10683b.getFragmentManager();
            if (!str2.equals(c10683b.getHostName$compass_release())) {
                c10683b.d().add(str2);
                fragmentManager.h1(str2);
            }
        } else {
            c10683b.getFragmentManager().Q0(str2);
        }
        if (str != null) {
            c10683b.getFragmentManager().d1(str);
        }
        c10683b.getFragmentManager().c0();
        return Unit.f71690a;
    }
}
