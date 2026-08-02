package com.vk.superapp.animation;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.vk.superapp.animation.SuperAppAnimation;
import io.reactivex.rxjava3.disposables.c;
import xsna.obs;

/* compiled from: SuperAppAnimation.kt */
/* loaded from: classes6.dex */
public final class a implements obs {
    public final /* synthetic */ SuperAppAnimation b;

    public a(SuperAppAnimation superAppAnimation) {
        this.b = superAppAnimation;
    }

    @Override // xsna.obs
    public final void onDestroyView() {
        SuperAppAnimation superAppAnimation = this.b;
        c cVar = superAppAnimation.g;
        if (cVar != null) {
            cVar.dispose();
        }
        superAppAnimation.g = null;
        superAppAnimation.e();
    }

    @Override // xsna.obs
    public final void onPause() {
        SuperAppAnimation superAppAnimation = this.b;
        c cVar = superAppAnimation.g;
        if (cVar != null) {
            cVar.dispose();
        }
        superAppAnimation.g = null;
    }

    @Override // xsna.obs
    public final void onResume() {
        SuperAppAnimation superAppAnimation = this.b;
        SuperAppAnimation.Type type = superAppAnimation.c.d;
        if (type == SuperAppAnimation.Type.SHAKE || type == SuperAppAnimation.Type.ALL) {
            superAppAnimation.f();
        }
    }

    @Override // xsna.obs
    public final void onStop() {
        this.b.e();
    }

    @Override // xsna.obs
    public final void b() {
    }

    @Override // xsna.obs
    public final void c() {
    }

    @Override // xsna.obs
    public final void onDestroy() {
    }

    @Override // xsna.obs
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // xsna.obs
    public final void onCreate(Bundle bundle) {
    }

    @Override // xsna.obs
    public final void onActivityResult(int i, int i2, Intent intent) {
    }
}
