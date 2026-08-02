package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.widget.RelativeLayout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class deg extends RelativeLayout implements feg {
    public final View a;
    public final boolean b;
    public final deg c;
    public eeg d;
    public boolean e;
    public boolean f;
    public xag g;

    public deg(Context context, View view, boolean z) {
        super(context, null);
        this.a = view;
        this.b = z;
        this.c = this;
        hs4 hs4Var = z45.a;
        xw3.L(s9a.c(rob.a), null, null, new ceg(this, null, 0), 3);
    }

    public boolean getAdWasClicked() {
        return this.e;
    }

    @NotNull
    public View getInterstitialView() {
        return this.c;
    }

    @Nullable
    public eeg getInterstitialViewHolderListener() {
        return this.d;
    }

    public boolean getShouldCloseOnClick() {
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f) {
            this.f = true;
            xag xagVar = this.g;
            if (xagVar != null) {
                ((zag) xagVar).k(this);
            }
        }
        xag xagVar2 = this.g;
        if (xagVar2 != null) {
            ((zag) xagVar2).l();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        xag xagVar = this.g;
        if (xagVar != null) {
            ((zag) xagVar).f(configuration != null ? configuration.orientation : getContext().getResources().getConfiguration().orientation);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        xag xagVar = this.g;
        if (xagVar != null) {
            ((zag) xagVar).m(true);
        }
    }

    public void setAdWasClicked(boolean z) {
        this.e = z;
    }

    public void setInterstitialViewHolderListener(@Nullable eeg eegVar) {
        this.d = eegVar;
    }
}
