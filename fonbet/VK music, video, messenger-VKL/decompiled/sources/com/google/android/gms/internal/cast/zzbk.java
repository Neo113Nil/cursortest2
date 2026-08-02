package com.google.android.gms.internal.cast;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.google.android.gms.cast.framework.internal.featurehighlight.HelpTextView;
import com.google.android.gms.cast.framework.internal.featurehighlight.b;
import com.google.android.gms.cast.framework.internal.featurehighlight.c;
import com.vk.core.preference.Preference;
import com.vkontakte.android.R;
import xsna.fot;
import xsna.g201;
import xsna.gpx;
import xsna.hpx;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzbk extends RelativeLayout {
    private final boolean zza;

    @Nullable
    private Activity zzb;

    @Nullable
    private hpx zzc;

    @Nullable
    private View zzd;

    @Nullable
    private String zze;
    private boolean zzf;
    private int zzg;

    public zzbk(gpx gpxVar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final void zza() {
        removeAllViews();
        this.zzb = null;
        this.zzd = null;
        this.zze = null;
        this.zzg = 0;
        this.zzf = false;
    }

    public final void remove() {
        Activity activity;
        if (!this.zzf || (activity = this.zzb) == null) {
            return;
        }
        ((ViewGroup) activity.getWindow().getDecorView()).removeView(this);
        zza();
    }

    public final void show() {
        View view;
        Activity activity = this.zzb;
        if (activity == null || (view = this.zzd) == null || this.zzf) {
            return;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) activity.getSystemService("accessibility");
        if (accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        if (this.zza && Preference.g(activity).getBoolean("googlecast-introOverlayShown", false)) {
            zza();
            return;
        }
        c cVar = new c(activity);
        int i = this.zzg;
        if (i != 0) {
            cVar.c(i);
        }
        addView(cVar);
        HelpTextView helpTextView = (HelpTextView) activity.getLayoutInflater().inflate(R.layout.cast_help_text, (ViewGroup) cVar, false);
        helpTextView.setText(this.zze, null);
        cVar.n = helpTextView;
        cVar.addView(helpTextView.asView(), 0);
        zzbj zzbjVar = new zzbj(this, activity, cVar);
        cVar.g = view;
        cVar.l = zzbjVar;
        fot fotVar = new fot(cVar.getContext(), new g201(cVar, view, zzbjVar), null);
        cVar.k = fotVar;
        fotVar.a.setIsLongpressEnabled(false);
        cVar.setVisibility(4);
        this.zzf = true;
        ((ViewGroup) activity.getWindow().getDecorView()).addView(this);
        cVar.addOnLayoutChangeListener(new b(cVar));
    }

    public final /* synthetic */ hpx zzb() {
        return null;
    }

    public final /* synthetic */ boolean zzc() {
        return this.zzf;
    }
}
