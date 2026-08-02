package defpackage;

import android.content.Context;
import com.sofascore.model.Sports;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class hp extends es1 {
    public final int q;
    public final String r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hp(Context context) {
        super(context);
        context.getClass();
        this.q = 10;
        this.r = Sports.AMERICAN_FOOTBALL;
    }

    @Override // defpackage.es1, defpackage.q7
    public int getDefaultDiffValue() {
        return this.q;
    }

    @Override // defpackage.es1, defpackage.q7
    @NotNull
    public String getSport() {
        return this.r;
    }
}
