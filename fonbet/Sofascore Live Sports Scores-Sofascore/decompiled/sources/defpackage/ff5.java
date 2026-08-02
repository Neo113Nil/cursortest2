package defpackage;

import androidx.compose.runtime.d;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ff5 extends d {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ff5(int i, Function0 function0) {
        super(function0);
        this.b = i;
    }

    @Override // androidx.compose.runtime.d
    public final gb0 a(Object obj) {
        switch (this.b) {
            case 0:
                return new gb0(this, obj, obj == null, wib.i, true);
            default:
                return new gb0(this, obj, obj == null, null, false);
        }
    }
}
