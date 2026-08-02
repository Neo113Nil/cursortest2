package defpackage;

import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class sq8 implements krk {
    public final FrameLayout a;
    public final ViewStub b;
    public final RecyclerView c;

    public sq8(FrameLayout frameLayout, ViewStub viewStub, RecyclerView recyclerView) {
        this.a = frameLayout;
        this.b = viewStub;
        this.c = recyclerView;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
