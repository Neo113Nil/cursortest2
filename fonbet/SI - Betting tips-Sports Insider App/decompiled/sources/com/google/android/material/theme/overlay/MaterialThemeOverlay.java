package com.google.android.material.theme.overlay;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import n.d;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class MaterialThemeOverlay {
    private static final int[] ANDROID_THEME_OVERLAY_ATTRS = {R.attr.theme, com.sports.insider.R.attr.theme};
    private static final int[] MATERIAL_THEME_OVERLAY_ATTR = {com.google.android.material.R.attr.materialThemeOverlay};

    private MaterialThemeOverlay() {
    }

    private static int obtainAndroidThemeOverlayId(@NonNull Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ANDROID_THEME_OVERLAY_ATTRS);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    @NonNull
    private static int[] obtainMaterialOverlayIds(@NonNull Context context, AttributeSet attributeSet, @NonNull int[] iArr, int i5, int i10) {
        int[] iArr2 = new int[iArr.length];
        if (iArr.length > 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i5, i10);
            for (int i11 = 0; i11 < iArr.length; i11++) {
                iArr2[i11] = obtainStyledAttributes.getResourceId(i11, 0);
            }
            obtainStyledAttributes.recycle();
        }
        return iArr2;
    }

    private static int obtainMaterialThemeOverlayId(@NonNull Context context, AttributeSet attributeSet, int i5, int i10) {
        return obtainMaterialOverlayIds(context, attributeSet, MATERIAL_THEME_OVERLAY_ATTR, i5, i10)[0];
    }

    @NonNull
    public static Context wrap(@NonNull Context context, AttributeSet attributeSet, int i5, int i10) {
        return wrap(context, attributeSet, i5, i10, new int[0]);
    }

    @NonNull
    public static Context wrap(@NonNull Context context, AttributeSet attributeSet, int i5, int i10, @NonNull int[] iArr) {
        int obtainMaterialThemeOverlayId = obtainMaterialThemeOverlayId(context, attributeSet, i5, i10);
        boolean z5 = (context instanceof d) && ((d) context).f20762a == obtainMaterialThemeOverlayId;
        if (obtainMaterialThemeOverlayId == 0 || z5) {
            return context;
        }
        d dVar = new d(context, obtainMaterialThemeOverlayId);
        for (int i11 : obtainMaterialOverlayIds(context, attributeSet, iArr, i5, i10)) {
            if (i11 != 0) {
                dVar.getTheme().applyStyle(i11, true);
            }
        }
        int obtainAndroidThemeOverlayId = obtainAndroidThemeOverlayId(context, attributeSet);
        if (obtainAndroidThemeOverlayId != 0) {
            dVar.getTheme().applyStyle(obtainAndroidThemeOverlayId, true);
        }
        return dVar;
    }
}
