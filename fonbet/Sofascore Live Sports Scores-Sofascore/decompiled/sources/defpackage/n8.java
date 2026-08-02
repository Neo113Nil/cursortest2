package defpackage;

import android.content.Context;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class n8 extends o8 {
    public final String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n8(String str, Context context) {
        super(context, null, 0);
        context.getClass();
        this.d = str;
    }

    @NotNull
    public final String getText() {
        return this.d;
    }
}
