package defpackage;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.blaze.blazesdk.style.players.BlazePlayerButtonCustomImageStates;
import com.blaze.blazesdk.style.players.IPlayerItemButtonStyle;
import defpackage.gim;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class ctl {
    public static final void a(View view, boolean z, boolean z2, boolean z3, boolean z4, mol molVar) {
        view.getClass();
        molVar.getClass();
        boolean z5 = false;
        boolean z6 = !z3 || z2;
        if (z && z4 && z6) {
            z5 = true;
        }
        int ordinal = molVar.ordinal();
        if (ordinal == 0) {
            view.getClass();
            if (z5) {
                evl.u(view);
                return;
            } else {
                evl.s(view);
                return;
            }
        }
        if (ordinal != 1) {
            zzl.b();
            return;
        }
        view.getClass();
        if (z5) {
            evl.u(view);
        } else {
            evl.q(view);
        }
    }

    public static final void b(ImageView imageView, BlazePlayerButtonCustomImageStates blazePlayerButtonCustomImageStates) {
        Drawable drawable;
        imageView.getClass();
        if (blazePlayerButtonCustomImageStates != null) {
            Drawable drawable2 = imageView.getContext().getDrawable(blazePlayerButtonCustomImageStates.getImageUnselectedPathResId());
            Integer imageSelectedPathResId = blazePlayerButtonCustomImageStates.getImageSelectedPathResId();
            if (imageSelectedPathResId != null) {
                drawable = imageView.getContext().getDrawable(imageSelectedPathResId.intValue());
            } else {
                drawable = null;
            }
            if (drawable2 == null) {
                return;
            }
            if (imageView.isSelected()) {
                drawable2 = drawable;
            }
            imageView.setImageDrawable(drawable2);
        }
    }

    public static final void c(ImageView imageView, IPlayerItemButtonStyle iPlayerItemButtonStyle, boolean z, gim gimVar, mol molVar) {
        imageView.getClass();
        gimVar.getClass();
        molVar.getClass();
        if (iPlayerItemButtonStyle == null) {
            return;
        }
        imageView.setScaleType(iPlayerItemButtonStyle.getScaleType());
        b(imageView, iPlayerItemButtonStyle.getCustomImage());
        imageView.setColorFilter(iPlayerItemButtonStyle.getColor(), PorterDuff.Mode.MULTIPLY);
        imageView.getLayoutParams().width = iPlayerItemButtonStyle.getWidth().getToPx$blazesdk_release();
        imageView.getLayoutParams().height = iPlayerItemButtonStyle.getHeight().getToPx$blazesdk_release();
        a(imageView, iPlayerItemButtonStyle.isVisible(), iPlayerItemButtonStyle.isVisibleForAds(), gimVar instanceof gim.a, z, molVar);
    }

    public static /* synthetic */ void setPlayableItemViewVisibility$default(View view, boolean z, boolean z2, boolean z3, boolean z4, mol molVar, int i, Object obj) {
        if ((i & 8) != 0) {
            z4 = true;
        }
        boolean z5 = z4;
        if ((i & 16) != 0) {
            molVar = mol.GONE;
        }
        a(view, z, z2, z3, z5, molVar);
    }

    public static /* synthetic */ void setPlayerButtonUi$default(ImageView imageView, IPlayerItemButtonStyle iPlayerItemButtonStyle, boolean z, gim gimVar, mol molVar, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            molVar = mol.GONE;
        }
        c(imageView, iPlayerItemButtonStyle, z, gimVar, molVar);
    }
}
