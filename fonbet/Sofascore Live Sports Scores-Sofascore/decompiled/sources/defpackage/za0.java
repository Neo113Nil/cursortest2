package defpackage;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Arrays;
import java.util.LinkedHashSet;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class za0 implements mqg {
    public final /* synthetic */ int a;
    public final Object b;

    public za0(nqg nqgVar) {
        this.a = 1;
        this.b = new LinkedHashSet();
        nqgVar.c("androidx.savedstate.Restarter", this);
    }

    @Override // defpackage.mqg
    public final Bundle a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                ((AppCompatActivity) obj).m();
                return bundle;
            default:
                lm5.a.getClass();
                Bundle E = hz8.E((Pair[]) Arrays.copyOf(new Pair[0], 0));
                r4a.I(E, "classes_to_restore", CollectionsKt.S0((LinkedHashSet) obj));
                return E;
        }
    }

    public za0(AppCompatActivity appCompatActivity) {
        this.a = 0;
        this.b = appCompatActivity;
    }
}
