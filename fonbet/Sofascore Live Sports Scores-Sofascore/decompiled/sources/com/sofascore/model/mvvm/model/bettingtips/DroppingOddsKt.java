package com.sofascore.model.mvvm.model.bettingtips;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0001¨\u0006\u0002"}, d2 = {"reverseName", "", "model_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DroppingOddsKt {
    @Nullable
    public static final String reverseName(@Nullable String str) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 49) {
                if (hashCode != 50) {
                    if (hashCode != 1607) {
                        if (hashCode == 2778 && str.equals("X2")) {
                            return "1X";
                        }
                    } else if (str.equals("1X")) {
                        return "X2";
                    }
                } else if (str.equals("2")) {
                    return "1";
                }
            } else if (str.equals("1")) {
                return "2";
            }
        }
        return str;
    }
}
