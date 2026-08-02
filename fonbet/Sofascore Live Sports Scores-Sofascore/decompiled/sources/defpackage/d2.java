package defpackage;

import android.view.View;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.sofascore.model.chat.Message;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class d2 extends p8 {
    public final View c;
    public Message d;
    public boolean e;
    public zsk f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(View view) {
        super(view);
        view.getClass();
        this.c = view;
        this.e = true;
    }

    public final Message d() {
        Message message = this.d;
        if (message != null) {
            return message;
        }
        Intrinsics.i(PglCryptUtils.KEY_MESSAGE);
        throw null;
    }
}
