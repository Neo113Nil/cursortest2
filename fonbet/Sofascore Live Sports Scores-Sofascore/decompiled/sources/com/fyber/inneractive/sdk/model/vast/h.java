package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class h {
    public Integer a;
    public Integer b;
    public String c;
    public l d;
    public String e;
    public String f;
    public String g;
    public com.fyber.inneractive.sdk.flow.vast.b i;
    public final ArrayList h = new ArrayList();
    public final ArrayList j = new ArrayList();

    public final boolean a() {
        return (TextUtils.isEmpty(this.f) && TextUtils.isEmpty(this.e) && this.d == null) ? false : true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Companion:  w:");
        sb.append(this.a);
        sb.append(" h:");
        sb.append(this.b);
        sb.append(" ctr:");
        sb.append(this.g);
        sb.append(" clt:");
        sb.append(this.h);
        if (!TextUtils.isEmpty(this.f)) {
            sb.append(" html:");
            sb.append(this.f);
        }
        if (this.d != null) {
            sb.append(" static:");
            sb.append(this.d.b);
            sb.append("creative:");
            sb.append(this.d.a);
        }
        if (!TextUtils.isEmpty(this.e)) {
            sb.append(" iframe:");
            sb.append(this.e);
        }
        sb.append(" events:");
        sb.append(this.j);
        if (this.i != null) {
            sb.append(" reason:");
            sb.append(this.i.a);
            sb.append(" exception:");
            sb.append(this.i.getMessage());
        }
        return sb.toString();
    }
}
