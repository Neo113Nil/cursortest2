package com.google.ads.interactivemedia.v3.impl.data;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.ads.interactivemedia.v3.impl.data.AutoValue_ObstructionListData;
import com.google.ads.interactivemedia.v3.impl.data.AutoValue_ObstructionListData_ObstructionData;
import defpackage.as8;
import defpackage.bs8;
import defpackage.q1p;
import defpackage.q3p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@q1p(zza = AutoValue_ObstructionListData.class)
/* loaded from: classes2.dex */
public abstract class ObstructionListData {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static abstract class Builder {
        @NonNull
        public abstract ObstructionListData build();

        @NonNull
        public Builder friendlyObstructions(@NonNull Collection<as8> collection) {
            ArrayList arrayList = new ArrayList();
            for (as8 as8Var : collection) {
                arrayList.add(ObstructionData.builder().view(as8Var.getView()).purpose(as8Var.getPurpose()).detailedReason(as8Var.getDetailedReason()).build());
            }
            return obstructions(arrayList);
        }

        @NonNull
        public abstract Builder obstructions(@NonNull List<ObstructionData> list);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @q1p(zza = AutoValue_ObstructionListData_ObstructionData.class)
    public static abstract class ObstructionData {

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static abstract class Builder {
            @NonNull
            public abstract Builder attached(boolean z);

            @NonNull
            public abstract Builder bounds(@NonNull BoundingRectData boundingRectData);

            @NonNull
            public abstract ObstructionData build();

            @NonNull
            public abstract Builder detailedReason(@Nullable String str);

            @NonNull
            public abstract Builder hidden(boolean z);

            @NonNull
            public abstract Builder purpose(@NonNull bs8 bs8Var);

            @NonNull
            public abstract Builder type(@NonNull String str);

            public Builder view(View view) {
                return attached(view.isAttachedToWindow()).bounds(BoundingRectData.builder().locationOnScreenOfView(view).build()).hidden(!view.isShown()).type(view.getClass().getCanonicalName());
            }
        }

        @NonNull
        public static Builder builder() {
            return new AutoValue_ObstructionListData_ObstructionData.Builder();
        }

        public abstract boolean attached();

        public abstract BoundingRectData bounds();

        @Nullable
        public abstract String detailedReason();

        public abstract boolean hidden();

        public abstract bs8 purpose();

        public abstract String type();
    }

    @NonNull
    public static Builder builder() {
        return new AutoValue_ObstructionListData.Builder();
    }

    public abstract q3p obstructions();
}
