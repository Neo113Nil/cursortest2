package com.facebook.ads.redexgen.core;

import android.graphics.drawable.ColorDrawable;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.cy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2422cy {
    public static AnonymousClass67 A00(final C2369c7 c2369c7, int i, final String str, final C1728Fy c1728Fy) {
        if (i == 1) {
            return new AnonymousClass67(c2369c7, str, c1728Fy) { // from class: com.facebook.ads.redexgen.X.1G
                public static final int A00 = (int) (XX.A02 * 20.0f);
                public static final int A01 = (int) (XX.A02 * 16.0f);

                @Override // com.facebook.ads.redexgen.core.AbstractC2365c3
                public final boolean A03() {
                    return false;
                }

                @Override // com.facebook.ads.redexgen.core.AnonymousClass67
                public final void A1X(C2652gi c2652gi) {
                    C2352bq titleDescContainer = getTitleDescContainer();
                    titleDescContainer.setAlignment(3);
                    titleDescContainer.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
                    titleDescContainer.setPadding(0, 0, 0, A00);
                    getCtaButton().setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
                    LinearLayout linearLayout = new LinearLayout(c2652gi);
                    YB.A0V(linearLayout, new ColorDrawable(-1));
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams.addRule(3, getMediaContainer().getId());
                    linearLayout.setLayoutParams(layoutParams);
                    linearLayout.setOrientation(1);
                    linearLayout.setPadding(A01, A01, A01, A01);
                    linearLayout.addView(titleDescContainer);
                    linearLayout.addView(getCtaButton());
                    addView(getMediaContainer());
                    addView(linearLayout);
                }
            };
        }
        return new AnonymousClass67(c2369c7, str, c1728Fy) { // from class: com.facebook.ads.redexgen.X.1H
            public static final int A00 = (int) (XX.A02 * 12.0f);

            @Override // com.facebook.ads.redexgen.core.AbstractC2365c3
            public final boolean A02() {
                return false;
            }

            @Override // com.facebook.ads.redexgen.core.AnonymousClass67, com.facebook.ads.redexgen.core.AbstractC2365c3
            public final boolean A0A() {
                return false;
            }

            @Override // com.facebook.ads.redexgen.core.AnonymousClass67
            public final void A1X(C2652gi c2652gi) {
                C2352bq titleDescContainer = getTitleDescContainer();
                titleDescContainer.setAlignment(3);
                RelativeLayout.LayoutParams adTitleAndDescriptionLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
                adTitleAndDescriptionLayoutParams.addRule(8, getMediaContainer().getId());
                titleDescContainer.setLayoutParams(adTitleAndDescriptionLayoutParams);
                titleDescContainer.setPadding(A00, A00, A00, A00);
                YB.A0U(titleDescContainer, getAdContextWrapper());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams.addRule(3, getMediaContainer().getId());
                getCtaButton().setLayoutParams(layoutParams);
                addView(getMediaContainer());
                addView(titleDescContainer);
                addView(getCtaButton());
            }
        };
    }
}
