package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@KeepForSdk
/* loaded from: classes3.dex */
public class StringResourceValueReader {
    public final Resources a;
    public final String b;

    public StringResourceValueReader(Context context) {
        Preconditions.i(context);
        Resources resources = context.getResources();
        this.a = resources;
        this.b = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    public final String a(String str) {
        Resources resources = this.a;
        int identifier = resources.getIdentifier(str, "string", this.b);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }
}
