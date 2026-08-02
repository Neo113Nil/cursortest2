package com.applovin.impl;

import android.view.View;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;

/* loaded from: classes2.dex */
public class j4 {
    private final View a;
    private final FriendlyObstructionPurpose b;
    private final String c;

    public j4(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.a = view;
        this.b = friendlyObstructionPurpose;
        this.c = str;
    }

    public String a() {
        return this.c;
    }

    public FriendlyObstructionPurpose b() {
        return this.b;
    }

    public View c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            j4 j4Var = (j4) obj;
            View view = this.a;
            if (view == null ? j4Var.a != null : !view.equals(j4Var.a)) {
                return false;
            }
            if (this.b != j4Var.b) {
                return false;
            }
            String str = this.c;
            String str2 = j4Var.c;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        View view = this.a;
        int hashCode = (view != null ? view.hashCode() : 0) * 31;
        FriendlyObstructionPurpose friendlyObstructionPurpose = this.b;
        int hashCode2 = (hashCode + (friendlyObstructionPurpose != null ? friendlyObstructionPurpose.hashCode() : 0)) * 31;
        String str = this.c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }
}
