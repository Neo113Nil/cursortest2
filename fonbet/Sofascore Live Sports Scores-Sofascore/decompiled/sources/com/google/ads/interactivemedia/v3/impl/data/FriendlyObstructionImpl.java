package com.google.ads.interactivemedia.v3.impl.data;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.ads.interactivemedia.v3.impl.data.AutoValue_FriendlyObstructionImpl;
import defpackage.as8;
import defpackage.bs8;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class FriendlyObstructionImpl implements as8 {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* loaded from: classes.dex */
    public interface Builder {
        @NonNull
        FriendlyObstructionImpl build();

        @NonNull
        Builder detailedReason(@Nullable String str);

        @NonNull
        Builder purpose(@NonNull bs8 bs8Var);

        @NonNull
        Builder view(@NonNull View view);
    }

    @NonNull
    public static Builder builder() {
        return new AutoValue_FriendlyObstructionImpl.Builder();
    }

    @Nullable
    public abstract String detailedReason();

    @Override // defpackage.as8
    @Nullable
    public String getDetailedReason() {
        return detailedReason();
    }

    @Override // defpackage.as8
    @NonNull
    public bs8 getPurpose() {
        return purpose();
    }

    @Override // defpackage.as8
    @NonNull
    public View getView() {
        return view();
    }

    @NonNull
    public abstract bs8 purpose();

    @NonNull
    public abstract View view();
}
