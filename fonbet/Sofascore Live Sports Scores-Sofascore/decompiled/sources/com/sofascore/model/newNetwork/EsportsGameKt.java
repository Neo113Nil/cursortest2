package com.sofascore.model.newNetwork;

import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"reverseESportsSide", "", "reverseTeams", "", "model_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EsportsGameKt {
    public static final int reverseESportsSide(int i, boolean z) {
        Integer num;
        if (i == 0) {
            num = z ? null : 0;
            if (num != null) {
                return num.intValue();
            }
            return 1;
        }
        if (i == 1) {
            num = z ? null : 1;
            if (num != null) {
                return num.intValue();
            }
            return 0;
        }
        if (i == 2) {
            num = z ? null : 2;
            if (num != null) {
                return num.intValue();
            }
            return 3;
        }
        if (i == 3) {
            num = z ? null : 3;
            if (num != null) {
                return num.intValue();
            }
            return 2;
        }
        if (i == 4) {
            num = z ? null : 4;
            if (num != null) {
                return num.intValue();
            }
            return 5;
        }
        if (i != 5) {
            return i;
        }
        num = z ? null : 5;
        if (num != null) {
            return num.intValue();
        }
        return 4;
    }
}
